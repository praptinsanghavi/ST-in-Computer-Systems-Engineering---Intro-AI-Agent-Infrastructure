---
description: Akka 2.10.17 - akka.persistence.query.EventEnvelope
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:54:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/EventEnvelope$.html
title: Akka 2.10.17 - akka.persistence.query.EventEnvelope
---

# Akka 2.10.17 - akka.persistence.query.EventEnvelope

> **Summary:** Akka 2.10.17 - akka.persistence.query.EventEnvelope

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/query/index.html "Permalink")  package [query](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/query/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](journal/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[query](index.html)
- [**](../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[query](index.html)
- [DeletedDurableState](DeletedDurableState.html)
- [DurableStateChange](DurableStateChange.html "The DurableStateStoreQuery stream elements for DurableStateStoreQuery.")
- [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.scaladsl.EventsByTagQuery query, or similar queries.")
- [NoOffset](NoOffset$.html "Used when retrieving all events.")
- [Offset](Offset.html)
- [PersistenceQuery](PersistenceQuery.html)
- [QueryCorrelationId](QueryCorrelationId$.html "(Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and error messages.")
- [ReadJournalProvider](ReadJournalProvider.html "A query plugin must implement a class that implements this trait.")
- [Sequence](Sequence.html "Corresponds to an ordered sequence number for the events.")
- [TimeBasedUUID](TimeBasedUUID.html "Corresponds to an ordered unique identifier of the events.")
- [TimestampOffset](TimestampOffset.html "Timestamp based offset.")
- [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.")
- [UpdatedDurableState](UpdatedDurableState.html)
[o](EventEnvelope.html "See companion class")[akka](../../index.html).[persistence](../index.html).[query](index.html)

# [EventEnvelope](EventEnvelope.html "See companion class")[**](../../../akka/persistence/query/EventEnvelope$.html "Permalink")

### Companion [class EventEnvelope](EventEnvelope.html "See companion class")

#### object EventEnvelope extends [AbstractFunction4](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction4.html#scala.runtime.AbstractFunction4)\[[Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [EventEnvelope](EventEnvelope.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[EventEnvelope.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/EventEnvelope.scala#L18)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AbstractFunction4](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction4.html#scala.runtime.AbstractFunction4)\[[Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [EventEnvelope](EventEnvelope.html)], ([Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [EventEnvelope](EventEnvelope.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventEnvelope
2. Serializable
3. AbstractFunction4
4. Function4
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/persistence/query/EventEnvelope$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/query/EventEnvelope$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/query/EventEnvelope$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/query/EventEnvelope$.html#apply(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Any,timestamp:Long,meta:Option[Any]):akka.persistence.query.EventEnvelope "Permalink")  def apply(offset: [Offset](Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), meta: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [EventEnvelope](EventEnvelope.html)
5. [**](../../../akka/persistence/query/EventEnvelope$.html#apply(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Any,timestamp:Long):akka.persistence.query.EventEnvelope "Permalink")  def apply(offset: [Offset](Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [EventEnvelope](EventEnvelope.html)
6. [**](../../../akka/persistence/query/EventEnvelope$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/query/EventEnvelope$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/query/EventEnvelope$.html#curried:T1=>(T2=>(T3=>(T4=>R))) "Permalink")  def curried: ([Offset](Offset.html)) \=\> (String) \=\> ([Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) \=\> ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [EventEnvelope](EventEnvelope.html)Definition ClassesFunction4Annotations@unspecialized()
9. [**](../../../akka/persistence/query/EventEnvelope$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../akka/persistence/query/EventEnvelope$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../akka/persistence/query/EventEnvelope$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/persistence/query/EventEnvelope$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/persistence/query/EventEnvelope$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/persistence/query/EventEnvelope$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/persistence/query/EventEnvelope$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/query/EventEnvelope$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/persistence/query/EventEnvelope$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/persistence/query/EventEnvelope$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction4 → AnyRef → Any
19. [**](../../../akka/persistence/query/EventEnvelope$.html#tupled:((T1,T2,T3,T4))=>R "Permalink")  def tupled: (([Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))) \=\> [EventEnvelope](EventEnvelope.html)Definition ClassesFunction4Annotations@unspecialized()
20. [**](../../../akka/persistence/query/EventEnvelope$.html#unapply(arg:akka.persistence.query.EventEnvelope):Option[(akka.persistence.query.Offset,String,Long,Any)] "Permalink")  def unapply(arg: [EventEnvelope](EventEnvelope.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))]
21. [**](../../../akka/persistence/query/EventEnvelope$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/persistence/query/EventEnvelope$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/persistence/query/EventEnvelope$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/query/EventEnvelope$.html#apply(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Any):akka.persistence.query.EventEnvelope "Permalink")  def apply(offset: [Offset](Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [EventEnvelope](EventEnvelope.html)Definition ClassesEventEnvelope → Function4Annotations@deprecated Deprecated*(Since version 2\.6\.2\)* for binary compatibility
2. [**](../../../akka/persistence/query/EventEnvelope$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AbstractFunction4](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction4.html#scala.runtime.AbstractFunction4)\[[Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [EventEnvelope](EventEnvelope.html)]

### Inherited from ([Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [EventEnvelope](EventEnvelope.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DeletedDurableState$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/EventEnvelope$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Offset$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/QueryCorrelationId$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/Sequence.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffset$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffsetBySlice$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/UpdatedDurableState$.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/EventEnvelope$.html](https://doc.akka.io/api/akka/current/akka/persistence/query/EventEnvelope$.html)*