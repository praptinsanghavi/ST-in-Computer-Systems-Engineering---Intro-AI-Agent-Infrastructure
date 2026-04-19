---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:20Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/data-transformations/json.html
title: JSON • Alpakka Documentation
---

# JSON • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# JSON

## JSON Framing

Use Akka Stream JsonFraming to split a stream of [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString") elements into ByteString snippets of valid JSON objects. 

See [`JsonFraming`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/JsonFraming.html "akka.stream.javadsl.JsonFraming")[`JsonFraming`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/JsonFraming$.html "akka.stream.scaladsl.JsonFraming")

[Akka documentation](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-io.html#using-framing-in-your-protocol)

```
JsonFraming.objectScanner(maximumObjectLength: Int): Flow[ByteString, ByteString, NotUsed]

```

Returns a Flow that implements a “brace counting” based framing stage for emitting valid JSON chunks.

Typical examples of data that one may want to frame using this stage include:

**Very large arrays**:

```
[{"id": 1}, {"id": 2}, [...], {"id": 999}]

```

**Multiple concatenated JSON objects** (with, or without commas between them):

```
{"id": 1}, {"id": 2}, [...], {"id": 999}

```

The framing works independently of formatting, i.e. it will still emit valid JSON elements even if two elements are separated by multiple newlines or other whitespace characters. And of course is insensitive (and does not impact the emitting frame) to the JSON object’s internal formatting.

## Streaming of nested structures

The method above is great for a stream of “flat” JSON objects (an array or just a stream of objects) but doesn’t work for the many use\-cases that involve a nested structure. A common example is the response of a database, which might look more like this:

```
{
  "size": 100,
  "rows": [
    {"id": 1, "doc": {}}
    {"id": 2, "doc": {}}
    ...
  ]
}

```

The JSON reading module offers a flow, which allows to stream specific parts of that JSON structure. In this particular example, only the `rows` array is interesting for the application, more specifically even: only the `doc` inside each element of the array.

| Project Info: Alpakka JSON Streaming | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-stream\-alpakka\-json\-streaming 10\.0\.2 [Snapshots are available](../other-docs/snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17 |
| Scala versions | 2\.13\.17 |
| JPMS module name | akka.stream.alpakka.json.streaming |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka/v10.0.2/LICENSE) |
| Readiness level | [Community\-driven](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#community-driven) Since 0\.19, 2018\-05\-09 |
| Home page | <https://doc.akka.io/libraries/alpakka/current> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/json/index.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [GitHub releases](https://github.com/akka/alpakka/releases) |
| Issues | [Github issues](https://github.com/akka/alpakka/labels/p%3Ajson-streaming) |
| Sources | <https://github.com/akka/alpakka> |

### Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-json-streaming" % "10.0.2",
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
    <artifactId>akka-stream-alpakka-json-streaming_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-stream-alpakka-json-streaming_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

The table below shows direct dependencies of this module and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.fasterxml.jackson.core | jackson\-core | [2\.18\.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4) |
| com.fasterxml.jackson.core | jackson\-databind | [2\.18\.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4) |
| com.github.jsurfer | jsurfer\-jackson | [1\.6\.5](https://mvnrepository.com/artifact/com.github.jsurfer/jsurfer-jackson/1.6.5) |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
com.github.jsurfer    jsurfer-jackson    [1.6.5](https://mvnrepository.com/artifact/com.github.jsurfer/jsurfer-jackson/1.6.5)    MIT License
    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
    com.github.jsurfer    jsurfer-core    [1.6.5](https://mvnrepository.com/artifact/com.github.jsurfer/jsurfer-core/1.6.5)    MIT License
        org.antlr    antlr4-runtime    [4.13.1](https://mvnrepository.com/artifact/org.antlr/antlr4-runtime/4.13.1)    BSD-3-Clause
com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

### Example

To define which parts of the structure you want to stream the module supports [JsonPath notation](https://github.com/jsurfer/JsonSurfer#what-is-jsonpath). For example:

- Stream all elements of the nested `rows` array: `$.rows[*]`
- Stream the value of `doc` of each element in the array: `$.rows[*].doc`

To extract the information needed, run a stream through the `JsonReader.select` flow.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/json-streaming/src/test/scala/docs/scaladsl/JsonReaderTest.scala#L47-L50 "Go to snippet source")val results = Source
  .single(ByteString.fromString(baseDocument))
  .via(JsonReader.select("$.rows[*].doc"))
  .runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/json-streaming/src/test/java/docs/javadsl/JsonReaderUsageTest.java#L54-L55 "Go to snippet source")final CompletionStage<List<ByteString>> resultStage =
    Source.single(doc).via(JsonReader.select("$.rows[*].doc")).runWith(Sink.seq(), system);
```

## Code Examples

### Example 1: JSON Framing

```text
JsonFraming.objectScanner(maximumObjectLength: Int): Flow[ByteString, ByteString, NotUsed]
```

### Example 2: JSON Framing

```text
[{"id": 1}, {"id": 2}, [...], {"id": 999}]
```

### Example 3: JSON Framing

```text
{"id": 1}, {"id": 2}, [...], {"id": 999}
```

### Example 4: Streaming of nested structures

```text
{
  "size": 100,
  "rows": [
    {"id": 1, "doc": {}}
    {"id": 2, "doc": {}}
    ...
  ]
}
```

### Example 5: Artifacts

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-json-streaming" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```

### Example 6: Artifacts

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-json-streaming_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 7: Artifacts

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-json-streaming_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 8: Example

```scala
val results = Source
  .single(ByteString.fromString(baseDocument))
  .via(JsonReader.select("$.rows[*].doc"))
  .runWith(Sink.seq)
```

### Example 9: Example

```java
final CompletionStage<List<ByteString>> resultStage =
    Source.single(doc).via(JsonReader.select("$.rows[*].doc")).runWith(Sink.seq(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/JsonFraming$.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/json/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/compression.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/parsing-lines.html
- https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/JsonFraming.html
- https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-io.html
- https://doc.akka.io/libraries/alpakka/current

---
*Source: [https://doc.akka.io/docs/alpakka/current/data-transformations/json.html](https://doc.akka.io/docs/alpakka/current/data-transformations/json.html)*