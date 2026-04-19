---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:21:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
title: UniformFanInShape
---

# UniformFanInShape

## Content

Package [akka.stream](package-summary.html)
## Class UniformFanInShape\<T,​O\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanInShape](FanInShape.html "class in akka.stream")\<O\>
		- - akka.stream.UniformFanInShape\<T,​O\>

- Direct Known Subclasses:
`[MergePreferred.MergePreferredShape](scaladsl/MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")`

---

```
public class UniformFanInShape<T,​O>
extends [FanInShape](FanInShape.html "class in akka.stream")<O>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanInShape](FanInShape.html "class in akka.stream")
		
		
		`[FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape.Init.html "type parameter in FanInShape.Init")>, [FanInShape.Name](FanInShape.Name.html "class in akka.stream")<[O](FanInShape.Name.html "type parameter in FanInShape.Name")>, [FanInShape.Name$](FanInShape.Name$.html "class in akka.stream"), [FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")>, [FanInShape.Ports$](FanInShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UniformFanInShape](#%3Cinit%3E(int))​(int n)` |  |
	| `[UniformFanInShape](#%3Cinit%3E(int,akka.stream.FanInShape.Init))​(int n,  [FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")> _init)` |  |
	| `[UniformFanInShape](#%3Cinit%3E(int,java.lang.String))​(int n,  java.lang.String name)` |  |
	| `[UniformFanInShape](#%3Cinit%3E(akka.stream.Outlet,akka.stream.Inlet%5B%5D))​([Outlet](Outlet.html "class in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")> outlet,  [Inlet](Inlet.html "class in akka.stream")<[T](UniformFanInShape.html "type parameter in UniformFanInShape")>[] inlets)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <I,​O>[UniformFanInShape](UniformFanInShape.html "class in akka.stream")<I,​O>` | `[apply](#apply(akka.stream.Outlet,scala.collection.immutable.Seq))​([Outlet](Outlet.html "class in akka.stream")<O> outlet,  scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<I>> inlets)` |  |
	| `protected [FanInShape](FanInShape.html "class in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")>` | `[construct](#construct(akka.stream.FanInShape.Init))​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")> init)` |  |
	| `static <I,​O>[UniformFanInShape](UniformFanInShape.html "class in akka.stream")<I,​O>` | `[create](#create(akka.stream.Outlet,java.util.List))​([Outlet](Outlet.html "class in akka.stream")<O> outlet,  java.util.List<[Inlet](Inlet.html "class in akka.stream")<I>> inlets)` | Java API |
	| `[UniformFanInShape](UniformFanInShape.html "class in akka.stream")<[T](UniformFanInShape.html "type parameter in UniformFanInShape"),​[O](UniformFanInShape.html "type parameter in UniformFanInShape")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Inlet](Inlet.html "class in akka.stream")<[T](UniformFanInShape.html "type parameter in UniformFanInShape")>` | `[in](#in(int))​(int n)` |  |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<[T](UniformFanInShape.html "type parameter in UniformFanInShape")>>` | `[inlets](#inlets())()` |  |
	| `int` | `[n](#n())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanInShape](FanInShape.html "class in akka.stream")
		
		
		`[newInlet](FanInShape.html#newInlet(java.lang.String)), [out](FanInShape.html#out()), [outlets](FanInShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UniformFanInShape
		
		
		
		```
		public UniformFanInShape​(int n,
		                         [FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")> _init)
		```
		- #### UniformFanInShape
		
		
		
		```
		public UniformFanInShape​(int n)
		```
		- #### UniformFanInShape
		
		
		
		```
		public UniformFanInShape​(int n,
		                         java.lang.String name)
		```
		- #### UniformFanInShape
		
		
		
		```
		public UniformFanInShape​([Outlet](Outlet.html "class in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")> outlet,
		                         [Inlet](Inlet.html "class in akka.stream")<[T](UniformFanInShape.html "type parameter in UniformFanInShape")>[] inlets)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <I,​O> [UniformFanInShape](UniformFanInShape.html "class in akka.stream")<I,​O> apply​([Outlet](Outlet.html "class in akka.stream")<O> outlet,
		                                                             scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<I>> inlets)
		```
		- #### create
		
		
		
		```
		public static <I,​O> [UniformFanInShape](UniformFanInShape.html "class in akka.stream")<I,​O> create​([Outlet](Outlet.html "class in akka.stream")<O> outlet,
		                                                              java.util.List<[Inlet](Inlet.html "class in akka.stream")<I>> inlets)
		```
		
		Java API
		- #### n
		
		
		
		```
		public int n()
		```
		- #### construct
		
		
		
		```
		protected [FanInShape](FanInShape.html "class in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")> construct​([FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")> init)
		```
		
		
		Specified by:
		`[construct](FanInShape.html#construct(akka.stream.FanInShape.Init))` in class `[FanInShape](FanInShape.html "class in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")>`
		- #### deepCopy
		
		
		
		```
		public [UniformFanInShape](UniformFanInShape.html "class in akka.stream")<[T](UniformFanInShape.html "type parameter in UniformFanInShape"),​[O](UniformFanInShape.html "type parameter in UniformFanInShape")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanInShape.html#deepCopy())` in class `[FanInShape](FanInShape.html "class in akka.stream")<[O](UniformFanInShape.html "type parameter in UniformFanInShape")>`
		- #### inlets
		
		
		
		```
		public final scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<[T](UniformFanInShape.html "type parameter in UniformFanInShape")>> inlets()
		```
		- #### in
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T](UniformFanInShape.html "type parameter in UniformFanInShape")> in​(int n)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Init.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Name$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Name.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergePreferred.MergePreferredShape.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html](https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html)*