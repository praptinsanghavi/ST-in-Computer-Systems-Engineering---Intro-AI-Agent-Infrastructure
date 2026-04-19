---
description: Akka 2.10.17 - akka.stream.KillSwitches.KillableGraphStageLogic
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:18:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/KillSwitches$$KillableGraphStageLogic.html
title: Akka 2.10.17 - akka.stream.KillSwitches.KillableGraphStageLogic
---

# Akka 2.10.17 - akka.stream.KillSwitches.KillableGraphStageLogic

> **Summary:** Akka 2.10.17 - akka.stream.KillSwitches.KillableGraphStageLogic

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/KillSwitches$.html "Permalink")  object [KillSwitches](KillSwitches$.html "Creates shared or single kill switches which can be used to control completion of graphs from the outside.")Creates shared or single kill switches which can be used to control completion of graphs from the outside.

Creates shared or single kill switches which can be used to control completion of graphs from the outside.

	- The factory `shared()` returns a [SharedKillSwitch](SharedKillSwitch.html) which provides a [Graph](Graph.html) of [FlowShape](FlowShape.html) that can be
	 used in arbitrary number of graphs and materializations. The switch simultaneously
	 controls completion in all of those graphs.
	- The factory `single()` returns a [Graph](Graph.html) of [FlowShape](FlowShape.html) that materializes to a [UniqueKillSwitch](UniqueKillSwitch.html)
	 which is always unique
	 to that materialized Flow itself.Creates a [SharedKillSwitch](SharedKillSwitch.html) that can be used to externally control the completion of various streams.

Definition Classes[stream](index.html)
- KillableGraphStageLogic
c[akka](../index.html).[stream](index.html).[KillSwitches](KillSwitches$.html)

# KillableGraphStageLogic[**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html "Permalink")

### 

#### abstract  class KillableGraphStageLogic extends [GraphStageLogic](stage/GraphStageLogic.html)

