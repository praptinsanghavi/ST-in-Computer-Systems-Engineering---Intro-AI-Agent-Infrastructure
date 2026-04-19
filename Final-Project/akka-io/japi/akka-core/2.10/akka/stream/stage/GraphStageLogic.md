---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:49:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
title: GraphStageLogic
---

# GraphStageLogic

## Content

Package [akka.stream.stage](package-summary.html)
## Class GraphStageLogic

- java.lang.Object
- - akka.stream.stage.GraphStageLogic

- Direct Known Subclasses:
`[GraphStageLogicWithLogging](GraphStageLogicWithLogging.html "class in akka.stream.stage")`, `[KillSwitches.KillableGraphStageLogic](../KillSwitches.KillableGraphStageLogic.html "class in akka.stream")`, `[TimerGraphStageLogic](TimerGraphStageLogic.html "class in akka.stream.stage")`

---

```
public abstract class GraphStageLogic
extends java.lang.Object
```

Represents the processing logic behind a [`GraphStage`](GraphStage.html "class in akka.stream.stage"). Roughly speaking, a subclass of [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage") is a
 collection of the following parts:
 \* A set of [`InHandler`](InHandler.html "interface in akka.stream.stage") and [`OutHandler`](OutHandler.html "interface in akka.stream.stage") instances and their assignments to the `Inlet`s and `Outlet`s
 of the enclosing [`GraphStage`](GraphStage.html "class in akka.stream.stage")
 \* Possible mutable state, accessible from the [`InHandler`](InHandler.html "interface in akka.stream.stage") and [`OutHandler`](OutHandler.html "interface in akka.stream.stage") callbacks, but not from anywhere
 else (as such access would not be thread\-safe)
 \* The lifecycle hooks [`preStart()`](#preStart()) and [`postStop()`](#postStop())
 \* Methods for performing stream processing actions, like pulling or pushing elements
 
 The operator logic is completed once all its input and output ports have been closed. This can be changed by
 setting `setKeepGoing` to true.
 

 The `postStop` lifecycle hook on the logic itself is called once all ports are closed. This is the only tear down
 callback that is guaranteed to happen, if the actor system or the materializer is terminated the handlers may never
 see any callbacks to `onUpstreamFailure`, `onUpstreamFinish` or `onDownstreamFinish`. Therefore operator resource
 cleanup should always be done in `postStop`.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[GraphStageLogic.ConditionalTerminateInput](GraphStageLogic.ConditionalTerminateInput.html "class in akka.stream.stage")` | Input handler that terminates the state upon receiving completion if the  given condition holds at that time. |
	| `static class` | `[GraphStageLogic.ConditionalTerminateOutput](GraphStageLogic.ConditionalTerminateOutput.html "class in akka.stream.stage")` | Output handler that terminates the state upon receiving completion if the  given condition holds at that time. |
	| `static class` | `[GraphStageLogic.EagerTerminateInput$](GraphStageLogic.EagerTerminateInput$.html "class in akka.stream.stage")` | Input handler that terminates the operator upon receiving completion. |
	| `static class` | `[GraphStageLogic.EagerTerminateOutput$](GraphStageLogic.EagerTerminateOutput$.html "class in akka.stream.stage")` | Output handler that terminates the operator upon cancellation. |
	| `static class` | `[GraphStageLogic.IgnoreTerminateInput$](GraphStageLogic.IgnoreTerminateInput$.html "class in akka.stream.stage")` | Input handler that does not terminate the operator upon receiving completion. |
	| `static class` | `[GraphStageLogic.IgnoreTerminateOutput$](GraphStageLogic.IgnoreTerminateOutput$.html "class in akka.stream.stage")` | Output handler that does not terminate the operator upon cancellation. |
	| `static class` | `[GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage")` | Minimal actor to work with other actors and watch them in a synchronous ways |
	| `static class` | `[GraphStageLogic.StageActorRef$](GraphStageLogic.StageActorRef$.html "class in akka.stream.stage")` |  |
	| `static class` | `[GraphStageLogic.StageActorRefNotInitializedException](GraphStageLogic.StageActorRefNotInitializedException.html "class in akka.stream.stage")` |  |
	| `static class` | `[GraphStageLogic.StageActorRefNotInitializedException$](GraphStageLogic.StageActorRefNotInitializedException$.html "class in akka.stream.stage")` |  |
	| `class` | `[GraphStageLogic.SubSinkInlet](GraphStageLogic.SubSinkInlet.html "class in akka.stream.stage")<[T](GraphStageLogic.SubSinkInlet.html "type parameter in GraphStageLogic.SubSinkInlet")>` | INTERNAL API |
	| `class` | `[GraphStageLogic.SubSourceOutlet](GraphStageLogic.SubSourceOutlet.html "class in akka.stream.stage")<[T](GraphStageLogic.SubSourceOutlet.html "type parameter in GraphStageLogic.SubSourceOutlet")>` | INTERNAL API |
	| `static class` | `[GraphStageLogic.TotallyIgnorantInput$](GraphStageLogic.TotallyIgnorantInput$.html "class in akka.stream.stage")` | Input handler that does not terminate the operator upon receiving completion  nor failure. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GraphStageLogic](#%3Cinit%3E(akka.stream.Shape))​([Shape](../Shape.html "class in akka.stream") shape)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[abortEmitting](#abortEmitting(akka.stream.Outlet))​([Outlet](../Outlet.html "class in akka.stream")<?> out)` | Abort outstanding (suspended) emissions for the given outlet, if there are any. |
	| `protected void` | `[abortReading](#abortReading(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<?> in)` | Abort outstanding (suspended) reading for the given inlet, if there is any. |
	| `protected void` | `[afterPostStop](#afterPostStop())()` | INTERNAL API |
	| `protected void` | `[beforePreStart](#beforePreStart())()` | INTERNAL API |
	| `protected <T> void` | `[cancel](#cancel(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<T> in)` | Requests to stop receiving events from a given input port. |
	| `protected <T> void` | `[cancel](#cancel(akka.stream.Inlet,java.lang.Throwable))​([Inlet](../Inlet.html "class in akka.stream")<T> in,  java.lang.Throwable cause)` | Requests to stop receiving events from a given input port. |
	| `void` | `[cancelStage](#cancelStage(java.lang.Throwable))​(java.lang.Throwable cause)` | Automatically invokes [`<T>cancel(akka.stream.Inlet<T>)`](#cancel(akka.stream.Inlet)) or [`<T>complete(akka.stream.Outlet<T>)`](#complete(akka.stream.Outlet)) on all the input or output ports that have been called,  then marks the stage as stopped. |
	| `protected <T> void` | `[complete](#complete(akka.stream.Outlet))​([Outlet](../Outlet.html "class in akka.stream")<T> out)` | Signals that there will be no more elements emitted on the given port. |
	| `void` | `[completeStage](#completeStage())()` | Automatically invokes [`<T>cancel(akka.stream.Inlet<T>)`](#cancel(akka.stream.Inlet)) or [`<T>complete(akka.stream.Outlet<T>)`](#complete(akka.stream.Outlet)) on all the input or output ports that have been called,  then marks the operator as stopped. |
	| `protected [InHandler](InHandler.html "interface in akka.stream.stage")` | `[conditionalTerminateInput](#conditionalTerminateInput(scala.Function0))​(scala.Function0<java.lang.Object> predicate)` | Input handler that terminates the state upon receiving completion if the  given condition holds at that time. |
	| `protected [OutHandler](OutHandler.html "interface in akka.stream.stage")` | `[conditionalTerminateOutput](#conditionalTerminateOutput(scala.Function0))​(scala.Function0<java.lang.Object> predicate)` | Output handler that terminates the state upon receiving completion if the  given condition holds at that time. |
	| `protected <T> [AsyncCallback](AsyncCallback.html "interface in akka.stream.stage")<T>` | `[createAsyncCallback](#createAsyncCallback(akka.japi.function.Procedure))​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<T> handler)` | Java API: Obtain a callback object that can be used asynchronously to re\-enter the  current [`GraphStage`](GraphStage.html "class in akka.stream.stage") with an asynchronous notification. |
	| `protected [InHandler](InHandler.html "interface in akka.stream.stage")` | `[eagerTerminateInput](#eagerTerminateInput())()` | Input handler that terminates the operator upon receiving completion. |
	| `protected [OutHandler](OutHandler.html "interface in akka.stream.stage")` | `[eagerTerminateOutput](#eagerTerminateOutput())()` | Output handler that terminates the operator upon cancellation. |
	| `protected <T> void` | `[emit](#emit(akka.stream.Outlet,T))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  T elem)` | Emit an element through the given outlet, suspending execution if necessary. |
	| `protected <T> void` | `[emit](#emit(akka.stream.Outlet,T,akka.japi.function.Effect))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  T elem,  [Effect](../../japi/function/Effect.html "interface in akka.japi.function") andThen)` |  |
	| `protected <T> void` | `[emit](#emit(akka.stream.Outlet,T,scala.Function0))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  T elem,  scala.Function0<scala.runtime.BoxedUnit> andThen)` | Emit an element through the given outlet and continue with the given thunk  afterwards, suspending execution if necessary. |
	| `protected <T> void` | `[emitMultiple](#emitMultiple(akka.stream.Outlet,java.util.Iterator))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  java.util.Iterator<T> elems)` | Java API |
	| `protected <T> void` | `[emitMultiple](#emitMultiple(akka.stream.Outlet,java.util.Iterator,akka.japi.function.Effect))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  java.util.Iterator<T> elems,  [Effect](../../japi/function/Effect.html "interface in akka.japi.function") andThen)` | Java API |
	| `protected <T> void` | `[emitMultiple](#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  scala.collection.immutable.Iterable<T> elems)` | Emit a sequence of elements through the given outlet, suspending execution if necessary. |
	| `protected <T> void` | `[emitMultiple](#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable,scala.Function0))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  scala.collection.immutable.Iterable<T> elems,  scala.Function0<scala.runtime.BoxedUnit> andThen)` | Emit a sequence of elements through the given outlet and continue with the given thunk  afterwards, suspending execution if necessary. |
	| `protected <T> void` | `[emitMultiple](#emitMultiple(akka.stream.Outlet,scala.collection.Iterator))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  scala.collection.Iterator<T> elems)` | Emit a sequence of elements through the given outlet, suspending execution if necessary. |
	| `protected <T> void` | `[emitMultiple](#emitMultiple(akka.stream.Outlet,scala.collection.Iterator,scala.Function0))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  scala.collection.Iterator<T> elems,  scala.Function0<scala.runtime.BoxedUnit> andThen)` | Emit a sequence of elements through the given outlet and continue with the given thunk  afterwards, suspending execution if necessary. |
	| `protected <T> void` | `[fail](#fail(akka.stream.Outlet,java.lang.Throwable))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  java.lang.Throwable ex)` | Signals failure through the given port. |
	| `void` | `[failStage](#failStage(java.lang.Throwable))​(java.lang.Throwable ex)` | Automatically invokes [`<T>cancel(akka.stream.Inlet<T>)`](#cancel(akka.stream.Inlet)) or [`<T>fail(akka.stream.Outlet<T>,java.lang.Throwable)`](#fail(akka.stream.Outlet,java.lang.Throwable)) on all the input or output ports that have been called,  then marks the operator as stopped. |
	| `<T> [AsyncCallback](AsyncCallback.html "interface in akka.stream.stage")<T>` | `[getAsyncCallback](#getAsyncCallback(scala.Function1))​(scala.Function1<T,​scala.runtime.BoxedUnit> handler)` | Obtain a callback object that can be used asynchronously to re\-enter the  current [`GraphStage`](GraphStage.html "class in akka.stream.stage") with an asynchronous notification. |
	| `protected [GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage")` | `[getEagerStageActor](#getEagerStageActor(akka.stream.Materializer,scala.Function1))​([Materializer](../Materializer.html "class in akka.stream") eagerMaterializer,  scala.Function1<scala.Tuple2<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object>,​scala.runtime.BoxedUnit> receive)` | INTERNAL API |
	| `protected [InHandler](InHandler.html "interface in akka.stream.stage")` | `[getHandler](#getHandler(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<?> in)` | Retrieves the current callback for the events on the given `Inlet` |
	| `protected [OutHandler](OutHandler.html "interface in akka.stream.stage")` | `[getHandler](#getHandler(akka.stream.Outlet))​([Outlet](../Outlet.html "class in akka.stream")<?> out)` | Retrieves the current callback for the events on the given `Outlet` |
	| `protected [GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage")` | `[getStageActor](#getStageActor(scala.Function1))​(scala.Function1<scala.Tuple2<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object>,​scala.runtime.BoxedUnit> receive)` | Initialize a `StageActorRef` which can be used to interact with from the outside world "as\-if" an `Actor`. |
	| `protected <T> T` | `[grab](#grab(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<T> in)` | Once the callback `InHandler.onPush` for an input port has been invoked, the element that has been pushed  can be retrieved via this method. |
	| `protected <T> boolean` | `[hasBeenPulled](#hasBeenPulled(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<T> in)` | Indicates whether there is already a pending pull for the given input port. |
	| `protected [InHandler](InHandler.html "interface in akka.stream.stage")` | `[ignoreTerminateInput](#ignoreTerminateInput())()` | Input handler that does not terminate the operator upon receiving completion. |
	| `protected [OutHandler](OutHandler.html "interface in akka.stream.stage")` | `[ignoreTerminateOutput](#ignoreTerminateOutput())()` | Output handler that does not terminate the operator upon cancellation. |
	| `int` | `[inCount](#inCount())()` |  |
	| `protected <T> boolean` | `[isAvailable](#isAvailable(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<T> in)` | Indicates whether there is an element waiting at the given input port. |
	| `<T> boolean` | `[isAvailable](#isAvailable(akka.stream.Outlet))​([Outlet](../Outlet.html "class in akka.stream")<T> out)` | Return true if the given output port is ready to be pushed. |
	| `protected <T> boolean` | `[isClosed](#isClosed(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<T> in)` | Indicates whether the port has been closed. |
	| `protected <T> boolean` | `[isClosed](#isClosed(akka.stream.Outlet))​([Outlet](../Outlet.html "class in akka.stream")<T> out)` | Indicates whether the port has been closed. |
	| `protected [Materializer](../Materializer.html "class in akka.stream")` | `[materializer](#materializer())()` | The [`Materializer`](../Materializer.html "class in akka.stream") that has set this GraphStage in motion. |
	| `int` | `[outCount](#outCount())()` |  |
	| `protected <Out,​In extends Out>void` | `[passAlong](#passAlong(akka.stream.Inlet,akka.stream.Outlet,boolean,boolean,boolean))​([Inlet](../Inlet.html "class in akka.stream")<In> from,  [Outlet](../Outlet.html "class in akka.stream")<Out> to,  boolean doFinish,  boolean doFail,  boolean doPull)` | Install a handler on the given inlet that emits received elements on the  given outlet before pulling for more data. |
	| `protected <Out,​In extends Out>boolean` | `[passAlong$default$3](#passAlong$default$3())()` |  |
	| `protected <Out,​In extends Out>boolean` | `[passAlong$default$4](#passAlong$default$4())()` |  |
	| `protected <Out,​In extends Out>boolean` | `[passAlong$default$5](#passAlong$default$5())()` |  |
	| `void` | `[postStop](#postStop())()` | Invoked after processing of external events stopped because the operator is about to stop or fail. |
	| `void` | `[preStart](#preStart())()` | Invoked before any external events are processed, at the startup of the operator. |
	| `protected <T> void` | `[pull](#pull(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<T> in)` | Requests an element on the given port. |
	| `protected <T> void` | `[push](#push(akka.stream.Outlet,T))​([Outlet](../Outlet.html "class in akka.stream")<T> out,  T elem)` | Emits an element through the given output port. |
	| `protected <T> void` | `[read](#read(akka.stream.Inlet,akka.japi.function.Procedure,akka.japi.function.Effect))​([Inlet](../Inlet.html "class in akka.stream")<T> in,  [Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<T> andThen,  [Effect](../../japi/function/Effect.html "interface in akka.japi.function") onClose)` | Java API: Read an element from the given inlet and continue with the given function,  suspending execution if necessary. |
	| `protected <T> void` | `[read](#read(akka.stream.Inlet,scala.Function1,scala.Function0))​([Inlet](../Inlet.html "class in akka.stream")<T> in,  scala.Function1<T,​scala.runtime.BoxedUnit> andThen,  scala.Function0<scala.runtime.BoxedUnit> onClose)` | Read an element from the given inlet and continue with the given function,  suspending execution if necessary. |
	| `protected <T> void` | `[readN](#readN(akka.stream.Inlet,int,akka.japi.function.Procedure,akka.japi.function.Procedure))​([Inlet](../Inlet.html "class in akka.stream")<T> in,  int n,  [Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<java.util.List<T>> andThen,  [Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<java.util.List<T>> onClose)` | Java API: Read a number of elements from the given inlet and continue with the given function,  suspending execution if necessary. |
	| `protected <T> void` | `[readN](#readN(akka.stream.Inlet,int,scala.Function1,scala.Function1))​([Inlet](../Inlet.html "class in akka.stream")<T> in,  int n,  scala.Function1<scala.collection.immutable.Seq<T>,​scala.runtime.BoxedUnit> andThen,  scala.Function1<scala.collection.immutable.Seq<T>,​scala.runtime.BoxedUnit> onClose)` | Read a number of elements from the given inlet and continue with the given function,  suspending execution if necessary. |
	| `protected void` | `[setHandler](#setHandler(akka.stream.Inlet,akka.stream.stage.InHandler))​([Inlet](../Inlet.html "class in akka.stream")<?> in,  [InHandler](InHandler.html "interface in akka.stream.stage") handler)` | Assigns callbacks for the events for an `Inlet` |
	| `protected void` | `[setHandler](#setHandler(akka.stream.Outlet,akka.stream.stage.OutHandler))​([Outlet](../Outlet.html "class in akka.stream")<?> out,  [OutHandler](OutHandler.html "interface in akka.stream.stage") handler)` | Assigns callbacks for the events for an `Outlet` |
	| `protected void` | `[setHandlers](#setHandlers(akka.stream.Inlet,akka.stream.Outlet,akka.stream.stage.InHandler))​([Inlet](../Inlet.html "class in akka.stream")<?> in,  [Outlet](../Outlet.html "class in akka.stream")<?> out,  [InHandler](InHandler.html "interface in akka.stream.stage") handler)` | Assign callbacks for linear operator for both `Inlet` and `Outlet` |
	| `protected void` | `[setKeepGoing](#setKeepGoing(boolean))​(boolean enabled)` | Controls whether this operator shall shut down when all its ports are closed, which  is the default. |
	| `[GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage")` | `[stageActor](#stageActor())()` |  |
	| `protected java.lang.String` | `[stageActorName](#stageActorName())()` | Override and return a name to be given to the StageActor of this operator. |
	| `protected [Materializer](../Materializer.html "class in akka.stream")` | `[subFusingMaterializer](#subFusingMaterializer())()` | An [`Materializer`](../Materializer.html "class in akka.stream") that may run fusable parts of the graphs  that it materializes within the same actor as the current GraphStage (if  fusing is available). |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `protected [InHandler](InHandler.html "interface in akka.stream.stage")` | `[totallyIgnorantInput](#totallyIgnorantInput())()` | Input handler that does not terminate the operator upon receiving completion  nor failure. |
	| `protected <T> void` | `[tryPull](#tryPull(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<T> in)` | Requests an element on the given port unless the port is already closed. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GraphStageLogic
		
		
		
		```
		public GraphStageLogic​([Shape](../Shape.html "class in akka.stream") shape)
		```

	- ### Method Detail
	
	
	
		- #### inCount
		
		
		
		```
		public int inCount()
		```
		- #### outCount
		
		
		
		```
		public int outCount()
		```
		- #### materializer
		
		
		
		```
		protected [Materializer](../Materializer.html "class in akka.stream") materializer()
		```
		
		The [`Materializer`](../Materializer.html "class in akka.stream") that has set this GraphStage in motion.
		 
		 Can not be used from a `GraphStage` constructor. Access to materializer is provided by the
		 `akka.stream.scaladsl.Source.fromMaterializer`, `akka.stream.scaladsl.Flow.fromMaterializer` and `akka.stream.scaladsl.Sink.fromMaterializer`
		 and their corresponding Java API factories.
		- #### subFusingMaterializer
		
		
		
		```
		protected [Materializer](../Materializer.html "class in akka.stream") subFusingMaterializer()
		```
		
		An [`Materializer`](../Materializer.html "class in akka.stream") that may run fusable parts of the graphs
		 that it materializes within the same actor as the current GraphStage (if
		 fusing is available). This materializer must not be shared outside of the
		 GraphStage.
		- #### eagerTerminateInput
		
		
		
		```
		protected final [InHandler](InHandler.html "interface in akka.stream.stage") eagerTerminateInput()
		```
		
		Input handler that terminates the operator upon receiving completion.
		 The operator fails upon receiving a failure.
		- #### ignoreTerminateInput
		
		
		
		```
		protected final [InHandler](InHandler.html "interface in akka.stream.stage") ignoreTerminateInput()
		```
		
		Input handler that does not terminate the operator upon receiving completion.
		 The operator fails upon receiving a failure.
		- #### conditionalTerminateInput
		
		
		
		```
		protected final [InHandler](InHandler.html "interface in akka.stream.stage") conditionalTerminateInput​(scala.Function0<java.lang.Object> predicate)
		```
		
		Input handler that terminates the state upon receiving completion if the
		 given condition holds at that time. The operator fails upon receiving a failure.
		- #### totallyIgnorantInput
		
		
		
		```
		protected final [InHandler](InHandler.html "interface in akka.stream.stage") totallyIgnorantInput()
		```
		
		Input handler that does not terminate the operator upon receiving completion
		 nor failure.
		- #### eagerTerminateOutput
		
		
		
		```
		protected final [OutHandler](OutHandler.html "interface in akka.stream.stage") eagerTerminateOutput()
		```
		
		Output handler that terminates the operator upon cancellation.
		- #### ignoreTerminateOutput
		
		
		
		```
		protected final [OutHandler](OutHandler.html "interface in akka.stream.stage") ignoreTerminateOutput()
		```
		
		Output handler that does not terminate the operator upon cancellation.
		- #### conditionalTerminateOutput
		
		
		
		```
		protected final [OutHandler](OutHandler.html "interface in akka.stream.stage") conditionalTerminateOutput​(scala.Function0<java.lang.Object> predicate)
		```
		
		Output handler that terminates the state upon receiving completion if the
		 given condition holds at that time. The operator fails upon receiving a failure.
		- #### setHandler
		
		
		
		```
		protected final void setHandler​([Inlet](../Inlet.html "class in akka.stream")<?> in,
		                                [InHandler](InHandler.html "interface in akka.stream.stage") handler)
		```
		
		Assigns callbacks for the events for an `Inlet`
		- #### setHandlers
		
		
		
		```
		protected final void setHandlers​([Inlet](../Inlet.html "class in akka.stream")<?> in,
		                                 [Outlet](../Outlet.html "class in akka.stream")<?> out,
		                                 [InHandler](InHandler.html "interface in akka.stream.stage") handler)
		```
		
		Assign callbacks for linear operator for both `Inlet` and `Outlet`
		- #### getHandler
		
		
		
		```
		protected final [InHandler](InHandler.html "interface in akka.stream.stage") getHandler​([Inlet](../Inlet.html "class in akka.stream")<?> in)
		```
		
		Retrieves the current callback for the events on the given `Inlet`
		- #### setHandler
		
		
		
		```
		protected final void setHandler​([Outlet](../Outlet.html "class in akka.stream")<?> out,
		                                [OutHandler](OutHandler.html "interface in akka.stream.stage") handler)
		```
		
		Assigns callbacks for the events for an `Outlet`
		- #### getHandler
		
		
		
		```
		protected final [OutHandler](OutHandler.html "interface in akka.stream.stage") getHandler​([Outlet](../Outlet.html "class in akka.stream")<?> out)
		```
		
		Retrieves the current callback for the events on the given `Outlet`
		- #### pull
		
		
		
		```
		protected final <T> void pull​([Inlet](../Inlet.html "class in akka.stream")<T> in)
		```
		
		Requests an element on the given port. Calling this method twice before an element arrived will fail.
		 There can only be one outstanding request at any given time. The method [`<T>hasBeenPulled(akka.stream.Inlet<T>)`](#hasBeenPulled(akka.stream.Inlet)) can be used
		 query whether pull is allowed to be called or not. This method will also fail if the port is already closed.
		- #### tryPull
		
		
		
		```
		protected final <T> void tryPull​([Inlet](../Inlet.html "class in akka.stream")<T> in)
		```
		
		Requests an element on the given port unless the port is already closed.
		 Calling this method twice before an element arrived will fail.
		 There can only be one outstanding request at any given time. The method [`<T>hasBeenPulled(akka.stream.Inlet<T>)`](#hasBeenPulled(akka.stream.Inlet)) can be used
		 query whether pull is allowed to be called or not.
		- #### cancel
		
		
		
		```
		protected final <T> void cancel​([Inlet](../Inlet.html "class in akka.stream")<T> in)
		```
		
		Requests to stop receiving events from a given input port. Cancelling clears any ungrabbed elements from the port.
		 
		 If cancellation is due to an error, use `cancel(in, cause)` instead to propagate that cause upstream. This overload
		 is a shortcut for `cancel(in, SubscriptionWithCancelException.NoMoreElementsNeeded)`
		- #### cancel
		
		
		
		```
		protected final <T> void cancel​([Inlet](../Inlet.html "class in akka.stream")<T> in,
		                                java.lang.Throwable cause)
		```
		
		Requests to stop receiving events from a given input port. Cancelling clears any ungrabbed elements from the port.
		- #### grab
		
		
		
		```
		protected final <T> T grab​([Inlet](../Inlet.html "class in akka.stream")<T> in)
		```
		
		Once the callback `InHandler.onPush` for an input port has been invoked, the element that has been pushed
		 can be retrieved via this method. After [`<T>grab(akka.stream.Inlet<T>)`](#grab(akka.stream.Inlet)) has been called the port is considered to be empty, and further
		 calls to [`<T>grab(akka.stream.Inlet<T>)`](#grab(akka.stream.Inlet)) will fail until the port is pulled again and a new element is pushed as a response.
		 
		 The method [`<T>isAvailable(akka.stream.Inlet<T>)`](#isAvailable(akka.stream.Inlet)) can be used to query if the port has an element that can be grabbed or not.
		- #### hasBeenPulled
		
		
		
		```
		protected final <T> boolean hasBeenPulled​([Inlet](../Inlet.html "class in akka.stream")<T> in)
		```
		
		Indicates whether there is already a pending pull for the given input port. If this method returns true
		 then [`<T>isAvailable(akka.stream.Inlet<T>)`](#isAvailable(akka.stream.Inlet)) must return false for that same port.
		- #### isAvailable
		
		
		
		```
		protected final <T> boolean isAvailable​([Inlet](../Inlet.html "class in akka.stream")<T> in)
		```
		
		Indicates whether there is an element waiting at the given input port. [`<T>grab(akka.stream.Inlet<T>)`](#grab(akka.stream.Inlet)) can be used to retrieve the
		 element. After calling [`<T>grab(akka.stream.Inlet<T>)`](#grab(akka.stream.Inlet)) this method will return false.
		 
		 If this method returns true then [`<T>hasBeenPulled(akka.stream.Inlet<T>)`](#hasBeenPulled(akka.stream.Inlet)) will return false for that same port.
		- #### isClosed
		
		
		
		```
		protected final <T> boolean isClosed​([Inlet](../Inlet.html "class in akka.stream")<T> in)
		```
		
		Indicates whether the port has been closed. A closed port cannot be pulled.
		- #### push
		
		
		
		```
		protected final <T> void push​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                              T elem)
		```
		
		Emits an element through the given output port. Calling this method twice before a [`<T>pull(akka.stream.Inlet<T>)`](#pull(akka.stream.Inlet)) has been arrived
		 will fail. There can be only one outstanding push request at any given time. The method [`<T>isAvailable(akka.stream.Inlet<T>)`](#isAvailable(akka.stream.Inlet)) can be
		 used to check if the port is ready to be pushed or not.
		- #### setKeepGoing
		
		
		
		```
		protected final void setKeepGoing​(boolean enabled)
		```
		
		Controls whether this operator shall shut down when all its ports are closed, which
		 is the default. In order to have it keep going past that point this method needs
		 to be called with a `true` argument before all ports are closed, and afterwards
		 it will not be closed until this method is called with a `false` argument or the
		 operator is terminated via `completeStage()` or `failStage()`.
		- #### complete
		
		
		
		```
		protected final <T> void complete​([Outlet](../Outlet.html "class in akka.stream")<T> out)
		```
		
		Signals that there will be no more elements emitted on the given port.
		- #### fail
		
		
		
		```
		protected final <T> void fail​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                              java.lang.Throwable ex)
		```
		
		Signals failure through the given port.
		- #### completeStage
		
		
		
		```
		public final void completeStage()
		```
		
		Automatically invokes [`<T>cancel(akka.stream.Inlet<T>)`](#cancel(akka.stream.Inlet)) or [`<T>complete(akka.stream.Outlet<T>)`](#complete(akka.stream.Outlet)) on all the input or output ports that have been called,
		 then marks the operator as stopped.
		- #### cancelStage
		
		
		
		```
		public final void cancelStage​(java.lang.Throwable cause)
		```
		
		Automatically invokes [`<T>cancel(akka.stream.Inlet<T>)`](#cancel(akka.stream.Inlet)) or [`<T>complete(akka.stream.Outlet<T>)`](#complete(akka.stream.Outlet)) on all the input or output ports that have been called,
		 then marks the stage as stopped.
		- #### failStage
		
		
		
		```
		public final void failStage​(java.lang.Throwable ex)
		```
		
		Automatically invokes [`<T>cancel(akka.stream.Inlet<T>)`](#cancel(akka.stream.Inlet)) or [`<T>fail(akka.stream.Outlet<T>,java.lang.Throwable)`](#fail(akka.stream.Outlet,java.lang.Throwable)) on all the input or output ports that have been called,
		 then marks the operator as stopped.
		- #### isAvailable
		
		
		
		```
		public final <T> boolean isAvailable​([Outlet](../Outlet.html "class in akka.stream")<T> out)
		```
		
		Return true if the given output port is ready to be pushed.
		- #### isClosed
		
		
		
		```
		protected final <T> boolean isClosed​([Outlet](../Outlet.html "class in akka.stream")<T> out)
		```
		
		Indicates whether the port has been closed. A closed port cannot be pushed.
		- #### readN
		
		
		
		```
		protected final <T> void readN​([Inlet](../Inlet.html "class in akka.stream")<T> in,
		                               int n,
		                               scala.Function1<scala.collection.immutable.Seq<T>,​scala.runtime.BoxedUnit> andThen,
		                               scala.Function1<scala.collection.immutable.Seq<T>,​scala.runtime.BoxedUnit> onClose)
		```
		
		Read a number of elements from the given inlet and continue with the given function,
		 suspending execution if necessary. This action replaces the [`InHandler`](InHandler.html "interface in akka.stream.stage")
		 for the given inlet if suspension is needed and reinstalls the current
		 handler upon receiving the last `onPush()` signal.
		 
		 If upstream closes before N elements have been read,
		 the `onClose` function is invoked with the elements which were read.
		- #### readN
		
		
		
		```
		protected final <T> void readN​([Inlet](../Inlet.html "class in akka.stream")<T> in,
		                               int n,
		                               [Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<java.util.List<T>> andThen,
		                               [Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<java.util.List<T>> onClose)
		```
		
		Java API: Read a number of elements from the given inlet and continue with the given function,
		 suspending execution if necessary. This action replaces the [`InHandler`](InHandler.html "interface in akka.stream.stage")
		 for the given inlet if suspension is needed and reinstalls the current
		 handler upon receiving the last `onPush()` signal (before invoking the `andThen` function).
		- #### read
		
		
		
		```
		protected final <T> void read​([Inlet](../Inlet.html "class in akka.stream")<T> in,
		                              scala.Function1<T,​scala.runtime.BoxedUnit> andThen,
		                              scala.Function0<scala.runtime.BoxedUnit> onClose)
		```
		
		Read an element from the given inlet and continue with the given function,
		 suspending execution if necessary. This action replaces the [`InHandler`](InHandler.html "interface in akka.stream.stage")
		 for the given inlet if suspension is needed and reinstalls the current
		 handler upon receiving the `onPush()` signal (before invoking the `andThen` function).
		- #### read
		
		
		
		```
		protected final <T> void read​([Inlet](../Inlet.html "class in akka.stream")<T> in,
		                              [Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<T> andThen,
		                              [Effect](../../japi/function/Effect.html "interface in akka.japi.function") onClose)
		```
		
		Java API: Read an element from the given inlet and continue with the given function,
		 suspending execution if necessary. This action replaces the [`InHandler`](InHandler.html "interface in akka.stream.stage")
		 for the given inlet if suspension is needed and reinstalls the current
		 handler upon receiving the `onPush()` signal (before invoking the `andThen` function).
		- #### abortReading
		
		
		
		```
		protected final void abortReading​([Inlet](../Inlet.html "class in akka.stream")<?> in)
		```
		
		Abort outstanding (suspended) reading for the given inlet, if there is any.
		 This will reinstall the replaced handler that was in effect before the `read`
		 call.
		- #### emitMultiple
		
		
		
		```
		protected final <T> void emitMultiple​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                                      scala.collection.immutable.Iterable<T> elems,
		                                      scala.Function0<scala.runtime.BoxedUnit> andThen)
		```
		
		Emit a sequence of elements through the given outlet and continue with the given thunk
		 afterwards, suspending execution if necessary.
		 This action replaces the [`OutHandler`](OutHandler.html "interface in akka.stream.stage") for the given outlet if suspension
		 is needed and reinstalls the current handler upon receiving an `onPull()`
		 signal (before invoking the `andThen` function).
		- #### emitMultiple
		
		
		
		```
		protected final <T> void emitMultiple​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                                      scala.collection.immutable.Iterable<T> elems)
		```
		
		Emit a sequence of elements through the given outlet, suspending execution if necessary.
		 This action replaces the [`OutHandler`](OutHandler.html "interface in akka.stream.stage") for the given outlet if suspension
		 is needed and reinstalls the current handler upon receiving an `onPull()`
		 signal.
		- #### emitMultiple
		
		
		
		```
		protected final <T> void emitMultiple​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                                      java.util.Iterator<T> elems)
		```
		
		Java API
		 
		 Emit a sequence of elements through the given outlet, suspending execution if necessary.
		 This action replaces the [`AbstractOutHandler`](AbstractOutHandler.html "class in akka.stream.stage") for the given outlet if suspension
		 is needed and reinstalls the current handler upon receiving an `onPull()`
		 signal.
		- #### emitMultiple
		
		
		
		```
		protected final <T> void emitMultiple​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                                      java.util.Iterator<T> elems,
		                                      [Effect](../../japi/function/Effect.html "interface in akka.japi.function") andThen)
		```
		
		Java API
		 
		 Emit a sequence of elements through the given outlet, suspending execution if necessary.
		 This action replaces the [`AbstractOutHandler`](AbstractOutHandler.html "class in akka.stream.stage") for the given outlet if suspension
		 is needed and reinstalls the current handler upon receiving an `onPull()`
		 signal.
		- #### emitMultiple
		
		
		
		```
		protected final <T> void emitMultiple​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                                      scala.collection.Iterator<T> elems,
		                                      scala.Function0<scala.runtime.BoxedUnit> andThen)
		```
		
		Emit a sequence of elements through the given outlet and continue with the given thunk
		 afterwards, suspending execution if necessary.
		 This action replaces the [`OutHandler`](OutHandler.html "interface in akka.stream.stage") for the given outlet if suspension
		 is needed and reinstalls the current handler upon receiving an `onPull()`
		 signal (before invoking the `andThen` function).
		- #### emitMultiple
		
		
		
		```
		protected final <T> void emitMultiple​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                                      scala.collection.Iterator<T> elems)
		```
		
		Emit a sequence of elements through the given outlet, suspending execution if necessary.
		 This action replaces the [`OutHandler`](OutHandler.html "interface in akka.stream.stage") for the given outlet if suspension
		 is needed and reinstalls the current handler upon receiving an `onPull()`
		 signal.
		- #### emit
		
		
		
		```
		protected final <T> void emit​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                              T elem,
		                              scala.Function0<scala.runtime.BoxedUnit> andThen)
		```
		
		Emit an element through the given outlet and continue with the given thunk
		 afterwards, suspending execution if necessary.
		 This action replaces the [`OutHandler`](OutHandler.html "interface in akka.stream.stage") for the given outlet if suspension
		 is needed and reinstalls the current handler upon receiving an `onPull()`
		 signal (before invoking the `andThen` function).
		- #### emit
		
		
		
		```
		protected final <T> void emit​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                              T elem)
		```
		
		Emit an element through the given outlet, suspending execution if necessary.
		 This action replaces the [`OutHandler`](OutHandler.html "interface in akka.stream.stage") for the given outlet if suspension
		 is needed and reinstalls the current handler upon receiving an `onPull()`
		 signal.
		- #### emit
		
		
		
		```
		protected final <T> void emit​([Outlet](../Outlet.html "class in akka.stream")<T> out,
		                              T elem,
		                              [Effect](../../japi/function/Effect.html "interface in akka.japi.function") andThen)
		```
		- #### abortEmitting
		
		
		
		```
		protected final void abortEmitting​([Outlet](../Outlet.html "class in akka.stream")<?> out)
		```
		
		Abort outstanding (suspended) emissions for the given outlet, if there are any.
		 This will reinstall the replaced handler that was in effect before the `emit`
		 call.
		- #### passAlong
		
		
		
		```
		protected final <Out,​In extends Out> void passAlong​([Inlet](../Inlet.html "class in akka.stream")<In> from,
		                                                          [Outlet](../Outlet.html "class in akka.stream")<Out> to,
		                                                          boolean doFinish,
		                                                          boolean doFail,
		                                                          boolean doPull)
		```
		
		Install a handler on the given inlet that emits received elements on the
		 given outlet before pulling for more data. `doFinish` and `doFail` control whether
		 completion or failure of the given inlet shall lead to operator termination or not.
		 `doPull` instructs to perform one initial pull on the `from` port.
		- #### passAlong$default$3
		
		
		
		```
		protected final <Out,​In extends Out> boolean passAlong$default$3()
		```
		- #### passAlong$default$4
		
		
		
		```
		protected final <Out,​In extends Out> boolean passAlong$default$4()
		```
		- #### passAlong$default$5
		
		
		
		```
		protected final <Out,​In extends Out> boolean passAlong$default$5()
		```
		- #### getAsyncCallback
		
		
		
		```
		public final <T> [AsyncCallback](AsyncCallback.html "interface in akka.stream.stage")<T> getAsyncCallback​(scala.Function1<T,​scala.runtime.BoxedUnit> handler)
		```
		
		Obtain a callback object that can be used asynchronously to re\-enter the
		 current [`GraphStage`](GraphStage.html "class in akka.stream.stage") with an asynchronous notification. The `invoke` method of the returned
		 [`AsyncCallback`](AsyncCallback.html "interface in akka.stream.stage") is safe to be called from other threads. It will in the background thread\-safely
		 delegate to the passed callback function. I.e. `invoke` will be called by other thread and
		 the passed handler will be invoked eventually in a thread\-safe way by the execution environment.
		 
		 In case stream is not yet materialized [`AsyncCallback`](AsyncCallback.html "interface in akka.stream.stage") will buffer events until stream is available.
		 
		
		
		`AsyncCallback.invokeWithFeedback` has an internal promise that will be failed if event cannot be processed
		 due to stream completion.
		 
		
		
		 To be thread safe this method must only be called from either the constructor of the graph operator during
		 materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.
		 
		
		
		 This object can be cached and reused within the same [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage").
		- #### createAsyncCallback
		
		
		
		```
		protected final <T> [AsyncCallback](AsyncCallback.html "interface in akka.stream.stage")<T> createAsyncCallback​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<T> handler)
		```
		
		Java API: Obtain a callback object that can be used asynchronously to re\-enter the
		 current [`GraphStage`](GraphStage.html "class in akka.stream.stage") with an asynchronous notification. The `invoke` method of the returned
		 [`AsyncCallback`](AsyncCallback.html "interface in akka.stream.stage") is safe to be called from other threads. It will in the background thread\-safely
		 delegate to the passed callback function. I.e. `invoke` will be called by other thread and
		 the passed handler will be invoked eventually in a thread\-safe way by the execution environment.
		 
		`AsyncCallback.invokeWithFeedback` has an internal promise that will be failed if event cannot be processed due to stream completion.
		 
		
		
		 This object can be cached and reused within the same [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage").
		- #### stageActor
		
		
		
		```
		public final [GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage") stageActor()
		```
		- #### getStageActor
		
		
		
		```
		protected final [GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage") getStageActor​(scala.Function1<scala.Tuple2<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object>,​scala.runtime.BoxedUnit> receive)
		```
		
		Initialize a `StageActorRef` which can be used to interact with from the outside world "as\-if" an `Actor`.
		 The messages are looped through the [`<T>getAsyncCallback(scala.Function1<T,scala.runtime.BoxedUnit>)`](#getAsyncCallback(scala.Function1)) mechanism of [`GraphStage`](GraphStage.html "class in akka.stream.stage") so they are safe to modify
		 internal state of this operator.
		 
		 This method must (the earliest) be called after the [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage") constructor has finished running,
		 for example from the [`preStart()`](#preStart()) callback the graph operator logic provides.
		 
		
		
		 Created `StageActorRef` to get messages and watch other actors in synchronous way.
		 
		
		
		 The `StageActorRef`'s lifecycle is bound to the operator, in other words when the operator is finished,
		 the Actor will be terminated as well. The entity backing the `StageActorRef` is not a real Actor,
		 but the [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage") itself, therefore it does not react to `PoisonPill`.
		 
		
		
		 To be thread safe this method must only be called from either the constructor of the graph operator during
		 materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.
		 
		
		
		
		Parameters:
		`receive` \- callback that will be called upon receiving of a message by this special Actor
		Returns:
		minimal actor with watch method
		- #### getEagerStageActor
		
		
		
		```
		protected [GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage") getEagerStageActor​([Materializer](../Materializer.html "class in akka.stream") eagerMaterializer,
		                                                        scala.Function1<scala.Tuple2<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object>,​scala.runtime.BoxedUnit> receive)
		```
		
		INTERNAL API
		 
		 To be thread safe this method must only be called from either the constructor of the graph operator during
		 materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.
		- #### stageActorName
		
		
		
		```
		protected java.lang.String stageActorName()
		```
		
		Override and return a name to be given to the StageActor of this operator.
		 
		 This method will be only invoked and used once, during the first [`getStageActor(scala.Function1<scala.Tuple2<akka.actor.ActorRef,java.lang.Object>,scala.runtime.BoxedUnit>)`](#getStageActor(scala.Function1))
		 invocation whichc reates the actor, since subsequent `getStageActors` calls function
		 like `become`, rather than creating new actors.
		 
		
		
		 Returns an empty string by default, which means that the name will a unique generated String (e.g. "$$a").
		- #### beforePreStart
		
		
		
		```
		protected void beforePreStart()
		```
		
		INTERNAL API
		- #### afterPostStop
		
		
		
		```
		protected void afterPostStop()
		```
		
		INTERNAL API
		- #### preStart
		
		
		
		```
		public void preStart()
		              throws java.lang.Exception
		```
		
		Invoked before any external events are processed, at the startup of the operator.
		
		Throws:
		`java.lang.Exception`
		- #### postStop
		
		
		
		```
		public void postStop()
		              throws java.lang.Exception
		```
		
		Invoked after processing of external events stopped because the operator is about to stop or fail.
		
		Throws:
		`java.lang.Exception`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitches.KillableGraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/AbstractOutHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/AsyncCallback.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.ConditionalTerminateInput.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.ConditionalTerminateOutput.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.EagerTerminateInput$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.EagerTerminateOutput$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.IgnoreTerminateInput$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.IgnoreTerminateOutput$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.StageActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.StageActorRef$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.StageActorRefNotInitializedException$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.StageActorRefNotInitializedException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.SubSinkInlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.SubSourceOutlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.TotallyIgnorantInput$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogicWithLogging.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/InHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/OutHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/TimerGraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html)*