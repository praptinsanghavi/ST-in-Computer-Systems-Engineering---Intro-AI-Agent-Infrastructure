---
description: Akka 2.10.17 - akka.stream.javadsl.MergeHub.DrainingControl
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/MergeHub$$DrainingControl.html
title: Akka 2.10.17 - akka.stream.javadsl.MergeHub.DrainingControl
---

# Akka 2.10.17 - akka.stream.javadsl.MergeHub.DrainingControl

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.MergeHub.DrainingControl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/javadsl/MergeHub$.html "Permalink")  object [MergeHub](MergeHub$.html "A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of producers.")A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of
producers.

A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of
producers. It consists of two parts, a [Source](Source.html) and a [Sink](Sink.html). The [Source](Source.html) streams the element to a consumer from
its merged inputs. Once the consumer has been materialized, the [Source](Source.html) returns a materialized value which is
the corresponding [Sink](Sink.html). This [Sink](Sink.html) can then be materialized arbitrary many times, where each of the new
materializations will feed its consumed elements to the original [Source](Source.html).

Definition Classes[javadsl](index.html)
- DrainingControl
t[akka](../../index.html).[stream](../index.html).[javadsl](index.html).[MergeHub](MergeHub$.html)

# DrainingControl[**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html "Permalink")

### 

#### sealed  trait DrainingControl extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A DrainingControl object is created during the materialization of a MergeHub and allows to initiate the draining
and eventual completion of the Hub from the outside.

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[Hub.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Hub.scala#L30)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DrainingControl
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

1. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#drainAndComplete():Unit "Permalink") abstract  def drainAndComplete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Set the operation mode of the linked MergeHub to draining.

Set the operation mode of the linked MergeHub to draining. In this mode the Hub will cancel any new producer and
will complete as soon as all the currently connected producers complete.
### Concrete Value Members

1. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DrainingControl toany2stringadd\[DrainingControl] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DrainingControl, B)ImplicitThis member is added by an implicit conversion from DrainingControl toArrowAssoc\[DrainingControl] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DrainingControl) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DrainingControlImplicitThis member is added by an implicit conversion from DrainingControl toEnsuring\[DrainingControl] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DrainingControl) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DrainingControlImplicitThis member is added by an implicit conversion from DrainingControl toEnsuring\[DrainingControl] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DrainingControlImplicitThis member is added by an implicit conversion from DrainingControl toEnsuring\[DrainingControl] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DrainingControlImplicitThis member is added by an implicit conversion from DrainingControl toEnsuring\[DrainingControl] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DrainingControl toStringFormat\[DrainingControl] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/MergeHub$$DrainingControl.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DrainingControl, B)ImplicitThis member is added by an implicit conversion from DrainingControl toArrowAssoc\[DrainingControl] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDrainingControl to any2stringadd\[DrainingControl]

### Inherited by implicit conversion StringFormat fromDrainingControl to StringFormat\[DrainingControl]

### Inherited by implicit conversion Ensuring fromDrainingControl to Ensuring\[DrainingControl]

### Inherited by implicit conversion ArrowAssoc fromDrainingControl to ArrowAssoc\[DrainingControl]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeHub$$DrainingControl.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeHub$$DrainingControl.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeHub$$DrainingControl.html)*