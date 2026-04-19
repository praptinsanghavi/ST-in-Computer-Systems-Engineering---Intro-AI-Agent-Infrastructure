---
description: Akka 2.10.17 - akka.japi.pf.FSMStateFunctionBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:21:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/pf/FSMStateFunctionBuilder.html
title: Akka 2.10.17 - akka.japi.pf.FSMStateFunctionBuilder
---

# Akka 2.10.17 - akka.japi.pf.FSMStateFunctionBuilder

> **Summary:** Akka 2.10.17 - akka.japi.pf.FSMStateFunctionBuilder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/japi/index.html "Permalink")  package [japi](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/japi/pf/index.html "Permalink")  package [pf](index.html)Definition Classes[japi](../index.html)
- [DeciderBuilder](DeciderBuilder.html "Used for building a partial function for Actor.supervisorStrategy().")
- [FI](FI.html "Class that encapsulates Functional Interfaces used for creating partial functions.")
- FSMStateFunctionBuilder
- [FSMStopBuilder](FSMStopBuilder.html "Builder used to create a partial function for akka.actor.FSM#onTermination.")
- [FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "Builder used to create a partial function for akka.actor.FSM#onTransition.")
- [Match](Match.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [PFBuilder](PFBuilder.html "A builder for scala.PartialFunction.")
- [ReceiveBuilder](ReceiveBuilder.html "Used for building a partial function for AbstractActor.createReceive().")
- [UnitMatch](UnitMatch.html "Version of scala.PartialFunction that can be built during runtime from Java.")
- [UnitPFBuilder](UnitPFBuilder.html "A builder for scala.PartialFunction.")
c[akka](../../index.html).[japi](../index.html).[pf](index.html)

# FSMStateFunctionBuilder[**](../../../akka/japi/pf/FSMStateFunctionBuilder.html "Permalink")

### 

#### class FSMStateFunctionBuilder\[S, D] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Builder used to create a partial function for `[akka.actor.FSM#whenUnhandled](../../actor/FSM.html#whenUnhandled(stateFunction:FSM.this.StateFunction):Unit)`.

Annotations@SuppressWarnings() Source[FSMStateFunctionBuilder.java](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/java/akka/japi/pf/FSMStateFunctionBuilder.java#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FSMStateFunctionBuilder
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

1. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#<init>():akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  new FSMStateFunctionBuilder()
### Value Members

1. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FSMStateFunctionBuilder\[S, D] toany2stringadd\[FSMStateFunctionBuilder\[S, D]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FSMStateFunctionBuilder\[S, D], B)ImplicitThis member is added by an implicit conversion from FSMStateFunctionBuilder\[S, D] toArrowAssoc\[FSMStateFunctionBuilder\[S, D]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#anyEvent(apply:akka.japi.pf.FI.Apply2[Object,D,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  def anyEvent(apply: Apply2\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), D, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches on any type of event.

Add a case statement that matches on any type of event.

applyan action to apply to the event and state data

returnsthe builder with the case statement added
7. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#build():PartialFunction[akka.actor.FSM.Event[D],akka.actor.FSM.State[S,D]] "Permalink")  def build(): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Event](../../actor/FSM$$Event.html)\[D], [State](../../actor/FSM$$State.html)\[S, D]]Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder.

Build a `[scala.PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html)` from this builder. After this call the builder will be
reset.

returnsa PartialFunction for this builder.
9. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FSMStateFunctionBuilder\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FSMStateFunctionBuilder\[S, D]ImplicitThis member is added by an implicit conversion from FSMStateFunctionBuilder\[S, D] toEnsuring\[FSMStateFunctionBuilder\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FSMStateFunctionBuilder\[S, D]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FSMStateFunctionBuilder\[S, D]ImplicitThis member is added by an implicit conversion from FSMStateFunctionBuilder\[S, D] toEnsuring\[FSMStateFunctionBuilder\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FSMStateFunctionBuilder\[S, D]ImplicitThis member is added by an implicit conversion from FSMStateFunctionBuilder\[S, D] toEnsuring\[FSMStateFunctionBuilder\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FSMStateFunctionBuilder\[S, D]ImplicitThis member is added by an implicit conversion from FSMStateFunctionBuilder\[S, D] toEnsuring\[FSMStateFunctionBuilder\[S, D]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#event(eventMatches:java.util.List[Object],apply:akka.japi.pf.FI.Apply2[Object,D,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  def event(eventMatches: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], apply: Apply2\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), D, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches if any of the event types in the list match or any of the
event instances in the list compares equal.

Add a case statement that matches if any of the event types in the list match or any of the
event instances in the list compares equal.

eventMatchesa list of types or instances to match against

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
17. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#event[Q](eventMatches:java.util.List[Object],dataType:Class[Q],apply:akka.japi.pf.FI.Apply2[Object,Q,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  def event\[Q](eventMatches: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], dataType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[Q], apply: Apply2\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), Q, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches on the data type and if any of the event types in the list
match or any of the event instances in the list compares equal.

Add a case statement that matches on the data type and if any of the event types in the list
match or any of the event instances in the list compares equal.

eventMatchesa list of types or instances to match against

dataTypethe data type to match on

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
18. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#event(predicate:akka.japi.pf.FI.TypedPredicate2[Object,D],apply:akka.japi.pf.FI.Apply2[Object,D,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  def event(predicate: TypedPredicate2\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), D], apply: Apply2\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), D, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches if the predicate matches.

Add a case statement that matches if the predicate matches.

predicatea predicate that will be evaluated on the data and the event

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
19. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#event[P](eventType:Class[P],apply:akka.japi.pf.FI.Apply2[P,D,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  def event\[P](eventType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], apply: Apply2\[P, D, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches if the event type and predicate matches.

Add a case statement that matches if the event type and predicate matches.

eventTypethe event type to match on

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
20. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#event[P](eventType:Class[P],predicate:akka.japi.pf.FI.TypedPredicate2[P,D],apply:akka.japi.pf.FI.Apply2[P,D,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  def event\[P](eventType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], predicate: TypedPredicate2\[P, D], apply: Apply2\[P, D, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches if the event type and predicate matches.

Add a case statement that matches if the event type and predicate matches.

eventTypethe event type to match on

predicatea predicate that will be evaluated on the data and the event

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
21. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#event[P,Q](eventType:Class[P],dataType:Class[Q],apply:akka.japi.pf.FI.Apply2[P,Q,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  def event\[P, Q](eventType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], dataType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[Q], apply: Apply2\[P, Q, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches on an event and data type.

Add a case statement that matches on an event and data type.

eventTypethe event type to match on

dataTypethe data type to match on

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
22. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#event[P,Q](eventType:Class[P],dataType:Class[Q],predicate:akka.japi.pf.FI.TypedPredicate2[P,Q],apply:akka.japi.pf.FI.Apply2[P,Q,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink") final  def event\[P, Q](eventType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[P], dataType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[Q], predicate: TypedPredicate2\[P, Q], apply: Apply2\[P, Q, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches on an event and data type and a predicate.

Add a case statement that matches on an event and data type and a predicate.

eventTypethe event type to match on

dataTypethe data type to match on

predicatea predicate to evaluate on the matched types

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
23. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#eventEquals[P](event:P,apply:akka.japi.pf.FI.Apply2[P,D,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  def eventEquals\[P](event: P, apply: Apply2\[P, D, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches if event compares equal.

Add a case statement that matches if event compares equal.

eventan event to compare equal against

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
24. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#eventEquals[P,Q](event:P,dataType:Class[Q],apply:akka.japi.pf.FI.Apply2[P,Q,akka.actor.FSM.State[S,D]]):akka.japi.pf.FSMStateFunctionBuilder[S,D] "Permalink")  def eventEquals\[P, Q](event: P, dataType: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[Q], apply: Apply2\[P, Q, [State](../../actor/FSM$$State.html)\[S, D]]): FSMStateFunctionBuilder\[S, D]Add a case statement that matches on the data type and if the event compares equal.

Add a case statement that matches on the data type and if the event compares equal.

eventan event to compare equal against

dataTypethe data type to match on

applyan action to apply to the event and state data if there is a match

returnsthe builder with the case statement added
25. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
29. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
33. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FSMStateFunctionBuilder\[S, D] toStringFormat\[FSMStateFunctionBuilder\[S, D]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/japi/pf/FSMStateFunctionBuilder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FSMStateFunctionBuilder\[S, D], B)ImplicitThis member is added by an implicit conversion from FSMStateFunctionBuilder\[S, D] toArrowAssoc\[FSMStateFunctionBuilder\[S, D]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFSMStateFunctionBuilder\[S, D] to any2stringadd\[FSMStateFunctionBuilder\[S, D]]

### Inherited by implicit conversion StringFormat fromFSMStateFunctionBuilder\[S, D] to StringFormat\[FSMStateFunctionBuilder\[S, D]]

### Inherited by implicit conversion Ensuring fromFSMStateFunctionBuilder\[S, D] to Ensuring\[FSMStateFunctionBuilder\[S, D]]

### Inherited by implicit conversion ArrowAssoc fromFSMStateFunctionBuilder\[S, D] to ArrowAssoc\[FSMStateFunctionBuilder\[S, D]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/FSM$$Event.html
- https://doc.akka.io/api/akka/current/akka/actor/FSM$$State.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/japi/pf/FSMStateFunctionBuilder.html](https://doc.akka.io/api/akka/current/akka/japi/pf/FSMStateFunctionBuilder.html)*