---
description: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.AfterDelay
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html
title: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.AfterDelay
---

# Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.AfterDelay

> **Summary:** Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.AfterDelay

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/Attributes$.html "Permalink")  object [Attributes](Attributes$.html "Note that more attributes for the Materializer are defined in ActorAttributes.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Definition Classes[stream](index.html)
- [**](../../akka/stream/Attributes$$CancellationStrategy$.html "Permalink")  object [CancellationStrategy](Attributes$$CancellationStrategy$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[Attributes](Attributes$.html)
- AfterDelay
- [CompleteStage](Attributes$$CancellationStrategy$$CompleteStage$.html "Strategy that treats cancelStage the same as completeStage, i.e.")
- [FailStage](Attributes$$CancellationStrategy$$FailStage$.html "Strategy that treats cancelStage the same as failStage, i.e.")
- [PropagateFailure](Attributes$$CancellationStrategy$$PropagateFailure$.html "Strategy that treats cancelStage in different ways depending on the cause that was given to the cancellation.")
- [Strategy](Attributes$$CancellationStrategy$$Strategy.html "Not for user extension")
c[akka](../index.html).[stream](index.html).[Attributes](Attributes$.html).[CancellationStrategy](Attributes$$CancellationStrategy$.html)

# AfterDelay[**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html "Permalink")

### 

#### final  case class AfterDelay(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), strategy: [Strategy](Attributes$$CancellationStrategy$$Strategy.html)) extends [Strategy](Attributes$$CancellationStrategy$$Strategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Strategy that allows to delay any action when `cancelStage` is invoked.

The idea of this strategy is to delay any action on cancellation because it is expected that the stage is completed
through another path in the meantime. The downside is that a stage and a stream may live longer than expected if no
such signal is received and cancellation is invoked later on. In streams with many stages that all apply this strategy,
this strategy might significantly delay the propagation of a cancellation signal because each upstream stage might impose
such a delay. During this time, the stream will be mostly "silent", i.e. it cannot make progress because of backpressure,
but you might still be able observe a long delay at the ultimate source.

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L512)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Strategy](Attributes$$CancellationStrategy$$Strategy.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AfterDelay
2. Serializable
3. Product
4. Equals
5. Strategy
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

1. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#<init>(delay:scala.concurrent.duration.FiniteDuration,strategy:akka.stream.Attributes.CancellationStrategy.Strategy):akka.stream.Attributes.CancellationStrategy.AfterDelay "Permalink")  new AfterDelay(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), strategy: [Strategy](Attributes$$CancellationStrategy$$Strategy.html))
### Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AfterDelay toany2stringadd\[AfterDelay] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AfterDelay, B)ImplicitThis member is added by an implicit conversion from AfterDelay toArrowAssoc\[AfterDelay] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#delay:scala.concurrent.duration.FiniteDuration "Permalink")  val delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
9. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AfterDelay) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AfterDelayImplicitThis member is added by an implicit conversion from AfterDelay toEnsuring\[AfterDelay] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AfterDelay) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AfterDelayImplicitThis member is added by an implicit conversion from AfterDelay toEnsuring\[AfterDelay] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AfterDelayImplicitThis member is added by an implicit conversion from AfterDelay toEnsuring\[AfterDelay] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AfterDelayImplicitThis member is added by an implicit conversion from AfterDelay toEnsuring\[AfterDelay] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#strategy:akka.stream.Attributes.CancellationStrategy.Strategy "Permalink")  val strategy: [Strategy](Attributes$$CancellationStrategy$$Strategy.html)
21. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AfterDelay toStringFormat\[AfterDelay] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AfterDelay, B)ImplicitThis member is added by an implicit conversion from AfterDelay toArrowAssoc\[AfterDelay] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Strategy](Attributes$$CancellationStrategy$$Strategy.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAfterDelay to any2stringadd\[AfterDelay]

### Inherited by implicit conversion StringFormat fromAfterDelay to StringFormat\[AfterDelay]

### Inherited by implicit conversion Ensuring fromAfterDelay to Ensuring\[AfterDelay]

### Inherited by implicit conversion ArrowAssoc fromAfterDelay to ArrowAssoc\[AfterDelay]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$CompleteStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$FailStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$PropagateFailure$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$Strategy.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html](https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html)*