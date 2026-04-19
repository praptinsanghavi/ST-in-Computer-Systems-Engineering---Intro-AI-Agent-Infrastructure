---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:12:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_4.html
title: 'Part 4: Working with Device Groups • Akka core'
---

# Part 4: Working with Device Groups • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Part 4: Working with Device Groups

## Introduction

Let’s take a closer look at the main functionality required by our use case. In a complete IoT system for monitoring home temperatures, the steps for connecting a device sensor to our system might look like this:

1. A sensor device in the home connects through some protocol.
2. The component managing network connections accepts the connection.
3. The sensor provides its group and device ID to register with the device manager component of our system.
4. The device manager component handles registration by looking up or creating the actor responsible for keeping sensor state.
5. The actor responds with an acknowledgement, exposing its [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef").
6. The networking component now uses the `ActorRef` for communication between the sensor and device actor without going through the device manager.

Steps 1 and 2 take place outside the boundaries of our tutorial system. In this chapter, we will start addressing steps 3\-6 and create a way for sensors to register with our system and to communicate with actors. But first, we have another architectural decision — how many levels of actors should we use to represent device groups and device sensors?

One of the main design challenges for Akka programmers is choosing the best granularity for actors. In practice, depending on the characteristics of the interactions between actors, there are usually several valid ways to organize a system. In our use case, for example, it would be possible to have a single actor maintain all the groups and devices — perhaps using hash maps. It would also be reasonable to have an actor for each group that tracks the state of all devices in the same home.

The following guidelines help us choose the most appropriate actor hierarchy:

- In general, prefer larger granularity. Introducing more fine\-grained actors than needed causes more problems than it solves.
- Add finer granularity when the system requires:
	- Higher concurrency.
	- Complex conversations between actors that have many states. We will see a very good example for this in the next chapter.
	- Sufficient state that it makes sense to divide into smaller actors.
	- Multiple unrelated responsibilities. Using separate actors allows individuals to fail and be restored with little impact on others.

## Device manager hierarchy

Considering the principles outlined in the previous section, we will model the device manager component as an actor tree with three levels:

- The top level supervisor actor represents the system component for devices. It is also the entry point to look up and create device group and device actors.
- At the next level, group actors each supervise the device actors for one group id (e.g. one home). They also provide services, such as querying temperature readings from all of the available devices in their group.
- Device actors manage all the interactions with the actual device sensors, such as storing temperature readings.

![device manager tree](diagrams/device_manager_tree.png)

We chose this three\-layered architecture for these reasons:

- Having groups of individual actors:

	- Isolates failures that occur in a group. If a single actor managed all device groups, an error in one group that causes a restart would wipe out the state of groups that are otherwise non\-faulty.
	- Simplifies the problem of querying all the devices belonging to a group. Each group actor only contains state related to its group.
	- Increases parallelism in the system. Since each group has a dedicated actor, they run concurrently and we can query multiple groups concurrently.
- Having sensors modeled as individual device actors:

	- Isolates failures of one device actor from the rest of the devices in the group.
	- Increases the parallelism of collecting temperature readings. Network connections from different sensors communicate with their individual device actors directly, reducing contention points.

With the architecture defined, we can start working on the protocol for registering sensors.

## The Registration Protocol

As the first step, we need to design the protocol both for registering a device and for creating the group and device actors that will be responsible for it. This protocol will be provided by the `DeviceManager` component itself because that is the only actor that is known and available up front: device groups and device actors are created on\-demand.

Looking at registration in more detail, we can outline the necessary functionality:

1. When a `DeviceManager` receives a request with a group and device id:
	- If the manager already has an actor for the device group, it forwards the request to it.
	- Otherwise, it creates a new device group actor and then forwards the request.
2. The `DeviceGroup` actor receives the request to register an actor for the given device:
	- If the group already has an actor for the device it replies with the [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") of the existing device actor.
	- Otherwise, the `DeviceGroup` actor first creates a device actor and replies with the `ActorRef` of the newly created device actor.
3. The sensor will now have the `ActorRef` of the device actor to send messages directly to it.

The messages that we will use to communicate registration requests and their acknowledgement have the definition:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/DeviceManager.scala#L25-L29 "Go to snippet source")final case class RequestTrackDevice(groupId: String, deviceId: String, replyTo: ActorRef[DeviceRegistered])
    extends DeviceManager.Command
    with DeviceGroup.Command

final case class DeviceRegistered(device: ActorRef[Device.Command])
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/DeviceManager.java#L21-L137 "Go to snippet source")public class DeviceManager extends AbstractBehavior<DeviceManager.Command> {

  public interface Command {}

  public static final class RequestTrackDevice
      implements DeviceManager.Command, DeviceGroup.Command {
    public final String groupId;
    public final String deviceId;
    public final ActorRef<DeviceRegistered> replyTo;

    public RequestTrackDevice(String groupId, String deviceId, ActorRef<DeviceRegistered> replyTo) {
      this.groupId = groupId;
      this.deviceId = deviceId;
      this.replyTo = replyTo;
    }
  }

  public static final class DeviceRegistered {
    public final ActorRef<Device.Command> device;

    public DeviceRegistered(ActorRef<Device.Command> device) {
      this.device = device;
    }
  }
}
```

In this case we have not included a request ID field in the messages. Since registration happens once, when the component connects the system to some network protocol, the ID is not important. However, it is usually a best practice to include a request ID.

Now, we’ll start implementing the protocol from the bottom up. In practice, both a top\-down and bottom\-up approach can work, but in our case, we benefit from the bottom\-up approach as it allows us to immediately write tests for the new features without mocking out parts that we will need to build later.

## Adding registration support to device group actors

A group actor has some work to do when it comes to registrations, including:

- Handling the registration request for existing device actor or by creating a new actor.
- Tracking which device actors exist in the group and removing them from the group when they are stopped.

### Handling the registration request

A device group actor must either reply to the request with the [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") of an existing child, or it should create one. To look up child actors by their device IDs we will use a `Map`.

Add the following to your source file:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/DeviceGroup.scala#L17-L84 "Go to snippet source")object DeviceGroup {
  def apply(groupId: String): Behavior[Command] =
    Behaviors.setup(context => new DeviceGroup(context, groupId))

  trait Command

  private final case class DeviceTerminated(device: ActorRef[Device.Command], groupId: String, deviceId: String)
      extends Command

}

class DeviceGroup(context: ActorContext[DeviceGroup.Command], groupId: String)
    extends AbstractBehavior[DeviceGroup.Command](context) {
  import DeviceGroup._
  import DeviceManager.{ DeviceRegistered, ReplyDeviceList, RequestDeviceList, RequestTrackDevice }

  private var deviceIdToActor = Map.empty[String, ActorRef[Device.Command]]

  context.log.info("DeviceGroup {} started", groupId)

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case trackMsg @ RequestTrackDevice(`groupId`, deviceId, replyTo) =>
        deviceIdToActor.get(deviceId) match {
          case Some(deviceActor) =>
            replyTo ! DeviceRegistered(deviceActor)
          case None =>
            context.log.info("Creating device actor for {}", trackMsg.deviceId)
            val deviceActor = context.spawn(Device(groupId, deviceId), s"device-$deviceId")
            deviceIdToActor += deviceId -> deviceActor
            replyTo ! DeviceRegistered(deviceActor)
        }
        this

      case RequestTrackDevice(gId, _, _) =>
        context.log.warn("Ignoring TrackDevice request for {}. This actor is responsible for {}.", gId, groupId)
        this
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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/DeviceGroup.java#L20-L116 "Go to snippet source")public class DeviceGroup extends AbstractBehavior<DeviceGroup.Command> {

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

  private DeviceGroup onTrackDevice(DeviceManager.RequestTrackDevice trackMsg) {
    if (this.groupId.equals(trackMsg.groupId)) {
      ActorRef<Device.Command> deviceActor = deviceIdToActor.get(trackMsg.deviceId);
      if (deviceActor != null) {
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      } else {
        getContext().getLog().info("Creating device actor for {}", trackMsg.deviceId);
        deviceActor =
            getContext()
                .spawn(Device.create(groupId, trackMsg.deviceId), "device-" + trackMsg.deviceId);
        deviceIdToActor.put(trackMsg.deviceId, deviceActor);
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      }
    } else {
      getContext()
          .getLog()
          .warn(
              "Ignoring TrackDevice request for {}. This actor is responsible for {}.",
              groupId,
              this.groupId);
    }
    return this;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(DeviceManager.RequestTrackDevice.class, this::onTrackDevice)
        .build();
  }

  private DeviceGroup onPostStop() {
    getContext().getLog().info("DeviceGroup {} stopped", groupId);
    return this;
  }
}
```

Just as we did with the device, we test this new functionality. We also test that the actors returned for the two different IDs are actually different, and we also attempt to record a temperature reading for each of the devices to see if the actors are responding.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/DeviceGroupSpec.scala#L18-L46 "Go to snippet source")"be able to register a device actor" in {
  val probe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", probe.ref)
  val registered1 = probe.receiveMessage()
  val deviceActor1 = registered1.device

  // another deviceId
  groupActor ! RequestTrackDevice("group", "device2", probe.ref)
  val registered2 = probe.receiveMessage()
  val deviceActor2 = registered2.device
  deviceActor1 should !==(deviceActor2)

  // Check that the device actors are working
  val recordProbe = createTestProbe[TemperatureRecorded]()
  deviceActor1 ! RecordTemperature(requestId = 0, 1.0, recordProbe.ref)
  recordProbe.expectMessage(TemperatureRecorded(requestId = 0))
  deviceActor2 ! Device.RecordTemperature(requestId = 1, 2.0, recordProbe.ref)
  recordProbe.expectMessage(Device.TemperatureRecorded(requestId = 1))
}

