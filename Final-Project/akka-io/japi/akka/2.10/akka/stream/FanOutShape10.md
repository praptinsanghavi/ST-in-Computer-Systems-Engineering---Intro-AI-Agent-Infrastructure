---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:02:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape10.html
title: FanOutShape10
---

# FanOutShape10

## Content

Package [akka.stream](package-summary.html)
## Class FanOutShape10\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanOutShape](FanOutShape.html "class in akka.stream")\<I\>
		- - akka.stream.FanOutShape10\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9\>

- ---

```
public class FanOutShape10<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9>
extends [FanOutShape](FanOutShape.html "class in akka.stream")<I>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape.Init.html "type parameter in FanOutShape.Init")>, [FanOutShape.Name](FanOutShape.Name.html "class in akka.stream")<[I](FanOutShape.Name.html "type parameter in FanOutShape.Name")>, [FanOutShape.Name$](FanOutShape.Name$.html "class in akka.stream"), [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>, [FanOutShape.Ports$](FanOutShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FanOutShape10](#%3Cinit%3E(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")> _init)` |  |
	| `[FanOutShape10](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")> in,  [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape10.html "type parameter in FanOutShape10")> out0,  [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape10.html "type parameter in FanOutShape10")> out1,  [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape10.html "type parameter in FanOutShape10")> out2,  [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape10.html "type parameter in FanOutShape10")> out3,  [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape10.html "type parameter in FanOutShape10")> out4,  [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape10.html "type parameter in FanOutShape10")> out5,  [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape10.html "type parameter in FanOutShape10")> out6,  [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape10.html "type parameter in FanOutShape10")> out7,  [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape10.html "type parameter in FanOutShape10")> out8,  [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape10.html "type parameter in FanOutShape10")> out9)` |  |
	| `[FanOutShape10](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")>` | `[construct](#construct(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")> init)` |  |
	| `[FanOutShape10](FanOutShape10.html "class in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10"),​[O0](FanOutShape10.html "type parameter in FanOutShape10"),​[O1](FanOutShape10.html "type parameter in FanOutShape10"),​[O2](FanOutShape10.html "type parameter in FanOutShape10"),​[O3](FanOutShape10.html "type parameter in FanOutShape10"),​[O4](FanOutShape10.html "type parameter in FanOutShape10"),​[O5](FanOutShape10.html "type parameter in FanOutShape10"),​[O6](FanOutShape10.html "type parameter in FanOutShape10"),​[O7](FanOutShape10.html "type parameter in FanOutShape10"),​[O8](FanOutShape10.html "type parameter in FanOutShape10"),​[O9](FanOutShape10.html "type parameter in FanOutShape10")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out0](#out0())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out1](#out1())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out2](#out2())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out3](#out3())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out4](#out4())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out5](#out5())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out6](#out6())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out7](#out7())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out8](#out8())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape10.html "type parameter in FanOutShape10")>` | `[out9](#out9())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[in](FanOutShape.html#in()), [inlets](FanOutShape.html#inlets()), [newOutlet](FanOutShape.html#newOutlet(java.lang.String)), [outlets](FanOutShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FanOutShape10
		
		
		
		```
		public FanOutShape10​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")> _init)
		```
		- #### FanOutShape10
		
		
		
		```
		public FanOutShape10​(java.lang.String name)
		```
		- #### FanOutShape10
		
		
		
		```
		public FanOutShape10​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")> in,
		                     [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape10.html "type parameter in FanOutShape10")> out0,
		                     [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape10.html "type parameter in FanOutShape10")> out1,
		                     [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape10.html "type parameter in FanOutShape10")> out2,
		                     [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape10.html "type parameter in FanOutShape10")> out3,
		                     [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape10.html "type parameter in FanOutShape10")> out4,
		                     [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape10.html "type parameter in FanOutShape10")> out5,
		                     [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape10.html "type parameter in FanOutShape10")> out6,
		                     [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape10.html "type parameter in FanOutShape10")> out7,
		                     [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape10.html "type parameter in FanOutShape10")> out8,
		                     [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape10.html "type parameter in FanOutShape10")> out9)
		```

	- ### Method Detail
	
	
	
		- #### construct
		
		
		
		```
		protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")> construct​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")> init)
		```
		
		
		Specified by:
		`[construct](FanOutShape.html#construct(akka.stream.FanOutShape.Init))` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")>`
		- #### deepCopy
		
		
		
		```
		public [FanOutShape10](FanOutShape10.html "class in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10"),​[O0](FanOutShape10.html "type parameter in FanOutShape10"),​[O1](FanOutShape10.html "type parameter in FanOutShape10"),​[O2](FanOutShape10.html "type parameter in FanOutShape10"),​[O3](FanOutShape10.html "type parameter in FanOutShape10"),​[O4](FanOutShape10.html "type parameter in FanOutShape10"),​[O5](FanOutShape10.html "type parameter in FanOutShape10"),​[O6](FanOutShape10.html "type parameter in FanOutShape10"),​[O7](FanOutShape10.html "type parameter in FanOutShape10"),​[O8](FanOutShape10.html "type parameter in FanOutShape10"),​[O9](FanOutShape10.html "type parameter in FanOutShape10")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanOutShape.html#deepCopy())` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape10.html "type parameter in FanOutShape10")>`
		- #### out0
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape10.html "type parameter in FanOutShape10")> out0()
		```
		- #### out1
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape10.html "type parameter in FanOutShape10")> out1()
		```
		- #### out2
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape10.html "type parameter in FanOutShape10")> out2()
		```
		- #### out3
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape10.html "type parameter in FanOutShape10")> out3()
		```
		- #### out4
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape10.html "type parameter in FanOutShape10")> out4()
		```
		- #### out5
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape10.html "type parameter in FanOutShape10")> out5()
		```
		- #### out6
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape10.html "type parameter in FanOutShape10")> out6()
		```
		- #### out7
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape10.html "type parameter in FanOutShape10")> out7()
		```
		- #### out8
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape10.html "type parameter in FanOutShape10")> out8()
		```
		- #### out9
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape10.html "type parameter in FanOutShape10")> out9()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Init.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Name$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Name.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Ports$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Ports.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape10.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape10.html](https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape10.html)*