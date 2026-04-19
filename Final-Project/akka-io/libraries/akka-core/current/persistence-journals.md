---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/persistence-journals.html
title: Persistence - Building a storage backend • Akka core
---

# Persistence - Building a storage backend • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Persistence \- Building a storage backend

Storage backends for journals and snapshot stores are pluggable in the Akka persistence extension. A directory of persistence journal and snapshot store plugins is available at the Akka Community Projects page, see [Community plugins](https://akka.io/community/) This documentation described how to build a new storage backend.

Applications can provide their own plugins by implementing a plugin API and activating them by configuration. Plugin development requires the following imports:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L19-L22 "Go to snippet source")import akka.persistence._
import akka.persistence.journal._
import akka.persistence.snapshot._

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistencePluginDocTest.java#L8-L11 "Go to snippet source")import akka.dispatch.Futures;
import akka.persistence.*;
import akka.persistence.journal.japi.*;
import akka.persistence.snapshot.japi.*;
```

## Journal plugin API

A journal plugin extends `AsyncWriteJournal`.

`AsyncWriteJournal` is an actor and the methods to be implemented are:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/AsyncWriteJournal.scala#L212-L298 "Go to snippet source")/**
 * Plugin API: asynchronously writes a batch (`Seq`) of persistent messages to the
 * journal.
 *
 * The batch is only for performance reasons, i.e. all messages don't have to be written
 * atomically. Higher throughput can typically be achieved by using batch inserts of many
 * records compared to inserting records one-by-one, but this aspect depends on the
 * underlying data store and a journal implementation can implement it as efficient as
 * possible. Journals should aim to persist events in-order for a given `persistenceId`
 * as otherwise in case of a failure, the persistent state may be end up being inconsistent.
 *
 * Each `AtomicWrite` message contains the single `PersistentRepr` that corresponds to
 * the event that was passed to the `persist` method of the `PersistentActor`, or it
 * contains several `PersistentRepr` that corresponds to the events that were passed
 * to the `persistAll` method of the `PersistentActor`. All `PersistentRepr` of the
 * `AtomicWrite` must be written to the data store atomically, i.e. all or none must
 * be stored. If the journal (data store) cannot support atomic writes of multiple
 * events it should reject such writes with a `Try` `Failure` with an
 * `UnsupportedOperationException` describing the issue. This limitation should
 * also be documented by the journal plugin.
 *
 * If there are failures when storing any of the messages in the batch the returned
 * `Future` must be completed with failure. The `Future` must only be completed with
 * success when all messages in the batch have been confirmed to be stored successfully,
 * i.e. they will be readable, and visible, in a subsequent replay. If there is
 * uncertainty about if the messages were stored or not the `Future` must be completed
 * with failure.
 *
 * Data store connection problems must be signaled by completing the `Future` with
 * failure.
 *
 * The journal can also signal that it rejects individual messages (`AtomicWrite`) by
 * the returned `immutable.Seq[Try[Unit]]`. It is possible but not mandatory to reduce
 * number of allocations by returning `Future.successful(Nil)` for the happy path,
 * i.e. when no messages are rejected. Otherwise the returned `Seq` must have as many elements
 * as the input `messages` `Seq`. Each `Try` element signals if the corresponding
 * `AtomicWrite` is rejected or not, with an exception describing the problem. Rejecting
 * a message means it was not stored, i.e. it must not be included in a later replay.
 * Rejecting a message is typically done before attempting to store it, e.g. because of
 * serialization error.
 *
 * Data store connection problems must not be signaled as rejections.
 *
 * It is possible but not mandatory to reduce number of allocations by returning
 * `Future.successful(Nil)` for the happy path, i.e. when no messages are rejected.
 *
 * Calls to this method are serialized by the enclosing journal actor. If you spawn
 * work in asynchronous tasks it is alright that they complete the futures in any order,
 * but the actual writes for a specific persistenceId should be serialized to avoid
 * issues such as events of a later write are visible to consumers (query side, or replay)
 * before the events of an earlier write are visible.
 * A PersistentActor will not send a new WriteMessages request before the previous one
 * has been completed.
 *
 * Please note that the `sender` field of the contained PersistentRepr objects has been
 * nulled out (i.e. set to `ActorRef.noSender`) in order to not use space in the journal
 * for a sender reference that will likely be obsolete during replay.
 *
 * Please also note that requests for the highest sequence number may be made concurrently
 * to this call executing for the same `persistenceId`, in particular it is possible that
 * a restarting actor tries to recover before its outstanding writes have completed. In
 * the latter case it is highly desirable to defer reading the highest sequence number
 * until all outstanding writes have completed, otherwise the PersistentActor may reuse
 * sequence numbers.
 *
 * This call is protected with a circuit-breaker.
 */
def asyncWriteMessages(messages: immutable.Seq[AtomicWrite]): Future[immutable.Seq[Try[Unit]]]

/**
 * Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`
 * (inclusive).
 *
 * This call is protected with a circuit-breaker.
 * Message deletion doesn't affect the highest sequence number of messages,
 * journal must maintain the highest sequence number and never decrease it.
 */
def asyncDeleteMessagesTo(persistenceId: String, toSequenceNr: Long): Future[Unit]

/**
 * Plugin API
 *
 * Allows plugin implementers to use `f pipeTo self` and
 * handle additional messages for implementing advanced features
 *
 */
