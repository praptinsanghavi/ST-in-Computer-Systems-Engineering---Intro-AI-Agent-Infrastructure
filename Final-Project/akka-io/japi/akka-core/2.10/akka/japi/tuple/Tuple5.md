---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple5.html
title: Tuple5
---

# Tuple5

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple5\<T1,​T2,​T3,​T4,​T5\>

- java.lang.Object
- - akka.japi.tuple.Tuple5\<T1,​T2,​T3,​T4,​T5\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Tuple5<T1,​T2,​T3,​T4,​T5>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple5)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple5](#%3Cinit%3E(T1,T2,T3,T4,T5))​([T1](Tuple5.html "type parameter in Tuple5") t1,  [T2](Tuple5.html "type parameter in Tuple5") t2,  [T3](Tuple5.html "type parameter in Tuple5") t3,  [T4](Tuple5.html "type parameter in Tuple5") t4,  [T5](Tuple5.html "type parameter in Tuple5") t5)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T1,​T2,​T3,​T4,​T5>[Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5>` | `[apply](#apply(T1,T2,T3,T4,T5))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5)` | Java API Tuple container. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T1,​T2,​T3,​T4,​T5>[Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5>` | `[copy](#copy(T1,T2,T3,T4,T5))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5)` |  |
	| `<T1,​T2,​T3,​T4,​T5>T1` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T1,​T2,​T3,​T4,​T5>T2` | `[copy$default$2](#copy$default$2())()` |  |
	| `<T1,​T2,​T3,​T4,​T5>T3` | `[copy$default$3](#copy$default$3())()` |  |
	| `<T1,​T2,​T3,​T4,​T5>T4` | `[copy$default$4](#copy$default$4())()` |  |
	| `<T1,​T2,​T3,​T4,​T5>T5` | `[copy$default$5](#copy$default$5())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5>[Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5>` | `[create](#create(T1,T2,T3,T4,T5))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[T1](Tuple5.html "type parameter in Tuple5")` | `[t1](#t1())()` |  |
	| `[T2](Tuple5.html "type parameter in Tuple5")` | `[t2](#t2())()` |  |
	| `[T3](Tuple5.html "type parameter in Tuple5")` | `[t3](#t3())()` |  |
	| `[T4](Tuple5.html "type parameter in Tuple5")` | `[t4](#t4())()` |  |
	| `[T5](Tuple5.html "type parameter in Tuple5")` | `[t5](#t5())()` |  |
	| `scala.Tuple5<[T1](Tuple5.html "type parameter in Tuple5"),​[T2](Tuple5.html "type parameter in Tuple5"),​[T3](Tuple5.html "type parameter in Tuple5"),​[T4](Tuple5.html "type parameter in Tuple5"),​[T5](Tuple5.html "type parameter in Tuple5")>` | `[toScala](#toScala())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5>scala.Option<scala.Tuple5<T1,​T2,​T3,​T4,​T5>>` | `[unapply](#unapply(akka.japi.tuple.Tuple5))​([Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Tuple5
		
		
		
		```
		public Tuple5​([T1](Tuple5.html "type parameter in Tuple5") t1,
		              [T2](Tuple5.html "type parameter in Tuple5") t2,
		              [T3](Tuple5.html "type parameter in Tuple5") t3,
		              [T4](Tuple5.html "type parameter in Tuple5") t4,
		              [T5](Tuple5.html "type parameter in Tuple5") t5)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5> [Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5> create​(T1 t1,
		                                                                                                             T2 t2,
		                                                                                                             T3 t3,
		                                                                                                             T4 t4,
		                                                                                                             T5 t5)
		```
		- #### apply
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5> [Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5> apply​(T1 t1,
		                                                                                                            T2 t2,
		                                                                                                            T3 t3,
		                                                                                                            T4 t4,
		                                                                                                            T5 t5)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5> scala.Option<scala.Tuple5<T1,​T2,​T3,​T4,​T5>> unapply​([Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5> x$0)
		```
		- #### t1
		
		
		
		```
		public [T1](Tuple5.html "type parameter in Tuple5") t1()
		```
		- #### t2
		
		
		
		```
		public [T2](Tuple5.html "type parameter in Tuple5") t2()
		```
		- #### t3
		
		
		
		```
		public [T3](Tuple5.html "type parameter in Tuple5") t3()
		```
		- #### t4
		
		
		
		```
		public [T4](Tuple5.html "type parameter in Tuple5") t4()
		```
		- #### t5
		
		
		
		```
		public [T5](Tuple5.html "type parameter in Tuple5") t5()
		```
		- #### toScala
		
		
		
		```
		public scala.Tuple5<[T1](Tuple5.html "type parameter in Tuple5"),​[T2](Tuple5.html "type parameter in Tuple5"),​[T3](Tuple5.html "type parameter in Tuple5"),​[T4](Tuple5.html "type parameter in Tuple5"),​[T5](Tuple5.html "type parameter in Tuple5")> toScala()
		```
		- #### copy
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5> [Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5> copy​(T1 t1,
		                                                                                                    T2 t2,
		                                                                                                    T3 t3,
		                                                                                                    T4 t4,
		                                                                                                    T5 t5)
		```
		- #### copy$default$1
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5> T1 copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5> T2 copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5> T3 copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5> T4 copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5> T5 copy$default$5()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple5.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple5.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple5.html)*