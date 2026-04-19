---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:01:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState$.html
title: FlowMonitorState$
---

# FlowMonitorState$

## Content

Package [akka.stream](package-summary.html)
## Class FlowMonitorState$

- java.lang.Object
- - akka.stream.FlowMonitorState$

- ---

```
public class FlowMonitorState$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FlowMonitorState$](FlowMonitorState$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlowMonitorState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>` | `[failed](#failed(java.lang.Throwable))​(java.lang.Throwable cause)` | Java API |
	| `<U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>` | `[finished](#finished())()` | Java API |
	| `<U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>` | `[initialized](#initialized())()` | Java API |
	| `<U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>` | `[received](#received(U))​(U msg)` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FlowMonitorState$](FlowMonitorState$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FlowMonitorState$
		
		
		
		```
		public FlowMonitorState$()
		```

	- ### Method Detail
	
	
	
		- #### initialized
		
		
		
		```
		public <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U> initialized()
		```
		
		Java API
		- #### received
		
		
		
		```
		public <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U> received​(U msg)
		```
		
		Java API
		- #### failed
		
		
		
		```
		public <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U> failed​(java.lang.Throwable cause)
		```
		
		Java API
		- #### finished
		
		
		
		```
		public <U> [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U> finished()
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState.StreamState.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState$.html](https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState$.html)*