Source[KillSwitch.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/KillSwitch.scala#L57)Linear Supertypes[GraphStageLogic](stage/GraphStageLogic.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. KillableGraphStageLogic
2. GraphStageLogic
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

1. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#<init>(terminationSignal:scala.concurrent.Future[akka.Done],_shape:akka.stream.Shape):akka.stream.KillSwitches.KillableGraphStageLogic "Permalink")  new KillableGraphStageLogic(terminationSignal: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../Done.html)], \_shape: [Shape](Shape.html))
### Type Members

1. [**](../../akka/stream/stage/GraphStageLogic$SubSinkInlet.html "Permalink")  class [SubSinkInlet](stage/GraphStageLogic$SubSinkInlet.html "INTERNAL API")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API

INTERNAL API

This allows the dynamic creation of an Inlet for a GraphStage which is
connected to a Sink that is available for materialization (e.g. using
the `subFusingMaterializer`). Completion, cancellation and failure of the
parent operator is automatically delegated to instances of `SubSinkInlet` to avoid resource leaks.

To be thread safe this method must only be called from either the constructor of the graph operator during
materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.

Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
2. [**](../../akka/stream/stage/GraphStageLogic$SubSourceOutlet.html "Permalink")  class [SubSourceOutlet](stage/GraphStageLogic$SubSourceOutlet.html "INTERNAL API")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API

INTERNAL API

This allows the dynamic creation of an Outlet for a GraphStage which is
connected to a Source that is available for materialization (e.g. using
the `subFusingMaterializer`). Completion, cancellation and failure of the
parent operator is automatically delegated to instances of `SubSourceOutlet`
to avoid resource leaks.

Even so it is good practice to use the `timeout` method to cancel this
Outlet in case the corresponding Source is not materialized within a
given time limit, see e.g. ActorMaterializerSettings.

To be thread safe this method must only be called from either the constructor of the graph operator during
materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.

Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
### Value Members

1. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from KillableGraphStageLogic toany2stringadd\[KillableGraphStageLogic] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (KillableGraphStageLogic, B)ImplicitThis member is added by an implicit conversion from KillableGraphStageLogic toArrowAssoc\[KillableGraphStageLogic] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#abortEmitting(out:akka.stream.Outlet[_]):Unit "Permalink") final  def abortEmitting(out: [Outlet](Outlet.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Abort outstanding (suspended) emissions for the given outlet, if there are any.

Abort outstanding (suspended) emissions for the given outlet, if there are any.
This will reinstall the replaced handler that was in effect before the `emit`
call.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
7. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#abortReading(in:akka.stream.Inlet[_]):Unit "Permalink") final  def abortReading(in: [Inlet](Inlet.html)\[\_]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Abort outstanding (suspended) reading for the given inlet, if there is any.

Abort outstanding (suspended) reading for the given inlet, if there is any.
This will reinstall the replaced handler that was in effect before the `read`
call.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
8. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#afterPostStop():Unit "Permalink")  def afterPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

Attributesprotected\[[stream](index.html)] Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
9. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#beforePreStart():Unit "Permalink")  def beforePreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API

INTERNAL API

Attributesprotected\[[stream](index.html)] Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
11. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#cancel[T](in:akka.stream.Inlet[T],cause:Throwable):Unit "Permalink") final  def cancel\[T](in: [Inlet](Inlet.html)\[T], cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Requests to stop receiving events from a given input port.

Requests to stop receiving events from a given input port. Cancelling clears any ungrabbed elements from the port.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
12. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#cancel[T](in:akka.stream.Inlet[T]):Unit "Permalink") final  def cancel\[T](in: [Inlet](Inlet.html)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Requests to stop receiving events from a given input port.

Requests to stop receiving events from a given input port. Cancelling clears any ungrabbed elements from the port.

If cancellation is due to an error, use `cancel(in, cause)` instead to propagate that cause upstream. This overload
is a shortcut for `cancel(in, SubscriptionWithCancelException.NoMoreElementsNeeded)`

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
13. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#cancelStage(cause:Throwable):Unit "Permalink") final  def cancelStage(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Automatically invokes [cancel](#cancel[T](in:akka.stream.Inlet[T],cause:Throwable):Unit) or [complete](#complete[T](out:akka.stream.Outlet[T]):Unit) on all the input or output ports that have been called,
then marks the stage as stopped.

Automatically invokes [cancel](#cancel[T](in:akka.stream.Inlet[T],cause:Throwable):Unit) or [complete](#complete[T](out:akka.stream.Outlet[T]):Unit) on all the input or output ports that have been called,
then marks the stage as stopped.

Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
14. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#complete[T](out:akka.stream.Outlet[T]):Unit "Permalink") final  def complete\[T](out: [Outlet](Outlet.html)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Signals that there will be no more elements emitted on the given port.

Signals that there will be no more elements emitted on the given port.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
16. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#completeStage():Unit "Permalink") final  def completeStage(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Automatically invokes [cancel](#cancel[T](in:akka.stream.Inlet[T],cause:Throwable):Unit) or [complete](#complete[T](out:akka.stream.Outlet[T]):Unit) on all the input or output ports that have been called,
then marks the operator as stopped.

Automatically invokes [cancel](#cancel[T](in:akka.stream.Inlet[T],cause:Throwable):Unit) or [complete](#complete[T](out:akka.stream.Outlet[T]):Unit) on all the input or output ports that have been called,
then marks the operator as stopped.

Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
17. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#conditionalTerminateInput(predicate:()=>Boolean):akka.stream.stage.InHandler "Permalink") final  def conditionalTerminateInput(predicate: () \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [InHandler](stage/InHandler.html)Input handler that terminates the state upon receiving completion if the
given condition holds at that time.

Input handler that terminates the state upon receiving completion if the
given condition holds at that time. The operator fails upon receiving a failure.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
18. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#conditionalTerminateOutput(predicate:()=>Boolean):akka.stream.stage.OutHandler "Permalink") final  def conditionalTerminateOutput(predicate: () \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [OutHandler](stage/OutHandler.html)Output handler that terminates the state upon receiving completion if the
given condition holds at that time.

Output handler that terminates the state upon receiving completion if the
given condition holds at that time. The operator fails upon receiving a failure.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
19. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#createAsyncCallback[T](handler:akka.japi.function.Procedure[T]):akka.stream.stage.AsyncCallback[T] "Permalink") final  def createAsyncCallback\[T](handler: [Procedure](../japi/function/Procedure.html)\[T]): [AsyncCallback](stage/AsyncCallback.html)\[T]Java API: Obtain a callback object that can be used asynchronously to re\-enter the
current GraphStage with an asynchronous notification.

Java API: Obtain a callback object that can be used asynchronously to re\-enter the
current GraphStage with an asynchronous notification. The invoke method of the returned
AsyncCallback is safe to be called from other threads. It will in the background thread\-safely
delegate to the passed callback function. I.e. invoke will be called by other thread and
the passed handler will be invoked eventually in a thread\-safe way by the execution environment.

AsyncCallback.invokeWithFeedback has an internal promise that will be failed if event cannot be processed due to stream completion.

This object can be cached and reused within the same GraphStageLogic.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
20. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#eagerTerminateInput:akka.stream.stage.InHandler "Permalink") final  def eagerTerminateInput: [InHandler](stage/InHandler.html)Input handler that terminates the operator upon receiving completion.

Input handler that terminates the operator upon receiving completion.
The operator fails upon receiving a failure.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
21. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#eagerTerminateOutput:akka.stream.stage.OutHandler "Permalink") final  def eagerTerminateOutput: [OutHandler](stage/OutHandler.html)Output handler that terminates the operator upon cancellation.

Output handler that terminates the operator upon cancellation.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
22. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#emit[T](out:akka.stream.Outlet[T],elem:T,andThen:akka.japi.function.Effect):Unit "Permalink") final  def emit\[T](out: [Outlet](Outlet.html)\[T], elem: T, andThen: [Effect](../japi/function/Effect.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
23. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#emit[T](out:akka.stream.Outlet[T],elem:T):Unit "Permalink") final  def emit\[T](out: [Outlet](Outlet.html)\[T], elem: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Emit an element through the given outlet, suspending execution if necessary.

Emit an element through the given outlet, suspending execution if necessary.
This action replaces the OutHandler for the given outlet if suspension
is needed and reinstalls the current handler upon receiving an `onPull()`
signal.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
24. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#emit[T](out:akka.stream.Outlet[T],elem:T,andThen:()=>Unit):Unit "Permalink") final  def emit\[T](out: [Outlet](Outlet.html)\[T], elem: T, andThen: () \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Emit an element through the given outlet and continue with the given thunk
afterwards, suspending execution if necessary.

Emit an element through the given outlet and continue with the given thunk
afterwards, suspending execution if necessary.
This action replaces the OutHandler for the given outlet if suspension
is needed and reinstalls the current handler upon receiving an `onPull()`
signal (before invoking the `andThen` function).

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
25. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#emitMultiple[T](out:akka.stream.Outlet[T],elems:Iterator[T]):Unit "Permalink") final  def emitMultiple\[T](out: [Outlet](Outlet.html)\[T], elems: Iterator\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Emit a sequence of elements through the given outlet, suspending execution if necessary.

Emit a sequence of elements through the given outlet, suspending execution if necessary.
This action replaces the OutHandler for the given outlet if suspension
is needed and reinstalls the current handler upon receiving an `onPull()`
signal.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
26. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#emitMultiple[T](out:akka.stream.Outlet[T],elems:Iterator[T],andThen:()=>Unit):Unit "Permalink") final  def emitMultiple\[T](out: [Outlet](Outlet.html)\[T], elems: Iterator\[T], andThen: () \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Emit a sequence of elements through the given outlet and continue with the given thunk
afterwards, suspending execution if necessary.

Emit a sequence of elements through the given outlet and continue with the given thunk
afterwards, suspending execution if necessary.
This action replaces the OutHandler for the given outlet if suspension
is needed and reinstalls the current handler upon receiving an `onPull()`
signal (before invoking the `andThen` function).

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
27. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#emitMultiple[T](out:akka.stream.Outlet[T],elems:java.util.Iterator[T],andThen:akka.japi.function.Effect):Unit "Permalink") final  def emitMultiple\[T](out: [Outlet](Outlet.html)\[T], elems: [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[T], andThen: [Effect](../japi/function/Effect.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API

Java API

Emit a sequence of elements through the given outlet, suspending execution if necessary.
This action replaces the AbstractOutHandler for the given outlet if suspension
is needed and reinstalls the current handler upon receiving an `onPull()`
signal.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
28. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#emitMultiple[T](out:akka.stream.Outlet[T],elems:java.util.Iterator[T]):Unit "Permalink") final  def emitMultiple\[T](out: [Outlet](Outlet.html)\[T], elems: [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API

Java API

Emit a sequence of elements through the given outlet, suspending execution if necessary.
This action replaces the AbstractOutHandler for the given outlet if suspension
is needed and reinstalls the current handler upon receiving an `onPull()`
signal.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
29. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#emitMultiple[T](out:akka.stream.Outlet[T],elems:scala.collection.immutable.Iterable[T]):Unit "Permalink") final  def emitMultiple\[T](out: [Outlet](Outlet.html)\[T], elems: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Emit a sequence of elements through the given outlet, suspending execution if necessary.

Emit a sequence of elements through the given outlet, suspending execution if necessary.
This action replaces the OutHandler for the given outlet if suspension
is needed and reinstalls the current handler upon receiving an `onPull()`
signal.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
30. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#emitMultiple[T](out:akka.stream.Outlet[T],elems:scala.collection.immutable.Iterable[T],andThen:()=>Unit):Unit "Permalink") final  def emitMultiple\[T](out: [Outlet](Outlet.html)\[T], elems: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[T], andThen: () \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Emit a sequence of elements through the given outlet and continue with the given thunk
afterwards, suspending execution if necessary.

Emit a sequence of elements through the given outlet and continue with the given thunk
afterwards, suspending execution if necessary.
This action replaces the OutHandler for the given outlet if suspension
is needed and reinstalls the current handler upon receiving an `onPull()`
signal (before invoking the `andThen` function).

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
31. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (KillableGraphStageLogic) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): KillableGraphStageLogicImplicitThis member is added by an implicit conversion from KillableGraphStageLogic toEnsuring\[KillableGraphStageLogic] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
32. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (KillableGraphStageLogic) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): KillableGraphStageLogicImplicitThis member is added by an implicit conversion from KillableGraphStageLogic toEnsuring\[KillableGraphStageLogic] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
33. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): KillableGraphStageLogicImplicitThis member is added by an implicit conversion from KillableGraphStageLogic toEnsuring\[KillableGraphStageLogic] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
34. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): KillableGraphStageLogicImplicitThis member is added by an implicit conversion from KillableGraphStageLogic toEnsuring\[KillableGraphStageLogic] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
35. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
37. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#fail[T](out:akka.stream.Outlet[T],ex:Throwable):Unit "Permalink") final  def fail\[T](out: [Outlet](Outlet.html)\[T], ex: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Signals failure through the given port.

