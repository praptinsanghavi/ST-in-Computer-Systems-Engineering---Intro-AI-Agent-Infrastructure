---
description: Akka 2.10.17 - akka.persistence.PersistenceStash
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/PersistenceStash.html
title: Akka 2.10.17 - akka.persistence.PersistenceStash
---

# Akka 2.10.17 - akka.persistence.PersistenceStash

> **Summary:** Akka 2.10.17 - akka.persistence.PersistenceStash

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/persistence/fsm/index.html "Permalink")  package [fsm](fsm/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/journal/index.html "Permalink")  package [journal](journal/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/query/index.html "Permalink")  package [query](query/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/scalatest/index.html "Permalink")  package [scalatest](scalatest/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/serialization/index.html "Permalink")  package [serialization](serialization/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/snapshot/index.html "Permalink")  package [snapshot](snapshot/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/state/index.html "Permalink")  package [state](state/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/telemetry/index.html "Permalink")  package [telemetry](telemetry/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[persistence](index.html)
- [**](../../akka/persistence/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[persistence](index.html)
- [AbstractPersistentActor](AbstractPersistentActor.html "Java API: an persistent actor - can be used to implement command or Event Sourcing.")
- [AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "Java API: compatible with lambda expressions")
- [AbstractPersistentActorWithTimers](AbstractPersistentActorWithTimers.html "Java API: Combination of AbstractPersistentActor and akka.actor.AbstractActorWithTimers.")
- [AtLeastOnceDelivery](AtLeastOnceDelivery.html "Scala API: Mix-in this trait with your PersistentActor to send messages with at-least-once delivery semantics to destinations.")
- [AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html)
- [AtomicWrite](AtomicWrite.html)
- [CapabilityFlag](CapabilityFlag.html)
- [CapabilityFlags](CapabilityFlags.html)
- [DeleteMessagesFailure](DeleteMessagesFailure.html "Reply message to a failed JournalProtocol.DeleteMessagesTo request.")
- [DeleteMessagesSuccess](DeleteMessagesSuccess.html "Reply message to a successful JournalProtocol.DeleteMessagesTo request.")
- [DeleteSnapshotFailure](DeleteSnapshotFailure.html "Sent to a PersistentActor after failed deletion of a snapshot.")
- [DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "Sent to a PersistentActor after successful deletion of a snapshot.")
- [DeleteSnapshotsFailure](DeleteSnapshotsFailure.html "Sent to a PersistentActor after failed deletion of a range of snapshots.")
- [DeleteSnapshotsSuccess](DeleteSnapshotsSuccess.html "Sent to a PersistentActor after successful deletion of specified range of snapshots.")
- [DiscardConfigurator](DiscardConfigurator.html)
- [DiscardToDeadLetterStrategy](DiscardToDeadLetterStrategy$.html "Discard the message to akka.actor.DeadLetter.")
- [FilteredPayload](FilteredPayload$.html "In some use cases with projections and events by slice filtered events needs to be stored in the journal to keep the sequence numbers for a given persistence id gap free.")
- [JournalCapabilityFlags](JournalCapabilityFlags.html)
- [Persistence](Persistence.html "Persistence extension.")
- [PersistenceIdentity](PersistenceIdentity.html "Identification of PersistentActor.")
- [PersistenceRecovery](PersistenceRecovery.html)
- [PersistenceSettings](PersistenceSettings.html "Persistence configuration.")
- PersistenceStash
- [PersistentActor](PersistentActor.html "Scala API: A persistent Actor - can be used to implement command or Event Sourcing.")
- [PersistentRepr](PersistentRepr.html "Plugin API: representation of a persistent message in the journal plugin API.")
- [PluginSpec](PluginSpec.html)
- [Recovery](Recovery.html "Recovery mode configuration object to be returned in PersistentActor#recovery.")
- [RecoveryCompleted](RecoveryCompleted.html)
- [RecoveryTimedOut](RecoveryTimedOut.html)
- [ReplyToStrategy](ReplyToStrategy.html "Reply to sender with predefined response, and discard the received message silently.")
- [RuntimePluginConfig](RuntimePluginConfig.html)
- [SaveSnapshotFailure](SaveSnapshotFailure.html "Sent to a PersistentActor after failed saving of a snapshot.")
- [SaveSnapshotSuccess](SaveSnapshotSuccess.html "Sent to a PersistentActor after successful saving of a snapshot.")
- [SelectedSnapshot](SelectedSnapshot.html "Plugin API: a selected snapshot matching SnapshotSelectionCriteria.")
- [SerializedEvent](SerializedEvent.html "Some journal implementations may support events of this type by writing the event payload and serialization information without having to serialize it.")
- [SnapshotMetadata](SnapshotMetadata.html "Snapshot metadata.")
- [SnapshotOffer](SnapshotOffer.html "Offers a PersistentActor a previously saved snapshot during recovery.")
- [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.")
- [SnapshotStoreCapabilityFlags](SnapshotStoreCapabilityFlags.html)
- [Snapshotter](Snapshotter.html "Snapshot API on top of the internal snapshot protocol.")
- [StashOverflowStrategy](StashOverflowStrategy.html "This defines how to handle the current received message which failed to stash, when the size of Stash exceeding the capacity of Stash.")
- [StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "Implement this interface in order to configure the stashOverflowStrategy for the internal stash of persistent actor.")
- [TestPayload](TestPayload.html)
- [TestSerializer](TestSerializer.html)
- [ThrowExceptionConfigurator](ThrowExceptionConfigurator.html)
- [ThrowOverflowExceptionStrategy](ThrowOverflowExceptionStrategy$.html "Throw akka.actor.StashOverflowException, hence the persistent actor will starting recovery if guarded by default supervisor strategy.")
t[akka](../index.html).[persistence](index.html)

# PersistenceStash[**](../../akka/persistence/PersistenceStash.html "Permalink")

### 

#### trait PersistenceStash extends [Stash](../actor/Stash.html) with StashFactory

Source[Persistence.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/Persistence.scala#L107)Linear SupertypesStashFactory, [Stash](../actor/Stash.html), [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html)], [UnrestrictedStash](../actor/UnrestrictedStash.html), StashSupport, [Actor](../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceStash
2. StashFactory
3. Stash
4. RequiresMessageQueue
5. UnrestrictedStash
6. StashSupport
7. Actor
8. AnyRef
9. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/persistence/PersistenceStash.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../actor/Actor.html)
### Abstract Value Members

1. [**](../../akka/persistence/PersistenceStash.html#receive:akka.actor.Actor.Receive "Permalink") abstract  def receive: [actor.Actor.Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit])Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition Classes[Actor](../actor/Actor.html)
### Concrete Value Members

1. [**](../../akka/persistence/PersistenceStash.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/persistence/PersistenceStash.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/persistence/PersistenceStash.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceStash toany2stringadd\[PersistenceStash] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/persistence/PersistenceStash.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceStash, B)ImplicitThis member is added by an implicit conversion from PersistenceStash toArrowAssoc\[PersistenceStash] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/persistence/PersistenceStash.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/persistence/PersistenceStash.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
7. [**](../../akka/persistence/PersistenceStash.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
8. [**](../../akka/persistence/PersistenceStash.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
9. [**](../../akka/persistence/PersistenceStash.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/persistence/PersistenceStash.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
11. [**](../../akka/persistence/PersistenceStash.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/persistence/PersistenceStash.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/persistence/PersistenceStash.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../actor/Actor.html)
14. [**](../../akka/persistence/PersistenceStash.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceStash) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceStashImplicitThis member is added by an implicit conversion from PersistenceStash toEnsuring\[PersistenceStash] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/persistence/PersistenceStash.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceStash) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceStashImplicitThis member is added by an implicit conversion from PersistenceStash toEnsuring\[PersistenceStash] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/persistence/PersistenceStash.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceStashImplicitThis member is added by an implicit conversion from PersistenceStash toEnsuring\[PersistenceStash] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/persistence/PersistenceStash.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceStashImplicitThis member is added by an implicit conversion from PersistenceStash toEnsuring\[PersistenceStash] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/persistence/PersistenceStash.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/persistence/PersistenceStash.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/persistence/PersistenceStash.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/persistence/PersistenceStash.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/persistence/PersistenceStash.html#internalStashOverflowStrategy:akka.persistence.StashOverflowStrategy "Permalink")  def internalStashOverflowStrategy: [StashOverflowStrategy](StashOverflowStrategy.html)The returned [StashOverflowStrategy](StashOverflowStrategy.html) object determines how to handle the message failed to stash
when the internal Stash capacity exceeded.
23. [**](../../akka/persistence/PersistenceStash.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../akka/persistence/PersistenceStash.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../akka/persistence/PersistenceStash.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/persistence/PersistenceStash.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/persistence/PersistenceStash.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
28. [**](../../akka/persistence/PersistenceStash.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox and clears the stash.
 Must be called when overriding this method, otherwise stashed messages won't be propagated to DeadLetters
 when actor stops.

Definition Classes[UnrestrictedStash](../actor/UnrestrictedStash.html) → [Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
29. [**](../../akka/persistence/PersistenceStash.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Overridden callback.

 Overridden callback. Prepends all messages in the stash to the mailbox,
 clears the stash, stops all children and invokes the postStop() callback.

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[UnrestrictedStash](../actor/UnrestrictedStash.html) → [Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
30. [**](../../akka/persistence/PersistenceStash.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
31. [**](../../akka/persistence/PersistenceStash.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../actor/Actor.html)
32. [**](../../akka/persistence/PersistenceStash.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../actor/Actor.html)
33. [**](../../akka/persistence/PersistenceStash.html#stash():Unit "Permalink")  def stash(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Adds the current message (the message that the actor received last) to the
 actor's stash.

 Adds the current message (the message that the actor received last) to the
 actor's stash.

Definition ClassesStashSupportExceptions thrown`IllegalStateException` if the same message is stashed more than once

`StashOverflowException` in case of a stash capacity violation
34. [**](../../akka/persistence/PersistenceStash.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../actor/Actor.html)
35. [**](../../akka/persistence/PersistenceStash.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../akka/persistence/PersistenceStash.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
37. [**](../../akka/persistence/PersistenceStash.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../event/EventStream.html)

Definition Classes[Actor](../actor/Actor.html)
38. [**](../../akka/persistence/PersistenceStash.html#unstashAll():Unit "Permalink")  def unstashAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) Prepends all messages in the stash to the mailbox, and then clears the stash.

 Prepends all messages in the stash to the mailbox, and then clears the stash.

 Messages from the stash are enqueued to the mailbox until the capacity of the
 mailbox (if any) has been reached. In case a bounded mailbox overflows, a
 `MessageQueueAppendFailedException` is thrown.

 The stash is guaranteed to be empty after calling `unstashAll()`.

Definition ClassesStashSupport
39. [**](../../akka/persistence/PersistenceStash.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../akka/persistence/PersistenceStash.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../akka/persistence/PersistenceStash.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/persistence/PersistenceStash.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/persistence/PersistenceStash.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceStash toStringFormat\[PersistenceStash] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/persistence/PersistenceStash.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceStash, B)ImplicitThis member is added by an implicit conversion from PersistenceStash toArrowAssoc\[PersistenceStash] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from StashFactory

### Inherited from [Stash](../actor/Stash.html)

### Inherited from [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html)]

### Inherited from [UnrestrictedStash](../actor/UnrestrictedStash.html)

### Inherited from StashSupport

### Inherited from [Actor](../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceStash to any2stringadd\[PersistenceStash]

### Inherited by implicit conversion StringFormat fromPersistenceStash to StringFormat\[PersistenceStash]

### Inherited by implicit conversion Ensuring fromPersistenceStash to Ensuring\[PersistenceStash]

### Inherited by implicit conversion ArrowAssoc fromPersistenceStash to ArrowAssoc\[PersistenceStash]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Stash.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtomicWrite$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/CapabilityFlag$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteSnapshotsFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteSnapshotsSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DiscardConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/FilteredPayload$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/JournalCapabilityFlags.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Persistence$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceStash.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PluginSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Recovery.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceStash.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceStash.html)*