---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergePreferred.MergePreferredShape.html
title: MergePreferred.MergePreferredShape
---

# MergePreferred.MergePreferredShape

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class MergePreferred.MergePreferredShape\<T\>

- java.lang.Object
- - [akka.stream.Shape](../Shape.html "class in akka.stream")
	- - [akka.stream.FanInShape](../FanInShape.html "class in akka.stream")\<O\>
		- - [akka.stream.UniformFanInShape](../UniformFanInShape.html "class in akka.stream")\<T,​T\>
			- - akka.stream.scaladsl.MergePreferred.MergePreferredShape\<T\>

- Enclosing class:
[MergePreferred](MergePreferred.html "class in akka.stream.scaladsl")\<[T](MergePreferred.html "type parameter in MergePreferred")\>

---

```
public static final class MergePreferred.MergePreferredShape<T>
extends [UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[FanInShape](../FanInShape.html "class in akka.stream")
		
		
		`[FanInShape.Init](../FanInShape.Init.html "interface in akka.stream")<[O](../FanInShape.Init.html "type parameter in FanInShape.Init")>, [FanInShape.Name](../FanInShape.Name.html "class in akka.stream")<[O](../FanInShape.Name.html "type parameter in FanInShape.Name")>, [FanInShape.Name$](../FanInShape.Name$.html "class in akka.stream"), [FanInShape.Ports](../FanInShape.Ports.html "class in akka.stream")<[O](../FanInShape.Ports.html "type parameter in FanInShape.Ports")>, [FanInShape.Ports$](../FanInShape.Ports$.html "class in akka.stream")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergePreferredShape](#%3Cinit%3E(int,akka.stream.FanInShape.Init))​(int secondaryPorts,  [FanInShape.Init](../FanInShape.Init.html "interface in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")> _init)` |  |
	| `[MergePreferredShape](#%3Cinit%3E(int,java.lang.String))​(int secondaryPorts,  java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [FanInShape](../FanInShape.html "class in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")>` | `[construct](#construct(akka.stream.FanInShape.Init))​([FanInShape.Init](../FanInShape.Init.html "interface in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")> init)` |  |
	| `[MergePreferred.MergePreferredShape](MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `[Inlet](../Inlet.html "class in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")>` | `[preferred](#preferred())()` |  |
	| `int` | `[secondaryPorts](#secondaryPorts())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")
		
		
		`[apply](../UniformFanInShape.html#apply(akka.stream.Outlet,scala.collection.immutable.Seq)), [create](../UniformFanInShape.html#create(akka.stream.Outlet,java.util.List)), [in](../UniformFanInShape.html#in(int)), [inlets](../UniformFanInShape.html#inlets()), [n](../UniformFanInShape.html#n())`
		- ### Methods inherited from class akka.stream.[FanInShape](../FanInShape.html "class in akka.stream")
		
		
		`[newInlet](../FanInShape.html#newInlet(java.lang.String)), [out](../FanInShape.html#out()), [outlets](../FanInShape.html#outlets())`
		- ### Methods inherited from class akka.stream.[Shape](../Shape.html "class in akka.stream")
		
		
		`[getInlets](../Shape.html#getInlets()), [getOutlets](../Shape.html#getOutlets()), [hasOnePort](../Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](../Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](../Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](../Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](../Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MergePreferredShape
		
		
		
		```
		public MergePreferredShape​(int secondaryPorts,
		                           [FanInShape.Init](../FanInShape.Init.html "interface in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")> _init)
		```
		- #### MergePreferredShape
		
		
		
		```
		public MergePreferredShape​(int secondaryPorts,
		                           java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### construct
		
		
		
		```
		protected [FanInShape](../FanInShape.html "class in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")> construct​([FanInShape.Init](../FanInShape.Init.html "interface in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")> init)
		```
		
		
		Overrides:
		`[construct](../UniformFanInShape.html#construct(akka.stream.FanInShape.Init))` in class `[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape"),​[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")>`
		- #### deepCopy
		
		
		
		```
		public [MergePreferred.MergePreferredShape](MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")> deepCopy()
		```
		
		Description copied from class: `[Shape](../Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Overrides:
		`[deepCopy](../UniformFanInShape.html#deepCopy())` in class `[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape"),​[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")>`
		- #### preferred
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[T](MergePreferred.MergePreferredShape.html "type parameter in MergePreferred.MergePreferredShape")> preferred()
		```
		- #### secondaryPorts
		
		
		
		```
		public int secondaryPorts()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Init.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Name$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Name.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergePreferred.MergePreferredShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergePreferred.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergePreferred.MergePreferredShape.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergePreferred.MergePreferredShape.html)*