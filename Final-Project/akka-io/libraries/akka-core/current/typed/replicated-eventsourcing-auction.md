---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-auction.html
title: Auction example • Akka core
---

# Auction example • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Auction example

Note
This sample uses the direct database replication through `ReplicatedEventSourcing.commonJournalConfig`, which is no longer is recommended, however the actual Replicated Event Sourcing auction implementation is still useful as an example of how to design and implement a replicated entity.

In this example we want to show that real\-world applications can be implemented by designing events in a way that they don’t conflict. In the end, you will end up with a solution based on a custom CRDT.

We are building a small auction service. It has the following operations:

- Place a bid
- Get the highest bid
- Finish the auction

We model those operations as commands to be sent to the auction actor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedAuctionExampleSpec.scala#L40-L49 "Go to snippet source")type MoneyAmount = Int

case class Bid(bidder: String, offer: MoneyAmount, timestamp: Instant, originReplica: ReplicaId)

sealed trait Command extends CborSerializable
case object Finish extends Command // A timer needs to schedule this event at each replica
final case class OfferBid(bidder: String, offer: MoneyAmount) extends Command
final case class GetHighestBid(replyTo: ActorRef[Bid]) extends Command
final case class IsClosed(replyTo: ActorRef[Boolean]) extends Command
private case object Close extends Command // Internal, should not be sent from the outside
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/ReplicatedAuctionExampleTest.java#L113-L161 "Go to snippet source")public static final class Bid {
  public final String bidder;
  public final int offer;
  public final Instant timestamp;
  public final ReplicaId originReplica;

  public Bid(String bidder, int offer, Instant timestamp, ReplicaId originReplica) {
    this.bidder = bidder;
    this.offer = offer;
    this.timestamp = timestamp;
    this.originReplica = originReplica;
  }
}

interface Command extends CborSerializable {}

public enum Finish implements Command {
  INSTANCE
}

public static final class OfferBid implements Command {
  public final String bidder;
  public final int offer;

  public OfferBid(String bidder, int offer) {
    this.bidder = bidder;
    this.offer = offer;
  }
}

public static final class GetHighestBid implements Command {
  public final ActorRef<Bid> replyTo;

  public GetHighestBid(ActorRef<Bid> replyTo) {
    this.replyTo = replyTo;
  }
}

public static final class IsClosed implements Command {
  public final ActorRef<Boolean> replyTo;

  public IsClosed(ActorRef<Boolean> replyTo) {
    this.replyTo = replyTo;
  }
}

private enum Close implements Command {
  INSTANCE
}
```

The events:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedAuctionExampleSpec.scala#L53-L57 "Go to snippet source")sealed trait Event extends CborSerializable
final case class BidRegistered(bid: Bid) extends Event
final case class AuctionFinished(atReplica: ReplicaId) extends Event
final case class WinnerDecided(atReplica: ReplicaId, winningBid: Bid, highestCounterOffer: MoneyAmount)
    extends Event
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/ReplicatedAuctionExampleTest.java#L165-L195 "Go to snippet source")interface Event extends CborSerializable {}

public static final class BidRegistered implements Event {
  public final Bid bid;

  @JsonCreator
  public BidRegistered(Bid bid) {
    this.bid = bid;
  }
}

public static final class AuctionFinished implements Event {
  public final ReplicaId atReplica;

  @JsonCreator
  public AuctionFinished(ReplicaId atReplica) {
    this.atReplica = atReplica;
  }
}

public static final class WinnerDecided implements Event {
  public final ReplicaId atReplica;
  public final Bid winningBid;
  public final int amount;

  public WinnerDecided(ReplicaId atReplica, Bid winningBid, int amount) {
    this.atReplica = atReplica;
    this.winningBid = winningBid;
    this.amount = amount;
  }
}
```

The winner does not have to pay the highest bid but only enough to beat the second highest, so the `highestCounterOffer` is in the `AuctionFinished` event. 

