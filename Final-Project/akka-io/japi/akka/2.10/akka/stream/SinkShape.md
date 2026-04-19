---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html
title: SinkShape
---

# SinkShape

## Content

Package [akka.stream](package-summary.html)
## Class SinkShape\<T\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - akka.stream.SinkShape\<T\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SinkShape<T>
extends [Shape](Shape.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

A Sink [`Shape`](Shape.html "class in akka.stream") has exactly one input and no outputs, it models a data sink.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.SinkShape)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SinkShape](#%3Cinit%3E(akka.stream.Inlet))​([Inlet](Inlet.html "class in akka.stream")<[T](SinkShape.html "type parameter in SinkShape")> in)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [SinkShape](SinkShape.html "class in akka.stream")<T>` | `[apply](#apply(akka.stream.Inlet))​([Inlet](Inlet.html "class in akka.stream")<T> in)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T> [SinkShape](SinkShape.html "class in akka.stream")<T>` | `[copy](#copy(akka.stream.Inlet))​([Inlet](Inlet.html "class in akka.stream")<T> in)` |  |
	| `<T> [Inlet](Inlet.html "class in akka.stream")<T>` | `[copy$default$1](#copy$default$1())()` |  |
	| `[SinkShape](SinkShape.html "class in akka.stream")<[T](SinkShape.html "type parameter in SinkShape")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[T](SinkShape.html "type parameter in SinkShape")>` | `[in](#in())()` |  |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` | Scala API: get a list of all input ports |
	| `static <T> [SinkShape](SinkShape.html "class in akka.stream")<T>` | `[of](#of(akka.stream.Inlet))​([Inlet](Inlet.html "class in akka.stream")<T> inlet)` | Java API |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` | Scala API: get a list of all output ports |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T> scala.Option<[Inlet](Inlet.html "class in akka.stream")<T>>` | `[unapply](#unapply(akka.stream.SinkShape))​([SinkShape](SinkShape.html "class in akka.stream")<T> x$0)` |  |
	
	
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SinkShape
		
		
		
		```
		public SinkShape​([Inlet](Inlet.html "class in akka.stream")<[T](SinkShape.html "type parameter in SinkShape")> in)
		```

	- ### Method Detail
	
	
	
		- #### of
		
		
		
		```
		public static <T> [SinkShape](SinkShape.html "class in akka.stream")<T> of​([Inlet](Inlet.html "class in akka.stream")<T> inlet)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static <T> [SinkShape](SinkShape.html "class in akka.stream")<T> apply​([Inlet](Inlet.html "class in akka.stream")<T> in)
		```
		- #### unapply
		
		
		
		```
		public static <T> scala.Option<[Inlet](Inlet.html "class in akka.stream")<T>> unapply​([SinkShape](SinkShape.html "class in akka.stream")<T> x$0)
		```
		- #### in
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[T](SinkShape.html "type parameter in SinkShape")> in()
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
		public [SinkShape](SinkShape.html "class in akka.stream")<[T](SinkShape.html "type parameter in SinkShape")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Specified by:
		`[deepCopy](Shape.html#deepCopy())` in class `[Shape](Shape.html "class in akka.stream")`
		- #### copy
		
		
		
		```
		public <T> [SinkShape](SinkShape.html "class in akka.stream")<T> copy​([Inlet](Inlet.html "class in akka.stream")<T> in)
		```
		- #### copy$default$1
		
		
		
		```
		public <T> [Inlet](Inlet.html "class in akka.stream")<T> copy$default$1()
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

- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html](https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html)*