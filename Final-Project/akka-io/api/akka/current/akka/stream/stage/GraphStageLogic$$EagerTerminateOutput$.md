---
description: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.EagerTerminateOutput
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:56:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html
title: Akka 2.10.17 - akka.stream.stage.GraphStageLogic.EagerTerminateOutput
---

# Akka 2.10.17 - akka.stream.stage.GraphStageLogic.EagerTerminateOutput

> **Summary:** Akka 2.10.17 - akka.stream.stage.GraphStageLogic.EagerTerminateOutput

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
- EagerTerminateOutput
- [IgnoreTerminateInput](GraphStageLogic$$IgnoreTerminateInput$.html "Input handler that does not terminate the operator upon receiving completion.")
- [IgnoreTerminateOutput](GraphStageLogic$$IgnoreTerminateOutput$.html "Output handler that does not terminate the operator upon cancellation.")
- [StageActor](GraphStageLogic$$StageActor.html "Minimal actor to work with other actors and watch them in a synchronous ways")
- [StageActorRef](GraphStageLogic$$StageActorRef$.html)
- [StageActorRefNotInitializedException](GraphStageLogic$$StageActorRefNotInitializedException.html)
- [TotallyIgnorantInput](GraphStageLogic$$TotallyIgnorantInput$.html "Input handler that does not terminate the operator upon receiving completion nor failure.")
o[akka](../../index.html).[stream](../index.html).[stage](index.html).[GraphStageLogic](GraphStageLogic$.html)

# EagerTerminateOutput[**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html "Permalink")

### 

#### object EagerTerminateOutput extends [OutHandler](OutHandler.html)

Output handler that terminates the operator upon cancellation.

Source[GraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/stage/GraphStage.scala#L168)Linear Supertypes[OutHandler](OutHandler.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EagerTerminateOutput
2. OutHandler
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#onDownstreamFinish(cause:Throwable):Unit "Permalink")  def onDownstreamFinish(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the output port will no longer accept any new elements.

Called when the output port will no longer accept any new elements. After this callback no other callbacks will
be called for this port.

Definition Classes[OutHandler](OutHandler.html)Annotations@throws(classOf\[Exception])
15. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#onPull():Unit "Permalink")  def onPull(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the output port has received a pull, and therefore ready to emit an element, i.e.

Called when the output port has received a pull, and therefore ready to emit an element, i.e. [GraphStageLogic.push](GraphStageLogic.html#push[T](out:akka.stream.Outlet[T],elem:T):Unit)
is now allowed to be called on this port.

Definition ClassesEagerTerminateOutput → [OutHandler](OutHandler.html)
16. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesEagerTerminateOutput → AnyRef → Any
18. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html#onDownstreamFinish():Unit "Permalink")  def onDownstreamFinish(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the output port will no longer accept any new elements.

Called when the output port will no longer accept any new elements. After this callback no other callbacks will
be called for this port.

Definition Classes[OutHandler](OutHandler.html)Annotations@throws(classOf\[Exception]) @deprecatedOverriding() @deprecated Deprecated*(Since version 2\.6\.0\)* Call onDownstreamFinish with a cancellation cause.
### Inherited from [OutHandler](OutHandler.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
*Source: [https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html](https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html)*