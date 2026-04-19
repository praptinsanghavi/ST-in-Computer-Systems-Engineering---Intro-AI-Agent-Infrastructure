---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:42:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/mailboxes.html
title: Classic Mailboxes • Akka core
---

# Classic Mailboxes • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Mailboxes

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the full documentation of this feature and for new projects see [mailboxes](typed/mailboxes.html).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Mailboxes, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
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
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

## Introduction

An Akka `Mailbox` holds the messages that are destined for an [`Actor`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor")[`Actor`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor"). Normally each `Actor` has its own mailbox, but with for example a [`BalancingPool`](https://doc.akka.io/api/akka-core/2.10/akka/routing/BalancingPool.html "akka.routing.BalancingPool")[`BalancingPool`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/BalancingPool.html "akka.routing.BalancingPool") all routees will share a single mailbox instance.

For more details on advanced mailbox config and custom mailbox implementations, see [Mailboxes](typed/mailboxes.html#mailbox-implementations).

## Mailbox Selection

### Default Mailbox

The default mailbox is used when the mailbox is not specified. This is an unbounded mailbox, backed by a [`java.util.concurrent.ConcurrentLinkedQueue`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html "java.util.concurrent.ConcurrentLinkedQueue").

[`SingleConsumerOnlyUnboundedMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html "akka.dispatch.SingleConsumerOnlyUnboundedMailbox")[`SingleConsumerOnlyUnboundedMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html "akka.dispatch.SingleConsumerOnlyUnboundedMailbox") is an even more efficient mailbox, and it can be used as the default mailbox, but it cannot be used with a BalancingDispatcher.

Configuration of `SingleConsumerOnlyUnboundedMailbox` as default mailbox:

```
akka.actor.default-mailbox {
  mailbox-type = "akka.dispatch.SingleConsumerOnlyUnboundedMailbox"
}

```

### Requiring a Message Queue Type for an Actor

It is possible to require a certain type of message queue for a certain type of actor by having that actor extendimplement the parameterized traitinterface [`RequiresMessageQueue`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html "akka.dispatch.RequiresMessageQueue")[`RequiresMessageQueue`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html "akka.dispatch.RequiresMessageQueue"). Here is an example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L273-L276 "Go to snippet source")import akka.dispatch.RequiresMessageQueue
import akka.dispatch.BoundedMessageQueueSemantics

class MyBoundedActor extends MyActor with RequiresMessageQueue[BoundedMessageQueueSemantics]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/actor/MyBoundedActor.java#L8-L12 "Go to snippet source")import akka.dispatch.BoundedMessageQueueSemantics;
import akka.dispatch.RequiresMessageQueue;

public class MyBoundedActor extends MyActor
    implements RequiresMessageQueue<BoundedMessageQueueSemantics> {}
```

The type parameter to the `RequiresMessageQueue` traitinterface needs to be mapped to a mailbox in configuration like this:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L197-L200 "Go to snippet source")bounded-mailbox {
  mailbox-type = "akka.dispatch.NonBlockingBoundedMailbox"
  mailbox-capacity = 1000 
}

akka.actor.mailbox.requirements {
  "akka.dispatch.BoundedMessageQueueSemantics" = bounded-mailbox
}
```

Now every time you create an actor of type `MyBoundedActor` it will try to get a bounded mailbox. If the actor has a different mailbox configured in deployment, either directly or via a dispatcher with a specified mailbox type, then that will override this mapping.

Note
The type of the queue in the mailbox created for an actor will be checked against the required type in the traitinterface and if the queue doesn’t implement the required type then actor creation will fail.

### Requiring a Message Queue Type for a Dispatcher

A dispatcher may also have a requirement for the mailbox type used by the actors running on it. An example is the `BalancingDispatcher` which requires a message queue that is thread\-safe for multiple concurrent consumers. Such a requirement is formulated within the dispatcher configuration section:

```
my-dispatcher {
  mailbox-requirement = org.example.MyInterface
}

```

The given requirement names a class or interface which will then be ensured to be a supertype of the message queue’s implementation. In case of a conflict—e.g. if the actor requires a mailbox type which does not satisfy this requirement—then actor creation will fail.

### How the Mailbox Type is Selected

When an actor is created, the [`ActorRefProvider`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefProvider.html "akka.actor.ActorRefProvider")[`ActorRefProvider`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefProvider.html "akka.actor.ActorRefProvider") first determines the dispatcher which will execute it. Then the mailbox is determined as follows:

1. If the actor’s deployment configuration section contains a `mailbox` key, this refers to a configuration section describing the mailbox type.
2. If the actor’s [`Props`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html "akka.actor.Props")[`Props`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html "akka.actor.Props") contains a mailbox selection then that names a configuration section describing the mailbox type to be used. This needs to be an absolute config path, for example `myapp.special-mailbox`, and is not nested inside the `akka` namespace.
3. If the dispatcher’s configuration section contains a `mailbox-type` key the same section will be used to configure the mailbox type.
4. If the actor requires a mailbox type as described above then the mapping for that requirement will be used to determine the mailbox type to be used; if that fails then the dispatcher’s requirement—if any—will be tried instead.
5. If the dispatcher requires a mailbox type as described above then the mapping for that requirement will be used to determine the mailbox type to be used.
6. The default mailbox `akka.actor.default-mailbox` will be used.

## Mailbox configuration examples

### PriorityMailbox

How to create a PriorityMailbox:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L236-L257 "Go to snippet source")import akka.dispatch.PriorityGenerator
import akka.dispatch.UnboundedStablePriorityMailbox
import com.typesafe.config.Config

