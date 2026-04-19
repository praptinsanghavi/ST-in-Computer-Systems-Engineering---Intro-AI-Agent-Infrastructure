---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:53:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SinkQueueWithCancel.html
title: SinkQueueWithCancel
---

# SinkQueueWithCancel

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface SinkQueueWithCancel\<T\>

- All Superinterfaces:
`[SinkQueue](SinkQueue.html "interface in akka.stream.scaladsl")<T>`

---

```
public interface SinkQueueWithCancel<T>
extends [SinkQueue](SinkQueue.html "interface in akka.stream.scaladsl")<T>
```

This trait adds cancel support to [`SinkQueue`](SinkQueue.html "interface in akka.stream.scaladsl").

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[SinkQueueWithCancel.QueueOps](SinkQueueWithCancel.QueueOps.html "class in akka.stream.scaladsl")<[T](SinkQueueWithCancel.QueueOps.html "type parameter in SinkQueueWithCancel.QueueOps")>` |  |
	| `static class` | `[SinkQueueWithCancel.QueueOps$](SinkQueueWithCancel.QueueOps$.html "class in akka.stream.scaladsl")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cancel](#cancel())()` | Cancels the stream. |
	
	
		- ### Methods inherited from interface akka.stream.scaladsl.[SinkQueue](SinkQueue.html "interface in akka.stream.scaladsl")
		
		
		`[pull](SinkQueue.html#pull())`

- - ### Method Detail
	
	
	
		- #### cancel
		
		
		
		```
		void cancel()
		```
		
		Cancels the stream. This method returns right away without waiting for actual finalizing the stream.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SinkQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SinkQueueWithCancel.QueueOps$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SinkQueueWithCancel.QueueOps.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SinkQueueWithCancel.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SinkQueueWithCancel.html)*