---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:01:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Ports.html
title: FanOutShape.Ports
---

# FanOutShape.Ports

## Content

Package [akka.stream](package-summary.html)
## Class FanOutShape.Ports\<I\>

- java.lang.Object
- - akka.stream.FanOutShape.Ports\<I\>

- All Implemented Interfaces:
`[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<I>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[FanOutShape](FanOutShape.html "class in akka.stream")\<[I](FanOutShape.html "type parameter in FanOutShape")\>

---

```
public static final class FanOutShape.Ports<I>
extends java.lang.Object
implements [FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<I>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.FanOutShape.Ports)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Ports](#%3Cinit%3E(akka.stream.Inlet,scala.collection.immutable.Seq))​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")> inlet,  scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<I> [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<I>` | `[copy](#copy(akka.stream.Inlet,scala.collection.immutable.Seq))​([Inlet](Inlet.html "class in akka.stream")<I> inlet,  scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)` |  |
	| `<I> [Inlet](Inlet.html "class in akka.stream")<I>` | `[copy$default$1](#copy$default$1())()` |  |
	| `<I> scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>` | `[inlet](#inlet())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>` | `[outlets](#outlets())()` |  |
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
		public Ports​([Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")> inlet,
		             scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)
		```

	- ### Method Detail
	
	
	
		- #### inlet
		
		
		
		```
		public [Inlet](Inlet.html "class in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")> inlet()
		```
		
		
		Specified by:
		`[inlet](FanOutShape.Init.html#inlet())` in interface `[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>`
		- #### outlets
		
		
		
		```
		public scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets()
		```
		
		
		Specified by:
		`[outlets](FanOutShape.Init.html#outlets())` in interface `[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>`
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		
		Specified by:
		`[name](FanOutShape.Init.html#name())` in interface `[FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")<[I](FanOutShape.Ports.html "type parameter in FanOutShape.Ports")>`
		- #### copy
		
		
		
		```
		public <I> [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")<I> copy​([Inlet](Inlet.html "class in akka.stream")<I> inlet,
		                                     scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)
		```
		- #### copy$default$1
		
		
		
		```
		public <I> [Inlet](Inlet.html "class in akka.stream")<I> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <I> scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> copy$default$2()
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

- https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Init.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Ports.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Ports.html](https://doc.akka.io/japi/akka-core/current/akka/stream/FanOutShape.Ports.html)*