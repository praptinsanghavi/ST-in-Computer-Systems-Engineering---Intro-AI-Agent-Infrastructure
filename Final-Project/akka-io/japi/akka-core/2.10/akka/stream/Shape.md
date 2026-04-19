---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
title: Shape
---

# Shape

## Content

Package [akka.stream](package-summary.html)
## Class Shape

- java.lang.Object
- - akka.stream.Shape

- Direct Known Subclasses:
`[AbstractShape](AbstractShape.html "class in akka.stream")`, `[AmorphousShape](AmorphousShape.html "class in akka.stream")`, `[BidiShape](BidiShape.html "class in akka.stream")`, `[ClosedShape](ClosedShape.html "class in akka.stream")`, `[FanInShape](FanInShape.html "class in akka.stream")`, `[FanOutShape](FanOutShape.html "class in akka.stream")`, `[FlowShape](FlowShape.html "class in akka.stream")`, `[SinkShape](SinkShape.html "class in akka.stream")`, `[SourceShape](SourceShape.html "class in akka.stream")`

---

```
public abstract class Shape
extends java.lang.Object
```

A Shape describes the inlets and outlets of a [`Graph`](Graph.html "interface in akka.stream"). In keeping with the
 philosophy that a Graph is a freely reusable blueprint, everything that
 matters from the outside are the connections that can be made with it,
 otherwise it is just a black box.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Shape](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [Shape](Shape.html "class in akka.stream")` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `java.util.List<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[getInlets](#getInlets())()` | Java API: get a list of all input ports |
	| `java.util.List<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[getOutlets](#getOutlets())()` | Java API: get a list of all output ports |
	| `static boolean` | `[hasOnePort](#hasOnePort(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<?> ports)` | `inlets` and `outlets` can be `Vector` or `List` so this method  checks the size of 1 in an optimized way. |
	| `boolean` | `[hasSamePortsAndShapeAs](#hasSamePortsAndShapeAs(akka.stream.Shape))​([Shape](Shape.html "class in akka.stream") s)` | Compare this to another shape and determine whether the arrangement of ports is the same (including their ordering). |
	| `boolean` | `[hasSamePortsAs](#hasSamePortsAs(akka.stream.Shape))​([Shape](Shape.html "class in akka.stream") s)` | Compare this to another shape and determine whether the set of ports is the same (ignoring their ordering). |
	| `abstract scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` | Scala API: get a list of all input ports |
	| `abstract scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` | Scala API: get a list of all output ports |
	| `void` | `[requireSamePortsAndShapeAs](#requireSamePortsAndShapeAs(akka.stream.Shape))​([Shape](Shape.html "class in akka.stream") s)` | Asserting version of [`hasSamePortsAndShapeAs(akka.stream.Shape)`](#hasSamePortsAndShapeAs(akka.stream.Shape)). |
	| `void` | `[requireSamePortsAs](#requireSamePortsAs(akka.stream.Shape))​([Shape](Shape.html "class in akka.stream") s)` | Asserting version of [`hasSamePortsAs(akka.stream.Shape)`](#hasSamePortsAs(akka.stream.Shape)). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Shape
		
		
		
		```
		public Shape()
		```

	- ### Method Detail
	
	
	
		- #### hasOnePort
		
		
		
		```
		public static boolean hasOnePort​(scala.collection.immutable.Seq<?> ports)
		```
		
		`inlets` and `outlets` can be `Vector` or `List` so this method
		 checks the size of 1 in an optimized way.
		- #### inlets
		
		
		
		```
		public abstract scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets()
		```
		
		Scala API: get a list of all input ports
		- #### outlets
		
		
		
		```
		public abstract scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets()
		```
		
		Scala API: get a list of all output ports
		- #### deepCopy
		
		
		
		```
		public abstract [Shape](Shape.html "class in akka.stream") deepCopy()
		```
		
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		- #### getInlets
		
		
		
		```
		public java.util.List<[Inlet](Inlet.html "class in akka.stream")<?>> getInlets()
		```
		
		Java API: get a list of all input ports
		- #### getOutlets
		
		
		
		```
		public java.util.List<[Outlet](Outlet.html "class in akka.stream")<?>> getOutlets()
		```
		
		Java API: get a list of all output ports
		- #### hasSamePortsAs
		
		
		
		```
		public boolean hasSamePortsAs​([Shape](Shape.html "class in akka.stream") s)
		```
		
		Compare this to another shape and determine whether the set of ports is the same (ignoring their ordering).
		- #### hasSamePortsAndShapeAs
		
		
		
		```
		public boolean hasSamePortsAndShapeAs​([Shape](Shape.html "class in akka.stream") s)
		```
		
		Compare this to another shape and determine whether the arrangement of ports is the same (including their ordering).
		- #### requireSamePortsAs
		
		
		
		```
		public void requireSamePortsAs​([Shape](Shape.html "class in akka.stream") s)
		```
		
		Asserting version of [`hasSamePortsAs(akka.stream.Shape)`](#hasSamePortsAs(akka.stream.Shape)).
		- #### requireSamePortsAndShapeAs
		
		
		
		```
		public void requireSamePortsAndShapeAs​([Shape](Shape.html "class in akka.stream") s)
		```
		
		Asserting version of [`hasSamePortsAndShapeAs(akka.stream.Shape)`](#hasSamePortsAndShapeAs(akka.stream.Shape)).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AbstractShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AmorphousShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/BidiShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html)*