---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RetryFlow$.html
title: RetryFlow$
---

# RetryFlow$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class RetryFlow$

- java.lang.Object
- - akka.stream.scaladsl.RetryFlow$

- ---

```
public class RetryFlow$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RetryFlow$](RetryFlow$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetryFlow$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<In,​Out,​Mat>[Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​Mat>` | `[withBackoff](#withBackoff(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,int,akka.stream.scaladsl.Flow,scala.Function2))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  int maxRetries,  [Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​Mat> flow,  scala.Function2<In,​Out,​scala.Option<In>> decideRetry)` | Allows retrying individual elements in the stream with an exponential backoff. |
	| `<In,​CtxIn,​Out,​CtxOut,​Mat>[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​CtxIn,​Out,​CtxOut,​Mat>` | `[withBackoffAndContext](#withBackoffAndContext(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double,int,akka.stream.scaladsl.FlowWithContext,scala.Function2))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor,  int maxRetries,  [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​CtxIn,​Out,​CtxOut,​Mat> flow,  scala.Function2<scala.Tuple2<In,​CtxIn>,​scala.Tuple2<Out,​CtxOut>,​scala.Option<scala.Tuple2<In,​CtxIn>>> decideRetry)` | Allows retrying individual elements in the stream with an exponential backoff. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RetryFlow$](RetryFlow$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RetryFlow$
		
		
		
		```
		public RetryFlow$()
		```

	- ### Method Detail
	
	
	
		- #### withBackoff
		
		
		
		```
		public <In,​Out,​Mat> [Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​Mat> withBackoff​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                                                         scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                                         double randomFactor,
		                                                                         int maxRetries,
		                                                                         [Flow](Flow.html "class in akka.stream.scaladsl")<In,​Out,​Mat> flow,
		                                                                         scala.Function2<In,​Out,​scala.Option<In>> decideRetry)
		```
		
		Allows retrying individual elements in the stream with an exponential backoff.
		 
		 The retry condition is controlled by the `decideRetry` function. It takes the originally emitted
		 element and the response emitted by `flow`, and may return a request to be retried.
		 
		
		
		 The implementation of the `RetryFlow` requires that `flow` follows strict first\-in\-first\-out and
		 one\-in\-one\-out semantics, i.e., the [`Flow`](Flow.html "class in akka.stream.scaladsl") may neither filter elements,
		 nor emit more than one element per incoming element. The `RetryFlow` will fail if two elements
		 are emitted for one incoming element. Any sort of batching, grouping, or filtering
		 will make it hang forever.
		 
		
		
		 Just one element will be emitted into the `flow` at any time.
		 Let's say the flow is handling an element, either first\-time executing some calculation, or retrying.
		 The next element won't be emitted into the flow until the current element has been finished processing.
		 By finished, it means either succeed the very first attempt, succeed after a few attempts, or get dropped after
		 using up `maxRetries` retries.
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum duration to backoff between issuing retries
		`maxBackoff` \- maximum duration to backoff between issuing retries
		`randomFactor` \- adds jitter to the retry delay. Use 0 for no jitter
		`maxRetries` \- total number of allowed retries, when reached the last result will be emitted
		 even if unsuccessful
		`flow` \- a flow to retry elements from
		`decideRetry` \- retry condition decision function
		- #### withBackoffAndContext
		
		
		
		```
		public <In,​CtxIn,​Out,​CtxOut,​Mat> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​CtxIn,​Out,​CtxOut,​Mat> withBackoffAndContext​(scala.concurrent.duration.FiniteDuration minBackoff,
		                                                                                                                                                scala.concurrent.duration.FiniteDuration maxBackoff,
		                                                                                                                                                double randomFactor,
		                                                                                                                                                int maxRetries,
		                                                                                                                                                [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​CtxIn,​Out,​CtxOut,​Mat> flow,
		                                                                                                                                                scala.Function2<scala.Tuple2<In,​CtxIn>,​scala.Tuple2<Out,​CtxOut>,​scala.Option<scala.Tuple2<In,​CtxIn>>> decideRetry)
		```
		
		Allows retrying individual elements in the stream with an exponential backoff.
		 
		 The retry condition is controlled by the `decideRetry` function. It takes the originally emitted
		 element with its context, and the response emitted by `flow`, and may return a request to be retried.
		 
		
		
		 The implementation of the `RetryFlow` requires that `flow` follows one\-in\-one\-out semantics,
		 the [`FlowWithContext`](FlowWithContext.html "class in akka.stream.scaladsl") may not filter elements,
		 nor emit more than one element per incoming element. The `RetryFlow` will fail if two elements are
		 emitted from the `flow`, it will be stuck "forever" if nothing is emitted. Just one element will
		 be emitted into the `flow` at any time. The `flow` needs to emit an element before the next
		 will be emitted to it.
		 
		
		
		 The wrapped `flow` and `decideRetry` take the additional context parameters which can be a context,
		 or used to control retrying with other information.
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum duration to backoff between issuing retries
		`maxBackoff` \- maximum duration to backoff between issuing retries
		`randomFactor` \- adds jitter to the retry delay. Use 0 for no jitter
		`maxRetries` \- total number of allowed retries, when reached the last result will be emitted
		 even if unsuccessful
		`flow` \- a flow with context to retry elements from
		`decideRetry` \- retry condition decision function

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RetryFlow$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RetryFlow$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RetryFlow$.html)*