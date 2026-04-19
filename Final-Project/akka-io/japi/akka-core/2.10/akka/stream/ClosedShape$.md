---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape$.html
title: ClosedShape$
---

# ClosedShape$

## Content

Package [akka.stream](package-summary.html)
## Class ClosedShape$

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.ClosedShape](ClosedShape.html "class in akka.stream")
		- - akka.stream.ClosedShape$

- ---

```
public class ClosedShape$
extends [ClosedShape](ClosedShape.html "class in akka.stream")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClosedShape$](ClosedShape$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClosedShape$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClosedShape$](ClosedShape$.html "class in akka.stream")` | `[deepCopy](#deepCopy())()` |  |
	| `[ClosedShape](ClosedShape.html "class in akka.stream")` | `[getInstance](#getInstance())()` | Java API: obtain ClosedShape instance |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` |  |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[ClosedShape](ClosedShape.html "class in akka.stream")
		
		
		`[getInlets](ClosedShape.html#getInlets()), [getOutlets](ClosedShape.html#getOutlets()), [hasSamePortsAndShapeAs](ClosedShape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](ClosedShape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](ClosedShape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](ClosedShape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[deepCopy](Shape.html#deepCopy()), [getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [inlets](Shape.html#inlets()), [outlets](Shape.html#outlets()), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClosedShape$](ClosedShape$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClosedShape$
		
		
		
		```
		public ClosedShape$()
		```

	- ### Method Detail
	
	
	
		- #### inlets
		
		
		
		```
		public scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets()
		```
		
		
		Overrides:
		`[inlets](ClosedShape.html#inlets())` in class `[ClosedShape](ClosedShape.html "class in akka.stream")`
		- #### outlets
		
		
		
		```
		public scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets()
		```
		
		
		Overrides:
		`[outlets](ClosedShape.html#outlets())` in class `[ClosedShape](ClosedShape.html "class in akka.stream")`
		- #### deepCopy
		
		
		
		```
		public [ClosedShape$](ClosedShape$.html "class in akka.stream") deepCopy()
		```
		
		
		Overrides:
		`[deepCopy](ClosedShape.html#deepCopy())` in class `[ClosedShape](ClosedShape.html "class in akka.stream")`
		- #### getInstance
		
		
		
		```
		public [ClosedShape](ClosedShape.html "class in akka.stream") getInstance()
		```
		
		Java API: obtain ClosedShape instance
		
		Overrides:
		`[getInstance](ClosedShape.html#getInstance())` in class `[ClosedShape](ClosedShape.html "class in akka.stream")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](ClosedShape.html#toString())` in class `[ClosedShape](ClosedShape.html "class in akka.stream")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape$.html)*