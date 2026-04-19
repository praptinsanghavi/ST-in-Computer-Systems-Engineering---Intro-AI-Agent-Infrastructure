---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:25Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/persistence-plugins.html
title: Persistence Plugins • Akka core
---

# Persistence Plugins • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Persistence Plugins

Storage backends for journals, snapshot stores, durable state stores and persistence queries are pluggable in the Akka persistence extension. The following plugins are maintained by the Akka team.

## R2DBC plugin

The Reactive database drivers (R2DBC) support relational databases like PostgreSQL, H2 (As a minimal in\-process memory or file based database) and Yugabyte.

The [Akka Persistence R2DBC plugin](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/) supports the latest feature additions of Akka Persistence and is generally recommended over the JDBC\-based plugin.

## Cassandra plugin

Akka supports Cassandra’s data model through [Akka Persistence Cassandra](https://doc.akka.io/libraries/akka-persistence-cassandra/current/).

Some later Akka Persistence feature additions (including [Durable State](typed/index-persistence-durable-state.html)) are not supported by the Cassandra plugin (see below).

## AWS DynamoDB plugin

AWS DynamoDB can be used as backend for Akka Persistence with the [Akka Persistence DynamoDB plugin](https://doc.akka.io/libraries/akka-persistence-dynamodb/current/).

[Durable State](typed/index-persistence-durable-state.html) is not supported by the DynamoDB plugin.

Recovery from only last event is not supported by the DynamoDB plugin.

## JDBC plugin

Relational databases with JDBC\-drivers are supported through [Akka Persistence JDBC](https://doc.akka.io/libraries/akka-persistence-jdbc/current/). For new projects, the [R2DBC plugin](persistence-plugins.html#r2dbc-plugin) is recommended.

Some later Akka Persistence feature additions are not supported by the Akka Persistence JDBC plugin (see below).

## Feature limitations

Example of concrete features *not* supported by the Cassandra and JDBC plugins:

- `eventsBySlices` query
- Projections over gRPC
- Replicated Event Sourcing over gRPC
- Dynamic scaling of number of Projection instances
- Low latency Projections
- Projections starting from snapshots
- Scalability of many Projections
- Durable State entities (partly supported by JDBC plugin)
- Recovery from only last event

## Enabling a plugin

Plugins can be selected either by “default” for all persistent actors, or “individually”, when a persistent actor defines its own set of plugins.

When a persistent actor does NOT override the `journalPluginId` and `snapshotPluginId` methods, the persistence extension will use the “default” journal, snapshot\-store and durable\-state plugins configured in `reference.conf`:

```
akka.persistence.journal.plugin = ""
akka.persistence.snapshot-store.plugin = ""
akka.persistence.state.plugin = ""

```

However, these entries are provided as empty "", and require explicit user configuration via override in the user `application.conf`.

- For an example of a journal plugin which writes messages to LevelDB see [Local LevelDB journal](persistence-plugins.html#local-leveldb-journal).
- For an example of a snapshot store plugin which writes snapshots as individual files to the local filesystem see [Local snapshot store](persistence-plugins.html#local-snapshot-store).
- The state store is relatively new, one available implementation is the [akka\-persistence\-jdbc\-plugin](https://doc.akka.io/libraries/akka-persistence-jdbc/current/).

## Eager initialization of persistence plugin

By default, persistence plugins are started on\-demand, as they are used. In some case, however, it might be beneficial to start a certain plugin eagerly. In order to do that, you should first add `akka.persistence.Persistence` under the `akka.extensions` key. Then, specify the IDs of plugins you wish to start automatically under `akka.persistence.journal.auto-start-journals` and `akka.persistence.snapshot-store.auto-start-snapshot-stores`.

For example, if you want eager initialization for the leveldb journal plugin and the local snapshot store plugin, your configuration should look like this: 

```
akka {

  extensions = [akka.persistence.Persistence]

  persistence {

    journal {
      plugin = "akka.persistence.journal.leveldb"
      auto-start-journals = ["akka.persistence.journal.leveldb"]
    }

    snapshot-store {
      plugin = "akka.persistence.snapshot-store.local"
      auto-start-snapshot-stores = ["akka.persistence.snapshot-store.local"]
    }

  }

}

```

## Pre\-packaged plugins

The Akka Persistence module comes with few built\-in persistence plugins, but none of these are suitable for production usage in an Akka Cluster. 

### Local LevelDB journal

This plugin writes events to a local LevelDB instance.

Warning
The LevelDB plugin cannot be used in an Akka Cluster since the storage is in a local file system.

The LevelDB journal is deprecated and it is not advised to build new applications with it. As a replacement we recommend using [Akka Persistence JDBC](https://doc.akka.io/libraries/akka-persistence-jdbc/current/index.html).

The LevelDB journal plugin config entry is `akka.persistence.journal.leveldb`. Enable this plugin by defining config property:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L29-L30 "Go to snippet source")# Path to the journal plugin to be used
akka.persistence.journal.plugin = "akka.persistence.journal.leveldb"
```

LevelDB based plugins will also require the following additional dependency declaration:

sbt
```
libraryDependencies += "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8"
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>org.fusesource.leveldbjni</groupId>
    <artifactId>leveldbjni-all</artifactId>
    <version>1.8</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "org.fusesource.leveldbjni:leveldbjni-all:1.8"
}
```

The default location of LevelDB files is a directory named `journal` in the current working directory. This location can be changed by configuration where the specified path can be relative or absolute:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L42 "Go to snippet source")akka.persistence.journal.leveldb.dir = "target/journal"
```

With this plugin, each actor system runs its own private LevelDB instance.

One peculiarity of LevelDB is that the deletion operation does not remove messages from the journal, but adds a “tombstone” for each deleted message instead. In the case of heavy journal usage, especially one including frequent deletes, this may be an issue as users may find themselves dealing with continuously increasing journal sizes. To this end, LevelDB offers a special journal compaction function that is exposed via the following configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L52-L60 "Go to snippet source")# Number of deleted messages per persistence id that will trigger journal compaction
akka.persistence.journal.leveldb.compaction-intervals {
  persistence-id-1 = 100
  persistence-id-2 = 200
  # ...
  persistence-id-N = 1000
  # use wildcards to match unspecified persistence ids, if any
  "*" = 250
}
```

### Shared LevelDB journal

The LevelDB journal is deprecated and will be removed from a future Akka version, it is not advised to build new applications with it. For testing in a multi node environment the “inmem” journal together with the [proxy plugin](persistence-plugins.html#persistence-plugin-proxy) can be used, but the actual journal used in production of applications is also a good choice.

Note
This plugin has been supplanted by [Persistence Plugin Proxy](persistence-plugins.html#persistence-plugin-proxy).

A shared LevelDB instance is started by instantiating the `SharedLeveldbStore` actor.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L151-L153 "Go to snippet source")import akka.persistence.journal.leveldb.SharedLeveldbStore

val store = system.actorOf(Props[SharedLeveldbStore](), "store")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistencePluginDocTest.java#L40 "Go to snippet source")final ActorRef store = system.actorOf(Props.create(SharedLeveldbStore.class), "store");
```

By default, the shared instance writes journaled messages to a local directory named `journal` in the current working directory. The storage location can be changed by configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L122 "Go to snippet source")akka.persistence.journal.leveldb-shared.store.dir = "target/shared"
```

Actor systems that use a shared LevelDB store must activate the `akka.persistence.journal.leveldb-shared` plugin.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L116 "Go to snippet source")akka.persistence.journal.plugin = "akka.persistence.journal.leveldb-shared"
```

This plugin must be initialized by injecting the (remote) `SharedLeveldbStore` actor reference. Injection is done by calling the `SharedLeveldbJournal.setStore` method with the actor reference as argument.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L130-L139 "Go to snippet source")trait SharedStoreUsage extends Actor {
  override def preStart(): Unit = {
    context.actorSelection("akka://[[email protected]](/cdn-cgi/l/email-protection):2552/user/store") ! Identify(1)
  }

  def receive = {
    case ActorIdentity(1, Some(store)) =>
      SharedLeveldbJournal.setStore(store, context.system)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistencePluginDocTest.java#L44-L69 "Go to snippet source")class SharedStorageUsage extends AbstractActor {
  @Override
  public void preStart() throws Exception {
    String path = "akka://[[email protected]](/cdn-cgi/l/email-protection):2552/user/store";
    ActorSelection selection = getContext().actorSelection(path);
    selection.tell(new Identify(1), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ActorIdentity.class,
            ai -> {
              if (ai.correlationId().equals(1)) {
                Optional<ActorRef> store = ai.getActorRef();
                if (store.isPresent()) {
                  SharedLeveldbJournal.setStore(store.get(), getContext().getSystem());
                } else {
                  throw new RuntimeException("Couldn't identify store");
                }
              }
            })
        .build();
  }
}
```

Internal journal commands (sent by persistent actors) are buffered until injection completes. Injection is idempotent i.e. only the first injection is used.

### Local snapshot store

This plugin writes snapshot files to the local filesystem.

Warning
The local snapshot store plugin cannot be used in an Akka Cluster since the storage is in a local file system.

The local snapshot store plugin config entry is `akka.persistence.snapshot-store.local`. Enable this plugin by defining config property:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L34-L35 "Go to snippet source")# Path to the snapshot store plugin to be used
akka.persistence.snapshot-store.plugin = "akka.persistence.snapshot-store.local"
```

The default storage location is a directory named `snapshots` in the current working directory. This can be changed by configuration where the specified path can be relative or absolute:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L45 "Go to snippet source")akka.persistence.snapshot-store.local.dir = "target/snapshots"
```

Note that it is not mandatory to specify a snapshot store plugin. If you don’t use snapshots you don’t have to configure it.

### Persistence Plugin Proxy

For testing purposes a persistence plugin proxy allows sharing of a journal and snapshot store on a single node across multiple actor systems (on the same or on different nodes). This, for example, allows persistent actors to failover to a backup node and continue using the shared journal instance from the backup node. The proxy works by forwarding all the journal/snapshot store messages to a single, shared, persistence plugin instance, and therefore supports any use case supported by the proxied plugin.

Warning
A shared journal/snapshot store is a single point of failure and should only be used for testing purposes.

The journal and snapshot store proxies are controlled via the `akka.persistence.journal.proxy` and `akka.persistence.snapshot-store.proxy` configuration entries, respectively. Set the `target-journal-plugin` or `target-snapshot-store-plugin` keys to the underlying plugin you wish to use (for example: `akka.persistence.journal.inmem`). The `start-target-journal` and `start-target-snapshot-store` keys should be set to `on` in exactly one actor system \- this is the system that will instantiate the shared persistence plugin. Next, the proxy needs to be told how to find the shared plugin. This can be done by setting the `target-journal-address` and `target-snapshot-store-address` configuration keys, or programmatically by calling the `PersistencePluginProxy.setTargetLocation` method.

Note
Akka starts extensions lazily when they are required, and this includes the proxy. This means that in order for the proxy to work, the persistence plugin on the target node must be instantiated. This can be done by instantiating the `PersistencePluginProxyExtension` [extension](extending-akka.html), or by calling the `PersistencePluginProxy.start` method.

Note
The proxied persistence plugin can (and should) be configured using its original configuration keys.

## Code Examples

### Example 1: Enabling a plugin

```text
akka.persistence.journal.plugin = ""
akka.persistence.snapshot-store.plugin = ""
akka.persistence.state.plugin = ""
```

### Example 2: Eager initialization of persistence plugin

```text
akka {

  extensions = [akka.persistence.Persistence]

  persistence {

    journal {
      plugin = "akka.persistence.journal.leveldb"
      auto-start-journals = ["akka.persistence.journal.leveldb"]
    }

    snapshot-store {
      plugin = "akka.persistence.snapshot-store.local"
      auto-start-snapshot-stores = ["akka.persistence.snapshot-store.local"]
    }

  }

}
```

### Example 3: Local LevelDB journal

```scala
# Path to the journal plugin to be used
akka.persistence.journal.plugin = "akka.persistence.journal.leveldb"
```

### Example 4: Local LevelDB journal

```scala
libraryDependencies += "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8"
```

### Example 5: Local LevelDB journal

```xml
<dependencies&gt
  <dependency>
    <groupId>org.fusesource.leveldbjni</groupId>
    <artifactId>leveldbjni-all</artifactId>
    <version>1.8</version>
  </dependency&gt
</dependencies>
```

### Example 6: Local LevelDB journal

```gradle
dependencies {
  implementation "org.fusesource.leveldbjni:leveldbjni-all:1.8"
}
```

### Example 7: Local LevelDB journal

```scala
akka.persistence.journal.leveldb.dir = "target/journal"
```

### Example 8: Local LevelDB journal

```scala
# Number of deleted messages per persistence id that will trigger journal compaction
akka.persistence.journal.leveldb.compaction-intervals {
  persistence-id-1 = 100
  persistence-id-2 = 200
  # ...
  persistence-id-N = 1000
  # use wildcards to match unspecified persistence ids, if any
  "*" = 250
}
```

### Example 9: Shared LevelDB journal

```scala
import akka.persistence.journal.leveldb.SharedLeveldbStore

val store = system.actorOf(Props[SharedLeveldbStore](), "store")
```

### Example 10: Shared LevelDB journal

```java
final ActorRef store = system.actorOf(Props.create(SharedLeveldbStore.class), "store");
```

### Example 11: Shared LevelDB journal

```scala
akka.persistence.journal.leveldb-shared.store.dir = "target/shared"
```

### Example 12: Shared LevelDB journal

```scala
akka.persistence.journal.plugin = "akka.persistence.journal.leveldb-shared"
```

### Example 13: Shared LevelDB journal

```scala
trait SharedStoreUsage extends Actor {
  override def preStart(): Unit = {
    context.actorSelection("akka://[email protected]:2552/user/store") ! Identify(1)
  }

  def receive = {
    case ActorIdentity(1, Some(store)) =>
      SharedLeveldbJournal.setStore(store, context.system)
  }
}
```

### Example 14: Shared LevelDB journal

```java
class SharedStorageUsage extends AbstractActor {
  @Override
  public void preStart() throws Exception {
    String path = "akka://[email protected]:2552/user/store";
    ActorSelection selection = getContext().actorSelection(path);
    selection.tell(new Identify(1), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ActorIdentity.class,
            ai -> {
              if (ai.correlationId().equals(1)) {
                Optional<ActorRef> store = ai.getActorRef();
                if (store.isPresent()) {
                  SharedLeveldbJournal.setStore(store.get(), getContext().getSystem());
                } else {
                  throw new RuntimeException("Couldn't identify store");
                }
              }
            })
        .build();
  }
}
```

### Example 15: Local snapshot store

```scala
# Path to the snapshot store plugin to be used
akka.persistence.snapshot-store.plugin = "akka.persistence.snapshot-store.local"
```

### Example 16: Local snapshot store

```scala
akka.persistence.snapshot-store.local.dir = "target/snapshots"
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/libraries/akka-core/2.10/extending-akka.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-journals.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-plugins.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-query-leveldb.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/index-persistence-durable-state.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/
- https://doc.akka.io/libraries/akka-persistence-dynamodb/current/
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/index.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/persistence-plugins.html](https://doc.akka.io/libraries/akka-core/2.10/persistence-plugins.html)*