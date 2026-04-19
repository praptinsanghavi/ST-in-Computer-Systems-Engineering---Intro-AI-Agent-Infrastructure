---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/loglevels/logback.html
title: Logback • Akka Management
---

# Logback • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Logback

Dynamic Log Levels for Logback hooks into Akka Management and provides a route where log levels can be read and set over HTTP.

## Project Info

| Project Info: Dynamic Log Levels | |
| --- | --- |
| Artifact | com.lightbend.akka.management akka\-management\-loglevels\-logback 1\.6\.4 [Akka library snapshot repository](https://repo.akka.io/snapshots) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| License | [BUSL\-1\.1](https://github.com/akka/akka-management/blob/v1.6.4/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 0\.16\.0, 2019\-11\-29 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-management/1.6.4/akka/index.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-management/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-management/issues) |
| Sources | [https://github.com/akka/akka\-management](https://github.com/akka/akka-management) |

Requires [Akka Management](../akka-management.html) and that the application uses [Logback](https://logback.qos.ch) as logging backend.

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies ++= Seq(
  "com.lightbend.akka.management" %% "akka-management-loglevels-logback" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management" % AkkaManagementVersion
)
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management-loglevels-logback_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
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
    <artifactId>akka-management-loglevels-logback_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

Akka Management and `akka-management-loglevels-logback` can be used with Akka 2\.10\.11 or later. You have to override the following Akka dependencies by defining them explicitly in your build and define the Akka version to the one that you are using. Latest patch version of Akka is recommended and a later version than 2\.10\.11 can be used.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-slf4j_${versions.ScalaBinary}:${versions.AkkaVersion}"
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
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-slf4j_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

With Akka Management started and this module on the classpath the module is automatically picked up and provides the following two HTTP routes:

### Reading Logger Levels

A HTTP `GET` request to `loglevel/logback?logger=[logger name]` will return the log level of that logger.

### Changing Logger Levels

Only enabled if `akka.management.http.route-providers-read-only` is set to `false`. 

Warning
If enabling this make sure to properly secure your endpoint with HTTPS and authentication or else anyone with access to the system could change logger levels and potentially do a DoS attack by setting all loggers to `TRACE`.

A HTTP `PUT` request to `loglevel/logback?logger=[logger name]&level=[level name]` will change the level of that logger on the JVM the `ActorSystem` runs on.

For example using curl:

```
curl -X PUT "http://127.0.0.1:8558/loglevel/logback?logger=com.example.MyActor&level=DEBUG"

```

#### Classic and Internal Akka Logger Level

Internal Akka actors and classic Akka does logging through the built in API there is an [additional level of filtering](https://doc.akka.io/libraries/akka-core/current/logging.html#slf4j) using the `akka.loglevel` setting. If you have not set `akka.loglevel` to `DEBUG` (recommended) log entries from the classic logging API may never reach the logger backend at all.

The current level configured with `akka.loglevel` can be inspected with a GET request to `loglevel/akka`.

If management `read-only` is set to `false` PUT requests to `loglevel/akka?level=[level name]` will dynamically change that. Note that the allowed level for Akka Classic logging is a subset of the loglevels supported by SLF4j, valid values are `OFF`, `DEBUG`, `INFO`, `WARNING` and `ERROR`.

For example using curl:

```
curl -X PUT "http://127.0.0.1:8558/loglevel/akka?level=DEBUG"

```

## Code Examples

### Example 1: Project Info

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies ++= Seq(
  "com.lightbend.akka.management" %% "akka-management-loglevels-logback" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management" % AkkaManagementVersion
)
```

### Example 2: Project Info

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management-loglevels-logback_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.management:akka-management_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 3: Project Info

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management-loglevels-logback_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 4: Project Info

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion
)
```

### Example 5: Project Info

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-slf4j_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 6: Project Info

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
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-slf4j_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 7: Changing Logger Levels

```text
curl -X PUT "http://127.0.0.1:8558/loglevel/logback?logger=com.example.MyActor&level=DEBUG"
```

### Example 8: Classic and Internal Akka Logger Level

```text
curl -X PUT "http://127.0.0.1:8558/loglevel/akka?level=DEBUG"
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/current/logging.html
- https://doc.akka.io/libraries/akka-management/current/akka-management.html
- https://doc.akka.io/libraries/akka-management/current/loglevels/index.html
- https://doc.akka.io/libraries/akka-management/current/loglevels/log4j2.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/loglevels/logback.html](https://doc.akka.io/libraries/akka-management/current/loglevels/logback.html)*