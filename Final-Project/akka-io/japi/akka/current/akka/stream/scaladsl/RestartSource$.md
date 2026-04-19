---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartSource$.html
title: RestartSource$
---

# RestartSource$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class RestartSource$

- java.lang.Object
- - akka.stream.scaladsl.RestartSource$

- ---

```
public class RestartSource$
extends java.lang.Object
```

A RestartSource wraps a [`Source`](Source.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails.
 
 They are useful for graphs that need to run for longer than the [`Source`](Source.html "class in akka.stream.scaladsl") can necessarily guarantee it will, for
 example, for [`Source`](Source.html "class in akka.stream.scaladsl") streams that depend on a remote server that may crash or become partitioned. The
 RestartSource ensures that the graph can continue running while the [`Source`](Source.html "class in akka.stream.scaladsl") restarts.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RestartSource$](RestartSource$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartSource$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(akka.stream.RestartSettings,scala.Function0))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)` | Wrap the given [`Source`](Source.html "class in akka.stream.scaladsl") with a [`Source`](Source.html "class in akka.stream.scaladsl") that will restart it when it fails using an exponential backoff. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,int,scala.Function0))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  int maxRestarts,  scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.Function0))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(akka.stream.RestartSettings,scala.Function0))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)` | Wrap the given [`Source`](Source.html "class in akka.stream.scaladsl") with a [`Source`](Source.html "class in akka.stream.scaladsl") that will restart it when it fails or complete using an exponential  backoff. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,int,scala.Function0))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  int maxRestarts,  scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,scala.Function0))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)` | Deprecated. Use the overloaded method which accepts akka.stream.RestartSettings instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RestartSource$](RestartSource$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RestartSource$
		
		
		
		```
		public RestartSource$()
		```

	- ### Method Detail
	
	
	
		- #### withBackoff
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                               scala.concurrent.duration.FiniteDuration maxBackoff,
		                                               double randomFactor,
		                                               scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Source`](Source.html "class in akka.stream.scaladsl") with a [`Source`](Source.html "class in akka.stream.scaladsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.scaladsl") will never emit a complete or failure, since the completion or failure of the wrapped [`Source`](Source.html "class in akka.stream.scaladsl")
		 is always handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.scaladsl") can however be cancelled by cancelling this [`Source`](Source.html "class in akka.stream.scaladsl").
		 When that happens, the wrapped [`Source`](Source.html "class in akka.stream.scaladsl"), if currently running will be cancelled, and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.scaladsl") in the graph.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.scaladsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                               scala.concurrent.duration.FiniteDuration maxBackoff,
		                                               double randomFactor,
		                                               int maxRestarts,
		                                               scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Source`](Source.html "class in akka.stream.scaladsl") with a [`Source`](Source.html "class in akka.stream.scaladsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.scaladsl") will not emit a complete or failure as long as maxRestarts is not reached, since the completion
		 or failure of the wrapped [`Source`](Source.html "class in akka.stream.scaladsl") is handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.scaladsl") can however be cancelled
		 by cancelling this [`Source`](Source.html "class in akka.stream.scaladsl"). When that happens, the wrapped [`Source`](Source.html "class in akka.stream.scaladsl"), if currently running will be cancelled,
		 and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.scaladsl") in the graph.
		 
		
		
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
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.scaladsl") to wrap.
		- #### withBackoff
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                               scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)
		```
		
		Wrap the given [`Source`](Source.html "class in akka.stream.scaladsl") with a [`Source`](Source.html "class in akka.stream.scaladsl") that will restart it when it fails or complete using an exponential
		 backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.scaladsl") will not emit a complete or failure as long as maxRestarts is not reached, since the completion
		 or failure of the wrapped [`Source`](Source.html "class in akka.stream.scaladsl") is handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.scaladsl") can however be cancelled
		 by cancelling this [`Source`](Source.html "class in akka.stream.scaladsl"). When that happens, the wrapped [`Source`](Source.html "class in akka.stream.scaladsl"), if currently running will be cancelled,
		 and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.scaladsl") in the graph.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.scaladsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                                         scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                         double randomFactor,
		                                                         scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Source`](Source.html "class in akka.stream.scaladsl") with a [`Source`](Source.html "class in akka.stream.scaladsl") that will restart it when it fails using an exponential backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.scaladsl") will not emit a failure as long as maxRestarts is not reached, since failure of the wrapped [`Source`](Source.html "class in akka.stream.scaladsl")
		 is handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.scaladsl") can be cancelled
		 by cancelling this [`Source`](Source.html "class in akka.stream.scaladsl").
		 When that happens, the wrapped [`Source`](Source.html "class in akka.stream.scaladsl"), if currently running will be cancelled, and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.scaladsl") in the graph.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum (initial) duration until the child actor will
		 started again, if it is terminated
		`maxBackoff` \- the exponential back\-off is capped to this duration
		`randomFactor` \- after calculation of the exponential back\-off an additional
		 random delay based on this factor is added, e.g. `0.2` adds up to `20%` delay.
		 In order to skip this additional delay pass in `0`.
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.scaladsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                                         scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                         double randomFactor,
		                                                         int maxRestarts,
		                                                         scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)
		```
		
		Deprecated.
		Use the overloaded method which accepts akka.stream.RestartSettings instead. Since 2\.6\.10\.
		
		Wrap the given [`Source`](Source.html "class in akka.stream.scaladsl") with a [`Source`](Source.html "class in akka.stream.scaladsl") that will restart it when it fails using an exponential backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.scaladsl") will not emit a failure as long as maxRestarts is not reached, since failure of the wrapped [`Source`](Source.html "class in akka.stream.scaladsl")
		 is handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.scaladsl") can be cancelled
		 by cancelling this [`Source`](Source.html "class in akka.stream.scaladsl"). When that happens, the wrapped [`Source`](Source.html "class in akka.stream.scaladsl"), if currently running will be cancelled,
		 and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.scaladsl") in the graph.
		 
		
		
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
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.scaladsl") to wrap.
		- #### onFailuresWithBackoff
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                         scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sourceFactory)
		```
		
		Wrap the given [`Source`](Source.html "class in akka.stream.scaladsl") with a [`Source`](Source.html "class in akka.stream.scaladsl") that will restart it when it fails using an exponential backoff.
		 
		 This [`Source`](Source.html "class in akka.stream.scaladsl") will not emit a failure as long as maxRestarts is not reached, since failure of the wrapped [`Source`](Source.html "class in akka.stream.scaladsl")
		 is handled by restarting it. The wrapped [`Source`](Source.html "class in akka.stream.scaladsl") can be cancelled
		 by cancelling this [`Source`](Source.html "class in akka.stream.scaladsl"). When that happens, the wrapped [`Source`](Source.html "class in akka.stream.scaladsl"), if currently running will be cancelled,
		 and it will not be restarted.
		 This can be triggered simply by the downstream cancelling, or externally by introducing a `KillSwitch` right
		 after this [`Source`](Source.html "class in akka.stream.scaladsl") in the graph.
		 
		
		
		 This uses the same exponential backoff algorithm as [`BackoffOpts`](../../pattern/BackoffOpts.html "class in akka.pattern").
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`sourceFactory` \- A factory for producing the [`Source`](Source.html "class in akka.stream.scaladsl") to wrap.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka/current/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartSource$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartSource$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartSource$.html)*