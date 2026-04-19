---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/pattern/CircuitBreaker.State.html
title: CircuitBreaker.State
---

# CircuitBreaker.State

## Content

Package [akka.pattern](package-summary.html)
## Interface CircuitBreaker.State

- Enclosing class:
[CircuitBreaker](CircuitBreaker.html "class in akka.pattern")

---

```
public static interface CircuitBreaker.State
```

Internal state abstraction

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_enter](#_enter())()` | Template method for concrete traits |
	| `void` | `[addListener](#addListener(java.lang.Runnable))​(java.lang.Runnable listener)` | Add a listener function which is invoked on state entry |
	| `void` | `[callFails](#callFails())()` | Invoked when call fails |
	| `void` | `[callSucceeds](#callSucceeds())()` | Invoked when call succeeds |
	| `<T> scala.concurrent.Future<T>` | `[callThrough](#callThrough(scala.Function0))​(scala.Function0<scala.concurrent.Future<T>> body)` | Shared implementation of call across all states. |
	| `<T> scala.concurrent.Future<T>` | `[callThrough](#callThrough(scala.Function0,scala.Function1))​(scala.Function0<scala.concurrent.Future<T>> body,  scala.Function1<scala.util.Try<T>,​java.lang.Object> defineFailureFn)` | Shared implementation of call across all states. |
	| `void` | `[enter](#enter())()` | Invoked on the transitioned\-to state during transition. |
	| `boolean` | `[hasListeners](#hasListeners())()` | Test for whether listeners exist |
	| `<T> scala.concurrent.Future<T>` | `[invoke](#invoke(scala.Function0))​(scala.Function0<scala.concurrent.Future<T>> body)` | Abstract entry point for all states |
	| `<T> scala.concurrent.Future<T>` | `[invoke](#invoke(scala.Function0,scala.Function1))​(scala.Function0<scala.concurrent.Future<T>> body,  scala.Function1<scala.util.Try<T>,​java.lang.Object> defineFailureFn)` | Abstract entry point for all states |
	| `void` | `[notifyTransitionListeners](#notifyTransitionListeners())()` | Notifies the listeners of the transition event via a Future executed in implicit parameter ExecutionContext |

- - ### Method Detail
	
	
	
		- #### \_enter
		
		
		
		```
		void _enter()
		```
		
		Template method for concrete traits
		- #### addListener
		
		
		
		```
		void addListener​(java.lang.Runnable listener)
		```
		
		Add a listener function which is invoked on state entry
		 
		
		Parameters:
		`listener` \- listener implementation
		- #### callFails
		
		
		
		```
		void callFails()
		```
		
		Invoked when call fails
		- #### callSucceeds
		
		
		
		```
		void callSucceeds()
		```
		
		Invoked when call succeeds
		- #### callThrough
		
		
		
		```
		<T> scala.concurrent.Future<T> callThrough​(scala.Function0<scala.concurrent.Future<T>> body,
		                                           scala.Function1<scala.util.Try<T>,​java.lang.Object> defineFailureFn)
		```
		
		Shared implementation of call across all states. Thrown exception or execution of the call beyond the allowed
		 call timeout is counted as a failed call, otherwise a successful call
		 
		
		Parameters:
		`body` \- Implementation of the call
		`defineFailureFn` \- function that define what should be consider failure and thus increase failure count
		Returns:
		Future containing the result of the call
		- #### callThrough
		
		
		
		```
		<T> scala.concurrent.Future<T> callThrough​(scala.Function0<scala.concurrent.Future<T>> body)
		```
		
		Shared implementation of call across all states. Thrown exception or execution of the call beyond the allowed
		 call timeout is counted as a failed call, otherwise a successful call
		 
		
		Parameters:
		`body` \- Implementation of the call
		Returns:
		Future containing the result of the call
		- #### enter
		
		
		
		```
		void enter()
		```
		
		Invoked on the transitioned\-to state during transition. Notifies listeners after invoking subclass template
		 method \_enter
		- #### hasListeners
		
		
		
		```
		boolean hasListeners()
		```
		
		Test for whether listeners exist
		 
		
		Returns:
		whether listeners exist
		- #### invoke
		
		
		
		```
		<T> scala.concurrent.Future<T> invoke​(scala.Function0<scala.concurrent.Future<T>> body,
		                                      scala.Function1<scala.util.Try<T>,​java.lang.Object> defineFailureFn)
		```
		
		Abstract entry point for all states
		 
		
		Parameters:
		`body` \- Implementation of the call that needs protected
		`defineFailureFn` \- function that define what should be consider failure and thus increase failure count
		Returns:
		Future containing result of protected call
		- #### invoke
		
		
		
		```
		<T> scala.concurrent.Future<T> invoke​(scala.Function0<scala.concurrent.Future<T>> body)
		```
		
		Abstract entry point for all states
		 
		
		Parameters:
		`body` \- Implementation of the call that needs protected
		Returns:
		Future containing result of protected call
		- #### notifyTransitionListeners
		
		
		
		```
		void notifyTransitionListeners()
		```
		
		Notifies the listeners of the transition event via a Future executed in implicit parameter ExecutionContext

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/japi/akka/2.10/akka/pattern/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/pattern/CircuitBreaker.State.html](https://doc.akka.io/japi/akka/2.10/akka/pattern/CircuitBreaker.State.html)*