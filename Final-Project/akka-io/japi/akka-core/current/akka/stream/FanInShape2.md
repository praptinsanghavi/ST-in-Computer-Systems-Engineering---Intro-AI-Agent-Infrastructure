---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:00:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape2.html
title: FanInShape2
---

# FanInShape2

## Content

Package [akka.stream](package-summary.html)
## Class FanInShape2\<T0,​T1,​O\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanInShape](FanInShape.html "class in akka.stream")\<O\>
		- - akka.stream.FanInShape2\<T0,​T1,​O\>

- ---

```
public class FanInShape2<T0,​T1,​O>
extends [FanInShape](FanInShape.html "class in akka.stream")<O>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanInShape](FanInShape.html "class in akka.stream")
		
		
		`[FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape.Init.html "type parameter in FanInShape.Init")>, [FanInShape.Name](FanInShape.Name.html "class in akka.stream")<[O](FanInShape.Name.html "type parameter in FanInShape.Name")>, [FanInShape.Name$](FanInShape.Name$.html "class in akka.stream"), [FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")>, [FanInShape.Ports$](FanInShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FanInShape2](#%3Cinit%3E(akka.stream.FanInShape.Init))​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")> _init)` |  |
	| `[FanInShape2](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape2.html "type parameter in FanInShape2")> in0,  [Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape2.html "type parameter in FanInShape2")> in1,  [Outlet](Outlet.html "class in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")> out)` |  |
	| `[FanInShape2](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")>` | `[construct](#construct(akka.stream.FanInShape.Init))​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")> init)` |  |
	| `[FanInShape2](FanInShape2.html "class in akka.stream")<[T0](FanInShape2.html "type parameter in FanInShape2"),​[T1](FanInShape2.html "type parameter in FanInShape2"),​[O](FanInShape2.html "type parameter in FanInShape2")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape2.html "type parameter in FanInShape2")>` | `[in0](#in0())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape2.html "type parameter in FanInShape2")>` | `[in1](#in1())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanInShape](FanInShape.html "class in akka.stream")
		
		
		`[inlets](FanInShape.html#inlets()), [newInlet](FanInShape.html#newInlet(java.lang.String)), [out](FanInShape.html#out()), [outlets](FanInShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FanInShape2
		
		
		
		```
		public FanInShape2​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")> _init)
		```
		- #### FanInShape2
		
		
		
		```
		public FanInShape2​(java.lang.String name)
		```
		- #### FanInShape2
		
		
		
		```
		public FanInShape2​([Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape2.html "type parameter in FanInShape2")> in0,
		                   [Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape2.html "type parameter in FanInShape2")> in1,
		                   [Outlet](Outlet.html "class in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")> out)
		```

	- ### Method Detail
	
	
	
		- #### construct
		
		
		
		```
		protected [FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")> construct​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")> init)
		```
		
		
		Specified by:
		`[construct](FanInShape.html#construct(akka.stream.FanInShape.Init))` in class `[FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")>`
		- #### deepCopy
		
		
		
		```
		public [FanInShape2](FanInShape2.html "class in akka.stream")<[T0](FanInShape2.html "type parameter in FanInShape2"),​[T1](FanInShape2.html "type parameter in FanInShape2"),​[O](FanInShape2.html "type parameter in FanInShape2")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanInShape.html#deepCopy())` in class `[FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape2.html "type parameter in FanInShape2")>`
		- #### in0
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape2.html "type parameter in FanInShape2")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape2.html "type parameter in FanInShape2")> in1()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape.Init.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape.Name$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape.Name.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape.Ports$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape.Ports.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape2.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape2.html](https://doc.akka.io/japi/akka-core/current/akka/stream/FanInShape2.html)*