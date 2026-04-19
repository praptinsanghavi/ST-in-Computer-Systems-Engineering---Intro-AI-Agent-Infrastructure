---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_3.html
title: 'Part 3: Working with Device Actors • Akka core'
---

# Part 3: Working with Device Actors • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Part 3: Working with Device Actors

## Introduction

In the previous topics we explained how to view actor systems *in the large*, that is, how components should be represented, how actors should be arranged in the hierarchy. In this part, we will look at actors *in the small* by implementing the device actor.

If we were working with objects, we would typically design the API as *interfaces*, a collection of abstract methods to be filled out by the actual implementation. In the world of actors, protocols take the place of interfaces. While it is not possible to formalize general protocols in the programming language, we can compose their most basic element, messages. So, we will start by identifying the messages we will want to send to device actors.

Typically, messages fall into categories, or patterns. By identifying these patterns, you will find that it becomes easier to choose between them and to implement them. The first example demonstrates the *request\-respond* message pattern.

## Identifying messages for devices

The tasks of a device actor will be simple:

- Collect temperature measurements
- When asked, report the last measured temperature

However, a device might start without immediately having a temperature measurement. Hence, we need to account for the case where a temperature is not present. This also allows us to test the query part of the actor without the write part present, as the device actor can report an empty result.

The protocol for obtaining the current temperature from the device actor is simple. The actor:

1. Waits for a request for the current temperature.
2. Responds to the request with a reply that either:
	- contains the current temperature or,
	- indicates that a temperature is not yet available.

