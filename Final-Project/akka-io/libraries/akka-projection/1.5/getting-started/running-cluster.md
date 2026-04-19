---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/getting-started/running-cluster.html
title: Running the Projection in Akka Cluster • Akka Projection
---

# Running the Projection in Akka Cluster • Akka Projection

> **Summary:** Akka Projection.

## Content

# Running the Projection in Akka Cluster

Running the Projection with [Akka Cluster](https://doc.akka.io/libraries/akka-core/current/typed/cluster.html) allows us to add two important aspects to our system: availability and scalability. A Projection running as a single Actor creates a single point of failure (availability), when the app shuts down for any reason, the projection is no longer running until it’s started again. A Projection running as a single Actor creates a processing bottleneck (scalability), all messages from the [`SourceProvider`](/api/akka-projection/1.5.9/akka/projection/javadsl/SourceProvider.html "akka.projection.javadsl.SourceProvider")[`SourceProvider`](/api/akka-projection/1.5.9/akka/projection/scaladsl/SourceProvider.html "akka.projection.scaladsl.SourceProvider") are processed by a single Actor on a single machine. By using a [Sharded Daemon Process](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html#sharded-daemon-process) with Akka Cluster and [Akka Cluster Sharding](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html) we can scale up the Projection and make it more available by running at least as many instances of the same Projection as we have cluster members. As Akka cluster members join and leave the cluster the Sharded Daemon Process will automatically scale and rebalance Sharded Daemon Processes (Projection instances) accordingly.

Running the Projection as a Sharded Daemon Process requires no changes to our projection handler and repository, we only need to change the way in which the actor that runs the Projection is initialized. In the cluster version of this app we use a different configuration that configures Akka cluster. The main difference in the app itself is that we use [`ShardedDaemonProcess`](https://doc.akka.io/japi/akka-core/2.9/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html "akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess")[`ShardedDaemonProcess`](https://doc.akka.io/api/akka-core/2.9/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html "akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess") to initialize the Projection actor on our behalf. Instead of creating single instances of our repository and projection handler we create factory methods that encapsulate their instantiation along with the sharded daemon actors (1 per tag) assigned to this cluster member.

Add a new configuration file `guide-shopping-cart-cluster-app.conf` to your `src/main/resources/` directory. This configuration is largely the same as before, but includes extra configuration to enable cluster connectivity and sharding:

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/guide-shopping-cart-cluster-app.conf#L2-L66 "Go to snippet source")datastax-java-driver {
  # basic.contact-points = ["127.0.0.1:9042"]
  # basic.load-balancing-policy.local-datacenter = "datacenter1"
  advanced {
    # reconnect to c* if down when app is started
    reconnect-on-init = true
  }
}

akka {
  loglevel = DEBUG
  actor {
    provider = "cluster"
  }

  # For the sample, just bind to loopback and do not allow access from the network
  # the port is overridden by the logic in main class
  remote.artery {
    canonical.port = 0
    canonical.hostname = 127.0.0.1
  }

  cluster {
    seed-nodes = [
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2551",
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2552"
    ]

    downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
  }

  persistence.journal {
    plugin = "akka.persistence.cassandra.journal"
    auto-start-journals = ["akka.persistence.cassandra.journal"]
  }

  persistence.snapshot-store.plugin = "akka.persistence.cassandra.snapshot"

  persistence {
    cassandra {
      journal {
        # to create the schema
        keyspace-autocreate = true
        tables-autocreate = true
      }

      snapshot {
        # to create the schema
        keyspace-autocreate = true
        tables-autocreate = true
      }

      query {
        refresh-interval = 2s
      }

      events-by-tag {
        # for lower latency
        eventual-consistency-delay = 25ms
        flush-interval = 25ms
        pubsub-notification = on
      }
    }
  }
}
```

Add the `ShoppingCartClusterApp` to your project:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/guide/ShoppingCartClusterApp.scala#L6-L62 "Go to snippet source")package docs.guide

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.persistence.query.Offset
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection
import akka.projection.eventsourced.EventEnvelope
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.SourceProvider
import akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry
import com.typesafe.config.ConfigFactory

object ShoppingCartClusterApp extends App {
  val port = args.headOption match {
    case Some(portString) if portString.matches("""\d+""") => portString.toInt
    case _                                                 => throw new IllegalArgumentException("An akka cluster port argument is required")
  }

  val config = ConfigFactory
    .parseString(s"akka.remote.artery.canonical.port = $port")
    .withFallback(ConfigFactory.load("guide-shopping-cart-cluster-app.conf"))

  ActorSystem(
    Behaviors.setup[String] { context =>
      val system = context.system
      implicit val ec = system.executionContext
      val session = CassandraSessionRegistry(system).sessionFor("akka.projection.cassandra.session-config")
      val repo = new ItemPopularityProjectionRepositoryImpl(session)

      def sourceProvider(tag: String): SourceProvider[Offset, EventEnvelope[ShoppingCartEvents.Event]] =
        EventSourcedProvider
          .eventsByTag[ShoppingCartEvents.Event](
            system,
            readJournalPluginId = CassandraReadJournal.Identifier,
            tag = tag)

      def projection(tag: String) =
        CassandraProjection.atLeastOnce(
          projectionId = ProjectionId("shopping-carts", tag),
          sourceProvider(tag),
          handler = () => new ItemPopularityProjectionHandler(tag, system, repo))

      ShardedDaemonProcess(system).init[ProjectionBehavior.Command](
        name = "shopping-carts",
        numberOfInstances = ShoppingCartTags.Tags.size,
        behaviorFactory = (i: Int) => ProjectionBehavior(projection(ShoppingCartTags.Tags(i))),
        stopMessage = ProjectionBehavior.Stop)

      Behaviors.empty
    },
    "ShoppingCartClusterApp",
    config)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/guide/ShoppingCartClusterApp.java#L6-L77 "Go to snippet source")package jdocs.guide;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.projection.ProjectionBehavior;
import akka.projection.eventsourced.EventEnvelope;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;
import akka.projection.ProjectionId;
import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.javadsl.AtLeastOnceProjection;
import akka.stream.alpakka.cassandra.javadsl.CassandraSession;
import akka.stream.alpakka.cassandra.javadsl.CassandraSessionRegistry;

public class ShoppingCartClusterApp {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      throw new IllegalArgumentException("An akka cluster port argument is required");
    }

    String portString = args[0];
    int port = Integer.parseInt(portString);

    Config config =
        ConfigFactory.parseString("akka.remote.artery.canonical.port = " + port)
            .withFallback(ConfigFactory.load("guide-shopping-cart-cluster-app.conf"));

    ActorSystem.create(
        Behaviors.setup(
            context -> {
              ActorSystem<Void> system = context.getSystem();

              CassandraSession session =
                  CassandraSessionRegistry.get(system)
                      .sessionFor("akka.projection.cassandra.session-config");
              ItemPopularityProjectionRepositoryImpl repo =
                  new ItemPopularityProjectionRepositoryImpl(session);

              ShardedDaemonProcess.get(system)
                  .init(
                      ProjectionBehavior.Command.class,
                      "shopping-carts",
                      ShoppingCartTags.TAGS.length,
                      n ->
                          ProjectionBehavior.create(
                              projection(system, repo, ShoppingCartTags.TAGS[n])),
                      ProjectionBehavior.stopMessage());

              return Behaviors.empty();
            }),
        "ShoppingCartClusterApp",
        config);
  }

  static SourceProvider<Offset, EventEnvelope<ShoppingCartEvents.Event>> sourceProvider(
      ActorSystem<?> system, String tag) {
    return EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag);
  }

  static AtLeastOnceProjection<Offset, EventEnvelope<ShoppingCartEvents.Event>> projection(
      ActorSystem<?> system, ItemPopularityProjectionRepository repo, String tag) {
    return CassandraProjection.atLeastOnce(
        ProjectionId.of("shopping-carts", tag),
        sourceProvider(system, tag),
        () -> new ItemPopularityProjectionHandler(tag, system, repo));
  }
}
```

Before running the app we must first run the `EventGeneratorApp` in `cluster` mode in order to generate new shopping cart events for multiple tags, instead of just one. Shopping cart events are tagged in a similar way to the sharded entities themselves. Given a sequence of tags from `0..n` a hash is generated using the sharding entity key, the shopping cart id. The hash is modded `%` by the number of tags in the sequence to choose a tag from the sequence. See the [Tagging Events in EventSourcedBehavior](../running.html#tagging-events-in-eventsourcedbehavior) section of the documentation for an example of how events can be tagged with Akka Persistence.

The same `EventGeneratorApp` from the previous [Running the Projection](running.html) section can be used to generate events for this app with an additional argument `cluster`. Run the app:

sbt

```
sbt "runMain docs.guide.EventGeneratorApp cluster"

```

Maven

```
mvn compile exec:java -Dexec.mainClass="jdocs.guide.EventGeneratorApp" -Dexec.args="cluster"

```

When the app is running you will observe that the logs show events written to different tags (`carts-0`, `carts-1`, etc.), instead of just one (`shopping-cart`).

```
[2020-08-13 15:18:58,383] [INFO] [docs.guide.EventGeneratorApp$] [] [EventGenerator-akka.actor.default-dispatcher-19] - id [6059e] tag [carts-1] event: ItemQuantityAdjusted(6059e,cat t-shirt,1,2) MDC: {persistencePhase=persist-evt, akkaAddress=akka://[[email protected]](/cdn-cgi/l/email-protection):25520, akkaSource=akka://EventGenerator/system/sharding/shopping-cart-event/903/6059e, sourceActorSystem=EventGenerator, persistenceId=6059e}

```

Run the first member of your new Akka cluster:

sbt

```
sbt "runMain docs.guide.ShoppingCartClusterApp 2551

```

Maven

```
mvn compile exec:java -Dexec.mainClass="jdocs.guide.ShoppingCartClusterApp" -Dexec.args="2551"

```

When the app is running you will observe that it will process all the shopping cart event tags, because it’s the only member of the cluster.

```
[2020-08-13 15:03:39,809] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-43] - ItemPopularityProjectionHandler(carts-1) item popularity for 'akka t-shirt': [1080] MDC: {}   
[2020-08-13 15:03:39,810] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-2) item popularity for 'bowling shoes': [1241] MDC: {}  
[2020-08-13 15:03:39,812] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-43] - ItemPopularityProjectionHandler(carts-0) item popularity for 'akka t-shirt': [1080] MDC: {}
...

```

Run a second member to expand the Akka cluster member count to 2\.

sbt

```
sbt "runMain docs.guide.ShoppingCartClusterApp 2552

```

Maven

```
mvn compile exec:java -Dexec.mainClass="jdocs.guide.ShoppingCartClusterApp" -Dexec.args="2552"

```

When the second app is running you will observe a sharding rebalance complete and then see a distinct set of tagged events processed on each cluster member.

A rebalance occurs and tag `carts-0` is assigned to the new cluster member. Only tags `carts-1` and `carts-2` are processed by the first member.

```
[2020-08-13 15:03:59,019] [INFO] [akka.cluster.sharding.DDataShardCoordinator] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-41] - Starting rebalance for shards [0]. Current shards rebalancing: [] MDC: {akkaAddress=akka://ShoppingCa
[[email protected]](/cdn-cgi/l/email-protection):2551, sourceThread=ShoppingCartClusterApp-akka.actor.default-dispatcher-44, akkaSource=akka://[[email protected]](/cdn-cgi/l/email-protection):2551/system/sharding/sharded-daemon-process-shopping-cartsCoordinator/singleton/coordinator, 
sourceActorSystem=ShoppingCartClusterApp, akkaTimestamp=19:03:59.019UTC}                                                                                                                                                                           
[2020-08-13 15:04:35,261] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-43] - ItemPopularityProjectionHandler(carts-1) item popularity for 'skis': [1244] MDC: {}           
[2020-08-13 15:04:36,802] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-2) item popularity for 'skis': [1246] MDC: {}           
[2020-08-13 15:04:36,805] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-2) item popularity for 'akka t-shirt': [1136] MDC: {}   
[2020-08-13 15:04:36,807] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-43] - ItemPopularityProjectionHandler(carts-2) item popularity for 'skis': [1249] MDC: {}           
[2020-08-13 15:04:39,262] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-41] - ItemPopularityProjectionHandler(carts-1) item popularity for 'cat t-shirt': [1239] MDC: {}                  
...

```

When the second member joins the cluster it is assigned tag `carts-0` and begins processing events beginning from the last successfully processed offset.

```
[2020-08-13 15:04:02,692] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-5] - ItemPopularityProjectionHandler(carts-0) item popularity for 'bowling shoes': [1275] MDC: {}   
[2020-08-13 15:04:02,695] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-0) item popularity for 'akka t-shirt': [1110] MDC: {}   
[2020-08-13 15:04:02,699] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-0) item popularity for 'cat t-shirt': [1203] MDC: {}
...

```

## Code Examples

### Example 1: Running the Projection in Akka Cluster

```conf
datastax-java-driver {
  # basic.contact-points = ["127.0.0.1:9042"]
  # basic.load-balancing-policy.local-datacenter = "datacenter1"
  advanced {
    # reconnect to c* if down when app is started
    reconnect-on-init = true
  }
}

akka {
  loglevel = DEBUG
  actor {
    provider = "cluster"
  }

  # For the sample, just bind to loopback and do not allow access from the network
  # the port is overridden by the logic in main class
  remote.artery {
    canonical.port = 0
    canonical.hostname = 127.0.0.1
  }

  cluster {
    seed-nodes = [
      "akka://[email protected]:2551",
      "akka://[email protected]:2552"
    ]

    downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
  }

  persistence.journal {
    plugin = "akka.persistence.cassandra.journal"
    auto-start-journals = ["akka.persistence.cassandra.journal"]
  }

  persistence.snapshot-store.plugin = "akka.persistence.cassandra.snapshot"

  persistence {
    cassandra {
      journal {
        # to create the schema
        keyspace-autocreate = true
        tables-autocreate = true
      }

      snapshot {
        # to create the schema
        keyspace-autocreate = true
        tables-autocreate = true
      }

      query {
        refresh-interval = 2s
      }

      events-by-tag {
        # for lower latency
        eventual-consistency-delay = 25ms
        flush-interval = 25ms
        pubsub-notification = on
      }
    }
  }
}
```

### Example 2: Running the Projection in Akka Cluster

```scala
package docs.guide

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.persistence.query.Offset
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection
import akka.projection.eventsourced.EventEnvelope
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.SourceProvider
import akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry
import com.typesafe.config.ConfigFactory

object ShoppingCartClusterApp extends App {
  val port = args.headOption match {
    case Some(portString) if portString.matches("""\d+""") => portString.toInt
    case _                                                 => throw new IllegalArgumentException("An akka cluster port argument is required")
  }

  val config = ConfigFactory
    .parseString(s"akka.remote.artery.canonical.port = $port")
    .withFallback(ConfigFactory.load("guide-shopping-cart-cluster-app.conf"))

  ActorSystem(
    Behaviors.setup[String] { context =>
      val system = context.system
      implicit val ec = system.executionContext
      val session = CassandraSessionRegistry(system).sessionFor("akka.projection.cassandra.session-config")
      val repo = new ItemPopularityProjectionRepositoryImpl(session)

      def sourceProvider(tag: String): SourceProvider[Offset, EventEnvelope[ShoppingCartEvents.Event]] =
        EventSourcedProvider
          .eventsByTag[ShoppingCartEvents.Event](
            system,
            readJournalPluginId = CassandraReadJournal.Identifier,
            tag = tag)

      def projection(tag: String) =
        CassandraProjection.atLeastOnce(
          projectionId = ProjectionId("shopping-carts", tag),
          sourceProvider(tag),
          handler = () => new ItemPopularityProjectionHandler(tag, system, repo))

      ShardedDaemonProcess(system).init[ProjectionBehavior.Command](
        name = "shopping-carts",
        numberOfInstances = ShoppingCartTags.Tags.size,
        behaviorFactory = (i: Int) => ProjectionBehavior(projection(ShoppingCartTags.Tags(i))),
        stopMessage = ProjectionBehavior.Stop)

      Behaviors.empty
    },
    "ShoppingCartClusterApp",
    config)
}
```

### Example 3: Running the Projection in Akka Cluster

```java
package jdocs.guide;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.projection.ProjectionBehavior;
import akka.projection.eventsourced.EventEnvelope;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;
import akka.projection.ProjectionId;
import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.javadsl.AtLeastOnceProjection;
import akka.stream.alpakka.cassandra.javadsl.CassandraSession;
import akka.stream.alpakka.cassandra.javadsl.CassandraSessionRegistry;

public class ShoppingCartClusterApp {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      throw new IllegalArgumentException("An akka cluster port argument is required");
    }

    String portString = args[0];
    int port = Integer.parseInt(portString);

    Config config =
        ConfigFactory.parseString("akka.remote.artery.canonical.port = " + port)
            .withFallback(ConfigFactory.load("guide-shopping-cart-cluster-app.conf"));

    ActorSystem.create(
        Behaviors.setup(
            context -> {
              ActorSystem<Void> system = context.getSystem();

              CassandraSession session =
                  CassandraSessionRegistry.get(system)
                      .sessionFor("akka.projection.cassandra.session-config");
              ItemPopularityProjectionRepositoryImpl repo =
                  new ItemPopularityProjectionRepositoryImpl(session);

              ShardedDaemonProcess.get(system)
                  .init(
                      ProjectionBehavior.Command.class,
                      "shopping-carts",
                      ShoppingCartTags.TAGS.length,
                      n ->
                          ProjectionBehavior.create(
                              projection(system, repo, ShoppingCartTags.TAGS[n])),
                      ProjectionBehavior.stopMessage());

              return Behaviors.empty();
            }),
        "ShoppingCartClusterApp",
        config);
  }

  static SourceProvider<Offset, EventEnvelope<ShoppingCartEvents.Event>> sourceProvider(
      ActorSystem<?> system, String tag) {
    return EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag);
  }

  static AtLeastOnceProjection<Offset, EventEnvelope<ShoppingCartEvents.Event>> projection(
      ActorSystem<?> system, ItemPopularityProjectionRepository repo, String tag) {
    return CassandraProjection.atLeastOnce(
        ProjectionId.of("shopping-carts", tag),
        sourceProvider(system, tag),
        () -> new ItemPopularityProjectionHandler(tag, system, repo));
  }
}
```

### Example 4: Running the Projection in Akka Cluster

```text
sbt "runMain docs.guide.EventGeneratorApp cluster"
```

### Example 5: Running the Projection in Akka Cluster

```text
mvn compile exec:java -Dexec.mainClass="jdocs.guide.EventGeneratorApp" -Dexec.args="cluster"
```

### Example 6: Running the Projection in Akka Cluster

```text
[2020-08-13 15:18:58,383] [INFO] [docs.guide.EventGeneratorApp$] [] [EventGenerator-akka.actor.default-dispatcher-19] - id [6059e] tag [carts-1] event: ItemQuantityAdjusted(6059e,cat t-shirt,1,2) MDC: {persistencePhase=persist-evt, akkaAddress=akka://[email protected]:25520, akkaSource=akka://EventGenerator/system/sharding/shopping-cart-event/903/6059e, sourceActorSystem=EventGenerator, persistenceId=6059e}
```

### Example 7: Running the Projection in Akka Cluster

```text
sbt "runMain docs.guide.ShoppingCartClusterApp 2551
```

### Example 8: Running the Projection in Akka Cluster

```text
mvn compile exec:java -Dexec.mainClass="jdocs.guide.ShoppingCartClusterApp" -Dexec.args="2551"
```

### Example 9: Running the Projection in Akka Cluster

```text
[2020-08-13 15:03:39,809] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-43] - ItemPopularityProjectionHandler(carts-1) item popularity for 'akka t-shirt': [1080] MDC: {}   
[2020-08-13 15:03:39,810] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-2) item popularity for 'bowling shoes': [1241] MDC: {}  
[2020-08-13 15:03:39,812] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-43] - ItemPopularityProjectionHandler(carts-0) item popularity for 'akka t-shirt': [1080] MDC: {}
...
```

### Example 10: Running the Projection in Akka Cluster

```text
sbt "runMain docs.guide.ShoppingCartClusterApp 2552
```

### Example 11: Running the Projection in Akka Cluster

```text
mvn compile exec:java -Dexec.mainClass="jdocs.guide.ShoppingCartClusterApp" -Dexec.args="2552"
```

### Example 12: Running the Projection in Akka Cluster

```text
[2020-08-13 15:03:59,019] [INFO] [akka.cluster.sharding.DDataShardCoordinator] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-41] - Starting rebalance for shards [0]. Current shards rebalancing: [] MDC: {akkaAddress=akka://ShoppingCa
[email protected]:2551, sourceThread=ShoppingCartClusterApp-akka.actor.default-dispatcher-44, akkaSource=akka://[email protected]:2551/system/sharding/sharded-daemon-process-shopping-cartsCoordinator/singleton/coordinator, 
sourceActorSystem=ShoppingCartClusterApp, akkaTimestamp=19:03:59.019UTC}                                                                                                                                                                           
[2020-08-13 15:04:35,261] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-43] - ItemPopularityProjectionHandler(carts-1) item popularity for 'skis': [1244] MDC: {}           
[2020-08-13 15:04:36,802] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-2) item popularity for 'skis': [1246] MDC: {}           
[2020-08-13 15:04:36,805] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-2) item popularity for 'akka t-shirt': [1136] MDC: {}   
[2020-08-13 15:04:36,807] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-43] - ItemPopularityProjectionHandler(carts-2) item popularity for 'skis': [1249] MDC: {}           
[2020-08-13 15:04:39,262] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-41] - ItemPopularityProjectionHandler(carts-1) item popularity for 'cat t-shirt': [1239] MDC: {}                  
...
```

### Example 13: Running the Projection in Akka Cluster

```text
[2020-08-13 15:04:02,692] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-5] - ItemPopularityProjectionHandler(carts-0) item popularity for 'bowling shoes': [1275] MDC: {}   
[2020-08-13 15:04:02,695] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-0) item popularity for 'akka t-shirt': [1110] MDC: {}   
[2020-08-13 15:04:02,699] [INFO] [docs.guide.ItemPopularityProjectionHandler] [] [ShoppingCartClusterApp-akka.actor.default-dispatcher-40] - ItemPopularityProjectionHandler(carts-0) item popularity for 'cat t-shirt': [1203] MDC: {}
...
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/japi/akka-core/2.9/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster.html
- https://doc.akka.io/libraries/akka-projection/1.5/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/1.5/getting-started/running.html
- https://doc.akka.io/libraries/akka-projection/1.5/running.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/1.5/getting-started/running-cluster.html](https://doc.akka.io/libraries/akka-projection/1.5/getting-started/running-cluster.html)*