"ignore requests for wrong groupId" in {
  val probe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("wrongGroup", "device1", probe.ref)
  probe.expectNoMessage(500.milliseconds)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/DeviceGroupTest.java#L28-L56 "Go to snippet source")@Test
public void testReplyToRegistrationRequests() {
  TestProbe<DeviceRegistered> probe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device", probe.getRef()));
  DeviceRegistered registered1 = probe.receiveMessage();

  // another deviceId
  groupActor.tell(new RequestTrackDevice("group", "device3", probe.getRef()));
  DeviceRegistered registered2 = probe.receiveMessage();
  assertNotEquals(registered1.device, registered2.device);

  // Check that the device actors are working
  TestProbe<Device.TemperatureRecorded> recordProbe =
      testKit.createTestProbe(Device.TemperatureRecorded.class);
  registered1.device.tell(new Device.RecordTemperature(0L, 1.0, recordProbe.getRef()));
  assertEquals(0L, recordProbe.receiveMessage().requestId);
  registered2.device.tell(new Device.RecordTemperature(1L, 2.0, recordProbe.getRef()));
  assertEquals(1L, recordProbe.receiveMessage().requestId);
}

@Test
public void testIgnoreWrongRegistrationRequests() {
  TestProbe<DeviceRegistered> probe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));
  groupActor.tell(new RequestTrackDevice("wrongGroup", "device1", probe.getRef()));
  probe.expectNoMessage();
}
```

If a device actor already exists for the registration request, we would like to use the existing actor instead of a new one. We have not tested this yet, so we need to fix this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/DeviceGroupSpec.scala#L50-L62 "Go to snippet source")"return same actor for same deviceId" in {
  val probe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", probe.ref)
  val registered1 = probe.receiveMessage()

  // registering same again should be idempotent
  groupActor ! RequestTrackDevice("group", "device1", probe.ref)
  val registered2 = probe.receiveMessage()

  registered1.device should ===(registered2.device)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/DeviceGroupTest.java#L60-L72 "Go to snippet source")@Test
public void testReturnSameActorForSameDeviceId() {
  TestProbe<DeviceRegistered> probe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device", probe.getRef()));
  DeviceRegistered registered1 = probe.receiveMessage();

  // registering same again should be idempotent
  groupActor.tell(new RequestTrackDevice("group", "device", probe.getRef()));
  DeviceRegistered registered2 = probe.receiveMessage();
  assertEquals(registered1.device, registered2.device);
}
```

### Keeping track of the device actors in the group

So far, we have implemented logic for registering device actors in the group. Devices come and go, however, so we will need a way to remove device actors from the `Map[String, ActorRef[DeviceMessage]]``Map<String, ActorRef<DeviceMessage>>`. We will assume that when a device is removed, its corresponding device actor is stopped. Supervision, as we discussed earlier, only handles error scenarios — not graceful stopping. So we need to notify the parent when one of the device actors is stopped.

Akka provides a *Death Watch* feature that allows an actor to *watch* another actor and be notified if the other actor is stopped. Unlike supervision, watching is not limited to parent\-child relationships, any actor can watch any other actor as long as it knows the [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef"). After a watched actor stops, the watcher receives a [`Terminated(actorRef)`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated")[`Terminated(actorRef)`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html "akka.actor.typed.Terminated") signal which also contains the reference to the watched actor. The watcher can either handle this message explicitly or will fail with a [`DeathPactException`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DeathPactException.html "akka.actor.typed.DeathPactException")[`DeathPactException`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DeathPactException.html "akka.actor.typed.DeathPactException"). This latter is useful if the actor can no longer perform its own duties after the watched actor has been stopped. In our case, the group should still function after one device have been stopped, so we need to handle the `Terminated(actorRef)` signal.

Our device group actor needs to include functionality that:

1. Starts watching new device actors when they are created.
2. Removes a device actor from the `Map[String, ActorRef[DeviceMessage]]``Map<String, ActorRef<DeviceMessage>>` — which maps devices to device actors — when the notification indicates it has stopped.

Unfortunately, the `Terminated` signal only contains the `ActorRef` of the child actor. We need the actor’s ID to remove it from the map of existing device to device actor mappings. An alternative to the `Terminated` signal is to define a custom message that will be sent when the watched actor is stopped. We will use that here because it gives us the possibility to carry the device ID in that message.

