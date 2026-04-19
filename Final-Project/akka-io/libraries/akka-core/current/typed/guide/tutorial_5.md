---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:57:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_5.html
title: 'Part 5: Querying Device Groups • Akka core'
---

# Part 5: Querying Device Groups • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Part 5: Querying Device Groups

## Introduction

The conversational patterns that we have seen so far are simple in the sense that they require the actor to keep little or no state. Specifically:

- Device actors return a reading, which requires no state change
- Record a temperature, which updates a single field
- Device Group actors maintain group membership by adding or removing entries from a map

In this part, we will use a more complex example. Since homeowners will be interested in the temperatures throughout their home, our goal is to be able to query all of the device actors in a group. Let us start by investigating how such a query API should behave.

## Dealing with possible scenarios

The very first issue we face is that the membership of a group is dynamic. Each sensor device is represented by an actor that can stop at any time. At the beginning of the query, we can ask all of the existing device actors for the current temperature. However, during the lifecycle of the query:

- A device actor might stop and not be able to respond back with a temperature reading.
- A new device actor might start up and not be included in the query because we weren’t aware of it.

These issues can be addressed in many different ways, but the important point is to settle on the desired behavior. The following works well for our use case:

- When a query arrives, the group actor takes a *snapshot* of the existing device actors and will only ask those actors for the temperature.
- Actors that start up *after* the query arrives are ignored.
- If an actor in the snapshot stops during the query without answering, we will report the fact that it stopped to the sender of the query message.

Apart from device actors coming and going dynamically, some actors might take a long time to answer. For example, they could be stuck in an accidental infinite loop, or fail due to a bug and drop our request. We don’t want the query to continue indefinitely, so we will consider it complete in either of the following cases:

- All actors in the snapshot have either responded or have confirmed being stopped.
- We reach a pre\-defined deadline.

Given these decisions, along with the fact that a device in the snapshot might have just started and not yet received a temperature to record, we can define four states for each device actor, with respect to a temperature query:

- It has a temperature available: `Temperature`.
- It has responded, but has no temperature available yet: `TemperatureNotAvailable`.
- It has stopped before answering: `DeviceNotAvailable`.
- It did not respond before the deadline: `DeviceTimedOut`.

Summarizing these in message types we can add the following to the message protocol:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceManager.scala#L40-L52 "Go to snippet source")  
final case class RequestAllTemperatures(requestId: Long, groupId: String, replyTo: ActorRef[RespondAllTemperatures])
    extends DeviceGroupQuery.Command
    with DeviceGroup.Command
    with DeviceManager.Command

final case class RespondAllTemperatures(requestId: Long, temperatures: Map[String, TemperatureReading])

sealed trait TemperatureReading
final case class Temperature(value: Double) extends TemperatureReading
case object TemperatureNotAvailable extends TemperatureReading
case object DeviceNotAvailable extends TemperatureReading
case object DeviceTimedOut extends TemperatureReading
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceManager.java#L68-L135 "Go to snippet source")  
public static final class RequestAllTemperatures
    implements DeviceGroupQuery.Command, DeviceGroup.Command, Command {

  final long requestId;
  final String groupId;
  final ActorRef<RespondAllTemperatures> replyTo;

  public RequestAllTemperatures(
      long requestId, String groupId, ActorRef<RespondAllTemperatures> replyTo) {
    this.requestId = requestId;
    this.groupId = groupId;
    this.replyTo = replyTo;
  }
}

public static final class RespondAllTemperatures {
  final long requestId;
  final Map<String, TemperatureReading> temperatures;

  public RespondAllTemperatures(long requestId, Map<String, TemperatureReading> temperatures) {
    this.requestId = requestId;
    this.temperatures = temperatures;
  }
}

public interface TemperatureReading {}

public static final class Temperature implements TemperatureReading {
  public final double value;

  public Temperature(double value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Temperature that = (Temperature) o;

    return Double.compare(that.value, value) == 0;
  }

  @Override
  public int hashCode() {
    long temp = Double.doubleToLongBits(value);
    return (int) (temp ^ (temp >>> 32));
  }

  @Override
  public String toString() {
    return "Temperature{" + "value=" + value + '}';
  }
}

public enum TemperatureNotAvailable implements TemperatureReading {
  INSTANCE
}

public enum DeviceNotAvailable implements TemperatureReading {
  INSTANCE
}

public enum DeviceTimedOut implements TemperatureReading {
  INSTANCE
}
```

## Implementing the query

One approach for implementing the query involves adding code to the device group actor. However, in practice this can be very cumbersome and error\-prone. Remember that when we start a query, we need to take a snapshot of the devices present and start a timer so that we can enforce the deadline. In the meantime, *another query* can arrive. For the second query we need to keep track of the exact same information but in isolation from the previous query. This would require us to maintain separate mappings between queries and device actors.

Instead, we will implement a simpler, and superior approach. We will create an actor that represents a *single query* and that performs the tasks needed to complete the query on behalf of the group actor. So far we have created actors that belonged to classical domain objects, but now, we will create an actor that represents a process or a task rather than an entity. We benefit by keeping our group device actor simple and being able to better test query capability in isolation.

### Defining the query actor

First, we need to design the lifecycle of our query actor. This consists of identifying its initial state, the first action it will take, and the cleanup — if necessary. The query actor will need the following information:

- The snapshot and IDs of active device actors to query.
- The ID of the request that started the query (so that we can include it in the reply).
- The reference of the actor who sent the query. We will send the reply to this actor directly.
- A deadline that indicates how long the query should wait for replies. Making this a parameter will simplify testing.

#### Scheduling the query timeout

Since we need a way to indicate how long we are willing to wait for responses, it is time to introduce a new Akka feature that we have not used yet, the built\-in scheduler facility. Using [`Behaviors.withTimers`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#withTimers(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.withTimers`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#withTimers[T](factory:akka.actor.typed.scaladsl.TimerScheduler[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") and [`startSingleTimer`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/TimerScheduler.html#startSingleTimer(java.lang.Object,T,java.time.Duration) "akka.actor.typed.javadsl.TimerScheduler")[`startSingleTimer`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/TimerScheduler.html#startSingleTimer(key:Any,msg:T,delay:scala.concurrent.duration.FiniteDuration):Unit "akka.actor.typed.scaladsl.TimerScheduler") to schedule a message that will be sent after a given delay.

We need to create a message that represents the query timeout. We create a simple message `CollectionTimeout` without any parameters for this purpose.

At the start of the query, we need to ask each of the device actors for the current temperature. To be able to quickly detect devices that stopped before they got the `ReadTemperature` message we will also watch each of the actors. This way, we get `DeviceTerminated` messages for those that stop during the lifetime of the query, so we don’t need to wait until the timeout to mark these as not available.

Putting this together, the outline of our `DeviceGroupQuery` actor looks like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupQuery.scala#L18-L124 "Go to snippet source")object DeviceGroupQuery {

  def apply(
      deviceIdToActor: Map[String, ActorRef[Device.Command]],
      requestId: Long,
      requester: ActorRef[DeviceManager.RespondAllTemperatures],
      timeout: FiniteDuration): Behavior[Command] = {
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        new DeviceGroupQuery(deviceIdToActor, requestId, requester, timeout, context, timers)
      }
    }
  }

  trait Command

  private case object CollectionTimeout extends Command

  final case class WrappedRespondTemperature(response: Device.RespondTemperature) extends Command

  private final case class DeviceTerminated(deviceId: String) extends Command
}

