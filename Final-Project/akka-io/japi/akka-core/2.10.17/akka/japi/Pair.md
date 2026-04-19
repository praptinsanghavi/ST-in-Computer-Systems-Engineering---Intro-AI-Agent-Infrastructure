---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:45:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair.html
title: Pair
---

# Pair

## Content

Package [akka.japi](package-summary.html)
## Class Pair\<A,​B\>

- java.lang.Object
- - akka.japi.Pair\<A,​B\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Pair<A,​B>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Java API
 Represents a pair (tuple) of two elements.
 
 Additional tuple types for 3 to 22 values are defined in the `akka.japi.tuple` package, e.g. [`Tuple3`](tuple/Tuple3.html "class in akka.japi.tuple").

See Also:
[Serialized Form](../../serialized-form.html#akka.japi.Pair)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Pair](#%3Cinit%3E(A,B))​([A](Pair.html "type parameter in Pair") first,  [B](Pair.html "type parameter in Pair") second)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A,​B>[Pair](Pair.html "class in akka.japi")<A,​B>` | `[apply](#apply(A,B))​(A first,  B second)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<A,​B>[Pair](Pair.html "class in akka.japi")<A,​B>` | `[copy](#copy(A,B))​(A first,  B second)` |  |
	| `<A,​B>A` | `[copy$default$1](#copy$default$1())()` |  |
	| `<A,​B>B` | `[copy$default$2](#copy$default$2())()` |  |
	| `static <A,​B>[Pair](Pair.html "class in akka.japi")<A,​B>` | `[create](#create(A,B))​(A first,  B second)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[A](Pair.html "type parameter in Pair")` | `[first](#first())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[B](Pair.html "type parameter in Pair")` | `[second](#second())()` |  |
	| `scala.Tuple2<[A](Pair.html "type parameter in Pair"),​[B](Pair.html "type parameter in Pair")>` | `[toScala](#toScala())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <A,​B>scala.Option<scala.Tuple2<A,​B>>` | `[unapply](#unapply(akka.japi.Pair))​([Pair](Pair.html "class in akka.japi")<A,​B> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Pair
		
		
		
		```
		public Pair​([A](Pair.html "type parameter in Pair") first,
		            [B](Pair.html "type parameter in Pair") second)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <A,​B> [Pair](Pair.html "class in akka.japi")<A,​B> create​(A first,
		                                                 B second)
		```
		- #### apply
		
		
		
		```
		public static <A,​B> [Pair](Pair.html "class in akka.japi")<A,​B> apply​(A first,
		                                                B second)
		```
		- #### unapply
		
		
		
		```
		public static <A,​B> scala.Option<scala.Tuple2<A,​B>> unapply​([Pair](Pair.html "class in akka.japi")<A,​B> x$0)
		```
		- #### first
		
		
		
		```
		public [A](Pair.html "type parameter in Pair") first()
		```
		- #### second
		
		
		
		```
		public [B](Pair.html "type parameter in Pair") second()
		```
		- #### toScala
		
		
		
		```
		public scala.Tuple2<[A](Pair.html "type parameter in Pair"),​[B](Pair.html "type parameter in Pair")> toScala()
		```
		- #### copy
		
		
		
		```
		public <A,​B> [Pair](Pair.html "class in akka.japi")<A,​B> copy​(A first,
		                                        B second)
		```
		- #### copy$default$1
		
		
		
		```
		public <A,​B> A copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <A,​B> B copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple3.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair.html)*