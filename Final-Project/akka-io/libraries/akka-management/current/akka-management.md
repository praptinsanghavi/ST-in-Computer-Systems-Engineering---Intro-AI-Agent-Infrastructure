---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/akka-management.html
title: Akka Management • Akka Management
---

# Akka Management • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka Management

Akka Management is the core module of the management utilities which provides a central HTTP endpoint for Akka management extensions.

## Project Info

| Project Info: Akka Management | |
| --- | --- |
| Artifact | com.lightbend.akka.management akka\-management 1\.6\.4 [Akka library snapshot repository](https://repo.akka.io/snapshots) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| License | [BUSL\-1\.1](https://github.com/akka/akka-management/blob/v1.6.4/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2019\-03\-15 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-management/1.6.4/akka/index.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-management/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-management/issues) |
| Sources | [https://github.com/akka/akka\-management](https://github.com/akka/akka-management) |

## Dependencies

The main Akka Management dependency is called `akka-management`. By itself however it does not provide any capabilities, and you have to combine it with the management extension libraries that you want to make use of (e.g. cluster http management, or cluster bootstrap). This design choice enables users to include only the minimal set of features they actually want to use (and load) in their project.

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.management" %% "akka-management" % AkkaManagementVersion
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```
Maven
```
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

And in addition to that, include all of the dependencies for the features you’d like to use, like `akka-management-bootstrap` etc. Refer to each extensions documentation page to learn about how to configure and use it.

Akka Management can be used with Akka 2\.10\.11 or later. You have to override the following Akka dependencies by defining them explicitly in your build and define the Akka version to the one that you are using. Latest patch version of Akka is recommended and a later version than 2\.10\.11 can be used.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

## Basic Usage

Remember that Akka Management does not start automatically and the routes will only be exposed once you trigger:

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-api/src/main/scala/akka/cluster/bootstrap/DemoApp.scala#L15-L29 "Go to snippet source")import akka.management.scaladsl.AkkaManagement

AkkaManagement(system).start()
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-api-java/src/main/java/akka/cluster/bootstrap/demo/DemoApp.java#L15-L32 "Go to snippet source")import akka.management.javadsl.AkkaManagement;

AkkaManagement.get(system).start();
```

This allows users to prepare anything further before exposing routes for the bootstrap joining process and other purposes.

Remember to call `stop` method preferably in [Coordinated Shutdown](https://doc.akka.io/libraries/akka-core/current/coordinated-shutdown.html). See [the Lagom example](https://github.com/lagom/lagom/blob/50ecfbf2e0d51fe24fdf6ad71157e1dff97106b9/akka-management/core/src/main/scala/com/lightbend/lagom/internal/akka/management/AkkaManagementTrigger.scala#L73).

## Basic Configuration

You can configure hostname and port to use for the HTTP Cluster management by overriding the following:

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/scala/akka/management/AkkaManagementHttpEndpointSpec.scala#L76-L77 "Go to snippet source")akka.management.http.hostname = "127.0.0.1"
akka.management.http.port = 8558
```

Note that the default value for hostname is `InetAddress.getLocalHost.getHostAddress`, which may or may not evaluate to `127.0.0.1`.

When running Akka nodes behind NATs or inside docker containers in bridge mode, it is necessary to set different hostname and port number to bind for the HTTP Server for Http Cluster Management:

application.conf
 

```
  # Get hostname from environmental variable HOST
  akka.management.http.hostname = ${HOST}
  # Use port 8558 by default, but use environment variable PORT_8558 if it is defined
  akka.management.http.port = 8558
  akka.management.http.port = ${?PORT_8558}
  # Bind to 0.0.0.0:8558 'internally': 
  akka.management.http.bind-hostname = 0.0.0.0
  akka.management.http.bind-port = 8558

```

It is also possible to modify the base path of the API, by setting the appropriate value in application.conf:

application.conf
 

```
akka.management.http.base-path = "myClusterName"

```

In this example, with this configuration, then the Akka Management routes will will be exposed at under the `/myClusterName/...`, base path. For example, when using Akka Cluster Management routes the members information would then be available under `/myClusterName/shards/{name}` etc.

## Read only routes

By default extensions to Akka Management should only provide read only routes. This can be changed via setting `akka.management.http.route-providers-read-only` to `false`. Each extension can access the value of this property via `ManagementRouteProviderSettings.readOnly` to decide which routes to expose.

For example the `cluster-http` extension only provides read only access to Cluster membership but if `route-provider-read-only` is set to `false` additional endpoints for managing the cluster are exposed e.g. downing members.

## Configuring Security

Note
HTTPS is not enabled by default, as additional configuration from the developer is required. This module does not provide security by default. It is the developer’s choice to add security to this API, and when. If enabled, it is generally advisable not to expose management endpoints publicly.

The non\-secured usage of the module is as follows:

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-api/src/main/scala/akka/cluster/bootstrap/DemoApp.scala#L15-L29 "Go to snippet source")import akka.management.scaladsl.AkkaManagement

AkkaManagement(system).start()
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-api-java/src/main/java/akka/cluster/bootstrap/demo/DemoApp.java#L15-L32 "Go to snippet source")import akka.management.javadsl.AkkaManagement;

AkkaManagement.get(system).start();
```

### Enabling TLS/SSL (HTTPS) for Cluster HTTP Management

To enable SSL you need to provide an `SSLContext`. You can find more information about it in [Server HTTPS Support](https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html).

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/scala/akka/management/AkkaManagementHttpEndpointSpec.scala#L197-L201 "Go to snippet source")val management = AkkaManagement(system)

val httpsServer: HttpsConnectionContext = ConnectionContext.httpsServer(sslContext)

val started = management.start(_.withHttpsConnectionContext(httpsServer))
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/java/akka/management/CodeExamples.java#L26-L29 "Go to snippet source")AkkaManagement management = AkkaManagement.get(system);

HttpsConnectionContext https = ConnectionContext.httpsServer(sslContext);
management.start(settings -> settings.withHttpsConnectionContext(https));
```

You can also refer to [AkkaManagementHttpEndpointSpec](https://github.com/akka/akka-management/blob/119ad1871c3907c2ca528720361b8ccb20234c55/management/src/test/scala/akka/management/AkkaManagementHttpEndpointSpec.scala#L124-L148) where a full example configuring the HTTPS context is shown.

### Enabling Basic Authentication

To enable Basic Authentication you need to provide an authenticator object before starting the management extension. You can find more information in [Authenticate Basic Async directive](https://doc.akka.io/libraries/akka-http/10.7/routing-dsl/directives/security-directives/authenticateBasicAsync.html)

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/scala/akka/management/CompileOnly.scala#L19-L31 "Go to snippet source")def myUserPassAuthenticator(credentials: Credentials): Future[Option[String]] =
  credentials match {
    case p @ Credentials.Provided(id) =>
      Future {
        // potentially
        if (p.verify("p4ssw0rd")) Some(id)
        else None
      }
    case _ => Future.successful(None)
  }
// ...
val management = AkkaManagement(system)
management.start(_.withAuth(myUserPassAuthenticator))
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/java/akka/management/CodeExamples.java#L37-L46 "Go to snippet source")final Function<Optional<SecurityDirectives.ProvidedCredentials>, CompletionStage<Optional<String>>>
  myUserPassAuthenticator = opt -> {
  if (opt.filter(c -> (c != null) && c.verify("p4ssw0rd")).isPresent()) {
    return CompletableFuture.completedFuture(Optional.of(opt.get().identifier()));
  } else {
    return CompletableFuture.completedFuture(Optional.empty());
  }
};
// ...
management.start(settings -> settings.withAuth(myUserPassAuthenticator));
```

You can combine the two security options in order to enable HTTPS as well as basic authentication. In order to do this, invoke `start(transformSettings)` where `transformSettings` is a function to amend the `ManagementRouteProviderSettings`. Use `.withAuth` and `.withHttpsConnectionContext` if the `ManagementRouteProviderSettings` to enable authentication and HTTPS respectively.

## Stopping Akka Management

In a dynamic environment you might stop instances of Akka Management, for example if you want to free up resources taken by the HTTP server serving the Management routes.

You can do so by calling `stop()` on [`AkkaManagement`](/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement.html "akka.management.scaladsl.AkkaManagement"). This method return a `Future[Done]` to inform when the server has been stopped.

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/scala/akka/management/CompileOnly.scala#L36-L42 "Go to snippet source")val management = AkkaManagement(system)
management.start()
//...
val bindingFuture = management.stop()
bindingFuture.onComplete { _ =>
  println("It's stopped")
}
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/scala/akka/management/CompileOnly.scala#L36-L42 "Go to snippet source")val management = AkkaManagement(system)
management.start()
//...
val bindingFuture = management.stop()
bindingFuture.onComplete { _ =>
  println("It's stopped")
}
```

## Developing Extensions

This project provides a set of management extensions. To write third\-party extensions to Akka Management, here are few pointers about how it all works together.

The `akka-management` module provides the central HTTP endpoint to which extensions can register themselves.

An extension can contribute to the exposed HTTP routes by defining named route providers in the `akka.management.http.routes` configuration section in its own `reference.conf`. The core `AkkaManagement` extension collects all the routes and serves them together under the Management HTTP server. This enables easy extension of management capabilities (such as health\-checks or cluster information etc) without the boilerplate and overhead to start separate HTTP servers for each extension.

For example, the “Cluster HTTP Management” module exposes HTTP routes that can be used to monitor, and even trigger joining/leaving/downing decisions via HTTP calls to these routes. The routes and logic for these are implemented inside the `akka-management-cluster-http`.

Management route providers should be regular extensions that additionally extend the `akka.management.scaladsl.ManagementRouteProvider` or `akka.management.javadsl.ManagementRouteProvider` interface.

Libraries may register routes into the management routes by defining entries to this setting the library `reference.conf`:

```
akka.management.http.routes {
  name = "FQCN"
}

```

Where the `name` of the entry should be unique to allow different route providers to be registered by different libraries and applications.

The FQCN is the fully qualified class name of the `ManagementRouteProvider`.

Route providers included by a library (from reference.conf) can be excluded by an application by using `""` or `null` as the FQCN of the named entry, for example:

```
akka.management.http.routes {
  cluster-management = ""
}

```

As a best practice, Management extensions that do something proactively should not be started automatically, but rather manually by the user. One example of that is Cluster Bootstrap. It contributes routes to Akka Management, but the bootstrapping process does not start unless `ClusterBootstrap().start()` is invoked. Thus, the user can decide when exactly the application is ready to start joining an existing cluster. When cluster bootstrap is autostarted through configuration there is no control over this and the extension is started with the actor system.

## Code Examples

### Example 1: Dependencies

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.management" %% "akka-management" % AkkaManagementVersion
```

### Example 2: Dependencies

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 3: Dependencies

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 4: Dependencies

```scala
val AkkaVersion = "2.10.11"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```

### Example 5: Dependencies

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 6: Dependencies

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 7: Basic Usage

```scala
import akka.management.scaladsl.AkkaManagement

AkkaManagement(system).start()
```

### Example 8: Basic Usage

```java
import akka.management.javadsl.AkkaManagement;

AkkaManagement.get(system).start();
```

### Example 9: Basic Configuration

```scala
akka.management.http.hostname = "127.0.0.1"
akka.management.http.port = 8558
```

### Example 10: Basic Configuration

```hocon
# Get hostname from environmental variable HOST
  akka.management.http.hostname = ${HOST}
  # Use port 8558 by default, but use environment variable PORT_8558 if it is defined
  akka.management.http.port = 8558
  akka.management.http.port = ${?PORT_8558}
  # Bind to 0.0.0.0:8558 'internally': 
  akka.management.http.bind-hostname = 0.0.0.0
  akka.management.http.bind-port = 8558
```

### Example 11: Basic Configuration

```hocon
akka.management.http.base-path = "myClusterName"
```

### Example 12: Configuring Security

```scala
import akka.management.scaladsl.AkkaManagement

AkkaManagement(system).start()
```

### Example 13: Configuring Security

```java
import akka.management.javadsl.AkkaManagement;

AkkaManagement.get(system).start();
```

### Example 14: Enabling TLS/SSL (HTTPS) for Cluster HTTP Management

```scala
val management = AkkaManagement(system)

val httpsServer: HttpsConnectionContext = ConnectionContext.httpsServer(sslContext)

val started = management.start(_.withHttpsConnectionContext(httpsServer))
```

### Example 15: Enabling TLS/SSL (HTTPS) for Cluster HTTP Management

```java
AkkaManagement management = AkkaManagement.get(system);

HttpsConnectionContext https = ConnectionContext.httpsServer(sslContext);
management.start(settings -> settings.withHttpsConnectionContext(https));
```

### Example 16: Enabling Basic Authentication

```scala
def myUserPassAuthenticator(credentials: Credentials): Future[Option[String]] =
  credentials match {
    case p @ Credentials.Provided(id) =>
      Future {
        // potentially
        if (p.verify("p4ssw0rd")) Some(id)
        else None
      }
    case _ => Future.successful(None)
  }
// ...
val management = AkkaManagement(system)
management.start(_.withAuth(myUserPassAuthenticator))
```

### Example 17: Enabling Basic Authentication

```java
final Function<Optional<SecurityDirectives.ProvidedCredentials>, CompletionStage<Optional<String>>>
  myUserPassAuthenticator = opt -> {
  if (opt.filter(c -> (c != null) && c.verify("p4ssw0rd")).isPresent()) {
    return CompletableFuture.completedFuture(Optional.of(opt.get().identifier()));
  } else {
    return CompletableFuture.completedFuture(Optional.empty());
  }
};
// ...
management.start(settings -> settings.withAuth(myUserPassAuthenticator));
```

### Example 18: Stopping Akka Management

```scala
val management = AkkaManagement(system)
management.start()
//...
val bindingFuture = management.stop()
bindingFuture.onComplete { _ =>
  println("It's stopped")
}
```

### Example 19: Stopping Akka Management

```scala
val management = AkkaManagement(system)
management.start()
//...
val bindingFuture = management.stop()
bindingFuture.onComplete { _ =>
  println("It's stopped")
}
```

### Example 20: Developing Extensions

```text
akka.management.http.routes {
  name = "FQCN"
}
```

### Example 21: Developing Extensions

```text
akka.management.http.routes {
  cluster-management = ""
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/current/coordinated-shutdown.html
- https://doc.akka.io/libraries/akka-http/10.7/routing-dsl/directives/security-directives/authenticateBasicAsync.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html
- https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/deploying.html
- https://doc.akka.io/libraries/akka-management/current/migration.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/akka-management.html](https://doc.akka.io/libraries/akka-management/current/akka-management.html)*