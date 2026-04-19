---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerGraphStageLogic.html
title: TimerGraphStageLogic
---

# TimerGraphStageLogic

## Content

Package [akka.stream.stage](package-summary.html)
## Class TimerGraphStageLogic

- java.lang.Object
- - [akka.stream.stage.GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")
	- - akka.stream.stage.TimerGraphStageLogic

- Direct Known Subclasses:
`[TimerGraphStageLogicWithLogging](TimerGraphStageLogicWithLogging.html "class in akka.stream.stage")`

---

```
public abstract class TimerGraphStageLogic
extends [GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")
```

Provides timer related facilities to a [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage").
 
 To be thread safe the methods of this class must only be called from either the constructor of the graph operator during
 materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.stage.[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")
		
		
		`[GraphStageLogic.ConditionalTerminateInput](GraphStageLogic.ConditionalTerminateInput.html "class in akka.stream.stage"), [GraphStageLogic.ConditionalTerminateOutput](GraphStageLogic.ConditionalTerminateOutput.html "class in akka.stream.stage"), [GraphStageLogic.EagerTerminateInput$](GraphStageLogic.EagerTerminateInput$.html "class in akka.stream.stage"), [GraphStageLogic.EagerTerminateOutput$](GraphStageLogic.EagerTerminateOutput$.html "class in akka.stream.stage"), [GraphStageLogic.IgnoreTerminateInput$](GraphStageLogic.IgnoreTerminateInput$.html "class in akka.stream.stage"), [GraphStageLogic.IgnoreTerminateOutput$](GraphStageLogic.IgnoreTerminateOutput$.html "class in akka.stream.stage"), [GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRef$](GraphStageLogic.StageActorRef$.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRefNotInitializedException](GraphStageLogic.StageActorRefNotInitializedException.html "class in akka.stream.stage"), [GraphStageLogic.StageActorRefNotInitializedException$](GraphStageLogic.StageActorRefNotInitializedException$.html "class in akka.stream.stage"), [GraphStageLogic.SubSinkInlet](GraphStageLogic.SubSinkInlet.html "class in akka.stream.stage")<[T](GraphStageLogic.SubSinkInlet.html "type parameter in GraphStageLogic.SubSinkInlet")>, [GraphStageLogic.SubSourceOutlet](GraphStageLogic.SubSourceOutlet.html "class in akka.stream.stage")<[T](GraphStageLogic.SubSourceOutlet.html "type parameter in GraphStageLogic.SubSourceOutlet")>, [GraphStageLogic.TotallyIgnorantInput$](GraphStageLogic.TotallyIgnorantInput$.html "class in akka.stream.stage")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimerGraphStageLogic](#%3Cinit%3E(akka.stream.Shape))​([Shape](../Shape.html "class in akka.stream") _shape)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[afterPostStop](#afterPostStop())()` | INTERNAL API |
	| `protected void` | `[cancelTimer](#cancelTimer(java.lang.Object))​(java.lang.Object timerKey)` | Cancel timer, ensuring that the [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) is not subsequently called. |
	| `protected boolean` | `[isTimerActive](#isTimerActive(java.lang.Object))​(java.lang.Object timerKey)` | Inquire whether the timer is still active. |
	| `protected void` | `[onTimer](#onTimer(java.lang.Object))​(java.lang.Object timerKey)` | Will be called when the scheduled timer is triggered. |
	| `protected void` | `[scheduleAtFixedRate](#scheduleAtFixedRate(java.lang.Object,java.time.Duration,java.time.Duration))​(java.lang.Object timerKey,  java.time.Duration initialDelay,  java.time.Duration interval)` | Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given `interval` after the specified  initial delay. |
	| `protected void` | `[scheduleAtFixedRate](#scheduleAtFixedRate(java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(java.lang.Object timerKey,  scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval)` | Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given `interval` after the specified  initial delay. |
	| `protected void` | `[scheduleOnce](#scheduleOnce(java.lang.Object,java.time.Duration))​(java.lang.Object timerKey,  java.time.Duration delay)` | Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) after given delay. |
	| `protected void` | `[scheduleOnce](#scheduleOnce(java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.Object timerKey,  scala.concurrent.duration.FiniteDuration delay)` | Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) after given delay. |
	| `protected void` | `[schedulePeriodically](#schedulePeriodically(java.lang.Object,java.time.Duration))​(java.lang.Object timerKey,  java.time.Duration interval)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `protected void` | `[schedulePeriodically](#schedulePeriodically(java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.Object timerKey,  scala.concurrent.duration.FiniteDuration interval)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `protected void` | `[schedulePeriodicallyWithInitialDelay](#schedulePeriodicallyWithInitialDelay(java.lang.Object,java.time.Duration,java.time.Duration))​(java.lang.Object timerKey,  java.time.Duration initialDelay,  java.time.Duration interval)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `protected void` | `[schedulePeriodicallyWithInitialDelay](#schedulePeriodicallyWithInitialDelay(java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(java.lang.Object timerKey,  scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval)` | Deprecated. Use scheduleWithFixedDelay or scheduleAtFixedRate instead. |
	| `protected void` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(java.lang.Object,java.time.Duration,java.time.Duration))​(java.lang.Object timerKey,  java.time.Duration initialDelay,  java.time.Duration interval)` | Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given `delay` after the specified  initial delay. |
	| `protected void` | `[scheduleWithFixedDelay](#scheduleWithFixedDelay(java.lang.Object,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(java.lang.Object timerKey,  scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration delay)` | Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given `delay` after the specified  initial delay. |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")
		
		
		`[abortEmitting](GraphStageLogic.html#abortEmitting(akka.stream.Outlet)), [abortReading](GraphStageLogic.html#abortReading(akka.stream.Inlet)), [beforePreStart](GraphStageLogic.html#beforePreStart()), [cancel](GraphStageLogic.html#cancel(akka.stream.Inlet)), [cancel](GraphStageLogic.html#cancel(akka.stream.Inlet,java.lang.Throwable)), [cancelStage](GraphStageLogic.html#cancelStage(java.lang.Throwable)), [complete](GraphStageLogic.html#complete(akka.stream.Outlet)), [completeStage](GraphStageLogic.html#completeStage()), [conditionalTerminateInput](GraphStageLogic.html#conditionalTerminateInput(scala.Function0)), [conditionalTerminateOutput](GraphStageLogic.html#conditionalTerminateOutput(scala.Function0)), [createAsyncCallback](GraphStageLogic.html#createAsyncCallback(akka.japi.function.Procedure)), [eagerTerminateInput](GraphStageLogic.html#eagerTerminateInput()), [eagerTerminateOutput](GraphStageLogic.html#eagerTerminateOutput()), [emit](GraphStageLogic.html#emit(akka.stream.Outlet,T)), [emit](GraphStageLogic.html#emit(akka.stream.Outlet,T,akka.japi.function.Effect)), [emit](GraphStageLogic.html#emit(akka.stream.Outlet,T,scala.Function0)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,java.util.Iterator)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,java.util.Iterator,akka.japi.function.Effect)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.immutable.Iterable,scala.Function0)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.Iterator)), [emitMultiple](GraphStageLogic.html#emitMultiple(akka.stream.Outlet,scala.collection.Iterator,scala.Function0)), [fail](GraphStageLogic.html#fail(akka.stream.Outlet,java.lang.Throwable)), [failStage](GraphStageLogic.html#failStage(java.lang.Throwable)), [getAsyncCallback](GraphStageLogic.html#getAsyncCallback(scala.Function1)), [getEagerStageActor](GraphStageLogic.html#getEagerStageActor(akka.stream.Materializer,scala.Function1)), [getHandler](GraphStageLogic.html#getHandler(akka.stream.Inlet)), [getHandler](GraphStageLogic.html#getHandler(akka.stream.Outlet)), [getStageActor](GraphStageLogic.html#getStageActor(scala.Function1)), [grab](GraphStageLogic.html#grab(akka.stream.Inlet)), [hasBeenPulled](GraphStageLogic.html#hasBeenPulled(akka.stream.Inlet)), [ignoreTerminateInput](GraphStageLogic.html#ignoreTerminateInput()), [ignoreTerminateOutput](GraphStageLogic.html#ignoreTerminateOutput()), [inCount](GraphStageLogic.html#inCount()), [isAvailable](GraphStageLogic.html#isAvailable(akka.stream.Inlet)), [isAvailable](GraphStageLogic.html#isAvailable(akka.stream.Outlet)), [isClosed](GraphStageLogic.html#isClosed(akka.stream.Inlet)), [isClosed](GraphStageLogic.html#isClosed(akka.stream.Outlet)), [materializer](GraphStageLogic.html#materializer()), [outCount](GraphStageLogic.html#outCount()), [passAlong](GraphStageLogic.html#passAlong(akka.stream.Inlet,akka.stream.Outlet,boolean,boolean,boolean)), [passAlong$default$3](GraphStageLogic.html#passAlong$default$3()), [passAlong$default$4](GraphStageLogic.html#passAlong$default$4()), [passAlong$default$5](GraphStageLogic.html#passAlong$default$5()), [postStop](GraphStageLogic.html#postStop()), [preStart](GraphStageLogic.html#preStart()), [pull](GraphStageLogic.html#pull(akka.stream.Inlet)), [push](GraphStageLogic.html#push(akka.stream.Outlet,T)), [read](GraphStageLogic.html#read(akka.stream.Inlet,akka.japi.function.Procedure,akka.japi.function.Effect)), [read](GraphStageLogic.html#read(akka.stream.Inlet,scala.Function1,scala.Function0)), [readN](GraphStageLogic.html#readN(akka.stream.Inlet,int,akka.japi.function.Procedure,akka.japi.function.Procedure)), [readN](GraphStageLogic.html#readN(akka.stream.Inlet,int,scala.Function1,scala.Function1)), [setHandler](GraphStageLogic.html#setHandler(akka.stream.Inlet,akka.stream.stage.InHandler)), [setHandler](GraphStageLogic.html#setHandler(akka.stream.Outlet,akka.stream.stage.OutHandler)), [setHandlers](GraphStageLogic.html#setHandlers(akka.stream.Inlet,akka.stream.Outlet,akka.stream.stage.InHandler)), [setKeepGoing](GraphStageLogic.html#setKeepGoing(boolean)), [stageActor](GraphStageLogic.html#stageActor()), [stageActorName](GraphStageLogic.html#stageActorName()), [subFusingMaterializer](GraphStageLogic.html#subFusingMaterializer()), [toString](GraphStageLogic.html#toString()), [totallyIgnorantInput](GraphStageLogic.html#totallyIgnorantInput()), [tryPull](GraphStageLogic.html#tryPull(akka.stream.Inlet))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TimerGraphStageLogic
		
		
		
		```
		public TimerGraphStageLogic​([Shape](../Shape.html "class in akka.stream") _shape)
		```

	- ### Method Detail
	
	
	
		- #### afterPostStop
		
		
		
		```
		protected void afterPostStop()
		```
		
		Description copied from class: `[GraphStageLogic](GraphStageLogic.html#afterPostStop())`
		INTERNAL API
		
		Overrides:
		`[afterPostStop](GraphStageLogic.html#afterPostStop())` in class `[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")`
		- #### cancelTimer
		
		
		
		```
		protected final void cancelTimer​(java.lang.Object timerKey)
		```
		
		Cancel timer, ensuring that the [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) is not subsequently called.
		 
		
		Parameters:
		`timerKey` \- key of the timer to cancel
		- #### isTimerActive
		
		
		
		```
		protected final boolean isTimerActive​(java.lang.Object timerKey)
		```
		
		Inquire whether the timer is still active. Returns true unless the
		 timer does not exist, has previously been canceled or if it was a
		 single\-shot timer that was already triggered.
		- #### onTimer
		
		
		
		```
		protected void onTimer​(java.lang.Object timerKey)
		                throws java.lang.Exception
		```
		
		Will be called when the scheduled timer is triggered.
		 
		
		Parameters:
		`timerKey` \- key of the scheduled timer
		Throws:
		`java.lang.Exception`
		- #### scheduleAtFixedRate
		
		
		
		```
		protected final void scheduleAtFixedRate​(java.lang.Object timerKey,
		                                         scala.concurrent.duration.FiniteDuration initialDelay,
		                                         scala.concurrent.duration.FiniteDuration interval)
		```
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given `interval` after the specified
		 initial delay.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.
		- #### scheduleAtFixedRate
		
		
		
		```
		protected final void scheduleAtFixedRate​(java.lang.Object timerKey,
		                                         java.time.Duration initialDelay,
		                                         java.time.Duration interval)
		```
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given `interval` after the specified
		 initial delay.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.
		- #### scheduleOnce
		
		
		
		```
		protected final void scheduleOnce​(java.lang.Object timerKey,
		                                  scala.concurrent.duration.FiniteDuration delay)
		```
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) after given delay.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.
		- #### scheduleOnce
		
		
		
		```
		protected final void scheduleOnce​(java.lang.Object timerKey,
		                                  java.time.Duration delay)
		```
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) after given delay.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.
		- #### schedulePeriodically
		
		
		
		```
		protected final void schedulePeriodically​(java.lang.Object timerKey,
		                                          scala.concurrent.duration.FiniteDuration interval)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given interval.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.
		- #### schedulePeriodically
		
		
		
		```
		protected final void schedulePeriodically​(java.lang.Object timerKey,
		                                          java.time.Duration interval)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given interval.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.
		- #### schedulePeriodicallyWithInitialDelay
		
		
		
		```
		protected final void schedulePeriodicallyWithInitialDelay​(java.lang.Object timerKey,
		                                                          scala.concurrent.duration.FiniteDuration initialDelay,
		                                                          scala.concurrent.duration.FiniteDuration interval)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given interval after the specified
		 initial delay.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.
		- #### schedulePeriodicallyWithInitialDelay
		
		
		
		```
		protected final void schedulePeriodicallyWithInitialDelay​(java.lang.Object timerKey,
		                                                          java.time.Duration initialDelay,
		                                                          java.time.Duration interval)
		```
		
		Deprecated.
		Use scheduleWithFixedDelay or scheduleAtFixedRate instead. This has the same semantics as scheduleAtFixedRate, but scheduleWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given interval after the specified
		 initial delay.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.
		- #### scheduleWithFixedDelay
		
		
		
		```
		protected final void scheduleWithFixedDelay​(java.lang.Object timerKey,
		                                            scala.concurrent.duration.FiniteDuration initialDelay,
		                                            scala.concurrent.duration.FiniteDuration delay)
		```
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given `delay` after the specified
		 initial delay.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.
		- #### scheduleWithFixedDelay
		
		
		
		```
		protected final void scheduleWithFixedDelay​(java.lang.Object timerKey,
		                                            java.time.Duration initialDelay,
		                                            java.time.Duration interval)
		```
		
		Schedule timer to call [`onTimer(java.lang.Object)`](#onTimer(java.lang.Object)) periodically with the given `delay` after the specified
		 initial delay.
		 Any existing timer with the same key will automatically be canceled before
		 adding the new timer.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
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
- https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerGraphStageLogicWithLogging.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerGraphStageLogic.html](https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerGraphStageLogic.html)*