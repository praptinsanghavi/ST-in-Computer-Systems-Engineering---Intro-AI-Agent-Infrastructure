---
description: Akka 2.9.8 - akka.persistence.query.Offset
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:44:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/query/Offset.html
title: Akka 2.9.8 - akka.persistence.query.Offset
---

# Akka 2.9.8 - akka.persistence.query.Offset

> **Summary:** Akka 2.9.8 - akka.persistence.query.Offset

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
- [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.scaladsl.EventsByTagQuery query, or similar queries.")
- [NoOffset](NoOffset$.html "Used when retrieving all events.")
- Offset
- [PersistenceQuery](PersistenceQuery.html)
- [ReadJournalProvider](ReadJournalProvider.html "A query plugin must implement a class that implements this trait.")
- [Sequence](Sequence.html "Corresponds to an ordered sequence number for the events.")
- [TimeBasedUUID](TimeBasedUUID.html "Corresponds to an ordered unique identifier of the events.")
- [TimestampOffset](TimestampOffset.html "Timestamp based offset.")
- [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.")
- [UpdatedDurableState](UpdatedDurableState.html)
[c](Offset$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[query](index.html)

# [Offset](Offset$.html "See companion object")[**](../../../akka/persistence/query/Offset.html "Permalink")

### Companion [object Offset](Offset$.html "See companion object")

#### abstract  class Offset extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

Source[Offset.scala](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-query/src/main/scala/akka/persistence/query/Offset.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)Known Subclasses[NoOffset](NoOffset$.html), [Sequence](Sequence.html), [TimeBasedUUID](TimeBasedUUID.html), [TimestampOffset](TimestampOffset.html), [TimestampOffsetBySlice](TimestampOffsetBySlice.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Offset
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

1. [**](../../../akka/persistence/query/Offset.html#<init>():akka.persistence.query.Offset "Permalink")  new Offset()
### Value Members

1. [**](../../../akka/persistence/query/Offset.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/query/Offset.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/query/Offset.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Offset toany2stringadd\[Offset] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/query/Offset.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Offset, B)ImplicitThis member is added by an implicit conversion from Offset toArrowAssoc\[Offset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/query/Offset.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/query/Offset.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/query/Offset.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/query/Offset.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Offset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): OffsetImplicitThis member is added by an implicit conversion from Offset toEnsuring\[Offset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/query/Offset.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Offset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): OffsetImplicitThis member is added by an implicit conversion from Offset toEnsuring\[Offset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/query/Offset.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): OffsetImplicitThis member is added by an implicit conversion from Offset toEnsuring\[Offset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/query/Offset.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): OffsetImplicitThis member is added by an implicit conversion from Offset toEnsuring\[Offset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/query/Offset.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/query/Offset.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/query/Offset.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/query/Offset.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/query/Offset.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/query/Offset.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/query/Offset.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/query/Offset.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/query/Offset.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/query/Offset.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/query/Offset.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/query/Offset.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/query/Offset.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/query/Offset.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/query/Offset.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Offset toStringFormat\[Offset] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/query/Offset.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Offset, B)ImplicitThis member is added by an implicit conversion from Offset toArrowAssoc\[Offset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromOffset to any2stringadd\[Offset]

### Inherited by implicit conversion StringFormat fromOffset to StringFormat\[Offset]

### Inherited by implicit conversion Ensuring fromOffset to Ensuring\[Offset]

### Inherited by implicit conversion ArrowAssoc fromOffset to ArrowAssoc\[Offset]

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
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.9/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/Offset.html](https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/Offset.html)*