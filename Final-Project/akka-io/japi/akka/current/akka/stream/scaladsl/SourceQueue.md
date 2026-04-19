---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceQueue.html
title: SourceQueue
---

# SourceQueue

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface SourceQueue\<T\>

- All Known Subinterfaces:
`[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")<T>`

---

```
public interface SourceQueue<T>
```

This trait allows to have a queue as a data source for some stream.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[QueueOfferResult](../QueueOfferResult.html "class in akka.stream")>` | `[offer](#offer(T))​([T](SourceQueue.html "type parameter in SourceQueue") elem)` | Offers an element to a stream and returns a `Future` that:  \- completes with `Enqueued` if the element is consumed by a stream  \- completes with `Dropped` when the stream dropped the offered element  \- completes with `QueueClosed` when the stream is completed whilst the `Future` is active  \- completes with `Failure(f)` in case of failure to enqueue element from upstream  \- fails when stream is already completed |
	| `scala.concurrent.Future<[Done](../../Done.html "class in akka")>` | `[watchCompletion](#watchCompletion())()` | Returns a `Future` that will be completed if this operator  completes, or will be failed when the operator faces an internal failure. |

- - ### Method Detail
	
	
	
		- #### offer
		
		
		
		```
		scala.concurrent.Future<[QueueOfferResult](../QueueOfferResult.html "class in akka.stream")> offer​([T](SourceQueue.html "type parameter in SourceQueue") elem)
		```
		
		Offers an element to a stream and returns a `Future` that:
		 \- completes with `Enqueued` if the element is consumed by a stream
		 \- completes with `Dropped` when the stream dropped the offered element
		 \- completes with `QueueClosed` when the stream is completed whilst the `Future` is active
		 \- completes with `Failure(f)` in case of failure to enqueue element from upstream
		 \- fails when stream is already completed
		 
		 Additionally when using the backpressure overflowStrategy:
		 \- If the buffer is full the `Future` won't be completed until there is space in the buffer
		 \- Calling offer before the `Future` is completed, in this case it will return a failed `Future`
		
		
		
		
		Parameters:
		`elem` \- element to send to a stream
		- #### watchCompletion
		
		
		
		```
		scala.concurrent.Future<[Done](../../Done.html "class in akka")> watchCompletion()
		```
		
		Returns a `Future` that will be completed if this operator
		 completes, or will be failed when the operator faces an internal failure.
		 
		 Note that this only means the elements have been passed downstream, not
		 that downstream has successfully processed them.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceQueue.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceQueueWithComplete.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceQueue.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceQueue.html)*