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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The atmos component is used for integrating with EMC's Atomos Storage.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtmosEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Atmos component.
     */
    public interface AtmosEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedAtmosEndpointConsumerBuilder advanced() {
            return (AdvancedAtmosEndpointConsumerBuilder) this;
        }
        /**
         * Local path to put files.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointConsumerBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * New path on Atmos when moving files.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointConsumerBuilder newRemotePath(String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Search query on Atmos.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointConsumerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Where to put files on Atmos.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointConsumerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default AtmosEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default AtmosEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Atmos client fullTokenId.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointConsumerBuilder fullTokenId(String fullTokenId) {
            doSetProperty("fullTokenId", fullTokenId);
            return this;
        }
        /**
         * The secret key to pass to the Atmos client (should be base64
         * encoded).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointConsumerBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointConsumerBuilder sslValidation(boolean sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointConsumerBuilder sslValidation(String sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Atmos component.
     */
    public interface AdvancedAtmosEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AtmosEndpointConsumerBuilder basic() {
            return (AtmosEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedAtmosEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedAtmosEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedAtmosEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedAtmosEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Atomos server uri.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointConsumerBuilder uri(String uri) {
            doSetProperty("uri", uri);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Atmos component.
     */
    public interface AtmosEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedAtmosEndpointProducerBuilder advanced() {
            return (AdvancedAtmosEndpointProducerBuilder) this;
        }
        /**
         * Local path to put files.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointProducerBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * New path on Atmos when moving files.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointProducerBuilder newRemotePath(String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Search query on Atmos.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointProducerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Where to put files on Atmos.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointProducerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default AtmosEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default AtmosEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Atmos client fullTokenId.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointProducerBuilder fullTokenId(String fullTokenId) {
            doSetProperty("fullTokenId", fullTokenId);
            return this;
        }
        /**
         * The secret key to pass to the Atmos client (should be base64
         * encoded).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointProducerBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointProducerBuilder sslValidation(boolean sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointProducerBuilder sslValidation(String sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Atmos component.
     */
    public interface AdvancedAtmosEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AtmosEndpointProducerBuilder basic() {
            return (AtmosEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Atomos server uri.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointProducerBuilder uri(String uri) {
            doSetProperty("uri", uri);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Atmos component.
     */
    public interface AtmosEndpointBuilder
            extends
                AtmosEndpointConsumerBuilder, AtmosEndpointProducerBuilder {
        default AdvancedAtmosEndpointBuilder advanced() {
            return (AdvancedAtmosEndpointBuilder) this;
        }
        /**
         * Local path to put files.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * New path on Atmos when moving files.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointBuilder newRemotePath(String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Search query on Atmos.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Where to put files on Atmos.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AtmosEndpointBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Atmos client fullTokenId.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointBuilder fullTokenId(String fullTokenId) {
            doSetProperty("fullTokenId", fullTokenId);
            return this;
        }
        /**
         * The secret key to pass to the Atmos client (should be base64
         * encoded).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointBuilder sslValidation(boolean sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: security
         */
        default AtmosEndpointBuilder sslValidation(String sslValidation) {
            doSetProperty("sslValidation", sslValidation);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Atmos component.
     */
    public interface AdvancedAtmosEndpointBuilder
            extends
                AdvancedAtmosEndpointConsumerBuilder, AdvancedAtmosEndpointProducerBuilder {
        default AtmosEndpointBuilder basic() {
            return (AtmosEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Atomos server uri.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAtmosEndpointBuilder uri(String uri) {
            doSetProperty("uri", uri);
            return this;
        }
    }
    /**
     * Atmos (camel-atmos)
     * The atmos component is used for integrating with EMC's Atomos Storage.
     * 
     * Category: file,cloud
     * Available as of version: 2.15
     * Maven coordinates: org.apache.camel:camel-atmos
     * 
     * Syntax: <code>atmos:name/operation</code>
     * 
     * Path parameter: name
     * Atmos name
     * 
     * Path parameter: operation (required)
     * Operation to perform
     * The value can be one of: put, del, search, get, move
     */
    default AtmosEndpointBuilder atmos(String path) {
        class AtmosEndpointBuilderImpl extends AbstractEndpointBuilder implements AtmosEndpointBuilder, AdvancedAtmosEndpointBuilder {
            public AtmosEndpointBuilderImpl(String path) {
                super("atmos", path);
            }
        }
        return new AtmosEndpointBuilderImpl(path);
    }
}