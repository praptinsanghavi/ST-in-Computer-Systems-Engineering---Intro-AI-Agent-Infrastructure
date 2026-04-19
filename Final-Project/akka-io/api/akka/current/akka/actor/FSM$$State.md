---
description: Akka 2.10.17 - akka.actor.FSM.State
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:20:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/FSM$$State.html
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
- State
- [StateTimeout](FSM$$StateTimeout$.html "This case object is received in case of a state timeout.")
- [StopEvent](FSM$$StopEvent.html "Case class representing the state of the akka.actor.FSM within the onTermination block.")
- [SubscribeTransitionCallBack](FSM$$SubscribeTransitionCallBack.html "Send this to an akka.actor.FSM to request first the FSM.CurrentState and then a series of FSM.Transition updates.")
- [Transition](FSM$$Transition.html "Message type which is used to communicate transitions between states to all subscribed listeners (use akka.actor.FSM.SubscribeTransitionCallBack).")
- [UnsubscribeTransitionCallBack](FSM$$UnsubscribeTransitionCallBack.html "Unsubscribe from akka.actor.FSM.Transition notifications which was effected by sending the corresponding akka.actor.FSM.SubscribeTransitionCallBack.")
[c](FSM$$State$.html "See companion object")[akka](../index.html).[actor](index.html).[FSM](FSM$.html)

# [State](FSM$$State$.html "See companion object")[**](../../akka/actor/FSM$$State.html "Permalink")

### Companion [object State](FSM$$State$.html "See companion object")

#### class State\[S, D] extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[FSM.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/FSM.scala#L210)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. State
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../akka/actor/FSM$$State.html#<init>(stateName:S,stateData:D,timeout:Option[scala.concurrent.duration.FiniteDuration],stopReason:Option[akka.actor.FSM.Reason],replies:List[Any]):akka.actor.FSM.State[S,D] "Permalink")  new State(stateName: S, stateData: D, timeout: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)] \= None, stopReason: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Reason](FSM$$Reason.html)] \= None, replies: List\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)] \= Nil)
### Value Members

