---
description: Akka 2.10.17 - akka.actor.FSM.TransformHelper
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/FSM$TransformHelper.html
title: Akka 2.10.17 - akka.actor.FSM.TransformHelper
---

# Akka 2.10.17 - akka.actor.FSM.TransformHelper

> **Summary:** Akka 2.10.17 - akka.actor.FSM.TransformHelper

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/FSM.html "Permalink")  trait [FSM](FSM.html "Finite State Machine actor trait.")\[S, D] extends [Actor](Actor.html) with [Listeners](../routing/Listeners.html) with [ActorLogging](ActorLogging.html)Finite State Machine actor trait.

Finite State Machine actor trait. Use as follows:

```

  object A {
    trait State
    case class One extends State
    case class Two extends State

    case class Data(i : Int)
  }

  class A extends Actor with FSM[A.State, A.Data] {
    import A._

    startWith(One, Data(42))
    when(One) {
        case Event(SomeMsg, Data(x)) => ...
        case Event(SomeOtherMsg, _) => ... // when data not needed
    }
    when(Two, stateTimeout = 5 seconds) { ... }
    initialize()
  }

```
Within the partial function the following values are returned for effecting
state transitions:

	- `stay` for staying in the same state
	- `stay using Data(...)` for staying in the same state, but with
	 different data
	- `stay forMax 5.millis` for staying with a state timeout; can be
	 combined with `using`
	- `goto(...)` for changing into a different state; also supports
	 `using` and `forMax`
	- `stop` for terminating this FSM actorEach of the above also supports the method `replying(AnyRef)` for
sending a reply before changing state.

While changing state, custom handlers may be invoked which are registered
using `onTransition`. This is meant to enable concentrating
different concerns in different places; you may choose to use
`when` for describing the properties of a state, including of
course initiating transitions, but you can describe the transitions using
`onTransition` to avoid having to duplicate that code among
multiple paths which lead to a transition:

```

onTransition {
  case Active -> _ => cancelTimer("activeTimer")
}

```
Multiple such blocks are supported and all of them will be called, not only
the first matching one.

Another feature is that other actors may subscribe for transition events by
sending a `SubscribeTransitionCallback` message to this actor.
Stopping a listener without unregistering will not remove the listener from the
subscription list; use `UnsubscribeTransitionCallback` before stopping
the listener.

State timeouts set an upper bound to the time which may pass before another
message is received in the current state. If no external message is
available, then upon expiry of the timeout a StateTimeout message is sent.
Note that this message will only be received in the state for which the
timeout was set and that any message received will cancel the timeout
(possibly to be started again by the next transition).

Another feature is the ability to install and cancel single\-shot as well as
repeated timers which arrange for the sending of a user\-specified message:

```

  setTimer("tock", TockMsg, 1 second, true) // repeating
  setTimer("lifetime", TerminateMsg, 1 hour, false) // single-shot
  cancelTimer("tock")
  isTimerActive("tock")

```

Definition Classes[actor](index.html)
- TransformHelper
c[akka](../index.html).[actor](index.html).[FSM](FSM.html)

# TransformHelper[**](../../akka/actor/FSM$TransformHelper.html "Permalink")

### 

#### final  class TransformHelper extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[FSM.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/FSM.scala#L519)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TransformHelper
2. AnyRef
3. Any
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

1. [**](../../akka/actor/FSM$TransformHelper.html#<init>(func:FSM.this.StateFunction):FSM.this.TransformHelper "Permalink")  new TransformHelper(func: [StateFunction](FSM.html#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State]))
### Value Members

1. [**](../../akka/actor/FSM$TransformHelper.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/FSM$TransformHelper.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/FSM$TransformHelper.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TransformHelper toany2stringadd\[TransformHelper] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/FSM$TransformHelper.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TransformHelper, B)ImplicitThis member is added by an implicit conversion from TransformHelper toArrowAssoc\[TransformHelper] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/FSM$TransformHelper.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/FSM$TransformHelper.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/FSM$TransformHelper.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/FSM$TransformHelper.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TransformHelper) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TransformHelperImplicitThis member is added by an implicit conversion from TransformHelper toEnsuring\[TransformHelper] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/FSM$TransformHelper.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TransformHelper) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TransformHelperImplicitThis member is added by an implicit conversion from TransformHelper toEnsuring\[TransformHelper] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/FSM$TransformHelper.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TransformHelperImplicitThis member is added by an implicit conversion from TransformHelper toEnsuring\[TransformHelper] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/FSM$TransformHelper.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TransformHelperImplicitThis member is added by an implicit conversion from TransformHelper toEnsuring\[TransformHelper] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/FSM$TransformHelper.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/FSM$TransformHelper.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/actor/FSM$TransformHelper.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/FSM$TransformHelper.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/FSM$TransformHelper.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/actor/FSM$TransformHelper.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/actor/FSM$TransformHelper.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/FSM$TransformHelper.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/FSM$TransformHelper.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/actor/FSM$TransformHelper.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/actor/FSM$TransformHelper.html#using(andThen:PartialFunction[FSM.this.State,FSM.this.State]):FSM.this.StateFunction "Permalink")  def using(andThen: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[State](FSM.html#State=akka.actor.FSM.State[S,D]), [State](FSM.html#State=akka.actor.FSM.State[S,D])]): [StateFunction](FSM.html#StateFunction=PartialFunction[FSM.this.Event,FSM.this.State])
23. [**](../../akka/actor/FSM$TransformHelper.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/actor/FSM$TransformHelper.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/actor/FSM$TransformHelper.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/FSM$TransformHelper.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/FSM$TransformHelper.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TransformHelper toStringFormat\[TransformHelper] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/FSM$TransformHelper.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TransformHelper, B)ImplicitThis member is added by an implicit conversion from TransformHelper toArrowAssoc\[TransformHelper] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTransformHelper to any2stringadd\[TransformHelper]

### Inherited by implicit conversion StringFormat fromTransformHelper to StringFormat\[TransformHelper]

### Inherited by implicit conversion Ensuring fromTransformHelper to Ensuring\[TransformHelper]

### Inherited by implicit conversion ArrowAssoc fromTransformHelper to ArrowAssoc\[TransformHelper]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$TransformHelper.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Listeners.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$TransformHelper.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/FSM$TransformHelper.html)*