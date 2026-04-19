---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:55:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/StreamTestKit.PublisherProbeSubscription.html
title: StreamTestKit.PublisherProbeSubscription
---

# StreamTestKit.PublisherProbeSubscription

## Content

Package [akka.stream.testkit](package-summary.html)
## Class StreamTestKit.PublisherProbeSubscription\<I\>

- java.lang.Object
- - akka.stream.testkit.StreamTestKit.PublisherProbeSubscription\<I\>

- All Implemented Interfaces:
`[SubscriptionWithCancelException](../SubscriptionWithCancelException.html "interface in akka.stream")`, `java.io.Serializable`, `org.reactivestreams.Subscription`, `scala.Equals`, `scala.Product`

Enclosing class:
[StreamTestKit](StreamTestKit.html "class in akka.stream.testkit")

---

```
public static final class StreamTestKit.PublisherProbeSubscription<I>
extends java.lang.Object
implements org.reactivestreams.Subscription, [SubscriptionWithCancelException](../SubscriptionWithCancelException.html "interface in akka.stream"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.testkit.StreamTestKit.PublisherProbeSubscription)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[SubscriptionWithCancelException](../SubscriptionWithCancelException.html "interface in akka.stream")
		
		
		`[SubscriptionWithCancelException.NoMoreElementsNeeded$](../SubscriptionWithCancelException.NoMoreElementsNeeded$.html "class in akka.stream"), [SubscriptionWithCancelException.NonFailureCancellation](../SubscriptionWithCancelException.NonFailureCancellation.html "class in akka.stream"), [SubscriptionWithCancelException.StageWasCompleted$](../SubscriptionWithCancelException.StageWasCompleted$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PublisherProbeSubscription](#%3Cinit%3E(org.reactivestreams.Subscriber,akka.testkit.TestProbe))​(org.reactivestreams.Subscriber<? super [I](StreamTestKit.PublisherProbeSubscription.html "type parameter in StreamTestKit.PublisherProbeSubscription")> subscriber,  [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") publisherProbe)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cancel](#cancel(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<I> [StreamTestKit.PublisherProbeSubscription](StreamTestKit.PublisherProbeSubscription.html "class in akka.stream.testkit")<I>` | `[copy](#copy(org.reactivestreams.Subscriber,akka.testkit.TestProbe))​(org.reactivestreams.Subscriber<? super I> subscriber,  [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") publisherProbe)` |  |
	| `<I> org.reactivestreams.Subscriber<? super I>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<I> [TestProbe](../../testkit/TestProbe.html "class in akka.testkit")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[expectCancellation](#expectCancellation())()` |  |
	| `long` | `[expectRequest](#expectRequest())()` |  |
	| `void` | `[expectRequest](#expectRequest(long))​(long n)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[TestProbe](../../testkit/TestProbe.html "class in akka.testkit")` | `[publisherProbe](#publisherProbe())()` |  |
	| `void` | `[request](#request(long))​(long elements)` |  |
	| `void` | `[sendComplete](#sendComplete())()` |  |
	| `void` | `[sendError](#sendError(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `void` | `[sendNext](#sendNext(I))​([I](StreamTestKit.PublisherProbeSubscription.html "type parameter in StreamTestKit.PublisherProbeSubscription") element)` |  |
	| `void` | `[sendOnSubscribe](#sendOnSubscribe())()` |  |
	| `org.reactivestreams.Subscriber<? super [I](StreamTestKit.PublisherProbeSubscription.html "type parameter in StreamTestKit.PublisherProbeSubscription")>` | `[subscriber](#subscriber())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.stream.[SubscriptionWithCancelException](../SubscriptionWithCancelException.html "interface in akka.stream")
		
		
		`[cancel](../SubscriptionWithCancelException.html#cancel())`

- - ### Constructor Detail
	
	
	
		- #### PublisherProbeSubscription
		
		
		
		```
		public PublisherProbeSubscription​(org.reactivestreams.Subscriber<? super [I](StreamTestKit.PublisherProbeSubscription.html "type parameter in StreamTestKit.PublisherProbeSubscription")> subscriber,
		                                  [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") publisherProbe)
		```

	- ### Method Detail
	
	
	
		- #### subscriber
		
		
		
		```
		public org.reactivestreams.Subscriber<? super [I](StreamTestKit.PublisherProbeSubscription.html "type parameter in StreamTestKit.PublisherProbeSubscription")> subscriber()
		```
		- #### publisherProbe
		
		
		
		```
		public [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") publisherProbe()
		```
		- #### request
		
		
		
		```
		public void request​(long elements)
		```
		
		
		Specified by:
		`request` in interface `org.reactivestreams.Subscription`
		- #### cancel
		
		
		
		```
		public void cancel​(java.lang.Throwable cause)
		```
		
		
		Specified by:
		`[cancel](../SubscriptionWithCancelException.html#cancel(java.lang.Throwable))` in interface `[SubscriptionWithCancelException](../SubscriptionWithCancelException.html "interface in akka.stream")`
		- #### expectRequest
		
		
		
		```
		public void expectRequest​(long n)
		```
		- #### expectRequest
		
		
		
		```
		public long expectRequest()
		```
		- #### expectCancellation
		
		
		
		```
		public java.lang.Throwable expectCancellation()
		```
		- #### sendNext
		
		
		
		```
		public void sendNext​([I](StreamTestKit.PublisherProbeSubscription.html "type parameter in StreamTestKit.PublisherProbeSubscription") element)
		```
		- #### sendComplete
		
		
		
		```
		public void sendComplete()
		```
		- #### sendError
		
		
		
		```
		public void sendError​(java.lang.Throwable cause)
		```
		- #### sendOnSubscribe
		
		
		
		```
		public void sendOnSubscribe()
		```
		- #### copy
		
		
		
		```
		public <I> [StreamTestKit.PublisherProbeSubscription](StreamTestKit.PublisherProbeSubscription.html "class in akka.stream.testkit")<I> copy​(org.reactivestreams.Subscriber<? super I> subscriber,
		                                                            [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") publisherProbe)
		```
		- #### copy$default$1
		
		
		
		```
		public <I> org.reactivestreams.Subscriber<? super I> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <I> [TestProbe](../../testkit/TestProbe.html "class in akka.testkit") copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubscriptionWithCancelException.NoMoreElementsNeeded$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubscriptionWithCancelException.NonFailureCancellation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubscriptionWithCancelException.StageWasCompleted$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SubscriptionWithCancelException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/StreamTestKit.PublisherProbeSubscription.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/StreamTestKit.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/StreamTestKit.PublisherProbeSubscription.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/StreamTestKit.PublisherProbeSubscription.html)*