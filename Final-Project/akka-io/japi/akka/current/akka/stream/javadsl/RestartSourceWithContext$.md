---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RestartSourceWithContext$.html
title: RestartSourceWithContext$
---

# RestartSourceWithContext$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class RestartSourceWithContext$

- java.lang.Object
- - akka.stream.javadsl.RestartSourceWithContext$

- ---

```
public class RestartSourceWithContext$
extends java.lang.Object
```

A RestartSourceWithContext wraps a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") that gets restarted when it completes or fails.
 
 They are useful for graphs that need to run for longer than the [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") can necessarily guarantee it will,
 e.g. for [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") streams that depend on a remote service to which connectivity may be lost (crash or partition). The RestartSourceWithContext ensures that the graph can continue running while the SourceWithContext restarts.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RestartSourceWithContext$](RestartSourceWithContext$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartSourceWithContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T,​C>[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<T,​C,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onFailuresWithBackoff](#onFailuresWithBackoff(akka.stream.RestartSettings,akka.japi.function.Creator))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<T,​C,​?>> sourceFactory)` | Wrap the given [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") with a SourceWithContext that will restart it when it fails using an exponential backoff. |
	| `<T,​C>[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<T,​C,​[NotUsed](../../NotUsed.html "class in akka")>` | `[withBackoff](#withBackoff(akka.stream.RestartSettings,akka.japi.function.Creator))​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<T,​C,​?>> sourceFactory)` | Wrap the given [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") with a SourceWithContext that will restart it when it fails or completes using an exponential backoff. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RestartSourceWithContext$](RestartSourceWithContext$.html "class in akka.stream.javadsl") MODULE$
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
		public <T,​C> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<T,​C,​[NotUsed](../../NotUsed.html "class in akka")> withBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                                          [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<T,​C,​?>> sourceFactory)
		```
		
		Wrap the given [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") with a SourceWithContext that will restart it when it fails or completes using an exponential backoff.
		 
		 The returned [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") will not emit a complete or failure as long as maxRestarts is not reached, since the completion or failure of the wrapped SourceWithContext is handled by restarting it. The wrapped SourceWithContext can however be canceled by canceling the returned SourceWithContext. When that happens, the wrapped SourceWithContext will be canceled and will not be restarted.
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining the restart configuration
		`sourceFactory` \- A factory for producing the SourceWithContext to wrap
		- #### onFailuresWithBackoff
		
		
		
		```
		public <T,​C> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<T,​C,​[NotUsed](../../NotUsed.html "class in akka")> onFailuresWithBackoff​([RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                                                                                    [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<T,​C,​?>> sourceFactory)
		```
		
		Wrap the given [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") with a SourceWithContext that will restart it when it fails using an exponential backoff.
		 
		 The returned [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") will not emit a failure as long as maxRestarts is not reached, since the failure of the wrapped SourceWithContext is handled by restarting it. The wrapped SourceWithContext can however be canceled by canceling the returned SourceWithContext. When that happens, the wrapped SourceWithContext if currently running will be canceled and will not be restarted.
		 
		
		
		
		Parameters:
		`settings` \- `RestartSettings` defining the restart configuration
		`sourceFactory` \- A factory for producing the SourceWithContext to wrap

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka/current/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RestartSourceWithContext$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SourceWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RestartSourceWithContext$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RestartSourceWithContext$.html)*