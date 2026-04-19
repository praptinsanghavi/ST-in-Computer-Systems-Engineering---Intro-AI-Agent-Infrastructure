---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple3.html
title: Tuple3
---

# Tuple3

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple3\<T1,​T2,​T3\>

- java.lang.Object
- - akka.japi.tuple.Tuple3\<T1,​T2,​T3\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Tuple3<T1,​T2,​T3>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple3)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple3](#%3Cinit%3E(T1,T2,T3))​([T1](Tuple3.html "type parameter in Tuple3") t1,  [T2](Tuple3.html "type parameter in Tuple3") t2,  [T3](Tuple3.html "type parameter in Tuple3") t3)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T1,​T2,​T3>[Tuple3](Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3>` | `[apply](#apply(T1,T2,T3))​(T1 t1,  T2 t2,  T3 t3)` | Java API Tuple container. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T1,​T2,​T3>[Tuple3](Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3>` | `[copy](#copy(T1,T2,T3))​(T1 t1,  T2 t2,  T3 t3)` |  |
	| `<T1,​T2,​T3>T1` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T1,​T2,​T3>T2` | `[copy$default$2](#copy$default$2())()` |  |
	| `<T1,​T2,​T3>T3` | `[copy$default$3](#copy$default$3())()` |  |
	| `static <T1,​T2,​T3>[Tuple3](Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3>` | `[create](#create(T1,T2,T3))​(T1 t1,  T2 t2,  T3 t3)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[T1](Tuple3.html "type parameter in Tuple3")` | `[t1](#t1())()` |  |
	| `[T2](Tuple3.html "type parameter in Tuple3")` | `[t2](#t2())()` |  |
	| `[T3](Tuple3.html "type parameter in Tuple3")` | `[t3](#t3())()` |  |
	| `scala.Tuple3<[T1](Tuple3.html "type parameter in Tuple3"),​[T2](Tuple3.html "type parameter in Tuple3"),​[T3](Tuple3.html "type parameter in Tuple3")>` | `[toScala](#toScala())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T1,​T2,​T3>scala.Option<scala.Tuple3<T1,​T2,​T3>>` | `[unapply](#unapply(akka.japi.tuple.Tuple3))​([Tuple3](Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Tuple3
		
		
		
		```
		public Tuple3​([T1](Tuple3.html "type parameter in Tuple3") t1,
		              [T2](Tuple3.html "type parameter in Tuple3") t2,
		              [T3](Tuple3.html "type parameter in Tuple3") t3)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T1,​T2,​T3> [Tuple3](Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3> create​(T1 t1,
		                                                                         T2 t2,
		                                                                         T3 t3)
		```
		- #### apply
		
		
		
		```
		public static <T1,​T2,​T3> [Tuple3](Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3> apply​(T1 t1,
		                                                                        T2 t2,
		                                                                        T3 t3)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public static <T1,​T2,​T3> scala.Option<scala.Tuple3<T1,​T2,​T3>> unapply​([Tuple3](Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3> x$0)
		```
		- #### t1
		
		
		
		```
		public [T1](Tuple3.html "type parameter in Tuple3") t1()
		```
		- #### t2
		
		
		
		```
		public [T2](Tuple3.html "type parameter in Tuple3") t2()
		```
		- #### t3
		
		
		
		```
		public [T3](Tuple3.html "type parameter in Tuple3") t3()
		```
		- #### toScala
		
		
		
		```
		public scala.Tuple3<[T1](Tuple3.html "type parameter in Tuple3"),​[T2](Tuple3.html "type parameter in Tuple3"),​[T3](Tuple3.html "type parameter in Tuple3")> toScala()
		```
		- #### copy
		
		
		
		```
		public <T1,​T2,​T3> [Tuple3](Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3> copy​(T1 t1,
		                                                                T2 t2,
		                                                                T3 t3)
		```
		- #### copy$default$1
		
		
		
		```
		public <T1,​T2,​T3> T1 copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <T1,​T2,​T3> T2 copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <T1,​T2,​T3> T3 copy$default$3()
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

- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple3.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple3.html](https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple3.html)*