---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple7.html
title: Tuple7
---

# Tuple7

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple7\<T1,​T2,​T3,​T4,​T5,​T6,​T7\>

- java.lang.Object
- - akka.japi.tuple.Tuple7\<T1,​T2,​T3,​T4,​T5,​T6,​T7\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple7)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple7](#%3Cinit%3E(T1,T2,T3,T4,T5,T6,T7))​([T1](Tuple7.html "type parameter in Tuple7") t1,  [T2](Tuple7.html "type parameter in Tuple7") t2,  [T3](Tuple7.html "type parameter in Tuple7") t3,  [T4](Tuple7.html "type parameter in Tuple7") t4,  [T5](Tuple7.html "type parameter in Tuple7") t5,  [T6](Tuple7.html "type parameter in Tuple7") t6,  [T7](Tuple7.html "type parameter in Tuple7") t7)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7>[Tuple7](Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7>` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7)` | Java API Tuple container. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7>[Tuple7](Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7>` | `[copy](#copy(T1,T2,T3,T4,T5,T6,T7))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7>T1` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7>T2` | `[copy$default$2](#copy$default$2())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7>T3` | `[copy$default$3](#copy$default$3())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7>T4` | `[copy$default$4](#copy$default$4())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7>T5` | `[copy$default$5](#copy$default$5())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7>T6` | `[copy$default$6](#copy$default$6())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7>T7` | `[copy$default$7](#copy$default$7())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7>[Tuple7](Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7>` | `[create](#create(T1,T2,T3,T4,T5,T6,T7))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[T1](Tuple7.html "type parameter in Tuple7")` | `[t1](#t1())()` |  |
	| `[T2](Tuple7.html "type parameter in Tuple7")` | `[t2](#t2())()` |  |
	| `[T3](Tuple7.html "type parameter in Tuple7")` | `[t3](#t3())()` |  |
	| `[T4](Tuple7.html "type parameter in Tuple7")` | `[t4](#t4())()` |  |
	| `[T5](Tuple7.html "type parameter in Tuple7")` | `[t5](#t5())()` |  |
	| `[T6](Tuple7.html "type parameter in Tuple7")` | `[t6](#t6())()` |  |
	| `[T7](Tuple7.html "type parameter in Tuple7")` | `[t7](#t7())()` |  |
	| `scala.Tuple7<[T1](Tuple7.html "type parameter in Tuple7"),​[T2](Tuple7.html "type parameter in Tuple7"),​[T3](Tuple7.html "type parameter in Tuple7"),​[T4](Tuple7.html "type parameter in Tuple7"),​[T5](Tuple7.html "type parameter in Tuple7"),​[T6](Tuple7.html "type parameter in Tuple7"),​[T7](Tuple7.html "type parameter in Tuple7")>` | `[toScala](#toScala())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7>scala.Option<scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>>` | `[unapply](#unapply(akka.japi.tuple.Tuple7))​([Tuple7](Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Tuple7
		
		
		
		```
		public Tuple7​([T1](Tuple7.html "type parameter in Tuple7") t1,
		              [T2](Tuple7.html "type parameter in Tuple7") t2,
		              [T3](Tuple7.html "type parameter in Tuple7") t3,
		              [T4](Tuple7.html "type parameter in Tuple7") t4,
		              [T5](Tuple7.html "type parameter in Tuple7") t5,
		              [T6](Tuple7.html "type parameter in Tuple7") t6,
		              [T7](Tuple7.html "type parameter in Tuple7") t7)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7> [Tuple7](Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7> create​(T1 t1,
		                                                                                                                                                 T2 t2,
		                                                                                                                                                 T3 t3,
		                                                                                                                                                 T4 t4,
		                                                                                                                                                 T5 t5,
		                                                                                                                                                 T6 t6,
		                                                                                                                                                 T7 t7)
		```
		- #### apply
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7> [Tuple7](Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7> apply​(T1 t1,
		                                                                                                                                                T2 t2,
		                                                                                                                                                T3 t3,
		                                                                                                                                                T4 t4,
		                                                                                                                                                T5 t5,
		                                                                                                                                                T6 t6,
		                                                                                                                                                T7 t7)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7> scala.Option<scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>> unapply​([Tuple7](Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7> x$0)
		```
		- #### t1
		
		
		
		```
		public [T1](Tuple7.html "type parameter in Tuple7") t1()
		```
		- #### t2
		
		
		
		```
		public [T2](Tuple7.html "type parameter in Tuple7") t2()
		```
		- #### t3
		
		
		
		```
		public [T3](Tuple7.html "type parameter in Tuple7") t3()
		```
		- #### t4
		
		
		
		```
		public [T4](Tuple7.html "type parameter in Tuple7") t4()
		```
		- #### t5
		
		
		
		```
		public [T5](Tuple7.html "type parameter in Tuple7") t5()
		```
		- #### t6
		
		
		
		```
		public [T6](Tuple7.html "type parameter in Tuple7") t6()
		```
		- #### t7
		
		
		
		```
		public [T7](Tuple7.html "type parameter in Tuple7") t7()
		```
		- #### toScala
		
		
		
		```
		public scala.Tuple7<[T1](Tuple7.html "type parameter in Tuple7"),​[T2](Tuple7.html "type parameter in Tuple7"),​[T3](Tuple7.html "type parameter in Tuple7"),​[T4](Tuple7.html "type parameter in Tuple7"),​[T5](Tuple7.html "type parameter in Tuple7"),​[T6](Tuple7.html "type parameter in Tuple7"),​[T7](Tuple7.html "type parameter in Tuple7")> toScala()
		```
		- #### copy
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7> [Tuple7](Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7> copy​(T1 t1,
		                                                                                                                                        T2 t2,
		                                                                                                                                        T3 t3,
		                                                                                                                                        T4 t4,
		                                                                                                                                        T5 t5,
		                                                                                                                                        T6 t6,
		                                                                                                                                        T7 t7)
		```
		- #### copy$default$1
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7> T1 copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7> T2 copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7> T3 copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7> T4 copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7> T5 copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7> T6 copy$default$6()
		```
		- #### copy$default$7
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7> T7 copy$default$7()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple7.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple7.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple7.html)*