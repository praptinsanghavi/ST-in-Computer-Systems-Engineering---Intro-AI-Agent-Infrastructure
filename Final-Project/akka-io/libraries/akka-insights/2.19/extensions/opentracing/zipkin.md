---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current//extensions/opentracing/zipkin.html
title: Zipkin reporter • Akka Insights
---

# Zipkin reporter • Akka Insights

> **Summary:** Telemetry for Lightbend Platform

## Content

# Zipkin reporter

[Zipkin](https://zipkin.io) is a distributed tracing system with support for OpenTracing.

## Cinnamon Zipkin dependency

First make sure that your build is configured to use the [Cinnamon Agent](../../setup/setup.html).

To enable the Zipkin reporter, add the following dependencies to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonOpenTracing
libraryDependencies += Cinnamon.library.cinnamonOpenTracingZipkin
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing-zipkin</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing_2.13', version: '2.19.4'
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing-zipkin', version: '2.19.4'
}
```

## Zipkin configuration

The default *Zipkin sender* is the URL connection sender, which can be used for sending trace spans directly to the [Zipkin API](https://zipkin.io/zipkin-api/). This sender can be configured. On the Example tab there is a configuration that sets a different endpoint for the Zipkin trace span collector by configuring the `endpoint` setting:

Required

> *There is nothing to configure if you want to use the default Zipkin settings that will communicate with localhost on port 9411 using the URL connection sender.*

Example

```
cinnamon.opentracing {
  zipkin {
    url-connection {
      endpoint = "http://my.zipkin.host:9411/api/v2/spans"
      encoding = "proto3"
    }
  }
}
```

Reference

```
cinnamon.opentracing {
  zipkin {

    # Zipkin API Version (1 or 2)
    # It is used to select a proper version of JSON encoding (JSON_V1 or JSON_V2)
    # and to inform about a possible inconsistency between Zipkin API version and:
    #  - supported encoding format or
    #  - the endpoint URL when used with the `url-connection` sender.
    api-version = 2

    # How long to block for in-flight spans to send out-of-process on close.
    close-timeout = 1s

    # Instead of sending one message at a time, spans are bundled into messages, up to `message-max-bytes`.
    # This timeout ensures that spans are not stuck in an incomplete message.
    # Note: this timeout starts when the first unsent span is reported.
    message-timeout = 1s

    # Flush interval for trace span reporter. Must be greater than zero.
    # DEPRECATED! This is an obsolete setting. Use `message-timeout` instead.
    flush-interval = null

    # Maximum backlog of spans reported vs sent.
    queued-max-spans = 10000

    # Max queue size of trace span reporter.
    # Maximum backlog of spans reported vs sent.
    # DEPRECATED! This is an obsolete setting. Use `queued-max-spans` instead.
    max-queue-size = null

    # Maximum backlog of span bytes reported vs sent. Default 1% of heap.
    queued-max-bytes = null

    # Zipkin sender to use for reporting trace spans
    sender = url-connection

    # Maximum bytes sendable per message including overhead.
    # Defaults to, and is limited by `sender.message-max-bytes`.
    message-max-bytes = null

    # URL connection sender for reporting directly to a Zipkin API endpoint
    url-connection {

      # Zipkin API POST URL
      endpoint = "http://localhost:9411/api/v2/spans"

      # Encoding to use for trace spans:
      #   proto3 - default encoding requires Zipkin 2.8+, endpoint should point to `api/v2`
      #            NOTE: When using Zipkin format to report to Jaeger set the encoding to `json` because Jaeger doesn't support `proto3` Zipkin v2 format.
      #   json   - encoding to make it work with Zipkin prior 2.8
      #            when using with Zipkin 2, `endpoint` should point to `api/v2` and `api-version` should be set to 2
      #   thrift - DEPRECATED and will be removed in future versions!
      encoding = "proto3"

      # Timeout for establishing URL connection
      connect-timeout = 10s

      # Timeout for connection reads
      read-timeout = 60s

      # Whether GZIP compression is enabled
      compression = true

      # Maximum bytes sendable per message including overhead.
      message-max-bytes = 5MiB
    }

  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

See the following sections for configuring the Zipkin sender for Kafka or Scribe.

## Zipkin format configuration for Jaeger

Jaeger supports [Zipkin format](https://www.jaegertracing.io/docs/1.17/apis/#zipkin-formats-stable) except for `proto3` encoding. When using Zipkin format to report to Jaeger set the encoding to `json`.

```
cinnamon.opentracing {
  zipkin {
    url-connection {
      encoding = "json"
    }
  }
}
```

## Zipkin Kafka sender

Zipkin can be configured to send traces to a Kafka topic. This sender supports Kafka 0\.10\.2\+.

To enable the Zipkin Kafka sender, add the following dependencies to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonOpenTracing
libraryDependencies += Cinnamon.library.cinnamonOpenTracingZipkinKafka
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing-zipkin-kafka</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing_2.13', version: '2.19.4'
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing-zipkin-kafka', version: '2.19.4'
}
```

You can then configure the Zipkin reporter to use the Kafka sender. You must specify the Kafka bootstrap servers to use. You can also override any of the [producer configs](https://kafka.apache.org/documentation.html) using the `properties` configuration section:

Required

```
cinnamon.opentracing {
  zipkin {
    sender = kafka

    kafka {
      bootstrap-servers = ["my.kafka.host1:9091", "my.kafka.host2:9091"]
      encoding = "proto3"
    }
  }
}
```

Reference

```
cinnamon.opentracing {
  zipkin {
    kafka {
      # Initial set of kafka servers to connect to (must be specified)
      bootstrap-servers = []

      # Kafka topic to send trace spans to
      topic = "zipkin"

      # Encoding to use for trace spans:
      #   json   - default encoding to make it work with Zipkin prior 2.8
      #   proto3 - requires Zipkin 2.8+
      #   thrift - DEPRECATED and will be removed in future versions!
      encoding = "json"

      # Property overrides for producer configs (https://kafka.apache.org/documentation.html#producerconfigs)
      properties {}

      # Maximum size of messages
      max-message-size = 1MB
    }
  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

## Zipkin Scribe sender

Zipkin can be configured to send traces to Scribe.

To enable the Zipkin Scribe sender, add the following dependencies to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonOpenTracing
libraryDependencies += Cinnamon.library.cinnamonOpenTracingZipkinScribe
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing-zipkin-scribe</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing_2.13', version: '2.19.4'
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing-zipkin-scribe', version: '2.19.4'
}
```

You can then configure the Zipkin reporter to use the Scribe sender. On the Example tab there is a configuration that changes the Scribe endpoint using the `host` and `port` settings:

Required

```
cinnamon.opentracing {
  zipkin {
    sender = scribe
  }
}
```

Example

```
cinnamon.opentracing {
  zipkin {
    sender = scribe

    scribe {
      host = "my.scribe.host"
      port = 9410
    }
  }
}
```

Reference

```
cinnamon.opentracing {
  zipkin {
    scribe {
      # Host of Scribe trace collector
      host = "localhost"

      # Port of Scribe trace collector
      port = 9410

      # Timeout for socket reads
      socket-timeout = 60s

      # Timeout for connections
      connect-timeout = 10s

      # Maximum size of messages (scribe default is 16384000 bytes)
      max-message-size = 16000KiB
    }
  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

## Zipkin B3 propagation

Zipkin\-compatible tracing systems usually propagate the trace context using *B3 headers*, such as `X-B3-TraceId`. To integrate with other HTTP services that do not use Cinnamon or Jaeger\-based tracing but do have Zipkin integration, the Tracer can be configured to inject and extract the trace context using *B3 headers*.

You can configure the tracer to use B3 propagation, in addition to the default Jaeger propagation:

```
cinnamon.opentracing.tracer {
  propagations += b3-propagation
}
```

## Zipkin W3C propagation

You can configure the tracer to use [W3C propagation](https://www.w3.org/TR/trace-context/), in addition to the default Jaeger propagation:

```
cinnamon.opentracing.tracer {
  propagations += w3c-propagation
}
```

## Running Zipkin

See the [Zipkin](https://zipkin.io) documentation for running Zipkin. The [Zipkin quickstart](https://zipkin.io/pages/quickstart.html) shows how to run Zipkin locally for development and testing.

Here’s what an example actor trace in Zipkin looks like:

![Zipkin trace](../../images/zipkin-trace.png)

## Further tracer configuration

The OpenTracing integration for both Jaeger and Zipkin build on the [Jaeger client](https://github.com/jaegertracing/jaeger-client-java). The tracer supports the following configuration:

Setting a *service name* for each node is useful. The service name can be configured specifically for tracing using the `service-name` setting (example below) or otherwise this will be based on the application name from the shared [Cinnamon metadata](../../plugins/plugins.html#cinnamon-metadata). You can use the `cinnamon.application` setting to configure the same name for both metrics and tracing.

Global tags can be added to the tracer, which will be added to all trace spans (but note that global tracer tag keys are automatically prefixed with `tracer.`). See [trace span tags](enabling.html#trace-span-tags) for adding tags to specific types of spans, or all spans created by Cinnamon.

Note
Tracing can produce a very high volume of data, so sampling is applied (at the beginning of a trace). The sampler used, and its settings, can be configured. The default sampler is a rate\-limiting sampler that captures up to 10 traces per second.

On the Example tab, there is a configuration that sets the `service-name` to `my-component`, sets a custom `environment` tag to `staging`, and configures a rate\-limiting sampler with a maximum of 25 traces per second:

Required

> *There is nothing to configure if you want to use the default OpenTracing settings that will use the rate limiting sampler with 10 traces per second.*

Example

```
cinnamon.opentracing {
  tracer {
    service-name = "my-component"

    tags {
      environment = "staging"
    }

    sampler = rate-limiting-sampler

    rate-limiting-sampler {
      max-traces-per-second = 25
    }
  }
}
```

Reference

```
cinnamon.opentracing {
  tracer {

    # Service name for this application, defaults to the `cinnamon.application` identifier when not set
    service-name = null

    # Enables AWS X-Ray Trace ID format
    # NOTE: Currently only Jaeger and Zipkin reporters support this
    aws-xray-trace-id-format = off

    # Tags added to all trace spans (key:value pairs)
    tags {}

    # Trace sampler to use
    sampler = rate-limiting-sampler

    rate-limiting-sampler {
      # Maximum number of sampled traces per second
      max-traces-per-second = 10
    }

    probabilistic-sampler {
      # Probabilistic sampling rate, between 0.0 and 1.0
      sampling-rate = 0.001
    }

    const-sampler {
      # Constant decision on whether to sample traces
      # Note: this sampler is NOT recommended for production
      decision = true
    }

    # Propagation codecs for cross-process tracing (multiple codecs can be active)
    # Include B3 propgation with: `cinnamon.opentracing.tracer.propagations += b3-propagation`
    propagations = [jaeger-propagation]

    jaeger-propagation {
      # Whether to URL encode the trace context for HTTP header propagation
      http-header-url-encoding = on
    }

    b3-propagation {
    }

    w3c-propagation {
    }

    # Log trace spans with SLF4J (can be used for debugging the tracer)
    # Set `cinnamon.opentracing.tracer.reporters += trace-logging`
    trace-logging {
      # Name of SLF4J logger to use when logging
      logger = "cinnamon.opentracing.Tracer"
    }

  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

## Code Examples

### Example 1: Cinnamon Zipkin dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonOpenTracing
libraryDependencies += Cinnamon.library.cinnamonOpenTracingZipkin
```

### Example 2: Cinnamon Zipkin dependency

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing-zipkin</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 3: Cinnamon Zipkin dependency

```gradle
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing_2.13', version: '2.19.4'
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing-zipkin', version: '2.19.4'
}
```

### Example 4: Zipkin configuration

```scala
cinnamon.opentracing {
  zipkin {
    url-connection {
      endpoint = "http://my.zipkin.host:9411/api/v2/spans"
      encoding = "proto3"
    }
  }
}
```

### Example 5: Zipkin configuration

```conf
cinnamon.opentracing {
  zipkin {

    # Zipkin API Version (1 or 2)
    # It is used to select a proper version of JSON encoding (JSON_V1 or JSON_V2)
    # and to inform about a possible inconsistency between Zipkin API version and:
    #  - supported encoding format or
    #  - the endpoint URL when used with the `url-connection` sender.
    api-version = 2

    # How long to block for in-flight spans to send out-of-process on close.
    close-timeout = 1s

    # Instead of sending one message at a time, spans are bundled into messages, up to `message-max-bytes`.
    # This timeout ensures that spans are not stuck in an incomplete message.
    # Note: this timeout starts when the first unsent span is reported.
    message-timeout = 1s

    # Flush interval for trace span reporter. Must be greater than zero.
    # DEPRECATED! This is an obsolete setting. Use `message-timeout` instead.
    flush-interval = null

    # Maximum backlog of spans reported vs sent.
    queued-max-spans = 10000

    # Max queue size of trace span reporter.
    # Maximum backlog of spans reported vs sent.
    # DEPRECATED! This is an obsolete setting. Use `queued-max-spans` instead.
    max-queue-size = null

    # Maximum backlog of span bytes reported vs sent. Default 1% of heap.
    queued-max-bytes = null

    # Zipkin sender to use for reporting trace spans
    sender = url-connection

    # Maximum bytes sendable per message including overhead.
    # Defaults to, and is limited by `sender.message-max-bytes`.
    message-max-bytes = null

    # URL connection sender for reporting directly to a Zipkin API endpoint
    url-connection {

      # Zipkin API POST URL
      endpoint = "http://localhost:9411/api/v2/spans"

      # Encoding to use for trace spans:
      #   proto3 - default encoding requires Zipkin 2.8+, endpoint should point to `api/v2`
      #            NOTE: When using Zipkin format to report to Jaeger set the encoding to `json` because Jaeger doesn't support `proto3` Zipkin v2 format.
      #   json   - encoding to make it work with Zipkin prior 2.8
      #            when using with Zipkin 2, `endpoint` should point to `api/v2` and `api-version` should be set to 2
      #   thrift - DEPRECATED and will be removed in future versions!
      encoding = "proto3"

      # Timeout for establishing URL connection
      connect-timeout = 10s

      # Timeout for connection reads
      read-timeout = 60s

      # Whether GZIP compression is enabled
      compression = true

      # Maximum bytes sendable per message including overhead.
      message-max-bytes = 5MiB
    }

  }
}
```

### Example 6: Zipkin format configuration for Jaeger

```scala
cinnamon.opentracing {
  zipkin {
    url-connection {
      encoding = "json"
    }
  }
}
```

### Example 7: Zipkin Kafka sender

```sbt
libraryDependencies += Cinnamon.library.cinnamonOpenTracing
libraryDependencies += Cinnamon.library.cinnamonOpenTracingZipkinKafka
```

### Example 8: Zipkin Kafka sender

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing-zipkin-kafka</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 9: Zipkin Kafka sender

```gradle
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing_2.13', version: '2.19.4'
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing-zipkin-kafka', version: '2.19.4'
}
```

### Example 10: Zipkin Kafka sender

```scala
cinnamon.opentracing {
  zipkin {
    sender = kafka

    kafka {
      bootstrap-servers = ["my.kafka.host1:9091", "my.kafka.host2:9091"]
      encoding = "proto3"
    }
  }
}
```

### Example 11: Zipkin Kafka sender

```conf
cinnamon.opentracing {
  zipkin {
    kafka {
      # Initial set of kafka servers to connect to (must be specified)
      bootstrap-servers = []

      # Kafka topic to send trace spans to
      topic = "zipkin"

      # Encoding to use for trace spans:
      #   json   - default encoding to make it work with Zipkin prior 2.8
      #   proto3 - requires Zipkin 2.8+
      #   thrift - DEPRECATED and will be removed in future versions!
      encoding = "json"

      # Property overrides for producer configs (https://kafka.apache.org/documentation.html#producerconfigs)
      properties {}

      # Maximum size of messages
      max-message-size = 1MB
    }
  }
}
```

### Example 12: Zipkin Scribe sender

```sbt
libraryDependencies += Cinnamon.library.cinnamonOpenTracing
libraryDependencies += Cinnamon.library.cinnamonOpenTracingZipkinScribe
```

### Example 13: Zipkin Scribe sender

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing-zipkin-scribe</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 14: Zipkin Scribe sender

```gradle
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing_2.13', version: '2.19.4'
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing-zipkin-scribe', version: '2.19.4'
}
```

### Example 15: Zipkin Scribe sender

```scala
cinnamon.opentracing {
  zipkin {
    sender = scribe
  }
}
```

### Example 16: Zipkin Scribe sender

```scala
cinnamon.opentracing {
  zipkin {
    sender = scribe

    scribe {
      host = "my.scribe.host"
      port = 9410
    }
  }
}
```

### Example 17: Zipkin Scribe sender

```conf
cinnamon.opentracing {
  zipkin {
    scribe {
      # Host of Scribe trace collector
      host = "localhost"

      # Port of Scribe trace collector
      port = 9410

      # Timeout for socket reads
      socket-timeout = 60s

      # Timeout for connections
      connect-timeout = 10s

      # Maximum size of messages (scribe default is 16384000 bytes)
      max-message-size = 16000KiB
    }
  }
}
```

### Example 18: Zipkin B3 propagation

```scala
cinnamon.opentracing.tracer {
  propagations += b3-propagation
}
```

### Example 19: Zipkin W3C propagation

```scala
cinnamon.opentracing.tracer {
  propagations += w3c-propagation
}
```

### Example 20: Further tracer configuration

```scala
cinnamon.opentracing {
  tracer {
    service-name = "my-component"

    tags {
      environment = "staging"
    }

    sampler = rate-limiting-sampler

    rate-limiting-sampler {
      max-traces-per-second = 25
    }
  }
}
```

### Example 21: Further tracer configuration

```conf
cinnamon.opentracing {
  tracer {

    # Service name for this application, defaults to the `cinnamon.application` identifier when not set
    service-name = null

    # Enables AWS X-Ray Trace ID format
    # NOTE: Currently only Jaeger and Zipkin reporters support this
    aws-xray-trace-id-format = off

    # Tags added to all trace spans (key:value pairs)
    tags {}

    # Trace sampler to use
    sampler = rate-limiting-sampler

    rate-limiting-sampler {
      # Maximum number of sampled traces per second
      max-traces-per-second = 10
    }

    probabilistic-sampler {
      # Probabilistic sampling rate, between 0.0 and 1.0
      sampling-rate = 0.001
    }

    const-sampler {
      # Constant decision on whether to sample traces
      # Note: this sampler is NOT recommended for production
      decision = true
    }

    # Propagation codecs for cross-process tracing (multiple codecs can be active)
    # Include B3 propgation with: `cinnamon.opentracing.tracer.propagations += b3-propagation`
    propagations = [jaeger-propagation]

    jaeger-propagation {
      # Whether to URL encode the trace context for HTTP header propagation
      http-header-url-encoding = on
    }

    b3-propagation {
    }

    w3c-propagation {
    }

    # Log trace spans with SLF4J (can be used for debugging the tracer)
    # Set `cinnamon.opentracing.tracer.reporters += trace-logging`
    trace-logging {
      # Name of SLF4J logger to use when logging
      logger = "cinnamon.opentracing.Tracer"
    }

  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/datadog.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/enabling.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/jaeger.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/plugins.html
- https://doc.akka.io/libraries/akka-insights/2.19/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/zipkin.html](https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/zipkin.html)*