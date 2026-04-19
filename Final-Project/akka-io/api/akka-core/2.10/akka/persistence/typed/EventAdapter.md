---
description: Akka 2.10.17 - akka.persistence.typed.EventAdapter
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/EventAdapter.html
title: Akka 2.10.17 - akka.persistence.typed.EventAdapter
---

# Akka 2.10.17 - akka.persistence.typed.EventAdapter

> **Summary:** Akka 2.10.17 - akka.persistence.typed.EventAdapter

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](crdt/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](serialization/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/state/index.html "Permalink")  package [state](state/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](telemetry/index.html)Definition Classes[typed](index.html)
- [DeleteEventsCompleted](DeleteEventsCompleted.html)
- [DeleteEventsFailed](DeleteEventsFailed.html)
- [DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html)
- [DeleteSnapshotsFailed](DeleteSnapshotsFailed.html)
- [DeletionTarget](DeletionTarget.html "Not for user extension")
- EventAdapter
- [EventRejectedException](EventRejectedException.html "Thrown if a journal rejects an event e.g.")
- [EventSeq](EventSeq.html)
- [EventSourcedSignal](EventSourcedSignal.html "Supertype for all Akka Persistence Typed specific signals")
- [PersistFailed](PersistFailed.html)
- [PersistRejected](PersistRejected.html)
- [PersistenceId](PersistenceId.html "Unique identifier in the backend data store (journal and snapshot store) of the persistent actor.")
- [PublishedEvent](PublishedEvent.html "When using event publishing the events published to the system event stream will be in this form.")
- [RecoveryCompleted](RecoveryCompleted.html)
- [RecoveryFailed](RecoveryFailed.html)
- [ReplicaId](ReplicaId.html "Identifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier.")
- [ReplicationId](ReplicationId.html)
- [SnapshotAdapter](SnapshotAdapter.html "Facility to convert snapshots from and to a specialized data model.")
- [SnapshotCompleted](SnapshotCompleted.html)
- [SnapshotFailed](SnapshotFailed.html)
- [SnapshotMetadata](SnapshotMetadata.html "Snapshot metadata.")
- [SnapshotRecovered](SnapshotRecovered.html)
- [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "Selection criteria for loading and deleting snapshots.")
c[akka](../../index.html).[persistence](../index.html).[typed](index.html)

# EventAdapter[**](../../../akka/persistence/typed/EventAdapter.html "Permalink")

### 

#### abstract  class EventAdapter\[E, P] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.
Typical use cases include (but are not limited to):

- extracting events from "envelopes"
- adapting events from a "domain model" to the "data model", e.g. converting to the Journals storage format,
 such as JSON, BSON or any specialised binary format
