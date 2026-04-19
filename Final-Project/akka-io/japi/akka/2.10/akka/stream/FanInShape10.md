---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:01:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape10.html
title: FanInShape10
---

# FanInShape10

## Content

Package [akka.stream](package-summary.html)
## Class FanInShape10\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​O\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanInShape](FanInShape.html "class in akka.stream")\<O\>
		- - akka.stream.FanInShape10\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​O\>

- ---

```
public class FanInShape10<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​O>
extends [FanInShape](FanInShape.html "class in akka.stream")<O>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanInShape](FanInShape.html "class in akka.stream")
		
		
		`[FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape.Init.html "type parameter in FanInShape.Init")>, [FanInShape.Name](FanInShape.Name.html "class in akka.stream")<[O](FanInShape.Name.html "type parameter in FanInShape.Name")>, [FanInShape.Name$](FanInShape.Name$.html "class in akka.stream"), [FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")>, [FanInShape.Ports$](FanInShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FanInShape10](#%3Cinit%3E(akka.stream.FanInShape.Init))​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")> _init)` |  |
	| `[FanInShape10](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape10.html "type parameter in FanInShape10")> in0,  [Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape10.html "type parameter in FanInShape10")> in1,  [Inlet](Inlet.html "class in akka.stream")<[T2](FanInShape10.html "type parameter in FanInShape10")> in2,  [Inlet](Inlet.html "class in akka.stream")<[T3](FanInShape10.html "type parameter in FanInShape10")> in3,  [Inlet](Inlet.html "class in akka.stream")<[T4](FanInShape10.html "type parameter in FanInShape10")> in4,  [Inlet](Inlet.html "class in akka.stream")<[T5](FanInShape10.html "type parameter in FanInShape10")> in5,  [Inlet](Inlet.html "class in akka.stream")<[T6](FanInShape10.html "type parameter in FanInShape10")> in6,  [Inlet](Inlet.html "class in akka.stream")<[T7](FanInShape10.html "type parameter in FanInShape10")> in7,  [Inlet](Inlet.html "class in akka.stream")<[T8](FanInShape10.html "type parameter in FanInShape10")> in8,  [Inlet](Inlet.html "class in akka.stream")<[T9](FanInShape10.html "type parameter in FanInShape10")> in9,  [Outlet](Outlet.html "class in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")> out)` |  |
	| `[FanInShape10](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")>` | `[construct](#construct(akka.stream.FanInShape.Init))​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")> init)` |  |
	| `[FanInShape10](FanInShape10.html "class in akka.stream")<[T0](FanInShape10.html "type parameter in FanInShape10"),​[T1](FanInShape10.html "type parameter in FanInShape10"),​[T2](FanInShape10.html "type parameter in FanInShape10"),​[T3](FanInShape10.html "type parameter in FanInShape10"),​[T4](FanInShape10.html "type parameter in FanInShape10"),​[T5](FanInShape10.html "type parameter in FanInShape10"),​[T6](FanInShape10.html "type parameter in FanInShape10"),​[T7](FanInShape10.html "type parameter in FanInShape10"),​[T8](FanInShape10.html "type parameter in FanInShape10"),​[T9](FanInShape10.html "type parameter in FanInShape10"),​[O](FanInShape10.html "type parameter in FanInShape10")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape10.html "type parameter in FanInShape10")>` | `[in0](#in0())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape10.html "type parameter in FanInShape10")>` | `[in1](#in1())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T2](FanInShape10.html "type parameter in FanInShape10")>` | `[in2](#in2())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T3](FanInShape10.html "type parameter in FanInShape10")>` | `[in3](#in3())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T4](FanInShape10.html "type parameter in FanInShape10")>` | `[in4](#in4())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T5](FanInShape10.html "type parameter in FanInShape10")>` | `[in5](#in5())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T6](FanInShape10.html "type parameter in FanInShape10")>` | `[in6](#in6())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T7](FanInShape10.html "type parameter in FanInShape10")>` | `[in7](#in7())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T8](FanInShape10.html "type parameter in FanInShape10")>` | `[in8](#in8())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T9](FanInShape10.html "type parameter in FanInShape10")>` | `[in9](#in9())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanInShape](FanInShape.html "class in akka.stream")
		
		
		`[inlets](FanInShape.html#inlets()), [newInlet](FanInShape.html#newInlet(java.lang.String)), [out](FanInShape.html#out()), [outlets](FanInShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FanInShape10
		
		
		
		```
		public FanInShape10​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")> _init)
		```
		- #### FanInShape10
		
		
		
		```
		public FanInShape10​(java.lang.String name)
		```
		- #### FanInShape10
		
		
		
		```
		public FanInShape10​([Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape10.html "type parameter in FanInShape10")> in0,
		                    [Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape10.html "type parameter in FanInShape10")> in1,
		                    [Inlet](Inlet.html "class in akka.stream")<[T2](FanInShape10.html "type parameter in FanInShape10")> in2,
		                    [Inlet](Inlet.html "class in akka.stream")<[T3](FanInShape10.html "type parameter in FanInShape10")> in3,
		                    [Inlet](Inlet.html "class in akka.stream")<[T4](FanInShape10.html "type parameter in FanInShape10")> in4,
		                    [Inlet](Inlet.html "class in akka.stream")<[T5](FanInShape10.html "type parameter in FanInShape10")> in5,
		                    [Inlet](Inlet.html "class in akka.stream")<[T6](FanInShape10.html "type parameter in FanInShape10")> in6,
		                    [Inlet](Inlet.html "class in akka.stream")<[T7](FanInShape10.html "type parameter in FanInShape10")> in7,
		                    [Inlet](Inlet.html "class in akka.stream")<[T8](FanInShape10.html "type parameter in FanInShape10")> in8,
		                    [Inlet](Inlet.html "class in akka.stream")<[T9](FanInShape10.html "type parameter in FanInShape10")> in9,
		                    [Outlet](Outlet.html "class in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")> out)
		```

	- ### Method Detail
	
	
	
		- #### construct
		
		
		
		```
		protected [FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")> construct​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")> init)
		```
		
		
		Specified by:
		`[construct](FanInShape.html#construct(akka.stream.FanInShape.Init))` in class `[FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")>`
		- #### deepCopy
		
		
		
		```
		public [FanInShape10](FanInShape10.html "class in akka.stream")<[T0](FanInShape10.html "type parameter in FanInShape10"),​[T1](FanInShape10.html "type parameter in FanInShape10"),​[T2](FanInShape10.html "type parameter in FanInShape10"),​[T3](FanInShape10.html "type parameter in FanInShape10"),​[T4](FanInShape10.html "type parameter in FanInShape10"),​[T5](FanInShape10.html "type parameter in FanInShape10"),​[T6](FanInShape10.html "type parameter in FanInShape10"),​[T7](FanInShape10.html "type parameter in FanInShape10"),​[T8](FanInShape10.html "type parameter in FanInShape10"),​[T9](FanInShape10.html "type parameter in FanInShape10"),​[O](FanInShape10.html "type parameter in FanInShape10")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanInShape.html#deepCopy())` in class `[FanInShape](FanInShape.html "class in akka.stream")<[O](FanInShape10.html "type parameter in FanInShape10")>`
		- #### in0
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T0](FanInShape10.html "type parameter in FanInShape10")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T1](FanInShape10.html "type parameter in FanInShape10")> in1()
		```
		- #### in2
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T2](FanInShape10.html "type parameter in FanInShape10")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T3](FanInShape10.html "type parameter in FanInShape10")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T4](FanInShape10.html "type parameter in FanInShape10")> in4()
		```
		- #### in5
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T5](FanInShape10.html "type parameter in FanInShape10")> in5()
		```
		- #### in6
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T6](FanInShape10.html "type parameter in FanInShape10")> in6()
		```
		- #### in7
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T7](FanInShape10.html "type parameter in FanInShape10")> in7()
		```
		- #### in8
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T8](FanInShape10.html "type parameter in FanInShape10")> in8()
		```
		- #### in9
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T9](FanInShape10.html "type parameter in FanInShape10")> in9()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Init.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Name$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Name.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape10.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape10.html](https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape10.html)*