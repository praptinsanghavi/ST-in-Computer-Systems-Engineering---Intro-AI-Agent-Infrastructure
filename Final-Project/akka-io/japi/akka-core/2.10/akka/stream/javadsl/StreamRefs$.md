---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:52:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamRefs$.html
title: StreamRefs$
---

# StreamRefs$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class StreamRefs$

- java.lang.Object
- - akka.stream.javadsl.StreamRefs$

- ---

```
public class StreamRefs$
extends java.lang.Object
```

Factories for creating stream refs.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamRefs$](StreamRefs$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamRefs$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SinkRef](../SinkRef.html "interface in akka.stream")<T>>` | `[sinkRef](#sinkRef())()` | A local [`Sink`](Sink.html "class in akka.stream.javadsl") which materializes a `SourceRef` which can be used by other streams (including remote ones),  to consume data from this local stream, as if they were attached in the spot of the local Sink directly. |
	| `<T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[SourceRef](../SourceRef.html "interface in akka.stream")<T>>` | `[sourceRef](#sourceRef())()` | A local [`Sink`](Sink.html "class in akka.stream.javadsl") which materializes a `SourceRef` which can be used by other streams (including remote ones),  to consume data from this local stream, as if they were attached in the spot of the local Sink directly. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamRefs$](StreamRefs$.html "class in akka.stream.javadsl") MODULE$
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
		public <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[SourceRef](../SourceRef.html "interface in akka.stream")<T>> sourceRef()
		```
		
		A local [`Sink`](Sink.html "class in akka.stream.javadsl") which materializes a `SourceRef` which can be used by other streams (including remote ones),
		 to consume data from this local stream, as if they were attached in the spot of the local Sink directly.
		 
		 Adheres to `StreamRefAttributes`.
		 
		
		
		 See more detailed documentation on `SourceRef`.
		- #### sinkRef
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SinkRef](../SinkRef.html "interface in akka.stream")<T>> sinkRef()
		```
		
		A local [`Sink`](Sink.html "class in akka.stream.javadsl") which materializes a `SourceRef` which can be used by other streams (including remote ones),
		 to consume data from this local stream, as if they were attached in the spot of the local Sink directly.
		 
		 Adheres to `StreamRefAttributes`.
		 
		
		
		 See more detailed documentation on `SinkRef`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamRefs$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamRefs$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamRefs$.html)*