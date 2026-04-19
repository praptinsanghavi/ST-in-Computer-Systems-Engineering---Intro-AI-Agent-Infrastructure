---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:18Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/data-transformations/simple-codecs.html
title: RecordIO Framing • Alpakka Documentation
---

# RecordIO Framing • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# RecordIO Framing

The codec parses a ByteString stream in the [RecordIO format](https://mesos.apache.org/documentation/latest/recordio/) used by Apache Mesos into distinct frames.

For instance, the response body:

```
128\n
{"type": "SUBSCRIBED","subscribed": {"framework_id": {"value":"12220-3440-12532-2345"},"heartbeat_interval_seconds":15.0}20\n
{"type":"HEARTBEAT"}

```

is parsed into frames:

```
{"type": "SUBSCRIBED","subscribed": {"framework_id": {"value":"12220-3440-12532-2345"},"heartbeat_interval_seconds":15.0}

```

```
{"type":"HEARTBEAT"}

```

| Project Info: Alpakka Simple Codecs (RecordIO) | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-stream\-alpakka\-simple\-codecs 10\.0\.2 [Snapshots are available](../other-docs/snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.simplecodecs |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka/v10.0.2/LICENSE) |
| Readiness level | [Community\-driven](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#community-driven) Since 0\.5, 2017\-01\-13 |
| Home page | <https://doc.akka.io/libraries/alpakka/current> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/recordio/index.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [GitHub releases](https://github.com/akka/alpakka/releases) |
| Issues | [Github issues](https://github.com/akka/alpakka/labels/p%3Arecordio) |
| Sources | <https://github.com/akka/alpakka> |

## Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-simple-codecs" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-simple-codecs_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-simple-codecs_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

The table below shows direct dependencies of this module and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

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

The flow factory [`RecordIOFraming`](/api/alpakka/10.0.2/akka/stream/alpakka/recordio/javadsl/RecordIOFraming$.html "akka.stream.alpakka.recordio.javadsl.RecordIOFraming")[`RecordIOFraming`](/api/alpakka/10.0.2/akka/stream/alpakka/recordio/scaladsl/RecordIOFraming$.html "akka.stream.alpakka.recordio.scaladsl.RecordIOFraming") provides a `scanner` factory method for a `Flow[ByteString, ByteString, _]``Flow<ByteString, ByteString, ?>` which parses out RecordIO frames.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/simple-codecs/src/test/scala/docs/scaladsl/RecordIOFramingSpec.scala#L11-L57 "Go to snippet source")import akka.stream.alpakka.recordio.scaladsl.RecordIOFraming

val FirstRecordData =
  """{"type": "SUBSCRIBED","subscribed": {"framework_id": {"value":"12220-3440-12532-2345"},"heartbeat_interval_seconds":15.0}"""
val SecondRecordData = """{"type":"HEARTBEAT"}"""

val FirstRecordWithPrefix = s"121\n$FirstRecordData"
val SecondRecordWithPrefix = s"20\n$SecondRecordData"

val basicSource: Source[ByteString, NotUsed] =
  Source.single(ByteString(FirstRecordWithPrefix + SecondRecordWithPrefix))

  val result: Future[Seq[ByteString]] = basicSource
    .via(RecordIOFraming.scanner())
    .runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/simple-codecs/src/test/java/docs/javadsl/RecordIOFramingTest.java#L40-L51 "Go to snippet source")String firstRecordData =
    "{\"type\": \"SUBSCRIBED\",\"subscribed\": {\"framework_id\": {\"value\":\"12220-3440-12532-2345\"},\"heartbeat_interval_seconds\":15.0}";
String secondRecordData = "{\"type\":\"HEARTBEAT\"}";

String firstRecordWithPrefix = "121\n" + firstRecordData;
String secondRecordWithPrefix = "20\n" + secondRecordData;

Source<ByteString, NotUsed> basicSource =
    Source.single(ByteString.fromString(firstRecordWithPrefix + secondRecordWithPrefix));

CompletionStage<List<ByteString>> result =
    basicSource.via(RecordIOFraming.scanner()).runWith(Sink.seq(), system);
```

We obtain:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/simple-codecs/src/test/scala/docs/scaladsl/RecordIOFramingSpec.scala#L62-L65 "Go to snippet source")val byteStrings = result.futureValue

byteStrings(0) shouldBe ByteString(FirstRecordData)
byteStrings(1) shouldBe ByteString(SecondRecordData)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/simple-codecs/src/test/java/docs/javadsl/RecordIOFramingTest.java#L55-L58 "Go to snippet source")List<ByteString> byteStrings = result.toCompletableFuture().get(1, TimeUnit.SECONDS);

assertThat(byteStrings.get(0), is(ByteString.fromString(firstRecordData)));
assertThat(byteStrings.get(1), is(ByteString.fromString(secondRecordData)));
```

### Running the example code

The code in this guide is part of runnable tests of this project. You are welcome to edit the code and run it in sbt.

Scala

```
sbt
> simpleCodecs/testOnly *.RecordIOFramingSpec

```

## Code Examples

### Example 1: RecordIO Framing

```text
128\n
{"type": "SUBSCRIBED","subscribed": {"framework_id": {"value":"12220-3440-12532-2345"},"heartbeat_interval_seconds":15.0}20\n
{"type":"HEARTBEAT"}
```

### Example 2: RecordIO Framing

```text
{"type": "SUBSCRIBED","subscribed": {"framework_id": {"value":"12220-3440-12532-2345"},"heartbeat_interval_seconds":15.0}
```

### Example 3: RecordIO Framing

```text
{"type":"HEARTBEAT"}
```

### Example 4: Artifacts

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-simple-codecs" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```

### Example 5: Artifacts

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-simple-codecs_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 6: Artifacts

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-simple-codecs_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 7: Usage

```scala
import akka.stream.alpakka.recordio.scaladsl.RecordIOFraming

val FirstRecordData =
  """{"type": "SUBSCRIBED","subscribed": {"framework_id": {"value":"12220-3440-12532-2345"},"heartbeat_interval_seconds":15.0}"""
val SecondRecordData = """{"type":"HEARTBEAT"}"""

val FirstRecordWithPrefix = s"121\n$FirstRecordData"
val SecondRecordWithPrefix = s"20\n$SecondRecordData"

val basicSource: Source[ByteString, NotUsed] =
  Source.single(ByteString(FirstRecordWithPrefix + SecondRecordWithPrefix))

  val result: Future[Seq[ByteString]] = basicSource
    .via(RecordIOFraming.scanner())
    .runWith(Sink.seq)
```

### Example 8: Usage

```java
String firstRecordData =
    "{\"type\": \"SUBSCRIBED\",\"subscribed\": {\"framework_id\": {\"value\":\"12220-3440-12532-2345\"},\"heartbeat_interval_seconds\":15.0}";
String secondRecordData = "{\"type\":\"HEARTBEAT\"}";

String firstRecordWithPrefix = "121\n" + firstRecordData;
String secondRecordWithPrefix = "20\n" + secondRecordData;

Source<ByteString, NotUsed> basicSource =
    Source.single(ByteString.fromString(firstRecordWithPrefix + secondRecordWithPrefix));

CompletionStage<List<ByteString>> result =
    basicSource.via(RecordIOFraming.scanner()).runWith(Sink.seq(), system);
```

### Example 9: Usage

```scala
val byteStrings = result.futureValue

byteStrings(0) shouldBe ByteString(FirstRecordData)
byteStrings(1) shouldBe ByteString(SecondRecordData)
```

### Example 10: Usage

```java
List<ByteString> byteStrings = result.toCompletableFuture().get(1, TimeUnit.SECONDS);

assertThat(byteStrings.get(0), is(ByteString.fromString(firstRecordData)));
assertThat(byteStrings.get(1), is(ByteString.fromString(secondRecordData)));
```

### Example 11: Running the example code

```text
sbt
> simpleCodecs/testOnly *.RecordIOFramingSpec
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/recordio/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/recordio/javadsl/RecordIOFraming$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/recordio/scaladsl/RecordIOFraming$.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/csv.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/text.html
- https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/libraries/alpakka/current

---
*Source: [https://doc.akka.io/docs/alpakka/current/data-transformations/simple-codecs.html](https://doc.akka.io/docs/alpakka/current/data-transformations/simple-codecs.html)*