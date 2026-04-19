---
description: Akka 2.9.8 - akka.persistence.query.EventEnvelope
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:44:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/query/EventEnvelope.html
title: Akka 2.9.8 - akka.persistence.query.EventEnvelope
---

# Akka 2.9.8 - akka.persistence.query.EventEnvelope

> **Summary:** Akka 2.9.8 - akka.persistence.query.EventEnvelope

## Content

Akka2\.9\.8 \< Back****# Packages

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
- EventEnvelope
- [NoOffset](NoOffset$.html "Used when retrieving all events.")
- [Offset](Offset.html)
- [PersistenceQuery](PersistenceQuery.html)
- [ReadJournalProvider](ReadJournalProvider.html "A query plugin must implement a class that implements this trait.")
- [Sequence](Sequence.html "Corresponds to an ordered sequence number for the events.")
- [TimeBasedUUID](TimeBasedUUID.html "Corresponds to an ordered unique identifier of the events.")
- [TimestampOffset](TimestampOffset.html "Timestamp based offset.")
- [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.")
- [UpdatedDurableState](UpdatedDurableState.html)
[c](EventEnvelope$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[query](index.html)

# [EventEnvelope](EventEnvelope$.html "See companion object")[**](../../../akka/persistence/query/EventEnvelope.html "Permalink")

### Companion [object EventEnvelope](EventEnvelope$.html "See companion object")

#### final  class EventEnvelope extends [Product4](https://www.scala-lang.org/api/2.13.14/scala/Product4.html#scala.Product4)\[[Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)] with Serializable

Event wrapper adding meta data for the events in the result stream of
[akka.persistence.query.scaladsl.EventsByTagQuery](scaladsl/EventsByTagQuery.html) query, or similar queries.

The `timestamp` is the time the event was stored, in milliseconds since midnight, January 1, 1970 UTC
(same as `System.currentTimeMillis`).

Source[EventEnvelope.scala](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-query/src/main/scala/akka/persistence/query/EventEnvelope.scala#L44)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product4](https://www.scala-lang.org/api/2.13.14/scala/Product4.html#scala.Product4)\[[Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)], [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.14/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventEnvelope
2. Serializable
3. Product4
4. Product
5. Equals
6. AnyRef
7. Any
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

1. [**](../../../akka/persistence/query/EventEnvelope.html#<init>(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Any,timestamp:Long):akka.persistence.query.EventEnvelope "Permalink")  new EventEnvelope(offset: [Offset](Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), event: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any), timestamp: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long))
2. [**](../../../akka/persistence/query/EventEnvelope.html#<init>(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Any,timestamp:Long,eventMetadata:Option[Any]):akka.persistence.query.EventEnvelope "Permalink")  new EventEnvelope(offset: [Offset](Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), event: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any), timestamp: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), eventMetadata: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)])
3. [**](../../../akka/persistence/query/EventEnvelope.html#<init>(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Any):akka.persistence.query.EventEnvelope "Permalink")  new EventEnvelope(offset: [Offset](Offset.html), persistenceId: String, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), event: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any))Annotations@deprecated Deprecated*(Since version 2\.6\.2\)* for binary compatibility
### Value Members

1. [**](../../../akka/persistence/query/EventEnvelope.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/query/EventEnvelope.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/query/EventEnvelope.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventEnvelope toany2stringadd\[EventEnvelope] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/query/EventEnvelope.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventEnvelope, B)ImplicitThis member is added by an implicit conversion from EventEnvelope toArrowAssoc\[EventEnvelope] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/query/EventEnvelope.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/query/EventEnvelope.html#_1:akka.persistence.query.Offset "Permalink")  def \_1: [Offset](Offset.html)Definition ClassesEventEnvelope → Product4
7. [**](../../../akka/persistence/query/EventEnvelope.html#_2:String "Permalink")  def \_2: StringDefinition ClassesEventEnvelope → Product4
8. [**](../../../akka/persistence/query/EventEnvelope.html#_3:Long "Permalink")  def \_3: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)Definition ClassesEventEnvelope → Product4
9. [**](../../../akka/persistence/query/EventEnvelope.html#_4:Any "Permalink")  def \_4: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)Definition ClassesEventEnvelope → Product4
10. [**](../../../akka/persistence/query/EventEnvelope.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../akka/persistence/query/EventEnvelope.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesEventEnvelope → Equals
12. [**](../../../akka/persistence/query/EventEnvelope.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/persistence/query/EventEnvelope.html#copy(offset:akka.persistence.query.Offset,persistenceId:String,sequenceNr:Long,event:Any):akka.persistence.query.EventEnvelope "Permalink")  def copy(offset: [Offset](Offset.html) \= [this.offset](#offset:akka.persistence.query.Offset), persistenceId: String \= [this.persistenceId](#persistenceId:String), sequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long) \= [this.sequenceNr](#sequenceNr:Long), event: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any) \= [this.event](#event:Any)): EventEnvelope
14. [**](../../../akka/persistence/query/EventEnvelope.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventEnvelope) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): EventEnvelopeImplicitThis member is added by an implicit conversion from EventEnvelope toEnsuring\[EventEnvelope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/persistence/query/EventEnvelope.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventEnvelope) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): EventEnvelopeImplicitThis member is added by an implicit conversion from EventEnvelope toEnsuring\[EventEnvelope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/persistence/query/EventEnvelope.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): EventEnvelopeImplicitThis member is added by an implicit conversion from EventEnvelope toEnsuring\[EventEnvelope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/persistence/query/EventEnvelope.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): EventEnvelopeImplicitThis member is added by an implicit conversion from EventEnvelope toEnsuring\[EventEnvelope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/persistence/query/EventEnvelope.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/persistence/query/EventEnvelope.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesEventEnvelope → Equals → AnyRef → Any
20. [**](../../../akka/persistence/query/EventEnvelope.html#event:Any "Permalink")  val event: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)
21. [**](../../../akka/persistence/query/EventEnvelope.html#eventMetadata:Option[Any] "Permalink")  val eventMetadata: [Option](https://www.scala-lang.org/api/2.13.14/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)]
22. [**](../../../akka/persistence/query/EventEnvelope.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/persistence/query/EventEnvelope.html#getEventMetaData():java.util.Optional[Any] "Permalink")  def getEventMetaData(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)]Java API
24. [**](../../../akka/persistence/query/EventEnvelope.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesEventEnvelope → AnyRef → Any
25. [**](../../../akka/persistence/query/EventEnvelope.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../akka/persistence/query/EventEnvelope.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/persistence/query/EventEnvelope.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/persistence/query/EventEnvelope.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/persistence/query/EventEnvelope.html#offset:akka.persistence.query.Offset "Permalink")  val offset: [Offset](Offset.html)
30. [**](../../../akka/persistence/query/EventEnvelope.html#persistenceId:String "Permalink")  val persistenceId: String
31. [**](../../../akka/persistence/query/EventEnvelope.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesProduct4 → Product
32. [**](../../../akka/persistence/query/EventEnvelope.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)Definition ClassesProduct4 → ProductAnnotations@throws(classOf\[java.lang.IndexOutOfBoundsException])
33. [**](../../../akka/persistence/query/EventEnvelope.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
34. [**](../../../akka/persistence/query/EventEnvelope.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
35. [**](../../../akka/persistence/query/EventEnvelope.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)]Definition ClassesProduct
36. [**](../../../akka/persistence/query/EventEnvelope.html#productPrefix:String "Permalink")  def productPrefix: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesEventEnvelope → Product
37. [**](../../../akka/persistence/query/EventEnvelope.html#sequenceNr:Long "Permalink")  val sequenceNr: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)
38. [**](../../../akka/persistence/query/EventEnvelope.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
39. [**](../../../akka/persistence/query/EventEnvelope.html#timestamp:Long "Permalink")  val timestamp: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)
40. [**](../../../akka/persistence/query/EventEnvelope.html#toString():String "Permalink")  def toString(): StringDefinition ClassesEventEnvelope → AnyRef → Any
41. [**](../../../akka/persistence/query/EventEnvelope.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../akka/persistence/query/EventEnvelope.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
43. [**](../../../akka/persistence/query/EventEnvelope.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/query/EventEnvelope.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/query/EventEnvelope.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventEnvelope toStringFormat\[EventEnvelope] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/query/EventEnvelope.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventEnvelope, B)ImplicitThis member is added by an implicit conversion from EventEnvelope toArrowAssoc\[EventEnvelope] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product4](https://www.scala-lang.org/api/2.13.14/scala/Product4.html#scala.Product4)\[[Offset](Offset.html), String, [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)]

### Inherited from [Product](https://www.scala-lang.org/api/2.13.14/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.14/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventEnvelope to any2stringadd\[EventEnvelope]

### Inherited by implicit conversion StringFormat fromEventEnvelope to StringFormat\[EventEnvelope]

### Inherited by implicit conversion Ensuring fromEventEnvelope to Ensuring\[EventEnvelope]

### Inherited by implicit conversion ArrowAssoc fromEventEnvelope to ArrowAssoc\[EventEnvelope]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/DeletedDurableState$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/EventEnvelope$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/Offset$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/Sequence.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/TimestampOffset$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/TimestampOffsetBySlice$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/UpdatedDurableState$.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.9/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/EventEnvelope.html](https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/EventEnvelope.html)*