---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:51:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/TestSource.html
title: TestSource
---

# TestSource

## Content

Package [akka.stream.testkit.javadsl](package-summary.html)
## Class TestSource

- java.lang.Object
- - akka.stream.testkit.javadsl.TestSource

- ---

```
public class TestSource
extends java.lang.Object
```

Java API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestSource](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[TestPublisher.Probe](../TestPublisher.Probe.html "class in akka.stream.testkit")<T>>` | `[create](#create(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | A Source that materializes to a [`TestPublisher.Probe`](../TestPublisher.Probe.html "class in akka.stream.testkit"). |
	| `static <T> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[TestPublisher.Probe](../TestPublisher.Probe.html "class in akka.stream.testkit")<T>>` | `[probe](#probe(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use \`TestSource.create\` with ClassicActorSystemProvider instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestSource
		
		
		
		```
		public TestSource()
		```

	- ### Method Detail
	
	
	
		- #### probe
		
		
		
		```
		public static <T> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[TestPublisher.Probe](../TestPublisher.Probe.html "class in akka.stream.testkit")<T>> probe​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use \`TestSource.create\` with ClassicActorSystemProvider instead. Since 2\.7\.0\.
		
		A Source that materializes to a [`TestPublisher.Probe`](../TestPublisher.Probe.html "class in akka.stream.testkit").
		- #### create
		
		
		
		```
		public static <T> [Source](../../javadsl/Source.html "class in akka.stream.javadsl")<T,​[TestPublisher.Probe](../TestPublisher.Probe.html "class in akka.stream.testkit")<T>> create​([ClassicActorSystemProvider](../../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		A Source that materializes to a [`TestPublisher.Probe`](../TestPublisher.Probe.html "class in akka.stream.testkit").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/TestPublisher.Probe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/TestSource.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/TestSource.html)*