Let’s have a look at the auction entity that will handle incoming commands:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedAuctionExampleSpec.scala#L185-L230 "Go to snippet source")def commandHandler(state: AuctionState, command: Command): Effect[Event, AuctionState] = {
  state.phase match {
    case Closing(_) | Closed =>
      command match {
        case GetHighestBid(replyTo) =>
          replyTo ! state.highestBid.copy(offer = state.highestCounterOffer) // TODO this is not as described
          Effect.none
        case IsClosed(replyTo) =>
          replyTo ! (state.phase == Closed)
          Effect.none
        case Finish =>
          context.log.info("Finish")
          Effect.persist(AuctionFinished(replicationContext.replicaId))
        case Close =>
          context.log.info("Close")
          require(shouldClose(state))
          Effect.persist(WinnerDecided(replicationContext.replicaId, state.highestBid, state.highestCounterOffer))
        case _: OfferBid =>
          // auction finished, no more bids accepted
          Effect.unhandled
      }
    case Running =>
      command match {
        case OfferBid(bidder, offer) =>
          Effect.persist(
            BidRegistered(
              Bid(
                bidder,
                offer,
                Instant.ofEpochMilli(replicationContext.currentTimeMillis()),
                replicationContext.replicaId)))
        case GetHighestBid(replyTo) =>
          replyTo ! state.highestBid
          Effect.none
        case Finish =>
          Effect.persist(AuctionFinished(replicationContext.replicaId))
        case Close =>
          context.log.warn("Premature close")
          // Close should only be triggered when we have already finished
          Effect.unhandled
        case IsClosed(replyTo) =>
          replyTo ! false
          Effect.none
      }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/ReplicatedAuctionExampleTest.java#L323-L392 "Go to snippet source")@Override
public CommandHandler<Command, Event, AuctionState> commandHandler() {

  CommandHandlerBuilder<Command, Event, AuctionState> builder = newCommandHandlerBuilder();

  // running
  builder
      .forState(state -> state.stillRunning)
      .onCommand(
          OfferBid.class,
          (state, bid) ->
              Effect()
                  .persist(
                      new BidRegistered(
                          new Bid(
                              bid.bidder,
                              bid.offer,
                              Instant.ofEpochMilli(
                                  this.getReplicationContext().currentTimeMillis()),
                              this.getReplicationContext().replicaId()))))
      .onCommand(
          GetHighestBid.class,
          (state, get) -> {
            get.replyTo.tell(state.highestBid);
            return Effect().none();
          })
      .onCommand(
          Finish.class,
          (state, finish) ->
              Effect().persist(new AuctionFinished(getReplicationContext().replicaId())))
      .onCommand(Close.class, (state, close) -> Effect().unhandled())
      .onCommand(
          IsClosed.class,
          (state, get) -> {
            get.replyTo.tell(false);
            return Effect().none();
          });

  // finished
  builder
      .forAnyState()
      .onCommand(OfferBid.class, (state, bid) -> Effect().unhandled())
      .onCommand(
          GetHighestBid.class,
          (state, get) -> {
            get.replyTo.tell(state.highestBid);
            return Effect().none();
          })
      .onCommand(
          Finish.class,
          (state, finish) ->
              Effect().persist(new AuctionFinished(getReplicationContext().replicaId())))
      .onCommand(
          Close.class,
          (state, close) ->
              Effect()
                  .persist(
                      new WinnerDecided(
                          getReplicationContext().replicaId(),
                          state.highestBid,
                          state.highestCounterOffer)))
      .onCommand(
          IsClosed.class,
          (state, get) -> {
            get.replyTo.tell(state.isClosed());
            return Effect().none();
          });

  return builder.build();
}
```

There is nothing specific to Replicated Event Sourcing about the command handler. It is the same as a command handler for a standard `EventSourcedBehavior`. For `OfferBid` and `AuctionFinished` we do nothing more than to emit events corresponding to the command. For `GetHighestBid` we respond with details from the state. Note, that we overwrite the actual offer of the highest bid here with the amount of the `highestCounterOffer`. This is done to follow the popular auction style where the actual highest bid is never publicly revealed.

The auction entity is started with the initial parameters for the auction. The minimum bid is modelled as an `initialBid`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedAuctionExampleSpec.scala#L35-L288 "Go to snippet source")object AuctionEntity {

  def apply(
      replica: ReplicaId,
      name: String,
      initialBid: AuctionEntity.Bid, // the initial bid is basically the minimum price bidden at start time by the owner
      closingAt: Instant,
      responsibleForClosing: Boolean,
      allReplicas: Set[ReplicaId]): Behavior[Command] = Behaviors.setup[Command] { ctx =>
    Behaviors.withTimers { timers =>
      ReplicatedEventSourcing.commonJournalConfig(
        ReplicationId("auction", name, replica),
        allReplicas,
        PersistenceTestKitReadJournal.Identifier) { replicationCtx =>
        new AuctionEntity(ctx, replicationCtx, timers, closingAt, responsibleForClosing, allReplicas)
          .behavior(initialBid)
      }
    }
  }

}

class AuctionEntity(
    context: ActorContext[AuctionEntity.Command],
    replicationContext: ReplicationContext,
    timers: TimerScheduler[AuctionEntity.Command],
    closingAt: Instant,
    responsibleForClosing: Boolean,
    allReplicas: Set[ReplicaId]) {
  import AuctionEntity._

  private def behavior(initialBid: AuctionEntity.Bid): EventSourcedBehavior[Command, Event, AuctionState] =
    EventSourcedBehavior(
      replicationContext.persistenceId,
      AuctionState(phase = Running, highestBid = initialBid, highestCounterOffer = initialBid.offer),
      commandHandler,
      eventHandler).receiveSignal {
      case (state, RecoveryCompleted) => recoveryCompleted(state)
    }

  private def recoveryCompleted(state: AuctionState): Unit = {
    if (shouldClose(state))
      context.self ! Close

    val millisUntilClosing = closingAt.toEpochMilli - replicationContext.currentTimeMillis()
    timers.startSingleTimer(Finish, millisUntilClosing.millis)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/ReplicatedAuctionExampleTest.java#L95-L446 "Go to snippet source")class AuctionEntity
    extends ReplicatedEventSourcedBehavior<
        AuctionEntity.Command, AuctionEntity.Event, AuctionEntity.AuctionState> {

  public static ReplicaId R1 = new ReplicaId("R1");
  public static ReplicaId R2 = new ReplicaId("R2");

  public static Set<ReplicaId> ALL_REPLICAS = new HashSet<>(Arrays.asList(R1, R2));

  private final ActorContext<Command> context;
  private final TimerScheduler<Command> timers;
  private final Bid initialBid;
  private final Instant closingAt;
  private final boolean responsibleForClosing;

  public static Behavior<Command> create(
      ReplicaId replica,
      String name,
      Bid initialBid,
      Instant closingAt,
      boolean responsibleForClosing) {
    return Behaviors.setup(
        ctx ->
            Behaviors.withTimers(
                timers ->
                    ReplicatedEventSourcing.commonJournalConfig(
                        new ReplicationId("Auction", name, replica),
                        ALL_REPLICAS,
                        PersistenceTestKitReadJournal.Identifier(),
                        replicationCtx ->
                            new AuctionEntity(
                                ctx,
                                replicationCtx,
                                timers,
                                initialBid,
                                closingAt,
                                responsibleForClosing))));
  }

  private AuctionEntity(
      ActorContext<Command> context,
      ReplicationContext replicationContext,
      TimerScheduler<Command> timers,
      Bid initialBid,
      Instant closingAt,
      boolean responsibleForClosing) {
    super(replicationContext);
    this.context = context;
    this.timers = timers;
    this.initialBid = initialBid;
    this.closingAt = closingAt;
    this.responsibleForClosing = responsibleForClosing;
  }

  @Override
  public AuctionState emptyState() {
    return new AuctionState(true, initialBid, initialBid.offer, Collections.emptySet());
  }

  @Override
  public SignalHandler<AuctionState> signalHandler() {
    return newSignalHandlerBuilder()
        .onSignal(RecoveryCompleted.instance(), this::onRecoveryCompleted)
        .build();
  }

  private void onRecoveryCompleted(AuctionState state) {
    if (shouldClose(state)) {
      context.getSelf().tell(Close.INSTANCE);
    }

    long millisUntilClosing =
        closingAt.toEpochMilli() - getReplicationContext().currentTimeMillis();
    timers.startSingleTimer(Finish.INSTANCE, Duration.ofMillis(millisUntilClosing));
  }

}
```

The auction moves through the following phases:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedAuctionExampleSpec.scala#L61-L85 "Go to snippet source")/**
 * The auction passes through several workflow phases.
 * First, in `Running` `OfferBid` commands are accepted.
 *
 * `AuctionEntity` instances in all DCs schedule a `Finish` command
 * at a given time. That persists the `AuctionFinished` event and the
 * phase is in `Closing` until the auction is finished in all DCs.
 *
 * When the auction has been finished no more `OfferBid` commands are accepted.
 *
 * The auction is also finished immediately if `AuctionFinished` event from another
 * DC is seen before the scheduled `Finish` command. In that way the auction is finished
 * as quickly as possible in all DCs even though there might be some clock skew.
 *
 * One DC is responsible for finally deciding the winner and publishing the result.
 * All events must be collected from all DC before that can happen.
 * When the responsible DC has seen all `AuctionFinished` events from other DCs
 * all other events have also been propagated and it can persist `WinnerDecided` and
 * the auction is finally `Closed`.
 *
 */
sealed trait AuctionPhase
case object Running extends AuctionPhase
final case class Closing(finishedAtReplica: Set[ReplicaId]) extends AuctionPhase
case object Closed extends AuctionPhase
```

The closing and closed states are to model waiting for all replicas to see the result of the auction before actually closing the action.

Let’s have a look at our state class, `AuctionState` which also represents the CRDT in our example.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedAuctionExampleSpec.scala#L89-L133 "Go to snippet source")case class AuctionState(phase: AuctionPhase, highestBid: Bid, highestCounterOffer: MoneyAmount)
    extends CborSerializable {

  def applyEvent(event: Event): AuctionState =
    event match {
      case BidRegistered(b) =>
        if (isHigherBid(b, highestBid))
          withNewHighestBid(b)
        else
          withTooLowBid(b)
      case AuctionFinished(atDc) =>
        phase match {
          case Running =>
            copy(phase = Closing(Set(atDc)))
          case Closing(alreadyFinishedDcs) =>
            copy(phase = Closing(alreadyFinishedDcs + atDc))
          case _ =>
            this
        }
      case _: WinnerDecided =>
        copy(phase = Closed)
    }

  def withNewHighestBid(bid: Bid): AuctionState = {
    require(phase != Closed)
    require(isHigherBid(bid, highestBid))
    copy(highestBid = bid, highestCounterOffer = highestBid.offer // keep last highest bid around
    )
  }

  def withTooLowBid(bid: Bid): AuctionState = {
    require(phase != Closed)
    require(isHigherBid(highestBid, bid))
    copy(highestCounterOffer = highestCounterOffer.max(bid.offer)) // update highest counter offer
  }

  def isHigherBid(first: Bid, second: Bid): Boolean =
    first.offer > second.offer ||
    (first.offer == second.offer && first.timestamp.isBefore(second.timestamp)) || // if equal, first one wins
    // If timestamps are equal, choose by dc where the offer was submitted
    // In real auctions, this last comparison should be deterministic but unpredictable, so that submitting to a
    // particular DC would not be an advantage.
    (first.offer == second.offer && first.timestamp.equals(second.timestamp) && first.originReplica.id
      .compareTo(second.originReplica.id) < 0)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/ReplicatedAuctionExampleTest.java#L199-L255 "Go to snippet source")static class AuctionState implements CborSerializable {

  final boolean stillRunning;
  final Bid highestBid;
  final int highestCounterOffer;
  final Set<String> finishedAtDc;

  AuctionState(
      boolean stillRunning, Bid highestBid, int highestCounterOffer, Set<String> finishedAtDc) {
    this.stillRunning = stillRunning;
    this.highestBid = highestBid;
    this.highestCounterOffer = highestCounterOffer;
    this.finishedAtDc = finishedAtDc;
  }

  AuctionState withNewHighestBid(Bid bid) {
    assertTrue(stillRunning);
    assertTrue(isHigherBid(bid, highestBid));
    return new AuctionState(
        stillRunning, bid, highestBid.offer, finishedAtDc); // keep last highest bid around
  }

  AuctionState withTooLowBid(Bid bid) {
    assertTrue(stillRunning);
    assertTrue(isHigherBid(highestBid, bid));
    return new AuctionState(
        stillRunning, highestBid, Math.max(highestCounterOffer, bid.offer), finishedAtDc);
  }

  static Boolean isHigherBid(Bid first, Bid second) {
    return first.offer > second.offer
        || (first.offer == second.offer && first.timestamp.isBefore(second.timestamp))
        || // if equal, first one wins
        // If timestamps are equal, choose by dc where the offer was submitted
        // In real auctions, this last comparison should be deterministic but unpredictable, so
        // that submitting to a
        // particular DC would not be an advantage.
        (first.offer == second.offer
            && first.timestamp.equals(second.timestamp)
            && first.originReplica.id().compareTo(second.originReplica.id()) < 0);
  }

  AuctionState addFinishedAtReplica(String replica) {
    Set<String> s = new HashSet<>(finishedAtDc);
    s.add(replica);
    return new AuctionState(
        false, highestBid, highestCounterOffer, Collections.unmodifiableSet(s));
  }

  public AuctionState close() {
    return new AuctionState(false, highestBid, highestCounterOffer, Collections.emptySet());
  }

  public boolean isClosed() {
    return !stillRunning && finishedAtDc.isEmpty();
  }
}
```

The state consists of a flag that keeps track of whether the auction is still active, the currently highest bid, and the highest counter offer so far.

In the `eventHandler`, we handle persisted events to drive the state change. When a new bid is registered,

- it needs to be decided whether the new bid is the winning bid or not
- the state needs to be updated accordingly

The point of CRDTs is that the state must be end up being the same regardless of the order the events have been processed. We can see how this works in the auction example: we are only interested in the highest bid, so, if we can define an ordering on all bids, it should suffice to compare the new bid with currently highest to eventually end up with the globally highest regardless of the order in which the events come in.

The ordering between bids is crucial, therefore. We need to ensure that it is deterministic and does not depend on local state outside of our state class so that all replicas come to the same result. We define the ordering as this:

- A higher bid wins.
- If there’s a tie between the two highest bids, the bid that was registered earlier wins. For that we keep track of the (local) timestamp the bid was registered.
- We need to make sure that no timestamp is used twice in the same replica (missing in this example).
- If there’s a tie between the timestamp, we define an arbitrary but deterministic ordering on the replicas, in our case we just compare the name strings of the replicas. That’s why we need to keep the identifier of the replica where a bid was registered for every `Bid`.

If the new bid was higher, we keep this one as the new highest and keep the amount of the former highest as the `highestCounterOffer`. If the new bid was lower, we just update the `highestCounterOffer` if necessary.

Using those rules, the order of incoming does not matter. Replicas will eventually converge to the same result.

## Triggering closing

In the auction we want to ensure that all bids are seen before declaring a winner. That means that an auction can only be closed once all replicas have seen all bids.

In the event handler above, when recovery is not running, it calls `eventTriggers`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/scala/docs/akka/persistence/typed/ReplicatedAuctionExampleSpec.scala#L248-L284 "Go to snippet source")private def eventTriggers(event: Event, newState: AuctionState): Unit = {
  event match {
    case finished: AuctionFinished =>
      newState.phase match {
        case Closing(alreadyFinishedAtDc) =>
          context.log.info(
            "AuctionFinished at {}, already finished at [{}]",
            finished.atReplica,
            alreadyFinishedAtDc.mkString(", "))
          if (alreadyFinishedAtDc(replicationContext.replicaId)) {
            if (shouldClose(newState)) context.self ! Close
          } else {
            context.log.info("Sending finish to self")
            context.self ! Finish
          }

        case _ => // no trigger for this state
      }
    case _ => // no trigger for this event
  }
}

