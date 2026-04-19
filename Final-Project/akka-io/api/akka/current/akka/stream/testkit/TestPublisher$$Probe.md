---
description: Akka 2.10.17 - akka.stream.testkit.TestPublisher.Probe
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/TestPublisher$$Probe.html
title: Akka 2.10.17 - akka.stream.testkit.TestPublisher.Probe
---

# Akka 2.10.17 - akka.stream.testkit.TestPublisher.Probe

> **Summary:** Akka 2.10.17 - akka.stream.testkit.TestPublisher.Probe

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
- Probe
- [PublisherEvent](TestPublisher$$PublisherEvent.html)
- [RequestMore](TestPublisher$$RequestMore.html)
- [Subscribe](TestPublisher$$Subscribe.html)
- [SubscriptionDone](TestPublisher$$SubscriptionDone$.html)
[c](TestPublisher$$Probe$.html "See companion object")[akka](../../index.html).[stream](../index.html).[testkit](index.html).[TestPublisher](TestPublisher$.html)

# [Probe](TestPublisher$$Probe$.html "See companion object")[**](../../../akka/stream/testkit/TestPublisher$$Probe.html "Permalink")

### Companion [object Probe](TestPublisher$$Probe$.html "See companion object")

#### class Probe\[T] extends [ManualProbe](TestPublisher$$ManualProbe.html)\[T]

Single subscription and demand tracking for [TestPublisher.ManualProbe](TestPublisher$$ManualProbe.html).

