---
description: Akka 2.10.17 - akka.actor.FSM.NullFunction
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/FSM$$NullFunction$.html
title: Akka 2.10.17 - akka.actor.FSM.NullFunction
---

# Akka 2.10.17 - akka.actor.FSM.NullFunction

> **Summary:** Akka 2.10.17 - akka.actor.FSM.NullFunction

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/FSM$.html "Permalink")  object [FSM](FSM$.html)Definition Classes[actor](index.html)
- [\-\>](FSM$$$minus$greater$.html "This extractor is just convenience for matching a (S, S) pair, including a reminder what the new state is.")
- [CurrentState](FSM$$CurrentState.html "Message type which is sent directly to the subscribed actor in akka.actor.FSM.SubscribeTransitionCallBack before sending any akka.actor.FSM.Transition messages.")
- [Event](FSM$$Event.html "All messages sent to the akka.actor.FSM will be wrapped inside an Event, which allows pattern matching to extract both state and data.")
- [Failure](FSM$$Failure.html "Signifies that the akka.actor.FSM is shutting itself down because of an error, e.g.")
- [LogEntry](FSM$$LogEntry.html "Log Entry of the akka.actor.LoggingFSM, can be obtained by calling getLog.")
- [Normal](FSM$$Normal$.html "Default reason if calling stop().")
- NullFunction
- [Reason](FSM$$Reason.html "Reason why this akka.actor.FSM is shutting down.")
- [Shutdown](FSM$$Shutdown$.html "Reason given when someone was calling system.stop(fsm) from outside; also applies to Stop supervision directive.")
- [State](FSM$$State.html)
- [StateTimeout](FSM$$StateTimeout$.html "This case object is received in case of a state timeout.")
- [StopEvent](FSM$$StopEvent.html "Case class representing the state of the akka.actor.FSM within the onTermination block.")
- [SubscribeTransitionCallBack](FSM$$SubscribeTransitionCallBack.html "Send this to an akka.actor.FSM to request first the FSM.CurrentState and then a series of FSM.Transition updates.")
- [Transition](FSM$$Transition.html "Message type which is used to communicate transitions between states to all subscribed listeners (use akka.actor.FSM.SubscribeTransitionCallBack).")
- [UnsubscribeTransitionCallBack](FSM$$UnsubscribeTransitionCallBack.html "Unsubscribe from akka.actor.FSM.Transition notifications which was effected by sending the corresponding akka.actor.FSM.SubscribeTransitionCallBack.")
o[akka](../index.html).[actor](index.html).[FSM](FSM$.html)

# NullFunction[**](../../akka/actor/FSM$$NullFunction$.html "Permalink")

### 

#### object NullFunction extends [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]

A partial function value which does not match anything and can be used to
“reset” `whenUnhandled` and `onTermination` handlers.

```
onTermination(FSM.NullFunction)
```
Source[FSM.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/FSM.scala#L29)Linear Supertypes[PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)], ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NullFunction
2. PartialFunction
3. Function1
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/actor/FSM$$NullFunction$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/FSM$$NullFunction$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/FSM$$NullFunction$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/actor/FSM$$NullFunction$.html#andThen[C](k:PartialFunction[B,C]):PartialFunction[A,C] "Permalink")  def andThen\[C](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing), C]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), C]Definition ClassesPartialFunction
5. [**](../../akka/actor/FSM$$NullFunction$.html#andThen[C](k:B=>C):PartialFunction[A,C] "Permalink")  def andThen\[C](k: ([Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)) \=\> C): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), C]Definition ClassesPartialFunction → Function1
6. [**](../../akka/actor/FSM$$NullFunction$.html#apply(o:Any):Nothing "Permalink")  def apply(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesNullFunction → Function1
7. [**](../../akka/actor/FSM$$NullFunction$.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1 "Permalink")  def applyOrElse\[A1 \<: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), B1 \>: [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)](x: A1, default: (A1) \=\> B1): B1Definition ClassesPartialFunction
8. [**](../../akka/actor/FSM$$NullFunction$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/actor/FSM$$NullFunction$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/actor/FSM$$NullFunction$.html#compose[R](k:PartialFunction[R,A]):PartialFunction[R,B] "Permalink")  def compose\[R](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]Definition ClassesPartialFunction
11. [**](../../akka/actor/FSM$$NullFunction$.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): (A) \=\> [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesFunction1Annotations@unspecialized()
12. [**](../../akka/actor/FSM$$NullFunction$.html#elementWise:PartialFunction.ElementWiseExtractor[A,B] "Permalink")  def elementWise: ElementWiseExtractor\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]Definition ClassesPartialFunction
13. [**](../../akka/actor/FSM$$NullFunction$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/actor/FSM$$NullFunction$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/actor/FSM$$NullFunction$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/FSM$$NullFunction$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/actor/FSM$$NullFunction$.html#isDefinedAt(o:Any):Boolean "Permalink")  def isDefinedAt(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesNullFunction → PartialFunction
18. [**](../../akka/actor/FSM$$NullFunction$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/actor/FSM$$NullFunction$.html#lift:A=>Option[B] "Permalink")  def lift: ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]Definition ClassesPartialFunction
20. [**](../../akka/actor/FSM$$NullFunction$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/actor/FSM$$NullFunction$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/actor/FSM$$NullFunction$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/actor/FSM$$NullFunction$.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1] "Permalink")  def orElse\[A1 \<: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), B1 \>: [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)](that: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]Definition ClassesPartialFunction
24. [**](../../akka/actor/FSM$$NullFunction$.html#runWith[U](action:B=>U):A=>Boolean "Permalink")  def runWith\[U](action: ([Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)) \=\> U): ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
25. [**](../../akka/actor/FSM$$NullFunction$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/actor/FSM$$NullFunction$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
27. [**](../../akka/actor/FSM$$NullFunction$.html#unapply(a:A):Option[B] "Permalink")  def unapply(a: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]Definition ClassesPartialFunction
28. [**](../../akka/actor/FSM$$NullFunction$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/actor/FSM$$NullFunction$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../akka/actor/FSM$$NullFunction$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/FSM$$NullFunction$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]

### Inherited from ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$$minus$greater$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$CurrentState.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$Event.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$Failure.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$LogEntry.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$Normal$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$NullFunction$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$Reason.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$Shutdown$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$State$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$State.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$StateTimeout$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$StopEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$SubscribeTransitionCallBack.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$Transition.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$UnsubscribeTransitionCallBack.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$NullFunction$.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$NullFunction$.html)*