class DeviceGroupQuery(
    deviceIdToActor: Map[String, ActorRef[Device.Command]],
    requestId: Long,
    requester: ActorRef[DeviceManager.RespondAllTemperatures],
    timeout: FiniteDuration,
    context: ActorContext[DeviceGroupQuery.Command],
    timers: TimerScheduler[DeviceGroupQuery.Command])
    extends AbstractBehavior[DeviceGroupQuery.Command](context) {

  import DeviceGroupQuery._
  import DeviceManager.DeviceNotAvailable
  import DeviceManager.DeviceTimedOut
  import DeviceManager.RespondAllTemperatures
  import DeviceManager.Temperature
  import DeviceManager.TemperatureNotAvailable
  import DeviceManager.TemperatureReading

  timers.startSingleTimer(CollectionTimeout, CollectionTimeout, timeout)

  private val respondTemperatureAdapter = context.messageAdapter(WrappedRespondTemperature.apply)

  deviceIdToActor.foreach {
    case (deviceId, device) =>
      context.watchWith(device, DeviceTerminated(deviceId))
      device ! Device.ReadTemperature(0, respondTemperatureAdapter)
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupQuery.java#L22-L146 "Go to snippet source")public class DeviceGroupQuery extends AbstractBehavior<DeviceGroupQuery.Command> {

  public interface Command {}

  private static enum CollectionTimeout implements Command {
    INSTANCE
  }

  static class WrappedRespondTemperature implements Command {
    final Device.RespondTemperature response;

    WrappedRespondTemperature(Device.RespondTemperature response) {
      this.response = response;
    }
  }

  private static class DeviceTerminated implements Command {
    final String deviceId;

    private DeviceTerminated(String deviceId) {
      this.deviceId = deviceId;
    }
  }

  public static Behavior<Command> create(
      Map<String, ActorRef<Device.Command>> deviceIdToActor,
      long requestId,
      ActorRef<DeviceManager.RespondAllTemperatures> requester,
      Duration timeout) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(
                timers ->
                    new DeviceGroupQuery(
                        deviceIdToActor, requestId, requester, timeout, context, timers)));
  }

  private final long requestId;
  private final ActorRef<DeviceManager.RespondAllTemperatures> requester;

  private DeviceGroupQuery(
      Map<String, ActorRef<Device.Command>> deviceIdToActor,
      long requestId,
      ActorRef<DeviceManager.RespondAllTemperatures> requester,
      Duration timeout,
      ActorContext<Command> context,
      TimerScheduler<Command> timers) {
    super(context);
    this.requestId = requestId;
    this.requester = requester;

    timers.startSingleTimer(CollectionTimeout.INSTANCE, timeout);

    ActorRef<Device.RespondTemperature> respondTemperatureAdapter =
        context.messageAdapter(Device.RespondTemperature.class, WrappedRespondTemperature::new);

    for (Map.Entry<String, ActorRef<Device.Command>> entry : deviceIdToActor.entrySet()) {
      context.watchWith(entry.getValue(), new DeviceTerminated(entry.getKey()));
      entry.getValue().tell(new Device.ReadTemperature(0L, respondTemperatureAdapter));
    }
    stillWaiting = new HashSet<>(deviceIdToActor.keySet());
  }

}
```

Note that we have to convert the `RespondTemperature` replies from the device actor to the message protocol that the `DeviceGroupQuery` actor understands, i.e. `DeviceGroupQuery.Command`. For this we use a `messageAdapter` that wraps the `RespondTemperature` in a `WrappedRespondTemperature`, which extendsimplements `DeviceGroupQuery.Command`.

#### Tracking actor state

The query actor, apart from the pending timer, has one stateful aspect, tracking the set of actors that: have replied, have stopped, or have not replied. We track this state in a `var` field of an immutable `Map`in a mutable `HashMap` in the actor.

For our use case:

1. We keep track of the state with:
	- a `Map` of already received replies
	- a `Set` of actors that we still wait on
2. We have three events to act on:
	- We can receive a `RespondTemperature` message from one of the devices.
	- We can receive a `DeviceTerminated` message for a device actor that has been stopped in the meantime.
	- We can reach the deadline and receive a `CollectionTimeout`.

To accomplish this, add the following to your `DeviceGroupQuery` source file:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupQuery.scala#L64-L110 "Go to snippet source")private var repliesSoFar = Map.empty[String, TemperatureReading]
private var stillWaiting = deviceIdToActor.keySet

override def onMessage(msg: Command): Behavior[Command] =
  msg match {
    case WrappedRespondTemperature(response) => onRespondTemperature(response)
    case DeviceTerminated(deviceId)          => onDeviceTerminated(deviceId)
    case CollectionTimeout                   => onCollectionTimout()
  }

private def onRespondTemperature(response: Device.RespondTemperature): Behavior[Command] = {
  val reading = response.value match {
    case Some(value) => Temperature(value)
    case None        => TemperatureNotAvailable
  }

  val deviceId = response.deviceId
  repliesSoFar += (deviceId -> reading)
  stillWaiting -= deviceId

  respondWhenAllCollected()
}

private def onDeviceTerminated(deviceId: String): Behavior[Command] = {
  if (stillWaiting(deviceId)) {
    repliesSoFar += (deviceId -> DeviceNotAvailable)
    stillWaiting -= deviceId
  }
  respondWhenAllCollected()
}

private def onCollectionTimout(): Behavior[Command] = {
  repliesSoFar ++= stillWaiting.map(deviceId => deviceId -> DeviceTimedOut)
  stillWaiting = Set.empty
  respondWhenAllCollected()
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupQuery.java#L63-L131 "Go to snippet source")private Map<String, DeviceManager.TemperatureReading> repliesSoFar = new HashMap<>();
private final Set<String> stillWaiting;

@Override
public Receive<Command> createReceive() {
  return newReceiveBuilder()
      .onMessage(WrappedRespondTemperature.class, this::onRespondTemperature)
      .onMessage(DeviceTerminated.class, this::onDeviceTerminated)
      .onMessage(CollectionTimeout.class, this::onCollectionTimeout)
      .build();
}

private Behavior<Command> onRespondTemperature(WrappedRespondTemperature r) {
  DeviceManager.TemperatureReading reading =
      r.response
          .value
          .map(v -> (DeviceManager.TemperatureReading) new DeviceManager.Temperature(v))
          .orElse(DeviceManager.TemperatureNotAvailable.INSTANCE);

  String deviceId = r.response.deviceId;
  repliesSoFar.put(deviceId, reading);
  stillWaiting.remove(deviceId);

  return respondWhenAllCollected();
}

private Behavior<Command> onDeviceTerminated(DeviceTerminated terminated) {
  if (stillWaiting.contains(terminated.deviceId)) {
    repliesSoFar.put(terminated.deviceId, DeviceManager.DeviceNotAvailable.INSTANCE);
    stillWaiting.remove(terminated.deviceId);
  }
  return respondWhenAllCollected();
}

private Behavior<Command> onCollectionTimeout(CollectionTimeout timeout) {
  for (String deviceId : stillWaiting) {
    repliesSoFar.put(deviceId, DeviceManager.DeviceTimedOut.INSTANCE);
  }
  stillWaiting.clear();
  return respondWhenAllCollected();
}
```

For `RespondTemperature` and `DeviceTerminated` we keep track of the replies by updating `repliesSoFar` and remove the actor from `stillWaiting`. For this, we can use the actor’s identifier already present in the `DeviceTerminated` message. For our `RespondTemperature` message we will need to add this information as follows:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/Device.scala#L24 "Go to snippet source")final case class RespondTemperature(requestId: Long, deviceId: String, value: Option[Double])
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/Device.java#L51-L61 "Go to snippet source")public static final class RespondTemperature {
  final long requestId;
  final String deviceId;
  final Optional<Double> value;

  public RespondTemperature(long requestId, String deviceId, Optional<Double> value) {
    this.requestId = requestId;
    this.deviceId = deviceId;
    this.value = value;
  }
}
```

And:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/Device.scala#L49-L51 "Go to snippet source")case ReadTemperature(id, replyTo) =>
  replyTo ! RespondTemperature(id, deviceId, lastTemperatureReading)
  this
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/Device.java#L103-L106 "Go to snippet source")private Behavior<Command> onReadTemperature(ReadTemperature r) {
  r.replyTo.tell(new RespondTemperature(r.requestId, deviceId, lastTemperatureReading));
  return this;
}
```

After processing each message we delegate to a method `respondWhenAllCollected`, which we will discuss soon.

In the case of timeout, we need to take all the actors that have not yet replied (the members of the set `stillWaiting`) and put a `DeviceTimedOut` as the status in the final reply.

We now have to figure out what to do in `respondWhenAllCollected`. First, we need to record the new result in the map `repliesSoFar` and remove the actor from `stillWaiting`. The next step is to check if there are any remaining actors we are waiting for. If there is none, we send the result of the query to the original requester and stop the query actor. Otherwise, we need to update the `repliesSoFar` and `stillWaiting` structures and wait for more messages.

