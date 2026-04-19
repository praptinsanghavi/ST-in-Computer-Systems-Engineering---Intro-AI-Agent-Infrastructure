---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:03:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/AmorphousShape.html
title: AmorphousShape
---

# AmorphousShape

## Content

Package [akka.stream](package-summary.html)
## Class AmorphousShape

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - akka.stream.AmorphousShape

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class AmorphousShape
extends [Shape](Shape.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

This type of [`Shape`](Shape.html "class in akka.stream") can express any number of inputs and outputs at the
 expense of forgetting about their specific types. It is used mainly in the
 implementation of the [`Graph`](Graph.html "interface in akka.stream") builders and typically replaced by a more
 meaningful type of Shape when the building is finished.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.AmorphousShape)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AmorphousShape](#%3Cinit%3E(scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets,  scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [AmorphousShape](AmorphousShape.html "class in akka.stream")` | `[apply](#apply(scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets,  scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[AmorphousShape](AmorphousShape.html "class in akka.stream")` | `[copy](#copy(scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets,  scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)` |  |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[copy$default$2](#copy$default$2())()` |  |
	| `[AmorphousShape](AmorphousShape.html "class in akka.stream")` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` | Scala API: get a list of all input ports |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` | Scala API: get a list of all output ports |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>>>` | `[unapply](#unapply(akka.stream.AmorphousShape))​([AmorphousShape](AmorphousShape.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### AmorphousShape
		
		
		
		```
		public AmorphousShape​(scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets,
		                      scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [AmorphousShape](AmorphousShape.html "class in akka.stream") apply​(scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets,
		                                   scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>>> unapply​([AmorphousShape](AmorphousShape.html "class in akka.stream") x$0)
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
		public [AmorphousShape](AmorphousShape.html "class in akka.stream") deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Specified by:
		`[deepCopy](Shape.html#deepCopy())` in class `[Shape](Shape.html "class in akka.stream")`
		- #### copy
		
		
		
		```
		public [AmorphousShape](AmorphousShape.html "class in akka.stream") copy​(scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets,
		                           scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> copy$default$2()
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

- https://doc.akka.io/japi/akka/2.10/akka/stream/AmorphousShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/AmorphousShape.html](https://doc.akka.io/japi/akka/2.10/akka/stream/AmorphousShape.html)*