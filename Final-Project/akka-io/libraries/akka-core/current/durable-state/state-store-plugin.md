---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:12Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/durable-state/state-store-plugin.html
title: Building a storage backend for Durable State • Akka core
---

# Building a storage backend for Durable State • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Building a storage backend for Durable State

Storage backends for state stores are pluggable in the Akka persistence extension. This documentation described how to build a new storage backend for durable state.

Applications can provide their own plugins by implementing a plugin API and activating them by configuration. Plugin development requires the following imports:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/state/PersistenceStatePluginDocSpec.scala#L16-L18 "Go to snippet source")import akka.persistence._
import akka.persistence.state.scaladsl.DurableStateUpdateStore
import akka.persistence.state.scaladsl.GetObjectResult
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/main/java/docs/persistence/state/MyJavaStateStore.java#L8-L15 "Go to snippet source")  
import akka.Done;
import akka.actor.ExtendedActorSystem;
import akka.persistence.state.javadsl.DurableStateUpdateStore;
import akka.persistence.state.javadsl.GetObjectResult;
import com.typesafe.config.Config;
import java.util.concurrent.CompletionStage;

```

## State Store plugin API

A durable state store plugin extends `DurableStateUpdateStore`. 

`DurableStateUpdateStore` is an interface and the methods to be implemented are:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/main/scala/docs/persistence/state/MyStateStore.scala#L37-L61 "Go to snippet source")class MyStateStore[A](system: ExtendedActorSystem, config: Config, cfgPath: String) extends DurableStateUpdateStore[A] {

  /**
   * Will persist the latest state. If it’s a new persistence id, the record will be inserted.
   *
   * In case of an existing persistence id, the record will be updated only if the revision
   * number of the incoming record is 1 more than the already existing record. Otherwise persist will fail.
   */
  override def upsertObject(persistenceId: String, revision: Long, value: A, tag: String): Future[Done] = ???

  /**
   * Deprecated. Use the deleteObject overload with revision instead.
   */
  override def deleteObject(persistenceId: String): Future[Done] = deleteObject(persistenceId, 0)

  /**
   * Will delete the state by setting it to the empty state and the revision number will be incremented by 1.
   */
  override def deleteObject(persistenceId: String, revision: Long): Future[Done] = ???

  /**
   * Returns the current state for the given persistence id.
   */
  override def getObject(persistenceId: String): Future[GetObjectResult[A]] = ???
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/main/java/docs/persistence/state/MyJavaStateStore.java#L19-L67 "Go to snippet source")class MyJavaStateStore<A> implements DurableStateUpdateStore<A> {

  private ExtendedActorSystem system;
  private Config config;
  private String cfgPath;

  public MyJavaStateStore(ExtendedActorSystem system, Config config, String cfgPath) {
    this.system = system;
    this.config = config;
    this.cfgPath = cfgPath;
  }

  /** Returns the current state for the given persistence id. */
  @Override
  public CompletionStage<GetObjectResult<A>> getObject(String persistenceId) {
    // implement getObject here
    return null;
  }

  /**
   * Will persist the latest state. If it’s a new persistence id, the record will be inserted.
   *
   * <p>In case of an existing persistence id, the record will be updated only if the revision
   * number of the incoming record is 1 more than the already existing record. Otherwise persist
   * will fail.
   */
  @Override
  public CompletionStage<Done> upsertObject(
      String persistenceId, long revision, Object value, String tag) {
    // implement upsertObject here
    return null;
  }

  /** Deprecated. Use the deleteObject overload with revision instead. */
  @Override
  public CompletionStage<Done> deleteObject(String persistenceId) {
    return deleteObject(persistenceId, 0);
  }

  /**
   * Will delete the state by setting it to the empty state and the revision number will be
   * incremented by 1.
   */
  @Override
  public CompletionStage<Done> deleteObject(String persistenceId, long revision) {
    // implement deleteObject here
    return null;
  }
}
```

A durable state store plugin may also extend `DurableStateUpdateWithChangeEventStore` to store additional change event.

