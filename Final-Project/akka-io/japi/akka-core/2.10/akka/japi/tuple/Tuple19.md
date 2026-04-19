---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple19.html
title: Tuple19
---

# Tuple19

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple19\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19\>

- java.lang.Object
- - akka.japi.tuple.Tuple19\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple19)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple19](#%3Cinit%3E(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19))​([T1](Tuple19.html "type parameter in Tuple19") t1,  [T2](Tuple19.html "type parameter in Tuple19") t2,  [T3](Tuple19.html "type parameter in Tuple19") t3,  [T4](Tuple19.html "type parameter in Tuple19") t4,  [T5](Tuple19.html "type parameter in Tuple19") t5,  [T6](Tuple19.html "type parameter in Tuple19") t6,  [T7](Tuple19.html "type parameter in Tuple19") t7,  [T8](Tuple19.html "type parameter in Tuple19") t8,  [T9](Tuple19.html "type parameter in Tuple19") t9,  [T10](Tuple19.html "type parameter in Tuple19") t10,  [T11](Tuple19.html "type parameter in Tuple19") t11,  [T12](Tuple19.html "type parameter in Tuple19") t12,  [T13](Tuple19.html "type parameter in Tuple19") t13,  [T14](Tuple19.html "type parameter in Tuple19") t14,  [T15](Tuple19.html "type parameter in Tuple19") t15,  [T16](Tuple19.html "type parameter in Tuple19") t16,  [T17](Tuple19.html "type parameter in Tuple19") t17,  [T18](Tuple19.html "type parameter in Tuple19") t18,  [T19](Tuple19.html "type parameter in Tuple19") t19)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>[Tuple19](Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14,  T15 t15,  T16 t16,  T17 t17,  T18 t18,  T19 t19)` | Java API Tuple container. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>[Tuple19](Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>` | `[copy](#copy(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14,  T15 t15,  T16 t16,  T17 t17,  T18 t18,  T19 t19)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T1` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T10` | `[copy$default$10](#copy$default$10())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T11` | `[copy$default$11](#copy$default$11())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T12` | `[copy$default$12](#copy$default$12())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T13` | `[copy$default$13](#copy$default$13())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T14` | `[copy$default$14](#copy$default$14())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T15` | `[copy$default$15](#copy$default$15())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T16` | `[copy$default$16](#copy$default$16())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T17` | `[copy$default$17](#copy$default$17())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T18` | `[copy$default$18](#copy$default$18())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T19` | `[copy$default$19](#copy$default$19())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T2` | `[copy$default$2](#copy$default$2())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T3` | `[copy$default$3](#copy$default$3())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T4` | `[copy$default$4](#copy$default$4())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T5` | `[copy$default$5](#copy$default$5())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T6` | `[copy$default$6](#copy$default$6())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T7` | `[copy$default$7](#copy$default$7())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T8` | `[copy$default$8](#copy$default$8())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>T9` | `[copy$default$9](#copy$default$9())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>[Tuple19](Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>` | `[create](#create(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14,  T15 t15,  T16 t16,  T17 t17,  T18 t18,  T19 t19)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[T1](Tuple19.html "type parameter in Tuple19")` | `[t1](#t1())()` |  |
	| `[T10](Tuple19.html "type parameter in Tuple19")` | `[t10](#t10())()` |  |
	| `[T11](Tuple19.html "type parameter in Tuple19")` | `[t11](#t11())()` |  |
	| `[T12](Tuple19.html "type parameter in Tuple19")` | `[t12](#t12())()` |  |
	| `[T13](Tuple19.html "type parameter in Tuple19")` | `[t13](#t13())()` |  |
	| `[T14](Tuple19.html "type parameter in Tuple19")` | `[t14](#t14())()` |  |
	| `[T15](Tuple19.html "type parameter in Tuple19")` | `[t15](#t15())()` |  |
	| `[T16](Tuple19.html "type parameter in Tuple19")` | `[t16](#t16())()` |  |
	| `[T17](Tuple19.html "type parameter in Tuple19")` | `[t17](#t17())()` |  |
	| `[T18](Tuple19.html "type parameter in Tuple19")` | `[t18](#t18())()` |  |
	| `[T19](Tuple19.html "type parameter in Tuple19")` | `[t19](#t19())()` |  |
	| `[T2](Tuple19.html "type parameter in Tuple19")` | `[t2](#t2())()` |  |
	| `[T3](Tuple19.html "type parameter in Tuple19")` | `[t3](#t3())()` |  |
	| `[T4](Tuple19.html "type parameter in Tuple19")` | `[t4](#t4())()` |  |
	| `[T5](Tuple19.html "type parameter in Tuple19")` | `[t5](#t5())()` |  |
	| `[T6](Tuple19.html "type parameter in Tuple19")` | `[t6](#t6())()` |  |
	| `[T7](Tuple19.html "type parameter in Tuple19")` | `[t7](#t7())()` |  |
	| `[T8](Tuple19.html "type parameter in Tuple19")` | `[t8](#t8())()` |  |
	| `[T9](Tuple19.html "type parameter in Tuple19")` | `[t9](#t9())()` |  |
	| `scala.Tuple19<[T1](Tuple19.html "type parameter in Tuple19"),​[T2](Tuple19.html "type parameter in Tuple19"),​[T3](Tuple19.html "type parameter in Tuple19"),​[T4](Tuple19.html "type parameter in Tuple19"),​[T5](Tuple19.html "type parameter in Tuple19"),​[T6](Tuple19.html "type parameter in Tuple19"),​[T7](Tuple19.html "type parameter in Tuple19"),​[T8](Tuple19.html "type parameter in Tuple19"),​[T9](Tuple19.html "type parameter in Tuple19"),​[T10](Tuple19.html "type parameter in Tuple19"),​[T11](Tuple19.html "type parameter in Tuple19"),​[T12](Tuple19.html "type parameter in Tuple19"),​[T13](Tuple19.html "type parameter in Tuple19"),​[T14](Tuple19.html "type parameter in Tuple19"),​[T15](Tuple19.html "type parameter in Tuple19"),​[T16](Tuple19.html "type parameter in Tuple19"),​[T17](Tuple19.html "type parameter in Tuple19"),​[T18](Tuple19.html "type parameter in Tuple19"),​[T19](Tuple19.html "type parameter in Tuple19")>` | `[toScala](#toScala())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>scala.Option<scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>>` | `[unapply](#unapply(akka.japi.tuple.Tuple19))​([Tuple19](Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Tuple19
		
		
		
		```
		public Tuple19​([T1](Tuple19.html "type parameter in Tuple19") t1,
		               [T2](Tuple19.html "type parameter in Tuple19") t2,
		               [T3](Tuple19.html "type parameter in Tuple19") t3,
		               [T4](Tuple19.html "type parameter in Tuple19") t4,
		               [T5](Tuple19.html "type parameter in Tuple19") t5,
		               [T6](Tuple19.html "type parameter in Tuple19") t6,
		               [T7](Tuple19.html "type parameter in Tuple19") t7,
		               [T8](Tuple19.html "type parameter in Tuple19") t8,
		               [T9](Tuple19.html "type parameter in Tuple19") t9,
		               [T10](Tuple19.html "type parameter in Tuple19") t10,
		               [T11](Tuple19.html "type parameter in Tuple19") t11,
		               [T12](Tuple19.html "type parameter in Tuple19") t12,
		               [T13](Tuple19.html "type parameter in Tuple19") t13,
		               [T14](Tuple19.html "type parameter in Tuple19") t14,
		               [T15](Tuple19.html "type parameter in Tuple19") t15,
		               [T16](Tuple19.html "type parameter in Tuple19") t16,
		               [T17](Tuple19.html "type parameter in Tuple19") t17,
		               [T18](Tuple19.html "type parameter in Tuple19") t18,
		               [T19](Tuple19.html "type parameter in Tuple19") t19)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> [Tuple19](Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> create​(T1 t1,
		                                                                                                                                                                                                                                                                                                                                                                                              T2 t2,
		                                                                                                                                                                                                                                                                                                                                                                                              T3 t3,
		                                                                                                                                                                                                                                                                                                                                                                                              T4 t4,
		                                                                                                                                                                                                                                                                                                                                                                                              T5 t5,
		                                                                                                                                                                                                                                                                                                                                                                                              T6 t6,
		                                                                                                                                                                                                                                                                                                                                                                                              T7 t7,
		                                                                                                                                                                                                                                                                                                                                                                                              T8 t8,
		                                                                                                                                                                                                                                                                                                                                                                                              T9 t9,
		                                                                                                                                                                                                                                                                                                                                                                                              T10 t10,
		                                                                                                                                                                                                                                                                                                                                                                                              T11 t11,
		                                                                                                                                                                                                                                                                                                                                                                                              T12 t12,
		                                                                                                                                                                                                                                                                                                                                                                                              T13 t13,
		                                                                                                                                                                                                                                                                                                                                                                                              T14 t14,
		                                                                                                                                                                                                                                                                                                                                                                                              T15 t15,
		                                                                                                                                                                                                                                                                                                                                                                                              T16 t16,
		                                                                                                                                                                                                                                                                                                                                                                                              T17 t17,
		                                                                                                                                                                                                                                                                                                                                                                                              T18 t18,
		                                                                                                                                                                                                                                                                                                                                                                                              T19 t19)
		```
		- #### apply
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> [Tuple19](Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> apply​(T1 t1,
		                                                                                                                                                                                                                                                                                                                                                                                             T2 t2,
		                                                                                                                                                                                                                                                                                                                                                                                             T3 t3,
		                                                                                                                                                                                                                                                                                                                                                                                             T4 t4,
		                                                                                                                                                                                                                                                                                                                                                                                             T5 t5,
		                                                                                                                                                                                                                                                                                                                                                                                             T6 t6,
		                                                                                                                                                                                                                                                                                                                                                                                             T7 t7,
		                                                                                                                                                                                                                                                                                                                                                                                             T8 t8,
		                                                                                                                                                                                                                                                                                                                                                                                             T9 t9,
		                                                                                                                                                                                                                                                                                                                                                                                             T10 t10,
		                                                                                                                                                                                                                                                                                                                                                                                             T11 t11,
		                                                                                                                                                                                                                                                                                                                                                                                             T12 t12,
		                                                                                                                                                                                                                                                                                                                                                                                             T13 t13,
		                                                                                                                                                                                                                                                                                                                                                                                             T14 t14,
		                                                                                                                                                                                                                                                                                                                                                                                             T15 t15,
		                                                                                                                                                                                                                                                                                                                                                                                             T16 t16,
		                                                                                                                                                                                                                                                                                                                                                                                             T17 t17,
		                                                                                                                                                                                                                                                                                                                                                                                             T18 t18,
		                                                                                                                                                                                                                                                                                                                                                                                             T19 t19)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> scala.Option<scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>> unapply​([Tuple19](Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> x$0)
		```
		- #### t1
		
		
		
		```
		public [T1](Tuple19.html "type parameter in Tuple19") t1()
		```
		- #### t2
		
		
		
		```
		public [T2](Tuple19.html "type parameter in Tuple19") t2()
		```
		- #### t3
		
		
		
		```
		public [T3](Tuple19.html "type parameter in Tuple19") t3()
		```
		- #### t4
		
		
		
		```
		public [T4](Tuple19.html "type parameter in Tuple19") t4()
		```
		- #### t5
		
		
		
		```
		public [T5](Tuple19.html "type parameter in Tuple19") t5()
		```
		- #### t6
		
		
		
		```
		public [T6](Tuple19.html "type parameter in Tuple19") t6()
		```
		- #### t7
		
		
		
		```
		public [T7](Tuple19.html "type parameter in Tuple19") t7()
		```
		- #### t8
		
		
		
		```
		public [T8](Tuple19.html "type parameter in Tuple19") t8()
		```
		- #### t9
		
		
		
		```
		public [T9](Tuple19.html "type parameter in Tuple19") t9()
		```
		- #### t10
		
		
		
		```
		public [T10](Tuple19.html "type parameter in Tuple19") t10()
		```
		- #### t11
		
		
		
		```
		public [T11](Tuple19.html "type parameter in Tuple19") t11()
		```
		- #### t12
		
		
		
		```
		public [T12](Tuple19.html "type parameter in Tuple19") t12()
		```
		- #### t13
		
		
		
		```
		public [T13](Tuple19.html "type parameter in Tuple19") t13()
		```
		- #### t14
		
		
		
		```
		public [T14](Tuple19.html "type parameter in Tuple19") t14()
		```
		- #### t15
		
		
		
		```
		public [T15](Tuple19.html "type parameter in Tuple19") t15()
		```
		- #### t16
		
		
		
		```
		public [T16](Tuple19.html "type parameter in Tuple19") t16()
		```
		- #### t17
		
		
		
		```
		public [T17](Tuple19.html "type parameter in Tuple19") t17()
		```
		- #### t18
		
		
		
		```
		public [T18](Tuple19.html "type parameter in Tuple19") t18()
		```
		- #### t19
		
		
		
		```
		public [T19](Tuple19.html "type parameter in Tuple19") t19()
		```
		- #### toScala
		
		
		
		```
		public scala.Tuple19<[T1](Tuple19.html "type parameter in Tuple19"),​[T2](Tuple19.html "type parameter in Tuple19"),​[T3](Tuple19.html "type parameter in Tuple19"),​[T4](Tuple19.html "type parameter in Tuple19"),​[T5](Tuple19.html "type parameter in Tuple19"),​[T6](Tuple19.html "type parameter in Tuple19"),​[T7](Tuple19.html "type parameter in Tuple19"),​[T8](Tuple19.html "type parameter in Tuple19"),​[T9](Tuple19.html "type parameter in Tuple19"),​[T10](Tuple19.html "type parameter in Tuple19"),​[T11](Tuple19.html "type parameter in Tuple19"),​[T12](Tuple19.html "type parameter in Tuple19"),​[T13](Tuple19.html "type parameter in Tuple19"),​[T14](Tuple19.html "type parameter in Tuple19"),​[T15](Tuple19.html "type parameter in Tuple19"),​[T16](Tuple19.html "type parameter in Tuple19"),​[T17](Tuple19.html "type parameter in Tuple19"),​[T18](Tuple19.html "type parameter in Tuple19"),​[T19](Tuple19.html "type parameter in Tuple19")> toScala()
		```
		- #### copy
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> [Tuple19](Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> copy​(T1 t1,
		                                                                                                                                                                                                                                                                                                                                                                                     T2 t2,
		                                                                                                                                                                                                                                                                                                                                                                                     T3 t3,
		                                                                                                                                                                                                                                                                                                                                                                                     T4 t4,
		                                                                                                                                                                                                                                                                                                                                                                                     T5 t5,
		                                                                                                                                                                                                                                                                                                                                                                                     T6 t6,
		                                                                                                                                                                                                                                                                                                                                                                                     T7 t7,
		                                                                                                                                                                                                                                                                                                                                                                                     T8 t8,
		                                                                                                                                                                                                                                                                                                                                                                                     T9 t9,
		                                                                                                                                                                                                                                                                                                                                                                                     T10 t10,
		                                                                                                                                                                                                                                                                                                                                                                                     T11 t11,
		                                                                                                                                                                                                                                                                                                                                                                                     T12 t12,
		                                                                                                                                                                                                                                                                                                                                                                                     T13 t13,
		                                                                                                                                                                                                                                                                                                                                                                                     T14 t14,
		                                                                                                                                                                                                                                                                                                                                                                                     T15 t15,
		                                                                                                                                                                                                                                                                                                                                                                                     T16 t16,
		                                                                                                                                                                                                                                                                                                                                                                                     T17 t17,
		                                                                                                                                                                                                                                                                                                                                                                                     T18 t18,
		                                                                                                                                                                                                                                                                                                                                                                                     T19 t19)
		```
		- #### copy$default$1
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T1 copy$default$1()
		```
		- #### copy$default$10
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T10 copy$default$10()
		```
		- #### copy$default$11
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T11 copy$default$11()
		```
		- #### copy$default$12
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T12 copy$default$12()
		```
		- #### copy$default$13
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T13 copy$default$13()
		```
		- #### copy$default$14
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T14 copy$default$14()
		```
		- #### copy$default$15
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T15 copy$default$15()
		```
		- #### copy$default$16
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T16 copy$default$16()
		```
		- #### copy$default$17
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T17 copy$default$17()
		```
		- #### copy$default$18
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T18 copy$default$18()
		```
		- #### copy$default$19
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T19 copy$default$19()
		```
		- #### copy$default$2
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T2 copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T3 copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T4 copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T5 copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T6 copy$default$6()
		```
		- #### copy$default$7
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T7 copy$default$7()
		```
		- #### copy$default$8
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T8 copy$default$8()
		```
		- #### copy$default$9
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> T9 copy$default$9()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple19.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple19.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple19.html)*