private def shouldClose(state: AuctionState): Boolean = {
  responsibleForClosing && (state.phase match {
    case Closing(alreadyFinishedAtDc) =>
      val allDone = allReplicas.diff(alreadyFinishedAtDc).isEmpty
      if (!allDone) {
        context.log.info(
          s"Not closing auction as not all DCs have reported finished. All DCs: {}. Reported finished {}",
          allReplicas,
          alreadyFinishedAtDc)
      }
      allDone
    case _ =>
      false
  })
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed-tests/src/test/java/jdocs/akka/persistence/typed/ReplicatedAuctionExampleTest.java#L425-L442 "Go to snippet source")private void eventTriggers(AuctionFinished event, AuctionState newState) {
  if (newState.finishedAtDc.contains(getReplicationContext().replicaId().id())) {
    if (shouldClose(newState)) {
      context.getSelf().tell(Close.INSTANCE);
    }
  } else {
    context.getSelf().tell(Finish.INSTANCE);
  }
}

private boolean shouldClose(AuctionState state) {
  return responsibleForClosing
      && !state.isClosed()
      && getReplicationContext().getAllReplicas().stream()
          .map(ReplicaId::id)
          .collect(Collectors.toSet())
          .equals(state.finishedAtDc);
}
```

The event trigger uses the `ReplicationContext` to decide when to trigger the Finish of the action. When a replica saves the `AuctionFinished` event it checks whether it should close the auction. For the close to happen the replica must be the one designated to close and all replicas must have reported that they have finished.

## Code Examples

### Example 1: Auction example

```scala
type MoneyAmount = Int

