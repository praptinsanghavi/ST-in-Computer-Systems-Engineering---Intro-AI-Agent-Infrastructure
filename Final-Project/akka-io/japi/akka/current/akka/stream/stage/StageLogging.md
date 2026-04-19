---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/stage/StageLogging.html
title: StageLogging
---

# StageLogging

## Content

Package [akka.stream.stage](package-summary.html)
## Interface StageLogging

- All Known Implementing Classes:
`[GraphStageLogicWithLogging](GraphStageLogicWithLogging.html "class in akka.stream.stage")`, `[RestartWithBackoffLogic](../scaladsl/RestartWithBackoffLogic.html "class in akka.stream.scaladsl")`, `[TimerGraphStageLogicWithLogging](TimerGraphStageLogicWithLogging.html "class in akka.stream.stage")`

---

```
public interface StageLogging
```

Simple way to obtain a [`LoggingAdapter`](../../event/LoggingAdapter.html "interface in akka.event") when used together with an [`Materializer`](../Materializer.html "class in akka.stream").
 If used with a different materializer [`NoLogging`](../../event/NoLogging.html "class in akka.event") will be returned.
 
 Make sure to only access `log` from GraphStage callbacks (such as `pull`, `push` or the async\-callback).
 

 Note, abiding to `akka.stream.ActorAttributes.logLevels` has to be done manually,
 the logger itself is configured based on the logSource provided to it. Also, the `log`
 itself would not know if you're calling it from a "on element" context or not, which is why
 these decisions have to be handled by the operator itself.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_log_$eq](#_log_$eq(akka.event.LoggingAdapter))​([LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") x$1)` |  |
	| `[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event")` | `[log](#log())()` |  |
	| `java.lang.Class<?>` | `[logSource](#logSource())()` | Override to customise reported log source |

- - ### Method Detail
	
	
	
		- #### \_log\_$eq
		
		
		
		```
		void _log_$eq​([LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") x$1)
		```
		- #### log
		
		
		
		```
		[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log()
		```
		- #### logSource
		
		
		
		```
		java.lang.Class<?> logSource()
		```
		
		Override to customise reported log source

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/event/NoLogging.html
- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogicWithLogging.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/TimerGraphStageLogicWithLogging.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/stage/StageLogging.html](https://doc.akka.io/japi/akka/current/akka/stream/stage/StageLogging.html)*