Adding the functionality to identify the actor results in this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/DeviceGroup.scala#L30-L84 "Go to snippet source")  
class DeviceGroup(context: ActorContext[DeviceGroup.Command], groupId: String)
    extends AbstractBehavior[DeviceGroup.Command](context) {
  import DeviceGroup._
  import DeviceManager.{ DeviceRegistered, ReplyDeviceList, RequestDeviceList, RequestTrackDevice }

  private var deviceIdToActor = Map.empty[String, ActorRef[Device.Command]]

  context.log.info("DeviceGroup {} started", groupId)

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case trackMsg @ RequestTrackDevice(`groupId`, deviceId, replyTo) =>
        deviceIdToActor.get(deviceId) match {
          case Some(deviceActor) =>
            replyTo ! DeviceRegistered(deviceActor)
          case None =>
            context.log.info("Creating device actor for {}", trackMsg.deviceId)
            val deviceActor = context.spawn(Device(groupId, deviceId), s"device-$deviceId")
            context.watchWith(deviceActor, DeviceTerminated(deviceActor, groupId, deviceId))
            deviceIdToActor += deviceId -> deviceActor
            replyTo ! DeviceRegistered(deviceActor)
        }
        this

      case RequestTrackDevice(gId, _, _) =>
        context.log.warn("Ignoring TrackDevice request for {}. This actor is responsible for {}.", gId, groupId)
        this

      case DeviceTerminated(_, _, deviceId) =>
        context.log.info("Device actor for {} has been terminated", deviceId)
        deviceIdToActor -= deviceId
        this

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/DeviceGroup.java#L20-L116 "Go to snippet source")public class DeviceGroup extends AbstractBehavior<DeviceGroup.Command> {

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

  private DeviceGroup onTrackDevice(DeviceManager.RequestTrackDevice trackMsg) {
    if (this.groupId.equals(trackMsg.groupId)) {
      ActorRef<Device.Command> deviceActor = deviceIdToActor.get(trackMsg.deviceId);
      if (deviceActor != null) {
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      } else {
        getContext().getLog().info("Creating device actor for {}", trackMsg.deviceId);
        deviceActor =
            getContext()
                .spawn(Device.create(groupId, trackMsg.deviceId), "device-" + trackMsg.deviceId);
        getContext()
            .watchWith(deviceActor, new DeviceTerminated(deviceActor, groupId, trackMsg.deviceId));
        deviceIdToActor.put(trackMsg.deviceId, deviceActor);
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      }
    } else {
      getContext()
          .getLog()
          .warn(
              "Ignoring TrackDevice request for {}. This actor is responsible for {}.",
              groupId,
              this.groupId);
    }
    return this;
  }

  private DeviceGroup onTerminated(DeviceTerminated t) {
    getContext().getLog().info("Device actor for {} has been terminated", t.deviceId);
    deviceIdToActor.remove(t.deviceId);
    return this;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(DeviceManager.RequestTrackDevice.class, this::onTrackDevice)
        .onMessage(DeviceTerminated.class, this::onTerminated)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private DeviceGroup onPostStop() {
    getContext().getLog().info("DeviceGroup {} stopped", groupId);
    return this;
  }
}
```

So far we have no means to get which devices the group device actor keeps track of and, therefore, we cannot test our new functionality yet. To make it testable, we add a new query capability (message `RequestDeviceList`) that lists the currently active device IDs:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/DeviceManager.scala#L33-L37 "Go to snippet source")final case class RequestDeviceList(requestId: Long, groupId: String, replyTo: ActorRef[ReplyDeviceList])
    extends DeviceManager.Command
    with DeviceGroup.Command

final case class ReplyDeviceList(requestId: Long, ids: Set[String])
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/DeviceManager.java#L48-L69 "Go to snippet source")public static final class RequestDeviceList
    implements DeviceManager.Command, DeviceGroup.Command {
  final long requestId;
  final String groupId;
  final ActorRef<ReplyDeviceList> replyTo;

  public RequestDeviceList(long requestId, String groupId, ActorRef<ReplyDeviceList> replyTo) {
    this.requestId = requestId;
    this.groupId = groupId;
    this.replyTo = replyTo;
  }
}

public static final class ReplyDeviceList {
  final long requestId;
  final Set<String> ids;

  public ReplyDeviceList(long requestId, Set<String> ids) {
    this.requestId = requestId;
    this.ids = ids;
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/DeviceGroup.scala#L17-L84 "Go to snippet source")object DeviceGroup {
  def apply(groupId: String): Behavior[Command] =
    Behaviors.setup(context => new DeviceGroup(context, groupId))

  trait Command

  private final case class DeviceTerminated(device: ActorRef[Device.Command], groupId: String, deviceId: String)
      extends Command

}

class DeviceGroup(context: ActorContext[DeviceGroup.Command], groupId: String)
    extends AbstractBehavior[DeviceGroup.Command](context) {
  import DeviceGroup._
  import DeviceManager.{ DeviceRegistered, ReplyDeviceList, RequestDeviceList, RequestTrackDevice }

  private var deviceIdToActor = Map.empty[String, ActorRef[Device.Command]]

  context.log.info("DeviceGroup {} started", groupId)

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case trackMsg @ RequestTrackDevice(`groupId`, deviceId, replyTo) =>
        deviceIdToActor.get(deviceId) match {
          case Some(deviceActor) =>
            replyTo ! DeviceRegistered(deviceActor)
          case None =>
            context.log.info("Creating device actor for {}", trackMsg.deviceId)
            val deviceActor = context.spawn(Device(groupId, deviceId), s"device-$deviceId")
            context.watchWith(deviceActor, DeviceTerminated(deviceActor, groupId, deviceId))
            deviceIdToActor += deviceId -> deviceActor
            replyTo ! DeviceRegistered(deviceActor)
        }
        this

      case RequestTrackDevice(gId, _, _) =>
        context.log.warn("Ignoring TrackDevice request for {}. This actor is responsible for {}.", gId, groupId)
        this

      case RequestDeviceList(requestId, gId, replyTo) =>
        if (gId == groupId) {
          replyTo ! ReplyDeviceList(requestId, deviceIdToActor.keySet)
          this
        } else
          Behaviors.unhandled

      case DeviceTerminated(_, _, deviceId) =>
        context.log.info("Device actor for {} has been terminated", deviceId)
        deviceIdToActor -= deviceId
        this

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/DeviceGroup.java#L20-L116 "Go to snippet source")public class DeviceGroup extends AbstractBehavior<DeviceGroup.Command> {

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

  private DeviceGroup onTrackDevice(DeviceManager.RequestTrackDevice trackMsg) {
    if (this.groupId.equals(trackMsg.groupId)) {
      ActorRef<Device.Command> deviceActor = deviceIdToActor.get(trackMsg.deviceId);
      if (deviceActor != null) {
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      } else {
        getContext().getLog().info("Creating device actor for {}", trackMsg.deviceId);
        deviceActor =
            getContext()
                .spawn(Device.create(groupId, trackMsg.deviceId), "device-" + trackMsg.deviceId);
        getContext()
            .watchWith(deviceActor, new DeviceTerminated(deviceActor, groupId, trackMsg.deviceId));
        deviceIdToActor.put(trackMsg.deviceId, deviceActor);
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      }
    } else {
      getContext()
          .getLog()
          .warn(
              "Ignoring TrackDevice request for {}. This actor is responsible for {}.",
              groupId,
              this.groupId);
    }
    return this;
  }

  private DeviceGroup onDeviceList(DeviceManager.RequestDeviceList r) {
    r.replyTo.tell(new DeviceManager.ReplyDeviceList(r.requestId, deviceIdToActor.keySet()));
    return this;
  }

  private DeviceGroup onTerminated(DeviceTerminated t) {
    getContext().getLog().info("Device actor for {} has been terminated", t.deviceId);
    deviceIdToActor.remove(t.deviceId);
    return this;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(DeviceManager.RequestTrackDevice.class, this::onTrackDevice)
        .onMessage(
            DeviceManager.RequestDeviceList.class,
            r -> r.groupId.equals(groupId),
            this::onDeviceList)
        .onMessage(DeviceTerminated.class, this::onTerminated)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private DeviceGroup onPostStop() {
    getContext().getLog().info("DeviceGroup {} stopped", groupId);
    return this;
  }
}
```

We are almost ready to test the removal of devices. But, we still need the following capabilities:

- To stop a device actor from our test case, from the outside, we must send a message to it. We add a `Passivate` message which instructs the actor to stop.
- To be notified once the device actor is stopped. We can use the *Death Watch* facility for this purpose, too.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/Device.scala#L30 "Go to snippet source")case object Passivate extends Command
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/Device.java#L63-L65 "Go to snippet source")static enum Passivate implements Command {
  INSTANCE
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/Device.scala#L8-L65 "Go to snippet source")import akka.actor.typed.ActorRef
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

  case object Passivate extends Command
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

      case Passivate =>
        Behaviors.stopped
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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/Device.java#L8-L111 "Go to snippet source")  
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

  static enum Passivate implements Command {
    INSTANCE
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
        .onMessage(Passivate.class, m -> Behaviors.stopped())
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

We add two more test cases now. In the first, we test that we get back the list of proper IDs once we have added a few devices. The second test case makes sure that the device ID is properly removed after the device actor has been stopped. The [`TestProbe`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestProbe.html "akka.actor.testkit.typed.javadsl.TestProbe")[`TestProbe`](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/TestProbe.html "akka.actor.testkit.typed.scaladsl.TestProbe") has a `expectTerminated` method that we can easily use to assert that the device actor has been terminated.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/DeviceGroupSpec.scala#L66-L105 "Go to snippet source")"be able to list active devices" in {
  val registeredProbe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", registeredProbe.ref)
  registeredProbe.receiveMessage()

  groupActor ! RequestTrackDevice("group", "device2", registeredProbe.ref)
  registeredProbe.receiveMessage()

  val deviceListProbe = createTestProbe[ReplyDeviceList]()
  groupActor ! RequestDeviceList(requestId = 0, groupId = "group", deviceListProbe.ref)
  deviceListProbe.expectMessage(ReplyDeviceList(requestId = 0, Set("device1", "device2")))
}

"be able to list active devices after one shuts down" in {
  val registeredProbe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", registeredProbe.ref)
  val registered1 = registeredProbe.receiveMessage()
  val toShutDown = registered1.device

  groupActor ! RequestTrackDevice("group", "device2", registeredProbe.ref)
  registeredProbe.receiveMessage()

  val deviceListProbe = createTestProbe[ReplyDeviceList]()
  groupActor ! RequestDeviceList(requestId = 0, groupId = "group", deviceListProbe.ref)
  deviceListProbe.expectMessage(ReplyDeviceList(requestId = 0, Set("device1", "device2")))

  toShutDown ! Passivate
  registeredProbe.expectTerminated(toShutDown, registeredProbe.remainingOrDefault)

  // using awaitAssert to retry because it might take longer for the groupActor
  // to see the Terminated, that order is undefined
  registeredProbe.awaitAssert {
    groupActor ! RequestDeviceList(requestId = 1, groupId = "group", deviceListProbe.ref)
    deviceListProbe.expectMessage(ReplyDeviceList(requestId = 1, Set("device2")))
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/DeviceGroupTest.java#L76-L128 "Go to snippet source")@Test
public void testListActiveDevices() {
  TestProbe<DeviceRegistered> registeredProbe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device1", registeredProbe.getRef()));
  registeredProbe.receiveMessage();

  groupActor.tell(new RequestTrackDevice("group", "device2", registeredProbe.getRef()));
  registeredProbe.receiveMessage();

  TestProbe<ReplyDeviceList> deviceListProbe = testKit.createTestProbe(ReplyDeviceList.class);

  groupActor.tell(new RequestDeviceList(0L, "group", deviceListProbe.getRef()));
  ReplyDeviceList reply = deviceListProbe.receiveMessage();
  assertEquals(0L, reply.requestId);
  assertEquals(Stream.of("device1", "device2").collect(Collectors.toSet()), reply.ids);
}

@Test
public void testListActiveDevicesAfterOneShutsDown() {
  TestProbe<DeviceRegistered> registeredProbe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device1", registeredProbe.getRef()));
  DeviceRegistered registered1 = registeredProbe.receiveMessage();

  groupActor.tell(new RequestTrackDevice("group", "device2", registeredProbe.getRef()));
  DeviceRegistered registered2 = registeredProbe.receiveMessage();

  ActorRef<Device.Command> toShutDown = registered1.device;

  TestProbe<ReplyDeviceList> deviceListProbe = testKit.createTestProbe(ReplyDeviceList.class);

  groupActor.tell(new RequestDeviceList(0L, "group", deviceListProbe.getRef()));
  ReplyDeviceList reply = deviceListProbe.receiveMessage();
  assertEquals(0L, reply.requestId);
  assertEquals(Stream.of("device1", "device2").collect(Collectors.toSet()), reply.ids);

  toShutDown.tell(Device.Passivate.INSTANCE);
  registeredProbe.expectTerminated(toShutDown, registeredProbe.getRemainingOrDefault());

  // using awaitAssert to retry because it might take longer for the groupActor
  // to see the Terminated, that order is undefined
  registeredProbe.awaitAssert(
      () -> {
        groupActor.tell(new RequestDeviceList(1L, "group", deviceListProbe.getRef()));
        ReplyDeviceList r = deviceListProbe.receiveMessage();
        assertEquals(1L, r.requestId);
        assertEquals(Stream.of("device2").collect(Collectors.toSet()), r.ids);
        return null;
      });
}
```

## Creating device manager actors

Going up to the next level in our hierarchy, we need to create the entry point for our device manager component in the `DeviceManager` source file. This actor is very similar to the device group actor, but creates device group actors instead of device actors:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/typed/tutorial_4/DeviceManager.scala#L16-L88 "Go to snippet source")object DeviceManager {
  def apply(): Behavior[Command] =
    Behaviors.setup(context => new DeviceManager(context))

  sealed trait Command

  final case class RequestTrackDevice(groupId: String, deviceId: String, replyTo: ActorRef[DeviceRegistered])
      extends DeviceManager.Command
      with DeviceGroup.Command

  final case class DeviceRegistered(device: ActorRef[Device.Command])

  final case class RequestDeviceList(requestId: Long, groupId: String, replyTo: ActorRef[ReplyDeviceList])
      extends DeviceManager.Command
      with DeviceGroup.Command

  final case class ReplyDeviceList(requestId: Long, ids: Set[String])

  private final case class DeviceGroupTerminated(groupId: String) extends DeviceManager.Command
}

class DeviceManager(context: ActorContext[DeviceManager.Command])
    extends AbstractBehavior[DeviceManager.Command](context) {
  import DeviceManager._

  var groupIdToActor = Map.empty[String, ActorRef[DeviceGroup.Command]]

  context.log.info("DeviceManager started")

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case trackMsg @ RequestTrackDevice(groupId, _, replyTo) =>
        groupIdToActor.get(groupId) match {
          case Some(ref) =>
            ref ! trackMsg
          case None =>
            context.log.info("Creating device group actor for {}", groupId)
            val groupActor = context.spawn(DeviceGroup(groupId), "group-" + groupId)
            context.watchWith(groupActor, DeviceGroupTerminated(groupId))
            groupActor ! trackMsg
            groupIdToActor += groupId -> groupActor
        }
        this

      case req @ RequestDeviceList(requestId, groupId, replyTo) =>
        groupIdToActor.get(groupId) match {
          case Some(ref) =>
            ref ! req
          case None =>
            replyTo ! ReplyDeviceList(requestId, Set.empty)
        }
        this

      case DeviceGroupTerminated(groupId) =>
        context.log.info("Device group actor for {} has been terminated", groupId)
        groupIdToActor -= groupId
        this
    }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("DeviceManager stopped")
      this
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/typed/tutorial_4/DeviceManager.java#L21-L137 "Go to snippet source")public class DeviceManager extends AbstractBehavior<DeviceManager.Command> {

  public interface Command {}

  public static final class RequestTrackDevice
      implements DeviceManager.Command, DeviceGroup.Command {
    public final String groupId;
    public final String deviceId;
    public final ActorRef<DeviceRegistered> replyTo;

    public RequestTrackDevice(String groupId, String deviceId, ActorRef<DeviceRegistered> replyTo) {
      this.groupId = groupId;
      this.deviceId = deviceId;
      this.replyTo = replyTo;
    }
  }

  public static final class DeviceRegistered {
    public final ActorRef<Device.Command> device;

    public DeviceRegistered(ActorRef<Device.Command> device) {
      this.device = device;
    }
  }

  public static final class RequestDeviceList
      implements DeviceManager.Command, DeviceGroup.Command {
    final long requestId;
    final String groupId;
    final ActorRef<ReplyDeviceList> replyTo;

    public RequestDeviceList(long requestId, String groupId, ActorRef<ReplyDeviceList> replyTo) {
      this.requestId = requestId;
      this.groupId = groupId;
      this.replyTo = replyTo;
    }
  }

  public static final class ReplyDeviceList {
    final long requestId;
    final Set<String> ids;

    public ReplyDeviceList(long requestId, Set<String> ids) {
      this.requestId = requestId;
      this.ids = ids;
    }
  }

  private static class DeviceGroupTerminated implements DeviceManager.Command {
    public final String groupId;

    DeviceGroupTerminated(String groupId) {
      this.groupId = groupId;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(DeviceManager::new);
  }

  private final Map<String, ActorRef<DeviceGroup.Command>> groupIdToActor = new HashMap<>();

  private DeviceManager(ActorContext<Command> context) {
    super(context);
    context.getLog().info("DeviceManager started");
  }

  private DeviceManager onTrackDevice(RequestTrackDevice trackMsg) {
    String groupId = trackMsg.groupId;
    ActorRef<DeviceGroup.Command> ref = groupIdToActor.get(groupId);
    if (ref != null) {
      ref.tell(trackMsg);
    } else {
      getContext().getLog().info("Creating device group actor for {}", groupId);
      ActorRef<DeviceGroup.Command> groupActor =
          getContext().spawn(DeviceGroup.create(groupId), "group-" + groupId);
      getContext().watchWith(groupActor, new DeviceGroupTerminated(groupId));
      groupActor.tell(trackMsg);
      groupIdToActor.put(groupId, groupActor);
    }
    return this;
  }

  private DeviceManager onRequestDeviceList(RequestDeviceList request) {
    ActorRef<DeviceGroup.Command> ref = groupIdToActor.get(request.groupId);
    if (ref != null) {
      ref.tell(request);
    } else {
      request.replyTo.tell(new ReplyDeviceList(request.requestId, Collections.emptySet()));
    }
    return this;
  }

  private DeviceManager onTerminated(DeviceGroupTerminated t) {
    getContext().getLog().info("Device group actor for {} has been terminated", t.groupId);
    groupIdToActor.remove(t.groupId);
    return this;
  }

  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(RequestTrackDevice.class, this::onTrackDevice)
        .onMessage(RequestDeviceList.class, this::onRequestDeviceList)
        .onMessage(DeviceGroupTerminated.class, this::onTerminated)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private DeviceManager onPostStop() {
    getContext().getLog().info("DeviceManager stopped");
    return this;
  }
}
```

We leave tests of the device manager as an exercise for you since it is very similar to the tests we have already written for the group actor.

## What’s next?

We have now a hierarchical component for registering and tracking devices and recording measurements. We have seen how to implement different types of conversation patterns, such as:

- Request\-respond (for temperature recordings)
- Create\-on\-demand (for registration of devices)
- Create\-watch\-terminate (for creating the group and device actor as children)

In the next chapter, we will introduce group query capabilities, which will establish a new conversation pattern of scatter\-gather. In particular, we will implement the functionality that allows users to query the status of all the devices belonging to a group.

## Code Examples

### Example 1: The Registration Protocol

```scala
final case class RequestTrackDevice(groupId: String, deviceId: String, replyTo: ActorRef[DeviceRegistered])
    extends DeviceManager.Command
    with DeviceGroup.Command

final case class DeviceRegistered(device: ActorRef[Device.Command])
```

### Example 2: The Registration Protocol

```java
public class DeviceManager extends AbstractBehavior<DeviceManager.Command> {

  public interface Command {}

  public static final class RequestTrackDevice
      implements DeviceManager.Command, DeviceGroup.Command {
    public final String groupId;
    public final String deviceId;
    public final ActorRef<DeviceRegistered> replyTo;

    public RequestTrackDevice(String groupId, String deviceId, ActorRef<DeviceRegistered> replyTo) {
      this.groupId = groupId;
      this.deviceId = deviceId;
      this.replyTo = replyTo;
    }
  }

  public static final class DeviceRegistered {
    public final ActorRef<Device.Command> device;

    public DeviceRegistered(ActorRef<Device.Command> device) {
      this.device = device;
    }
  }
}
```

### Example 3: Handling the registration request

```scala
object DeviceGroup {
  def apply(groupId: String): Behavior[Command] =
    Behaviors.setup(context => new DeviceGroup(context, groupId))

  trait Command

  private final case class DeviceTerminated(device: ActorRef[Device.Command], groupId: String, deviceId: String)
      extends Command

}

class DeviceGroup(context: ActorContext[DeviceGroup.Command], groupId: String)
    extends AbstractBehavior[DeviceGroup.Command](context) {
  import DeviceGroup._
  import DeviceManager.{ DeviceRegistered, ReplyDeviceList, RequestDeviceList, RequestTrackDevice }

  private var deviceIdToActor = Map.empty[String, ActorRef[Device.Command]]

  context.log.info("DeviceGroup {} started", groupId)

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case trackMsg @ RequestTrackDevice(`groupId`, deviceId, replyTo) =>
        deviceIdToActor.get(deviceId) match {
          case Some(deviceActor) =>
            replyTo ! DeviceRegistered(deviceActor)
          case None =>
            context.log.info("Creating device actor for {}", trackMsg.deviceId)
            val deviceActor = context.spawn(Device(groupId, deviceId), s"device-$deviceId")
            deviceIdToActor += deviceId -> deviceActor
            replyTo ! DeviceRegistered(deviceActor)
        }
        this

      case RequestTrackDevice(gId, _, _) =>
        context.log.warn("Ignoring TrackDevice request for {}. This actor is responsible for {}.", gId, groupId)
        this
    }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("DeviceGroup {} stopped", groupId)
      this
  }
}
```

### Example 4: Handling the registration request

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

  private DeviceGroup onTrackDevice(DeviceManager.RequestTrackDevice trackMsg) {
    if (this.groupId.equals(trackMsg.groupId)) {
      ActorRef<Device.Command> deviceActor = deviceIdToActor.get(trackMsg.deviceId);
      if (deviceActor != null) {
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      } else {
        getContext().getLog().info("Creating device actor for {}", trackMsg.deviceId);
        deviceActor =
            getContext()
                .spawn(Device.create(groupId, trackMsg.deviceId), "device-" + trackMsg.deviceId);
        deviceIdToActor.put(trackMsg.deviceId, deviceActor);
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      }
    } else {
      getContext()
          .getLog()
          .warn(
              "Ignoring TrackDevice request for {}. This actor is responsible for {}.",
              groupId,
              this.groupId);
    }
    return this;
  }


  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(DeviceManager.RequestTrackDevice.class, this::onTrackDevice)
        .build();
  }

  private DeviceGroup onPostStop() {
    getContext().getLog().info("DeviceGroup {} stopped", groupId);
    return this;
  }
}
```

### Example 5: Handling the registration request

```scala
"be able to register a device actor" in {
  val probe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", probe.ref)
  val registered1 = probe.receiveMessage()
  val deviceActor1 = registered1.device

  // another deviceId
  groupActor ! RequestTrackDevice("group", "device2", probe.ref)
  val registered2 = probe.receiveMessage()
  val deviceActor2 = registered2.device
  deviceActor1 should !==(deviceActor2)

  // Check that the device actors are working
  val recordProbe = createTestProbe[TemperatureRecorded]()
  deviceActor1 ! RecordTemperature(requestId = 0, 1.0, recordProbe.ref)
  recordProbe.expectMessage(TemperatureRecorded(requestId = 0))
  deviceActor2 ! Device.RecordTemperature(requestId = 1, 2.0, recordProbe.ref)
  recordProbe.expectMessage(Device.TemperatureRecorded(requestId = 1))
}

"ignore requests for wrong groupId" in {
  val probe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("wrongGroup", "device1", probe.ref)
  probe.expectNoMessage(500.milliseconds)
}
```

### Example 6: Handling the registration request

```java
@Test
public void testReplyToRegistrationRequests() {
  TestProbe<DeviceRegistered> probe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device", probe.getRef()));
  DeviceRegistered registered1 = probe.receiveMessage();

  // another deviceId
  groupActor.tell(new RequestTrackDevice("group", "device3", probe.getRef()));
  DeviceRegistered registered2 = probe.receiveMessage();
  assertNotEquals(registered1.device, registered2.device);

  // Check that the device actors are working
  TestProbe<Device.TemperatureRecorded> recordProbe =
      testKit.createTestProbe(Device.TemperatureRecorded.class);
  registered1.device.tell(new Device.RecordTemperature(0L, 1.0, recordProbe.getRef()));
  assertEquals(0L, recordProbe.receiveMessage().requestId);
  registered2.device.tell(new Device.RecordTemperature(1L, 2.0, recordProbe.getRef()));
  assertEquals(1L, recordProbe.receiveMessage().requestId);
}

@Test
public void testIgnoreWrongRegistrationRequests() {
  TestProbe<DeviceRegistered> probe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));
  groupActor.tell(new RequestTrackDevice("wrongGroup", "device1", probe.getRef()));
  probe.expectNoMessage();
}
```

### Example 7: Handling the registration request

```scala
"return same actor for same deviceId" in {
  val probe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", probe.ref)
  val registered1 = probe.receiveMessage()

  // registering same again should be idempotent
  groupActor ! RequestTrackDevice("group", "device1", probe.ref)
  val registered2 = probe.receiveMessage()

  registered1.device should ===(registered2.device)
}
```

### Example 8: Handling the registration request

```java
@Test
public void testReturnSameActorForSameDeviceId() {
  TestProbe<DeviceRegistered> probe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device", probe.getRef()));
  DeviceRegistered registered1 = probe.receiveMessage();

  // registering same again should be idempotent
  groupActor.tell(new RequestTrackDevice("group", "device", probe.getRef()));
  DeviceRegistered registered2 = probe.receiveMessage();
  assertEquals(registered1.device, registered2.device);
}
```

### Example 9: Keeping track of the device actors in the group

```scala
class DeviceGroup(context: ActorContext[DeviceGroup.Command], groupId: String)
    extends AbstractBehavior[DeviceGroup.Command](context) {
  import DeviceGroup._
  import DeviceManager.{ DeviceRegistered, ReplyDeviceList, RequestDeviceList, RequestTrackDevice }

  private var deviceIdToActor = Map.empty[String, ActorRef[Device.Command]]

  context.log.info("DeviceGroup {} started", groupId)

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case trackMsg @ RequestTrackDevice(`groupId`, deviceId, replyTo) =>
        deviceIdToActor.get(deviceId) match {
          case Some(deviceActor) =>
            replyTo ! DeviceRegistered(deviceActor)
          case None =>
            context.log.info("Creating device actor for {}", trackMsg.deviceId)
            val deviceActor = context.spawn(Device(groupId, deviceId), s"device-$deviceId")
            context.watchWith(deviceActor, DeviceTerminated(deviceActor, groupId, deviceId))
            deviceIdToActor += deviceId -> deviceActor
            replyTo ! DeviceRegistered(deviceActor)
        }
        this

      case RequestTrackDevice(gId, _, _) =>
        context.log.warn("Ignoring TrackDevice request for {}. This actor is responsible for {}.", gId, groupId)
        this

      case DeviceTerminated(_, _, deviceId) =>
        context.log.info("Device actor for {} has been terminated", deviceId)
        deviceIdToActor -= deviceId
        this

    }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("DeviceGroup {} stopped", groupId)
      this
  }
}
```

### Example 10: Keeping track of the device actors in the group

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

  private DeviceGroup onTrackDevice(DeviceManager.RequestTrackDevice trackMsg) {
    if (this.groupId.equals(trackMsg.groupId)) {
      ActorRef<Device.Command> deviceActor = deviceIdToActor.get(trackMsg.deviceId);
      if (deviceActor != null) {
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      } else {
        getContext().getLog().info("Creating device actor for {}", trackMsg.deviceId);
        deviceActor =
            getContext()
                .spawn(Device.create(groupId, trackMsg.deviceId), "device-" + trackMsg.deviceId);
        getContext()
            .watchWith(deviceActor, new DeviceTerminated(deviceActor, groupId, trackMsg.deviceId));
        deviceIdToActor.put(trackMsg.deviceId, deviceActor);
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      }
    } else {
      getContext()
          .getLog()
          .warn(
              "Ignoring TrackDevice request for {}. This actor is responsible for {}.",
              groupId,
              this.groupId);
    }
    return this;
  }


  private DeviceGroup onTerminated(DeviceTerminated t) {
    getContext().getLog().info("Device actor for {} has been terminated", t.deviceId);
    deviceIdToActor.remove(t.deviceId);
    return this;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(DeviceManager.RequestTrackDevice.class, this::onTrackDevice)
        .onMessage(DeviceTerminated.class, this::onTerminated)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private DeviceGroup onPostStop() {
    getContext().getLog().info("DeviceGroup {} stopped", groupId);
    return this;
  }
}
```

