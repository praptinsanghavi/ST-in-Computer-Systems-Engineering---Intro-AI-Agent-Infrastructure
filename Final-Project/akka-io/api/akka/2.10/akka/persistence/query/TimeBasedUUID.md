---
description: Akka 2.10.17 - akka.persistence.query.TimeBasedUUID
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:12:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/TimeBasedUUID.html
title: Akka 2.10.17 - akka.persistence.query.TimeBasedUUID
---

# Akka 2.10.17 - akka.persistence.query.TimeBasedUUID

> **Summary:** Akka 2.10.17 - akka.persistence.query.TimeBasedUUID

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
- TimeBasedUUID
- [TimestampOffset](TimestampOffset.html "Timestamp based offset.")
- [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.")
- [UpdatedDurableState](UpdatedDurableState.html)
c[akka](../../index.html).[persistence](../index.html).[query](index.html)

# TimeBasedUUID[**](../../../akka/persistence/query/TimeBasedUUID.html "Permalink")

### 

#### final  case class TimeBasedUUID(value: [UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)) extends [Offset](Offset.html) with Ordered\[TimeBasedUUID] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Corresponds to an ordered unique identifier of the events. Note that the corresponding
offset of each event is provided in the [akka.persistence.query.EventEnvelope](EventEnvelope.html),
which makes it possible to resume the stream at a later point from a given offset.

The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
as the `offset` parameter in a subsequent query.

Source[Offset.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/scala/akka/persistence/query/Offset.scala#L46)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[TimeBasedUUID], [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[TimeBasedUUID], [Offset](Offset.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TimeBasedUUID
2. Serializable
3. Product
4. Equals
5. Ordered
6. Comparable
7. Offset
8. AnyRef
9. Any
Implicitly  
1. by orderingToOrdered
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/persistence/query/TimeBasedUUID.html#<init>(value:java.util.UUID):akka.persistence.query.TimeBasedUUID "Permalink")  new TimeBasedUUID(value: [UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID))
### Value Members

1. [**](../../../akka/persistence/query/TimeBasedUUID.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/query/TimeBasedUUID.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/query/TimeBasedUUID.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TimeBasedUUID toany2stringadd\[TimeBasedUUID] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/query/TimeBasedUUID.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TimeBasedUUID, B)ImplicitThis member is added by an implicit conversion from TimeBasedUUID toArrowAssoc\[TimeBasedUUID] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/query/TimeBasedUUID.html#<(that:A):Boolean "Permalink")  def \<(that: TimeBasedUUID): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
6. [**](../../../akka/persistence/query/TimeBasedUUID.html#<=(that:A):Boolean "Permalink")  def \<\=(that: TimeBasedUUID): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
7. [**](../../../akka/persistence/query/TimeBasedUUID.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/persistence/query/TimeBasedUUID.html#>(that:A):Boolean "Permalink")  def \>(that: TimeBasedUUID): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
9. [**](../../../akka/persistence/query/TimeBasedUUID.html#>=(that:A):Boolean "Permalink")  def \>\=(that: TimeBasedUUID): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesOrdered
10. [**](../../../akka/persistence/query/TimeBasedUUID.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../akka/persistence/query/TimeBasedUUID.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/persistence/query/TimeBasedUUID.html#compare(other:akka.persistence.query.TimeBasedUUID):Int "Permalink")  def compare(other: TimeBasedUUID): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesTimeBasedUUID → Ordered
13. [**](../../../akka/persistence/query/TimeBasedUUID.html#compareTo(that:A):Int "Permalink")  def compareTo(that: TimeBasedUUID): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesOrdered → Comparable
14. [**](../../../akka/persistence/query/TimeBasedUUID.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TimeBasedUUID) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TimeBasedUUIDImplicitThis member is added by an implicit conversion from TimeBasedUUID toEnsuring\[TimeBasedUUID] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/persistence/query/TimeBasedUUID.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TimeBasedUUID) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TimeBasedUUIDImplicitThis member is added by an implicit conversion from TimeBasedUUID toEnsuring\[TimeBasedUUID] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/persistence/query/TimeBasedUUID.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TimeBasedUUIDImplicitThis member is added by an implicit conversion from TimeBasedUUID toEnsuring\[TimeBasedUUID] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/persistence/query/TimeBasedUUID.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TimeBasedUUIDImplicitThis member is added by an implicit conversion from TimeBasedUUID toEnsuring\[TimeBasedUUID] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/persistence/query/TimeBasedUUID.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/persistence/query/TimeBasedUUID.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/query/TimeBasedUUID.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/persistence/query/TimeBasedUUID.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/persistence/query/TimeBasedUUID.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/persistence/query/TimeBasedUUID.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/persistence/query/TimeBasedUUID.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
25. [**](../../../akka/persistence/query/TimeBasedUUID.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../akka/persistence/query/TimeBasedUUID.html#value:java.util.UUID "Permalink")  val value: [UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)
27. [**](../../../akka/persistence/query/TimeBasedUUID.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/persistence/query/TimeBasedUUID.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/persistence/query/TimeBasedUUID.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../akka/persistence/query/TimeBasedUUID.html#<(that:A):Boolean "Permalink")  def \<(that: TimeBasedUUID): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from TimeBasedUUID to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[TimeBasedUUID] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(timeBasedUUID: Ordered[TimeBasedUUID]).<(that)
```
Definition ClassesOrdered
2. [**](../../../akka/persistence/query/TimeBasedUUID.html#<=(that:A):Boolean "Permalink")  def \<\=(that: TimeBasedUUID): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from TimeBasedUUID to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[TimeBasedUUID] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(timeBasedUUID: Ordered[TimeBasedUUID]).<=(that)
```
Definition ClassesOrdered
3. [**](../../../akka/persistence/query/TimeBasedUUID.html#>(that:A):Boolean "Permalink")  def \>(that: TimeBasedUUID): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from TimeBasedUUID to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[TimeBasedUUID] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(timeBasedUUID: Ordered[TimeBasedUUID]).>(that)
```
Definition ClassesOrdered
4. [**](../../../akka/persistence/query/TimeBasedUUID.html#>=(that:A):Boolean "Permalink")  def \>\=(that: TimeBasedUUID): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from TimeBasedUUID to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[TimeBasedUUID] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(timeBasedUUID: Ordered[TimeBasedUUID]).>=(that)
```
Definition ClassesOrdered
5. [**](../../../akka/persistence/query/TimeBasedUUID.html#compare(that:A):Int "Permalink")  def compare(that: TimeBasedUUID): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from TimeBasedUUID to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[TimeBasedUUID] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(timeBasedUUID: Ordered[TimeBasedUUID]).compare(that)
```
Definition ClassesOrdered
6. [**](../../../akka/persistence/query/TimeBasedUUID.html#compareTo(that:A):Int "Permalink")  def compareTo(that: TimeBasedUUID): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from TimeBasedUUID to[Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[TimeBasedUUID] performed by method orderingToOrdered in scala.math.Ordered.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(timeBasedUUID: Ordered[TimeBasedUUID]).compareTo(that)
```
Definition ClassesOrdered → Comparable
### Deprecated Value Members

1. [**](../../../akka/persistence/query/TimeBasedUUID.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/query/TimeBasedUUID.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TimeBasedUUID toStringFormat\[TimeBasedUUID] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/query/TimeBasedUUID.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TimeBasedUUID, B)ImplicitThis member is added by an implicit conversion from TimeBasedUUID toArrowAssoc\[TimeBasedUUID] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[TimeBasedUUID]

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[TimeBasedUUID]

### Inherited from [Offset](Offset.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion orderingToOrdered fromTimeBasedUUID to [Ordered](https://www.scala-lang.org/api/2.13.17/scala/math/Ordered.html#scala.math.Ordered)\[TimeBasedUUID]

### Inherited by implicit conversion any2stringadd fromTimeBasedUUID to any2stringadd\[TimeBasedUUID]

### Inherited by implicit conversion StringFormat fromTimeBasedUUID to StringFormat\[TimeBasedUUID]

### Inherited by implicit conversion Ensuring fromTimeBasedUUID to Ensuring\[TimeBasedUUID]

### Inherited by implicit conversion ArrowAssoc fromTimeBasedUUID to ArrowAssoc\[TimeBasedUUID]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/DeletedDurableState$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/EventEnvelope$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/Offset$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/QueryCorrelationId$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/Sequence.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/TimestampOffset$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/TimestampOffsetBySlice$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/UpdatedDurableState$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/persistence/query/TimeBasedUUID.html](https://doc.akka.io/api/akka/2.10/akka/persistence/query/TimeBasedUUID.html)*