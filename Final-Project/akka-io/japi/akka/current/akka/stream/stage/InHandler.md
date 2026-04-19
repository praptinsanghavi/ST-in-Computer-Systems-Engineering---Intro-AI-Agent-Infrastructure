---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/stage/InHandler.html
title: InHandler
---

# InHandler

## Content

Package [akka.stream.stage](package-summary.html)
## Interface InHandler

- All Known Implementing Classes:
`[AbstractInHandler](AbstractInHandler.html "class in akka.stream.stage")`, `[AbstractInOutHandler](AbstractInOutHandler.html "class in akka.stream.stage")`, `[GraphStageLogic.ConditionalTerminateInput](GraphStageLogic.ConditionalTerminateInput.html "class in akka.stream.stage")`, `[GraphStageLogic.EagerTerminateInput$](GraphStageLogic.EagerTerminateInput$.html "class in akka.stream.stage")`, `[GraphStageLogic.IgnoreTerminateInput$](GraphStageLogic.IgnoreTerminateInput$.html "class in akka.stream.stage")`, `[GraphStageLogic.TotallyIgnorantInput$](GraphStageLogic.TotallyIgnorantInput$.html "class in akka.stream.stage")`

---

```
public interface InHandler
```

Collection of callbacks for an input port of a [`GraphStage`](GraphStage.html "class in akka.stream.stage")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[onPush](#onPush())()` | Called when the input port has a new element available. |
	| `void` | `[onUpstreamFailure](#onUpstreamFailure(java.lang.Throwable))​(java.lang.Throwable ex)` | Called when the input port has failed. |
	| `void` | `[onUpstreamFinish](#onUpstreamFinish())()` | Called when the input port is finished. |

- - ### Method Detail
	
	
	
		- #### onPush
		
		
		
		```
		void onPush()
		     throws java.lang.Exception
		```
		
		Called when the input port has a new element available. The actual element can be retrieved via the
		 `GraphStageLogic.grab` method.
		
		Throws:
		`java.lang.Exception`
		- #### onUpstreamFailure
		
		
		
		```
		void onUpstreamFailure​(java.lang.Throwable ex)
		                throws java.lang.Exception
		```
		
		Called when the input port has failed. After this callback no other callbacks will be called for this port.
		
		Throws:
		`java.lang.Exception`
		- #### onUpstreamFinish
		
		
		
		```
		void onUpstreamFinish()
		               throws java.lang.Exception
		```
		
		Called when the input port is finished. After this callback no other callbacks will be called for this port.
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/stage/AbstractInHandler.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/AbstractInOutHandler.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.ConditionalTerminateInput.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.EagerTerminateInput$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.IgnoreTerminateInput$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.TotallyIgnorantInput$.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/stage/InHandler.html](https://doc.akka.io/japi/akka/current/akka/stream/stage/InHandler.html)*