`DurableStateUpdateWithChangeEventStore` is an interface and the methods to be implemented are:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/main/scala/docs/persistence/state/MyStateStore.scala#L65-L106 "Go to snippet source")class MyChangeEventStateStore[A](system: ExtendedActorSystem, config: Config, cfgPath: String)
    extends DurableStateUpdateWithChangeEventStore[A] {

  /**
   * The `changeEvent` is written to the event journal.
   * Same `persistenceId` is used in the journal and the `revision` is used as `sequenceNr`.
   *
   * @param revision sequence number for optimistic locking. starts at 1.
   */
  override def upsertObject(
      persistenceId: String,
      revision: Long,
      value: A,
      tag: String,
      changeEvent: Any): Future[Done] = ???

  override def deleteObject(persistenceId: String, revision: Long, changeEvent: Any): Future[Done] = ???

  /**
   * Will persist the latest state. If it’s a new persistence id, the record will be inserted.
   *
   * In case of an existing persistence id, the record will be updated only if the revision
   * number of the incoming record is 1 more than the already existing record. Otherwise persist will fail.
   */
  override def upsertObject(persistenceId: String, revision: Long, value: A, tag: String): Future[Done] = ???

  /**
   * Deprecated. Use the deleteObject overload with revision instead.
   */
  override def deleteObject(persistenceId: String): Future[Done] = deleteObject(persistenceId, 0)

  /**
   * Will delete the state by setting it to the empty state and the revision number will be incremented by 1.
   */
  override def deleteObject(persistenceId: String, revision: Long): Future[Done] = ???

  /**
   * Returns the current state for the given persistence id.
   */
  override def getObject(persistenceId: String): Future[GetObjectResult[A]] = ???

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/main/java/docs/persistence/state/MyChangeEventJavaStateStore.java#L19-L81 "Go to snippet source")class MyChangeEventJavaStateStore<A> implements DurableStateUpdateWithChangeEventStore<A> {

  private ExtendedActorSystem system;
  private Config config;
  private String cfgPath;

  public MyChangeEventJavaStateStore(ExtendedActorSystem system, Config config, String cfgPath) {
    this.system = system;
    this.config = config;
    this.cfgPath = cfgPath;
  }

  /**
   * Will delete the state by setting it to the empty state and the revision number will be
   * incremented by 1.
   */
  @Override
  public CompletionStage<Done> deleteObject(String persistenceId, long revision) {
    // implement deleteObject here
    return null;
  }

  @Override
  public CompletionStage<Done> deleteObject(
      String persistenceId, long revision, Object changeEvent) {
    // implement deleteObject here
    return null;
  }

  /** Returns the current state for the given persistence id. */
  @Override
  public CompletionStage<GetObjectResult<A>> getObject(String persistenceId) {
    // implement getObject here
    return null;
  }

  /**
   * Will persist the latest state. If it’s a new persistence id, the record will be inserted.
   *
   * <p>In case of an existing persistence id, the record will be updated only if the revision
   * number of the incoming record is 1 more than the already existing record. Otherwise persist
   * will fail.
   */
  @Override
  public CompletionStage<Done> upsertObject(
      String persistenceId, long revision, Object value, String tag) {
    // implement upsertObject here
    return null;
  }

  /** Deprecated. Use the deleteObject overload with revision instead. */
  @Override
  public CompletionStage<Done> deleteObject(String persistenceId) {
    return deleteObject(persistenceId, 0);
  }

  @Override
  public CompletionStage<Done> upsertObject(
      String persistenceId, long revision, A value, String tag, Object changeEvent) {
    // implement deleteObject here
    return null;
  }
}
```

## State Store provider

A `DurableStateStoreProvider` needs to be implemented to be able to create the plugin itself:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/main/scala/docs/persistence/state/MyStateStore.scala#L19-L33 "Go to snippet source")class MyStateStoreProvider(system: ExtendedActorSystem, config: Config, cfgPath: String)
    extends DurableStateStoreProvider {

  /**
   * The `DurableStateStore` implementation for the Scala API.
   * This corresponds to the instance that is returned by [[DurableStateStoreRegistry#durableStateStoreFor]].
   */
  override def scaladslDurableStateStore(): DurableStateStore[Any] = new MyStateStore(system, config, cfgPath)

  /**
   * The `DurableStateStore` implementation for the Java API.
   * This corresponds to the instance that is returned by [[DurableStateStoreRegistry#getDurableStateStoreFor]].
   */
  override def javadslDurableStateStore(): JDurableStateStore[AnyRef] = new MyJavaStateStore(system, config, cfgPath)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/main/java/docs/persistence/state/MyJavaStateStoreProvider.java#L13-L34 "Go to snippet source")class MyJavaStateStoreProvider implements DurableStateStoreProvider {

  private ExtendedActorSystem system;
  private Config config;
  private String cfgPath;

  public MyJavaStateStoreProvider(ExtendedActorSystem system, Config config, String cfgPath) {
    this.system = system;
    this.config = config;
    this.cfgPath = cfgPath;
  }

  @Override
  public DurableStateStore<Object> scaladslDurableStateStore() {
    return new MyStateStore<>(this.system, this.config, this.cfgPath);
  }

  @Override
  public akka.persistence.state.javadsl.DurableStateStore<Object> javadslDurableStateStore() {
    return new MyJavaStateStore<>(this.system, this.config, this.cfgPath);
  }
}
```

## Configure the State Store

