---
description: Akka 2.8.9 - akka.persistence.typed.scaladsl.RetentionCriteria
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:24:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/RetentionCriteria$.html
title: Akka 2.8.9 - akka.persistence.typed.scaladsl.RetentionCriteria
---

# Akka 2.8.9 - akka.persistence.typed.scaladsl.RetentionCriteria

> **Summary:** Akka 2.8.9 - akka.persistence.typed.scaladsl.RetentionCriteria

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
[o](RetentionCriteria.html "See companion trait")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [RetentionCriteria](RetentionCriteria.html "See companion trait")[**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html "Permalink")

### Companion [trait RetentionCriteria](RetentionCriteria.html "See companion trait")

#### object RetentionCriteria

Criteria for retention/deletion of snapshots and events.

Source[RetentionCriteria.scala](https://github.com/akka/akka/tree/v2.8.9//akka-persistence-typed/src/main/scala/akka/persistence/typed/scaladsl/RetentionCriteria.scala#L21)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RetentionCriteria
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
6. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#disabled:akka.persistence.typed.scaladsl.RetentionCriteria "Permalink")  val disabled: [RetentionCriteria](RetentionCriteria.html)Snapshots are not saved and deleted automatically, events are not deleted.
7. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
10. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
11. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
14. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#snapshotEvery(numberOfEvents:Int):akka.persistence.typed.scaladsl.SnapshotCountRetentionCriteria "Permalink")  def snapshotEvery(numberOfEvents: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)Save snapshots automatically every `numberOfEvents`.

Save snapshots automatically every `numberOfEvents`.

Use [SnapshotCountRetentionCriteria.withDeleteEventsOnSnapshot](SnapshotCountRetentionCriteria.html#withDeleteEventsOnSnapshot:akka.persistence.typed.scaladsl.SnapshotCountRetentionCriteria) to
delete old events. Events are not deleted by default.

If multiple events are persisted with a single Effect the snapshot will happen after
all of the events are persisted rather than precisely every `numberOfEvents`.
16. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#snapshotEvery(numberOfEvents:Int,keepNSnapshots:Int):akka.persistence.typed.scaladsl.SnapshotCountRetentionCriteria "Permalink")  def snapshotEvery(numberOfEvents: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int), keepNSnapshots: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)Save snapshots automatically every `numberOfEvents`.

Save snapshots automatically every `numberOfEvents`. Snapshots that have sequence number
less than sequence number of the saved snapshot minus `keepNSnapshots * numberOfEvents` are
automatically deleted.

Use [SnapshotCountRetentionCriteria.withDeleteEventsOnSnapshot](SnapshotCountRetentionCriteria.html#withDeleteEventsOnSnapshot:akka.persistence.typed.scaladsl.SnapshotCountRetentionCriteria) to
delete old events. Events are not deleted by default.

If multiple events are persisted with a single Effect the snapshot will happen after
all of the events are persisted rather than precisely every `numberOfEvents`.
17. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/index.html
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
*Source: [https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/RetentionCriteria$.html](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/RetentionCriteria$.html)*