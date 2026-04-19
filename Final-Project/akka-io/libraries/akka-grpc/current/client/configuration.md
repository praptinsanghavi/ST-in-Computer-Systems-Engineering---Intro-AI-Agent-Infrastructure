---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html
title: Configuration • Akka gRPC
---

# Configuration • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Configuration

A gRPC client is configured with a [`GrpcClientSettings`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html "akka.grpc.GrpcClientSettings")[`GrpcClientSettings`](/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html "akka.grpc.GrpcClientSettings") instance. There are a number of ways of creating one and the API docs are the best reference. An `ActorSystem` is always required as it is used for default configuration and service discovery.

## By Code

The simplest way to create a client is to provide a static host and port.

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/scala/docs/akka/grpc/client/GrpcClientSettingsCompileOnly.scala#L16 "Go to snippet source")GrpcClientSettings.connectToServiceAt("localhost", 443)
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/java/jdocs/akka/grpc/client/GrpcClientSettingsCompileOnly.java#L20 "Go to snippet source")GrpcClientSettings.connectToServiceAt("localhost", 443, actorSystem);
```

Further settings can be added via the `with` methods

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/scala/docs/akka/grpc/client/GrpcClientSettingsCompileOnly.scala#L20 "Go to snippet source")GrpcClientSettings.connectToServiceAt("localhost", 443).withDeadline(1.second).withTls(false)
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/java/jdocs/akka/grpc/client/GrpcClientSettingsCompileOnly.java#L24-L26 "Go to snippet source")GrpcClientSettings.connectToServiceAt("localhost", 443, actorSystem)
        .withDeadline(Duration.ofSeconds(1))
        .withTls(false);
```

## By Configuration

Instead, a client can be defined in configuration. All client configurations need to be under `akka.grpc.client`

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/scala/akka/grpc/GrpcClientSettingsSpec.scala#L75-L86 "Go to snippet source")akka.grpc.client {
  "project.WithSpecificConfiguration" {
    service-discovery {
      service-name = "my-service"
    }
    host = "my-host"
    port = 42
    override-authority = "google.fr"
    deadline = 10m
    user-agent = "Akka-gRPC"
  }
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/scala/akka/grpc/GrpcClientSettingsSpec.scala#L75-L86 "Go to snippet source")akka.grpc.client {
  "project.WithSpecificConfiguration" {
    service-discovery {
      service-name = "my-service"
    }
    host = "my-host"
    port = 42
    override-authority = "google.fr"
    deadline = 10m
    user-agent = "Akka-gRPC"
  }
}
```

Create the config under `project.WithSpecificConfiguration` (which can be used to instantiate a client) like this:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/scala/akka/grpc/GrpcClientSettingsSpec.scala#L117 "Go to snippet source")val settings = GrpcClientSettings.fromConfig(clientName = "project.WithSpecificConfiguration")
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/java/jdocs/akka/grpc/client/GrpcClientSettingsCompileOnly.java#L46-L49 "Go to snippet source")// an ActorSystem is required for service discovery
GrpcClientSettings.fromConfig(
        "project.WithSpecificConfiguration", actorSystem
);
```

Clients defined in configuration pick up defaults from `reference.conf`:

