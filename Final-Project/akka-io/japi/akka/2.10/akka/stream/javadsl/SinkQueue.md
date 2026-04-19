---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:01:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SinkQueue.html
title: SinkQueue
---

# SinkQueue

## Content

Package [akka.stream.javadsl](package-summary.html)
## Interface SinkQueue\<T\>

- All Known Subinterfaces:
`[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.javadsl")<T>`

---

```
public interface SinkQueue<T>
```

This trait allows to have a queue as a sink for a stream.
 A [`SinkQueue`](SinkQueue.html "interface in akka.stream.javadsl") pulls data from stream with a backpressure mechanism.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<java.util.Optional<[T](SinkQueue.html "type parameter in SinkQueue")>>` | `[pull](#pull())()` | Pulls elements from the stream and returns a `CompletionStage` that:  \- fails if the stream is failed  \- completes with Empty in case the stream is completed  \- completes with `element` in case the next element is available from the stream. |

- - ### Method Detail
	
	
	
		- #### pull
		
		
		
		```
		java.util.concurrent.CompletionStage<java.util.Optional<[T](SinkQueue.html "type parameter in SinkQueue")>> pull()
		```
		
		Pulls elements from the stream and returns a `CompletionStage` that:
		 \- fails if the stream is failed
		 \- completes with Empty in case the stream is completed
		 \- completes with `element` in case the next element is available from the stream.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SinkQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SinkQueueWithCancel.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SinkQueue.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SinkQueue.html)*