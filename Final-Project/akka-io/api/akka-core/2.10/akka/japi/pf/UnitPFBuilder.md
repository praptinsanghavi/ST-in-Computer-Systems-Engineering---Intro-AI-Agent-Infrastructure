---
description: Akka 2.10.17 - akka.japi.pf.UnitPFBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:51:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/pf/UnitPFBuilder.html
title: Akka 2.10.17 - akka.japi.pf.UnitPFBuilder
---

# Akka 2.10.17 - akka.japi.pf.UnitPFBuilder

> **Summary:** Akka 2.10.17 - akka.japi.pf.UnitPFBuilder

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
- [FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "Builder used to create a partial function for akka.actor.FSM#onTransition.")
- [Match](Match.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [PFBuilder](PFBuilder.html "A builder for scala.PartialFunction.")
- [ReceiveBuilder](ReceiveBuilder.html "Used for building a partial function for AbstractActor.createReceive().")
- [UnitMatch](UnitMatch.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- UnitPFBuilder
c[akka](../../index.html).[japi](../index.html).[pf](index.html)

# UnitPFBuilder[**](../../../akka/japi/pf/UnitPFBuilder.html "Permalink")

### 

#### final  class UnitPFBuilder\[I] extends AbstractPFBuilder\[I, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]

A builder for `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)`. This is a specialized version of `[PFBuilder](PFBuilder.html)`
to map java void methods to `[scala.runtime.BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html)`.

Source[UnitPFBuilder.java](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/java/akka/japi/pf/UnitPFBuilder.java#L15)Linear SupertypesAbstractPFBuilder\[I, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UnitPFBuilder
2. AbstractPFBuilder
3. AnyRef
4. Any
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

1. [**](../../../akka/japi/pf/UnitPFBuilder.html#<init>():akka.japi.pf.UnitPFBuilder[I] "Permalink")  new UnitPFBuilder()
### Value Members

1. [**](../../../akka/japi/pf/UnitPFBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/japi/pf/UnitPFBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/japi/pf/UnitPFBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UnitPFBuilder\[I] toany2stringadd\[UnitPFBuilder\[I]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/japi/pf/UnitPFBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UnitPFBuilder\[I], B)ImplicitThis member is added by an implicit conversion from UnitPFBuilder\[I] toArrowAssoc\[UnitPFBuilder\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/japi/pf/UnitPFBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/japi/pf/UnitPFBuilder.html#addStatement(statement:PartialFunction[F,T]):Unit "Permalink")  def addStatement(statement: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[I, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[[pf](index.html)] Definition ClassesAbstractPFBuilder
7. [**](../../../akka/japi/pf/UnitPFBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/japi/pf/UnitPFBuilder.html#build():PartialFunction[F,T] "Permalink")  def build(): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[I, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder.

Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder. After this call the builder will be
reset.

returnsa PartialFunction for this builder.

Definition ClassesAbstractPFBuilder
9. [**](../../../akka/japi/pf/UnitPFBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/japi/pf/UnitPFBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UnitPFBuilder\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnitPFBuilder\[I]ImplicitThis member is added by an implicit conversion from UnitPFBuilder\[I] toEnsuring\[UnitPFBuilder\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/japi/pf/UnitPFBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UnitPFBuilder\[I]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnitPFBuilder\[I]ImplicitThis member is added by an implicit conversion from UnitPFBuilder\[I] toEnsuring\[UnitPFBuilder\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/japi/pf/UnitPFBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnitPFBuilder\[I]ImplicitThis member is added by an implicit conversion from UnitPFBuilder\[I] toEnsuring\[UnitPFBuilder\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/japi/pf/UnitPFBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnitPFBuilder\[I]ImplicitThis member is added by an implicit conversion from UnitPFBuilder\[I] toEnsuring\[UnitPFBuilder\[I]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/japi/pf/UnitPFBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/japi/pf/UnitPFBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/japi/pf/UnitPFBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/japi/pf/UnitPFBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/japi/pf/UnitPFBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/japi/pf/UnitPFBuilder.html#match[P](type:Class[P],predicate:akka.japi.pf.FI.TypedPredicate[P],apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.UnitPFBuilder[I] "Permalink")  def match\[P](type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], predicate: TypedPredicate\[P], apply: UnitApply\[P]): UnitPFBuilder\[I]Add a new case statement to this builder.

Add a new case statement to this builder.

typea type to match the argument against

predicatea predicate that will be evaluated on the argument if the type matches

applyan action to apply to the argument if the type matches and the predicate returns
 true

returnsa builder with the case statement added
20. [**](../../../akka/japi/pf/UnitPFBuilder.html#match[P](type:Class[P],apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.UnitPFBuilder[I] "Permalink")  def match\[P](type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], apply: UnitApply\[P]): UnitPFBuilder\[I]Add a new case statement to this builder.

Add a new case statement to this builder.

typea type to match the argument against

applyan action to apply to the argument if the type matches

returnsa builder with the case statement added
21. [**](../../../akka/japi/pf/UnitPFBuilder.html#matchAny(apply:akka.japi.pf.FI.UnitApply[Object]):akka.japi.pf.UnitPFBuilder[I] "Permalink")  def matchAny(apply: UnitApply\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): UnitPFBuilder\[I]Add a new case statement to this builder, that matches any argument.

Add a new case statement to this builder, that matches any argument.

applyan action to apply to the argument

returnsa builder with the case statement added
22. [**](../../../akka/japi/pf/UnitPFBuilder.html#matchEquals[P](object:P,predicate:akka.japi.pf.FI.TypedPredicate[P],apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.UnitPFBuilder[I] "Permalink")  def matchEquals\[P](object: P, predicate: TypedPredicate\[P], apply: UnitApply\[P]): UnitPFBuilder\[I]Add a new case statement to this builder.

Add a new case statement to this builder.

objectthe object to compare equals with

predicatea predicate that will be evaluated on the argument if the object compares
 equal

applyan action to apply to the argument if the object compares equal

returnsa builder with the case statement added
23. [**](../../../akka/japi/pf/UnitPFBuilder.html#matchEquals[P](object:P,apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.UnitPFBuilder[I] "Permalink")  def matchEquals\[P](object: P, apply: UnitApply\[P]): UnitPFBuilder\[I]Add a new case statement to this builder.

Add a new case statement to this builder.

objectthe object to compare equals with

applyan action to apply to the argument if the object compares equal

returnsa builder with the case statement added
24. [**](../../../akka/japi/pf/UnitPFBuilder.html#matchUnchecked(type:Class[_],predicate:akka.japi.pf.FI.TypedPredicate[_],apply:akka.japi.pf.FI.UnitApply[_]):akka.japi.pf.UnitPFBuilder[I] "Permalink")  def matchUnchecked(type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], predicate: TypedPredicate\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], apply: UnitApply\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): UnitPFBuilder\[I]Add a new case statement to this builder without compile time type check.

Add a new case statement to this builder without compile time type check. Should normally not
be used, but when matching on class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.

typea type to match the argument against

predicatea predicate that will be evaluated on the argument if the type matches

applyan action to apply to the argument if the type matches and the predicate returns
 true

returnsa builder with the case statement added

Annotations@SuppressWarnings()
25. [**](../../../akka/japi/pf/UnitPFBuilder.html#matchUnchecked(type:Class[_],apply:akka.japi.pf.FI.UnitApply[_]):akka.japi.pf.UnitPFBuilder[I] "Permalink")  def matchUnchecked(type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], apply: UnitApply\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): UnitPFBuilder\[I]Add a new case statement to this builder without compile time type check.

Add a new case statement to this builder without compile time type check. Should normally not
be used, but when matching on class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.

typea type to match the argument against

applyan action to apply to the argument if the type matches

returnsa builder with the case statement added

Annotations@SuppressWarnings()
26. [**](../../../akka/japi/pf/UnitPFBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/japi/pf/UnitPFBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/japi/pf/UnitPFBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/japi/pf/UnitPFBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../akka/japi/pf/UnitPFBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../akka/japi/pf/UnitPFBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../akka/japi/pf/UnitPFBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../akka/japi/pf/UnitPFBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/japi/pf/UnitPFBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/japi/pf/UnitPFBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UnitPFBuilder\[I] toStringFormat\[UnitPFBuilder\[I]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/japi/pf/UnitPFBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UnitPFBuilder\[I], B)ImplicitThis member is added by an implicit conversion from UnitPFBuilder\[I] toArrowAssoc\[UnitPFBuilder\[I]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from AbstractPFBuilder\[I, [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnitPFBuilder\[I] to any2stringadd\[UnitPFBuilder\[I]]

### Inherited by implicit conversion StringFormat fromUnitPFBuilder\[I] to StringFormat\[UnitPFBuilder\[I]]

### Inherited by implicit conversion Ensuring fromUnitPFBuilder\[I] to Ensuring\[UnitPFBuilder\[I]]

### Inherited by implicit conversion ArrowAssoc fromUnitPFBuilder\[I] to ArrowAssoc\[UnitPFBuilder\[I]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/DeciderBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/FI.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/FSMStateFunctionBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/FSMStopBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/FSMTransitionHandlerBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/Match.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/ReceiveBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/UnitMatch.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/UnitPFBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/UnitPFBuilder.html](https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/UnitPFBuilder.html)*