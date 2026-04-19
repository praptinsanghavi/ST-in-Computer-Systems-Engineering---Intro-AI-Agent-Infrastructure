---
description: Akka 2.10.17 - akka.stream.StreamRefAttributes.FinalTerminationSignalDeadline
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:34:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html
title: Akka 2.10.17 - akka.stream.StreamRefAttributes.FinalTerminationSignalDeadline
---

# Akka 2.10.17 - akka.stream.StreamRefAttributes.FinalTerminationSignalDeadline

> **Summary:** Akka 2.10.17 - akka.stream.StreamRefAttributes.FinalTerminationSignalDeadline

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/StreamRefAttributes$.html "Permalink")  object [StreamRefAttributes](StreamRefAttributes$.html "Attributes for stream refs (akka.stream.SourceRef and akka.stream.SinkRef).")Attributes for stream refs ([akka.stream.SourceRef](SourceRef.html) and [akka.stream.SinkRef](SinkRef.html)).

Attributes for stream refs ([akka.stream.SourceRef](SourceRef.html) and [akka.stream.SinkRef](SinkRef.html)).
Note that more attributes defined in [Attributes](Attributes.html) and [ActorAttributes](ActorAttributes$.html).

Definition Classes[stream](index.html)
- [BufferCapacity](StreamRefAttributes$$BufferCapacity.html)
- [DemandRedeliveryInterval](StreamRefAttributes$$DemandRedeliveryInterval.html)
- FinalTerminationSignalDeadline
- [StreamRefAttribute](StreamRefAttributes$$StreamRefAttribute.html "Attributes specific to stream refs.")
- [SubscriptionTimeout](StreamRefAttributes$$SubscriptionTimeout.html)
c[akka](../index.html).[stream](index.html).[StreamRefAttributes](StreamRefAttributes$.html)

# FinalTerminationSignalDeadline[**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html "Permalink")

### 

#### final  case class FinalTerminationSignalDeadline(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [StreamRefAttribute](StreamRefAttributes$$StreamRefAttribute.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L971)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [StreamRefAttribute](StreamRefAttributes$$StreamRefAttribute.html), [Attribute](Attributes$$Attribute.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FinalTerminationSignalDeadline
2. Serializable
3. Product
4. Equals
5. StreamRefAttribute
6. Attribute
7. AnyRef
8. Any
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

1. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#<init>(timeout:scala.concurrent.duration.FiniteDuration):akka.stream.StreamRefAttributes.FinalTerminationSignalDeadline "Permalink")  new FinalTerminationSignalDeadline(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))
### Value Members

1. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FinalTerminationSignalDeadline toany2stringadd\[FinalTerminationSignalDeadline] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FinalTerminationSignalDeadline, B)ImplicitThis member is added by an implicit conversion from FinalTerminationSignalDeadline toArrowAssoc\[FinalTerminationSignalDeadline] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FinalTerminationSignalDeadline) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FinalTerminationSignalDeadlineImplicitThis member is added by an implicit conversion from FinalTerminationSignalDeadline toEnsuring\[FinalTerminationSignalDeadline] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FinalTerminationSignalDeadline) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FinalTerminationSignalDeadlineImplicitThis member is added by an implicit conversion from FinalTerminationSignalDeadline toEnsuring\[FinalTerminationSignalDeadline] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FinalTerminationSignalDeadlineImplicitThis member is added by an implicit conversion from FinalTerminationSignalDeadline toEnsuring\[FinalTerminationSignalDeadline] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FinalTerminationSignalDeadlineImplicitThis member is added by an implicit conversion from FinalTerminationSignalDeadline toEnsuring\[FinalTerminationSignalDeadline] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#timeout:scala.concurrent.duration.FiniteDuration "Permalink")  val timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
21. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FinalTerminationSignalDeadline toStringFormat\[FinalTerminationSignalDeadline] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FinalTerminationSignalDeadline, B)ImplicitThis member is added by an implicit conversion from FinalTerminationSignalDeadline toArrowAssoc\[FinalTerminationSignalDeadline] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [StreamRefAttribute](StreamRefAttributes$$StreamRefAttribute.html)

### Inherited from [Attribute](Attributes$$Attribute.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFinalTerminationSignalDeadline to any2stringadd\[FinalTerminationSignalDeadline]

### Inherited by implicit conversion StringFormat fromFinalTerminationSignalDeadline to StringFormat\[FinalTerminationSignalDeadline]

### Inherited by implicit conversion Ensuring fromFinalTerminationSignalDeadline to Ensuring\[FinalTerminationSignalDeadline]

### Inherited by implicit conversion ArrowAssoc fromFinalTerminationSignalDeadline to ArrowAssoc\[FinalTerminationSignalDeadline]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$Attribute.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/SinkRef.html
- https://doc.akka.io/api/akka/current/akka/stream/SourceRef.html
- https://doc.akka.io/api/akka/current/akka/stream/StreamRefAttributes$$BufferCapacity.html
- https://doc.akka.io/api/akka/current/akka/stream/StreamRefAttributes$$DemandRedeliveryInterval.html
- https://doc.akka.io/api/akka/current/akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html
- https://doc.akka.io/api/akka/current/akka/stream/StreamRefAttributes$$StreamRefAttribute.html
- https://doc.akka.io/api/akka/current/akka/stream/StreamRefAttributes$$SubscriptionTimeout.html
- https://doc.akka.io/api/akka/current/akka/stream/StreamRefAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html](https://doc.akka.io/api/akka/current/akka/stream/StreamRefAttributes$$FinalTerminationSignalDeadline.html)*