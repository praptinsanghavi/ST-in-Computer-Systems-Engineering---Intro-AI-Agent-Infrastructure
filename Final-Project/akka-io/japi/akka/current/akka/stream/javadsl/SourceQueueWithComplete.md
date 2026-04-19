---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SourceQueueWithComplete.html
title: SourceQueueWithComplete
---

# SourceQueueWithComplete

## Content

Package [akka.stream.javadsl](package-summary.html)
## Interface SourceQueueWithComplete\<T\>

- All Superinterfaces:
`[SourceQueue](SourceQueue.html "interface in akka.stream.javadsl")<T>`

---

```
public interface SourceQueueWithComplete<T>
extends [SourceQueue](SourceQueue.html "interface in akka.stream.javadsl")<T>
```

This trait adds completion support to [`SourceQueue`](SourceQueue.html "interface in akka.stream.javadsl").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[complete](#complete())()` | Completes the stream normally. |
	| `void` | `[fail](#fail(java.lang.Throwable))​(java.lang.Throwable ex)` | Completes the stream with a failure. |
	| `java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>` | `[watchCompletion](#watchCompletion())()` | Method returns a `CompletionStage` that will be completed if this  operator completes, or will be failed when the stream fails,  for example when `SourceQueueWithComplete.fail` is invoked. |
	
	
		- ### Methods inherited from interface akka.stream.javadsl.[SourceQueue](SourceQueue.html "interface in akka.stream.javadsl")
		
		
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
		 
		 Note that this only means the elements have been passed downstream, not
		 that downstream has successfully processed them.
		- #### watchCompletion
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")> watchCompletion()
		```
		
		Method returns a `CompletionStage` that will be completed if this
		 operator completes, or will be failed when the stream fails,
		 for example when `SourceQueueWithComplete.fail` is invoked.
		
		Specified by:
		`[watchCompletion](SourceQueue.html#watchCompletion())` in interface `[SourceQueue](SourceQueue.html "interface in akka.stream.javadsl")<[T](SourceQueueWithComplete.html "type parameter in SourceQueueWithComplete")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SourceQueue.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SourceQueueWithComplete.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SourceQueueWithComplete.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SourceQueueWithComplete.html)*