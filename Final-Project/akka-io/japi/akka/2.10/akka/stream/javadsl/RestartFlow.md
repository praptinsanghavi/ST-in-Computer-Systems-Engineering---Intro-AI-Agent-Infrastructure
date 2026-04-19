---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:01:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/RestartFlow.html
title: RestartFlow
---

# RestartFlow

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class RestartFlow

- java.lang.Object
- - akka.stream.javadsl.RestartFlow

- ---

```
public class RestartFlow
extends java.lang.Object
```

A RestartFlow wraps a [`Flow`](Flow.html "class in akka.stream.javadsl") that gets restarted when it completes or fails.
 
 They are useful for graphs that need to run for longer than the [`Flow`](Flow.html "class in akka.stream.javadsl") can necessarily guarantee it will, for
 example, for [`Flow`](Flow.html "class in akka.stream.javadsl") streams that depend on a remote server that may crash or become partitioned. The
 RestartFlow ensures that the graph can continue running while the [`Flow`](Flow.html "class in akka.stream.javadsl") restarts.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartFlow](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(akka.stream.RestartSettings,akka.japi.function.Creator))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)` | Wrap the given [`Flow`](Flow.html "class in akka.stream.javadsl") with a [`Flow`](Flow.html "class in akka.stream.javadsl") that will restart only when it fails that restarts  using an exponential backoff. |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(java.time.Duration,java.time.Duration,double,int,akka.japi.function.Creator))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  int maxRestarts,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(akka.stream.RestartSettings,akka.japi.function.Creator))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)` | Wrap the given [`Flow`](Flow.html "class in akka.stream.javadsl") with a [`Flow`](Flow.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential  backoff. |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(java.time.Duration,java.time.Duration,double,int,akka.japi.function.Creator))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  int maxRestarts,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(java.time.Duration,java.time.Duration,double,akka.japi.function.Creator))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RestartFlow
		
		
		
		```
		public RestartFlow()
		```

	- ### Method Detail
	
	
	
		- #### withBackoff
		
		
		
		```
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(java.time.Duration minBackoff,
		                                                                          java.time.Duration maxBackoff,
		                                                                          double randomFactor,
		                                                                          [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.javadsl") with a [`Flow`](Flow.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Flow`](Flow.html "class in akka.stream.javadsl") will not cancel, complete or emit a failure, until the opposite end of it has been cancelled or
		 completed. Any termination by the [`Flow`](Flow.html "class in akka.stream.javadsl") before that time will be handled by restarting it. Any termination
		 signals sent to this [`Flow`](Flow.html "class in akka.stream.javadsl") however will terminate the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl"), if it's running, and then the [`Flow`](Flow.html "class in akka.stream.javadsl")
		 will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.javadsl") will backpressure.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.javadsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(java.time.Duration minBackoff,
		                                                                          java.time.Duration maxBackoff,
		                                                                          double randomFactor,
		                                                                          int maxRestarts,
		                                                                          [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.javadsl") with a [`Flow`](Flow.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Flow`](Flow.html "class in akka.stream.javadsl") will not cancel, complete or emit a failure, until the opposite end of it has been cancelled or
		 completed. Any termination by the [`Flow`](Flow.html "class in akka.stream.javadsl") before that time will be handled by restarting it as long as maxRestarts
		 is not reached. Any termination signals sent to this [`Flow`](Flow.html "class in akka.stream.javadsl") however will terminate the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl"), if it's
		 running, and then the [`Flow`](Flow.html "class in akka.stream.javadsl") will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.javadsl") will backpressure.
		 
		
		
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
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.javadsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                                          [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)
		```
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.javadsl") with a [`Flow`](Flow.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Flow`](Flow.html "class in akka.stream.javadsl") will not cancel, complete or emit a failure, until the opposite end of it has been cancelled or
		 completed. Any termination by the [`Flow`](Flow.html "class in akka.stream.javadsl") before that time will be handled by restarting it as long as maxRestarts
		 is not reached. Any termination signals sent to this [`Flow`](Flow.html "class in akka.stream.javadsl") however will terminate the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl"), if it's
		 running, and then the [`Flow`](Flow.html "class in akka.stream.javadsl") will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.javadsl") will backpressure.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.javadsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​(java.time.Duration minBackoff,
		                                                                                    java.time.Duration maxBackoff,
		                                                                                    double randomFactor,
		                                                                                    int maxRestarts,
		                                                                                    [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.javadsl") with a [`Flow`](Flow.html "class in akka.stream.javadsl") that will restart only when it fails that restarts
		 using an exponential backoff.
		 
		 This new [`Flow`](Flow.html "class in akka.stream.javadsl") will not emit failures. Any failure by the original [`Flow`](Flow.html "class in akka.stream.javadsl") (the wrapped one) before that
		 time will be handled by restarting it as long as maxRestarts is not reached.
		 However, any termination signals, completion or cancellation sent to this [`Flow`](Flow.html "class in akka.stream.javadsl") will terminate
		 the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl"), if it's running, and then the [`Flow`](Flow.html "class in akka.stream.javadsl") will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.javadsl") will backpressure.
		 
		
		
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
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.javadsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                                                    [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​?>> flowFactory)
		```
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.javadsl") with a [`Flow`](Flow.html "class in akka.stream.javadsl") that will restart only when it fails that restarts
		 using an exponential backoff.
		 
		 This new [`Flow`](Flow.html "class in akka.stream.javadsl") will not emit failures. Any failure by the original [`Flow`](Flow.html "class in akka.stream.javadsl") (the wrapped one) before that
		 time will be handled by restarting it as long as maxRestarts is not reached.
		 However, any termination signals, completion or cancellation sent to this [`Flow`](Flow.html "class in akka.stream.javadsl") will terminate
		 the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl"), if it's running, and then the [`Flow`](Flow.html "class in akka.stream.javadsl") will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.javadsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.javadsl") will backpressure.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.javadsl") to wrap.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka/2.10/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/RestartFlow.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/RestartFlow.html)*