def receivePluginInternal: Actor.Receive = Actor.emptyBehavior
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/java/akka/persistence/journal/japi/AsyncWritePlugin.java#L13-L74 "Go to snippet source")/**
 * Java API, Plugin API: asynchronously writes a batch (`Iterable`) of persistent messages to the
 * journal.
 *
 * <p>The batch is only for performance reasons, i.e. all messages don't have to be written
 * atomically. Higher throughput can typically be achieved by using batch inserts of many records
 * compared to inserting records one-by-one, but this aspect depends on the underlying data store
 * and a journal implementation can implement it as efficient as possible. Journals should aim to
 * persist events in-order for a given `persistenceId` as otherwise in case of a failure, the
 * persistent state may be end up being inconsistent.
 *
 * <p>Each `AtomicWrite` message contains the single `PersistentRepr` that corresponds to the
 * event that was passed to the `persist` method of the `PersistentActor`, or it contains several
 * `PersistentRepr` that corresponds to the events that were passed to the `persistAll` method of
 * the `PersistentActor`. All `PersistentRepr` of the `AtomicWrite` must be written to the data
 * store atomically, i.e. all or none must be stored. If the journal (data store) cannot support
 * atomic writes of multiple events it should reject such writes with an `Optional` with an
 * `UnsupportedOperationException` describing the issue. This limitation should also be documented
 * by the journal plugin.
 *
 * <p>If there are failures when storing any of the messages in the batch the returned `Future`
 * must be completed with failure. The `Future` must only be completed with success when all
 * messages in the batch have been confirmed to be stored successfully, i.e. they will be
 * readable, and visible, in a subsequent replay. If there is uncertainty about if the messages
 * were stored or not the `Future` must be completed with failure.
 *
 * <p>Data store connection problems must be signaled by completing the `Future` with failure.
 *
 * <p>The journal can also signal that it rejects individual messages (`AtomicWrite`) by the
 * returned `Iterable<Optional<Exception>>`. The returned `Iterable` must have as many
 * elements as the input `messages` `Iterable`. Each `Optional` element signals if the
 * corresponding `AtomicWrite` is rejected or not, with an exception describing the problem.
 * Rejecting a message means it was not stored, i.e. it must not be included in a later replay.
 * Rejecting a message is typically done before attempting to store it, e.g. because of
 * serialization error.
 *
 * <p>Data store connection problems must not be signaled as rejections.
 *
 * <p>Note that it is possible to reduce number of allocations by caching some result `Iterable`
 * for the happy path, i.e. when no messages are rejected.
 *
 * <p>Calls to this method are serialized by the enclosing journal actor. If you spawn work in
 * asynchronous tasks it is alright that they complete the futures in any order, but the actual
 * writes for a specific persistenceId should be serialized to avoid issues such as events of a
 * later write are visible to consumers (query side, or replay) before the events of an earlier
 * write are visible. This can also be done with consistent hashing if it is too fine grained to
 * do it on the persistenceId level. Normally a `PersistentActor` will only have one outstanding
 * write request to the journal but it may emit several write requests when `persistAsync` is used
 * and the max batch size is reached.
 *
 * <p>This call is protected with a circuit-breaker.
 */
Future<Iterable<Optional<Exception>>> doAsyncWriteMessages(Iterable<AtomicWrite> messages);

/**
 * Java API, Plugin API: synchronously deletes all persistent messages up to `toSequenceNr`.
 *
 * <p>This call is protected with a circuit-breaker.
 *
 * @see AsyncRecoveryPlugin
 */
Future<Void> doAsyncDeleteMessagesTo(String persistenceId, long toSequenceNr);
```

If the storage backend API only supports synchronous, blocking writes, the methods should be implemented as:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L160-L164 "Go to snippet source")def asyncWriteMessages(messages: immutable.Seq[AtomicWrite]): Future[immutable.Seq[Try[Unit]]] =
  Future.fromTry(Try {
    // blocking call here
    ???
  })
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistencePluginDocTest.java#L98-L109 "Go to snippet source")@Override
public Future<Iterable<Optional<Exception>>> doAsyncWriteMessages(
    Iterable<AtomicWrite> messages) {
  try {
    Iterable<Optional<Exception>> result = new ArrayList<Optional<Exception>>();
    // blocking call here...
    // result.add(..)
    return Futures.successful(result);
  } catch (Exception e) {
    return Futures.failed(e);
  }
}
```

