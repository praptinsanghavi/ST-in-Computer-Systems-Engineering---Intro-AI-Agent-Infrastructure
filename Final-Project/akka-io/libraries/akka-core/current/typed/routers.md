---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/routers.html
title: Routers • Akka core
---

# Routers • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Routers

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Routing](../routing.html).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Actor Typed, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
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
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
}
```

## Introduction

In some cases it is useful to distribute messages of the same type over a set of actors, so that messages can be processed in parallel \- a single actor will only process one message at a time.

The router itself is a behavior that is spawned into a running actor that will then forward any message sent to it to one final recipient out of the set of routees.

There are two kinds of routers included in Akka Typed \- the pool router and the group router.

## Pool Router

The pool router is created with a routee `Behavior` and spawns a number of children with that behavior which it will then forward messages to.

If a child is stopped the pool router removes it from its set of routees. When the last child stops the router itself stops. To make a resilient router that deals with failures the routee `Behavior` must be supervised.

As actor children are always local the routees are never spread across a cluster with a pool router.

Let’s first introduce the routee:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/RouterSpec.scala#L19-L33 "Go to snippet source")object Worker {
  sealed trait Command
  case class DoLog(text: String) extends Command

  def apply(): Behavior[Command] = Behaviors.setup { context =>
    context.log.info("Starting worker")

    Behaviors.receiveMessage {
      case DoLog(text) =>
        context.log.info("Got message {}", text)
        Behaviors.same
    }
  }
}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/RouterTest.java#L35-L102 "Go to snippet source")class Worker {
  interface Command {}

  static class DoLog implements Command {
    public final String text;

    public DoLog(String text) {
      this.text = text;
    }
  }

  static final Behavior<Command> create() {
    return Behaviors.setup(
        context -> {
          context.getLog().info("Starting worker");

          return Behaviors.receive(Command.class)
              .onMessage(DoLog.class, doLog -> onDoLog(context, doLog))
              .build();
        });
  }

  private static Behavior<Command> onDoLog(ActorContext<Command> context, DoLog doLog) {
    context.getLog().info("Got message {}", doLog.text);
    return Behaviors.same();
  }
}

static class Proxy {

  public final ServiceKey<Message> registeringKey =
      ServiceKey.create(Message.class, "aggregator-key");

  public String mapping(Message message) {
    return message.getId();
  }

  static class Message {

    public Message(String id, String content) {
      this.id = id;
      this.content = content;
    }

    private String content;
    private String id;

    public final String getContent() {
      return content;
    }

    public final String getId() {
      return id;
    }
  }

  static Behavior<Message> create(ActorRef<String> monitor) {
    return Behaviors.receive(Message.class)
        .onMessage(Message.class, in -> onMyMessage(monitor, in))
        .build();
  }

  private static Behavior<Message> onMyMessage(ActorRef<String> monitor, Message message) {
    monitor.tell(message.getId());
    return Behaviors.same();
  }
}

```

After having defined the routee, we can now concentrate on configuring the router itself. Note again the the router is an Actor in itself:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/RouterSpec.scala#L9-L105 "Go to snippet source")import akka.actor.testkit.typed.scaladsl.{ LogCapturing, ScalaTestWithActorTestKit }
import akka.actor.typed.{ ActorRef, Behavior, SupervisorStrategy }
import akka.actor.typed.receptionist.{ Receptionist, ServiceKey }
import akka.actor.typed.scaladsl.{ Behaviors, Routers }