case class Bid(bidder: String, offer: MoneyAmount, timestamp: Instant, originReplica: ReplicaId)

sealed trait Command extends CborSerializable
case object Finish extends Command // A timer needs to schedule this event at each replica
final case class OfferBid(bidder: String, offer: MoneyAmount) extends Command
final case class GetHighestBid(replyTo: ActorRef[Bid]) extends Command
final case class IsClosed(replyTo: ActorRef[Boolean]) extends Command
private case object Close extends Command // Internal, should not be sent from the outside
```

### Example 2: Auction example

```java
public static final class Bid {
  public final String bidder;
  public final int offer;
  public final Instant timestamp;
  public final ReplicaId originReplica;

  public Bid(String bidder, int offer, Instant timestamp, ReplicaId originReplica) {
    this.bidder = bidder;
    this.offer = offer;
    this.timestamp = timestamp;
    this.originReplica = originReplica;
  }
}

interface Command extends CborSerializable {}

public enum Finish implements Command {
  INSTANCE
}

public static final class OfferBid implements Command {
  public final String bidder;
  public final int offer;

  public OfferBid(String bidder, int offer) {
    this.bidder = bidder;
    this.offer = offer;
  }
}

public static final class GetHighestBid implements Command {
  public final ActorRef<Bid> replyTo;

