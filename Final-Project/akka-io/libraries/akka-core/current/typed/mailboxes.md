---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/mailboxes.html
title: Mailboxes • Akka core
---

# Mailboxes • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Mailboxes

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Mailboxes](../mailboxes.html).

## Dependency

Mailboxes are part of core Akka, which means that they are part of the `akka-actor` dependency. This page describes how to use mailboxes with `akka-actor-typed`.

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

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

Each actor in Akka has a `Mailbox`, this is where the messages are enqueued before being processed by the actor.

By default an unbounded mailbox is used, this means any number of messages can be enqueued into the mailbox. 

The unbounded mailbox is a convenient default but in a scenario where messages are added to the mailbox faster than the actor can process them, this can lead to the application running out of memory. For this reason a bounded mailbox can be specified, the bounded mailbox will pass new messages to `deadletters` when the mailbox is full.

For advanced use cases it is also possible to defer mailbox selection to config by pointing to a config path.

## Selecting what mailbox is used

### Selecting a Mailbox Type for an Actor

To select a specific mailbox for an actor use [`MailboxSelector`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/MailboxSelector$.html "akka.actor.typed.MailboxSelector")[`MailboxSelector`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MailboxSelector.html "akka.actor.typed.MailboxSelector") to create a [`Props`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Props.html "akka.actor.typed.Props")[`Props`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Props.html "akka.actor.typed.Props") instance for spawning your actor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/scala/docs/akka/typed/MailboxDocSpec.scala#L27-L30 "Go to snippet source")context.spawn(childBehavior, "bounded-mailbox-child", MailboxSelector.bounded(100))

val props = MailboxSelector.fromConfig("my-app.my-special-mailbox")
context.spawn(childBehavior, "from-config-mailbox-child", props)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/MailboxDocTest.java#L38-L43 "Go to snippet source")context.spawn(childBehavior, "bounded-mailbox-child", MailboxSelector.bounded(100));

context.spawn(
    childBehavior,
    "from-config-mailbox-child",
    MailboxSelector.fromConfig("my-app.my-special-mailbox"));
```

[`fromConfig`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/MailboxSelector$.html#fromConfig(path:String):akka.actor.typed.MailboxSelector "akka.actor.typed.MailboxSelector")[`fromConfig`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MailboxSelector.html#fromConfig(java.lang.String) "akka.actor.typed.MailboxSelector") takes an absolute config path to a block defining the dispatcher in the config file:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/resources/mailbox-config-sample.conf "Go to snippet source")my-app {
  my-special-mailbox {
    mailbox-type = "akka.dispatch.SingleConsumerOnlyUnboundedMailbox"
  }
}
```

### Default Mailbox

The default mailbox is used when the mailbox is not specified and is the [`SingleConsumerOnlyUnboundedMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html "akka.dispatch.SingleConsumerOnlyUnboundedMailbox")[`SingleConsumerOnlyUnboundedMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html "akka.dispatch.SingleConsumerOnlyUnboundedMailbox")

### Which Configuration is passed to the Mailbox Type

