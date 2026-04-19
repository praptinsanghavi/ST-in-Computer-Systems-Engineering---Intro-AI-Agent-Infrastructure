---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/TestSink.html
title: TestSink
---

# TestSink

## Content

Package [akka.stream.testkit.scaladsl](package-summary.html)
## Class TestSink

- java.lang.Object
- - akka.stream.testkit.scaladsl.TestSink

- ---

```
public class TestSink
extends java.lang.Object
```

Factory methods for test sinks.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestSink](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Sink](../../scaladsl/Sink.html "class in akka.stream.scaladsl")<T,​[TestSubscriber.Probe](../TestSubscriber.Probe.html "class in akka.stream.testkit")<T>>` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | A Sink that materialized to a [`TestSubscriber.Probe`](../TestSubscriber.Probe.html "class in akka.stream.testkit"). |
	| `static <T> [Sink](../../scaladsl/Sink.html "class in akka.stream.scaladsl")<T,​[TestSubscriber.Probe](../TestSubscriber.Probe.html "class in akka.stream.testkit")<T>>` | `[probe](#probe(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use \`TestSink()\` with implicit ClassicActorSystemProvider instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestSink
		
		
		
		```
		public TestSink()
		```

	- ### Method Detail
	
	
	
		- #### probe
		
		
		
		```
		public static <T> [Sink](../../scaladsl/Sink.html "class in akka.stream.scaladsl")<T,​[TestSubscriber.Probe](../TestSubscriber.Probe.html "class in akka.stream.testkit")<T>> probe​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use \`TestSink()\` with implicit ClassicActorSystemProvider instead. Since 2\.7\.0\.
		
		A Sink that materialized to a [`TestSubscriber.Probe`](../TestSubscriber.Probe.html "class in akka.stream.testkit").
		- #### apply
		
		
		
		```
		public static <T> [Sink](../../scaladsl/Sink.html "class in akka.stream.scaladsl")<T,​[TestSubscriber.Probe](../TestSubscriber.Probe.html "class in akka.stream.testkit")<T>> apply​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		A Sink that materialized to a [`TestSubscriber.Probe`](../TestSubscriber.Probe.html "class in akka.stream.testkit").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSubscriber.Probe.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/TestSink.html](https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/TestSink.html)*