With all this knowledge, we can create the `respondWhenAllCollected` method:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupQuery.scala#L114-L121 "Go to snippet source")private def respondWhenAllCollected(): Behavior[Command] = {
  if (stillWaiting.isEmpty) {
    requester ! RespondAllTemperatures(requestId, repliesSoFar)
    Behaviors.stopped
  } else {
    this
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupQuery.java#L135-L142 "Go to snippet source")private Behavior<Command> respondWhenAllCollected() {
  if (stillWaiting.isEmpty()) {
    requester.tell(new DeviceManager.RespondAllTemperatures(requestId, repliesSoFar));
    return Behaviors.stopped();
  } else {
    return this;
  }
}
```

Our query actor is now done:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupQuery.scala#L18-L124 "Go to snippet source")object DeviceGroupQuery {

  def apply(
      deviceIdToActor: Map[String, ActorRef[Device.Command]],
      requestId: Long,
      requester: ActorRef[DeviceManager.RespondAllTemperatures],
      timeout: FiniteDuration): Behavior[Command] = {
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        new DeviceGroupQuery(deviceIdToActor, requestId, requester, timeout, context, timers)
      }
    }
  }

  trait Command

  private case object CollectionTimeout extends Command

  final case class WrappedRespondTemperature(response: Device.RespondTemperature) extends Command

  private final case class DeviceTerminated(deviceId: String) extends Command
}

class DeviceGroupQuery(
    deviceIdToActor: Map[String, ActorRef[Device.Command]],
    requestId: Long,
    requester: ActorRef[DeviceManager.RespondAllTemperatures],
    timeout: FiniteDuration,
    context: ActorContext[DeviceGroupQuery.Command],
    timers: TimerScheduler[DeviceGroupQuery.Command])
    extends AbstractBehavior[DeviceGroupQuery.Command](context) {

  import DeviceGroupQuery._
  import DeviceManager.DeviceNotAvailable
  import DeviceManager.DeviceTimedOut
  import DeviceManager.RespondAllTemperatures
  import DeviceManager.Temperature
  import DeviceManager.TemperatureNotAvailable
  import DeviceManager.TemperatureReading

  timers.startSingleTimer(CollectionTimeout, CollectionTimeout, timeout)

  private val respondTemperatureAdapter = context.messageAdapter(WrappedRespondTemperature.apply)

  private var repliesSoFar = Map.empty[String, TemperatureReading]
  private var stillWaiting = deviceIdToActor.keySet

  deviceIdToActor.foreach {
    case (deviceId, device) =>
      context.watchWith(device, DeviceTerminated(deviceId))
      device ! Device.ReadTemperature(0, respondTemperatureAdapter)
  }

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case WrappedRespondTemperature(response) => onRespondTemperature(response)
      case DeviceTerminated(deviceId)          => onDeviceTerminated(deviceId)
      case CollectionTimeout                   => onCollectionTimout()
    }

  private def onRespondTemperature(response: Device.RespondTemperature): Behavior[Command] = {
    val reading = response.value match {
      case Some(value) => Temperature(value)
      case None        => TemperatureNotAvailable
    }

    val deviceId = response.deviceId
    repliesSoFar += (deviceId -> reading)
    stillWaiting -= deviceId

    respondWhenAllCollected()
  }

  private def onDeviceTerminated(deviceId: String): Behavior[Command] = {
    if (stillWaiting(deviceId)) {
      repliesSoFar += (deviceId -> DeviceNotAvailable)
      stillWaiting -= deviceId
    }
    respondWhenAllCollected()
  }

  private def onCollectionTimout(): Behavior[Command] = {
    repliesSoFar ++= stillWaiting.map(deviceId => deviceId -> DeviceTimedOut)
    stillWaiting = Set.empty
    respondWhenAllCollected()
  }

  private def respondWhenAllCollected(): Behavior[Command] = {
    if (stillWaiting.isEmpty) {
      requester ! RespondAllTemperatures(requestId, repliesSoFar)
      Behaviors.stopped
    } else {
      this
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupQuery.java#L22-L146 "Go to snippet source")public class DeviceGroupQuery extends AbstractBehavior<DeviceGroupQuery.Command> {

  public interface Command {}

  private static enum CollectionTimeout implements Command {
    INSTANCE
  }

  static class WrappedRespondTemperature implements Command {
    final Device.RespondTemperature response;

    WrappedRespondTemperature(Device.RespondTemperature response) {
      this.response = response;
    }
  }

  private static class DeviceTerminated implements Command {
    final String deviceId;

    private DeviceTerminated(String deviceId) {
      this.deviceId = deviceId;
    }
  }

  public static Behavior<Command> create(
      Map<String, ActorRef<Device.Command>> deviceIdToActor,
      long requestId,
      ActorRef<DeviceManager.RespondAllTemperatures> requester,
      Duration timeout) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(
                timers ->
                    new DeviceGroupQuery(
                        deviceIdToActor, requestId, requester, timeout, context, timers)));
  }

  private final long requestId;
  private final ActorRef<DeviceManager.RespondAllTemperatures> requester;
  private Map<String, DeviceManager.TemperatureReading> repliesSoFar = new HashMap<>();
  private final Set<String> stillWaiting;

  private DeviceGroupQuery(
      Map<String, ActorRef<Device.Command>> deviceIdToActor,
      long requestId,
      ActorRef<DeviceManager.RespondAllTemperatures> requester,
      Duration timeout,
      ActorContext<Command> context,
      TimerScheduler<Command> timers) {
    super(context);
    this.requestId = requestId;
    this.requester = requester;

    timers.startSingleTimer(CollectionTimeout.INSTANCE, timeout);

    ActorRef<Device.RespondTemperature> respondTemperatureAdapter =
        context.messageAdapter(Device.RespondTemperature.class, WrappedRespondTemperature::new);

    for (Map.Entry<String, ActorRef<Device.Command>> entry : deviceIdToActor.entrySet()) {
      context.watchWith(entry.getValue(), new DeviceTerminated(entry.getKey()));
      entry.getValue().tell(new Device.ReadTemperature(0L, respondTemperatureAdapter));
    }
    stillWaiting = new HashSet<>(deviceIdToActor.keySet());
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(WrappedRespondTemperature.class, this::onRespondTemperature)
        .onMessage(DeviceTerminated.class, this::onDeviceTerminated)
        .onMessage(CollectionTimeout.class, this::onCollectionTimeout)
        .build();
  }

  private Behavior<Command> onRespondTemperature(WrappedRespondTemperature r) {
    DeviceManager.TemperatureReading reading =
        r.response
            .value
            .map(v -> (DeviceManager.TemperatureReading) new DeviceManager.Temperature(v))
            .orElse(DeviceManager.TemperatureNotAvailable.INSTANCE);

    String deviceId = r.response.deviceId;
    repliesSoFar.put(deviceId, reading);
    stillWaiting.remove(deviceId);

    return respondWhenAllCollected();
  }

  private Behavior<Command> onDeviceTerminated(DeviceTerminated terminated) {
    if (stillWaiting.contains(terminated.deviceId)) {
      repliesSoFar.put(terminated.deviceId, DeviceManager.DeviceNotAvailable.INSTANCE);
      stillWaiting.remove(terminated.deviceId);
    }
    return respondWhenAllCollected();
  }

  private Behavior<Command> onCollectionTimeout(CollectionTimeout timeout) {
    for (String deviceId : stillWaiting) {
      repliesSoFar.put(deviceId, DeviceManager.DeviceTimedOut.INSTANCE);
    }
    stillWaiting.clear();
    return respondWhenAllCollected();
  }

  private Behavior<Command> respondWhenAllCollected() {
    if (stillWaiting.isEmpty()) {
      requester.tell(new DeviceManager.RespondAllTemperatures(requestId, repliesSoFar));
      return Behaviors.stopped();
    } else {
      return this;
    }
  }

}
```

### Testing the query actor

