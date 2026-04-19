---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/BoundedSourceQueue.html
title: BoundedSourceQueue
---

# BoundedSourceQueue

## Content

Package [akka.stream](package-summary.html)
## Interface BoundedSourceQueue\<T\>

- ---

```
public interface BoundedSourceQueue<T>
```

A queue of the given size that gives immediate feedback whether an element could be enqueued or not.
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[complete](#complete())()` | Completes the stream normally. |
	| `void` | `[fail](#fail(java.lang.Throwable))​(java.lang.Throwable ex)` | Completes the stream with a failure. |
	| `[QueueOfferResult](QueueOfferResult.html "class in akka.stream")` | `[offer](#offer(T))​([T](BoundedSourceQueue.html "type parameter in BoundedSourceQueue") elem)` | Returns a [`QueueOfferResult`](QueueOfferResult.html "class in akka.stream") that notifies the caller if the element could be enqueued or not, or  the completion status of the queue. |
	| `int` | `[size](#size())()` | Returns the approximate number of elements in this queue. |

- - ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		void complete()
		```
		
		Completes the stream normally.
		- #### fail
		
		
		
		```
		void fail​(java.lang.Throwable ex)
		```
		
		Completes the stream with a failure.
		- #### offer
		
		
		
		```
		[QueueOfferResult](QueueOfferResult.html "class in akka.stream") offer​([T](BoundedSourceQueue.html "type parameter in BoundedSourceQueue") elem)
		```
		
		Returns a [`QueueOfferResult`](QueueOfferResult.html "class in akka.stream") that notifies the caller if the element could be enqueued or not, or
		 the completion status of the queue.
		 
		 A result of `QueueOfferResult.Enqueued` does not guarantee that an element also has been or will be processed by
		 the downstream.
		- #### size
		
		
		
		```
		int size()
		```
		
		Returns the approximate number of elements in this queue.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/BoundedSourceQueue.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/BoundedSourceQueue.html)*