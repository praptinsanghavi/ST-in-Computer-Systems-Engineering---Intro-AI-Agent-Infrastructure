---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RestartSink.html
title: RestartSink
---

# RestartSink

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class RestartSink

- java.lang.Object
- - akka.stream.javadsl.RestartSink

- ---

```
public class RestartSink
extends java.lang.Object
```

A RestartSink wraps a [`Sink`](Sink.html "class in akka.stream.javadsl") that gets restarted when it completes or fails.
 
 They are useful for graphs that need to run for longer than the [`Sink`](Sink.html "class in akka.stream.javadsl") can necessarily guarantee it will, for
 example, for [`Sink`](Sink.html "class in akka.stream.javadsl") streams that depend on a remote server that may crash or become partitioned. The
 RestartSink ensures that the graph can continue running while the [`Sink`](Sink.html "class in akka.stream.javadsl") restarts.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartSink](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(akka.stream.RestartSettings,akka.japi.function.Creator))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​?>> sinkFactory)` | Wrap the given [`Sink`](Sink.html "class in akka.stream.javadsl") with a [`Sink`](Sink.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential  backoff. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(java.time.Duration,java.time.Duration,double,int,akka.japi.function.Creator))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  int maxRestarts,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​?>> sinkFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(java.time.Duration,java.time.Duration,double,akka.japi.function.Creator))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​?>> sinkFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RestartSink
		
		
		
		```
		public RestartSink()
		```

	- ### Method Detail
	
	
	
		- #### withBackoff
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(java.time.Duration minBackoff,
		                                                    java.time.Duration maxBackoff,
		                                                    double randomFactor,
		                                                    [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​?>> sinkFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Sink`](Sink.html "class in akka.stream.javadsl") with a [`Sink`](Sink.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Sink`](Sink.html "class in akka.stream.javadsl") will never cancel, since cancellation by the wrapped [`Sink`](Sink.html "class in akka.stream.javadsl") is always handled by restarting it.
		 The wrapped [`Sink`](Sink.html "class in akka.stream.javadsl") can however be completed by feeding a completion or error into this [`Sink`](Sink.html "class in akka.stream.javadsl"). When that
		 happens, the [`Sink`](Sink.html "class in akka.stream.javadsl"), if currently running, will terminate and will not be restarted. This can be triggered
		 simply by the upstream completing, or externally by introducing a `KillSwitch` right before this [`Sink`](Sink.html "class in akka.stream.javadsl") in the
		 graph.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. When the wrapped [`Sink`](Sink.html "class in akka.stream.javadsl") does cancel, this [`Sink`](Sink.html "class in akka.stream.javadsl") will backpressure, however any elements already
		 sent may have been lost.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		`sinkFactory` \- A factory for producing the [`Sink`](Sink.html "class in akka.stream.javadsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(java.time.Duration minBackoff,
		                                                    java.time.Duration maxBackoff,
		                                                    double randomFactor,
		                                                    int maxRestarts,
		                                                    [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​?>> sinkFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Sink`](Sink.html "class in akka.stream.javadsl") with a [`Sink`](Sink.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Sink`](Sink.html "class in akka.stream.javadsl") will not cancel as long as maxRestarts is not reached, since cancellation by the wrapped [`Sink`](Sink.html "class in akka.stream.javadsl")
		 is handled by restarting it. The wrapped [`Sink`](Sink.html "class in akka.stream.javadsl") can however be completed by feeding a completion or error into
		 this [`Sink`](Sink.html "class in akka.stream.javadsl"). When that happens, the [`Sink`](Sink.html "class in akka.stream.javadsl"), if currently running, will terminate and will not be restarted.
		 This can be triggered simply by the upstream completing, or externally by introducing a `KillSwitch` right
		 before this [`Sink`](Sink.html "class in akka.stream.javadsl") in the graph.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. When the wrapped [`Sink`](Sink.html "class in akka.stream.javadsl") does cancel, this [`Sink`](Sink.html "class in akka.stream.javadsl") will backpressure, however any elements already
		 sent may have been lost.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		`maxRestarts` \- the amount of restarts is capped to this amount within a time frame of minBackoff.
		 Passing `0` will cause no restarts and a negative number will not cap the amount of restarts.
		`sinkFactory` \- A factory for producing the [`Sink`](Sink.html "class in akka.stream.javadsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                    [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​?>> sinkFactory)
		```
		
		Wrap the given [`Sink`](Sink.html "class in akka.stream.javadsl") with a [`Sink`](Sink.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Sink`](Sink.html "class in akka.stream.javadsl") will not cancel as long as maxRestarts is not reached, since cancellation by the wrapped [`Sink`](Sink.html "class in akka.stream.javadsl")
		 is handled by restarting it. The wrapped [`Sink`](Sink.html "class in akka.stream.javadsl") can however be completed by feeding a completion or error into
		 this [`Sink`](Sink.html "class in akka.stream.javadsl"). When that happens, the [`Sink`](Sink.html "class in akka.stream.javadsl"), if currently running, will terminate and will not be restarted.
		 This can be triggered simply by the upstream completing, or externally by introducing a `KillSwitch` right
		 before this [`Sink`](Sink.html "class in akka.stream.javadsl") in the graph.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. When the wrapped [`Sink`](Sink.html "class in akka.stream.javadsl") does cancel, this [`Sink`](Sink.html "class in akka.stream.javadsl") will backpressure, however any elements already
		 sent may have been lost.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`sinkFactory` \- A factory for producing the [`Sink`](Sink.html "class in akka.stream.javadsl") to wrap.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka/current/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RestartSink.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RestartSink.html)*