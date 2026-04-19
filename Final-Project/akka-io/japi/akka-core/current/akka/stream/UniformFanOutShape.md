---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:03:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/UniformFanOutShape.html
title: UniformFanOutShape
---

# UniformFanOutShape

## Content

Package [akka.stream](package-summary.html)
## Class UniformFanOutShape\<I,​O\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - [akka.stream.FanOutShape](FanOutShape.html "class in akka.stream")\<I\>
		- - akka.stream.UniformFanOutShape\<I,​O\>

- ---

```
public class UniformFanOutShape<I,​O>
extends [FanOutShape](FanOutShape.html "class in akka.stream")<I>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape.Init.html "type parameter in FanOutShape.Init")>, [FanOutShape.Name](FanOutShape.Name.html "class in akka.stream")<[I](FanOutShape.Name.html "type parameter in FanOutShape.Name")>, [FanOutShape.Name$](FanOutShape.Name$.html "class in akka.stream"), [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>, [FanOutShape.Ports$](FanOutShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UniformFanOutShape](#%3Cinit%3E(int))​(int n)` |  |
	| `[UniformFanOutShape](#%3Cinit%3E(int,akka.stream.FanOutShape.Init))​(int n,  [FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")> _init)` |  |
	| `[UniformFanOutShape](#%3Cinit%3E(int,java.lang.String))​(int n,  java.lang.String name)` |  |
	| `[UniformFanOutShape](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Outlet%5B%5D))​([Inlet](Inlet.html "class in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")> inlet,  [Outlet](Outlet.html "class in akka.stream")<[O](UniformFanOutShape.html "type parameter in UniformFanOutShape")>[] outlets)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <I,​O>[UniformFanOutShape](UniformFanOutShape.html "class in akka.stream")<I,​O>` | `[apply](#apply(akka.stream.Inlet,scala.collection.immutable.Seq))​([Inlet](Inlet.html "class in akka.stream")<I> inlet,  scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<O>> outlets)` |  |
	| `protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")>` | `[construct](#construct(akka.stream.FanOutShape.Init))​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")> init)` |  |
	| `[UniformFanOutShape](UniformFanOutShape.html "class in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape"),​[O](UniformFanOutShape.html "type parameter in UniformFanOutShape")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Outlet](Outlet.html "class in akka.stream")<[O](UniformFanOutShape.html "type parameter in UniformFanOutShape")>` | `[out](#out(int))​(int n)` |  |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<[O](UniformFanOutShape.html "type parameter in UniformFanOutShape")>>` | `[outlets](#outlets())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[FanOutShape](FanOutShape.html "class in akka.stream")
		
		
		`[in](FanOutShape.html#in()), [inlets](FanOutShape.html#inlets()), [newOutlet](FanOutShape.html#newOutlet(java.lang.String))`
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UniformFanOutShape
		
		
		
		```
		public UniformFanOutShape​(int n,
		                          [FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")> _init)
		```
		- #### UniformFanOutShape
		
		
		
		```
		public UniformFanOutShape​(int n)
		```
		- #### UniformFanOutShape
		
		
		
		```
		public UniformFanOutShape​(int n,
		                          java.lang.String name)
		```
		- #### UniformFanOutShape
		
		
		
		```
		public UniformFanOutShape​([Inlet](Inlet.html "class in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")> inlet,
		                          [Outlet](Outlet.html "class in akka.stream")<[O](UniformFanOutShape.html "type parameter in UniformFanOutShape")>[] outlets)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <I,​O> [UniformFanOutShape](UniformFanOutShape.html "class in akka.stream")<I,​O> apply​([Inlet](Inlet.html "class in akka.stream")<I> inlet,
		                                                              scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<O>> outlets)
		```
		- #### construct
		
		
		
		```
		protected [FanOutShape](FanOutShape.html "class in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")> construct​([FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")> init)
		```
		
		
		Specified by:
		`[construct](FanOutShape.html#construct(akka.stream.FanOutShape.Init))` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")>`
		- #### deepCopy
		
		
		
		```
		public [UniformFanOutShape](UniformFanOutShape.html "class in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape"),​[O](UniformFanOutShape.html "type parameter in UniformFanOutShape")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](FanOutShape.html#deepCopy())` in class `[FanOutShape](FanOutShape.html "class in akka.stream")<[I](UniformFanOutShape.html "type parameter in UniformFanOutShape")>`
		- #### outlets
		
		
		
		```
		public final scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<[O](UniformFanOutShape.html "type parameter in UniformFanOutShape")>> outlets()
		```
		- #### out
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O](UniformFanOutShape.html "type parameter in UniformFanOutShape")> out​(int n)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Init.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Name$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Name.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Ports$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Ports.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/UniformFanOutShape.html](https://doc.akka.io/japi/akka-core/current/akka/stream/UniformFanOutShape.html)*