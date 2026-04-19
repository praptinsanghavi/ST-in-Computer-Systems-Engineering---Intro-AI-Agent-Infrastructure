---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-edge/current/guide/5-charging-station.html
title: Drone Charging Station • Akka Edge
---

# Drone Charging Station • Akka Edge

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Drone Charging Station

To showcase active\-active replication between edge and cloud we’ll now add a [Replicated Event Sourced Entity](https://doc.akka.io/libraries/akka-projection/1.6/grpc-replicated-event-sourcing-transport.html) in the form of a charging station. The charging stations are created with a location id placing them in one of the local\-drone\-control edge services where the entity is replicated. Drones in that location can request to charge in the charging station, and be charged if there is a free charging slot.

## Implementing the charging station entity

### Commands and events

The charging station accepts three different commands from the outside `Create` to initialize a charging station, `StartCharging` to start a charging session for a drone if possible and `GetState` to query the station for its current state. There is also a private `CompleteCharging` command that only the entity can create.

The `Create` command leads to a `Created` event which is persisted and initialized the charging station.

When a slot is free and a drone requests charging a `ChargingStarted` event is persisted and once charging a drone has completed a `ChargingCompleted` event is persisted:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/src/main/scala/charging/ChargingStation.scala#L28-L48 "Go to snippet source")sealed trait Command extends CborSerializable
case class Create(
    locationId: String,
    chargingSlots: Int,
    replyTo: ActorRef[StatusReply[Done]])
    extends Command
case class StartCharging(
    droneId: String,
    replyTo: ActorRef[StatusReply[StartChargingResponse]])
    extends Command
sealed trait StartChargingResponse extends CborSerializable
case class AllSlotsBusy(firstSlotFreeAt: Instant)
    extends StartChargingResponse

case class GetState(replyTo: ActorRef[StatusReply[ChargingStation.State]])
    extends Command

case class CompleteCharging(
    droneId: String,
    reply: ActorRef[StatusReply[Done]])
    extends Command
sealed trait Event extends CborSerializable
case class Created(locationId: String, chargingSlots: Int) extends Event
case class ChargingStarted(droneId: String, expectedComplete: Instant)
    extends Event
    with StartChargingResponse

case class ChargingCompleted(droneId: String) extends Event
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-java/src/main/java/charging/ChargingStation.java#L30-L83 "Go to snippet source")public interface Command extends CborSerializable {}

public static final class Create implements Command {
  public final String locationId;
  public final int chargingSlots;
  public final ActorRef<StatusReply<Done>> replyTo;

  public Create(String locationId, int chargingSlots, ActorRef<StatusReply<Done>> replyTo) {
    this.locationId = locationId;
    this.chargingSlots = chargingSlots;
    this.replyTo = replyTo;
  }
}

public static final class StartCharging implements Command {
  public final String droneId;
  public final ActorRef<StatusReply<StartChargingResponse>> replyTo;

  public StartCharging(String droneId, ActorRef<StatusReply<StartChargingResponse>> replyTo) {
    this.droneId = droneId;
    this.replyTo = replyTo;
  }
}

public interface StartChargingResponse extends CborSerializable {}

public static final class AllSlotsBusy implements StartChargingResponse {
  public final Instant firstSlotFreeAt;

  @JsonCreator
  public AllSlotsBusy(Instant firstSlotFreeAt) {
    this.firstSlotFreeAt = firstSlotFreeAt;
  }
}

public static final class GetState implements Command {
  public final ActorRef<StatusReply<State>> replyTo;

  @JsonCreator
  public GetState(ActorRef<StatusReply<State>> replyTo) {
    this.replyTo = replyTo;
  }
}

public static final class CompleteCharging implements Command {
  final String droneId;

  final ActorRef<StatusReply<Done>> replyTo;

  public CompleteCharging(String droneId, ActorRef<StatusReply<Done>> replyTo) {
    this.droneId = droneId;
    this.replyTo = replyTo;
  }
}
public interface Event extends CborSerializable {}

public static final class Created implements Event {
  public final String locationId;
  public final int chargingSlots;

  public Created(String locationId, int chargingSlots) {
    this.locationId = locationId;
    this.chargingSlots = chargingSlots;
  }
}

public static final class ChargingStarted implements Event, StartChargingResponse {
  public final String droneId;
  public final Instant expectedComplete;

  public ChargingStarted(String droneId, Instant expectedComplete) {
    this.droneId = droneId;
    this.expectedComplete = expectedComplete;
  }
}

public static final class ChargingCompleted implements Event {
  public final String droneId;

  @JsonCreator
  public ChargingCompleted(String droneId) {
    this.droneId = droneId;
  }
}

public static final class ChargingDrone {
  public final String droneId;
  public final Instant expectedComplete;
  public final String replicaId;

  public ChargingDrone(String droneId, Instant expectedComplete, String replicaId) {
    this.droneId = droneId;
    this.expectedComplete = expectedComplete;
    this.replicaId = replicaId;
  }
}
```

### State

The state of the charging station starts as `null``None` and requires a `Create` message for the station to be initialized with a `State``Some(State)`.

The `State` contains the number of charging slots that can concurrently charge drones and a set of currently charging drones.

The state also contains a location id identifying where it is, matching the location id structure of the local\-drone\-control service. This is needed so that the station can be replicated only to the edge location where it is located.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/src/main/scala/charging/ChargingStation.scala#L62-L70 "Go to snippet source")case class ChargingDrone(
    droneId: String,
    expectedComplete: Instant,
    replicaId: String)
case class State(
    chargingSlots: Int,
    dronesCharging: Set[ChargingDrone],
    stationLocationId: String)
    extends CborSerializable
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-java/src/main/java/charging/ChargingStation.java#L132-L142 "Go to snippet source")public static final class State implements CborSerializable {
  public final int chargingSlots;
  public final Set<ChargingDrone> dronesCharging;
  public final String stationLocationId;

  public State(int chargingSlots, Set<ChargingDrone> dronesCharging, String stationLocationId) {
    this.chargingSlots = chargingSlots;
    this.dronesCharging = dronesCharging;
    this.stationLocationId = stationLocationId;
  }
}
```

### Command handler

The command handler is in fact two separate handlers, one for when the entity is not yet initialized, only accepting the `Create` command, and one that is used to handle commands once the station has been initialized.

The `StartCharging` command is the only one that requires more complicated logic: if a slot is free, persist a `ChargingStarted` event and tell the drone when charging will be done. If all charging slots are busy the reply will instead be when the first slot will be free again and the drone can come back and try charge again.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/src/main/scala/charging/ChargingStation.scala#L143-L226 "Go to snippet source")private def handleCommand(
    state: Option[State],
    command: Command): Effect[Event, Option[State]] =
  state match {
    case None        => handleCommandNoState(command)
    case Some(state) => handleCommandInitialized(state, command)
  }

private def handleCommandNoState(
    command: Command): Effect[Event, Option[State]] =
  command match {
    case Create(locationId, chargingSlots, replyTo) =>
      Effect
        .persist(Created(locationId, chargingSlots))
        .thenReply(replyTo)(_ => StatusReply.Ack)
    case StartCharging(_, replyTo) =>
      Effect.reply(replyTo)(
        StatusReply.Error(
          s"Charging station ${replicationContext.entityId} not initialized"))
    case GetState(replyTo) =>
      Effect.reply(replyTo)(
        StatusReply.Error(
          s"Charging station ${replicationContext.entityId} not initialized"))
    case unexpected =>
      context.log.warn(
        "Got an unexpected command {} but charging station with id {} not initialized",
        unexpected.getClass,
        replicationContext.entityId)
      Effect.none
  }

