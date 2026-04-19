---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:12:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/distributed-data.html
title: Classic Distributed Data • Akka core
---

# Classic Distributed Data • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Distributed Data

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the full documentation of this feature and for new projects see [Distributed Data](typed/distributed-data.html).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Distributed Data, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-distributed-data" % AkkaVersion
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
    <artifactId>akka-distributed-data_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-distributed-data_${versions.ScalaBinary}"
}
```

## Introduction

For the full documentation of this feature and for new projects see [Distributed Data \- Introduction](typed/distributed-data.html#introduction).

## Using the Replicator

The [`Replicator`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator.html "akka.cluster.ddata.Replicator")[`Replicator`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.html "akka.cluster.ddata.Replicator") actor provides the API for interacting with the data. The `Replicator` actor must be started on each node in the cluster, or group of nodes tagged with a specific role. It communicates with other `Replicator` instances with the same path (without address) that are running on other nodes . For convenience it can be used with the [`DistributedData`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DistributedData.html "akka.cluster.ddata.DistributedData")[`DistributedData`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DistributedData.html "akka.cluster.ddata.DistributedData") extension but it can also be started as an ordinary actor using the [`Replicator.props`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$.html#props(settings:akka.cluster.ddata.ReplicatorSettings):akka.actor.Props "akka.cluster.ddata.Replicator")[`Replicator.props`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.html#props(akka.cluster.ddata.ReplicatorSettings) "akka.cluster.ddata.Replicator"). If it is started as an ordinary actor it is important that it is given the same name, started on same path, on all nodes.

Cluster members with status [WeaklyUp](typed/cluster-membership.html#weakly-up), will participate in Distributed Data. This means that the data will be replicated to the `WeaklyUp` nodes with the background gossip protocol. Note that it will not participate in any actions where the consistency mode is to read/write from all nodes or the majority of nodes. The `WeaklyUp` node is not counted as part of the cluster. So 3 nodes \+ 5 `WeaklyUp` is essentially a 3 node cluster as far as consistent actions are concerned.

Below is an example of an actor that schedules tick messages to itself and for each tick adds or removes elements from a [`ORSet`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSet.html "akka.cluster.ddata.ORSet")[`ORSet`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html "akka.cluster.ddata.ORSet") (observed\-remove set). It also subscribes to changes of this.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L49-L96 "Go to snippet source")import java.util.concurrent.ThreadLocalRandom
import akka.actor.Actor
import akka.actor.ActorLogging
import akka.cluster.ddata.DistributedData
import akka.cluster.ddata.ORSet
import akka.cluster.ddata.ORSetKey
import akka.cluster.ddata.Replicator._

object DataBot {
  private case object Tick
}

class DataBot extends Actor with ActorLogging {
  import DataBot._

  val replicator = DistributedData(context.system).replicator
  implicit val node: SelfUniqueAddress = DistributedData(context.system).selfUniqueAddress

  import context.dispatcher
  val tickTask = context.system.scheduler.scheduleWithFixedDelay(5.seconds, 5.seconds, self, Tick)

  val DataKey = ORSetKey[String]("key")

  replicator ! Subscribe(DataKey, self)

  def receive = {
    case Tick =>
      val s = ThreadLocalRandom.current().nextInt(97, 123).toChar.toString
      if (ThreadLocalRandom.current().nextBoolean()) {
        // add
        log.info("Adding: {}", s)
        replicator ! Update(DataKey, ORSet.empty[String], WriteLocal)(_ :+ s)
      } else {
        // remove
        log.info("Removing: {}", s)
        replicator ! Update(DataKey, ORSet.empty[String], WriteLocal)(_.remove(s))
      }

    case _: UpdateResponse[_] => // ignore

    case c @ Changed(DataKey) =>
      val data = c.get(DataKey)
      log.info("Current elements: {}", data.elements)
  }

  override def postStop(): Unit = tickTask.cancel()

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DataBot.java#L8-L100 "Go to snippet source")import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Cancellable;
import akka.cluster.ddata.DistributedData;
import akka.cluster.ddata.Key;
import akka.cluster.ddata.ORSet;
import akka.cluster.ddata.ORSetKey;
import akka.cluster.ddata.Replicator;
import akka.cluster.ddata.Replicator.Changed;
import akka.cluster.ddata.Replicator.Subscribe;
import akka.cluster.ddata.Replicator.Update;
import akka.cluster.ddata.Replicator.UpdateResponse;
import akka.cluster.ddata.SelfUniqueAddress;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

public class DataBot extends AbstractActor {

  private static final String TICK = "tick";

  private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  private final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();
  private final SelfUniqueAddress node =
      DistributedData.get(getContext().getSystem()).selfUniqueAddress();

  private final Cancellable tickTask =
      getContext()
          .getSystem()
          .scheduler()
          .scheduleWithFixedDelay(
              Duration.ofSeconds(5),
              Duration.ofSeconds(5),
              getSelf(),
              TICK,
              getContext().getDispatcher(),
              getSelf());

  private final Key<ORSet<String>> dataKey = ORSetKey.create("key");

  @SuppressWarnings("unchecked")
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(String.class, a -> a.equals(TICK), a -> receiveTick())
        .match(
            Changed.class,
            c -> c.key().equals(dataKey),
            c -> receiveChanged((Changed<ORSet<String>>) c))
        .match(UpdateResponse.class, r -> receiveUpdateResponse())
        .build();
  }

  private void receiveTick() {
    String s = String.valueOf((char) ThreadLocalRandom.current().nextInt(97, 123));
    if (ThreadLocalRandom.current().nextBoolean()) {
      // add
      log.info("Adding: {}", s);
      Update<ORSet<String>> update =
          new Update<>(dataKey, ORSet.create(), Replicator.writeLocal(), curr -> curr.add(node, s));
      replicator.tell(update, getSelf());
    } else {
      // remove
      log.info("Removing: {}", s);
      Update<ORSet<String>> update =
          new Update<>(
              dataKey, ORSet.create(), Replicator.writeLocal(), curr -> curr.remove(node, s));
      replicator.tell(update, getSelf());
    }
  }

  private void receiveChanged(Changed<ORSet<String>> c) {
    ORSet<String> data = c.dataValue();
    log.info("Current elements: {}", data.getElements());
  }

  private void receiveUpdateResponse() {
    // ignore
  }

  @Override
  public void preStart() {
    Subscribe<ORSet<String>> subscribe = new Subscribe<>(dataKey, getSelf());
    replicator.tell(subscribe, ActorRef.noSender());
  }

  @Override
  public void postStop() {
    tickTask.cancel();
  }
}
```

### Update

