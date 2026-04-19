---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:02Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResource.html
title: Source.unfoldResource • Akka core
---

# Source.unfoldResource • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.unfoldResource

Wrap any resource that can be opened, queried for next element (in a blocking way) and closed using three distinct functions into a source.

[Source operators](../index.html#source-operators)

## Signature

[`Source.unfoldResource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#unfoldResource(akka.japi.function.Creator,akka.japi.function.Function,akka.japi.function.Procedure) "akka.stream.javadsl.Source")[`Source.unfoldResource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#unfoldResource[T,S](create:()=>S,read:S=>Option[T],close:S=>Unit):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

`Source.unfoldResource` allows us to safely extract stream elements from blocking resources by providing it with three functions: 

1. `create`: Open or create the resource
2. `read`: Fetch the next element or signal that we reached the end of the stream by returning a `Optional.empty``None`
3. `close`: Close the resource, invoked on end of stream or if the stream fails

The functions are by default called on Akka’s dispatcher for blocking IO to avoid interfering with other stream operations. See [Blocking Needs Careful Management](../../../typed/dispatchers.html#blocking-needs-careful-management) for an explanation on why this is important.

Note that there are pre\-built `unfoldResource`\-like operators to wrap `java.io.InputStream`s in [Additional Sink and Source converters](../index.html#additional-sink-and-source-converters), `Iterator` in [fromIterator](fromIterator.html) and File IO in [File IO Sinks and Sources](../index.html#file-io-sinks-and-sources). Additional prebuilt technology specific connectors can also be found in the [Alpakka project](https://doc.akka.io/libraries/alpakka/current/).

## Examples

Imagine we have a database API which may potentially block both when we initially perform a query and on retrieving each result from the query. It also gives us an iterator like way to determine if we have reached the end of the result and a close method that must be called to free resources:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/UnfoldResource.scala#L15-L25 "Go to snippet source")trait Database {
  // blocking query
  def doQuery(): QueryResult
}
trait QueryResult {
  def hasMore: Boolean
  // potentially blocking retrieval of each element
  def nextEntry(): DatabaseEntry
  def close(): Unit
}
trait DatabaseEntry
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/UnfoldResource.java#L15-L29 "Go to snippet source")interface Database {
  // blocking query
  QueryResult doQuery();
}

interface QueryResult {
  boolean hasMore();
  // potentially blocking retrieval of each element
  DatabaseEntry nextEntry();

  void close();
}

interface DatabaseEntry {}

```

Let’s see how we use the API above safely through `unfoldResource`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/UnfoldResource.scala#L31-L52 "Go to snippet source")// we don't actually have one, it was just made up for the sample
val database: Database = ???

val queryResultSource: Source[DatabaseEntry, NotUsed] =
  Source.unfoldResource[DatabaseEntry, QueryResult](
    // open
    { () =>
      database.doQuery()
    },
    // read
    { query =>
      if (query.hasMore)
        Some(query.nextEntry())
      else
        // signals end of resource
        None
    },
    // close
    query => query.close())

// process each element
queryResultSource.runForeach(println)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/UnfoldResource.java#L36-L51 "Go to snippet source")// we don't actually have one, it was just made up for the sample
Database database = null;

Source<DatabaseEntry, NotUsed> queryResultSource =
    Source.unfoldResource(
        // open
        () -> database.doQuery(),
        // read
        (queryResult) -> {
          if (queryResult.hasMore()) return Optional.of(queryResult.nextEntry());
          else return Optional.empty();
        },
        // close
        QueryResult::close);

queryResultSource.runForeach(entry -> System.out.println(entry.toString()), system);
```

If the resource produces more than one element at a time, combining `unfoldResource` with `mapConcat(identity)``mapConcat(elems -> elems)` will give you a stream of individual elements. See [mapConcat](../Source-or-Flow/mapConcat.html)) for details.

## Reactive Streams semantics

**emits** when there is demand and the `read` function returns a value

**completes** when the `read` function returns `None`an empty `Optional`

## Code Examples

### Example 1: Examples

```scala
trait Database {
  // blocking query
  def doQuery(): QueryResult
}
trait QueryResult {
  def hasMore: Boolean
  // potentially blocking retrieval of each element
  def nextEntry(): DatabaseEntry
  def close(): Unit
}
trait DatabaseEntry
```

### Example 2: Examples

```java
interface Database {
  // blocking query
  QueryResult doQuery();
}

interface QueryResult {
  boolean hasMore();
  // potentially blocking retrieval of each element
  DatabaseEntry nextEntry();

  void close();
}

interface DatabaseEntry {}
```

### Example 3: Examples

```scala
// we don't actually have one, it was just made up for the sample
val database: Database = ???

val queryResultSource: Source[DatabaseEntry, NotUsed] =
  Source.unfoldResource[DatabaseEntry, QueryResult](
    // open
    { () =>
      database.doQuery()
    },
    // read
    { query =>
      if (query.hasMore)
        Some(query.nextEntry())
      else
        // signals end of resource
        None
    },
    // close
    query => query.close())

// process each element
queryResultSource.runForeach(println)
```

### Example 4: Examples

```java
// we don't actually have one, it was just made up for the sample
Database database = null;

Source<DatabaseEntry, NotUsed> queryResultSource =
    Source.unfoldResource(
        // open
        () -> database.doQuery(),
        // read
        (queryResult) -> {
          if (queryResult.hasMore()) return Optional.of(queryResult.nextEntry());
          else return Optional.empty();
        },
        // close
        QueryResult::close);

queryResultSource.runForeach(entry -> System.out.println(entry.toString()), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromIterator.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResourceAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/typed/dispatchers.html
- https://doc.akka.io/libraries/alpakka/current/

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResource.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResource.html)*