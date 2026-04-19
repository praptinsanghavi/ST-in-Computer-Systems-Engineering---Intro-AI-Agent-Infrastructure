---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:47:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/stage/package-summary.html
title: akka.stream.stage
---

# akka.stream.stage

## Content

# Package akka.stream.stage

- Interface Summary 
| Interface | Description |
| [AsyncCallback](AsyncCallback.html "interface in akka.stream.stage")\<T\> | An asynchronous callback holder that is attached to a [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage"). |
| --- | --- |
| [ConcurrentAsyncCallbackState.State](ConcurrentAsyncCallbackState.State.html "interface in akka.stream.stage")\<E\> |  |
| [InHandler](InHandler.html "interface in akka.stream.stage") | Collection of callbacks for an input port of a [`GraphStage`](GraphStage.html "class in akka.stream.stage") |
| [OutHandler](OutHandler.html "interface in akka.stream.stage") | Collection of callbacks for an output port of a [`GraphStage`](GraphStage.html "class in akka.stream.stage") |
| [StageLogging](StageLogging.html "interface in akka.stream.stage") | Simple way to obtain a [`LoggingAdapter`](../../event/LoggingAdapter.html "interface in akka.event") when used together with an [`Materializer`](../Materializer.html "class in akka.stream"). |
- Class Summary 
| Class | Description |
| [AbstractGraphStageWithMaterializedValue](AbstractGraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S extends [Shape](../Shape.html "class in akka.stream"),​M\> | Java API: A GraphStage represents a reusable graph stream processing operator. |
| --- | --- |
| [AbstractInHandler](AbstractInHandler.html "class in akka.stream.stage") | Java API: callbacks for an input port where termination logic is predefined  (completing when upstream completes, failing when upstream fails). |
| [AbstractInOutHandler](AbstractInOutHandler.html "class in akka.stream.stage") | Java API: callback combination for output and input ports where termination logic is predefined  (completing when upstream completes, failing when upstream fails, completing when downstream cancels). |
| [AbstractOutHandler](AbstractOutHandler.html "class in akka.stream.stage") | Java API: callbacks for an output port where termination logic is predefined  (completing when downstream cancels). |
| [ConcurrentAsyncCallbackState](ConcurrentAsyncCallbackState.html "class in akka.stream.stage") | INTERNAL API |
| [ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")\<E\> |  |
| [ConcurrentAsyncCallbackState.Event$](ConcurrentAsyncCallbackState.Event$.html "class in akka.stream.stage") |  |
| [ConcurrentAsyncCallbackState.Initialized$](ConcurrentAsyncCallbackState.Initialized$.html "class in akka.stream.stage") |  |
| [ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")\<E\> |  |
| [ConcurrentAsyncCallbackState.Pending$](ConcurrentAsyncCallbackState.Pending$.html "class in akka.stream.stage") |  |
| [ConcurrentAsyncCallbackState$](ConcurrentAsyncCallbackState$.html "class in akka.stream.stage") | INTERNAL API |
| [GraphStage](GraphStage.html "class in akka.stream.stage")\<S extends [Shape](../Shape.html "class in akka.stream")\> | A GraphStage represents a reusable graph stream processing operator. |
| [GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage") | Represents the processing logic behind a [`GraphStage`](GraphStage.html "class in akka.stream.stage"). |
| [GraphStageLogic.ConditionalTerminateInput](GraphStageLogic.ConditionalTerminateInput.html "class in akka.stream.stage") | Input handler that terminates the state upon receiving completion if the  given condition holds at that time. |
| [GraphStageLogic.ConditionalTerminateOutput](GraphStageLogic.ConditionalTerminateOutput.html "class in akka.stream.stage") | Output handler that terminates the state upon receiving completion if the  given condition holds at that time. |
| [GraphStageLogic.EagerTerminateInput$](GraphStageLogic.EagerTerminateInput$.html "class in akka.stream.stage") | Input handler that terminates the operator upon receiving completion. |
| [GraphStageLogic.EagerTerminateOutput$](GraphStageLogic.EagerTerminateOutput$.html "class in akka.stream.stage") | Output handler that terminates the operator upon cancellation. |
| [GraphStageLogic.IgnoreTerminateInput$](GraphStageLogic.IgnoreTerminateInput$.html "class in akka.stream.stage") | Input handler that does not terminate the operator upon receiving completion. |
| [GraphStageLogic.IgnoreTerminateOutput$](GraphStageLogic.IgnoreTerminateOutput$.html "class in akka.stream.stage") | Output handler that does not terminate the operator upon cancellation. |
| [GraphStageLogic.StageActor](GraphStageLogic.StageActor.html "class in akka.stream.stage") | Minimal actor to work with other actors and watch them in a synchronous ways |
| [GraphStageLogic.StageActorRef$](GraphStageLogic.StageActorRef$.html "class in akka.stream.stage") |  |
| [GraphStageLogic.StageActorRefNotInitializedException$](GraphStageLogic.StageActorRefNotInitializedException$.html "class in akka.stream.stage") |  |
| [GraphStageLogic.TotallyIgnorantInput$](GraphStageLogic.TotallyIgnorantInput$.html "class in akka.stream.stage") | Input handler that does not terminate the operator upon receiving completion  nor failure. |
| [GraphStageLogic$](GraphStageLogic$.html "class in akka.stream.stage") |  |
| [GraphStageLogicWithLogging](GraphStageLogicWithLogging.html "class in akka.stream.stage") | Java API: [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage") with [`StageLogging`](StageLogging.html "interface in akka.stream.stage"). |
| [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S extends [Shape](../Shape.html "class in akka.stream"),​M\> | Scala API: A GraphStage represents a reusable graph stream processing operator. |
| [TimerGraphStageLogic](TimerGraphStageLogic.html "class in akka.stream.stage") | Provides timer related facilities to a [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage"). |
| [TimerGraphStageLogicWithLogging](TimerGraphStageLogicWithLogging.html "class in akka.stream.stage") | Java API: [`TimerGraphStageLogic`](TimerGraphStageLogic.html "class in akka.stream.stage") with [`StageLogging`](StageLogging.html "interface in akka.stream.stage"). |
| [TimerMessages](TimerMessages.html "class in akka.stream.stage") |  |
| [TimerMessages.Scheduled](TimerMessages.Scheduled.html "class in akka.stream.stage") |  |
| [TimerMessages.Scheduled$](TimerMessages.Scheduled$.html "class in akka.stream.stage") |  |
| [TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage") |  |
| [TimerMessages.Timer$](TimerMessages.Timer$.html "class in akka.stream.stage") |  |
| [TimerMessages$](TimerMessages$.html "class in akka.stream.stage") |  |
- Exception Summary 
| Exception | Description |
| [GraphStageLogic.StageActorRefNotInitializedException](GraphStageLogic.StageActorRefNotInitializedException.html "class in akka.stream.stage") |  |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/AbstractInHandler.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/AbstractInOutHandler.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/AbstractOutHandler.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/AsyncCallback.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/ConcurrentAsyncCallbackState$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Event$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Event.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Initialized$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Pending$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Pending.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.State.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic$.html
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
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.TotallyIgnorantInput$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogicWithLogging.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/InHandler.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/OutHandler.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/StageLogging.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/TimerGraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/TimerGraphStageLogicWithLogging.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/TimerMessages$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/TimerMessages.Scheduled$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/TimerMessages.Scheduled.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/TimerMessages.Timer$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/TimerMessages.Timer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/TimerMessages.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/stage/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/stream/stage/package-summary.html)*