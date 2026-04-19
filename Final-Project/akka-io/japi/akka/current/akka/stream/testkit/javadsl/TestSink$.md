---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/testkit/javadsl/TestSink$.html
title: TestSink$
---

# TestSink$

## Content

Package [akka.stream.testkit.javadsl](package-summary.html)
## Class TestSink$

- java.lang.Object
- - akka.stream.testkit.javadsl.TestSink$

- ---

```
public class TestSink$
extends java.lang.Object
```

Java API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestSink$](TestSink$.html "class in akka.stream.testkit.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestSink$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[TestSubscriber.Probe](../TestSubscriber.Probe.html "class in akka.stream.testkit")<T>>` | `[create](#create(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | A Sink that materialized to a [`TestSubscriber.Probe`](../TestSubscriber.Probe.html "class in akka.stream.testkit"). |
	| `<T> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[TestSubscriber.Probe](../TestSubscriber.Probe.html "class in akka.stream.testkit")<T>>` | `[probe](#probe(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use \`TestSink.create\` with ClassicActorSystemProvider instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestSink$](TestSink$.html "class in akka.stream.testkit.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestSink$
		
		
		
		```
		public TestSink$()
		```

	- ### Method Detail
	
	
	
		- #### probe
		
		
		
		```
		public <T> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[TestSubscriber.Probe](../TestSubscriber.Probe.html "class in akka.stream.testkit")<T>> probe​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use \`TestSink.create\` with ClassicActorSystemProvider instead. Since 2\.7\.0\.
		
		A Sink that materialized to a [`TestSubscriber.Probe`](../TestSubscriber.Probe.html "class in akka.stream.testkit").
		- #### create
		
		
		
		```
		public <T> [Sink](../../javadsl/Sink.html "class in akka.stream.javadsl")<T,​[TestSubscriber.Probe](../TestSubscriber.Probe.html "class in akka.stream.testkit")<T>> create​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		A Sink that materialized to a [`TestSubscriber.Probe`](../TestSubscriber.Probe.html "class in akka.stream.testkit").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestSubscriber.Probe.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/javadsl/TestSink$.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/testkit/javadsl/TestSink$.html](https://doc.akka.io/japi/akka/current/akka/stream/testkit/javadsl/TestSink$.html)*