A journal plugin must also implement the methods defined in `AsyncRecovery` for replays and sequence number recovery:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/AsyncRecovery.scala#L16-L72 "Go to snippet source")/**
 * Plugin API: asynchronously replays persistent messages. Implementations replay
 * a message by calling `replayCallback`. The returned future must be completed
 * when all messages (matching the sequence number bounds) have been replayed.
 * The future must be completed with a failure if any of the persistent messages
 * could not be replayed.
 *
 * The `replayCallback` must also be called with messages that have been marked
 * as deleted. In this case a replayed message's `deleted` method must return
 * `true`.
 *
 * The `toSequenceNr` is the lowest of what was returned by [[#asyncReadHighestSequenceNr]]
 * and what the user specified as recovery [[akka.persistence.Recovery]] parameter.
 * This does imply that this call is always preceded by reading the highest sequence
 * number for the given `persistenceId`.
 *
 * A special case is `fromSequenceNr` of -1, which means that only the last message if any
 * should be replayed.
 *
 * This call is NOT protected with a circuit-breaker because it may take long time
 * to replay all events. The plugin implementation itself must protect against
 * an unresponsive backend store and make sure that the returned Future is
 * completed with success or failure within reasonable time. It is not allowed
 * to ignore completing the future.
 *
 * @param persistenceId persistent actor id.
 * @param fromSequenceNr sequence number where replay should start (inclusive).
 * @param toSequenceNr sequence number where replay should end (inclusive).
 * @param max maximum number of messages to be replayed.
 * @param recoveryCallback called to replay a single message. Can be called from any
 *                       thread.
 * @see [[AsyncWriteJournal]]
 */
def asyncReplayMessages(persistenceId: String, fromSequenceNr: Long, toSequenceNr: Long, max: Long)(
    recoveryCallback: PersistentRepr => Unit): Future[Unit]

/**
 * Plugin API: asynchronously reads the highest stored sequence number for the
 * given `persistenceId`. The persistent actor will use the highest sequence
 * number after recovery as the starting point when persisting new events.
 * This sequence number is also used as `toSequenceNr` in subsequent call
 * to [[#asyncReplayMessages]] unless the user has specified a lower `toSequenceNr`.
 * Journal must maintain the highest sequence number and never decrease it.
 *
 * This call is protected with a circuit-breaker.
 *
 * Please also note that requests for the highest sequence number may be made concurrently
 * to writes executing for the same `persistenceId`, in particular it is possible that
 * a restarting actor tries to recover before its outstanding writes have completed.
 *
 * @param persistenceId persistent actor id.
 * @param fromSequenceNr hint where to start searching for the highest sequence
 *                       number. When a persistent actor is recovering this
 *                       `fromSequenceNr` will be the sequence number of the used
 *                       snapshot or `0L` if no snapshot is used.
 */
def asyncReadHighestSequenceNr(persistenceId: String, fromSequenceNr: Long): Future[Long]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/java/akka/persistence/journal/japi/AsyncRecoveryPlugin.java#L13-L49 "Go to snippet source")/**
 * Java API, Plugin API: asynchronously replays persistent messages. Implementations replay a
 * message by calling `replayCallback`. The returned future must be completed when all messages
 * (matching the sequence number bounds) have been replayed. The future must be completed with a
 * failure if any of the persistent messages could not be replayed.
 *
 * <p>The `replayCallback` must also be called with messages that have been marked as deleted. In
 * this case a replayed message's `deleted` method must return `true`.
 *
 * <p>The `toSequenceNr` is the lowest of what was returned by {@link
 * #doAsyncReadHighestSequenceNr} and what the user specified as recovery {@link
 * akka.persistence.Recovery} parameter.
 *
 * @param persistenceId id of the persistent actor.
 * @param fromSequenceNr sequence number where replay should start (inclusive).
 * @param toSequenceNr sequence number where replay should end (inclusive).
 * @param max maximum number of messages to be replayed.
 * @param replayCallback called to replay a single message. Can be called from any thread.
 */
Future<Void> doAsyncReplayMessages(
    String persistenceId,
    long fromSequenceNr,
    long toSequenceNr,
    long max,
    Consumer<PersistentRepr> replayCallback);

/**
 * Java API, Plugin API: asynchronously reads the highest stored sequence number for the given
 * `persistenceId`. The persistent actor will use the highest sequence number after recovery as
 * the starting point when persisting new events. This sequence number is also used as
 * `toSequenceNr` in subsequent call to [[#asyncReplayMessages]] unless the user has specified a
 * lower `toSequenceNr`.
 *
 * @param persistenceId id of the persistent actor.
 * @param fromSequenceNr hint where to start searching for the highest sequence number.
 */
Future<Long> doAsyncReadHighestSequenceNr(String persistenceId, long fromSequenceNr);
```

A journal plugin can be activated with the following minimal configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L70-L79 "Go to snippet source")# Path to the journal plugin to be used
akka.persistence.journal.plugin = "my-journal"

# My custom journal plugin
my-journal {
  # Class name of the plugin.
  class = "docs.persistence.MyJournal"
  # Dispatcher for the plugin actor.
  plugin-dispatcher = "akka.actor.default-dispatcher"
}
```

The journal plugin instance is an actor so the methods corresponding to requests from persistent actors are executed sequentially. It may delegate to asynchronous libraries, spawn futures, or delegate to other actors to achieve parallelism.

The journal plugin class must have a constructor with one of these signatures:

- constructor with one `com.typesafe.config.Config` parameter and a `String` parameter for the config path
- constructor with one `com.typesafe.config.Config` parameter
- constructor without parameters

The plugin section of the actor system’s config will be passed in the config constructor parameter. The config path of the plugin is passed in the `String` parameter.

The `plugin-dispatcher` is the dispatcher used for the plugin actor. If not specified, it defaults to `akka.actor.default-dispatcher`.

Don’t run journal tasks/futures on the system default dispatcher, since that might starve other tasks.

## Snapshot store plugin API

A snapshot store plugin must extend the `SnapshotStore` actor and implement the following methods:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/snapshot/SnapshotStore.scala#L123-L174 "Go to snippet source")  
/**
 * Plugin API: asynchronously loads a snapshot.
 *
 * If the future `Option` is `None` then all events will be replayed,
 * i.e. there was no snapshot. If snapshot could not be loaded the `Future`
 * should be completed with failure. That is important because events may
 * have been deleted and just replaying the events might not result in a valid
 * state.
 *
 * This call is protected with a circuit-breaker.
 *
 * @param persistenceId id of the persistent actor.
 * @param criteria selection criteria for loading.
 */
def loadAsync(persistenceId: String, criteria: SnapshotSelectionCriteria): Future[Option[SelectedSnapshot]]

/**
 * Plugin API: asynchronously saves a snapshot.
 *
 * This call is protected with a circuit-breaker.
 *
 * @param metadata snapshot metadata.
 * @param snapshot snapshot.
 */
def saveAsync(metadata: SnapshotMetadata, snapshot: Any): Future[Unit]

/**
 * Plugin API: deletes the snapshot identified by `metadata`.
 *
 * This call is protected with a circuit-breaker.
 *
 * @param metadata snapshot metadata.
 */
def deleteAsync(metadata: SnapshotMetadata): Future[Unit]

/**
 * Plugin API: deletes all snapshots matching `criteria`.
 *
 * This call is protected with a circuit-breaker.
 *
 * @param persistenceId id of the persistent actor.
 * @param criteria selection criteria for deleting.
 */
def deleteAsync(persistenceId: String, criteria: SnapshotSelectionCriteria): Future[Unit]

/**
 * Plugin API
 * Allows plugin implementers to use `f pipeTo self` and
 * handle additional messages for implementing advanced features
 */
def receivePluginInternal: Actor.Receive = Actor.emptyBehavior
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/java/akka/persistence/snapshot/japi/SnapshotStorePlugin.java#L15-L45 "Go to snippet source")/**
 * Java API, Plugin API: asynchronously loads a snapshot.
 *
 * @param persistenceId id of the persistent actor.
 * @param criteria selection criteria for loading.
 */
Future<Optional<SelectedSnapshot>> doLoadAsync(
    String persistenceId, SnapshotSelectionCriteria criteria);

/**
 * Java API, Plugin API: asynchronously saves a snapshot.
 *
 * @param metadata snapshot metadata.
 * @param snapshot snapshot.
 */
Future<Void> doSaveAsync(SnapshotMetadata metadata, Object snapshot);

/**
 * Java API, Plugin API: deletes the snapshot identified by `metadata`.
 *
 * @param metadata snapshot metadata.
 */
Future<Void> doDeleteAsync(SnapshotMetadata metadata);

/**
 * Java API, Plugin API: deletes all snapshots matching `criteria`.
 *
 * @param persistenceId id of the persistent actor.
 * @param criteria selection criteria for deleting.
 */
Future<Void> doDeleteAsync(String persistenceId, SnapshotSelectionCriteria criteria);
```

A snapshot store plugin can be activated with the following minimal configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L83-L92 "Go to snippet source")# Path to the snapshot store plugin to be used
akka.persistence.snapshot-store.plugin = "my-snapshot-store"

# My custom snapshot store plugin
my-snapshot-store {
  # Class name of the plugin.
  class = "docs.persistence.MySnapshotStore"
  # Dispatcher for the plugin actor.
  plugin-dispatcher = "akka.actor.default-dispatcher"
}
```

The snapshot store instance is an actor so the methods corresponding to requests from persistent actors are executed sequentially. It may delegate to asynchronous libraries, spawn futures, or delegate to other actors to achieve parallelism.

The snapshot store plugin class must have a constructor with one of these signatures:

- constructor with one `com.typesafe.config.Config` parameter and a `String` parameter for the config path
- constructor with one `com.typesafe.config.Config` parameter
- constructor without parameters

The plugin section of the actor system’s config will be passed in the config constructor parameter. The config path of the plugin is passed in the `String` parameter.

The `plugin-dispatcher` is the dispatcher used for the plugin actor. If not specified, it defaults to `akka.actor.default-dispatcher`.

Don’t run snapshot store tasks/futures on the system default dispatcher, since that might starve other tasks.

## Plugin TCK

In order to help developers build correct and high quality storage plugins, we provide a Technology Compatibility Kit ([TCK](https://en.wikipedia.org/wiki/Technology_Compatibility_Kit) for short).

The TCK is usable from Java as well as Scala projects. To test your implementation (independently of language) you need to include the akka\-persistence\-tck dependency.

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-tck" % AkkaVersion
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
    <artifactId>akka-persistence-tck_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-persistence-tck_${versions.ScalaBinary}"
}
```

To include the Journal TCK tests in your test suite simply extend the provided `JournalSpec``JavaJournalSpec`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L191-L200 "Go to snippet source")class MyJournalSpec
    extends JournalSpec(
      config = ConfigFactory.parseString("""akka.persistence.journal.plugin = "my.journal.plugin"""")) {

  override def supportsRejectingNonSerializableObjects: CapabilityFlag =
    false // or CapabilityFlag.off

  override def supportsSerialization: CapabilityFlag =
    true // or CapabilityFlag.on
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistencePluginDocTest.java#L136-L150 "Go to snippet source")@RunWith(JUnitRunner.class)
class MyJournalSpecTest extends JavaJournalSpec {

  public MyJournalSpecTest() {
    super(
        ConfigFactory.parseString(
            "akka.persistence.journal.plugin = "
                + "\"akka.persistence.journal.leveldb-shared\""));
  }

  @Override
  public CapabilityFlag supportsRejectingNonSerializableObjects() {
    return CapabilityFlag.off();
  }
}
```

Please note that some of the tests are optional, and by overriding the `supports...` methods you give the TCK the needed information about which tests to run. You can implement these methods using boolean values or the provided `CapabilityFlag.on` / `CapabilityFlag.off` values.

We also provide a simple benchmarking class `JournalPerfSpec``JavaJournalPerfSpec` which includes all the tests that `JournalSpec``JavaJournalSpec` has, and also performs some longer operations on the Journal while printing its performance stats. While it is NOT aimed to provide a proper benchmarking environment it can be used to get a rough feel about your journal’s performance in the most typical scenarios.

In order to include the `SnapshotStore` TCK tests in your test suite extend the `SnapshotStoreSpec`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L207-L215 "Go to snippet source")class MySnapshotStoreSpec
    extends SnapshotStoreSpec(
      config = ConfigFactory.parseString("""
    akka.persistence.snapshot-store.plugin = "my.snapshot-store.plugin"
    """)) {

  override def supportsSerialization: CapabilityFlag =
    true // or CapabilityFlag.on
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistencePluginDocTest.java#L157-L166 "Go to snippet source")@RunWith(JUnitRunner.class)
class MySnapshotStoreTest extends JavaSnapshotStoreSpec {

  public MySnapshotStoreTest() {
    super(
        ConfigFactory.parseString(
            "akka.persistence.snapshot-store.plugin = "
                + "\"akka.persistence.snapshot-store.local\""));
  }
}
```

In case your plugin requires some setting up (starting a mock database, removing temporary files etc.) you can override the `beforeAll` and `afterAll` methods to hook into the tests lifecycle:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L225-L247 "Go to snippet source")class MyJournalSpec
    extends JournalSpec(config = ConfigFactory.parseString("""
    akka.persistence.journal.plugin = "my.journal.plugin"
    """)) {

  override def supportsRejectingNonSerializableObjects: CapabilityFlag =
    true // or CapabilityFlag.on

  val storageLocations = List(
    new File(system.settings.config.getString("akka.persistence.journal.leveldb.dir")),
    new File(config.getString("akka.persistence.snapshot-store.local.dir")))

  override def beforeAll(): Unit = {
    super.beforeAll()
    storageLocations.foreach(FileUtils.deleteRecursively)
  }

  override def afterAll(): Unit = {
    storageLocations.foreach(FileUtils.deleteRecursively)
    super.afterAll()
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistencePluginDocTest.java#L174-L212 "Go to snippet source")@RunWith(JUnitRunner.class)
class MyJournalSpecTest extends JavaJournalSpec {

  List<File> storageLocations = new ArrayList<File>();

  public MyJournalSpecTest() {
    super(
        ConfigFactory.parseString(
            "persistence.journal.plugin = "
                + "\"akka.persistence.journal.leveldb-shared\""));

    Config config = system().settings().config();
    storageLocations.add(
        new File(config.getString("akka.persistence.journal.leveldb.dir")));
    storageLocations.add(
        new File(config.getString("akka.persistence.snapshot-store.local.dir")));
  }

  @Override
  public CapabilityFlag supportsRejectingNonSerializableObjects() {
    return CapabilityFlag.on();
  }

  @Override
  public void beforeAll() {
    for (File storageLocation : storageLocations) {
      FileUtils.deleteRecursively(storageLocation);
    }
    super.beforeAll();
  }

  @Override
  public void afterAll() {
    super.afterAll();
    for (File storageLocation : storageLocations) {
      FileUtils.deleteRecursively(storageLocation);
    }
  }
}
```

We *highly recommend* including these specifications in your test suite, as they cover a broad range of cases you might have otherwise forgotten to test for when writing a plugin from scratch.

## Corrupt event logs

If a journal can’t prevent users from running persistent actors with the same `persistenceId` concurrently it is likely that an event log will be corrupted by having events with the same sequence number.

It is recommended that journals should still deliver these events during recovery so that a `replay-filter` can be used to decide what to do about it in a journal agnostic way.

## Code Examples

### Example 1: Persistence - Building a storage backend

```scala
import akka.persistence._
import akka.persistence.journal._
import akka.persistence.snapshot._
```

### Example 2: Persistence - Building a storage backend

```java
import akka.dispatch.Futures;
import akka.persistence.*;
import akka.persistence.journal.japi.*;
import akka.persistence.snapshot.japi.*;
```

### Example 3: Journal plugin API

```scala
/**
 * Plugin API: asynchronously writes a batch (`Seq`) of persistent messages to the
 * journal.
 *
 * The batch is only for performance reasons, i.e. all messages don't have to be written
 * atomically. Higher throughput can typically be achieved by using batch inserts of many
 * records compared to inserting records one-by-one, but this aspect depends on the
 * underlying data store and a journal implementation can implement it as efficient as
 * possible. Journals should aim to persist events in-order for a given `persistenceId`
 * as otherwise in case of a failure, the persistent state may be end up being inconsistent.
 *
 * Each `AtomicWrite` message contains the single `PersistentRepr` that corresponds to
 * the event that was passed to the `persist` method of the `PersistentActor`, or it
 * contains several `PersistentRepr` that corresponds to the events that were passed
 * to the `persistAll` method of the `PersistentActor`. All `PersistentRepr` of the
 * `AtomicWrite` must be written to the data store atomically, i.e. all or none must
 * be stored. If the journal (data store) cannot support atomic writes of multiple
 * events it should reject such writes with a `Try` `Failure` with an
 * `UnsupportedOperationException` describing the issue. This limitation should
 * also be documented by the journal plugin.
 *
 * If there are failures when storing any of the messages in the batch the returned
 * `Future` must be completed with failure. The `Future` must only be completed with
 * success when all messages in the batch have been confirmed to be stored successfully,
 * i.e. they will be readable, and visible, in a subsequent replay. If there is
 * uncertainty about if the messages were stored or not the `Future` must be completed
 * with failure.
 *
 * Data store connection problems must be signaled by completing the `Future` with
 * failure.
 *
 * The journal can also signal that it rejects individual messages (`AtomicWrite`) by
 * the returned `immutable.Seq[Try[Unit]]`. It is possible but not mandatory to reduce
 * number of allocations by returning `Future.successful(Nil)` for the happy path,
 * i.e. when no messages are rejected. Otherwise the returned `Seq` must have as many elements
 * as the input `messages` `Seq`. Each `Try` element signals if the corresponding
 * `AtomicWrite` is rejected or not, with an exception describing the problem. Rejecting
 * a message means it was not stored, i.e. it must not be included in a later replay.
 * Rejecting a message is typically done before attempting to store it, e.g. because of
 * serialization error.
 *
 * Data store connection problems must not be signaled as rejections.
 *
 * It is possible but not mandatory to reduce number of allocations by returning
 * `Future.successful(Nil)` for the happy path, i.e. when no messages are rejected.
 *
 * Calls to this method are serialized by the enclosing journal actor. If you spawn
 * work in asynchronous tasks it is alright that they complete the futures in any order,
 * but the actual writes for a specific persistenceId should be serialized to avoid
 * issues such as events of a later write are visible to consumers (query side, or replay)
 * before the events of an earlier write are visible.
 * A PersistentActor will not send a new WriteMessages request before the previous one
 * has been completed.
 *
 * Please note that the `sender` field of the contained PersistentRepr objects has been
 * nulled out (i.e. set to `ActorRef.noSender`) in order to not use space in the journal
 * for a sender reference that will likely be obsolete during replay.
 *
 * Please also note that requests for the highest sequence number may be made concurrently
 * to this call executing for the same `persistenceId`, in particular it is possible that
 * a restarting actor tries to recover before its outstanding writes have completed. In
 * the latter case it is highly desirable to defer reading the highest sequence number
 * until all outstanding writes have completed, otherwise the PersistentActor may reuse
 * sequence numbers.
 *
 * This call is protected with a circuit-breaker.
 */
def asyncWriteMessages(messages: immutable.Seq[AtomicWrite]): Future[immutable.Seq[Try[Unit]]]

/**
 * Plugin API: asynchronously deletes all persistent messages up to `toSequenceNr`
 * (inclusive).
 *
 * This call is protected with a circuit-breaker.
 * Message deletion doesn't affect the highest sequence number of messages,
 * journal must maintain the highest sequence number and never decrease it.
 */
def asyncDeleteMessagesTo(persistenceId: String, toSequenceNr: Long): Future[Unit]

/**
 * Plugin API
 *
 * Allows plugin implementers to use `f pipeTo self` and
 * handle additional messages for implementing advanced features
 *
 */
def receivePluginInternal: Actor.Receive = Actor.emptyBehavior
```

### Example 4: Journal plugin API

```java
/**
 * Java API, Plugin API: asynchronously writes a batch (`Iterable`) of persistent messages to the
 * journal.
 *
 * <p>The batch is only for performance reasons, i.e. all messages don't have to be written
 * atomically. Higher throughput can typically be achieved by using batch inserts of many records
 * compared to inserting records one-by-one, but this aspect depends on the underlying data store
 * and a journal implementation can implement it as efficient as possible. Journals should aim to
 * persist events in-order for a given `persistenceId` as otherwise in case of a failure, the
 * persistent state may be end up being inconsistent.
 *
 * <p>Each `AtomicWrite` message contains the single `PersistentRepr` that corresponds to the
 * event that was passed to the `persist` method of the `PersistentActor`, or it contains several
 * `PersistentRepr` that corresponds to the events that were passed to the `persistAll` method of
 * the `PersistentActor`. All `PersistentRepr` of the `AtomicWrite` must be written to the data
 * store atomically, i.e. all or none must be stored. If the journal (data store) cannot support
 * atomic writes of multiple events it should reject such writes with an `Optional` with an
 * `UnsupportedOperationException` describing the issue. This limitation should also be documented
 * by the journal plugin.
 *
 * <p>If there are failures when storing any of the messages in the batch the returned `Future`
 * must be completed with failure. The `Future` must only be completed with success when all
 * messages in the batch have been confirmed to be stored successfully, i.e. they will be
 * readable, and visible, in a subsequent replay. If there is uncertainty about if the messages
 * were stored or not the `Future` must be completed with failure.
 *
 * <p>Data store connection problems must be signaled by completing the `Future` with failure.
 *
 * <p>The journal can also signal that it rejects individual messages (`AtomicWrite`) by the
 * returned `Iterable&lt;Optional&lt;Exception&gt;&gt;`. The returned `Iterable` must have as many
 * elements as the input `messages` `Iterable`. Each `Optional` element signals if the
 * corresponding `AtomicWrite` is rejected or not, with an exception describing the problem.
 * Rejecting a message means it was not stored, i.e. it must not be included in a later replay.
 * Rejecting a message is typically done before attempting to store it, e.g. because of
 * serialization error.
 *
 * <p>Data store connection problems must not be signaled as rejections.
 *
 * <p>Note that it is possible to reduce number of allocations by caching some result `Iterable`
 * for the happy path, i.e. when no messages are rejected.
 *
 * <p>Calls to this method are serialized by the enclosing journal actor. If you spawn work in
 * asynchronous tasks it is alright that they complete the futures in any order, but the actual
 * writes for a specific persistenceId should be serialized to avoid issues such as events of a
 * later write are visible to consumers (query side, or replay) before the events of an earlier
 * write are visible. This can also be done with consistent hashing if it is too fine grained to
 * do it on the persistenceId level. Normally a `PersistentActor` will only have one outstanding
 * write request to the journal but it may emit several write requests when `persistAsync` is used
 * and the max batch size is reached.
 *
 * <p>This call is protected with a circuit-breaker.
 */
Future<Iterable<Optional<Exception>>> doAsyncWriteMessages(Iterable<AtomicWrite> messages);

/**
 * Java API, Plugin API: synchronously deletes all persistent messages up to `toSequenceNr`.
 *
 * <p>This call is protected with a circuit-breaker.
 *
 * @see AsyncRecoveryPlugin
 */
Future<Void> doAsyncDeleteMessagesTo(String persistenceId, long toSequenceNr);
```

### Example 5: Journal plugin API

```scala
def asyncWriteMessages(messages: immutable.Seq[AtomicWrite]): Future[immutable.Seq[Try[Unit]]] =
  Future.fromTry(Try {
    // blocking call here
    ???
  })
```

### Example 6: Journal plugin API

```java
@Override
public Future<Iterable<Optional<Exception>>> doAsyncWriteMessages(
    Iterable<AtomicWrite> messages) {
  try {
    Iterable<Optional<Exception>> result = new ArrayList<Optional<Exception>>();
    // blocking call here...
    // result.add(..)
    return Futures.successful(result);
  } catch (Exception e) {
    return Futures.failed(e);
  }
}
```

### Example 7: Journal plugin API

```scala
/**
 * Plugin API: asynchronously replays persistent messages. Implementations replay
 * a message by calling `replayCallback`. The returned future must be completed
 * when all messages (matching the sequence number bounds) have been replayed.
 * The future must be completed with a failure if any of the persistent messages
 * could not be replayed.
 *
 * The `replayCallback` must also be called with messages that have been marked
 * as deleted. In this case a replayed message's `deleted` method must return
 * `true`.
 *
 * The `toSequenceNr` is the lowest of what was returned by [[#asyncReadHighestSequenceNr]]
 * and what the user specified as recovery [[akka.persistence.Recovery]] parameter.
 * This does imply that this call is always preceded by reading the highest sequence
 * number for the given `persistenceId`.
 *
 * A special case is `fromSequenceNr` of -1, which means that only the last message if any
 * should be replayed.
 *
 * This call is NOT protected with a circuit-breaker because it may take long time
 * to replay all events. The plugin implementation itself must protect against
 * an unresponsive backend store and make sure that the returned Future is
 * completed with success or failure within reasonable time. It is not allowed
 * to ignore completing the future.
 *
 * @param persistenceId persistent actor id.
 * @param fromSequenceNr sequence number where replay should start (inclusive).
 * @param toSequenceNr sequence number where replay should end (inclusive).
 * @param max maximum number of messages to be replayed.
 * @param recoveryCallback called to replay a single message. Can be called from any
 *                       thread.
 * @see [[AsyncWriteJournal]]
 */
def asyncReplayMessages(persistenceId: String, fromSequenceNr: Long, toSequenceNr: Long, max: Long)(
    recoveryCallback: PersistentRepr => Unit): Future[Unit]

/**
 * Plugin API: asynchronously reads the highest stored sequence number for the
 * given `persistenceId`. The persistent actor will use the highest sequence
 * number after recovery as the starting point when persisting new events.
 * This sequence number is also used as `toSequenceNr` in subsequent call
 * to [[#asyncReplayMessages]] unless the user has specified a lower `toSequenceNr`.
 * Journal must maintain the highest sequence number and never decrease it.
 *
 * This call is protected with a circuit-breaker.
 *
 * Please also note that requests for the highest sequence number may be made concurrently
 * to writes executing for the same `persistenceId`, in particular it is possible that
 * a restarting actor tries to recover before its outstanding writes have completed.
 *
 * @param persistenceId persistent actor id.
 * @param fromSequenceNr hint where to start searching for the highest sequence
 *                       number. When a persistent actor is recovering this
 *                       `fromSequenceNr` will be the sequence number of the used
 *                       snapshot or `0L` if no snapshot is used.
 */
def asyncReadHighestSequenceNr(persistenceId: String, fromSequenceNr: Long): Future[Long]
```

### Example 8: Journal plugin API

```java
/**
 * Java API, Plugin API: asynchronously replays persistent messages. Implementations replay a
 * message by calling `replayCallback`. The returned future must be completed when all messages
 * (matching the sequence number bounds) have been replayed. The future must be completed with a
 * failure if any of the persistent messages could not be replayed.
 *
 * <p>The `replayCallback` must also be called with messages that have been marked as deleted. In
 * this case a replayed message's `deleted` method must return `true`.
 *
 * <p>The `toSequenceNr` is the lowest of what was returned by {@link
 * #doAsyncReadHighestSequenceNr} and what the user specified as recovery {@link
 * akka.persistence.Recovery} parameter.
 *
 * @param persistenceId id of the persistent actor.
 * @param fromSequenceNr sequence number where replay should start (inclusive).
 * @param toSequenceNr sequence number where replay should end (inclusive).
 * @param max maximum number of messages to be replayed.
 * @param replayCallback called to replay a single message. Can be called from any thread.
 */
Future<Void> doAsyncReplayMessages(
    String persistenceId,
    long fromSequenceNr,
    long toSequenceNr,
    long max,
    Consumer<PersistentRepr> replayCallback);

/**
 * Java API, Plugin API: asynchronously reads the highest stored sequence number for the given
 * `persistenceId`. The persistent actor will use the highest sequence number after recovery as
 * the starting point when persisting new events. This sequence number is also used as
 * `toSequenceNr` in subsequent call to [[#asyncReplayMessages]] unless the user has specified a
 * lower `toSequenceNr`.
 *
 * @param persistenceId id of the persistent actor.
 * @param fromSequenceNr hint where to start searching for the highest sequence number.
 */
Future<Long> doAsyncReadHighestSequenceNr(String persistenceId, long fromSequenceNr);
```

### Example 9: Journal plugin API

```scala
# Path to the journal plugin to be used
akka.persistence.journal.plugin = "my-journal"

# My custom journal plugin
my-journal {
  # Class name of the plugin.
  class = "docs.persistence.MyJournal"
  # Dispatcher for the plugin actor.
  plugin-dispatcher = "akka.actor.default-dispatcher"
}
```

### Example 10: Snapshot store plugin API

```scala
/**
 * Plugin API: asynchronously loads a snapshot.
 *
 * If the future `Option` is `None` then all events will be replayed,
 * i.e. there was no snapshot. If snapshot could not be loaded the `Future`
 * should be completed with failure. That is important because events may
 * have been deleted and just replaying the events might not result in a valid
 * state.
 *
 * This call is protected with a circuit-breaker.
 *
 * @param persistenceId id of the persistent actor.
 * @param criteria selection criteria for loading.
 */
def loadAsync(persistenceId: String, criteria: SnapshotSelectionCriteria): Future[Option[SelectedSnapshot]]

/**
 * Plugin API: asynchronously saves a snapshot.
 *
 * This call is protected with a circuit-breaker.
 *
 * @param metadata snapshot metadata.
 * @param snapshot snapshot.
 */
def saveAsync(metadata: SnapshotMetadata, snapshot: Any): Future[Unit]

/**
 * Plugin API: deletes the snapshot identified by `metadata`.
 *
 * This call is protected with a circuit-breaker.
 *
 * @param metadata snapshot metadata.
 */
def deleteAsync(metadata: SnapshotMetadata): Future[Unit]

/**
 * Plugin API: deletes all snapshots matching `criteria`.
 *
 * This call is protected with a circuit-breaker.
 *
 * @param persistenceId id of the persistent actor.
 * @param criteria selection criteria for deleting.
 */
def deleteAsync(persistenceId: String, criteria: SnapshotSelectionCriteria): Future[Unit]

/**
 * Plugin API
 * Allows plugin implementers to use `f pipeTo self` and
 * handle additional messages for implementing advanced features
 */
def receivePluginInternal: Actor.Receive = Actor.emptyBehavior
```

### Example 11: Snapshot store plugin API

```java
/**
 * Java API, Plugin API: asynchronously loads a snapshot.
 *
 * @param persistenceId id of the persistent actor.
 * @param criteria selection criteria for loading.
 */
Future<Optional<SelectedSnapshot>> doLoadAsync(
    String persistenceId, SnapshotSelectionCriteria criteria);

/**
 * Java API, Plugin API: asynchronously saves a snapshot.
 *
 * @param metadata snapshot metadata.
 * @param snapshot snapshot.
 */
Future<Void> doSaveAsync(SnapshotMetadata metadata, Object snapshot);

/**
 * Java API, Plugin API: deletes the snapshot identified by `metadata`.
 *
 * @param metadata snapshot metadata.
 */
Future<Void> doDeleteAsync(SnapshotMetadata metadata);

/**
 * Java API, Plugin API: deletes all snapshots matching `criteria`.
 *
 * @param persistenceId id of the persistent actor.
 * @param criteria selection criteria for deleting.
 */
Future<Void> doDeleteAsync(String persistenceId, SnapshotSelectionCriteria criteria);
```

### Example 12: Snapshot store plugin API

```scala
# Path to the snapshot store plugin to be used
akka.persistence.snapshot-store.plugin = "my-snapshot-store"

# My custom snapshot store plugin
my-snapshot-store {
  # Class name of the plugin.
  class = "docs.persistence.MySnapshotStore"
  # Dispatcher for the plugin actor.
  plugin-dispatcher = "akka.actor.default-dispatcher"
}
```

### Example 13: Plugin TCK

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-tck" % AkkaVersion
```

### Example 14: Plugin TCK

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
    <artifactId>akka-persistence-tck_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 15: Plugin TCK

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-persistence-tck_${versions.ScalaBinary}"
}
```

### Example 16: Plugin TCK

```scala
class MyJournalSpec
    extends JournalSpec(
      config = ConfigFactory.parseString("""akka.persistence.journal.plugin = "my.journal.plugin"""")) {

  override def supportsRejectingNonSerializableObjects: CapabilityFlag =
    false // or CapabilityFlag.off

  override def supportsSerialization: CapabilityFlag =
    true // or CapabilityFlag.on
}
```

### Example 17: Plugin TCK

```java
@RunWith(JUnitRunner.class)
class MyJournalSpecTest extends JavaJournalSpec {

  public MyJournalSpecTest() {
    super(
        ConfigFactory.parseString(
            "akka.persistence.journal.plugin = "
                + "\"akka.persistence.journal.leveldb-shared\""));
  }

  @Override
  public CapabilityFlag supportsRejectingNonSerializableObjects() {
    return CapabilityFlag.off();
  }
}
```

### Example 18: Plugin TCK

```scala
class MySnapshotStoreSpec
    extends SnapshotStoreSpec(
      config = ConfigFactory.parseString("""
    akka.persistence.snapshot-store.plugin = "my.snapshot-store.plugin"
    """)) {

  override def supportsSerialization: CapabilityFlag =
    true // or CapabilityFlag.on
}
```

### Example 19: Plugin TCK

```java
@RunWith(JUnitRunner.class)
class MySnapshotStoreTest extends JavaSnapshotStoreSpec {

  public MySnapshotStoreTest() {
    super(
        ConfigFactory.parseString(
            "akka.persistence.snapshot-store.plugin = "
                + "\"akka.persistence.snapshot-store.local\""));
  }
}
```

### Example 20: Plugin TCK

```scala
class MyJournalSpec
    extends JournalSpec(config = ConfigFactory.parseString("""
    akka.persistence.journal.plugin = "my.journal.plugin"
    """)) {

  override def supportsRejectingNonSerializableObjects: CapabilityFlag =
    true // or CapabilityFlag.on

  val storageLocations = List(
    new File(system.settings.config.getString("akka.persistence.journal.leveldb.dir")),
    new File(config.getString("akka.persistence.snapshot-store.local.dir")))

  override def beforeAll(): Unit = {
    super.beforeAll()
    storageLocations.foreach(FileUtils.deleteRecursively)
  }

  override def afterAll(): Unit = {
    storageLocations.foreach(FileUtils.deleteRecursively)
    super.afterAll()
  }

}
```

### Example 21: Plugin TCK

```java
@RunWith(JUnitRunner.class)
class MyJournalSpecTest extends JavaJournalSpec {

  List<File> storageLocations = new ArrayList<File>();

  public MyJournalSpecTest() {
    super(
        ConfigFactory.parseString(
            "persistence.journal.plugin = "
                + "\"akka.persistence.journal.leveldb-shared\""));

    Config config = system().settings().config();
    storageLocations.add(
        new File(config.getString("akka.persistence.journal.leveldb.dir")));
    storageLocations.add(
        new File(config.getString("akka.persistence.snapshot-store.local.dir")));
  }

  @Override
  public CapabilityFlag supportsRejectingNonSerializableObjects() {
    return CapabilityFlag.on();
  }

  @Override
  public void beforeAll() {
    for (File storageLocation : storageLocations) {
      FileUtils.deleteRecursively(storageLocation);
    }
    super.beforeAll();
  }

  @Override
  public void afterAll() {
    super.afterAll();
    for (File storageLocation : storageLocations) {
      FileUtils.deleteRecursively(storageLocation);
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/persistence-plugins.html
- https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-db-transport.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/persistence-journals.html](https://doc.akka.io/libraries/akka-core/current/persistence-journals.html)*