For the full documentation of this feature and for new projects see [Distributed Data \- Update](typed/distributed-data.html#update).

To modify and replicate a data value you send a [`Replicator.Update`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Update.html "akka.cluster.ddata.Replicator.Update")[`Replicator.Update`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Update.html "akka.cluster.ddata.Replicator.Update") message to the local [`Replicator`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator.html "akka.cluster.ddata.Replicator")[`Replicator`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.html "akka.cluster.ddata.Replicator").

The current data value for the `key` of the `Update` is passed as parameter to the [`modify`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Update.html#modify:Option[A]=%3EA "akka.cluster.ddata.Replicator.Update")[`modify()`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Update.html#modify() "akka.cluster.ddata.Replicator.Update") function of the `Update`. The function is supposed to return the new value of the data, which will then be replicated according to the given consistency level.

The `modify` function is called by the `Replicator` actor and must therefore be a pure function that only uses the data parameter and stable fields from enclosing scope. It must for example not access the sender ([`sender()`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html#sender():akka.actor.ActorRef "akka.actor.Actor")[`getSender()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.html#getSender() "akka.actor.AbstractActor")) reference of an enclosing actor.

`Update` is intended to only be sent from an actor running in same local [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") as the `Replicator`, because the `modify` function is typically not serializable.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L110-L127 "Go to snippet source")implicit val node: SelfUniqueAddress = DistributedData(system).selfUniqueAddress
val replicator = DistributedData(system).replicator

val Counter1Key = PNCounterKey("counter1")
val Set1Key = GSetKey[String]("set1")
val Set2Key = ORSetKey[String]("set2")
val ActiveFlagKey = FlagKey("active")

replicator ! Update(Counter1Key, PNCounter(), WriteLocal)(_ :+ 1)

val writeTo3 = WriteTo(n = 3, timeout = 1.second)
replicator ! Update(Set1Key, GSet.empty[String], writeTo3)(_ + "hello")

val writeMajority = WriteMajority(timeout = 5.seconds)
replicator ! Update(Set2Key, ORSet.empty[String], writeMajority)(_ :+ "hello")

val writeAll = WriteAll(timeout = 5.seconds)
replicator ! Update(ActiveFlagKey, Flag.Disabled, writeAll)(_.switchOn)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L47-L119 "Go to snippet source")class DemonstrateUpdate extends AbstractActor {
  final SelfUniqueAddress node =
      DistributedData.get(getContext().getSystem()).selfUniqueAddress();
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");
  final Key<GSet<String>> set1Key = GSetKey.create("set1");
  final Key<ORSet<String>> set2Key = ORSetKey.create("set2");
  final Key<Flag> activeFlagKey = FlagKey.create("active");

  @Override
  public Receive createReceive() {
    ReceiveBuilder b = receiveBuilder();

    b.matchEquals(
        "demonstrate update",
        msg -> {
          replicator.tell(
              new Replicator.Update<PNCounter>(
                  counter1Key,
                  PNCounter.create(),
                  Replicator.writeLocal(),
                  curr -> curr.increment(node, 1)),
              getSelf());

          final WriteConsistency writeTo3 = new WriteTo(3, Duration.ofSeconds(1));
          replicator.tell(
              new Replicator.Update<GSet<String>>(
                  set1Key, GSet.create(), writeTo3, curr -> curr.add("hello")),
              getSelf());

          final WriteConsistency writeMajority = new WriteMajority(Duration.ofSeconds(5));
          replicator.tell(
              new Replicator.Update<ORSet<String>>(
                  set2Key, ORSet.create(), writeMajority, curr -> curr.add(node, "hello")),
              getSelf());

          final WriteConsistency writeAll = new WriteAll(Duration.ofSeconds(5));
          replicator.tell(
              new Replicator.Update<Flag>(
                  activeFlagKey, Flag.create(), writeAll, curr -> curr.switchOn()),
              getSelf());
        });
    return b.build();
  }
}
```

As reply of the `Update` a [`Replicator.UpdateSuccess`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateSuccess.html "akka.cluster.ddata.Replicator.UpdateSuccess")[`Replicator.UpdateSuccess`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.UpdateSuccess.html "akka.cluster.ddata.Replicator.UpdateSuccess") is sent to the sender of the `Update` if the value was successfully replicated according to the supplied [write consistency level](typed/distributed-data.html#write-consistency) within the supplied timeout. Otherwise a [`Replicator.UpdateFailure`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateFailure.html "akka.cluster.ddata.Replicator.UpdateFailure")[`Replicator.UpdateFailure`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.UpdateFailure.html "akka.cluster.ddata.Replicator.UpdateFailure") subclass is sent back. Note that a [`Replicator.UpdateTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateTimeout.html "akka.cluster.ddata.Replicator.UpdateTimeout")[`Replicator.UpdateTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.UpdateTimeout.html "akka.cluster.ddata.Replicator.UpdateTimeout") reply does not mean that the update completely failed or was rolled back. It may still have been replicated to some nodes, and will eventually be replicated to all nodes with the gossip protocol.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L132 "Go to snippet source")case UpdateSuccess(Counter1Key, req) => // ok
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L93-L98 "Go to snippet source")b.match(
    UpdateSuccess.class,
    a -> a.key().equals(counter1Key),
    a -> {
      // ok
    });
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L139-L141 "Go to snippet source")case UpdateSuccess(Set1Key, req) => // ok
case UpdateTimeout(Set1Key, req) =>
// write to 3 nodes failed within 1.second
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L102-L113 "Go to snippet source")b.match(
        UpdateSuccess.class,
        a -> a.key().equals(set1Key),
        a -> {
          // ok
        })
    .match(
        UpdateTimeout.class,
        a -> a.key().equals(set1Key),
        a -> {
          // write to 3 nodes failed within 1.second
        });
```

You will always see your own writes. For example if you send two [`Update`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Update.html "akka.cluster.ddata.Replicator.Update")[`Update`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Update.html "akka.cluster.ddata.Replicator.Update") messages changing the value of the same `key`, the `modify` function of the second message will see the change that was performed by the first `Update` message.

It is possible to abort the `Update` when inspecting the state parameter that is passed in to the `modify` function by throwing an exception. That happens before the update is performed and a [`Replicator.ModifyFailure`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ModifyFailure.html "akka.cluster.ddata.Replicator.ModifyFailure")[`Replicator.ModifyFailure`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.ModifyFailure.html "akka.cluster.ddata.Replicator.ModifyFailure") is sent back as reply.

In the `Update` message you can pass an optional request context, which the [`Replicator`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator.html "akka.cluster.ddata.Replicator")[`Replicator`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.html "akka.cluster.ddata.Replicator") does not care about, but is included in the reply messages. This is a convenient way to pass contextual information (e.g. original sender) without having to use `ask` or maintain local correlation data structures.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L155-L170 "Go to snippet source")implicit val node = DistributedData(system).selfUniqueAddress
val replicator = DistributedData(system).replicator
val writeTwo = WriteTo(n = 2, timeout = 3.second)
val Counter1Key = PNCounterKey("counter1")

def receive: Receive = {
  case "increment" =>
    // incoming command to increase the counter
    val upd = Update(Counter1Key, PNCounter(), writeTwo, request = Some(sender()))(_ :+ 1)
    replicator ! upd

  case UpdateSuccess(Counter1Key, Some(replyTo: ActorRef)) =>
    replyTo ! "ack"
  case UpdateTimeout(Counter1Key, Some(replyTo: ActorRef)) =>
    replyTo ! "nack"
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L124-L165 "Go to snippet source")class DemonstrateUpdateWithRequestContext extends AbstractActor {
  final SelfUniqueAddress node = DistributedData.get(system).selfUniqueAddress();
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final WriteConsistency writeTwo = new WriteTo(2, Duration.ofSeconds(3));
  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            a -> a.equals("increment"),
            a -> {
              // incoming command to increase the counter
              Optional<Object> reqContext = Optional.of(getSender());
              Replicator.Update<PNCounter> upd =
                  new Replicator.Update<PNCounter>(
                      counter1Key,
                      PNCounter.create(),
                      writeTwo,
                      reqContext,
                      curr -> curr.increment(node, 1));
              replicator.tell(upd, getSelf());
            })
        .match(
            UpdateSuccess.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              replyTo.tell("ack", getSelf());
            })
        .match(
            UpdateTimeout.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              replyTo.tell("nack", getSelf());
            })
        .build();
  }
}
```

### Get

For the full documentation of this feature and for new projects see [Distributed Data \- Get](typed/distributed-data.html#get).

To retrieve the current value of a data you send [`Replicator.Get`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Get.html "akka.cluster.ddata.Replicator.Get")[`Replicator.Get`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Get.html "akka.cluster.ddata.Replicator.Get") message to the `Replicator`. You supply a consistency level which has the following meaning:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L179-L194 "Go to snippet source")val replicator = DistributedData(system).replicator
val Counter1Key = PNCounterKey("counter1")
val Set1Key = GSetKey[String]("set1")
val Set2Key = ORSetKey[String]("set2")
val ActiveFlagKey = FlagKey("active")

replicator ! Get(Counter1Key, ReadLocal)

val readFrom3 = ReadFrom(n = 3, timeout = 1.second)
replicator ! Get(Set1Key, readFrom3)

val readMajority = ReadMajority(timeout = 5.seconds)
replicator ! Get(Set2Key, readMajority)

val readAll = ReadAll(timeout = 5.seconds)
replicator ! Get(ActiveFlagKey, readAll)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L170-L240 "Go to snippet source")class DemonstrateGet extends AbstractActor {
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");
  final Key<GSet<String>> set1Key = GSetKey.create("set1");
  final Key<ORSet<String>> set2Key = ORSetKey.create("set2");
  final Key<Flag> activeFlagKey = FlagKey.create("active");

  @Override
  public Receive createReceive() {
    ReceiveBuilder b = receiveBuilder();

    b.matchEquals(
        "demonstrate get",
        msg -> {
          replicator.tell(
              new Replicator.Get<PNCounter>(counter1Key, Replicator.readLocal()), getSelf());

          final ReadConsistency readFrom3 = new ReadFrom(3, Duration.ofSeconds(1));
          replicator.tell(new Replicator.Get<GSet<String>>(set1Key, readFrom3), getSelf());

          final ReadConsistency readMajority = new ReadMajority(Duration.ofSeconds(5));
          replicator.tell(new Replicator.Get<ORSet<String>>(set2Key, readMajority), getSelf());

          final ReadConsistency readAll = new ReadAll(Duration.ofSeconds(5));
          replicator.tell(new Replicator.Get<Flag>(activeFlagKey, readAll), getSelf());
        });
    return b.build();
  }
}
```

