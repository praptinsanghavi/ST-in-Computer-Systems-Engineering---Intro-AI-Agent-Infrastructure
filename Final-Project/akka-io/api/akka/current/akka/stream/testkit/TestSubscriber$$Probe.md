---
description: Akka 2.10.17 - akka.stream.testkit.TestSubscriber.Probe
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/TestSubscriber$$Probe.html
title: Akka 2.10.17 - akka.stream.testkit.TestSubscriber.Probe
---

# Akka 2.10.17 - akka.stream.testkit.TestSubscriber.Probe

> **Summary:** Akka 2.10.17 - akka.stream.testkit.TestSubscriber.Probe

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
- [OnNext](TestSubscriber$$OnNext.html)
- [OnSubscribe](TestSubscriber$$OnSubscribe.html)
- Probe
- [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)
[c](TestSubscriber$$Probe$.html "See companion object")[akka](../../index.html).[stream](../index.html).[testkit](index.html).[TestSubscriber](TestSubscriber$.html)

# [Probe](TestSubscriber$$Probe$.html "See companion object")[**](../../../akka/stream/testkit/TestSubscriber$$Probe.html "Permalink")

### Companion [object Probe](TestSubscriber$$Probe$.html "See companion object")

#### class Probe\[T] extends [ManualProbe](TestSubscriber$$ManualProbe.html)\[T]

Single subscription tracking for [ManualProbe](TestSubscriber$$ManualProbe.html).

Source[StreamTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/StreamTestKit.scala#L772)Linear Supertypes[ManualProbe](TestSubscriber$$ManualProbe.html)\[T], Subscriber\[T], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Probe
2. ManualProbe
3. Subscriber
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

1. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#Self=akka.stream.testkit.TestSubscriber.Probe[T] "Permalink")  type Self \= Probe\[T]Definition ClassesProbe → [ManualProbe](TestSubscriber$$ManualProbe.html)
### Value Members

1. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Probe\[T] toany2stringadd\[Probe\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Probe\[T], B)ImplicitThis member is added by an implicit conversion from Probe\[T] toArrowAssoc\[Probe\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#cancel(cause:Throwable):Probe.this.Self "Permalink")  def cancel(cause: Throwable): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])
8. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#cancel():Probe.this.Self "Permalink")  def cancel(): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])
9. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#ensureSubscription():Probe.this.Self "Permalink")  def ensureSubscription(): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Asserts that a subscription has been received or will be received
11. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Probe\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Probe\[T]ImplicitThis member is added by an implicit conversion from Probe\[T] toEnsuring\[Probe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Probe\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Probe\[T]ImplicitThis member is added by an implicit conversion from Probe\[T] toEnsuring\[Probe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Probe\[T]ImplicitThis member is added by an implicit conversion from Probe\[T] toEnsuring\[Probe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Probe\[T]ImplicitThis member is added by an implicit conversion from Probe\[T] toEnsuring\[Probe\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectComplete():ManualProbe.this.Self "Permalink")  def expectComplete(): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect completion.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
18. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectError(cause:Throwable):ManualProbe.this.Self "Permalink")  def expectError(cause: Throwable): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect given Throwable.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
19. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectError():Throwable "Permalink")  def expectError(): ThrowableExpect and return the signalled Throwable.

Expect and return the signalled Throwable.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
20. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectEvent(event:akka.stream.testkit.TestSubscriber.SubscriberEvent):ManualProbe.this.Self "Permalink")  def expectEvent(event: [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) (any of: `OnSubscribe`, `OnNext`, `OnError` or `OnComplete`).

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
21. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectEvent(max:scala.concurrent.duration.FiniteDuration):akka.stream.testkit.TestSubscriber.SubscriberEvent "Permalink")  def expectEvent(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)Expect and return [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) (any of: `OnSubscribe`, `OnNext`, `OnError` or `OnComplete`).

Expect and return [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) (any of: `OnSubscribe`, `OnNext`, `OnError` or `OnComplete`).

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
22. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectEvent():akka.stream.testkit.TestSubscriber.SubscriberEvent "Permalink")  def expectEvent(): [SubscriberEvent](TestSubscriber$$SubscriberEvent.html)Expect and return [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) (any of: `OnSubscribe`, `OnNext`, `OnError` or `OnComplete`).

Expect and return [SubscriberEvent](TestSubscriber$$SubscriberEvent.html) (any of: `OnSubscribe`, `OnNext`, `OnError` or `OnComplete`).

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
23. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectEventPF[T](f:PartialFunction[akka.stream.testkit.TestSubscriber.SubscriberEvent,T]):T "Permalink")  def expectEventPF\[T](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[SubscriberEvent](TestSubscriber$$SubscriberEvent.html), T]): TDefinition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
24. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectEventWithTimeoutPF[T](max:scala.concurrent.duration.Duration,f:PartialFunction[akka.stream.testkit.TestSubscriber.SubscriberEvent,T]):T "Permalink")  def expectEventWithTimeoutPF\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[SubscriberEvent](TestSubscriber$$SubscriberEvent.html), T]): TDefinition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
25. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNext(e1:I,e2:I,es:I*):ManualProbe.this.Self "Permalink")  def expectNext(e1: T, e2: T, es: T\*): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect multiple stream elements.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)Annotations@varargs()
26. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNext(d:scala.concurrent.duration.FiniteDuration,element:I):ManualProbe.this.Self "Permalink")  def expectNext(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), element: T): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect a stream element during specified time or timeout.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
27. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNext(element:I):ManualProbe.this.Self "Permalink")  def expectNext(element: T): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect a stream element.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
28. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNext(d:scala.concurrent.duration.FiniteDuration):I "Permalink")  def expectNext(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): TExpect and return a stream element during specified time or timeout.

