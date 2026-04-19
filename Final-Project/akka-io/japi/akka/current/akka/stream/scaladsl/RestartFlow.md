---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartFlow.html
title: RestartFlow
---

# RestartFlow

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class RestartFlow

- java.lang.Object
- - akka.stream.scaladsl.RestartFlow

- ---

```
public class RestartFlow
extends java.lang.Object
```

A RestartFlow wraps a [`Flow`](Flow.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails.
 
 They are useful for graphs that need to run for longer than the [`Flow`](Flow.html "class in akka.stream.scaladsl") can necessarily guarantee it will, for
 example, for [`Flow`](Flow.html "class in akka.stream.scaladsl") streams that depend on a remote server that may crash or become partitioned. The
 RestartFlow ensures that the graph can continue running while the [`Flow`](Flow.html "class in akka.stream.scaladsl") restarts.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartFlow](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(akka.stream.RestartSettings,scala.Function0))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)` | Wrap the given [`Flow`](Flow.html "class in akka.stream.scaladsl") with a [`Flow`](Flow.html "class in akka.stream.scaladsl") that will restart it when it fails using an exponential  backoff. |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,int,scala.Function0))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  int maxRestarts,  scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(akka.stream.RestartSettings,scala.Function0))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)` | Wrap the given [`Flow`](Flow.html "class in akka.stream.scaladsl") with a [`Flow`](Flow.html "class in akka.stream.scaladsl") that will restart it when it fails or complete using an exponential  backoff. |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,int,scala.Function0))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  int maxRestarts,  scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `static <In,​Out>[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.Function0))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	
	
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
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                                                          scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                                          double randomFactor,
		                                                                          scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.scaladsl") with a [`Flow`](Flow.html "class in akka.stream.scaladsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Flow`](Flow.html "class in akka.stream.scaladsl") will not cancel, complete or emit a failure, until the opposite end of it has been cancelled or
		 completed. Any termination by the [`Flow`](Flow.html "class in akka.stream.scaladsl") before that time will be handled by restarting it. Any termination
		 signals sent to this [`Flow`](Flow.html "class in akka.stream.scaladsl") however will terminate the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl"), if it's running, and then the [`Flow`](Flow.html "class in akka.stream.scaladsl")
		 will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.scaladsl") will backpressure.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.scaladsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                                                          scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                                          double randomFactor,
		                                                                          int maxRestarts,
		                                                                          scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.scaladsl") with a [`Flow`](Flow.html "class in akka.stream.scaladsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Flow`](Flow.html "class in akka.stream.scaladsl") will not cancel, complete or emit a failure, until the opposite end of it has been cancelled or
		 completed. Any termination by the [`Flow`](Flow.html "class in akka.stream.scaladsl") before that time will be handled by restarting it as long as maxRestarts
		 is not reached. Any termination signals sent to this [`Flow`](Flow.html "class in akka.stream.scaladsl") however will terminate the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl"), if it's
		 running, and then the [`Flow`](Flow.html "class in akka.stream.scaladsl") will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.scaladsl") will backpressure.
		 
		
		
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
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.scaladsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                                          scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)
		```
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.scaladsl") with a [`Flow`](Flow.html "class in akka.stream.scaladsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Flow`](Flow.html "class in akka.stream.scaladsl") will not cancel, complete or emit a failure, until the opposite end of it has been cancelled or
		 completed. Any termination by the [`Flow`](Flow.html "class in akka.stream.scaladsl") before that time will be handled by restarting it as long as maxRestarts
		 is not reached. Any termination signals sent to this [`Flow`](Flow.html "class in akka.stream.scaladsl") however will terminate the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl"), if it's
		 running, and then the [`Flow`](Flow.html "class in akka.stream.scaladsl") will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.scaladsl") will backpressure.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.scaladsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                                                                    scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                                                    double randomFactor,
		                                                                                    int maxRestarts,
		                                                                                    scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.scaladsl") with a [`Flow`](Flow.html "class in akka.stream.scaladsl") that will restart it when it fails using an exponential
		 backoff. Notice that this [`Flow`](Flow.html "class in akka.stream.scaladsl") will not restart on completion of the wrapped flow.
		 
		 This [`Flow`](Flow.html "class in akka.stream.scaladsl") will not emit any failure
		 The failures by the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl") will be handled by
		 restarting the wrapping [`Flow`](Flow.html "class in akka.stream.scaladsl") as long as maxRestarts is not reached.
		 Any termination signals sent to this [`Flow`](Flow.html "class in akka.stream.scaladsl") however will terminate the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl"), if it's
		 running, and then the [`Flow`](Flow.html "class in akka.stream.scaladsl") will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.scaladsl") will backpressure.
		 
		
		
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
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.scaladsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public static <In,​Out> [Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                                                    scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​?>> flowFactory)
		```
		
		Wrap the given [`Flow`](Flow.html "class in akka.stream.scaladsl") with a [`Flow`](Flow.html "class in akka.stream.scaladsl") that will restart it when it fails using an exponential
		 backoff. Notice that this [`Flow`](Flow.html "class in akka.stream.scaladsl") will not restart on completion of the wrapped flow.
		 
		 This [`Flow`](Flow.html "class in akka.stream.scaladsl") will not emit any failure
		 The failures by the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl") will be handled by
		 restarting the wrapping [`Flow`](Flow.html "class in akka.stream.scaladsl") as long as maxRestarts is not reached.
		 Any termination signals sent to this [`Flow`](Flow.html "class in akka.stream.scaladsl") however will terminate the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl"), if it's
		 running, and then the [`Flow`](Flow.html "class in akka.stream.scaladsl") will be allowed to terminate without being restarted.
		 
		
		
		 The restart process is inherently lossy, since there is no coordination between cancelling and the sending of
		 messages. A termination signal from either end of the wrapped [`Flow`](Flow.html "class in akka.stream.scaladsl") will cause the other end to be terminated,
		 and any in transit messages will be lost. During backoff, this [`Flow`](Flow.html "class in akka.stream.scaladsl") will backpressure.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`flowFactory` \- A factory for producing the [`Flow`](Flow.html "class in akka.stream.scaladsl") to wrap.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka/current/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartFlow.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartFlow.html)*