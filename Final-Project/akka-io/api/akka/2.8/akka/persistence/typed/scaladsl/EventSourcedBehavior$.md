---
description: Akka 2.8.9 - akka.persistence.typed.scaladsl.EventSourcedBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:24:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
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
- [EventSourcedBehavior](EventSourcedBehavior.html "Further customization of the EventSourcedBehavior can be done with the methods defined here.")
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplyEffect](ReplyEffect.html "EventSourcedBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
[o](EventSourcedBehavior.html "See companion trait")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [EventSourcedBehavior](EventSourcedBehavior.html "See companion trait")[**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html "Permalink")

### Companion [trait EventSourcedBehavior](EventSourcedBehavior.html "See companion trait")

#### object EventSourcedBehavior

Source[EventSourcedBehavior.scala](https://github.com/akka/akka/tree/v2.8.9//akka-persistence-typed/src/main/scala/akka/persistence/typed/scaladsl/EventSourcedBehavior.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourcedBehavior
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#CommandHandler[Command,Event,State]=(State,Command)=>akka.persistence.typed.scaladsl.Effect[Event,State] "Permalink")  type CommandHandler\[Command, Event, State] \= (State, Command) \=\> [Effect](Effect.html)\[Event, State]Type alias for the command handler function that defines how to act on commands.

Type alias for the command handler function that defines how to act on commands.

The type alias is not used in API signatures because it's easier to see (in IDE) what is needed
when full function type is used. When defining the handler as a separate function value it can
be useful to use the alias for shorter type signature.
2. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#EventHandler[State,Event]=(State,Event)=>State "Permalink")  type EventHandler\[State, Event] \= (State, Event) \=\> StateType alias for the event handler function for updating the state based on events having been persisted.

Type alias for the event handler function for updating the state based on events having been persisted.

The type alias is not used in API signatures because it's easier to see (in IDE) what is needed
when full function type is used. When defining the handler as a separate function value it can
be useful to use the alias for shorter type signature.
### Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#apply[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.scaladsl.Effect[Event,State],eventHandler:(State,Event)=>State):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink")  def apply\[Command, Event, State](persistenceId: [PersistenceId](../PersistenceId.html), emptyState: State, commandHandler: (State, Command) \=\> [Effect](Effect.html)\[Event, State], eventHandler: (State, Event) \=\> State): [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]Create a `Behavior` for a persistent actor.

Create a `Behavior` for a persistent actor.

persistenceIdstable unique identifier for the event sourced behavior

emptyStatethe intial state for the entity before any events have been processed

commandHandlermap commands to effects e.g. persisting events, replying to commands

eventHandlercompute the new state given the current state when an event has been persisted
5. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
7. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
10. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
11. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#lastSequenceNumber(context:akka.actor.typed.scaladsl.ActorContext[_]):Long "Permalink")  def lastSequenceNumber(context: [ActorContext](../../../actor/typed/scaladsl/ActorContext.html)\[\_]): [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)The last sequence number that was persisted, can only be called from inside the handlers of an `EventSourcedBehavior`
13. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
16. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#withEnforcedReplies[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.scaladsl.ReplyEffect[Event,State],eventHandler:(State,Event)=>State):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "Permalink")  def withEnforcedReplies\[Command, Event, State](persistenceId: [PersistenceId](../PersistenceId.html), emptyState: State, commandHandler: (State, Command) \=\> [ReplyEffect](ReplyEffect.html)\[Event, State], eventHandler: (State, Event) \=\> State): [EventSourcedBehavior](EventSourcedBehavior.html)\[Command, Event, State]Create a `Behavior` for a persistent actor that is enforcing that replies to commands are not forgotten.

Create a `Behavior` for a persistent actor that is enforcing that replies to commands are not forgotten.
Then there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with [Effect.reply](Effect$.html#reply[ReplyMessage,Event,State](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:ReplyMessage):akka.persistence.typed.scaladsl.ReplyEffect[Event,State]), [Effect.noReply](Effect$.html#noReply[Event,State]:akka.persistence.typed.scaladsl.ReplyEffect[Event,State]), [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:State=>ReplyMessage):akka.persistence.typed.scaladsl.ReplyEffect[Event,State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.scaladsl.ReplyEffect[Event,State]).
22. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html "Permalink")  object [CommandHandler](EventSourcedBehavior$$CommandHandler$.html "The CommandHandler defines how to act on commands.")The `CommandHandler` defines how to act on commands.

The `CommandHandler` defines how to act on commands. A `CommandHandler` is
a function:

```
(State, Command) => Effect[Event, State]
```
The [CommandHandler\#command](EventSourcedBehavior$$CommandHandler$.html#command[Command,Event,State](commandHandler:Command=>akka.persistence.typed.scaladsl.Effect[Event,State]):(State,Command)=>akka.persistence.typed.scaladsl.Effect[Event,State]) is useful for simple commands that don't need the state
and context.
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html
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
*Source: [https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html)*