/*
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
package org.apache.camel.kafkaconnector.nagios;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelNagiosSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_NAGIOS_PATH_HOST_CONF = "camel.sink.path.host";
    public static final String CAMEL_SINK_NAGIOS_PATH_HOST_DOC = "This is the address of the Nagios host where checks should be send.";
    public static final String CAMEL_SINK_NAGIOS_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_NAGIOS_PATH_PORT_CONF = "camel.sink.path.port";
    public static final String CAMEL_SINK_NAGIOS_PATH_PORT_DOC = "The port number of the host.";
    public static final Integer CAMEL_SINK_NAGIOS_PATH_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_CONNECTION_TIMEOUT_CONF = "camel.sink.endpoint.connectionTimeout";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_CONNECTION_TIMEOUT_DOC = "Connection timeout in millis.";
    public static final Integer CAMEL_SINK_NAGIOS_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT = 5000;
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_NAGIOS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_SEND_SYNC_CONF = "camel.sink.endpoint.sendSync";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_SEND_SYNC_DOC = "Whether or not to use synchronous when sending a passive check. Setting it to false will allow Camel to continue routing the message and the passive check message will be send asynchronously.";
    public static final Boolean CAMEL_SINK_NAGIOS_ENDPOINT_SEND_SYNC_DEFAULT = true;
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_TIMEOUT_CONF = "camel.sink.endpoint.timeout";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_TIMEOUT_DOC = "Sending timeout in millis.";
    public static final Integer CAMEL_SINK_NAGIOS_ENDPOINT_TIMEOUT_DEFAULT = 5000;
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_NAGIOS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_NAGIOS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_ENCRYPTION_CONF = "camel.sink.endpoint.encryption";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_ENCRYPTION_DOC = "To specify an encryption method. One of: [NONE] [TRIPLE_DES] [XOR] [RIJNDAEL128] [RIJNDAEL192] [RIJNDAEL256] [BLOWFISH]";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_ENCRYPTION_DEFAULT = null;
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_PASSWORD_DOC = "Password to be authenticated when sending checks to Nagios.";
    public static final String CAMEL_SINK_NAGIOS_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_CONNECTION_TIMEOUT_CONF = "camel.component.nagios.connectionTimeout";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_CONNECTION_TIMEOUT_DOC = "Connection timeout in millis.";
    public static final Integer CAMEL_SINK_NAGIOS_COMPONENT_CONNECTION_TIMEOUT_DEFAULT = 5000;
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.nagios.lazyStartProducer";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_NAGIOS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_TIMEOUT_CONF = "camel.component.nagios.timeout";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_TIMEOUT_DOC = "Sending timeout in millis.";
    public static final Integer CAMEL_SINK_NAGIOS_COMPONENT_TIMEOUT_DEFAULT = 5000;
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.nagios.basicPropertyBinding";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_NAGIOS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_CONFIGURATION_CONF = "camel.component.nagios.configuration";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_CONFIGURATION_DOC = "To use a shared NagiosConfiguration";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_ENCRYPTION_CONF = "camel.component.nagios.encryption";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_ENCRYPTION_DOC = "To specify an encryption method. One of: [NONE] [TRIPLE_DES] [XOR] [RIJNDAEL128] [RIJNDAEL192] [RIJNDAEL256] [BLOWFISH]";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_ENCRYPTION_DEFAULT = null;
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_PASSWORD_CONF = "camel.component.nagios.password";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_PASSWORD_DOC = "Password to be authenticated when sending checks to Nagios.";
    public static final String CAMEL_SINK_NAGIOS_COMPONENT_PASSWORD_DEFAULT = null;

    public CamelNagiosSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelNagiosSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_NAGIOS_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NAGIOS_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_NAGIOS_PATH_HOST_DOC);
        conf.define(CAMEL_SINK_NAGIOS_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NAGIOS_PATH_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_NAGIOS_PATH_PORT_DOC);
        conf.define(CAMEL_SINK_NAGIOS_ENDPOINT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NAGIOS_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_ENDPOINT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_NAGIOS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NAGIOS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_NAGIOS_ENDPOINT_SEND_SYNC_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NAGIOS_ENDPOINT_SEND_SYNC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_ENDPOINT_SEND_SYNC_DOC);
        conf.define(CAMEL_SINK_NAGIOS_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NAGIOS_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_NAGIOS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NAGIOS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_NAGIOS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NAGIOS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_NAGIOS_ENDPOINT_ENCRYPTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NAGIOS_ENDPOINT_ENCRYPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_ENDPOINT_ENCRYPTION_DOC);
        conf.define(CAMEL_SINK_NAGIOS_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NAGIOS_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_NAGIOS_COMPONENT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NAGIOS_COMPONENT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_COMPONENT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_NAGIOS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NAGIOS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_NAGIOS_COMPONENT_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_NAGIOS_COMPONENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_COMPONENT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_NAGIOS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_NAGIOS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_NAGIOS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_NAGIOS_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NAGIOS_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_NAGIOS_COMPONENT_ENCRYPTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NAGIOS_COMPONENT_ENCRYPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_COMPONENT_ENCRYPTION_DOC);
        conf.define(CAMEL_SINK_NAGIOS_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_NAGIOS_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_NAGIOS_COMPONENT_PASSWORD_DOC);
        return conf;
    }
}