1. [**](../../akka/actor/FSM$$State.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/FSM$$State.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/FSM$$State.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from State\[S, D] toany2stringadd\[State\[S, D]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/FSM$$State.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (State\[S, D], B)ImplicitThis member is added by an implicit conversion from State\[S, D] toArrowAssoc\[State\[S, D]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/FSM$$State.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/FSM$$State.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/FSM$$State.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesState → Equals
8. [**](../../akka/actor/FSM$$State.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/actor/FSM$$State.html#copy(stateName:S,stateData:D,timeout:Option[scala.concurrent.duration.FiniteDuration],stopReason:Option[akka.actor.FSM.Reason],replies:List[Any]):akka.actor.FSM.State[S,D] "Permalink")  def copy(stateName: S \= stateName, stateData: D \= stateData, timeout: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)] \= timeout, stopReason: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Reason](FSM$$Reason.html)] \= stopReason, replies: List\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)] \= replies): State\[S, D]
10. [**](../../akka/actor/FSM$$State.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (State\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): State\[S, D]ImplicitThis member is added by an implicit conversion from State\[S, D] toEnsuring\[State\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/FSM$$State.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (State\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): State\[S, D]ImplicitThis member is added by an implicit conversion from State\[S, D] toEnsuring\[State\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/FSM$$State.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): State\[S, D]ImplicitThis member is added by an implicit conversion from State\[S, D] toEnsuring\[State\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/actor/FSM$$State.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): State\[S, D]ImplicitThis member is added by an implicit conversion from State\[S, D] toEnsuring\[State\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/actor/FSM$$State.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/actor/FSM$$State.html#equals(that:Any):Boolean "Permalink")  def equals(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesState → Equals → AnyRef → Any
16. [**](../../akka/actor/FSM$$State.html#forMax(timeout:java.time.Duration):akka.actor.FSM.State[S,D] "Permalink")  def forMax(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): State\[S, D]JAVA API: Modify state transition descriptor to include a state timeout for the
next state.

JAVA API: Modify state transition descriptor to include a state timeout for the
next state. This timeout overrides any default timeout set for the next
state.

Use Duration.Inf to deactivate an existing timeout.
17. [**](../../akka/actor/FSM$$State.html#forMax(timeout:scala.concurrent.duration.Duration):akka.actor.FSM.State[S,D] "Permalink")  def forMax(timeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): State\[S, D]Modify state transition descriptor to include a state timeout for the
next state.

Modify state transition descriptor to include a state timeout for the
next state. This timeout overrides any default timeout set for the next
state.

Use Duration.Inf to deactivate an existing timeout.
18. [**](../../akka/actor/FSM$$State.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/FSM$$State.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/FSM$$State.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/actor/FSM$$State.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/actor/FSM$$State.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/actor/FSM$$State.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/actor/FSM$$State.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesState → Product
25. [**](../../akka/actor/FSM$$State.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesState → Product
26. [**](../../akka/actor/FSM$$State.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
27. [**](../../akka/actor/FSM$$State.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
28. [**](../../akka/actor/FSM$$State.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
29. [**](../../akka/actor/FSM$$State.html#productPrefix:String "Permalink")  def productPrefix: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesState → Product
30. [**](../../akka/actor/FSM$$State.html#replies:List[Any] "Permalink")  val replies: List\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]
31. [**](../../akka/actor/FSM$$State.html#replying(replyValue:Any):akka.actor.FSM.State[S,D] "Permalink")  def replying(replyValue: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): State\[S, D]Send reply to sender of the current message, if available.

Send reply to sender of the current message, if available.

returnsthis state transition descriptor
32. [**](../../akka/actor/FSM$$State.html#stateData:D "Permalink")  val stateData: D
33. [**](../../akka/actor/FSM$$State.html#stateName:S "Permalink")  val stateName: S
34. [**](../../akka/actor/FSM$$State.html#stopReason:Option[akka.actor.FSM.Reason] "Permalink")  val stopReason: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Reason](FSM$$Reason.html)]
35. [**](../../akka/actor/FSM$$State.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../akka/actor/FSM$$State.html#timeout:Option[scala.concurrent.duration.FiniteDuration] "Permalink")  val timeout: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)]
37. [**](../../akka/actor/FSM$$State.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
38. [**](../../akka/actor/FSM$$State.html#using(nextStateData:D):akka.actor.FSM.State[S,D] "Permalink")  def using(nextStateData: D): State\[S, D]Modify state transition descriptor with new state data.

Modify state transition descriptor with new state data. The data will be
set when transitioning to the new state.

Annotations@nowarn()
39. [**](../../akka/actor/FSM$$State.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../akka/actor/FSM$$State.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../akka/actor/FSM$$State.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/FSM$$State.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/FSM$$State.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from State\[S, D] toStringFormat\[State\[S, D]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/FSM$$State.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (State\[S, D], B)ImplicitThis member is added by an implicit conversion from State\[S, D] toArrowAssoc\[State\[S, D]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromState\[S, D] to any2stringadd\[State\[S, D]]

### Inherited by implicit conversion StringFormat fromState\[S, D] to StringFormat\[State\[S, D]]

### Inherited by implicit conversion Ensuring fromState\[S, D] to Ensuring\[State\[S, D]]

### Inherited by implicit conversion ArrowAssoc fromState\[S, D] to ArrowAssoc\[State\[S, D]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/FSM$$$minus$greater$.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$CurrentState.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$Event.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$Failure.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$LogEntry.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$Normal$.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$NullFunction$.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$Reason.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$Shutdown$.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$State$.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$State.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$StateTimeout$.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$StopEvent.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$SubscribeTransitionCallBack.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$Transition.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$UnsubscribeTransitionCallBack.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/FSM$$State.html](https://doc.akka.io/api/akka/current/akka/actor/FSM$$State.html)*