---
description: Akka 2.10.17 - akka.stream.testkit.TestSubscriber.OnNext
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:01:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/TestSubscriber$$OnNext.html
title: Akka 2.10.17 - akka.stream.testkit.TestSubscriber.OnNext
---

# Akka 2.10.17 - akka.stream.testkit.TestSubscriber.OnNext

> **Summary:** Akka 2.10.17 - akka.stream.testkit.TestSubscriber.OnNext

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/testkit/TestSubscriber$.html "Permalink")  object [TestSubscriber](TestSubscriber$.html)Definition Classes[testkit](index.html)
- [ManualProbe](TestSubscriber$$ManualProbe.html "Implementation of org.reactivestreams.Subscriber that allows various assertions.")
- [OnComplete](TestSubscriber$$OnComplete$.html)
- [OnError](TestSubscriber$$OnError.html)
- OnNext
- [OnSubscribe](TestSubscriber$$OnSubscribe.html)
- [Probe](TestSubscriber$$Probe.html "Single subscription tracking for ManualProbe.")
- [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)
c[akka](../../index.html).[stream](../index.html).[testkit](index.html).[TestSubscriber](TestSubscriber$.html)

# OnNext[**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html "Permalink")

### 

#### final  case class OnNext\[I](element: I) extends [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[StreamTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/StreamTestKit.scala#L282)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SubscriberEvent](TestSubscriber$$SubscriberEvent.html), [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [DeadLetterSuppression](../../actor/DeadLetterSuppression.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. OnNext
2. Serializable
3. Product
4. Equals
5. SubscriberEvent
6. NoSerializationVerificationNeeded
7. DeadLetterSuppression
8. AnyRef
9. Any
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

1. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#<init>(element:I):akka.stream.testkit.TestSubscriber.OnNext[I] "Permalink")  new OnNext(element: I)
### Value Members

1. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from OnNext\[I] toany2stringadd\[OnNext\[I]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (OnNext\[I], B)ImplicitThis member is added by an implicit conversion from OnNext\[I] toArrowAssoc\[OnNext\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#element:I "Permalink")  val element: I
9. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (OnNext\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OnNext\[I]ImplicitThis member is added by an implicit conversion from OnNext\[I] toEnsuring\[OnNext\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (OnNext\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OnNext\[I]ImplicitThis member is added by an implicit conversion from OnNext\[I] toEnsuring\[OnNext\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OnNext\[I]ImplicitThis member is added by an implicit conversion from OnNext\[I] toEnsuring\[OnNext\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OnNext\[I]ImplicitThis member is added by an implicit conversion from OnNext\[I] toEnsuring\[OnNext\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from OnNext\[I] toStringFormat\[OnNext\[I]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/testkit/TestSubscriber$$OnNext.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (OnNext\[I], B)ImplicitThis member is added by an implicit conversion from OnNext\[I] toArrowAssoc\[OnNext\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)

### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [DeadLetterSuppression](../../actor/DeadLetterSuppression.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromOnNext\[I] to any2stringadd\[OnNext\[I]]

### Inherited by implicit conversion StringFormat fromOnNext\[I] to StringFormat\[OnNext\[I]]

### Inherited by implicit conversion Ensuring fromOnNext\[I] to Ensuring\[OnNext\[I]]

### Inherited by implicit conversion ArrowAssoc fromOnNext\[I] to ArrowAssoc\[OnNext\[I]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$ManualProbe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$ManualProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$OnComplete$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$OnError.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$OnNext.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$OnSubscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$Probe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$Probe.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$SubscriberEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$OnNext.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$$OnNext.html)*