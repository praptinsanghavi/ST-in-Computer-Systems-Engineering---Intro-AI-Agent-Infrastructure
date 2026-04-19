---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:27:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape22.html
title: FanOutShape22
---

# FanOutShape22

## Content

Package [akka.stream](package-summary.html)
## Class FanOutShape22\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16,​O17,​O18,​O19,​O20,​O21\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanOutShape](FanOutShape.html "class in akka.stream")\<I\>
		- - akka.stream.FanOutShape22\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16,​O17,​O18,​O19,​O20,​O21\>

- ---

```
public class FanOutShape22<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16,​O17,​O18,​O19,​O20,​O21>
extends [FanOutShape](FanOutShape.html "class in akka.stream")<I>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape.Init.html "type parameter in FanOutShape.Init")>, [FanOutShape.Name](FanOutShape.Name.html "class in akka.stream")<[I](FanOutShape.Name.html "type parameter in FanOutShape.Name")>, [FanOutShape.Name$](FanOutShape.Name$.html "class in akka.stream"), [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>, [FanOutShape.Ports$](FanOutShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FanOutShape22](#%3Cinit%3E(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")> _init)` |  |
	| `[FanOutShape22](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")> in,  [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape22.html "type parameter in FanOutShape22")> out0,  [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape22.html "type parameter in FanOutShape22")> out1,  [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape22.html "type parameter in FanOutShape22")> out2,  [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape22.html "type parameter in FanOutShape22")> out3,  [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape22.html "type parameter in FanOutShape22")> out4,  [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape22.html "type parameter in FanOutShape22")> out5,  [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape22.html "type parameter in FanOutShape22")> out6,  [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape22.html "type parameter in FanOutShape22")> out7,  [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape22.html "type parameter in FanOutShape22")> out8,  [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape22.html "type parameter in FanOutShape22")> out9,  [Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape22.html "type parameter in FanOutShape22")> out10,  [Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape22.html "type parameter in FanOutShape22")> out11,  [Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape22.html "type parameter in FanOutShape22")> out12,  [Outlet](Outlet.html "class in akka.stream")<[O13](FanOutShape22.html "type parameter in FanOutShape22")> out13,  [Outlet](Outlet.html "class in akka.stream")<[O14](FanOutShape22.html "type parameter in FanOutShape22")> out14,  [Outlet](Outlet.html "class in akka.stream")<[O15](FanOutShape22.html "type parameter in FanOutShape22")> out15,  [Outlet](Outlet.html "class in akka.stream")<[O16](FanOutShape22.html "type parameter in FanOutShape22")> out16,  [Outlet](Outlet.html "class in akka.stream")<[O17](FanOutShape22.html "type parameter in FanOutShape22")> out17,  [Outlet](Outlet.html "class in akka.stream")<[O18](FanOutShape22.html "type parameter in FanOutShape22")> out18,  [Outlet](Outlet.html "class in akka.stream")<[O19](FanOutShape22.html "type parameter in FanOutShape22")> out19,  [Outlet](Outlet.html "class in akka.stream")<[O20](FanOutShape22.html "type parameter in FanOutShape22")> out20,  [Outlet](Outlet.html "class in akka.stream")<[O21](FanOutShape22.html "type parameter in FanOutShape22")> out21)` |  |
	| `[FanOutShape22](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")>` | `[construct](#construct(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")> init)` |  |
	| `[FanOutShape22](FanOutShape22.html "class in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22"),​[O0](FanOutShape22.html "type parameter in FanOutShape22"),​[O1](FanOutShape22.html "type parameter in FanOutShape22"),​[O2](FanOutShape22.html "type parameter in FanOutShape22"),​[O3](FanOutShape22.html "type parameter in FanOutShape22"),​[O4](FanOutShape22.html "type parameter in FanOutShape22"),​[O5](FanOutShape22.html "type parameter in FanOutShape22"),​[O6](FanOutShape22.html "type parameter in FanOutShape22"),​[O7](FanOutShape22.html "type parameter in FanOutShape22"),​[O8](FanOutShape22.html "type parameter in FanOutShape22"),​[O9](FanOutShape22.html "type parameter in FanOutShape22"),​[O10](FanOutShape22.html "type parameter in FanOutShape22"),​[O11](FanOutShape22.html "type parameter in FanOutShape22"),​[O12](FanOutShape22.html "type parameter in FanOutShape22"),​[O13](FanOutShape22.html "type parameter in FanOutShape22"),​[O14](FanOutShape22.html "type parameter in FanOutShape22"),​[O15](FanOutShape22.html "type parameter in FanOutShape22"),​[O16](FanOutShape22.html "type parameter in FanOutShape22"),​[O17](FanOutShape22.html "type parameter in FanOutShape22"),​[O18](FanOutShape22.html "type parameter in FanOutShape22"),​[O19](FanOutShape22.html "type parameter in FanOutShape22"),​[O20](FanOutShape22.html "type parameter in FanOutShape22"),​[O21](FanOutShape22.html "type parameter in FanOutShape22")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out0](#out0())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out1](#out1())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out10](#out10())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out11](#out11())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out12](#out12())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O13](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out13](#out13())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O14](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out14](#out14())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O15](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out15](#out15())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O16](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out16](#out16())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O17](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out17](#out17())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O18](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out18](#out18())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O19](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out19](#out19())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out2](#out2())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O20](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out20](#out20())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O21](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out21](#out21())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out3](#out3())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out4](#out4())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out5](#out5())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out6](#out6())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out7](#out7())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out8](#out8())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape22.html "type parameter in FanOutShape22")>` | `[out9](#out9())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[in](FanOutShape.html#in()), [inlets](FanOutShape.html#inlets()), [newOutlet](FanOutShape.html#newOutlet(java.lang.String)), [outlets](FanOutShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FanOutShape22
		
		
		
		```
		public FanOutShape22​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")> _init)
		```
		- #### FanOutShape22
		
		
		
		```
		public FanOutShape22​(java.lang.String name)
		```
		- #### FanOutShape22
		
		
		
		```
		public FanOutShape22​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")> in,
		                     [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape22.html "type parameter in FanOutShape22")> out0,
		                     [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape22.html "type parameter in FanOutShape22")> out1,
		                     [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape22.html "type parameter in FanOutShape22")> out2,
		                     [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape22.html "type parameter in FanOutShape22")> out3,
		                     [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape22.html "type parameter in FanOutShape22")> out4,
		                     [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape22.html "type parameter in FanOutShape22")> out5,
		                     [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape22.html "type parameter in FanOutShape22")> out6,
		                     [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape22.html "type parameter in FanOutShape22")> out7,
		                     [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape22.html "type parameter in FanOutShape22")> out8,
		                     [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape22.html "type parameter in FanOutShape22")> out9,
		                     [Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape22.html "type parameter in FanOutShape22")> out10,
		                     [Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape22.html "type parameter in FanOutShape22")> out11,
		                     [Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape22.html "type parameter in FanOutShape22")> out12,
		                     [Outlet](Outlet.html "class in akka.stream")<[O13](FanOutShape22.html "type parameter in FanOutShape22")> out13,
		                     [Outlet](Outlet.html "class in akka.stream")<[O14](FanOutShape22.html "type parameter in FanOutShape22")> out14,
		                     [Outlet](Outlet.html "class in akka.stream")<[O15](FanOutShape22.html "type parameter in FanOutShape22")> out15,
		                     [Outlet](Outlet.html "class in akka.stream")<[O16](FanOutShape22.html "type parameter in FanOutShape22")> out16,
		                     [Outlet](Outlet.html "class in akka.stream")<[O17](FanOutShape22.html "type parameter in FanOutShape22")> out17,
		                     [Outlet](Outlet.html "class in akka.stream")<[O18](FanOutShape22.html "type parameter in FanOutShape22")> out18,
		                     [Outlet](Outlet.html "class in akka.stream")<[O19](FanOutShape22.html "type parameter in FanOutShape22")> out19,
		                     [Outlet](Outlet.html "class in akka.stream")<[O20](FanOutShape22.html "type parameter in FanOutShape22")> out20,
		                     [Outlet](Outlet.html "class in akka.stream")<[O21](FanOutShape22.html "type parameter in FanOutShape22")> out21)
		```

	- ### Method Detail
	
	
	
		- #### construct
		
		
		
		```
		protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")> construct​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")> init)
		```
		
		
		Specified by:
		`[construct](FanOutShape.html#construct(akka.stream.FanOutShape.Init))` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")>`
		- #### deepCopy
		
		
		
		```
		public [FanOutShape22](FanOutShape22.html "class in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22"),​[O0](FanOutShape22.html "type parameter in FanOutShape22"),​[O1](FanOutShape22.html "type parameter in FanOutShape22"),​[O2](FanOutShape22.html "type parameter in FanOutShape22"),​[O3](FanOutShape22.html "type parameter in FanOutShape22"),​[O4](FanOutShape22.html "type parameter in FanOutShape22"),​[O5](FanOutShape22.html "type parameter in FanOutShape22"),​[O6](FanOutShape22.html "type parameter in FanOutShape22"),​[O7](FanOutShape22.html "type parameter in FanOutShape22"),​[O8](FanOutShape22.html "type parameter in FanOutShape22"),​[O9](FanOutShape22.html "type parameter in FanOutShape22"),​[O10](FanOutShape22.html "type parameter in FanOutShape22"),​[O11](FanOutShape22.html "type parameter in FanOutShape22"),​[O12](FanOutShape22.html "type parameter in FanOutShape22"),​[O13](FanOutShape22.html "type parameter in FanOutShape22"),​[O14](FanOutShape22.html "type parameter in FanOutShape22"),​[O15](FanOutShape22.html "type parameter in FanOutShape22"),​[O16](FanOutShape22.html "type parameter in FanOutShape22"),​[O17](FanOutShape22.html "type parameter in FanOutShape22"),​[O18](FanOutShape22.html "type parameter in FanOutShape22"),​[O19](FanOutShape22.html "type parameter in FanOutShape22"),​[O20](FanOutShape22.html "type parameter in FanOutShape22"),​[O21](FanOutShape22.html "type parameter in FanOutShape22")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanOutShape.html#deepCopy())` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](FanOutShape22.html "type parameter in FanOutShape22")>`
		- #### out0
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O0](FanOutShape22.html "type parameter in FanOutShape22")> out0()
		```
		- #### out1
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O1](FanOutShape22.html "type parameter in FanOutShape22")> out1()
		```
		- #### out10
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O10](FanOutShape22.html "type parameter in FanOutShape22")> out10()
		```
		- #### out11
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O11](FanOutShape22.html "type parameter in FanOutShape22")> out11()
		```
		- #### out12
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O12](FanOutShape22.html "type parameter in FanOutShape22")> out12()
		```
		- #### out13
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O13](FanOutShape22.html "type parameter in FanOutShape22")> out13()
		```
		- #### out14
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O14](FanOutShape22.html "type parameter in FanOutShape22")> out14()
		```
		- #### out15
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O15](FanOutShape22.html "type parameter in FanOutShape22")> out15()
		```
		- #### out16
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O16](FanOutShape22.html "type parameter in FanOutShape22")> out16()
		```
		- #### out17
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O17](FanOutShape22.html "type parameter in FanOutShape22")> out17()
		```
		- #### out18
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O18](FanOutShape22.html "type parameter in FanOutShape22")> out18()
		```
		- #### out19
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O19](FanOutShape22.html "type parameter in FanOutShape22")> out19()
		```
		- #### out2
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O2](FanOutShape22.html "type parameter in FanOutShape22")> out2()
		```
		- #### out20
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O20](FanOutShape22.html "type parameter in FanOutShape22")> out20()
		```
		- #### out21
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O21](FanOutShape22.html "type parameter in FanOutShape22")> out21()
		```
		- #### out3
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O3](FanOutShape22.html "type parameter in FanOutShape22")> out3()
		```
		- #### out4
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O4](FanOutShape22.html "type parameter in FanOutShape22")> out4()
		```
		- #### out5
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O5](FanOutShape22.html "type parameter in FanOutShape22")> out5()
		```
		- #### out6
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O6](FanOutShape22.html "type parameter in FanOutShape22")> out6()
		```
		- #### out7
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O7](FanOutShape22.html "type parameter in FanOutShape22")> out7()
		```
		- #### out8
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O8](FanOutShape22.html "type parameter in FanOutShape22")> out8()
		```
		- #### out9
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O9](FanOutShape22.html "type parameter in FanOutShape22")> out9()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape.Init.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape.Name$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape.Name.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape.Ports$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape.Ports.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape22.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape22.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FanOutShape22.html)*