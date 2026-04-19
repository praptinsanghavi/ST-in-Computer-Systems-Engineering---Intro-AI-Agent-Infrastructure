---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SinkQueueWithCancel.html
title: SinkQueueWithCancel
---

# SinkQueueWithCancel

## Content

Package [akka.stream.javadsl](package-summary.html)
## Interface SinkQueueWithCancel\<T\>

- All Superinterfaces:
`[SinkQueue](SinkQueue.html "interface in akka.stream.javadsl")<T>`

---

```
public interface SinkQueueWithCancel<T>
extends [SinkQueue](SinkQueue.html "interface in akka.stream.javadsl")<T>
```

This trait adds cancel support to [`SinkQueue`](SinkQueue.html "interface in akka.stream.javadsl").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cancel](#cancel())()` | Cancels the stream. |
	
	
		- ### Methods inherited from interface akka.stream.javadsl.[SinkQueue](SinkQueue.html "interface in akka.stream.javadsl")
		
		
		`[pull](SinkQueue.html#pull())`

- - ### Method Detail
	
	
	
		- #### cancel
		
		
		
		```
		void cancel()
		```
		
		Cancels the stream. This method returns right away without waiting for actual finalizing the stream.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SinkQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SinkQueueWithCancel.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SinkQueueWithCancel.html)*