Signals failure through the given port.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
38. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#failStage(ex:Throwable):Unit "Permalink") final  def failStage(ex: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Automatically invokes [cancel](#cancel[T](in:akka.stream.Inlet[T],cause:Throwable):Unit) or [fail](#fail[T](out:akka.stream.Outlet[T],ex:Throwable):Unit) on all the input or output ports that have been called,
then marks the operator as stopped.

Automatically invokes [cancel](#cancel[T](in:akka.stream.Inlet[T],cause:Throwable):Unit) or [fail](#fail[T](out:akka.stream.Outlet[T],ex:Throwable):Unit) on all the input or output ports that have been called,
then marks the operator as stopped.

Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
39. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#getAsyncCallback[T](handler:T=>Unit):akka.stream.stage.AsyncCallback[T] "Permalink") final  def getAsyncCallback\[T](handler: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [AsyncCallback](stage/AsyncCallback.html)\[T]Obtain a callback object that can be used asynchronously to re\-enter the
current GraphStage with an asynchronous notification.

Obtain a callback object that can be used asynchronously to re\-enter the
current GraphStage with an asynchronous notification. The invoke method of the returned
AsyncCallback is safe to be called from other threads. It will in the background thread\-safely
delegate to the passed callback function. I.e. invoke will be called by other thread and
the passed handler will be invoked eventually in a thread\-safe way by the execution environment.

In case stream is not yet materialized AsyncCallback will buffer events until stream is available.

AsyncCallback.invokeWithFeedback has an internal promise that will be failed if event cannot be processed
due to stream completion.

To be thread safe this method must only be called from either the constructor of the graph operator during
materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.

This object can be cached and reused within the same GraphStageLogic.

Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
40. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
41. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#getEagerStageActor(eagerMaterializer:akka.stream.Materializer)(receive:((akka.actor.ActorRef,Any))=>Unit):akka.stream.stage.GraphStageLogic.StageActor "Permalink")  def getEagerStageActor(eagerMaterializer: [Materializer](Materializer.html))(receive: (([ActorRef](../actor/ActorRef.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [StageActor](stage/GraphStageLogic$$StageActor.html)INTERNAL API

INTERNAL API

To be thread safe this method must only be called from either the constructor of the graph operator during
materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.

Attributesprotected\[[akka](../index.html)] Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
42. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#getHandler(out:akka.stream.Outlet[_]):akka.stream.stage.OutHandler "Permalink") final  def getHandler(out: [Outlet](Outlet.html)\[\_]): [OutHandler](stage/OutHandler.html)Retrieves the current callback for the events on the given [Outlet](Outlet.html)

Retrieves the current callback for the events on the given [Outlet](Outlet.html)

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
43. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#getHandler(in:akka.stream.Inlet[_]):akka.stream.stage.InHandler "Permalink") final  def getHandler(in: [Inlet](Inlet.html)\[\_]): [InHandler](stage/InHandler.html)Retrieves the current callback for the events on the given [Inlet](Inlet.html)

Retrieves the current callback for the events on the given [Inlet](Inlet.html)

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
44. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#getStageActor(receive:((akka.actor.ActorRef,Any))=>Unit):akka.stream.stage.GraphStageLogic.StageActor "Permalink") final  def getStageActor(receive: (([ActorRef](../actor/ActorRef.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [StageActor](stage/GraphStageLogic$$StageActor.html)Initialize a StageActorRef which can be used to interact with from the outside world "as\-if" an Actor.

Initialize a StageActorRef which can be used to interact with from the outside world "as\-if" an Actor.
The messages are looped through the [getAsyncCallback](#getAsyncCallback[T](handler:T=>Unit):akka.stream.stage.AsyncCallback[T]) mechanism of GraphStage so they are safe to modify
internal state of this operator.

This method must (the earliest) be called after the GraphStageLogic constructor has finished running,
for example from the [preStart](#preStart():Unit) callback the graph operator logic provides.

Created StageActorRef to get messages and watch other actors in synchronous way.

The StageActorRef's lifecycle is bound to the operator, in other words when the operator is finished,
the Actor will be terminated as well. The entity backing the StageActorRef is not a real Actor,
but the GraphStageLogic itself, therefore it does not react to PoisonPill.

To be thread safe this method must only be called from either the constructor of the graph operator during
materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.

receivecallback that will be called upon receiving of a message by this special Actor

returnsminimal actor with watch method

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
45. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#grab[T](in:akka.stream.Inlet[T]):T "Permalink") final  def grab\[T](in: [Inlet](Inlet.html)\[T]): TOnce the callback InHandler.onPush for an input port has been invoked, the element that has been pushed
can be retrieved via this method.

Once the callback InHandler.onPush for an input port has been invoked, the element that has been pushed
can be retrieved via this method. After [grab](#grab[T](in:akka.stream.Inlet[T]):T) has been called the port is considered to be empty, and further
calls to [grab](#grab[T](in:akka.stream.Inlet[T]):T) will fail until the port is pulled again and a new element is pushed as a response.

The method [isAvailable](#isAvailable[T](out:akka.stream.Outlet[T]):Boolean) can be used to query if the port has an element that can be grabbed or not.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
46. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#hasBeenPulled[T](in:akka.stream.Inlet[T]):Boolean "Permalink") final  def hasBeenPulled\[T](in: [Inlet](Inlet.html)\[T]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether there is already a pending pull for the given input port.

Indicates whether there is already a pending pull for the given input port. If this method returns true
then [isAvailable](#isAvailable[T](out:akka.stream.Outlet[T]):Boolean) must return false for that same port.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
47. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
48. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#ignoreTerminateInput:akka.stream.stage.InHandler "Permalink") final  def ignoreTerminateInput: [InHandler](stage/InHandler.html)Input handler that does not terminate the operator upon receiving completion.

Input handler that does not terminate the operator upon receiving completion.
The operator fails upon receiving a failure.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
49. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#ignoreTerminateOutput:akka.stream.stage.OutHandler "Permalink") final  def ignoreTerminateOutput: [OutHandler](stage/OutHandler.html)Output handler that does not terminate the operator upon cancellation.

Output handler that does not terminate the operator upon cancellation.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
50. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#inCount:Int "Permalink")  val inCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
51. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#isAvailable[T](out:akka.stream.Outlet[T]):Boolean "Permalink") final  def isAvailable\[T](out: [Outlet](Outlet.html)\[T]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Return true if the given output port is ready to be pushed.

Return true if the given output port is ready to be pushed.

Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
52. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#isAvailable[T](in:akka.stream.Inlet[T]):Boolean "Permalink") final  def isAvailable\[T](in: [Inlet](Inlet.html)\[T]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether there is an element waiting at the given input port.

Indicates whether there is an element waiting at the given input port. [grab](#grab[T](in:akka.stream.Inlet[T]):T) can be used to retrieve the
element. After calling [grab](#grab[T](in:akka.stream.Inlet[T]):T) this method will return false.

If this method returns true then [hasBeenPulled](#hasBeenPulled[T](in:akka.stream.Inlet[T]):Boolean) will return false for that same port.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
53. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#isClosed[T](out:akka.stream.Outlet[T]):Boolean "Permalink") final  def isClosed\[T](out: [Outlet](Outlet.html)\[T]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether the port has been closed.

Indicates whether the port has been closed. A closed port cannot be pushed.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
54. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#isClosed[T](in:akka.stream.Inlet[T]):Boolean "Permalink") final  def isClosed\[T](in: [Inlet](Inlet.html)\[T]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Indicates whether the port has been closed.

Indicates whether the port has been closed. A closed port cannot be pulled.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
55. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
56. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#materializer:akka.stream.Materializer "Permalink")  def materializer: [Materializer](Materializer.html)The [akka.stream.Materializer](Materializer.html) that has set this GraphStage in motion.

The [akka.stream.Materializer](Materializer.html) that has set this GraphStage in motion.

Can not be used from a `GraphStage` constructor. Access to materializer is provided by the
[akka.stream.scaladsl.Source.fromMaterializer](scaladsl/Source$.html#fromMaterializer[T,M](factory:(akka.stream.Materializer,akka.stream.Attributes)=>akka.stream.scaladsl.Source[T,M]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]]), [akka.stream.scaladsl.Flow.fromMaterializer](scaladsl/Flow$.html#fromMaterializer[T,U,M](factory:(akka.stream.Materializer,akka.stream.Attributes)=>akka.stream.scaladsl.Flow[T,U,M]):akka.stream.scaladsl.Flow[T,U,scala.concurrent.Future[M]]) and [akka.stream.scaladsl.Sink.fromMaterializer](scaladsl/Sink$.html#fromMaterializer[T,M](factory:(akka.stream.Materializer,akka.stream.Attributes)=>akka.stream.scaladsl.Sink[T,M]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]])
and their corresponding Java API factories.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
57. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
58. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
59. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
60. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#outCount:Int "Permalink")  val outCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
61. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#passAlong[Out,In<:Out](from:akka.stream.Inlet[In],to:akka.stream.Outlet[Out],doFinish:Boolean,doFail:Boolean,doPull:Boolean):Unit "Permalink") final  def passAlong\[Out, In \<: Out](from: [Inlet](Inlet.html)\[In], to: [Outlet](Outlet.html)\[Out], doFinish: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= true, doFail: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= true, doPull: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Install a handler on the given inlet that emits received elements on the
given outlet before pulling for more data.

Install a handler on the given inlet that emits received elements on the
given outlet before pulling for more data. `doFinish` and `doFail` control whether
completion or failure of the given inlet shall lead to operator termination or not.
`doPull` instructs to perform one initial pull on the `from` port.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
62. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked after processing of external events stopped because the operator is about to stop or fail.

Invoked after processing of external events stopped because the operator is about to stop or fail.

Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)Annotations@throws(classOf\[Exception])
63. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked before any external events are processed, at the startup of the operator.

Invoked before any external events are processed, at the startup of the operator.

Definition ClassesKillableGraphStageLogic → [GraphStageLogic](stage/GraphStageLogic.html)
64. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#pull[T](in:akka.stream.Inlet[T]):Unit "Permalink") final  def pull\[T](in: [Inlet](Inlet.html)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Requests an element on the given port.

Requests an element on the given port. Calling this method twice before an element arrived will fail.
There can only be one outstanding request at any given time. The method [hasBeenPulled](#hasBeenPulled[T](in:akka.stream.Inlet[T]):Boolean) can be used
query whether pull is allowed to be called or not. This method will also fail if the port is already closed.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
65. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#push[T](out:akka.stream.Outlet[T],elem:T):Unit "Permalink") final  def push\[T](out: [Outlet](Outlet.html)\[T], elem: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Emits an element through the given output port.

Emits an element through the given output port. Calling this method twice before a [pull](#pull[T](in:akka.stream.Inlet[T]):Unit) has been arrived
will fail. There can be only one outstanding push request at any given time. The method [isAvailable](#isAvailable[T](out:akka.stream.Outlet[T]):Boolean) can be
used to check if the port is ready to be pushed or not.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
66. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#read[T](in:akka.stream.Inlet[T],andThen:akka.japi.function.Procedure[T],onClose:akka.japi.function.Effect):Unit "Permalink") final  def read\[T](in: [Inlet](Inlet.html)\[T], andThen: [Procedure](../japi/function/Procedure.html)\[T], onClose: [Effect](../japi/function/Effect.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API: Read an element from the given inlet and continue with the given function,
suspending execution if necessary.

Java API: Read an element from the given inlet and continue with the given function,
suspending execution if necessary. This action replaces the InHandler
for the given inlet if suspension is needed and reinstalls the current
handler upon receiving the `onPush()` signal (before invoking the `andThen` function).

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
67. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#read[T](in:akka.stream.Inlet[T])(andThen:T=>Unit,onClose:()=>Unit):Unit "Permalink") final  def read\[T](in: [Inlet](Inlet.html)\[T])(andThen: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit), onClose: () \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Read an element from the given inlet and continue with the given function,
suspending execution if necessary.

Read an element from the given inlet and continue with the given function,
suspending execution if necessary. This action replaces the InHandler
for the given inlet if suspension is needed and reinstalls the current
handler upon receiving the `onPush()` signal (before invoking the `andThen` function).

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
68. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#readN[T](in:akka.stream.Inlet[T],n:Int,andThen:akka.japi.function.Procedure[java.util.List[T]],onClose:akka.japi.function.Procedure[java.util.List[T]]):Unit "Permalink") final  def readN\[T](in: [Inlet](Inlet.html)\[T], n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), andThen: [Procedure](../japi/function/Procedure.html)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T]], onClose: [Procedure](../japi/function/Procedure.html)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T]]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Java API: Read a number of elements from the given inlet and continue with the given function,
suspending execution if necessary.

Java API: Read a number of elements from the given inlet and continue with the given function,
suspending execution if necessary. This action replaces the InHandler
for the given inlet if suspension is needed and reinstalls the current
handler upon receiving the last `onPush()` signal (before invoking the `andThen` function).

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
69. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#readN[T](in:akka.stream.Inlet[T],n:Int)(andThen:Seq[T]=>Unit,onClose:Seq[T]=>Unit):Unit "Permalink") final  def readN\[T](in: [Inlet](Inlet.html)\[T], n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(andThen: (Seq\[T]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit), onClose: (Seq\[T]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Read a number of elements from the given inlet and continue with the given function,
suspending execution if necessary.

Read a number of elements from the given inlet and continue with the given function,
suspending execution if necessary. This action replaces the InHandler
for the given inlet if suspension is needed and reinstalls the current
handler upon receiving the last `onPush()` signal.

If upstream closes before N elements have been read,
the `onClose` function is invoked with the elements which were read.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
70. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#setHandler(out:akka.stream.Outlet[_],handler:akka.stream.stage.OutHandler):Unit "Permalink") final  def setHandler(out: [Outlet](Outlet.html)\[\_], handler: [OutHandler](stage/OutHandler.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assigns callbacks for the events for an [Outlet](Outlet.html)

Assigns callbacks for the events for an [Outlet](Outlet.html)

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
71. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#setHandler(in:akka.stream.Inlet[_],handler:akka.stream.stage.InHandler):Unit "Permalink") final  def setHandler(in: [Inlet](Inlet.html)\[\_], handler: [InHandler](stage/InHandler.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assigns callbacks for the events for an [Inlet](Inlet.html)

Assigns callbacks for the events for an [Inlet](Inlet.html)

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
72. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#setHandlers(in:akka.stream.Inlet[_],out:akka.stream.Outlet[_],handler:akka.stream.stage.InHandlerwithakka.stream.stage.OutHandler):Unit "Permalink") final  def setHandlers(in: [Inlet](Inlet.html)\[\_], out: [Outlet](Outlet.html)\[\_], handler: [InHandler](stage/InHandler.html) with [OutHandler](stage/OutHandler.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assign callbacks for linear operator for both [Inlet](Inlet.html) and [Outlet](Outlet.html)

Assign callbacks for linear operator for both [Inlet](Inlet.html) and [Outlet](Outlet.html)

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
73. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#setKeepGoing(enabled:Boolean):Unit "Permalink") final  def setKeepGoing(enabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Controls whether this operator shall shut down when all its ports are closed, which
is the default.

Controls whether this operator shall shut down when all its ports are closed, which
is the default. In order to have it keep going past that point this method needs
to be called with a `true` argument before all ports are closed, and afterwards
it will not be closed until this method is called with a `false` argument or the
operator is terminated via `completeStage()` or `failStage()`.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
74. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#stageActor:akka.stream.stage.GraphStageLogic.StageActor "Permalink") final  def stageActor: [StageActor](stage/GraphStageLogic$$StageActor.html)Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
75. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#stageActorName:String "Permalink")  def stageActorName: StringOverride and return a name to be given to the StageActor of this operator.

Override and return a name to be given to the StageActor of this operator.

This method will be only invoked and used once, during the first [getStageActor](#getStageActor(receive:((akka.actor.ActorRef,Any))=>Unit):akka.stream.stage.GraphStageLogic.StageActor)
invocation whichc reates the actor, since subsequent `getStageActors` calls function
like `become`, rather than creating new actors.

Returns an empty string by default, which means that the name will a unique generated String (e.g. "$$a").

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
76. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#subFusingMaterializer:akka.stream.Materializer "Permalink")  def subFusingMaterializer: [Materializer](Materializer.html)An [akka.stream.Materializer](Materializer.html) that may run fusable parts of the graphs
that it materializes within the same actor as the current GraphStage (if
fusing is available).

An [akka.stream.Materializer](Materializer.html) that may run fusable parts of the graphs
that it materializes within the same actor as the current GraphStage (if
fusing is available). This materializer must not be shared outside of the
GraphStage.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
77. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
78. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#terminationSignal:scala.concurrent.Future[akka.Done] "Permalink")  val terminationSignal: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../Done.html)]
79. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#toString():String "Permalink")  def toString(): StringDefinition Classes[GraphStageLogic](stage/GraphStageLogic.html) → AnyRef → Any
80. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#totallyIgnorantInput:akka.stream.stage.InHandler "Permalink") final  def totallyIgnorantInput: [InHandler](stage/InHandler.html)Input handler that does not terminate the operator upon receiving completion
nor failure.

Input handler that does not terminate the operator upon receiving completion
nor failure.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
81. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#tryPull[T](in:akka.stream.Inlet[T]):Unit "Permalink") final  def tryPull\[T](in: [Inlet](Inlet.html)\[T]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Requests an element on the given port unless the port is already closed.

Requests an element on the given port unless the port is already closed.
Calling this method twice before an element arrived will fail.
There can only be one outstanding request at any given time. The method [hasBeenPulled](#hasBeenPulled[T](in:akka.stream.Inlet[T]):Boolean) can be used
query whether pull is allowed to be called or not.

Attributesprotected Definition Classes[GraphStageLogic](stage/GraphStageLogic.html)
82. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
83. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
84. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from KillableGraphStageLogic toStringFormat\[KillableGraphStageLogic] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/KillSwitches$$KillableGraphStageLogic.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (KillableGraphStageLogic, B)ImplicitThis member is added by an implicit conversion from KillableGraphStageLogic toArrowAssoc\[KillableGraphStageLogic] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [GraphStageLogic](stage/GraphStageLogic.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromKillableGraphStageLogic to any2stringadd\[KillableGraphStageLogic]

### Inherited by implicit conversion StringFormat fromKillableGraphStageLogic to StringFormat\[KillableGraphStageLogic]

### Inherited by implicit conversion Ensuring fromKillableGraphStageLogic to Ensuring\[KillableGraphStageLogic]

### Inherited by implicit conversion ArrowAssoc fromKillableGraphStageLogic to ArrowAssoc\[KillableGraphStageLogic]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitches$$KillableGraphStageLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitches$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/SharedKillSwitch.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/UniqueKillSwitch.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/AsyncCallback.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$$StageActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$SubSinkInlet.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic$SubSourceOutlet.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/InHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/stage/OutHandler.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitches$$KillableGraphStageLogic.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitches$$KillableGraphStageLogic.html)*