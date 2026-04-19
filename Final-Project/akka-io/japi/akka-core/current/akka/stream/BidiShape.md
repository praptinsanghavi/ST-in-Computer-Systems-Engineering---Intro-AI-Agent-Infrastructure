---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:00:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/BidiShape.html
title: BidiShape
---

# BidiShape

## Content

Package [akka.stream](package-summary.html)
## Class BidiShape\<In1,​Out1,​In2,​Out2\>

- java.lang.Object
- - [akka.stream.Shape](Shape.html "class in akka.stream")
	- - akka.stream.BidiShape\<In1,​Out1,​In2,​Out2\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class BidiShape<In1,​Out1,​In2,​Out2>
extends [Shape](Shape.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

A bidirectional flow of elements that consequently has two inputs and two
 outputs, arranged like this:
 

```

        +------+
  In1 ~>|      |~> Out1
        | bidi |
 Out2 <~|      |<~ In2
        +------+
 
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.BidiShape)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BidiShape](#%3Cinit%3E(akka.stream.FlowShape,akka.stream.FlowShape))​([FlowShape](FlowShape.html "class in akka.stream")<[In1](BidiShape.html "type parameter in BidiShape"),​[Out1](BidiShape.html "type parameter in BidiShape")> top,  [FlowShape](FlowShape.html "class in akka.stream")<[In2](BidiShape.html "type parameter in BidiShape"),​[Out2](BidiShape.html "type parameter in BidiShape")> bottom)` | Java API for creating from a pair of unidirectional flows. |
	| `[BidiShape](#%3Cinit%3E(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<[In1](BidiShape.html "type parameter in BidiShape")> in1,  [Outlet](Outlet.html "class in akka.stream")<[Out1](BidiShape.html "type parameter in BidiShape")> out1,  [Inlet](Inlet.html "class in akka.stream")<[In2](BidiShape.html "type parameter in BidiShape")> in2,  [Outlet](Outlet.html "class in akka.stream")<[Out2](BidiShape.html "type parameter in BidiShape")> out2)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <In1,​Out1,​In2,​Out2>[BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2>` | `[apply](#apply(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<In1> in1,  [Outlet](Outlet.html "class in akka.stream")<Out1> out1,  [Inlet](Inlet.html "class in akka.stream")<In2> in2,  [Outlet](Outlet.html "class in akka.stream")<Out2> out2)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<In1,​Out1,​In2,​Out2>[BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2>` | `[copy](#copy(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<In1> in1,  [Outlet](Outlet.html "class in akka.stream")<Out1> out1,  [Inlet](Inlet.html "class in akka.stream")<In2> in2,  [Outlet](Outlet.html "class in akka.stream")<Out2> out2)` |  |
	| `<In1,​Out1,​In2,​Out2>[Inlet](Inlet.html "class in akka.stream")<In1>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<In1,​Out1,​In2,​Out2>[Outlet](Outlet.html "class in akka.stream")<Out1>` | `[copy$default$2](#copy$default$2())()` |  |
	| `<In1,​Out1,​In2,​Out2>[Inlet](Inlet.html "class in akka.stream")<In2>` | `[copy$default$3](#copy$default$3())()` |  |
	| `<In1,​Out1,​In2,​Out2>[Outlet](Outlet.html "class in akka.stream")<Out2>` | `[copy$default$4](#copy$default$4())()` |  |
	| `[BidiShape](BidiShape.html "class in akka.stream")<[In1](BidiShape.html "type parameter in BidiShape"),​[Out1](BidiShape.html "type parameter in BidiShape"),​[In2](BidiShape.html "type parameter in BidiShape"),​[Out2](BidiShape.html "type parameter in BidiShape")>` | `[deepCopy](#deepCopy())()` | Create a copy of this Shape object, returning the same type as the  original; this constraint can unfortunately not be expressed in the  type system. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static <I1,​O1,​I2,​O2>[BidiShape](BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2>` | `[fromFlows](#fromFlows(akka.stream.FlowShape,akka.stream.FlowShape))​([FlowShape](FlowShape.html "class in akka.stream")<I1,​O1> top,  [FlowShape](FlowShape.html "class in akka.stream")<I2,​O2> bottom)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[In1](BidiShape.html "type parameter in BidiShape")>` | `[in1](#in1())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[In2](BidiShape.html "type parameter in BidiShape")>` | `[in2](#in2())()` |  |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` | Scala API: get a list of all input ports |
	| `static <In1,​Out1,​In2,​Out2>[BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2>` | `[of](#of(akka.stream.Inlet,akka.stream.Outlet,akka.stream.Inlet,akka.stream.Outlet))​([Inlet](Inlet.html "class in akka.stream")<In1> in1,  [Outlet](Outlet.html "class in akka.stream")<Out1> out1,  [Inlet](Inlet.html "class in akka.stream")<In2> in2,  [Outlet](Outlet.html "class in akka.stream")<Out2> out2)` | Java API |
	| `[Outlet](Outlet.html "class in akka.stream")<[Out1](BidiShape.html "type parameter in BidiShape")>` | `[out1](#out1())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[Out2](BidiShape.html "type parameter in BidiShape")>` | `[out2](#out2())()` |  |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` | Scala API: get a list of all output ports |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <In1,​Out1,​In2,​Out2>scala.Option<scala.Tuple4<[Inlet](Inlet.html "class in akka.stream")<In1>,​[Outlet](Outlet.html "class in akka.stream")<Out1>,​[Inlet](Inlet.html "class in akka.stream")<In2>,​[Outlet](Outlet.html "class in akka.stream")<Out2>>>` | `[unapply](#unapply(akka.stream.BidiShape))​([BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2> x$0)` |  |
	
	
		- ### Methods inherited from class akka.stream.[Shape](Shape.html "class in akka.stream")
		
		
		`[getInlets](Shape.html#getInlets()), [getOutlets](Shape.html#getOutlets()), [hasOnePort](Shape.html#hasOnePort(scala.collection.immutable.Seq)), [hasSamePortsAndShapeAs](Shape.html#hasSamePortsAndShapeAs(akka.stream.Shape)), [hasSamePortsAs](Shape.html#hasSamePortsAs(akka.stream.Shape)), [requireSamePortsAndShapeAs](Shape.html#requireSamePortsAndShapeAs(akka.stream.Shape)), [requireSamePortsAs](Shape.html#requireSamePortsAs(akka.stream.Shape))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### BidiShape
		
		
		
		```
		public BidiShape​([Inlet](Inlet.html "class in akka.stream")<[In1](BidiShape.html "type parameter in BidiShape")> in1,
		                 [Outlet](Outlet.html "class in akka.stream")<[Out1](BidiShape.html "type parameter in BidiShape")> out1,
		                 [Inlet](Inlet.html "class in akka.stream")<[In2](BidiShape.html "type parameter in BidiShape")> in2,
		                 [Outlet](Outlet.html "class in akka.stream")<[Out2](BidiShape.html "type parameter in BidiShape")> out2)
		```
		- #### BidiShape
		
		
		
		```
		public BidiShape​([FlowShape](FlowShape.html "class in akka.stream")<[In1](BidiShape.html "type parameter in BidiShape"),​[Out1](BidiShape.html "type parameter in BidiShape")> top,
		                 [FlowShape](FlowShape.html "class in akka.stream")<[In2](BidiShape.html "type parameter in BidiShape"),​[Out2](BidiShape.html "type parameter in BidiShape")> bottom)
		```
		
		Java API for creating from a pair of unidirectional flows.

	- ### Method Detail
	
	
	
		- #### fromFlows
		
		
		
		```
		public static <I1,​O1,​I2,​O2> [BidiShape](BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2> fromFlows​([FlowShape](FlowShape.html "class in akka.stream")<I1,​O1> top,
		                                                                                                 [FlowShape](FlowShape.html "class in akka.stream")<I2,​O2> bottom)
		```
		- #### of
		
		
		
		```
		public static <In1,​Out1,​In2,​Out2> [BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2> of​([Inlet](Inlet.html "class in akka.stream")<In1> in1,
		                                                                                                      [Outlet](Outlet.html "class in akka.stream")<Out1> out1,
		                                                                                                      [Inlet](Inlet.html "class in akka.stream")<In2> in2,
		                                                                                                      [Outlet](Outlet.html "class in akka.stream")<Out2> out2)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static <In1,​Out1,​In2,​Out2> [BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2> apply​([Inlet](Inlet.html "class in akka.stream")<In1> in1,
		                                                                                                         [Outlet](Outlet.html "class in akka.stream")<Out1> out1,
		                                                                                                         [Inlet](Inlet.html "class in akka.stream")<In2> in2,
		                                                                                                         [Outlet](Outlet.html "class in akka.stream")<Out2> out2)
		```
		- #### unapply
		
		
		
		```
		public static <In1,​Out1,​In2,​Out2> scala.Option<scala.Tuple4<[Inlet](Inlet.html "class in akka.stream")<In1>,​[Outlet](Outlet.html "class in akka.stream")<Out1>,​[Inlet](Inlet.html "class in akka.stream")<In2>,​[Outlet](Outlet.html "class in akka.stream")<Out2>>> unapply​([BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2> x$0)
		```
		- #### in1
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[In1](BidiShape.html "type parameter in BidiShape")> in1()
		```
		- #### out1
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[Out1](BidiShape.html "type parameter in BidiShape")> out1()
		```
		- #### in2
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[In2](BidiShape.html "type parameter in BidiShape")> in2()
		```
		- #### out2
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[Out2](BidiShape.html "type parameter in BidiShape")> out2()
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
		public [BidiShape](BidiShape.html "class in akka.stream")<[In1](BidiShape.html "type parameter in BidiShape"),​[Out1](BidiShape.html "type parameter in BidiShape"),​[In2](BidiShape.html "type parameter in BidiShape"),​[Out2](BidiShape.html "type parameter in BidiShape")> deepCopy()
		```
		
		Description copied from class: `[Shape](Shape.html#deepCopy())`
		Create a copy of this Shape object, returning the same type as the
		 original; this constraint can unfortunately not be expressed in the
		 type system.
		
		Specified by:
		`[deepCopy](Shape.html#deepCopy())` in class `[Shape](Shape.html "class in akka.stream")`
		- #### copy
		
		
		
		```
		public <In1,​Out1,​In2,​Out2> [BidiShape](BidiShape.html "class in akka.stream")<In1,​Out1,​In2,​Out2> copy​([Inlet](Inlet.html "class in akka.stream")<In1> in1,
		                                                                                                 [Outlet](Outlet.html "class in akka.stream")<Out1> out1,
		                                                                                                 [Inlet](Inlet.html "class in akka.stream")<In2> in2,
		                                                                                                 [Outlet](Outlet.html "class in akka.stream")<Out2> out2)
		```
		- #### copy$default$1
		
		
		
		```
		public <In1,​Out1,​In2,​Out2> [Inlet](Inlet.html "class in akka.stream")<In1> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <In1,​Out1,​In2,​Out2> [Outlet](Outlet.html "class in akka.stream")<Out1> copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <In1,​Out1,​In2,​Out2> [Inlet](Inlet.html "class in akka.stream")<In2> copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public <In1,​Out1,​In2,​Out2> [Outlet](Outlet.html "class in akka.stream")<Out2> copy$default$4()
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

## Code Examples

### Example 1: Class BidiShape<In1,​Out1,​In2,​Out2>

```text
+------+
  In1 ~>|      |~> Out1
        | bidi |
 Out2 <~|      |<~ In2
        +------+
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/BidiShape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/BidiShape.html](https://doc.akka.io/japi/akka-core/current/akka/stream/BidiShape.html)*