---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:14Z'
section: libraries
site: akka-io
source_url: /extensions/mdc.html
title: SLF4J MDC • Akka Insights
---

# SLF4J MDC • Akka Insights

## Content

# SLF4J MDC

Akka Insights supports propagation of the SLF4J [Mapped Diagnostic Context (MDC)](https://logback.qos.ch/manual/mdc.html) through Akka actors, Akka Scheduler (scheduleOnce), Akka Streams, Akka HTTP requests, Scala Futures, and Java Futures. When an MDC is set on the current thread, this will be copied with any subsequent message sends, HTTP requests, or asynchronous callbacks. The MDC will be reinstated when the receiving actor processes the message, the server receives the request, the client receives the response, or when the callback runs. For example, this allows a request or transaction ID to be set and to appear in all connected log messages.

## Cinnamon dependency

First make sure that your build is configured to use the [Cinnamon Agent](../setup/setup.html).

To enable SLF4J MDC support, add the following dependency to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonSlf4jMdc
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-slf4j-mdc_2.13</artifactId>
  <version>2.21.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-slf4j-mdc_2.13', version: '2.21.4'
}
```

No further configuration is required. All actors (including the Akka logging actors and remote actors), Akka Streams, Akka HTTP servers and clients, and Scala Future or Java Future callbacks will transport and receive the current MDC.

Note
You do not need to use any special APIs to modify the MDC; you can use the `org.slf4j.MDC` API directly to put, get, remove, or clear values. For more information on using the MDC see the [Logback MDC documentation](https://logback.qos.ch/manual/mdc.html).

Note
You do not need to use the [DiagnosticLoggingAdapter](https://doc.akka.io/docs/akka/current/logging.html#mdc-values-defined-by-the-application) or other MDC utilities in Akka when using the Cinnamon MDC instrumentation. The current MDC values are automatically transferred to the logging actors. There is also no need for special MDC cleanup; Cinnamon MDC will swap the MDC in and out of context as messages or callbacks are processed.

## MDC filter

The MDC keys that get transferred across asynchronous boundaries can be filtered using configuration. For example, use the following configuration to only propagate the `"id"` value:

```
cinnamon.slf4j.mdc {
  filter = ["id"]
}
```

### MDC filter for HTTP requests and responses

A filter only for HTTP client requests and server responses can be configured separately, so that any sensitive information in the MDC can be propagated locally but won’t be included in HTTP headers. Use the `http.filter` setting to configure which MDC keys should be propagated with requests and responses:

```
cinnamon.slf4j.mdc {
  http.filter = ["Correlation-ID"]
}
```

Filters can also be specified per\-endpoint as an extension of the HTTP configuration for [Akka HTTP](../instrumentations/akka-http/akka-http-configuration.html) using the `mdc.filter` setting:

```
cinnamon.akka.http {
  clients {
    "*:*" {
      paths {
        "hello/*" {
          mdc.filter = ["Correlation-ID"]
        }
      }
    }
  }
  servers {
    "*:*" {
      paths {
        "hello/*" {
          mdc.filter = ["Correlation-ID"]
        }
      }
    }
  }
}
```
Note
The regular filter will still be applied to MDC propagation for everything other than HTTP requests and responses (such as local actors, remote actors, or streams), while the HTTP filter is applied when injecting headers. Endpoint filters override the global HTTP filter for any matching endpoints.

### MDC filter for Alpakka Kafka

A filter only for Alpakka Kafka producers can be configured separately, so that any sensitive information in the MDC can be propagated locally but won’t be included in Kafka record headers. Use the `alpakka.kafka.filter` setting to configure which MDC keys should be propagated with producer records:

```
cinnamon.slf4j.mdc {
  alpakka.kafka {
    filter = ["Correlation-ID"]
  }
}
```
Note
The regular filter will still be applied to MDC propagation for everything other than Alpakka Kafka producers (such as local actors, remote actors, or streams), while the Alpakka Kafka filter is applied when injecting headers.

## Serialization limit

The MDC is transported along with remote messages and requests. To avoid inadvertently sending a lot of data, there is a limit on the size of the serialized MDC. If the limit is exceeded then the MDC will not be propagated remotely and a warning will be logged. If you reach this limit, you may want to only transport specific keys using the [MDC filter configuration](mdc.html#mdc-filter), or the limit can be increased. For example, you can use the following configuration to set a different limit:

```
cinnamon.slf4j.mdc {
  serialization.limit = 2048 bytes
}
```

## Akka HTTP headers

For Akka HTTP requests and responses, the MDC is propagated as HTTP message headers. There are two ways to propagate the MDC in headers: either as a single encoded header, or as individual headers for each MDC value with a prefixed key used as the header name.

### Akka HTTP encoded header

The default MDC propagation for Akka HTTP is as a single encoded header, where the MDC context map is serialized and then encoded in Base64\. For example, an MDC that contains:

```
"Correlation-ID" -> "abc123"
```

would be propagated with this header:

```
Cinnamon-MDC: AAAAAQAAAA4AAAAOQ29ycmVsYXRpb24tSUQAAAAGYWJjMTIz
```

The header name is `Cinnamon-MDC` by default and can be configured. For example, the following configuration sets a different header name:

```
cinnamon.slf4j.mdc {
  http {
    encoded-header {
      name = "X-MDC"
    }
  }
}
```

The [filter](mdc.html#mdc-filter) and [serialization limit](mdc.html#serialization-limit) are also applied to the encoded MDC header.

### Akka HTTP mapped headers

The MDC propagation for Akka HTTP also supports individual headers, where each MDC value has its own header with a prefixed key. For example, an MDC that contains:

```
"Correlation-ID" -> "abc123"
```

would be propagated with this header:

```
CNMDC-Correlation-ID: abc123
```

To enable mapped headers, set the propagation method using this configuration:

```
cinnamon.slf4j.mdc {
  http.propagation = mapped-headers
}
```
Note
MDC keys and values must be suitable for being HTTP message headers. MDC keys can be [filtered](mdc.html#mdc-filter), or otherwise use the default [encoded header](mdc.html#akka-http-encoded-header) propagation if MDC values are inappropriate to be header values.

The prefix used for mapped headers is configurable. For example, the following configuration sets a different header prefix:

```
cinnamon.slf4j.mdc {
  http {
    mapped-headers {
      prefix = "X-"
    }
  }
}
```

## Alpakka Kafka headers

For Alpakka Kafka, the MDC is propagated as Kafka record headers. Similar to [Akka HTTP headers](mdc.html#akka-http-headers), there are two ways to propagate the MDC in Kafka headers: either as a single encoded header, or as individual headers for each MDC value with a prefixed key used as the header name.

### Alpakka Kafka encoded header

The default MDC propagation for Alpakka Kafka is as a single encoded header, where the MDC context map is serialized into bytes. The header name is `Cinnamon-MDC` by default and can be configured. For example, the following configuration sets a different header name:

```
cinnamon.slf4j.mdc {
  alpakka.kafka {
    encoded-header {
      name = "X-MDC"
    }
  }
}
```

### Alpakka Kafka mapped headers

The MDC propagation for Alpakka Kafka also supports individual headers, where each MDC value has its own header with a prefixed key and the value encoded as UTF\-8 bytes. The default prefix is `CNMDC-`. To enable mapped headers, set the propagation method using this configuration:

```
cinnamon.slf4j.mdc {
  alpakka.kafka {
    propagation = mapped-headers
  }
}
```

The prefix used for mapped headers is configurable. For example, the following configuration sets a different header prefix:

```
cinnamon.slf4j.mdc {
  alpakka.kafka {
    propagation = mapped-headers
    mapped-headers {
      prefix = "X-"
    }
  }
}
```

## Log correlation

Cinnamon supports adding correlation identifiers to the [MDC](https://logback.qos.ch/manual/mdc.html) for correlating causally related log messages across nodes or threads. Any correlation identifiers will be automatically propagated across asynchronous or remote boundaries with subsequent message sends, HTTP requests, or asynchronous callbacks. You can configure Cinnamon to include random correlation IDs automatically, or to include the current trace ID if [OpenTracing](opentracing/opentracing.html) is being used.

### Automatic correlation IDs

Cinnamon supports automatically inserting random correlation IDs. For example: on HTTP server requests, if there is no correlation ID already in context, Cinnamon can add a random UUID to the MDC. The injected correlation ID will then be propagated with the MDC and can be included in all log messages associated with the initial request, including other HTTP requests, actors, streams, or futures. The correlation ID will also be automatically included for propagation if an [MDC filter](mdc.html#mdc-filter) is configured.

To enable automatic correlation IDs use this configuration:

```
cinnamon.slf4j.mdc {
  log-correlation += automatic-correlation-id
}
```

The correlation ID uses the MDC key `Correlation-ID` by default. If needed, you can configure the name used for the correlation ID:

```
cinnamon.slf4j.mdc {
  log-correlation += automatic-correlation-id

  automatic-correlation-id {
    name = "Named-ID"
  }
}
```

By default, the automatic correlation ID is only added at HTTP entry points, and then propagated from there. To check and insert correlation IDs within all initial scopes, including initial Actor message sends, enable the `all-scopes` setting:

```
cinnamon.slf4j.mdc {
  log-correlation += automatic-correlation-id

  automatic-correlation-id {
    all-scopes = on
  }
}
```

### Normalizing correlation ID key names

Due to case\-insensitive handling of HTTP header names, and case\-sensitive handling of [MDC](https://logback.qos.ch/manual/mdc.html) keys, under default settings it is possible that a log correlation ID passing over such a boundary could be missed (e.g., if an HTTP header was specified as `correlation-id: 123` but the expected MDC key was specifically `Correlation-ID`).

For these cases, the `normalize-key` setting can be enabled, causing Cinnamon to normalize the correlation key to the correct case\-sensitive version within the [MDC](https://logback.qos.ch/manual/mdc.html) the first time it is encountered.

```
cinnamon.slf4j.mdc {
  log-correlation += automatic-correlation-id

  automatic-correlation-id {
    normalize-key = true
  }
}
```
Warning
Due to MDC offering no mechanism to look up specific keys in a case\-insensitive manner, enabling the `normalize-key` setting will result in Cinnamon iterating over all keys in your MDC until it finds a suitable match. This behaviour may be undesirable and is disabled by default.

### OpenTracing trace IDs

If the Cinnamon [OpenTracing](opentracing/opentracing.html) integration is being used, log correlation can be enabled for trace IDs. The current trace ID for sampled traces will be inserted into the MDC, to allow logs to be correlated with recorded traces. Note that events can also be logged *into* traces using [active span logging](opentracing/api.html#span-logs).

To enable trace ID log correlation use this configuration:

```
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id
}
```

The trace ID uses the MDC key `Trace-ID` by default. If needed, you can configure the name used for the trace ID:

```
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    name = "Named-ID"
  }
}
```

Depending on the OpenTracing implementation, the trace ID can be in many shapes and forms. If you are running in an environment with multiple tracing implementations on different systems and need to ensure that the trace ID is zero padded to either 16 or 32 characters as defined by the [B3 header specification](https://github.com/openzipkin/b3-propagation/blob/master/README.md), then you can set the padding to either 16 or 32:

```
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    b3-zero-padding = 32
  }
}
```

By default, the trace ID is only added at HTTP entry points, and then propagated from there. To check and insert trace IDs within all initial scopes, including initial Actor message sends, enable the `all-scopes` setting:

```
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    all-scopes = on
  }
}
```

By default, trace IDs will only be added for sampled traces — those traces which will be reported to the tracing backend. To include trace IDs for all traces, both sampled and non\-sampled, disable the `sampled-only` setting:

```
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    sampled-only = off
  }
}
```
Note
To enable log correlation for trace IDs, both the Cinnamon SLF4J MDC and [Cinnamon OpenTracing](opentracing/opentracing.html) modules need to be included.

### Trace ID normalization

When using OpenTracing trace IDs for log correlation, key normalization can be enabled using a `normalize-key` setting similar to the one discussed [here](mdc.html#normalizing-correlation-id-key-names). The following example enables key normalization when using OpenTracing identifiers for log correlation:

```
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    normalize-key = true
  }
}
```

## Code Examples

### Example 1: Cinnamon dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonSlf4jMdc
```

