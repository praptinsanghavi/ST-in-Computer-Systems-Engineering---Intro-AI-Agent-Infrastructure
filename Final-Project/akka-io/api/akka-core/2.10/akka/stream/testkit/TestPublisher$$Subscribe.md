---
description: Akka 2.10.17 - akka.stream.testkit.TestPublisher.Subscribe
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:01:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/TestPublisher$$Subscribe.html
title: Akka 2.10.17 - akka.stream.testkit.TestPublisher.Subscribe
---

# Akka 2.10.17 - akka.stream.testkit.TestPublisher.Subscribe

> **Summary:** Akka 2.10.17 - akka.stream.testkit.TestPublisher.Subscribe

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/testkit/TestPublisher$.html "Permalink")  object [TestPublisher](TestPublisher$.html "Provides factory methods for various Publishers.")Provides factory methods for various Publishers.

Provides factory methods for various Publishers.

Definition Classes[testkit](index.html)
- [CancelSubscription](TestPublisher$$CancelSubscription.html)
- [ManualProbe](TestPublisher$$ManualProbe.html "Implementation of org.reactivestreams.Publisher that allows various assertions.")
- [Probe](TestPublisher$$Probe.html "Single subscription and demand tracking for TestPublisher.ManualProbe.")
- [PublisherEvent](TestPublisher$$PublisherEvent.html)
- [RequestMore](TestPublisher$$RequestMore.html)
- Subscribe
- [SubscriptionDone](TestPublisher$$SubscriptionDone$.html)
c[akka](../../index.html).[stream](../index.html).[testkit](index.html).[TestPublisher](TestPublisher$.html)

# Subscribe[**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html "Permalink")

### 

#### final  case class Subscribe(subscription: Subscription) extends [PublisherEvent](TestPublisher$$PublisherEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[StreamTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/StreamTestKit.scala#L34)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [PublisherEvent](TestPublisher$$PublisherEvent.html), [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [DeadLetterSuppression](../../actor/DeadLetterSuppression.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Subscribe
2. Serializable
3. Product
4. Equals
5. PublisherEvent
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

1. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#<init>(subscription:org.reactivestreams.Subscription):akka.stream.testkit.TestPublisher.Subscribe "Permalink")  new Subscribe(subscription: Subscription)
### Value Members

1. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Subscribe toany2stringadd\[Subscribe] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Subscribe, B)ImplicitThis member is added by an implicit conversion from Subscribe toArrowAssoc\[Subscribe] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Subscribe) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubscribeImplicitThis member is added by an implicit conversion from Subscribe toEnsuring\[Subscribe] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Subscribe) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubscribeImplicitThis member is added by an implicit conversion from Subscribe toEnsuring\[Subscribe] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubscribeImplicitThis member is added by an implicit conversion from Subscribe toEnsuring\[Subscribe] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubscribeImplicitThis member is added by an implicit conversion from Subscribe toEnsuring\[Subscribe] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#subscription:org.reactivestreams.Subscription "Permalink")  val subscription: Subscription
20. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Subscribe toStringFormat\[Subscribe] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/testkit/TestPublisher$$Subscribe.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Subscribe, B)ImplicitThis member is added by an implicit conversion from Subscribe toArrowAssoc\[Subscribe] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [PublisherEvent](TestPublisher$$PublisherEvent.html)

### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [DeadLetterSuppression](../../actor/DeadLetterSuppression.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSubscribe to any2stringadd\[Subscribe]

### Inherited by implicit conversion StringFormat fromSubscribe to StringFormat\[Subscribe]

### Inherited by implicit conversion Ensuring fromSubscribe to Ensuring\[Subscribe]

### Inherited by implicit conversion ArrowAssoc fromSubscribe to ArrowAssoc\[Subscribe]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$CancelSubscription.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$ManualProbe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$ManualProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$Probe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$Probe.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$PublisherEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$RequestMore.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$SubscriptionDone$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$Subscribe.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$$Subscribe.html)*