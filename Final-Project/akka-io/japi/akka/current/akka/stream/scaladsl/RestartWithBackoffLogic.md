---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffLogic.html
title: RestartWithBackoffLogic
---

# RestartWithBackoffLogic

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class RestartWithBackoffLogic\<S extends [Shape](../Shape.html "class in akka.stream")\>

- java.lang.Object
- - [akka.stream.stage.GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")
	- - [akka.stream.stage.TimerGraphStageLogic](../stage/TimerGraphStageLogic.html "class in akka.stream.stage")
		- - [akka.stream.stage.TimerGraphStageLogicWithLogging](../stage/TimerGraphStageLogicWithLogging.html "class in akka.stream.stage")
			- - akka.stream.scaladsl.RestartWithBackoffLogic\<S\>

- All Implemented Interfaces:
`[StageLogging](../stage/StageLogging.html "interface in akka.stream.stage")`

---

```
public abstract class RestartWithBackoffLogic<S extends [Shape](../Shape.html "class in akka.stream")>
extends [TimerGraphStageLogicWithLogging](../stage/TimerGraphStageLogicWithLogging.html "class in akka.stream.stage")
```

Shared logic for all restart with backoff logics.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.stage.[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")
		
		
		`[GraphStageLogic.ConditionalTerminateInput](../stage/GraphStageLogic.ConditionalTerminateInput.html "class in akka.stream.stage"), [GraphStageLogic.ConditionalTerminateOutput](../stage/GraphStageLogic.ConditionalTerminateOutput.html "class in akka.stream.stage"), [GraphStageLogic.EagerTerminateInput$](../stage/GraphStageLogic.EagerTerminateInput$.html "class in akka.stream.stage"), [GraphStageLogic.EagerTerminateOutput$](../stage/GraphStageLogic.EagerTerminateOutput$.html "class in akka.stream.stage"), [GraphStageLogic.IgnoreTerminateInput$](../stage/GraphStageLogic.IgnoreTerminateInput$.html "class in akka.stream.stage"), [GraphStageLogic.IgnoreTerminateOutput$](../stage/GraphStageLogic.IgnoreTerminateOutput$.html "class in akka.stream.stage"), [GraphStageLogic.StageActor](../stage/GraphStageLogic.StageActor.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRef$](../stage/GraphStageLogic.StageActorRef$.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRefNotInitializedException](../stage/GraphStageLogic.StageActorRefNotInitializedException.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRefNotInitializedException$](../stage/GraphStageLogic.StageActorRefNotInitializedException$.html "class in akka.stream.stage"), [GraphStageLogic.SubSinkInlet](../stage/GraphStageLogic.SubSinkInlet.html "class in akka.stream.stage")<[T](../stage/GraphStageLogic.SubSinkInlet.html "type parameter in GraphStageLogic.SubSinkInlet")>, [GraphStageLogic.SubSourceOutlet](../stage/GraphStageLogic.SubSourceOutlet.html "class in akka.stream.stage")<[T](../stage/GraphStageLogic.SubSourceOutlet.html "type parameter in GraphStageLogic.SubSourceOutlet")>, [GraphStageLogic.TotallyIgnorantInput$](../stage/GraphStageLogic.TotallyIgnorantInput$.html "class in akka.stream.stage")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartWithBackoffLogic](#%3Cinit%3E(java.lang.String,S,akka.stream.Attributes,akka.stream.RestartSettings,boolean))​(java.lang.String name,  [S](RestartWithBackoffLogic.html "type parameter in RestartWithBackoffLogic") shape,  [Attributes](../Attributes.html "class in akka.stream") inheritedAttributes,  [RestartSettings](../RestartSettings.html "class in akka.stream") settings,  boolean onlyOnFailures)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract void` | `[backoff](#backoff())()` |  |
	| `protected <T> [GraphStageLogic.SubSinkInlet](../stage/GraphStageLogic.SubSinkInlet.html "class in akka.stream.stage")<T>` | `[createSubInlet](#createSubInlet(akka.stream.Outlet))​([Outlet](../Outlet.html "class in akka.stream")<T> out)` |  |
	| `protected <T> [GraphStageLogic.SubSourceOutlet](../stage/GraphStageLogic.SubSourceOutlet.html "class in akka.stream.stage")<T>` | `[createSubOutlet](#createSubOutlet(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<T> in)` |  |
	| `boolean` | `[finishing](#finishing())()` |  |
	| `void` | `[finishing_$eq](#finishing_$eq(boolean))​(boolean x$1)` |  |
	| `protected java.lang.Class<?>` | `[logSource](#logSource())()` | Override to customise reported log source |
	| `protected boolean` | `[maxRestartsReached](#maxRestartsReached())()` |  |
	| `protected void` | `[onTimer](#onTimer(java.lang.Object))​(java.lang.Object timerKey)` | Will be called when the scheduled timer is triggered. |
	| `void` | `[preStart](#preStart())()` | Invoked before any external events are processed, at the startup of the operator. |
	| `scala.concurrent.duration.Deadline` | `[resetDeadline](#resetDeadline())()` |  |
	| `void` | `[resetDeadline_$eq](#resetDeadline_$eq(scala.concurrent.duration.Deadline))​(scala.concurrent.duration.Deadline x$1)` |  |
	| `int` | `[restartCount](#restartCount())()` |  |
	| `void` | `[restartCount_$eq](#restartCount_$eq(int))​(int x$1)` |  |
	| `protected void` | `[scheduleRestartTimer](#scheduleRestartTimer())()` |  |
	| `protected abstract void` | `[startGraph](#startGraph())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[TimerGraphStageLogic](../stage/TimerGraphStageLogic.html "class in akka.stream.stage")
		
		
		`[afterPostStop](../stage/TimerGraphStageLogic.html#afterPostStop()), [cancelTimer](../stage/TimerGraphStageLogic.html#cancelTimer(java.lang.Object)), [isTimerActive](../stage/TimerGraphStageLogic.html#isTimerActive(java.lang.Object)), [scheduleAtFixedRate](../stage/TimerGraphStageLogic.html#scheduleAtFixedRate(java.lang.Object,java.time.Duration,java.time.Duration)), [scheduleAtFixedRate](../stage/TimerGraphStageLogic.html#scheduleAtFixedRate(java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration)), [scheduleOnce](../stage/TimerGraphStageLogic.html#scheduleOnce(java.lang.Object,java.time.Duration)), [scheduleOnce](../stage/TimerGraphStageLogic.html#scheduleOnce(java.lang.Object,scala.concurrent.duration.FiniteDuration)), [schedulePeriodically](../stage/TimerGraphStageLogic.html#schedulePeriodically(java.lang.Object,java.time.Duration)), [schedulePeriodically](../stage/TimerGraphStageLogic.html#schedulePeriodically(java.lang.Object,scala.concurrent.duration.FiniteDuration)), [schedulePeriodicallyWithInitialDelay](../stage/TimerGraphStageLogic.html#schedulePeriodicallyWithInitialDelay(java.lang.Object,java.time.Duration,java.time.Duration)), [schedulePeriodicallyWithInitialDelay](../stage/TimerGraphStageLogic.html#schedulePeriodicallyWithInitialDelay(java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration)), [scheduleWithFixedDelay](../stage/TimerGraphStageLogic.html#scheduleWithFixedDelay(java.lang.Object,java.time.Duration,java.time.Duration)), [scheduleWithFixedDelay](../stage/TimerGraphStageLogic.html#scheduleWithFixedDelay(java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")
		
		
		`[abortEmitting](../stage/GraphStageLogic.html#abortEmitting(akka.stream.Outlet)), [abortReading](../stage/GraphStageLogic.html#abortReading(akka.stream.Inlet)), [beforePreStart](../stage/GraphStageLogic.html#beforePreStart()), [cancel](../stage/GraphStageLogic.html#cancel(akka.stream.Inlet)), [cancel](../stage/GraphStageLogic.html#cancel(akka.stream.Inlet,java.lang.Throwable)), [cancelStage](../stage/GraphStageLogic.html#cancelStage(java.lang.Throwable)), [complete](../stage/GraphStageLogic.html#complete(akka.stream.Outlet)), [completeStage](../stage/GraphStageLogic.html#completeStage()), [conditionalTerminateInput](../stage/GraphStageLogic.html#conditionalTerminateInput(scala.Function0)), [conditionalTerminateOutput](../stage/GraphStageLogic.html#conditionalTerminateOutput(scala.Function0)), [createAsyncCallback](../stage/GraphStageLogic.html#createAsyncCallback(akka.japi.function.Procedure)), [eagerTerminateInput](../stage/GraphStageLogic.html#eagerTerminateInput()), [eagerTerminateOutput](../stage/GraphStageLogic.html#eagerTerminateOutput()), [emit](../stage/GraphStageLogic.html#emit(akka.stream.Outlet,T)), [emit](../stage/GraphStageLogic.html#emit(akka.stream.Outlet,T,akka.japi.function.Effect)), [emit](../stage/GraphStageLogic.html#emit(akka.stream.Outlet,T,scala.Function0)), [emitMultiple](../stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,java.util.Iterator)), [emitMultiple](../stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,java.util.Iterator,akka.japi.function.Effect)), [emitMultiple](../stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable)), [emitMultiple](../stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable,scala.Function0)), [emitMultiple](../stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.Iterator)), [emitMultiple](../stage/GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.Iterator,scala.Function0)), [fail](../stage/GraphStageLogic.html#fail(akka.stream.Outlet,java.lang.Throwable)), [failStage](../stage/GraphStageLogic.html#failStage(java.lang.Throwable)), [getAsyncCallback](../stage/GraphStageLogic.html#getAsyncCallback(scala.Function1)), [getEagerStageActor](../stage/GraphStageLogic.html#getEagerStageActor(akka.stream.Materializer,scala.Function1)), [getHandler](../stage/GraphStageLogic.html#getHandler(akka.stream.Inlet)), [getHandler](../stage/GraphStageLogic.html#getHandler(akka.stream.Outlet)), [getStageActor](../stage/GraphStageLogic.html#getStageActor(scala.Function1)), [grab](../stage/GraphStageLogic.html#grab(akka.stream.Inlet)), [hasBeenPulled](../stage/GraphStageLogic.html#hasBeenPulled(akka.stream.Inlet)), [ignoreTerminateInput](../stage/GraphStageLogic.html#ignoreTerminateInput()), [ignoreTerminateOutput](../stage/GraphStageLogic.html#ignoreTerminateOutput()), [inCount](../stage/GraphStageLogic.html#inCount()), [isAvailable](../stage/GraphStageLogic.html#isAvailable(akka.stream.Inlet)), [isAvailable](../stage/GraphStageLogic.html#isAvailable(akka.stream.Outlet)), [isClosed](../stage/GraphStageLogic.html#isClosed(akka.stream.Inlet)), [isClosed](../stage/GraphStageLogic.html#isClosed(akka.stream.Outlet)), [materializer](../stage/GraphStageLogic.html#materializer()), [outCount](../stage/GraphStageLogic.html#outCount()), [passAlong](../stage/GraphStageLogic.html#passAlong(akka.stream.Inlet,akka.stream.Outlet,boolean,boolean,boolean)), [passAlong$default$3](../stage/GraphStageLogic.html#passAlong$default$3()), [passAlong$default$4](../stage/GraphStageLogic.html#passAlong$default$4()), [passAlong$default$5](../stage/GraphStageLogic.html#passAlong$default$5()), [postStop](../stage/GraphStageLogic.html#postStop()), [pull](../stage/GraphStageLogic.html#pull(akka.stream.Inlet)), [push](../stage/GraphStageLogic.html#push(akka.stream.Outlet,T)), [read](../stage/GraphStageLogic.html#read(akka.stream.Inlet,akka.japi.function.Procedure,akka.japi.function.Effect)), [read](../stage/GraphStageLogic.html#read(akka.stream.Inlet,scala.Function1,scala.Function0)), [readN](../stage/GraphStageLogic.html#readN(akka.stream.Inlet,int,akka.japi.function.Procedure,akka.japi.function.Procedure)), [readN](../stage/GraphStageLogic.html#readN(akka.stream.Inlet,int,scala.Function1,scala.Function1)), [setHandler](../stage/GraphStageLogic.html#setHandler(akka.stream.Inlet,akka.stream.stage.InHandler)), [setHandler](../stage/GraphStageLogic.html#setHandler(akka.stream.Outlet,akka.stream.stage.OutHandler)), [setHandlers](../stage/GraphStageLogic.html#setHandlers(akka.stream.Inlet,akka.stream.Outlet,akka.stream.stage.InHandler)), [setKeepGoing](../stage/GraphStageLogic.html#setKeepGoing(boolean)), [stageActor](../stage/GraphStageLogic.html#stageActor()), [stageActorName](../stage/GraphStageLogic.html#stageActorName()), [subFusingMaterializer](../stage/GraphStageLogic.html#subFusingMaterializer()), [toString](../stage/GraphStageLogic.html#toString()), [totallyIgnorantInput](../stage/GraphStageLogic.html#totallyIgnorantInput()), [tryPull](../stage/GraphStageLogic.html#tryPull(akka.stream.Inlet))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.stage.[StageLogging](../stage/StageLogging.html "interface in akka.stream.stage")
		
		
		`[_log_$eq](../stage/StageLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../stage/StageLogging.html#log())`

- - ### Constructor Detail
	
	
	
		- #### RestartWithBackoffLogic
		
		
		
		```
		public RestartWithBackoffLogic​(java.lang.String name,
		                               [S](RestartWithBackoffLogic.html "type parameter in RestartWithBackoffLogic") shape,
		                               [Attributes](../Attributes.html "class in akka.stream") inheritedAttributes,
		                               [RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                               boolean onlyOnFailures)
		```

	- ### Method Detail
	
	
	
		- #### backoff
		
		
		
		```
		protected abstract void backoff()
		```
		- #### createSubInlet
		
		
		
		```
		protected final <T> [GraphStageLogic.SubSinkInlet](../stage/GraphStageLogic.SubSinkInlet.html "class in akka.stream.stage")<T> createSubInlet​([Outlet](../Outlet.html "class in akka.stream")<T> out)
		```
		
		
		Parameters:
		`out` \- The permanent outlet
		Returns:
		A sub sink inlet that's sink is attached to the wrapped operator
		- #### createSubOutlet
		
		
		
		```
		protected final <T> [GraphStageLogic.SubSourceOutlet](../stage/GraphStageLogic.SubSourceOutlet.html "class in akka.stream.stage")<T> createSubOutlet​([Inlet](../Inlet.html "class in akka.stream")<T> in)
		```
		
		
		Parameters:
		`in` \- The permanent inlet for this operator
		Returns:
		Temporary SubSourceOutlet for this "restart"
		- #### finishing
		
		
		
		```
		public boolean finishing()
		```
		- #### finishing\_$eq
		
		
		
		```
		public void finishing_$eq​(boolean x$1)
		```
		- #### logSource
		
		
		
		```
		protected java.lang.Class<?> logSource()
		```
		
		Description copied from interface: `[StageLogging](../stage/StageLogging.html#logSource())`
		Override to customise reported log source
		- #### maxRestartsReached
		
		
		
		```
		protected final boolean maxRestartsReached()
		```
		- #### onTimer
		
		
		
		```
		protected void onTimer​(java.lang.Object timerKey)
		```
		
		Description copied from class: `[TimerGraphStageLogic](../stage/TimerGraphStageLogic.html#onTimer(java.lang.Object))`
		Will be called when the scheduled timer is triggered.
		 
		
		Overrides:
		`[onTimer](../stage/TimerGraphStageLogic.html#onTimer(java.lang.Object))` in class `[TimerGraphStageLogic](../stage/TimerGraphStageLogic.html "class in akka.stream.stage")`
		Parameters:
		`timerKey` \- key of the scheduled timer
		- #### preStart
		
		
		
		```
		public void preStart()
		```
		
		Description copied from class: `[GraphStageLogic](../stage/GraphStageLogic.html#preStart())`
		Invoked before any external events are processed, at the startup of the operator.
		
		Overrides:
		`[preStart](../stage/GraphStageLogic.html#preStart())` in class `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")`
		- #### resetDeadline
		
		
		
		```
		public scala.concurrent.duration.Deadline resetDeadline()
		```
		- #### resetDeadline\_$eq
		
		
		
		```
		public void resetDeadline_$eq​(scala.concurrent.duration.Deadline x$1)
		```
		- #### restartCount
		
		
		
		```
		public int restartCount()
		```
		- #### restartCount\_$eq
		
		
		
		```
		public void restartCount_$eq​(int x$1)
		```
		- #### scheduleRestartTimer
		
		
		
		```
		protected final void scheduleRestartTimer()
		```
		- #### startGraph
		
		
		
		```
		protected abstract void startGraph()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.ConditionalTerminateInput.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.ConditionalTerminateOutput.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.EagerTerminateInput$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.EagerTerminateOutput$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.IgnoreTerminateInput$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.IgnoreTerminateOutput$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.StageActor.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.StageActorRef$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.StageActorRefNotInitializedException$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.StageActorRefNotInitializedException.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.SubSinkInlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.SubSourceOutlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.TotallyIgnorantInput$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/StageLogging.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerGraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerGraphStageLogicWithLogging.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffLogic.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffLogic.html)*