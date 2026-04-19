---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestPublisher$.html
title: TestPublisher$
---

# TestPublisher$

## Content

Package [akka.stream.testkit](package-summary.html)
## Class TestPublisher$

- java.lang.Object
- - akka.stream.testkit.TestPublisher$

- ---

```
public class TestPublisher$
extends java.lang.Object
```

Provides factory methods for various Publishers.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestPublisher$](TestPublisher$.html "class in akka.stream.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestPublisher$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> org.reactivestreams.Publisher<T>` | `[empty](#empty())()` | Publisher that signals complete to subscribers, after handing a void subscription. |
	| `<T> org.reactivestreams.Publisher<T>` | `[error](#error(java.lang.Throwable))​(java.lang.Throwable cause)` | Publisher that signals error to subscribers immediately after handing out subscription. |
	| `<T> org.reactivestreams.Publisher<T>` | `[lazyEmpty](#lazyEmpty())()` | Publisher that subscribes the subscriber and completes after the first request. |
	| `<T> org.reactivestreams.Publisher<T>` | `[lazyError](#lazyError(java.lang.Throwable))​(java.lang.Throwable cause)` | Publisher that subscribes the subscriber and signals error after the first request. |
	| `<T> [TestPublisher.ManualProbe](TestPublisher.ManualProbe.html "class in akka.stream.testkit")<T>` | `[manualProbe](#manualProbe(boolean,akka.actor.ActorSystem))​(boolean autoOnSubscribe,  [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Probe that implements `Publisher` interface. |
	| `<T> boolean` | `[manualProbe$default$1](#manualProbe$default$1())()` |  |
	| `<T> [TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<T>` | `[probe](#probe(long,akka.actor.ActorSystem))​(long initialPendingRequests,  [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Probe that implements `Publisher` interface and tracks demand. |
	| `<T> long` | `[probe$default$1](#probe$default$1())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestPublisher$](TestPublisher$.html "class in akka.stream.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestPublisher$
		
		
		
		```
		public TestPublisher$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public <T> org.reactivestreams.Publisher<T> empty()
		```
		
		Publisher that signals complete to subscribers, after handing a void subscription.
		- #### lazyEmpty
		
		
		
		```
		public <T> org.reactivestreams.Publisher<T> lazyEmpty()
		```
		
		Publisher that subscribes the subscriber and completes after the first request.
		- #### error
		
		
		
		```
		public <T> org.reactivestreams.Publisher<T> error​(java.lang.Throwable cause)
		```
		
		Publisher that signals error to subscribers immediately after handing out subscription.
		- #### lazyError
		
		
		
		```
		public <T> org.reactivestreams.Publisher<T> lazyError​(java.lang.Throwable cause)
		```
		
		Publisher that subscribes the subscriber and signals error after the first request.
		- #### manualProbe
		
		
		
		```
		public <T> [TestPublisher.ManualProbe](TestPublisher.ManualProbe.html "class in akka.stream.testkit")<T> manualProbe​(boolean autoOnSubscribe,
		                                                    [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Probe that implements `Publisher` interface.
		- #### manualProbe$default$1
		
		
		
		```
		public <T> boolean manualProbe$default$1()
		```
		- #### probe
		
		
		
		```
		public <T> [TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<T> probe​(long initialPendingRequests,
		                                        [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Probe that implements `Publisher` interface and tracks demand.
		- #### probe$default$1
		
		
		
		```
		public <T> long probe$default$1()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestPublisher$.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestPublisher.ManualProbe.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestPublisher.Probe.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestPublisher$.html](https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestPublisher$.html)*