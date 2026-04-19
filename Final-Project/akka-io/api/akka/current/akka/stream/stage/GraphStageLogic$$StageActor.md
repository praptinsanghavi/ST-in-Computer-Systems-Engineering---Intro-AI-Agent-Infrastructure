---
description: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.StageActor
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/stage/GraphStageLogic$$StageActor.html
title: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.StageActor
---

# Akka 2.10.17 - akka.stream.stage.GraphStageLogic.StageActor

> **Summary:** Akka 2.10.17 - akka.stream.stage.GraphStageLogic.StageActor

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/stage/index.html "Permalink")  package [stage](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/stage/GraphStageLogic$.html "Permalink")  object [GraphStageLogic](GraphStageLogic$.html)Definition Classes[stage](index.html)
- [ConditionalTerminateInput](GraphStageLogic$$ConditionalTerminateInput.html "Input handler that terminates the state upon receiving completion if the given condition holds at that time.")
- [ConditionalTerminateOutput](GraphStageLogic$$ConditionalTerminateOutput.html "Output handler that terminates the state upon receiving completion if the given condition holds at that time.")
- [EagerTerminateInput](GraphStageLogic$$EagerTerminateInput$.html "Input handler that terminates the operator upon receiving completion.")
- [EagerTerminateOutput](GraphStageLogic$$EagerTerminateOutput$.html "Output handler that terminates the operator upon cancellation.")
- [IgnoreTerminateInput](GraphStageLogic$$IgnoreTerminateInput$.html "Input handler that does not terminate the operator upon receiving completion.")
- [IgnoreTerminateOutput](GraphStageLogic$$IgnoreTerminateOutput$.html "Output handler that does not terminate the operator upon cancellation.")
- StageActor
- [StageActorRef](GraphStageLogic$$StageActorRef$.html)
- [StageActorRefNotInitializedException](GraphStageLogic$$StageActorRefNotInitializedException.html)
- [TotallyIgnorantInput](GraphStageLogic$$TotallyIgnorantInput$.html "Input handler that does not terminate the operator upon receiving completion nor failure.")
c[akka](../../index.html).[stream](../index.html).[stage](index.html).[GraphStageLogic](GraphStageLogic$.html)

# StageActor[**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html "Permalink")

### 

#### final  class StageActor extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Minimal actor to work with other actors and watch them in a synchronous ways

Not for user instantiation, use \#getStageActor.

Source[GraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/stage/GraphStage.scala#L201)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StageActor
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
### Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StageActor toany2stringadd\[StageActor] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StageActor, B)ImplicitThis member is added by an implicit conversion from StageActor toArrowAssoc\[StageActor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#become(receive:akka.stream.stage.GraphStageLogic.StageActorRef.Receive):Unit "Permalink")  def become(receive: [Receive](GraphStageLogic$$StageActorRef$.html#Receive=((akka.actor.ActorRef,Any))=>Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Special `become` allowing to swap the behavior of this StageActorRef.

Special `become` allowing to swap the behavior of this StageActorRef.
Unbecome is not available.
8. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StageActor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StageActorImplicitThis member is added by an implicit conversion from StageActor toEnsuring\[StageActor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StageActor) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StageActorImplicitThis member is added by an implicit conversion from StageActor toEnsuring\[StageActor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StageActorImplicitThis member is added by an implicit conversion from StageActor toEnsuring\[StageActor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StageActorImplicitThis member is added by an implicit conversion from StageActor toEnsuring\[StageActor] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#ref:akka.actor.ActorRef "Permalink")  def ref: [ActorRef](../../actor/ActorRef.html)The ActorRef by which this StageActor can be contacted from the outside.

The ActorRef by which this StageActor can be contacted from the outside.
This is a full\-fledged ActorRef that supports watching and being watched
as well as location transparent (remote) communication.
22. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#stop():Unit "Permalink")  def stop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
23. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#unwatch(actorRef:akka.actor.ActorRef):Unit "Permalink")  def unwatch(actorRef: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
26. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#watch(actorRef:akka.actor.ActorRef):Unit "Permalink")  def watch(actorRef: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
### Deprecated Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StageActor toStringFormat\[StageActor] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StageActor, B)ImplicitThis member is added by an implicit conversion from StageActor toArrowAssoc\[StageActor] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStageActor to any2stringadd\[StageActor]

### Inherited by implicit conversion StringFormat fromStageActor to StringFormat\[StageActor]

### Inherited by implicit conversion Ensuring fromStageActor to Ensuring\[StageActor]

### Inherited by implicit conversion ArrowAssoc fromStageActor to ArrowAssoc\[StageActor]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$ConditionalTerminateInput.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$EagerTerminateInput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$IgnoreTerminateInput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$IgnoreTerminateOutput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActor.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActorRef$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$TotallyIgnorantInput$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActor.html](https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$StageActor.html)*