---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergeHub$.html
title: MergeHub$
---

# MergeHub$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class MergeHub$

- java.lang.Object
- - akka.stream.scaladsl.MergeHub$

- ---

```
public class MergeHub$
extends java.lang.Object
```

A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of
 producers. It consists of two parts, a [`Source`](Source.html "class in akka.stream.scaladsl") and a [`Sink`](Sink.html "class in akka.stream.scaladsl"). The [`Source`](Source.html "class in akka.stream.scaladsl") streams the element to a consumer from
 its merged inputs. Once the consumer has been materialized, the [`Source`](Source.html "class in akka.stream.scaladsl") returns a materialized value which is
 the corresponding [`Sink`](Sink.html "class in akka.stream.scaladsl"). This [`Sink`](Sink.html "class in akka.stream.scaladsl") can then be materialized arbitrary many times, where each of the new
 materializations will feed its consumed elements to the original [`Source`](Source.html "class in akka.stream.scaladsl").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MergeHub$](MergeHub$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergeHub$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> boolean` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` | INTERNAL API |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[source](#source())()` |  |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[source](#source(int))​(int perProducerBufferSize)` |  |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.Tuple2<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>,​akka.stream.scaladsl.MergeHub.DrainingControl>>` | `[sourceWithDraining](#sourceWithDraining())()` |  |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.Tuple2<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>,​akka.stream.scaladsl.MergeHub.DrainingControl>>` | `[sourceWithDraining](#sourceWithDraining(int))​(int perProducerBufferSize)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MergeHub$](MergeHub$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MergeHub$
		
		
		
		```
		public MergeHub$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public <T> boolean $lessinit$greater$default$2()
		```
		
		INTERNAL API
		- #### source
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> source​(int perProducerBufferSize)
		```
		- #### sourceWithDraining
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.Tuple2<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>,​akka.stream.scaladsl.MergeHub.DrainingControl>> sourceWithDraining​(int perProducerBufferSize)
		```
		- #### source
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> source()
		```
		- #### sourceWithDraining
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.Tuple2<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>,​akka.stream.scaladsl.MergeHub.DrainingControl>> sourceWithDraining()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergeHub$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergeHub$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergeHub$.html)*