Now let’s verify the correctness of the query actor implementation. There are various scenarios we need to test individually to make sure everything works as expected. To be able to do this, we need to simulate the device actors somehow to exercise various normal or failure scenarios. Thankfully we took the list of collaborators (actually a `Map`) as a parameter to the query actor, so we can pass in [`TestProbe`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestProbe.html "akka.actor.testkit.typed.javadsl.TestProbe")[`TestProbe`](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/TestProbe.html "akka.actor.testkit.typed.scaladsl.TestProbe") references. In our first test, we try out the case when there are two devices and both report a temperature:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupQuerySpec.scala#L23-L44 "Go to snippet source")"return temperature value for working devices" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 3.seconds))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", Some(1.0)))
  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device2", Some(2.0)))

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> Temperature(1.0), "device2" -> Temperature(2.0))))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupQueryTest.java#L31-L66 "Go to snippet source")@Test
public void testReturnTemperatureValueForWorkingDevices() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofSeconds(3)));

  device1.expectMessageClass(Device.ReadTemperature.class);
  device2.expectMessageClass(Device.ReadTemperature.class);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.of(1.0))));

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device2", Optional.of(2.0))));

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", new Temperature(2.0));

  assertEquals(expectedTemperatures, response.temperatures);
}
```

That was the happy case, but we know that sometimes devices cannot provide a temperature measurement. This scenario is just slightly different from the previous:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupQuerySpec.scala#L48-L69 "Go to snippet source")"return TemperatureNotAvailable for devices with no readings" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 3.seconds))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", None))
  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device2", Some(2.0)))

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> TemperatureNotAvailable, "device2" -> Temperature(2.0))))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupQueryTest.java#L70-L105 "Go to snippet source")@Test
public void testReturnTemperatureNotAvailableForDevicesWithNoReadings() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofSeconds(3)));

  assertEquals(0L, device1.expectMessageClass(Device.ReadTemperature.class).requestId);
  assertEquals(0L, device2.expectMessageClass(Device.ReadTemperature.class).requestId);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.empty())));

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device2", Optional.of(2.0))));

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", TemperatureNotAvailable.INSTANCE);
  expectedTemperatures.put("device2", new Temperature(2.0));

  assertEquals(expectedTemperatures, response.temperatures);
}
```

We also know, that sometimes device actors stop before answering:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupQuerySpec.scala#L73-L95 "Go to snippet source")"return DeviceNotAvailable if device stops before answering" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 3.seconds))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", Some(2.0)))

  device2.stop()

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> Temperature(2.0), "device2" -> DeviceNotAvailable)))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupQueryTest.java#L109-L142 "Go to snippet source")@Test
public void testReturnDeviceNotAvailableIfDeviceStopsBeforeAnswering() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofSeconds(3)));

  assertEquals(0L, device1.expectMessageClass(Device.ReadTemperature.class).requestId);
  assertEquals(0L, device2.expectMessageClass(Device.ReadTemperature.class).requestId);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.of(1.0))));

  device2.stop();

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", DeviceNotAvailable.INSTANCE);

  assertEquals(expectedTemperatures, response.temperatures);
}
```

If you remember, there is another case related to device actors stopping. It is possible that we get a normal reply from a device actor, but then receive a [`Terminated`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") for the same actor later. In this case, we would like to keep the first reply and not mark the device as `DeviceNotAvailable`. We should test this, too:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupQuerySpec.scala#L99-L122 "Go to snippet source")"return temperature reading even if device stops after answering" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 3.seconds))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", Some(1.0)))
  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device2", Some(2.0)))

  device2.stop()

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> Temperature(1.0), "device2" -> Temperature(2.0))))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupQueryTest.java#L146-L183 "Go to snippet source")@Test
public void testReturnTemperatureReadingEvenIfDeviceStopsAfterAnswering() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofSeconds(3)));

  assertEquals(0L, device1.expectMessageClass(Device.ReadTemperature.class).requestId);
  assertEquals(0L, device2.expectMessageClass(Device.ReadTemperature.class).requestId);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.of(1.0))));

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device2", Optional.of(2.0))));

  device2.stop();

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", new Temperature(2.0));

  assertEquals(expectedTemperatures, response.temperatures);
}
```

The final case is when not all devices respond in time. To keep our test relatively fast, we will construct the `DeviceGroupQuery` actor with a smaller timeout:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupQuerySpec.scala#L126-L148 "Go to snippet source")"return DeviceTimedOut if device does not answer in time" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 200.millis))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", Some(1.0)))

  // no reply from device2

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> Temperature(1.0), "device2" -> DeviceTimedOut)))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupQueryTest.java#L187-L220 "Go to snippet source")@Test
public void testReturnDeviceTimedOutIfDeviceDoesNotAnswerInTime() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofMillis(200)));

  assertEquals(0L, device1.expectMessageClass(Device.ReadTemperature.class).requestId);
  assertEquals(0L, device2.expectMessageClass(Device.ReadTemperature.class).requestId);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.of(1.0))));

  // no reply from device2

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", DeviceTimedOut.INSTANCE);

  assertEquals(expectedTemperatures, response.temperatures);
}
```

Our query works as expected now, it is time to include this new functionality in the `DeviceGroup` actor now.

## Adding query capability to the group

Including the query feature in the group actor is fairly simple now. We did all the heavy lifting in the query actor itself, the group actor only needs to create it with the right initial parameters and nothing else.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroup.scala#L28-L95 "Go to snippet source")class DeviceGroup(context: ActorContext[DeviceGroup.Command], groupId: String)
    extends AbstractBehavior[DeviceGroup.Command](context) {
  import DeviceGroup._
  import DeviceManager.{
    DeviceRegistered,
    ReplyDeviceList,
    RequestAllTemperatures,
    RequestDeviceList,
    RequestTrackDevice
  }

  private var deviceIdToActor = Map.empty[String, ActorRef[Device.Command]]

  context.log.info("DeviceGroup {} started", groupId)

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      // ... other cases omitted

      case RequestAllTemperatures(requestId, gId, replyTo) =>
        if (gId == groupId) {
          context.spawnAnonymous(
            DeviceGroupQuery(deviceIdToActor, requestId = requestId, requester = replyTo, 3.seconds))
          this
        } else
          Behaviors.unhandled
    }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("DeviceGroup {} stopped", groupId)
      this
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroup.java#L19-L130 "Go to snippet source")public class DeviceGroup extends AbstractBehavior<DeviceGroup.Command> {

  public interface Command {}

  private class DeviceTerminated implements Command {
    public final ActorRef<Device.Command> device;
    public final String groupId;
    public final String deviceId;

    DeviceTerminated(ActorRef<Device.Command> device, String groupId, String deviceId) {
      this.device = device;
      this.groupId = groupId;
      this.deviceId = deviceId;
    }
  }

  public static Behavior<Command> create(String groupId) {
    return Behaviors.setup(context -> new DeviceGroup(context, groupId));
  }

  private final String groupId;
  private final Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();

  private DeviceGroup(ActorContext<Command> context, String groupId) {
    super(context);
    this.groupId = groupId;
    context.getLog().info("DeviceGroup {} started", groupId);
  }

  private DeviceGroup onAllTemperatures(DeviceManager.RequestAllTemperatures r) {
    // since Java collections are mutable, we want to avoid sharing them between actors (since
    // multiple Actors (threads)
    // modifying the same mutable data-structure is not safe), and perform a defensive copy of the
    // mutable map:
    //
    // Feel free to use your favourite immutable data-structures library with Akka in Java
    // applications!
    Map<String, ActorRef<Device.Command>> deviceIdToActorCopy = new HashMap<>(this.deviceIdToActor);

    getContext()
        .spawnAnonymous(
            DeviceGroupQuery.create(
                deviceIdToActorCopy, r.requestId, r.replyTo, Duration.ofSeconds(3)));

    return this;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        // ... other cases omitted
        .onMessage(
            DeviceManager.RequestAllTemperatures.class,
            r -> r.groupId.equals(groupId),
            this::onAllTemperatures)
        .build();
  }
}
```

It is probably worth restating what we said at the beginning of the chapter. By keeping the temporary state that is only relevant to the query itself in a separate actor we keep the group actor implementation very simple. It delegates everything to child actors and therefore does not have to keep state that is not relevant to its core business. Also, multiple queries can now run parallel to each other, in fact, as many as needed. In our case querying an individual device actor is a fast operation, but if this were not the case, for example, because the remote sensors need to be contacted over the network, this design would significantly improve throughput.

We close this chapter by testing that everything works together. This test is a variant of the previous ones, now exercising the group query feature:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_5/DeviceGroupSpec.scala#L109-L137 "Go to snippet source")"be able to collect temperatures from all active devices" in {
  val registeredProbe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", registeredProbe.ref)
  val deviceActor1 = registeredProbe.receiveMessage().device

  groupActor ! RequestTrackDevice("group", "device2", registeredProbe.ref)
  val deviceActor2 = registeredProbe.receiveMessage().device

  groupActor ! RequestTrackDevice("group", "device3", registeredProbe.ref)
  registeredProbe.receiveMessage()

  // Check that the device actors are working
  val recordProbe = createTestProbe[TemperatureRecorded]()
  deviceActor1 ! RecordTemperature(requestId = 0, 1.0, recordProbe.ref)
  recordProbe.expectMessage(TemperatureRecorded(requestId = 0))
  deviceActor2 ! RecordTemperature(requestId = 1, 2.0, recordProbe.ref)
  recordProbe.expectMessage(TemperatureRecorded(requestId = 1))
  // No temperature for device3

  val allTempProbe = createTestProbe[RespondAllTemperatures]()
  groupActor ! RequestAllTemperatures(requestId = 0, groupId = "group", allTempProbe.ref)
  allTempProbe.expectMessage(
    RespondAllTemperatures(
      requestId = 0,
      temperatures =
        Map("device1" -> Temperature(1.0), "device2" -> Temperature(2.0), "device3" -> TemperatureNotAvailable)))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_5/DeviceGroupTest.java#L133-L168 "Go to snippet source")@Test
