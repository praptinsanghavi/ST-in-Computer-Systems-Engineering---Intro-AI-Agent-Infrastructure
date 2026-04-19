---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:21:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape.html
title: ClosedShape
---

# ClosedShape

## Content

Package [akka.stream](package-summary.html)
## Class ClosedShape

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - akka.stream.ClosedShape

- Direct Known Subclasses:
`[ClosedShape$](ClosedShape$.html "class in akka.stream")`

---

```
public abstract class ClosedShape
extends [Shape](Shape.html "class in akka.stream")
```

This [`Shape`](Shape.html "class in akka.stream") is used for graphs that have neither open inputs nor open
 outputs. Only such a [`Graph`](Graph.html "interface in akka.stream") can be materialized by a [`Materializer`](Materializer.html "class in akka.stream").

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClosedShape](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ClosedShape$](ClosedShape$.html "class in akka.stream")` | `[deepCopy](#deepCopy())()` |  |
	| `static java.util.List<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[getInlets](#getInlets())()` |  |
	| `static [ClosedShape](ClosedShape.html "class in akka.stream")` | `[getInstance](#getInstance())()` | Java API: obtain ClosedShape instance |
	| `static java.util.List<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[getOutlets](#getOutlets())()` |  |
	| `static boolean` | `[hasSamePortsAndShapeAs](#hasSamePortsAndShapeAs(akka.stream.Shape))​([Shape](Shape.html "class in akka.stream") s)` |  |
	| `static boolean` | `[hasSamePortsAs](#hasSamePortsAs(akka.stream.Shape))​([Shape](Shape.html "class in akka.stream") s)` |  |
	| `static scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` |  |
	| `static scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` |  |
	| `static void` | `[requireSamePortsAndShapeAs](#requireSamePortsAndShapeAs(akka.stream.Shape))​([Shape](Shape.html "class in akka.stream") s)` |  |
	| `static void` | `[requireSamePortsAs](#requireSamePortsAs(akka.stream.Shape))​([Shape](Shape.html "class in akka.stream") s)` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[deepCopy](Shape.html#deepCopy()), [getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [inlets](Shape.html#inlets()), [outlets](Shape.html#outlets()), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClosedShape
		
		
		
		```
		public ClosedShape()
		```

	- ### Method Detail
	
	
	
		- #### inlets
		
		
		
		```
		public static scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets()
		```
		- #### outlets
		
		
		
		```
		public static scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets()
		```
		- #### deepCopy
		
		
		
		```
		public static [ClosedShape$](ClosedShape$.html "class in akka.stream") deepCopy()
		```
		- #### getInstance
		
		
		
		```
		public static [ClosedShape](ClosedShape.html "class in akka.stream") getInstance()
		```
		
		Java API: obtain ClosedShape instance
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### getInlets
		
		
		
		```
		public static java.util.List<[Inlet](Inlet.html "class in akka.stream")<?>> getInlets()
		```
		- #### getOutlets
		
		
		
		```
		public static java.util.List<[Outlet](Outlet.html "class in akka.stream")<?>> getOutlets()
		```
		- #### hasSamePortsAs
		
		
		
		```
		public static boolean hasSamePortsAs​([Shape](Shape.html "class in akka.stream") s)
		```
		- #### hasSamePortsAndShapeAs
		
		
		
		```
		public static boolean hasSamePortsAndShapeAs​([Shape](Shape.html "class in akka.stream") s)
		```
		- #### requireSamePortsAs
		
		
		
		```
		public static void requireSamePortsAs​([Shape](Shape.html "class in akka.stream") s)
		```
		- #### requireSamePortsAndShapeAs
		
		
		
		```
		public static void requireSamePortsAndShapeAs​([Shape](Shape.html "class in akka.stream") s)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape.html)*