### Example 11: Keeping track of the device actors in the group

```scala
final case class RequestDeviceList(requestId: Long, groupId: String, replyTo: ActorRef[ReplyDeviceList])
    extends DeviceManager.Command
    with DeviceGroup.Command

final case class ReplyDeviceList(requestId: Long, ids: Set[String])
```

### Example 12: Keeping track of the device actors in the group

```java
public static final class RequestDeviceList
    implements DeviceManager.Command, DeviceGroup.Command {
  final long requestId;
  final String groupId;
  final ActorRef<ReplyDeviceList> replyTo;

  public RequestDeviceList(long requestId, String groupId, ActorRef<ReplyDeviceList> replyTo) {
    this.requestId = requestId;
    this.groupId = groupId;
    this.replyTo = replyTo;
  }
}

public static final class ReplyDeviceList {
  final long requestId;
  final Set<String> ids;

  public ReplyDeviceList(long requestId, Set<String> ids) {
    this.requestId = requestId;
    this.ids = ids;
  }
}
```

### Example 13: Keeping track of the device actors in the group

```scala
object DeviceGroup {
  def apply(groupId: String): Behavior[Command] =
    Behaviors.setup(context => new DeviceGroup(context, groupId))

  trait Command

  private final case class DeviceTerminated(device: ActorRef[Device.Command], groupId: String, deviceId: String)
      extends Command

}

class DeviceGroup(context: ActorContext[DeviceGroup.Command], groupId: String)
    extends AbstractBehavior[DeviceGroup.Command](context) {
  import DeviceGroup._
  import DeviceManager.{ DeviceRegistered, ReplyDeviceList, RequestDeviceList, RequestTrackDevice }

  private var deviceIdToActor = Map.empty[String, ActorRef[Device.Command]]

  context.log.info("DeviceGroup {} started", groupId)

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case trackMsg @ RequestTrackDevice(`groupId`, deviceId, replyTo) =>
        deviceIdToActor.get(deviceId) match {
          case Some(deviceActor) =>
            replyTo ! DeviceRegistered(deviceActor)
          case None =>
            context.log.info("Creating device actor for {}", trackMsg.deviceId)
            val deviceActor = context.spawn(Device(groupId, deviceId), s"device-$deviceId")
            context.watchWith(deviceActor, DeviceTerminated(deviceActor, groupId, deviceId))
            deviceIdToActor += deviceId -> deviceActor
            replyTo ! DeviceRegistered(deviceActor)
        }
        this

      case RequestTrackDevice(gId, _, _) =>
        context.log.warn("Ignoring TrackDevice request for {}. This actor is responsible for {}.", gId, groupId)
        this

      case RequestDeviceList(requestId, gId, replyTo) =>
        if (gId == groupId) {
          replyTo ! ReplyDeviceList(requestId, deviceIdToActor.keySet)
          this
        } else
          Behaviors.unhandled

      case DeviceTerminated(_, _, deviceId) =>
        context.log.info("Device actor for {} has been terminated", deviceId)
        deviceIdToActor -= deviceId
        this

    }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("DeviceGroup {} stopped", groupId)
      this
  }
}
```

