---
description: Akka 2.8.9 - akka.persistence.typed.scaladsl.EventSourcedBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
title: Akka 2.8.9 - akka.persistence.typed.scaladsl.EventSourcedBehavior
---

# Akka 2.8.9 - akka.persistence.typed.scaladsl.EventSourcedBehavior

> **Summary:** Akka 2.8.9 - akka.persistence.typed.scaladsl.EventSourcedBehavior

## Content

Akka2\.8\.9 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- EventSourcedBehavior
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplyEffect](ReplyEffect.html "EventSourcedBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
[t](EventSourcedBehavior$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [EventSourcedBehavior](EventSourcedBehavior$.html "See companion object")[**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html "Permalink")

### Companion [object EventSourcedBehavior](EventSourcedBehavior$.html "See companion object")

#### trait EventSourcedBehavior\[Command, Event, State] extends DeferredBehavior\[Command]

Further customization of the `EventSourcedBehavior` can be done with the methods defined here.

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[EventSourcedBehavior.scala](https://github.com/akka/akka/tree/v2.8.9//akka-persistence-typed/src/main/scala/akka/persistence/typed/scaladsl/EventSourcedBehavior.scala#L127)Linear SupertypesDeferredBehavior\[Command], [Behavior](../../../actor/typed/Behavior.html)\[Command], [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourcedBehavior
2. DeferredBehavior
3. Behavior
4. AnyRef
5. Any
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
### Abstract Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#apply(ctx:akka.actor.typed.TypedActorContext[T]):akka.actor.typed.Behavior[T] "Permalink") abstract  def apply(ctx: [TypedActorContext](../../../actor/typed/TypedActorContext.html)\[Command]): [Behavior](../../../actor/typed/Behavior.html)\[Command]Definition ClassesDeferredBehavior
2. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#eventAdapter(adapter:akka.persistence.typed.EventAdapter[Event,_]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def eventAdapter(adapter: [EventAdapter](../EventAdapter.html)\[Event, \_]): EventSourcedBehavior\[Command, Event, State]Transform the event to another type before giving to the journal.

Transform the event to another type before giving to the journal. Can be used to wrap events
in types Journals understand but is of a different type than `Event`.
3. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#onPersistFailure(backoffStrategy:akka.actor.typed.BackoffSupervisorStrategy):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def onPersistFailure(backoffStrategy: [BackoffSupervisorStrategy](../../../actor/typed/BackoffSupervisorStrategy.html)): EventSourcedBehavior\[Command, Event, State]Back off strategy for persist failures.

Back off strategy for persist failures.

Specifically BackOff to prevent resume being used. Resume is not allowed as
it will be unknown if the event has been persisted.

This supervision is only around the event sourced behavior not any outer setup/withTimers
block. If using restart, any actions e.g. scheduling timers, can be done on the PreRestart

If not specified the actor will be stopped on failure.
4. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#persistenceId:akka.persistence.typed.PersistenceId "Permalink") abstract  def persistenceId: [PersistenceId](../PersistenceId.html)
5. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#receiveSignal(signalHandler:PartialFunction[(State,akka.actor.typed.Signal),Unit]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def receiveSignal(signalHandler: [PartialFunction](https://www.scala-lang.org/api/2.13.11/scala/PartialFunction.html#scala.PartialFunction)\[(State, [Signal](../../../actor/typed/Signal.html)), [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)]): EventSourcedBehavior\[Command, Event, State]Allows the event sourced behavior to react on signals.

Allows the event sourced behavior to react on signals.

The regular lifecycle signals can be handled as well as
Akka Persistence specific signals (snapshot and recovery related). Those are all subtypes of
[akka.persistence.typed.EventSourcedSignal](../EventSourcedSignal.html)
6. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#signalHandler:PartialFunction[(State,akka.actor.typed.Signal),Unit] "Permalink") abstract  def signalHandler: [PartialFunction](https://www.scala-lang.org/api/2.13.11/scala/PartialFunction.html#scala.PartialFunction)\[(State, [Signal](../../../actor/typed/Signal.html)), [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)]returnsThe currently defined signal handler or an empty handler if no custom handler previously defined
7. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#snapshotAdapter(adapter:akka.persistence.typed.SnapshotAdapter[State]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def snapshotAdapter(adapter: [SnapshotAdapter](../SnapshotAdapter.html)\[State]): EventSourcedBehavior\[Command, Event, State]Transform the state to another type before giving to the journal.

Transform the state to another type before giving to the journal. Can be used to transform older
state types into the current state type e.g. when migrating from Persistent FSM to Typed EventSourcedBehavior.
8. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#snapshotWhen(predicate:(State,Event,Long)=>Boolean):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def snapshotWhen(predicate: (State, Event, [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): EventSourcedBehavior\[Command, Event, State]Initiates a snapshot if the given `predicate` evaluates to true.

Initiates a snapshot if the given `predicate` evaluates to true.

Decide to store a snapshot based on the State, Event and sequenceNr when the event has
been successfully persisted.

When persisting multiple events at once the snapshot is triggered after all the events have
been persisted.

Snapshots triggered by `snapshotWhen` will not trigger deletes of old snapshots and events if
[EventSourcedBehavior.withRetention](#withRetention(criteria:akka.persistence.typed.scaladsl.RetentionCriteria):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]) with [RetentionCriteria.snapshotEvery](RetentionCriteria$.html#snapshotEvery(numberOfEvents:Int):akka.persistence.typed.scaladsl.SnapshotCountRetentionCriteria) is used together with
`snapshotWhen`. Such deletes are only triggered by snapshots matching the `numberOfEvents` in the
[RetentionCriteria](RetentionCriteria.html).
9. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#withEventPublishing(enabled:Boolean):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def withEventPublishing(enabled: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): EventSourcedBehavior\[Command, Event, State]Publish events to the system event stream as [akka.persistence.typed.PublishedEvent](../PublishedEvent.html) after they have been persisted

Publish events to the system event stream as [akka.persistence.typed.PublishedEvent](../PublishedEvent.html) after they have been persisted

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
10. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#withJournalPluginId(id:String):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def withJournalPluginId(id: String): EventSourcedBehavior\[Command, Event, State]Change the journal plugin id that this actor should use.
11. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#withRecovery(recovery:akka.persistence.typed.scaladsl.Recovery):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def withRecovery(recovery: [Recovery](Recovery.html)): EventSourcedBehavior\[Command, Event, State]Change the recovery strategy.

Change the recovery strategy.
By default, snapshots and events are recovered.
12. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#withRetention(criteria:akka.persistence.typed.scaladsl.RetentionCriteria):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def withRetention(criteria: [RetentionCriteria](RetentionCriteria.html)): EventSourcedBehavior\[Command, Event, State]Criteria for retention/deletion of snapshots and events.

Criteria for retention/deletion of snapshots and events.
By default, retention is disabled and snapshots are not saved and deleted automatically.
13. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#withSnapshotPluginId(id:String):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def withSnapshotPluginId(id: String): EventSourcedBehavior\[Command, Event, State]Change the snapshot store plugin id that this actor should use.
14. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#withStashCapacity(size:Int):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def withStashCapacity(size: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): EventSourcedBehavior\[Command, Event, State]Define a custom stash capacity per entity.

Define a custom stash capacity per entity.
If not defined, the default `akka.persistence.typed.stash-capacity` will be used.
15. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#withTagger(tagger:Event=>Set[String]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def withTagger(tagger: (Event) \=\> Set\[String]): EventSourcedBehavior\[Command, Event, State]The `tagger` function should give event tags, which will be used in persistence query
16. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#withTaggerForState(tagger:(State,Event)=>Set[String]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def withTaggerForState(tagger: (State, Event) \=\> Set\[String]): EventSourcedBehavior\[Command, Event, State]The `tagger` function should give event tags, which will be used in persistence query.

The `tagger` function should give event tags, which will be used in persistence query.
The state passed to the tagger allows for toggling a tag with one event but keep all events after it tagged
based on a property or the type of the state.
17. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#withSnapshotSelectionCriteria(selection:akka.persistence.typed.SnapshotSelectionCriteria):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink") abstract  def withSnapshotSelectionCriteria(selection: [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html)): EventSourcedBehavior\[Command, Event, State]Changes the snapshot selection criteria used by this behavior.

Changes the snapshot selection criteria used by this behavior.
By default the most recent snapshot is used, and the remaining state updates are recovered by replaying events
from the sequence number up until which the snapshot reached.

You may configure the behavior to skip replaying snapshots completely, in which case the recovery will be
performed by replaying all events \-\- which may take a long time.

Annotations@deprecated Deprecated*(Since version 2\.6\.5\)* use withRecovery(Recovery.withSnapshotSelectionCriteria(...))
### Concrete Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] toany2stringadd\[EventSourcedBehavior\[Command, Event, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventSourcedBehavior\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] toArrowAssoc\[EventSourcedBehavior\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#behavior:akka.actor.typed.Behavior[Inner] "Permalink")  val behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command]ImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] to[BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../../../actor/typed/Behavior$.html).Definition Classes[BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)
8. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
9. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventSourcedBehavior\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): EventSourcedBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] toEnsuring\[EventSourcedBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventSourcedBehavior\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): EventSourcedBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] toEnsuring\[EventSourcedBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): EventSourcedBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] toEnsuring\[EventSourcedBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): EventSourcedBehavior\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] toEnsuring\[EventSourcedBehavior\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
16. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
17. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#narrow[U<:T]:akka.actor.typed.Behavior[U] "Permalink") final  def narrow\[U \<: Command]: [Behavior](../../../actor/typed/Behavior.html)\[U]Narrow the type of this Behavior, which is always a safe operation.

Narrow the type of this Behavior, which is always a safe operation. This
method is necessary to implement the contravariant nature of Behavior
(which cannot be expressed directly due to type inference problems).

Definition Classes[Behavior](../../../actor/typed/Behavior.html)
19. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
21. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
22. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#transformMessages[Outer](matcher:PartialFunction[Outer,Inner])(implicitevidence$1:scala.reflect.ClassTag[Outer]):akka.actor.typed.Behavior[Outer] "Permalink")  def transformMessages\[Outer](matcher: [PartialFunction](https://www.scala-lang.org/api/2.13.11/scala/PartialFunction.html#scala.PartialFunction)\[Outer, Command])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.11/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[Outer]): [Behavior](../../../actor/typed/Behavior.html)\[Outer]Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
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

ImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] to[BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command] performed by method BehaviorDecorators in [akka.actor.typed.Behavior](../../../actor/typed/Behavior$.html).Definition Classes[BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)
25. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
2. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] toStringFormat\[EventSourcedBehavior\[Command, Event, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventSourcedBehavior\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from EventSourcedBehavior\[Command, Event, State] toArrowAssoc\[EventSourcedBehavior\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from DeferredBehavior\[Command]

### Inherited from [Behavior](../../../actor/typed/Behavior.html)\[Command]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Inherited by implicit conversion BehaviorDecorators fromEventSourcedBehavior\[Command, Event, State] to [BehaviorDecorators](../../../actor/typed/Behavior$$BehaviorDecorators.html)\[Command]

### Inherited by implicit conversion any2stringadd fromEventSourcedBehavior\[Command, Event, State] to any2stringadd\[EventSourcedBehavior\[Command, Event, State]]

### Inherited by implicit conversion StringFormat fromEventSourcedBehavior\[Command, Event, State] to StringFormat\[EventSourcedBehavior\[Command, Event, State]]

### Inherited by implicit conversion Ensuring fromEventSourcedBehavior\[Command, Event, State] to Ensuring\[EventSourcedBehavior\[Command, Event, State]]

### Inherited by implicit conversion ArrowAssoc fromEventSourcedBehavior\[Command, Event, State] to ArrowAssoc\[EventSourcedBehavior\[Command, Event, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior$$BehaviorDecorators.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/api/akka/2.8/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/2.8/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Recovery$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.8/index.html

---
*Source: [https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior.html](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior.html)*