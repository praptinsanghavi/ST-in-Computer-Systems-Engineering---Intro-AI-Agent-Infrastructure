---
description: Akka 2.6.21 - akka.persistence.fsm.AbstractPersistentLoggingFSM
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:23:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
title: Akka 2.6.21 - akka.persistence.fsm.AbstractPersistentLoggingFSM
---

# Akka 2.6.21 - akka.persistence.fsm.AbstractPersistentLoggingFSM

> **Summary:** Akka 2.6.21 - akka.persistence.fsm.AbstractPersistentLoggingFSM

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/fsm/index.html "Permalink")  package [fsm](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/fsm/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[fsm](index.html)
- [AbstractPersistentFSM](AbstractPersistentFSM.html "Java API: compatible with lambda expressions")
- [AbstractPersistentFSMBase](AbstractPersistentFSMBase.html "Java API: compatible with lambda expressions")
- AbstractPersistentLoggingFSM
- [LoggingPersistentFSM](LoggingPersistentFSM.html "Stackable trait for akka.actor.FSM which adds a rolling event log and debug logging capabilities (analogous to akka.event.LoggingReceive).")
- [PersistentFSM](PersistentFSM.html "A FSM implementation with persistent state.")
- [PersistentFSMBase](PersistentFSMBase.html "Finite State Machine actor trait.")
c[akka](../../index.html).[persistence](../index.html).[fsm](index.html)

# AbstractPersistentLoggingFSM[**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html "Permalink")

### 

#### abstract  class AbstractPersistentLoggingFSM\[S \<: [FSMState](PersistentFSM$$FSMState.html), D, E] extends [AbstractPersistentFSM](AbstractPersistentFSM.html)\[S, D, E] with [LoggingPersistentFSM](LoggingPersistentFSM.html)\[S, D, E] with [PersistentFSM](PersistentFSM.html)\[S, D, E]

Java API: compatible with lambda expressions

Persistent Finite State Machine actor abstract base class with FSM Logging

Annotations@nowarn() @deprecated Deprecated*(Since version 2\.6\.0\)* Use EventSourcedBehavior

Source[PersistentFSM.scala](https://github.com/akka/akka/tree/v2.6.21//akka-persistence/src/main/scala/akka/persistence/fsm/PersistentFSM.scala#L541)Linear Supertypes[LoggingPersistentFSM](LoggingPersistentFSM.html)\[S, D, E], [AbstractPersistentFSM](AbstractPersistentFSM.html)\[S, D, E], [PersistentFSM](PersistentFSM.html)\[S, D, E], [PersistentActor](../PersistentActor.html), Eventsourced, [PersistenceRecovery](../PersistenceRecovery.html), [PersistenceIdentity](../PersistenceIdentity.html), [PersistenceStash](../PersistenceStash.html), StashFactory, [Stash](../../actor/Stash.html), [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html)], [UnrestrictedStash](../../actor/UnrestrictedStash.html), StashSupport, [Snapshotter](../Snapshotter.html), [AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)\[S, D, E], [PersistentFSMBase](PersistentFSMBase.html)\[S, D, E], [ActorLogging](../../actor/ActorLogging.html), [Listeners](../../routing/Listeners.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AbstractPersistentLoggingFSM
2. LoggingPersistentFSM
3. AbstractPersistentFSM
4. PersistentFSM
5. PersistentActor
6. Eventsourced
7. PersistenceRecovery
8. PersistenceIdentity
9. PersistenceStash
10. StashFactory
11. Stash
12. RequiresMessageQueue
13. UnrestrictedStash
14. StashSupport
15. Snapshotter
16. AbstractPersistentFSMBase
17. PersistentFSMBase
18. ActorLogging
19. Listeners
20. Actor
21. AnyRef
22. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#<init>():akka.persistence.fsm.AbstractPersistentLoggingFSM[S,D,E] "Permalink")  new AbstractPersistentLoggingFSM()
### Type Members

1. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#Event=akka.persistence.fsm.PersistentFSM.Event[D] "Permalink")  type Event \= [PersistentFSM.Event](PersistentFSM$$Event.html)\[D]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
2. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
3. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#State=akka.persistence.fsm.PersistentFSM.State[S,D,E] "Permalink")  type State \= [PersistentFSM.State](PersistentFSM$$State.html)\[S, D, E]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
4. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State] "Permalink")  type StateFunction \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Event](#Event=akka.persistence.fsm.PersistentFSM.Event[D]), [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
5. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#StopEvent=akka.persistence.fsm.PersistentFSM.StopEvent[S,D] "Permalink")  type StopEvent \= [PersistentFSM.StopEvent](PersistentFSM$$StopEvent.html)\[S, D]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
6. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#Timeout=Option[scala.concurrent.duration.FiniteDuration] "Permalink")  type Timeout \= [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
7. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#TransitionHandler=PartialFunction[(S,S),Unit] "Permalink")  type TransitionHandler \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[(S, S), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
8. [**](../../../akka/persistence/fsm/PersistentFSMBase$TransformHelper.html "Permalink") final  class [TransformHelper](PersistentFSMBase$TransformHelper.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
### Abstract Value Members

1. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#applyEvent(domainEvent:E,currentData:D):D "Permalink") abstract  def applyEvent(domainEvent: E, currentData: D): DOverride this handler to define the action on Domain Event

Override this handler to define the action on Domain Event

domainEventdomain event to apply

currentDatastate data of the previous state

returnsupdated state data

Definition Classes[PersistentFSM](PersistentFSM.html)
2. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#domainEventClass:Class[E] "Permalink") abstract  def domainEventClass: Class\[E]Domain event's Class
Used for identifying domain events during recovery

Domain event's Class
Used for identifying domain events during recovery

Definition Classes[AbstractPersistentFSM](AbstractPersistentFSM.html)
3. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#persistenceId:String "Permalink") abstract  def persistenceId: StringId of the persistent entity for which messages should be replayed.

Id of the persistent entity for which messages should be replayed.

Definition Classes[PersistenceIdentity](../PersistenceIdentity.html)
### Concrete Value Members

1. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AbstractPersistentLoggingFSM\[S, D, E] toany2stringadd\[AbstractPersistentLoggingFSM\[S, D, E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#->:akka.persistence.fsm.PersistentFSM.->.type "Permalink")  val \-\>: [PersistentFSM.\-\>](PersistentFSM$$$minus$greater$.html).typeThis extractor is just convenience for matching a (S, S) pair, including a
reminder what the new state is.

This extractor is just convenience for matching a (S, S) pair, including a
reminder what the new state is.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
5. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#Event:akka.persistence.fsm.PersistentFSM.Event.type "Permalink")  val Event: PersistentFSM.Event.typeDefinition Classes[PersistentFSMBase](PersistentFSMBase.html)
7. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#Normal:akka.persistence.fsm.PersistentFSM.Reason "Permalink")  val Normal: [Reason](PersistentFSM$$Reason.html)Default reason if calling `stop()`.

Default reason if calling `stop()`.

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
8. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#Shutdown:akka.persistence.fsm.PersistentFSM.Reason "Permalink")  val Shutdown: [Reason](PersistentFSM$$Reason.html)Reason given when someone was calling `system.stop(fsm)` from outside;
also applies to `Stop` supervision directive.

Reason given when someone was calling `system.stop(fsm)` from outside;
also applies to `Stop` supervision directive.

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
9. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#StateTimeout:akka.persistence.fsm.PersistentFSM.StateTimeout.type "Permalink")  val StateTimeout: [PersistentFSM.StateTimeout](PersistentFSM$$StateTimeout$.html).typeThis case object is received in case of a state timeout.

This case object is received in case of a state timeout.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
10. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#StopEvent:akka.persistence.fsm.PersistentFSM.StopEvent.type "Permalink")  val StopEvent: PersistentFSM.StopEvent.typeDefinition Classes[PersistentFSMBase](PersistentFSMBase.html)
11. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
12. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
13. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
14. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
15. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#aroundReceive(receive:Eventsourced.this.Receive,message:Any):Unit "Permalink")  def aroundReceive(receive: [Receive](#Receive=akka.actor.Actor.Receive), message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

receivecurrent behavior.

Attributesprotected\[[akka](../../index.html)] Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
16. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
17. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#cancelTimer(name:String):Unit "Permalink") final  def cancelTimer(name: String): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Cancel named timer, ensuring that the message is not subsequently delivered (no race).

Cancel named timer, ensuring that the message is not subsequently delivered (no race).

nameof the timer to cancel

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
18. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
19. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
20. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#defer[A](event:A)(handler:A=>Unit):Unit "Permalink")  def defer\[A](event: A)(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Defer the handler execution until all pending handlers have been executed.

Defer the handler execution until all pending handlers have been executed. It is guaranteed that no new commands
will be received by a persistent actor between a call to `defer` and the execution of its `handler`.
Allows to define logic within the actor, which will respect the invocation\-order\-guarantee
in respect to `persistAsync` or `persist` calls. That is, if `persistAsync` or `persist` was invoked before `defer`,
the corresponding handlers will be invoked in the same order as they were registered in.

This call will NOT result in `event` being persisted, use `persist` or `persistAsync` instead
if the given event should possible to replay.

If there are no pending persist handler calls, the handler will be called immediately.

If persistence of an earlier event fails, the persistent actor will stop, and the `handler`
will not be run.

eventevent to be handled in the future, when preceding persist operations have been processes

handlerhandler for the given `event`

Definition Classes[PersistentActor](../PersistentActor.html)
21. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#deferAsync[A](event:A)(handler:A=>Unit):Unit "Permalink")  def deferAsync\[A](event: A)(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Defer the handler execution until all pending handlers have been executed.

Defer the handler execution until all pending handlers have been executed.
Allows to define logic within the actor, which will respect the invocation\-order\-guarantee
in respect to `persistAsync` or `persist` calls. That is, if `persistAsync` or `persist` was invoked before `deferAsync`,
the corresponding handlers will be invoked in the same order as they were registered in.

This call will NOT result in `event` being persisted, use `persist` or `persistAsync` instead
if the given event should possible to replay.

If there are no pending persist handler calls, the handler will be called immediately.

If persistence of an earlier event fails, the persistent actor will stop, and the `handler`
will not be run.

eventevent to be handled in the future, when preceding persist operations have been processes

handlerhandler for the given `event`

Definition Classes[PersistentActor](../PersistentActor.html)
22. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#deleteMessages(toSequenceNr:Long):Unit "Permalink")  def deleteMessages(toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Permanently deletes all persistent messages with sequence numbers less than or equal `toSequenceNr`.

Permanently deletes all persistent messages with sequence numbers less than or equal `toSequenceNr`.

If the delete is successful a [DeleteMessagesSuccess](../DeleteMessagesSuccess.html) will be sent to the actor.
If the delete fails a [DeleteMessagesFailure](../DeleteMessagesFailure.html) will be sent to the actor.

The given `toSequenceNr` must be less than or equal to Eventsourced\#lastSequenceNr, otherwise
[DeleteMessagesFailure](../DeleteMessagesFailure.html) is sent to the actor without performing the delete. All persistent
messages may be deleted without specifying the actual sequence number by using `Long.MaxValue`
as the `toSequenceNr`.

toSequenceNrupper sequence number (inclusive) bound of persistent messages to be deleted.

Definition ClassesEventsourced
23. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#deleteSnapshot(sequenceNr:Long):Unit "Permalink")  def deleteSnapshot(sequenceNr: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Deletes the snapshot identified by `sequenceNr`.

Deletes the snapshot identified by `sequenceNr`.

The [PersistentActor](../PersistentActor.html) will be notified about the status of the deletion
via an [DeleteSnapshotSuccess](../DeleteSnapshotSuccess.html) or [DeleteSnapshotFailure](../DeleteSnapshotFailure.html) message.

Definition Classes[Snapshotter](../Snapshotter.html)
24. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#deleteSnapshots(criteria:akka.persistence.SnapshotSelectionCriteria):Unit "Permalink")  def deleteSnapshots(criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Deletes all snapshots matching `criteria`.

Deletes all snapshots matching `criteria`.

The [PersistentActor](../PersistentActor.html) will be notified about the status of the deletion
via an [DeleteSnapshotsSuccess](../DeleteSnapshotsSuccess.html) or [DeleteSnapshotsFailure](../DeleteSnapshotsFailure.html) message.

Definition Classes[Snapshotter](../Snapshotter.html)
25. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#domainEventClassTag:scala.reflect.ClassTag[E] "Permalink") final  def domainEventClassTag: [ClassTag](https://www.scala-lang.org/api/2.13.8/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[E]Adapter from Java Class to [scala.reflect.ClassTag](https://www.scala-lang.org/api/2.13.8/scala/reflect/ClassTag.html)

Adapter from Java Class to [scala.reflect.ClassTag](https://www.scala-lang.org/api/2.13.8/scala/reflect/ClassTag.html)

returnsdomain event [scala.reflect.ClassTag](https://www.scala-lang.org/api/2.13.8/scala/reflect/ClassTag.html)

Definition Classes[AbstractPersistentFSM](AbstractPersistentFSM.html) → [PersistentFSM](PersistentFSM.html)
26. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#domainEventTag:scala.reflect.ClassTag[E] "Permalink")  val domainEventTag: [ClassTag](https://www.scala-lang.org/api/2.13.8/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[E]Domain event's [scala.reflect.ClassTag](https://www.scala-lang.org/api/2.13.8/scala/reflect/ClassTag.html)
Used for identifying domain events during recovery

Domain event's [scala.reflect.ClassTag](https://www.scala-lang.org/api/2.13.8/scala/reflect/ClassTag.html)
Used for identifying domain events during recovery

Definition Classes[PersistentFSM](PersistentFSM.html)
27. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AbstractPersistentLoggingFSM\[S, D, E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): AbstractPersistentLoggingFSM\[S, D, E]ImplicitThis member is added by an implicit conversion from AbstractPersistentLoggingFSM\[S, D, E] toEnsuring\[AbstractPersistentLoggingFSM\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
28. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AbstractPersistentLoggingFSM\[S, D, E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): AbstractPersistentLoggingFSM\[S, D, E]ImplicitThis member is added by an implicit conversion from AbstractPersistentLoggingFSM\[S, D, E] toEnsuring\[AbstractPersistentLoggingFSM\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
29. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): AbstractPersistentLoggingFSM\[S, D, E]ImplicitThis member is added by an implicit conversion from AbstractPersistentLoggingFSM\[S, D, E] toEnsuring\[AbstractPersistentLoggingFSM\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
30. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): AbstractPersistentLoggingFSM\[S, D, E]ImplicitThis member is added by an implicit conversion from AbstractPersistentLoggingFSM\[S, D, E] toEnsuring\[AbstractPersistentLoggingFSM\[S, D, E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
31. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
33. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#exec(action:java.util.function.Consumer[D]):D=>Unit "Permalink") final  def exec(action: [Consumer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html#java.util.function.Consumer)\[D]): (D) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Adapter from Java 8 Functional Interface to Scala Function

Adapter from Java 8 Functional Interface to Scala Function

action\- Java 8 lambda expression defining the action

returnsaction represented as a Scala Function

Definition Classes[AbstractPersistentFSM](AbstractPersistentFSM.html)
34. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
35. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#getContext():akka.actor.AbstractActor.ActorContext "Permalink")  def getContext(): [ActorContext](../../actor/AbstractActor$$ActorContext.html)Returns this AbstractActor's ActorContext
The ActorContext is not thread safe so do not expose it outside of the
AbstractActor.

Returns this AbstractActor's ActorContext
The ActorContext is not thread safe so do not expose it outside of the
AbstractActor.

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
36. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#getLog:IndexedSeq[akka.persistence.fsm.PersistentFSM.LogEntry[S,D]] "Permalink")  def getLog: IndexedSeq\[[LogEntry](PersistentFSM$$LogEntry.html)\[S, D]]Retrieve current rolling log in oldest\-first order.

Retrieve current rolling log in oldest\-first order. The log is filled with
each incoming event before processing by the user supplied state handler.
The log entries are lost when this actor is restarted.

Attributesprotected Definition Classes[LoggingPersistentFSM](LoggingPersistentFSM.html)
37. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#getSelf():akka.actor.ActorRef "Permalink")  def getSelf(): [ActorRef](../../actor/ActorRef.html)Returns the ActorRef for this actor.

Returns the ActorRef for this actor.

Same as `self()`.

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
38. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#getSender():akka.actor.ActorRef "Permalink")  def getSender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the currently processed message.

The reference sender Actor of the currently processed message. This is
always a legal destination to send to, even if there is no logical recipient
for the reply, in which case it will be sent to the dead letter mailbox.

Same as `sender()`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
39. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#goTo(nextStateName:S):AbstractPersistentFSMBase.this.State "Permalink") final  def goTo(nextStateName: S): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce transition to other state.

Produce transition to other state. Return this from a state function in
order to effect the transition.

nextStateNamestate designator for the next state

returnsstate transition descriptor

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
40. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#gossip(msg:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def gossip(msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../../actor/ActorRef.html) \= [Actor.noSender](../../index.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Sends the supplied message to all current listeners using the provided sender() as sender.

Sends the supplied message to all current listeners using the provided sender() as sender.

Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
41. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#goto(nextStateName:S):PersistentFSMBase.this.State "Permalink") final  def goto(nextStateName: S): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce transition to other state.

Produce transition to other state.
Return this from a state function in order to effect the transition.

This method always triggers transition events, even for `A -> A` transitions.
If you want to stay in the same state without triggering an state transition event use [\#stay](#stay():PersistentFSMBase.this.State) instead.

nextStateNamestate designator for the next state

returnsstate transition descriptor

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
42. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
43. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#internalStashOverflowStrategy:akka.persistence.StashOverflowStrategy "Permalink")  def internalStashOverflowStrategy: [StashOverflowStrategy](../StashOverflowStrategy.html)The returned [StashOverflowStrategy](../StashOverflowStrategy.html) object determines how to handle the message failed to stash
when the internal Stash capacity exceeded.

The returned [StashOverflowStrategy](../StashOverflowStrategy.html) object determines how to handle the message failed to stash
when the internal Stash capacity exceeded.

Definition Classes[PersistenceStash](../PersistenceStash.html)
44. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
45. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#isTimerActive(name:String):Boolean "Permalink") final  def isTimerActive(name: String): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Inquire whether the named timer is still active.

Inquire whether the named timer is still active. Returns true unless the
timer does not exist, has previously been canceled or if it was a
single\-shot timer whose message was already received.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
46. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#journalPluginId:String "Permalink")  def journalPluginId: StringConfiguration id of the journal plugin servicing this persistent actor.

Configuration id of the journal plugin servicing this persistent actor.
When empty, looks in `akka.persistence.journal.plugin` to find configuration entry path.
When configured, uses `journalPluginId` as absolute path to the journal configuration entry.
Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.

Definition Classes[PersistenceIdentity](../PersistenceIdentity.html)
47. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#lastSequenceNr:Long "Permalink")  def lastSequenceNr: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)Highest received sequence number so far or `0L` if this actor hasn't replayed
or stored any persistent events yet.

Highest received sequence number so far or `0L` if this actor hasn't replayed
or stored any persistent events yet.

Definition ClassesEventsourced
48. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#listenerManagement:akka.actor.Actor.Receive "Permalink")  def listenerManagement: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Chain this into the receive function.

Chain this into the receive function.

```
def receive = listenerManagement orElse …
```
Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
49. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#listeners:java.util.Set[akka.actor.ActorRef] "Permalink")  val listeners: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](../../actor/ActorRef.html)]Attributesprotected Definition Classes[Listeners](../../routing/Listeners.html)
50. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#loadSnapshot(persistenceId:String,criteria:akka.persistence.SnapshotSelectionCriteria,toSequenceNr:Long):Unit "Permalink")  def loadSnapshot(persistenceId: String, criteria: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html), toSequenceNr: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Instructs the snapshot store to load the specified snapshot and send it via an [SnapshotOffer](../SnapshotOffer.html)
to the running [PersistentActor](../PersistentActor.html).

Instructs the snapshot store to load the specified snapshot and send it via an [SnapshotOffer](../SnapshotOffer.html)
to the running [PersistentActor](../PersistentActor.html).

Definition Classes[Snapshotter](../Snapshotter.html)
51. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../../event/LoggingAdapter.html)Definition Classes[ActorLogging](../../actor/ActorLogging.html)
52. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#logDepth:Int "Permalink")  def logDepth: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition Classes[LoggingPersistentFSM](LoggingPersistentFSM.html)
53. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#logTermination(reason:akka.persistence.fsm.PersistentFSM.Reason):Unit "Permalink")  def logTermination(reason: [Reason](PersistentFSM$$Reason.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)By default [PersistentFSM.Failure](PersistentFSM$$Failure.html) is logged at error level and other reason
types are not logged.

By default [PersistentFSM.Failure](PersistentFSM$$Failure.html) is logged at error level and other reason
types are not logged. It is possible to override this behavior.

Attributesprotected Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
54. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchAnyEvent(apply:akka.japi.pf.FI.Apply2[AnyRef,D,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchAnyEvent(apply: Apply2\[[AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), D, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches on any type of event.

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
55. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchData[DT<:D](dataType:Class[DT],predicate:akka.japi.pf.FI.TypedPredicate[DT],apply:akka.japi.pf.FI.UnitApply[DT]):akka.japi.pf.UnitPFBuilder[D] "Permalink") final  def matchData\[DT \<: D](dataType: Class\[DT], predicate: TypedPredicate\[DT], apply: UnitApply\[DT]): [UnitPFBuilder](../../japi/pf/UnitPFBuilder.html)\[D]Create a [akka.japi.pf.UnitPFBuilder](../../japi/pf/UnitPFBuilder.html) with the first case statement set.

Create a [akka.japi.pf.UnitPFBuilder](../../japi/pf/UnitPFBuilder.html) with the first case statement set.

dataTypea type to match the argument against

predicatea predicate that will be evaluated on the argument if the type matches

applyan action to apply to the argument if the type and predicate matches

returnsa builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
56. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchData[DT<:D](dataType:Class[DT],apply:akka.japi.pf.FI.UnitApply[DT]):akka.japi.pf.UnitPFBuilder[D] "Permalink") final  def matchData\[DT \<: D](dataType: Class\[DT], apply: UnitApply\[DT]): [UnitPFBuilder](../../japi/pf/UnitPFBuilder.html)\[D]Create a [akka.japi.pf.UnitPFBuilder](../../japi/pf/UnitPFBuilder.html) with the first case statement set.

Create a [akka.japi.pf.UnitPFBuilder](../../japi/pf/UnitPFBuilder.html) with the first case statement set.

dataTypea type to match the argument against

applyan action to apply to the argument if the type matches

returnsa builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
57. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchEvent(eventMatches:java.util.List[AnyRef],apply:akka.japi.pf.FI.Apply2[AnyRef,D,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchEvent(eventMatches: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)], apply: Apply2\[[AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), D, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches if any of the event types in the list match or any
of the event instances in the list compares equal.

eventMatchesa list of types or instances to match against

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
58. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchEvent[DT<:D](eventMatches:java.util.List[AnyRef],dataType:Class[DT],apply:akka.japi.pf.FI.Apply2[AnyRef,DT,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchEvent\[DT \<: D](eventMatches: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)], dataType: Class\[DT], apply: Apply2\[[AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), DT, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches on the data type and if any of the event types
in the list match or any of the event instances in the list compares equal.

eventMatchesa list of types or instances to match against

dataTypethe data type to match on

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
59. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchEvent(predicate:akka.japi.pf.FI.TypedPredicate2[AnyRef,D],apply:akka.japi.pf.FI.Apply2[AnyRef,D,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchEvent(predicate: TypedPredicate2\[[AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), D], apply: Apply2\[[AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), D, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches if the predicate matches.

predicatea predicate that will be evaluated on the data and the event

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
60. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchEvent[ET](eventType:Class[ET],apply:akka.japi.pf.FI.Apply2[ET,D,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchEvent\[ET](eventType: Class\[ET], apply: Apply2\[ET, D, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches if the event type matches.

eventTypethe event type to match on

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
61. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchEvent[ET](eventType:Class[ET],predicate:akka.japi.pf.FI.TypedPredicate2[ET,D],apply:akka.japi.pf.FI.Apply2[ET,D,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchEvent\[ET](eventType: Class\[ET], predicate: TypedPredicate2\[ET, D], apply: Apply2\[ET, D, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches if the event type and predicate matches.

eventTypethe event type to match on

predicatea predicate that will be evaluated on the data and the event

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
62. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchEvent[ET,DT<:D](eventType:Class[ET],dataType:Class[DT],apply:akka.japi.pf.FI.Apply2[ET,DT,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchEvent\[ET, DT \<: D](eventType: Class\[ET], dataType: Class\[DT], apply: Apply2\[ET, DT, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches on an event and data type.

eventTypethe event type to match on

dataTypethe data type to match on

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
63. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchEvent[ET,DT<:D](eventType:Class[ET],dataType:Class[DT],predicate:akka.japi.pf.FI.TypedPredicate2[ET,DT],apply:akka.japi.pf.FI.Apply2[ET,DT,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchEvent\[ET, DT \<: D](eventType: Class\[ET], dataType: Class\[DT], predicate: TypedPredicate2\[ET, DT], apply: Apply2\[ET, DT, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches on an event and data type and a predicate.

eventTypethe event type to match on

dataTypethe data type to match on

predicatea predicate to evaluate on the matched types

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
64. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchEventEquals[Ev](event:Ev,apply:akka.japi.pf.FI.Apply2[Ev,D,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchEventEquals\[Ev](event: Ev, apply: Apply2\[Ev, D, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches if the event compares equal.

eventan event to compare equal against

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
65. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchEventEquals[Ev,DT<:D](event:Ev,dataType:Class[DT],apply:akka.japi.pf.FI.Apply2[Ev,DT,AbstractPersistentFSMBase.this.State]):akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E] "Permalink") final  def matchEventEquals\[Ev, DT \<: D](event: Ev, dataType: Class\[DT], apply: Apply2\[Ev, DT, [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])]): [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStateFunctionBuilder](../../japi/pf/FSMStateFunctionBuilder.html) with the first case statement set.

A case statement that matches on the data type and if the event compares equal.

eventan event to compare equal against

dataTypethe data type to match on

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
66. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchState(fromState:S,toState:S,apply:akka.japi.pf.FI.UnitApply2[S,S]):akka.japi.pf.FSMTransitionHandlerBuilder[S] "Permalink") final  def matchState(fromState: S, toState: S, apply: UnitApply2\[S, S]): [FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html)\[S]Create an [akka.japi.pf.FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html) with the first case statement set.

A case statement that matches on a from state and a to state.

fromStatethe from state to match on

toStatethe to state to match on

applyan action to apply when the states match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
67. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchState(fromState:S,toState:S,apply:akka.japi.pf.FI.UnitApplyVoid):akka.japi.pf.FSMTransitionHandlerBuilder[S] "Permalink") final  def matchState(fromState: S, toState: S, apply: UnitApplyVoid): [FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html)\[S]Create an [akka.japi.pf.FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html) with the first case statement set.

A case statement that matches on a from state and a to state.

fromStatethe from state to match on

toStatethe to state to match on

applyan action to apply when the states match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
68. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchStop[RT<:akka.persistence.fsm.PersistentFSM.Reason](reasonType:Class[RT],predicate:akka.japi.pf.FI.TypedPredicate[RT],apply:akka.japi.pf.FI.UnitApply3[RT,S,D]):akka.persistence.fsm.japi.pf.FSMStopBuilder[S,D] "Permalink") final  def matchStop\[RT \<: [Reason](PersistentFSM$$Reason.html)](reasonType: Class\[RT], predicate: TypedPredicate\[RT], apply: UnitApply3\[RT, S, D]): [FSMStopBuilder](japi/pf/FSMStopBuilder.html)\[S, D]Create an [akka.japi.pf.FSMStopBuilder](../../japi/pf/FSMStopBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStopBuilder](../../japi/pf/FSMStopBuilder.html) with the first case statement set.

A case statement that matches on a reason type and a predicate.

reasonTypethe reason type to match on

predicatea predicate that will be evaluated on the reason if the type matches

applyan action to apply to the reason, event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
69. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchStop[RT<:akka.persistence.fsm.PersistentFSM.Reason](reasonType:Class[RT],apply:akka.japi.pf.FI.UnitApply3[RT,S,D]):akka.persistence.fsm.japi.pf.FSMStopBuilder[S,D] "Permalink") final  def matchStop\[RT \<: [Reason](PersistentFSM$$Reason.html)](reasonType: Class\[RT], apply: UnitApply3\[RT, S, D]): [FSMStopBuilder](japi/pf/FSMStopBuilder.html)\[S, D]Create an [akka.japi.pf.FSMStopBuilder](../../japi/pf/FSMStopBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStopBuilder](../../japi/pf/FSMStopBuilder.html) with the first case statement set.

A case statement that matches on a reason type.

reasonTypethe reason type to match on

applyan action to apply to the reason, event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
70. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#matchStop(reason:akka.persistence.fsm.PersistentFSM.Reason,apply:akka.japi.pf.FI.UnitApply2[S,D]):akka.persistence.fsm.japi.pf.FSMStopBuilder[S,D] "Permalink") final  def matchStop(reason: [Reason](PersistentFSM$$Reason.html), apply: UnitApply2\[S, D]): [FSMStopBuilder](japi/pf/FSMStopBuilder.html)\[S, D]Create an [akka.japi.pf.FSMStopBuilder](../../japi/pf/FSMStopBuilder.html) with the first case statement set.

Create an [akka.japi.pf.FSMStopBuilder](../../japi/pf/FSMStopBuilder.html) with the first case statement set.

A case statement that matches on an [PersistentFSM.Reason](PersistentFSM$$Reason.html).

reasonthe reason for the termination

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
71. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
72. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#nextStateData:D "Permalink") final  def nextStateData: DReturn next state data (available in onTransition handlers)

Return next state data (available in onTransition handlers)

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
73. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
74. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
75. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#onPersistFailure(cause:Throwable,event:Any,seqNr:Long):Unit "Permalink")  def onPersistFailure(cause: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Called when persist fails.

Called when persist fails. By default it logs the error.
Subclass may override to customize logging and for example send negative
acknowledgment to sender.

The actor is always stopped after this method has been invoked.

Note that the event may or may not have been saved, depending on the type of
failure.

causefailure cause.

eventthe event that was to be persisted

Attributesprotected Definition ClassesEventsourcedAnnotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
76. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#onPersistRejected(cause:Throwable,event:Any,seqNr:Long):Unit "Permalink")  def onPersistRejected(cause: Throwable, event: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), seqNr: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Called when the journal rejected `persist` of an event.

Called when the journal rejected `persist` of an event. The event was not
stored. By default this method logs the problem as an error, and the actor continues.
The callback handler that was passed to the `persist` method will not be invoked.

causefailure cause

eventthe event that was to be persisted

Attributesprotected Definition ClassesEventsourcedAnnotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
77. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#onRecoveryCompleted():Unit "Permalink")  def onRecoveryCompleted(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Override this handler to define the action on recovery completion

Override this handler to define the action on recovery completion

Definition Classes[PersistentFSM](PersistentFSM.html)
78. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#onRecoveryFailure(cause:Throwable,event:Option[Any]):Unit "Permalink")  def onRecoveryFailure(cause: Throwable, event: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Called whenever a message replay fails.

Called whenever a message replay fails. By default it logs the error.

Subclass may override to customize logging.

The actor is always stopped after this method has been invoked.

causefailure cause.

eventthe event that was processed in `receiveRecover`, if the exception
 was thrown there

Attributesprotected Definition ClassesEventsourced
79. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#onTermination(stopBuilder:akka.persistence.fsm.japi.pf.FSMStopBuilder[S,D]):Unit "Permalink") final  def onTermination(stopBuilder: [FSMStopBuilder](japi/pf/FSMStopBuilder.html)\[S, D]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon termination of this FSM actor.

Set handler which is called upon termination of this FSM actor. Calling
this method again will overwrite the previous contents.

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
80. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#onTermination(terminationHandler:PartialFunction[PersistentFSMBase.this.StopEvent,Unit]):Unit "Permalink") final  def onTermination(terminationHandler: [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[StopEvent](#StopEvent=akka.persistence.fsm.PersistentFSM.StopEvent[S,D]), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon termination of this FSM actor.

Set handler which is called upon termination of this FSM actor. Calling
this method again will overwrite the previous contents.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
81. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#onTransition(transitionHandler:akka.japi.pf.FI.UnitApply2[S,S]):Unit "Permalink") final  def onTransition(transitionHandler: UnitApply2\[S, S]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Add a handler which is called upon each state transition, i.e.

Add a handler which is called upon each state transition, i.e. not when
staying in the same state.

**Multiple handlers may be installed, and every one of them will be
called, not only the first one matching.**

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
82. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#onTransition(transitionHandlerBuilder:akka.japi.pf.FSMTransitionHandlerBuilder[S]):Unit "Permalink") final  def onTransition(transitionHandlerBuilder: [FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html)\[S]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Add a handler which is called upon each state transition, i.e.

Add a handler which is called upon each state transition, i.e. not when
staying in the same state.

**Multiple handlers may be installed, and every one of them will be
called, not only the first one matching.**

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
83. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#onTransition(transitionHandler:PersistentFSMBase.this.TransitionHandler):Unit "Permalink") final  def onTransition(transitionHandler: [TransitionHandler](#TransitionHandler=PartialFunction[(S,S),Unit])): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon each state transition, i.e.

Set handler which is called upon each state transition, i.e. not when
staying in the same state. This may use the pair extractor defined in the
FSM companion object like so:

```

onTransition {
  case Old -> New => doSomething
}

```
It is also possible to supply a 2\-ary function object:

```

onTransition(handler _)

private def handler(from: S, to: S) { ... }

```
The underscore is unfortunately necessary to enable the nicer syntax shown
above (it uses the implicit conversion total2pf under the hood).

**Multiple handlers may be installed, and every one of them will be
called, not only the first one matching.**

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
84. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#persist[A](event:A)(handler:A=>Unit):Unit "Permalink")  def persist\[A](event: A)(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Asynchronously persists `event`.

Asynchronously persists `event`. On successful persistence, `handler` is called with the
persisted event. It is guaranteed that no new commands will be received by a persistent actor
between a call to `persist` and the execution of its `handler`. This also holds for
multiple `persist` calls per received command. Internally, this is achieved by stashing new
commands and unstashing them when the `event` has been persisted and handled. The stash used
for that is an internal stash which doesn't interfere with the inherited user stash.

An event `handler` may close over persistent actor state and modify it. The `sender` of a persisted
event is the sender of the corresponding command. This means that one can reply to a command
sender within an event `handler`.

Within an event handler, applications usually update persistent actor state using persisted event
data, notify listeners and reply to command senders.

If persistence of an event fails, [\#onPersistFailure](#onPersistFailure(cause:Throwable,event:Any,seqNr:Long):Unit) will be invoked and the actor will
unconditionally be stopped. The reason that it cannot resume when persist fails is that it
is unknown if the event was actually persisted or not, and therefore it is in an inconsistent
state. Restarting on persistent failures will most likely fail anyway, since the journal
is probably unavailable. It is better to stop the actor and after a back\-off timeout start
it again.

eventevent to be persisted

handlerhandler for each persisted `event`

Definition Classes[PersistentActor](../PersistentActor.html)
85. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#persistAll[A](events:Seq[A])(handler:A=>Unit):Unit "Permalink")  def persistAll\[A](events: [Seq](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A])(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Asynchronously persists `events` in specified order.

Asynchronously persists `events` in specified order. This is equivalent to calling
`persist[A](event: A)(handler: A => Unit)` multiple times with the same `handler`,
except that `events` are persisted atomically with this method.

eventsevents to be persisted

handlerhandler for each persisted `events`

Definition Classes[PersistentActor](../PersistentActor.html)
86. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#persistAllAsync[A](events:Seq[A])(handler:A=>Unit):Unit "Permalink")  def persistAllAsync\[A](events: [Seq](https://www.scala-lang.org/api/2.13.8/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A])(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Asynchronously persists `events` in specified order.

Asynchronously persists `events` in specified order. This is equivalent to calling
`persistAsync[A](event: A)(handler: A => Unit)` multiple times with the same `handler`,
except that `events` are persisted atomically with this method.

eventsevents to be persisted

handlerhandler for each persisted `events`

Definition Classes[PersistentActor](../PersistentActor.html)
87. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#persistAsync[A](event:A)(handler:A=>Unit):Unit "Permalink")  def persistAsync\[A](event: A)(handler: (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Asynchronously persists `event`.

Asynchronously persists `event`. On successful persistence, `handler` is called with the
persisted event.

Unlike `persist` the persistent actor will continue to receive incoming commands between the
call to `persist` and executing it's `handler`. This asynchronous, non\-stashing, version of
of persist should be used when you favor throughput over the "command\-2 only processed after
command\-1 effects' have been applied" guarantee, which is provided by the plain `persist` method.

An event `handler` may close over persistent actor state and modify it. The `sender` of a persisted
event is the sender of the corresponding command. This means that one can reply to a command
sender within an event `handler`.

If persistence of an event fails, [\#onPersistFailure](#onPersistFailure(cause:Throwable,event:Any,seqNr:Long):Unit) will be invoked and the actor will
unconditionally be stopped. The reason that it cannot resume when persist fails is that it
is unknown if the event was actually persisted or not, and therefore it is in an inconsistent
state. Restarting on persistent failures will most likely fail anyway, since the journal
is probably unavailable. It is better to stop the actor and after a back\-off timeout start
it again.

eventevent to be persisted

handlerhandler for each persisted `event`

Definition Classes[PersistentActor](../PersistentActor.html)
88. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
89. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox and clears the stash.
 Must be called when overriding this method, otherwise stashed messages won't be propagated to DeadLetters
 when actor stops.

Definition Classes[AbstractPersistentFSM](AbstractPersistentFSM.html) → [UnrestrictedStash](../../actor/UnrestrictedStash.html) → [PersistentFSMBase](PersistentFSMBase.html) → [Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
90. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox,
 clears the stash, stops all children and invokes the postStop() callback.

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[UnrestrictedStash](../../actor/UnrestrictedStash.html) → [Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
91. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
92. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#receive:AbstractPersistentFSM.this.Receive "Permalink")  def receive: [Receive](#Receive=akka.actor.Actor.Receive)Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition Classes[AbstractPersistentFSM](AbstractPersistentFSM.html) → [PersistentActor](../PersistentActor.html) → [PersistentFSMBase](PersistentFSMBase.html) → [Actor](../../actor/Actor.html)
93. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#receiveCommand:PersistentFSM.this.Receive "Permalink")  def receiveCommand: [Receive](#Receive=akka.actor.Actor.Receive)After recovery events are handled as in usual FSM actor

After recovery events are handled as in usual FSM actor

Definition Classes[PersistentFSM](PersistentFSM.html) → Eventsourced
94. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#receiveRecover:PersistentFSM.this.Receive "Permalink")  def receiveRecover: [Receive](#Receive=akka.actor.Actor.Receive)Discover the latest recorded state

Discover the latest recorded state

Definition Classes[PersistentFSM](PersistentFSM.html) → EventsourcedAnnotations@nowarn()
95. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#recovery:akka.persistence.Recovery "Permalink")  def recovery: [Recovery](../Recovery.html)Called when the persistent actor is started for the first time.

Called when the persistent actor is started for the first time.
The returned [Recovery](../Recovery.html) object defines how the Actor will recover its persistent state before
handling the first incoming message.

To skip recovery completely return `Recovery.none`.

Definition Classes[PersistenceRecovery](../PersistenceRecovery.html)
96. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#recoveryFinished:Boolean "Permalink")  def recoveryFinished: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Returns `true` if this persistent actor has successfully finished recovery.

Returns `true` if this persistent actor has successfully finished recovery.

Definition ClassesEventsourced
97. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#recoveryRunning:Boolean "Permalink")  def recoveryRunning: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Returns `true` if this persistent actor is currently recovering.

Returns `true` if this persistent actor is currently recovering.

Definition ClassesEventsourced
98. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#saveSnapshot(snapshot:Any):Unit "Permalink")  def saveSnapshot(snapshot: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Saves a `snapshot` of this snapshotter's state.

Saves a `snapshot` of this snapshotter's state.

The [PersistentActor](../PersistentActor.html) will be notified about the success or failure of this
via an [SaveSnapshotSuccess](../SaveSnapshotSuccess.html) or [SaveSnapshotFailure](../SaveSnapshotFailure.html) message.

Definition Classes[Snapshotter](../Snapshotter.html)
99. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#saveStateSnapshot():Unit "Permalink") final  def saveStateSnapshot(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Save the current state as a snapshot

Save the current state as a snapshot

Definition Classes[PersistentFSM](PersistentFSM.html)
100. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
101. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
102. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#setStateTimeout(state:S,timeout:PersistentFSMBase.this.Timeout):Unit "Permalink") final  def setStateTimeout(state: S, timeout: [Timeout](#Timeout=Option[scala.concurrent.duration.FiniteDuration])): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set state timeout explicitly.

Set state timeout explicitly. This method can safely be used from within a
state handler.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
103. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#snapshotPluginId:String "Permalink")  def snapshotPluginId: StringConfiguration id of the snapshot plugin servicing this persistent actor.

Configuration id of the snapshot plugin servicing this persistent actor.
When empty, looks in `akka.persistence.snapshot-store.plugin` to find configuration entry path.
When configured, uses `snapshotPluginId` as absolute path to the snapshot store configuration entry.
Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.

Definition Classes[PersistenceIdentity](../PersistenceIdentity.html)
104. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#snapshotSequenceNr:Long "Permalink")  def snapshotSequenceNr: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)Returns `lastSequenceNr`.

Returns `lastSequenceNr`.

Definition ClassesEventsourced → [Snapshotter](../Snapshotter.html)
105. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#snapshotterId:String "Permalink")  def snapshotterId: StringReturns `persistenceId`.

Returns `persistenceId`.

Definition ClassesEventsourced → [Snapshotter](../Snapshotter.html)
106. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#startSingleTimer(name:String,msg:Any,delay:java.time.Duration):Unit "Permalink")  def startSingleTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
107. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#startSingleTimer(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startSingleTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Start a timer that will send `msg` once to the `self` actor after
the given `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
108. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#startTimerAtFixedRate(name:String,msg:Any,interval:java.time.Duration):Unit "Permalink")  def startTimerAtFixedRate(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `startTimerWithFixedDelay` is often preferred.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
109. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#startTimerAtFixedRate(name:String,msg:Any,interval:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerAtFixedRate(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

Schedules a message to be sent repeatedly to the `self` actor with a
given frequency.

It will compensate the delay for a subsequent message if the sending of previous
message was delayed more than specified. In such cases, the actual message interval
will differ from the interval passed to the method.

If the execution is delayed longer than the `interval`, the subsequent message will
be sent immediately after the prior one. This also has the consequence that after
long garbage collection pauses or other reasons when the JVM was suspended all
"missed" messages will be sent when the process wakes up again.

In the long run, the frequency of messages will be exactly the reciprocal of the
specified `interval`.

Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
garbage collection pauses, which may in worst case cause undesired load on the system.
Therefore `startTimerWithFixedDelay` is often preferred.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
110. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#startTimerWithFixedDelay(name:String,msg:Any,delay:java.time.Duration):Unit "Permalink")  def startTimerWithFixedDelay(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
111. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#startTimerWithFixedDelay(name:String,msg:Any,delay:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def startTimerWithFixedDelay(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

Schedules a message to be sent repeatedly to the `self` actor with a
fixed `delay` between messages.

It will not compensate the delay between messages if scheduling is delayed
longer than specified for some reason. The delay between sending of subsequent
messages will always be (at least) the given `delay`.

In the long run, the frequency of messages will generally be slightly lower than
the reciprocal of the specified `delay`.

Each timer has a `name` and if a new timer with same `name` is started
the previous is cancelled. It is guaranteed that a message from the
previous timer is not received, even if it was already enqueued
in the mailbox when the new timer was started.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
112. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#startWith(stateName:S,stateData:D,timeout:scala.concurrent.duration.FiniteDuration):Unit "Permalink") final  def startWith(stateName: S, stateData: D, timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set initial state.

Set initial state. Call this method from the constructor before the \#initialize method.
If different state is needed after a restart this method, followed by \#initialize, can
be used in the actor life cycle hooks [akka.actor.Actor\#preStart](../../actor/Actor.html#preStart():Unit) and [akka.actor.Actor\#postRestart](../../actor/Actor.html#postRestart(reason:Throwable):Unit).

stateNameinitial state designator

stateDatainitial state data

timeoutstate timeout for the initial state, overriding the default timeout for that state

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
113. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#startWith(stateName:S,stateData:D):Unit "Permalink") final  def startWith(stateName: S, stateData: D): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set initial state.

Set initial state. Call this method from the constructor before the \#initialize method.
If different state is needed after a restart this method, followed by \#initialize, can
be used in the actor life cycle hooks [akka.actor.Actor\#preStart](../../actor/Actor.html#preStart():Unit) and [akka.actor.Actor\#postRestart](../../actor/Actor.html#postRestart(reason:Throwable):Unit).

stateNameinitial state designator

stateDatainitial state data

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
114. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#startWith(stateName:S,stateData:D,timeout:PersistentFSMBase.this.Timeout):Unit "Permalink") final  def startWith(stateName: S, stateData: D, timeout: [Timeout](#Timeout=Option[scala.concurrent.duration.FiniteDuration]) \= None): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set initial state.

Set initial state. Call this method from the constructor before the \#initialize method.
If different state is needed after a restart this method, followed by \#initialize, can
be used in the actor life cycle hooks [akka.actor.Actor\#preStart](../../actor/Actor.html#preStart():Unit) and [akka.actor.Actor\#postRestart](../../actor/Actor.html#postRestart(reason:Throwable):Unit).

stateNameinitial state designator

stateDatainitial state data

timeoutstate timeout for the initial state, overriding the default timeout for that state

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
115. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#stash():Unit "Permalink")  def stash(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit) Adds the current message (the message that the actor received last) to the
 actor's stash.

 Adds the current message (the message that the actor received last) to the
 actor's stash.

Definition ClassesEventsourced → StashSupportExceptions thrown`IllegalStateException` if the same message is stashed more than once

`StashOverflowException` in case of a stash capacity violation
116. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#stateData:D "Permalink") final  def stateData: DReturn current state data (i.e.

Return current state data (i.e. object of type D)

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
117. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#stateName:S "Permalink") final  def stateName: SReturn current state name (i.e.

Return current state name (i.e. object of type S)

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
118. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#statesMap:Map[String,S] "Permalink")  lazy val statesMap: Map\[String, S]Map from state identifier to state instance

Map from state identifier to state instance

Definition Classes[PersistentFSM](PersistentFSM.html)
119. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#stay():PersistentFSMBase.this.State "Permalink") final  def stay(): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce "empty" transition descriptor.

Produce "empty" transition descriptor.
Return this from a state function when no state change is to be effected.

No transition event will be triggered by [\#stay](#stay():PersistentFSMBase.this.State).
If you want to trigger an event like `S -> S` for `onTransition` to handle use `goto` instead.

returnsdescriptor for staying in current state

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
120. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#stop(reason:akka.persistence.fsm.PersistentFSM.Reason,stateData:D):PersistentFSMBase.this.State "Permalink") final  def stop(reason: [Reason](PersistentFSM$$Reason.html), stateData: D): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce change descriptor to stop this FSM actor including specified reason.

Produce change descriptor to stop this FSM actor including specified reason.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
121. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#stop(reason:akka.persistence.fsm.PersistentFSM.Reason):PersistentFSMBase.this.State "Permalink") final  def stop(reason: [Reason](PersistentFSM$$Reason.html)): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce change descriptor to stop this FSM actor including specified reason.

Produce change descriptor to stop this FSM actor including specified reason.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
122. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#stop():PersistentFSMBase.this.State "Permalink") final  def stop(): [State](#State=akka.persistence.fsm.PersistentFSM.State[S,D,E])Produce change descriptor to stop this FSM actor with reason "Normal".

Produce change descriptor to stop this FSM actor with reason "Normal".

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
123. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
124. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
125. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
126. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#total2pf(transitionHandler:(S,S)=>Unit):PersistentFSMBase.this.TransitionHandler "Permalink") implicit final  def total2pf(transitionHandler: (S, S) \=\> [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)): [TransitionHandler](#TransitionHandler=PartialFunction[(S,S),Unit])Convenience wrapper for using a total function instead of a partial
function literal.

Convenience wrapper for using a total function instead of a partial
function literal. To be used with onTransition.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
127. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#transform(func:PersistentFSMBase.this.StateFunction):PersistentFSMBase.this.TransformHelper "Permalink") final  def transform(func: [StateFunction](#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State])): [TransformHelper](#TransformHelperextendsAnyRef)Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
128. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../../event/EventStream.html)

Definition ClassesEventsourced → [Actor](../../actor/Actor.html)
129. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#unstashAll():Unit "Permalink")  def unstashAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit) Prepends all messages in the stash to the mailbox, and then clears the stash.

 Prepends all messages in the stash to the mailbox, and then clears the stash.

 Messages from the stash are enqueued to the mailbox until the capacity of the
 mailbox (if any) has been reached. In case a bounded mailbox overflows, a
 `MessageQueueAppendFailedException` is thrown.

 The stash is guaranteed to be empty after calling `unstashAll()`.

Definition ClassesEventsourced → StashSupport
130. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
131. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
132. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
133. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#when(stateName:S,stateTimeout:scala.concurrent.duration.FiniteDuration,stateFunctionBuilder:akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E]):Unit "Permalink") final  def when(stateName: S, stateTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), stateFunctionBuilder: [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Insert a new StateFunction at the end of the processing chain for the
given state.

Insert a new StateFunction at the end of the processing chain for the
given state. If the stateTimeout parameter is set, entering this state
without a differing explicit timeout setting will trigger a StateTimeout
event; the same is true when using \#stay.

stateNamedesignator for the state

stateTimeoutdefault state timeout for this state

stateFunctionBuilderpartial function builder describing response to input

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
134. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#when(stateName:S,stateFunctionBuilder:akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E]):Unit "Permalink") final  def when(stateName: S, stateFunctionBuilder: [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Insert a new StateFunction at the end of the processing chain for the
given state.

Insert a new StateFunction at the end of the processing chain for the
given state.

stateNamedesignator for the state

stateFunctionBuilderpartial function builder describing response to input

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
135. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#when(stateName:S)(stateFunction:AbstractPersistentFSMBase.this.StateFunction):Unit "Permalink") final  def when(stateName: S)(stateFunction: [StateFunction](#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State])): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Insert a new StateFunction at the end of the processing chain for the
given state.

Insert a new StateFunction at the end of the processing chain for the
given state.

stateNamedesignator for the state

stateFunctionpartial function describing response to input

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
136. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#when(stateName:S,stateTimeout:scala.concurrent.duration.FiniteDuration)(stateFunction:PersistentFSMBase.this.StateFunction):Unit "Permalink") final  def when(stateName: S, stateTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration) \= null)(stateFunction: [StateFunction](#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State])): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Insert a new StateFunction at the end of the processing chain for the
given state.

Insert a new StateFunction at the end of the processing chain for the
given state. If the stateTimeout parameter is set, entering this state
without a differing explicit timeout setting will trigger a StateTimeout
event; the same is true when using \#stay.

stateNamedesignator for the state

stateTimeoutdefault state timeout for this state

stateFunctionpartial function describing response to input

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
137. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#whenUnhandled(stateFunctionBuilder:akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder[S,D,E]):Unit "Permalink") final  def whenUnhandled(stateFunctionBuilder: [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html)\[S, D, E]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon reception of unhandled messages.

Set handler which is called upon reception of unhandled messages. Calling
this method again will overwrite the previous contents.

The current state may be queried using `stateName`.

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)
138. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#whenUnhandled(stateFunction:PersistentFSMBase.this.StateFunction):Unit "Permalink") final  def whenUnhandled(stateFunction: [StateFunction](#StateFunction=PartialFunction[PersistentFSMBase.this.Event,PersistentFSMBase.this.State])): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Set handler which is called upon reception of unhandled messages.

Set handler which is called upon reception of unhandled messages. Calling
this method again will overwrite the previous contents.

The current state may be queried using `stateName`.

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)
### Shadowed Implicit Value Members

1. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AbstractPersistentLoggingFSM\[S, D, E], B)ImplicitThis member is added by an implicit conversion from AbstractPersistentLoggingFSM\[S, D, E] toArrowAssoc\[AbstractPersistentLoggingFSM\[S, D, E]] performed by method ArrowAssoc in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(abstractPersistentLoggingFSM: ArrowAssoc[AbstractPersistentLoggingFSM[S, D, E]]).->(y)
```
Definition ClassesArrowAssocAnnotations@inline()
### Deprecated Value Members

1. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AbstractPersistentLoggingFSM\[S, D, E] toStringFormat\[AbstractPersistentLoggingFSM\[S, D, E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#setTimer(name:String,msg:Any,timeout:scala.concurrent.duration.FiniteDuration):Unit "Permalink") final  def setTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedule named timer to deliver message after given delay, possibly repeating.

Schedule named timer to deliver message after given delay, possibly repeating.
Any existing timer with the same name will automatically be canceled before
adding the new timer.

nameidentifier to be used with cancelTimer()

msgmessage to be delivered

timeoutdelay of first message delivery and between subsequent messages

Definition Classes[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use startSingleTimer instead.
4. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#setTimer(name:String,msg:Any,timeout:scala.concurrent.duration.FiniteDuration,repeat:Boolean):Unit "Permalink") final  def setTimer(name: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.8/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), repeat: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Schedule named timer to deliver message after given delay, possibly repeating.

Schedule named timer to deliver message after given delay, possibly repeating.
Any existing timer with the same name will automatically be canceled before
adding the new timer.

nameidentifier to be used with cancelTimer()

msgmessage to be delivered

timeoutdelay of first message delivery and between subsequent messages

repeatsend once if false, scheduleAtFixedRate if true

Definition Classes[PersistentFSMBase](PersistentFSMBase.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred.
5. [**](../../../akka/persistence/fsm/AbstractPersistentLoggingFSM.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AbstractPersistentLoggingFSM\[S, D, E], B)ImplicitThis member is added by an implicit conversion from AbstractPersistentLoggingFSM\[S, D, E] toArrowAssoc\[AbstractPersistentLoggingFSM\[S, D, E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LoggingPersistentFSM](LoggingPersistentFSM.html)\[S, D, E]

### Inherited from [AbstractPersistentFSM](AbstractPersistentFSM.html)\[S, D, E]

### Inherited from [PersistentFSM](PersistentFSM.html)\[S, D, E]

### Inherited from [PersistentActor](../PersistentActor.html)

### Inherited from Eventsourced

### Inherited from [PersistenceRecovery](../PersistenceRecovery.html)

### Inherited from [PersistenceIdentity](../PersistenceIdentity.html)

### Inherited from [PersistenceStash](../PersistenceStash.html)

### Inherited from StashFactory

### Inherited from [Stash](../../actor/Stash.html)

### Inherited from [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html)]

### Inherited from [UnrestrictedStash](../../actor/UnrestrictedStash.html)

### Inherited from StashSupport

### Inherited from [Snapshotter](../Snapshotter.html)

### Inherited from [AbstractPersistentFSMBase](AbstractPersistentFSMBase.html)\[S, D, E]

### Inherited from [PersistentFSMBase](PersistentFSMBase.html)\[S, D, E]

### Inherited from [ActorLogging](../../actor/ActorLogging.html)

### Inherited from [Listeners](../../routing/Listeners.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAbstractPersistentLoggingFSM\[S, D, E] to any2stringadd\[AbstractPersistentLoggingFSM\[S, D, E]]

### Inherited by implicit conversion StringFormat fromAbstractPersistentLoggingFSM\[S, D, E] to StringFormat\[AbstractPersistentLoggingFSM\[S, D, E]]

### Inherited by implicit conversion Ensuring fromAbstractPersistentLoggingFSM\[S, D, E] to Ensuring\[AbstractPersistentLoggingFSM\[S, D, E]]

### Inherited by implicit conversion ArrowAssoc fromAbstractPersistentLoggingFSM\[S, D, E] to ArrowAssoc\[AbstractPersistentLoggingFSM\[S, D, E]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Stash.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/japi/pf/FSMStateFunctionBuilder.html
- https://doc.akka.io/api/akka-core/2.6/akka/japi/pf/FSMStopBuilder.html
- https://doc.akka.io/api/akka-core/2.6/akka/japi/pf/FSMTransitionHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.6/akka/japi/pf/UnitPFBuilder.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/DeleteSnapshotsFailure.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/DeleteSnapshotsSuccess.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/PersistenceStash.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/Recovery.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/SaveSnapshotFailure.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/Snapshotter.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/StashOverflowStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase$.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$$minus$greater$.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$Event.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$FSMState.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$Failure.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/PersistentFSM$$LogEntry.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html](https://doc.akka.io/api/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html)*