### Example 2: Cinnamon dependency

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-slf4j-mdc_2.13</artifactId>
  <version>2.21.4</version>
</dependency>
```

### Example 3: Cinnamon dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-slf4j-mdc_2.13', version: '2.21.4'
}
```

### Example 4: MDC filter

```scala
cinnamon.slf4j.mdc {
  filter = ["id"]
}
```

### Example 5: MDC filter for HTTP requests and responses

```scala
cinnamon.slf4j.mdc {
  http.filter = ["Correlation-ID"]
}
```

### Example 6: MDC filter for HTTP requests and responses

```scala
cinnamon.akka.http {
  clients {
    "*:*" {
      paths {
        "hello/*" {
          mdc.filter = ["Correlation-ID"]
        }
      }
    }
  }
  servers {
    "*:*" {
      paths {
        "hello/*" {
          mdc.filter = ["Correlation-ID"]
        }
      }
    }
  }
}
```

### Example 7: MDC filter for Alpakka Kafka

```scala
cinnamon.slf4j.mdc {
  alpakka.kafka {
    filter = ["Correlation-ID"]
  }
}
```

### Example 8: Serialization limit

```scala
cinnamon.slf4j.mdc {
  serialization.limit = 2048 bytes
}
```

### Example 9: Akka HTTP encoded header