### Example 14: Keeping track of the device actors in the group

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

  private DeviceGroup onTrackDevice(DeviceManager.RequestTrackDevice trackMsg) {
    if (this.groupId.equals(trackMsg.groupId)) {
      ActorRef<Device.Command> deviceActor = deviceIdToActor.get(trackMsg.deviceId);
      if (deviceActor != null) {
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      } else {
        getContext().getLog().info("Creating device actor for {}", trackMsg.deviceId);
        deviceActor =
            getContext()
                .spawn(Device.create(groupId, trackMsg.deviceId), "device-" + trackMsg.deviceId);
        getContext()
            .watchWith(deviceActor, new DeviceTerminated(deviceActor, groupId, trackMsg.deviceId));
        deviceIdToActor.put(trackMsg.deviceId, deviceActor);
        trackMsg.replyTo.tell(new DeviceManager.DeviceRegistered(deviceActor));
      }
    } else {
      getContext()
          .getLog()
          .warn(
              "Ignoring TrackDevice request for {}. This actor is responsible for {}.",
              groupId,
              this.groupId);
    }
    return this;
  }


  private DeviceGroup onDeviceList(DeviceManager.RequestDeviceList r) {
    r.replyTo.tell(new DeviceManager.ReplyDeviceList(r.requestId, deviceIdToActor.keySet()));
    return this;
  }

  private DeviceGroup onTerminated(DeviceTerminated t) {
    getContext().getLog().info("Device actor for {} has been terminated", t.deviceId);
    deviceIdToActor.remove(t.deviceId);
    return this;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(DeviceManager.RequestTrackDevice.class, this::onTrackDevice)
        .onMessage(
            DeviceManager.RequestDeviceList.class,
            r -> r.groupId.equals(groupId),
            this::onDeviceList)
        .onMessage(DeviceTerminated.class, this::onTerminated)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private DeviceGroup onPostStop() {
    getContext().getLog().info("DeviceGroup {} stopped", groupId);
    return this;
  }
}
```

### Example 15: Keeping track of the device actors in the group

```scala
case object Passivate extends Command
```

### Example 16: Keeping track of the device actors in the group

```java
static enum Passivate implements Command {
  INSTANCE
}
```

### Example 17: Keeping track of the device actors in the group

```scala
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

  case object Passivate extends Command
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

      case Passivate =>
        Behaviors.stopped
    }
  }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("Device actor {}-{} stopped", groupId, deviceId)
      this
  }

}
```

### Example 18: Keeping track of the device actors in the group

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

  static enum Passivate implements Command {
    INSTANCE
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
        .onMessage(Passivate.class, m -> Behaviors.stopped())
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

### Example 19: Keeping track of the device actors in the group

```scala
"be able to list active devices" in {
  val registeredProbe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", registeredProbe.ref)
  registeredProbe.receiveMessage()

  groupActor ! RequestTrackDevice("group", "device2", registeredProbe.ref)
  registeredProbe.receiveMessage()

  val deviceListProbe = createTestProbe[ReplyDeviceList]()
  groupActor ! RequestDeviceList(requestId = 0, groupId = "group", deviceListProbe.ref)
  deviceListProbe.expectMessage(ReplyDeviceList(requestId = 0, Set("device1", "device2")))
}