`reference.conf`

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/main/resources/reference.conf#L2-L66 "Go to snippet source")akka.grpc.client."*" {
  # netty or akka-http (experimental)
  backend = "netty"

  # Host to use if service-discovery-mechanism is set to static or grpc-dns
  host = ""

  # Service discovery mechanism to use. The default is to use a static host
  # and port that will be resolved via DNS.
  # Any of the mechanisms described in https://doc.akka.io/libraries/akka-management/current/discovery/index.html can be used
  # including Kubernetes, Consul, AWS API
  service-discovery {
    mechanism = "static"
    # Service name to use if a service-discovery.mechanism other than static or grpc-dns
    service-name = ""
    # See https://doc.akka.io/libraries/akka-management/current/discovery/index.html for meanings for each mechanism
    # if blank then not passed to the lookup
    port-name = ""
    protocol = ""

    # timeout for service discovery resolving
    resolve-timeout = 1s

    # Set this to a duration to trigger periodic refresh of the resolved endpoints, evicting cached entries
    # if the discovery mechanism supports that. Expected use is for client side load-balancing, to detect new services
    # to load balance across. The default value "off" disables periodic refresh and instead only does refresh when
    # the client implementation decides to.
    #
    # Currently only supported by the Netty client backend.
    refresh-interval = off
  }

  # port to use if service-discovery-mechism is static or service discovery does not return a port
  port = 0

  # Experimental in grpc-java https://github.com/grpc/grpc-java/issues/1771
  # Only supported for netty client backend, when using akka-http this setting is ignored.
  # Valid values are "pick_first" or "round_robin"
  load-balancing-policy = ""

  deadline = infinite
  override-authority = ""
  user-agent = ""
  # Location on the classpath of CA PEM to trust
  trusted = ""
  use-tls = true
  # SSL provider to use:
  # leave empty to auto-detect, or configure 'jdk' or 'openssl'.
  ssl-provider = ""

  # TODO: Enforce HTTP/2 TLS restrictions: https://tools.ietf.org/html/draft-ietf-httpbis-http2-17#section-9.2

  # The number of times to try connecting before giving up.
  # '-1': means retry indefinitely, '0' is invalid, '1' means fail
  # after the first failed attempt.
  # When load balancing we don't count individual connection
  # failures, so in that case any value larger than '1' is also
  # interpreted as retrying 'indefinitely'.
  connection-attempts = 20

  # Request that the client tries connecting to the service immediately when the client is created
  # rather than on the first request. Only supported for the Netty client backend, the Akka HTTP client backend
  # is always eager.
  eager-connection = off
}
```

## Using Akka Discovery for Endpoint Discovery

The examples above all use a hard coded host and port for the location of the gRPC service which is the default if you do not configure a `service-discovery-mechanism`. Alternatively [Akka Discovery](https://doc.akka.io/libraries/akka-core/2.10/discovery/index.html) can be used. This allows a gRPC client to switch between discovering services via DNS, config, Kubernetes and Consul and others by just changing the configuration (see [Discovery methods in Akka Management](https://doc.akka.io/libraries/akka-management/current/discovery/index.html)).

To see how to config a particular service discovery mechanism see the [Akka Discovery docs](https://doc.akka.io/libraries/akka-core/2.10/discovery/index.html). Once it is configured a service discovery mechanism name can either be passed into settings or put in the client’s configuration.

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/scala/akka/grpc/GrpcClientSettingsSpec.scala#L26-L37 "Go to snippet source")akka.grpc.client {
  "project.WithConfigServiceDiscovery" {
    service-discovery {
      mechanism = "config"
      service-name = "from-config"
      # optional for discovery
      protocol = "tcp"
      port-name = "http"
    }
    port = 43
  }
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/scala/akka/grpc/GrpcClientSettingsSpec.scala#L26-L37 "Go to snippet source")akka.grpc.client {
  "project.WithConfigServiceDiscovery" {
    service-discovery {
      mechanism = "config"
      service-name = "from-config"
      # optional for discovery
      protocol = "tcp"
      port-name = "http"
    }
    port = 43
  }
}
```

The above example configures the client `project.WithConfigServiceDiscovery` to use `config` based service discovery.