  public GetHighestBid(ActorRef<Bid> replyTo) {
    this.replyTo = replyTo;
  }
}

public static final class IsClosed implements Command {
  public final ActorRef<Boolean> replyTo;

  public IsClosed(ActorRef<Boolean> replyTo) {
    this.replyTo = replyTo;
  }
}

private enum Close implements Command {
  INSTANCE
}
```

### Example 3: Auction example

```scala
sealed trait Event extends CborSerializable
final case class BidRegistered(bid: Bid) extends Event
final case class AuctionFinished(atReplica: ReplicaId) extends Event
final case class WinnerDecided(atReplica: ReplicaId, winningBid: Bid, highestCounterOffer: MoneyAmount)
    extends Event
```

### Example 4: Auction example

```java
interface Event extends CborSerializable {}

public static final class BidRegistered implements Event {
  public final Bid bid;

  @JsonCreator
  public BidRegistered(Bid bid) {
    this.bid = bid;
  }
}

public static final class AuctionFinished implements Event {
  public final ReplicaId atReplica;

  @JsonCreator
  public AuctionFinished(ReplicaId atReplica) {
    this.atReplica = atReplica;
  }
}

public static final class WinnerDecided implements Event {
  public final ReplicaId atReplica;
  public final Bid winningBid;
  public final int amount;