"be able to list active devices after one shuts down" in {
  val registeredProbe = createTestProbe[DeviceRegistered]()
  val groupActor = spawn(DeviceGroup("group"))

  groupActor ! RequestTrackDevice("group", "device1", registeredProbe.ref)
  val registered1 = registeredProbe.receiveMessage()
  val toShutDown = registered1.device

  groupActor ! RequestTrackDevice("group", "device2", registeredProbe.ref)
  registeredProbe.receiveMessage()

  val deviceListProbe = createTestProbe[ReplyDeviceList]()
  groupActor ! RequestDeviceList(requestId = 0, groupId = "group", deviceListProbe.ref)
  deviceListProbe.expectMessage(ReplyDeviceList(requestId = 0, Set("device1", "device2")))

  toShutDown ! Passivate
  registeredProbe.expectTerminated(toShutDown, registeredProbe.remainingOrDefault)

  // using awaitAssert to retry because it might take longer for the groupActor
  // to see the Terminated, that order is undefined
  registeredProbe.awaitAssert {
    groupActor ! RequestDeviceList(requestId = 1, groupId = "group", deviceListProbe.ref)
    deviceListProbe.expectMessage(ReplyDeviceList(requestId = 1, Set("device2")))
  }
}
```

### Example 20: Keeping track of the device actors in the group

```java
@Test
public void testListActiveDevices() {
  TestProbe<DeviceRegistered> registeredProbe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device1", registeredProbe.getRef()));
  registeredProbe.receiveMessage();

  groupActor.tell(new RequestTrackDevice("group", "device2", registeredProbe.getRef()));
  registeredProbe.receiveMessage();

  TestProbe<ReplyDeviceList> deviceListProbe = testKit.createTestProbe(ReplyDeviceList.class);

  groupActor.tell(new RequestDeviceList(0L, "group", deviceListProbe.getRef()));
  ReplyDeviceList reply = deviceListProbe.receiveMessage();
  assertEquals(0L, reply.requestId);
  assertEquals(Stream.of("device1", "device2").collect(Collectors.toSet()), reply.ids);
}

