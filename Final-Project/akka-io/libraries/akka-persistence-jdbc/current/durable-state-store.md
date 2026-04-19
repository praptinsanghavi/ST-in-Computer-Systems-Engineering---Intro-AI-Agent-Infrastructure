---
description: A plugin for storing events in an event journal akka-persistence-jdbc
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:27Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-jdbc/current/durable-state-store.html
title: DurableStateStore • Akka Persistence JDBC
---

# DurableStateStore • Akka Persistence JDBC

> **Summary:** A plugin for storing events in an event journal akka-persistence-jdbc

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# DurableStateStore

## How to get the DurableStateStore

The `DurableStateStore` for JDBC plugin is obtained through the `DurableStateStoreRegistry` extension.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/state/ScaladslSnippets.scala#L32-L36 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/state/JavadslSnippets.java#L16-L68 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());
```

## APIs supported by DurableStateStore

The plugin supports the following APIs:

### getObject

`getObject(persistenceId)` returns `GetObjectResult(value, revision)`, where `value` is an `Option` (`Optional` in Java) and is set to the value of the object if it exists with the passed in `persistenceId`. Otherwise `value` is empty.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/state/ScaladslSnippets.scala#L44-L53 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.state.scaladsl.GetObjectResult

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

val futureResult: Future[GetObjectResult[String]] = store.getObject("InvalidPersistenceId")
futureResult.futureValue.value shouldBe None
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/state/JavadslSnippets.java#L20-L89 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.state.javadsl.GetObjectResult;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

CompletionStage<GetObjectResult<String>> futureResult = store.getObject("InvalidPersistenceId");
try {
  GetObjectResult<String> result = futureResult.toCompletableFuture().get();
  assert !result.value().isPresent();
} catch (Exception e) {
  // handle exceptions
}
```

### upsertObject

`upsertObject(persistenceId, revision, value, tag)` inserts the record if the `persistenceId` does not exist in the database. Or else it updates the record with the latest revision passed as `revision`. The update succeeds only if the incoming `revision` is 1 more than the already existing one. This snippet is an example of a sequnece of `upsertObject` and `getObject`.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/state/ScaladslSnippets.scala#L62-L81 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.state.scaladsl.GetObjectResult

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

val v: Future[GetObjectResult[String]] =
  for {
    n <- store.upsertObject("p234", 1, "a valid string", "t123")
    _ = n shouldBe akka.Done
    g <- store.getObject("p234")
    _ = g.value shouldBe Some("a valid string")
    u <- store.upsertObject("p234", 2, "updated valid string", "t123")
    _ = u shouldBe akka.Done
    h <- store.getObject("p234")
  } yield h

v.futureValue.value shouldBe Some("updated valid string")
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/state/JavadslSnippets.java#L25-L115 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.state.javadsl.GetObjectResult;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

CompletionStage<GetObjectResult<String>> r =
    store
        .upsertObject("p234", 1, "a valid string", "t123")
        .thenCompose(d -> store.getObject("p234"))
        .thenCompose(o -> store.upsertObject("p234", 2, "updated valid string", "t123"))
        .thenCompose(d -> store.getObject("p234"));

try {
  assert r.toCompletableFuture().get().value().get().equals("updated valid string");
} catch (Exception e) {
  // handle exceptions
}
```

### deleteObject

`deleteObject(persistenceId)` deletes the record with the input `persistenceId`.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/state/ScaladslSnippets.scala#L89-L97 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

store.deleteObject("p123", 0L).futureValue shouldBe Done
store.getObject("p123").futureValue.value shouldBe None
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/state/JavadslSnippets.java#L30-L135 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

CompletionStage<Done> futureResult = store.deleteObject("p123");
try {
  assert futureResult.toCompletableFuture().get().equals(Done.getInstance());
} catch (Exception e) {
  // handle exceptions
}
```

### currentChanges

`currentChanges(tag, offset)` gets a source of the most recent changes made to objects with the given `tag` since the passed in `offset`. This api returns changes that occurred up to when the `Source` returned by this call is materialized.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/state/ScaladslSnippets.scala#L105-L116 "Go to snippet source")import akka.NotUsed
import akka.stream.scaladsl.Source
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.query.{ DurableStateChange, NoOffset }

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

val willCompleteTheStream: Source[DurableStateChange[String], NotUsed] =
  store.currentChanges("tag-1", NoOffset)
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/state/JavadslSnippets.java#L34-L151 "Go to snippet source")import akka.NotUsed;
import akka.stream.javadsl.Source;
import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.NoOffset;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

Source<DurableStateChange<String>, NotUsed> willCompleteTheStream =
    store.currentChanges("tag-1", NoOffset.getInstance());
