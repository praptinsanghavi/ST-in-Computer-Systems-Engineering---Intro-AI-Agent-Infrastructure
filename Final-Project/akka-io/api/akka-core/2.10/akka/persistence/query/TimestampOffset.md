---
description: Akka 2.10.17 - akka.persistence.query.TimestampOffset
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/TimestampOffset.html
title: Akka 2.10.17 - akka.persistence.query.TimestampOffset
---

# Akka 2.10.17 - akka.persistence.query.TimestampOffset

> **Summary:** Akka 2.10.17 - akka.persistence.query.TimestampOffset

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
- TimestampOffset
- [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.")
- [UpdatedDurableState](UpdatedDurableState.html)
[c](TimestampOffset$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[query](index.html)

# [TimestampOffset](TimestampOffset$.html "See companion object")[**](../../../akka/persistence/query/TimestampOffset.html "Permalink")

### Companion [object TimestampOffset](TimestampOffset$.html "See companion object")

#### final  class TimestampOffset extends [Offset](Offset.html)

Timestamp based offset. Since there can be several events for the same timestamp it keeps
track of what sequence nrs for every persistence id that have been seen at this specific timestamp.

The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
as the `offset` parameter in a subsequent query.

API May Change

Source[Offset.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/Offset.scala#L99)Linear Supertypes[Offset](Offset.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TimestampOffset
2. Offset
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
### Value Members

1. [**](../../../akka/persistence/query/TimestampOffset.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/query/TimestampOffset.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/query/TimestampOffset.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TimestampOffset toany2stringadd\[TimestampOffset] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/query/TimestampOffset.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TimestampOffset, B)ImplicitThis member is added by an implicit conversion from TimestampOffset toArrowAssoc\[TimestampOffset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/query/TimestampOffset.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/query/TimestampOffset.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/query/TimestampOffset.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/query/TimestampOffset.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TimestampOffset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TimestampOffsetImplicitThis member is added by an implicit conversion from TimestampOffset toEnsuring\[TimestampOffset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/query/TimestampOffset.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TimestampOffset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TimestampOffsetImplicitThis member is added by an implicit conversion from TimestampOffset toEnsuring\[TimestampOffset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/query/TimestampOffset.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TimestampOffsetImplicitThis member is added by an implicit conversion from TimestampOffset toEnsuring\[TimestampOffset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/query/TimestampOffset.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TimestampOffsetImplicitThis member is added by an implicit conversion from TimestampOffset toEnsuring\[TimestampOffset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/query/TimestampOffset.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/query/TimestampOffset.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesTimestampOffset → AnyRef → Any
14. [**](../../../akka/persistence/query/TimestampOffset.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/query/TimestampOffset.html#getSeen():java.util.Map[String,Long] "Permalink")  def getSeen(): [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Long](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Long.html#java.lang.Long)]Java API
16. [**](../../../akka/persistence/query/TimestampOffset.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesTimestampOffset → AnyRef → Any
17. [**](../../../akka/persistence/query/TimestampOffset.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/persistence/query/TimestampOffset.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/persistence/query/TimestampOffset.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/query/TimestampOffset.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/query/TimestampOffset.html#readTimestamp:java.time.Instant "Permalink")  val readTimestamp: [Instant](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Instant.html#java.time.Instant)
22. [**](../../../akka/persistence/query/TimestampOffset.html#seen:Map[String,Long] "Permalink")  val seen: Map\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
23. [**](../../../akka/persistence/query/TimestampOffset.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/persistence/query/TimestampOffset.html#timestamp:java.time.Instant "Permalink")  val timestamp: [Instant](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Instant.html#java.time.Instant)
25. [**](../../../akka/persistence/query/TimestampOffset.html#toString():String "Permalink")  def toString(): StringDefinition ClassesTimestampOffset → AnyRef → Any
26. [**](../../../akka/persistence/query/TimestampOffset.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/persistence/query/TimestampOffset.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/persistence/query/TimestampOffset.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/query/TimestampOffset.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/query/TimestampOffset.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TimestampOffset toStringFormat\[TimestampOffset] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/query/TimestampOffset.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TimestampOffset, B)ImplicitThis member is added by an implicit conversion from TimestampOffset toArrowAssoc\[TimestampOffset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Offset](Offset.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTimestampOffset to any2stringadd\[TimestampOffset]

### Inherited by implicit conversion StringFormat fromTimestampOffset to StringFormat\[TimestampOffset]

### Inherited by implicit conversion Ensuring fromTimestampOffset to Ensuring\[TimestampOffset]

### Inherited by implicit conversion ArrowAssoc fromTimestampOffset to ArrowAssoc\[TimestampOffset]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DeletedDurableState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/EventEnvelope$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/QueryCorrelationId$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Sequence.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffset$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffsetBySlice$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/UpdatedDurableState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffset.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/TimestampOffset.html)*