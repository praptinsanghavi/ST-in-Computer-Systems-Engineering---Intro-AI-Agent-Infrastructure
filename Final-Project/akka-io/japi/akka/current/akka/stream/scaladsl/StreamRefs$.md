---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/StreamRefs$.html
title: StreamRefs$
---

# StreamRefs$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class StreamRefs$

- java.lang.Object
- - akka.stream.scaladsl.StreamRefs$

- ---

```
public class StreamRefs$
extends java.lang.Object
```

Factories for creating stream refs.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamRefs$](StreamRefs$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamRefs$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SinkRef](../SinkRef.html "interface in akka.stream")<T>>` | `[sinkRef](#sinkRef())()` | A local [`Source`](Source.html "class in akka.stream.scaladsl") which materializes a `SinkRef` which can be used by other streams (including remote ones),  to publish data to this local stream, as if they were attached directly in place of the local Source. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[SourceRef](../SourceRef.html "interface in akka.stream")<T>>` | `[sourceRef](#sourceRef())()` | A local [`Sink`](Sink.html "class in akka.stream.scaladsl") which materializes a `SourceRef` which can be used by other streams (including remote ones),  to consume data from this local stream, as if they were attached directly in place of the local Sink. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamRefs$](StreamRefs$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StreamRefs$
		
		
		
		```
		public StreamRefs$()
		```

	- ### Method Detail
	
	
	
		- #### sourceRef
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[SourceRef](../SourceRef.html "interface in akka.stream")<T>> sourceRef()
		```
		
		A local [`Sink`](Sink.html "class in akka.stream.scaladsl") which materializes a `SourceRef` which can be used by other streams (including remote ones),
		 to consume data from this local stream, as if they were attached directly in place of the local Sink.
		 
		 Adheres to [`StreamRefAttributes`](../StreamRefAttributes.html "class in akka.stream").
		 
		
		
		 See more detailed documentation on `SourceRef`.
		- #### sinkRef
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SinkRef](../SinkRef.html "interface in akka.stream")<T>> sinkRef()
		```
		
		A local [`Source`](Source.html "class in akka.stream.scaladsl") which materializes a `SinkRef` which can be used by other streams (including remote ones),
		 to publish data to this local stream, as if they were attached directly in place of the local Source.
		 
		 Adheres to [`StreamRefAttributes`](../StreamRefAttributes.html "class in akka.stream").
		 
		
		
		 See more detailed documentation on `SinkRef`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/StreamRefs$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/StreamRefs$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/StreamRefs$.html)*