- adapting events from a "data model" to the "domain model"
- adding metadata that is understood by the journal
- migration by splitting up events into sequences of other events
- migration filtering out unused events, or replacing an event with another
Source[EventAdapter.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/EventAdapter.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventAdapter
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
### Instance Constructors

1. [**](../../../akka/persistence/typed/EventAdapter.html#<init>():akka.persistence.typed.EventAdapter[E,P] "Permalink")  new EventAdapter()
### Abstract Value Members

1. [**](../../../akka/persistence/typed/EventAdapter.html#fromJournal(p:P,manifest:String):akka.persistence.typed.EventSeq[E] "Permalink") abstract  def fromJournal(p: P, manifest: String): [EventSeq](EventSeq.html)\[E]Transform the event on recovery from the journal.

Transform the event on recovery from the journal.
Note that this is not called in any read side so will need to be applied
manually when using Query.

Convert a event from its journal model to the applications domain model.

One event may be adapter into multiple (or none) events which should be delivered to the `EventSourcedBehavior`.
Use the specialised [EventSeq.single](EventSeq$.html#single[A](event:A):akka.persistence.typed.EventSeq[A]) method to emit exactly one event,
or [EventSeq.empty](EventSeq$.html#empty[A]:akka.persistence.typed.EventSeq[A]) in case the adapter is not handling this event.

pevent to be adapted before delivering to the `EventSourcedBehavior`

manifestoptionally provided manifest (type hint) in case the Adapter has stored one
 for this event, `""` if none

returnssequence containing the adapted events (possibly zero) which will be delivered to
 the `EventSourcedBehavior`
2. [**](../../../akka/persistence/typed/EventAdapter.html#manifest(event:E):String "Permalink") abstract  def manifest(event: E): StringReturn the manifest (type hint) that will be provided in the `fromJournal` method.

Return the manifest (type hint) that will be provided in the `fromJournal` method.
Use `""` if manifest is not needed.
3. [**](../../../akka/persistence/typed/EventAdapter.html#toJournal(e:E):P "Permalink") abstract  def toJournal(e: E): PConvert domain event to journal event type.

Convert domain event to journal event type.

Some journal may require a specific type to be returned to them,
for example if a primary key has to be associated with each event then a journal
may require adapters to return `com.example.myjournal.EventWithPrimaryKey(event, key)`.

The `toJournal` adaptation must be an 1\-to\-1 transformation.
It is not allowed to drop incoming events during the `toJournal` adaptation.

ethe application\-side domain event to be adapted to the journal model

returnsthe adapted event object, possibly the same object if no adaptation was performed
### Concrete Value Members

1. [**](../../../akka/persistence/typed/EventAdapter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/typed/EventAdapter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/typed/EventAdapter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventAdapter\[E, P] toany2stringadd\[EventAdapter\[E, P]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/typed/EventAdapter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventAdapter\[E, P], B)ImplicitThis member is added by an implicit conversion from EventAdapter\[E, P] toArrowAssoc\[EventAdapter\[E, P]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/typed/EventAdapter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/typed/EventAdapter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/typed/EventAdapter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/typed/EventAdapter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventAdapter\[E, P]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventAdapter\[E, P]ImplicitThis member is added by an implicit conversion from EventAdapter\[E, P] toEnsuring\[EventAdapter\[E, P]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/typed/EventAdapter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventAdapter\[E, P]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventAdapter\[E, P]ImplicitThis member is added by an implicit conversion from EventAdapter\[E, P] toEnsuring\[EventAdapter\[E, P]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/typed/EventAdapter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventAdapter\[E, P]ImplicitThis member is added by an implicit conversion from EventAdapter\[E, P] toEnsuring\[EventAdapter\[E, P]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/typed/EventAdapter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventAdapter\[E, P]ImplicitThis member is added by an implicit conversion from EventAdapter\[E, P] toEnsuring\[EventAdapter\[E, P]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/typed/EventAdapter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/typed/EventAdapter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/typed/EventAdapter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/typed/EventAdapter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/typed/EventAdapter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/typed/EventAdapter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/typed/EventAdapter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/typed/EventAdapter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/typed/EventAdapter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/typed/EventAdapter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/typed/EventAdapter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/typed/EventAdapter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/typed/EventAdapter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/typed/EventAdapter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/typed/EventAdapter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventAdapter\[E, P] toStringFormat\[EventAdapter\[E, P]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/typed/EventAdapter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventAdapter\[E, P], B)ImplicitThis member is added by an implicit conversion from EventAdapter\[E, P] toArrowAssoc\[EventAdapter\[E, P]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventAdapter\[E, P] to any2stringadd\[EventAdapter\[E, P]]

### Inherited by implicit conversion StringFormat fromEventAdapter\[E, P] to StringFormat\[EventAdapter\[E, P]]

### Inherited by implicit conversion Ensuring fromEventAdapter\[E, P] to Ensuring\[EventAdapter\[E, P]]

### Inherited by implicit conversion ArrowAssoc fromEventAdapter\[E, P] to ArrowAssoc\[EventAdapter\[E, P]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/DeletionTarget$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventRejectedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventSeq$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistenceId$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/RecoveryCompleted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/ReplicaId$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/ReplicationId$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/SnapshotCompleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/SnapshotFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/SnapshotMetadata$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/SnapshotRecovered.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/SnapshotSelectionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventAdapter.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventAdapter.html)*