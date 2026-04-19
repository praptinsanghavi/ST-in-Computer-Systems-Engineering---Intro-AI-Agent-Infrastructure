---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.html
title: TestSubscriber
---

# TestSubscriber

## Content

Package [akka.stream.testkit](package-summary.html)
## Class TestSubscriber

- java.lang.Object
- - akka.stream.testkit.TestSubscriber

- ---

```
public class TestSubscriber
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[TestSubscriber.ManualProbe](TestSubscriber.ManualProbe.html "class in akka.stream.testkit")<[I](TestSubscriber.ManualProbe.html "type parameter in TestSubscriber.ManualProbe")>` | Implementation of `Subscriber` that allows various assertions. |
	| `static class` | `[TestSubscriber.ManualProbe$](TestSubscriber.ManualProbe$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestSubscriber.OnComplete$](TestSubscriber.OnComplete$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestSubscriber.OnError](TestSubscriber.OnError.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestSubscriber.OnError$](TestSubscriber.OnError$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestSubscriber.OnNext](TestSubscriber.OnNext.html "class in akka.stream.testkit")<[I](TestSubscriber.OnNext.html "type parameter in TestSubscriber.OnNext")>` |  |
	| `static class` | `[TestSubscriber.OnNext$](TestSubscriber.OnNext$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestSubscriber.OnSubscribe$](TestSubscriber.OnSubscribe$.html "class in akka.stream.testkit")` |  |
	| `static class` | `[TestSubscriber.Probe](TestSubscriber.Probe.html "class in akka.stream.testkit")<[T](TestSubscriber.Probe.html "type parameter in TestSubscriber.Probe")>` | Single subscription tracking for [`TestSubscriber.ManualProbe`](TestSubscriber.ManualProbe.html "class in akka.stream.testkit"). |
	| `static class` | `[TestSubscriber.Probe$](TestSubscriber.Probe$.html "class in akka.stream.testkit")` |  |
	| `static interface` | `[TestSubscriber.SubscriberEvent](TestSubscriber.SubscriberEvent.html "interface in akka.stream.testkit")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestSubscriber](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [TestSubscriber.ManualProbe](TestSubscriber.ManualProbe.html "class in akka.stream.testkit")<T>` | `[manualProbe](#manualProbe(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Probe that implements `Subscriber` interface. |
	| `static <T> [TestSubscriber.Probe](TestSubscriber.Probe.html "class in akka.stream.testkit")<T>` | `[probe](#probe(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestSubscriber
		
		
		
		```
		public TestSubscriber()
		```

	- ### Method Detail
	
	
	
		- #### manualProbe
		
		
		
		```
		public static <T> [TestSubscriber.ManualProbe](TestSubscriber.ManualProbe.html "class in akka.stream.testkit")<T> manualProbe​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Probe that implements `Subscriber` interface.
		- #### probe
		
		
		
		```
		public static <T> [TestSubscriber.Probe](TestSubscriber.Probe.html "class in akka.stream.testkit")<T> probe​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.ManualProbe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.ManualProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.OnComplete$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.OnError$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.OnError.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.OnNext$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.OnNext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.OnSubscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.OnSubscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.Probe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.Probe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.SubscriberEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestSubscriber.html)*