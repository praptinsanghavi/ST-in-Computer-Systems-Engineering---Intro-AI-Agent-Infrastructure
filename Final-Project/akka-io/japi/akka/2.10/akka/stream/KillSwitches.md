---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:03:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/KillSwitches.KillableGraphStageLogic.html
title: KillSwitches.KillableGraphStageLogic
---

# KillSwitches.KillableGraphStageLogic

## Content

Package [akka.stream](package-summary.html)
## Class KillSwitches.KillableGraphStageLogic

- java.lang.Object
- - [akka.stream.stage.GraphStageLogic](stage/GraphStageLogic.html "class in akka.stream.stage")
	- - akka.stream.KillSwitches.KillableGraphStageLogic

- Enclosing class:
[KillSwitches](KillSwitches.html "class in akka.stream")

---

```
public abstract static class KillSwitches.KillableGraphStageLogic
extends [GraphStageLogic](stage/GraphStageLogic.html "class in akka.stream.stage")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.stage.[GraphStageLogic](stage/GraphStageLogic.html "class in akka.stream.stage")
		
		
		`[GraphStageLogic.ConditionalTerminateInput](stage/GraphStageLogic.ConditionalTerminateInput.html "class in akka.stream.stage"), [GraphStageLogic.ConditionalTerminateOutput](stage/GraphStageLogic.ConditionalTerminateOutput.html "class in akka.stream.stage"), [GraphStageLogic.EagerTerminateInput$](stage/GraphStageLogic.EagerTerminateInput$.html "class in akka.stream.stage"), [GraphStageLogic.EagerTerminateOutput$](stage/GraphStageLogic.EagerTerminateOutput$.html "class in akka.stream.stage"), [GraphStageLogic.IgnoreTerminateInput$](stage/GraphStageLogic.IgnoreTerminateInput$.html "class in akka.stream.stage"), [GraphStageLogic.IgnoreTerminateOutput$](stage/GraphStageLogic.IgnoreTerminateOutput$.html "class in akka.stream.stage"), [GraphStageLogic.StageActor](stage/GraphStageLogic.StageActor.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRef$](stage/GraphStageLogic.StageActorRef$.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRefNotInitializedException](stage/GraphStageLogic.StageActorRefNotInitializedException.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRefNotInitializedException$](stage/GraphStageLogic.StageActorRefNotInitializedException$.html "class in akka.stream.stage"), [GraphStageLogic.SubSinkInlet](stage/GraphStageLogic.SubSinkInlet.html "class in akka.stream.stage")<[T](stage/GraphStageLogic.SubSinkInlet.html "type parameter in GraphStageLogic.SubSinkInlet")>, [GraphStageLogic.SubSourceOutlet](stage/GraphStageLogic.SubSourceOutlet.html "class in akka.stream.stage")<[T](stage/GraphStageLogic.SubSourceOutlet.html "type parameter in GraphStageLogic.SubSourceOutlet")>, [GraphStageLogic.TotallyIgnorantInput$](stage/GraphStageLogic.TotallyIgnorantInput$.html "class in akka.stream.stage")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[KillableGraphStageLogic](#%3Cinit%3E(scala.concurrent.Future,akka.stream.Shape))​(scala.concurrent.Future<[Done](../Done.html "class in akka")> terminationSignal,  [Shape](Shape.html "class in akka.stream") _shape)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[preStart](#preStart())()` | Invoked before any external events are processed, at the startup of the operator. |
	| `scala.concurrent.Future<[Done](../Done.html "class in akka")>` | `[terminationSignal](#terminationSignal())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStageLogic](stage/GraphStageLogic.html "class in akka.stream.stage")
		
		
		`[abortEmitting](stage/GraphStageLogic.html#abortEmitting(akka.stream.Outlet)), [abortReading](stage/GraphStageLogic.html#abortReading(akka.stream.Inlet)), [afterPostStop](stage/GraphStageLogic.html#afterPostStop()), [beforePreStart](stage/GraphStageLogic.html#beforePreStart()), [cancel](stage/GraphStageLogic.html#cancel(akka.stream.Inlet)), [cancel](stage/GraphStageLogic.html#cancel(akka.stream.Inlet,java.lang.Throwable)), [cancelStage](stage/GraphStageLogic.html#cancelStage(java.lang.Throwable)), [complete](stage/GraphStageLogic.html#complete(akka.stream.Outlet)), [completeStage](stage/GraphStageLogic.html#completeStage()), [conditionalTerminateInput](stage/GraphStageLogic.html#conditionalTerminateInput(scala.Function0)), [conditionalTerminateOutput](stage/GraphStageLogic.html#conditionalTerminateOutput(scala.Function0)), [createAsyncCallback](stage/GraphStageLogic.html#createAsyncCallback(akka.japi.function.Procedure)), [eagerTerminateInput](stage/GraphStageLogic.html#eagerTerminateInput()), [eagerTerminateOutput](stage/GraphStageLogic.html#eagerTerminateOutput()), [emit](stage/GraphStageLogic.html#emit(akka.stream.Outlet,T)), [emit](stage/GraphStageLogic.html#emit(akka.stream.Outlet,T,akka.japi.function.Effect)), [emit](stage/GraphStageLogic.html#emit(akka.stream.Outlet,T,scala.Function0)), [emitMultiple](stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,java.util.Iterator)), [emitMultiple](stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,java.util.Iterator,akka.japi.function.Effect)), [emitMultiple](stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable)), [emitMultiple](stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable,scala.Function0)), [emitMultiple](stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.Iterator)), [emitMultiple](stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.Iterator,scala.Function0)), [fail](stage/GraphStageLogic.html#fail(akka.stream.Outlet,java.lang.Throwable)), [failStage](stage/GraphStageLogic.html#failStage(java.lang.Throwable)), [getAsyncCallback](stage/GraphStageLogic.html#getAsyncCallback(scala.Function1)), [getEagerStageActor](stage/GraphStageLogic.html#getEagerStageActor(akka.stream.Materializer,scala.Function1)), [getHandler](stage/GraphStageLogic.html#getHandler(akka.stream.Inlet)), [getHandler](stage/GraphStageLogic.html#getHandler(akka.stream.Outlet)), [getStageActor](stage/GraphStageLogic.html#getStageActor(scala.Function1)), [grab](stage/GraphStageLogic.html#grab(akka.stream.Inlet)), [hasBeenPulled](stage/GraphStageLogic.html#hasBeenPulled(akka.stream.Inlet)), [ignoreTerminateInput](stage/GraphStageLogic.html#ignoreTerminateInput()), [ignoreTerminateOutput](stage/GraphStageLogic.html#ignoreTerminateOutput()), [inCount](stage/GraphStageLogic.html#inCount()), [isAvailable](stage/GraphStageLogic.html#isAvailable(akka.stream.Inlet)), [isAvailable](stage/GraphStageLogic.html#isAvailable(akka.stream.Outlet)), [isClosed](stage/GraphStageLogic.html#isClosed(akka.stream.Inlet)), [isClosed](stage/GraphStageLogic.html#isClosed(akka.stream.Outlet)), [materializer](stage/GraphStageLogic.html#materializer()), [outCount](stage/GraphStageLogic.html#outCount()), [passAlong](stage/GraphStageLogic.html#passAlong(akka.stream.Inlet,akka.stream.Outlet,boolean,boolean,boolean)), [passAlong$default$3](stage/GraphStageLogic.html#passAlong$default$3()), [passAlong$default$4](stage/GraphStageLogic.html#passAlong$default$4()), [passAlong$default$5](stage/GraphStageLogic.html#passAlong$default$5()), [postStop](stage/GraphStageLogic.html#postStop()), [pull](stage/GraphStageLogic.html#pull(akka.stream.Inlet)), [push](stage/GraphStageLogic.html#push(akka.stream.Outlet,T)), [read](stage/GraphStageLogic.html#read(akka.stream.Inlet,akka.japi.function.Procedure,akka.japi.function.Effect)), [read](stage/GraphStageLogic.html#read(akka.stream.Inlet,scala.Function1,scala.Function0)), [readN](stage/GraphStageLogic.html#readN(akka.stream.Inlet,int,akka.japi.function.Procedure,akka.japi.function.Procedure)), [readN](stage/GraphStageLogic.html#readN(akka.stream.Inlet,int,scala.Function1,scala.Function1)), [setHandler](stage/GraphStageLogic.html#setHandler(akka.stream.Inlet,akka.stream.stage.InHandler)), [setHandler](stage/GraphStageLogic.html#setHandler(akka.stream.Outlet,akka.stream.stage.OutHandler)), [setHandlers](stage/GraphStageLogic.html#setHandlers(akka.stream.Inlet,akka.stream.Outlet,akka.stream.stage.InHandler)), [setKeepGoing](stage/GraphStageLogic.html#setKeepGoing(boolean)), [stageActor](stage/GraphStageLogic.html#stageActor()), [stageActorName](stage/GraphStageLogic.html#stageActorName()), [subFusingMaterializer](stage/GraphStageLogic.html#subFusingMaterializer()), [toString](stage/GraphStageLogic.html#toString()), [totallyIgnorantInput](stage/GraphStageLogic.html#totallyIgnorantInput()), [tryPull](stage/GraphStageLogic.html#tryPull(akka.stream.Inlet))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### KillableGraphStageLogic
		
		
		
		```
		public KillableGraphStageLogic​(scala.concurrent.Future<[Done](../Done.html "class in akka")> terminationSignal,
		                               [Shape](Shape.html "class in akka.stream") _shape)
		```

	- ### Method Detail
	
	
	
		- #### preStart
		
		
		
		```
		public void preStart()
		```
		
		Description copied from class: `[GraphStageLogic](stage/GraphStageLogic.html#preStart())`
		Invoked before any external events are processed, at the startup of the operator.
		
		Overrides:
		`[preStart](stage/GraphStageLogic.html#preStart())` in class `[GraphStageLogic](stage/GraphStageLogic.html "class in akka.stream.stage")`
		- #### terminationSignal
		
		
		
		```
		public scala.concurrent.Future<[Done](../Done.html "class in akka")> terminationSignal()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/Done.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/KillSwitches.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.ConditionalTerminateInput.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.ConditionalTerminateOutput.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.EagerTerminateInput$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.EagerTerminateOutput$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.IgnoreTerminateInput$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.IgnoreTerminateOutput$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.StageActor.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.StageActorRef$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.StageActorRefNotInitializedException$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.StageActorRefNotInitializedException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.SubSinkInlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.SubSourceOutlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.TotallyIgnorantInput$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/KillSwitches.KillableGraphStageLogic.html](https://doc.akka.io/japi/akka/2.10/akka/stream/KillSwitches.KillableGraphStageLogic.html)*