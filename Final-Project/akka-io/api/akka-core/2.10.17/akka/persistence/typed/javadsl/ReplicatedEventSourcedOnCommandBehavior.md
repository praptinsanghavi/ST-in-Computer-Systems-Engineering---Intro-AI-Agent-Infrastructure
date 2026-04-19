---
description: Akka 2.10.17 - akka.persistence.typed.javadsl.ReplicatedEventSourcedOnCommandBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:49:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html
title: Akka 2.10.17 - akka.persistence.typed.javadsl.ReplicatedEventSourcedOnCommandBehavior
---

# Akka 2.10.17 - akka.persistence.typed.javadsl.ReplicatedEventSourcedOnCommandBehavior

> **Summary:** Akka 2.10.17 - akka.persistence.typed.javadsl.ReplicatedEventSourcedOnCommandBehavior

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")
- [CommandHandlerBuilder](CommandHandlerBuilder.html)
- [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html)
- [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")
- [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)
- [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how an event sourced actor reacts on a command.")
- [EventHandler](EventHandler.html "FunctionalInterface for reacting on events having been persisted")
- [EventHandlerBuilder](EventHandlerBuilder.html)
- [EventHandlerBuilderByState](EventHandlerBuilderByState.html)
- [EventSourcedBehavior](EventSourcedBehavior.html "For projects using Java 17 and newer, also see EventSourcedOnCommandBehavior")
- [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html "A EventSourcedBehavior that is enforcing that replies to commands are not forgotten.")
- [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "Event sourced behavior for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [EventWithMetadata](EventWithMetadata.html)
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html "Base class for replicated event sourced behaviors.")
- ReplicatedEventSourcedOnCommandBehavior
- [ReplicatedEventSourcedOnCommandWithReplyBehavior](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling can be done using switch pattern match.")
- [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplicationInterceptor](ReplicationInterceptor.html)
- [ReplyEffect](ReplyEffect.html "EventSourcedBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SignalHandler](SignalHandler.html)
- [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in EventSourcedBehavior")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
c[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[javadsl](index.html)

# ReplicatedEventSourcedOnCommandBehavior[**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html "Permalink")

### 

#### abstract  class ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] extends [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)\[Command, Event, State]

Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling
can be done using switch pattern match.

For building replicated event sourced actors with Java versions before 17, see [ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html)

Source[ReplicatedEventSourcedOnCommandBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.scala#L23)Linear Supertypes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)\[Command, Event, State], DeferredBehavior\[Command], [Behavior](../../../actor/typed/Behavior.html)\[Command], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicatedEventSourcedOnCommandBehavior
2. EventSourcedOnCommandBehavior
3. DeferredBehavior
4. Behavior
5. AnyRef
6. Any
Implicitly  
1. by BehaviorDecorators
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#<init>(replicationContext:akka.persistence.typed.javadsl.ReplicationContext):akka.persistence.typed.javadsl.ReplicatedEventSourcedOnCommandBehavior[Command,Event,State] "Permalink")  new ReplicatedEventSourcedOnCommandBehavior(replicationContext: [ReplicationContext](ReplicationContext.html))
2. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#<init>(replicationContext:akka.persistence.typed.javadsl.ReplicationContext,onPersistFailure:java.util.Optional[akka.actor.typed.BackoffSupervisorStrategy]):akka.persistence.typed.javadsl.ReplicatedEventSourcedOnCommandBehavior[Command,Event,State] "Permalink")  new ReplicatedEventSourcedOnCommandBehavior(replicationContext: [ReplicationContext](ReplicationContext.html), onPersistFailure: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html)])
### Abstract Value Members

1. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#emptyState:State "Permalink") abstract  def emptyState: StateImplement by returning the initial empty state object.

Implement by returning the initial empty state object.
This object will be passed into this behaviors handlers, until a new state replaces it.

Also known as "zero state" or "neutral state".

If the state is mutable, it is important that this creates a new State instance each time it is called
to ensure that the state is recreated in case of failure restarts.

Attributesprotected Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
2. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#onCommand(state:State,command:Command):akka.persistence.typed.javadsl.Effect[Event,State] "Permalink") abstract  def onCommand(state: State, command: Command): [Effect](Effect.html)\[Event, State]Implement by handling incoming commands and return an `Effect()` to persist or signal other effects
of the command handling such as stopping the behavior or others.

Implement by handling incoming commands and return an `Effect()` to persist or signal other effects
of the command handling such as stopping the behavior or others.

The command handlers are only invoked when the actor is running (i.e. not replaying).
While the actor is persisting events, the incoming messages are stashed and only
delivered to the handler once persisting them has completed.

Attributesprotected Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
3. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#onEvent(state:State,event:Event):State "Permalink") abstract  def onEvent(state: State, event: Event): StateImplement by applying the event to the current state in order to return a new state.

Implement by applying the event to the current state in order to return a new state.

The event handlers are invoked during recovery as well as running operation of this behavior,
in order to keep updating the state state.

For that reason it is strongly discouraged to perform side\-effects in this handler;
Side effects should be executed in `thenRun` or `recoveryCompleted` blocks.

Attributesprotected Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
### Concrete Value Members

1. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] toany2stringadd\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] toArrowAssoc\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#Effect:akka.persistence.typed.javadsl.EffectFactories[Event,State] "Permalink") final  def Effect: [EffectFactories](EffectFactories.html)\[Event, State]Factory of effects.

Factory of effects.

Return effects from your handlers in order to instruct persistence on how to act on the incoming message (i.e. persist events).

Attributesprotected Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
7. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#apply(context:akka.actor.typed.TypedActorContext[Command]):akka.actor.typed.Behavior[Command] "Permalink")  def apply(context: [TypedActorContext](../../../actor/typed/TypedActorContext.html)\[Command]): [Behavior](../../../actor/typed/Behavior.html)\[Command]INTERNAL API: DeferredBehavior init, not for user extension

INTERNAL API: DeferredBehavior init, not for user extension

Definition ClassesReplicatedEventSourcedOnCommandBehavior → [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html) → DeferredBehaviorAnnotations@[InternalApi](../../../annotation/InternalApi.html)()
8. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#behavior:akka.actor.typed.Behavior[Inner] "Permalink")  val behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command]ImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] to[BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../../../actor/typed/Behavior$.html).Definition Classes[BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)
10. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#deleteEventsOnSnapshot:Boolean "Permalink")  def deleteEventsOnSnapshot: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Can be used to delete events after `shouldSnapshot`.

Can be used to delete events after `shouldSnapshot`.

Can be used in combination with `[EventSourcedBehavior.retentionCriteria](EventSourcedBehavior.html#retentionCriteria:akka.persistence.typed.javadsl.RetentionCriteria)` in a way that events are triggered
up the the oldest snapshot based on `[RetentionCriteria.snapshotEvery](RetentionCriteria$.html#snapshotEvery(numberOfEvents:Int):akka.persistence.typed.javadsl.SnapshotCountRetentionCriteria)` config.

returns`true` if events should be deleted after `shouldSnapshot` evaluates to true

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
12. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] toEnsuring\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] toEnsuring\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] toEnsuring\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] toEnsuring\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#eventAdapter():akka.persistence.typed.EventAdapter[Event,_] "Permalink")  def eventAdapter(): [EventAdapter](../EventAdapter.html)\[Event, \_]Transform the event in another type before giving to the journal.

Transform the event in another type before giving to the journal. Can be used to wrap events
in types Journals understand but is of a different type than `Event`.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
19. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#getReplicationContext():akka.persistence.typed.javadsl.ReplicationContext "Permalink")  def getReplicationContext(): [ReplicationContext](ReplicationContext.html)Attributesprotected
21. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#journalPluginId:String "Permalink")  def journalPluginId: StringOverride and define the journal plugin id that this actor should use instead of the default.

Override and define the journal plugin id that this actor should use instead of the default.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
24. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#lastSequenceNumber(ctx:akka.actor.typed.javadsl.ActorContext[_]):Long "Permalink") final  def lastSequenceNumber(ctx: [ActorContext](../../../actor/typed/javadsl/ActorContext.html)\[\_]): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)The last sequence number that was persisted, can only be called from inside the handlers of an `EventSourcedBehavior`

The last sequence number that was persisted, can only be called from inside the handlers of an `EventSourcedBehavior`

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
25. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#narrow[U<:T]:akka.actor.typed.Behavior[U] "Permalink") final  def narrow\[U \<: Command]: [Behavior](../../../actor/typed/Behavior.html)\[U]Narrow the type of this Behavior, which is always a safe operation.

Narrow the type of this Behavior, which is always a safe operation. This
method is necessary to implement the contravariant nature of Behavior
(which cannot be expressed directly due to type inference problems).

Definition Classes[Behavior](../../../actor/typed/Behavior.html)
26. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#newSignalHandlerBuilder():akka.persistence.typed.javadsl.SignalHandlerBuilder[State] "Permalink") final  def newSignalHandlerBuilder(): [SignalHandlerBuilder](SignalHandlerBuilder.html)\[State]returnsA new, mutable signal handler builder

Attributesprotected Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
28. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#persistenceId:akka.persistence.typed.PersistenceId "Permalink")  val persistenceId: [PersistenceId](../PersistenceId.html)Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
31. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#recovery:akka.persistence.typed.javadsl.Recovery "Permalink")  def recovery: [Recovery](Recovery.html)Override to change the strategy for recovery of snapshots and events.

Override to change the strategy for recovery of snapshots and events.
By default, snapshots and events are recovered.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
32. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#replicationInterceptor:java.util.Optional[akka.persistence.typed.javadsl.ReplicationInterceptor[Event,State]] "Permalink")  def replicationInterceptor: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ReplicationInterceptor](ReplicationInterceptor.html)\[Event, State]]If a callback is returned it is invoked when an event from another replica arrives, delaying persisting the event until the returned
completion stage completes, if the future fails the actor is crashed.

If a callback is returned it is invoked when an event from another replica arrives, delaying persisting the event until the returned
completion stage completes, if the future fails the actor is crashed.

Only used when the entity is replicated.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
33. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#retentionCriteria:akka.persistence.typed.javadsl.RetentionCriteria "Permalink")  def retentionCriteria: [RetentionCriteria](RetentionCriteria.html)Criteria for retention/deletion of snapshots and events.

Criteria for retention/deletion of snapshots and events.
By default, retention is disabled and snapshots are not saved and deleted automatically.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
34. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#shouldSnapshot(state:State,event:Event,sequenceNr:Long):Boolean "Permalink")  def shouldSnapshot(state: State, event: Event, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Initiates a snapshot if the given predicate evaluates to true.

Initiates a snapshot if the given predicate evaluates to true.

Decide to store a snapshot based on the State, Event and sequenceNr when the event has
been successfully persisted.

When persisting multiple events at once the snapshot is triggered after all the events have
been persisted.

Snapshots triggered by `shouldSnapshot` will not trigger deletes of old snapshots and events if
[EventSourcedBehavior.retentionCriteria](EventSourcedBehavior.html#retentionCriteria:akka.persistence.typed.javadsl.RetentionCriteria) with [RetentionCriteria.snapshotEvery](RetentionCriteria$.html#snapshotEvery(numberOfEvents:Int):akka.persistence.typed.javadsl.SnapshotCountRetentionCriteria) is used together with
`shouldSnapshot`. Such deletes are only triggered by snapshots matching the `numberOfEvents` in the
[RetentionCriteria](RetentionCriteria.html).

Events can be deleted if `deleteEventsOnSnapshot` returns `true`.

returns`true` if snapshot should be saved at the given `state`, `event` and `sequenceNr` when the event has
 been successfully persisted

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
35. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#signalHandler():akka.persistence.typed.javadsl.SignalHandler[State] "Permalink")  def signalHandler(): [SignalHandler](SignalHandler.html)\[State]Override to react on general lifecycle signals and persistence specific signals (subtypes of
[akka.persistence.typed.EventSourcedSignal](../EventSourcedSignal.html)).

Override to react on general lifecycle signals and persistence specific signals (subtypes of
[akka.persistence.typed.EventSourcedSignal](../EventSourcedSignal.html)).

Use [EventSourcedBehavior\#newSignalHandlerBuilder](EventSourcedBehavior.html#newSignalHandlerBuilder():akka.persistence.typed.javadsl.SignalHandlerBuilder[State]) to define the signal handler.

Attributesprotected Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
36. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#snapshotAdapter():akka.persistence.typed.SnapshotAdapter[State] "Permalink")  def snapshotAdapter(): [SnapshotAdapter](../SnapshotAdapter.html)\[State]Transform the state into another type before giving it to and from the journal.

Transform the state into another type before giving it to and from the journal. Can be used
to migrate from different state types e.g. when migration from PersistentFSM to Typed EventSourcedBehavior.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
37. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#snapshotPluginId:String "Permalink")  def snapshotPluginId: StringOverride and define the snapshot store plugin id that this actor should use instead of the default.

Override and define the snapshot store plugin id that this actor should use instead of the default.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
38. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#stashCapacity:java.util.Optional[Integer] "Permalink")  def stashCapacity: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]Override to define a custom stash capacity per entity.

Override to define a custom stash capacity per entity.
If not defined, the default `akka.persistence.typed.stash-capacity` will be used.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
39. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
40. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#tagsFor(state:State,event:Event):java.util.Set[String] "Permalink")  def tagsFor(state: State, event: Event): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Return tags to store for the given event and state, the tags can then be used in persistence query.

Return tags to store for the given event and state, the tags can then be used in persistence query.
The state passed to the tagger allows for toggling a tag with one event but keep all events after it tagged
based on a property or the type of the state.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
41. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#tagsFor(event:Event):java.util.Set[String] "Permalink")  def tagsFor(event: Event): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Return tags to store for the given event, the tags can then be used in persistence query.

Return tags to store for the given event, the tags can then be used in persistence query.

If State) is overriden this method is ignored.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)
42. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
43. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#transformMessages[Outer](matcher:PartialFunction[Outer,Inner])(implicitevidence$1:scala.reflect.ClassTag[Outer]):akka.actor.typed.Behavior[Outer] "Permalink")  def transformMessages\[Outer](matcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Outer, Command])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Outer]): [Behavior](../../../actor/typed/Behavior.html)\[Outer]Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy.

Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
PartialFunction decides which message to pull in (those that it is defined
at) and may transform the incoming message to place them into the wrapped
Behavior’s type hierarchy. Signals are not transformed.

