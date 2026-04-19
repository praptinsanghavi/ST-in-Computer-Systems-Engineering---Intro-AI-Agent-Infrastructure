---
description: Akka 2.10.17 - akka.actor.FSM.LogEntry
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:21:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/FSM$$LogEntry.html
title: Akka 2.10.17 - akka.actor.FSM.LogEntry
---

# Akka 2.10.17 - akka.actor.FSM.LogEntry

> **Summary:** Akka 2.10.17 - akka.actor.FSM.LogEntry

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
- LogEntry
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
c[akka](../index.html).[actor](index.html).[FSM](FSM$.html)

# LogEntry[**](../../akka/actor/FSM$$LogEntry.html "Permalink")

### 

#### final  case class LogEntry\[S, D](stateName: S, stateData: D, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Log Entry of the [akka.actor.LoggingFSM](LoggingFSM.html), can be obtained by calling `getLog`.

Source[FSM.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/FSM.scala#L158)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LogEntry
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

1. [**](../../akka/actor/FSM$$LogEntry.html#<init>(stateName:S,stateData:D,event:Any):akka.actor.FSM.LogEntry[S,D] "Permalink")  new LogEntry(stateName: S, stateData: D, event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))
### Value Members

1. [**](../../akka/actor/FSM$$LogEntry.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/FSM$$LogEntry.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/FSM$$LogEntry.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LogEntry\[S, D] toany2stringadd\[LogEntry\[S, D]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/FSM$$LogEntry.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LogEntry\[S, D], B)ImplicitThis member is added by an implicit conversion from LogEntry\[S, D] toArrowAssoc\[LogEntry\[S, D]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/FSM$$LogEntry.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/FSM$$LogEntry.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/FSM$$LogEntry.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/FSM$$LogEntry.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LogEntry\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogEntry\[S, D]ImplicitThis member is added by an implicit conversion from LogEntry\[S, D] toEnsuring\[LogEntry\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/FSM$$LogEntry.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LogEntry\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogEntry\[S, D]ImplicitThis member is added by an implicit conversion from LogEntry\[S, D] toEnsuring\[LogEntry\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/FSM$$LogEntry.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LogEntry\[S, D]ImplicitThis member is added by an implicit conversion from LogEntry\[S, D] toEnsuring\[LogEntry\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/FSM$$LogEntry.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LogEntry\[S, D]ImplicitThis member is added by an implicit conversion from LogEntry\[S, D] toEnsuring\[LogEntry\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/FSM$$LogEntry.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/FSM$$LogEntry.html#event:Any "Permalink")  val event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)
14. [**](../../akka/actor/FSM$$LogEntry.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/FSM$$LogEntry.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/actor/FSM$$LogEntry.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/actor/FSM$$LogEntry.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/actor/FSM$$LogEntry.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/FSM$$LogEntry.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/actor/FSM$$LogEntry.html#stateData:D "Permalink")  val stateData: D
21. [**](../../akka/actor/FSM$$LogEntry.html#stateName:S "Permalink")  val stateName: S
22. [**](../../akka/actor/FSM$$LogEntry.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/actor/FSM$$LogEntry.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/actor/FSM$$LogEntry.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/actor/FSM$$LogEntry.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/FSM$$LogEntry.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/FSM$$LogEntry.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LogEntry\[S, D] toStringFormat\[LogEntry\[S, D]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/FSM$$LogEntry.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LogEntry\[S, D], B)ImplicitThis member is added by an implicit conversion from LogEntry\[S, D] toArrowAssoc\[LogEntry\[S, D]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLogEntry\[S, D] to any2stringadd\[LogEntry\[S, D]]

### Inherited by implicit conversion StringFormat fromLogEntry\[S, D] to StringFormat\[LogEntry\[S, D]]

### Inherited by implicit conversion Ensuring fromLogEntry\[S, D] to Ensuring\[LogEntry\[S, D]]

### Inherited by implicit conversion ArrowAssoc fromLogEntry\[S, D] to ArrowAssoc\[LogEntry\[S, D]]

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
- https://doc.akka.io/api/akka/current/akka/actor/LoggingFSM.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/FSM$$LogEntry.html](https://doc.akka.io/api/akka/current/akka/actor/FSM$$LogEntry.html)*