We need two messages, one for the request, and one for the reply. Our first attempt might look like the following:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_3/DeviceInProgress.scala#L10-L25 "Go to snippet source")package com.example

  import akka.actor.typed.ActorRef

  object Device {
    sealed trait Command
    final case class ReadTemperature(replyTo: ActorRef[RespondTemperature]) extends Command
    final case class RespondTemperature(value: Option[Double])
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_3/inprogress1/Device.java#L9-L37 "Go to snippet source")package com.example;

import akka.actor.typed.ActorRef;
import java.util.Optional;

public class Device {

  public interface Command {}

  public static final class ReadTemperature implements Command {
    final ActorRef<RespondTemperature> replyTo;

    public ReadTemperature(ActorRef<RespondTemperature> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static final class RespondTemperature {
    final Optional<Double> value;

    public RespondTemperature(Optional<Double> value) {
      this.value = value;
    }
  }
}
```

Note that the `ReadTemperature` message contains the `ActorRef[RespondTemperature]``ActorRef<RespondTemperature>` that the device actor will use when replying to the request.

These two messages seem to cover the required functionality. However, the approach we choose must take into account the distributed nature of the application. While the basic mechanism is the same for communicating with an actor on the local JVM as with a remote actor, we need to keep the following in mind:

- There will be observable differences in the latency of delivery between local and remote messages, because factors like network link bandwidth and the message size also come into play.
- Reliability is a concern because a remote message send involves more steps, which means that more can go wrong.
- A local send will pass a reference to the message inside the same JVM, without any restrictions on the underlying object which is sent, whereas a remote transport will place a limit on the message size.

In addition, while sending inside the same JVM is significantly more reliable, if an actor fails due to a programmer error while processing the message, the effect is the same as if a remote network request fails due to the remote host crashing while processing the message. Even though in both cases, the service recovers after a while (the actor is restarted by its supervisor, the host is restarted by an operator or by a monitoring system) individual requests are lost during the crash. **Therefore, writing your actors such that every message could possibly be lost is the safe, pessimistic bet.**

But to further understand the need for flexibility in the protocol, it will help to consider Akka message ordering and message delivery guarantees. Akka provides the following behavior for message sends:

- At\-most\-once delivery, that is, no guaranteed delivery.
- Message ordering is maintained per sender, receiver pair.

The following sections discuss this behavior in more detail:

- [Message delivery](tutorial_3.html#message-delivery)
- [Message ordering](tutorial_3.html#message-ordering)

### Message delivery

The delivery semantics provided by messaging subsystems typically fall into the following categories:

- **At\-most\-once delivery** — each message is delivered zero or one time; in more causal terms it means that messages can be lost, but are never duplicated.
- **At\-least\-once delivery** — potentially multiple attempts are made to deliver each message, until at least one succeeds; again, in more causal terms this means that messages can be duplicated but are never lost.
- **Exactly\-once delivery** — each message is delivered exactly once to the recipient; the message can neither be lost nor be duplicated.

The first behavior, the one used by Akka, is the cheapest and results in the highest performance. It has the least implementation overhead because it can be done in a fire\-and\-forget fashion without keeping the state at the sending end or in the transport mechanism. The second, at\-least\-once, requires retries to counter transport losses. This adds the overhead of keeping the state at the sending end and having an acknowledgment mechanism at the receiving end. Exactly\-once delivery is most expensive, and results in the worst performance: in addition to the overhead added by at\-least\-once delivery, it requires the state to be kept at the receiving end in order to filter out duplicate deliveries.

In an actor system, we need to determine exact meaning of a guarantee — at which point does the system consider the delivery as accomplished:

1. When the message is sent out on the network?
2. When the message is received by the target actor’s host?
3. When the message is put into the target actor’s mailbox?
4. When the message target actor starts to process the message?
5. When the target actor has successfully processed the message?

Most frameworks and protocols that claim guaranteed delivery actually provide something similar to points 4 and 5\. While this sounds reasonable, **is it actually useful?** To understand the implications, consider a simple, practical example: a user attempts to place an order and we only want to claim that it has successfully processed once it is actually on disk in the orders database.

If we rely on the successful processing of the message, the actor will report success as soon as the order has been submitted to the internal API that has the responsibility to validate it, process it and put it into the database. Unfortunately, immediately after the API has been invoked any of the following can happen:

- The host can crash.
- Deserialization can fail.
- Validation can fail.
- The database might be unavailable.
- A programming error might occur.

This illustrates that the **guarantee of delivery** does not translate to the **domain level guarantee**. We only want to report success once the order has been actually fully processed and persisted. **The only entity that can report success is the application itself, since only it has any understanding of the domain guarantees required. No generalized framework can figure out the specifics of a particular domain and what is considered a success in that domain**.

In this particular example, we only want to signal success after a successful database write, where the database acknowledged that the order is now safely stored. **For these reasons Akka lifts the responsibilities of guarantees to the application itself, i.e. you have to implement them yourself with the tools that Akka provides. This gives you full control of the guarantees that you want to provide**. Now, let’s consider the message ordering that Akka provides to make it easy to reason about application logic.

### Message Ordering

In Akka, for a given pair of actors, messages sent directly from the first to the second will not be received out\-of\-order. The word directly emphasizes that this guarantee only applies when sending with the tell operator directly to the final destination, but not when employing mediators.

If:

- Actor `A1` sends messages `M1`, `M2`, `M3` to `A2`.
- Actor `A3` sends messages `M4`, `M5`, `M6` to `A2`.

This means that, for Akka messages:

- If `M1` is delivered it must be delivered before `M2` and `M3`.
- If `M2` is delivered it must be delivered before `M3`.
- If `M4` is delivered it must be delivered before `M5` and `M6`.
- If `M5` is delivered it must be delivered before `M6`.
- `A2` can see messages from `A1` interleaved with messages from `A3`.
- Since there is no guaranteed delivery, any of the messages may be dropped, i.e. not arrive at `A2`.

These guarantees strike a good balance: having messages from one actor arrive in\-order is convenient for building systems that can be easily reasoned about, while on the other hand allowing messages from different actors to arrive interleaved provides sufficient freedom for an efficient implementation of the actor system.

For the full details on delivery guarantees please refer to the [reference page](../../general/message-delivery-reliability.html).

## Adding flexibility to device messages

Our first query protocol was correct, but did not take into account distributed application execution. If we want to implement resends in the actor that queries a device actor (because of timed out requests), or if we want to query multiple actors, we need to be able to correlate requests and responses. Hence, we add one more field to our messages, so that an ID can be provided by the requester (we will add this code to our app in a later step):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_3/DeviceInProgress.scala#L46-L48 "Go to snippet source")sealed trait Command
final case class ReadTemperature(requestId: Long, replyTo: ActorRef[RespondTemperature]) extends Command
final case class RespondTemperature(requestId: Long, value: Option[Double])
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_3/inprogress2/Device.java#L19-L78 "Go to snippet source")public class Device extends AbstractBehavior<Device.Command> {
  public interface Command {}

  public static final class ReadTemperature implements Command {
    final long requestId;
    final ActorRef<RespondTemperature> replyTo;

    public ReadTemperature(long requestId, ActorRef<RespondTemperature> replyTo) {
      this.requestId = requestId;
      this.replyTo = replyTo;
    }
  }

  public static final class RespondTemperature {
    final long requestId;
    final Optional<Double> value;

    public RespondTemperature(long requestId, Optional<Double> value) {
      this.requestId = requestId;
      this.value = value;
    }
  }
}
```

## Implementing the device actor and its read protocol

As we learned in the Hello World example, each actor defines the type of messages it will accept. Our device actor has the responsibility to use the same ID parameter for the response of a given query, which would make it look like the following.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_3/DeviceInProgress.scala#L10-L74 "Go to snippet source")package com.example

  import akka.actor.typed.ActorRef
  import akka.actor.typed.Behavior
  import akka.actor.typed.PostStop
  import akka.actor.typed.Signal
  import akka.actor.typed.scaladsl.AbstractBehavior
  import akka.actor.typed.scaladsl.ActorContext
  import akka.actor.typed.scaladsl.Behaviors

  object Device {
    def apply(groupId: String, deviceId: String): Behavior[Command] =
      Behaviors.setup(context => new Device(context, groupId, deviceId))

    sealed trait Command
    final case class ReadTemperature(requestId: Long, replyTo: ActorRef[RespondTemperature]) extends Command
    final case class RespondTemperature(requestId: Long, value: Option[Double])
  }

  class Device(context: ActorContext[Device.Command], groupId: String, deviceId: String)
      extends AbstractBehavior[Device.Command](context) {
    import Device._

    var lastTemperatureReading: Option[Double] = None

    context.log.info("Device actor {}-{} started", groupId, deviceId)

    override def onMessage(msg: Command): Behavior[Command] = {
      msg match {
        case ReadTemperature(id, replyTo) =>
          replyTo ! RespondTemperature(id, lastTemperatureReading)
          this
      }
    }

    override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
      case PostStop =>
        context.log.info("Device actor {}-{} stopped", groupId, deviceId)
        this
    }

  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_3/inprogress2/Device.java#L8-L80 "Go to snippet source")  
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import java.util.Optional;

public class Device extends AbstractBehavior<Device.Command> {
  public interface Command {}

  public static final class ReadTemperature implements Command {
    final long requestId;
    final ActorRef<RespondTemperature> replyTo;

    public ReadTemperature(long requestId, ActorRef<RespondTemperature> replyTo) {
      this.requestId = requestId;
      this.replyTo = replyTo;
    }
  }

  public static final class RespondTemperature {
    final long requestId;
    final Optional<Double> value;

    public RespondTemperature(long requestId, Optional<Double> value) {
      this.requestId = requestId;
      this.value = value;
    }
  }

  public static Behavior<Command> create(String groupId, String deviceId) {
    return Behaviors.setup(context -> new Device(context, groupId, deviceId));
  }

  private final String groupId;
  private final String deviceId;

  private Optional<Double> lastTemperatureReading = Optional.empty();

  private Device(ActorContext<Command> context, String groupId, String deviceId) {
    super(context);
    this.groupId = groupId;
    this.deviceId = deviceId;

    context.getLog().info("Device actor {}-{} started", groupId, deviceId);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(ReadTemperature.class, this::onReadTemperature)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private Behavior<Command> onReadTemperature(ReadTemperature r) {
    r.replyTo.tell(new RespondTemperature(r.requestId, lastTemperatureReading));
    return this;
  }

  private Device onPostStop() {
    getContext().getLog().info("Device actor {}-{} stopped", groupId, deviceId);
    return this;
  }
}

```

Note in the code that:

- The `apply` method in the companion objectstatic `create` method defines how to construct the `Behavior` for the `Device` actor. The parameters include an ID for the device and the group to which it belongs, which we will use later.
- The messages we reasoned about previously are defined in the companion object.Device class that was shown earlier.
- In the `Device` class, the value of `lastTemperatureReading` is initially set to `None``Optional.empty()`, and the actor will report it back if queried.

## Testing the actor

Based on the actor above, we could write a test. In the `com.example` package in the test tree of your project, add the following code to a `DeviceSpec.scala``DeviceTest.java` file. (We use ScalaTest but any other test framework can be used with the Akka Testkit).

You can run this test by running `test` at the sbt promptby running `mvn test`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_3/DeviceSpec.scala#L9-L59 "Go to snippet source")package com.example

import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import org.scalatest.wordspec.AnyWordSpecLike

class DeviceSpec extends ScalaTestWithActorTestKit with AnyWordSpecLike {
  import Device._

  "Device actor" must {

    "reply with empty reading if no temperature is known" in {
      val probe = createTestProbe[RespondTemperature]()
      val deviceActor = spawn(Device("group", "device"))

      deviceActor ! Device.ReadTemperature(requestId = 42, probe.ref)
      val response = probe.receiveMessage()
      response.requestId should ===(42)
      response.value should ===(None)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_3/DeviceTest.java#L8-L69 "Go to snippet source")import static org.junit.Assert.assertEquals;

import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorRef;
import java.util.Optional;
import org.junit.ClassRule;
import org.junit.Test;

public class DeviceTest {

  @ClassRule public static final TestKitJunitResource testKit = new TestKitJunitResource();

  @Test
  public void testReplyWithEmptyReadingIfNoTemperatureIsKnown() {
    TestProbe<Device.RespondTemperature> probe =
        testKit.createTestProbe(Device.RespondTemperature.class);
    ActorRef<Device.Command> deviceActor = testKit.spawn(Device.create("group", "device"));
    deviceActor.tell(new Device.ReadTemperature(42L, probe.getRef()));
    Device.RespondTemperature response = probe.receiveMessage();
    assertEquals(42L, response.requestId);
    assertEquals(Optional.empty(), response.value);
  }
}
```

Now, the actor needs a way to change the state of the temperature when it receives a message from the sensor.

## Adding a write protocol

The purpose of the write protocol is to update the `currentTemperature` field when the actor receives a message that contains the temperature. Again, it is tempting to define the write protocol as a very simple message, something like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_3/DeviceInProgress.scala#L83-L84 "Go to snippet source")sealed trait Command
final case class RecordTemperature(value: Double) extends Command
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_3/inprogress3/Device.java#L12-L18 "Go to snippet source")public static final class RecordTemperature implements Command {
  final double value;

  public RecordTemperature(double value) {
    this.value = value;
  }
}
```

However, this approach does not take into account that the sender of the record temperature message can never be sure if the message was processed or not. We have seen that Akka does not guarantee delivery of these messages and leaves it to the application to provide success notifications. In our case, we would like to send an acknowledgment to the sender once we have updated our last temperature recording, e.g. replying with a `TemperatureRecorded` message. Just like in the case of temperature queries and responses, it is also a good idea to include an ID field to provide maximum flexibility.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_3/Device.scala#L33-L35 "Go to snippet source")final case class RecordTemperature(requestId: Long, value: Double, replyTo: ActorRef[TemperatureRecorded])
    extends Command
final case class TemperatureRecorded(requestId: Long)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_3/Device.java#L23-L41 "Go to snippet source")public static final class RecordTemperature implements Command {
  final long requestId;
  final double value;
  final ActorRef<TemperatureRecorded> replyTo;

  public RecordTemperature(long requestId, double value, ActorRef<TemperatureRecorded> replyTo) {
    this.requestId = requestId;
    this.value = value;
    this.replyTo = replyTo;
  }
}

public static final class TemperatureRecorded {
  final long requestId;

  public TemperatureRecorded(long requestId) {
    this.requestId = requestId;
  }
}
```

## Actor with read and write messages

Putting the read and write protocol together, the device actor looks like the following example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_3/Device.scala#L9-L67 "Go to snippet source")package com.example

import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.PostStop
import akka.actor.typed.Signal
import akka.actor.typed.scaladsl.AbstractBehavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object Device {
  def apply(groupId: String, deviceId: String): Behavior[Command] =
    Behaviors.setup(context => new Device(context, groupId, deviceId))

  sealed trait Command

  final case class ReadTemperature(requestId: Long, replyTo: ActorRef[RespondTemperature]) extends Command
  final case class RespondTemperature(requestId: Long, value: Option[Double])

  final case class RecordTemperature(requestId: Long, value: Double, replyTo: ActorRef[TemperatureRecorded])
      extends Command
  final case class TemperatureRecorded(requestId: Long)
}

class Device(context: ActorContext[Device.Command], groupId: String, deviceId: String)
    extends AbstractBehavior[Device.Command](context) {
  import Device._

  var lastTemperatureReading: Option[Double] = None

  context.log.info("Device actor {}-{} started", groupId, deviceId)

  override def onMessage(msg: Command): Behavior[Command] = {
    msg match {
      case RecordTemperature(id, value, replyTo) =>
        context.log.info("Recorded temperature reading {} with {}", value, id)
        lastTemperatureReading = Some(value)
        replyTo ! TemperatureRecorded(id)
        this

      case ReadTemperature(id, replyTo) =>
        replyTo ! RespondTemperature(id, lastTemperatureReading)
        this
    }
  }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("Device actor {}-{} stopped", groupId, deviceId)
      this
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_3/Device.java#L8-L106 "Go to snippet source")  
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import java.util.Optional;

public class Device extends AbstractBehavior<Device.Command> {

  public interface Command {}

  public static final class RecordTemperature implements Command {
    final long requestId;
    final double value;
    final ActorRef<TemperatureRecorded> replyTo;

    public RecordTemperature(long requestId, double value, ActorRef<TemperatureRecorded> replyTo) {
      this.requestId = requestId;
      this.value = value;
      this.replyTo = replyTo;
    }
  }

  public static final class TemperatureRecorded {
    final long requestId;

    public TemperatureRecorded(long requestId) {
      this.requestId = requestId;
    }
  }

  public static final class ReadTemperature implements Command {
    final long requestId;
    final ActorRef<RespondTemperature> replyTo;

    public ReadTemperature(long requestId, ActorRef<RespondTemperature> replyTo) {
      this.requestId = requestId;
      this.replyTo = replyTo;
    }
  }

  public static final class RespondTemperature {
    final long requestId;
    final Optional<Double> value;

    public RespondTemperature(long requestId, Optional<Double> value) {
      this.requestId = requestId;
      this.value = value;
    }
  }

  public static Behavior<Command> create(String groupId, String deviceId) {
    return Behaviors.setup(context -> new Device(context, groupId, deviceId));
  }

  private final String groupId;
  private final String deviceId;

  private Optional<Double> lastTemperatureReading = Optional.empty();

  private Device(ActorContext<Command> context, String groupId, String deviceId) {
    super(context);
    this.groupId = groupId;
    this.deviceId = deviceId;

    context.getLog().info("Device actor {}-{} started", groupId, deviceId);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(RecordTemperature.class, this::onRecordTemperature)
        .onMessage(ReadTemperature.class, this::onReadTemperature)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private Behavior<Command> onRecordTemperature(RecordTemperature r) {
    getContext().getLog().info("Recorded temperature reading {} with {}", r.value, r.requestId);
    lastTemperatureReading = Optional.of(r.value);
    r.replyTo.tell(new TemperatureRecorded(r.requestId));
    return this;
  }

  private Behavior<Command> onReadTemperature(ReadTemperature r) {
    r.replyTo.tell(new RespondTemperature(r.requestId, lastTemperatureReading));
    return this;
  }

  private Behavior<Command> onPostStop() {
    getContext().getLog().info("Device actor {}-{} stopped", groupId, deviceId);
    return Behaviors.stopped();
  }
}
```

We should also write a new test case now, exercising both the read/query and write/record functionality together:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_3/DeviceSpec.scala#L35-L55 "Go to snippet source")"reply with latest temperature reading" in {
  val recordProbe = createTestProbe[TemperatureRecorded]()
  val readProbe = createTestProbe[RespondTemperature]()
  val deviceActor = spawn(Device("group", "device"))

  deviceActor ! Device.RecordTemperature(requestId = 1, 24.0, recordProbe.ref)
  recordProbe.expectMessage(Device.TemperatureRecorded(requestId = 1))

  deviceActor ! Device.ReadTemperature(requestId = 2, readProbe.ref)
  val response1 = readProbe.receiveMessage()
  response1.requestId should ===(2)
  response1.value should ===(Some(24.0))

  deviceActor ! Device.RecordTemperature(requestId = 3, 55.0, recordProbe.ref)
  recordProbe.expectMessage(Device.TemperatureRecorded(requestId = 3))

  deviceActor ! Device.ReadTemperature(requestId = 4, readProbe.ref)
  val response2 = readProbe.receiveMessage()
  response2.requestId should ===(4)
  response2.value should ===(Some(55.0))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_3/DeviceTest.java#L42-L65 "Go to snippet source")@Test
public void testReplyWithLatestTemperatureReading() {
  TestProbe<Device.TemperatureRecorded> recordProbe =
      testKit.createTestProbe(Device.TemperatureRecorded.class);
  TestProbe<Device.RespondTemperature> readProbe =
      testKit.createTestProbe(Device.RespondTemperature.class);
  ActorRef<Device.Command> deviceActor = testKit.spawn(Device.create("group", "device"));

  deviceActor.tell(new Device.RecordTemperature(1L, 24.0, recordProbe.getRef()));
  assertEquals(1L, recordProbe.receiveMessage().requestId);

  deviceActor.tell(new Device.ReadTemperature(2L, readProbe.getRef()));
  Device.RespondTemperature response1 = readProbe.receiveMessage();
  assertEquals(2L, response1.requestId);
  assertEquals(Optional.of(24.0), response1.value);

  deviceActor.tell(new Device.RecordTemperature(3L, 55.0, recordProbe.getRef()));
  assertEquals(3L, recordProbe.receiveMessage().requestId);

  deviceActor.tell(new Device.ReadTemperature(4L, readProbe.getRef()));
  Device.RespondTemperature response2 = readProbe.receiveMessage();
  assertEquals(4L, response2.requestId);
  assertEquals(Optional.of(55.0), response2.value);
}
```

## What’s Next?

So far, we have started designing our overall architecture, and we wrote the first actor that directly corresponds to the domain. We now have to create the component that is responsible for maintaining groups of devices and the device actors themselves.

## Code Examples

### Example 1: Identifying messages for devices

```scala
package com.example

  import akka.actor.typed.ActorRef

  object Device {
    sealed trait Command
    final case class ReadTemperature(replyTo: ActorRef[RespondTemperature]) extends Command
    final case class RespondTemperature(value: Option[Double])
  }
```

### Example 2: Identifying messages for devices

```java
package com.example;

import akka.actor.typed.ActorRef;
import java.util.Optional;

public class Device {

  public interface Command {}

  public static final class ReadTemperature implements Command {
    final ActorRef<RespondTemperature> replyTo;

    public ReadTemperature(ActorRef<RespondTemperature> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static final class RespondTemperature {
    final Optional<Double> value;

    public RespondTemperature(Optional<Double> value) {
      this.value = value;
    }
  }
}
```

### Example 3: Adding flexibility to device messages

```scala
sealed trait Command
final case class ReadTemperature(requestId: Long, replyTo: ActorRef[RespondTemperature]) extends Command
final case class RespondTemperature(requestId: Long, value: Option[Double])
```

### Example 4: Adding flexibility to device messages

```java
public class Device extends AbstractBehavior<Device.Command> {
  public interface Command {}

  public static final class ReadTemperature implements Command {
    final long requestId;
    final ActorRef<RespondTemperature> replyTo;

    public ReadTemperature(long requestId, ActorRef<RespondTemperature> replyTo) {
      this.requestId = requestId;
      this.replyTo = replyTo;
    }
  }

  public static final class RespondTemperature {
    final long requestId;
    final Optional<Double> value;

    public RespondTemperature(long requestId, Optional<Double> value) {
      this.requestId = requestId;
      this.value = value;
    }
  }
}
```

### Example 5: Implementing the device actor and its read protocol

```scala
package com.example

  import akka.actor.typed.ActorRef
  import akka.actor.typed.Behavior
  import akka.actor.typed.PostStop
  import akka.actor.typed.Signal
  import akka.actor.typed.scaladsl.AbstractBehavior
  import akka.actor.typed.scaladsl.ActorContext
  import akka.actor.typed.scaladsl.Behaviors

  object Device {
    def apply(groupId: String, deviceId: String): Behavior[Command] =
      Behaviors.setup(context => new Device(context, groupId, deviceId))

    sealed trait Command
    final case class ReadTemperature(requestId: Long, replyTo: ActorRef[RespondTemperature]) extends Command
    final case class RespondTemperature(requestId: Long, value: Option[Double])
  }

  class Device(context: ActorContext[Device.Command], groupId: String, deviceId: String)
      extends AbstractBehavior[Device.Command](context) {
    import Device._

    var lastTemperatureReading: Option[Double] = None

    context.log.info("Device actor {}-{} started", groupId, deviceId)

    override def onMessage(msg: Command): Behavior[Command] = {
      msg match {
        case ReadTemperature(id, replyTo) =>
          replyTo ! RespondTemperature(id, lastTemperatureReading)
          this
      }
    }

    override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
      case PostStop =>
        context.log.info("Device actor {}-{} stopped", groupId, deviceId)
        this
    }

  }
```

### Example 6: Implementing the device actor and its read protocol

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import java.util.Optional;

public class Device extends AbstractBehavior<Device.Command> {
  public interface Command {}

  public static final class ReadTemperature implements Command {
    final long requestId;
    final ActorRef<RespondTemperature> replyTo;

    public ReadTemperature(long requestId, ActorRef<RespondTemperature> replyTo) {
      this.requestId = requestId;
      this.replyTo = replyTo;
    }
  }

  public static final class RespondTemperature {
    final long requestId;
    final Optional<Double> value;

    public RespondTemperature(long requestId, Optional<Double> value) {
      this.requestId = requestId;
      this.value = value;
    }
  }

  public static Behavior<Command> create(String groupId, String deviceId) {
    return Behaviors.setup(context -> new Device(context, groupId, deviceId));
  }

  private final String groupId;
  private final String deviceId;

  private Optional<Double> lastTemperatureReading = Optional.empty();

  private Device(ActorContext<Command> context, String groupId, String deviceId) {
    super(context);
    this.groupId = groupId;
    this.deviceId = deviceId;

    context.getLog().info("Device actor {}-{} started", groupId, deviceId);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(ReadTemperature.class, this::onReadTemperature)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private Behavior<Command> onReadTemperature(ReadTemperature r) {
    r.replyTo.tell(new RespondTemperature(r.requestId, lastTemperatureReading));
    return this;
  }

  private Device onPostStop() {
    getContext().getLog().info("Device actor {}-{} stopped", groupId, deviceId);
    return this;
  }
}
```

### Example 7: Testing the actor

```scala
package com.example

import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import org.scalatest.wordspec.AnyWordSpecLike

class DeviceSpec extends ScalaTestWithActorTestKit with AnyWordSpecLike {
  import Device._

  "Device actor" must {

    "reply with empty reading if no temperature is known" in {
      val probe = createTestProbe[RespondTemperature]()
      val deviceActor = spawn(Device("group", "device"))

      deviceActor ! Device.ReadTemperature(requestId = 42, probe.ref)
      val response = probe.receiveMessage()
      response.requestId should ===(42)
      response.value should ===(None)
    }
  }
}
```

### Example 8: Testing the actor

```java
import static org.junit.Assert.assertEquals;

import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorRef;
import java.util.Optional;
import org.junit.ClassRule;
import org.junit.Test;


public class DeviceTest {

  @ClassRule public static final TestKitJunitResource testKit = new TestKitJunitResource();

  @Test
  public void testReplyWithEmptyReadingIfNoTemperatureIsKnown() {
    TestProbe<Device.RespondTemperature> probe =
        testKit.createTestProbe(Device.RespondTemperature.class);
    ActorRef<Device.Command> deviceActor = testKit.spawn(Device.create("group", "device"));
    deviceActor.tell(new Device.ReadTemperature(42L, probe.getRef()));
    Device.RespondTemperature response = probe.receiveMessage();
    assertEquals(42L, response.requestId);
    assertEquals(Optional.empty(), response.value);
  }
}
```

### Example 9: Adding a write protocol

```scala
sealed trait Command
final case class RecordTemperature(value: Double) extends Command
```

### Example 10: Adding a write protocol

```java
public static final class RecordTemperature implements Command {
  final double value;

  public RecordTemperature(double value) {
    this.value = value;
  }
}
```

### Example 11: Adding a write protocol

```scala
final case class RecordTemperature(requestId: Long, value: Double, replyTo: ActorRef[TemperatureRecorded])
    extends Command
final case class TemperatureRecorded(requestId: Long)
```

### Example 12: Adding a write protocol

```java
public static final class RecordTemperature implements Command {
  final long requestId;
  final double value;
  final ActorRef<TemperatureRecorded> replyTo;

  public RecordTemperature(long requestId, double value, ActorRef<TemperatureRecorded> replyTo) {
    this.requestId = requestId;
    this.value = value;
    this.replyTo = replyTo;
  }
}

public static final class TemperatureRecorded {
  final long requestId;

  public TemperatureRecorded(long requestId) {
    this.requestId = requestId;
  }
}
```

### Example 13: Actor with read and write messages

```scala
package com.example

import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.PostStop
import akka.actor.typed.Signal
import akka.actor.typed.scaladsl.AbstractBehavior
import akka.actor.typed.scaladsl.ActorContext
import akka.actor.typed.scaladsl.Behaviors

object Device {
  def apply(groupId: String, deviceId: String): Behavior[Command] =
    Behaviors.setup(context => new Device(context, groupId, deviceId))

  sealed trait Command

  final case class ReadTemperature(requestId: Long, replyTo: ActorRef[RespondTemperature]) extends Command
  final case class RespondTemperature(requestId: Long, value: Option[Double])

  final case class RecordTemperature(requestId: Long, value: Double, replyTo: ActorRef[TemperatureRecorded])
      extends Command
  final case class TemperatureRecorded(requestId: Long)
}

class Device(context: ActorContext[Device.Command], groupId: String, deviceId: String)
    extends AbstractBehavior[Device.Command](context) {
  import Device._

  var lastTemperatureReading: Option[Double] = None

  context.log.info("Device actor {}-{} started", groupId, deviceId)

  override def onMessage(msg: Command): Behavior[Command] = {
    msg match {
      case RecordTemperature(id, value, replyTo) =>
        context.log.info("Recorded temperature reading {} with {}", value, id)
        lastTemperatureReading = Some(value)
        replyTo ! TemperatureRecorded(id)
        this

      case ReadTemperature(id, replyTo) =>
        replyTo ! RespondTemperature(id, lastTemperatureReading)
        this
    }
  }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("Device actor {}-{} stopped", groupId, deviceId)
      this
  }

}
```

### Example 14: Actor with read and write messages

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import java.util.Optional;

public class Device extends AbstractBehavior<Device.Command> {

  public interface Command {}

  public static final class RecordTemperature implements Command {
    final long requestId;
    final double value;
    final ActorRef<TemperatureRecorded> replyTo;

    public RecordTemperature(long requestId, double value, ActorRef<TemperatureRecorded> replyTo) {
      this.requestId = requestId;
      this.value = value;
      this.replyTo = replyTo;
    }
  }

  public static final class TemperatureRecorded {
    final long requestId;

    public TemperatureRecorded(long requestId) {
      this.requestId = requestId;
    }
  }

  public static final class ReadTemperature implements Command {
    final long requestId;
    final ActorRef<RespondTemperature> replyTo;

    public ReadTemperature(long requestId, ActorRef<RespondTemperature> replyTo) {
      this.requestId = requestId;
      this.replyTo = replyTo;
    }
  }

  public static final class RespondTemperature {
    final long requestId;
    final Optional<Double> value;

    public RespondTemperature(long requestId, Optional<Double> value) {
      this.requestId = requestId;
      this.value = value;
    }
  }

  public static Behavior<Command> create(String groupId, String deviceId) {
    return Behaviors.setup(context -> new Device(context, groupId, deviceId));
  }

  private final String groupId;
  private final String deviceId;

  private Optional<Double> lastTemperatureReading = Optional.empty();

  private Device(ActorContext<Command> context, String groupId, String deviceId) {
    super(context);
    this.groupId = groupId;
    this.deviceId = deviceId;

    context.getLog().info("Device actor {}-{} started", groupId, deviceId);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(RecordTemperature.class, this::onRecordTemperature)
        .onMessage(ReadTemperature.class, this::onReadTemperature)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private Behavior<Command> onRecordTemperature(RecordTemperature r) {
    getContext().getLog().info("Recorded temperature reading {} with {}", r.value, r.requestId);
    lastTemperatureReading = Optional.of(r.value);
    r.replyTo.tell(new TemperatureRecorded(r.requestId));
    return this;
  }

  private Behavior<Command> onReadTemperature(ReadTemperature r) {
    r.replyTo.tell(new RespondTemperature(r.requestId, lastTemperatureReading));
    return this;
  }

  private Behavior<Command> onPostStop() {
    getContext().getLog().info("Device actor {}-{} stopped", groupId, deviceId);
    return Behaviors.stopped();
  }
}
```

### Example 15: Actor with read and write messages

```scala
"reply with latest temperature reading" in {
  val recordProbe = createTestProbe[TemperatureRecorded]()
  val readProbe = createTestProbe[RespondTemperature]()
  val deviceActor = spawn(Device("group", "device"))

  deviceActor ! Device.RecordTemperature(requestId = 1, 24.0, recordProbe.ref)
  recordProbe.expectMessage(Device.TemperatureRecorded(requestId = 1))

  deviceActor ! Device.ReadTemperature(requestId = 2, readProbe.ref)
  val response1 = readProbe.receiveMessage()
  response1.requestId should ===(2)
  response1.value should ===(Some(24.0))

  deviceActor ! Device.RecordTemperature(requestId = 3, 55.0, recordProbe.ref)
  recordProbe.expectMessage(Device.TemperatureRecorded(requestId = 3))

  deviceActor ! Device.ReadTemperature(requestId = 4, readProbe.ref)
  val response2 = readProbe.receiveMessage()
  response2.requestId should ===(4)
  response2.value should ===(Some(55.0))
}
```

### Example 16: Actor with read and write messages

```java
@Test
public void testReplyWithLatestTemperatureReading() {
  TestProbe<Device.TemperatureRecorded> recordProbe =
      testKit.createTestProbe(Device.TemperatureRecorded.class);
  TestProbe<Device.RespondTemperature> readProbe =
      testKit.createTestProbe(Device.RespondTemperature.class);
  ActorRef<Device.Command> deviceActor = testKit.spawn(Device.create("group", "device"));

  deviceActor.tell(new Device.RecordTemperature(1L, 24.0, recordProbe.getRef()));
  assertEquals(1L, recordProbe.receiveMessage().requestId);

  deviceActor.tell(new Device.ReadTemperature(2L, readProbe.getRef()));
  Device.RespondTemperature response1 = readProbe.receiveMessage();
  assertEquals(2L, response1.requestId);
  assertEquals(Optional.of(24.0), response1.value);

  deviceActor.tell(new Device.RecordTemperature(3L, 55.0, recordProbe.getRef()));
  assertEquals(3L, recordProbe.receiveMessage().requestId);

  deviceActor.tell(new Device.ReadTemperature(4L, readProbe.getRef()));
  Device.RespondTemperature response2 = readProbe.receiveMessage();
  assertEquals(4L, response2.requestId);
  assertEquals(Optional.of(55.0), response2.value);
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/general/message-delivery-reliability.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_2.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_3.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_4.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_3.html](https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_3.html)*