```

### changes

`changes(tag, offset)` gets a source of the most recent changes made to objects with the given `tag` since the passed in `offset`. The returned source will never terminate, it effectively watches for changes to the objects and emits changes as they happen.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/state/ScaladslSnippets.scala#L124-L135 "Go to snippet source")import akka.NotUsed
import akka.stream.scaladsl.Source
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.query.{ DurableStateChange, NoOffset }

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

val willNotCompleteTheStream: Source[DurableStateChange[String], NotUsed] =
  store.changes("tag-1", NoOffset)
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/state/JavadslSnippets.java#L42-L167 "Go to snippet source")import akka.NotUsed;
import akka.stream.javadsl.Source;
import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.NoOffset;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

Source<DurableStateChange<String>, NotUsed> willNotCompleteTheStream =
    store.changes("tag-1", NoOffset.getInstance());
```

## Code Examples

### Example 1: How to get the DurableStateStore

```scala
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)
```

### Example 2: How to get the DurableStateStore

```java
import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());
```

### Example 3: getObject

```scala
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.state.scaladsl.GetObjectResult

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

val futureResult: Future[GetObjectResult[String]] = store.getObject("InvalidPersistenceId")
futureResult.futureValue.value shouldBe None
```

### Example 4: getObject

```java
import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.state.javadsl.GetObjectResult;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

CompletionStage<GetObjectResult<String>> futureResult = store.getObject("InvalidPersistenceId");
try {
  GetObjectResult<String> result = futureResult.toCompletableFuture().get();
  assert !result.value().isPresent();
} catch (Exception e) {
  // handle exceptions
}
```

### Example 5: upsertObject

```scala
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.state.scaladsl.GetObjectResult

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

val v: Future[GetObjectResult[String]] =
  for {
    n <- store.upsertObject("p234", 1, "a valid string", "t123")
    _ = n shouldBe akka.Done
    g <- store.getObject("p234")
    _ = g.value shouldBe Some("a valid string")
    u <- store.upsertObject("p234", 2, "updated valid string", "t123")
    _ = u shouldBe akka.Done
    h <- store.getObject("p234")
  } yield h

v.futureValue.value shouldBe Some("updated valid string")
```

### Example 6: upsertObject

```java
import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.state.javadsl.GetObjectResult;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

CompletionStage<GetObjectResult<String>> r =
    store
        .upsertObject("p234", 1, "a valid string", "t123")
        .thenCompose(d -> store.getObject("p234"))
        .thenCompose(o -> store.upsertObject("p234", 2, "updated valid string", "t123"))
        .thenCompose(d -> store.getObject("p234"));

try {
  assert r.toCompletableFuture().get().value().get().equals("updated valid string");
} catch (Exception e) {
  // handle exceptions
}
```

### Example 7: deleteObject

```scala
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

store.deleteObject("p123", 0L).futureValue shouldBe Done
store.getObject("p123").futureValue.value shouldBe None
```

### Example 8: deleteObject

```java
import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

CompletionStage<Done> futureResult = store.deleteObject("p123");
try {
  assert futureResult.toCompletableFuture().get().equals(Done.getInstance());
} catch (Exception e) {
  // handle exceptions
}
```

### Example 9: currentChanges

```scala
import akka.NotUsed
import akka.stream.scaladsl.Source
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.query.{ DurableStateChange, NoOffset }

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

val willCompleteTheStream: Source[DurableStateChange[String], NotUsed] =
  store.currentChanges("tag-1", NoOffset)
```

### Example 10: currentChanges

```java
import akka.NotUsed;
import akka.stream.javadsl.Source;
import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.NoOffset;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

Source<DurableStateChange<String>, NotUsed> willCompleteTheStream =
    store.currentChanges("tag-1", NoOffset.getInstance());
```

### Example 11: changes

```scala
import akka.NotUsed
import akka.stream.scaladsl.Source
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.query.{ DurableStateChange, NoOffset }

val store = DurableStateStoreRegistry
  .get(system)
  .durableStateStoreFor[JdbcDurableStateStore[String]](JdbcDurableStateStore.Identifier)

val willNotCompleteTheStream: Source[DurableStateChange[String], NotUsed] =
  store.changes("tag-1", NoOffset)
```

### Example 12: changes

```java
import akka.NotUsed;
import akka.stream.javadsl.Source;
import akka.persistence.state.DurableStateStoreRegistry;
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.NoOffset;

@SuppressWarnings("unchecked")
JdbcDurableStateStore<String> store =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            JdbcDurableStateStore.class, JdbcDurableStateStore.Identifier());

Source<DurableStateChange<String>, NotUsed> willNotCompleteTheStream =
    store.changes("tag-1", NoOffset.getInstance());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-jdbc/current/durable-state-store.html](https://doc.akka.io/libraries/akka-persistence-jdbc/current/durable-state-store.html)*