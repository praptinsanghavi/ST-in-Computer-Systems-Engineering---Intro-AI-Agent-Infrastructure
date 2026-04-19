---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:46:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/FanInShape17.html
title: FanInShape17
---

# FanInShape17

## Content

Package [akka.stream](package-summary.html)
## Class FanInShape17\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​O\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanInShape](FanInShape.html "class in akka.stream")\<O\>
		- - akka.stream.FanInShape17\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​O\>

- ---

```
public class FanInShape17<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​O>
extends [FanInShape](FanInShape.html "class in akka.stream")<O>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanInShape](FanInShape.html "class in akka.stream")
		
		
		`[FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape.Init.html "type parameter in FanInShape.Init")>, [FanInShape.Name](FanInShape.Name.html "class in akka.stream")<[O](FanInShape.Name.html "type parameter in FanInShape.Name")>, [FanInShape.Name$](FanInShape.Name$.html "class in akka.stream"), [FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")>, [FanInShape.Ports$](FanInShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FanInShape17](#%3Cinit%3E(akka.stream.FanInShape.Init))​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")> _init)` |  |
	| `[FanInShape17](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape17.html "type parameter in FanInShape17")> in0,  [Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape17.html "type parameter in FanInShape17")> in1,  [Inlet](Inlet.html "class in akka.stream")<[T2](FanInShape17.html "type parameter in FanInShape17")> in2,  [Inlet](Inlet.html "class in akka.stream")<[T3](FanInShape17.html "type parameter in FanInShape17")> in3,  [Inlet](Inlet.html "class in akka.stream")<[T4](FanInShape17.html "type parameter in FanInShape17")> in4,  [Inlet](Inlet.html "class in akka.stream")<[T5](FanInShape17.html "type parameter in FanInShape17")> in5,  [Inlet](Inlet.html "class in akka.stream")<[T6](FanInShape17.html "type parameter in FanInShape17")> in6,  [Inlet](Inlet.html "class in akka.stream")<[T7](FanInShape17.html "type parameter in FanInShape17")> in7,  [Inlet](Inlet.html "class in akka.stream")<[T8](FanInShape17.html "type parameter in FanInShape17")> in8,  [Inlet](Inlet.html "class in akka.stream")<[T9](FanInShape17.html "type parameter in FanInShape17")> in9,  [Inlet](Inlet.html "class in akka.stream")<[T10](FanInShape17.html "type parameter in FanInShape17")> in10,  [Inlet](Inlet.html "class in akka.stream")<[T11](FanInShape17.html "type parameter in FanInShape17")> in11,  [Inlet](Inlet.html "class in akka.stream")<[T12](FanInShape17.html "type parameter in FanInShape17")> in12,  [Inlet](Inlet.html "class in akka.stream")<[T13](FanInShape17.html "type parameter in FanInShape17")> in13,  [Inlet](Inlet.html "class in akka.stream")<[T14](FanInShape17.html "type parameter in FanInShape17")> in14,  [Inlet](Inlet.html "class in akka.stream")<[T15](FanInShape17.html "type parameter in FanInShape17")> in15,  [Inlet](Inlet.html "class in akka.stream")<[T16](FanInShape17.html "type parameter in FanInShape17")> in16,  [Outlet](Outlet.html "class in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")> out)` |  |
	| `[FanInShape17](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")>` | `[construct](#construct(akka.stream.FanInShape.Init))​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")> init)` |  |
	| `[FanInShape17](FanInShape17.html "class in akka.stream")<[T0](FanInShape17.html "type parameter in FanInShape17"),​[T1](FanInShape17.html "type parameter in FanInShape17"),​[T2](FanInShape17.html "type parameter in FanInShape17"),​[T3](FanInShape17.html "type parameter in FanInShape17"),​[T4](FanInShape17.html "type parameter in FanInShape17"),​[T5](FanInShape17.html "type parameter in FanInShape17"),​[T6](FanInShape17.html "type parameter in FanInShape17"),​[T7](FanInShape17.html "type parameter in FanInShape17"),​[T8](FanInShape17.html "type parameter in FanInShape17"),​[T9](FanInShape17.html "type parameter in FanInShape17"),​[T10](FanInShape17.html "type parameter in FanInShape17"),​[T11](FanInShape17.html "type parameter in FanInShape17"),​[T12](FanInShape17.html "type parameter in FanInShape17"),​[T13](FanInShape17.html "type parameter in FanInShape17"),​[T14](FanInShape17.html "type parameter in FanInShape17"),​[T15](FanInShape17.html "type parameter in FanInShape17"),​[T16](FanInShape17.html "type parameter in FanInShape17"),​[O](FanInShape17.html "type parameter in FanInShape17")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape17.html "type parameter in FanInShape17")>` | `[in0](#in0())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape17.html "type parameter in FanInShape17")>` | `[in1](#in1())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T10](FanInShape17.html "type parameter in FanInShape17")>` | `[in10](#in10())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T11](FanInShape17.html "type parameter in FanInShape17")>` | `[in11](#in11())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T12](FanInShape17.html "type parameter in FanInShape17")>` | `[in12](#in12())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T13](FanInShape17.html "type parameter in FanInShape17")>` | `[in13](#in13())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T14](FanInShape17.html "type parameter in FanInShape17")>` | `[in14](#in14())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T15](FanInShape17.html "type parameter in FanInShape17")>` | `[in15](#in15())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T16](FanInShape17.html "type parameter in FanInShape17")>` | `[in16](#in16())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T2](FanInShape17.html "type parameter in FanInShape17")>` | `[in2](#in2())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T3](FanInShape17.html "type parameter in FanInShape17")>` | `[in3](#in3())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T4](FanInShape17.html "type parameter in FanInShape17")>` | `[in4](#in4())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T5](FanInShape17.html "type parameter in FanInShape17")>` | `[in5](#in5())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T6](FanInShape17.html "type parameter in FanInShape17")>` | `[in6](#in6())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T7](FanInShape17.html "type parameter in FanInShape17")>` | `[in7](#in7())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T8](FanInShape17.html "type parameter in FanInShape17")>` | `[in8](#in8())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T9](FanInShape17.html "type parameter in FanInShape17")>` | `[in9](#in9())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanInShape](FanInShape.html "class in akka.stream")
		
		
		`[inlets](FanInShape.html#inlets()), [newInlet](FanInShape.html#newInlet(java.lang.String)), [out](FanInShape.html#out()), [outlets](FanInShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FanInShape17
		
		
		
		```
		public FanInShape17​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")> _init)
		```
		- #### FanInShape17
		
		
		
		```
		public FanInShape17​(java.lang.String name)
		```
		- #### FanInShape17
		
		
		
		```
		public FanInShape17​([Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape17.html "type parameter in FanInShape17")> in0,
		                    [Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape17.html "type parameter in FanInShape17")> in1,
		                    [Inlet](Inlet.html "class in akka.stream")<[T2](FanInShape17.html "type parameter in FanInShape17")> in2,
		                    [Inlet](Inlet.html "class in akka.stream")<[T3](FanInShape17.html "type parameter in FanInShape17")> in3,
		                    [Inlet](Inlet.html "class in akka.stream")<[T4](FanInShape17.html "type parameter in FanInShape17")> in4,
		                    [Inlet](Inlet.html "class in akka.stream")<[T5](FanInShape17.html "type parameter in FanInShape17")> in5,
		                    [Inlet](Inlet.html "class in akka.stream")<[T6](FanInShape17.html "type parameter in FanInShape17")> in6,
		                    [Inlet](Inlet.html "class in akka.stream")<[T7](FanInShape17.html "type parameter in FanInShape17")> in7,
		                    [Inlet](Inlet.html "class in akka.stream")<[T8](FanInShape17.html "type parameter in FanInShape17")> in8,
		                    [Inlet](Inlet.html "class in akka.stream")<[T9](FanInShape17.html "type parameter in FanInShape17")> in9,
		                    [Inlet](Inlet.html "class in akka.stream")<[T10](FanInShape17.html "type parameter in FanInShape17")> in10,
		                    [Inlet](Inlet.html "class in akka.stream")<[T11](FanInShape17.html "type parameter in FanInShape17")> in11,
		                    [Inlet](Inlet.html "class in akka.stream")<[T12](FanInShape17.html "type parameter in FanInShape17")> in12,
		                    [Inlet](Inlet.html "class in akka.stream")<[T13](FanInShape17.html "type parameter in FanInShape17")> in13,
		                    [Inlet](Inlet.html "class in akka.stream")<[T14](FanInShape17.html "type parameter in FanInShape17")> in14,
		                    [Inlet](Inlet.html "class in akka.stream")<[T15](FanInShape17.html "type parameter in FanInShape17")> in15,
		                    [Inlet](Inlet.html "class in akka.stream")<[T16](FanInShape17.html "type parameter in FanInShape17")> in16,
		                    [Outlet](Outlet.html "class in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")> out)
		```

	- ### Method Detail
	
	
	
		- #### construct
		
		
		
		```
		protected [FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")> construct​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")> init)
		```
		
		
		Specified by:
		`[construct](FanInShape.html#construct(akka.stream.FanInShape.Init))` in class `[FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")>`
		- #### deepCopy
		
		
		
		```
		public [FanInShape17](FanInShape17.html "class in akka.stream")<[T0](FanInShape17.html "type parameter in FanInShape17"),​[T1](FanInShape17.html "type parameter in FanInShape17"),​[T2](FanInShape17.html "type parameter in FanInShape17"),​[T3](FanInShape17.html "type parameter in FanInShape17"),​[T4](FanInShape17.html "type parameter in FanInShape17"),​[T5](FanInShape17.html "type parameter in FanInShape17"),​[T6](FanInShape17.html "type parameter in FanInShape17"),​[T7](FanInShape17.html "type parameter in FanInShape17"),​[T8](FanInShape17.html "type parameter in FanInShape17"),​[T9](FanInShape17.html "type parameter in FanInShape17"),​[T10](FanInShape17.html "type parameter in FanInShape17"),​[T11](FanInShape17.html "type parameter in FanInShape17"),​[T12](FanInShape17.html "type parameter in FanInShape17"),​[T13](FanInShape17.html "type parameter in FanInShape17"),​[T14](FanInShape17.html "type parameter in FanInShape17"),​[T15](FanInShape17.html "type parameter in FanInShape17"),​[T16](FanInShape17.html "type parameter in FanInShape17"),​[O](FanInShape17.html "type parameter in FanInShape17")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanInShape.html#deepCopy())` in class `[FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape17.html "type parameter in FanInShape17")>`
		- #### in0
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape17.html "type parameter in FanInShape17")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape17.html "type parameter in FanInShape17")> in1()
		```
		- #### in10
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T10](FanInShape17.html "type parameter in FanInShape17")> in10()
		```
		- #### in11
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T11](FanInShape17.html "type parameter in FanInShape17")> in11()
		```
		- #### in12
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T12](FanInShape17.html "type parameter in FanInShape17")> in12()
		```
		- #### in13
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T13](FanInShape17.html "type parameter in FanInShape17")> in13()
		```
		- #### in14
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T14](FanInShape17.html "type parameter in FanInShape17")> in14()
		```
		- #### in15
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T15](FanInShape17.html "type parameter in FanInShape17")> in15()
		```
		- #### in16
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T16](FanInShape17.html "type parameter in FanInShape17")> in16()
		```
		- #### in2
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T2](FanInShape17.html "type parameter in FanInShape17")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T3](FanInShape17.html "type parameter in FanInShape17")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T4](FanInShape17.html "type parameter in FanInShape17")> in4()
		```
		- #### in5
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T5](FanInShape17.html "type parameter in FanInShape17")> in5()
		```
		- #### in6
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T6](FanInShape17.html "type parameter in FanInShape17")> in6()
		```
		- #### in7
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T7](FanInShape17.html "type parameter in FanInShape17")> in7()
		```
		- #### in8
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T8](FanInShape17.html "type parameter in FanInShape17")> in8()
		```
		- #### in9
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T9](FanInShape17.html "type parameter in FanInShape17")> in9()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape.Init.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape.Name$.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape.Name.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape.Ports$.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape.Ports.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape17.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/FanInShape17.html](https://doc.akka.io/japi/akka/current/akka/stream/FanInShape17.html)*