// We inherit, in this case, from UnboundedStablePriorityMailbox
// and seed it with the priority generator
class MyPrioMailbox(settings: ActorSystem.Settings, config: Config)
    extends UnboundedStablePriorityMailbox(
      // Create a new PriorityGenerator, lower prio means more important
      PriorityGenerator {
        // highpriority messages should be treated first if possible
        case "highpriority" => 0

        // lowpriority messages should be treated last if possible
        case "lowpriority" => 2

        // PoisonPill when no other left
        case PoisonPill => 3

        // We default to 1, which is in between high and low
        case otherwise => 1
      })
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/DispatcherDocTest.java#L219-L237 "Go to snippet source")static class MyPrioMailbox extends UnboundedStablePriorityMailbox {
  // needed for reflective instantiation
  public MyPrioMailbox(ActorSystem.Settings settings, Config config) {
    // Create a new PriorityGenerator, lower prio means more important
    super(
        new PriorityGenerator() {
          @Override
          public int gen(Object message) {
            if (message.equals("highpriority"))
              return 0; // 'highpriority messages should be treated first if possible
            else if (message.equals("lowpriority"))
              return 2; // 'lowpriority messages should be treated last if possible
            else if (message.equals(PoisonPill.getInstance()))
              return 3; // PoisonPill when no other left
            else return 1; // By default they go between high and low prio
          }
        });
  }
}
```

And then add it to the configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L166-L169 "Go to snippet source")prio-dispatcher {
  mailbox-type = "docs.dispatcher.DispatcherDocSpec$MyPrioMailbox"
  //Other dispatcher configuration goes here
}
```

And then an example on how you would use it:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L372-L402 "Go to snippet source")  
// We create a new Actor that just prints out what it processes
class Logger extends Actor {
  val log: LoggingAdapter = Logging(context.system, this)

  self ! "lowpriority"
  self ! "lowpriority"
  self ! "highpriority"
  self ! "pigdog"
  self ! "pigdog2"
  self ! "pigdog3"
  self ! "highpriority"

  self ! PoisonPill

  def receive = {
    case x => log.info(x.toString)
  }
}
val a = system.actorOf(Props(classOf[Logger], this).withDispatcher("prio-dispatcher"))

/*
 * Logs:
 * highpriority
 * highpriority
 * pigdog
 * pigdog2
 * pigdog3
 * lowpriority
 * lowpriority
 */
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/DispatcherDocTest.java#L124-L168 "Go to snippet source")  
class Demo extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  {
    for (Object msg :
        new Object[] {
          "lowpriority",
          "lowpriority",
          "highpriority",
          "pigdog",
          "pigdog2",
          "pigdog3",
          "highpriority",
          PoisonPill.getInstance()
        }) {
      getSelf().tell(msg, getSelf());
    }
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            message -> {
              log.info(message.toString());
            })
        .build();
  }
}

// We create a new Actor that just prints out what it processes
ActorRef myActor =
    system.actorOf(Props.create(Demo.class, this).withDispatcher("prio-dispatcher"));

