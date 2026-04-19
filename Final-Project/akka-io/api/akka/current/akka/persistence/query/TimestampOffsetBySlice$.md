---
description: Akka 2.10.17 - akka.persistence.query.TimestampOffsetBySlice
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:55:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/TimestampOffsetBySlice$.html
title: Akka 2.10.17 - akka.persistence.query.TimestampOffsetBySlice
---

# Akka 2.10.17 - akka.persistence.query.TimestampOffsetBySlice

> **Summary:** Akka 2.10.17 - akka.persistence.query.TimestampOffsetBySlice

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
[o](TimestampOffsetBySlice.html "See companion class")[akka](../../index.html).[persistence](../index.html).[query](index.html)

# [TimestampOffsetBySlice](TimestampOffsetBySlice.html "See companion class")[**](../../../akka/persistence/query/TimestampOffsetBySlice$.html "Permalink")

### Companion [class TimestampOffsetBySlice](TimestampOffsetBySlice.html "See companion class")

#### object TimestampOffsetBySlice

Timestamp\-based offset by slice.

API May Change

Source[Offset.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/Offset.scala#L125)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TimestampOffsetBySlice
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#apply(offsets:Map[Int,akka.persistence.query.TimestampOffset]):akka.persistence.query.TimestampOffsetBySlice "Permalink")  def apply(offsets: Map\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [TimestampOffset](TimestampOffset.html)]): [TimestampOffsetBySlice](TimestampOffsetBySlice.html)
5. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#create(offsets:java.util.Map[Integer,akka.persistence.query.TimestampOffset]):akka.persistence.query.TimestampOffsetBySlice "Permalink")  def create(offsets: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [TimestampOffset](TimestampOffset.html)]): [TimestampOffsetBySlice](TimestampOffsetBySlice.html)Java API
8. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#empty:akka.persistence.query.TimestampOffsetBySlice "Permalink")  val empty: [TimestampOffsetBySlice](TimestampOffsetBySlice.html)
9. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#unapply(timestampOffsetBySlice:akka.persistence.query.TimestampOffsetBySlice):Option[Map[Int,akka.persistence.query.TimestampOffset]] "Permalink")  def unapply(timestampOffsetBySlice: [TimestampOffsetBySlice](TimestampOffsetBySlice.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Map\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [TimestampOffset](TimestampOffset.html)]]
20. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/query/TimestampOffsetBySlice$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffsetBySlice$.html](https://doc.akka.io/api/akka/current/akka/persistence/query/TimestampOffsetBySlice$.html)*