---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:16Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/data-transformations/text.html
title: Text and charsets • Alpakka Documentation
---

# Text and charsets • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Text and charsets

The text flows allow to translate a stream of text data according to the used character sets. It supports conversion between ByteString and String, as well as conversion of the character set in binary text data in the form of ByteStrings.

The main use case for these flows is the transcoding of text read from a source with a certain character set, which may not be usable with other flows or sinks. For example may CSV data arrive in UTF\-16 encoding, but the Alpakka CSV parser does only support UTF\-8\.

| Project Info: Alpakka Text | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-stream\-alpakka\-text 10\.0\.2 [Snapshots are available](../other-docs/snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.text |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka/v10.0.2/LICENSE) |
| Readiness level | [Community\-driven](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#community-driven) Since 0\.20, 2018\-07\-04 |
| Home page | <https://doc.akka.io/libraries/alpakka/current> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/text/index.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [GitHub releases](https://github.com/akka/alpakka/releases) |
| Issues | [Github issues](https://github.com/akka/alpakka/labels/p%3Atext) |
| Sources | <https://github.com/akka/alpakka> |

## Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-text" % "10.0.2",
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
    <artifactId>akka-stream-alpakka-text_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-stream-alpakka-text_${versions.ScalaBinary}:10.0.2"
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

## Text transcoding

The text transcoding flow converts incoming binary text data (ByteString) to binary text data of another character encoding. 

The flow fails with an [`UnmappableCharacterException`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/nio/charset/UnmappableCharacterException.html "java.nio.charset.UnmappableCharacterException"), if a character is not representable in the targeted character set.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/text/src/test/scala/docs/scaladsl/CharsetCodingFlowsDoc.scala#L97-L115 "Go to snippet source")import java.nio.charset.StandardCharsets

import akka.stream.alpakka.text.scaladsl.TextFlow
import akka.stream.scaladsl.FileIO

val byteStringSource: Source[ByteString, _] = // ...

byteStringSource
  .via(TextFlow.transcoding(StandardCharsets.UTF_16, StandardCharsets.UTF_8))
  .runWith(FileIO.toPath(targetFile))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/text/src/test/java/docs/javadsl/CharsetCodingFlowsDoc.java#L97-L104 "Go to snippet source")Source<ByteString, ?> byteStringSource = // ...
    byteStringSource
        .via(TextFlow.transcoding(StandardCharsets.UTF_16, StandardCharsets.UTF_8))
        .runWith(FileIO.toPath(targetFile), system);
```

## Text encoding

The text encoding flow converts incoming Strings to binary text data (ByteString) with the given character encoding. 

The flow fails with an [`UnmappableCharacterException`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/nio/charset/UnmappableCharacterException.html "java.nio.charset.UnmappableCharacterException"), if a character is not representable in the targeted character set.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/text/src/test/scala/docs/scaladsl/CharsetCodingFlowsDoc.scala#L39-L58 "Go to snippet source")import java.nio.charset.StandardCharsets

import akka.stream.alpakka.text.scaladsl.TextFlow
import akka.stream.scaladsl.FileIO

val stringSource: Source[String, _] = // ...

stringSource
  .via(TextFlow.encoding(StandardCharsets.US_ASCII))
  .intersperse(ByteString("\n"))
  .runWith(FileIO.toPath(targetFile))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/text/src/test/java/docs/javadsl/CharsetCodingFlowsDoc.java#L10-L68 "Go to snippet source")import akka.stream.alpakka.testkit.javadsl.LogCapturingJunit4;
import akka.stream.alpakka.text.javadsl.TextFlow;
import akka.stream.IOResult;
import akka.stream.javadsl.FileIO;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.util.ByteString;

import java.nio.charset.StandardCharsets;

Source<String, ?> stringSource = // ...
    stringSource
        .via(TextFlow.encoding(StandardCharsets.US_ASCII))
        .intersperse(ByteString.fromString("\n"))
        .runWith(FileIO.toPath(targetFile), system);
```

## Text decoding

The text decoding flow converts incoming ByteStrings to Strings using the given character encoding. 

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/text/src/test/scala/docs/scaladsl/CharsetCodingFlowsDoc.scala#L69-L85 "Go to snippet source")import java.nio.charset.StandardCharsets

import akka.stream.alpakka.text.scaladsl.TextFlow

val byteStringSource: Source[ByteString, _] = // ...

val result: Future[immutable.Seq[String]] =
  byteStringSource
    .via(TextFlow.decoding(StandardCharsets.UTF_16))
    .runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/text/src/test/java/docs/javadsl/CharsetCodingFlowsDoc.java#L78-L85 "Go to snippet source")Source<ByteString, ?> byteStringSource = // ...
    byteStringSource
        .via(TextFlow.decoding(StandardCharsets.UTF_16))
        .runWith(Sink.seq(), system);
```

## Code Examples

### Example 1: Artifacts

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-text" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```

### Example 2: Artifacts

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-text_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 3: Artifacts

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-text_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: Text transcoding

```scala
import java.nio.charset.StandardCharsets

import akka.stream.alpakka.text.scaladsl.TextFlow
import akka.stream.scaladsl.FileIO

val byteStringSource: Source[ByteString, _] = // ...

byteStringSource
  .via(TextFlow.transcoding(StandardCharsets.UTF_16, StandardCharsets.UTF_8))
  .runWith(FileIO.toPath(targetFile))
```

### Example 5: Text transcoding

```java
Source<ByteString, ?> byteStringSource = // ...
    byteStringSource
        .via(TextFlow.transcoding(StandardCharsets.UTF_16, StandardCharsets.UTF_8))
        .runWith(FileIO.toPath(targetFile), system);
```

### Example 6: Text encoding

```scala
import java.nio.charset.StandardCharsets

import akka.stream.alpakka.text.scaladsl.TextFlow
import akka.stream.scaladsl.FileIO

val stringSource: Source[String, _] = // ...

stringSource
  .via(TextFlow.encoding(StandardCharsets.US_ASCII))
  .intersperse(ByteString("\n"))
  .runWith(FileIO.toPath(targetFile))
```

### Example 7: Text encoding

```java
import akka.stream.alpakka.testkit.javadsl.LogCapturingJunit4;
import akka.stream.alpakka.text.javadsl.TextFlow;
import akka.stream.IOResult;
import akka.stream.javadsl.FileIO;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.util.ByteString;

import java.nio.charset.StandardCharsets;

Source<String, ?> stringSource = // ...
    stringSource
        .via(TextFlow.encoding(StandardCharsets.US_ASCII))
        .intersperse(ByteString.fromString("\n"))
        .runWith(FileIO.toPath(targetFile), system);
```

### Example 8: Text decoding

```scala
import java.nio.charset.StandardCharsets

import akka.stream.alpakka.text.scaladsl.TextFlow

val byteStringSource: Source[ByteString, _] = // ...

val result: Future[immutable.Seq[String]] =
  byteStringSource
    .via(TextFlow.decoding(StandardCharsets.UTF_16))
    .runWith(Sink.seq)
```

### Example 9: Text decoding

```java
Source<ByteString, ?> byteStringSource = // ...
    byteStringSource
        .via(TextFlow.decoding(StandardCharsets.UTF_16))
        .runWith(Sink.seq(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/text/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/simple-codecs.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/xml.html
- https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/libraries/alpakka/current

---
*Source: [https://doc.akka.io/docs/alpakka/current/data-transformations/text.html](https://doc.akka.io/docs/alpakka/current/data-transformations/text.html)*