private def handleCommandInitialized(
    state: ChargingStation.State,
    command: ChargingStation.Command): Effect[Event, Option[State]] = {
  command match {
    case Create(_, _, replyTo) =>
      Effect.reply(replyTo)(StatusReply.Error(
        s"Got a create command, but station id ${replicationContext.entityId} was already created"))

    case StartCharging(droneId, replyTo) =>
      if (state.dronesCharging.exists(_.droneId == droneId)) {
        context.log.warn(
          "Drone {} requested charging but is already charging. Ignoring.",
          droneId)
        Effect.none
      } else if (state.dronesCharging.size >= state.chargingSlots) {
        val earliestFreeSlot =
          state.dronesCharging.map(_.expectedComplete).min
        context.log.info(
          "Drone {} requested charging but all stations busy, earliest free slot {}",
          droneId,
          earliestFreeSlot)
        Effect.reply(replyTo)(
          StatusReply.Success(AllSlotsBusy(earliestFreeSlot)))
      } else {
        // charge
        val expectedComplete =
          Instant.now().plusSeconds(FullChargeTime.toSeconds)
        context.log.info(
          "Drone {} requested charging, expected to complete charging at {}",
          droneId,
          expectedComplete)
        val event = ChargingStarted(droneId, expectedComplete)
        Effect
          .persist(event)
          .thenReply(replyTo)(_ => StatusReply.Success(event))
      }

    case CompleteCharging(droneId, replyTo) =>
      if (state.dronesCharging.exists(_.droneId == droneId)) {
        context.log.info("Drone {} completed charging", droneId)
        Effect
          .persist(ChargingCompleted(droneId))
          .thenReply(replyTo)(_ => StatusReply.Ack)
      } else {
        Effect.reply(replyTo)(
          StatusReply.error(s"Drone $droneId is not currently charging"))
      }

    case GetState(replyTo) =>
      Effect.reply(replyTo)(StatusReply.Success(state))

  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-java/src/main/java/charging/ChargingStation.java#L205-L318 "Go to snippet source")@Override
public CommandHandler<Command, Event, State> commandHandler() {
  var noStateHandler =
      newCommandHandlerBuilder()
          .forNullState()
          .onCommand(
              Create.class,
              (state, create) ->
                  Effect()
                      .persist(new Created(create.locationId, create.chargingSlots))
                      .thenReply(create.replyTo, stateAfter -> StatusReply.ack()))
          .onCommand(
              StartCharging.class,
              startCharging ->
                  Effect()
                      .reply(
                          startCharging.replyTo,
                          StatusReply.error(
                              "Charging station "
                                  + getReplicationContext().entityId()
                                  + " not initialized")))
          .onCommand(
              GetState.class,
              getState ->
                  Effect()
                      .reply(
                          getState.replyTo,
                          StatusReply.error(
                              "Charging station "
                                  + getReplicationContext().entityId()
                                  + " not initialized")))
          .onCommand(
              command -> true,
              unexpected -> {
                context
                    .getLog()
                    .warn(
                        "Got an unexpected command {} but charging station with id {} not initialized",
                        unexpected.getClass(),
                        getReplicationContext().entityId());
                return Effect().none();
              });

  var initializedHandler =
      newCommandHandlerBuilder()
          .forNonNullState()
          .onCommand(
              Create.class,
              create ->
                  Effect()
                      .reply(
                          create.replyTo,
                          StatusReply.error(
                              "Got a create command, but station id "
                                  + getReplicationContext().entityId()
                                  + " was already created")))
          .onCommand(StartCharging.class, this::handleStartCharging)
          .onCommand(CompleteCharging.class, this::handleCompleteCharging)
          .onCommand(
              GetState.class,
              (state, getState) -> Effect().reply(getState.replyTo, StatusReply.success(state)));

  return noStateHandler.orElse(initializedHandler).build();
}

private Effect<Event, State> handleStartCharging(State state, StartCharging startCharging) {
  if (state.dronesCharging.stream()
      .anyMatch(charging -> charging.droneId.equals(startCharging.droneId))) {
    return Effect().reply(startCharging.replyTo, StatusReply.error("Drone already charging"));
  } else if (state.dronesCharging.size() >= state.chargingSlots) {
    var earliestFreeSlot =
        state.dronesCharging.stream()
            .min(Comparator.comparing(chargingDrone -> chargingDrone.expectedComplete))
            .get()
            .expectedComplete;
    context
        .getLog()
        .info(
            "Drone {} requested charging but all stations busy, earliest free slot {}",
            startCharging.droneId,
            earliestFreeSlot);
    return Effect()
        .reply(startCharging.replyTo, StatusReply.success(new AllSlotsBusy(earliestFreeSlot)));
  } else {
    // charge
    var expectedComplete = Instant.now().plus(FULL_CHARGE_TIME);
    context
        .getLog()
        .info(
            "Drone {} requested charging, will complete charging at {}",
            startCharging.droneId,
            expectedComplete);
    var event = new ChargingStarted(startCharging.droneId, expectedComplete);
    return Effect()
        .persist(event)
        .thenReply(startCharging.replyTo, newState -> StatusReply.success(event));
  }
}

private Effect<Event, State> handleCompleteCharging(
    State state, CompleteCharging completeCharging) {
  context.getLog().info("Drone {} completed charging", completeCharging.droneId);
  if (state.dronesCharging.stream()
      .anyMatch(chargingDrone -> chargingDrone.droneId.equals(completeCharging.droneId)))
    return Effect()
        .persist(new ChargingCompleted(completeCharging.droneId))
        .thenReply(completeCharging.replyTo, newState -> StatusReply.ack());
  else
    return Effect()
        .reply(
            completeCharging.replyTo,
            StatusReply.error(
                "Drone " + completeCharging.droneId + " is not currently charging."));
}
```

### Event handler

Just like the command handler the event handler is different depending on if there is state or not. If there is no state only the `Created` event is accepted.

Once initialized the charging station expects `ChargingStarted` and `ChargingCompleted` events, additional `Created` events are ignored.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/src/main/scala/charging/ChargingStation.scala#L230-L259 "Go to snippet source")private def handleEvent(state: Option[State], event: Event): Option[State] = {
  state match {
    case None =>
      event match {
        case Created(locationId, chargingSlots) =>
          Some(State(chargingSlots, Set.empty, locationId))
        case unexpected =>
          throw new IllegalArgumentException(
            s"Got unexpected event ${unexpected} for uninitialized state")
      }

    case Some(state) =>
      event match {
        case Created(_, _) =>
          context.log.warn("Saw a second created event, ignoring")
          Some(state)
        case ChargingStarted(droneId, expectedComplete) =>
          Some(
            state.copy(dronesCharging = state.dronesCharging + ChargingDrone(
              droneId,
              expectedComplete,
              replicationContext.origin.id)))
        case ChargingCompleted(droneId) =>
          Some(
            state.copy(dronesCharging =
              state.dronesCharging.filterNot(_.droneId == droneId)))
      }

  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-java/src/main/java/charging/ChargingStation.java#L322-L369 "Go to snippet source")@Override
public EventHandler<State, Event> eventHandler() {
  var noStateHandler =
      newEventHandlerBuilder()
          .forNullState()
          .onEvent(
              Created.class,
              created ->
                  new State(created.chargingSlots, Collections.emptySet(), created.locationId));

  var initializedStateHandler =
      newEventHandlerBuilder()
          .forNonNullState()
          .onEvent(
              Created.class,
              (state, event) -> {
                context.getLog().warn("Saw a second created event, ignoring");
                return state;
              })
          .onEvent(
              ChargingStarted.class,
              (state, event) -> {
                var newSet = new HashSet<>(state.dronesCharging);
                newSet.add(
                    new ChargingDrone(
                        event.droneId,
                        event.expectedComplete,
                        getReplicationContext().origin().id()));
                return new State(
                    state.chargingSlots,
                    Collections.unmodifiableSet(newSet),
                    state.stationLocationId);
              })
          .onEvent(
              ChargingCompleted.class,
              (state, event) -> {
                var newSet =
                    state.dronesCharging.stream()
                        .filter(charging -> !charging.droneId.equals(event.droneId))
                        .collect(Collectors.toSet());
                return new State(
                    state.chargingSlots,
                    Collections.unmodifiableSet(newSet),
                    state.stationLocationId);
              });

  return noStateHandler.orElse(initializedStateHandler).build();
}
```

Note
The charging station is a very limited replicated entity example to keep the guide simple. It doesn’t expect any possible conflicts, stations are created, once, in the central cloud and replicated to the edge, updates related to drones currently charging in the station happen at the edge and are replicated to the cloud. Akka replicated event sourcing provides APIs for both CRDTs where conflicts are automatically handled by the data structure and business domain level conflict resolution. For more details about see the [Akka documentation](https://doc.akka.io/libraries/akka-core/2.10/typed/replicated-eventsourcing.html).

### Tagging based on location

To be able to control where the charging station is replicated we tag the events using the location id from the state as a topic:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/src/main/scala/charging/ChargingStation.scala#L136-L139 "Go to snippet source").withTaggerForState {
  case (None, _)        => Set.empty
  case (Some(state), _) => Set("t:" + state.stationLocationId)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-java/src/main/java/charging/ChargingStation.java#L373-L377 "Go to snippet source")@Override
public Set<String> tagsFor(State state, Event event) {
  if (state == null) return Set.of();
  else return Set.of("t:" + state.stationLocationId);
}
```

### Setting up replication for the charging station

Setup for the cloud replica and the edge node differs slightly. 

For the restaurant\-drone\-deliveries service running in the cloud we set up a `ReplicationSettings` with edge replication enabled:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/src/main/scala/charging/ChargingStation.scala#L100-L105 "Go to snippet source")def init(implicit system: ActorSystem[_]): Replication[Command] = {
  val replicationSettings =
    ReplicationSettings[Command](EntityType, R2dbcReplication())
      .withEdgeReplication(true)
  Replication.grpcReplication(replicationSettings)(ChargingStation.apply)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-java/src/main/java/charging/ChargingStation.java#L170-L176 "Go to snippet source")public static Replication<Command> init(ActorSystem<?> system) {
  var replicationSettings =
      ReplicationSettings.create(
              Command.class, ENTITY_TYPE, R2dbcReplication.create(system), system)
          .withEdgeReplication(true);
  return Replication.grpcReplication(replicationSettings, ChargingStation::create, system);
}
```

Since we have other events going over akka\-projection\-grpc producer push replication already in the restaurant\-drone\-deliveries service we need to combine all such sources and destinations into single gRPC services:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-scala/src/main/scala/central/Main.scala#L59-L74 "Go to snippet source")val chargingStationService = new ChargingStationServiceImpl(
  chargingStationReplication.entityRefFactory)

// delivery events and charging station replication both are Akka Projection gRPC event
// producers (pulled by the local drone control) and needs to be combined into a single gRPC service handling both:
val eventPullHandler = EventProducer.grpcServiceHandler(
  Set(
    deliveryEventsProducerSource,
    chargingStationReplication.eventProducerSource))

// the drone events from edge and the charging station replicated entity are both Akka Projection gRPC
// event push destinations (pushed by local drone control) and needs to be combined into a single gRPC service handling both:
val eventPushHandler = EventProducerPushDestination.grpcServiceHandler(
  Set(
    pushedEventsDestination,
    chargingStationReplication.eventProducerPushDestination.get))(system)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-java/src/main/java/central/Main.java#L55-L78 "Go to snippet source")var chargingStationService =
    new ChargingStationServiceImpl(
        settings,
        // FIXME java function type
        id -> chargingStationReplication.entityRefFactory().apply(id));

// delivery events and charging station replication both are Akka Projection gRPC event
// producers (pulled by the local drone control) and needs to be combined into a single gRPC
// service handling both:
var eventPullHandler =
    EventProducer.grpcServiceHandler(
        system,
        Set.of(deliveryEventsProducerSource, chargingStationReplication.eventProducerSource()));

// the drone events from edge and the charging station replicated entity are both Akka
// Projection gRPC
// event push destinations (pushed by local drone control) and needs to be combined into a
// single gRPC service handling both:
var eventPushHandler =
    EventProducerPushDestination.grpcServiceHandler(
        Set.of(
            pushedEventsDestination,
            chargingStationReplication.eventProducerPushDestination().get()),
        system);
```

For the local\-drone\-control service we also create `ReplicationSettings` but pass them to a separate initialization method `Replication.grpcEdgeReplication`. Since the edge node will be responsible for creating connections, no gRPC services needs to be bound: 

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/src/main/scala/charging/ChargingStation.scala#L82-L93 "Go to snippet source")def initEdge(locationId: String)(
    implicit system: ActorSystem[_]): EdgeReplication[Command] = {
  val replicationSettings =
    ReplicationSettings[Command](EntityType, R2dbcReplication())
      .withSelfReplicaId(ReplicaId(locationId))
      .withInitialConsumerFilter(
        // only replicate charging stations local to the edge system
        Seq(
          ConsumerFilter.excludeAll,
          ConsumerFilter.IncludeTopics(Set(locationId))))
  Replication.grpcEdgeReplication(replicationSettings)(ChargingStation.apply)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-java/src/main/java/charging/ChargingStation.java#L154-L165 "Go to snippet source")public static EdgeReplication<Command> initEdge(ActorSystem<?> system, String locationId) {
  var replicationSettings =
      ReplicationSettings.create(
              Command.class, ENTITY_TYPE, R2dbcReplication.create(system), system)
          .withSelfReplicaId(new ReplicaId(locationId))
          .withInitialConsumerFilter(
              List.of(
                  // only replicate charging stations local to the edge system
                  ConsumerFilter.excludeAll(),
                  new ConsumerFilter.IncludeTopics(Set.of(locationId))));
  return Replication.grpcEdgeReplication(replicationSettings, ChargingStation::create, system);
}
```

The returned `EdgeReplication` instance gives us access to a `entityRefFactory` for sending messages to the charging stations.

## Service for interacting with the charging station

In the restaurant\-drone\-deliveries service we introduce a separate gRPC endpoint for creating and looking at charging station state:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-java/src/main/protobuf/charging/charging_station_api.proto "Go to snippet source")syntax = "proto3";

option java_multiple_files = true;
option java_package = "charging.proto";

import "google/protobuf/timestamp.proto";

package charging;

service ChargingStationService {
  rpc CreateChargingStation(CreateChargingStationRequest) returns (CreateChargingStationResponse) {}
  rpc GetChargingStationState(GetChargingStationStateRequest) returns (GetChargingStationStateResponse) {}
}

message CreateChargingStationRequest {
  // unique identifier for the charging station
  string charging_station_id = 1;
  // location of the station
  string location_id = 2;
  // number of parallel charging slots for drones
  uint32 charging_slots = 3;
}

message CreateChargingStationResponse {
}

message GetChargingStationStateRequest {
  string charging_station_id = 1;
}

message GetChargingStationStateResponse {
  // location of the station
  string location_id = 1;
  // number of parallel charging slots for drones
  uint32 charging_slots = 2;
  // drones currently at the station charging
  repeated ChargingDrone currently_charging_drones = 3;
}

message ChargingDrone {
  string drone_id = 1;
  // timestamp when charging is estimated to complete
  google.protobuf.Timestamp expected_complete = 2;
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-scala/src/main/protobuf/charging/charging_station_api.proto "Go to snippet source")syntax = "proto3";

option java_multiple_files = true;
option java_package = "charging.proto";

import "google/protobuf/timestamp.proto";

package charging;

service ChargingStationService {
  rpc CreateChargingStation(CreateChargingStationRequest) returns (CreateChargingStationResponse) {}
  rpc GetChargingStationState(GetChargingStationStateRequest) returns (GetChargingStationStateResponse) {}
}

message CreateChargingStationRequest {
  // unique identifier for the charging station
  string charging_station_id = 1;
  // location of the station
  string location_id = 2;
  // number of parallel charging slots for drones
  uint32 charging_slots = 3;
}

message CreateChargingStationResponse {
}

message GetChargingStationStateRequest {
  string charging_station_id = 1;
}

message GetChargingStationStateResponse {
  // location of the station
  string location_id = 1;
  // number of parallel charging slots for drones
  uint32 charging_slots = 2;
  // drones currently at the station charging
  repeated ChargingDrone currently_charging_drones = 3;
}

message ChargingDrone {
  string drone_id = 1;
  // timestamp when charging is estimated to complete
  google.protobuf.Timestamp expected_complete = 2;
}
```

The service implementation takes the `entityRefFactory` as a constructor parameter and uses that to create `EntityRef` instances for specific charging stations to interact with them:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-scala/src/main/scala/charging/ChargingStationServiceImpl.scala "Go to snippet source")package charging

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.EntityRef
import akka.util.Timeout
import charging.proto
import com.google.protobuf.timestamp.Timestamp
import org.slf4j.LoggerFactory

import scala.concurrent.Future
import scala.concurrent.duration.DurationInt

class ChargingStationServiceImpl(
    entityRefFactory: String => EntityRef[ChargingStation.Command])(
    implicit val system: ActorSystem[_])
    extends proto.ChargingStationService {
  private final val log = LoggerFactory.getLogger(getClass)
  import system.executionContext
  // FIXME separate setting
  implicit val askTimeout: Timeout = 3.seconds

  override def createChargingStation(in: proto.CreateChargingStationRequest)
      : Future[proto.CreateChargingStationResponse] = {
    log.info(
      "Creating charging station {} with {} charging slots, in location {}",
      in.chargingStationId,
      in.chargingSlots,
      in.locationId)

    val entityRef = entityRefFactory(in.chargingStationId)
    entityRef
      .ask(ChargingStation.Create(in.locationId, in.chargingSlots, _))
      .map(_ => proto.CreateChargingStationResponse.defaultInstance)

  }

  override def getChargingStationState(in: proto.GetChargingStationStateRequest)
      : Future[proto.GetChargingStationStateResponse] = {
    log.info("Get charging station {} state", in.chargingStationId)
    val entityRef = entityRefFactory(in.chargingStationId)
    entityRef
      .askWithStatus(ChargingStation.GetState.apply)
      .map(state =>
        proto.GetChargingStationStateResponse(
          locationId = state.stationLocationId,
          chargingSlots = state.chargingSlots,
          currentlyChargingDrones = state.dronesCharging
            .map(d =>
              proto.ChargingDrone(
                droneId = d.droneId,
                expectedComplete = Some(Timestamp(d.expectedComplete))))
            .toSeq))
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/restaurant-drone-deliveries-service-java/src/main/java/charging/ChargingStationServiceImpl.java "Go to snippet source")package charging;

import akka.Done;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.grpc.GrpcServiceException;
import central.DeliveriesSettings;
import charging.proto.*;
import com.google.protobuf.Timestamp;
import io.grpc.Status;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChargingStationServiceImpl implements ChargingStationService {

  private static final Logger logger = LoggerFactory.getLogger(ChargingStationServiceImpl.class);

  private final Function<String, EntityRef<ChargingStation.Command>> entityRefFactory;
  private final Duration askTimeout;

  public ChargingStationServiceImpl(
      DeliveriesSettings settings,
      Function<String, EntityRef<ChargingStation.Command>> entityRefFactory) {
    this.entityRefFactory = entityRefFactory;
    // FIXME separate setting
    this.askTimeout = settings.droneAskTimeout;
  }

  @Override
  public CompletionStage<CreateChargingStationResponse> createChargingStation(
      CreateChargingStationRequest in) {
    logger.info(
        "Creating charging station {} with {} charging slots, in location {}",
        in.getChargingStationId(),
        in.getChargingSlots(),
        in.getLocationId());

    var entityRef = entityRefFactory.apply(in.getChargingStationId());

    CompletionStage<Done> chargingStationReply =
        entityRef.askWithStatus(
            replyTo ->
                new ChargingStation.Create(in.getLocationId(), in.getChargingSlots(), replyTo),
            askTimeout);

    var response =
        chargingStationReply.thenApply(done -> CreateChargingStationResponse.getDefaultInstance());

    return convertError(response);
  }

  @Override
  public CompletionStage<GetChargingStationStateResponse> getChargingStationState(
      GetChargingStationStateRequest in) {
    logger.info("Get charging station {} state", in.getChargingStationId());
    var entityRef = entityRefFactory.apply(in.getChargingStationId());
    return entityRef
        .askWithStatus(ChargingStation.GetState::new, askTimeout)
        .thenApply(
            state ->
                GetChargingStationStateResponse.newBuilder()
                    .setLocationId(state.stationLocationId)
                    .setChargingSlots(state.chargingSlots)
                    .addAllCurrentlyChargingDrones(
                        state.dronesCharging.stream()
                            .map(
                                d ->
                                    ChargingDrone.newBuilder()
                                        .setDroneId(d.droneId)
                                        .setExpectedComplete(
                                            instantToProtoTimestamp(d.expectedComplete))
                                        .build())
                            .collect(Collectors.toList()))
                    .build());
  }

  private static Timestamp instantToProtoTimestamp(Instant instant) {
    return Timestamp.newBuilder()
        .setSeconds(instant.getEpochSecond())
        .setNanos(instant.getNano())
        .build();
  }

  private <T> CompletionStage<T> convertError(CompletionStage<T> response) {
    return response.exceptionally(
        error -> {
          if (error instanceof TimeoutException) {
            throw new GrpcServiceException(
                Status.UNAVAILABLE.withDescription("Operation timed out"));
          } else {
            throw new GrpcServiceException(Status.INTERNAL.withDescription(error.getMessage()));
          }
        });
  }
}
```

## Interacting with the charging station at the edge

The local\-drone\-control service does not contain the full gRPC API for creating and inspecting charging stations but instead two methods in the drone gRPC service `goCharge` to initiate charging of a drone if possible and `completeCharge` to complete a charging session for a given drone:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-scala/src/main/scala/local/drones/DroneServiceImpl.scala#L91-L127 "Go to snippet source")override def goCharge(
    in: proto.GoChargeRequest): Future[proto.ChargingResponse] = {
  logger.info(
    "Requesting charge of {} from {}",
    in.droneId,
    in.chargingStationId)
  val entityRef = chargingStationEntityRefFactory(in.chargingStationId)
  val response = entityRef
    .askWithStatus[ChargingStation.StartChargingResponse](
      ChargingStation.StartCharging(in.droneId, _))
    .map {
      case ChargingStation.ChargingStarted(_, expectedComplete) =>
        proto.ChargingResponse(
          proto.ChargingResponse.Response.Started(
            proto.ChargingStarted(Some(Timestamp(expectedComplete)))))
      case ChargingStation.AllSlotsBusy(comeBackAt) =>
        proto.ChargingResponse(
          proto.ChargingResponse.Response
            .ComeBackLater(proto.ComeBackLater(Some(Timestamp(comeBackAt)))))
    }
  convertError(response)
}