public void testCollectTemperaturesFromAllActiveDevices() {
  TestProbe<DeviceRegistered> registeredProbe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device1", registeredProbe.getRef()));
  ActorRef<Device.Command> deviceActor1 = registeredProbe.receiveMessage().device;

  groupActor.tell(new RequestTrackDevice("group", "device2", registeredProbe.getRef()));
  ActorRef<Device.Command> deviceActor2 = registeredProbe.receiveMessage().device;

  groupActor.tell(new RequestTrackDevice("group", "device3", registeredProbe.getRef()));
  ActorRef<Device.Command> deviceActor3 = registeredProbe.receiveMessage().device;

  // Check that the device actors are working
  TestProbe<Device.TemperatureRecorded> recordProbe =
      testKit.createTestProbe(Device.TemperatureRecorded.class);
  deviceActor1.tell(new Device.RecordTemperature(0L, 1.0, recordProbe.getRef()));
  assertEquals(0L, recordProbe.receiveMessage().requestId);
  deviceActor2.tell(new Device.RecordTemperature(1L, 2.0, recordProbe.getRef()));
  assertEquals(1L, recordProbe.receiveMessage().requestId);
  // No temperature for device 3

  TestProbe<RespondAllTemperatures> allTempProbe =
      testKit.createTestProbe(RespondAllTemperatures.class);
  groupActor.tell(new RequestAllTemperatures(0L, "group", allTempProbe.getRef()));
  RespondAllTemperatures response = allTempProbe.receiveMessage();
  assertEquals(0L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", new Temperature(2.0));
  expectedTemperatures.put("device3", TemperatureNotAvailable.INSTANCE);

  assertEquals(expectedTemperatures, response.temperatures);
}
```

## Summary

In the context of the IoT system, this guide introduced the following concepts, among others. You can follow the links to review them if necessary:

- [The hierarchy of actors and their lifecycle](tutorial_1.html)
- [The importance of designing messages for flexibility](tutorial_3.html)
- [How to watch and stop actors, if necessary](tutorial_4.html#keeping-track-of-the-device-actors-in-the-group)

## What’s Next?

To continue your journey with Akka, we recommend:

- Start building your own applications with Akka, make sure you [get involved in our amazing community](https://akka.io/get-involved/) for help if you get stuck.
- If you’d like some additional background, and detail, read the rest of the [reference documentation](../actors.html), check out some [books and videos](../../additional/books.html), or even explore the free online courses [**Akka Basics for Java**](https://akkademy.akka.io/learn/courses/23/akka-basics-for-java)[**Akka Basics for Scala**](https://akkademy.akka.io/learn/courses/22/akka-basics-for-scala).
- If you are interested in functional programming, read how actors can be defined in a [functional style](../actors.html#functional-style). In this guide the object\-oriented style was used, but you can mix both as you like.

To get from this guide to a complete application you would likely need to provide either an UI or an API. For this we recommend that you look at the following technologies and see what fits you:

- [Microservices with Akka tutorial](https://doc.akka.io/libraries/guide/microservices-tutorial/) illustrates how to implement an Event Sourced CQRS application with Akka Persistence and Akka Projections
- [Akka HTTP](https://doc.akka.io/libraries/akka-http/current/introduction.html) is a HTTP server and client library, making it possible to publish and consume HTTP endpoints
- [Akka gRPC](https://doc.akka.io/libraries/akka-grpc/current/) supports fully typed, streaming gRPC servers and clients.

## Code Examples

### Example 1: Dealing with possible scenarios

```scala
final case class RequestAllTemperatures(requestId: Long, groupId: String, replyTo: ActorRef[RespondAllTemperatures])
    extends DeviceGroupQuery.Command
    with DeviceGroup.Command
    with DeviceManager.Command

final case class RespondAllTemperatures(requestId: Long, temperatures: Map[String, TemperatureReading])

sealed trait TemperatureReading
final case class Temperature(value: Double) extends TemperatureReading
case object TemperatureNotAvailable extends TemperatureReading
case object DeviceNotAvailable extends TemperatureReading
case object DeviceTimedOut extends TemperatureReading
```

### Example 2: Dealing with possible scenarios

```java
public static final class RequestAllTemperatures
    implements DeviceGroupQuery.Command, DeviceGroup.Command, Command {

  final long requestId;
  final String groupId;
  final ActorRef<RespondAllTemperatures> replyTo;

  public RequestAllTemperatures(
      long requestId, String groupId, ActorRef<RespondAllTemperatures> replyTo) {
    this.requestId = requestId;
    this.groupId = groupId;
    this.replyTo = replyTo;
  }
}

public static final class RespondAllTemperatures {
  final long requestId;
  final Map<String, TemperatureReading> temperatures;

  public RespondAllTemperatures(long requestId, Map<String, TemperatureReading> temperatures) {
    this.requestId = requestId;
    this.temperatures = temperatures;
  }
}

public interface TemperatureReading {}

public static final class Temperature implements TemperatureReading {
  public final double value;

  public Temperature(double value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Temperature that = (Temperature) o;

    return Double.compare(that.value, value) == 0;
  }

  @Override
  public int hashCode() {
    long temp = Double.doubleToLongBits(value);
    return (int) (temp ^ (temp >>> 32));
  }

  @Override
  public String toString() {
    return "Temperature{" + "value=" + value + '}';
  }
}

public enum TemperatureNotAvailable implements TemperatureReading {
  INSTANCE
}

public enum DeviceNotAvailable implements TemperatureReading {
  INSTANCE
}

public enum DeviceTimedOut implements TemperatureReading {
  INSTANCE
}
```

### Example 3: Scheduling the query timeout

```scala
object DeviceGroupQuery {

  def apply(
      deviceIdToActor: Map[String, ActorRef[Device.Command]],
      requestId: Long,
      requester: ActorRef[DeviceManager.RespondAllTemperatures],
      timeout: FiniteDuration): Behavior[Command] = {
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        new DeviceGroupQuery(deviceIdToActor, requestId, requester, timeout, context, timers)
      }
    }
  }

  trait Command

  private case object CollectionTimeout extends Command

  final case class WrappedRespondTemperature(response: Device.RespondTemperature) extends Command

  private final case class DeviceTerminated(deviceId: String) extends Command
}

class DeviceGroupQuery(
    deviceIdToActor: Map[String, ActorRef[Device.Command]],
    requestId: Long,
    requester: ActorRef[DeviceManager.RespondAllTemperatures],
    timeout: FiniteDuration,
    context: ActorContext[DeviceGroupQuery.Command],
    timers: TimerScheduler[DeviceGroupQuery.Command])
    extends AbstractBehavior[DeviceGroupQuery.Command](context) {

  import DeviceGroupQuery._
  import DeviceManager.DeviceNotAvailable
  import DeviceManager.DeviceTimedOut
  import DeviceManager.RespondAllTemperatures
  import DeviceManager.Temperature
  import DeviceManager.TemperatureNotAvailable
  import DeviceManager.TemperatureReading

  timers.startSingleTimer(CollectionTimeout, CollectionTimeout, timeout)

  private val respondTemperatureAdapter = context.messageAdapter(WrappedRespondTemperature.apply)


  deviceIdToActor.foreach {
    case (deviceId, device) =>
      context.watchWith(device, DeviceTerminated(deviceId))
      device ! Device.ReadTemperature(0, respondTemperatureAdapter)
  }

}
```

### Example 4: Scheduling the query timeout

```java
public class DeviceGroupQuery extends AbstractBehavior<DeviceGroupQuery.Command> {

  public interface Command {}

  private static enum CollectionTimeout implements Command {
    INSTANCE
  }

  static class WrappedRespondTemperature implements Command {
    final Device.RespondTemperature response;