As reply of the `Get` a [`Replicator.GetSuccess`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetSuccess.html "akka.cluster.ddata.Replicator.GetSuccess")[`Replicator.GetSuccess`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.GetSuccess.html "akka.cluster.ddata.Replicator.GetSuccess") is sent to the sender of the `Get` if the value was successfully retrieved according to the supplied [read consistency level](typed/distributed-data.html#read-consistency) within the supplied timeout. Otherwise a [`Replicator.GetFailure`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetFailure.html "akka.cluster.ddata.Replicator.GetFailure")[`Replicator.GetFailure`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.GetFailure.html "akka.cluster.ddata.Replicator.GetFailure") is sent. If the key does not exist the reply will be [`Replicator.NotFound`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$NotFound.html "akka.cluster.ddata.Replicator.NotFound")[`Replicator.NotFound`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.NotFound.html "akka.cluster.ddata.Replicator.NotFound").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L199-L201 "Go to snippet source")case g @ GetSuccess(Counter1Key, req) =>
  val value = g.get(Counter1Key).value
case NotFound(Counter1Key, req) => // key counter1 does not exist
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L200-L212 "Go to snippet source")b.match(
        GetSuccess.class,
        a -> a.key().equals(counter1Key),
        a -> {
          GetSuccess<PNCounter> g = a;
          BigInteger value = g.dataValue().getValue();
        })
    .match(
        NotFound.class,
        a -> a.key().equals(counter1Key),
        a -> {
          // key counter1 does not exist
        });
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L208-L212 "Go to snippet source")case g @ GetSuccess(Set1Key, req) =>
  val elements = g.get(Set1Key).elements
case GetFailure(Set1Key, req) =>
// read from 3 nodes failed within 1.second
case NotFound(Set1Key, req) => // key set1 does not exist
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L216-L234 "Go to snippet source")b.match(
        GetSuccess.class,
        a -> a.key().equals(set1Key),
        a -> {
          GetSuccess<GSet<String>> g = a;
          Set<String> value = g.dataValue().getElements();
        })
    .match(
        GetFailure.class,
        a -> a.key().equals(set1Key),
        a -> {
          // read from 3 nodes failed within 1.second
        })
    .match(
        NotFound.class,
        a -> a.key().equals(set1Key),
        a -> {
          // key set1 does not exist
        });
```

In the [`Get`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Get.html "akka.cluster.ddata.Replicator.Get")[`Get`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Get.html "akka.cluster.ddata.Replicator.Get") message you can pass an optional request context in the same way as for the [`Update`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Update.html "akka.cluster.ddata.Replicator.Update")[`Update`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Update.html "akka.cluster.ddata.Replicator.Update") message, described above. For example the original sender can be passed and replied to after receiving and transforming [`GetSuccess`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetSuccess.html "akka.cluster.ddata.Replicator.GetSuccess")[`GetSuccess`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.GetSuccess.html "akka.cluster.ddata.Replicator.GetSuccess").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L227-L244 "Go to snippet source")implicit val node = DistributedData(system).selfUniqueAddress
val replicator = DistributedData(system).replicator
val readTwo = ReadFrom(n = 2, timeout = 3.second)
val Counter1Key = PNCounterKey("counter1")

def receive: Receive = {
  case "get-count" =>
    // incoming request to retrieve current value of the counter
    replicator ! Get(Counter1Key, readTwo, request = Some(sender()))

  case g @ GetSuccess(Counter1Key, Some(replyTo: ActorRef)) =>
    val value = g.get(Counter1Key).value.longValue
    replyTo ! value
  case GetFailure(Counter1Key, Some(replyTo: ActorRef)) =>
    replyTo ! -1L
  case NotFound(Counter1Key, Some(replyTo: ActorRef)) =>
    replyTo ! 0L
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L245-L287 "Go to snippet source")class DemonstrateGetWithRequestContext extends AbstractActor {
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final ReadConsistency readTwo = new ReadFrom(2, Duration.ofSeconds(3));
  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            a -> a.equals("get-count"),
            a -> {
              // incoming request to retrieve current value of the counter
              Optional<Object> reqContext = Optional.of(getSender());
              replicator.tell(new Replicator.Get<PNCounter>(counter1Key, readTwo), getSelf());
            })
        .match(
            GetSuccess.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              GetSuccess<PNCounter> g = a;
              long value = g.dataValue().getValue().longValue();
              replyTo.tell(value, getSelf());
            })
        .match(
            GetFailure.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              replyTo.tell(-1L, getSelf());
            })
        .match(
            NotFound.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              replyTo.tell(0L, getSelf());
            })
        .build();
  }
}
```

### Subscribe

For the full documentation of this feature and for new projects see [Distributed Data \- Subscribe](typed/distributed-data.html#subscribe).

You may also register interest in change notifications by sending [`Replicator.Subscribe`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Subscribe.html "akka.cluster.ddata.Replicator.Subscribe")[`Replicator.Subscribe`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Subscribe.html "akka.cluster.ddata.Replicator.Subscribe") message to the `Replicator`. It will send [`Replicator.Changed`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Changed.html "akka.cluster.ddata.Replicator.Changed")[`Replicator.Changed`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Changed.html "akka.cluster.ddata.Replicator.Changed") messages to the registered subscriber when the data for the subscribed key is updated. Subscribers will be notified periodically with the configured `notify-subscribers-interval`, and it is also possible to send an explicit `Replicator.FlushChanges` message to the `Replicator` to notify the subscribers immediately.

The subscriber is automatically removed if the subscriber is terminated. A subscriber can also be deregistered with the [`Replicator.Unsubscribe`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Unsubscribe.html "akka.cluster.ddata.Replicator.Unsubscribe")[`Replicator.Unsubscribe`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Unsubscribe.html "akka.cluster.ddata.Replicator.Unsubscribe") message.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L255-L267 "Go to snippet source")val replicator = DistributedData(system).replicator
val Counter1Key = PNCounterKey("counter1")
// subscribe to changes of the Counter1Key value
replicator ! Subscribe(Counter1Key, self)
var currentValue = BigInt(0)

def receive: Receive = {
  case c @ Changed(Counter1Key) =>
    currentValue = c.get(Counter1Key).value
  case "get-count" =>
    // incoming request to retrieve current value of the counter
    sender() ! currentValue
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L292-L323 "Go to snippet source")class DemonstrateSubscribe extends AbstractActor {
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();
  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");

  BigInteger currentValue = BigInteger.valueOf(0);

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Changed.class,
            a -> a.key().equals(counter1Key),
            a -> {
              Changed<PNCounter> g = a;
              currentValue = g.dataValue().getValue();
            })
        .match(
            String.class,
            a -> a.equals("get-count"),
            a -> {
              // incoming request to retrieve current value of the counter
              getSender().tell(currentValue, getSender());
            })
        .build();
  }

  @Override
  public void preStart() {
    // subscribe to changes of the Counter1Key value
    replicator.tell(new Subscribe<PNCounter>(counter1Key, getSelf()), ActorRef.noSender());
  }
}
```

### Consistency

For the full documentation of this feature and for new projects see [Distributed Data Consistency](typed/distributed-data.html#consistency).

Here is an example of using [`WriteMajority`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$WriteMajority.html "akka.cluster.ddata.Replicator.WriteMajority")[`WriteMajority`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.WriteMajority.html "akka.cluster.ddata.Replicator.WriteMajority") and [`ReadMajority`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReadMajority.html "akka.cluster.ddata.Replicator.ReadMajority")[`ReadMajority`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.ReadMajority.html "akka.cluster.ddata.Replicator.ReadMajority"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/ShoppingCart.scala#L30-L32 "Go to snippet source")private val timeout = 3.seconds
private val readMajority = ReadMajority(timeout)
private val writeMajority = WriteMajority(timeout)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/ShoppingCart.java#L33-L34 "Go to snippet source")private final WriteConsistency writeMajority = new WriteMajority(Duration.ofSeconds(3));
private static final ReadConsistency readMajority = new ReadMajority(Duration.ofSeconds(3));
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/ShoppingCart.scala#L53-L68 "Go to snippet source")def receiveGetCart: Receive = {
  case GetCart =>
    replicator ! Get(DataKey, readMajority, Some(sender()))

  case g @ GetSuccess(DataKey, Some(replyTo: ActorRef)) =>
    val data = g.get(DataKey)
    val cart = Cart(data.entries.values.toSet)
    replyTo ! cart

  case NotFound(DataKey, Some(replyTo: ActorRef)) =>
    replyTo ! Cart(Set.empty)

  case GetFailure(DataKey, Some(replyTo: ActorRef)) =>
    // ReadMajority failure, try again with local read
    replicator ! Get(DataKey, ReadLocal, Some(replyTo))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/ShoppingCart.java#L137-L183 "Go to snippet source")private Receive matchGetCart() {
  return receiveBuilder()
      .matchEquals(GET_CART, s -> receiveGetCart())
      .match(
          GetSuccess.class,
          this::isResponseToGetCart,
          g -> receiveGetSuccess((GetSuccess<LWWMap<String, LineItem>>) g))
      .match(
          NotFound.class,
          this::isResponseToGetCart,
          n -> receiveNotFound((NotFound<LWWMap<String, LineItem>>) n))
      .match(
          GetFailure.class,
          this::isResponseToGetCart,
          f -> receiveGetFailure((GetFailure<LWWMap<String, LineItem>>) f))
      .build();
}

private void receiveGetCart() {
  Optional<Object> ctx = Optional.of(getSender());
  replicator.tell(
      new Replicator.Get<LWWMap<String, LineItem>>(dataKey, readMajority, ctx), getSelf());
}

private boolean isResponseToGetCart(GetResponse<?> response) {
  return response.key().equals(dataKey)
      && (response.getRequest().orElse(null) instanceof ActorRef);
}

private void receiveGetSuccess(GetSuccess<LWWMap<String, LineItem>> g) {
  Set<LineItem> items = new HashSet<>(g.dataValue().getEntries().values());
  ActorRef replyTo = (ActorRef) g.getRequest().get();
  replyTo.tell(new Cart(items), getSelf());
}

private void receiveNotFound(NotFound<LWWMap<String, LineItem>> n) {
  ActorRef replyTo = (ActorRef) n.getRequest().get();
  replyTo.tell(new Cart(new HashSet<>()), getSelf());
}

private void receiveGetFailure(GetFailure<LWWMap<String, LineItem>> f) {
  // ReadMajority failure, try again with local read
  Optional<Object> ctx = Optional.of(getSender());
  replicator.tell(
      new Replicator.Get<LWWMap<String, LineItem>>(dataKey, Replicator.readLocal(), ctx),
      getSelf());
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/ShoppingCart.scala#L72-L78 "Go to snippet source")def receiveAddItem: Receive = {
  case cmd @ AddItem(item) =>
    val update = Update(DataKey, LWWMap.empty[String, LineItem], writeMajority, Some(cmd)) { cart =>
      updateCart(cart, item)
    }
    replicator ! update
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/ShoppingCart.java#L187-L196 "Go to snippet source")private Receive matchAddItem() {
  return receiveBuilder().match(AddItem.class, this::receiveAddItem).build();
}

private void receiveAddItem(AddItem add) {
  Update<LWWMap<String, LineItem>> update =
      new Update<>(dataKey, LWWMap.create(), writeMajority, cart -> updateCart(cart, add.item));
  replicator.tell(update, getSelf());
}

```