/*
Logs:
  'highpriority
  'highpriority
  'pigdog
  'pigdog2
  'pigdog3
  'lowpriority
  'lowpriority
*/
```

It is also possible to configure a mailbox type directly like this (this is a top\-level configuration entry):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L181-L184 "Go to snippet source")prio-mailbox {
  mailbox-type = "docs.dispatcher.DispatcherDocSpec$MyPrioMailbox"
  //Other mailbox configuration goes here
}

akka.actor.deployment {
  /priomailboxactor {
    mailbox = prio-mailbox
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L25-L28 "Go to snippet source")prio-mailbox {
  mailbox-type = "docs.dispatcher.DispatcherDocSpec$MyPrioMailbox"
  //Other mailbox configuration goes here
}

akka.actor.deployment {
  /priomailboxactor {
    mailbox = prio-mailbox
  }
}
```

And then use it either from deployment like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L351-L352 "Go to snippet source")import akka.actor.Props
val myActor = context.actorOf(Props[MyActor](), "priomailboxactor")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/DispatcherDocTest.java#L102 "Go to snippet source")ActorRef myActor = system.actorOf(Props.create(MyActor.class), "priomailboxactor");
```

Or code like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L359-L360 "Go to snippet source")import akka.actor.Props
val myActor = context.actorOf(Props[MyActor]().withMailbox("prio-mailbox"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/DispatcherDocTest.java#L110 "Go to snippet source")ActorRef myActor = system.actorOf(Props.create(MyActor.class).withMailbox("prio-mailbox"));
```

### ControlAwareMailbox

A `ControlAwareMailbox` can be very useful if an actor needs to be able to receive control messages immediately no matter how many other messages are already in its mailbox.

It can be configured like this:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L227-L230 "Go to snippet source")control-aware-dispatcher {
  mailbox-type = "akka.dispatch.UnboundedControlAwareMailbox"
  //Other dispatcher configuration goes here
}
```

Control messages need to extend the [`ControlMessage`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ControlMessage.html "akka.dispatch.ControlMessage")[`ControlMessage`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ControlMessage.html "akka.dispatch.ControlMessage") traitinterface:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L261-L263 "Go to snippet source")import akka.dispatch.ControlMessage

case object MyControlMessage extends ControlMessage
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/DispatcherDocTest.java#L242 "Go to snippet source")static class MyControlMessage implements ControlMessage {}
```

And then an example on how you would use it:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/DispatcherDocSpec.scala#L413-L434 "Go to snippet source")  
// We create a new Actor that just prints out what it processes
class Logger extends Actor {
  val log: LoggingAdapter = Logging(context.system, this)

  self ! "foo"
  self ! "bar"
  self ! MyControlMessage
  self ! PoisonPill

  def receive = {
    case x => log.info(x.toString)
  }
}
val a = system.actorOf(Props(classOf[Logger], this).withDispatcher("control-aware-dispatcher"))

/*
 * Logs:
 * MyControlMessage
 * foo
 * bar
 */
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/DispatcherDocTest.java#L179-L210 "Go to snippet source")  
class Demo extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  {
    for (Object msg :
        new Object[] {"foo", "bar", new MyControlMessage(), PoisonPill.getInstance()}) {
      getSelf().tell(msg, getSelf());
    }
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            message -> {
              log.info(message.toString());
            })
        .build();
  }
}

// We create a new Actor that just prints out what it processes
ActorRef myActor =
    system.actorOf(Props.create(Demo.class, this).withDispatcher("control-aware-dispatcher"));

/*
Logs:
  'MyControlMessage
  'foo
  'bar
*/
```

## Special Semantics of `system.actorOf`

In order to make [`system.actorOf`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefFactory.html#actorOf(props:akka.actor.Props):akka.actor.ActorRef "akka.actor.ActorRefFactory")[`system.actorOf`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefFactory.html#actorOf(akka.actor.Props) "akka.actor.ActorRefFactory") both synchronous and non\-blocking while keeping the return type [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef") (and the semantics that the returned ref is fully functional), special handling takes place for this case. Behind the scenes, a hollow kind of actor reference is constructed, which is sent to the system’s guardian actor who actually creates the actor and its context and puts those inside the reference. Until that has happened, messages sent to the [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef") will be queued locally, and only upon swapping the real filling in will they be transferred into the real mailbox. Thus,

Scala

```
val props: Props = ...
// this actor uses MyCustomMailbox, which is assumed to be a singleton
system.actorOf(props.withDispatcher("myCustomMailbox")) ! "bang"
assert(MyCustomMailbox.instance.getLastEnqueuedMessage == "bang")