A durable state store plugin can be activated with the following minimal configuration:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/state/PersistenceStatePluginDocSpec.scala#L42-L49 "Go to snippet source")# Path to the state store plugin to be used
akka.persistence.state.plugin = "my-state-store"

# My custom state store plugin
my-state-store {
  # Class name of the plugin.
  class = "docs.persistence.state.MyStateStoreProvider"
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/state/PersistenceStatePluginDocSpec.scala#L28-L35 "Go to snippet source")# Path to the state store plugin to be used
akka.persistence.state.plugin = "my-java-state-store"

# My custom state store plugin
my-java-state-store {
  # Class name of the plugin.
  class = "docs.persistence.state.MyJavaStateStoreProvider"
}
```

## Code Examples

### Example 1: Building a storage backend for Durable State

```scala
import akka.persistence._
import akka.persistence.state.scaladsl.DurableStateUpdateStore
import akka.persistence.state.scaladsl.GetObjectResult
```

### Example 2: Building a storage backend for Durable State

```java
import akka.Done;
import akka.actor.ExtendedActorSystem;
import akka.persistence.state.javadsl.DurableStateUpdateStore;
import akka.persistence.state.javadsl.GetObjectResult;
import com.typesafe.config.Config;
import java.util.concurrent.CompletionStage;
```

### Example 3: State Store plugin API

```scala
class MyStateStore[A](system: ExtendedActorSystem, config: Config, cfgPath: String) extends DurableStateUpdateStore[A] {

  /**
   * Will persist the latest state. If it’s a new persistence id, the record will be inserted.
   *
   * In case of an existing persistence id, the record will be updated only if the revision
   * number of the incoming record is 1 more than the already existing record. Otherwise persist will fail.
   */
  override def upsertObject(persistenceId: String, revision: Long, value: A, tag: String): Future[Done] = ???

  /**
   * Deprecated. Use the deleteObject overload with revision instead.
   */
  override def deleteObject(persistenceId: String): Future[Done] = deleteObject(persistenceId, 0)

  /**
   * Will delete the state by setting it to the empty state and the revision number will be incremented by 1.
   */
  override def deleteObject(persistenceId: String, revision: Long): Future[Done] = ???

  /**
   * Returns the current state for the given persistence id.
   */
  override def getObject(persistenceId: String): Future[GetObjectResult[A]] = ???
}
```

### Example 4: State Store plugin API

```java
class MyJavaStateStore<A> implements DurableStateUpdateStore<A> {

  private ExtendedActorSystem system;
  private Config config;
  private String cfgPath;

  public MyJavaStateStore(ExtendedActorSystem system, Config config, String cfgPath) {
    this.system = system;
    this.config = config;
    this.cfgPath = cfgPath;
  }

  /** Returns the current state for the given persistence id. */
  @Override
  public CompletionStage<GetObjectResult<A>> getObject(String persistenceId) {
    // implement getObject here
    return null;
  }

  /**
   * Will persist the latest state. If it’s a new persistence id, the record will be inserted.
   *
   * <p>In case of an existing persistence id, the record will be updated only if the revision
   * number of the incoming record is 1 more than the already existing record. Otherwise persist
   * will fail.
   */
  @Override
  public CompletionStage<Done> upsertObject(
      String persistenceId, long revision, Object value, String tag) {
    // implement upsertObject here
    return null;
  }

  /** Deprecated. Use the deleteObject overload with revision instead. */
  @Override
  public CompletionStage<Done> deleteObject(String persistenceId) {
    return deleteObject(persistenceId, 0);
  }

  /**
   * Will delete the state by setting it to the empty state and the revision number will be
   * incremented by 1.
   */
  @Override
  public CompletionStage<Done> deleteObject(String persistenceId, long revision) {
    // implement deleteObject here
    return null;
  }
}
```

### Example 5: State Store plugin API

```scala
class MyChangeEventStateStore[A](system: ExtendedActorSystem, config: Config, cfgPath: String)
    extends DurableStateUpdateWithChangeEventStore[A] {

  /**
   * The `changeEvent` is written to the event journal.
   * Same `persistenceId` is used in the journal and the `revision` is used as `sequenceNr`.
   *
   * @param revision sequence number for optimistic locking. starts at 1.
   */
  override def upsertObject(
      persistenceId: String,
      revision: Long,
      value: A,
      tag: String,
      changeEvent: Any): Future[Done] = ???

  override def deleteObject(persistenceId: String, revision: Long, changeEvent: Any): Future[Done] = ???

  /**
   * Will persist the latest state. If it’s a new persistence id, the record will be inserted.
   *
   * In case of an existing persistence id, the record will be updated only if the revision
   * number of the incoming record is 1 more than the already existing record. Otherwise persist will fail.
   */
  override def upsertObject(persistenceId: String, revision: Long, value: A, tag: String): Future[Done] = ???

  /**
   * Deprecated. Use the deleteObject overload with revision instead.
   */
  override def deleteObject(persistenceId: String): Future[Done] = deleteObject(persistenceId, 0)

  /**
   * Will delete the state by setting it to the empty state and the revision number will be incremented by 1.
   */
  override def deleteObject(persistenceId: String, revision: Long): Future[Done] = ???

  /**
   * Returns the current state for the given persistence id.
   */
  override def getObject(persistenceId: String): Future[GetObjectResult[A]] = ???

}
```

### Example 6: State Store plugin API

```java
class MyChangeEventJavaStateStore<A> implements DurableStateUpdateWithChangeEventStore<A> {

  private ExtendedActorSystem system;
  private Config config;
  private String cfgPath;

  public MyChangeEventJavaStateStore(ExtendedActorSystem system, Config config, String cfgPath) {
    this.system = system;
    this.config = config;
    this.cfgPath = cfgPath;
  }

  /**
   * Will delete the state by setting it to the empty state and the revision number will be
   * incremented by 1.
   */
  @Override
  public CompletionStage<Done> deleteObject(String persistenceId, long revision) {
    // implement deleteObject here
    return null;
  }

  @Override
  public CompletionStage<Done> deleteObject(
      String persistenceId, long revision, Object changeEvent) {
    // implement deleteObject here
    return null;
  }

  /** Returns the current state for the given persistence id. */
  @Override
  public CompletionStage<GetObjectResult<A>> getObject(String persistenceId) {
    // implement getObject here
    return null;
  }

  /**
   * Will persist the latest state. If it’s a new persistence id, the record will be inserted.
   *
   * <p>In case of an existing persistence id, the record will be updated only if the revision
   * number of the incoming record is 1 more than the already existing record. Otherwise persist
   * will fail.
   */
  @Override
  public CompletionStage<Done> upsertObject(
      String persistenceId, long revision, Object value, String tag) {
    // implement upsertObject here
    return null;
  }

  /** Deprecated. Use the deleteObject overload with revision instead. */
  @Override
  public CompletionStage<Done> deleteObject(String persistenceId) {
    return deleteObject(persistenceId, 0);
  }

  @Override
  public CompletionStage<Done> upsertObject(
      String persistenceId, long revision, A value, String tag, Object changeEvent) {
    // implement deleteObject here
    return null;
  }
}
```

### Example 7: State Store provider

```scala
class MyStateStoreProvider(system: ExtendedActorSystem, config: Config, cfgPath: String)
    extends DurableStateStoreProvider {

  /**
   * The `DurableStateStore` implementation for the Scala API.
   * This corresponds to the instance that is returned by [[DurableStateStoreRegistry#durableStateStoreFor]].
   */
  override def scaladslDurableStateStore(): DurableStateStore[Any] = new MyStateStore(system, config, cfgPath)

  /**
   * The `DurableStateStore` implementation for the Java API.
   * This corresponds to the instance that is returned by [[DurableStateStoreRegistry#getDurableStateStoreFor]].
   */
  override def javadslDurableStateStore(): JDurableStateStore[AnyRef] = new MyJavaStateStore(system, config, cfgPath)
}
```

### Example 8: State Store provider

```java
class MyJavaStateStoreProvider implements DurableStateStoreProvider {

  private ExtendedActorSystem system;
  private Config config;
  private String cfgPath;

  public MyJavaStateStoreProvider(ExtendedActorSystem system, Config config, String cfgPath) {
    this.system = system;
    this.config = config;
    this.cfgPath = cfgPath;
  }

  @Override
  public DurableStateStore<Object> scaladslDurableStateStore() {
    return new MyStateStore<>(this.system, this.config, this.cfgPath);
  }

  @Override
  public akka.persistence.state.javadsl.DurableStateStore<Object> javadslDurableStateStore() {
    return new MyJavaStateStore<>(this.system, this.config, this.cfgPath);
  }
}
```

### Example 9: Configure the State Store

```scala
# Path to the state store plugin to be used
akka.persistence.state.plugin = "my-state-store"

# My custom state store plugin
my-state-store {
  # Class name of the plugin.
  class = "docs.persistence.state.MyStateStoreProvider"
}
```

### Example 10: Configure the State Store

```scala
# Path to the state store plugin to be used
akka.persistence.state.plugin = "my-java-state-store"

# My custom state store plugin
my-java-state-store {
  # Class name of the plugin.
  class = "docs.persistence.state.MyJavaStateStoreProvider"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/durable-state/persistence-query.html
- https://doc.akka.io/libraries/akka-core/current/stream/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/durable-state/state-store-plugin.html](https://doc.akka.io/libraries/akka-core/current/durable-state/state-store-plugin.html)*