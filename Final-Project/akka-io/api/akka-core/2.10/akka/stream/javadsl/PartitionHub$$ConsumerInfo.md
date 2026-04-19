---
description: Akka 2.10.17 - akka.stream.javadsl.PartitionHub.ConsumerInfo
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:53:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/PartitionHub$$ConsumerInfo.html
title: Akka 2.10.17 - akka.stream.javadsl.PartitionHub.ConsumerInfo
---

# Akka 2.10.17 - akka.stream.javadsl.PartitionHub.ConsumerInfo

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.PartitionHub.ConsumerInfo

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/javadsl/PartitionHub$.html "Permalink")  object [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.

A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.
It consists of two parts, a [Sink](Sink.html) and a [Source](Source.html). The [Sink](Sink.html) e elements from a producer to the
actually live consumers it has. The selection of consumer is done with a function. Each element can be routed to
only one consumer. Once the producer has been materialized, the [Sink](Sink.html) it feeds into returns a
materialized value which is the corresponding [Source](Source.html). This [Source](Source.html) can be materialized an arbitrary number
of times, where each of the new materializations will receive their elements from the original [Sink](Sink.html).

Definition Classes[javadsl](index.html)
- ConsumerInfo
t[akka](../../index.html).[stream](../index.html).[javadsl](index.html).[PartitionHub](PartitionHub$.html)

# ConsumerInfo[**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html "Permalink")

### 

#### trait ConsumerInfo extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[Hub.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Hub.scala#L376)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ConsumerInfo](../scaladsl/PartitionHub$$ConsumerInfo.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsumerInfo
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

1. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#consumerIdByIdx(idx:Int):Long "Permalink") abstract  def consumerIdByIdx(idx: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Obtain consumer identifier by index
2. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#getConsumerIds:java.util.List[Long] "Permalink") abstract  def getConsumerIds: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Sequence of all identifiers of current consumers.

Sequence of all identifiers of current consumers.

Use this method only if you need to enumerate consumer existing ids.
When selecting a specific consumerId by its index, prefer using the dedicated [\#consumerIdByIdx](#consumerIdByIdx(idx:Int):Long) method instead,
which is optimised for this use case.
3. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#queueSize(consumerId:Long):Int "Permalink") abstract  def queueSize(consumerId: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Approximate number of buffered elements for a consumer.

Approximate number of buffered elements for a consumer.
Larger value than other consumers could be an indication of
that the consumer is slow.

Note that this is a moving target since the elements are
consumed concurrently.
4. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#size:Int "Permalink") abstract  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Number of attached consumers.
### Concrete Value Members

1. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConsumerInfo toany2stringadd\[ConsumerInfo] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConsumerInfo, B)ImplicitThis member is added by an implicit conversion from ConsumerInfo toArrowAssoc\[ConsumerInfo] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConsumerInfo) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsumerInfoImplicitThis member is added by an implicit conversion from ConsumerInfo toEnsuring\[ConsumerInfo] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConsumerInfo) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsumerInfoImplicitThis member is added by an implicit conversion from ConsumerInfo toEnsuring\[ConsumerInfo] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsumerInfoImplicitThis member is added by an implicit conversion from ConsumerInfo toEnsuring\[ConsumerInfo] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsumerInfoImplicitThis member is added by an implicit conversion from ConsumerInfo toEnsuring\[ConsumerInfo] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConsumerInfo toStringFormat\[ConsumerInfo] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/PartitionHub$$ConsumerInfo.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConsumerInfo, B)ImplicitThis member is added by an implicit conversion from ConsumerInfo toArrowAssoc\[ConsumerInfo] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConsumerInfo to any2stringadd\[ConsumerInfo]

### Inherited by implicit conversion StringFormat fromConsumerInfo to StringFormat\[ConsumerInfo]

### Inherited by implicit conversion Ensuring fromConsumerInfo to Ensuring\[ConsumerInfo]

### Inherited by implicit conversion ArrowAssoc fromConsumerInfo to ArrowAssoc\[ConsumerInfo]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/PartitionHub$$ConsumerInfo.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/PartitionHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/PartitionHub$$ConsumerInfo.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/PartitionHub$$ConsumerInfo.html)*