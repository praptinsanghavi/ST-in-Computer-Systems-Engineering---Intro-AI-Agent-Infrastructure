---
description: Akka 2.9.8 - akka.persistence.query.DurableStateChange
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:26Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/query/DurableStateChange.html
title: Akka 2.9.8 - akka.persistence.query.DurableStateChange
---

# Akka 2.9.8 - akka.persistence.query.DurableStateChange

> **Summary:** Akka 2.9.8 - akka.persistence.query.DurableStateChange

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
- DurableStateChange
- [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.scaladsl.EventsByTagQuery query, or similar queries.")
- [NoOffset](NoOffset$.html "Used when retrieving all events.")
- [Offset](Offset.html)
- [PersistenceQuery](PersistenceQuery.html)
- [ReadJournalProvider](ReadJournalProvider.html "A query plugin must implement a class that implements this trait.")
- [Sequence](Sequence.html "Corresponds to an ordered sequence number for the events.")
- [TimeBasedUUID](TimeBasedUUID.html "Corresponds to an ordered unique identifier of the events.")
- [TimestampOffset](TimestampOffset.html "Timestamp based offset.")
- [TimestampOffsetBySlice](TimestampOffsetBySlice.html "Timestamp-based offset by slice.")
- [UpdatedDurableState](UpdatedDurableState.html)
t[akka](../../index.html).[persistence](../index.html).[query](index.html)

# DurableStateChange[**](../../../akka/persistence/query/DurableStateChange.html "Permalink")

### 

#### sealed  trait DurableStateChange\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

The `DurableStateStoreQuery` stream elements for `DurableStateStoreQuery`.

The implementation can be a [UpdatedDurableState](UpdatedDurableState.html) or a [DeletedDurableState](DeletedDurableState.html).

Not for user extension

Athe type of the value

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[DurableStateChange.scala](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-query/src/main/scala/akka/persistence/query/DurableStateChange.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)Known Subclasses[DeletedDurableState](DeletedDurableState.html), [UpdatedDurableState](UpdatedDurableState.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateChange
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
### Abstract Value Members

1. [**](../../../akka/persistence/query/DurableStateChange.html#offset:akka.persistence.query.Offset "Permalink") abstract  def offset: [Offset](Offset.html)The offset that can be used in next `changes` or `currentChanges` query.
2. [**](../../../akka/persistence/query/DurableStateChange.html#persistenceId:String "Permalink") abstract  def persistenceId: StringThe persistence id of the origin entity.
### Concrete Value Members

1. [**](../../../akka/persistence/query/DurableStateChange.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/query/DurableStateChange.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/query/DurableStateChange.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateChange\[A] toany2stringadd\[DurableStateChange\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/query/DurableStateChange.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateChange\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateChange\[A] toArrowAssoc\[DurableStateChange\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/query/DurableStateChange.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/query/DurableStateChange.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/query/DurableStateChange.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/query/DurableStateChange.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateChange\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): DurableStateChange\[A]ImplicitThis member is added by an implicit conversion from DurableStateChange\[A] toEnsuring\[DurableStateChange\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/persistence/query/DurableStateChange.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateChange\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): DurableStateChange\[A]ImplicitThis member is added by an implicit conversion from DurableStateChange\[A] toEnsuring\[DurableStateChange\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/query/DurableStateChange.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)): DurableStateChange\[A]ImplicitThis member is added by an implicit conversion from DurableStateChange\[A] toEnsuring\[DurableStateChange\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/query/DurableStateChange.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)): DurableStateChange\[A]ImplicitThis member is added by an implicit conversion from DurableStateChange\[A] toEnsuring\[DurableStateChange\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/query/DurableStateChange.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/persistence/query/DurableStateChange.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/persistence/query/DurableStateChange.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/query/DurableStateChange.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/query/DurableStateChange.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/persistence/query/DurableStateChange.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.14/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/persistence/query/DurableStateChange.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/query/DurableStateChange.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/persistence/query/DurableStateChange.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/query/DurableStateChange.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/persistence/query/DurableStateChange.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.14/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/persistence/query/DurableStateChange.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.14/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/persistence/query/DurableStateChange.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/query/DurableStateChange.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.14/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/query/DurableStateChange.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateChange\[A] toStringFormat\[DurableStateChange\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/query/DurableStateChange.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateChange\[A], B)ImplicitThis member is added by an implicit conversion from DurableStateChange\[A] toArrowAssoc\[DurableStateChange\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.14/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.14/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableStateChange\[A] to any2stringadd\[DurableStateChange\[A]]

### Inherited by implicit conversion StringFormat fromDurableStateChange\[A] to StringFormat\[DurableStateChange\[A]]

### Inherited by implicit conversion Ensuring fromDurableStateChange\[A] to Ensuring\[DurableStateChange\[A]]

### Inherited by implicit conversion ArrowAssoc fromDurableStateChange\[A] to ArrowAssoc\[DurableStateChange\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/annotation/DoNotInherit.html
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
*Source: [https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/DurableStateChange.html](https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/DurableStateChange.html)*