In some rare cases, when performing an [`Update`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Update.html "akka.cluster.ddata.Replicator.Update")[`Update`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Update.html "akka.cluster.ddata.Replicator.Update") it is needed to first try to fetch latest data from other nodes. That can be done by first sending a [`Get`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Get.html "akka.cluster.ddata.Replicator.Get")[`Get`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Get.html "akka.cluster.ddata.Replicator.Get") with [`ReadMajority`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReadMajority.html "akka.cluster.ddata.Replicator.ReadMajority")[`ReadMajority`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.ReadMajority.html "akka.cluster.ddata.Replicator.ReadMajority") and then continue with the [`Update`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Update.html "akka.cluster.ddata.Replicator.Update")[`Update`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Update.html "akka.cluster.ddata.Replicator.Update") when the [`GetSuccess`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetSuccess.html "akka.cluster.ddata.Replicator.GetSuccess")[`GetSuccess`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.GetSuccess.html "akka.cluster.ddata.Replicator.GetSuccess"), [`GetFailure`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetFailure.html "akka.cluster.ddata.Replicator.GetFailure")[`GetFailure`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.GetFailure.html "akka.cluster.ddata.Replicator.GetFailure") or [`NotFound`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$NotFound.html "akka.cluster.ddata.Replicator.NotFound")[`NotFound`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.NotFound.html "akka.cluster.ddata.Replicator.NotFound") reply is received. This might be needed when you need to base a decision on latest information or when removing entries from an [`ORSet`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSet.html "akka.cluster.ddata.ORSet")[`ORSet`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html "akka.cluster.ddata.ORSet") or [`ORMap`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMap.html "akka.cluster.ddata.ORMap")[`ORMap`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html "akka.cluster.ddata.ORMap"). If an entry is added to an `ORSet` or `ORMap` from one node and removed from another node the entry will only be removed if the added entry is visible on the node where the removal is performed (hence the name observed\-removed set).

The following example illustrates how to do that:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/ShoppingCart.scala#L89-L108 "Go to snippet source")def receiveRemoveItem: Receive = {
  case cmd @ RemoveItem(productId) =>
    // Try to fetch latest from a majority of nodes first, since ORMap
    // remove must have seen the item to be able to remove it.
    replicator ! Get(DataKey, readMajority, Some(cmd))

  case GetSuccess(DataKey, Some(RemoveItem(productId))) =>
    replicator ! Update(DataKey, LWWMap(), writeMajority, None) {
      _.remove(node, productId)
    }

  case GetFailure(DataKey, Some(RemoveItem(productId))) =>
    // ReadMajority failed, fall back to best effort local value
    replicator ! Update(DataKey, LWWMap(), writeMajority, None) {
      _.remove(node, productId)
    }

  case NotFound(DataKey, Some(RemoveItem(productId))) =>
  // nothing to remove
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/ShoppingCart.java#L231-L259 "Go to snippet source")private void receiveRemoveItem(RemoveItem rm) {
  // Try to fetch latest from a majority of nodes first, since ORMap
  // remove must have seen the item to be able to remove it.
  Optional<Object> ctx = Optional.of(rm);
  replicator.tell(
      new Replicator.Get<LWWMap<String, LineItem>>(dataKey, readMajority, ctx), getSelf());
}

private void receiveRemoveItemGetSuccess(GetSuccess<LWWMap<String, LineItem>> g) {
  RemoveItem rm = (RemoveItem) g.getRequest().get();
  removeItem(rm.productId);
}

private void receiveRemoveItemGetFailure(GetFailure<LWWMap<String, LineItem>> f) {
  // ReadMajority failed, fall back to best effort local value
  RemoveItem rm = (RemoveItem) f.getRequest().get();
  removeItem(rm.productId);
}

private void removeItem(String productId) {
  Update<LWWMap<String, LineItem>> update =
      new Update<>(dataKey, LWWMap.create(), writeMajority, cart -> cart.remove(node, productId));
  replicator.tell(update, getSelf());
}

private boolean isResponseToRemoveItem(GetResponse<?> response) {
  return response.key().equals(dataKey)
      && (response.getRequest().orElse(null) instanceof RemoveItem);
}
```

Warning
*Caveat:* Even if you use `WriteMajority` and `ReadMajority` there is small risk that you may read stale data if the cluster membership has changed between the `Update` and the `Get`. For example, in cluster of 5 nodes when you `Update` and that change is written to 3 nodes: n1, n2, n3\. Then 2 more nodes are added and a `Get` request is reading from 4 nodes, which happens to be n4, n5, n6, n7, i.e. the value on n1, n2, n3 is not seen in the response of the `Get` request.

### Delete

For the full documentation of this feature and for new projects see [Distributed Data \- Delete](typed/distributed-data.html#delete).

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/ddata/DistributedDataDocSpec.scala#L276-L283 "Go to snippet source")val replicator = DistributedData(system).replicator
val Counter1Key = PNCounterKey("counter1")
val Set2Key = ORSetKey[String]("set2")

replicator ! Delete(Counter1Key, WriteLocal)

val writeMajority = WriteMajority(timeout = 5.seconds)
replicator ! Delete(Set2Key, writeMajority)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/ddata/DistributedDataDocTest.java#L328-L348 "Go to snippet source")class DemonstrateDelete extends AbstractActor {
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");
  final Key<ORSet<String>> set2Key = ORSetKey.create("set2");

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            "demonstrate delete",
            msg -> {
              replicator.tell(
                  new Delete<PNCounter>(counter1Key, Replicator.writeLocal()), getSelf());

              final WriteConsistency writeMajority = new WriteMajority(Duration.ofSeconds(5));
              replicator.tell(new Delete<PNCounter>(counter1Key, writeMajority), getSelf());
            })
        .build();
  }
}
```

Warning
As deleted keys continue to be included in the stored data on each node as well as in gossip messages, a continuous series of updates and deletes of top\-level entities will result in growing memory usage until an ActorSystem runs out of memory. To use Akka Distributed Data where frequent adds and removes are required, you should use a fixed number of top\-level data types that support both updates and removals, for example [`ORMap`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMap.html "akka.cluster.ddata.ORMap")[`ORMap`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html "akka.cluster.ddata.ORMap") or [`ORSet`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSet.html "akka.cluster.ddata.ORSet")[`ORSet`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html "akka.cluster.ddata.ORSet").

## Replicated data types