Expect and return a stream element during specified time or timeout.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
29. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNext():I "Permalink")  def expectNext(): TExpect and return a stream element.

Expect and return a stream element.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
30. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextChainingPF(f:PartialFunction[Any,Any]):ManualProbe.this.Self "Permalink")  def expectNextChainingPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Expect a stream element during specified time or timeout and test it with partial function.

Expect a stream element during specified time or timeout and test it with partial function.

Allows chaining probe methods.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
31. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextChainingPF(max:scala.concurrent.duration.Duration,f:PartialFunction[Any,Any]):ManualProbe.this.Self "Permalink")  def expectNextChainingPF(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Expect a stream element during specified time or timeout and test it with partial function.

Expect a stream element during specified time or timeout and test it with partial function.

Allows chaining probe methods.

maxwait no more than max time, otherwise throw AssertionError

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
32. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextN(all:Seq[I]):ManualProbe.this.Self "Permalink")  def expectNextN(all: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL
Expect the given elements to be signalled in order.

Fluent DSL
Expect the given elements to be signalled in order.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
33. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextN(n:Long):Seq[I] "Permalink")  def expectNextN(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Expect and return the next `n` stream elements.

Expect and return the next `n` stream elements.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
34. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextOrComplete(element:I):ManualProbe.this.Self "Permalink")  def expectNextOrComplete(element: T): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect given next element or stream completion.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
35. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextOrComplete():Either[akka.stream.testkit.TestSubscriber.OnComplete.type,I] "Permalink")  def expectNextOrComplete(): Either\[[OnComplete](TestSubscriber$$OnComplete$.html).type, T]Expect next element or stream completion \- returning whichever was signalled.

Expect next element or stream completion \- returning whichever was signalled.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
36. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextOrError(element:I,cause:Throwable):Either[Throwable,I] "Permalink")  def expectNextOrError(element: T, cause: Throwable): Either\[Throwable, T]Fluent DSL
Expect given next element or error signal.

