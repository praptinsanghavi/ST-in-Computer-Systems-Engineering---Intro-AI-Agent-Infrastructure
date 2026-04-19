---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/index.html
title: CachingDirectives • Akka HTTP
---

# CachingDirectives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# CachingDirectives

Use these directives to “wrap” expensive operations with a caching layer that runs the wrapped operation only once and returns the the cached value for all future accesses for the same key (as long as the respective entry has not expired). See [caching](../../../common/caching.html) for an introduction to how the caching support works.

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka HTTP Caching, add the module to your project:

sbt
```
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-caching" % AkkaHttpVersion
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-caching_${versions.ScalaBinary}"
}
```
Maven
```
<properties>
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
    <artifactId>akka-http-caching_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

## Imports

Directives are available by importing:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CachingDirectivesExamplesSpec.scala#L12 "Go to snippet source")import akka.http.scaladsl.server.directives.CachingDirectives._
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CachingDirectivesExamplesTest.java#L18 "Go to snippet source")import static akka.http.javadsl.server.directives.CachingDirectives.*;
```

## Code Examples

### Example 1: Dependency

```scala
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-caching" % AkkaHttpVersion
```

### Example 2: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-caching_${versions.ScalaBinary}"
}
```

### Example 3: Dependency

```xml
<properties>
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
    <artifactId>akka-http-caching_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 4: Imports

```scala
import akka.http.scaladsl.server.directives.CachingDirectives._
```

### Example 5: Imports

```java
import static akka.http.javadsl.server.directives.CachingDirectives.*;
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/common/caching.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cache-condition-directives/conditional.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cache.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/index.html)*