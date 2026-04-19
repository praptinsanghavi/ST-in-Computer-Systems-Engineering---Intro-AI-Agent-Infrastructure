---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.javadsl.EventSourcedCleanup
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.javadsl.EventSourcedCleanup
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.javadsl.EventSourcedCleanup

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.javadsl.EventSourcedCleanup

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/cleanup/index.html "Permalink")  package [cleanup](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[cleanup](../index.html)
- [DurableStateCleanup](DurableStateCleanup.html "Java API: Tool for deleting durable state for a given list of persistenceIds without using DurableStateBehavior actors.")
- EventSourcedCleanup
c[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[cleanup](../index.html).[javadsl](index.html)

# EventSourcedCleanup[**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html "Permalink")

### 

#### final  class EventSourcedCleanup extends AnyRef

Java API: Tool for deleting events and/or snapshots for a given list of `persistenceIds` without using persistent
actors.

When running an operation with `EventSourcedCleanup` that deletes all events for a persistence id, the actor with
that persistence id must not be running! If the actor is restarted it would in that case be recovered to the wrong
state since the stored events have been deleted. Delete events before snapshot can still be used while the actor is
running.

If `resetSequenceNumber` is `true` then the creating entity with the same `persistenceId` will start from 0\.
Otherwise it will continue from the latest highest used sequence number.

WARNING: reusing the same `persistenceId` after resetting the sequence number should be avoided, since it might be
confusing to reuse the same sequence number for new events.

When a list of `persistenceIds` are given they are deleted sequentially in the order of the list. It's possible to
parallelize the deletes by running several cleanup operations at the same time operating on different sets of
`persistenceIds`.

Annotations@ApiMayChange() Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourcedCleanup
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider):akka.persistence.r2dbc.cleanup.javadsl.EventSourcedCleanup "Permalink")  new EventSourcedCleanup(systemProvider: ClassicActorSystemProvider)
2. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider,configPath:String):akka.persistence.r2dbc.cleanup.javadsl.EventSourcedCleanup "Permalink")  new EventSourcedCleanup(systemProvider: ClassicActorSystemProvider, configPath: String)
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#cleanupBeforeSnapshot(persistenceIds:java.util.List[String]):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def cleanupBeforeSnapshot(persistenceIds: [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[String]): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]See single persistenceId overload for what is done for each persistence id
6. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#cleanupBeforeSnapshot(persistenceId:String):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def cleanupBeforeSnapshot(persistenceId: String): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Deletes all events for the given persistence id from before the snapshot.

Deletes all events for the given persistence id from before the snapshot. The snapshot is not deleted. The event
with the same sequence number as the remaining snapshot is deleted.
7. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#deleteAll(persistenceIds:java.util.List[String],resetSequenceNumber:Boolean):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteAll(persistenceIds: [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[String], resetSequenceNumber: Boolean): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Delete everything related to the given list of `persistenceIds`.

Delete everything related to the given list of `persistenceIds`. All events and snapshots are deleted.
9. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#deleteAll(persistenceId:String,resetSequenceNumber:Boolean):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteAll(persistenceId: String, resetSequenceNumber: Boolean): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Delete everything related to one single `persistenceId`.

Delete everything related to one single `persistenceId`. All events and snapshots are deleted.
10. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#deleteAllEvents(persistenceIds:java.util.List[String],resetSequenceNumber:Boolean):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteAllEvents(persistenceIds: [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[String], resetSequenceNumber: Boolean): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Delete all events related to the given list of `persistenceIds`.

Delete all events related to the given list of `persistenceIds`. Snapshots are not deleted.
11. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#deleteAllEvents(persistenceId:String,resetSequenceNumber:Boolean):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteAllEvents(persistenceId: String, resetSequenceNumber: Boolean): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Delete all events related to one single `persistenceId`.

Delete all events related to one single `persistenceId`. Snapshots are not deleted.
12. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#deleteEventsBefore(entityType:String,slice:Int,timestamp:java.time.Instant):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteEventsBefore(entityType: String, slice: Int, timestamp: [Instant](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Instant.html#java.time.Instant)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Delete events before a timestamp for the given entityType and slice.

Delete events before a timestamp for the given entityType and slice. Snapshots are not deleted.

This can be useful for `DurableStateBehavior` with change events, where the events are only used for the
Projections and not for the recovery of the `DurableStateBehavior` state. The timestamp may correspond to the
offset timestamp of the Projections, if events are not needed after all Projections have processed them.

Be aware of that if all events of a persistenceId are removed the sequence number will start from 1 again if an
`EventSourcedBehavior` with the same persistenceId is used again.

entityType
 the entity type to delete for

slice
 the slice to delete for

timestamp
 timestamp (exclusive) to delete up to
13. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#deleteEventsBefore(persistenceId:String,timestamp:java.time.Instant):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteEventsBefore(persistenceId: String, timestamp: [Instant](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Instant.html#java.time.Instant)): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Delete events before a timestamp for the given persistence id.

Delete events before a timestamp for the given persistence id. Snapshots are not deleted.

This can be useful for `DurableStateBehavior` with change events, where the events are only used for the
Projections and not for the recovery of the `DurableStateBehavior` state. The timestamp may correspond to the
offset timestamp of the Projections, if events are not needed after all Projections have processed them.

Be aware of that if all events of a persistenceId are removed the sequence number will start from 1 again if an
`EventSourcedBehavior` with the same persistenceId is used again.

persistenceId
 the persistence id to delete for

timestamp
 timestamp (exclusive) to delete up to
14. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#deleteEventsTo(persistenceId:String,toSequenceNr:Long):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteEventsTo(persistenceId: String, toSequenceNr: Long): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Delete all events before a sequenceNr for the given persistence id.

Delete all events before a sequenceNr for the given persistence id. Snapshots are not deleted.

persistenceId
 the persistence id to delete for

toSequenceNr
 sequence nr (inclusive) to delete up to
15. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#deleteSnapshot(persistenceId:String):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteSnapshot(persistenceId: String): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Delete snapshots related to one single `persistenceId`.

Delete snapshots related to one single `persistenceId`. Events are not deleted.
16. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#deleteSnapshots(persistenceIds:java.util.List[String]):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def deleteSnapshots(persistenceIds: [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[String]): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Delete all snapshots related to the given list of `persistenceIds`.

Delete all snapshots related to the given list of `persistenceIds`. Events are not deleted.
17. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
18. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
19. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
20. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
21. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
22. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
23. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
24. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
25. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/DurableStateCleanup.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html)*