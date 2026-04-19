---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/SubscriptionWithCancelException.html
title: SubscriptionWithCancelException
---

# SubscriptionWithCancelException

## Content

Package [akka.stream](package-summary.html)
## Interface SubscriptionWithCancelException

- All Superinterfaces:
`org.reactivestreams.Subscription`

All Known Implementing Classes:
`[StreamTestKit.PublisherProbeSubscription](testkit/StreamTestKit.PublisherProbeSubscription.html "class in akka.stream.testkit")`

---

```
public interface SubscriptionWithCancelException
extends org.reactivestreams.Subscription
```

Extension of Subscription that allows to pass a cause when a subscription is cancelled.
 
 Subscribers can check for this trait and use its `cancel(cause)` method instead of the regular
 cancel method to pass a cancellation cause.
 

 Not for user extension.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[SubscriptionWithCancelException.NoMoreElementsNeeded$](SubscriptionWithCancelException.NoMoreElementsNeeded$.html "class in akka.stream")` |  |
	| `static class` | `[SubscriptionWithCancelException.NonFailureCancellation](SubscriptionWithCancelException.NonFailureCancellation.html "class in akka.stream")` | Not for user extension |
	| `static class` | `[SubscriptionWithCancelException.StageWasCompleted$](SubscriptionWithCancelException.StageWasCompleted$.html "class in akka.stream")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cancel](#cancel())()` |  |
	| `void` | `[cancel](#cancel(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	
	
		- ### Methods inherited from interface org.reactivestreams.Subscription
		
		
		`request`

- - ### Method Detail
	
	
	
		- #### cancel
		
		
		
		```
		void cancel()
		```
		
		
		Specified by:
		`cancel` in interface `org.reactivestreams.Subscription`
		- #### cancel
		
		
		
		```
		void cancel​(java.lang.Throwable cause)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SubscriptionWithCancelException.NoMoreElementsNeeded$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SubscriptionWithCancelException.NonFailureCancellation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SubscriptionWithCancelException.StageWasCompleted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/StreamTestKit.PublisherProbeSubscription.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/SubscriptionWithCancelException.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/SubscriptionWithCancelException.html)*