Then to create the `GrpcClientSettings`:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/scala/akka/grpc/GrpcClientSettingsSpec.scala#L141-L142 "Go to snippet source")// an implicit ActorSystem is required to be in scope for service discovery
val settings = GrpcClientSettings.fromConfig(clientName = "project.WithConfigServiceDiscovery")
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/java/jdocs/akka/grpc/client/GrpcClientSettingsCompileOnly.java#L39-L42 "Go to snippet source")// an ActorSystem is required for service discovery
GrpcClientSettings.fromConfig(
        "project.WithConfigServiceDiscovery", actorSystem
);
```

Alternatively if a default instance is available (configured by `akka.discovery.method`) in your system it can be use like this:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/scala/docs/akka/grpc/client/GrpcClientSettingsCompileOnly.scala#L26-L29 "Go to snippet source")// An ActorSystem's default service discovery mechanism
GrpcClientSettings
  .usingServiceDiscovery(serviceName = "my-service")
  .withServicePortName("https") // (optional) refine the lookup operation to only https ports
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/runtime/src/test/java/jdocs/akka/grpc/client/GrpcClientSettingsCompileOnly.java#L32-L35 "Go to snippet source")// An ActorSystem's default service discovery mechanism
GrpcClientSettings
        .usingServiceDiscovery("my-service", actorSystem)
        .withServicePortName("https"); // (optional) refine the lookup operation to only https ports
```

Currently service discovery is only queried on creation of the client. A client can be automatically re\-created, and go via service discovery again, if a connection can’t be established, see the lifecycle section.

## Debug logging

To enable fine\-grained debug running the following logging configuration can be used.

Put this in a file `grpc-debug-logging.properties`:

```
handlers=java.util.logging.ConsoleHandler
io.grpc.netty.level=FINE
java.util.logging.ConsoleHandler.level=FINE
java.util.logging.ConsoleHandler.formatter=java.util.logging.SimpleFormatter

```

Run with `-Djava.util.logging.config.file=/path/to/grpc-debug-logging.properties`.

## Code Examples

### Example 1: By Code

```scala
GrpcClientSettings.connectToServiceAt("localhost", 443)
```

### Example 2: By Code

```java
GrpcClientSettings.connectToServiceAt("localhost", 443, actorSystem);
```

### Example 3: By Code

```scala
GrpcClientSettings.connectToServiceAt("localhost", 443).withDeadline(1.second).withTls(false)
```

### Example 4: By Code

```java
GrpcClientSettings.connectToServiceAt("localhost", 443, actorSystem)
        .withDeadline(Duration.ofSeconds(1))
        .withTls(false);
```

### Example 5: By Configuration

```scala
akka.grpc.client {
  "project.WithSpecificConfiguration" {
    service-discovery {
      service-name = "my-service"
    }
    host = "my-host"
    port = 42
    override-authority = "google.fr"
    deadline = 10m
    user-agent = "Akka-gRPC"
  }
}
```

### Example 6: By Configuration

```scala
akka.grpc.client {
  "project.WithSpecificConfiguration" {
    service-discovery {
      service-name = "my-service"
    }
    host = "my-host"
    port = 42
    override-authority = "google.fr"
    deadline = 10m
    user-agent = "Akka-gRPC"
  }
}
```

### Example 7: By Configuration

```scala
val settings = GrpcClientSettings.fromConfig(clientName = "project.WithSpecificConfiguration")
```

### Example 8: By Configuration

```java
// an ActorSystem is required for service discovery
GrpcClientSettings.fromConfig(
        "project.WithSpecificConfiguration", actorSystem
);
```

### Example 9: By Configuration

