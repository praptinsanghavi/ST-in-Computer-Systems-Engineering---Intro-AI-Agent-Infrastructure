---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/StreamPrioritizer.First$.html
title: StreamPrioritizer.First$
---

# StreamPrioritizer.First$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class StreamPrioritizer.First$

- java.lang.Object
- - akka.http.impl.engine.http2\.StreamPrioritizer.First$

- All Implemented Interfaces:
`[StreamPrioritizer](StreamPrioritizer.html "interface in akka.http.impl.engine.http2")`

Enclosing interface:
[StreamPrioritizer](StreamPrioritizer.html "interface in akka.http.impl.engine.http2")

---

```
public static class StreamPrioritizer.First$
extends java.lang.Object
implements [StreamPrioritizer](StreamPrioritizer.html "interface in akka.http.impl.engine.http2")
```

A prioritizer that ignores priority information and just sends to the first stream

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.impl.engine.http2\.[StreamPrioritizer](StreamPrioritizer.html "interface in akka.http.impl.engine.http2")
		
		
		`[StreamPrioritizer.First$](StreamPrioritizer.First$.html "class in akka.http.impl.engine.http2")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamPrioritizer.First$](StreamPrioritizer.First$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[First$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[chooseSubstream](#chooseSubstream(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.Object> streams)` | Choose a substream from a set of substream ids that have data available |
	| `void` | `[updatePriority](#updatePriority(akka.http.impl.engine.http2.FrameEvent.PriorityFrame))​([FrameEvent.PriorityFrame](FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2") priorityFrame)` | Update priority information for a substream |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamPrioritizer.First$](StreamPrioritizer.First$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### First$
		
		
		
		```
		public First$()
		```

	- ### Method Detail
	
	
	
		- #### updatePriority
		
		
		
		```
		public void updatePriority​([FrameEvent.PriorityFrame](FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2") priorityFrame)
		```
		
		Description copied from interface: `[StreamPrioritizer](StreamPrioritizer.html#updatePriority(akka.http.impl.engine.http2.FrameEvent.PriorityFrame))`
		Update priority information for a substream
		
		Specified by:
		`[updatePriority](StreamPrioritizer.html#updatePriority(akka.http.impl.engine.http2.FrameEvent.PriorityFrame))` in interface `[StreamPrioritizer](StreamPrioritizer.html "interface in akka.http.impl.engine.http2")`
		- #### chooseSubstream
		
		
		
		```
		public int chooseSubstream​(scala.collection.immutable.Set<java.lang.Object> streams)
		```
		
		Description copied from interface: `[StreamPrioritizer](StreamPrioritizer.html#chooseSubstream(scala.collection.immutable.Set))`
		Choose a substream from a set of substream ids that have data available
		
		Specified by:
		`[chooseSubstream](StreamPrioritizer.html#chooseSubstream(scala.collection.immutable.Set))` in interface `[StreamPrioritizer](StreamPrioritizer.html "interface in akka.http.impl.engine.http2")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PriorityFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/StreamPrioritizer.First$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/StreamPrioritizer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/StreamPrioritizer.First$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/StreamPrioritizer.First$.html)*