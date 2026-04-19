---
description: Akka 2.10.17 - akka.persistence.Persistence
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/Persistence.html
title: Akka 2.10.17 - akka.persistence.Persistence
---

# Akka 2.10.17 - akka.persistence.Persistence

> **Summary:** Akka 2.10.17 - akka.persistence.Persistence

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
- Persistence
- [PersistenceIdentity](PersistenceIdentity.html "Identification of PersistentActor.")
- [PersistenceRecovery](PersistenceRecovery.html)
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
[c](Persistence$.html "See companion object")[akka](../index.html).[persistence](index.html)

# [Persistence](Persistence$.html "See companion object")[**](../../akka/persistence/Persistence.html "Permalink")

### Companion [object Persistence](Persistence$.html "See companion object")

#### class Persistence extends [Extension](../actor/Extension.html)

Persistence extension.

Source[Persistence.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/Persistence.scala#L199)Linear Supertypes[Extension](../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Persistence
2. Extension
3. AnyRef
4. Any
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

1. [**](../../akka/persistence/Persistence.html#<init>(system:akka.actor.ExtendedActorSystem):akka.persistence.Persistence "Permalink")  new Persistence(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../akka/persistence/Persistence.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/persistence/Persistence.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/persistence/Persistence.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Persistence toany2stringadd\[Persistence] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/persistence/Persistence.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Persistence, B)ImplicitThis member is added by an implicit conversion from Persistence toArrowAssoc\[Persistence] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/persistence/Persistence.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/persistence/Persistence.html#adaptersFor(journalPluginId:String,journalPluginConfig:com.typesafe.config.Config):akka.persistence.journal.EventAdapters "Permalink") final  def adaptersFor(journalPluginId: String, journalPluginConfig: Config): [EventAdapters](journal/EventAdapters.html)Returns an [akka.persistence.journal.EventAdapters](journal/EventAdapters.html) object which serves as a per\-journal collection of bound event adapters.

Returns an [akka.persistence.journal.EventAdapters](journal/EventAdapters.html) object which serves as a per\-journal collection of bound event adapters.
If no adapters are registered for a given journal the EventAdapters object will simply return the identity
adapter for each class, otherwise the most specific adapter matching a given class will be returned.

The provided journalPluginConfig will be used to configure the plugin instead of the actor system config.
7. [**](../../akka/persistence/Persistence.html#adaptersFor(journalPluginId:String):akka.persistence.journal.EventAdapters "Permalink") final  def adaptersFor(journalPluginId: String): [EventAdapters](journal/EventAdapters.html)Returns an [akka.persistence.journal.EventAdapters](journal/EventAdapters.html) object which serves as a per\-journal collection of bound event adapters.

Returns an [akka.persistence.journal.EventAdapters](journal/EventAdapters.html) object which serves as a per\-journal collection of bound event adapters.
If no adapters are registered for a given journal the EventAdapters object will simply return the identity
adapter for each class, otherwise the most specific adapter matching a given class will be returned.
8. [**](../../akka/persistence/Persistence.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/persistence/Persistence.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/persistence/Persistence.html#defaultInternalStashOverflowStrategy:akka.persistence.StashOverflowStrategy "Permalink")  lazy val defaultInternalStashOverflowStrategy: [StashOverflowStrategy](StashOverflowStrategy.html)
11. [**](../../akka/persistence/Persistence.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Persistence) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceImplicitThis member is added by an implicit conversion from Persistence toEnsuring\[Persistence] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/persistence/Persistence.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Persistence) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceImplicitThis member is added by an implicit conversion from Persistence toEnsuring\[Persistence] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/persistence/Persistence.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceImplicitThis member is added by an implicit conversion from Persistence toEnsuring\[Persistence] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/persistence/Persistence.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceImplicitThis member is added by an implicit conversion from Persistence toEnsuring\[Persistence] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/persistence/Persistence.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/persistence/Persistence.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../akka/persistence/Persistence.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/persistence/Persistence.html#getSliceRanges(numberOfRanges:Int):java.util.List[akka.japi.Pair[Integer,Integer]] "Permalink") final  def getSliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Pair](../japi/Pair.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]]Java API: Split the total number of slices into ranges by the given `numberOfRanges`.

Java API: Split the total number of slices into ranges by the given `numberOfRanges`.

For example, `numberOfSlices` is 128 and given 4 `numberOfRanges` this method will
return ranges (0 to 255\), (256 to 511\), (512 to 767\) and (768 to 1023\).
19. [**](../../akka/persistence/Persistence.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/persistence/Persistence.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/persistence/Persistence.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/persistence/Persistence.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/persistence/Persistence.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/persistence/Persistence.html#numberOfSlices:Int "Permalink") final  def numberOfSlices: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)A slice is deterministically defined based on the persistence id.

A slice is deterministically defined based on the persistence id.
`numberOfSlices` is not configurable because changing the value would result in
different slice for a persistence id than what was used before, which would
result in invalid eventsBySlices.

`numberOfSlices` is 1024
25. [**](../../akka/persistence/Persistence.html#persistenceId(persistentActor:akka.actor.ActorRef):String "Permalink")  def persistenceId(persistentActor: [ActorRef](../actor/ActorRef.html)): StringCreates a canonical persistent actor id from a persistent actor ref.
26. [**](../../akka/persistence/Persistence.html#settings:akka.persistence.PersistenceSettings "Permalink")  val settings: [PersistenceSettings](PersistenceSettings.html)
27. [**](../../akka/persistence/Persistence.html#sliceForPersistenceId(persistenceId:String):Int "Permalink") final  def sliceForPersistenceId(persistenceId: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)A slice is deterministically defined based on the persistence id.

A slice is deterministically defined based on the persistence id. The purpose is to
evenly distribute all persistence ids over the slices and be able to query the
events for a range of slices.
28. [**](../../akka/persistence/Persistence.html#sliceRanges(numberOfRanges:Int):IndexedSeq[Range] "Permalink") final  def sliceRanges(numberOfRanges: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[Range]Scala API: Split the total number of slices into ranges by the given `numberOfRanges`.

Scala API: Split the total number of slices into ranges by the given `numberOfRanges`.

For example, `numberOfSlices` is 1024 and given 4 `numberOfRanges` this method will
return ranges (0 to 255\), (256 to 511\), (512 to 767\) and (768 to 1023\).
29. [**](../../akka/persistence/Persistence.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../akka/persistence/Persistence.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)
31. [**](../../akka/persistence/Persistence.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../akka/persistence/Persistence.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../akka/persistence/Persistence.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../akka/persistence/Persistence.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/persistence/Persistence.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/persistence/Persistence.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Persistence toStringFormat\[Persistence] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/persistence/Persistence.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Persistence, B)ImplicitThis member is added by an implicit conversion from Persistence toArrowAssoc\[Persistence] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistence to any2stringadd\[Persistence]

### Inherited by implicit conversion StringFormat fromPersistence to StringFormat\[Persistence]

### Inherited by implicit conversion Ensuring fromPersistence to Ensuring\[Persistence]

### Inherited by implicit conversion ArrowAssoc fromPersistence to ArrowAssoc\[Persistence]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/AtLeastOnceDelivery$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/AtomicWrite$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/CapabilityFlag$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/DeleteSnapshotsFailure.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/DeleteSnapshotsSuccess.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/DiscardConfigurator.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/FilteredPayload$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/JournalCapabilityFlags.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/Persistence$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/PersistenceSettings.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/PersistenceStash.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/PersistentRepr$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/PluginSpec.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/Recovery$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/Recovery.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/RecoveryCompleted$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/RecoveryCompleted.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/RecoveryTimedOut.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/ReplyToStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/RuntimePluginConfig.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/SaveSnapshotFailure.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/SelectedSnapshot$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/SelectedSnapshot.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/SerializedEvent.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/SnapshotMetadata$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/SnapshotMetadata.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/persistence/Persistence.html](https://doc.akka.io/api/akka/2.10/akka/persistence/Persistence.html)*