```conf
akka.grpc.client."*" {
  # netty or akka-http (experimental)
  backend = "netty"

  # Host to use if service-discovery-mechanism is set to static or grpc-dns
  host = ""

  # Service discovery mechanism to use. The default is to use a static host
  # and port that will be resolved via DNS.
  # Any of the mechanisms described in https://doc.akka.io/libraries/akka-management/current/discovery/index.html can be used
  # including Kubernetes, Consul, AWS API
  service-discovery {
    mechanism = "static"
    # Service name to use if a service-discovery.mechanism other than static or grpc-dns
    service-name = ""
    # See https://doc.akka.io/libraries/akka-management/current/discovery/index.html for meanings for each mechanism
    # if blank then not passed to the lookup
    port-name = ""
    protocol = ""

    # timeout for service discovery resolving
    resolve-timeout = 1s

    # Set this to a duration to trigger periodic refresh of the resolved endpoints, evicting cached entries
    # if the discovery mechanism supports that. Expected use is for client side load-balancing, to detect new services
    # to load balance across. The default value "off" disables periodic refresh and instead only does refresh when
    # the client implementation decides to.
    #
    # Currently only supported by the Netty client backend.
    refresh-interval = off
  }

  # port to use if service-discovery-mechism is static or service discovery does not return a port
  port = 0

  # Experimental in grpc-java https://github.com/grpc/grpc-java/issues/1771
  # Only supported for netty client backend, when using akka-http this setting is ignored.
  # Valid values are "pick_first" or "round_robin"
  load-balancing-policy = ""

  deadline = infinite
  override-authority = ""
  user-agent = ""
  # Location on the classpath of CA PEM to trust
  trusted = ""
  use-tls = true
  # SSL provider to use:
  # leave empty to auto-detect, or configure 'jdk' or 'openssl'.
  ssl-provider = ""

  # TODO: Enforce HTTP/2 TLS restrictions: https://tools.ietf.org/html/draft-ietf-httpbis-http2-17#section-9.2

  # The number of times to try connecting before giving up.
  # '-1': means retry indefinitely, '0' is invalid, '1' means fail
  # after the first failed attempt.
  # When load balancing we don't count individual connection
  # failures, so in that case any value larger than '1' is also
  # interpreted as retrying 'indefinitely'.
  connection-attempts = 20

  # Request that the client tries connecting to the service immediately when the client is created
  # rather than on the first request. Only supported for the Netty client backend, the Akka HTTP client backend
  # is always eager.
  eager-connection = off
}
```

### Example 10: Using Akka Discovery for Endpoint Discovery

```scala
akka.grpc.client {
  "project.WithConfigServiceDiscovery" {
    service-discovery {
      mechanism = "config"
      service-name = "from-config"
      # optional for discovery
      protocol = "tcp"
      port-name = "http"
    }
    port = 43
  }
}
```

### Example 11: Using Akka Discovery for Endpoint Discovery

```scala
akka.grpc.client {
  "project.WithConfigServiceDiscovery" {
    service-discovery {
      mechanism = "config"
      service-name = "from-config"
      # optional for discovery
      protocol = "tcp"
      port-name = "http"
    }
    port = 43
  }
}
```

### Example 12: Using Akka Discovery for Endpoint Discovery

```scala
// an implicit ActorSystem is required to be in scope for service discovery
val settings = GrpcClientSettings.fromConfig(clientName = "project.WithConfigServiceDiscovery")
```

### Example 13: Using Akka Discovery for Endpoint Discovery

```java
// an ActorSystem is required for service discovery
GrpcClientSettings.fromConfig(
        "project.WithConfigServiceDiscovery", actorSystem
);
```

### Example 14: Using Akka Discovery for Endpoint Discovery

```scala
// An ActorSystem's default service discovery mechanism
GrpcClientSettings
  .usingServiceDiscovery(serviceName = "my-service")
  .withServicePortName("https") // (optional) refine the lookup operation to only https ports
```

### Example 15: Using Akka Discovery for Endpoint Discovery

```java
// An ActorSystem's default service discovery mechanism
GrpcClientSettings
        .usingServiceDiscovery("my-service", actorSystem)
        .withServicePortName("https"); // (optional) refine the lookup operation to only https ports
```

### Example 16: Debug logging

```text
handlers=java.util.logging.ConsoleHandler
io.grpc.netty.level=FINE
java.util.logging.ConsoleHandler.level=FINE
java.util.logging.ConsoleHandler.formatter=java.util.logging.SimpleFormatter
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-grpc/2.5.10/akka/grpc/GrpcClientSettings.html
- https://doc.akka.io/libraries/akka-core/2.10/discovery/index.html
- https://doc.akka.io/libraries/akka-grpc/current/client/details.html
- https://doc.akka.io/libraries/akka-grpc/current/client/walkthrough.html
- https://doc.akka.io/libraries/akka-management/current/discovery/index.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html](https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html)*