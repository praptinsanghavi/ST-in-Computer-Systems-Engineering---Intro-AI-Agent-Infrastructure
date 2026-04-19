---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:52Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/reference.html
title: Reference • Alpakka Documentation
---

# Reference • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Reference

This is the reference documentation for an Alpakka connector. This section should contain a general overview of the connector and mention the libraries and APIs that the connector is using. Also it should link to external resources that might help to learn about the technology the connector is using.

### Reported issues

[Tagged issues at Github](https://github.com/akka/alpakka/labels/p%3Areference)

## Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-reference" % "10.0.2",
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
    <artifactId>akka-stream-alpakka-reference_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-stream-alpakka-reference_${versions.ScalaBinary}:10.0.2"
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

## Reading messages

Give a brief description of the usage of this connector. If you want to mention a class name, make sure to link to the API docs: [`ReferenceReadResult`](/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceReadResult.html "akka.stream.alpakka.reference.ReferenceReadResult").

If any of the API classes are different between Scala and Java, link to both API docs: [`Reference`](/api/alpakka/10.0.2/akka/stream/alpakka/reference/scaladsl/Reference$.html "akka.stream.alpakka.reference.scaladsl.Reference") [`Reference`](/api/alpakka/10.0.2/akka/stream/alpakka/reference/javadsl/Reference$.html "akka.stream.alpakka.reference.javadsl.Reference").

Show an example code snippet of how a source of this connector can be created.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/reference/src/test/scala/docs/scaladsl/ReferenceSpec.scala#L53-L56 "Go to snippet source")val settings: SourceSettings = SourceSettings(ClientId)

val source: Source[ReferenceReadResult, Future[Done]] =
  Reference.source(settings)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/reference/src/test/java/docs/javadsl/ReferenceTest.java#L64-L66 "Go to snippet source")final SourceSettings settings = SourceSettings.create(clientId);

final Source<ReferenceReadResult, CompletionStage<Done>> source = Reference.source(settings);
```

Wrap language specific text with language specific directives, like `@scala` for Scala specific text`@java` for Java specific text.

## Writing messages

Show an example code snippet of how a flow of this connector can be created.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/reference/src/test/scala/docs/scaladsl/ReferenceSpec.scala#L64-L65 "Go to snippet source")val flow: Flow[ReferenceWriteMessage, ReferenceWriteResult, NotUsed] =
  Reference.flow()
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/reference/src/test/java/docs/javadsl/ReferenceTest.java#L73 "Go to snippet source")final Flow<ReferenceWriteMessage, ReferenceWriteResult, NotUsed> flow = Reference.flow();
```

## Code Examples

### Example 1: Artifacts

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-reference" % "10.0.2",
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
    <artifactId>akka-stream-alpakka-reference_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-stream-alpakka-reference_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: Reading messages

```scala
val settings: SourceSettings = SourceSettings(ClientId)

val source: Source[ReferenceReadResult, Future[Done]] =
  Reference.source(settings)
```

### Example 5: Reading messages

```java
final SourceSettings settings = SourceSettings.create(clientId);

final Source<ReferenceReadResult, CompletionStage<Done>> source = Reference.source(settings);
```

### Example 6: Writing messages

```scala
val flow: Flow[ReferenceWriteMessage, ReferenceWriteResult, NotUsed] =
  Reference.flow()
```

### Example 7: Writing messages

```java
final Flow<ReferenceWriteMessage, ReferenceWriteResult, NotUsed> flow = Reference.flow();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceReadResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/javadsl/Reference$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/scaladsl/Reference$.html
- https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/docs/alpakka/current/patterns.html

---
*Source: [https://doc.akka.io/docs/alpakka/current/reference.html](https://doc.akka.io/docs/alpakka/current/reference.html)*