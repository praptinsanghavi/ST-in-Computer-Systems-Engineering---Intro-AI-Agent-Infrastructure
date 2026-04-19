---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple4.html
title: Tuple4
---

# Tuple4

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple4\<T1,​T2,​T3,​T4\>

- java.lang.Object
- - akka.japi.tuple.Tuple4\<T1,​T2,​T3,​T4\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Tuple4<T1,​T2,​T3,​T4>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple4)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple4](#%3Cinit%3E(T1,T2,T3,T4))​([T1](Tuple4.html "type parameter in Tuple4") t1,  [T2](Tuple4.html "type parameter in Tuple4") t2,  [T3](Tuple4.html "type parameter in Tuple4") t3,  [T4](Tuple4.html "type parameter in Tuple4") t4)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T1,​T2,​T3,​T4>[Tuple4](Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4>` | `[apply](#apply(T1,T2,T3,T4))​(T1 t1,  T2 t2,  T3 t3,  T4 t4)` | Java API Tuple container. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T1,​T2,​T3,​T4>[Tuple4](Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4>` | `[copy](#copy(T1,T2,T3,T4))​(T1 t1,  T2 t2,  T3 t3,  T4 t4)` |  |
	| `<T1,​T2,​T3,​T4>T1` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T1,​T2,​T3,​T4>T2` | `[copy$default$2](#copy$default$2())()` |  |
	| `<T1,​T2,​T3,​T4>T3` | `[copy$default$3](#copy$default$3())()` |  |
	| `<T1,​T2,​T3,​T4>T4` | `[copy$default$4](#copy$default$4())()` |  |
	| `static <T1,​T2,​T3,​T4>[Tuple4](Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4>` | `[create](#create(T1,T2,T3,T4))​(T1 t1,  T2 t2,  T3 t3,  T4 t4)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[T1](Tuple4.html "type parameter in Tuple4")` | `[t1](#t1())()` |  |
	| `[T2](Tuple4.html "type parameter in Tuple4")` | `[t2](#t2())()` |  |
	| `[T3](Tuple4.html "type parameter in Tuple4")` | `[t3](#t3())()` |  |
	| `[T4](Tuple4.html "type parameter in Tuple4")` | `[t4](#t4())()` |  |
	| `scala.Tuple4<[T1](Tuple4.html "type parameter in Tuple4"),​[T2](Tuple4.html "type parameter in Tuple4"),​[T3](Tuple4.html "type parameter in Tuple4"),​[T4](Tuple4.html "type parameter in Tuple4")>` | `[toScala](#toScala())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T1,​T2,​T3,​T4>scala.Option<scala.Tuple4<T1,​T2,​T3,​T4>>` | `[unapply](#unapply(akka.japi.tuple.Tuple4))​([Tuple4](Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Tuple4
		
		
		
		```
		public Tuple4​([T1](Tuple4.html "type parameter in Tuple4") t1,
		              [T2](Tuple4.html "type parameter in Tuple4") t2,
		              [T3](Tuple4.html "type parameter in Tuple4") t3,
		              [T4](Tuple4.html "type parameter in Tuple4") t4)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T1,​T2,​T3,​T4> [Tuple4](Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4> create​(T1 t1,
		                                                                                           T2 t2,
		                                                                                           T3 t3,
		                                                                                           T4 t4)
		```
		- #### apply
		
		
		
		```
		public static <T1,​T2,​T3,​T4> [Tuple4](Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4> apply​(T1 t1,
		                                                                                          T2 t2,
		                                                                                          T3 t3,
		                                                                                          T4 t4)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public static <T1,​T2,​T3,​T4> scala.Option<scala.Tuple4<T1,​T2,​T3,​T4>> unapply​([Tuple4](Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4> x$0)
		```
		- #### t1
		
		
		
		```
		public [T1](Tuple4.html "type parameter in Tuple4") t1()
		```
		- #### t2
		
		
		
		```
		public [T2](Tuple4.html "type parameter in Tuple4") t2()
		```
		- #### t3
		
		
		
		```
		public [T3](Tuple4.html "type parameter in Tuple4") t3()
		```
		- #### t4
		
		
		
		```
		public [T4](Tuple4.html "type parameter in Tuple4") t4()
		```
		- #### toScala
		
		
		
		```
		public scala.Tuple4<[T1](Tuple4.html "type parameter in Tuple4"),​[T2](Tuple4.html "type parameter in Tuple4"),​[T3](Tuple4.html "type parameter in Tuple4"),​[T4](Tuple4.html "type parameter in Tuple4")> toScala()
		```
		- #### copy
		
		
		
		```
		public <T1,​T2,​T3,​T4> [Tuple4](Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4> copy​(T1 t1,
		                                                                                  T2 t2,
		                                                                                  T3 t3,
		                                                                                  T4 t4)
		```
		- #### copy$default$1
		
		
		
		```
		public <T1,​T2,​T3,​T4> T1 copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <T1,​T2,​T3,​T4> T2 copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <T1,​T2,​T3,​T4> T3 copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public <T1,​T2,​T3,​T4> T4 copy$default$4()
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

- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple4.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple4.html](https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple4.html)*