@Test
public void testListActiveDevicesAfterOneShutsDown() {
  TestProbe<DeviceRegistered> registeredProbe = testKit.createTestProbe(DeviceRegistered.class);
  ActorRef<DeviceGroup.Command> groupActor = testKit.spawn(DeviceGroup.create("group"));

  groupActor.tell(new RequestTrackDevice("group", "device1", registeredProbe.getRef()));
  DeviceRegistered registered1 = registeredProbe.receiveMessage();

  groupActor.tell(new RequestTrackDevice("group", "device2", registeredProbe.getRef()));
  DeviceRegistered registered2 = registeredProbe.receiveMessage();

  ActorRef<Device.Command> toShutDown = registered1.device;

  TestProbe<ReplyDeviceList> deviceListProbe = testKit.createTestProbe(ReplyDeviceList.class);

  groupActor.tell(new RequestDeviceList(0L, "group", deviceListProbe.getRef()));
  ReplyDeviceList reply = deviceListProbe.receiveMessage();
  assertEquals(0L, reply.requestId);
  assertEquals(Stream.of("device1", "device2").collect(Collectors.toSet()), reply.ids);

  toShutDown.tell(Device.Passivate.INSTANCE);
  registeredProbe.expectTerminated(toShutDown, registeredProbe.getRemainingOrDefault());

  // using awaitAssert to retry because it might take longer for the groupActor
  // to see the Terminated, that order is undefined
  registeredProbe.awaitAssert(
      () -> {
        groupActor.tell(new RequestDeviceList(1L, "group", deviceListProbe.getRef()));
        ReplyDeviceList r = deviceListProbe.receiveMessage();
        assertEquals(1L, r.requestId);
        assertEquals(Stream.of("device2").collect(Collectors.toSet()), r.ids);
        return null;
      });
}
```

### Example 21: Creating device manager actors

```scala
object DeviceManager {
  def apply(): Behavior[Command] =
    Behaviors.setup(context => new DeviceManager(context))


