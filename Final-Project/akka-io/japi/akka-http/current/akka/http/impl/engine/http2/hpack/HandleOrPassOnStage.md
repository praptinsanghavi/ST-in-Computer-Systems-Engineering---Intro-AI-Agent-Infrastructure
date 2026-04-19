---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HandleOrPassOnStage.html
title: HandleOrPassOnStage
---

# HandleOrPassOnStage

## Content

Package [akka.http.impl.engine.http2\.hpack](package-summary.html)
## Class HandleOrPassOnStage\<T extends U,​U\>

- java.lang.Object
- - akka.stream.stage.GraphStageLogic
	- - akka.http.impl.engine.http2\.hpack.HandleOrPassOnStage\<T,​U\>

- ---

```
public abstract class HandleOrPassOnStage<T extends U,​U>
extends akka.stream.stage.GraphStageLogic
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[HandleOrPassOnStage.State](HandleOrPassOnStage.State.html "class in akka.http.impl.engine.http2.hpack")` |  |
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.stage.GraphStageLogic
		
		
		`akka.stream.stage.GraphStageLogic.ConditionalTerminateInput, akka.stream.stage.GraphStageLogic.ConditionalTerminateOutput, akka.stream.stage.GraphStageLogic.EagerTerminateInput$, akka.stream.stage.GraphStageLogic.EagerTerminateOutput$, akka.stream.stage.GraphStageLogic.IgnoreTerminateInput$, akka.stream.stage.GraphStageLogic.IgnoreTerminateOutput$, akka.stream.stage.GraphStageLogic.StageActor, akka.stream.stage.GraphStageLogic.StageActorRef$, akka.stream.stage.GraphStageLogic.StageActorRefNotInitializedException, akka.stream.stage.GraphStageLogic.StageActorRefNotInitializedException$, akka.stream.stage.GraphStageLogic.SubSinkInlet<T extends java.lang.Object>, akka.stream.stage.GraphStageLogic.SubSourceOutlet<T extends java.lang.Object>, akka.stream.stage.GraphStageLogic.TotallyIgnorantInput$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HandleOrPassOnStage](#%3Cinit%3E(akka.stream.FlowShape))​(akka.stream.FlowShape<[T](HandleOrPassOnStage.html "type parameter in HandleOrPassOnStage"),​[U](HandleOrPassOnStage.html "type parameter in HandleOrPassOnStage")> shape)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[become](#become(akka.http.impl.engine.http2.hpack.HandleOrPassOnStage.State))​([HandleOrPassOnStage.State](HandleOrPassOnStage.State.html "class in akka.http.impl.engine.http2.hpack") state)` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStageLogic
		
		
		`abortEmitting, abortReading, afterPostStop, akka$stream$stage$GraphStageLogic$$asyncCallbacksInProgress, akka$stream$stage$GraphStageLogic$$completedOrFailed, akka$stream$stage$GraphStageLogic$$completedOrFailed, akka$stream$stage$GraphStageLogic$$created, akka$stream$stage$GraphStageLogic$$created, akka$stream$stage$GraphStageLogic$$streamDetachedException, attributes, attributes_$eq, beforePreStart, cancel, cancel, cancelStage, complete, completeStage, conditionalTerminateInput, conditionalTerminateOutput, createAsyncCallback, eagerTerminateInput, eagerTerminateOutput, emit, emit, emit, emitMultiple, emitMultiple, emitMultiple, emitMultiple, emitMultiple, emitMultiple, fail, failStage, getAsyncCallback, getEagerStageActor, getHandler, getHandler, getStageActor, grab, handlers, hasBeenPulled, ignoreTerminateInput, ignoreTerminateOutput, inCount, inHandler, interpreter, interpreter_$eq, isAvailable, isAvailable, isClosed, isClosed, lastCancellationCause, lastCancellationCause_$eq, materializer, onFeedbackDispatched, originalStage, originalStage_$eq, outCount, outHandler, passAlong, passAlong$default$3, passAlong$default$4, passAlong$default$5, portToConn, postStop, preStart, pull, push, read, read, readN, readN, setHandler, setHandler, setHandlers, setKeepGoing, stageActor, stageActorName, stageId, stageId_$eq, subFusingMaterializer, toString, totallyIgnorantInput, tryPull`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HandleOrPassOnStage
		
		
		
		```
		public HandleOrPassOnStage​(akka.stream.FlowShape<[T](HandleOrPassOnStage.html "type parameter in HandleOrPassOnStage"),​[U](HandleOrPassOnStage.html "type parameter in HandleOrPassOnStage")> shape)
		```

	- ### Method Detail
	
	
	
		- #### become
		
		
		
		```
		public void become​([HandleOrPassOnStage.State](HandleOrPassOnStage.State.html "class in akka.http.impl.engine.http2.hpack") state)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HandleOrPassOnStage.State.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HandleOrPassOnStage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HandleOrPassOnStage.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HandleOrPassOnStage.html)*