```scala
"Correlation-ID" -> "abc123"
```

### Example 10: Akka HTTP encoded header

```scala
Cinnamon-MDC: AAAAAQAAAA4AAAAOQ29ycmVsYXRpb24tSUQAAAAGYWJjMTIz
```

### Example 11: Akka HTTP encoded header

```scala
cinnamon.slf4j.mdc {
  http {
    encoded-header {
      name = "X-MDC"
    }
  }
}
```

### Example 12: Akka HTTP mapped headers

```scala
"Correlation-ID" -> "abc123"
```

### Example 13: Akka HTTP mapped headers

```scala
CNMDC-Correlation-ID: abc123
```

### Example 14: Akka HTTP mapped headers

```scala
cinnamon.slf4j.mdc {
  http.propagation = mapped-headers
}
```

### Example 15: Akka HTTP mapped headers

```scala
cinnamon.slf4j.mdc {
  http {
    mapped-headers {
      prefix = "X-"
    }
  }
}
```

### Example 16: Alpakka Kafka encoded header

```scala
cinnamon.slf4j.mdc {
  alpakka.kafka {
    encoded-header {
      name = "X-MDC"
    }
  }
}
```

### Example 17: Alpakka Kafka mapped headers

```scala
cinnamon.slf4j.mdc {
  alpakka.kafka {
    propagation = mapped-headers
  }
}
```

