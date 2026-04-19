---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:01:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/RestartSource.html
title: RestartSource
---

# RestartSource

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class RestartSource

- java.lang.Object
- - akka.stream.javadsl.RestartSource

- ---

```
public class RestartSource
extends java.lang.Object
```

A RestartSource wraps a [`Source`](Source.html "class in akka.stream.javadsl") that gets restarted when it completes or fails.
 
 They are useful for graphs that need to run for longer than the [`Source`](Source.html "class in akka.stream.javadsl") can necessarily guarantee it will, for
 example, for [`Source`](Source.html "class in akka.stream.javadsl") streams that depend on a remote server that may crash or become partitioned. The
 RestartSource ensures that the graph can continue running while the [`Source`](Source.html "class in akka.stream.javadsl") restarts.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartSource](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(akka.stream.RestartSettings,akka.japi.function.Creator))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)` | Wrap the given [`Source`](Source.html "class in akka.stream.javadsl") with a [`Source`](Source.html "class in akka.stream.javadsl") that will restart it when it fails using an exponential backoff. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(java.time.Duration,java.time.Duration,double,int,akka.japi.function.Creator))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  int maxRestarts,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(java.time.Duration,java.time.Duration,double,akka.japi.function.Creator))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(akka.stream.RestartSettings,akka.japi.function.Creator))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)` | Wrap the given [`Source`](Source.html "class in akka.stream.javadsl") with a [`Source`](Source.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential  backoff. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(java.time.Duration,java.time.Duration,double,int,akka.japi.function.Creator))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  int maxRestarts,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(java.time.Duration,java.time.Duration,double,akka.japi.function.Creator))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RestartSource
		
		
		
		```
		public RestartSource()
		```

	- ### Method Detail
	
	
	
		- #### withBackoff
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(java.time.Duration minBackoff,
		                                                      java.time.Duration maxBackoff,
		                                                      double randomFactor,
		                                                      [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Source`](Source.html "class in akka.stream.javadsl") with a [`Source`](Source.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.javadsl") will never emit a complete or failure, since the completion or failure of the wrapped [`Source`](Source.html "class in akka.stream.javadsl")
		 is always handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.javadsl") can however be cancelled by cancelling this [`Source`](Source.html "class in akka.stream.javadsl").
		 When that happens, the wrapped [`Source`](Source.html "class in akka.stream.javadsl"), if currently running will be cancelled, and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.javadsl") in the graph.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.javadsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(java.time.Duration minBackoff,
		                                                      java.time.Duration maxBackoff,
		                                                      double randomFactor,
		                                                      int maxRestarts,
		                                                      [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Source`](Source.html "class in akka.stream.javadsl") with a [`Source`](Source.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.javadsl") will not emit a complete or failure as long as maxRestarts is not reached, since the completion
		 or failure of the wrapped [`Source`](Source.html "class in akka.stream.javadsl") is handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.javadsl") can however be cancelled
		 by cancelling this [`Source`](Source.html "class in akka.stream.javadsl"). When that happens, the wrapped [`Source`](Source.html "class in akka.stream.javadsl"), if currently running will be cancelled,
		 and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.javadsl") in the graph.
		 
		
		
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
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.javadsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                      [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)
		```
		
		Wrap the given [`Source`](Source.html "class in akka.stream.javadsl") with a [`Source`](Source.html "class in akka.stream.javadsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.javadsl") will not emit a complete or failure as long as maxRestarts is not reached, since the completion
		 or failure of the wrapped [`Source`](Source.html "class in akka.stream.javadsl") is handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.javadsl") can however be cancelled
		 by cancelling this [`Source`](Source.html "class in akka.stream.javadsl"). When that happens, the wrapped [`Source`](Source.html "class in akka.stream.javadsl"), if currently running will be cancelled,
		 and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.javadsl") in the graph.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.javadsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​(java.time.Duration minBackoff,
		                                                                java.time.Duration maxBackoff,
		                                                                double randomFactor,
		                                                                [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Source`](Source.html "class in akka.stream.javadsl") with a [`Source`](Source.html "class in akka.stream.javadsl") that will restart it when it fails using an exponential backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.javadsl") will never emit a failure, since the failure of the wrapped [`Source`](Source.html "class in akka.stream.javadsl") is always handled by
		 restarting. The wrapped [`Source`](Source.html "class in akka.stream.javadsl") can be cancelled by cancelling this [`Source`](Source.html "class in akka.stream.javadsl").
		 When that happens, the wrapped [`Source`](Source.html "class in akka.stream.javadsl"), if currently running will be cancelled, and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.javadsl") in the graph.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.javadsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​(java.time.Duration minBackoff,
		                                                                java.time.Duration maxBackoff,
		                                                                double randomFactor,
		                                                                int maxRestarts,
		                                                                [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Source`](Source.html "class in akka.stream.javadsl") with a [`Source`](Source.html "class in akka.stream.javadsl") that will restart it when it fails using an exponential backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.javadsl") will not emit a failure as long as maxRestarts is not reached, since failure of the wrapped [`Source`](Source.html "class in akka.stream.javadsl")
		 is handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.javadsl") can be cancelled
		 by cancelling this [`Source`](Source.html "class in akka.stream.javadsl"). When that happens, the wrapped [`Source`](Source.html "class in akka.stream.javadsl"), if currently running will be cancelled,
		 and it will not be restarted. This can be triggered simply by the downstream cancelling, or externally by
		 introducing a `KillSwitch` right after this [`Source`](Source.html "class in akka.stream.javadsl") in the graph.
		 
		
		
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
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.javadsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                                [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sourceFactory)
		```
		
		Wrap the given [`Source`](Source.html "class in akka.stream.javadsl") with a [`Source`](Source.html "class in akka.stream.javadsl") that will restart it when it fails using an exponential backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.javadsl") will not emit a failure as long as maxRestarts is not reached, since failure of the wrapped [`Source`](Source.html "class in akka.stream.javadsl")
		 is handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.javadsl") can be cancelled
		 by cancelling this [`Source`](Source.html "class in akka.stream.javadsl"). When that happens, the wrapped [`Source`](Source.html "class in akka.stream.javadsl"), if currently running will be cancelled,
		 and it will not be restarted. This can be triggered simply by the downstream cancelling, or externally by
		 introducing a `KillSwitch` right after this [`Source`](Source.html "class in akka.stream.javadsl") in the graph.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.javadsl") to wrap.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka/2.10/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/RestartSource.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/RestartSource.html)*