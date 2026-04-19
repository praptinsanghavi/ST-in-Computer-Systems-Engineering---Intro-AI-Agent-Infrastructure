---
description: Akka 2.10.17 - akka.japi.pf.FSMStopBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:21:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/pf/FSMStopBuilder.html
title: Akka 2.10.17 - akka.japi.pf.FSMStopBuilder
---

# Akka 2.10.17 - akka.japi.pf.FSMStopBuilder

> **Summary:** Akka 2.10.17 - akka.japi.pf.FSMStopBuilder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/japi/index.html "Permalink")  package [japi](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/japi/pf/index.html "Permalink")  package [pf](index.html)Definition Classes[japi](../index.html)
- [DeciderBuilder](DeciderBuilder.html "Used for building a partial function for Actor.supervisorStrategy().")
- [FI](FI.html "Class that encapsulates Functional Interfaces used for creating partial functions.")
- [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "Builder used to create a partial function for akka.actor.FSM#whenUnhandled.")
- FSMStopBuilder
- [FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "Builder used to create a partial function for akka.actor.FSM#onTransition.")
- [Match](Match.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [PFBuilder](PFBuilder.html "A builder for scala.PartialFunction.")
- [ReceiveBuilder](ReceiveBuilder.html "Used for building a partial function for AbstractActor.createReceive().")
- [UnitMatch](UnitMatch.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [UnitPFBuilder](UnitPFBuilder.html "A builder for scala.PartialFunction.")
c[akka](../../index.html).[japi](../index.html).[pf](index.html)

# FSMStopBuilder[**](../../../akka/japi/pf/FSMStopBuilder.html "Permalink")

### 

#### class FSMStopBuilder\[S, D] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Builder used to create a partial function for `[akka.actor.FSM#onTermination](../../actor/FSM.html#onTermination(terminationHandler:PartialFunction[FSM.this.StopEvent,Unit]):Unit)`.

Source[FSMStopBuilder.java](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/java/akka/japi/pf/FSMStopBuilder.java#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FSMStopBuilder
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

1. [**](../../../akka/japi/pf/FSMStopBuilder.html#<init>():akka.japi.pf.FSMStopBuilder[S,D] "Permalink")  new FSMStopBuilder()
### Value Members

1. [**](../../../akka/japi/pf/FSMStopBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/japi/pf/FSMStopBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/japi/pf/FSMStopBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FSMStopBuilder\[S, D] toany2stringadd\[FSMStopBuilder\[S, D]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/japi/pf/FSMStopBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FSMStopBuilder\[S, D], B)ImplicitThis member is added by an implicit conversion from FSMStopBuilder\[S, D] toArrowAssoc\[FSMStopBuilder\[S, D]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/japi/pf/FSMStopBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/japi/pf/FSMStopBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/japi/pf/FSMStopBuilder.html#build():PartialFunction[akka.actor.FSM.StopEvent[S,D],scala.runtime.BoxedUnit] "Permalink")  def build(): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[StopEvent](../../actor/FSM$$StopEvent.html)\[S, D], [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder.

Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder. After this call the builder will be
reset.

returnsa PartialFunction for this builder.
8. [**](../../../akka/japi/pf/FSMStopBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/japi/pf/FSMStopBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FSMStopBuilder\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FSMStopBuilder\[S, D]ImplicitThis member is added by an implicit conversion from FSMStopBuilder\[S, D] toEnsuring\[FSMStopBuilder\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/japi/pf/FSMStopBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FSMStopBuilder\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FSMStopBuilder\[S, D]ImplicitThis member is added by an implicit conversion from FSMStopBuilder\[S, D] toEnsuring\[FSMStopBuilder\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/japi/pf/FSMStopBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FSMStopBuilder\[S, D]ImplicitThis member is added by an implicit conversion from FSMStopBuilder\[S, D] toEnsuring\[FSMStopBuilder\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/japi/pf/FSMStopBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FSMStopBuilder\[S, D]ImplicitThis member is added by an implicit conversion from FSMStopBuilder\[S, D] toEnsuring\[FSMStopBuilder\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/japi/pf/FSMStopBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/japi/pf/FSMStopBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/japi/pf/FSMStopBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/japi/pf/FSMStopBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/japi/pf/FSMStopBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/japi/pf/FSMStopBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/japi/pf/FSMStopBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/japi/pf/FSMStopBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/japi/pf/FSMStopBuilder.html#stop[P<:akka.actor.FSM.Reason](reasonType:Class[P],predicate:akka.japi.pf.FI.TypedPredicate[P],apply:akka.japi.pf.FI.UnitApply3[P,S,D]):akka.japi.pf.FSMStopBuilder[S,D] "Permalink")  def stop\[P \<: [Reason](../../actor/FSM$$Reason.html)](reasonType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], predicate: TypedPredicate\[P], apply: UnitApply3\[P, S, D]): FSMStopBuilder\[S, D]Add a case statement that matches on a reason type and a predicate.

Add a case statement that matches on a reason type and a predicate.

reasonTypethe reason type to match on

predicatea predicate that will be evaluated on the reason if the type matches

applyan action to apply to the reason, event and state data if there is a match

returnsthe builder with the case statement added
22. [**](../../../akka/japi/pf/FSMStopBuilder.html#stop[P<:akka.actor.FSM.Reason](reasonType:Class[P],apply:akka.japi.pf.FI.UnitApply3[P,S,D]):akka.japi.pf.FSMStopBuilder[S,D] "Permalink")  def stop\[P \<: [Reason](../../actor/FSM$$Reason.html)](reasonType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], apply: UnitApply3\[P, S, D]): FSMStopBuilder\[S, D]Add a case statement that matches on a reason type.

Add a case statement that matches on a reason type.

reasonTypethe reason type to match on

applyan action to apply to the reason, event and state data if there is a match

returnsthe builder with the case statement added
23. [**](../../../akka/japi/pf/FSMStopBuilder.html#stop(reason:akka.actor.FSM.Reason,apply:akka.japi.pf.FI.UnitApply2[S,D]):akka.japi.pf.FSMStopBuilder[S,D] "Permalink")  def stop(reason: [Reason](../../actor/FSM$$Reason.html), apply: UnitApply2\[S, D]): FSMStopBuilder\[S, D]Add a case statement that matches on an `FSM.Reason`.

Add a case statement that matches on an `FSM.Reason`.

reasonthe reason for the termination

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
24. [**](../../../akka/japi/pf/FSMStopBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/japi/pf/FSMStopBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/japi/pf/FSMStopBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/japi/pf/FSMStopBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/japi/pf/FSMStopBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/japi/pf/FSMStopBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/japi/pf/FSMStopBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FSMStopBuilder\[S, D] toStringFormat\[FSMStopBuilder\[S, D]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/japi/pf/FSMStopBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FSMStopBuilder\[S, D], B)ImplicitThis member is added by an implicit conversion from FSMStopBuilder\[S, D] toArrowAssoc\[FSMStopBuilder\[S, D]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFSMStopBuilder\[S, D] to any2stringadd\[FSMStopBuilder\[S, D]]

### Inherited by implicit conversion StringFormat fromFSMStopBuilder\[S, D] to StringFormat\[FSMStopBuilder\[S, D]]

### Inherited by implicit conversion Ensuring fromFSMStopBuilder\[S, D] to Ensuring\[FSMStopBuilder\[S, D]]

### Inherited by implicit conversion ArrowAssoc fromFSMStopBuilder\[S, D] to ArrowAssoc\[FSMStopBuilder\[S, D]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/FSM$$Reason.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$StopEvent.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/index.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/DeciderBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/FI.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/FSMStateFunctionBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/FSMStopBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/FSMTransitionHandlerBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/Match.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/ReceiveBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/UnitMatch.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/UnitPFBuilder.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/japi/pf/FSMStopBuilder.html](https://doc.akka.io/api/akka/current/akka/japi/pf/FSMStopBuilder.html)*