Fluent DSL
Expect given next element or error signal.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
37. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextOrError():Either[Throwable,I] "Permalink")  def expectNextOrError(): Either\[Throwable, T]Fluent DSL

Fluent DSL

Expect given next element or error signal, returning whichever was signalled.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
38. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextPF[T](f:PartialFunction[Any,T]):T "Permalink")  def expectNextPF\[T](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TExpect a stream element and test it with partial function.

Expect a stream element and test it with partial function.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
39. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextUnordered(e1:I,e2:I,es:I*):ManualProbe.this.Self "Permalink")  def expectNextUnordered(e1: T, e2: T, es: T\*): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect multiple stream elements in arbitrary order.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)Annotations@varargs()
40. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextUnorderedN(all:Seq[I]):ManualProbe.this.Self "Permalink")  def expectNextUnorderedN(all: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL
Expect the given elements to be signalled in any order.

Fluent DSL
Expect the given elements to be signalled in any order.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
41. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNextWithTimeoutPF[T](max:scala.concurrent.duration.Duration,f:PartialFunction[Any,T]):T "Permalink")  def expectNextWithTimeoutPF\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TExpect a stream element and test it with partial function.

Expect a stream element and test it with partial function.

maxwait no more than max time, otherwise throw AssertionError

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
42. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNoMessage(remaining:java.time.Duration):ManualProbe.this.Self "Permalink")  def expectNoMessage(remaining: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Java API: Assert that no message is received for the specified time.

Java API: Assert that no message is received for the specified time.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
43. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNoMessage():ManualProbe.this.Self "Permalink")  def expectNoMessage(): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Assert that no message is received for the specified time.
Waits for the default period configured as `akka.test.expect-no-message-default`.
That timeout is scaled using the configuration entry "akka.test.timefactor".

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
44. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectNoMessage(remaining:scala.concurrent.duration.FiniteDuration):ManualProbe.this.Self "Permalink")  def expectNoMessage(remaining: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Assert that no message is received for the specified time.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
45. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectSubscription():org.reactivestreams.Subscription "Permalink")  def expectSubscription(): SubscriptionExpect and return a org.reactivestreams.Subscription.

Expect and return a org.reactivestreams.Subscription.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
46. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectSubscriptionAndComplete(signalDemand:Boolean):ManualProbe.this.Self "Permalink")  def expectSubscriptionAndComplete(signalDemand: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect subscription followed by immediate stream completion.

Depending on the `signalDemand` parameter demand may be signalled immediately after obtaining the subscription
in order to wake up a possibly lazy upstream. You can disable this by setting the `signalDemand` parameter to `false`.

See also [\#expectSubscriptionAndComplete](#expectSubscriptionAndComplete(signalDemand:Boolean):ManualProbe.this.Self).

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
47. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectSubscriptionAndComplete():ManualProbe.this.Self "Permalink")  def expectSubscriptionAndComplete(): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect subscription followed by immediate stream completion.
By default `1` demand will be signalled in order to wake up a possibly lazy upstream

See also Boolean) if no demand should be signalled.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
48. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectSubscriptionAndError(cause:Throwable,signalDemand:Boolean):ManualProbe.this.Self "Permalink")  def expectSubscriptionAndError(cause: Throwable, signalDemand: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect subscription followed by immediate stream completion.
By default `1` demand will be signalled in order to wake up a possibly lazy upstream

See also Throwable).

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
49. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectSubscriptionAndError(cause:Throwable):ManualProbe.this.Self "Permalink")  def expectSubscriptionAndError(cause: Throwable): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Fluent DSL

Fluent DSL

Expect subscription followed by immediate stream completion.

By default `1` demand will be signalled in order to wake up a possibly lazy upstream.