    WrappedRespondTemperature(Device.RespondTemperature response) {
      this.response = response;
    }
  }

  private static class DeviceTerminated implements Command {
    final String deviceId;

    private DeviceTerminated(String deviceId) {
      this.deviceId = deviceId;
    }
  }

  public static Behavior<Command> create(
      Map<String, ActorRef<Device.Command>> deviceIdToActor,
      long requestId,
      ActorRef<DeviceManager.RespondAllTemperatures> requester,
      Duration timeout) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(
                timers ->
                    new DeviceGroupQuery(
                        deviceIdToActor, requestId, requester, timeout, context, timers)));
  }

  private final long requestId;
  private final ActorRef<DeviceManager.RespondAllTemperatures> requester;

  private DeviceGroupQuery(
      Map<String, ActorRef<Device.Command>> deviceIdToActor,
      long requestId,
      ActorRef<DeviceManager.RespondAllTemperatures> requester,
      Duration timeout,
      ActorContext<Command> context,
      TimerScheduler<Command> timers) {
    super(context);
    this.requestId = requestId;
    this.requester = requester;

    timers.startSingleTimer(CollectionTimeout.INSTANCE, timeout);

    ActorRef<Device.RespondTemperature> respondTemperatureAdapter =
        context.messageAdapter(Device.RespondTemperature.class, WrappedRespondTemperature::new);

    for (Map.Entry<String, ActorRef<Device.Command>> entry : deviceIdToActor.entrySet()) {
      context.watchWith(entry.getValue(), new DeviceTerminated(entry.getKey()));
      entry.getValue().tell(new Device.ReadTemperature(0L, respondTemperatureAdapter));
    }
    stillWaiting = new HashSet<>(deviceIdToActor.keySet());
  }


}
```

### Example 5: Tracking actor state

```scala
private var repliesSoFar = Map.empty[String, TemperatureReading]
private var stillWaiting = deviceIdToActor.keySet

override def onMessage(msg: Command): Behavior[Command] =
  msg match {
    case WrappedRespondTemperature(response) => onRespondTemperature(response)
    case DeviceTerminated(deviceId)          => onDeviceTerminated(deviceId)
    case CollectionTimeout                   => onCollectionTimout()
  }

private def onRespondTemperature(response: Device.RespondTemperature): Behavior[Command] = {
  val reading = response.value match {
    case Some(value) => Temperature(value)
    case None        => TemperatureNotAvailable
  }

  val deviceId = response.deviceId
  repliesSoFar += (deviceId -> reading)
  stillWaiting -= deviceId

  respondWhenAllCollected()
}

private def onDeviceTerminated(deviceId: String): Behavior[Command] = {
  if (stillWaiting(deviceId)) {
    repliesSoFar += (deviceId -> DeviceNotAvailable)
    stillWaiting -= deviceId
  }
  respondWhenAllCollected()
}

private def onCollectionTimout(): Behavior[Command] = {
  repliesSoFar ++= stillWaiting.map(deviceId => deviceId -> DeviceTimedOut)
  stillWaiting = Set.empty
  respondWhenAllCollected()
}
```

### Example 6: Tracking actor state

```java
private Map<String, DeviceManager.TemperatureReading> repliesSoFar = new HashMap<>();
private final Set<String> stillWaiting;

@Override
public Receive<Command> createReceive() {
  return newReceiveBuilder()
      .onMessage(WrappedRespondTemperature.class, this::onRespondTemperature)
      .onMessage(DeviceTerminated.class, this::onDeviceTerminated)
      .onMessage(CollectionTimeout.class, this::onCollectionTimeout)
      .build();
}

private Behavior<Command> onRespondTemperature(WrappedRespondTemperature r) {
  DeviceManager.TemperatureReading reading =
      r.response
          .value
          .map(v -> (DeviceManager.TemperatureReading) new DeviceManager.Temperature(v))
          .orElse(DeviceManager.TemperatureNotAvailable.INSTANCE);

  String deviceId = r.response.deviceId;
  repliesSoFar.put(deviceId, reading);
  stillWaiting.remove(deviceId);

  return respondWhenAllCollected();
}

private Behavior<Command> onDeviceTerminated(DeviceTerminated terminated) {
  if (stillWaiting.contains(terminated.deviceId)) {
    repliesSoFar.put(terminated.deviceId, DeviceManager.DeviceNotAvailable.INSTANCE);
    stillWaiting.remove(terminated.deviceId);
  }
  return respondWhenAllCollected();
}

private Behavior<Command> onCollectionTimeout(CollectionTimeout timeout) {
  for (String deviceId : stillWaiting) {
    repliesSoFar.put(deviceId, DeviceManager.DeviceTimedOut.INSTANCE);
  }
  stillWaiting.clear();
  return respondWhenAllCollected();
}
```

### Example 7: Tracking actor state

```scala
final case class RespondTemperature(requestId: Long, deviceId: String, value: Option[Double])
```

### Example 8: Tracking actor state

```java
public static final class RespondTemperature {
  final long requestId;
  final String deviceId;
  final Optional<Double> value;

  public RespondTemperature(long requestId, String deviceId, Optional<Double> value) {
    this.requestId = requestId;
    this.deviceId = deviceId;
    this.value = value;
  }
}
```

### Example 9: Tracking actor state

```scala
case ReadTemperature(id, replyTo) =>
  replyTo ! RespondTemperature(id, deviceId, lastTemperatureReading)
  this
```

### Example 10: Tracking actor state

```java
private Behavior<Command> onReadTemperature(ReadTemperature r) {
  r.replyTo.tell(new RespondTemperature(r.requestId, deviceId, lastTemperatureReading));
  return this;
}
```

### Example 11: Tracking actor state

```scala
private def respondWhenAllCollected(): Behavior[Command] = {
  if (stillWaiting.isEmpty) {
    requester ! RespondAllTemperatures(requestId, repliesSoFar)
    Behaviors.stopped
  } else {
    this
  }
}
```

### Example 12: Tracking actor state

```java
private Behavior<Command> respondWhenAllCollected() {
  if (stillWaiting.isEmpty()) {
    requester.tell(new DeviceManager.RespondAllTemperatures(requestId, repliesSoFar));
    return Behaviors.stopped();
  } else {
    return this;
  }
}
```

### Example 13: Tracking actor state

```scala
object DeviceGroupQuery {

  def apply(
      deviceIdToActor: Map[String, ActorRef[Device.Command]],
      requestId: Long,
      requester: ActorRef[DeviceManager.RespondAllTemperatures],
      timeout: FiniteDuration): Behavior[Command] = {
    Behaviors.setup { context =>
      Behaviors.withTimers { timers =>
        new DeviceGroupQuery(deviceIdToActor, requestId, requester, timeout, context, timers)
      }
    }
  }

  trait Command

  private case object CollectionTimeout extends Command

  final case class WrappedRespondTemperature(response: Device.RespondTemperature) extends Command

  private final case class DeviceTerminated(deviceId: String) extends Command
}

class DeviceGroupQuery(
    deviceIdToActor: Map[String, ActorRef[Device.Command]],
    requestId: Long,
    requester: ActorRef[DeviceManager.RespondAllTemperatures],
    timeout: FiniteDuration,
    context: ActorContext[DeviceGroupQuery.Command],
    timers: TimerScheduler[DeviceGroupQuery.Command])
    extends AbstractBehavior[DeviceGroupQuery.Command](context) {

  import DeviceGroupQuery._
  import DeviceManager.DeviceNotAvailable
  import DeviceManager.DeviceTimedOut
  import DeviceManager.RespondAllTemperatures
  import DeviceManager.Temperature
  import DeviceManager.TemperatureNotAvailable
  import DeviceManager.TemperatureReading

  timers.startSingleTimer(CollectionTimeout, CollectionTimeout, timeout)

  private val respondTemperatureAdapter = context.messageAdapter(WrappedRespondTemperature.apply)

  private var repliesSoFar = Map.empty[String, TemperatureReading]
  private var stillWaiting = deviceIdToActor.keySet


  deviceIdToActor.foreach {
    case (deviceId, device) =>
      context.watchWith(device, DeviceTerminated(deviceId))
      device ! Device.ReadTemperature(0, respondTemperatureAdapter)
  }

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case WrappedRespondTemperature(response) => onRespondTemperature(response)
      case DeviceTerminated(deviceId)          => onDeviceTerminated(deviceId)
      case CollectionTimeout                   => onCollectionTimout()
    }

  private def onRespondTemperature(response: Device.RespondTemperature): Behavior[Command] = {
    val reading = response.value match {
      case Some(value) => Temperature(value)
      case None        => TemperatureNotAvailable
    }

    val deviceId = response.deviceId
    repliesSoFar += (deviceId -> reading)
    stillWaiting -= deviceId

    respondWhenAllCollected()
  }

  private def onDeviceTerminated(deviceId: String): Behavior[Command] = {
    if (stillWaiting(deviceId)) {
      repliesSoFar += (deviceId -> DeviceNotAvailable)
      stillWaiting -= deviceId
    }
    respondWhenAllCollected()
  }

  private def onCollectionTimout(): Behavior[Command] = {
    repliesSoFar ++= stillWaiting.map(deviceId => deviceId -> DeviceTimedOut)
    stillWaiting = Set.empty
    respondWhenAllCollected()
  }

  private def respondWhenAllCollected(): Behavior[Command] = {
    if (stillWaiting.isEmpty) {
      requester ! RespondAllTemperatures(requestId, repliesSoFar)
      Behaviors.stopped
    } else {
      this
    }
  }
}
```

### Example 14: Tracking actor state

```java
public class DeviceGroupQuery extends AbstractBehavior<DeviceGroupQuery.Command> {

