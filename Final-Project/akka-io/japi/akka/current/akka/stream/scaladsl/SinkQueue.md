---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SinkQueue.html
title: SinkQueue
---

# SinkQueue

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface SinkQueue\<T\>

- All Known Subinterfaces:
`[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.scaladsl")<T>`

---

```
public interface SinkQueue<T>
```

This trait allows to have a queue as a sink for a stream.
 A [`SinkQueue`](SinkQueue.html "interface in akka.stream.scaladsl") pulls data from a stream with a backpressure mechanism.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<scala.Option<[T](SinkQueue.html "type parameter in SinkQueue")>>` | `[pull](#pull())()` | Pulls elements from the stream and returns a `Future` that:  \- fails if the stream is failed  \- completes with None in case the stream is completed  \- completes with `Some(element)` in case the next element is available from stream. |

- - ### Method Detail
	
	
	
		- #### pull
		
		
		
		```
		scala.concurrent.Future<scala.Option<[T](SinkQueue.html "type parameter in SinkQueue")>> pull()
		```
		
		Pulls elements from the stream and returns a `Future` that:
		 \- fails if the stream is failed
		 \- completes with None in case the stream is completed
		 \- completes with `Some(element)` in case the next element is available from stream.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SinkQueue.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SinkQueueWithCancel.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SinkQueue.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SinkQueue.html)*