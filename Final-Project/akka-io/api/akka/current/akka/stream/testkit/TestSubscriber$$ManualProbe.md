---
description: Akka 2.10.17 - akka.stream.testkit.TestSubscriber.ManualProbe
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/TestSubscriber$$ManualProbe.html
title: Akka 2.10.17 - akka.stream.testkit.TestSubscriber.ManualProbe
---

# Akka 2.10.17 - akka.stream.testkit.TestSubscriber.ManualProbe

> **Summary:** Akka 2.10.17 - akka.stream.testkit.TestSubscriber.ManualProbe

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/testkit/TestSubscriber$.html "Permalink")  object [TestSubscriber](TestSubscriber$.html)Definition Classes[testkit](index.html)
- ManualProbe
- [OnComplete](TestSubscriber$$OnComplete$.html)
- [OnError](TestSubscriber$$OnError.html)
- [OnNext](TestSubscriber$$OnNext.html)
- [OnSubscribe](TestSubscriber$$OnSubscribe.html)
- [Probe](TestSubscriber$$Probe.html "Single subscription tracking for ManualProbe.")
- [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)
[c](TestSubscriber$$ManualProbe$.html "See companion object")[akka](../../index.html).[stream](../index.html).[testkit](index.html).[TestSubscriber](TestSubscriber$.html)

# [ManualProbe](TestSubscriber$$ManualProbe$.html "See companion object")[**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html "Permalink")

### Companion [object ManualProbe](TestSubscriber$$ManualProbe$.html "See companion object")

#### class ManualProbe\[I] extends Subscriber\[I]

Implementation of org.reactivestreams.Subscriber that allows various assertions.

All timeouts are dilated automatically, for more details about time dilation refer to [akka.testkit.TestKit](../../testkit/TestKit.html).

Source[StreamTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/StreamTestKit.scala#L312)Linear SupertypesSubscriber\[I], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Probe](TestSubscriber$$Probe.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ManualProbe
2. Subscriber
3. AnyRef
4. Any
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

1. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I] "Permalink") abstract  type Self \<: ManualProbe\[I]
### Value Members

1. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ManualProbe\[I] toany2stringadd\[ManualProbe\[I]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ManualProbe\[I], B)ImplicitThis member is added by an implicit conversion from ManualProbe\[I] toArrowAssoc\[ManualProbe\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ManualProbe\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ManualProbe\[I]ImplicitThis member is added by an implicit conversion from ManualProbe\[I] toEnsuring\[ManualProbe\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ManualProbe\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ManualProbe\[I]ImplicitThis member is added by an implicit conversion from ManualProbe\[I] toEnsuring\[ManualProbe\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ManualProbe\[I]ImplicitThis member is added by an implicit conversion from ManualProbe\[I] toEnsuring\[ManualProbe\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ManualProbe\[I]ImplicitThis member is added by an implicit conversion from ManualProbe\[I] toEnsuring\[ManualProbe\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectComplete():ManualProbe.this.Self "Permalink")  def expectComplete(): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect completion.
15. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectError(cause:Throwable):ManualProbe.this.Self "Permalink")  def expectError(cause: Throwable): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect given Throwable.
16. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectError():Throwable "Permalink")  def expectError(): ThrowableExpect and return the signalled Throwable.
17. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectEvent(event:akka.stream.testkit.TestSubscriber.SubscriberEvent):ManualProbe.this.Self "Permalink")  def expectEvent(event: [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) (any of: `OnSubscribe`, `OnNext`, `OnError` or `OnComplete`).
18. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectEvent(max:scala.concurrent.duration.FiniteDuration):akka.stream.testkit.TestSubscriber.SubscriberEvent "Permalink")  def expectEvent(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)Expect and return [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) (any of: `OnSubscribe`, `OnNext`, `OnError` or `OnComplete`).
19. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectEvent():akka.stream.testkit.TestSubscriber.SubscriberEvent "Permalink")  def expectEvent(): [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)Expect and return [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) (any of: `OnSubscribe`, `OnNext`, `OnError` or `OnComplete`).
20. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectEventPF[T](f:PartialFunction[akka.stream.testkit.TestSubscriber.SubscriberEvent,T]):T "Permalink")  def expectEventPF\[T](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[SubscriberEvent](TestSubscriber$$SubscriberEvent.html), T]): T
21. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectEventWithTimeoutPF[T](max:scala.concurrent.duration.Duration,f:PartialFunction[akka.stream.testkit.TestSubscriber.SubscriberEvent,T]):T "Permalink")  def expectEventWithTimeoutPF\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[SubscriberEvent](TestSubscriber$$SubscriberEvent.html), T]): T
22. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNext(e1:I,e2:I,es:I*):ManualProbe.this.Self "Permalink")  def expectNext(e1: I, e2: I, es: I\*): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect multiple stream elements.