  public interface Command {}

  private static enum CollectionTimeout implements Command {
    INSTANCE
  }

  static class WrappedRespondTemperature implements Command {
    final Device.RespondTemperature response;

    WrappedRespondTemperature(Device.RespondTemperature response) {
      this.response = response;
    }
  }

  private static class DeviceTerminated implements Command {
    final String deviceId;

    private DeviceTerminated(String deviceId) {
      this.deviceId = deviceId;
    }
  }

  public static Behavior<Command> create(
      Map<String, ActorRef<Device.Command>> deviceIdToActor,
      long requestId,
      ActorRef<DeviceManager.RespondAllTemperatures> requester,
      Duration timeout) {
    return Behaviors.setup(
        context ->
            Behaviors.withTimers(
                timers ->
                    new DeviceGroupQuery(
                        deviceIdToActor, requestId, requester, timeout, context, timers)));
  }

  private final long requestId;
  private final ActorRef<DeviceManager.RespondAllTemperatures> requester;
  private Map<String, DeviceManager.TemperatureReading> repliesSoFar = new HashMap<>();
  private final Set<String> stillWaiting;


  private DeviceGroupQuery(
      Map<String, ActorRef<Device.Command>> deviceIdToActor,
      long requestId,
      ActorRef<DeviceManager.RespondAllTemperatures> requester,
      Duration timeout,
      ActorContext<Command> context,
      TimerScheduler<Command> timers) {
    super(context);
    this.requestId = requestId;
    this.requester = requester;

    timers.startSingleTimer(CollectionTimeout.INSTANCE, timeout);

    ActorRef<Device.RespondTemperature> respondTemperatureAdapter =
        context.messageAdapter(Device.RespondTemperature.class, WrappedRespondTemperature::new);

    for (Map.Entry<String, ActorRef<Device.Command>> entry : deviceIdToActor.entrySet()) {
      context.watchWith(entry.getValue(), new DeviceTerminated(entry.getKey()));
      entry.getValue().tell(new Device.ReadTemperature(0L, respondTemperatureAdapter));
    }
    stillWaiting = new HashSet<>(deviceIdToActor.keySet());
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(WrappedRespondTemperature.class, this::onRespondTemperature)
        .onMessage(DeviceTerminated.class, this::onDeviceTerminated)
        .onMessage(CollectionTimeout.class, this::onCollectionTimeout)
        .build();
  }

  private Behavior<Command> onRespondTemperature(WrappedRespondTemperature r) {
    DeviceManager.TemperatureReading reading =
        r.response
            .value
            .map(v -> (DeviceManager.TemperatureReading) new DeviceManager.Temperature(v))
            .orElse(DeviceManager.TemperatureNotAvailable.INSTANCE);

    String deviceId = r.response.deviceId;
    repliesSoFar.put(deviceId, reading);
    stillWaiting.remove(deviceId);

    return respondWhenAllCollected();
  }

  private Behavior<Command> onDeviceTerminated(DeviceTerminated terminated) {
    if (stillWaiting.contains(terminated.deviceId)) {
      repliesSoFar.put(terminated.deviceId, DeviceManager.DeviceNotAvailable.INSTANCE);
      stillWaiting.remove(terminated.deviceId);
    }
    return respondWhenAllCollected();
  }

  private Behavior<Command> onCollectionTimeout(CollectionTimeout timeout) {
    for (String deviceId : stillWaiting) {
      repliesSoFar.put(deviceId, DeviceManager.DeviceTimedOut.INSTANCE);
    }
    stillWaiting.clear();
    return respondWhenAllCollected();
  }

  private Behavior<Command> respondWhenAllCollected() {
    if (stillWaiting.isEmpty()) {
      requester.tell(new DeviceManager.RespondAllTemperatures(requestId, repliesSoFar));
      return Behaviors.stopped();
    } else {
      return this;
    }
  }

}
```

### Example 15: Testing the query actor

```scala
"return temperature value for working devices" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 3.seconds))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", Some(1.0)))
  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device2", Some(2.0)))

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> Temperature(1.0), "device2" -> Temperature(2.0))))
}
```

### Example 16: Testing the query actor

```java
@Test
public void testReturnTemperatureValueForWorkingDevices() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofSeconds(3)));

  device1.expectMessageClass(Device.ReadTemperature.class);
  device2.expectMessageClass(Device.ReadTemperature.class);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.of(1.0))));

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device2", Optional.of(2.0))));

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", new Temperature(2.0));

  assertEquals(expectedTemperatures, response.temperatures);
}
```

### Example 17: Testing the query actor

```scala
"return TemperatureNotAvailable for devices with no readings" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 3.seconds))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", None))
  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device2", Some(2.0)))

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> TemperatureNotAvailable, "device2" -> Temperature(2.0))))
}
```

### Example 18: Testing the query actor

```java
@Test
public void testReturnTemperatureNotAvailableForDevicesWithNoReadings() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofSeconds(3)));

  assertEquals(0L, device1.expectMessageClass(Device.ReadTemperature.class).requestId);
  assertEquals(0L, device2.expectMessageClass(Device.ReadTemperature.class).requestId);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.empty())));

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device2", Optional.of(2.0))));

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", TemperatureNotAvailable.INSTANCE);
  expectedTemperatures.put("device2", new Temperature(2.0));

  assertEquals(expectedTemperatures, response.temperatures);
}
```

### Example 19: Testing the query actor

```scala
"return DeviceNotAvailable if device stops before answering" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 3.seconds))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", Some(2.0)))

  device2.stop()

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> Temperature(2.0), "device2" -> DeviceNotAvailable)))
}
```

### Example 20: Testing the query actor

```java
@Test
public void testReturnDeviceNotAvailableIfDeviceStopsBeforeAnswering() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofSeconds(3)));

  assertEquals(0L, device1.expectMessageClass(Device.ReadTemperature.class).requestId);
  assertEquals(0L, device2.expectMessageClass(Device.ReadTemperature.class).requestId);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.of(1.0))));

  device2.stop();

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", DeviceNotAvailable.INSTANCE);

  assertEquals(expectedTemperatures, response.temperatures);
}
```

### Example 21: Testing the query actor

```scala
"return temperature reading even if device stops after answering" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 3.seconds))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", Some(1.0)))
  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device2", Some(2.0)))

  device2.stop()

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> Temperature(1.0), "device2" -> Temperature(2.0))))
}
```

### Example 22: Testing the query actor

```java
@Test
public void testReturnTemperatureReadingEvenIfDeviceStopsAfterAnswering() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofSeconds(3)));

  assertEquals(0L, device1.expectMessageClass(Device.ReadTemperature.class).requestId);
  assertEquals(0L, device2.expectMessageClass(Device.ReadTemperature.class).requestId);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.of(1.0))));

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device2", Optional.of(2.0))));

  device2.stop();

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", new Temperature(2.0));

  assertEquals(expectedTemperatures, response.temperatures);
}
```

### Example 23: Testing the query actor

```scala
"return DeviceTimedOut if device does not answer in time" in {
  val requester = createTestProbe[RespondAllTemperatures]()

  val device1 = createTestProbe[Command]()
  val device2 = createTestProbe[Command]()

  val deviceIdToActor = Map("device1" -> device1.ref, "device2" -> device2.ref)

  val queryActor =
    spawn(DeviceGroupQuery(deviceIdToActor, requestId = 1, requester = requester.ref, timeout = 200.millis))

  device1.expectMessageType[Device.ReadTemperature]
  device2.expectMessageType[Device.ReadTemperature]

  queryActor ! WrappedRespondTemperature(Device.RespondTemperature(requestId = 0, "device1", Some(1.0)))

  // no reply from device2

  requester.expectMessage(
    RespondAllTemperatures(
      requestId = 1,
      temperatures = Map("device1" -> Temperature(1.0), "device2" -> DeviceTimedOut)))
}
```

### Example 24: Testing the query actor

```java
@Test
public void testReturnDeviceTimedOutIfDeviceDoesNotAnswerInTime() {
  TestProbe<RespondAllTemperatures> requester =
      testKit.createTestProbe(RespondAllTemperatures.class);
  TestProbe<Device.Command> device1 = testKit.createTestProbe(Device.Command.class);
  TestProbe<Device.Command> device2 = testKit.createTestProbe(Device.Command.class);

  Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();
  deviceIdToActor.put("device1", device1.getRef());
  deviceIdToActor.put("device2", device2.getRef());

  ActorRef<DeviceGroupQuery.Command> queryActor =
      testKit.spawn(
          DeviceGroupQuery.create(
              deviceIdToActor, 1L, requester.getRef(), Duration.ofMillis(200)));

  assertEquals(0L, device1.expectMessageClass(Device.ReadTemperature.class).requestId);
  assertEquals(0L, device2.expectMessageClass(Device.ReadTemperature.class).requestId);

  queryActor.tell(
      new DeviceGroupQuery.WrappedRespondTemperature(
          new Device.RespondTemperature(0L, "device1", Optional.of(1.0))));

  // no reply from device2

  RespondAllTemperatures response = requester.receiveMessage();
  assertEquals(1L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", DeviceTimedOut.INSTANCE);

  assertEquals(expectedTemperatures, response.temperatures);
}
```

### Example 25: Adding query capability to the group

```scala
class DeviceGroup(context: ActorContext[DeviceGroup.Command], groupId: String)
    extends AbstractBehavior[DeviceGroup.Command](context) {
  import DeviceGroup._
  import DeviceManager.{
    DeviceRegistered,
    ReplyDeviceList,
    RequestAllTemperatures,
    RequestDeviceList,
    RequestTrackDevice
  }

  private var deviceIdToActor = Map.empty[String, ActorRef[Device.Command]]

  context.log.info("DeviceGroup {} started", groupId)

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      // ... other cases omitted

      case RequestAllTemperatures(requestId, gId, replyTo) =>
        if (gId == groupId) {
          context.spawnAnonymous(
            DeviceGroupQuery(deviceIdToActor, requestId = requestId, requester = replyTo, 3.seconds))
          this
        } else
          Behaviors.unhandled
    }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("DeviceGroup {} stopped", groupId)
      this
  }
}
```

### Example 26: Adding query capability to the group

```java
public class DeviceGroup extends AbstractBehavior<DeviceGroup.Command> {

