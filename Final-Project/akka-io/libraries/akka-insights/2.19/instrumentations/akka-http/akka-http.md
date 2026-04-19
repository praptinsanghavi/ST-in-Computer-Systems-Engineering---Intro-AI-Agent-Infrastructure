---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current//instrumentations/akka-http/akka-http.html
title: Akka HTTP • Akka Insights
---

# Akka HTTP • Akka Insights

> **Summary:** Telemetry for Lightbend Platform

## Content

# Akka HTTP

Akka Insights is capable of capturing data for the following [Akka HTTP](https://doc.akka.io/libraries/akka-http/current/introduction.html) related features.

## Cinnamon Akka HTTP module dependency

After adding the Cinnamon Agent as described in the [setup](../../setup/setup.html), make sure that you add the Cinnamon Akka HTTP module dependency to your build file:

sbt

```
// Use Akka HTTP instrumentation
libraryDependencies += Cinnamon.library.cinnamonAkkaHttp
```

Maven

```
<!-- Use Akka HTTP instrumentation -->
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-http_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-http_2.13', version: '2.19.4'
}
```

### Cinnamon Akka gRPC module dependency

Availability
Available since Cinnamon **2\.16\.0**

Since the Akka gRPC server is based on Akka HTTP, most Akka gRPC metrics are reported among the Akka HTTP metrics.

Starting with Akka gRPC 1\.1\.0 you can load the Cinnamon Akka gRPC module to enable Akka gRPC\-specific features (such as correctly capturing the gRPC service name as the HTTP path):

sbt

```
// Use Akka gRPC instrumentation
libraryDependencies += Cinnamon.library.cinnamonAkkaGrpc
```

Maven

```
<!-- Use Akka gRPC instrumentation -->
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-grpc_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-grpc_2.13', version: '2.19.4'
}
```

## Akka HTTP server metrics

The following metrics are recorded for instrumented Akka HTTP servers, type of metric in parentheses:

- **Connections** (rate) — the rate of connections per server.
- **Requests** (rate) — the rate of requests per server.
- **Responses** (rate) — the rate of responses per server.
- **Responses 2xx** (rate) — the rate of responses with 200\-299 status codes per server.
- **Responses 3xx** (rate) — the rate of responses with 300\-399 status codes per server.
- **Responses 4xx** (rate) — the rate of responses with 400\-499 status codes per server.
- **Responses 5xx** (rate) — the rate of responses with 500\-599 status codes per server.
- **Response time** (recorder) — the time for responses per server.
- **Response time 2xx** (recorder) — the time for responses with 200\-299 status codes per server.
- **Response time 3xx** (recorder) — the time for responses with 300\-399 status codes per server.
- **Response time 4xx** (recorder) — the time for responses with 400\-499 status codes per server.
- **Response time 5xx** (recorder) — the time for responses with 500\-599 status codes per server.

Note
Server metrics are created automatically when the Cinnamon Akka HTTP module dependency is added. It is possible to turn server metrics off via [configuration](akka-http-configuration.html).

## Akka HTTP server endpoint metrics

The following metrics are recorded for configured endpoints.

- **Endpoint responses** (rate) — the rate of responses per endpoint.
- **Endpoint responses 2xx** (rate) — the rate of endpoint responses with 200\-299 status codes (optional).
- **Endpoint responses 3xx** (rate) — the rate of endpoint responses with 300\-399 status codes (optional).
- **Endpoint responses 4xx** (rate) — the rate of endpoint responses with 400\-499 status codes (optional).
- **Endpoint responses 5xx** (rate) — the rate of endpoint responses with 500\-599 status codes (optional).
- **Endpoint response time** (recorder) — the time for responses per endpoint.
- **Endpoint response time 2xx** (recorder) — the time for endpoint responses with 200\-299 status codes (optional).
- **Endpoint response time 3xx** (recorder) — the time for endpoint responses with 300\-399 status codes (optional).
- **Endpoint response time 4xx** (recorder) — the time for endpoint responses with 400\-499 status codes (optional).
- **Endpoint response time 5xx** (recorder) — the time for endpoint responses with 500\-599 status codes (optional).

Note
By default, no metrics are created for endpoints. [Configuration](akka-http-configuration.html) is used to instruct Cinnamon what endpoints to create metrics for. Endpoint metrics per status code class can be [enabled optionally](akka-http-configuration.html#enable-endpoint-metrics-per-status-code-class).

## Akka HTTP client metrics

The following metrics are recorded for instrumented Akka HTTP clients, type of metric in parentheses:

### Client pool connection metrics

- **Connections** (counter) — the number of connections used in a pool.

### Client metrics

- **Requests** (rate) — the rate of requests from a client to a service.
- **Service response time** (recorder) — the time for responses from a service.

Note
The client metrics can disappear because of the connection pool inactivity. It happens because the Akka HTTP client connection pool is by default configured [to shut down](https://doc.akka.io/libraries/akka-http/current/client-side/host-level.html#pool-shutdown) after 30\-second idle time. When the connection pool shuts down, all the associated metrics get destroyed to avoid memory leaks. If after that the same host is requested, another connection pool will be created with a new set of **zeroed** metrics attached to it.

In order to avoid Akka HTTP client metrics reset, the connection pool idle timeout [`akka.http.host-connection-pool.idle-timeout`](https://doc.akka.io/libraries/akka-http/current/common/timeouts.html#idle-timeouts) can be increased or even disabled. It can be configured for all or [individual hosts and even by pattern](https://doc.akka.io/libraries/akka-http/current/client-side/configuration.html#per-host-overrides).

This approach should only be used for a known set of hosts that the application can request. If the application can send requests to a random host, such host connection pools should use a fixed idle timeout in order to avoid an always growing number of connection pools that will never be terminated.

## Akka HTTP request tracing

Request tracing is supported through the Cinnamon OpenTracing integration. See [Akka HTTP configuration for OpenTracing](../../extensions/opentracing/enabling.html#akka-http-configuration).

[SLF4J MDC propagation](../../extensions/mdc.html) is also supported for Akka HTTP. This can be used to attach correlation IDs to requests. See [MDC propagation through Akka HTTP headers](../../extensions/mdc.html#akka-http-headers).

## Detailed information

For specific information of how to configure Akka HTTP see:

## Code Examples

### Example 1: Cinnamon Akka HTTP module dependency

```sbt
// Use Akka HTTP instrumentation
libraryDependencies += Cinnamon.library.cinnamonAkkaHttp
```

### Example 2: Cinnamon Akka HTTP module dependency

```xml
<!-- Use Akka HTTP instrumentation -->
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-http_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 3: Cinnamon Akka HTTP module dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-http_2.13', version: '2.19.4'
}
```

### Example 4: Cinnamon Akka gRPC module dependency

```sbt
// Use Akka gRPC instrumentation
libraryDependencies += Cinnamon.library.cinnamonAkkaGrpc
```

### Example 5: Cinnamon Akka gRPC module dependency

```xml
<!-- Use Akka gRPC instrumentation -->
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-grpc_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 6: Cinnamon Akka gRPC module dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-grpc_2.13', version: '2.19.4'
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-http/current/client-side/configuration.html
- https://doc.akka.io/libraries/akka-http/current/client-side/host-level.html
- https://doc.akka.io/libraries/akka-http/current/common/timeouts.html
- https://doc.akka.io/libraries/akka-http/current/introduction.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/mdc.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/enabling.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-http/akka-http-configuration.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-projection/akka-projection.html
- https://doc.akka.io/libraries/akka-insights/2.19/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-http/akka-http.html](https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-http/akka-http.html)*