---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/range.html
title: Source.range • Akka core
---

# Source.range • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.range

Emit each integer in a range, with an option to take bigger steps than 1\.

[Source operators](../index.html#source-operators)

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
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
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

## Description

Emit each integer in a range, with an option to take bigger steps than 1\. In Scala, use the `apply` method to generate a sequence of integers.

## Examples

Define the range of integers.

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceDocExamples.java#L9-L14 "Go to snippet source")import akka.Done;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.actor.testkit.typed.javadsl.ManualTime;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.stream.javadsl.Source;

Source<Integer, NotUsed> source = Source.range(1, 100);

Source<Integer, NotUsed> sourceStepFive = Source.range(1, 100, 5);

Source<Integer, NotUsed> sourceStepNegative = Source.range(100, 1, -1);
```

Print out the stream of integers.

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceDocExamples.java#L74 "Go to snippet source")source.runForeach(i -> System.out.println(i), system);
```

## Reactive Streams semantics

**emits** when there is demand, the next value

**completes** when the end of the range has been reached

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

### Example 4: Examples

```java
import akka.Done;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.actor.testkit.typed.javadsl.ManualTime;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.stream.javadsl.Source;

Source<Integer, NotUsed> source = Source.range(1, 100);

Source<Integer, NotUsed> sourceStepFive = Source.range(1, 100, 5);

Source<Integer, NotUsed> sourceStepNegative = Source.range(100, 1, -1);
```

### Example 5: Examples

```java
source.runForeach(i -> System.out.println(i), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recover.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/range.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/range.html)*