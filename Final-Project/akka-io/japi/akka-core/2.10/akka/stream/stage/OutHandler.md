---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:49:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/OutHandler.html
title: OutHandler
---

# OutHandler

## Content

Package [akka.stream.stage](package-summary.html)
## Interface OutHandler

- All Known Implementing Classes:
`[AbstractInOutHandler](AbstractInOutHandler.html "class in akka.stream.stage")`, `[AbstractOutHandler](AbstractOutHandler.html "class in akka.stream.stage")`, `[GraphStageLogic.ConditionalTerminateOutput](GraphStageLogic.ConditionalTerminateOutput.html "class in akka.stream.stage")`, `[GraphStageLogic.EagerTerminateOutput$](GraphStageLogic.EagerTerminateOutput$.html "class in akka.stream.stage")`, `[GraphStageLogic.IgnoreTerminateOutput$](GraphStageLogic.IgnoreTerminateOutput$.html "class in akka.stream.stage")`

---

```
public interface OutHandler
```

Collection of callbacks for an output port of a [`GraphStage`](GraphStage.html "class in akka.stream.stage")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `void` | `[onDownstreamFinish](#onDownstreamFinish())()` | Deprecated. Call onDownstreamFinish with a cancellation cause. |
	| `void` | `[onDownstreamFinish](#onDownstreamFinish(java.lang.Throwable))​(java.lang.Throwable cause)` | Called when the output port will no longer accept any new elements. |
	| `void` | `[onPull](#onPull())()` | Called when the output port has received a pull, and therefore ready to emit an element, i.e. |

- - ### Method Detail
	
	
	
		- #### onDownstreamFinish
		
		
		
		```
		void onDownstreamFinish()
		                 throws java.lang.Exception
		```
		
		Deprecated.
		Call onDownstreamFinish with a cancellation cause. Since 2\.6\.0\.
		
		Called when the output port will no longer accept any new elements. After this callback no other callbacks will
		 be called for this port.
		
		Throws:
		`java.lang.Exception`
		- #### onDownstreamFinish
		
		
		
		```
		void onDownstreamFinish​(java.lang.Throwable cause)
		                 throws java.lang.Exception
		```
		
		Called when the output port will no longer accept any new elements. After this callback no other callbacks will
		 be called for this port.
		
		Throws:
		`java.lang.Exception`
		- #### onPull
		
		
		
		```
		void onPull()
		     throws java.lang.Exception
		```
		
		Called when the output port has received a pull, and therefore ready to emit an element, i.e. `GraphStageLogic.push`
		 is now allowed to be called on this port.
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/AbstractInOutHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/AbstractOutHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.ConditionalTerminateOutput.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.EagerTerminateOutput$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.IgnoreTerminateOutput$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/OutHandler.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/OutHandler.html)*