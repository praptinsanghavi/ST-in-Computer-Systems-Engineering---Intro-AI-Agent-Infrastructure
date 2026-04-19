---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:02:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape17.html
title: FanOutShape17
---

# FanOutShape17

## Content

Package [akka.stream](package-summary.html)
## Class FanOutShape17\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanOutShape](FanOutShape.html "class in akka.stream")\<I\>
		- - akka.stream.FanOutShape17\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16\>

- ---

```
public class FanOutShape17<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16>
extends [FanOutShape](FanOutShape.html "class in akka.stream")<I>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape.Init.html "type parameter in FanOutShape.Init")>, [FanOutShape.Name](FanOutShape.Name.html "class in akka.stream")<[I](FanOutShape.Name.html "type parameter in FanOutShape.Name")>, [FanOutShape.Name$](FanOutShape.Name$.html "class in akka.stream"), [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>, [FanOutShape.Ports$](FanOutShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FanOutShape17](#%3Cinit%3E(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")> _init)` |  |
	| `[FanOutShape17](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")> in,  [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape17.html "type parameter in FanOutShape17")> out0,  [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape17.html "type parameter in FanOutShape17")> out1,  [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape17.html "type parameter in FanOutShape17")> out2,  [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape17.html "type parameter in FanOutShape17")> out3,  [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape17.html "type parameter in FanOutShape17")> out4,  [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape17.html "type parameter in FanOutShape17")> out5,  [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape17.html "type parameter in FanOutShape17")> out6,  [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape17.html "type parameter in FanOutShape17")> out7,  [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape17.html "type parameter in FanOutShape17")> out8,  [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape17.html "type parameter in FanOutShape17")> out9,  [Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape17.html "type parameter in FanOutShape17")> out10,  [Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape17.html "type parameter in FanOutShape17")> out11,  [Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape17.html "type parameter in FanOutShape17")> out12,  [Outlet](Outlet.html "class in akka.stream")<[O13](FanOutShape17.html "type parameter in FanOutShape17")> out13,  [Outlet](Outlet.html "class in akka.stream")<[O14](FanOutShape17.html "type parameter in FanOutShape17")> out14,  [Outlet](Outlet.html "class in akka.stream")<[O15](FanOutShape17.html "type parameter in FanOutShape17")> out15,  [Outlet](Outlet.html "class in akka.stream")<[O16](FanOutShape17.html "type parameter in FanOutShape17")> out16)` |  |
	| `[FanOutShape17](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")>` | `[construct](#construct(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")> init)` |  |
	| `[FanOutShape17](FanOutShape17.html "class in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17"),​[O0](FanOutShape17.html "type parameter in FanOutShape17"),​[O1](FanOutShape17.html "type parameter in FanOutShape17"),​[O2](FanOutShape17.html "type parameter in FanOutShape17"),​[O3](FanOutShape17.html "type parameter in FanOutShape17"),​[O4](FanOutShape17.html "type parameter in FanOutShape17"),​[O5](FanOutShape17.html "type parameter in FanOutShape17"),​[O6](FanOutShape17.html "type parameter in FanOutShape17"),​[O7](FanOutShape17.html "type parameter in FanOutShape17"),​[O8](FanOutShape17.html "type parameter in FanOutShape17"),​[O9](FanOutShape17.html "type parameter in FanOutShape17"),​[O10](FanOutShape17.html "type parameter in FanOutShape17"),​[O11](FanOutShape17.html "type parameter in FanOutShape17"),​[O12](FanOutShape17.html "type parameter in FanOutShape17"),​[O13](FanOutShape17.html "type parameter in FanOutShape17"),​[O14](FanOutShape17.html "type parameter in FanOutShape17"),​[O15](FanOutShape17.html "type parameter in FanOutShape17"),​[O16](FanOutShape17.html "type parameter in FanOutShape17")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out0](#out0())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out1](#out1())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out10](#out10())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out11](#out11())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out12](#out12())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O13](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out13](#out13())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O14](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out14](#out14())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O15](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out15](#out15())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O16](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out16](#out16())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out2](#out2())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out3](#out3())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out4](#out4())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out5](#out5())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out6](#out6())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out7](#out7())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out8](#out8())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape17.html "type parameter in FanOutShape17")>` | `[out9](#out9())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[in](FanOutShape.html#in()), [inlets](FanOutShape.html#inlets()), [newOutlet](FanOutShape.html#newOutlet(java.lang.String)), [outlets](FanOutShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FanOutShape17
		
		
		
		```
		public FanOutShape17​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")> _init)
		```
		- #### FanOutShape17
		
		
		
		```
		public FanOutShape17​(java.lang.String name)
		```
		- #### FanOutShape17
		
		
		
		```
		public FanOutShape17​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")> in,
		                     [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape17.html "type parameter in FanOutShape17")> out0,
		                     [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape17.html "type parameter in FanOutShape17")> out1,
		                     [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape17.html "type parameter in FanOutShape17")> out2,
		                     [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape17.html "type parameter in FanOutShape17")> out3,
		                     [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape17.html "type parameter in FanOutShape17")> out4,
		                     [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape17.html "type parameter in FanOutShape17")> out5,
		                     [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape17.html "type parameter in FanOutShape17")> out6,
		                     [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape17.html "type parameter in FanOutShape17")> out7,
		                     [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape17.html "type parameter in FanOutShape17")> out8,
		                     [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape17.html "type parameter in FanOutShape17")> out9,
		                     [Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape17.html "type parameter in FanOutShape17")> out10,
		                     [Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape17.html "type parameter in FanOutShape17")> out11,
		                     [Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape17.html "type parameter in FanOutShape17")> out12,
		                     [Outlet](Outlet.html "class in akka.stream")<[O13](FanOutShape17.html "type parameter in FanOutShape17")> out13,
		                     [Outlet](Outlet.html "class in akka.stream")<[O14](FanOutShape17.html "type parameter in FanOutShape17")> out14,
		                     [Outlet](Outlet.html "class in akka.stream")<[O15](FanOutShape17.html "type parameter in FanOutShape17")> out15,
		                     [Outlet](Outlet.html "class in akka.stream")<[O16](FanOutShape17.html "type parameter in FanOutShape17")> out16)
		```

	- ### Method Detail
	
	
	
		- #### construct
		
		
		
		```
		protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")> construct​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")> init)
		```
		
		
		Specified by:
		`[construct](FanOutShape.html#construct(akka.stream.FanOutShape.Init))` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")>`
		- #### deepCopy
		
		
		
		```
		public [FanOutShape17](FanOutShape17.html "class in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17"),​[O0](FanOutShape17.html "type parameter in FanOutShape17"),​[O1](FanOutShape17.html "type parameter in FanOutShape17"),​[O2](FanOutShape17.html "type parameter in FanOutShape17"),​[O3](FanOutShape17.html "type parameter in FanOutShape17"),​[O4](FanOutShape17.html "type parameter in FanOutShape17"),​[O5](FanOutShape17.html "type parameter in FanOutShape17"),​[O6](FanOutShape17.html "type parameter in FanOutShape17"),​[O7](FanOutShape17.html "type parameter in FanOutShape17"),​[O8](FanOutShape17.html "type parameter in FanOutShape17"),​[O9](FanOutShape17.html "type parameter in FanOutShape17"),​[O10](FanOutShape17.html "type parameter in FanOutShape17"),​[O11](FanOutShape17.html "type parameter in FanOutShape17"),​[O12](FanOutShape17.html "type parameter in FanOutShape17"),​[O13](FanOutShape17.html "type parameter in FanOutShape17"),​[O14](FanOutShape17.html "type parameter in FanOutShape17"),​[O15](FanOutShape17.html "type parameter in FanOutShape17"),​[O16](FanOutShape17.html "type parameter in FanOutShape17")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanOutShape.html#deepCopy())` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape17.html "type parameter in FanOutShape17")>`
		- #### out0
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape17.html "type parameter in FanOutShape17")> out0()
		```
		- #### out1
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape17.html "type parameter in FanOutShape17")> out1()
		```
		- #### out10
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape17.html "type parameter in FanOutShape17")> out10()
		```
		- #### out11
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape17.html "type parameter in FanOutShape17")> out11()
		```
		- #### out12
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape17.html "type parameter in FanOutShape17")> out12()
		```
		- #### out13
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O13](FanOutShape17.html "type parameter in FanOutShape17")> out13()
		```
		- #### out14
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O14](FanOutShape17.html "type parameter in FanOutShape17")> out14()
		```
		- #### out15
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O15](FanOutShape17.html "type parameter in FanOutShape17")> out15()
		```
		- #### out16
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O16](FanOutShape17.html "type parameter in FanOutShape17")> out16()
		```
		- #### out2
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape17.html "type parameter in FanOutShape17")> out2()
		```
		- #### out3
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape17.html "type parameter in FanOutShape17")> out3()
		```
		- #### out4
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape17.html "type parameter in FanOutShape17")> out4()
		```
		- #### out5
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape17.html "type parameter in FanOutShape17")> out5()
		```
		- #### out6
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape17.html "type parameter in FanOutShape17")> out6()
		```
		- #### out7
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape17.html "type parameter in FanOutShape17")> out7()
		```
		- #### out8
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape17.html "type parameter in FanOutShape17")> out8()
		```
		- #### out9
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape17.html "type parameter in FanOutShape17")> out9()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Init.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Name$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Name.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Ports$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.Ports.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape17.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape17.html](https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape17.html)*