  public WinnerDecided(ReplicaId atReplica, Bid winningBid, int amount) {
    this.atReplica = atReplica;
    this.winningBid = winningBid;
    this.amount = amount;
  }
}
```

### Example 5: Auction example

```scala
def commandHandler(state: AuctionState, command: Command): Effect[Event, AuctionState] = {
  state.phase match {
    case Closing(_) | Closed =>
      command match {
        case GetHighestBid(replyTo) =>
          replyTo ! state.highestBid.copy(offer = state.highestCounterOffer) // TODO this is not as described
          Effect.none
        case IsClosed(replyTo) =>
          replyTo ! (state.phase == Closed)
          Effect.none
        case Finish =>
          context.log.info("Finish")
          Effect.persist(AuctionFinished(replicationContext.replicaId))
        case Close =>
          context.log.info("Close")
          require(shouldClose(state))
          Effect.persist(WinnerDecided(replicationContext.replicaId, state.highestBid, state.highestCounterOffer))
        case _: OfferBid =>
          // auction finished, no more bids accepted
          Effect.unhandled
      }
    case Running =>
      command match {
        case OfferBid(bidder, offer) =>
          Effect.persist(
            BidRegistered(
              Bid(
                bidder,
                offer,
                Instant.ofEpochMilli(replicationContext.currentTimeMillis()),
                replicationContext.replicaId)))
        case GetHighestBid(replyTo) =>
          replyTo ! state.highestBid
          Effect.none
        case Finish =>
          Effect.persist(AuctionFinished(replicationContext.replicaId))
        case Close =>
          context.log.warn("Premature close")
          // Close should only be triggered when we have already finished
          Effect.unhandled
        case IsClosed(replyTo) =>
          replyTo ! false
          Effect.none
      }
  }
}
```

### Example 6: Auction example

```java
@Override
public CommandHandler<Command, Event, AuctionState> commandHandler() {

  CommandHandlerBuilder<Command, Event, AuctionState> builder = newCommandHandlerBuilder();

  // running
  builder
      .forState(state -> state.stillRunning)
      .onCommand(
          OfferBid.class,
          (state, bid) ->
              Effect()
                  .persist(
                      new BidRegistered(
                          new Bid(
                              bid.bidder,
                              bid.offer,
                              Instant.ofEpochMilli(
                                  this.getReplicationContext().currentTimeMillis()),
                              this.getReplicationContext().replicaId()))))
      .onCommand(
          GetHighestBid.class,
          (state, get) -> {
            get.replyTo.tell(state.highestBid);
            return Effect().none();
          })
      .onCommand(
          Finish.class,
          (state, finish) ->
              Effect().persist(new AuctionFinished(getReplicationContext().replicaId())))
      .onCommand(Close.class, (state, close) -> Effect().unhandled())
      .onCommand(
          IsClosed.class,
          (state, get) -> {
            get.replyTo.tell(false);
            return Effect().none();
          });

  // finished
  builder
      .forAnyState()
      .onCommand(OfferBid.class, (state, bid) -> Effect().unhandled())
      .onCommand(
          GetHighestBid.class,
          (state, get) -> {
            get.replyTo.tell(state.highestBid);
            return Effect().none();
          })
      .onCommand(
          Finish.class,
          (state, finish) ->
              Effect().persist(new AuctionFinished(getReplicationContext().replicaId())))
      .onCommand(
          Close.class,
          (state, close) ->
              Effect()
                  .persist(
                      new WinnerDecided(
                          getReplicationContext().replicaId(),
                          state.highestBid,
                          state.highestCounterOffer)))
      .onCommand(
          IsClosed.class,
          (state, get) -> {
            get.replyTo.tell(state.isClosed());
            return Effect().none();
          });

  return builder.build();
}
```

### Example 7: Auction example

```scala
object AuctionEntity {

  def apply(
      replica: ReplicaId,
      name: String,
      initialBid: AuctionEntity.Bid, // the initial bid is basically the minimum price bidden at start time by the owner
      closingAt: Instant,
      responsibleForClosing: Boolean,
      allReplicas: Set[ReplicaId]): Behavior[Command] = Behaviors.setup[Command] { ctx =>
    Behaviors.withTimers { timers =>
      ReplicatedEventSourcing.commonJournalConfig(
        ReplicationId("auction", name, replica),
        allReplicas,
        PersistenceTestKitReadJournal.Identifier) { replicationCtx =>
        new AuctionEntity(ctx, replicationCtx, timers, closingAt, responsibleForClosing, allReplicas)
          .behavior(initialBid)
      }
    }
  }

}

