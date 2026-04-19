---
description: Akka 2.10.17 - akka.japi.pf.FSMTransitionHandlerBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:57:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/pf/FSMTransitionHandlerBuilder.html
title: Akka 2.10.17 - akka.japi.pf.FSMTransitionHandlerBuilder
---

# Akka 2.10.17 - akka.japi.pf.FSMTransitionHandlerBuilder

> **Summary:** Akka 2.10.17 - akka.japi.pf.FSMTransitionHandlerBuilder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/japi/index.html "Permalink")  package [japi](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/japi/pf/index.html "Permalink")  package [pf](index.html)Definition Classes[japi](../index.html)
- [DeciderBuilder](DeciderBuilder.html "Used for building a partial function for Actor.supervisorStrategy().")
- [FI](FI.html "Class that encapsulates Functional Interfaces used for creating partial functions.")
- [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "Builder used to create a partial function for akka.actor.FSM#whenUnhandled.")
- [FSMStopBuilder](FSMStopBuilder.html "Builder used to create a partial function for akka.actor.FSM#onTermination.")
- FSMTransitionHandlerBuilder
- [Match](Match.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [PFBuilder](PFBuilder.html "A builder for scala.PartialFunction.")
- [ReceiveBuilder](ReceiveBuilder.html "Used for building a partial function for AbstractActor.createReceive().")
- [UnitMatch](UnitMatch.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [UnitPFBuilder](UnitPFBuilder.html "A builder for scala.PartialFunction.")
c[akka](../../index.html).[japi](../index.html).[pf](index.html)

# FSMTransitionHandlerBuilder[**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html "Permalink")

### 

#### class FSMTransitionHandlerBuilder\[S] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Builder used to create a partial function for `[akka.actor.FSM#onTransition](../../actor/FSM.html#onTransition(transitionHandler:FSM.this.TransitionHandler):Unit)`.

Source[FSMTransitionHandlerBuilder.java](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/java/akka/japi/pf/FSMTransitionHandlerBuilder.java#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FSMTransitionHandlerBuilder
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

1. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#<init>():akka.japi.pf.FSMTransitionHandlerBuilder[S] "Permalink")  new FSMTransitionHandlerBuilder()
### Value Members

1. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FSMTransitionHandlerBuilder\[S] toany2stringadd\[FSMTransitionHandlerBuilder\[S]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FSMTransitionHandlerBuilder\[S], B)ImplicitThis member is added by an implicit conversion from FSMTransitionHandlerBuilder\[S] toArrowAssoc\[FSMTransitionHandlerBuilder\[S]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#build():PartialFunction[(S,S),scala.runtime.BoxedUnit] "Permalink")  def build(): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[(S, S), [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder.

Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder. After this call the builder will be
reset.

returnsa PartialFunction for this builder.
8. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FSMTransitionHandlerBuilder\[S]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FSMTransitionHandlerBuilder\[S]ImplicitThis member is added by an implicit conversion from FSMTransitionHandlerBuilder\[S] toEnsuring\[FSMTransitionHandlerBuilder\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FSMTransitionHandlerBuilder\[S]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FSMTransitionHandlerBuilder\[S]ImplicitThis member is added by an implicit conversion from FSMTransitionHandlerBuilder\[S] toEnsuring\[FSMTransitionHandlerBuilder\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FSMTransitionHandlerBuilder\[S]ImplicitThis member is added by an implicit conversion from FSMTransitionHandlerBuilder\[S] toEnsuring\[FSMTransitionHandlerBuilder\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FSMTransitionHandlerBuilder\[S]ImplicitThis member is added by an implicit conversion from FSMTransitionHandlerBuilder\[S] toEnsuring\[FSMTransitionHandlerBuilder\[S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#state(fromState:S,toState:S,apply:akka.japi.pf.FI.UnitApply2[S,S]):akka.japi.pf.FSMTransitionHandlerBuilder[S] "Permalink")  def state(fromState: S, toState: S, apply: UnitApply2\[S, S]): FSMTransitionHandlerBuilder\[S]Add a case statement that matches on a from state and a to state.

Add a case statement that matches on a from state and a to state.

fromStatethe from state to match on, or null for any

toStatethe to state to match on, or null for any

applyan action to apply when the states match

returnsthe builder with the case statement added
22. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#state(fromState:S,toState:S,apply:akka.japi.pf.FI.UnitApplyVoid):akka.japi.pf.FSMTransitionHandlerBuilder[S] "Permalink")  def state(fromState: S, toState: S, apply: UnitApplyVoid): FSMTransitionHandlerBuilder\[S]Add a case statement that matches on a from state and a to state.

Add a case statement that matches on a from state and a to state.

fromStatethe from state to match on, or null for any

toStatethe to state to match on, or null for any

applyan action to apply when the states match

returnsthe builder with the case statement added
23. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FSMTransitionHandlerBuilder\[S] toStringFormat\[FSMTransitionHandlerBuilder\[S]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/japi/pf/FSMTransitionHandlerBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FSMTransitionHandlerBuilder\[S], B)ImplicitThis member is added by an implicit conversion from FSMTransitionHandlerBuilder\[S] toArrowAssoc\[FSMTransitionHandlerBuilder\[S]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFSMTransitionHandlerBuilder\[S] to any2stringadd\[FSMTransitionHandlerBuilder\[S]]

### Inherited by implicit conversion StringFormat fromFSMTransitionHandlerBuilder\[S] to StringFormat\[FSMTransitionHandlerBuilder\[S]]

### Inherited by implicit conversion Ensuring fromFSMTransitionHandlerBuilder\[S] to Ensuring\[FSMTransitionHandlerBuilder\[S]]

### Inherited by implicit conversion ArrowAssoc fromFSMTransitionHandlerBuilder\[S] to ArrowAssoc\[FSMTransitionHandlerBuilder\[S]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/FSM.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/DeciderBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/FI.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/FSMStateFunctionBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/FSMStopBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/FSMTransitionHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/Match.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/ReceiveBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/UnitMatch.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/UnitPFBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/FSMTransitionHandlerBuilder.html](https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/FSMTransitionHandlerBuilder.html)*