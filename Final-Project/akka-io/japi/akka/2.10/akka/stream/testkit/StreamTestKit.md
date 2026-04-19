---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:02:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.ProbeSource.html
title: StreamTestKit.ProbeSource
---

# StreamTestKit.ProbeSource

## Content

Package [akka.stream.testkit](package-summary.html)
## Class StreamTestKit.ProbeSource\<T\>

- java.lang.Object
- - akka.stream.impl.SourceModule\<T,​[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")\<T\>\>
	- - akka.stream.testkit.StreamTestKit.ProbeSource\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<T>>`, `akka.stream.impl.StreamLayout.AtomicModule<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<T>>`

Enclosing class:
[StreamTestKit](StreamTestKit.html "class in akka.stream.testkit")

---

```
public static final class StreamTestKit.ProbeSource<T>
extends akka.stream.impl.SourceModule<T,​[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<T>>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProbeSource](#%3Cinit%3E(akka.stream.Attributes,akka.stream.SourceShape,akka.actor.ActorSystem))​([Attributes](../Attributes.html "class in akka.stream") attributes,  [SourceShape](../SourceShape.html "class in akka.stream")<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource")> shape,  [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[attributes](#attributes())()` |  |
	| `scala.Tuple2<[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource")>,​[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource")>>` | `[create](#create(akka.stream.MaterializationContext))​(akka.stream.MaterializationContext context)` |  |
	| `akka.stream.impl.SourceModule<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource"),​[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource")>>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Replace the attributes of this `Flow` with the given ones. |
	
	
		- ### Methods inherited from class akka.stream.impl.SourceModule
		
		
		`addAttributes, amendShape, async, async, async, getAttributes, label, named, shape, toString, traversalBuilder`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ProbeSource
		
		
		
		```
		public ProbeSource​([Attributes](../Attributes.html "class in akka.stream") attributes,
		                   [SourceShape](../SourceShape.html "class in akka.stream")<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource")> shape,
		                   [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### attributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") attributes()
		```
		
		
		Specified by:
		`attributes` in class `akka.stream.impl.SourceModule<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource"),​[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource")>>`
		- #### create
		
		
		
		```
		public scala.Tuple2<[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource")>,​[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource")>> create​(akka.stream.MaterializationContext context)
		```
		- #### withAttributes
		
		
		
		```
		public akka.stream.impl.SourceModule<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource"),​[TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")<[T](StreamTestKit.ProbeSource.html "type parameter in StreamTestKit.ProbeSource")>> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Description copied from interface: `[Graph](../Graph.html#withAttributes(akka.stream.Attributes))`
		Replace the attributes of this `Flow` with the given ones. If this Flow is a composite
		 of multiple graphs, new attributes on the composite will be less specific than attributes
		 set directly on the individual graphs of the composite.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.ProbeSource.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.Probe.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.ProbeSource.html](https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.ProbeSource.html)*