  public interface Command {}

  private class DeviceTerminated implements Command {
    public final ActorRef<Device.Command> device;
    public final String groupId;
    public final String deviceId;

    DeviceTerminated(ActorRef<Device.Command> device, String groupId, String deviceId) {
      this.device = device;
      this.groupId = groupId;
      this.deviceId = deviceId;
    }
  }

  public static Behavior<Command> create(String groupId) {
    return Behaviors.setup(context -> new DeviceGroup(context, groupId));
  }

  private final String groupId;
  private final Map<String, ActorRef<Device.Command>> deviceIdToActor = new HashMap<>();

  private DeviceGroup(ActorContext<Command> context, String groupId) {
    super(context);
    this.groupId = groupId;
    context.getLog().info("DeviceGroup {} started", groupId);
  }


  private DeviceGroup onAllTemperatures(DeviceManager.RequestAllTemperatures r) {
    // since Java collections are mutable, we want to avoid sharing them between actors (since
    // multiple Actors (threads)
    // modifying the same mutable data-structure is not safe), and perform a defensive copy of the
    // mutable map:
    //
    // Feel free to use your favourite immutable data-structures library with Akka in Java
    // applications!
    Map<String, ActorRef<Device.Command>> deviceIdToActorCopy = new HashMap<>(this.deviceIdToActor);

    getContext()
        .spawnAnonymous(
            DeviceGroupQuery.create(
                deviceIdToActorCopy, r.requestId, r.replyTo, Duration.ofSeconds(3)));

    return this;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        // ... other cases omitted
        .onMessage(
            DeviceManager.RequestAllTemperatures.class,
            r -> r.groupId.equals(groupId),
            this::onAllTemperatures)
        .build();
  }
}
```

### Example 27: Adding query capability to the group

```scala
"be able to collect temperatures from all active devices" in {
  val registeredProbe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", registeredProbe.ref)
  val deviceActor1 = registeredProbe.receiveMessage().device

  groupActor ! RequestTrackDevice("group", "device2", registeredProbe.ref)
  val deviceActor2 = registeredProbe.receiveMessage().device

  groupActor ! RequestTrackDevice("group", "device3", registeredProbe.ref)
  registeredProbe.receiveMessage()

  // Check that the device actors are working
  val recordProbe = createTestProbe[TemperatureRecorded]()
  deviceActor1 ! RecordTemperature(requestId = 0, 1.0, recordProbe.ref)
  recordProbe.expectMessage(TemperatureRecorded(requestId = 0))
  deviceActor2 ! RecordTemperature(requestId = 1, 2.0, recordProbe.ref)
  recordProbe.expectMessage(TemperatureRecorded(requestId = 1))
  // No temperature for device3

  val allTempProbe = createTestProbe[RespondAllTemperatures]()
  groupActor ! RequestAllTemperatures(requestId = 0, groupId = "group", allTempProbe.ref)
  allTempProbe.expectMessage(
    RespondAllTemperatures(
      requestId = 0,
      temperatures =
        Map("device1" -> Temperature(1.0), "device2" -> Temperature(2.0), "device3" -> TemperatureNotAvailable)))
}
```

### Example 28: Adding query capability to the group

```java
@Test
public void testCollectTemperaturesFromAllActiveDevices() {
  TestProbe<DeviceRegistered> registeredProbe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device1", registeredProbe.getRef()));
  ActorRef<Device.Command> deviceActor1 = registeredProbe.receiveMessage().device;

  groupActor.tell(new RequestTrackDevice("group", "device2", registeredProbe.getRef()));
  ActorRef<Device.Command> deviceActor2 = registeredProbe.receiveMessage().device;

  groupActor.tell(new RequestTrackDevice("group", "device3", registeredProbe.getRef()));
  ActorRef<Device.Command> deviceActor3 = registeredProbe.receiveMessage().device;

  // Check that the device actors are working
  TestProbe<Device.TemperatureRecorded> recordProbe =
      testKit.createTestProbe(Device.TemperatureRecorded.class);
  deviceActor1.tell(new Device.RecordTemperature(0L, 1.0, recordProbe.getRef()));
  assertEquals(0L, recordProbe.receiveMessage().requestId);
  deviceActor2.tell(new Device.RecordTemperature(1L, 2.0, recordProbe.getRef()));
  assertEquals(1L, recordProbe.receiveMessage().requestId);
  // No temperature for device 3

  TestProbe<RespondAllTemperatures> allTempProbe =
      testKit.createTestProbe(RespondAllTemperatures.class);
  groupActor.tell(new RequestAllTemperatures(0L, "group", allTempProbe.getRef()));
  RespondAllTemperatures response = allTempProbe.receiveMessage();
  assertEquals(0L, response.requestId);

  Map<String, TemperatureReading> expectedTemperatures = new HashMap<>();
  expectedTemperatures.put("device1", new Temperature(1.0));
  expectedTemperatures.put("device2", new Temperature(2.0));
  expectedTemperatures.put("device3", TemperatureNotAvailable.INSTANCE);

  assertEquals(expectedTemperatures, response.temperatures);
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/libraries/akka-core/current/additional/books.html
- https://doc.akka.io/libraries/akka-core/current/general/index.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_1.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_3.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_4.html
- https://doc.akka.io/libraries/akka-grpc/current/
- https://doc.akka.io/libraries/akka-http/current/introduction.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_5.html](https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_5.html)*