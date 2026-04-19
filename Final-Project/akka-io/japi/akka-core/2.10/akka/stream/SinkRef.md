---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/SinkRef.html
title: SinkRef
---

# SinkRef

## Content

Package [akka.stream](package-summary.html)
## Interface SinkRef\<In\>

- ---

```
public interface SinkRef<In>
```

A [`SinkRef`](SinkRef.html "interface in akka.stream") allows sharing a "reference" to a `Sink` with others, with the main purpose of crossing a network boundary.
 Usually obtaining a SinkRef would be done via Actor messaging, in which one system asks a remote one,
 to accept some data from it, and the remote one decides to accept the request to send data in a back\-pressured
 streaming fashion \-\- using a sink ref.
 
 To create a [`SinkRef`](SinkRef.html "interface in akka.stream") you have to materialize the `Sink` that you want to obtain a reference to by attaching it to a `StreamRefs.sinkRef()`.
 

 Stream refs can be seen as Reactive Streams over network boundaries.
 See also [`SourceRef`](SourceRef.html "interface in akka.stream") which is the dual of a `SinkRef`.
 

 For additional configuration see `reference.conf` as well as [`StreamRefAttributes`](StreamRefAttributes.html "class in akka.stream").
 

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Sink](javadsl/Sink.html "class in akka.stream.javadsl")<[In](SinkRef.html "type parameter in SinkRef"),​[NotUsed](../NotUsed.html "class in akka")>` | `[getSink](#getSink())()` | Java API: Get `javadsl.Sink` underlying to this source ref. |
	| `[Sink](scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](SinkRef.html "type parameter in SinkRef"),​[NotUsed](../NotUsed.html "class in akka")>` | `[sink](#sink())()` | Scala API: Get `Sink` underlying to this source ref. |

- - ### Method Detail
	
	
	
		- #### sink
		
		
		
		```
		[Sink](scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](SinkRef.html "type parameter in SinkRef"),​[NotUsed](../NotUsed.html "class in akka")> sink()
		```
		
		Scala API: Get `Sink` underlying to this source ref.
		- #### getSink
		
		
		
		```
		[Sink](javadsl/Sink.html "class in akka.stream.javadsl")<[In](SinkRef.html "type parameter in SinkRef"),​[NotUsed](../NotUsed.html "class in akka")> getSink()
		```
		
		Java API: Get `javadsl.Sink` underlying to this source ref.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefAttributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Sink.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/SinkRef.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/SinkRef.html)*