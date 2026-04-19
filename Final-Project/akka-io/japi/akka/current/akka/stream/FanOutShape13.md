---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:46:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape13.html
title: FanOutShape13
---

# FanOutShape13

## Content

Package [akka.stream](package-summary.html)
## Class FanOutShape13\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanOutShape](FanOutShape.html "class in akka.stream")\<I\>
		- - akka.stream.FanOutShape13\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12\>

- ---

```
public class FanOutShape13<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12>
extends [FanOutShape](FanOutShape.html "class in akka.stream")<I>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape.Init.html "type parameter in FanOutShape.Init")>, [FanOutShape.Name](FanOutShape.Name.html "class in akka.stream")<[I](FanOutShape.Name.html "type parameter in FanOutShape.Name")>, [FanOutShape.Name$](FanOutShape.Name$.html "class in akka.stream"), [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>, [FanOutShape.Ports$](FanOutShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FanOutShape13](#%3Cinit%3E(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")> _init)` |  |
	| `[FanOutShape13](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")> in,  [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape13.html "type parameter in FanOutShape13")> out0,  [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape13.html "type parameter in FanOutShape13")> out1,  [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape13.html "type parameter in FanOutShape13")> out2,  [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape13.html "type parameter in FanOutShape13")> out3,  [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape13.html "type parameter in FanOutShape13")> out4,  [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape13.html "type parameter in FanOutShape13")> out5,  [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape13.html "type parameter in FanOutShape13")> out6,  [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape13.html "type parameter in FanOutShape13")> out7,  [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape13.html "type parameter in FanOutShape13")> out8,  [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape13.html "type parameter in FanOutShape13")> out9,  [Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape13.html "type parameter in FanOutShape13")> out10,  [Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape13.html "type parameter in FanOutShape13")> out11,  [Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape13.html "type parameter in FanOutShape13")> out12)` |  |
	| `[FanOutShape13](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")>` | `[construct](#construct(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")> init)` |  |
	| `[FanOutShape13](FanOutShape13.html "class in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13"),​[O0](FanOutShape13.html "type parameter in FanOutShape13"),​[O1](FanOutShape13.html "type parameter in FanOutShape13"),​[O2](FanOutShape13.html "type parameter in FanOutShape13"),​[O3](FanOutShape13.html "type parameter in FanOutShape13"),​[O4](FanOutShape13.html "type parameter in FanOutShape13"),​[O5](FanOutShape13.html "type parameter in FanOutShape13"),​[O6](FanOutShape13.html "type parameter in FanOutShape13"),​[O7](FanOutShape13.html "type parameter in FanOutShape13"),​[O8](FanOutShape13.html "type parameter in FanOutShape13"),​[O9](FanOutShape13.html "type parameter in FanOutShape13"),​[O10](FanOutShape13.html "type parameter in FanOutShape13"),​[O11](FanOutShape13.html "type parameter in FanOutShape13"),​[O12](FanOutShape13.html "type parameter in FanOutShape13")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out0](#out0())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out1](#out1())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out10](#out10())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out11](#out11())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out12](#out12())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out2](#out2())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out3](#out3())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out4](#out4())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out5](#out5())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out6](#out6())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out7](#out7())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out8](#out8())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape13.html "type parameter in FanOutShape13")>` | `[out9](#out9())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[in](FanOutShape.html#in()), [inlets](FanOutShape.html#inlets()), [newOutlet](FanOutShape.html#newOutlet(java.lang.String)), [outlets](FanOutShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FanOutShape13
		
		
		
		```
		public FanOutShape13​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")> _init)
		```
		- #### FanOutShape13
		
		
		
		```
		public FanOutShape13​(java.lang.String name)
		```
		- #### FanOutShape13
		
		
		
		```
		public FanOutShape13​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")> in,
		                     [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape13.html "type parameter in FanOutShape13")> out0,
		                     [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape13.html "type parameter in FanOutShape13")> out1,
		                     [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape13.html "type parameter in FanOutShape13")> out2,
		                     [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape13.html "type parameter in FanOutShape13")> out3,
		                     [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape13.html "type parameter in FanOutShape13")> out4,
		                     [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape13.html "type parameter in FanOutShape13")> out5,
		                     [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape13.html "type parameter in FanOutShape13")> out6,
		                     [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape13.html "type parameter in FanOutShape13")> out7,
		                     [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape13.html "type parameter in FanOutShape13")> out8,
		                     [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape13.html "type parameter in FanOutShape13")> out9,
		                     [Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape13.html "type parameter in FanOutShape13")> out10,
		                     [Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape13.html "type parameter in FanOutShape13")> out11,
		                     [Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape13.html "type parameter in FanOutShape13")> out12)
		```

	- ### Method Detail
	
	
	
		- #### construct
		
		
		
		```
		protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")> construct​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")> init)
		```
		
		
		Specified by:
		`[construct](FanOutShape.html#construct(akka.stream.FanOutShape.Init))` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")>`
		- #### deepCopy
		
		
		
		```
		public [FanOutShape13](FanOutShape13.html "class in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13"),​[O0](FanOutShape13.html "type parameter in FanOutShape13"),​[O1](FanOutShape13.html "type parameter in FanOutShape13"),​[O2](FanOutShape13.html "type parameter in FanOutShape13"),​[O3](FanOutShape13.html "type parameter in FanOutShape13"),​[O4](FanOutShape13.html "type parameter in FanOutShape13"),​[O5](FanOutShape13.html "type parameter in FanOutShape13"),​[O6](FanOutShape13.html "type parameter in FanOutShape13"),​[O7](FanOutShape13.html "type parameter in FanOutShape13"),​[O8](FanOutShape13.html "type parameter in FanOutShape13"),​[O9](FanOutShape13.html "type parameter in FanOutShape13"),​[O10](FanOutShape13.html "type parameter in FanOutShape13"),​[O11](FanOutShape13.html "type parameter in FanOutShape13"),​[O12](FanOutShape13.html "type parameter in FanOutShape13")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanOutShape.html#deepCopy())` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape13.html "type parameter in FanOutShape13")>`
		- #### out0
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape13.html "type parameter in FanOutShape13")> out0()
		```
		- #### out1
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape13.html "type parameter in FanOutShape13")> out1()
		```
		- #### out10
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape13.html "type parameter in FanOutShape13")> out10()
		```
		- #### out11
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape13.html "type parameter in FanOutShape13")> out11()
		```
		- #### out12
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape13.html "type parameter in FanOutShape13")> out12()
		```
		- #### out2
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape13.html "type parameter in FanOutShape13")> out2()
		```
		- #### out3
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape13.html "type parameter in FanOutShape13")> out3()
		```
		- #### out4
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape13.html "type parameter in FanOutShape13")> out4()
		```
		- #### out5
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape13.html "type parameter in FanOutShape13")> out5()
		```
		- #### out6
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape13.html "type parameter in FanOutShape13")> out6()
		```
		- #### out7
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape13.html "type parameter in FanOutShape13")> out7()
		```
		- #### out8
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape13.html "type parameter in FanOutShape13")> out8()
		```
		- #### out9
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape13.html "type parameter in FanOutShape13")> out9()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Init.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Name$.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Name.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Ports$.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.Ports.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape13.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape13.html](https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape13.html)*