// This would be defined within your actor object
Behaviors.setup[Unit] { ctx =>
  val pool = Routers.pool(poolSize = 4) {
    // make sure the workers are restarted if they fail
    Behaviors.supervise(Worker()).onFailure[Exception](SupervisorStrategy.restart)
  }
  val router = ctx.spawn(pool, "worker-pool")

  (0 to 10).foreach { n =>
    router ! Worker.DoLog(s"msg $n")
  }

  val poolWithBroadcast = pool.withBroadcastPredicate(_.isInstanceOf[DoBroadcastLog])
  val routerWithBroadcast = ctx.spawn(poolWithBroadcast, "pool-with-broadcast")
  //this will be sent to all 4 routees
  routerWithBroadcast ! DoBroadcastLog("msg")
  Behaviors.empty
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/RouterTest.java#L10-L152 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.GroupRouter;
import akka.actor.typed.javadsl.PoolRouter;
import akka.actor.typed.javadsl.Routers;
import akka.actor.typed.receptionist.Receptionist;
import akka.actor.typed.receptionist.ServiceKey;

import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;

import org.junit.ClassRule;
import org.junit.Test;
import org.scalatestplus.junit.JUnitSuite;

// This would be defined within your actor class
Behaviors.setup(
    context -> {
      int poolSize = 4;
      PoolRouter<Worker.Command> pool =
          Routers.pool(
              poolSize,
              // make sure the workers are restarted if they fail
              Behaviors.supervise(Worker.create()).onFailure(SupervisorStrategy.restart()));
      ActorRef<Worker.Command> router = context.spawn(pool, "worker-pool");

      for (int i = 0; i < 10; i++) {
        router.tell(new Worker.DoLog("msg " + i));
      }
    });
```

### Configuring Dispatchers

Since the router itself is spawned as an actor the dispatcher used for it can be configured directly in the call to `spawn`. The routees, however, are spawned by the router. Therefore, the `PoolRouter` has a property to configure the `Props` of its routees:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/RouterSpec.scala#L82-L85 "Go to snippet source")// make sure workers use the default blocking IO dispatcher
val blockingPool = pool.withRouteeProps(routeeProps = DispatcherSelector.blocking())
// spawn head router using the same executor as the parent
val blockingRouter = ctx.spawn(blockingPool, "blocking-pool", DispatcherSelector.sameAsParent())
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/RouterTest.java#L133-L138 "Go to snippet source")// make sure workers use the default blocking IO dispatcher
PoolRouter<Worker.Command> blockingPool =
    pool.withRouteeProps(DispatcherSelector.blocking());
// spawn head router using the same executor as the parent
ActorRef<Worker.Command> blockingRouter =
    context.spawn(blockingPool, "blocking-pool", DispatcherSelector.sameAsParent());
```

### Broadcasting a message to all routees

Pool routers can be configured to identify messages intended to be broad\-casted to all routees. Therefore, the `PoolRouter` has a property to configure its `broadcastPredicate`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/RouterSpec.scala#L99-L103 "Go to snippet source")val poolWithBroadcast = pool.withBroadcastPredicate(_.isInstanceOf[DoBroadcastLog])
val routerWithBroadcast = ctx.spawn(poolWithBroadcast, "pool-with-broadcast")
//this will be sent to all 4 routees
routerWithBroadcast ! DoBroadcastLog("msg")
Behaviors.empty
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/RouterTest.java#L146-L147 "Go to snippet source")PoolRouter<Worker.Command> broadcastingPool =
    pool.withBroadcastPredicate(msg -> msg instanceof DoBroadcastLog);
```

## Group Router

The group router is created with a `ServiceKey` and uses the receptionist (see [Receptionist](actor-discovery.html#receptionist)) to discover available actors for that key and routes messages to one of the currently known registered actors for a key.

Since the receptionist is used this means the group router is cluster\-aware out of the box. The router sends messages to registered actors on any node in the cluster that is reachable. If no reachable actor exists the router will fallback and route messages to actors on nodes marked as unreachable.

That the receptionist is used also means that the set of routees is eventually consistent, and that immediately when the group router is started the set of routees it knows about is empty, until it has seen a listing from the receptionist it stashes incoming messages and forwards them as soon as it gets a listing from the receptionist. 

When the router has received a listing from the receptionist and the set of registered actors is empty the router will drop them (publish them to the event stream as `akka.actor.Dropped`).

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/RouterSpec.scala#L45-L140 "Go to snippet source")val serviceKey = ServiceKey[Worker.Command]("log-worker")

Behaviors.setup[Unit] { ctx =>
  // this would likely happen elsewhere - if we create it locally we
  // can just as well use a pool
  val worker = ctx.spawn(Worker(), "worker")
  ctx.system.receptionist ! Receptionist.Register(serviceKey, worker)

  val group = Routers.group(serviceKey)
  val router = ctx.spawn(group, "worker-group")

  // the group router will stash messages until it sees the first listing of registered
  // services from the receptionist, so it is safe to send messages right away
  (0 to 10).foreach { n =>
    router ! Worker.DoLog(s"msg $n")
  }

  Behaviors.empty
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/RouterTest.java#L159-L183 "Go to snippet source")ServiceKey<Worker.Command> serviceKey = ServiceKey.create(Worker.Command.class, "log-worker");

Behaviors.setup(
    context -> {

      // this would likely happen elsewhere - if we create it locally we
      // can just as well use a pool
      ActorRef<Worker.Command> worker = context.spawn(Worker.create(), "worker");
      context.getSystem().receptionist().tell(Receptionist.register(serviceKey, worker));

      GroupRouter<Worker.Command> group = Routers.group(serviceKey);
      ActorRef<Worker.Command> router = context.spawn(group, "worker-group");

      // the group router will stash messages until it sees the first listing of
      // registered
      // services from the receptionist, so it is safe to send messages right away
      for (int i = 0; i < 10; i++) {
        router.tell(new Worker.DoLog("msg " + i));
      }

      return Behaviors.empty();
    });
```

## Routing strategies

There are three different strategies for selecting which routee a message is forwarded to that can be selected from the router before spawning it:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/RouterSpec.scala#L91 "Go to snippet source")val alternativePool = pool.withPoolSize(2).withRoundRobinRouting()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/RouterTest.java#L142 "Go to snippet source")PoolRouter<Worker.Command> alternativePool = pool.withPoolSize(2).withRoundRobinRouting();
```

### Round Robin

Rotates over the set of routees making sure that if there are `n` routees, then for `n` messages sent through the router, each actor is forwarded one message.

Round robin gives fair routing where every available routee gets the same amount of messages as long as the set of routees stays relatively stable, but may be unfair if the set of routees changes a lot.

This is the default for pool routers as the pool of routees is expected to remain the same.

An optional parameter `preferLocalRoutees` can be used for this strategy. Routers will only use routees located in local actor system if `preferLocalRoutees` is true and local routees do exist. The default value for this parameter is false.

### Random

Randomly selects a routee when a message is sent through the router.

This is the default for group routers as the group of routees is expected to change as nodes join and leave the cluster.

An optional parameter `preferLocalRoutees` can be used for this strategy. Routers will only use routees located in local actor system if `preferLocalRoutees` is true and local routees do exist. The default value for this parameter is false.

### Consistent Hashing

Uses [consistent hashing](https://en.wikipedia.org/wiki/Consistent_hashing) to select a routee based on the sent message. This [article](http://www.tom-e-white.com/2007/11/consistent-hashing.html) gives good insight into how consistent hashing is implemented.

Currently you have to define hashMapping of the router to map incoming messages to their consistent hash key. This makes the decision transparent for the sender.

Consistent hashing delivers messages with the same hash to the same routee as long as the set of routees stays the same. When the set of routees changes, consistent hashing tries to make sure, but does not guarantee, that messages with the same hash are routed to the same routee.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/RouterSpec.scala#L179-L186 "Go to snippet source")val router = spawn(Routers.group(Proxy.RegisteringKey).withConsistentHashingRouting(10, Proxy.mapping))

router ! Proxy.Message("123", "Text1")
router ! Proxy.Message("123", "Text2")

router ! Proxy.Message("zh3", "Text3")
router ! Proxy.Message("zh3", "Text4")
// the hash is calculated over the Proxy.Message first parameter obtained through the Proxy.mapping function
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/RouterTest.java#L214-L225 "Go to snippet source")ActorRef<Proxy.Message> router =
    testKit.spawn(
        Routers.group(proxy.registeringKey)
            .withConsistentHashingRouting(10, command -> proxy.mapping(command)));

router.tell(new Proxy.Message("123", "Text1"));
router.tell(new Proxy.Message("123", "Text2"));

router.tell(new Proxy.Message("zh3", "Text3"));
router.tell(new Proxy.Message("zh3", "Text4"));
// the hash is calculated over the Proxy.Message first parameter obtained through the
// Proxy.mapping function
```

See also [Akka Cluster Sharding](cluster-sharding.html) which provides stable routing and rebalancing of the routee actors.

## Routers and performance

Note that if the routees are sharing a resource, the resource will determine if increasing the number of actors will actually give higher throughput or faster answers. For example if the routees are CPU bound actors it will not give better performance to create more routees than there are threads to execute the actors.

Since the router itself is an actor and has a mailbox this means that messages are routed sequentially to the routees where it can be processed in parallel (depending on the available threads in the dispatcher). In a high throughput use cases the sequential routing could become a bottle neck. Akka Typed does not provide an optimized tool for this.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
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
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
}
```

### Example 4: Pool Router

```scala
object Worker {
  sealed trait Command
  case class DoLog(text: String) extends Command

