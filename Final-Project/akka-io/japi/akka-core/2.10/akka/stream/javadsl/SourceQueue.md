---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:51:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceQueue.html
title: SourceQueue
---

# SourceQueue

## Content

Package [akka.stream.javadsl](package-summary.html)
## Interface SourceQueue\<T\>

- All Known Subinterfaces:
`[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")<T>`

---

```
public interface SourceQueue<T>
```

This trait allows to have a queue as a data source for some stream.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<[QueueOfferResult](../QueueOfferResult.html "class in akka.stream")>` | `[offer](#offer(T))​([T](SourceQueue.html "type parameter in SourceQueue") elem)` | Offers an element to a stream and returns a `CompletionStage` that:  \- completes with `Enqueued` if the element is consumed by a stream  \- completes with `Dropped` when the stream dropped the offered element  \- completes with `QueueClosed` when the stream is completed whilst the `CompletionStage` is active  \- completes with `Failure(f)` in case of failure to enqueue element from upstream  \- fails when stream is already completed |
	| `java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>` | `[watchCompletion](#watchCompletion())()` | Returns a `CompletionStage` that will be completed if this  operator completes, or will be failed when the stream is failed. |

- - ### Method Detail
	
	
	
		- #### offer
		
		
		
		```
		java.util.concurrent.CompletionStage<[QueueOfferResult](../QueueOfferResult.html "class in akka.stream")> offer​([T](SourceQueue.html "type parameter in SourceQueue") elem)
		```
		
		Offers an element to a stream and returns a `CompletionStage` that:
		 \- completes with `Enqueued` if the element is consumed by a stream
		 \- completes with `Dropped` when the stream dropped the offered element
		 \- completes with `QueueClosed` when the stream is completed whilst the `CompletionStage` is active
		 \- completes with `Failure(f)` in case of failure to enqueue element from upstream
		 \- fails when stream is already completed
		 
		 Additionally when using the backpressure overflowStrategy:
		 \- If the buffer is full the `CompletionStage` won't be completed until there is space in the buffer
		 \- Calling offer before the `CompletionStage` is completed, in this case it will return a failed `CompletionStage`
		
		
		
		
		Parameters:
		`elem` \- element to send to a stream
		- #### watchCompletion
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")> watchCompletion()
		```
		
		Returns a `CompletionStage` that will be completed if this
		 operator completes, or will be failed when the stream is failed.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceQueueWithComplete.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceQueue.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceQueue.html)*