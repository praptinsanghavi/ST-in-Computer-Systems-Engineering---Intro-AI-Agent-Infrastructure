---
description: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.ConditionalTerminateOutput
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html
title: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.ConditionalTerminateOutput
---

# Akka 2.10.17 - akka.stream.stage.GraphStageLogic.ConditionalTerminateOutput

> **Summary:** Akka 2.10.17 - akka.stream.stage.GraphStageLogic.ConditionalTerminateOutput

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/stage/index.html "Permalink")  package [stage](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/stage/GraphStageLogic$.html "Permalink")  object [GraphStageLogic](GraphStageLogic$.html)Definition Classes[stage](index.html)
- [ConditionalTerminateInput](GraphStageLogic$$ConditionalTerminateInput.html "Input handler that terminates the state upon receiving completion if the given condition holds at that time.")
- ConditionalTerminateOutput
- [EagerTerminateInput](GraphStageLogic$$EagerTerminateInput$.html "Input handler that terminates the operator upon receiving completion.")
- [EagerTerminateOutput](GraphStageLogic$$EagerTerminateOutput$.html "Output handler that terminates the operator upon cancellation.")
- [IgnoreTerminateInput](GraphStageLogic$$IgnoreTerminateInput$.html "Input handler that does not terminate the operator upon receiving completion.")
- [IgnoreTerminateOutput](GraphStageLogic$$IgnoreTerminateOutput$.html "Output handler that does not terminate the operator upon cancellation.")
- [StageActor](GraphStageLogic$$StageActor.html "Minimal actor to work with other actors and watch them in a synchronous ways")
- [StageActorRef](GraphStageLogic$$StageActorRef$.html)
- [StageActorRefNotInitializedException](GraphStageLogic$$StageActorRefNotInitializedException.html)
- [TotallyIgnorantInput](GraphStageLogic$$TotallyIgnorantInput$.html "Input handler that does not terminate the operator upon receiving completion nor failure.")
c[akka](../../index.html).[stream](../index.html).[stage](index.html).[GraphStageLogic](GraphStageLogic$.html)

# ConditionalTerminateOutput[**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html "Permalink")

### 

#### class ConditionalTerminateOutput extends [OutHandler](OutHandler.html)

Output handler that terminates the state upon receiving completion if the
given condition holds at that time. The operator fails upon receiving a failure.

Source[GraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/stage/GraphStage.scala#L186)Linear Supertypes[OutHandler](OutHandler.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConditionalTerminateOutput
2. OutHandler
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

1. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#<init>(predicate:()=>Boolean):akka.stream.stage.GraphStageLogic.ConditionalTerminateOutput "Permalink")  new ConditionalTerminateOutput(predicate: () \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))
### Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConditionalTerminateOutput toany2stringadd\[ConditionalTerminateOutput] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConditionalTerminateOutput, B)ImplicitThis member is added by an implicit conversion from ConditionalTerminateOutput toArrowAssoc\[ConditionalTerminateOutput] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConditionalTerminateOutput) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConditionalTerminateOutputImplicitThis member is added by an implicit conversion from ConditionalTerminateOutput toEnsuring\[ConditionalTerminateOutput] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConditionalTerminateOutput) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConditionalTerminateOutputImplicitThis member is added by an implicit conversion from ConditionalTerminateOutput toEnsuring\[ConditionalTerminateOutput] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConditionalTerminateOutputImplicitThis member is added by an implicit conversion from ConditionalTerminateOutput toEnsuring\[ConditionalTerminateOutput] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConditionalTerminateOutputImplicitThis member is added by an implicit conversion from ConditionalTerminateOutput toEnsuring\[ConditionalTerminateOutput] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#onDownstreamFinish(cause:Throwable):Unit "Permalink")  def onDownstreamFinish(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the output port will no longer accept any new elements.

Called when the output port will no longer accept any new elements. After this callback no other callbacks will
be called for this port.

Definition ClassesConditionalTerminateOutput → [OutHandler](OutHandler.html)
21. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#onPull():Unit "Permalink")  def onPull(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the output port has received a pull, and therefore ready to emit an element, i.e.

Called when the output port has received a pull, and therefore ready to emit an element, i.e. [GraphStageLogic.push](GraphStageLogic.html#push[T](out:akka.stream.Outlet[T],elem:T):Unit)
is now allowed to be called on this port.

Definition ClassesConditionalTerminateOutput → [OutHandler](OutHandler.html)
22. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConditionalTerminateOutput toStringFormat\[ConditionalTerminateOutput] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#onDownstreamFinish():Unit "Permalink")  def onDownstreamFinish(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the output port will no longer accept any new elements.

Called when the output port will no longer accept any new elements. After this callback no other callbacks will
be called for this port.

Definition Classes[OutHandler](OutHandler.html)Annotations@throws(classOf\[Exception]) @deprecatedOverriding() @deprecated Deprecated*(Since version 2\.6\.0\)* Call onDownstreamFinish with a cancellation cause.
4. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConditionalTerminateOutput, B)ImplicitThis member is added by an implicit conversion from ConditionalTerminateOutput toArrowAssoc\[ConditionalTerminateOutput] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [OutHandler](OutHandler.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConditionalTerminateOutput to any2stringadd\[ConditionalTerminateOutput]

### Inherited by implicit conversion StringFormat fromConditionalTerminateOutput to StringFormat\[ConditionalTerminateOutput]

### Inherited by implicit conversion Ensuring fromConditionalTerminateOutput to Ensuring\[ConditionalTerminateOutput]

### Inherited by implicit conversion ArrowAssoc fromConditionalTerminateOutput to ArrowAssoc\[ConditionalTerminateOutput]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/OutHandler.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html](https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html)*