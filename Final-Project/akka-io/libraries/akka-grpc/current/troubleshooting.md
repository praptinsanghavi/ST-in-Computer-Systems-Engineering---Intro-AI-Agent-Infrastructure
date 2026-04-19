---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/troubleshooting.html
title: Troubleshooting • Akka gRPC
---

# Troubleshooting • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Troubleshooting

## Client

```
java.lang.IllegalArgumentException: Could not find Jetty NPN/ALPN or Conscrypt as installed JDK providers

```

Perhaps surprisingly, this error may be thrown when connecting to an insecure gRPC server with a client that is configured with TLS enabled.

## Server

```
java.util.concurrent.ExecutionException: io.grpc.StatusRuntimeException: UNAVAILABLE: Failed ALPN negotiation: Unable to find compatible protocol

```

This may happen when `akka.http.server.enable-http2` is not enabled in the configuration.

## Code Examples

### Example 1: Client

```text
java.lang.IllegalArgumentException: Could not find Jetty NPN/ALPN or Conscrypt as installed JDK providers
```

### Example 2: Server

```text
java.util.concurrent.ExecutionException: io.grpc.StatusRuntimeException: UNAVAILABLE: Failed ALPN negotiation: Unable to find compatible protocol
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/current/mtls.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/troubleshooting.html](https://doc.akka.io/libraries/akka-grpc/current/troubleshooting.html)*