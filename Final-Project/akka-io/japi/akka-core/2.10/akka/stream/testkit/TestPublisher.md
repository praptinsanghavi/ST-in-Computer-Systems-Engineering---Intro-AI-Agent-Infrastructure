---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.html
title: TestPublisher
---

# TestPublisher

## Content

Package [akka.stream.testkit](package-summary.html)
## Class TestPublisher

- java.lang.Object
- - akka.stream.testkit.TestPublisher

- ---

```
public class TestPublisher
extends java.lang.Object
```

Provides factory methods for various Publishers.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[TestPublisher.CancelSubscription](TestPublisher.CancelSubscription.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestPublisher.CancelSubscription$](TestPublisher.CancelSubscription$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestPublisher.ManualProbe](TestPublisher.ManualProbe.html "class in akka.stream.testkit")<[I](TestPublisher.ManualProbe.html "type parameter in TestPublisher.ManualProbe")>` |  |
	| `static class` | `[TestPublisher.ManualProbe$](TestPublisher.ManualProbe$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<[T](TestPublisher.Probe.html "type parameter in TestPublisher.Probe")>` | Single subscription and demand tracking for [`TestPublisher.ManualProbe`](TestPublisher.ManualProbe.html "class in akka.stream.testkit"). |
	| `static class` | `[TestPublisher.Probe$](TestPublisher.Probe$.html "class in akka.stream.testkit")` |  |
	| `static interface` | `[TestPublisher.PublisherEvent](TestPublisher.PublisherEvent.html "interface in akka.stream.testkit")` |  |
	| `static class` | `[TestPublisher.RequestMore](TestPublisher.RequestMore.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestPublisher.RequestMore$](TestPublisher.RequestMore$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestPublisher.Subscribe](TestPublisher.Subscribe.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestPublisher.Subscribe$](TestPublisher.Subscribe$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestPublisher.SubscriptionDone$](TestPublisher.SubscriptionDone$.html "class in akka.stream.testkit")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestPublisher](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> org.reactivestreams.Publisher<T>` | `[empty](#empty())()` | Publisher that signals complete to subscribers, after handing a void subscription. |
	| `static <T> org.reactivestreams.Publisher<T>` | `[error](#error(java.lang.Throwable))​(java.lang.Throwable cause)` | Publisher that signals error to subscribers immediately after handing out subscription. |
	| `static <T> org.reactivestreams.Publisher<T>` | `[lazyEmpty](#lazyEmpty())()` | Publisher that subscribes the subscriber and completes after the first request. |
	| `static <T> org.reactivestreams.Publisher<T>` | `[lazyError](#lazyError(java.lang.Throwable))​(java.lang.Throwable cause)` | Publisher that subscribes the subscriber and signals error after the first request. |
	| `static <T> [TestPublisher.ManualProbe](TestPublisher.ManualProbe.html "class in akka.stream.testkit")<T>` | `[manualProbe](#manualProbe(boolean,akka.actor.ActorSystem))​(boolean autoOnSubscribe,  [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Probe that implements `Publisher` interface. |
	| `static <T> boolean` | `[manualProbe$default$1](#manualProbe$default$1())()` |  |
	| `static <T> [TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<T>` | `[probe](#probe(long,akka.actor.ActorSystem))​(long initialPendingRequests,  [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Probe that implements `Publisher` interface and tracks demand. |
	| `static <T> long` | `[probe$default$1](#probe$default$1())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestPublisher
		
		
		
		```
		public TestPublisher()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static <T> org.reactivestreams.Publisher<T> empty()
		```
		
		Publisher that signals complete to subscribers, after handing a void subscription.
		- #### lazyEmpty
		
		
		
		```
		public static <T> org.reactivestreams.Publisher<T> lazyEmpty()
		```
		
		Publisher that subscribes the subscriber and completes after the first request.
		- #### error
		
		
		
		```
		public static <T> org.reactivestreams.Publisher<T> error​(java.lang.Throwable cause)
		```
		
		Publisher that signals error to subscribers immediately after handing out subscription.
		- #### lazyError
		
		
		
		```
		public static <T> org.reactivestreams.Publisher<T> lazyError​(java.lang.Throwable cause)
		```
		
		Publisher that subscribes the subscriber and signals error after the first request.
		- #### manualProbe
		
		
		
		```
		public static <T> [TestPublisher.ManualProbe](TestPublisher.ManualProbe.html "class in akka.stream.testkit")<T> manualProbe​(boolean autoOnSubscribe,
		                                                           [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Probe that implements `Publisher` interface.
		- #### manualProbe$default$1
		
		
		
		```
		public static <T> boolean manualProbe$default$1()
		```
		- #### probe
		
		
		
		```
		public static <T> [TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<T> probe​(long initialPendingRequests,
		                                               [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Probe that implements `Publisher` interface and tracks demand.
		- #### probe$default$1
		
		
		
		```
		public static <T> long probe$default$1()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.CancelSubscription$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.CancelSubscription.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.ManualProbe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.ManualProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.Probe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.Probe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.PublisherEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.RequestMore$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.RequestMore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.Subscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.Subscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.SubscriptionDone$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.html)*