Source[StreamTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/StreamTestKit.scala#L208)Linear Supertypes[ManualProbe](TestPublisher$$ManualProbe.html)\[T], Publisher\[T], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Probe
2. ManualProbe
3. Publisher
4. AnyRef
5. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#Self=akka.stream.testkit.TestPublisher.Probe[T] "Permalink")  type Self \= Probe\[T]Definition ClassesProbe → [ManualProbe](TestPublisher$$ManualProbe.html)
### Value Members

1. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Probe\[T] toany2stringadd\[Probe\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Probe\[T], B)ImplicitThis member is added by an implicit conversion from Probe\[T] toArrowAssoc\[Probe\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#ensureSubscription():Unit "Permalink")  def ensureSubscription(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Asserts that a subscription has been received or will be received
9. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Probe\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Probe\[T]ImplicitThis member is added by an implicit conversion from Probe\[T] toEnsuring\[Probe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Probe\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Probe\[T]ImplicitThis member is added by an implicit conversion from Probe\[T] toEnsuring\[Probe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Probe\[T]ImplicitThis member is added by an implicit conversion from Probe\[T] toEnsuring\[Probe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Probe\[T]ImplicitThis member is added by an implicit conversion from Probe\[T] toEnsuring\[Probe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#executeAfterSubscription[T](f:=>T):T "Permalink")  def executeAfterSubscription\[T](f: \=\> T): TDefinition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
16. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectCancellation():Probe.this.Self "Permalink")  def expectCancellation(): [Self](#Self=akka.stream.testkit.TestPublisher.Probe[T])
17. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectCancellationWithCause[E<:Throwable](causeClass:Class[E]):E "Permalink")  def expectCancellationWithCause\[E \<: Throwable](causeClass: Class\[E]): EJava API
18. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectCancellationWithCause[E<:Throwable]()(implicitevidence$1:scala.reflect.ClassTag[E]):E "Permalink")  def expectCancellationWithCause\[E \<: Throwable]()(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[E]): E
19. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectCancellationWithCause(expectedCause:Throwable):Probe.this.Self "Permalink")  def expectCancellationWithCause(expectedCause: Throwable): [Self](#Self=akka.stream.testkit.TestPublisher.Probe[T])
20. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectEventPF[T](f:PartialFunction[akka.stream.testkit.TestPublisher.PublisherEvent,T]):T "Permalink")  def expectEventPF\[T](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[PublisherEvent](TestPublisher$$PublisherEvent.html), T]): TDefinition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
21. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectNoMessage(max:scala.concurrent.duration.FiniteDuration):ManualProbe.this.Self "Permalink")  def expectNoMessage(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Self](#Self=akka.stream.testkit.TestPublisher.Probe[T])Expect no messages for a given duration.

Expect no messages for a given duration.

Definition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
22. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectNoMessage():ManualProbe.this.Self "Permalink")  def expectNoMessage(): [Self](#Self=akka.stream.testkit.TestPublisher.Probe[T])Expect no messages.

Expect no messages.
Waits for the default period configured as `akka.actor.testkit.expect-no-message-default`.

Definition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
23. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectRequest():Long "Permalink")  def expectRequest(): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
24. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectRequest(subscription:org.reactivestreams.Subscription,n:Int):ManualProbe.this.Self "Permalink")  def expectRequest(subscription: Subscription, n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Self](#Self=akka.stream.testkit.TestPublisher.Probe[T])Expect demand from a given subscription.

Expect demand from a given subscription.

Definition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
25. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#expectSubscription():akka.stream.testkit.StreamTestKit.PublisherProbeSubscription[I] "Permalink")  def expectSubscription(): PublisherProbeSubscription\[T]Expect a subscription.

Expect a subscription.

Definition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
26. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#getPublisher:org.reactivestreams.Publisher[I] "Permalink")  def getPublisher: Publisher\[T]Definition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
28. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#pending:Long "Permalink")  def pending: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Current pending requests.
34. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#receiveWhile[T](max:scala.concurrent.duration.Duration,idle:scala.concurrent.duration.Duration,messages:Int)(f:PartialFunction[akka.stream.testkit.TestPublisher.PublisherEvent,T]):Seq[T] "Permalink")  def receiveWhile\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, idle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, messages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= Int.MaxValue)(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[PublisherEvent](TestPublisher$$PublisherEvent.html), T]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive messages for a given duration or until one does not match a given partial function.

Receive messages for a given duration or until one does not match a given partial function.

Definition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
35. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#sendComplete():Probe.this.Self "Permalink")  def sendComplete(): [Self](#Self=akka.stream.testkit.TestPublisher.Probe[T])
36. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#sendError(cause:Throwable):Probe.this.Self "Permalink")  def sendError(cause: Throwable): [Self](#Self=akka.stream.testkit.TestPublisher.Probe[T])
37. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#sendNext(elem:T):Probe.this.Self "Permalink")  def sendNext(elem: T): [Self](#Self=akka.stream.testkit.TestPublisher.Probe[T])
38. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#subscribe(subscriber:org.reactivestreams.Subscriber[_>:I]):Unit "Permalink")  def subscribe(subscriber: Subscriber\[\_ \>: T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Subscribes a given org.reactivestreams.Subscriber to this probe publisher.

Subscribes a given org.reactivestreams.Subscriber to this probe publisher.

Definition Classes[ManualProbe](TestPublisher$$ManualProbe.html) → Publisher
39. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
40. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
41. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#unsafeSendNext(elem:T):Probe.this.Self "Permalink")  def unsafeSendNext(elem: T): [Self](#Self=akka.stream.testkit.TestPublisher.Probe[T])
42. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
43. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
44. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#within[T](max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TSame as calling `within(0 seconds, max)(f)`.

Same as calling `within(0 seconds, max)(f)`.

Definition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
46. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#within[T](min:scala.concurrent.duration.FiniteDuration,max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](min: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TExecute code block while bounding its execution time between `min` and
`max`.

Execute code block while bounding its execution time between `min` and
`max`. `within` blocks may be nested. All methods in this trait which
take maximum wait times are available in a version which implicitly uses
the remaining time governed by the innermost enclosing `within` block.

Note that the timeout is scaled using Duration.dilated, which uses the
configuration entry "akka.test.timefactor", while the min Duration is not.

```
val ret = within(50 millis) {
  test ! "ping"
  expectMsgClass(classOf[String])
}
```
Definition Classes[ManualProbe](TestPublisher$$ManualProbe.html)
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Probe\[T] toStringFormat\[Probe\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/testkit/TestPublisher$$Probe.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Probe\[T], B)ImplicitThis member is added by an implicit conversion from Probe\[T] toArrowAssoc\[Probe\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ManualProbe](TestPublisher$$ManualProbe.html)\[T]

### Inherited from Publisher\[T]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromProbe\[T] to any2stringadd\[Probe\[T]]

### Inherited by implicit conversion StringFormat fromProbe\[T] to StringFormat\[Probe\[T]]

### Inherited by implicit conversion Ensuring fromProbe\[T] to Ensuring\[Probe\[T]]

### Inherited by implicit conversion ArrowAssoc fromProbe\[T] to ArrowAssoc\[Probe\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$CancelSubscription.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$ManualProbe$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$ManualProbe.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$Probe$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$Probe.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$PublisherEvent.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$RequestMore.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$Subscribe.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$SubscriptionDone$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$Probe.html](https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$$Probe.html)*