Example:

```
val b: Behavior[Number] =
  Behaviors
    .receive[String] { (ctx, msg) =>
      println(msg)
      Behaviors.same
    }
    .transformMessages[Number] {
      case b: BigDecimal => s"BigDecimal(&dollar;b)"
      case i: BigInt     => s"BigInteger(&dollar;i)"
      // all other kinds of Number will be `unhandled`
    }
```
The `ClassTag` for `Outer` ensures that only messages of this class or a subclass thereof will be
intercepted. Other message types (e.g. a private protocol) will bypass
the interceptor and be continue to the inner behavior untouched.

ImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] to[BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../../../actor/typed/Behavior$.html).Definition Classes[BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)
44. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
46. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
47. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#withEventPublishing:Boolean "Permalink")  def withEventPublishing: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Override and return false to disable events being published to the system event stream as
[akka.persistence.typed.PublishedEvent](../PublishedEvent.html) after they have been persisted.
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] toStringFormat\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#snapshotSelectionCriteria:akka.persistence.typed.SnapshotSelectionCriteria "Permalink")  def snapshotSelectionCriteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)Override and define the snapshot selection criteria used by this actor instead of the default.

Override and define the snapshot selection criteria used by this actor instead of the default.
By default the most recent snapshot is used, and the remaining state updates are recovered by replaying events
from the sequence number up until which the snapshot reached.

You may configure the behavior to skip replaying snapshots completely, in which case the recovery will be
performed by replaying all events \-\- which may take a long time.

Definition Classes[EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)Annotations@deprecated Deprecated*(Since version 2\.6\.5\)* override recovery instead
4. [**](../../../../akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] toArrowAssoc\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html)\[Command, Event, State]

### Inherited from DeferredBehavior\[Command]

### Inherited from [Behavior](../../../actor/typed/Behavior.html)\[Command]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion BehaviorDecorators fromReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] to [BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command]

### Inherited by implicit conversion any2stringadd fromReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] to any2stringadd\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]]

### Inherited by implicit conversion StringFormat fromReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] to StringFormat\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]]

### Inherited by implicit conversion Ensuring fromReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] to Ensuring\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]]

### Inherited by implicit conversion ArrowAssoc fromReplicatedEventSourcedOnCommandBehavior\[Command, Event, State] to ArrowAssoc\[ReplicatedEventSourcedOnCommandBehavior\[Command, Event, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior$$BehaviorDecorators.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EffectFactories.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilder$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventWithMetadata$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventWithMetadata.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicationInterceptor.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html)*