  def apply(): Behavior[Command] = Behaviors.setup { context =>
    context.log.info("Starting worker")

    Behaviors.receiveMessage {
      case DoLog(text) =>
        context.log.info("Got message {}", text)
        Behaviors.same
    }
  }
}
```

### Example 5: Pool Router

```java
class Worker {
  interface Command {}

  static class DoLog implements Command {
    public final String text;

    public DoLog(String text) {
      this.text = text;
    }
  }

  static final Behavior<Command> create() {
    return Behaviors.setup(
        context -> {
          context.getLog().info("Starting worker");

          return Behaviors.receive(Command.class)
              .onMessage(DoLog.class, doLog -> onDoLog(context, doLog))
              .build();
        });
  }

  private static Behavior<Command> onDoLog(ActorContext<Command> context, DoLog doLog) {
    context.getLog().info("Got message {}", doLog.text);
    return Behaviors.same();
  }
}

static class Proxy {

  public final ServiceKey<Message> registeringKey =
      ServiceKey.create(Message.class, "aggregator-key");

  public String mapping(Message message) {
    return message.getId();
  }

  static class Message {

    public Message(String id, String content) {
      this.id = id;
      this.content = content;
    }

    private String content;
    private String id;

    public final String getContent() {
      return content;
    }

    public final String getId() {
      return id;
    }
  }