  sealed trait Command

  final case class RequestTrackDevice(groupId: String, deviceId: String, replyTo: ActorRef[DeviceRegistered])
      extends DeviceManager.Command
      with DeviceGroup.Command

  final case class DeviceRegistered(device: ActorRef[Device.Command])

  final case class RequestDeviceList(requestId: Long, groupId: String, replyTo: ActorRef[ReplyDeviceList])
      extends DeviceManager.Command
      with DeviceGroup.Command

  final case class ReplyDeviceList(requestId: Long, ids: Set[String])

  private final case class DeviceGroupTerminated(groupId: String) extends DeviceManager.Command
}

class DeviceManager(context: ActorContext[DeviceManager.Command])
    extends AbstractBehavior[DeviceManager.Command](context) {
  import DeviceManager._

  var groupIdToActor = Map.empty[String, ActorRef[DeviceGroup.Command]]

  context.log.info("DeviceManager started")

  override def onMessage(msg: Command): Behavior[Command] =
    msg match {
      case trackMsg @ RequestTrackDevice(groupId, _, replyTo) =>
        groupIdToActor.get(groupId) match {
          case Some(ref) =>
            ref ! trackMsg
          case None =>
            context.log.info("Creating device group actor for {}", groupId)
            val groupActor = context.spawn(DeviceGroup(groupId), "group-" + groupId)
            context.watchWith(groupActor, DeviceGroupTerminated(groupId))
            groupActor ! trackMsg
            groupIdToActor += groupId -> groupActor
        }
        this

      case req @ RequestDeviceList(requestId, groupId, replyTo) =>
        groupIdToActor.get(groupId) match {
          case Some(ref) =>
            ref ! req
          case None =>
            replyTo ! ReplyDeviceList(requestId, Set.empty)
        }
        this

      case DeviceGroupTerminated(groupId) =>
        context.log.info("Device group actor for {} has been terminated", groupId)
        groupIdToActor -= groupId
        this
    }

  override def onSignal: PartialFunction[Signal, Behavior[Command]] = {
    case PostStop =>
      context.log.info("DeviceManager stopped")
      this
  }

}
```

### Example 22: Creating device manager actors

```java
public class DeviceManager extends AbstractBehavior<DeviceManager.Command> {

  public interface Command {}

  public static final class RequestTrackDevice
      implements DeviceManager.Command, DeviceGroup.Command {
    public final String groupId;
    public final String deviceId;
    public final ActorRef<DeviceRegistered> replyTo;

    public RequestTrackDevice(String groupId, String deviceId, ActorRef<DeviceRegistered> replyTo) {
      this.groupId = groupId;
      this.deviceId = deviceId;
      this.replyTo = replyTo;
    }
  }

  public static final class DeviceRegistered {
    public final ActorRef<Device.Command> device;

    public DeviceRegistered(ActorRef<Device.Command> device) {
      this.device = device;
    }
  }

  public static final class RequestDeviceList
      implements DeviceManager.Command, DeviceGroup.Command {
    final long requestId;
    final String groupId;
    final ActorRef<ReplyDeviceList> replyTo;

    public RequestDeviceList(long requestId, String groupId, ActorRef<ReplyDeviceList> replyTo) {
      this.requestId = requestId;
      this.groupId = groupId;
      this.replyTo = replyTo;
    }
  }

  public static final class ReplyDeviceList {
    final long requestId;
    final Set<String> ids;

    public ReplyDeviceList(long requestId, Set<String> ids) {
      this.requestId = requestId;
      this.ids = ids;
    }
  }

  private static class DeviceGroupTerminated implements DeviceManager.Command {
    public final String groupId;

    DeviceGroupTerminated(String groupId) {
      this.groupId = groupId;
    }
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(DeviceManager::new);
  }

  private final Map<String, ActorRef<DeviceGroup.Command>> groupIdToActor = new HashMap<>();

  private DeviceManager(ActorContext<Command> context) {
    super(context);
    context.getLog().info("DeviceManager started");
  }

  private DeviceManager onTrackDevice(RequestTrackDevice trackMsg) {
    String groupId = trackMsg.groupId;
    ActorRef<DeviceGroup.Command> ref = groupIdToActor.get(groupId);
    if (ref != null) {
      ref.tell(trackMsg);
    } else {
      getContext().getLog().info("Creating device group actor for {}", groupId);
      ActorRef<DeviceGroup.Command> groupActor =
          getContext().spawn(DeviceGroup.create(groupId), "group-" + groupId);
      getContext().watchWith(groupActor, new DeviceGroupTerminated(groupId));
      groupActor.tell(trackMsg);
      groupIdToActor.put(groupId, groupActor);
    }
    return this;
  }

  private DeviceManager onRequestDeviceList(RequestDeviceList request) {
    ActorRef<DeviceGroup.Command> ref = groupIdToActor.get(request.groupId);
    if (ref != null) {
      ref.tell(request);
    } else {
      request.replyTo.tell(new ReplyDeviceList(request.requestId, Collections.emptySet()));
    }
    return this;
  }

  private DeviceManager onTerminated(DeviceGroupTerminated t) {
    getContext().getLog().info("Device group actor for {} has been terminated", t.groupId);
    groupIdToActor.remove(t.groupId);
    return this;
  }

  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(RequestTrackDevice.class, this::onTrackDevice)
        .onMessage(RequestDeviceList.class, this::onRequestDeviceList)
        .onMessage(DeviceGroupTerminated.class, this::onTerminated)
        .onSignal(PostStop.class, signal -> onPostStop())
        .build();
  }

  private DeviceManager onPostStop() {
    getContext().getLog().info("DeviceManager stopped");
    return this;
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Terminated.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_3.html
- https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_5.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_4.html](https://doc.akka.io/libraries/akka-core/current/typed/guide/tutorial_4.html)*