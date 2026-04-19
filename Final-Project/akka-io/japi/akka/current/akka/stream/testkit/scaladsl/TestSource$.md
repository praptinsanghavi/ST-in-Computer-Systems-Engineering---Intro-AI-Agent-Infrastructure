---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:47:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/TestSource$.html
title: TestSource$
---

# TestSource$

## Content

Package [akka.stream.testkit.scaladsl](package-summary.html)
## Class TestSource$

- java.lang.Object
- - akka.stream.testkit.scaladsl.TestSource$

- ---

```
public class TestSource$
extends java.lang.Object
```

Factory methods for test sources.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestSource$](TestSource$.html "class in akka.stream.testkit.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestSource$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T> [Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[TestPublisher.Probe](../TestPublisher.Probe.html "class in akka.stream.testkit")<T>>` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | A Source that materializes to a [`TestPublisher.Probe`](../TestPublisher.Probe.html "class in akka.stream.testkit"). |
	| `<T> [Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[TestPublisher.Probe](../TestPublisher.Probe.html "class in akka.stream.testkit")<T>>` | `[probe](#probe(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use \`TestSource()\` with implicit ClassicActorSystemProvider instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestSource$](TestSource$.html "class in akka.stream.testkit.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestSource$
		
		
		
		```
		public TestSource$()
		```

	- ### Method Detail
	
	
	
		- #### probe
		
		
		
		```
		public <T> [Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[TestPublisher.Probe](../TestPublisher.Probe.html "class in akka.stream.testkit")<T>> probe​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use \`TestSource()\` with implicit ClassicActorSystemProvider instead. Since 2\.7\.0\.
		
		A Source that materializes to a [`TestPublisher.Probe`](../TestPublisher.Probe.html "class in akka.stream.testkit").
		- #### apply
		
		
		
		```
		public <T> [Source](../../scaladsl/Source.html "class in akka.stream.scaladsl")<T,​[TestPublisher.Probe](../TestPublisher.Probe.html "class in akka.stream.testkit")<T>> apply​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		A Source that materializes to a [`TestPublisher.Probe`](../TestPublisher.Probe.html "class in akka.stream.testkit").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/TestPublisher.Probe.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/TestSource$.html
- https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/TestSource$.html](https://doc.akka.io/japi/akka/current/akka/stream/testkit/scaladsl/TestSource$.html)*