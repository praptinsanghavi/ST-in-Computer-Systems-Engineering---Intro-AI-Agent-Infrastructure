---
description: Akka 2.10.17 - akka.actor.FSM.State
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:13:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/FSM$$State$.html
title: Akka 2.10.17 - akka.actor.FSM.State
---

# Akka 2.10.17 - akka.actor.FSM.State

> **Summary:** Akka 2.10.17 - akka.actor.FSM.State

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
- [NullFunction](FSM$$NullFunction$.html "A partial function value which does not match anything and can be used to “reset” whenUnhandled and onTermination handlers.")
- [Reason](FSM$$Reason.html "Reason why this akka.actor.FSM is shutting down.")
- [Shutdown](FSM$$Shutdown$.html "Reason given when someone was calling system.stop(fsm) from outside; also applies to Stop supervision directive.")
- [State](FSM$$State.html)
- [StateTimeout](FSM$$StateTimeout$.html "This case object is received in case of a state timeout.")
- [StopEvent](FSM$$StopEvent.html "Case class representing the state of the akka.actor.FSM within the onTermination block.")
- [SubscribeTransitionCallBack](FSM$$SubscribeTransitionCallBack.html "Send this to an akka.actor.FSM to request first the FSM.CurrentState and then a series of FSM.Transition updates.")
- [Transition](FSM$$Transition.html "Message type which is used to communicate transitions between states to all subscribed listeners (use akka.actor.FSM.SubscribeTransitionCallBack).")
- [UnsubscribeTransitionCallBack](FSM$$UnsubscribeTransitionCallBack.html "Unsubscribe from akka.actor.FSM.Transition notifications which was effected by sending the corresponding akka.actor.FSM.SubscribeTransitionCallBack.")
[o](FSM$$State.html "See companion class")[akka](../index.html).[actor](index.html).[FSM](FSM$.html)

# [State](FSM$$State.html "See companion class")[**](../../akka/actor/FSM$$State$.html "Permalink")

### Companion [class State](FSM$$State.html "See companion class")

#### object State extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

This captures all of the managed state of the [akka.actor.FSM](FSM.html): the state
name, the state data, possibly custom timeout, stop reason and replies
accumulated while processing the last message.

Source[FSM.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/FSM.scala#L196)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. State
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/actor/FSM$$State$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/FSM$$State$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/FSM$$State$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/actor/FSM$$State$.html#apply[S,D](stateName:S,stateData:D,timeout:Option[scala.concurrent.duration.FiniteDuration],stopReason:Option[akka.actor.FSM.Reason],replies:List[Any]):akka.actor.FSM.State[S,D] "Permalink")  def apply\[S, D](stateName: S, stateData: D, timeout: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)] \= None, stopReason: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Reason](FSM$$Reason.html)] \= None, replies: List\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)] \= Nil): [State](FSM$$State.html)\[S, D]
5. [**](../../akka/actor/FSM$$State$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/actor/FSM$$State$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/actor/FSM$$State$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/actor/FSM$$State$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/actor/FSM$$State$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/actor/FSM$$State$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/actor/FSM$$State$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../akka/actor/FSM$$State$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/FSM$$State$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/actor/FSM$$State$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/FSM$$State$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/actor/FSM$$State$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../akka/actor/FSM$$State$.html#unapply[S,D](state:akka.actor.FSM.State[S,D]):Option[(S,D,Option[scala.concurrent.duration.FiniteDuration],Option[akka.actor.FSM.Reason],List[Any])] "Permalink")  def unapply\[S, D](state: [State](FSM$$State.html)\[S, D]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(S, D, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)], [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Reason](FSM$$Reason.html)], List\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)])]
18. [**](../../akka/actor/FSM$$State$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/actor/FSM$$State$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../akka/actor/FSM$$State$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/FSM$$State$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

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
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$State$.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$State$.html)*