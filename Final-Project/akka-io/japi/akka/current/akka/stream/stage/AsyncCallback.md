---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/stage/AsyncCallback.html
title: AsyncCallback
---

# AsyncCallback

## Content

Package [akka.stream.stage](package-summary.html)
## Interface AsyncCallback\<T\>

- ---

```
public interface AsyncCallback<T>
```

An asynchronous callback holder that is attached to a [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage").
 Initializing [`invoke(T)`](#invoke(T)) will eventually lead to the registered handler
 being called.
 
 This holder has the same lifecycle as a stream and cannot be used before
 materialization is done.
 

 Typical use cases are exchanging messages between stream and substreams or invoking from external world sending
 event to a stream
 

 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[invoke](#invoke(T))​([T](AsyncCallback.html "type parameter in AsyncCallback") t)` | Dispatch an asynchronous notification. |
	| `scala.concurrent.Future<[Done](../../Done.html "class in akka")>` | `[invokeWithFeedback](#invokeWithFeedback(T))​([T](AsyncCallback.html "type parameter in AsyncCallback") t)` | Scala API: Dispatch an asynchronous notification. |
	| `java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>` | `[invokeWithFeedbackCS](#invokeWithFeedbackCS(T))​([T](AsyncCallback.html "type parameter in AsyncCallback") t)` | Java API: Dispatch an asynchronous notification. |

- - ### Method Detail
	
	
	
		- #### invoke
		
		
		
		```
		void invoke​([T](AsyncCallback.html "type parameter in AsyncCallback") t)
		```
		
		Dispatch an asynchronous notification. This method is thread\-safe and
		 may be invoked from external execution contexts.
		 
		 For cases where it is important to know if the notification was ever processed or not
		 see [`invokeWithFeedback(T)`](#invokeWithFeedback(T))
		- #### invokeWithFeedback
		
		
		
		```
		scala.concurrent.Future<[Done](../../Done.html "class in akka")> invokeWithFeedback​([T](AsyncCallback.html "type parameter in AsyncCallback") t)
		```
		
		Scala API: Dispatch an asynchronous notification. This method is thread\-safe and
		 may be invoked from external execution contexts.
		 
		 The method returns directly and the returned future is then completed once the event
		 has been handled by the operator, if the event triggers an exception from the handler the future
		 is failed with that exception and finally if the operator was stopped before the event has been
		 handled the future is failed with `StreamDetachedException`.
		 
		
		
		 The handling of the returned future incurs a slight overhead, so for cases where it does not matter
		 to the invoking logic see [`invoke(T)`](#invoke(T))
		- #### invokeWithFeedbackCS
		
		
		
		```
		java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")> invokeWithFeedbackCS​([T](AsyncCallback.html "type parameter in AsyncCallback") t)
		```
		
		Java API: Dispatch an asynchronous notification. This method is thread\-safe and
		 may be invoked from external execution contexts.
		 
		 The method returns directly and the returned future is then completed once the event
		 has been handled by the operator, if the event triggers an exception from the handler the future
		 is failed with that exception and finally if the operator was stopped before the event has been
		 handled the future is failed with `StreamDetachedException`.
		 
		
		
		 The handling of the returned future incurs a slight overhead, so for cases where it does not matter
		 to the invoking logic see [`invoke(T)`](#invoke(T))

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/AsyncCallback.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/stage/AsyncCallback.html](https://doc.akka.io/japi/akka/current/akka/stream/stage/AsyncCallback.html)*