  static Behavior<Message> create(ActorRef<String> monitor) {
    return Behaviors.receive(Message.class)
        .onMessage(Message.class, in -> onMyMessage(monitor, in))
        .build();
  }

  private static Behavior<Message> onMyMessage(ActorRef<String> monitor, Message message) {
    monitor.tell(message.getId());
    return Behaviors.same();
  }
}
```

### Example 6: Pool Router

```scala
import akka.actor.testkit.typed.scaladsl.{ LogCapturing, ScalaTestWithActorTestKit }
import akka.actor.typed.{ ActorRef, Behavior, SupervisorStrategy }
import akka.actor.typed.receptionist.{ Receptionist, ServiceKey }
import akka.actor.typed.scaladsl.{ Behaviors, Routers }

// This would be defined within your actor object
Behaviors.setup[Unit] { ctx =>
  val pool = Routers.pool(poolSize = 4) {
    // make sure the workers are restarted if they fail
    Behaviors.supervise(Worker()).onFailure[Exception](SupervisorStrategy.restart)
  }
  val router = ctx.spawn(pool, "worker-pool")

  (0 to 10).foreach { n =>
    router ! Worker.DoLog(s"msg $n")
  }

  val poolWithBroadcast = pool.withBroadcastPredicate(_.isInstanceOf[DoBroadcastLog])
  val routerWithBroadcast = ctx.spawn(poolWithBroadcast, "pool-with-broadcast")
  //this will be sent to all 4 routees
  routerWithBroadcast ! DoBroadcastLog("msg")
  Behaviors.empty
}
```

### Example 7: Pool Router

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.GroupRouter;
import akka.actor.typed.javadsl.PoolRouter;
import akka.actor.typed.javadsl.Routers;
import akka.actor.typed.receptionist.Receptionist;
import akka.actor.typed.receptionist.ServiceKey;

import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;

import org.junit.ClassRule;
import org.junit.Test;
import org.scalatestplus.junit.JUnitSuite;

// This would be defined within your actor class
Behaviors.setup(
    context -> {
      int poolSize = 4;
      PoolRouter<Worker.Command> pool =
          Routers.pool(
              poolSize,
              // make sure the workers are restarted if they fail
              Behaviors.supervise(Worker.create()).onFailure(SupervisorStrategy.restart()));
      ActorRef<Worker.Command> router = context.spawn(pool, "worker-pool");

      for (int i = 0; i < 10; i++) {
        router.tell(new Worker.DoLog("msg " + i));
      }
    });
```

### Example 8: Configuring Dispatchers

```scala
// make sure workers use the default blocking IO dispatcher
val blockingPool = pool.withRouteeProps(routeeProps = DispatcherSelector.blocking())
// spawn head router using the same executor as the parent
val blockingRouter = ctx.spawn(blockingPool, "blocking-pool", DispatcherSelector.sameAsParent())
```

