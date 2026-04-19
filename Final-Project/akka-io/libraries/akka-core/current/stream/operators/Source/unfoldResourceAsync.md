---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:02Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResourceAsync.html
title: Source.unfoldResourceAsync • Akka core
---

# Source.unfoldResourceAsync • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.unfoldResourceAsync

Wrap any resource that can be opened, queried for next element and closed in an asynchronous way.

[Source operators](../index.html#source-operators)

## Signature

[`Source.unfoldResourceAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#unfoldResourceAsync(akka.japi.function.Creator,akka.japi.function.Function,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.unfoldResourceAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#unfoldResourceAsync[T,S](create:()=>scala.concurrent.Future[S],read:S=>scala.concurrent.Future[Option[T]],close:S=>scala.concurrent.Future[akka.Done]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Wrap any resource that can be opened, queried for next element and closed in an asynchronous way with three distinct functions into a source. This operator is the equivalent of [unfoldResource](unfoldResource.html) but for resources with asynchronous APIs.

`Source.unfoldResourceAsync` allows us to safely extract stream elements from a resource with an async API by providing it with three functions that all return a `Future``CompletionStage`: 

1. `create`: Open or create the resource
2. `read`: Fetch the next element or signal that we reached the end of the stream by completing the `Future``CompletionStage` with a `Optional.empty``None`
3. `close`: Close the resource, invoked on end of stream or if the stream fails

All exceptions thrown by `create` and `close` as well as the `Future``CompletionStage`s completing with failure will fail the stream. The supervision strategy is used to handle exceptions from `read`, `create` and from the `Future``CompletionStage`s.

Note that there are pre\-built `unfoldResourceAsync`\-like operators to wrap `java.io.InputStream`s in [Additional Sink and Source converters](../index.html#additional-sink-and-source-converters), `Iterator` in [fromIterator](fromIterator.html) and File IO in [File IO Sinks and Sources](../index.html#file-io-sinks-and-sources). Additional prebuilt technology specific connectors can also be found in the [Alpakka project](https://doc.akka.io/libraries/alpakka/current/).

## Examples

Imagine we have an async database API which we initially perform an async query and then can check if there are more results in an asynchronous way.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/UnfoldResourceAsync.scala#L18-L27 "Go to snippet source")trait Database {
  // blocking query
  def doQuery(): Future[QueryResult]
}
trait QueryResult {
  def hasMore(): Future[Boolean]
  def nextEntry(): Future[DatabaseEntry]
  def close(): Future[Unit]
}
trait DatabaseEntry
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/UnfoldResourceAsync.java#L18-L35 "Go to snippet source")interface Database {
  // async query
  CompletionStage<QueryResult> doQuery();
}

interface QueryResult {

  // are there more results
  CompletionStage<Boolean> hasMore();

  // async retrieval of each element
  CompletionStage<DatabaseEntry> nextEntry();

  CompletionStage<Void> close();
}

interface DatabaseEntry {}

```

Let’s see how we use the API above safely through `unfoldResourceAsync`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/UnfoldResourceAsync.scala#L34-L51 "Go to snippet source")// we don't actually have one, it was just made up for the sample
val database: Database = ???

val queryResultSource: Source[DatabaseEntry, NotUsed] =
  Source.unfoldResourceAsync[DatabaseEntry, QueryResult](
    // open
    () => database.doQuery(),
    // read
    query =>
      query.hasMore().flatMap {
        case false => Future.successful(None)
        case true  => query.nextEntry().map(dbEntry => Some(dbEntry))
      },
    // close
    query => query.close().map(_ => Done))

// process each element
queryResultSource.runForeach(println)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/UnfoldResourceAsync.java#L42-L70 "Go to snippet source")  // we don't actually have one, it was just made up for the sample
  Database database = null;

  Source<DatabaseEntry, NotUsed> queryResultSource =
      Source.unfoldResourceAsync(
          // open
          database::doQuery,
          // read
          this::readQueryResult,
          // close
          queryResult -> queryResult.close().thenApply(__ -> Done.done()));

  queryResultSource.runForeach(entry -> System.out.println(entry.toString()), system);
private CompletionStage<Optional<DatabaseEntry>> readQueryResult(QueryResult queryResult) {
  return queryResult
      .hasMore()
      .thenCompose(
          more -> {
            if (more) {
              return queryResult.nextEntry().thenApply(Optional::of);
            } else {
              return CompletableFuture.completedFuture(Optional.empty());
            }
          });
}
```

## Reactive Streams semantics

**emits** when there is demand and `Future` `CompletionStage` from read function returns value

**completes** when `Future` `CompletionStage` from read function returns `None`

## Code Examples

### Example 1: Examples

```scala
trait Database {
  // blocking query
  def doQuery(): Future[QueryResult]
}
trait QueryResult {
  def hasMore(): Future[Boolean]
  def nextEntry(): Future[DatabaseEntry]
  def close(): Future[Unit]
}
trait DatabaseEntry
```

### Example 2: Examples

```java
interface Database {
  // async query
  CompletionStage<QueryResult> doQuery();
}

interface QueryResult {

  // are there more results
  CompletionStage<Boolean> hasMore();

  // async retrieval of each element
  CompletionStage<DatabaseEntry> nextEntry();

  CompletionStage<Void> close();
}

interface DatabaseEntry {}
```

### Example 3: Examples

```scala
// we don't actually have one, it was just made up for the sample
val database: Database = ???

val queryResultSource: Source[DatabaseEntry, NotUsed] =
  Source.unfoldResourceAsync[DatabaseEntry, QueryResult](
    // open
    () => database.doQuery(),
    // read
    query =>
      query.hasMore().flatMap {
        case false => Future.successful(None)
        case true  => query.nextEntry().map(dbEntry => Some(dbEntry))
      },
    // close
    query => query.close().map(_ => Done))

// process each element
queryResultSource.runForeach(println)
```

### Example 4: Examples

```java
// we don't actually have one, it was just made up for the sample
  Database database = null;

  Source<DatabaseEntry, NotUsed> queryResultSource =
      Source.unfoldResourceAsync(
          // open
          database::doQuery,
          // read
          this::readQueryResult,
          // close
          queryResult -> queryResult.close().thenApply(__ -> Done.done()));

  queryResultSource.runForeach(entry -> System.out.println(entry.toString()), system);
private CompletionStage<Optional<DatabaseEntry>> readQueryResult(QueryResult queryResult) {
  return queryResult
      .hasMore()
      .thenCompose(
          more -> {
            if (more) {
              return queryResult.nextEntry().thenApply(Optional::of);
            } else {
              return CompletableFuture.completedFuture(Optional.empty());
            }
          });
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromIterator.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Unzip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/alpakka/current/

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResourceAsync.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResourceAsync.html)*