Annotations@varargs()
23. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNext(d:scala.concurrent.duration.FiniteDuration,element:I):ManualProbe.this.Self "Permalink")  def expectNext(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), element: I): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect a stream element during specified time or timeout.
24. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNext(element:I):ManualProbe.this.Self "Permalink")  def expectNext(element: I): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect a stream element.
25. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNext(d:scala.concurrent.duration.FiniteDuration):I "Permalink")  def expectNext(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): IExpect and return a stream element during specified time or timeout.
26. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNext():I "Permalink")  def expectNext(): IExpect and return a stream element.
27. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextChainingPF(f:PartialFunction[Any,Any]):ManualProbe.this.Self "Permalink")  def expectNextChainingPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Expect a stream element during specified time or timeout and test it with partial function.

Expect a stream element during specified time or timeout and test it with partial function.

Allows chaining probe methods.
28. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextChainingPF(max:scala.concurrent.duration.Duration,f:PartialFunction[Any,Any]):ManualProbe.this.Self "Permalink")  def expectNextChainingPF(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Expect a stream element during specified time or timeout and test it with partial function.

Expect a stream element during specified time or timeout and test it with partial function.

Allows chaining probe methods.

maxwait no more than max time, otherwise throw AssertionError
29. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextN(all:Seq[I]):ManualProbe.this.Self "Permalink")  def expectNextN(all: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[I]): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL
Expect the given elements to be signalled in order.
30. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextN(n:Long):Seq[I] "Permalink")  def expectNextN(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[I]Expect and return the next `n` stream elements.
31. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextOrComplete(element:I):ManualProbe.this.Self "Permalink")  def expectNextOrComplete(element: I): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect given next element or stream completion.
32. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextOrComplete():Either[akka.stream.testkit.TestSubscriber.OnComplete.type,I] "Permalink")  def expectNextOrComplete(): Either\[[OnComplete](TestSubscriber$$OnComplete$.html).type, I]Expect next element or stream completion \- returning whichever was signalled.
33. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextOrError(element:I,cause:Throwable):Either[Throwable,I] "Permalink")  def expectNextOrError(element: I, cause: Throwable): Either\[Throwable, I]Fluent DSL
Expect given next element or error signal.
34. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextOrError():Either[Throwable,I] "Permalink")  def expectNextOrError(): Either\[Throwable, I]Fluent DSL

Fluent DSL

Expect given next element or error signal, returning whichever was signalled.
35. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextPF[T](f:PartialFunction[Any,T]):T "Permalink")  def expectNextPF\[T](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TExpect a stream element and test it with partial function.
36. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextUnordered(e1:I,e2:I,es:I*):ManualProbe.this.Self "Permalink")  def expectNextUnordered(e1: I, e2: I, es: I\*): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect multiple stream elements in arbitrary order.

Annotations@varargs()
37. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextUnorderedN(all:Seq[I]):ManualProbe.this.Self "Permalink")  def expectNextUnorderedN(all: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[I]): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL
Expect the given elements to be signalled in any order.
38. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNextWithTimeoutPF[T](max:scala.concurrent.duration.Duration,f:PartialFunction[Any,T]):T "Permalink")  def expectNextWithTimeoutPF\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TExpect a stream element and test it with partial function.

Expect a stream element and test it with partial function.

