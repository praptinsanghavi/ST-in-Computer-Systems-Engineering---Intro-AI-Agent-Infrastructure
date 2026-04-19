---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape2.html
title: FanOutShape2
---

# FanOutShape2

## Content

Package [akka.stream](package-summary.html)
## Class FanOutShape2\<I,​O0,​O1\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanOutShape](FanOutShape.html "class in akka.stream")\<I\>
		- - akka.stream.FanOutShape2\<I,​O0,​O1\>

- ---

```
public class FanOutShape2<I,​O0,​O1>
extends [FanOutShape](FanOutShape.html "class in akka.stream")<I>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape.Init.html "type parameter in FanOutShape.Init")>, [FanOutShape.Name](FanOutShape.Name.html "class in akka.stream")<[I](FanOutShape.Name.html "type parameter in FanOutShape.Name")>, [FanOutShape.Name$](FanOutShape.Name$.html "class in akka.stream"), [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>, [FanOutShape.Ports$](FanOutShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FanOutShape2](#%3Cinit%3E(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")> _init)` |  |
	| `[FanOutShape2](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")> in,  [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape2.html "type parameter in FanOutShape2")> out0,  [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape2.html "type parameter in FanOutShape2")> out1)` |  |
	| `[FanOutShape2](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")>` | `[construct](#construct(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")> init)` |  |
	| `[FanOutShape2](FanOutShape2.html "class in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2"),​[O0](FanOutShape2.html "type parameter in FanOutShape2"),​[O1](FanOutShape2.html "type parameter in FanOutShape2")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape2.html "type parameter in FanOutShape2")>` | `[out0](#out0())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape2.html "type parameter in FanOutShape2")>` | `[out1](#out1())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[in](FanOutShape.html#in()), [inlets](FanOutShape.html#inlets()), [newOutlet](FanOutShape.html#newOutlet(java.lang.String)), [outlets](FanOutShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FanOutShape2
		
		
		
		```
		public FanOutShape2​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")> _init)
		```
		- #### FanOutShape2
		
		
		
		```
		public FanOutShape2​(java.lang.String name)
		```
		- #### FanOutShape2
		
		
		
		```
		public FanOutShape2​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")> in,
		                    [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape2.html "type parameter in FanOutShape2")> out0,
		                    [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape2.html "type parameter in FanOutShape2")> out1)
		```

	- ### Method Detail
	
	
	
		- #### construct
		
		
		
		```
		protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")> construct​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")> init)
		```
		
		
		Specified by:
		`[construct](FanOutShape.html#construct(akka.stream.FanOutShape.Init))` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")>`
		- #### deepCopy
		
		
		
		```
		public [FanOutShape2](FanOutShape2.html "class in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2"),​[O0](FanOutShape2.html "type parameter in FanOutShape2"),​[O1](FanOutShape2.html "type parameter in FanOutShape2")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanOutShape.html#deepCopy())` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape2.html "type parameter in FanOutShape2")>`
		- #### out0
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape2.html "type parameter in FanOutShape2")> out0()
		```
		- #### out1
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape2.html "type parameter in FanOutShape2")> out1()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Init.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Name$.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Name.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Ports$.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Ports.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape2.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape2.html](https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape2.html)*