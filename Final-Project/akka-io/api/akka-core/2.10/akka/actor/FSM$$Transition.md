---
description: Akka 2.10.17 - akka.actor.FSM.Transition
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/FSM$$Transition.html
title: Akka 2.10.17 - akka.actor.FSM.Transition
---

# Akka 2.10.17 - akka.actor.FSM.Transition

> **Summary:** Akka 2.10.17 - akka.actor.FSM.Transition

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
- Transition
- [UnsubscribeTransitionCallBack](FSM$$UnsubscribeTransitionCallBack.html "Unsubscribe from akka.actor.FSM.Transition notifications which was effected by sending the corresponding akka.actor.FSM.SubscribeTransitionCallBack.")
c[akka](../index.html).[actor](index.html).[FSM](FSM$.html)

# Transition[**](../../akka/actor/FSM$$Transition.html "Permalink")

### 

#### final  case class Transition\[S](fsmRef: [ActorRef](ActorRef.html), from: S, to: S) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Message type which is used to communicate transitions between states to
all subscribed listeners (use [akka.actor.FSM.SubscribeTransitionCallBack](FSM$$SubscribeTransitionCallBack.html)).

Source[FSM.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/FSM.scala#L45)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Transition
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

1. [**](../../akka/actor/FSM$$Transition.html#<init>(fsmRef:akka.actor.ActorRef,from:S,to:S):akka.actor.FSM.Transition[S] "Permalink")  new Transition(fsmRef: [ActorRef](ActorRef.html), from: S, to: S)
### Value Members

1. [**](../../akka/actor/FSM$$Transition.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/FSM$$Transition.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/FSM$$Transition.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Transition\[S] toany2stringadd\[Transition\[S]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/FSM$$Transition.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Transition\[S], B)ImplicitThis member is added by an implicit conversion from Transition\[S] toArrowAssoc\[Transition\[S]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/FSM$$Transition.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/FSM$$Transition.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/FSM$$Transition.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/FSM$$Transition.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Transition\[S]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Transition\[S]ImplicitThis member is added by an implicit conversion from Transition\[S] toEnsuring\[Transition\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/FSM$$Transition.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Transition\[S]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Transition\[S]ImplicitThis member is added by an implicit conversion from Transition\[S] toEnsuring\[Transition\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/FSM$$Transition.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Transition\[S]ImplicitThis member is added by an implicit conversion from Transition\[S] toEnsuring\[Transition\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/FSM$$Transition.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Transition\[S]ImplicitThis member is added by an implicit conversion from Transition\[S] toEnsuring\[Transition\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/FSM$$Transition.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/FSM$$Transition.html#from:S "Permalink")  val from: S
14. [**](../../akka/actor/FSM$$Transition.html#fsmRef:akka.actor.ActorRef "Permalink")  val fsmRef: [ActorRef](ActorRef.html)
15. [**](../../akka/actor/FSM$$Transition.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/FSM$$Transition.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/actor/FSM$$Transition.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/actor/FSM$$Transition.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/FSM$$Transition.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/FSM$$Transition.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../akka/actor/FSM$$Transition.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/actor/FSM$$Transition.html#to:S "Permalink")  val to: S
23. [**](../../akka/actor/FSM$$Transition.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/actor/FSM$$Transition.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/actor/FSM$$Transition.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/FSM$$Transition.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/FSM$$Transition.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Transition\[S] toStringFormat\[Transition\[S]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/FSM$$Transition.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Transition\[S], B)ImplicitThis member is added by an implicit conversion from Transition\[S] toArrowAssoc\[Transition\[S]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTransition\[S] to any2stringadd\[Transition\[S]]

### Inherited by implicit conversion StringFormat fromTransition\[S] to StringFormat\[Transition\[S]]

### Inherited by implicit conversion Ensuring fromTransition\[S] to Ensuring\[Transition\[S]]

### Inherited by implicit conversion ArrowAssoc fromTransition\[S] to ArrowAssoc\[Transition\[S]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$Transition.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$$Transition.html)*