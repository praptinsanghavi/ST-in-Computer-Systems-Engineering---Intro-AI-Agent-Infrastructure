---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/AbstractShape.html
title: AbstractShape
---

# AbstractShape

## Content

Package [akka.stream](package-summary.html)
## Class AbstractShape

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - akka.stream.AbstractShape

- ---

```
public abstract class AbstractShape
extends [Shape](Shape.html "class in akka.stream")
```

Java API for creating custom [`Shape`](Shape.html "class in akka.stream") types.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractShape](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract java.util.List<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[allInlets](#allInlets())()` | Provide the list of all input ports of this shape. |
	| `abstract java.util.List<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[allOutlets](#allOutlets())()` | Provide the list of all output ports of this shape. |
	| `java.util.List<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[getInlets](#getInlets())()` | Java API: get a list of all input ports |
	| `java.util.List<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[getOutlets](#getOutlets())()` | Java API: get a list of all output ports |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` | Scala API: get a list of all input ports |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` | Scala API: get a list of all output ports |
	
	
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[deepCopy](Shape.html#deepCopy()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AbstractShape
		
		
		
		```
		public AbstractShape()
		```

	- ### Method Detail
	
	
	
		- #### allInlets
		
		
		
		```
		public abstract java.util.List<[Inlet](Inlet.html "class in akka.stream")<?>> allInlets()
		```
		
		Provide the list of all input ports of this shape.
		- #### allOutlets
		
		
		
		```
		public abstract java.util.List<[Outlet](Outlet.html "class in akka.stream")<?>> allOutlets()
		```
		
		Provide the list of all output ports of this shape.
		- #### getInlets
		
		
		
		```
		public final java.util.List<[Inlet](Inlet.html "class in akka.stream")<?>> getInlets()
		```
		
		Description copied from class: `[Shape](Shape.html#getInlets())`
		Java API: get a list of all input ports
		
		Overrides:
		`[getInlets](Shape.html#getInlets())` in class `[Shape](Shape.html "class in akka.stream")`
		- #### getOutlets
		
		
		
		```
		public final java.util.List<[Outlet](Outlet.html "class in akka.stream")<?>> getOutlets()
		```
		
		Description copied from class: `[Shape](Shape.html#getOutlets())`
		Java API: get a list of all output ports
		
		Overrides:
		`[getOutlets](Shape.html#getOutlets())` in class `[Shape](Shape.html "class in akka.stream")`
		- #### inlets
		
		
		
		```
		public final scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets()
		```
		
		Description copied from class: `[Shape](Shape.html#inlets())`
		Scala API: get a list of all input ports
		
		Specified by:
		`[inlets](Shape.html#inlets())` in class `[Shape](Shape.html "class in akka.stream")`
		- #### outlets
		
		
		
		```
		public final scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets()
		```
		
		Description copied from class: `[Shape](Shape.html#outlets())`
		Scala API: get a list of all output ports
		
		Specified by:
		`[outlets](Shape.html#outlets())` in class `[Shape](Shape.html "class in akka.stream")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/AbstractShape.html](https://doc.akka.io/japi/akka/current/akka/stream/AbstractShape.html)*