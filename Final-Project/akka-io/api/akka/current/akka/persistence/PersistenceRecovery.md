---
description: Akka 2.10.17 - akka.persistence.PersistenceRecovery
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:42:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/PersistenceRecovery.html
title: Akka 2.10.17 - akka.persistence.PersistenceRecovery
---

# Akka 2.10.17 - akka.persistence.PersistenceRecovery

> **Summary:** Akka 2.10.17 - akka.persistence.PersistenceRecovery

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
- PersistenceRecovery
- [PersistenceSettings](PersistenceSettings.html "Persistence configuration.")
- [PersistenceStash](PersistenceStash.html)
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

# PersistenceRecovery[**](../../akka/persistence/PersistenceRecovery.html "Permalink")

### 

#### trait PersistenceRecovery extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[Persistence.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/Persistence.scala#L93)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceRecovery
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/persistence/PersistenceRecovery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/persistence/PersistenceRecovery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/persistence/PersistenceRecovery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceRecovery toany2stringadd\[PersistenceRecovery] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/persistence/PersistenceRecovery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceRecovery, B)ImplicitThis member is added by an implicit conversion from PersistenceRecovery toArrowAssoc\[PersistenceRecovery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/persistence/PersistenceRecovery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/persistence/PersistenceRecovery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/persistence/PersistenceRecovery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/persistence/PersistenceRecovery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceRecovery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceRecoveryImplicitThis member is added by an implicit conversion from PersistenceRecovery toEnsuring\[PersistenceRecovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/persistence/PersistenceRecovery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceRecovery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceRecoveryImplicitThis member is added by an implicit conversion from PersistenceRecovery toEnsuring\[PersistenceRecovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/persistence/PersistenceRecovery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceRecoveryImplicitThis member is added by an implicit conversion from PersistenceRecovery toEnsuring\[PersistenceRecovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/persistence/PersistenceRecovery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceRecoveryImplicitThis member is added by an implicit conversion from PersistenceRecovery toEnsuring\[PersistenceRecovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/persistence/PersistenceRecovery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/persistence/PersistenceRecovery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/persistence/PersistenceRecovery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/persistence/PersistenceRecovery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/persistence/PersistenceRecovery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/persistence/PersistenceRecovery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/persistence/PersistenceRecovery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/persistence/PersistenceRecovery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/persistence/PersistenceRecovery.html#recovery:akka.persistence.Recovery "Permalink")  def recovery: [Recovery](Recovery.html)Called when the persistent actor is started for the first time.

Called when the persistent actor is started for the first time.
The returned [Recovery](Recovery.html) object defines how the Actor will recover its persistent state before
handling the first incoming message.

To skip recovery completely return `Recovery.none`.
21. [**](../../akka/persistence/PersistenceRecovery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/persistence/PersistenceRecovery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../akka/persistence/PersistenceRecovery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/persistence/PersistenceRecovery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/persistence/PersistenceRecovery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/persistence/PersistenceRecovery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/persistence/PersistenceRecovery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceRecovery toStringFormat\[PersistenceRecovery] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/persistence/PersistenceRecovery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceRecovery, B)ImplicitThis member is added by an implicit conversion from PersistenceRecovery toArrowAssoc\[PersistenceRecovery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceRecovery to any2stringadd\[PersistenceRecovery]

### Inherited by implicit conversion StringFormat fromPersistenceRecovery to StringFormat\[PersistenceRecovery]

### Inherited by implicit conversion Ensuring fromPersistenceRecovery to Ensuring\[PersistenceRecovery]

### Inherited by implicit conversion ArrowAssoc fromPersistenceRecovery to ArrowAssoc\[PersistenceRecovery]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/api/akka/current/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/api/akka/current/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery$.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtomicWrite$.html
- https://doc.akka.io/api/akka/current/akka/persistence/AtomicWrite.html
- https://doc.akka.io/api/akka/current/akka/persistence/CapabilityFlag$.html
- https://doc.akka.io/api/akka/current/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/api/akka/current/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteSnapshotsFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/DeleteSnapshotsSuccess.html
- https://doc.akka.io/api/akka/current/akka/persistence/DiscardConfigurator.html
- https://doc.akka.io/api/akka/current/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/api/akka/current/akka/persistence/FilteredPayload$.html
- https://doc.akka.io/api/akka/current/akka/persistence/JournalCapabilityFlags.html
- https://doc.akka.io/api/akka/current/akka/persistence/Persistence$.html
- https://doc.akka.io/api/akka/current/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistenceSettings.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistenceStash.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentRepr$.html
- https://doc.akka.io/api/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka/current/akka/persistence/PluginSpec.html
- https://doc.akka.io/api/akka/current/akka/persistence/Recovery$.html
- https://doc.akka.io/api/akka/current/akka/persistence/Recovery.html
- https://doc.akka.io/api/akka/current/akka/persistence/RecoveryCompleted$.html
- https://doc.akka.io/api/akka/current/akka/persistence/RecoveryCompleted.html
- https://doc.akka.io/api/akka/current/akka/persistence/RecoveryTimedOut.html
- https://doc.akka.io/api/akka/current/akka/persistence/ReplyToStrategy.html
- https://doc.akka.io/api/akka/current/akka/persistence/RuntimePluginConfig.html
- https://doc.akka.io/api/akka/current/akka/persistence/SaveSnapshotFailure.html
- https://doc.akka.io/api/akka/current/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/api/akka/current/akka/persistence/SelectedSnapshot$.html
- https://doc.akka.io/api/akka/current/akka/persistence/SelectedSnapshot.html
- https://doc.akka.io/api/akka/current/akka/persistence/SerializedEvent.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotMetadata$.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotSelectionCriteria$.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka/current/akka/persistence/SnapshotStoreCapabilityFlags.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/PersistenceRecovery.html](https://doc.akka.io/api/akka/current/akka/persistence/PersistenceRecovery.html)*