### Example 9: Configuring Dispatchers

```java
// make sure workers use the default blocking IO dispatcher
PoolRouter<Worker.Command> blockingPool =
    pool.withRouteeProps(DispatcherSelector.blocking());
// spawn head router using the same executor as the parent
ActorRef<Worker.Command> blockingRouter =
    context.spawn(blockingPool, "blocking-pool", DispatcherSelector.sameAsParent());
```

### Example 10: Broadcasting a message to all routees

```scala
val poolWithBroadcast = pool.withBroadcastPredicate(_.isInstanceOf[DoBroadcastLog])
val routerWithBroadcast = ctx.spawn(poolWithBroadcast, "pool-with-broadcast")
//this will be sent to all 4 routees
routerWithBroadcast ! DoBroadcastLog("msg")
Behaviors.empty
```

### Example 11: Broadcasting a message to all routees

```java
PoolRouter<Worker.Command> broadcastingPool =
    pool.withBroadcastPredicate(msg -> msg instanceof DoBroadcastLog);
```

### Example 12: Group Router

```scala
val serviceKey = ServiceKey[Worker.Command]("log-worker")

Behaviors.setup[Unit] { ctx =>
  // this would likely happen elsewhere - if we create it locally we
  // can just as well use a pool
  val worker = ctx.spawn(Worker(), "worker")
  ctx.system.receptionist ! Receptionist.Register(serviceKey, worker)

  val group = Routers.group(serviceKey)
  val router = ctx.spawn(group, "worker-group")

  // the group router will stash messages until it sees the first listing of registered
  // services from the receptionist, so it is safe to send messages right away
  (0 to 10).foreach { n =>
    router ! Worker.DoLog(s"msg $n")
  }

  Behaviors.empty
}
```

### Example 13: Group Router

```java
ServiceKey<Worker.Command> serviceKey = ServiceKey.create(Worker.Command.class, "log-worker");

Behaviors.setup(
    context -> {

      // this would likely happen elsewhere - if we create it locally we
      // can just as well use a pool
      ActorRef<Worker.Command> worker = context.spawn(Worker.create(), "worker");
      context.getSystem().receptionist().tell(Receptionist.register(serviceKey, worker));

      GroupRouter<Worker.Command> group = Routers.group(serviceKey);
      ActorRef<Worker.Command> router = context.spawn(group, "worker-group");

      // the group router will stash messages until it sees the first listing of
      // registered
      // services from the receptionist, so it is safe to send messages right away
      for (int i = 0; i < 10; i++) {
        router.tell(new Worker.DoLog("msg " + i));
      }

      return Behaviors.empty();
    });
```

### Example 14: Routing strategies

```scala
val alternativePool = pool.withPoolSize(2).withRoundRobinRouting()
```

### Example 15: Routing strategies

```java
PoolRouter<Worker.Command> alternativePool = pool.withPoolSize(2).withRoundRobinRouting();
```

### Example 16: Consistent Hashing

```scala
val router = spawn(Routers.group(Proxy.RegisteringKey).withConsistentHashingRouting(10, Proxy.mapping))

router ! Proxy.Message("123", "Text1")
router ! Proxy.Message("123", "Text2")

router ! Proxy.Message("zh3", "Text3")
router ! Proxy.Message("zh3", "Text4")
// the hash is calculated over the Proxy.Message first parameter obtained through the Proxy.mapping function
```

### Example 17: Consistent Hashing

```java
ActorRef<Proxy.Message> router =
    testKit.spawn(
        Routers.group(proxy.registeringKey)
            .withConsistentHashingRouting(10, command -> proxy.mapping(command)));

router.tell(new Proxy.Message("123", "Text1"));
router.tell(new Proxy.Message("123", "Text2"));

router.tell(new Proxy.Message("zh3", "Text3"));
router.tell(new Proxy.Message("zh3", "Text4"));
// the hash is calculated over the Proxy.Message first parameter obtained through the
// Proxy.mapping function
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/routing.html
- https://doc.akka.io/libraries/akka-core/current/typed/actor-discovery.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/stash.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/routers.html](https://doc.akka.io/libraries/akka-core/current/typed/routers.html)*