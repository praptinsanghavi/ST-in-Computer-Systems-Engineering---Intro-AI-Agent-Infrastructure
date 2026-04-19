---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/ignore.html
title: Sink.ignore • Akka core
---

# Sink.ignore • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.ignore

Consume all elements but discards them.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.ignore`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#ignore() "akka.stream.javadsl.Sink")[`Sink.ignore`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html "akka.stream.scaladsl.Sink")

## Description

Consume all elements but discards them. Useful when a stream has to be consumed but there is no use to actually do anything with the elements in the `Sink`. Processing of the elements may occur in the `Source`/`Flow`. 

## Example

This examples reads lines from a file, saves them to a database, and stores the database identifiers in another file. The stream is run with `Sink.ignore` because all processing of the elements have been performed by the preceding stream operators.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sink/Ignore.scala#L21-L24 "Go to snippet source")val lines: Source[String, NotUsed] = readLinesFromFile()
val databaseIds: Source[UUID, NotUsed] =
  lines.mapAsync(1)(line => saveLineToDatabase(line))
databaseIds.mapAsync(1)(uuid => writeIdToFile(uuid)).runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L135-L137 "Go to snippet source")Source<String, NotUsed> lines = readLinesFromFile();
Source<UUID, NotUsed> databaseIds = lines.mapAsync(1, line -> saveLineToDatabase(line));
databaseIds.mapAsync(1, uuid -> writeIdToFile(uuid)).runWith(Sink.ignore(), system);
```

## Reactive Streams semantics

**cancels** never

**backpressures** never

## Code Examples

### Example 1: Example

```scala
val lines: Source[String, NotUsed] = readLinesFromFile()
val databaseIds: Source[UUID, NotUsed] =
  lines.mapAsync(1)(line => saveLineToDatabase(line))
databaseIds.mapAsync(1)(uuid => writeIdToFile(uuid)).runWith(Sink.ignore)
```

### Example 2: Example

```java
Source<String, NotUsed> lines = readLinesFromFile();
Source<UUID, NotUsed> databaseIds = lines.mapAsync(1, line -> saveLineToDatabase(line));
databaseIds.mapAsync(1, uuid -> writeIdToFile(uuid)).runWith(Sink.ignore(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/inflate.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/idleTimeout.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/ignore.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/ignore.html)*