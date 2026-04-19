---
description: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.Strategy
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:00:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$$CancellationStrategy$$Strategy.html
title: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.Strategy
---

# Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.Strategy

> **Summary:** Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.Strategy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/Attributes$.html "Permalink")  object [Attributes](Attributes$.html "Note that more attributes for the Materializer are defined in ActorAttributes.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Definition Classes[stream](index.html)
- [**](../../akka/stream/Attributes$$CancellationStrategy$.html "Permalink")  object [CancellationStrategy](Attributes$$CancellationStrategy$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[Attributes](Attributes$.html)
- [AfterDelay](Attributes$$CancellationStrategy$$AfterDelay.html "Strategy that allows to delay any action when cancelStage is invoked.")
- [CompleteStage](Attributes$$CancellationStrategy$$CompleteStage$.html "Strategy that treats cancelStage the same as completeStage, i.e.")
- [FailStage](Attributes$$CancellationStrategy$$FailStage$.html "Strategy that treats cancelStage the same as failStage, i.e.")
- [PropagateFailure](Attributes$$CancellationStrategy$$PropagateFailure$.html "Strategy that treats cancelStage in different ways depending on the cause that was given to the cancellation.")
- Strategy
t[akka](../index.html).[stream](index.html).[Attributes](Attributes$.html).[CancellationStrategy](Attributes$$CancellationStrategy$.html)

# Strategy[**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html "Permalink")

### 

#### sealed  trait Strategy extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)() Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L424)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AfterDelay](Attributes$$CancellationStrategy$$AfterDelay.html), [CompleteStage](Attributes$$CancellationStrategy$$CompleteStage$.html), [FailStage](Attributes$$CancellationStrategy$$FailStage$.html), [PropagateFailure](Attributes$$CancellationStrategy$$PropagateFailure$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Strategy
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
### Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Strategy toany2stringadd\[Strategy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Strategy, B)ImplicitThis member is added by an implicit conversion from Strategy toArrowAssoc\[Strategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Strategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrategyImplicitThis member is added by an implicit conversion from Strategy toEnsuring\[Strategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Strategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrategyImplicitThis member is added by an implicit conversion from Strategy toEnsuring\[Strategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrategyImplicitThis member is added by an implicit conversion from Strategy toEnsuring\[Strategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrategyImplicitThis member is added by an implicit conversion from Strategy toEnsuring\[Strategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Strategy toStringFormat\[Strategy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/Attributes$$CancellationStrategy$$Strategy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Strategy, B)ImplicitThis member is added by an implicit conversion from Strategy toArrowAssoc\[Strategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStrategy to any2stringadd\[Strategy]

### Inherited by implicit conversion StringFormat fromStrategy to StringFormat\[Strategy]

### Inherited by implicit conversion Ensuring fromStrategy to Ensuring\[Strategy]

### Inherited by implicit conversion ArrowAssoc fromStrategy to ArrowAssoc\[Strategy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$$CompleteStage$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$$FailStage$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$$PropagateFailure$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$$Strategy.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$$Strategy.html](https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$$CancellationStrategy$$Strategy.html)*