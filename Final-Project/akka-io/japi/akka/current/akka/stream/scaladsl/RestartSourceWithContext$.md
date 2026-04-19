---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartSourceWithContext$.html
title: RestartSourceWithContext$
---

# RestartSourceWithContext$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class RestartSourceWithContext$

- java.lang.Object
- - akka.stream.scaladsl.RestartSourceWithContext$

- ---

```
public class RestartSourceWithContext$
extends java.lang.Object
```

A RestartSourceWithContext wraps a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails.
 
 They are useful for graphs that need to run for longer than the [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") can necessarily guarantee it will,
 e.g. for [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") streams that depend on a remote service to which connectivity may be lost (crash or partition). The RestartSourceWithContext ensures that the graph can continue running while the [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") restarts.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RestartSourceWithContext$](RestartSourceWithContext$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartSourceWithContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T,​C>[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<T,​C,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(akka.stream.RestartSettings,scala.Function0))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  scala.Function0<[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<T,​C,​?>> sourceFactory)` | Wrap the given [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") with a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") that will restart it when it fails using an exponential backoff. |
	| `<T,​C>[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<T,​C,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(akka.stream.RestartSettings,scala.Function0))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  scala.Function0<[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<T,​C,​?>> sourceFactory)` | Wrap the given [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") with a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") that will restart it when it fails or completes using an exponential backoff. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RestartSourceWithContext$](RestartSourceWithContext$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RestartSourceWithContext$
		
		
		
		```
		public RestartSourceWithContext$()
		```

	- ### Method Detail
	
	
	
		- #### withBackoff
		
		
		
		```
		public <T,​C> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<T,​C,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                                          scala.Function0<[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<T,​C,​?>> sourceFactory)
		```
		
		Wrap the given [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") with a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") that will restart it when it fails or completes using an exponential backoff.
		 
		 The returned [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") will not emit a complete or failure as long as maxRestarts is not reached, since the completion or failure of the wrapped [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") is handled by restarting it. The wrapped [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") can however be canceled by canceling the returned [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl"). When that happens, the wrapped [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") if currently running will be canceled and will not be restarted.
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`sourceFactory` \- A factory for producing the [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") to wrap
		- #### onFailuresWithBackoff
		
		
		
		```
		public <T,​C> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<T,​C,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                                                    scala.Function0<[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<T,​C,​?>> sourceFactory)
		```
		
		Wrap the given [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") with a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") that will restart it when it fails using an exponential backoff.
		 
		 The returned [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") will not emit a failure as long as maxRestarts is not reached, since the failure of the wrapped [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") is handled by restarting it. The wrapped [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") can however be canceled by canceling the returned [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl"). When that happens, the wrapped [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") if currently running will be canceled and will not be restarted.
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining restart configuration
		`sourceFactory` \- A factory for producing the [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") to wrap

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartSourceWithContext$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartSourceWithContext$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartSourceWithContext$.html)*