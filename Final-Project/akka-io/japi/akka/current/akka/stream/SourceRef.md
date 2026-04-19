---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/SourceRef.html
title: SourceRef
---

# SourceRef

## Content

Package [akka.stream](package-summary.html)
## Interface SourceRef\<T\>

- ---

```
public interface SourceRef<T>
```

A SourceRef allows sharing a "reference" with others, with the main purpose of crossing a network boundary.
 Usually obtaining a SourceRef would be done via Actor messaging, in which one system asks a remote one,
 to share some data with it, and the remote one decides to do so in a back\-pressured streaming fashion \-\- using a stream ref.
 
 To create a [`SourceRef`](SourceRef.html "interface in akka.stream") you have to materialize the `Source` that you want to obtain a reference to by attaching it to a `Sink.sourceRef`.
 

 Stream refs can be seen as Reactive Streams over network boundaries.
 See also [`SinkRef`](SinkRef.html "interface in akka.stream") which is the dual of a `SourceRef`.
 

 For additional configuration see `reference.conf` as well as [`StreamRefAttributes`](StreamRefAttributes.html "class in akka.stream").
 

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](javadsl/Source.html "class in akka.stream.javadsl")<[T](SourceRef.html "type parameter in SourceRef"),​[NotUsed](../NotUsed.html "class in akka")>` | `[getSource](#getSource())()` | Java API: Get `javadsl.Source` underlying to this source ref. |
	| `[Source](scaladsl/Source.html "class in akka.stream.scaladsl")<[T](SourceRef.html "type parameter in SourceRef"),​[NotUsed](../NotUsed.html "class in akka")>` | `[source](#source())()` | Scala API: Get `Source` underlying to this source ref. |

- - ### Method Detail
	
	
	
		- #### source
		
		
		
		```
		[Source](scaladsl/Source.html "class in akka.stream.scaladsl")<[T](SourceRef.html "type parameter in SourceRef"),​[NotUsed](../NotUsed.html "class in akka")> source()
		```
		
		Scala API: Get `Source` underlying to this source ref.
		- #### getSource
		
		
		
		```
		[Source](javadsl/Source.html "class in akka.stream.javadsl")<[T](SourceRef.html "type parameter in SourceRef"),​[NotUsed](../NotUsed.html "class in akka")> getSource()
		```
		
		Java API: Get `javadsl.Source` underlying to this source ref.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/SourceRef.html](https://doc.akka.io/japi/akka/current/akka/stream/SourceRef.html)*