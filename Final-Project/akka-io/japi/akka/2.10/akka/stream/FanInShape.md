---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports.html
title: FanInShape.Ports
---

# FanInShape.Ports

## Content

Package [akka.stream](package-summary.html)
## Class FanInShape.Ports\<O\>

- java.lang.Object
- - akka.stream.FanInShape.Ports\<O\>

- All Implemented Interfaces:
`[FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<O>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[FanInShape](FanInShape.html "class in akka.stream")\<[O](FanInShape.html "type parameter in FanInShape")\>

---

```
public static final class FanInShape.Ports<O>
extends java.lang.Object
implements [FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<O>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.FanInShape.Ports)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Ports](#%3Cinit%3E(akka.stream.Outlet,scala.collection.immutable.Seq))​([Outlet](Outlet.html "class in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")> outlet,  scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<O> [FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<O>` | `[copy](#copy(akka.stream.Outlet,scala.collection.immutable.Seq))​([Outlet](Outlet.html "class in akka.stream")<O> outlet,  scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets)` |  |
	| `<O> [Outlet](Outlet.html "class in akka.stream")<O>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<O> scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>` | `[inlets](#inlets())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `[Outlet](Outlet.html "class in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")>` | `[outlet](#outlet())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Ports
		
		
		
		```
		public Ports​([Outlet](Outlet.html "class in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")> outlet,
		             scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets)
		```

	- ### Method Detail
	
	
	
		- #### outlet
		
		
		
		```
		public [Outlet](Outlet.html "class in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")> outlet()
		```
		
		
		Specified by:
		`[outlet](FanInShape.Init.html#outlet())` in interface `[FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")>`
		- #### inlets
		
		
		
		```
		public scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets()
		```
		
		
		Specified by:
		`[inlets](FanInShape.Init.html#inlets())` in interface `[FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")>`
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		
		Specified by:
		`[name](FanInShape.Init.html#name())` in interface `[FanInShape.Init](FanInShape.Init.html "interface in akka.stream")<[O](FanInShape.Ports.html "type parameter in FanInShape.Ports")>`
		- #### copy
		
		
		
		```
		public <O> [FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")<O> copy​([Outlet](Outlet.html "class in akka.stream")<O> outlet,
		                                    scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets)
		```
		- #### copy$default$1
		
		
		
		```
		public <O> [Outlet](Outlet.html "class in akka.stream")<O> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <O> scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> copy$default$2()
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

- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Init.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports.html](https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape.Ports.html)*