See also Throwable, signalDemand: Boolean) if no demand should be signalled.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
50. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectSubscriptionAndError(signalDemand:Boolean):Throwable "Permalink")  def expectSubscriptionAndError(signalDemand: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ThrowableExpect subscription to be followed immediately by an error signal.

Expect subscription to be followed immediately by an error signal.

Depending on the `signalDemand` parameter demand may be signalled immediately after obtaining the subscription
in order to wake up a possibly lazy upstream. You can disable this by setting the `signalDemand` parameter to `false`.

See also [\#expectSubscriptionAndError](#expectSubscriptionAndError(cause:Throwable,signalDemand:Boolean):ManualProbe.this.Self).

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
51. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#expectSubscriptionAndError():Throwable "Permalink")  def expectSubscriptionAndError(): ThrowableExpect subscription to be followed immediately by an error signal.

Expect subscription to be followed immediately by an error signal.

By default `1` demand will be signalled in order to wake up a possibly lazy upstream.

See also \#expectSubscriptionAndError(Boolean) if no demand should be signalled.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
52. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
53. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
55. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
56. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
57. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
58. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#onComplete():Unit "Permalink")  def onComplete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html) → Subscriber
59. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#onError(cause:Throwable):Unit "Permalink")  def onError(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html) → Subscriber
60. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#onNext(element:I):Unit "Permalink")  def onNext(element: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html) → Subscriber
61. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#onSubscribe(subscription:org.reactivestreams.Subscription):Unit "Permalink")  def onSubscribe(subscription: Subscription): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html) → Subscriber
62. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#receiveWhile[T](max:scala.concurrent.duration.Duration,idle:scala.concurrent.duration.Duration,messages:Int)(f:PartialFunction[akka.stream.testkit.TestSubscriber.SubscriberEvent,T]):Seq[T] "Permalink")  def receiveWhile\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, idle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, messages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= Int.MaxValue)(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[SubscriberEvent](TestSubscriber$$SubscriberEvent.html), T]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive messages for a given duration or until one does not match a given partial function.

Receive messages for a given duration or until one does not match a given partial function.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
63. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#receiveWithin(max:scala.concurrent.duration.FiniteDuration,messages:Int):Seq[I] "Permalink")  def receiveWithin(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), messages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= Int.MaxValue): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Drains a given number of messages

Drains a given number of messages

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
64. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#request(n:Long):Probe.this.Self "Permalink")  def request(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])
65. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#requestNext(d:scala.concurrent.duration.FiniteDuration):T "Permalink")  def requestNext(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): TRequest and expect a stream element during the specified time or timeout.
66. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#requestNext():T "Permalink")  def requestNext(): TRequest and expect a stream element.
67. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#requestNext(element:T):Probe.this.Self "Permalink")  def requestNext(element: T): [Self](#Self=akka.stream.testkit.TestSubscriber.Probe[T])Request and expect a stream element.
68. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
69. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#toStrict(atMost:scala.concurrent.duration.FiniteDuration):Seq[I] "Permalink")  def toStrict(atMost: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Attempt to drain the stream into a strict collection (by requesting `Long.MaxValue` elements).

Attempt to drain the stream into a strict collection (by requesting `Long.MaxValue` elements).

**Use with caution: Be warned that this may not be a good idea if the stream is infinite or its elements are very large!**

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
70. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
71. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
72. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
73. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
74. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#within[T](max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TSame as calling `within(0 seconds, max)(f)`.

Same as calling `within(0 seconds, max)(f)`.

Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
75. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#within[T](min:scala.concurrent.duration.FiniteDuration,max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](min: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TExecute code block while bounding its execution time between `min` and
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
Definition Classes[ManualProbe](TestSubscriber$$ManualProbe.html)
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Probe\[T] toStringFormat\[Probe\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/testkit/TestSubscriber$$Probe.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Probe\[T], B)ImplicitThis member is added by an implicit conversion from Probe\[T] toArrowAssoc\[Probe\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ManualProbe](TestSubscriber$$ManualProbe.html)\[T]

### Inherited from Subscriber\[T]

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
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$Probe.html](https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$$Probe.html)*