---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:26Z'
section: libraries
site: akka-io
source_url: /extensions/opentracing/jaeger.html
title: Jaeger reporter • Akka Insights
---

# Jaeger reporter • Akka Insights

## Content

# Jaeger reporter

[Jaeger](https://www.jaegertracing.io/) is a distributed tracing system with support for OpenTracing.

## Cinnamon Jaeger dependency

First make sure that your build is configured to use the [Cinnamon Agent](../../setup/setup.html).

To enable the Jaeger reporter, add the following dependencies to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonOpenTracing
libraryDependencies += Cinnamon.library.cinnamonOpenTracingJaeger
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing_2.13</artifactId>
  <version>2.21.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing-jaeger</artifactId>
  <version>2.21.4</version>
</dependency>
```

Gradle

```
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing_2.13', version: '2.21.4'
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing-jaeger', version: '2.21.4'
}
```

## Jaeger configuration

Jaeger reporting can be configured. On the Example tab, there is a configuration that sets a different endpoint for the Jaeger agent by configuring the `host` and `port` settings:

Required

> *There is nothing to configure if you want to use the default Jaeger settings that will communicate with localhost on port 5775\.*

Example

```
cinnamon.opentracing {
  jaeger {
    host = "localhost"
    port = 5432
  }
}
```

Reference

```
cinnamon.opentracing {
  jaeger {

    # Host for Jaeger trace span collector
    host = "localhost"

    # UDP port for Jaeger trace span collector
    port = 5775

    # Max size for UDP packets
    max-packet-size = 65000

    # Flush interval for trace span reporter
    flush-interval = 1s

    # Max queue size of trace span reporter
    max-queue-size = 1000

  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

## Running Jaeger

See the [Jaeger documentation](https://www.jaegertracing.io/docs/1.14/) for running Jaeger. The [Jaeger getting started](https://www.jaegertracing.io/docs/1.14/getting-started/) shows how to run Jaeger locally for development and testing.

Here’s what an example actor trace in Jaeger looks like:

![Jaeger trace](../../images/jaeger-trace.png)

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

### Example 1: Cinnamon Jaeger dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonOpenTracing
libraryDependencies += Cinnamon.library.cinnamonOpenTracingJaeger
```

### Example 2: Cinnamon Jaeger dependency

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing_2.13</artifactId>
  <version>2.21.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-opentracing-jaeger</artifactId>
  <version>2.21.4</version>
</dependency>
```

### Example 3: Cinnamon Jaeger dependency

```gradle
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing_2.13', version: '2.21.4'
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-opentracing-jaeger', version: '2.21.4'
}
```

### Example 4: Jaeger configuration

```scala
cinnamon.opentracing {
  jaeger {
    host = "localhost"
    port = 5432
  }
}
```

### Example 5: Jaeger configuration

```conf
cinnamon.opentracing {
  jaeger {

    # Host for Jaeger trace span collector
    host = "localhost"

    # UDP port for Jaeger trace span collector
    port = 5775

    # Max size for UDP packets
    max-packet-size = 65000

    # Flush interval for trace span reporter
    flush-interval = 1s

    # Max queue size of trace span reporter
    max-queue-size = 1000

  }
}
```

### Example 6: Further tracer configuration

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

### Example 7: Further tracer configuration

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

- https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/backends.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/enabling.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/zipkin.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/plugins.html
- https://doc.akka.io/libraries/akka-insights/2.21/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/jaeger.html](https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/jaeger.html)*