---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:10:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.html
title: FlowMonitorState
---

# FlowMonitorState

## Content

Package [akka.stream](package-summary.html)
## Class FlowMonitorState

- java.lang.Object
- - akka.stream.FlowMonitorState

- ---

```
public class FlowMonitorState
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[FlowMonitorState.Failed](FlowMonitorState.Failed.html "class in akka.stream")` | Stream failed |
	| `static class` | `[FlowMonitorState.Failed$](FlowMonitorState.Failed$.html "class in akka.stream")` |  |
	| `static class` | `[FlowMonitorState.Finished$](FlowMonitorState.Finished$.html "class in akka.stream")` | Stream completed successfully |
	| `static class` | `[FlowMonitorState.Initialized$](FlowMonitorState.Initialized$.html "class in akka.stream")` | Stream was created, but no events have passed through it |
	| `static class` | `[FlowMonitorState.Received](FlowMonitorState.Received.html "class in akka.stream")<[U](FlowMonitorState.Received.html "type parameter in FlowMonitorState.Received")>` | Stream processed a message |
	| `static class` | `[FlowMonitorState.Received$](FlowMonitorState.Received$.html "class in akka.stream")` |  |
	| `static interface` | `[FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<[U](FlowMonitorState.StreamState.html "type parameter in FlowMonitorState.StreamState")>` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlowMonitorState](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>` | `[failed](#failed(java.lang.Throwable))​(java.lang.Throwable cause)` | Java API |
	| `static <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>` | `[finished](#finished())()` | Java API |
	| `static <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>` | `[initialized](#initialized())()` | Java API |
	| `static <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>` | `[received](#received(U))​(U msg)` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FlowMonitorState
		
		
		
		```
		public FlowMonitorState()
		```

	- ### Method Detail
	
	
	
		- #### initialized
		
		
		
		```
		public static <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U> initialized()
		```
		
		Java API
		- #### received
		
		
		
		```
		public static <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U> received​(U msg)
		```
		
		Java API
		- #### failed
		
		
		
		```
		public static <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U> failed​(java.lang.Throwable cause)
		```
		
		Java API
		- #### finished
		
		
		
		```
		public static <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U> finished()
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.Failed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.Failed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.Finished$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.Initialized$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.Received$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.Received.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.StreamState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowMonitorState.html)*