```

Java

```
final Props props = ...
// this actor uses MyCustomMailbox, which is assumed to be a singleton
system.actorOf(props.withDispatcher("myCustomMailbox").tell("bang", sender);
assert(MyCustomMailbox.getInstance().getLastEnqueued().equals("bang"));

```

will probably fail; you will have to allow for some time to pass and retry the check à la [`TestKit.awaitCond`](https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKit.html#awaitCond(p:=%3EBoolean,max:scala.concurrent.duration.Duration,interval:scala.concurrent.duration.Duration,message:String):Unit "akka.testkit.TestKit")[`TestKit.awaitCond`](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/javadsl/TestKit.html#awaitCond(java.time.Duration,java.time.Duration,java.lang.String,java.util.function.Supplier) "akka.testkit.javadsl.TestKit").

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
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
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

### Example 4: Default Mailbox

```text
akka.actor.default-mailbox {
  mailbox-type = "akka.dispatch.SingleConsumerOnlyUnboundedMailbox"
}
```

### Example 5: Requiring a Message Queue Type for an Actor

```scala
import akka.dispatch.RequiresMessageQueue
import akka.dispatch.BoundedMessageQueueSemantics

class MyBoundedActor extends MyActor with RequiresMessageQueue[BoundedMessageQueueSemantics]
```

### Example 6: Requiring a Message Queue Type for an Actor

```java
import akka.dispatch.BoundedMessageQueueSemantics;
import akka.dispatch.RequiresMessageQueue;

public class MyBoundedActor extends MyActor
    implements RequiresMessageQueue<BoundedMessageQueueSemantics> {}
```

### Example 7: Requiring a Message Queue Type for an Actor

```scala
bounded-mailbox {
  mailbox-type = "akka.dispatch.NonBlockingBoundedMailbox"
  mailbox-capacity = 1000 
}

akka.actor.mailbox.requirements {
  "akka.dispatch.BoundedMessageQueueSemantics" = bounded-mailbox
}
```

### Example 8: Requiring a Message Queue Type for a Dispatcher

```text
my-dispatcher {
  mailbox-requirement = org.example.MyInterface
}
```

### Example 9: PriorityMailbox

```scala
import akka.dispatch.PriorityGenerator
import akka.dispatch.UnboundedStablePriorityMailbox
import com.typesafe.config.Config

// We inherit, in this case, from UnboundedStablePriorityMailbox
// and seed it with the priority generator
class MyPrioMailbox(settings: ActorSystem.Settings, config: Config)
    extends UnboundedStablePriorityMailbox(
      // Create a new PriorityGenerator, lower prio means more important
      PriorityGenerator {
        // highpriority messages should be treated first if possible
        case "highpriority" => 0

        // lowpriority messages should be treated last if possible
        case "lowpriority" => 2

        // PoisonPill when no other left
        case PoisonPill => 3

        // We default to 1, which is in between high and low
        case otherwise => 1
      })
```

### Example 10: PriorityMailbox

```java
static class MyPrioMailbox extends UnboundedStablePriorityMailbox {
  // needed for reflective instantiation
  public MyPrioMailbox(ActorSystem.Settings settings, Config config) {
    // Create a new PriorityGenerator, lower prio means more important
    super(
        new PriorityGenerator() {
          @Override
          public int gen(Object message) {
            if (message.equals("highpriority"))
              return 0; // 'highpriority messages should be treated first if possible
            else if (message.equals("lowpriority"))
              return 2; // 'lowpriority messages should be treated last if possible
            else if (message.equals(PoisonPill.getInstance()))
              return 3; // PoisonPill when no other left
            else return 1; // By default they go between high and low prio
          }
        });
  }
}
```

### Example 11: PriorityMailbox

```scala
prio-dispatcher {
  mailbox-type = "docs.dispatcher.DispatcherDocSpec$MyPrioMailbox"
  //Other dispatcher configuration goes here
}
```

### Example 12: PriorityMailbox

```scala
// We create a new Actor that just prints out what it processes
class Logger extends Actor {
  val log: LoggingAdapter = Logging(context.system, this)

  self ! "lowpriority"
  self ! "lowpriority"
  self ! "highpriority"
  self ! "pigdog"
  self ! "pigdog2"
  self ! "pigdog3"
  self ! "highpriority"

  self ! PoisonPill

  def receive = {
    case x => log.info(x.toString)
  }
}
val a = system.actorOf(Props(classOf[Logger], this).withDispatcher("prio-dispatcher"))

/*
 * Logs:
 * highpriority
 * highpriority
 * pigdog
 * pigdog2
 * pigdog3
 * lowpriority
 * lowpriority
 */
```

### Example 13: PriorityMailbox

```java
class Demo extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  {
    for (Object msg :
        new Object[] {
          "lowpriority",
          "lowpriority",
          "highpriority",
          "pigdog",
          "pigdog2",
          "pigdog3",
          "highpriority",
          PoisonPill.getInstance()
        }) {
      getSelf().tell(msg, getSelf());
    }
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            message -> {
              log.info(message.toString());
            })
        .build();
  }
}

