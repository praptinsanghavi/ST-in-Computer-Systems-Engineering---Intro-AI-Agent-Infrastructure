---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RetryFlow$.html
title: RetryFlow$
---

# RetryFlow$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class RetryFlow$

- java.lang.Object
- - akka.stream.javadsl.RetryFlow$

- ---

```
public class RetryFlow$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RetryFlow$](RetryFlow$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetryFlow$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<In,​Out,​Mat>[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​Mat>` | `[withBackoff](#withBackoff(java.time.Duration,java.time.Duration,double,int,akka.stream.javadsl.Flow,akka.japi.function.Function2))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  int maxRetries,  [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​Mat> flow,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<In,​Out,​java.util.Optional<In>> decideRetry)` | Allows retrying individual elements in the stream with an exponential backoff. |
	| `<In,​InCtx,​Out,​OutCtx,​Mat>[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​InCtx,​Out,​OutCtx,​Mat>` | `[withBackoffAndContext](#withBackoffAndContext(java.time.Duration,java.time.Duration,double,int,akka.stream.javadsl.FlowWithContext,akka.japi.function.Function2))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor,  int maxRetries,  [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​InCtx,​Out,​OutCtx,​Mat> flow,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Pair](../../japi/Pair.html "class in akka.japi")<In,​InCtx>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out,​OutCtx>,​java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<In,​InCtx>>> decideRetry)` | Allows retrying individual elements in the stream with an exponential backoff. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RetryFlow$](RetryFlow$.html "class in akka.stream.javadsl") MODULE$
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
		public <In,​Out,​Mat> [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​Mat> withBackoff​(java.time.Duration minBackoff,
		                                                                         java.time.Duration maxBackoff,
		                                                                         double randomFactor,
		                                                                         int maxRetries,
		                                                                         [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​Mat> flow,
		                                                                         [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<In,​Out,​java.util.Optional<In>> decideRetry)
		```
		
		Allows retrying individual elements in the stream with an exponential backoff.
		 
		 The retry condition is controlled by the `decideRetry` function. It takes the originally emitted
		 element and the response emitted by `flow`, and may return a request to be retried.
		 
		
		
		 The implementation of the `RetryFlow` requires that `flow` follows one\-in\-one\-out semantics,
		 the [`Flow`](Flow.html "class in akka.stream.javadsl") may not filter elements,
		 nor emit more than one element per incoming element. The `RetryFlow` will fail if two elements are
		 emitted from the `flow`, it will be stuck "forever" if nothing is emitted. Just one element will
		 be emitted into the `flow` at any time. The `flow` needs to emit an element before the next
		 will be emitted to it.
		 
		
		
		
		Parameters:
		`minBackoff` \- minimum duration to backoff between issuing retries
		`maxBackoff` \- maximum duration to backoff between issuing retries
		`randomFactor` \- adds jitter to the retry delay. Use 0 for no jitter
		`flow` \- a flow to retry elements from
		`decideRetry` \- retry condition decision function
		- #### withBackoffAndContext
		
		
		
		```
		public <In,​InCtx,​Out,​OutCtx,​Mat> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​InCtx,​Out,​OutCtx,​Mat> withBackoffAndContext​(java.time.Duration minBackoff,
		                                                                                                                                                java.time.Duration maxBackoff,
		                                                                                                                                                double randomFactor,
		                                                                                                                                                int maxRetries,
		                                                                                                                                                [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​InCtx,​Out,​OutCtx,​Mat> flow,
		                                                                                                                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Pair](../../japi/Pair.html "class in akka.japi")<In,​InCtx>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out,​OutCtx>,​java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<In,​InCtx>>> decideRetry)
		```
		
		Allows retrying individual elements in the stream with an exponential backoff.
		 
		 The retry condition is controlled by the `decideRetry` function. It takes the originally emitted
		 element with its context, and the response emitted by `flow`, and may return a request to be retried.
		 
		
		
		 The implementation of the `RetryFlow` requires that `flow` follows one\-in\-one\-out semantics,
		 the [`FlowWithContext`](FlowWithContext.html "class in akka.stream.javadsl") may not filter elements,
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
		`flow` \- a flow to retry elements from
		`decideRetry` \- retry condition decision function

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RetryFlow$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RetryFlow$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RetryFlow$.html)*