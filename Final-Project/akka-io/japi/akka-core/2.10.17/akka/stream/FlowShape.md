---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:25:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FlowShape.html
title: FlowShape
---

# FlowShape

## Content

Package [akka.stream](package-summary.html)
## Class FlowShape\<I,​O\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - akka.stream.FlowShape\<I,​O\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class FlowShape<I,​O>
extends [Shape](Shape.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

A Flow [`Shape`](Shape.html "class in akka.stream") has exactly one input and one output, it looks from the
 outside like a pipe (but it can be a complex topology of streams within of
 course).

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.FlowShape)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlowShape](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[I](FlowShape.html "type parameter in FlowShape")> in,  [Outlet](Outlet.html "class in akka.stream")<[O](FlowShape.html "type parameter in FlowShape")> out)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <I,​O>[FlowShape](FlowShape.html "class in akka.stream")<I,​O>` | `[apply](#apply(akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<I> in,  [Outlet](Outlet.html "class in akka.stream")<O> out)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<I,​O>[FlowShape](FlowShape.html "class in akka.stream")<I,​O>` | `[copy](#copy(akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<I> in,  [Outlet](Outlet.html "class in akka.stream")<O> out)` |  |
	| `<I,​O>[Inlet](Inlet.html "class in akka.stream")<I>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<I,​O>[Outlet](Outlet.html "class in akka.stream")<O>` | `[copy$default$2](#copy$default$2())()` |  |
	| `[FlowShape](FlowShape.html "class in akka.stream")<[I](FlowShape.html "type parameter in FlowShape"),​[O](FlowShape.html "type parameter in FlowShape")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[I](FlowShape.html "type parameter in FlowShape")>` | `[in](#in())()` |  |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` | Scala API: get a list of all input ports |
	| `static <I,​O>[FlowShape](FlowShape.html "class in akka.stream")<I,​O>` | `[of](#of(akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<I> inlet,  [Outlet](Outlet.html "class in akka.stream")<O> outlet)` | Java API |
	| `[Outlet](Outlet.html "class in akka.stream")<[O](FlowShape.html "type parameter in FlowShape")>` | `[out](#out())()` |  |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` | Scala API: get a list of all output ports |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <I,​O>scala.Option<scala.Tuple2<[Inlet](Inlet.html "class in akka.stream")<I>,​[Outlet](Outlet.html "class in akka.stream")<O>>>` | `[unapply](#unapply(akka.stream.FlowShape))​([FlowShape](FlowShape.html "class in akka.stream")<I,​O> x$0)` |  |
	
	
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### FlowShape
		
		
		
		```
		public FlowShape​([Inlet](Inlet.html "class in akka.stream")<[I](FlowShape.html "type parameter in FlowShape")> in,
		                 [Outlet](Outlet.html "class in akka.stream")<[O](FlowShape.html "type parameter in FlowShape")> out)
		```

	- ### Method Detail
	
	
	
		- #### of
		
		
		
		```
		public static <I,​O> [FlowShape](FlowShape.html "class in akka.stream")<I,​O> of​([Inlet](Inlet.html "class in akka.stream")<I> inlet,
		                                                  [Outlet](Outlet.html "class in akka.stream")<O> outlet)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static <I,​O> [FlowShape](FlowShape.html "class in akka.stream")<I,​O> apply​([Inlet](Inlet.html "class in akka.stream")<I> in,
		                                                     [Outlet](Outlet.html "class in akka.stream")<O> out)
		```
		- #### unapply
		
		
		
		```
		public static <I,​O> scala.Option<scala.Tuple2<[Inlet](Inlet.html "class in akka.stream")<I>,​[Outlet](Outlet.html "class in akka.stream")<O>>> unapply​([FlowShape](FlowShape.html "class in akka.stream")<I,​O> x$0)
		```
		- #### in
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[I](FlowShape.html "type parameter in FlowShape")> in()
		```
		- #### out
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O](FlowShape.html "type parameter in FlowShape")> out()
		```
		- #### inlets
		
		
		
		```
		public scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets()
		```
		
		Description copied from class: `[Shape](Shape.html#inlets())`
		Scala API: get a list of all input ports
		
		Specified by:
		`[inlets](Shape.html#inlets())` in class `[Shape](Shape.html "class in akka.stream")`
		- #### outlets
		
		
		
		```
		public scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets()
		```
		
		Description copied from class: `[Shape](Shape.html#outlets())`
		Scala API: get a list of all output ports
		
		Specified by:
		`[outlets](Shape.html#outlets())` in class `[Shape](Shape.html "class in akka.stream")`
		- #### deepCopy
		
		
		
		```
		public [FlowShape](FlowShape.html "class in akka.stream")<[I](FlowShape.html "type parameter in FlowShape"),​[O](FlowShape.html "type parameter in FlowShape")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Specified by:
		`[deepCopy](Shape.html#deepCopy())` in class `[Shape](Shape.html "class in akka.stream")`
		- #### copy
		
		
		
		```
		public <I,​O> [FlowShape](FlowShape.html "class in akka.stream")<I,​O> copy​([Inlet](Inlet.html "class in akka.stream")<I> in,
		                                             [Outlet](Outlet.html "class in akka.stream")<O> out)
		```
		- #### copy$default$1
		
		
		
		```
		public <I,​O> [Inlet](Inlet.html "class in akka.stream")<I> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <I,​O> [Outlet](Outlet.html "class in akka.stream")<O> copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FlowShape.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FlowShape.html)*