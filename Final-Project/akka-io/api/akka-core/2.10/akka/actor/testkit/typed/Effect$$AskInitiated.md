---
description: Akka 2.10.17 - akka.actor.testkit.typed.Effect.AskInitiated
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/Effect$$AskInitiated.html
title: Akka 2.10.17 - akka.actor.testkit.typed.Effect.AskInitiated
---

# Akka 2.10.17 - akka.actor.testkit.typed.Effect.AskInitiated

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.Effect.AskInitiated

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/actor/testkit/typed/Effect$.html "Permalink")  object [Effect](Effect$.html)Definition Classes[typed](index.html)
- AskInitiated
- [MessageAdapter](Effect$$MessageAdapter.html "The behavior create a message adapter for the messages of type clazz")
- [NoEffects](Effect$$NoEffects.html "Used for NoEffects expectations by type")
- [ReceiveTimeoutCancelled](Effect$$ReceiveTimeoutCancelled.html)
- [ReceiveTimeoutSet](Effect$$ReceiveTimeoutSet.html "The behavior set a new receive timeout, with message as timeout notification")
- [Scheduled](Effect$$Scheduled.html "The behavior used context.scheduleOnce to schedule message to be sent to target after delay FIXME what about events scheduled through the scheduler?")
- [Spawned](Effect$$Spawned.html "The behavior spawned a named child with the given behavior (and optionally specific props)")
- [SpawnedAnonymous](Effect$$SpawnedAnonymous.html "The behavior spawned an anonymous child with the given behavior (and optionally specific props)")
- [Stopped](Effect$$Stopped.html "The behavior stopped childName")
- [TimerCancelled](Effect$$TimerCancelled.html)
- [TimerScheduled](Effect$$TimerScheduled.html)
- [Unwatched](Effect$$Unwatched.html "The behavior stopped watching other, through context.unwatch(other)")
- [Watched](Effect$$Watched.html "The behavior started watching other, through context.watch(other)")
- [WatchedWith](Effect$$WatchedWith.html "The behavior started watching other, through context.watchWith(other, message)")
c[akka](../../../index.html).[actor](../../index.html).[testkit](../index.html).[typed](index.html).[Effect](Effect$.html)

# AskInitiated[**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html "Permalink")

### 

#### final  case class AskInitiated\[Req, Res, T](target: [RecipientRef](../../typed/RecipientRef.html)\[Req], responseTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), responseClass: Class\[Res])(askMessage: Req, forwardResponse: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Res]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit), mapResponse: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Res]) \=\> T) extends [Effect](Effect.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

The behavior initiated an ask via its context. A response or timeout may be sent via this
effect to the asking behavior: this effect enforces that at most one response or timeout is
sent. Alternatively, one may, after obtaining the effect, test the response adaptation function
(without sending a message to the asking behavior) arbitrarily many times via the 'adaptResponse`and` adaptTimeout `methods.`

The 'replyToRef' is exposed so that the target inbox can expect the actual message sent to
initiate the ask.

Note that this requires the ask to be initiated via the [ActorContext](../../ActorContext.html). The Future returning
ask is not testable in the BehaviorTestKit.

Source[Effect.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/Effect.scala#L44)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Effect](Effect.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AskInitiated
2. Serializable
3. Product
4. Equals
5. Effect
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

1. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#<init>(target:akka.actor.typed.RecipientRef[Req],responseTimeout:scala.concurrent.duration.FiniteDuration,responseClass:Class[Res])(askMessage:Req,forwardResponse:scala.util.Try[Res]=>Unit,mapResponse:scala.util.Try[Res]=>T):akka.actor.testkit.typed.Effect.AskInitiated[Req,Res,T] "Permalink")  new AskInitiated(target: [RecipientRef](../../typed/RecipientRef.html)\[Req], responseTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), responseClass: Class\[Res])(askMessage: Req, forwardResponse: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Res]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit), mapResponse: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Res]) \=\> T)
### Value Members

1. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AskInitiated\[Req, Res, T] toany2stringadd\[AskInitiated\[Req, Res, T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AskInitiated\[Req, Res, T], B)ImplicitThis member is added by an implicit conversion from AskInitiated\[Req, Res, T] toArrowAssoc\[AskInitiated\[Req, Res, T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#adaptResponse(response:Res):T "Permalink")  def adaptResponse(response: Res): T
7. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#adaptTimeout:T "Permalink")  def adaptTimeout: T
8. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#adaptTimeout(msg:String):T "Permalink")  def adaptTimeout(msg: String): T
9. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#askMessage:Req "Permalink")  val askMessage: Req
11. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AskInitiated\[Req, Res, T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AskInitiated\[Req, Res, T]ImplicitThis member is added by an implicit conversion from AskInitiated\[Req, Res, T] toEnsuring\[AskInitiated\[Req, Res, T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AskInitiated\[Req, Res, T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AskInitiated\[Req, Res, T]ImplicitThis member is added by an implicit conversion from AskInitiated\[Req, Res, T] toEnsuring\[AskInitiated\[Req, Res, T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AskInitiated\[Req, Res, T]ImplicitThis member is added by an implicit conversion from AskInitiated\[Req, Res, T] toEnsuring\[AskInitiated\[Req, Res, T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AskInitiated\[Req, Res, T]ImplicitThis member is added by an implicit conversion from AskInitiated\[Req, Res, T] toEnsuring\[AskInitiated\[Req, Res, T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#getResponseTimeout:java.time.Duration "Permalink")  def getResponseTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Java API
19. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#respondWith(response:Res):Unit "Permalink")  def respondWith(response: Res): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
25. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#responseClass:Class[Res] "Permalink")  val responseClass: Class\[Res]
26. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#responseTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val responseTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
27. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#target:akka.actor.typed.RecipientRef[Req] "Permalink")  val target: [RecipientRef](../../typed/RecipientRef.html)\[Req]
29. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#timeout():Unit "Permalink")  def timeout(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
30. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AskInitiated\[Req, Res, T] toStringFormat\[AskInitiated\[Req, Res, T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/testkit/typed/Effect$$AskInitiated.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AskInitiated\[Req, Res, T], B)ImplicitThis member is added by an implicit conversion from AskInitiated\[Req, Res, T] toArrowAssoc\[AskInitiated\[Req, Res, T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Effect](Effect.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAskInitiated\[Req, Res, T] to any2stringadd\[AskInitiated\[Req, Res, T]]

### Inherited by implicit conversion StringFormat fromAskInitiated\[Req, Res, T] to StringFormat\[AskInitiated\[Req, Res, T]]

### Inherited by implicit conversion Ensuring fromAskInitiated\[Req, Res, T] to Ensuring\[AskInitiated\[Req, Res, T]]

### Inherited by implicit conversion ArrowAssoc fromAskInitiated\[Req, Res, T] to ArrowAssoc\[AskInitiated\[Req, Res, T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$AskInitiated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$MessageAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$NoEffects$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$NoEffects.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$ReceiveTimeoutCancelled$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$ReceiveTimeoutCancelled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$ReceiveTimeoutSet.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Scheduled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Spawned$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Spawned.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$SpawnedAnonymous$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$SpawnedAnonymous.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Stopped.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$TimerCancelled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$TimerScheduled$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$TimerScheduled.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Unwatched.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$Watched.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$WatchedWith.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$AskInitiated.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/Effect$$AskInitiated.html)*