Each mailbox type is implemented by a class which extends [`MailboxType`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/MailboxType.html "akka.dispatch.MailboxType")[`MailboxType`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MailboxType.html "akka.dispatch.MailboxType") and takes two constructor arguments: a [`ActorSystem.Settings`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Settings.html "akka.actor.typed.Settings")[`ActorSystem.Settings`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Settings.html "akka.actor.typed.Settings") object and a [Config](https://lightbend.github.io/config/latest/api/index.html?com/typesafe/config/Config.html) section. The latter is computed by obtaining the named configuration section from the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") configuration, overriding its `id` key with the configuration path of the mailbox type and adding a fall\-back to the default mailbox configuration section.

## Mailbox Implementations

Akka ships with a number of mailbox implementations:

- [`SingleConsumerOnlyUnboundedMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html "akka.dispatch.SingleConsumerOnlyUnboundedMailbox")[`SingleConsumerOnlyUnboundedMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html "akka.dispatch.SingleConsumerOnlyUnboundedMailbox") (default)
	- This is the default
	- Backed by a Multiple\-Producer Single\-Consumer queue, cannot be used with `BalancingDispatcher`
	- Blocking: No
	- Bounded: No
	- Configuration name: `"akka.dispatch.SingleConsumerOnlyUnboundedMailbox"`
- [`UnboundedMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/UnboundedMailbox.html "akka.dispatch.UnboundedMailbox")[`UnboundedMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMailbox.html "akka.dispatch.UnboundedMailbox")
	- Backed by a [`java.util.concurrent.ConcurrentLinkedQueue`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html "java.util.concurrent.ConcurrentLinkedQueue")
	- Blocking: No
	- Bounded: No
	- Configuration name: `"unbounded"` or `"akka.dispatch.UnboundedMailbox"`
- [`NonBlockingBoundedMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/NonBlockingBoundedMailbox.html "akka.dispatch.NonBlockingBoundedMailbox")[`NonBlockingBoundedMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NonBlockingBoundedMailbox.html "akka.dispatch.NonBlockingBoundedMailbox")

	- Backed by a very efficient Multiple\-Producer Single\-Consumer queue
	- Blocking: No (discards overflowing messages into deadLetters)
	- Bounded: Yes
	- Configuration name: `"akka.dispatch.NonBlockingBoundedMailbox"`
- [`UnboundedControlAwareMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.html "akka.dispatch.UnboundedControlAwareMailbox")[`UnboundedControlAwareMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.html "akka.dispatch.UnboundedControlAwareMailbox")
	- Delivers messages that extend [`akka.dispatch.ControlMessage`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ControlMessage.html "akka.dispatch.ControlMessage")[`akka.dispatch.ControlMessage`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ControlMessage.html "akka.dispatch.ControlMessage") with higher priority
	- Backed by two [`java.util.concurrent.ConcurrentLinkedQueue`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html "java.util.concurrent.ConcurrentLinkedQueue")
	- Blocking: No
	- Bounded: No
	- Configuration name: `"akka.dispatch.UnboundedControlAwareMailbox"`
- [`UnboundedPriorityMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/UnboundedPriorityMailbox.html "akka.dispatch.UnboundedPriorityMailbox")[`UnboundedPriorityMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedPriorityMailbox.html "akka.dispatch.UnboundedPriorityMailbox")
	- Backed by a [`java.util.concurrent.PriorityBlockingQueue`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/PriorityBlockingQueue.html "java.util.concurrent.PriorityBlockingQueue")
	- Delivery order for messages of equal priority is undefined \- contrast with the `UnboundedStablePriorityMailbox`
	- Blocking: No
	- Bounded: No
	- Configuration name: `"akka.dispatch.UnboundedPriorityMailbox"`
- [`UnboundedStablePriorityMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.html "akka.dispatch.UnboundedStablePriorityMailbox")[`UnboundedStablePriorityMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.html "akka.dispatch.UnboundedStablePriorityMailbox")
	- Backed by a [`java.util.concurrent.PriorityBlockingQueue`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/PriorityBlockingQueue.html "java.util.concurrent.PriorityBlockingQueue") wrapped in an [`akka.util.PriorityQueueStabilizer`](https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer.html "akka.util.PriorityQueueStabilizer")[`akka.util.PriorityQueueStabilizer`](https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.html "akka.util.PriorityQueueStabilizer")
	- FIFO order is preserved for messages of equal priority \- contrast with the `UnboundedPriorityMailbox`
	- Blocking: No
	- Bounded: No
	- Configuration name: `"akka.dispatch.UnboundedStablePriorityMailbox"`

Other bounded mailbox implementations which will block the sender if the capacity is reached and configured with non\-zero `mailbox-push-timeout-time`. 

Note
The following mailboxes should only be used with zero `mailbox-push-timeout-time`.

- [`BoundedMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMailbox.html "akka.dispatch.BoundedMailbox")[`BoundedMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedMailbox.html "akka.dispatch.BoundedMailbox")
	- Backed by a [`java.util.concurrent.LinkedBlockingQueue`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/LinkedBlockingQueue.html "java.util.concurrent.LinkedBlockingQueue")
	- Blocking: Yes if used with non\-zero `mailbox-push-timeout-time`, otherwise No
	- Bounded: Yes
	- Configuration name: `"bounded"` or `"akka.dispatch.BoundedMailbox"`
- [`BoundedPriorityMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox.html "akka.dispatch.BoundedPriorityMailbox")[`BoundedPriorityMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox.html "akka.dispatch.BoundedPriorityMailbox")
	- Backed by a [`java.util.PriorityQueue`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/PriorityQueue.html "java.util.PriorityQueue") wrapped in an [`akka.util.BoundedBlockingQueue`](https://doc.akka.io/api/akka-core/2.10/akka/util/BoundedBlockingQueue.html "akka.util.BoundedBlockingQueue")[`akka.util.BoundedBlockingQueue`](https://doc.akka.io/japi/akka-core/2.10/akka/util/BoundedBlockingQueue.html "akka.util.BoundedBlockingQueue")
	- Delivery order for messages of equal priority is undefined \- contrast with the `BoundedStablePriorityMailbox`
	- Blocking: Yes if used with non\-zero `mailbox-push-timeout-time`, otherwise No
	- Bounded: Yes
	- Configuration name: `"akka.dispatch.BoundedPriorityMailbox"`
- [`BoundedStablePriorityMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox.html "akka.dispatch.BoundedStablePriorityMailbox")[`BoundedStablePriorityMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox.html "akka.dispatch.BoundedStablePriorityMailbox")
	- Backed by a [`java.util.PriorityQueue`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/PriorityQueue.html "java.util.PriorityQueue") wrapped in an [`akka.util.PriorityQueueStabilizer`](https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer.html "akka.util.PriorityQueueStabilizer")[`akka.util.PriorityQueueStabilizer`](https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.html "akka.util.PriorityQueueStabilizer") and an [`akka.util.BoundedBlockingQueue`](https://doc.akka.io/api/akka-core/2.10/akka/util/BoundedBlockingQueue.html "akka.util.BoundedBlockingQueue")[`akka.util.BoundedBlockingQueue`](https://doc.akka.io/japi/akka-core/2.10/akka/util/BoundedBlockingQueue.html "akka.util.BoundedBlockingQueue")
	- FIFO order is preserved for messages of equal priority \- contrast with the BoundedPriorityMailbox
	- Blocking: Yes if used with non\-zero `mailbox-push-timeout-time`, otherwise No
	- Bounded: Yes
	- Configuration name: `"akka.dispatch.BoundedStablePriorityMailbox"`
- [`BoundedControlAwareMailbox`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox.html "akka.dispatch.BoundedControlAwareMailbox")[`BoundedControlAwareMailbox`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox.html "akka.dispatch.BoundedControlAwareMailbox")
	- Delivers messages that extend [`akka.dispatch.ControlMessage`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ControlMessage.html "akka.dispatch.ControlMessage")[`akka.dispatch.ControlMessage`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ControlMessage.html "akka.dispatch.ControlMessage") with higher priority
	- Backed by two [`java.util.concurrent.ConcurrentLinkedQueue`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html "java.util.concurrent.ConcurrentLinkedQueue") and blocking on enqueue if capacity has been reached
	- Blocking: Yes if used with non\-zero `mailbox-push-timeout-time`, otherwise No
	- Bounded: Yes
	- Configuration name: `"akka.dispatch.BoundedControlAwareMailbox"`

## Custom Mailbox type

The best way to show how to create your own Mailbox type is by example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/MyUnboundedMailbox.scala#L56-L57 "Go to snippet source")// Marker trait used for mailbox requirements mapping
trait MyUnboundedMessageQueueSemantics
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/MyUnboundedMessageQueueSemantics.java#L8-L9 "Go to snippet source")// Marker interface used for mailbox requirements mapping
public interface MyUnboundedMessageQueueSemantics {}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/dispatcher/MyUnboundedMailbox.scala#L8-L52 "Go to snippet source")import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.dispatch.Envelope
import akka.dispatch.MailboxType
import akka.dispatch.MessageQueue
import akka.dispatch.ProducesMessageQueue
import com.typesafe.config.Config
import java.util.concurrent.ConcurrentLinkedQueue
import scala.Option

object MyUnboundedMailbox {
  // This is the MessageQueue implementation
  class MyMessageQueue extends MessageQueue with MyUnboundedMessageQueueSemantics {

    private final val queue = new ConcurrentLinkedQueue[Envelope]()

    // these should be implemented; queue used as example
    def enqueue(receiver: ActorRef, handle: Envelope): Unit =
      queue.offer(handle)
    def dequeue(): Envelope = queue.poll()
    def numberOfMessages: Int = queue.size
    def hasMessages: Boolean = !queue.isEmpty
    def cleanUp(owner: ActorRef, deadLetters: MessageQueue): Unit = {
      while (hasMessages) {
        deadLetters.enqueue(owner, dequeue())
      }
    }
  }
}

// This is the Mailbox implementation
class MyUnboundedMailbox extends MailboxType with ProducesMessageQueue[MyUnboundedMailbox.MyMessageQueue] {

  import MyUnboundedMailbox._

  // This constructor signature must exist, it will be called by Akka
  def this(settings: ActorSystem.Settings, config: Config) = {
    // put your initialization code here
    this()
  }

  // The create method is called to create the MessageQueue
  final override def create(owner: Option[ActorRef], system: Option[ActorSystem]): MessageQueue =
    new MyMessageQueue()
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/dispatcher/MyUnboundedMailbox.java#L8-L59 "Go to snippet source")import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.dispatch.Envelope;
import akka.dispatch.MailboxType;
import akka.dispatch.MessageQueue;
import akka.dispatch.ProducesMessageQueue;
import com.typesafe.config.Config;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import scala.Option;

public class MyUnboundedMailbox
    implements MailboxType, ProducesMessageQueue<MyUnboundedMailbox.MyMessageQueue> {

  // This is the MessageQueue implementation
  public static class MyMessageQueue implements MessageQueue, MyUnboundedMessageQueueSemantics {
    private final Queue<Envelope> queue = new ConcurrentLinkedQueue<Envelope>();

    // these must be implemented; queue used as example
    public void enqueue(ActorRef receiver, Envelope handle) {
      queue.offer(handle);
    }

    public Envelope dequeue() {
      return queue.poll();
    }

    public int numberOfMessages() {
      return queue.size();
    }

    public boolean hasMessages() {
      return !queue.isEmpty();
    }

    public void cleanUp(ActorRef owner, MessageQueue deadLetters) {
      while (!queue.isEmpty()) {
        deadLetters.enqueue(owner, dequeue());
      }
    }
  }

  // This constructor signature must exist, it will be called by Akka
  public MyUnboundedMailbox(ActorSystem.Settings settings, Config config) {
    // put your initialization code here
  }

  // The create method is called to create the MessageQueue
  public MessageQueue create(Option<ActorRef> owner, Option<ActorSystem> system) {
    return new MyMessageQueue();
  }
}
```

And then you specify the FQCN of your MailboxType as the value of the “mailbox\-type” in the dispatcher configuration, or the mailbox configuration.

Note
Make sure to include a constructor which takes [`akka.actor.ActorSystem.Settings`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem$$Settings.html "akka.actor.ActorSystem.Settings")[`akka.actor.ActorSystem.Settings`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.Settings.html "akka.actor.ActorSystem.Settings") and [com.typesafe.config.Config](https://lightbend.github.io/config/latest/api/index.html?com/typesafe/config/Config.html) arguments, as this constructor is invoked reflectively to construct your mailbox type. The config passed in as second argument is that section from the configuration which describes the dispatcher or mailbox setting using this mailbox type; the mailbox type will be instantiated once for each dispatcher or mailbox setting using it.

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

### Example 4: Selecting a Mailbox Type for an Actor

```scala
context.spawn(childBehavior, "bounded-mailbox-child", MailboxSelector.bounded(100))

val props = MailboxSelector.fromConfig("my-app.my-special-mailbox")
context.spawn(childBehavior, "from-config-mailbox-child", props)
```

### Example 5: Selecting a Mailbox Type for an Actor

```java
context.spawn(childBehavior, "bounded-mailbox-child", MailboxSelector.bounded(100));

context.spawn(
    childBehavior,
    "from-config-mailbox-child",
    MailboxSelector.fromConfig("my-app.my-special-mailbox"));
```

### Example 6: Selecting a Mailbox Type for an Actor

```conf
my-app {
  my-special-mailbox {
    mailbox-type = "akka.dispatch.SingleConsumerOnlyUnboundedMailbox"
  }
}
```

### Example 7: Custom Mailbox type

```scala
// Marker trait used for mailbox requirements mapping
trait MyUnboundedMessageQueueSemantics
```

### Example 8: Custom Mailbox type

```java
// Marker interface used for mailbox requirements mapping
public interface MyUnboundedMessageQueueSemantics {}
```

### Example 9: Custom Mailbox type

```scala
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.dispatch.Envelope
import akka.dispatch.MailboxType
import akka.dispatch.MessageQueue
import akka.dispatch.ProducesMessageQueue
import com.typesafe.config.Config
import java.util.concurrent.ConcurrentLinkedQueue
import scala.Option

object MyUnboundedMailbox {
  // This is the MessageQueue implementation
  class MyMessageQueue extends MessageQueue with MyUnboundedMessageQueueSemantics {

    private final val queue = new ConcurrentLinkedQueue[Envelope]()

    // these should be implemented; queue used as example
    def enqueue(receiver: ActorRef, handle: Envelope): Unit =
      queue.offer(handle)
    def dequeue(): Envelope = queue.poll()
    def numberOfMessages: Int = queue.size
    def hasMessages: Boolean = !queue.isEmpty
    def cleanUp(owner: ActorRef, deadLetters: MessageQueue): Unit = {
      while (hasMessages) {
        deadLetters.enqueue(owner, dequeue())
      }
    }
  }
}

// This is the Mailbox implementation
class MyUnboundedMailbox extends MailboxType with ProducesMessageQueue[MyUnboundedMailbox.MyMessageQueue] {

  import MyUnboundedMailbox._

  // This constructor signature must exist, it will be called by Akka
  def this(settings: ActorSystem.Settings, config: Config) = {
    // put your initialization code here
    this()
  }

  // The create method is called to create the MessageQueue
  final override def create(owner: Option[ActorRef], system: Option[ActorSystem]): MessageQueue =
    new MyMessageQueue()
}
```

### Example 10: Custom Mailbox type

```java
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.dispatch.Envelope;
import akka.dispatch.MailboxType;
import akka.dispatch.MessageQueue;
import akka.dispatch.ProducesMessageQueue;
import com.typesafe.config.Config;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import scala.Option;

public class MyUnboundedMailbox
    implements MailboxType, ProducesMessageQueue<MyUnboundedMailbox.MyMessageQueue> {

  // This is the MessageQueue implementation
  public static class MyMessageQueue implements MessageQueue, MyUnboundedMessageQueueSemantics {
    private final Queue<Envelope> queue = new ConcurrentLinkedQueue<Envelope>();

    // these must be implemented; queue used as example
    public void enqueue(ActorRef receiver, Envelope handle) {
      queue.offer(handle);
    }

    public Envelope dequeue() {
      return queue.poll();
    }

    public int numberOfMessages() {
      return queue.size();
    }

    public boolean hasMessages() {
      return !queue.isEmpty();
    }

    public void cleanUp(ActorRef owner, MessageQueue deadLetters) {
      while (!queue.isEmpty()) {
        deadLetters.enqueue(owner, dequeue());
      }
    }
  }

  // This constructor signature must exist, it will be called by Akka
  public MyUnboundedMailbox(ActorSystem.Settings settings, Config config) {
    // put your initialization code here
  }

  // The create method is called to create the MessageQueue
  public MessageQueue create(Option<ActorRef> owner, Option<ActorSystem> system) {
    return new MyMessageQueue();
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem$$Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ControlMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/MailboxType.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/NonBlockingBoundedMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/UnboundedMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/UnboundedPriorityMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ControlMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NonBlockingBoundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/SingleConsumerOnlyUnboundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedPriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/libraries/akka-core/current/mailboxes.html
- https://doc.akka.io/libraries/akka-core/current/typed/dispatchers.html
- https://doc.akka.io/libraries/akka-core/current/typed/testing.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/mailboxes.html](https://doc.akka.io/libraries/akka-core/current/typed/mailboxes.html)*