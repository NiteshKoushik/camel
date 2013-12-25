/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dataformat.csv;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;


import org.apache.camel.Exchange;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.util.ExchangeHelper;
import org.apache.camel.util.IOHelper;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVStrategy;
import org.apache.commons.csv.writer.CSVConfig;
import org.apache.commons.csv.writer.CSVField;
import org.apache.commons.csv.writer.CSVWriter;

/**
 * CSV Data format.
 * <p/>
 * By default, columns are autogenerated in the resulting CSV. Subsequent
 * messages use the previously created columns with new fields being added at
 * the end of the line. Thus, field order is the same from message to message.
 * Autogeneration can be disabled. In this case, only the fields defined in
 * csvConfig are written on the output.
 *
 * @version 
 */
public class CsvDataFormat implements DataFormat {
    private CSVStrategy strategy = CSVStrategy.DEFAULT_STRATEGY;
    private CSVConfig config = new CSVConfig();
    private boolean autogenColumns = true;
    private String delimiter;
    private boolean skipFirstLine;
    /**
     * Lazy row loading with iterator for big files.
     */
    private boolean lazyLoad;

    public void marshal(Exchange exchange, Object object, OutputStream outputStream) throws Exception {
        if (delimiter != null) {
            config.setDelimiter(delimiter.charAt(0));
        }

        OutputStreamWriter out = new OutputStreamWriter(outputStream, IOHelper.getCharsetName(exchange));
        CSVWriter csv = new CSVWriter(config);
        csv.setWriter(out);

        try {
            List<?> list = ExchangeHelper.convertToType(exchange, List.class, object);
            if (list != null) {
                for (Object child : list) {
                    Map<?, ?> row = ExchangeHelper.convertToMandatoryType(exchange, Map.class, child);
                    doMarshalRecord(exchange, row, out, csv);
                }
            } else {
                Map<?, ?> row = ExchangeHelper.convertToMandatoryType(exchange, Map.class, object);
                doMarshalRecord(exchange, row, out, csv);
            }
        } finally {
            IOHelper.close(out);
        }
    }

    private void doMarshalRecord(Exchange exchange, Map<?, ?> row, Writer out, CSVWriter csv) throws Exception {
        if (autogenColumns) {
            // no specific config has been set so lets add fields
            Set<?> set = row.keySet();
            updateFieldsInConfig(set, exchange);
        }
        csv.writeRecord(row);
    }

    public Object unmarshal(Exchange exchange, InputStream inputStream) throws Exception {
        if (delimiter != null) {
            config.setDelimiter(delimiter.charAt(0));
        }
        strategy.setDelimiter(config.getDelimiter());

        InputStreamReader in = new InputStreamReader(inputStream, IOHelper.getCharsetName(exchange));
        CsvIterator csvIterator;
        try {
            CSVParser parser = createParser(in);
            if (parser == null) {
                IOHelper.close(in);
                return emptyIterator();
            }
            csvIterator = new CsvIterator(parser, in);
        } catch (IOException e) {
            IOHelper.close(in);
            throw e;
        }
        if (lazyLoad) {
            return csvIterator;
        }
        return loadAllAsList(csvIterator);
    }

    private CSVParser createParser(InputStreamReader in) throws IOException {
        CSVParser parser = new CSVParser(in, strategy);
        if (skipFirstLine) {
            if (null == parser.getLine()) {
                return null;
            }
        }
        return parser;
    }

    private List<List<String>> loadAllAsList(CsvIterator iter) throws IOException {
        List<List<String>> list = new ArrayList<List<String>>();
        while (iter.hasNext()) {
            list.add(iter.next());
        }
        return list;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        if (delimiter != null && delimiter.length() > 1) {
            throw new IllegalArgumentException("Delimiter must have a length of one!");
        }
        this.delimiter = delimiter;
    }
    
    public CSVConfig getConfig() {
        return config;
    }

    public void setConfig(CSVConfig config) {
        this.config = config;
    }

    public CSVStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(CSVStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isAutogenColumns() {
        return autogenColumns;
    }

    /**
     * Auto generate columns.
     *
     * @param autogenColumns set to false to disallow column autogeneration (default true)
     */
    public void setAutogenColumns(boolean autogenColumns) {
        this.autogenColumns = autogenColumns;
    }

    public boolean isSkipFirstLine() {
        return skipFirstLine;
    }

    public void setSkipFirstLine(boolean skipFirstLine) {
        this.skipFirstLine = skipFirstLine;
    }

    public boolean isLazyLoad() {
        return lazyLoad;
    }

    public void setLazyLoad(boolean lazyLoad) {
        this.lazyLoad = lazyLoad;
    }

    private synchronized void updateFieldsInConfig(Set<?> set, Exchange exchange) {
        for (Object value : set) {
            if (value != null) {
                String text = exchange.getContext().getTypeConverter().convertTo(String.class, value);
                // do not add field twice
                if (config.getField(text) == null) {
                    CSVField field = new CSVField(text);
                    config.addField(field);
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    public static <T> Iterator<T> emptyIterator() {
        return (Iterator<T>) EmptyIterator.EMPTY_ITERATOR;
    }

    private static class EmptyIterator<E> implements Iterator<E> {
        static final EmptyIterator<Object> EMPTY_ITERATOR
            = new EmptyIterator<Object>();

        public boolean hasNext() { return false; }
        public E next() { throw new NoSuchElementException(); }
        public void remove() { throw new IllegalStateException(); }
    }
}