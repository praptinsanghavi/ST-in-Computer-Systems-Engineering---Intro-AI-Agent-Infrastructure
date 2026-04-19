---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:49:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/TimerGraphStageLogicWithLogging.html
title: TimerGraphStageLogicWithLogging
---

# TimerGraphStageLogicWithLogging

## Content

Package [akka.stream.stage](package-summary.html)
## Class TimerGraphStageLogicWithLogging

- java.lang.Object
- - [akka.stream.stage.GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")
	- - [akka.stream.stage.TimerGraphStageLogic](TimerGraphStageLogic.html "class in akka.stream.stage")
		- - akka.stream.stage.TimerGraphStageLogicWithLogging

- All Implemented Interfaces:
`[StageLogging](StageLogging.html "interface in akka.stream.stage")`

Direct Known Subclasses:
`[RestartWithBackoffLogic](../scaladsl/RestartWithBackoffLogic.html "class in akka.stream.scaladsl")`

---

```
public abstract class TimerGraphStageLogicWithLogging
extends [TimerGraphStageLogic](TimerGraphStageLogic.html "class in akka.stream.stage")
implements [StageLogging](StageLogging.html "interface in akka.stream.stage")
```

Java API: [`TimerGraphStageLogic`](TimerGraphStageLogic.html "class in akka.stream.stage") with [`StageLogging`](StageLogging.html "interface in akka.stream.stage").

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.stage.[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")
		
		
		`[GraphStageLogic.ConditionalTerminateInput](GraphStageLogic.ConditionalTerminateInput.html "class in akka.stream.stage"), [GraphStageLogic.ConditionalTerminateOutput](GraphStageLogic.ConditionalTerminateOutput.html "class in akka.stream.stage"), [GraphStageLogic.EagerTerminateInput$](GraphStageLogic.EagerTerminateInput$.html "class in akka.stream.stage"), [GraphStageLogic.EagerTerminateOutput$](GraphStageLogic.EagerTerminateOutput$.html "class in akka.stream.stage"), [GraphStageLogic.IgnoreTerminateInput$](GraphStageLogic.IgnoreTerminateInput$.html "class in akka.stream.stage"), [GraphStageLogic.IgnoreTerminateOutput$](GraphStageLogic.IgnoreTerminateOutput$.html "class in akka.stream.stage"), [GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRef$](GraphStageLogic.StageActorRef$.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRefNotInitializedException](GraphStageLogic.StageActorRefNotInitializedException.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRefNotInitializedException$](GraphStageLogic.StageActorRefNotInitializedException$.html "class in akka.stream.stage"), [GraphStageLogic.SubSinkInlet](GraphStageLogic.SubSinkInlet.html "class in akka.stream.stage")<[T](GraphStageLogic.SubSinkInlet.html "type parameter in GraphStageLogic.SubSinkInlet")>, [GraphStageLogic.SubSourceOutlet](GraphStageLogic.SubSourceOutlet.html "class in akka.stream.stage")<[T](GraphStageLogic.SubSourceOutlet.html "type parameter in GraphStageLogic.SubSourceOutlet")>, [GraphStageLogic.TotallyIgnorantInput$](GraphStageLogic.TotallyIgnorantInput$.html "class in akka.stream.stage")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimerGraphStageLogicWithLogging](#%3Cinit%3E(akka.stream.Shape))​([Shape](../Shape.html "class in akka.stream") _shape)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.stream.stage.[TimerGraphStageLogic](TimerGraphStageLogic.html "class in akka.stream.stage")
		
		
		`[afterPostStop](TimerGraphStageLogic.html#afterPostStop()), [cancelTimer](TimerGraphStageLogic.html#cancelTimer(java.lang.Object)), [isTimerActive](TimerGraphStageLogic.html#isTimerActive(java.lang.Object)), [onTimer](TimerGraphStageLogic.html#onTimer(java.lang.Object)), [scheduleAtFixedRate](TimerGraphStageLogic.html#scheduleAtFixedRate(java.lang.Object,java.time.Duration,java.time.Duration)), [scheduleAtFixedRate](TimerGraphStageLogic.html#scheduleAtFixedRate(java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration)), [scheduleOnce](TimerGraphStageLogic.html#scheduleOnce(java.lang.Object,java.time.Duration)), [scheduleOnce](TimerGraphStageLogic.html#scheduleOnce(java.lang.Object,scala.concurrent.duration.FiniteDuration)), [schedulePeriodically](TimerGraphStageLogic.html#schedulePeriodically(java.lang.Object,java.time.Duration)), [schedulePeriodically](TimerGraphStageLogic.html#schedulePeriodically(java.lang.Object,scala.concurrent.duration.FiniteDuration)), [schedulePeriodicallyWithInitialDelay](TimerGraphStageLogic.html#schedulePeriodicallyWithInitialDelay(java.lang.Object,java.time.Duration,java.time.Duration)), [schedulePeriodicallyWithInitialDelay](TimerGraphStageLogic.html#schedulePeriodicallyWithInitialDelay(java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration)), [scheduleWithFixedDelay](TimerGraphStageLogic.html#scheduleWithFixedDelay(java.lang.Object,java.time.Duration,java.time.Duration)), [scheduleWithFixedDelay](TimerGraphStageLogic.html#scheduleWithFixedDelay(java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")
		
		
		`[abortEmitting](GraphStageLogic.html#abortEmitting(akka.stream.Outlet)), [abortReading](GraphStageLogic.html#abortReading(akka.stream.Inlet)), [beforePreStart](GraphStageLogic.html#beforePreStart()), [cancel](GraphStageLogic.html#cancel(akka.stream.Inlet)), [cancel](GraphStageLogic.html#cancel(akka.stream.Inlet,java.lang.Throwable)), [cancelStage](GraphStageLogic.html#cancelStage(java.lang.Throwable)), [complete](GraphStageLogic.html#complete(akka.stream.Outlet)), [completeStage](GraphStageLogic.html#completeStage()), [conditionalTerminateInput](GraphStageLogic.html#conditionalTerminateInput(scala.Function0)), [conditionalTerminateOutput](GraphStageLogic.html#conditionalTerminateOutput(scala.Function0)), [createAsyncCallback](GraphStageLogic.html#createAsyncCallback(akka.japi.function.Procedure)), [eagerTerminateInput](GraphStageLogic.html#eagerTerminateInput()), [eagerTerminateOutput](GraphStageLogic.html#eagerTerminateOutput()), [emit](GraphStageLogic.html#emit(akka.stream.Outlet,T)), [emit](GraphStageLogic.html#emit(akka.stream.Outlet,T,akka.japi.function.Effect)), [emit](GraphStageLogic.html#emit(akka.stream.Outlet,T,scala.Function0)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,java.util.Iterator)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,java.util.Iterator,akka.japi.function.Effect)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable,scala.Function0)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.Iterator)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.Iterator,scala.Function0)), [fail](GraphStageLogic.html#fail(akka.stream.Outlet,java.lang.Throwable)), [failStage](GraphStageLogic.html#failStage(java.lang.Throwable)), [getAsyncCallback](GraphStageLogic.html#getAsyncCallback(scala.Function1)), [getEagerStageActor](GraphStageLogic.html#getEagerStageActor(akka.stream.Materializer,scala.Function1)), [getHandler](GraphStageLogic.html#getHandler(akka.stream.Inlet)), [getHandler](GraphStageLogic.html#getHandler(akka.stream.Outlet)), [getStageActor](GraphStageLogic.html#getStageActor(scala.Function1)), [grab](GraphStageLogic.html#grab(akka.stream.Inlet)), [hasBeenPulled](GraphStageLogic.html#hasBeenPulled(akka.stream.Inlet)), [ignoreTerminateInput](GraphStageLogic.html#ignoreTerminateInput()), [ignoreTerminateOutput](GraphStageLogic.html#ignoreTerminateOutput()), [inCount](GraphStageLogic.html#inCount()), [isAvailable](GraphStageLogic.html#isAvailable(akka.stream.Inlet)), [isAvailable](GraphStageLogic.html#isAvailable(akka.stream.Outlet)), [isClosed](GraphStageLogic.html#isClosed(akka.stream.Inlet)), [isClosed](GraphStageLogic.html#isClosed(akka.stream.Outlet)), [materializer](GraphStageLogic.html#materializer()), [outCount](GraphStageLogic.html#outCount()), [passAlong](GraphStageLogic.html#passAlong(akka.stream.Inlet,akka.stream.Outlet,boolean,boolean,boolean)), [passAlong$default$3](GraphStageLogic.html#passAlong$default$3()), [passAlong$default$4](GraphStageLogic.html#passAlong$default$4()), [passAlong$default$5](GraphStageLogic.html#passAlong$default$5()), [postStop](GraphStageLogic.html#postStop()), [preStart](GraphStageLogic.html#preStart()), [pull](GraphStageLogic.html#pull(akka.stream.Inlet)), [push](GraphStageLogic.html#push(akka.stream.Outlet,T)), [read](GraphStageLogic.html#read(akka.stream.Inlet,akka.japi.function.Procedure,akka.japi.function.Effect)), [read](GraphStageLogic.html#read(akka.stream.Inlet,scala.Function1,scala.Function0)), [readN](GraphStageLogic.html#readN(akka.stream.Inlet,int,akka.japi.function.Procedure,akka.japi.function.Procedure)), [readN](GraphStageLogic.html#readN(akka.stream.Inlet,int,scala.Function1,scala.Function1)), [setHandler](GraphStageLogic.html#setHandler(akka.stream.Inlet,akka.stream.stage.InHandler)), [setHandler](GraphStageLogic.html#setHandler(akka.stream.Outlet,akka.stream.stage.OutHandler)), [setHandlers](GraphStageLogic.html#setHandlers(akka.stream.Inlet,akka.stream.Outlet,akka.stream.stage.InHandler)), [setKeepGoing](GraphStageLogic.html#setKeepGoing(boolean)), [stageActor](GraphStageLogic.html#stageActor()), [stageActorName](GraphStageLogic.html#stageActorName()), [subFusingMaterializer](GraphStageLogic.html#subFusingMaterializer()), [toString](GraphStageLogic.html#toString()), [totallyIgnorantInput](GraphStageLogic.html#totallyIgnorantInput()), [tryPull](GraphStageLogic.html#tryPull(akka.stream.Inlet))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.stage.[StageLogging](StageLogging.html "interface in akka.stream.stage")
		
		
		`[_log_$eq](StageLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](StageLogging.html#log()), [logSource](StageLogging.html#logSource())`

- - ### Constructor Detail
	
	
	
		- #### TimerGraphStageLogicWithLogging
		
		
		
		```
		public TimerGraphStageLogicWithLogging​([Shape](../Shape.html "class in akka.stream") _shape)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/RestartWithBackoffLogic.html
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
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/StageLogging.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/TimerGraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/TimerGraphStageLogicWithLogging.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/TimerGraphStageLogicWithLogging.html)*