// We create a new Actor that just prints out what it processes
ActorRef myActor =
    system.actorOf(Props.create(Demo.class, this).withDispatcher("prio-dispatcher"));

/*
Logs:
  'highpriority
  'highpriority
  'pigdog
  'pigdog2
  'pigdog3
  'lowpriority
  'lowpriority
*/
```

### Example 14: PriorityMailbox

```scala
prio-mailbox {
  mailbox-type = "docs.dispatcher.DispatcherDocSpec$MyPrioMailbox"
  //Other mailbox configuration goes here
}

akka.actor.deployment {
  /priomailboxactor {
    mailbox = prio-mailbox
  }
}
```

### Example 15: PriorityMailbox

```scala
prio-mailbox {
  mailbox-type = "docs.dispatcher.DispatcherDocSpec$MyPrioMailbox"
  //Other mailbox configuration goes here
}

akka.actor.deployment {
  /priomailboxactor {
    mailbox = prio-mailbox
  }
}
```

### Example 16: PriorityMailbox

```scala
import akka.actor.Props
val myActor = context.actorOf(Props[MyActor](), "priomailboxactor")
```

### Example 17: PriorityMailbox

```java
ActorRef myActor = system.actorOf(Props.create(MyActor.class), "priomailboxactor");
```

### Example 18: PriorityMailbox

```scala
import akka.actor.Props
val myActor = context.actorOf(Props[MyActor]().withMailbox("prio-mailbox"))
```

### Example 19: PriorityMailbox

```java
ActorRef myActor = system.actorOf(Props.create(MyActor.class).withMailbox("prio-mailbox"));
```

### Example 20: ControlAwareMailbox

```scala
control-aware-dispatcher {
  mailbox-type = "akka.dispatch.UnboundedControlAwareMailbox"
  //Other dispatcher configuration goes here
}
```

### Example 21: ControlAwareMailbox

```scala
import akka.dispatch.ControlMessage

case object MyControlMessage extends ControlMessage
```

### Example 22: ControlAwareMailbox

```java
static class MyControlMessage implements ControlMessage {}
```

### Example 23: ControlAwareMailbox

```scala
// We create a new Actor that just prints out what it processes
class Logger extends Actor {
  val log: LoggingAdapter = Logging(context.system, this)

  self ! "foo"
  self ! "bar"
  self ! MyControlMessage
  self ! PoisonPill

  def receive = {
    case x => log.info(x.toString)
  }
}
val a = system.actorOf(Props(classOf[Logger], this).withDispatcher("control-aware-dispatcher"))

/*
 * Logs:
 * MyControlMessage
 * foo
 * bar
 */
```

### Example 24: ControlAwareMailbox

```java
class Demo extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  {
    for (Object msg :
        new Object[] {"foo", "bar", new MyControlMessage(), PoisonPill.getInstance()}) {
      getSelf().tell(msg, getSelf());
    }
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            message -> {
              log.info(message.toString());
            })
        .build();
  }
}

// We create a new Actor that just prints out what it processes
ActorRef myActor =
    system.actorOf(Props.create(Demo.class, this).withDispatcher("control-aware-dispatcher"));

/*
Logs:
  'MyControlMessage
  'foo
  'bar
*/
```

### Example 25: Special Semantics ofsystem.actorOf

```scala
val props: Props = ...
// this actor uses MyCustomMailbox, which is assumed to be a singleton
system.actorOf(props.withDispatcher("myCustomMailbox")) ! "bang"
assert(MyCustomMailbox.instance.getLastEnqueuedMessage == "bang")
```

### Example 26: Special Semantics ofsystem.actorOf

```java
final Props props = ...
// this actor uses MyCustomMailbox, which is assumed to be a singleton
system.actorOf(props.withDispatcher("myCustomMailbox").tell("bang", sender);
assert(MyCustomMailbox.getInstance().getLastEnqueued().equals("bang"));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ControlMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/BalancingPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ControlMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/BalancingPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/javadsl/TestKit.html
- https://doc.akka.io/libraries/akka-core/2.10/dispatchers.html
- https://doc.akka.io/libraries/akka-core/2.10/routing.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/mailboxes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/mailboxes.html](https://doc.akka.io/libraries/akka-core/2.10/mailboxes.html)*