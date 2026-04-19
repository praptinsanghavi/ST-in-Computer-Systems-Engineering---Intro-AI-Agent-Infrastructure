---
description: Akka 2.10.17 - akka.stream.stage.GraphStageLogic
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:08:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/stage/GraphStageLogic$.html
title: Akka 2.10.17 - akka.stream.stage.GraphStageLogic
---

# Akka 2.10.17 - akka.stream.stage.GraphStageLogic

> **Summary:** Akka 2.10.17 - akka.stream.stage.GraphStageLogic

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/stage/index.html "Permalink")  package [stage](index.html)Definition Classes[stream](../index.html)
- [AbstractGraphStageWithMaterializedValue](AbstractGraphStageWithMaterializedValue.html "Java API: A GraphStage represents a reusable graph stream processing operator.")
- [AbstractInHandler](AbstractInHandler.html "Java API: callbacks for an input port where termination logic is predefined (completing when upstream completes, failing when upstream fails).")
- [AbstractInOutHandler](AbstractInOutHandler.html "Java API: callback combination for output and input ports where termination logic is predefined (completing when upstream completes, failing when upstream fails, completing when downstream cancels).")
- [AbstractOutHandler](AbstractOutHandler.html "Java API: callbacks for an output port where termination logic is predefined (completing when downstream cancels).")
- [AsyncCallback](AsyncCallback.html "An asynchronous callback holder that is attached to a GraphStageLogic.")
- [GraphStage](GraphStage.html "A GraphStage represents a reusable graph stream processing operator.")
- [GraphStageLogic](GraphStageLogic.html "Represents the processing logic behind a GraphStage.")
- [GraphStageLogicWithLogging](GraphStageLogicWithLogging.html "Java API: GraphStageLogic with StageLogging.")
- [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "Scala API: A GraphStage represents a reusable graph stream processing operator.")
- [InHandler](InHandler.html "Collection of callbacks for an input port of a GraphStage")
- [OutHandler](OutHandler.html "Collection of callbacks for an output port of a GraphStage")
- [StageLogging](StageLogging.html "Simple way to obtain a akka.event.LoggingAdapter when used together with an akka.stream.Materializer.")
- [TimerGraphStageLogic](TimerGraphStageLogic.html "Provides timer related facilities to a GraphStageLogic.")
- [TimerGraphStageLogicWithLogging](TimerGraphStageLogicWithLogging.html "Java API: TimerGraphStageLogic with StageLogging.")
[o](GraphStageLogic.html "See companion class")[akka](../../index.html).[stream](../index.html).[stage](index.html)

# [GraphStageLogic](GraphStageLogic.html "See companion class")[**](../../../akka/stream/stage/GraphStageLogic$.html "Permalink")

### Companion [class GraphStageLogic](GraphStageLogic.html "See companion class")

#### object GraphStageLogic

Source[GraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/stage/GraphStage.scala#L122)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GraphStageLogic
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateInput.html "Permalink")  class [ConditionalTerminateInput](GraphStageLogic$$ConditionalTerminateInput.html "Input handler that terminates the state upon receiving completion if the given condition holds at that time.") extends [InHandler](InHandler.html)Input handler that terminates the state upon receiving completion if the
given condition holds at that time.

Input handler that terminates the state upon receiving completion if the
given condition holds at that time. The operator fails upon receiving a failure.
2. [**](../../../akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html "Permalink")  class [ConditionalTerminateOutput](GraphStageLogic$$ConditionalTerminateOutput.html "Output handler that terminates the state upon receiving completion if the given condition holds at that time.") extends [OutHandler](OutHandler.html)Output handler that terminates the state upon receiving completion if the
given condition holds at that time.

Output handler that terminates the state upon receiving completion if the
given condition holds at that time. The operator fails upon receiving a failure.
3. [**](../../../akka/stream/stage/GraphStageLogic$$StageActor.html "Permalink") final  class [StageActor](GraphStageLogic$$StageActor.html "Minimal actor to work with other actors and watch them in a synchronous ways") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Minimal actor to work with other actors and watch them in a synchronous ways

Minimal actor to work with other actors and watch them in a synchronous ways

Not for user instantiation, use \#getStageActor.
4. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html "Permalink") final  case class [StageActorRefNotInitializedException](GraphStageLogic$$StageActorRefNotInitializedException.html)() extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/stage/GraphStageLogic$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/stage/GraphStageLogic$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/stage/GraphStageLogic$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/stage/GraphStageLogic$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/stage/GraphStageLogic$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/stream/stage/GraphStageLogic$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/stream/stage/GraphStageLogic$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/stage/GraphStageLogic$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/stage/GraphStageLogic$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/stream/stage/GraphStageLogic$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/stream/stage/GraphStageLogic$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/stream/stage/GraphStageLogic$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/stage/GraphStageLogic$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/stream/stage/GraphStageLogic$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/stream/stage/GraphStageLogic$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/stream/stage/GraphStageLogic$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/stream/stage/GraphStageLogic$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateInput$.html "Permalink")  object [EagerTerminateInput](GraphStageLogic$$EagerTerminateInput$.html "Input handler that terminates the operator upon receiving completion.") extends [InHandler](InHandler.html)Input handler that terminates the operator upon receiving completion.

Input handler that terminates the operator upon receiving completion.
The operator fails upon receiving a failure.
20. [**](../../../akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html "Permalink")  object [EagerTerminateOutput](GraphStageLogic$$EagerTerminateOutput$.html "Output handler that terminates the operator upon cancellation.") extends [OutHandler](OutHandler.html)Output handler that terminates the operator upon cancellation.
21. [**](../../../akka/stream/stage/GraphStageLogic$$IgnoreTerminateInput$.html "Permalink")  object [IgnoreTerminateInput](GraphStageLogic$$IgnoreTerminateInput$.html "Input handler that does not terminate the operator upon receiving completion.") extends [InHandler](InHandler.html)Input handler that does not terminate the operator upon receiving completion.

Input handler that does not terminate the operator upon receiving completion.
The operator fails upon receiving a failure.
22. [**](../../../akka/stream/stage/GraphStageLogic$$IgnoreTerminateOutput$.html "Permalink")  object [IgnoreTerminateOutput](GraphStageLogic$$IgnoreTerminateOutput$.html "Output handler that does not terminate the operator upon cancellation.") extends [OutHandler](OutHandler.html)Output handler that does not terminate the operator upon cancellation.
23. [**](../../../akka/stream/stage/GraphStageLogic$$StageActorRef$.html "Permalink")  object [StageActorRef](GraphStageLogic$$StageActorRef$.html)
24. [**](../../../akka/stream/stage/GraphStageLogic$$TotallyIgnorantInput$.html "Permalink")  object [TotallyIgnorantInput](GraphStageLogic$$TotallyIgnorantInput$.html "Input handler that does not terminate the operator upon receiving completion nor failure.") extends [InHandler](InHandler.html)Input handler that does not terminate the operator upon receiving completion
nor failure.
### Deprecated Value Members

1. [**](../../../akka/stream/stage/GraphStageLogic$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractInHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractInOutHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AbstractOutHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AsyncCallback.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$ConditionalTerminateInput.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$ConditionalTerminateOutput.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$EagerTerminateInput$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$EagerTerminateOutput$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$IgnoreTerminateInput$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$IgnoreTerminateOutput$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$StageActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$StageActorRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$StageActorRefNotInitializedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$TotallyIgnorantInput$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogicWithLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/InHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/OutHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/StageLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/TimerGraphStageLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/TimerGraphStageLogicWithLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$.html)*