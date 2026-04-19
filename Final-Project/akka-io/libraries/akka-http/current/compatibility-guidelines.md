---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/compatibility-guidelines.html
title: Compatibility Guidelines • Akka HTTP
---

# Compatibility Guidelines • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Compatibility Guidelines

## Binary Compatibility Rules

Akka HTTP follows the same binary compatibility rules as Akka itself. In short it means that the versioning scheme should be read as `major.minor.patch`, wherein all versions with the same `major` version are backwards binary\-compatible, with the exception of `@ApiMayChange`, `@InternalApi` or `@DoNotInherit` marked APIs or other specifically documented special\-cases.

For more information and a detailed discussion of these rules and guarantees please refer to [The @DoNotInherit and @ApiMayChange markers](https://doc.akka.io/libraries/akka-core/2.10/common/binary-compatibility-rules.html#the-donotinherit-and-apimaychange-markers).

### Components with no Binary Compatibility Guarantee

The following components and modules don’t have the previously mentioned binary compatibility guaranteed within minor or patch versions. However, binary compatibility will be attempted to be kept as much as possible.

#### akka\-http

Scala

```
akka.http.scaladsl.server.directives.FileUploadDirectives#storeUploadedFile
akka.http.scaladsl.server.directives.FileUploadDirectives#storeUploadedFiles
akka.http.scaladsl.server.directives.FileUploadDirectives#fileUploadAll
akka.http.scaladsl.marshalling.sse.EventStreamMarshalling
akka.http.scaladsl.server.HttpApp
akka.http.scaladsl.unmarshalling.sse.EventStreamParser
akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling
akka.http.scaladsl.OutgoingConnectionBuilder#managedPersistentHttp2
akka.http.scaladsl.OutgoingConnectionBuilder#managedPersistentHttp2WithPriorKnowledge
akka.http.scaladsl.settings.ServerSentEventSettings
akka.http.scaladsl.settings.CorsSettings
akka.http.scaladsl.common.SSLContextFactory#refreshingSSLEngineProvider
akka.http.scaladsl.common.SSLContextFactory#refreshingSSLContextProvider
akka.http.scaladsl.common.SSLContextFactory#createSSLContextFromPem

```

Java

```
akka.http.javadsl.common.PartialApplication#bindParameter
akka.http.javadsl.server.Directives#anyOf (all overloads)
akka.http.javadsl.server.Directives#allOf (all overloads)
akka.http.javadsl.server.directives.FileUploadDirectives#storeUploadedFile
akka.http.javadsl.server.directives.FileUploadDirectives#storeUploadedFiles
akka.http.javadsl.server.directives.FileUploadDirectives#fileUploadAll
akka.http.javadsl.server.HttpApp
akka.http.javadsl.model.RequestResponseAssociation
akka.http.javadsl.OutgoingConnectionBuilder#managedPersistentHttp2WithPriorKnowledge
akka.http.javadsl.OutgoingConnectionBuilder#managedPersistentHttp2
akka.http.javadsl.settings.ServerSentEventSettings
akka.http.javadsl.settings.CorsSettings
akka.http.javadsl.common.SSLContextFactory#refreshingSSLEngineProvider
akka.http.javadsl.common.SSLContextFactory#refreshingSSLContextProvider
akka.http.javadsl.common.SSLContextFactory#createSSLContextFromPem

```

#### akka\-http\-caching

Scala

```
akka.http.caching.LfuCache
akka.http.caching.scaladsl.Cache
akka.http.scaladsl.server.directives.CachingDirectives

```

Java

```
akka.http.caching.LfuCache
akka.http.caching.javadsl.Cache
akka.http.javadsl.server.directives.CachingDirectives

```

#### akka\-http\-core

Scala

```
akka.http.scaladsl.ClientTransport
akka.http.scaladsl.ConnectionContext#httpsClient
akka.http.scaladsl.ConnectionContext#httpsServer
akka.http.scaladsl.settings.PoolImplementation
akka.http.scaladsl.settings.ClientConnectionSettings#transport
akka.http.scaladsl.settings.ClientConnectionSettings#withTransport
akka.http.scaladsl.settings.ConnectionPoolSettings#appendHostOverride
akka.http.scaladsl.settings.ConnectionPoolSettings#poolImplementation
akka.http.scaladsl.settings.ConnectionPoolSettings#responseEntitySubscriptionTimeout
akka.http.scaladsl.settings.ConnectionPoolSettings#withHostOverrides
akka.http.scaladsl.settings.ConnectionPoolSettings#withOverrides
akka.http.scaladsl.settings.ConnectionPoolSettings#withPoolImplementation
akka.http.scaladsl.settings.ConnectionPoolSettings#withResponseEntitySubscriptionTimeout
akka.http.scaladsl.settings.HostOverride
akka.http.scaladsl.settings.Http2ServerSettings
akka.http.scaladsl.settings.Http2ClientSettings
akka.http.scaladsl.settings.PreviewServerSettings
akka.http.scaladsl.model.headers.CacheDirectives.immutableDirective
akka.http.scaladsl.model.headers.X-Forwarded-Host
akka.http.scaladsl.model.headers.X-Forwarded-Proto
akka.http.scaladsl.model.http2.PeerClosedStreamException
akka.http.scaladsl.model.http2.Http2Exception
akka.http.scaladsl.model.SimpleRequestResponseAttribute
akka.http.scaladsl.model.RequestResponseAssociation

```

Java

```
akka.http.javadsl.ClientTransport
akka.http.javadsl.ConnectionContext#httpsClient
akka.http.javadsl.ConnectionContext#httpsServer
akka.http.javadsl.settings.ClientConnectionSettings#getTransport
akka.http.javadsl.settings.ClientConnectionSettings#withTransport
akka.http.javadsl.settings.ConnectionPoolSettings#appendHostOverride
akka.http.javadsl.settings.ConnectionPoolSettings#getPoolImplementation
akka.http.javadsl.settings.ConnectionPoolSettings#getResponseEntitySubscriptionTimeout
akka.http.javadsl.settings.ConnectionPoolSettings#withHostOverrides
akka.http.javadsl.settings.ConnectionPoolSettings#withPoolImplementation
akka.http.javadsl.settings.ConnectionPoolSettings#withResponseEntitySubscriptionTimeout
akka.http.javadsl.settings.PoolImplementation
akka.http.javadsl.settings.PreviewServerSettings

```

#### akka\-http\-jwt

Scala

```
akka.http.jwt.scaladsl.JwtSettings

```

Java

```
akka.http.jwt.javadsl.JwtSettings

```

## Versioning and Compatibility

Starting from version 10\.1\.0, there will be two active release branches: \- The “current” release line (in `main`), where we will basically continue to evolve Akka HTTP in the same way as currently. New features will be introduced here incrementally. \- The “previous” release line (in a release\-10\.x branch), where the focus is on stability. We will continue to maintain the previous release by fixing serious bugs but it will not see new features. Previous releases will see less frequent releases over time.

It is planned to rotate versions in an annual fashion. Meaning a new minor version will be created every year. Whenever a new minor version is created, it will move the at that point current minor version release series over into maintenance mode, making it the “previous”. The former “previous” release has reached its end of life at this point. This way every release line is supported for two years.

The Akka HTTP Team currently does not intend to break binary compatibility, i.e. no binary incompatible 11\.x.y release is currently planned.

## Specific versions inter\-op discussion

In this section we discuss some of the specific cases of compatibility between versions of Akka HTTP and Akka itself.

For example, you may be interested in those examples if you encountered the following exception in your system when upgrading parts of your libraries: `Detected java.lang.NoSuchMethodError error, which MAY be caused by incompatible Akka versions on the classpath. Please note that a given Akka version MUST be the same across all modules of Akka that you are using, e.g. if you use akka-actor [2.5.3 (resolved from current classpath)] all other core Akka modules MUST be of the same version. External projects like Alpakka, Persistence plugins or Akka HTTP etc. have their own version numbers - please make sure you're using a compatible set of libraries.`

### Compatibility with Akka

Akka HTTP 10\.4\.x is (binary) compatible with Akka \>\= 2\.10\.11 and future Akka 2\.x versions that are released during the lifetime of Akka HTTP 10\.4\.x. To facilitate supporting multiple minor versions of Akka we do not depend on `akka-stream` explicitly but mark it as a `provided` dependency in our build. That means that you will *always* have to add a manual dependency to `akka-stream`.

The same goes for `akka-http-testkit`: If the testkit is used, explicitly declare the dependency on `akka-stream-testkit` of same Akka version as `akka-stream`.

sbt
```
val AkkaVersion = "2.10.11"
val AkkaHttpVersion = "10.7.4"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % AkkaHttpVersion % "Test",
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % "Test"
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http_${versions.ScalaBinary}"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
  Test "com.typesafe.akka:akka-http-testkit_${versions.ScalaBinary}"
  Test "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-testkit_${scala.binary.version}</artifactId>
    <scope>Test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>Test</scope>
  </dependency&gt
</dependencies>
```

## Code Examples

### Example 1: akka-http

```scala
akka.http.scaladsl.server.directives.FileUploadDirectives#storeUploadedFile
akka.http.scaladsl.server.directives.FileUploadDirectives#storeUploadedFiles
akka.http.scaladsl.server.directives.FileUploadDirectives#fileUploadAll
akka.http.scaladsl.marshalling.sse.EventStreamMarshalling
akka.http.scaladsl.server.HttpApp
akka.http.scaladsl.unmarshalling.sse.EventStreamParser
akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling
akka.http.scaladsl.OutgoingConnectionBuilder#managedPersistentHttp2
akka.http.scaladsl.OutgoingConnectionBuilder#managedPersistentHttp2WithPriorKnowledge
akka.http.scaladsl.settings.ServerSentEventSettings
akka.http.scaladsl.settings.CorsSettings
akka.http.scaladsl.common.SSLContextFactory#refreshingSSLEngineProvider
akka.http.scaladsl.common.SSLContextFactory#refreshingSSLContextProvider
akka.http.scaladsl.common.SSLContextFactory#createSSLContextFromPem
```

### Example 2: akka-http

```java
akka.http.javadsl.common.PartialApplication#bindParameter
akka.http.javadsl.server.Directives#anyOf (all overloads)
akka.http.javadsl.server.Directives#allOf (all overloads)
akka.http.javadsl.server.directives.FileUploadDirectives#storeUploadedFile
akka.http.javadsl.server.directives.FileUploadDirectives#storeUploadedFiles
akka.http.javadsl.server.directives.FileUploadDirectives#fileUploadAll
akka.http.javadsl.server.HttpApp
akka.http.javadsl.model.RequestResponseAssociation
akka.http.javadsl.OutgoingConnectionBuilder#managedPersistentHttp2WithPriorKnowledge
akka.http.javadsl.OutgoingConnectionBuilder#managedPersistentHttp2
akka.http.javadsl.settings.ServerSentEventSettings
akka.http.javadsl.settings.CorsSettings
akka.http.javadsl.common.SSLContextFactory#refreshingSSLEngineProvider
akka.http.javadsl.common.SSLContextFactory#refreshingSSLContextProvider
akka.http.javadsl.common.SSLContextFactory#createSSLContextFromPem
```

### Example 3: akka-http-caching

```scala
akka.http.caching.LfuCache
akka.http.caching.scaladsl.Cache
akka.http.scaladsl.server.directives.CachingDirectives
```

### Example 4: akka-http-caching

```java
akka.http.caching.LfuCache
akka.http.caching.javadsl.Cache
akka.http.javadsl.server.directives.CachingDirectives
```

### Example 5: akka-http-core

```scala
akka.http.scaladsl.ClientTransport
akka.http.scaladsl.ConnectionContext#httpsClient
akka.http.scaladsl.ConnectionContext#httpsServer
akka.http.scaladsl.settings.PoolImplementation
akka.http.scaladsl.settings.ClientConnectionSettings#transport
akka.http.scaladsl.settings.ClientConnectionSettings#withTransport
akka.http.scaladsl.settings.ConnectionPoolSettings#appendHostOverride
akka.http.scaladsl.settings.ConnectionPoolSettings#poolImplementation
akka.http.scaladsl.settings.ConnectionPoolSettings#responseEntitySubscriptionTimeout
akka.http.scaladsl.settings.ConnectionPoolSettings#withHostOverrides
akka.http.scaladsl.settings.ConnectionPoolSettings#withOverrides
akka.http.scaladsl.settings.ConnectionPoolSettings#withPoolImplementation
akka.http.scaladsl.settings.ConnectionPoolSettings#withResponseEntitySubscriptionTimeout
akka.http.scaladsl.settings.HostOverride
akka.http.scaladsl.settings.Http2ServerSettings
akka.http.scaladsl.settings.Http2ClientSettings
akka.http.scaladsl.settings.PreviewServerSettings
akka.http.scaladsl.model.headers.CacheDirectives.immutableDirective
akka.http.scaladsl.model.headers.X-Forwarded-Host
akka.http.scaladsl.model.headers.X-Forwarded-Proto
akka.http.scaladsl.model.http2.PeerClosedStreamException
akka.http.scaladsl.model.http2.Http2Exception
akka.http.scaladsl.model.SimpleRequestResponseAttribute
akka.http.scaladsl.model.RequestResponseAssociation
```

### Example 6: akka-http-core

```java
akka.http.javadsl.ClientTransport
akka.http.javadsl.ConnectionContext#httpsClient
akka.http.javadsl.ConnectionContext#httpsServer
akka.http.javadsl.settings.ClientConnectionSettings#getTransport
akka.http.javadsl.settings.ClientConnectionSettings#withTransport
akka.http.javadsl.settings.ConnectionPoolSettings#appendHostOverride
akka.http.javadsl.settings.ConnectionPoolSettings#getPoolImplementation
akka.http.javadsl.settings.ConnectionPoolSettings#getResponseEntitySubscriptionTimeout
akka.http.javadsl.settings.ConnectionPoolSettings#withHostOverrides
akka.http.javadsl.settings.ConnectionPoolSettings#withPoolImplementation
akka.http.javadsl.settings.ConnectionPoolSettings#withResponseEntitySubscriptionTimeout
akka.http.javadsl.settings.PoolImplementation
akka.http.javadsl.settings.PreviewServerSettings
```

### Example 7: akka-http-jwt

```scala
akka.http.jwt.scaladsl.JwtSettings
```

### Example 8: akka-http-jwt

```java
akka.http.jwt.javadsl.JwtSettings
```

### Example 9: Compatibility with Akka

```scala
val AkkaVersion = "2.10.11"
val AkkaHttpVersion = "10.7.4"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % AkkaHttpVersion % "Test",
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % "Test"
)
```

### Example 10: Compatibility with Akka

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http_${versions.ScalaBinary}"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
  Test "com.typesafe.akka:akka-http-testkit_${versions.ScalaBinary}"
  Test "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 11: Compatibility with Akka

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-testkit_${scala.binary.version}</artifactId>
    <scope>Test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>Test</scope>
  </dependency&gt
</dependencies>
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/common/binary-compatibility-rules.html
- https://doc.akka.io/libraries/akka-http/current/common/index.html
- https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-from-old-http-javadsl.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/compatibility-guidelines.html](https://doc.akka.io/libraries/akka-http/current/compatibility-guidelines.html)*