class AuctionEntity(
    context: ActorContext[AuctionEntity.Command],
    replicationContext: ReplicationContext,
    timers: TimerScheduler[AuctionEntity.Command],
    closingAt: Instant,
    responsibleForClosing: Boolean,
    allReplicas: Set[ReplicaId]) {
  import AuctionEntity._

  private def behavior(initialBid: AuctionEntity.Bid): EventSourcedBehavior[Command, Event, AuctionState] =
    EventSourcedBehavior(
      replicationContext.persistenceId,
      AuctionState(phase = Running, highestBid = initialBid, highestCounterOffer = initialBid.offer),
      commandHandler,
      eventHandler).receiveSignal {
      case (state, RecoveryCompleted) => recoveryCompleted(state)
    }

  private def recoveryCompleted(state: AuctionState): Unit = {
    if (shouldClose(state))
      context.self ! Close

    val millisUntilClosing = closingAt.toEpochMilli - replicationContext.currentTimeMillis()
    timers.startSingleTimer(Finish, millisUntilClosing.millis)
  }
}
```

### Example 8: Auction example

```java
class AuctionEntity
    extends ReplicatedEventSourcedBehavior<
        AuctionEntity.Command, AuctionEntity.Event, AuctionEntity.AuctionState> {

  public static ReplicaId R1 = new ReplicaId("R1");
  public static ReplicaId R2 = new ReplicaId("R2");

  public static Set<ReplicaId> ALL_REPLICAS = new HashSet<>(Arrays.asList(R1, R2));

  private final ActorContext<Command> context;
  private final TimerScheduler<Command> timers;
  private final Bid initialBid;
  private final Instant closingAt;
  private final boolean responsibleForClosing;

  public static Behavior<Command> create(
      ReplicaId replica,
      String name,
      Bid initialBid,
      Instant closingAt,
      boolean responsibleForClosing) {
    return Behaviors.setup(
        ctx ->
            Behaviors.withTimers(
                timers ->
                    ReplicatedEventSourcing.commonJournalConfig(
                        new ReplicationId("Auction", name, replica),
                        ALL_REPLICAS,
                        PersistenceTestKitReadJournal.Identifier(),
                        replicationCtx ->
                            new AuctionEntity(
                                ctx,
                                replicationCtx,
                                timers,
                                initialBid,
                                closingAt,
                                responsibleForClosing))));
  }

  private AuctionEntity(
      ActorContext<Command> context,
      ReplicationContext replicationContext,
      TimerScheduler<Command> timers,
      Bid initialBid,
      Instant closingAt,
      boolean responsibleForClosing) {
    super(replicationContext);
    this.context = context;
    this.timers = timers;
    this.initialBid = initialBid;
    this.closingAt = closingAt;
    this.responsibleForClosing = responsibleForClosing;
  }

  @Override
  public AuctionState emptyState() {
    return new AuctionState(true, initialBid, initialBid.offer, Collections.emptySet());
  }

  @Override
  public SignalHandler<AuctionState> signalHandler() {
    return newSignalHandlerBuilder()
        .onSignal(RecoveryCompleted.instance(), this::onRecoveryCompleted)
        .build();
  }

  private void onRecoveryCompleted(AuctionState state) {
    if (shouldClose(state)) {
      context.getSelf().tell(Close.INSTANCE);
    }

    long millisUntilClosing =
        closingAt.toEpochMilli() - getReplicationContext().currentTimeMillis();
    timers.startSingleTimer(Finish.INSTANCE, Duration.ofMillis(millisUntilClosing));
  }

}
```

### Example 9: Auction example

```scala
/**
 * The auction passes through several workflow phases.
 * First, in `Running` `OfferBid` commands are accepted.
 *
 * `AuctionEntity` instances in all DCs schedule a `Finish` command
 * at a given time. That persists the `AuctionFinished` event and the
 * phase is in `Closing` until the auction is finished in all DCs.
 *
 * When the auction has been finished no more `OfferBid` commands are accepted.
 *
 * The auction is also finished immediately if `AuctionFinished` event from another
 * DC is seen before the scheduled `Finish` command. In that way the auction is finished
 * as quickly as possible in all DCs even though there might be some clock skew.
 *
 * One DC is responsible for finally deciding the winner and publishing the result.
 * All events must be collected from all DC before that can happen.
 * When the responsible DC has seen all `AuctionFinished` events from other DCs
 * all other events have also been propagated and it can persist `WinnerDecided` and
 * the auction is finally `Closed`.
 *
 */
sealed trait AuctionPhase
case object Running extends AuctionPhase
final case class Closing(finishedAtReplica: Set[ReplicaId]) extends AuctionPhase
case object Closed extends AuctionPhase
```

### Example 10: Auction example

```scala
case class AuctionState(phase: AuctionPhase, highestBid: Bid, highestCounterOffer: MoneyAmount)
    extends CborSerializable {

  def applyEvent(event: Event): AuctionState =
    event match {
      case BidRegistered(b) =>
        if (isHigherBid(b, highestBid))
          withNewHighestBid(b)
        else
          withTooLowBid(b)
      case AuctionFinished(atDc) =>
        phase match {
          case Running =>
            copy(phase = Closing(Set(atDc)))
          case Closing(alreadyFinishedDcs) =>
            copy(phase = Closing(alreadyFinishedDcs + atDc))
          case _ =>
            this
        }
      case _: WinnerDecided =>
        copy(phase = Closed)
    }

  def withNewHighestBid(bid: Bid): AuctionState = {
    require(phase != Closed)
    require(isHigherBid(bid, highestBid))
    copy(highestBid = bid, highestCounterOffer = highestBid.offer // keep last highest bid around
    )
  }

  def withTooLowBid(bid: Bid): AuctionState = {
    require(phase != Closed)
    require(isHigherBid(highestBid, bid))
    copy(highestCounterOffer = highestCounterOffer.max(bid.offer)) // update highest counter offer
  }

  def isHigherBid(first: Bid, second: Bid): Boolean =
    first.offer > second.offer ||
    (first.offer == second.offer && first.timestamp.isBefore(second.timestamp)) || // if equal, first one wins
    // If timestamps are equal, choose by dc where the offer was submitted
    // In real auctions, this last comparison should be deterministic but unpredictable, so that submitting to a
    // particular DC would not be an advantage.
    (first.offer == second.offer && first.timestamp.equals(second.timestamp) && first.originReplica.id
      .compareTo(second.originReplica.id) < 0)
}
```

### Example 11: Auction example

```java
static class AuctionState implements CborSerializable {

