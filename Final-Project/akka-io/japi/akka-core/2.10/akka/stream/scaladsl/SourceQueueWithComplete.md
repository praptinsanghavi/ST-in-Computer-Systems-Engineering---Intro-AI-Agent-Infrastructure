---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:52:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SourceQueueWithComplete.html
title: SourceQueueWithComplete
---

# SourceQueueWithComplete

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface SourceQueueWithComplete\<T\>

- All Superinterfaces:
`[SourceQueue](SourceQueue.html "interface in akka.stream.scaladsl")<T>`

---

```
public interface SourceQueueWithComplete<T>
extends [SourceQueue](SourceQueue.html "interface in akka.stream.scaladsl")<T>
```

This trait adds completion support to [`SourceQueue`](SourceQueue.html "interface in akka.stream.scaladsl").

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[SourceQueueWithComplete.QueueOps](SourceQueueWithComplete.QueueOps.html "class in akka.stream.scaladsl")<[T](SourceQueueWithComplete.QueueOps.html "type parameter in SourceQueueWithComplete.QueueOps")>` |  |
	| `static class` | `[SourceQueueWithComplete.QueueOps$](SourceQueueWithComplete.QueueOps$.html "class in akka.stream.scaladsl")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[complete](#complete())()` | Completes the stream normally. |
	| `void` | `[fail](#fail(java.lang.Throwable))​(java.lang.Throwable ex)` | Completes the stream with a failure. |
	| `scala.concurrent.Future<[Done](../../Done.html "class in akka")>` | `[watchCompletion](#watchCompletion())()` | Method returns a `Future` that will be completed if this operator  completes, or will be failed when the stream fails,  for example when `SourceQueueWithComplete.fail` is invoked. |
	
	
		- ### Methods inherited from interface akka.stream.scaladsl.[SourceQueue](SourceQueue.html "interface in akka.stream.scaladsl")
		
		
		`[offer](SourceQueue.html#offer(T))`

- - ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		void complete()
		```
		
		Completes the stream normally. Use `watchCompletion` to be notified of this
		 operation\&rsquo;s success.
		 
		 Note that this only means the elements have been passed downstream, not
		 that downstream has successfully processed them.
		- #### fail
		
		
		
		```
		void fail​(java.lang.Throwable ex)
		```
		
		Completes the stream with a failure. Use `watchCompletion` to be notified of this
		 operation\&rsquo;s success.
		- #### watchCompletion
		
		
		
		```
		scala.concurrent.Future<[Done](../../Done.html "class in akka")> watchCompletion()
		```
		
		Method returns a `Future` that will be completed if this operator
		 completes, or will be failed when the stream fails,
		 for example when `SourceQueueWithComplete.fail` is invoked.
		 
		 Note that this only means the elements have been passed downstream, not
		 that downstream has successfully processed them.
		
		
		
		Specified by:
		`[watchCompletion](SourceQueue.html#watchCompletion())` in interface `[SourceQueue](SourceQueue.html "interface in akka.stream.scaladsl")<[T](SourceQueueWithComplete.html "type parameter in SourceQueueWithComplete")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SourceQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SourceQueueWithComplete.QueueOps$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SourceQueueWithComplete.QueueOps.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SourceQueueWithComplete.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SourceQueueWithComplete.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SourceQueueWithComplete.html)*