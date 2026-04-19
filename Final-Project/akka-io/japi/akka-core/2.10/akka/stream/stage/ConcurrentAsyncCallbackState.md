---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.html
title: ConcurrentAsyncCallbackState
---

# ConcurrentAsyncCallbackState

## Content

Package [akka.stream.stage](package-summary.html)
## Class ConcurrentAsyncCallbackState

- java.lang.Object
- - akka.stream.stage.ConcurrentAsyncCallbackState

- ---

```
public class ConcurrentAsyncCallbackState
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<[E](ConcurrentAsyncCallbackState.Event.html "type parameter in ConcurrentAsyncCallbackState.Event")>` |  |
	| `static class` | `[ConcurrentAsyncCallbackState.Event$](ConcurrentAsyncCallbackState.Event$.html "class in akka.stream.stage")` |  |
	| `static class` | `[ConcurrentAsyncCallbackState.Initialized$](ConcurrentAsyncCallbackState.Initialized$.html "class in akka.stream.stage")` |  |
	| `static class` | `[ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")<[E](ConcurrentAsyncCallbackState.Pending.html "type parameter in ConcurrentAsyncCallbackState.Pending")>` |  |
	| `static class` | `[ConcurrentAsyncCallbackState.Pending$](ConcurrentAsyncCallbackState.Pending$.html "class in akka.stream.stage")` |  |
	| `static interface` | `[ConcurrentAsyncCallbackState.State](ConcurrentAsyncCallbackState.State.html "interface in akka.stream.stage")<[E](ConcurrentAsyncCallbackState.State.html "type parameter in ConcurrentAsyncCallbackState.State")>` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConcurrentAsyncCallbackState](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")<scala.runtime.Nothing$>` | `[NoPendingEvents](#NoPendingEvents())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConcurrentAsyncCallbackState
		
		
		
		```
		public ConcurrentAsyncCallbackState()
		```

	- ### Method Detail
	
	
	
		- #### NoPendingEvents
		
		
		
		```
		public static [ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")<scala.runtime.Nothing$> NoPendingEvents()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Event$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Event.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Initialized$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Pending$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.Pending.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.State.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/ConcurrentAsyncCallbackState.html)*