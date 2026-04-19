---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:25:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes$.html
title: ActorAttributes$
---

# ActorAttributes$

## Content

Package [akka.stream](package-summary.html)
## Class ActorAttributes$

- java.lang.Object
- - akka.stream.ActorAttributes$

- ---

```
public class ActorAttributes$
extends java.lang.Object
```

Attributes for the [`Materializer`](Materializer.html "class in akka.stream").
 Note that more attributes defined in [`Attributes`](Attributes.html "class in akka.stream").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorAttributes$](ActorAttributes$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorAttributes$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[createLogLevels](#createLogLevels(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement)` | Java API |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[createLogLevels](#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFinish,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFailure)` | Java API |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[debugLogging](#debugLogging(boolean))​(boolean enabled)` | Enables additional low level troubleshooting logging at DEBUG log level |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[dispatcher](#dispatcher(java.lang.String))​(java.lang.String dispatcher)` | Specifies the name of the dispatcher. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[fuzzingMode](#fuzzingMode(boolean))​(boolean enabled)` | Test utility: fuzzing mode means that GraphStage events are not processed  in FIFO order within a fused subgraph, but randomized. |
	| `[ActorAttributes.Dispatcher](ActorAttributes.Dispatcher.html "class in akka.stream")` | `[IODispatcher](#IODispatcher())()` |  |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[logLevels](#logLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFinish,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFailure)` | Configures `log()` operator log\-levels to be used when logging. |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevels$default$1](#logLevels$default$1())()` |  |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevels$default$2](#logLevels$default$2())()` |  |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevels$default$3](#logLevels$default$3())()` |  |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[maxFixedBufferSize](#maxFixedBufferSize(int))​(int size)` | Configure the maximum buffer size for which a FixedSizeBuffer will be preallocated. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[outputBurstLimit](#outputBurstLimit(int))​(int limit)` | Maximum number of elements emitted in batch if downstream signals large demand. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[streamSubscriptionTimeout](#streamSubscriptionTimeout(java.time.Duration,akka.stream.StreamSubscriptionTimeoutTerminationMode))​(java.time.Duration timeout,  [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode)` | Java API: Defines a timeout for stream subscription and what action to take when that hits. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[streamSubscriptionTimeout](#streamSubscriptionTimeout(scala.concurrent.duration.FiniteDuration,akka.stream.StreamSubscriptionTimeoutTerminationMode))​(scala.concurrent.duration.FiniteDuration timeout,  [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode)` | Scala API: Defines a timeout for stream subscription and what action to take when that hits. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[supervisionStrategy](#supervisionStrategy(scala.Function1))​(scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> decider)` | Scala API: Decides how exceptions from user are to be handled. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[syncProcessingLimit](#syncProcessingLimit(int))​(int limit)` | Limit for number of messages that can be processed synchronously in stream to substream communication |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[withSupervisionStrategy](#withSupervisionStrategy(akka.japi.function.Function))​([Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> decider)` | Java API: Decides how exceptions from application code are to be handled. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorAttributes$](ActorAttributes$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorAttributes$
		
		
		
		```
		public ActorAttributes$()
		```

	- ### Method Detail
	
	
	
		- #### IODispatcher
		
		
		
		```
		public [ActorAttributes.Dispatcher](ActorAttributes.Dispatcher.html "class in akka.stream") IODispatcher()
		```
		- #### dispatcher
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") dispatcher​(java.lang.String dispatcher)
		```
		
		Specifies the name of the dispatcher. This also adds an async boundary.
		- #### supervisionStrategy
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") supervisionStrategy​(scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> decider)
		```
		
		Scala API: Decides how exceptions from user are to be handled.
		 
		 Operators supporting supervision strategies explicitly document that they do so. If a operator does not document
		 support for these, it should be assumed it does not support supervision.
		 
		
		
		 For the Java API see [`withSupervisionStrategy(akka.japi.function.Function<java.lang.Throwable, akka.stream.Supervision.Directive>)`](#withSupervisionStrategy(akka.japi.function.Function))
		- #### withSupervisionStrategy
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") withSupervisionStrategy​([Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> decider)
		```
		
		Java API: Decides how exceptions from application code are to be handled.
		 
		 Operators supporting supervision strategies explicitly document that they do so. If a operator does not document
		 support for these, it should be assumed it does not support supervision.
		 
		
		
		 For the Scala API see [`supervisionStrategy(scala.Function1<java.lang.Throwable, akka.stream.Supervision.Directive>)`](#supervisionStrategy(scala.Function1))
		- #### createLogLevels
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") createLogLevels​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement,
		                                  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFinish,
		                                  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFailure)
		```
		
		Java API
		 
		 Configures `log()` operator log\-levels to be used when logging.
		 Logging a certain operation can be completely disabled by using [`Attributes.logLevelOff()`](Attributes.html#logLevelOff()).
		- #### createLogLevels
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") createLogLevels​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement)
		```
		
		Java API
		 
		 Configures `log()` operator log\-levels to be used when logging onElement.
		 Logging a certain operation can be completely disabled by using [`Attributes.logLevelOff()`](Attributes.html#logLevelOff()).
		- #### logLevels
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") logLevels​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement,
		                            [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFinish,
		                            [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFailure)
		```
		
		Configures `log()` operator log\-levels to be used when logging.
		 Logging a certain operation can be completely disabled by using `LogLevels.Off`.
		 
		 See `Attributes.createLogLevels` for Java API
		- #### logLevels$default$1
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevels$default$1()
		```
		- #### logLevels$default$2
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevels$default$2()
		```
		- #### logLevels$default$3
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevels$default$3()
		```
		- #### debugLogging
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") debugLogging​(boolean enabled)
		```
		
		Enables additional low level troubleshooting logging at DEBUG log level
		- #### streamSubscriptionTimeout
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") streamSubscriptionTimeout​(scala.concurrent.duration.FiniteDuration timeout,
		                                            [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode)
		```
		
		Scala API: Defines a timeout for stream subscription and what action to take when that hits.
		- #### streamSubscriptionTimeout
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") streamSubscriptionTimeout​(java.time.Duration timeout,
		                                            [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode)
		```
		
		Java API: Defines a timeout for stream subscription and what action to take when that hits.
		- #### outputBurstLimit
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") outputBurstLimit​(int limit)
		```
		
		Maximum number of elements emitted in batch if downstream signals large demand.
		- #### fuzzingMode
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") fuzzingMode​(boolean enabled)
		```
		
		Test utility: fuzzing mode means that GraphStage events are not processed
		 in FIFO order within a fused subgraph, but randomized.
		- #### maxFixedBufferSize
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") maxFixedBufferSize​(int size)
		```
		
		Configure the maximum buffer size for which a FixedSizeBuffer will be preallocated.
		 This defaults to a large value because it is usually better to fail early when
		 system memory is not sufficient to hold the buffer.
		- #### syncProcessingLimit
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") syncProcessingLimit​(int limit)
		```
		
		Limit for number of messages that can be processed synchronously in stream to substream communication

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes.Dispatcher.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamSubscriptionTimeoutTerminationMode.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision.Directive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes$.html)*