maxwait no more than max time, otherwise throw AssertionError
39. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNoMessage(remaining:java.time.Duration):ManualProbe.this.Self "Permalink")  def expectNoMessage(remaining: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Java API: Assert that no message is received for the specified time.
40. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNoMessage():ManualProbe.this.Self "Permalink")  def expectNoMessage(): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Assert that no message is received for the specified time.
Waits for the default period configured as `akka.test.expect-no-message-default`.
That timeout is scaled using the configuration entry "akka.test.timefactor".
41. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectNoMessage(remaining:scala.concurrent.duration.FiniteDuration):ManualProbe.this.Self "Permalink")  def expectNoMessage(remaining: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Assert that no message is received for the specified time.
42. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectSubscription():org.reactivestreams.Subscription "Permalink")  def expectSubscription(): SubscriptionExpect and return a org.reactivestreams.Subscription.
43. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectSubscriptionAndComplete(signalDemand:Boolean):ManualProbe.this.Self "Permalink")  def expectSubscriptionAndComplete(signalDemand: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect subscription followed by immediate stream completion.

Depending on the `signalDemand` parameter demand may be signalled immediately after obtaining the subscription
in order to wake up a possibly lazy upstream. You can disable this by setting the `signalDemand` parameter to `false`.

See also [\#expectSubscriptionAndComplete](#expectSubscriptionAndComplete(signalDemand:Boolean):ManualProbe.this.Self).
44. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectSubscriptionAndComplete():ManualProbe.this.Self "Permalink")  def expectSubscriptionAndComplete(): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect subscription followed by immediate stream completion.
By default `1` demand will be signalled in order to wake up a possibly lazy upstream

See also Boolean) if no demand should be signalled.
45. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectSubscriptionAndError(cause:Throwable,signalDemand:Boolean):ManualProbe.this.Self "Permalink")  def expectSubscriptionAndError(cause: Throwable, signalDemand: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect subscription followed by immediate stream completion.
By default `1` demand will be signalled in order to wake up a possibly lazy upstream

See also Throwable).
46. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectSubscriptionAndError(cause:Throwable):ManualProbe.this.Self "Permalink")  def expectSubscriptionAndError(cause: Throwable): [Self](#Self<:akka.stream.testkit.TestSubscriber.ManualProbe[I])Fluent DSL

Fluent DSL

Expect subscription followed by immediate stream completion.

By default `1` demand will be signalled in order to wake up a possibly lazy upstream.

See also Throwable, signalDemand: Boolean) if no demand should be signalled.
47. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectSubscriptionAndError(signalDemand:Boolean):Throwable "Permalink")  def expectSubscriptionAndError(signalDemand: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ThrowableExpect subscription to be followed immediately by an error signal.

Expect subscription to be followed immediately by an error signal.

Depending on the `signalDemand` parameter demand may be signalled immediately after obtaining the subscription
in order to wake up a possibly lazy upstream. You can disable this by setting the `signalDemand` parameter to `false`.

See also [\#expectSubscriptionAndError](#expectSubscriptionAndError(cause:Throwable,signalDemand:Boolean):ManualProbe.this.Self).
48. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#expectSubscriptionAndError():Throwable "Permalink")  def expectSubscriptionAndError(): ThrowableExpect subscription to be followed immediately by an error signal.

Expect subscription to be followed immediately by an error signal.

By default `1` demand will be signalled in order to wake up a possibly lazy upstream.

See also \#expectSubscriptionAndError(Boolean) if no demand should be signalled.
49. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
50. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
51. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
52. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
53. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
55. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#onComplete():Unit "Permalink")  def onComplete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesManualProbe → Subscriber
56. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#onError(cause:Throwable):Unit "Permalink")  def onError(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesManualProbe → Subscriber
57. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#onNext(element:I):Unit "Permalink")  def onNext(element: I): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesManualProbe → Subscriber
58. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#onSubscribe(subscription:org.reactivestreams.Subscription):Unit "Permalink")  def onSubscribe(subscription: Subscription): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesManualProbe → Subscriber
59. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#receiveWhile[T](max:scala.concurrent.duration.Duration,idle:scala.concurrent.duration.Duration,messages:Int)(f:PartialFunction[akka.stream.testkit.TestSubscriber.SubscriberEvent,T]):Seq[T] "Permalink")  def receiveWhile\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, idle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, messages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= Int.MaxValue)(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[SubscriberEvent](TestSubscriber$$SubscriberEvent.html), T]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive messages for a given duration or until one does not match a given partial function.
60. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#receiveWithin(max:scala.concurrent.duration.FiniteDuration,messages:Int):Seq[I] "Permalink")  def receiveWithin(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), messages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= Int.MaxValue): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[I]Drains a given number of messages
61. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
62. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#toStrict(atMost:scala.concurrent.duration.FiniteDuration):Seq[I] "Permalink")  def toStrict(atMost: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[I]Attempt to drain the stream into a strict collection (by requesting `Long.MaxValue` elements).

Attempt to drain the stream into a strict collection (by requesting `Long.MaxValue` elements).

**Use with caution: Be warned that this may not be a good idea if the stream is infinite or its elements are very large!**
63. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
64. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
65. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
66. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
67. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#within[T](max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TSame as calling `within(0 seconds, max)(f)`.
68. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#within[T](min:scala.concurrent.duration.FiniteDuration,max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](min: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TExecute code block while bounding its execution time between `min` and
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
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ManualProbe\[I] toStringFormat\[ManualProbe\[I]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/testkit/TestSubscriber$$ManualProbe.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ManualProbe\[I], B)ImplicitThis member is added by an implicit conversion from ManualProbe\[I] toArrowAssoc\[ManualProbe\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from Subscriber\[I]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromManualProbe\[I] to any2stringadd\[ManualProbe\[I]]

### Inherited by implicit conversion StringFormat fromManualProbe\[I] to StringFormat\[ManualProbe\[I]]

### Inherited by implicit conversion Ensuring fromManualProbe\[I] to Ensuring\[ManualProbe\[I]]

### Inherited by implicit conversion ArrowAssoc fromManualProbe\[I] to ArrowAssoc\[ManualProbe\[I]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$ManualProbe$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$ManualProbe.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$OnComplete$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$OnError.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$OnNext.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$OnSubscribe.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$Probe$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$Probe.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$SubscriberEvent.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$ManualProbe.html](https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$ManualProbe.html)*