  final boolean stillRunning;
  final Bid highestBid;
  final int highestCounterOffer;
  final Set<String> finishedAtDc;

  AuctionState(
      boolean stillRunning, Bid highestBid, int highestCounterOffer, Set<String> finishedAtDc) {
    this.stillRunning = stillRunning;
    this.highestBid = highestBid;
    this.highestCounterOffer = highestCounterOffer;
    this.finishedAtDc = finishedAtDc;
  }

  AuctionState withNewHighestBid(Bid bid) {
    assertTrue(stillRunning);
    assertTrue(isHigherBid(bid, highestBid));
    return new AuctionState(
        stillRunning, bid, highestBid.offer, finishedAtDc); // keep last highest bid around
  }

  AuctionState withTooLowBid(Bid bid) {
    assertTrue(stillRunning);
    assertTrue(isHigherBid(highestBid, bid));
    return new AuctionState(
        stillRunning, highestBid, Math.max(highestCounterOffer, bid.offer), finishedAtDc);
  }

  static Boolean isHigherBid(Bid first, Bid second) {
    return first.offer > second.offer
        || (first.offer == second.offer && first.timestamp.isBefore(second.timestamp))
        || // if equal, first one wins
        // If timestamps are equal, choose by dc where the offer was submitted
        // In real auctions, this last comparison should be deterministic but unpredictable, so
        // that submitting to a
        // particular DC would not be an advantage.
        (first.offer == second.offer
            && first.timestamp.equals(second.timestamp)
            && first.originReplica.id().compareTo(second.originReplica.id()) < 0);
  }

  AuctionState addFinishedAtReplica(String replica) {
    Set<String> s = new HashSet<>(finishedAtDc);
    s.add(replica);
    return new AuctionState(
        false, highestBid, highestCounterOffer, Collections.unmodifiableSet(s));
  }

  public AuctionState close() {
    return new AuctionState(false, highestBid, highestCounterOffer, Collections.emptySet());
  }

  public boolean isClosed() {
    return !stillRunning && finishedAtDc.isEmpty();
  }
}
```

### Example 12: Triggering closing

```scala
private def eventTriggers(event: Event, newState: AuctionState): Unit = {
  event match {
    case finished: AuctionFinished =>
      newState.phase match {
        case Closing(alreadyFinishedAtDc) =>
          context.log.info(
            "AuctionFinished at {}, already finished at [{}]",
            finished.atReplica,
            alreadyFinishedAtDc.mkString(", "))
          if (alreadyFinishedAtDc(replicationContext.replicaId)) {
            if (shouldClose(newState)) context.self ! Close
          } else {
            context.log.info("Sending finish to self")
            context.self ! Finish
          }

        case _ => // no trigger for this state
      }
    case _ => // no trigger for this event
  }
}

private def shouldClose(state: AuctionState): Boolean = {
  responsibleForClosing && (state.phase match {
    case Closing(alreadyFinishedAtDc) =>
      val allDone = allReplicas.diff(alreadyFinishedAtDc).isEmpty
      if (!allDone) {
        context.log.info(
          s"Not closing auction as not all DCs have reported finished. All DCs: {}. Reported finished {}",
          allReplicas,
          alreadyFinishedAtDc)
      }
      allDone
    case _ =>
      false
  })
}
```

### Example 13: Triggering closing

```java
private void eventTriggers(AuctionFinished event, AuctionState newState) {
  if (newState.finishedAtDc.contains(getReplicationContext().replicaId().id())) {
    if (shouldClose(newState)) {
      context.getSelf().tell(Close.INSTANCE);
    }
  } else {
    context.getSelf().tell(Finish.INSTANCE);
  }
}

private boolean shouldClose(AuctionState state) {
  return responsibleForClosing
      && !state.isClosed()
      && getReplicationContext().getAllReplicas().stream()
          .map(ReplicaId::id)
          .collect(Collectors.toSet())
          .equals(state.finishedAtDc);
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-cart.html
- https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-examples.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-auction.html](https://doc.akka.io/libraries/akka-core/current/typed/replicated-eventsourcing-auction.html)*