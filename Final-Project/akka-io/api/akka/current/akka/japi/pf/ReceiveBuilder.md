---
description: Akka 2.10.17 - akka.japi.pf.ReceiveBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:20:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/pf/ReceiveBuilder.html
title: Akka 2.10.17 - akka.japi.pf.ReceiveBuilder
---

# Akka 2.10.17 - akka.japi.pf.ReceiveBuilder

> **Summary:** Akka 2.10.17 - akka.japi.pf.ReceiveBuilder

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
- ReceiveBuilder
- [UnitMatch](UnitMatch.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [UnitPFBuilder](UnitPFBuilder.html "A builder for scala.PartialFunction.")
c[akka](../../index.html).[japi](../index.html).[pf](index.html)

# ReceiveBuilder[**](../../../akka/japi/pf/ReceiveBuilder.html "Permalink")

### 

#### class ReceiveBuilder extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Used for building a partial function for `AbstractActor.createReceive()`.

There is both a match on type only, and a match on type and predicate.

Inside an actor you can use it like this:

Example:

```

@Override
public Receive createReceive() {
  return receiveBuilder()
    .match(Double.class, d -> {
      getSender().tell(d.isNaN() ? 0 : d, self());
    })
    .match(Integer.class, i -> {
      getSender().tell(i * 10, self());
    })
    .match(String.class, s -> s.startsWith("foo"), s -> {
      getSender().tell(s.toUpperCase(), self());
    })
    .build()
  );
}

```

Source[ReceiveBuilder.java](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/java/akka/japi/pf/ReceiveBuilder.java#L39)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReceiveBuilder
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

1. [**](../../../akka/japi/pf/ReceiveBuilder.html#<init>():akka.japi.pf.ReceiveBuilder "Permalink")  new ReceiveBuilder()
### Value Members

1. [**](../../../akka/japi/pf/ReceiveBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/japi/pf/ReceiveBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/japi/pf/ReceiveBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReceiveBuilder toany2stringadd\[ReceiveBuilder] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/japi/pf/ReceiveBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReceiveBuilder, B)ImplicitThis member is added by an implicit conversion from ReceiveBuilder toArrowAssoc\[ReceiveBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/japi/pf/ReceiveBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/japi/pf/ReceiveBuilder.html#addStatement(statement:PartialFunction[Object,scala.runtime.BoxedUnit]):Unit "Permalink")  def addStatement(statement: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [BoxedUnit](https://www.scala-lang.org/api/2.13.17/scala/runtime/BoxedUnit.html#scala.runtime.BoxedUnit)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[[pf](index.html)]
7. [**](../../../akka/japi/pf/ReceiveBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/japi/pf/ReceiveBuilder.html#build():akka.actor.AbstractActor.Receive "Permalink")  def build(): [Receive](../../actor/AbstractActor$$Receive.html)Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder.

Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder. After this call the builder will be
reset.

returnsa PartialFunction for this builder.
9. [**](../../../akka/japi/pf/ReceiveBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/japi/pf/ReceiveBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReceiveBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceiveBuilderImplicitThis member is added by an implicit conversion from ReceiveBuilder toEnsuring\[ReceiveBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/japi/pf/ReceiveBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReceiveBuilder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceiveBuilderImplicitThis member is added by an implicit conversion from ReceiveBuilder toEnsuring\[ReceiveBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/japi/pf/ReceiveBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceiveBuilderImplicitThis member is added by an implicit conversion from ReceiveBuilder toEnsuring\[ReceiveBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/japi/pf/ReceiveBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceiveBuilderImplicitThis member is added by an implicit conversion from ReceiveBuilder toEnsuring\[ReceiveBuilder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/japi/pf/ReceiveBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/japi/pf/ReceiveBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/japi/pf/ReceiveBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/japi/pf/ReceiveBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/japi/pf/ReceiveBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/japi/pf/ReceiveBuilder.html#match[P](type:Class[P],externalPredicate:java.util.function.BooleanSupplier,apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.ReceiveBuilder "Permalink")  def match\[P](type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], externalPredicate: [BooleanSupplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BooleanSupplier.html#java.util.function.BooleanSupplier), apply: UnitApply\[P]): ReceiveBuilderAdd a new case statement to this builder.

Add a new case statement to this builder.

typea type to match the argument against

externalPredicatea external predicate that will be evaluated if the type matches

applyan action to apply to the argument if the type matches and the predicate returns
 true

returnsa builder with the case statement added
20. [**](../../../akka/japi/pf/ReceiveBuilder.html#match[P](type:Class[P],predicate:akka.japi.pf.FI.TypedPredicate[P],apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.ReceiveBuilder "Permalink")  def match\[P](type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], predicate: TypedPredicate\[P], apply: UnitApply\[P]): ReceiveBuilderAdd a new case statement to this builder.

Add a new case statement to this builder.

typea type to match the argument against

predicatea predicate that will be evaluated on the argument if the type matches

applyan action to apply to the argument if the type matches and the predicate returns
 true

returnsa builder with the case statement added
21. [**](../../../akka/japi/pf/ReceiveBuilder.html#match[P](type:Class[P],apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.ReceiveBuilder "Permalink")  def match\[P](type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], apply: UnitApply\[P]): ReceiveBuilderAdd a new case statement to this builder.

Add a new case statement to this builder.

typea type to match the argument against

applyan action to apply to the argument if the type matches

returnsa builder with the case statement added
22. [**](../../../akka/japi/pf/ReceiveBuilder.html#matchAny(externalPredicate:java.util.function.BooleanSupplier,apply:akka.japi.pf.FI.UnitApply[Object]):akka.japi.pf.ReceiveBuilder "Permalink")  def matchAny(externalPredicate: [BooleanSupplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BooleanSupplier.html#java.util.function.BooleanSupplier), apply: UnitApply\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): ReceiveBuilderAdd a new case statement to this builder, that pass the test of the predicate.

Add a new case statement to this builder, that pass the test of the predicate.

externalPredicatean external predicate that will always be evaluated.

applyan action to apply to the argument

returnsa builder with the case statement added
23. [**](../../../akka/japi/pf/ReceiveBuilder.html#matchAny(apply:akka.japi.pf.FI.UnitApply[Object]):akka.japi.pf.ReceiveBuilder "Permalink")  def matchAny(apply: UnitApply\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): ReceiveBuilderAdd a new case statement to this builder, that matches any argument.

Add a new case statement to this builder, that matches any argument.

applyan action to apply to the argument

returnsa builder with the case statement added
24. [**](../../../akka/japi/pf/ReceiveBuilder.html#matchEquals[P](object:P,externalPredicate:java.util.function.BooleanSupplier,apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.ReceiveBuilder "Permalink")  def matchEquals\[P](object: P, externalPredicate: [BooleanSupplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BooleanSupplier.html#java.util.function.BooleanSupplier), apply: UnitApply\[P]): ReceiveBuilderAdd a new case statement to this builder.

Add a new case statement to this builder.

objectthe object to compare equals with

externalPredicatean external predicate that will be evaluated if the object compares
 equal

applyan action to apply to the argument if the object compares equal

returnsa builder with the case statement added

Annotations@SuppressWarnings()
25. [**](../../../akka/japi/pf/ReceiveBuilder.html#matchEquals[P](object:P,predicate:akka.japi.pf.FI.TypedPredicate[P],apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.ReceiveBuilder "Permalink")  def matchEquals\[P](object: P, predicate: TypedPredicate\[P], apply: UnitApply\[P]): ReceiveBuilderAdd a new case statement to this builder.

Add a new case statement to this builder.

objectthe object to compare equals with

predicatea predicate that will be evaluated on the argument if the object compares
 equal

applyan action to apply to the argument if the object compares equal

returnsa builder with the case statement added
26. [**](../../../akka/japi/pf/ReceiveBuilder.html#matchEquals[P](object:P,apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.ReceiveBuilder "Permalink")  def matchEquals\[P](object: P, apply: UnitApply\[P]): ReceiveBuilderAdd a new case statement to this builder.

Add a new case statement to this builder.

objectthe object to compare equals with

applyan action to apply to the argument if the object compares equal

returnsa builder with the case statement added
27. [**](../../../akka/japi/pf/ReceiveBuilder.html#matchUnchecked[P](type:Class[_],externalPredicate:java.util.function.BooleanSupplier,apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.ReceiveBuilder "Permalink")  def matchUnchecked\[P](type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], externalPredicate: [BooleanSupplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BooleanSupplier.html#java.util.function.BooleanSupplier), apply: UnitApply\[P]): ReceiveBuilderAdd a new case statement to this builder without compile time type check.

Add a new case statement to this builder without compile time type check. Should normally not
be used, but when matching on class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.

typea type to match the argument against

externalPredicatean external predicate that will be evaluated if the type matches

applyan action to apply to the argument if the type matches and the predicate returns
 true

returnsa builder with the case statement added

Annotations@SuppressWarnings()
28. [**](../../../akka/japi/pf/ReceiveBuilder.html#matchUnchecked[P](type:Class[_],predicate:akka.japi.pf.FI.TypedPredicate[_],apply:akka.japi.pf.FI.UnitApply[P]):akka.japi.pf.ReceiveBuilder "Permalink")  def matchUnchecked\[P](type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], predicate: TypedPredicate\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], apply: UnitApply\[P]): ReceiveBuilderAdd a new case statement to this builder without compile time type check.

Add a new case statement to this builder without compile time type check. Should normally not
be used, but when matching on class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.

typea type to match the argument against

predicatea predicate that will be evaluated on the argument if the type matches

applyan action to apply to the argument if the type matches and the predicate returns
 true

returnsa builder with the case statement added

Annotations@SuppressWarnings()
29. [**](../../../akka/japi/pf/ReceiveBuilder.html#matchUnchecked(type:Class[_],apply:akka.japi.pf.FI.UnitApply[_]):akka.japi.pf.ReceiveBuilder "Permalink")  def matchUnchecked(type: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], apply: UnitApply\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): ReceiveBuilderAdd a new case statement to this builder without compile time type check.

Add a new case statement to this builder without compile time type check. Should normally not
be used, but when matching on class with generic type argument it can be useful, e.g. `List.class` and `(List<String> list) -> {}`.

typea type to match the argument against

applyan action to apply to the argument if the type matches

returnsa builder with the case statement added

Annotations@SuppressWarnings()
30. [**](../../../akka/japi/pf/ReceiveBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../akka/japi/pf/ReceiveBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../akka/japi/pf/ReceiveBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../akka/japi/pf/ReceiveBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../akka/japi/pf/ReceiveBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../../akka/japi/pf/ReceiveBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../akka/japi/pf/ReceiveBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../../akka/japi/pf/ReceiveBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/japi/pf/ReceiveBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/japi/pf/ReceiveBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReceiveBuilder toStringFormat\[ReceiveBuilder] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/japi/pf/ReceiveBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReceiveBuilder, B)ImplicitThis member is added by an implicit conversion from ReceiveBuilder toArrowAssoc\[ReceiveBuilder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReceiveBuilder to any2stringadd\[ReceiveBuilder]

### Inherited by implicit conversion StringFormat fromReceiveBuilder to StringFormat\[ReceiveBuilder]

### Inherited by implicit conversion Ensuring fromReceiveBuilder to Ensuring\[ReceiveBuilder]

### Inherited by implicit conversion ArrowAssoc fromReceiveBuilder to ArrowAssoc\[ReceiveBuilder]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/AbstractActor$$Receive.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/japi/pf/ReceiveBuilder.html](https://doc.akka.io/api/akka/current/akka/japi/pf/ReceiveBuilder.html)*