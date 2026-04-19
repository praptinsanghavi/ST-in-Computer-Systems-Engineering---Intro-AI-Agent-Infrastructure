---
description: Akka 2.10.17 - akka.persistence.typed.scaladsl.Effect
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:29Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/scaladsl/Effect$.html
title: Akka 2.10.17 - akka.persistence.typed.scaladsl.Effect
---

# Akka 2.10.17 - akka.persistence.typed.scaladsl.Effect

> **Summary:** Akka 2.10.17 - akka.persistence.typed.scaladsl.Effect

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EventSourcedBehavior](EventSourcedBehavior.html "Further customization of the EventSourcedBehavior can be done with the methods defined here.")
- [EventWithMetadata](EventWithMetadata.html)
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplicationInterceptor](ReplicationInterceptor.html)
- [ReplyEffect](ReplyEffect.html "EventSourcedBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
[o](Effect.html "See companion trait")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [Effect](Effect.html "See companion trait")[**](../../../../akka/persistence/typed/scaladsl/Effect$.html "Permalink")

### Companion [trait Effect](Effect.html "See companion trait")

#### object Effect

Factory methods for creating [Effect](Effect.html) directives \- how an event sourced actor reacts on a command.

Source[Effect.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/scaladsl/Effect.scala#L20)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Effect
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#async[Event,State](effect:scala.concurrent.Future[akka.persistence.typed.scaladsl.Effect[Event,State]]):akka.persistence.typed.scaladsl.Effect[Event,State] "Permalink")  def async\[Event, State](effect: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Effect](Effect.html)\[Event, State]]): [Effect](Effect.html)\[Event, State]Asynchronous command handling.

Asynchronous command handling. The effect is run when the `Future` has been completed.
Any incoming commands are stashed and processed later, after current command, when the `Future` has
been completed.

This can for example be used for retrieval of external information before validating the command.
6. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#asyncReply[Event,State](effect:scala.concurrent.Future[akka.persistence.typed.scaladsl.ReplyEffect[Event,State]]):akka.persistence.typed.scaladsl.ReplyEffect[Event,State] "Permalink")  def asyncReply\[Event, State](effect: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ReplyEffect](ReplyEffect.html)\[Event, State]]): [ReplyEffect](ReplyEffect.html)\[Event, State]Same as [Effect.async](#async[Event,State](effect:scala.concurrent.Future[akka.persistence.typed.scaladsl.Effect[Event,State]]):akka.persistence.typed.scaladsl.Effect[Event,State]) when the `EventSourcedBehavior` is created with
[EventSourcedBehavior.withEnforcedReplies](EventSourcedBehavior$.html#withEnforcedReplies[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.scaladsl.ReplyEffect[Event,State],eventHandler:(State,Event)=>State):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]).
7. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#noReply[Event,State]:akka.persistence.typed.scaladsl.ReplyEffect[Event,State] "Permalink")  def noReply\[Event, State]: [ReplyEffect](ReplyEffect.html)\[Event, State]When [EventSourcedBehavior.withEnforcedReplies](EventSourcedBehavior$.html#withEnforcedReplies[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.scaladsl.ReplyEffect[Event,State],eventHandler:(State,Event)=>State):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]) is used there will be compilation errors if the returned effect
isn't a [ReplyEffect](ReplyEffect.html).

When [EventSourcedBehavior.withEnforcedReplies](EventSourcedBehavior$.html#withEnforcedReplies[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.scaladsl.ReplyEffect[Event,State],eventHandler:(State,Event)=>State):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]) is used there will be compilation errors if the returned effect
isn't a [ReplyEffect](ReplyEffect.html). This `noReply` can be used as a conscious decision that a reply shouldn't be
sent for a specific command or the reply will be sent later.
15. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#none[Event,State]:akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "Permalink")  def none\[Event, State]: [EffectBuilder](EffectBuilder.html)\[Event, State]Do not persist anything

Do not persist anything

Side effects can be chained with `thenRun`
16. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#persist[Event,State](events:Seq[Event]):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "Permalink")  def persist\[Event, State](events: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Event]): [EffectBuilder](EffectBuilder.html)\[Event, State]Persist multiple events

Persist multiple events

Side effects can be chained with `thenRun`
19. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#persist[Event,A<:Event,B<:Event,State](evt1:A,evt2:B,events:Event*):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "Permalink")  def persist\[Event, A \<: Event, B \<: Event, State](evt1: A, evt2: B, events: Event\*): [EffectBuilder](EffectBuilder.html)\[Event, State]Persist multiple events

Persist multiple events

Side effects can be chained with `thenRun`
20. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#persist[Event,State](event:Event):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "Permalink")  def persist\[Event, State](event: Event): [EffectBuilder](EffectBuilder.html)\[Event, State]Persist a single event

Persist a single event

Side effects can be chained with `thenRun`
21. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#persistWithMetadata[Event,State](eventsWithMetadata:Seq[akka.persistence.typed.scaladsl.EventWithMetadata[Event]]):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "Permalink")  def persistWithMetadata\[Event, State](eventsWithMetadata: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[EventWithMetadata](EventWithMetadata.html)\[Event]]): [EffectBuilder](EffectBuilder.html)\[Event, State]Persist multiple events and additional metadata together with the events.

Persist multiple events and additional metadata together with the events.

Side effects can be chained with `thenRun`
22. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#persistWithMetadata[Event,State](eventWithMetadata:akka.persistence.typed.scaladsl.EventWithMetadata[Event]):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "Permalink")  def persistWithMetadata\[Event, State](eventWithMetadata: [EventWithMetadata](EventWithMetadata.html)\[Event]): [EffectBuilder](EffectBuilder.html)\[Event, State]Persist a single event and additional metadata together with the event.

Persist a single event and additional metadata together with the event.

Side effects can be chained with `thenRun`
23. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#reply[ReplyMessage,Event,State](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:ReplyMessage):akka.persistence.typed.scaladsl.ReplyEffect[Event,State] "Permalink")  def reply\[ReplyMessage, Event, State](replyTo: [ActorRef](../../../actor/typed/ActorRef.html)\[ReplyMessage])(replyWithMessage: ReplyMessage): [ReplyEffect](ReplyEffect.html)\[Event, State]Send a reply message to the command.

Send a reply message to the command. The type of the
reply message must conform to the type specified by the passed replyTo `ActorRef`.

This has the same semantics as `cmd.replyTo.tell`.

It is provided as a convenience (reducing boilerplate) and a way to enforce that replies are not forgotten
when the `EventSourcedBehavior` is created with [EventSourcedBehavior.withEnforcedReplies](EventSourcedBehavior$.html#withEnforcedReplies[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.scaladsl.ReplyEffect[Event,State],eventHandler:(State,Event)=>State):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]). When
`withEnforcedReplies` is used there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html).
The reply message will be sent also if `withEnforcedReplies` isn't used, but then the compiler will not help
finding mistakes.
24. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#stash[Event,State]():akka.persistence.typed.scaladsl.ReplyEffect[Event,State] "Permalink")  def stash\[Event, State](): [ReplyEffect](ReplyEffect.html)\[Event, State]Stash the current command.

Stash the current command. Can be unstashed later with [Effect.unstashAll](#unstashAll[Event,State]():akka.persistence.typed.scaladsl.Effect[Event,State]).

Note that the stashed commands are kept in an in\-memory buffer, so in case of a crash they will not be
processed. They will also be discarded if the actor is restarted (or stopped) due to that an exception was
thrown from processing a command or side effect after persisting. The stash buffer is preserved for persist
failures if a backoff supervisor strategy is defined with [EventSourcedBehavior.onPersistFailure](EventSourcedBehavior.html#onPersistFailure(backoffStrategy:akka.actor.typed.BackoffSupervisorStrategy):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]).

Side effects can be chained with `thenRun`
25. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#stop[Event,State]():akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "Permalink")  def stop\[Event, State](): [EffectBuilder](EffectBuilder.html)\[Event, State]Stop this persistent actor
Side effects can be chained with `thenRun`
26. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#unhandled[Event,State]:akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "Permalink")  def unhandled\[Event, State]: [EffectBuilder](EffectBuilder.html)\[Event, State]This command is not handled, but it is not an error that it isn't.

This command is not handled, but it is not an error that it isn't.

Side effects can be chained with `thenRun`
29. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#unstashAll[Event,State]():akka.persistence.typed.scaladsl.Effect[Event,State] "Permalink")  def unstashAll\[Event, State](): [Effect](Effect.html)\[Event, State]Unstash the commands that were stashed with [Effect.stash](#stash[Event,State]():akka.persistence.typed.scaladsl.ReplyEffect[Event,State]).

Unstash the commands that were stashed with [Effect.stash](#stash[Event,State]():akka.persistence.typed.scaladsl.ReplyEffect[Event,State]).

It's allowed to stash messages while unstashing. Those newly added
commands will not be processed by this `unstashAll` effect and have to be unstashed
by another `unstashAll`.

See also[EffectBuilder.thenUnstashAll](EffectBuilder.html#thenUnstashAll():akka.persistence.typed.scaladsl.Effect[Event,State])
30. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationInterceptor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html)*