### Example 18: Alpakka Kafka mapped headers

```scala
cinnamon.slf4j.mdc {
  alpakka.kafka {
    propagation = mapped-headers
    mapped-headers {
      prefix = "X-"
    }
  }
}
```

### Example 19: Automatic correlation IDs

```scala
cinnamon.slf4j.mdc {
  log-correlation += automatic-correlation-id
}
```

### Example 20: Automatic correlation IDs

```scala
cinnamon.slf4j.mdc {
  log-correlation += automatic-correlation-id

  automatic-correlation-id {
    name = "Named-ID"
  }
}
```

### Example 21: Automatic correlation IDs

```scala
cinnamon.slf4j.mdc {
  log-correlation += automatic-correlation-id

  automatic-correlation-id {
    all-scopes = on
  }
}
```

### Example 22: Normalizing correlation ID key names

```scala
cinnamon.slf4j.mdc {
  log-correlation += automatic-correlation-id

  automatic-correlation-id {
    normalize-key = true
  }
}
```

### Example 23: OpenTracing trace IDs

```scala
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id
}
```

### Example 24: OpenTracing trace IDs

```scala
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    name = "Named-ID"
  }
}
```

### Example 25: OpenTracing trace IDs

```scala
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    b3-zero-padding = 32
  }
}
```

### Example 26: OpenTracing trace IDs

```scala
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    all-scopes = on
  }
}
```

### Example 27: OpenTracing trace IDs

```scala
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    sampled-only = off
  }
}
```

### Example 28: Trace ID normalization

```scala
cinnamon.slf4j.mdc {
  log-correlation += opentracing-trace-id

  opentracing-trace-id {
    normalize-key = true
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/docs/akka/current/logging.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/mdc.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/api.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/compatibility.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/opentracing.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/stopwatch.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka-http/akka-http-configuration.html
- https://doc.akka.io/libraries/akka-insights/2.21/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/extensions/mdc.html](https://doc.akka.io/libraries/akka-insights/2.21/extensions/mdc.html)*