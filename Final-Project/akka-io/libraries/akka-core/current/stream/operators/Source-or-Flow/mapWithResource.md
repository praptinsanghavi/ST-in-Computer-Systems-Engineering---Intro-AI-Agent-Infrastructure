---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapWithResource.html
title: mapWithResource • Akka core
---

# mapWithResource • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapWithResource

Map elements with the help of a resource that can be opened, transform each element (in a blocking way) and closed.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.mapWithResource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mapWithResource(java.util.function.Supplier,java.util.function.BiFunction,java.util.function.Function) "akka.stream.javadsl.Flow")[`Flow.mapWithResource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mapWithResource[S,%20T](create:%20()%20=%3E%20S)(f:%20(S,%20Out)%20=%3E%20T,%20close:%20S%20=%3E%20Option[T]):%20Repr[T] "akka.stream.scaladsl.Flow") 1\. `create`: Open or Create the resource. 2\. `f`: Transform each element inputs with the help of resource. 3\. `close`: Close the resource, invoked on end of stream or if the stream fails, optionally outputting a last element.

## Description

Transform each stream element with the help of a resource. The functions are by default called on Akka’s dispatcher for blocking IO to avoid interfering with other stream operations. See [Blocking Needs Careful Management](../../../typed/dispatchers.html#blocking-needs-careful-management) for an explanation on why this is important. The resource creation function is invoked once when the stream is materialized and the returned resource is passed to the mapping function for mapping the first element. The mapping function returns a mapped element to emit downstream. The returned T MUST NOT be null as it is illegal as stream element \- according to the Reactive Streams specification.

The close function is called when upstream or downstream completes normally or exceptionally, and will be called only once.  
 \- upstream completes or fails, the optional value returns by `close` will be emitted to downstream if defined. \- downstream cancels or fails, the optional value returns by `close` will be ignored. \- shutdowns abruptly, the optional value returns by `close` will be ignored.  
You can do some clean\-up here.

Early completion can be done with combination of the [`Flow.takeWhile`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow.takeWhile`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") operator.

See also [unfoldResource](../Source/unfoldResource.html), [unfoldResourceAsync](../Source/unfoldResourceAsync.html). 

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or set it for a given Source by using ActorAttributes.

## Examples

Imagine we have a database API which may potentially block when we perform a query, and the database connection can be reused for each query.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/MapWithResource.scala#L15-L32 "Go to snippet source")trait DBDriver {
  def create(url: URL, userName: String, password: String): Connection
}
trait Connection {
  def close(): Unit
}
trait Database {
  //blocking query
  def doQuery(connection: Connection, query: String): QueryResult = ???
}
trait QueryResult {
  def hasMore: Boolean
  // potentially blocking retrieval of each element
  def next(): DataBaseRecord
  // potentially blocking retrieval all element
  def toList(): List[DataBaseRecord]
}
trait DataBaseRecord
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/MapWithResource.java#L16-L39 "Go to snippet source")interface DBDriver {
  Connection create(URL url, String userName, String password);
}

interface Connection {
  void close();
}

interface Database {
  // blocking query
  QueryResult doQuery(Connection connection, String query);
}

interface QueryResult {
  boolean hasMore();

  // potentially blocking retrieval of each element
  DatabaseRecord next();

  // potentially blocking retrieval all element
  List<DatabaseRecord> toList();
}

interface DatabaseRecord {}
```

Let’s see how we make use of the API above safely through `mapWithResource`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/MapWithResource.scala#L40-L53 "Go to snippet source")//some database for JVM
val db: Database = ???
Source(
  List(
    "SELECT * FROM shop ORDER BY article-0000 order by gmtModified desc limit 100;",
    "SELECT * FROM shop ORDER BY article-0001 order by gmtModified desc limit 100;"))
  .mapWithResource(() => dbDriver.create(url, userName, password))(
    (connection, query) => db.doQuery(connection, query).toList(),
    conn => {
      conn.close()
      None
    })
  .mapConcat(identity)
  .runForeach(println)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/MapWithResource.java#L49-L63 "Go to snippet source")// some database for JVM
final Database db = null;
Source.from(
        Arrays.asList(
            "SELECT * FROM shop ORDER BY article-0000 order by gmtModified desc limit 100;",
            "SELECT * FROM shop ORDER BY article-0001 order by gmtModified desc limit 100;"))
    .mapWithResource(
        () -> dbDriver.create(url, userName, password),
        (connection, query) -> db.doQuery(connection, query).toList(),
        connection -> {
          connection.close();
          return Optional.empty();
        })
    .mapConcat(elems -> elems)
    .runForeach(System.out::println, system);
```

In this example we retrieve data form two tables with the same shared connection, and transform the results to individual records with `mapConcat(identity)``mapConcat(elems -> elems)`, once done the connection is closed.

## Reactive Streams semantics

**emits** the mapping function returns an element and downstream is ready to consume it

**backpressures** downstream backpressures

**completes** upstream completes

**cancels** downstream cancels

## Code Examples

### Example 1: Examples

```scala
trait DBDriver {
  def create(url: URL, userName: String, password: String): Connection
}
trait Connection {
  def close(): Unit
}
trait Database {
  //blocking query
  def doQuery(connection: Connection, query: String): QueryResult = ???
}
trait QueryResult {
  def hasMore: Boolean
  // potentially blocking retrieval of each element
  def next(): DataBaseRecord
  // potentially blocking retrieval all element
  def toList(): List[DataBaseRecord]
}
trait DataBaseRecord
```

### Example 2: Examples

```java
interface DBDriver {
  Connection create(URL url, String userName, String password);
}

interface Connection {
  void close();
}

interface Database {
  // blocking query
  QueryResult doQuery(Connection connection, String query);
}

interface QueryResult {
  boolean hasMore();

  // potentially blocking retrieval of each element
  DatabaseRecord next();

  // potentially blocking retrieval all element
  List<DatabaseRecord> toList();
}

interface DatabaseRecord {}
```

### Example 3: Examples

```scala
//some database for JVM
val db: Database = ???
Source(
  List(
    "SELECT * FROM shop ORDER BY article-0000 order by gmtModified desc limit 100;",
    "SELECT * FROM shop ORDER BY article-0001 order by gmtModified desc limit 100;"))
  .mapWithResource(() => dbDriver.create(url, userName, password))(
    (connection, query) => db.doQuery(connection, query).toList(),
    conn => {
      conn.close()
      None
    })
  .mapConcat(identity)
  .runForeach(println)
```

### Example 4: Examples

```java
// some database for JVM
final Database db = null;
Source.from(
        Arrays.asList(
            "SELECT * FROM shop ORDER BY article-0000 order by gmtModified desc limit 100;",
            "SELECT * FROM shop ORDER BY article-0001 order by gmtModified desc limit 100;"))
    .mapWithResource(
        () -> dbDriver.create(url, userName, password),
        (connection, query) -> db.doQuery(connection, query).toList(),
        connection -> {
          connection.close();
          return Optional.empty();
        })
    .mapConcat(elems -> elems)
    .runForeach(System.out::println, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapError.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/maybe.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResourceAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/typed/dispatchers.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapWithResource.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapWithResource.html)*