Akka contains a set of useful replicated data types and it is fully possible to implement custom replicated data types. For the full documentation of this feature and for new projects see [Distributed Data Replicated data types](typed/distributed-data.html#replicated-data-types).

### Delta\-CRDT

For the full documentation of this feature and for new projects see [Distributed Data Delta CRDT](typed/distributed-data.html#delta-crdt).

### Custom Data Type

You can implement your own data types. For the full documentation of this feature and for new projects see [Distributed Data custom data type](typed/distributed-data.html#custom-data-type).

## Durable Storage

For the full documentation of this feature and for new projects see [Durable Storage](typed/distributed-data.html#durable-storage).

## Limitations

For the full documentation of this feature and for new projects see [Limitations](typed/distributed-data.html#limitations).

## Learn More about CRDTs

- [Strong Eventual Consistency and Conflict\-free Replicated Data Types (video)](https://www.youtube.com/watch?v=oyUHd894w18&feature=youtu.be) talk by Mark Shapiro
- [A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf) paper by Mark Shapiro et. al.

## Configuration

The [`DistributedData`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DistributedData.html "akka.cluster.ddata.DistributedData")[`DistributedData`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DistributedData.html "akka.cluster.ddata.DistributedData") extension can be configured with the following properties:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/resources/reference.conf#L10-L152 "Go to snippet source")# Settings for the DistributedData extension
akka.cluster.distributed-data {
  # Actor name of the Replicator actor, /system/ddataReplicator
  name = ddataReplicator

  # Replicas are running on members tagged with this role.
  # All members are used if undefined or empty.
  role = ""

  # How often the Replicator should send out gossip information
  gossip-interval = 2 s
  
  # How often the subscribers will be notified of changes, if any
  notify-subscribers-interval = 500 ms

  # Logging of data with payload size in bytes larger than
  # this value. Maximum detected size per key is logged once,
  # with an increase threshold of 10%.
  # It can be disabled by setting the property to off.
  log-data-size-exceeding = 10 KiB

  # Maximum number of entries to transfer in one round of gossip exchange when
  # synchronizing the replicas. Next chunk will be transferred in next round of gossip.
  # The actual number of data entries in each Gossip message is dynamically
  # adjusted to not exceed the maximum remote message size (maximum-frame-size).
  max-delta-elements = 500
  
  # The id of the dispatcher to use for Replicator actors.
  # If specified you need to define the settings of the actual dispatcher.
  use-dispatcher = "akka.actor.internal-dispatcher"

  # How often the Replicator checks for pruning of data associated with
  # removed cluster nodes. If this is set to 'off' the pruning feature will
  # be completely disabled.
  pruning-interval = 120 s
  
  # How long time it takes to spread the data to all other replica nodes.
  # This is used when initiating and completing the pruning process of data associated
  # with removed cluster nodes. The time measurement is stopped when any replica is 
  # unreachable, but it's still recommended to configure this with certain margin.
  # It should be in the magnitude of minutes even though typical dissemination time
  # is shorter (grows logarithmic with number of nodes). There is no advantage of 
  # setting this too low. Setting it to large value will delay the pruning process.
  max-pruning-dissemination = 300 s
  
  # The markers of that pruning has been performed for a removed node are kept for this
  # time and thereafter removed. If and old data entry that was never pruned is somehow
  # injected and merged with existing data after this time the value will not be correct.
  # This would be possible (although unlikely) in the case of a long network partition.
  # It should be in the magnitude of hours. For durable data it is configured by 
  # 'akka.cluster.distributed-data.durable.pruning-marker-time-to-live'.
 pruning-marker-time-to-live = 6 h
  
  # Serialized Write and Read messages are cached when they are sent to 
  # several nodes. If no further activity they are removed from the cache
  # after this duration.
  serializer-cache-time-to-live = 10s

  # Update and Get operations are sent to oldest nodes first.
  # This is useful together with Cluster Singleton, which is running on oldest nodes.
  prefer-oldest = off
  
  # Settings for delta-CRDT
  delta-crdt {
    # enable or disable delta-CRDT replication
    enabled = on
    
    # Some complex deltas grow in size for each update and above this
    # threshold such deltas are discarded and sent as full state instead.
    # This is number of elements or similar size hint, not size in bytes.
    max-delta-size = 50
  }

  # Map of keys and inactivity duration for entries that will automatically be removed
  # without tombstones when they have been inactive for the given duration.
  # Prefix matching is supported by using * at the end of a key.
  # Matching tombstones will also be removed after the expiry duration.
  expire-keys-after-inactivity {
    # Example syntax:
    # "key-1" = 10 minutes
    # "cache-*" = 2 minutes
  }
  
  durable {
    # List of keys that are durable. Prefix matching is supported by using * at the
    # end of a key.  
    keys = []
    
    # The markers of that pruning has been performed for a removed node are kept for this
    # time and thereafter removed. If and old data entry that was never pruned is
    # injected and merged with existing data after this time the value will not be correct.
    # This would be possible if replica with durable data didn't participate in the pruning
    # (e.g. it was shutdown) and later started after this time. A durable replica should not 
    # be stopped for longer time than this duration and if it is joining again after this
    # duration its data should first be manually removed (from the lmdb directory).
    # It should be in the magnitude of days. Note that there is a corresponding setting
    # for non-durable data: 'akka.cluster.distributed-data.pruning-marker-time-to-live'.
    pruning-marker-time-to-live = 10 d
    
    # Fully qualified class name of the durable store actor. It must be a subclass
    # of akka.actor.Actor and handle the protocol defined in 
    # akka.cluster.ddata.DurableStore. The class must have a constructor with 
    # com.typesafe.config.Config parameter.
    store-actor-class = akka.cluster.ddata.LmdbDurableStore
    
    use-dispatcher = akka.cluster.distributed-data.durable.pinned-store
    
    pinned-store {
      executor = thread-pool-executor
      type = PinnedDispatcher
    }
    
    # Config for the LmdbDurableStore
    lmdb {
      # Directory of LMDB file. There are two options:
      # 1. A relative or absolute path to a directory that ends with 'ddata'
      #    the full name of the directory will contain name of the ActorSystem
      #    and its remote port.
      # 2. Otherwise the path is used as is, as a relative or absolute path to
      #    a directory.
      #
      # When running in production you may want to configure this to a specific
      # path (alt 2), since the default directory contains the remote port of the
      # actor system to make the name unique. If using a dynamically assigned 
      # port (0) it will be different each time and the previously stored data 
      # will not be loaded.
      dir = "ddata"
      
      # Size in bytes of the memory mapped file.
      map-size = 100 MiB
      
      # Accumulate changes before storing improves performance with the
      # risk of losing the last writes if the JVM crashes.
      # The interval is by default set to 'off' to write each update immediately.
      # Enabling write behind by specifying a duration, e.g. 200ms, is especially 
      # efficient when performing many writes to the same key, because it is only 
      # the last value for each key that will be serialized and stored.  
      # write-behind-interval = 200 ms
      write-behind-interval = off
    }
  }
  
}
```

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-distributed-data" % AkkaVersion
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
    <artifactId>akka-distributed-data_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-distributed-data_${versions.ScalaBinary}"
}
```

### Example 4: Using the Replicator

```scala
import java.util.concurrent.ThreadLocalRandom
import akka.actor.Actor
import akka.actor.ActorLogging
import akka.cluster.ddata.DistributedData
import akka.cluster.ddata.ORSet
import akka.cluster.ddata.ORSetKey
import akka.cluster.ddata.Replicator._

object DataBot {
  private case object Tick
}

class DataBot extends Actor with ActorLogging {
  import DataBot._

  val replicator = DistributedData(context.system).replicator
  implicit val node: SelfUniqueAddress = DistributedData(context.system).selfUniqueAddress

  import context.dispatcher
  val tickTask = context.system.scheduler.scheduleWithFixedDelay(5.seconds, 5.seconds, self, Tick)

  val DataKey = ORSetKey[String]("key")

  replicator ! Subscribe(DataKey, self)

  def receive = {
    case Tick =>
      val s = ThreadLocalRandom.current().nextInt(97, 123).toChar.toString
      if (ThreadLocalRandom.current().nextBoolean()) {
        // add
        log.info("Adding: {}", s)
        replicator ! Update(DataKey, ORSet.empty[String], WriteLocal)(_ :+ s)
      } else {
        // remove
        log.info("Removing: {}", s)
        replicator ! Update(DataKey, ORSet.empty[String], WriteLocal)(_.remove(s))
      }

    case _: UpdateResponse[_] => // ignore

    case c @ Changed(DataKey) =>
      val data = c.get(DataKey)
      log.info("Current elements: {}", data.elements)
  }

  override def postStop(): Unit = tickTask.cancel()

}
```

### Example 5: Using the Replicator

```java
import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Cancellable;
import akka.cluster.ddata.DistributedData;
import akka.cluster.ddata.Key;
import akka.cluster.ddata.ORSet;
import akka.cluster.ddata.ORSetKey;
import akka.cluster.ddata.Replicator;
import akka.cluster.ddata.Replicator.Changed;
import akka.cluster.ddata.Replicator.Subscribe;
import akka.cluster.ddata.Replicator.Update;
import akka.cluster.ddata.Replicator.UpdateResponse;
import akka.cluster.ddata.SelfUniqueAddress;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

public class DataBot extends AbstractActor {

  private static final String TICK = "tick";

  private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  private final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();
  private final SelfUniqueAddress node =
      DistributedData.get(getContext().getSystem()).selfUniqueAddress();

  private final Cancellable tickTask =
      getContext()
          .getSystem()
          .scheduler()
          .scheduleWithFixedDelay(
              Duration.ofSeconds(5),
              Duration.ofSeconds(5),
              getSelf(),
              TICK,
              getContext().getDispatcher(),
              getSelf());

  private final Key<ORSet<String>> dataKey = ORSetKey.create("key");

  @SuppressWarnings("unchecked")
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(String.class, a -> a.equals(TICK), a -> receiveTick())
        .match(
            Changed.class,
            c -> c.key().equals(dataKey),
            c -> receiveChanged((Changed<ORSet<String>>) c))
        .match(UpdateResponse.class, r -> receiveUpdateResponse())
        .build();
  }

  private void receiveTick() {
    String s = String.valueOf((char) ThreadLocalRandom.current().nextInt(97, 123));
    if (ThreadLocalRandom.current().nextBoolean()) {
      // add
      log.info("Adding: {}", s);
      Update<ORSet<String>> update =
          new Update<>(dataKey, ORSet.create(), Replicator.writeLocal(), curr -> curr.add(node, s));
      replicator.tell(update, getSelf());
    } else {
      // remove
      log.info("Removing: {}", s);
      Update<ORSet<String>> update =
          new Update<>(
              dataKey, ORSet.create(), Replicator.writeLocal(), curr -> curr.remove(node, s));
      replicator.tell(update, getSelf());
    }
  }

  private void receiveChanged(Changed<ORSet<String>> c) {
    ORSet<String> data = c.dataValue();
    log.info("Current elements: {}", data.getElements());
  }

  private void receiveUpdateResponse() {
    // ignore
  }

  @Override
  public void preStart() {
    Subscribe<ORSet<String>> subscribe = new Subscribe<>(dataKey, getSelf());
    replicator.tell(subscribe, ActorRef.noSender());
  }

  @Override
  public void postStop() {
    tickTask.cancel();
  }
}
```

### Example 6: Update

```scala
implicit val node: SelfUniqueAddress = DistributedData(system).selfUniqueAddress
val replicator = DistributedData(system).replicator

val Counter1Key = PNCounterKey("counter1")
val Set1Key = GSetKey[String]("set1")
val Set2Key = ORSetKey[String]("set2")
val ActiveFlagKey = FlagKey("active")

replicator ! Update(Counter1Key, PNCounter(), WriteLocal)(_ :+ 1)

val writeTo3 = WriteTo(n = 3, timeout = 1.second)
replicator ! Update(Set1Key, GSet.empty[String], writeTo3)(_ + "hello")

val writeMajority = WriteMajority(timeout = 5.seconds)
replicator ! Update(Set2Key, ORSet.empty[String], writeMajority)(_ :+ "hello")

val writeAll = WriteAll(timeout = 5.seconds)
replicator ! Update(ActiveFlagKey, Flag.Disabled, writeAll)(_.switchOn)
```

### Example 7: Update

```java
class DemonstrateUpdate extends AbstractActor {
  final SelfUniqueAddress node =
      DistributedData.get(getContext().getSystem()).selfUniqueAddress();
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");
  final Key<GSet<String>> set1Key = GSetKey.create("set1");
  final Key<ORSet<String>> set2Key = ORSetKey.create("set2");
  final Key<Flag> activeFlagKey = FlagKey.create("active");

  @Override
  public Receive createReceive() {
    ReceiveBuilder b = receiveBuilder();

    b.matchEquals(
        "demonstrate update",
        msg -> {
          replicator.tell(
              new Replicator.Update<PNCounter>(
                  counter1Key,
                  PNCounter.create(),
                  Replicator.writeLocal(),
                  curr -> curr.increment(node, 1)),
              getSelf());

          final WriteConsistency writeTo3 = new WriteTo(3, Duration.ofSeconds(1));
          replicator.tell(
              new Replicator.Update<GSet<String>>(
                  set1Key, GSet.create(), writeTo3, curr -> curr.add("hello")),
              getSelf());

          final WriteConsistency writeMajority = new WriteMajority(Duration.ofSeconds(5));
          replicator.tell(
              new Replicator.Update<ORSet<String>>(
                  set2Key, ORSet.create(), writeMajority, curr -> curr.add(node, "hello")),
              getSelf());

          final WriteConsistency writeAll = new WriteAll(Duration.ofSeconds(5));
          replicator.tell(
              new Replicator.Update<Flag>(
                  activeFlagKey, Flag.create(), writeAll, curr -> curr.switchOn()),
              getSelf());
        });
    return b.build();
  }
}
```

### Example 8: Update

```scala
case UpdateSuccess(Counter1Key, req) => // ok
```

### Example 9: Update

```java
b.match(
    UpdateSuccess.class,
    a -> a.key().equals(counter1Key),
    a -> {
      // ok
    });
```

### Example 10: Update

```scala
case UpdateSuccess(Set1Key, req) => // ok
case UpdateTimeout(Set1Key, req) =>
// write to 3 nodes failed within 1.second
```

### Example 11: Update

```java
b.match(
        UpdateSuccess.class,
        a -> a.key().equals(set1Key),
        a -> {
          // ok
        })
    .match(
        UpdateTimeout.class,
        a -> a.key().equals(set1Key),
        a -> {
          // write to 3 nodes failed within 1.second
        });
```

### Example 12: Update

```scala
implicit val node = DistributedData(system).selfUniqueAddress
val replicator = DistributedData(system).replicator
val writeTwo = WriteTo(n = 2, timeout = 3.second)
val Counter1Key = PNCounterKey("counter1")

def receive: Receive = {
  case "increment" =>
    // incoming command to increase the counter
    val upd = Update(Counter1Key, PNCounter(), writeTwo, request = Some(sender()))(_ :+ 1)
    replicator ! upd

  case UpdateSuccess(Counter1Key, Some(replyTo: ActorRef)) =>
    replyTo ! "ack"
  case UpdateTimeout(Counter1Key, Some(replyTo: ActorRef)) =>
    replyTo ! "nack"
}
```

### Example 13: Update

```java
class DemonstrateUpdateWithRequestContext extends AbstractActor {
  final SelfUniqueAddress node = DistributedData.get(system).selfUniqueAddress();
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final WriteConsistency writeTwo = new WriteTo(2, Duration.ofSeconds(3));
  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            a -> a.equals("increment"),
            a -> {
              // incoming command to increase the counter
              Optional<Object> reqContext = Optional.of(getSender());
              Replicator.Update<PNCounter> upd =
                  new Replicator.Update<PNCounter>(
                      counter1Key,
                      PNCounter.create(),
                      writeTwo,
                      reqContext,
                      curr -> curr.increment(node, 1));
              replicator.tell(upd, getSelf());
            })
        .match(
            UpdateSuccess.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              replyTo.tell("ack", getSelf());
            })
        .match(
            UpdateTimeout.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              replyTo.tell("nack", getSelf());
            })
        .build();
  }
}
```

### Example 14: Get

```scala
val replicator = DistributedData(system).replicator
val Counter1Key = PNCounterKey("counter1")
val Set1Key = GSetKey[String]("set1")
val Set2Key = ORSetKey[String]("set2")
val ActiveFlagKey = FlagKey("active")

replicator ! Get(Counter1Key, ReadLocal)

val readFrom3 = ReadFrom(n = 3, timeout = 1.second)
replicator ! Get(Set1Key, readFrom3)

val readMajority = ReadMajority(timeout = 5.seconds)
replicator ! Get(Set2Key, readMajority)

val readAll = ReadAll(timeout = 5.seconds)
replicator ! Get(ActiveFlagKey, readAll)
```

### Example 15: Get

```java
class DemonstrateGet extends AbstractActor {
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");
  final Key<GSet<String>> set1Key = GSetKey.create("set1");
  final Key<ORSet<String>> set2Key = ORSetKey.create("set2");
  final Key<Flag> activeFlagKey = FlagKey.create("active");

  @Override
  public Receive createReceive() {
    ReceiveBuilder b = receiveBuilder();

    b.matchEquals(
        "demonstrate get",
        msg -> {
          replicator.tell(
              new Replicator.Get<PNCounter>(counter1Key, Replicator.readLocal()), getSelf());

          final ReadConsistency readFrom3 = new ReadFrom(3, Duration.ofSeconds(1));
          replicator.tell(new Replicator.Get<GSet<String>>(set1Key, readFrom3), getSelf());

          final ReadConsistency readMajority = new ReadMajority(Duration.ofSeconds(5));
          replicator.tell(new Replicator.Get<ORSet<String>>(set2Key, readMajority), getSelf());

          final ReadConsistency readAll = new ReadAll(Duration.ofSeconds(5));
          replicator.tell(new Replicator.Get<Flag>(activeFlagKey, readAll), getSelf());
        });
    return b.build();
  }
}
```

### Example 16: Get

```scala
case g @ GetSuccess(Counter1Key, req) =>
  val value = g.get(Counter1Key).value
case NotFound(Counter1Key, req) => // key counter1 does not exist
```

### Example 17: Get

```java
b.match(
        GetSuccess.class,
        a -> a.key().equals(counter1Key),
        a -> {
          GetSuccess<PNCounter> g = a;
          BigInteger value = g.dataValue().getValue();
        })
    .match(
        NotFound.class,
        a -> a.key().equals(counter1Key),
        a -> {
          // key counter1 does not exist
        });
```

### Example 18: Get

```scala
case g @ GetSuccess(Set1Key, req) =>
  val elements = g.get(Set1Key).elements
case GetFailure(Set1Key, req) =>
// read from 3 nodes failed within 1.second
case NotFound(Set1Key, req) => // key set1 does not exist
```

### Example 19: Get

```java
b.match(
        GetSuccess.class,
        a -> a.key().equals(set1Key),
        a -> {
          GetSuccess<GSet<String>> g = a;
          Set<String> value = g.dataValue().getElements();
        })
    .match(
        GetFailure.class,
        a -> a.key().equals(set1Key),
        a -> {
          // read from 3 nodes failed within 1.second
        })
    .match(
        NotFound.class,
        a -> a.key().equals(set1Key),
        a -> {
          // key set1 does not exist
        });
```

### Example 20: Get

```scala
implicit val node = DistributedData(system).selfUniqueAddress
val replicator = DistributedData(system).replicator
val readTwo = ReadFrom(n = 2, timeout = 3.second)
val Counter1Key = PNCounterKey("counter1")

def receive: Receive = {
  case "get-count" =>
    // incoming request to retrieve current value of the counter
    replicator ! Get(Counter1Key, readTwo, request = Some(sender()))

  case g @ GetSuccess(Counter1Key, Some(replyTo: ActorRef)) =>
    val value = g.get(Counter1Key).value.longValue
    replyTo ! value
  case GetFailure(Counter1Key, Some(replyTo: ActorRef)) =>
    replyTo ! -1L
  case NotFound(Counter1Key, Some(replyTo: ActorRef)) =>
    replyTo ! 0L
}
```

### Example 21: Get

```java
class DemonstrateGetWithRequestContext extends AbstractActor {
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final ReadConsistency readTwo = new ReadFrom(2, Duration.ofSeconds(3));
  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            a -> a.equals("get-count"),
            a -> {
              // incoming request to retrieve current value of the counter
              Optional<Object> reqContext = Optional.of(getSender());
              replicator.tell(new Replicator.Get<PNCounter>(counter1Key, readTwo), getSelf());
            })
        .match(
            GetSuccess.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              GetSuccess<PNCounter> g = a;
              long value = g.dataValue().getValue().longValue();
              replyTo.tell(value, getSelf());
            })
        .match(
            GetFailure.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              replyTo.tell(-1L, getSelf());
            })
        .match(
            NotFound.class,
            a -> a.key().equals(counter1Key),
            a -> {
              ActorRef replyTo = (ActorRef) a.getRequest().get();
              replyTo.tell(0L, getSelf());
            })
        .build();
  }
}
```

### Example 22: Subscribe

```scala
val replicator = DistributedData(system).replicator
val Counter1Key = PNCounterKey("counter1")
// subscribe to changes of the Counter1Key value
replicator ! Subscribe(Counter1Key, self)
var currentValue = BigInt(0)

def receive: Receive = {
  case c @ Changed(Counter1Key) =>
    currentValue = c.get(Counter1Key).value
  case "get-count" =>
    // incoming request to retrieve current value of the counter
    sender() ! currentValue
}
```

### Example 23: Subscribe

```java
class DemonstrateSubscribe extends AbstractActor {
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();
  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");

  BigInteger currentValue = BigInteger.valueOf(0);

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Changed.class,
            a -> a.key().equals(counter1Key),
            a -> {
              Changed<PNCounter> g = a;
              currentValue = g.dataValue().getValue();
            })
        .match(
            String.class,
            a -> a.equals("get-count"),
            a -> {
              // incoming request to retrieve current value of the counter
              getSender().tell(currentValue, getSender());
            })
        .build();
  }

  @Override
  public void preStart() {
    // subscribe to changes of the Counter1Key value
    replicator.tell(new Subscribe<PNCounter>(counter1Key, getSelf()), ActorRef.noSender());
  }
}
```

### Example 24: Consistency

```scala
private val timeout = 3.seconds
private val readMajority = ReadMajority(timeout)
private val writeMajority = WriteMajority(timeout)
```

### Example 25: Consistency

```java
private final WriteConsistency writeMajority = new WriteMajority(Duration.ofSeconds(3));
private static final ReadConsistency readMajority = new ReadMajority(Duration.ofSeconds(3));
```

### Example 26: Consistency

```scala
def receiveGetCart: Receive = {
  case GetCart =>
    replicator ! Get(DataKey, readMajority, Some(sender()))

  case g @ GetSuccess(DataKey, Some(replyTo: ActorRef)) =>
    val data = g.get(DataKey)
    val cart = Cart(data.entries.values.toSet)
    replyTo ! cart

  case NotFound(DataKey, Some(replyTo: ActorRef)) =>
    replyTo ! Cart(Set.empty)

  case GetFailure(DataKey, Some(replyTo: ActorRef)) =>
    // ReadMajority failure, try again with local read
    replicator ! Get(DataKey, ReadLocal, Some(replyTo))
}
```

### Example 27: Consistency

```java
private Receive matchGetCart() {
  return receiveBuilder()
      .matchEquals(GET_CART, s -> receiveGetCart())
      .match(
          GetSuccess.class,
          this::isResponseToGetCart,
          g -> receiveGetSuccess((GetSuccess<LWWMap<String, LineItem>>) g))
      .match(
          NotFound.class,
          this::isResponseToGetCart,
          n -> receiveNotFound((NotFound<LWWMap<String, LineItem>>) n))
      .match(
          GetFailure.class,
          this::isResponseToGetCart,
          f -> receiveGetFailure((GetFailure<LWWMap<String, LineItem>>) f))
      .build();
}

private void receiveGetCart() {
  Optional<Object> ctx = Optional.of(getSender());
  replicator.tell(
      new Replicator.Get<LWWMap<String, LineItem>>(dataKey, readMajority, ctx), getSelf());
}

private boolean isResponseToGetCart(GetResponse<?> response) {
  return response.key().equals(dataKey)
      && (response.getRequest().orElse(null) instanceof ActorRef);
}

private void receiveGetSuccess(GetSuccess<LWWMap<String, LineItem>> g) {
  Set<LineItem> items = new HashSet<>(g.dataValue().getEntries().values());
  ActorRef replyTo = (ActorRef) g.getRequest().get();
  replyTo.tell(new Cart(items), getSelf());
}

private void receiveNotFound(NotFound<LWWMap<String, LineItem>> n) {
  ActorRef replyTo = (ActorRef) n.getRequest().get();
  replyTo.tell(new Cart(new HashSet<>()), getSelf());
}

private void receiveGetFailure(GetFailure<LWWMap<String, LineItem>> f) {
  // ReadMajority failure, try again with local read
  Optional<Object> ctx = Optional.of(getSender());
  replicator.tell(
      new Replicator.Get<LWWMap<String, LineItem>>(dataKey, Replicator.readLocal(), ctx),
      getSelf());
}
```

### Example 28: Consistency

```scala
def receiveAddItem: Receive = {
  case cmd @ AddItem(item) =>
    val update = Update(DataKey, LWWMap.empty[String, LineItem], writeMajority, Some(cmd)) { cart =>
      updateCart(cart, item)
    }
    replicator ! update
}
```

### Example 29: Consistency

```java
private Receive matchAddItem() {
  return receiveBuilder().match(AddItem.class, this::receiveAddItem).build();
}

private void receiveAddItem(AddItem add) {
  Update<LWWMap<String, LineItem>> update =
      new Update<>(dataKey, LWWMap.create(), writeMajority, cart -> updateCart(cart, add.item));
  replicator.tell(update, getSelf());
}
```

### Example 30: Consistency

```scala
def receiveRemoveItem: Receive = {
  case cmd @ RemoveItem(productId) =>
    // Try to fetch latest from a majority of nodes first, since ORMap
    // remove must have seen the item to be able to remove it.
    replicator ! Get(DataKey, readMajority, Some(cmd))

  case GetSuccess(DataKey, Some(RemoveItem(productId))) =>
    replicator ! Update(DataKey, LWWMap(), writeMajority, None) {
      _.remove(node, productId)
    }

  case GetFailure(DataKey, Some(RemoveItem(productId))) =>
    // ReadMajority failed, fall back to best effort local value
    replicator ! Update(DataKey, LWWMap(), writeMajority, None) {
      _.remove(node, productId)
    }

  case NotFound(DataKey, Some(RemoveItem(productId))) =>
  // nothing to remove
}
```

### Example 31: Consistency

```java
private void receiveRemoveItem(RemoveItem rm) {
  // Try to fetch latest from a majority of nodes first, since ORMap
  // remove must have seen the item to be able to remove it.
  Optional<Object> ctx = Optional.of(rm);
  replicator.tell(
      new Replicator.Get<LWWMap<String, LineItem>>(dataKey, readMajority, ctx), getSelf());
}

private void receiveRemoveItemGetSuccess(GetSuccess<LWWMap<String, LineItem>> g) {
  RemoveItem rm = (RemoveItem) g.getRequest().get();
  removeItem(rm.productId);
}

private void receiveRemoveItemGetFailure(GetFailure<LWWMap<String, LineItem>> f) {
  // ReadMajority failed, fall back to best effort local value
  RemoveItem rm = (RemoveItem) f.getRequest().get();
  removeItem(rm.productId);
}

private void removeItem(String productId) {
  Update<LWWMap<String, LineItem>> update =
      new Update<>(dataKey, LWWMap.create(), writeMajority, cart -> cart.remove(node, productId));
  replicator.tell(update, getSelf());
}

private boolean isResponseToRemoveItem(GetResponse<?> response) {
  return response.key().equals(dataKey)
      && (response.getRequest().orElse(null) instanceof RemoveItem);
}
```

### Example 32: Delete

```scala
val replicator = DistributedData(system).replicator
val Counter1Key = PNCounterKey("counter1")
val Set2Key = ORSetKey[String]("set2")

replicator ! Delete(Counter1Key, WriteLocal)

val writeMajority = WriteMajority(timeout = 5.seconds)
replicator ! Delete(Set2Key, writeMajority)
```

### Example 33: Delete

```java
class DemonstrateDelete extends AbstractActor {
  final ActorRef replicator = DistributedData.get(getContext().getSystem()).replicator();

  final Key<PNCounter> counter1Key = PNCounterKey.create("counter1");
  final Key<ORSet<String>> set2Key = ORSetKey.create("set2");

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            "demonstrate delete",
            msg -> {
              replicator.tell(
                  new Delete<PNCounter>(counter1Key, Replicator.writeLocal()), getSelf());

              final WriteConsistency writeMajority = new WriteMajority(Duration.ofSeconds(5));
              replicator.tell(new Delete<PNCounter>(counter1Key, writeMajority), getSelf());
            })
        .build();
  }
}
```

### Example 34: Configuration

```conf
# Settings for the DistributedData extension
akka.cluster.distributed-data {
  # Actor name of the Replicator actor, /system/ddataReplicator
  name = ddataReplicator

  # Replicas are running on members tagged with this role.
  # All members are used if undefined or empty.
  role = ""

  # How often the Replicator should send out gossip information
  gossip-interval = 2 s
  
  # How often the subscribers will be notified of changes, if any
  notify-subscribers-interval = 500 ms

  # Logging of data with payload size in bytes larger than
  # this value. Maximum detected size per key is logged once,
  # with an increase threshold of 10%.
  # It can be disabled by setting the property to off.
  log-data-size-exceeding = 10 KiB

  # Maximum number of entries to transfer in one round of gossip exchange when
  # synchronizing the replicas. Next chunk will be transferred in next round of gossip.
  # The actual number of data entries in each Gossip message is dynamically
  # adjusted to not exceed the maximum remote message size (maximum-frame-size).
  max-delta-elements = 500
  
  # The id of the dispatcher to use for Replicator actors.
  # If specified you need to define the settings of the actual dispatcher.
  use-dispatcher = "akka.actor.internal-dispatcher"

  # How often the Replicator checks for pruning of data associated with
  # removed cluster nodes. If this is set to 'off' the pruning feature will
  # be completely disabled.
  pruning-interval = 120 s
  
  # How long time it takes to spread the data to all other replica nodes.
  # This is used when initiating and completing the pruning process of data associated
  # with removed cluster nodes. The time measurement is stopped when any replica is 
  # unreachable, but it's still recommended to configure this with certain margin.
  # It should be in the magnitude of minutes even though typical dissemination time
  # is shorter (grows logarithmic with number of nodes). There is no advantage of 
  # setting this too low. Setting it to large value will delay the pruning process.
  max-pruning-dissemination = 300 s
  
  # The markers of that pruning has been performed for a removed node are kept for this
  # time and thereafter removed. If and old data entry that was never pruned is somehow
  # injected and merged with existing data after this time the value will not be correct.
  # This would be possible (although unlikely) in the case of a long network partition.
  # It should be in the magnitude of hours. For durable data it is configured by 
  # 'akka.cluster.distributed-data.durable.pruning-marker-time-to-live'.
 pruning-marker-time-to-live = 6 h
  
  # Serialized Write and Read messages are cached when they are sent to 
  # several nodes. If no further activity they are removed from the cache
  # after this duration.
  serializer-cache-time-to-live = 10s

  # Update and Get operations are sent to oldest nodes first.
  # This is useful together with Cluster Singleton, which is running on oldest nodes.
  prefer-oldest = off
  
  # Settings for delta-CRDT
  delta-crdt {
    # enable or disable delta-CRDT replication
    enabled = on
    
    # Some complex deltas grow in size for each update and above this
    # threshold such deltas are discarded and sent as full state instead.
    # This is number of elements or similar size hint, not size in bytes.
    max-delta-size = 50
  }

  # Map of keys and inactivity duration for entries that will automatically be removed
  # without tombstones when they have been inactive for the given duration.
  # Prefix matching is supported by using * at the end of a key.
  # Matching tombstones will also be removed after the expiry duration.
  expire-keys-after-inactivity {
    # Example syntax:
    # "key-1" = 10 minutes
    # "cache-*" = 2 minutes
  }
  
  durable {
    # List of keys that are durable. Prefix matching is supported by using * at the
    # end of a key.  
    keys = []
    
    # The markers of that pruning has been performed for a removed node are kept for this
    # time and thereafter removed. If and old data entry that was never pruned is
    # injected and merged with existing data after this time the value will not be correct.
    # This would be possible if replica with durable data didn't participate in the pruning
    # (e.g. it was shutdown) and later started after this time. A durable replica should not 
    # be stopped for longer time than this duration and if it is joining again after this
    # duration its data should first be manually removed (from the lmdb directory).
    # It should be in the magnitude of days. Note that there is a corresponding setting
    # for non-durable data: 'akka.cluster.distributed-data.pruning-marker-time-to-live'.
    pruning-marker-time-to-live = 10 d
    
    # Fully qualified class name of the durable store actor. It must be a subclass
    # of akka.actor.Actor and handle the protocol defined in 
    # akka.cluster.ddata.DurableStore. The class must have a constructor with 
    # com.typesafe.config.Config parameter.
    store-actor-class = akka.cluster.ddata.LmdbDurableStore
    
    use-dispatcher = akka.cluster.distributed-data.durable.pinned-store
    
    pinned-store {
      executor = thread-pool-executor
      type = PinnedDispatcher
    }
    
    # Config for the LmdbDurableStore
    lmdb {
      # Directory of LMDB file. There are two options:
      # 1. A relative or absolute path to a directory that ends with 'ddata'
      #    the full name of the directory will contain name of the ActorSystem
      #    and its remote port.
      # 2. Otherwise the path is used as is, as a relative or absolute path to
      #    a directory.
      #
      # When running in production you may want to configure this to a specific
      # path (alt 2), since the default directory contains the remote port of the
      # actor system to make the name unique. If using a dynamically assigned 
      # port (0) it will be different each time and the previously stored data 
      # will not be loaded.
      dir = "ddata"
      
      # Size in bytes of the memory mapped file.
      map-size = 100 MiB
      
      # Accumulate changes before storing improves performance with the
      # risk of losing the last writes if the JVM crashes.
      # The interval is by default set to 'off' to write each update immediately.
      # Enabling write behind by specifying a duration, e.g. 200ms, is especially 
      # efficient when performing many writes to the same key, because it is only 
      # the last value for each key that will be serialized and stored.  
      # write-behind-interval = 200 ms
      write-behind-interval = off
    }
  }
  
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Changed.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Get.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ModifyFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$NotFound.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReadMajority.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Update.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateTimeout.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$WriteMajority.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Changed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Get.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.GetFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.GetSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.ModifyFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.NotFound.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.ReadMajority.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Subscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.Update.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.UpdateFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.UpdateSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.UpdateTimeout.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.WriteMajority.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-metrics.html
- https://doc.akka.io/libraries/akka-core/2.10/serialization-classic.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-membership.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/distributed-data.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/distributed-data.html](https://doc.akka.io/libraries/akka-core/2.10/distributed-data.html)*