override def completeCharge(in: proto.CompleteChargeRequest)
    : Future[proto.CompleteChargingResponse] = {
  logger.info(
    "Requesting complete charging of {} from {}",
    in.droneId,
    in.chargingStationId)

  val entityRef = chargingStationEntityRefFactory(in.chargingStationId)
  val response = entityRef
    .askWithStatus(ChargingStation.CompleteCharging(in.droneId, _))
    .map(_ => proto.CompleteChargingResponse.defaultInstance)

  convertError(response)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/local-drone-control-java/src/main/java/local/drones/DroneServiceImpl.java#L126-L179 "Go to snippet source")@Override
public CompletionStage<ChargingResponse> goCharge(GoChargeRequest in) {
  logger.info("Requesting charge of {} from {}", in.getDroneId(), in.getChargingStationId());
  var entityRef = chargingStationEntityRefFactory.apply(in.getChargingStationId());

  CompletionStage<ChargingStation.StartChargingResponse> chargingStationResponse =
      entityRef.askWithStatus(
          replyTo -> new ChargingStation.StartCharging(in.getDroneId(), replyTo),
          settings.askTimeout);

  var response =
      chargingStationResponse.thenApply(
          message -> {
            if (message instanceof ChargingStation.ChargingStarted) {
              var expectedComplete = ((ChargingStation.ChargingStarted) message).expectedComplete;
              return ChargingResponse.newBuilder()
                  .setStarted(
                      ChargingStarted.newBuilder()
                          .setExpectedComplete(instantToProtoTimestamp(expectedComplete))
                          .build())
                  .build();
            } else if (message instanceof ChargingStation.AllSlotsBusy) {
              var firstSlotFreeAt = ((ChargingStation.AllSlotsBusy) message).firstSlotFreeAt;
              return ChargingResponse.newBuilder()
                  .setComeBackLater(
                      ComeBackLater.newBuilder()
                          .setFirstSlotFreeAt(instantToProtoTimestamp(firstSlotFreeAt))
                          .build())
                  .build();
            } else {
              throw new IllegalArgumentException(
                  "Unexpected response type " + message.getClass());
            }
          });

  return convertError(response);
}

@Override
public CompletionStage<CompleteChargingResponse> completeCharge(CompleteChargeRequest in) {
  logger.info(
      "Requesting complete charging of {} from {}", in.getDroneId(), in.getChargingStationId());
  var entityRef = chargingStationEntityRefFactory.apply(in.getChargingStationId());

  CompletionStage<Done> chargingStationResponse =
      entityRef.askWithStatus(
          replyTo -> new ChargingStation.CompleteCharging(in.getDroneId(), replyTo),
          settings.askTimeout);

  var response =
      chargingStationResponse.thenApply(done -> CompleteChargingResponse.getDefaultInstance());

  return convertError(response);
}
```

## Running

The complete sample can be downloaded from GitHub, but note that it also includes the next steps of the guide:

- Scala [drone\-scala.zip](../attachments/drone-scala.zip)
- Java [drone\-java.zip](../attachments/drone-java.zip)

As this service consumes events from the service built in the previous step, start the local\-drone\-control service first:

To start the local\-drone\-control\-service:

```
sbt run

```

```
mvn compile exec:exec

```

Then start the drone\-restaurant\-deliveries\-service.

As the service needs a PostgreSQL instance running, start that up in a docker container and create the database schema if you did not do that in a previous step of the guide:

```
docker compose up --wait
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql

```

Then start the service:

```
sbt -Dconfig.resource=local1.conf run

```

And optionally one or two more Akka cluster nodes, but note that the local drone controls are statically configured to the gRPC port of the first and will only publish events to that node.

```
sbt -Dconfig.resource=local2.conf run
sbt -Dconfig.resource=local3.conf run

```

```
mvn compile exec:exec -DAPP_CONFIG=local1.conf

```

And optionally one or two more Akka cluster nodes, but note that the local drone controls are statically configured to the gRPC port of the first and will only publish events to that node.

```
mvn compile exec:exec -DAPP_CONFIG=local2.conf
mvn compile exec:exec -DAPP_CONFIG=local3.conf

```

Set up a replicated charging station in the cloud service using [grpcurl](https://github.com/fullstorydev/grpcurl):

```
grpcurl -d '{"charging_station_id":"station1","location_id": "sweden/stockholm/kungsholmen", "charging_slots": 4}' -plaintext localhost:8101 charging.ChargingStationService.CreateChargingStation

```

Ask to charge the drone with id `drone1` at the charging station in the edge service:

```
grpcurl -d '{"drone_id":"drone1","charging_station_id":"station1"}' -plaintext 127.0.0.1:8080 local.drones.DroneService.GoCharge

```

Inspect the state of the charging station in the cloud service to see the charging drone replicated there:

```
grpcurl -d '{"charging_station_id":"station1"}' -plaintext localhost:8101 charging.ChargingStationService.GetChargingStationState

```

Inform the station that the drone completed charging:

```
grpcurl -d '{"drone_id":"drone1","charging_station_id":"station1"}' -plaintext 127.0.0.1:8080 local.drones.DroneService.CompleteCharge

```

Again query the restaurant\-drone\-deliveries charge station inspection command to see the set of charging drones changing again:

```
grpcurl -d '{"charging_station_id":"station1"}' -plaintext localhost:8101 charging.ChargingStationService.GetChargingStationState

```

## Code Examples

### Example 1: Commands and events

```scala
sealed trait Command extends CborSerializable
case class Create(
    locationId: String,
    chargingSlots: Int,
    replyTo: ActorRef[StatusReply[Done]])
    extends Command
case class StartCharging(
    droneId: String,
    replyTo: ActorRef[StatusReply[StartChargingResponse]])
    extends Command
sealed trait StartChargingResponse extends CborSerializable
case class AllSlotsBusy(firstSlotFreeAt: Instant)
    extends StartChargingResponse

case class GetState(replyTo: ActorRef[StatusReply[ChargingStation.State]])
    extends Command

case class CompleteCharging(
    droneId: String,
    reply: ActorRef[StatusReply[Done]])
    extends Command
sealed trait Event extends CborSerializable
case class Created(locationId: String, chargingSlots: Int) extends Event
case class ChargingStarted(droneId: String, expectedComplete: Instant)
    extends Event
    with StartChargingResponse

case class ChargingCompleted(droneId: String) extends Event
```

### Example 2: Commands and events

```java
public interface Command extends CborSerializable {}

public static final class Create implements Command {
  public final String locationId;
  public final int chargingSlots;
  public final ActorRef<StatusReply<Done>> replyTo;

  public Create(String locationId, int chargingSlots, ActorRef<StatusReply<Done>> replyTo) {
    this.locationId = locationId;
    this.chargingSlots = chargingSlots;
    this.replyTo = replyTo;
  }
}

public static final class StartCharging implements Command {
  public final String droneId;
  public final ActorRef<StatusReply<StartChargingResponse>> replyTo;

  public StartCharging(String droneId, ActorRef<StatusReply<StartChargingResponse>> replyTo) {
    this.droneId = droneId;
    this.replyTo = replyTo;
  }
}

public interface StartChargingResponse extends CborSerializable {}

public static final class AllSlotsBusy implements StartChargingResponse {
  public final Instant firstSlotFreeAt;

  @JsonCreator
  public AllSlotsBusy(Instant firstSlotFreeAt) {
    this.firstSlotFreeAt = firstSlotFreeAt;
  }
}

public static final class GetState implements Command {
  public final ActorRef<StatusReply<State>> replyTo;

  @JsonCreator
  public GetState(ActorRef<StatusReply<State>> replyTo) {
    this.replyTo = replyTo;
  }
}

public static final class CompleteCharging implements Command {
  final String droneId;

  final ActorRef<StatusReply<Done>> replyTo;

  public CompleteCharging(String droneId, ActorRef<StatusReply<Done>> replyTo) {
    this.droneId = droneId;
    this.replyTo = replyTo;
  }
}
public interface Event extends CborSerializable {}

public static final class Created implements Event {
  public final String locationId;
  public final int chargingSlots;

  public Created(String locationId, int chargingSlots) {
    this.locationId = locationId;
    this.chargingSlots = chargingSlots;
  }
}

public static final class ChargingStarted implements Event, StartChargingResponse {
  public final String droneId;
  public final Instant expectedComplete;

  public ChargingStarted(String droneId, Instant expectedComplete) {
    this.droneId = droneId;
    this.expectedComplete = expectedComplete;
  }
}

public static final class ChargingCompleted implements Event {
  public final String droneId;

  @JsonCreator
  public ChargingCompleted(String droneId) {
    this.droneId = droneId;
  }
}

public static final class ChargingDrone {
  public final String droneId;
  public final Instant expectedComplete;
  public final String replicaId;

  public ChargingDrone(String droneId, Instant expectedComplete, String replicaId) {
    this.droneId = droneId;
    this.expectedComplete = expectedComplete;
    this.replicaId = replicaId;
  }
}
```

### Example 3: State

```scala
case class ChargingDrone(
    droneId: String,
    expectedComplete: Instant,
    replicaId: String)
case class State(
    chargingSlots: Int,
    dronesCharging: Set[ChargingDrone],
    stationLocationId: String)
    extends CborSerializable
```

### Example 4: State

```java
public static final class State implements CborSerializable {
  public final int chargingSlots;
  public final Set<ChargingDrone> dronesCharging;
  public final String stationLocationId;

  public State(int chargingSlots, Set<ChargingDrone> dronesCharging, String stationLocationId) {
    this.chargingSlots = chargingSlots;
    this.dronesCharging = dronesCharging;
    this.stationLocationId = stationLocationId;
  }
}
```

### Example 5: Command handler

```scala
private def handleCommand(
    state: Option[State],
    command: Command): Effect[Event, Option[State]] =
  state match {
    case None        => handleCommandNoState(command)
    case Some(state) => handleCommandInitialized(state, command)
  }

private def handleCommandNoState(
    command: Command): Effect[Event, Option[State]] =
  command match {
    case Create(locationId, chargingSlots, replyTo) =>
      Effect
        .persist(Created(locationId, chargingSlots))
        .thenReply(replyTo)(_ => StatusReply.Ack)
    case StartCharging(_, replyTo) =>
      Effect.reply(replyTo)(
        StatusReply.Error(
          s"Charging station ${replicationContext.entityId} not initialized"))
    case GetState(replyTo) =>
      Effect.reply(replyTo)(
        StatusReply.Error(
          s"Charging station ${replicationContext.entityId} not initialized"))
    case unexpected =>
      context.log.warn(
        "Got an unexpected command {} but charging station with id {} not initialized",
        unexpected.getClass,
        replicationContext.entityId)
      Effect.none
  }

private def handleCommandInitialized(
    state: ChargingStation.State,
    command: ChargingStation.Command): Effect[Event, Option[State]] = {
  command match {
    case Create(_, _, replyTo) =>
      Effect.reply(replyTo)(StatusReply.Error(
        s"Got a create command, but station id ${replicationContext.entityId} was already created"))

    case StartCharging(droneId, replyTo) =>
      if (state.dronesCharging.exists(_.droneId == droneId)) {
        context.log.warn(
          "Drone {} requested charging but is already charging. Ignoring.",
          droneId)
        Effect.none
      } else if (state.dronesCharging.size >= state.chargingSlots) {
        val earliestFreeSlot =
          state.dronesCharging.map(_.expectedComplete).min
        context.log.info(
          "Drone {} requested charging but all stations busy, earliest free slot {}",
          droneId,
          earliestFreeSlot)
        Effect.reply(replyTo)(
          StatusReply.Success(AllSlotsBusy(earliestFreeSlot)))
      } else {
        // charge
        val expectedComplete =
          Instant.now().plusSeconds(FullChargeTime.toSeconds)
        context.log.info(
          "Drone {} requested charging, expected to complete charging at {}",
          droneId,
          expectedComplete)
        val event = ChargingStarted(droneId, expectedComplete)
        Effect
          .persist(event)
          .thenReply(replyTo)(_ => StatusReply.Success(event))
      }

    case CompleteCharging(droneId, replyTo) =>
      if (state.dronesCharging.exists(_.droneId == droneId)) {
        context.log.info("Drone {} completed charging", droneId)
        Effect
          .persist(ChargingCompleted(droneId))
          .thenReply(replyTo)(_ => StatusReply.Ack)
      } else {
        Effect.reply(replyTo)(
          StatusReply.error(s"Drone $droneId is not currently charging"))
      }

    case GetState(replyTo) =>
      Effect.reply(replyTo)(StatusReply.Success(state))

  }
}
```

### Example 6: Command handler

```java
@Override
public CommandHandler<Command, Event, State> commandHandler() {
  var noStateHandler =
      newCommandHandlerBuilder()
          .forNullState()
          .onCommand(
              Create.class,
              (state, create) ->
                  Effect()
                      .persist(new Created(create.locationId, create.chargingSlots))
                      .thenReply(create.replyTo, stateAfter -> StatusReply.ack()))
          .onCommand(
              StartCharging.class,
              startCharging ->
                  Effect()
                      .reply(
                          startCharging.replyTo,
                          StatusReply.error(
                              "Charging station "
                                  + getReplicationContext().entityId()
                                  + " not initialized")))
          .onCommand(
              GetState.class,
              getState ->
                  Effect()
                      .reply(
                          getState.replyTo,
                          StatusReply.error(
                              "Charging station "
                                  + getReplicationContext().entityId()
                                  + " not initialized")))
          .onCommand(
              command -> true,
              unexpected -> {
                context
                    .getLog()
                    .warn(
                        "Got an unexpected command {} but charging station with id {} not initialized",
                        unexpected.getClass(),
                        getReplicationContext().entityId());
                return Effect().none();
              });

  var initializedHandler =
      newCommandHandlerBuilder()
          .forNonNullState()
          .onCommand(
              Create.class,
              create ->
                  Effect()
                      .reply(
                          create.replyTo,
                          StatusReply.error(
                              "Got a create command, but station id "
                                  + getReplicationContext().entityId()
                                  + " was already created")))
          .onCommand(StartCharging.class, this::handleStartCharging)
          .onCommand(CompleteCharging.class, this::handleCompleteCharging)
          .onCommand(
              GetState.class,
              (state, getState) -> Effect().reply(getState.replyTo, StatusReply.success(state)));

  return noStateHandler.orElse(initializedHandler).build();
}

private Effect<Event, State> handleStartCharging(State state, StartCharging startCharging) {
  if (state.dronesCharging.stream()
      .anyMatch(charging -> charging.droneId.equals(startCharging.droneId))) {
    return Effect().reply(startCharging.replyTo, StatusReply.error("Drone already charging"));
  } else if (state.dronesCharging.size() >= state.chargingSlots) {
    var earliestFreeSlot =
        state.dronesCharging.stream()
            .min(Comparator.comparing(chargingDrone -> chargingDrone.expectedComplete))
            .get()
            .expectedComplete;
    context
        .getLog()
        .info(
            "Drone {} requested charging but all stations busy, earliest free slot {}",
            startCharging.droneId,
            earliestFreeSlot);
    return Effect()
        .reply(startCharging.replyTo, StatusReply.success(new AllSlotsBusy(earliestFreeSlot)));
  } else {
    // charge
    var expectedComplete = Instant.now().plus(FULL_CHARGE_TIME);
    context
        .getLog()
        .info(
            "Drone {} requested charging, will complete charging at {}",
            startCharging.droneId,
            expectedComplete);
    var event = new ChargingStarted(startCharging.droneId, expectedComplete);
    return Effect()
        .persist(event)
        .thenReply(startCharging.replyTo, newState -> StatusReply.success(event));
  }
}

private Effect<Event, State> handleCompleteCharging(
    State state, CompleteCharging completeCharging) {
  context.getLog().info("Drone {} completed charging", completeCharging.droneId);
  if (state.dronesCharging.stream()
      .anyMatch(chargingDrone -> chargingDrone.droneId.equals(completeCharging.droneId)))
    return Effect()
        .persist(new ChargingCompleted(completeCharging.droneId))
        .thenReply(completeCharging.replyTo, newState -> StatusReply.ack());
  else
    return Effect()
        .reply(
            completeCharging.replyTo,
            StatusReply.error(
                "Drone " + completeCharging.droneId + " is not currently charging."));
}
```

### Example 7: Event handler

```scala
private def handleEvent(state: Option[State], event: Event): Option[State] = {
  state match {
    case None =>
      event match {
        case Created(locationId, chargingSlots) =>
          Some(State(chargingSlots, Set.empty, locationId))
        case unexpected =>
          throw new IllegalArgumentException(
            s"Got unexpected event ${unexpected} for uninitialized state")
      }

    case Some(state) =>
      event match {
        case Created(_, _) =>
          context.log.warn("Saw a second created event, ignoring")
          Some(state)
        case ChargingStarted(droneId, expectedComplete) =>
          Some(
            state.copy(dronesCharging = state.dronesCharging + ChargingDrone(
              droneId,
              expectedComplete,
              replicationContext.origin.id)))
        case ChargingCompleted(droneId) =>
          Some(
            state.copy(dronesCharging =
              state.dronesCharging.filterNot(_.droneId == droneId)))
      }

  }
}
```

### Example 8: Event handler

```java
@Override
public EventHandler<State, Event> eventHandler() {
  var noStateHandler =
      newEventHandlerBuilder()
          .forNullState()
          .onEvent(
              Created.class,
              created ->
                  new State(created.chargingSlots, Collections.emptySet(), created.locationId));

  var initializedStateHandler =
      newEventHandlerBuilder()
          .forNonNullState()
          .onEvent(
              Created.class,
              (state, event) -> {
                context.getLog().warn("Saw a second created event, ignoring");
                return state;
              })
          .onEvent(
              ChargingStarted.class,
              (state, event) -> {
                var newSet = new HashSet<>(state.dronesCharging);
                newSet.add(
                    new ChargingDrone(
                        event.droneId,
                        event.expectedComplete,
                        getReplicationContext().origin().id()));
                return new State(
                    state.chargingSlots,
                    Collections.unmodifiableSet(newSet),
                    state.stationLocationId);
              })
          .onEvent(
              ChargingCompleted.class,
              (state, event) -> {
                var newSet =
                    state.dronesCharging.stream()
                        .filter(charging -> !charging.droneId.equals(event.droneId))
                        .collect(Collectors.toSet());
                return new State(
                    state.chargingSlots,
                    Collections.unmodifiableSet(newSet),
                    state.stationLocationId);
              });

  return noStateHandler.orElse(initializedStateHandler).build();
}
```

### Example 9: Tagging based on location

```scala
.withTaggerForState {
  case (None, _)        => Set.empty
  case (Some(state), _) => Set("t:" + state.stationLocationId)
}
```

### Example 10: Tagging based on location

```java
@Override
public Set<String> tagsFor(State state, Event event) {
  if (state == null) return Set.of();
  else return Set.of("t:" + state.stationLocationId);
}
```

### Example 11: Setting up replication for the charging station

```scala
def init(implicit system: ActorSystem[_]): Replication[Command] = {
  val replicationSettings =
    ReplicationSettings[Command](EntityType, R2dbcReplication())
      .withEdgeReplication(true)
  Replication.grpcReplication(replicationSettings)(ChargingStation.apply)
}
```

### Example 12: Setting up replication for the charging station

```java
public static Replication<Command> init(ActorSystem<?> system) {
  var replicationSettings =
      ReplicationSettings.create(
              Command.class, ENTITY_TYPE, R2dbcReplication.create(system), system)
          .withEdgeReplication(true);
  return Replication.grpcReplication(replicationSettings, ChargingStation::create, system);
}
```

### Example 13: Setting up replication for the charging station

```scala
val chargingStationService = new ChargingStationServiceImpl(
  chargingStationReplication.entityRefFactory)

// delivery events and charging station replication both are Akka Projection gRPC event
// producers (pulled by the local drone control) and needs to be combined into a single gRPC service handling both:
val eventPullHandler = EventProducer.grpcServiceHandler(
  Set(
    deliveryEventsProducerSource,
    chargingStationReplication.eventProducerSource))

// the drone events from edge and the charging station replicated entity are both Akka Projection gRPC
// event push destinations (pushed by local drone control) and needs to be combined into a single gRPC service handling both:
val eventPushHandler = EventProducerPushDestination.grpcServiceHandler(
  Set(
    pushedEventsDestination,
    chargingStationReplication.eventProducerPushDestination.get))(system)
```

### Example 14: Setting up replication for the charging station

```java
var chargingStationService =
    new ChargingStationServiceImpl(
        settings,
        // FIXME java function type
        id -> chargingStationReplication.entityRefFactory().apply(id));

// delivery events and charging station replication both are Akka Projection gRPC event
// producers (pulled by the local drone control) and needs to be combined into a single gRPC
// service handling both:
var eventPullHandler =
    EventProducer.grpcServiceHandler(
        system,
        Set.of(deliveryEventsProducerSource, chargingStationReplication.eventProducerSource()));

// the drone events from edge and the charging station replicated entity are both Akka
// Projection gRPC
// event push destinations (pushed by local drone control) and needs to be combined into a
// single gRPC service handling both:
var eventPushHandler =
    EventProducerPushDestination.grpcServiceHandler(
        Set.of(
            pushedEventsDestination,
            chargingStationReplication.eventProducerPushDestination().get()),
        system);
```

### Example 15: Setting up replication for the charging station

```scala
def initEdge(locationId: String)(
    implicit system: ActorSystem[_]): EdgeReplication[Command] = {
  val replicationSettings =
    ReplicationSettings[Command](EntityType, R2dbcReplication())
      .withSelfReplicaId(ReplicaId(locationId))
      .withInitialConsumerFilter(
        // only replicate charging stations local to the edge system
        Seq(
          ConsumerFilter.excludeAll,
          ConsumerFilter.IncludeTopics(Set(locationId))))
  Replication.grpcEdgeReplication(replicationSettings)(ChargingStation.apply)
}
```

### Example 16: Setting up replication for the charging station

```java
public static EdgeReplication<Command> initEdge(ActorSystem<?> system, String locationId) {
  var replicationSettings =
      ReplicationSettings.create(
              Command.class, ENTITY_TYPE, R2dbcReplication.create(system), system)
          .withSelfReplicaId(new ReplicaId(locationId))
          .withInitialConsumerFilter(
              List.of(
                  // only replicate charging stations local to the edge system
                  ConsumerFilter.excludeAll(),
                  new ConsumerFilter.IncludeTopics(Set.of(locationId))));
  return Replication.grpcEdgeReplication(replicationSettings, ChargingStation::create, system);
}
```

### Example 17: Service for interacting with the charging station

```proto
syntax = "proto3";

option java_multiple_files = true;
option java_package = "charging.proto";

import "google/protobuf/timestamp.proto";

package charging;

service ChargingStationService {
  rpc CreateChargingStation(CreateChargingStationRequest) returns (CreateChargingStationResponse) {}
  rpc GetChargingStationState(GetChargingStationStateRequest) returns (GetChargingStationStateResponse) {}
}

message CreateChargingStationRequest {
  // unique identifier for the charging station
  string charging_station_id = 1;
  // location of the station
  string location_id = 2;
  // number of parallel charging slots for drones
  uint32 charging_slots = 3;
}

message CreateChargingStationResponse {
}

message GetChargingStationStateRequest {
  string charging_station_id = 1;
}

message GetChargingStationStateResponse {
  // location of the station
  string location_id = 1;
  // number of parallel charging slots for drones
  uint32 charging_slots = 2;
  // drones currently at the station charging
  repeated ChargingDrone currently_charging_drones = 3;
}

message ChargingDrone {
  string drone_id = 1;
  // timestamp when charging is estimated to complete
  google.protobuf.Timestamp expected_complete = 2;
}
```

### Example 18: Service for interacting with the charging station

```proto
syntax = "proto3";

option java_multiple_files = true;
option java_package = "charging.proto";

import "google/protobuf/timestamp.proto";

package charging;

service ChargingStationService {
  rpc CreateChargingStation(CreateChargingStationRequest) returns (CreateChargingStationResponse) {}
  rpc GetChargingStationState(GetChargingStationStateRequest) returns (GetChargingStationStateResponse) {}
}

message CreateChargingStationRequest {
  // unique identifier for the charging station
  string charging_station_id = 1;
  // location of the station
  string location_id = 2;
  // number of parallel charging slots for drones
  uint32 charging_slots = 3;
}

message CreateChargingStationResponse {
}

message GetChargingStationStateRequest {
  string charging_station_id = 1;
}

message GetChargingStationStateResponse {
  // location of the station
  string location_id = 1;
  // number of parallel charging slots for drones
  uint32 charging_slots = 2;
  // drones currently at the station charging
  repeated ChargingDrone currently_charging_drones = 3;
}

message ChargingDrone {
  string drone_id = 1;
  // timestamp when charging is estimated to complete
  google.protobuf.Timestamp expected_complete = 2;
}
```

### Example 19: Service for interacting with the charging station

```scala
package charging

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.EntityRef
import akka.util.Timeout
import charging.proto
import com.google.protobuf.timestamp.Timestamp
import org.slf4j.LoggerFactory

import scala.concurrent.Future
import scala.concurrent.duration.DurationInt

class ChargingStationServiceImpl(
    entityRefFactory: String => EntityRef[ChargingStation.Command])(
    implicit val system: ActorSystem[_])
    extends proto.ChargingStationService {
  private final val log = LoggerFactory.getLogger(getClass)
  import system.executionContext
  // FIXME separate setting
  implicit val askTimeout: Timeout = 3.seconds

  override def createChargingStation(in: proto.CreateChargingStationRequest)
      : Future[proto.CreateChargingStationResponse] = {
    log.info(
      "Creating charging station {} with {} charging slots, in location {}",
      in.chargingStationId,
      in.chargingSlots,
      in.locationId)

    val entityRef = entityRefFactory(in.chargingStationId)
    entityRef
      .ask(ChargingStation.Create(in.locationId, in.chargingSlots, _))
      .map(_ => proto.CreateChargingStationResponse.defaultInstance)

  }

  override def getChargingStationState(in: proto.GetChargingStationStateRequest)
      : Future[proto.GetChargingStationStateResponse] = {
    log.info("Get charging station {} state", in.chargingStationId)
    val entityRef = entityRefFactory(in.chargingStationId)
    entityRef
      .askWithStatus(ChargingStation.GetState.apply)
      .map(state =>
        proto.GetChargingStationStateResponse(
          locationId = state.stationLocationId,
          chargingSlots = state.chargingSlots,
          currentlyChargingDrones = state.dronesCharging
            .map(d =>
              proto.ChargingDrone(
                droneId = d.droneId,
                expectedComplete = Some(Timestamp(d.expectedComplete))))
            .toSeq))
  }
}
```

### Example 20: Service for interacting with the charging station

```java
package charging;

import akka.Done;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.grpc.GrpcServiceException;
import central.DeliveriesSettings;
import charging.proto.*;
import com.google.protobuf.Timestamp;
import io.grpc.Status;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChargingStationServiceImpl implements ChargingStationService {

  private static final Logger logger = LoggerFactory.getLogger(ChargingStationServiceImpl.class);

  private final Function<String, EntityRef<ChargingStation.Command>> entityRefFactory;
  private final Duration askTimeout;

  public ChargingStationServiceImpl(
      DeliveriesSettings settings,
      Function<String, EntityRef<ChargingStation.Command>> entityRefFactory) {
    this.entityRefFactory = entityRefFactory;
    // FIXME separate setting
    this.askTimeout = settings.droneAskTimeout;
  }

  @Override
  public CompletionStage<CreateChargingStationResponse> createChargingStation(
      CreateChargingStationRequest in) {
    logger.info(
        "Creating charging station {} with {} charging slots, in location {}",
        in.getChargingStationId(),
        in.getChargingSlots(),
        in.getLocationId());

    var entityRef = entityRefFactory.apply(in.getChargingStationId());

    CompletionStage<Done> chargingStationReply =
        entityRef.askWithStatus(
            replyTo ->
                new ChargingStation.Create(in.getLocationId(), in.getChargingSlots(), replyTo),
            askTimeout);

    var response =
        chargingStationReply.thenApply(done -> CreateChargingStationResponse.getDefaultInstance());

    return convertError(response);
  }

  @Override
  public CompletionStage<GetChargingStationStateResponse> getChargingStationState(
      GetChargingStationStateRequest in) {
    logger.info("Get charging station {} state", in.getChargingStationId());
    var entityRef = entityRefFactory.apply(in.getChargingStationId());
    return entityRef
        .askWithStatus(ChargingStation.GetState::new, askTimeout)
        .thenApply(
            state ->
                GetChargingStationStateResponse.newBuilder()
                    .setLocationId(state.stationLocationId)
                    .setChargingSlots(state.chargingSlots)
                    .addAllCurrentlyChargingDrones(
                        state.dronesCharging.stream()
                            .map(
                                d ->
                                    ChargingDrone.newBuilder()
                                        .setDroneId(d.droneId)
                                        .setExpectedComplete(
                                            instantToProtoTimestamp(d.expectedComplete))
                                        .build())
                            .collect(Collectors.toList()))
                    .build());
  }

  private static Timestamp instantToProtoTimestamp(Instant instant) {
    return Timestamp.newBuilder()
        .setSeconds(instant.getEpochSecond())
        .setNanos(instant.getNano())
        .build();
  }

  private <T> CompletionStage<T> convertError(CompletionStage<T> response) {
    return response.exceptionally(
        error -> {
          if (error instanceof TimeoutException) {
            throw new GrpcServiceException(
                Status.UNAVAILABLE.withDescription("Operation timed out"));
          } else {
            throw new GrpcServiceException(Status.INTERNAL.withDescription(error.getMessage()));
          }
        });
  }
}
```

### Example 21: Interacting with the charging station at the edge

```scala
override def goCharge(
    in: proto.GoChargeRequest): Future[proto.ChargingResponse] = {
  logger.info(
    "Requesting charge of {} from {}",
    in.droneId,
    in.chargingStationId)
  val entityRef = chargingStationEntityRefFactory(in.chargingStationId)
  val response = entityRef
    .askWithStatus[ChargingStation.StartChargingResponse](
      ChargingStation.StartCharging(in.droneId, _))
    .map {
      case ChargingStation.ChargingStarted(_, expectedComplete) =>
        proto.ChargingResponse(
          proto.ChargingResponse.Response.Started(
            proto.ChargingStarted(Some(Timestamp(expectedComplete)))))
      case ChargingStation.AllSlotsBusy(comeBackAt) =>
        proto.ChargingResponse(
          proto.ChargingResponse.Response
            .ComeBackLater(proto.ComeBackLater(Some(Timestamp(comeBackAt)))))
    }
  convertError(response)
}

override def completeCharge(in: proto.CompleteChargeRequest)
    : Future[proto.CompleteChargingResponse] = {
  logger.info(
    "Requesting complete charging of {} from {}",
    in.droneId,
    in.chargingStationId)

  val entityRef = chargingStationEntityRefFactory(in.chargingStationId)
  val response = entityRef
    .askWithStatus(ChargingStation.CompleteCharging(in.droneId, _))
    .map(_ => proto.CompleteChargingResponse.defaultInstance)

  convertError(response)
}
```

### Example 22: Interacting with the charging station at the edge

```java
@Override
public CompletionStage<ChargingResponse> goCharge(GoChargeRequest in) {
  logger.info("Requesting charge of {} from {}", in.getDroneId(), in.getChargingStationId());
  var entityRef = chargingStationEntityRefFactory.apply(in.getChargingStationId());

  CompletionStage<ChargingStation.StartChargingResponse> chargingStationResponse =
      entityRef.askWithStatus(
          replyTo -> new ChargingStation.StartCharging(in.getDroneId(), replyTo),
          settings.askTimeout);

  var response =
      chargingStationResponse.thenApply(
          message -> {
            if (message instanceof ChargingStation.ChargingStarted) {
              var expectedComplete = ((ChargingStation.ChargingStarted) message).expectedComplete;
              return ChargingResponse.newBuilder()
                  .setStarted(
                      ChargingStarted.newBuilder()
                          .setExpectedComplete(instantToProtoTimestamp(expectedComplete))
                          .build())
                  .build();
            } else if (message instanceof ChargingStation.AllSlotsBusy) {
              var firstSlotFreeAt = ((ChargingStation.AllSlotsBusy) message).firstSlotFreeAt;
              return ChargingResponse.newBuilder()
                  .setComeBackLater(
                      ComeBackLater.newBuilder()
                          .setFirstSlotFreeAt(instantToProtoTimestamp(firstSlotFreeAt))
                          .build())
                  .build();
            } else {
              throw new IllegalArgumentException(
                  "Unexpected response type " + message.getClass());
            }
          });

  return convertError(response);
}

@Override
public CompletionStage<CompleteChargingResponse> completeCharge(CompleteChargeRequest in) {
  logger.info(
      "Requesting complete charging of {} from {}", in.getDroneId(), in.getChargingStationId());
  var entityRef = chargingStationEntityRefFactory.apply(in.getChargingStationId());

  CompletionStage<Done> chargingStationResponse =
      entityRef.askWithStatus(
          replyTo -> new ChargingStation.CompleteCharging(in.getDroneId(), replyTo),
          settings.askTimeout);

  var response =
      chargingStationResponse.thenApply(done -> CompleteChargingResponse.getDefaultInstance());

  return convertError(response);
}
```

### Example 23: Running

```shell
sbt run
```

### Example 24: Running

```shell
mvn compile exec:exec
```

### Example 25: Running

```shell
docker compose up --wait
docker exec -i postgres_db psql -U postgres -t < ddl-scripts/create_tables.sql
```

### Example 26: Running

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 27: Running

```shell
sbt -Dconfig.resource=local2.conf run
sbt -Dconfig.resource=local3.conf run
```

### Example 28: Running

```shell
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 29: Running

```shell
mvn compile exec:exec -DAPP_CONFIG=local2.conf
mvn compile exec:exec -DAPP_CONFIG=local3.conf
```

### Example 30: Running

```shell
grpcurl -d '{"charging_station_id":"station1","location_id": "sweden/stockholm/kungsholmen", "charging_slots": 4}' -plaintext localhost:8101 charging.ChargingStationService.CreateChargingStation
```

### Example 31: Running

```shell
grpcurl -d '{"drone_id":"drone1","charging_station_id":"station1"}' -plaintext 127.0.0.1:8080 local.drones.DroneService.GoCharge
```

### Example 32: Running

```shell
grpcurl -d '{"charging_station_id":"station1"}' -plaintext localhost:8101 charging.ChargingStationService.GetChargingStationState
```

### Example 33: Running

```shell
grpcurl -d '{"drone_id":"drone1","charging_station_id":"station1"}' -plaintext 127.0.0.1:8080 local.drones.DroneService.CompleteCharge
```

### Example 34: Running

```shell
grpcurl -d '{"charging_station_id":"station1"}' -plaintext localhost:8101 charging.ChargingStationService.GetChargingStationState
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/typed/replicated-eventsourcing.html
- https://doc.akka.io/libraries/akka-edge/current/attachments/drone-java.zip
- https://doc.akka.io/libraries/akka-edge/current/attachments/drone-scala.zip
- https://doc.akka.io/libraries/akka-edge/current/guide/4-local-drone-delivery-selection.html
- https://doc.akka.io/libraries/akka-edge/current/guide/6-deploying-the-services.html
- https://doc.akka.io/libraries/akka-projection/1.6/grpc-replicated-event-sourcing-transport.html

---
*Source: [https://doc.akka.io/libraries/akka-edge/current/guide/5-charging-station.html](https://doc.akka.io/libraries/akka-edge/current/guide/5-charging-station.html)*