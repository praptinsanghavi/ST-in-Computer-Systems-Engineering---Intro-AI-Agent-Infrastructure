---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:03:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/SinkRef$.html
title: SinkRef$
---

# SinkRef$

## Content

Package [akka.stream](package-summary.html)
## Class SinkRef$

- java.lang.Object
- - akka.stream.SinkRef$

- ---

```
public class SinkRef$
extends java.lang.Object
```

See full documentation on [`SinkRef`](SinkRef.html "interface in akka.stream").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SinkRef$](SinkRef$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SinkRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Sink](scaladsl/Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../NotUsed.html "class in akka")>` | `[convertRefToSink](#convertRefToSink(akka.stream.SinkRef))​([SinkRef](SinkRef.html "interface in akka.stream")<T> sinkRef)` | Implicitly converts a [`SinkRef`](SinkRef.html "interface in akka.stream") to a `Sink`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SinkRef$](SinkRef$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SinkRef$
		
		
		
		```
		public SinkRef$()
		```

	- ### Method Detail
	
	
	
		- #### convertRefToSink
		
		
		
		```
		public <T> [Sink](scaladsl/Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../NotUsed.html "class in akka")> convertRefToSink​([SinkRef](SinkRef.html "interface in akka.stream")<T> sinkRef)
		```
		
		Implicitly converts a [`SinkRef`](SinkRef.html "interface in akka.stream") to a `Sink`. The same can be achieved by calling \`.sink\` on the reference.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkRef$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Sink.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/SinkRef$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/SinkRef$.html)*