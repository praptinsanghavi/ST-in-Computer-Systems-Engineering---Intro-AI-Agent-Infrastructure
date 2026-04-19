---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/sse.html
title: Server-sent Events (SSE) • Alpakka Documentation
---

# Server-sent Events (SSE) • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Server\-sent Events (SSE)

The SSE connector provides a continuous source of server\-sent events recovering from connection failure.

| Project Info: Alpakka Server\-sent events (SSE) | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-stream\-alpakka\-sse 10\.0\.2 [Snapshots are available](other-docs/snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.sse |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka/v10.0.2/LICENSE) |
| Readiness level | [Community\-driven](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#community-driven) Since 0\.6, 2017\-02\-13 |
| Home page | <https://doc.akka.io/libraries/alpakka/current> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/sse/index.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [GitHub releases](https://github.com/akka/alpakka/releases) |
| Issues | [Github issues](https://github.com/akka/alpakka/labels/p%3Asse) |
| Sources | <https://github.com/akka/alpakka> |

## Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
val AkkaHttpVersion = "10.7.3"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-sse" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
)
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <akka.http.version>10.7.3</akka.http.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-sse_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  AkkaHttpVersion: "10.7.3",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-sse_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-http_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
}
```

The table below shows direct dependencies of this module and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.typesafe.akka | akka\-http\_2\.13 | [10\.7\.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http_2.13/10.7.3) |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.typesafe.akka    akka-http_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http_2.13/10.7.3)    BUSL-1.1
    com.typesafe.akka    akka-http-core_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-core_2.13/10.7.3)    BUSL-1.1
        com.typesafe.akka    akka-parsing_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-parsing_2.13/10.7.3)    BUSL-1.1
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-pki_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.10.11)    BUSL-1.1
        com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Usage

Define an `EventSource` by giving a URI, a function for sending HTTP requests, and an optional initial value for Last\-Event\-ID header: 

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/sse/src/test/scala/docs/scaladsl/EventSourceSpec.scala#L27-L160 "Go to snippet source")import akka.http.scaladsl.Http
import akka.http.scaladsl.model.sse.ServerSentEvent
import akka.http.scaladsl.model.{HttpEntity, HttpRequest, HttpResponse, Uri}
import akka.stream.alpakka.sse.scaladsl.EventSource
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AsyncWordSpec

val send: HttpRequest => Future[HttpResponse] = Http().singleRequest(_)

val eventSource: Source[ServerSentEvent, NotUsed] =
  EventSource(
    uri = Uri(s"http://$host:$port"),
    send,
    initialLastEventId = Some("2"),
    retryDelay = 1.second
  )
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/sse/src/test/java/docs/javadsl/EventSourceTest.java#L18-L47 "Go to snippet source")import java.util.function.Function;
import java.util.concurrent.CompletionStage;

import akka.http.javadsl.Http;
import akka.http.javadsl.model.*;
import akka.http.javadsl.model.sse.ServerSentEvent;
import akka.stream.alpakka.sse.javadsl.EventSource;

final Http http = Http.get(system);
Function<HttpRequest, CompletionStage<HttpResponse>> send =
    (request) -> http.singleRequest(request);

final Uri targetUri = Uri.create(String.format("http://%s:%d", host, port));
final Optional<String> lastEventId = Optional.of("2");
Source<ServerSentEvent, NotUsed> eventSource =
    EventSource.create(targetUri, send, lastEventId, system);
```

Then happily consume `ServerSentEvent`s:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/sse/src/test/scala/docs/scaladsl/EventSourceSpec.scala#L164-L168 "Go to snippet source")val events: Future[immutable.Seq[ServerSentEvent]] =
  eventSource
    .throttle(elements = 1, per = 500.milliseconds, maximumBurst = 1, ThrottleMode.Shaping)
    .take(nrOfSamples)
    .runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/sse/src/test/java/docs/javadsl/EventSourceTest.java#L51-L58 "Go to snippet source")int elements = 1;
Duration per = Duration.ofMillis(500);
int maximumBurst = 1;

eventSource
    .throttle(elements, per, maximumBurst, ThrottleMode.shaping())
    .take(nrOfSamples)
    .runWith(Sink.seq(), system);
```

## Code Examples

### Example 1: Artifacts

```scala
val AkkaVersion = "2.10.11"
val AkkaHttpVersion = "10.7.3"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-sse" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
)
```

### Example 2: Artifacts

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <akka.http.version>10.7.3</akka.http.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-sse_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http_${scala.binary.version}</artifactId>
    <version>${akka.http.version}</version>
  </dependency&gt
</dependencies>
```

### Example 3: Artifacts

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  AkkaHttpVersion: "10.7.3",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-sse_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-http_${versions.ScalaBinary}:${versions.AkkaHttpVersion}"
}
```

### Example 4: Usage

```scala
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.sse.ServerSentEvent
import akka.http.scaladsl.model.{HttpEntity, HttpRequest, HttpResponse, Uri}
import akka.stream.alpakka.sse.scaladsl.EventSource
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AsyncWordSpec

val send: HttpRequest => Future[HttpResponse] = Http().singleRequest(_)

val eventSource: Source[ServerSentEvent, NotUsed] =
  EventSource(
    uri = Uri(s"http://$host:$port"),
    send,
    initialLastEventId = Some("2"),
    retryDelay = 1.second
  )
```

### Example 5: Usage

```java
import java.util.function.Function;
import java.util.concurrent.CompletionStage;

import akka.http.javadsl.Http;
import akka.http.javadsl.model.*;
import akka.http.javadsl.model.sse.ServerSentEvent;
import akka.stream.alpakka.sse.javadsl.EventSource;

final Http http = Http.get(system);
Function<HttpRequest, CompletionStage<HttpResponse>> send =
    (request) -> http.singleRequest(request);

final Uri targetUri = Uri.create(String.format("http://%s:%d", host, port));
final Optional<String> lastEventId = Optional.of("2");
Source<ServerSentEvent, NotUsed> eventSource =
    EventSource.create(targetUri, send, lastEventId, system);
```

### Example 6: Usage

```scala
val events: Future[immutable.Seq[ServerSentEvent]] =
  eventSource
    .throttle(elements = 1, per = 500.milliseconds, maximumBurst = 1, ThrottleMode.Shaping)
    .take(nrOfSamples)
    .runWith(Sink.seq)
```

### Example 7: Usage

```java
int elements = 1;
Duration per = Duration.ofMillis(500);
int maximumBurst = 1;

eventSource
    .throttle(elements, per, maximumBurst, ThrottleMode.shaping())
    .take(nrOfSamples)
    .runWith(Sink.seq(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/sse/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/alpakka/current
- https://doc.akka.io/libraries/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/libraries/alpakka/current/pravega.html
- https://doc.akka.io/libraries/alpakka/current/slick.html

---
*Source: [https://doc.akka.io/libraries/alpakka/current/sse.html](https://doc.akka.io/libraries/alpakka/current/sse.html)*