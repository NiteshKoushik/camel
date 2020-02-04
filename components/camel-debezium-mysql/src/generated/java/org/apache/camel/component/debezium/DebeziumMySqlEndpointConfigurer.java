/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DebeziumMySqlEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "additionalProperties": ((DebeziumMySqlEndpoint) target).getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "bridgeErrorHandler": ((DebeziumMySqlEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "internalKeyConverter": ((DebeziumMySqlEndpoint) target).getConfiguration().setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalValueConverter": ((DebeziumMySqlEndpoint) target).getConfiguration().setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetCommitPolicy": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetCommitTimeoutMs": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetCommitTimeoutMs(property(camelContext, long.class, value)); return true;
        case "offsetFlushIntervalMs": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetFlushIntervalMs(property(camelContext, long.class, value)); return true;
        case "offsetStorage": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetStorageFileName": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetStoragePartitions": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetStorageReplicationFactor": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetStorageTopic": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((DebeziumMySqlEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((DebeziumMySqlEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "basicPropertyBinding": ((DebeziumMySqlEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DebeziumMySqlEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "bigintUnsignedHandlingMode": ((DebeziumMySqlEndpoint) target).getConfiguration().setBigintUnsignedHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "binlogBufferSize": ((DebeziumMySqlEndpoint) target).getConfiguration().setBinlogBufferSize(property(camelContext, int.class, value)); return true;
        case "columnBlacklist": ((DebeziumMySqlEndpoint) target).getConfiguration().setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "connectKeepAlive": ((DebeziumMySqlEndpoint) target).getConfiguration().setConnectKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "connectKeepAliveIntervalMs": ((DebeziumMySqlEndpoint) target).getConfiguration().setConnectKeepAliveIntervalMs(property(camelContext, long.class, value)); return true;
        case "connectTimeoutMs": ((DebeziumMySqlEndpoint) target).getConfiguration().setConnectTimeoutMs(property(camelContext, int.class, value)); return true;
        case "databaseBlacklist": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseHistory": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistory(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseHistoryFileFilename": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseHistoryKafkaBootstrapServers": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryKafkaBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseHistoryKafkaRecoveryAttempts": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryKafkaRecoveryAttempts(property(camelContext, int.class, value)); return true;
        case "databaseHistoryKafkaRecoveryPollIntervalMs": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryKafkaRecoveryPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "databaseHistoryKafkaTopic": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryKafkaTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseHistorySkipUnparseableDdl": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistorySkipUnparseableDdl(property(camelContext, boolean.class, value)); return true;
        case "databaseHistoryStoreOnlyMonitoredTablesDdl": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryStoreOnlyMonitoredTablesDdl(property(camelContext, boolean.class, value)); return true;
        case "databaseHostname": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseInitialStatements": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseInitialStatements(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseJdbcDriver": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseJdbcDriver(property(camelContext, java.lang.String.class, value)); return true;
        case "databasePassword": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databasePort": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseServerId": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseServerId(property(camelContext, long.class, value)); return true;
        case "databaseServerIdOffset": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseServerIdOffset(property(camelContext, long.class, value)); return true;
        case "databaseServerName": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseSslKeystore": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslKeystore(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseSslKeystorePassword": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseSslMode": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslMode(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseSslTruststore": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslTruststore(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseSslTruststorePassword": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslTruststorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseUser": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseWhitelist": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalHandlingMode": ((DebeziumMySqlEndpoint) target).getConfiguration().setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "enableTimeAdjuster": ((DebeziumMySqlEndpoint) target).getConfiguration().setEnableTimeAdjuster(property(camelContext, boolean.class, value)); return true;
        case "eventDeserializationFailureHandlingMode": ((DebeziumMySqlEndpoint) target).getConfiguration().setEventDeserializationFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "gtidNewChannelPosition": ((DebeziumMySqlEndpoint) target).getConfiguration().setGtidNewChannelPosition(property(camelContext, java.lang.String.class, value)); return true;
        case "gtidSourceExcludes": ((DebeziumMySqlEndpoint) target).getConfiguration().setGtidSourceExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "gtidSourceFilterDmlEvents": ((DebeziumMySqlEndpoint) target).getConfiguration().setGtidSourceFilterDmlEvents(property(camelContext, boolean.class, value)); return true;
        case "gtidSourceIncludes": ((DebeziumMySqlEndpoint) target).getConfiguration().setGtidSourceIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatIntervalMs": ((DebeziumMySqlEndpoint) target).getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeatTopicsPrefix": ((DebeziumMySqlEndpoint) target).getConfiguration().setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "includeQuery": ((DebeziumMySqlEndpoint) target).getConfiguration().setIncludeQuery(property(camelContext, boolean.class, value)); return true;
        case "includeSchemaChanges": ((DebeziumMySqlEndpoint) target).getConfiguration().setIncludeSchemaChanges(property(camelContext, boolean.class, value)); return true;
        case "inconsistentSchemaHandlingMode": ((DebeziumMySqlEndpoint) target).getConfiguration().setInconsistentSchemaHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "maxBatchSize": ((DebeziumMySqlEndpoint) target).getConfiguration().setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxQueueSize": ((DebeziumMySqlEndpoint) target).getConfiguration().setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "messageKeyColumns": ((DebeziumMySqlEndpoint) target).getConfiguration().setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "pollIntervalMs": ((DebeziumMySqlEndpoint) target).getConfiguration().setPollIntervalMs(property(camelContext, long.class, value)); return true;
        case "snapshotDelayMs": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotDelayMs(property(camelContext, long.class, value)); return true;
        case "snapshotFetchSize": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotLockingMode": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotLockingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotMode": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotNewTables": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotNewTables(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotSelectStatementOverrides": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceStructVersion": ((DebeziumMySqlEndpoint) target).getConfiguration().setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "tableBlacklist": ((DebeziumMySqlEndpoint) target).getConfiguration().setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tableIgnoreBuiltin": ((DebeziumMySqlEndpoint) target).getConfiguration().setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tableWhitelist": ((DebeziumMySqlEndpoint) target).getConfiguration().setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timePrecisionMode": ((DebeziumMySqlEndpoint) target).getConfiguration().setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesOnDelete": ((DebeziumMySqlEndpoint) target).getConfiguration().setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "additionalproperties": ((DebeziumMySqlEndpoint) target).getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "bridgeerrorhandler": ((DebeziumMySqlEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "internalkeyconverter": ((DebeziumMySqlEndpoint) target).getConfiguration().setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter": ((DebeziumMySqlEndpoint) target).getConfiguration().setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetCommitTimeoutMs(property(camelContext, long.class, value)); return true;
        case "offsetflushintervalms": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetFlushIntervalMs(property(camelContext, long.class, value)); return true;
        case "offsetstorage": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic": ((DebeziumMySqlEndpoint) target).getConfiguration().setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((DebeziumMySqlEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((DebeziumMySqlEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "basicpropertybinding": ((DebeziumMySqlEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DebeziumMySqlEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "bigintunsignedhandlingmode": ((DebeziumMySqlEndpoint) target).getConfiguration().setBigintUnsignedHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "binlogbuffersize": ((DebeziumMySqlEndpoint) target).getConfiguration().setBinlogBufferSize(property(camelContext, int.class, value)); return true;
        case "columnblacklist": ((DebeziumMySqlEndpoint) target).getConfiguration().setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "connectkeepalive": ((DebeziumMySqlEndpoint) target).getConfiguration().setConnectKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "connectkeepaliveintervalms": ((DebeziumMySqlEndpoint) target).getConfiguration().setConnectKeepAliveIntervalMs(property(camelContext, long.class, value)); return true;
        case "connecttimeoutms": ((DebeziumMySqlEndpoint) target).getConfiguration().setConnectTimeoutMs(property(camelContext, int.class, value)); return true;
        case "databaseblacklist": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistory": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistory(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkabootstrapservers": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryKafkaBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkarecoveryattempts": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryKafkaRecoveryAttempts(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkarecoverypollintervalms": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryKafkaRecoveryPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkatopic": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryKafkaTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryskipunparseableddl": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistorySkipUnparseableDdl(property(camelContext, boolean.class, value)); return true;
        case "databasehistorystoreonlymonitoredtablesddl": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHistoryStoreOnlyMonitoredTablesDdl(property(camelContext, boolean.class, value)); return true;
        case "databasehostname": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseinitialstatements": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseInitialStatements(property(camelContext, java.lang.String.class, value)); return true;
        case "databasejdbcdriver": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseJdbcDriver(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseserverid": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseServerId(property(camelContext, long.class, value)); return true;
        case "databaseserveridoffset": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseServerIdOffset(property(camelContext, long.class, value)); return true;
        case "databaseservername": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslkeystore": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslKeystore(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslkeystorepassword": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslmode": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslMode(property(camelContext, java.lang.String.class, value)); return true;
        case "databasessltruststore": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslTruststore(property(camelContext, java.lang.String.class, value)); return true;
        case "databasessltruststorepassword": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseSslTruststorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseuser": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "databasewhitelist": ((DebeziumMySqlEndpoint) target).getConfiguration().setDatabaseWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode": ((DebeziumMySqlEndpoint) target).getConfiguration().setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "enabletimeadjuster": ((DebeziumMySqlEndpoint) target).getConfiguration().setEnableTimeAdjuster(property(camelContext, boolean.class, value)); return true;
        case "eventdeserializationfailurehandlingmode": ((DebeziumMySqlEndpoint) target).getConfiguration().setEventDeserializationFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "gtidnewchannelposition": ((DebeziumMySqlEndpoint) target).getConfiguration().setGtidNewChannelPosition(property(camelContext, java.lang.String.class, value)); return true;
        case "gtidsourceexcludes": ((DebeziumMySqlEndpoint) target).getConfiguration().setGtidSourceExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "gtidsourcefilterdmlevents": ((DebeziumMySqlEndpoint) target).getConfiguration().setGtidSourceFilterDmlEvents(property(camelContext, boolean.class, value)); return true;
        case "gtidsourceincludes": ((DebeziumMySqlEndpoint) target).getConfiguration().setGtidSourceIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms": ((DebeziumMySqlEndpoint) target).getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix": ((DebeziumMySqlEndpoint) target).getConfiguration().setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "includequery": ((DebeziumMySqlEndpoint) target).getConfiguration().setIncludeQuery(property(camelContext, boolean.class, value)); return true;
        case "includeschemachanges": ((DebeziumMySqlEndpoint) target).getConfiguration().setIncludeSchemaChanges(property(camelContext, boolean.class, value)); return true;
        case "inconsistentschemahandlingmode": ((DebeziumMySqlEndpoint) target).getConfiguration().setInconsistentSchemaHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize": ((DebeziumMySqlEndpoint) target).getConfiguration().setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize": ((DebeziumMySqlEndpoint) target).getConfiguration().setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "messagekeycolumns": ((DebeziumMySqlEndpoint) target).getConfiguration().setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms": ((DebeziumMySqlEndpoint) target).getConfiguration().setPollIntervalMs(property(camelContext, long.class, value)); return true;
        case "snapshotdelayms": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotDelayMs(property(camelContext, long.class, value)); return true;
        case "snapshotfetchsize": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotlockingmode": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotLockingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotmode": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotnewtables": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotNewTables(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides": ((DebeziumMySqlEndpoint) target).getConfiguration().setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion": ((DebeziumMySqlEndpoint) target).getConfiguration().setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "tableblacklist": ((DebeziumMySqlEndpoint) target).getConfiguration().setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin": ((DebeziumMySqlEndpoint) target).getConfiguration().setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tablewhitelist": ((DebeziumMySqlEndpoint) target).getConfiguration().setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode": ((DebeziumMySqlEndpoint) target).getConfiguration().setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete": ((DebeziumMySqlEndpoint) target).getConfiguration().setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
