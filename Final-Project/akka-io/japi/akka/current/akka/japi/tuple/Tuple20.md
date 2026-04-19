---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple20.html
title: Tuple20
---

# Tuple20

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple20\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20\>

- java.lang.Object
- - akka.japi.tuple.Tuple20\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple20)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple20](#%3Cinit%3E(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20))​([T1](Tuple20.html "type parameter in Tuple20") t1,  [T2](Tuple20.html "type parameter in Tuple20") t2,  [T3](Tuple20.html "type parameter in Tuple20") t3,  [T4](Tuple20.html "type parameter in Tuple20") t4,  [T5](Tuple20.html "type parameter in Tuple20") t5,  [T6](Tuple20.html "type parameter in Tuple20") t6,  [T7](Tuple20.html "type parameter in Tuple20") t7,  [T8](Tuple20.html "type parameter in Tuple20") t8,  [T9](Tuple20.html "type parameter in Tuple20") t9,  [T10](Tuple20.html "type parameter in Tuple20") t10,  [T11](Tuple20.html "type parameter in Tuple20") t11,  [T12](Tuple20.html "type parameter in Tuple20") t12,  [T13](Tuple20.html "type parameter in Tuple20") t13,  [T14](Tuple20.html "type parameter in Tuple20") t14,  [T15](Tuple20.html "type parameter in Tuple20") t15,  [T16](Tuple20.html "type parameter in Tuple20") t16,  [T17](Tuple20.html "type parameter in Tuple20") t17,  [T18](Tuple20.html "type parameter in Tuple20") t18,  [T19](Tuple20.html "type parameter in Tuple20") t19,  [T20](Tuple20.html "type parameter in Tuple20") t20)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>[Tuple20](Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14,  T15 t15,  T16 t16,  T17 t17,  T18 t18,  T19 t19,  T20 t20)` | Java API Tuple container. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>[Tuple20](Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>` | `[copy](#copy(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14,  T15 t15,  T16 t16,  T17 t17,  T18 t18,  T19 t19,  T20 t20)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T1` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T10` | `[copy$default$10](#copy$default$10())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T11` | `[copy$default$11](#copy$default$11())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T12` | `[copy$default$12](#copy$default$12())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T13` | `[copy$default$13](#copy$default$13())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T14` | `[copy$default$14](#copy$default$14())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T15` | `[copy$default$15](#copy$default$15())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T16` | `[copy$default$16](#copy$default$16())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T17` | `[copy$default$17](#copy$default$17())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T18` | `[copy$default$18](#copy$default$18())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T19` | `[copy$default$19](#copy$default$19())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T2` | `[copy$default$2](#copy$default$2())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T20` | `[copy$default$20](#copy$default$20())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T3` | `[copy$default$3](#copy$default$3())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T4` | `[copy$default$4](#copy$default$4())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T5` | `[copy$default$5](#copy$default$5())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T6` | `[copy$default$6](#copy$default$6())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T7` | `[copy$default$7](#copy$default$7())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T8` | `[copy$default$8](#copy$default$8())()` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>T9` | `[copy$default$9](#copy$default$9())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>[Tuple20](Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>` | `[create](#create(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14,  T15 t15,  T16 t16,  T17 t17,  T18 t18,  T19 t19,  T20 t20)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[T1](Tuple20.html "type parameter in Tuple20")` | `[t1](#t1())()` |  |
	| `[T10](Tuple20.html "type parameter in Tuple20")` | `[t10](#t10())()` |  |
	| `[T11](Tuple20.html "type parameter in Tuple20")` | `[t11](#t11())()` |  |
	| `[T12](Tuple20.html "type parameter in Tuple20")` | `[t12](#t12())()` |  |
	| `[T13](Tuple20.html "type parameter in Tuple20")` | `[t13](#t13())()` |  |
	| `[T14](Tuple20.html "type parameter in Tuple20")` | `[t14](#t14())()` |  |
	| `[T15](Tuple20.html "type parameter in Tuple20")` | `[t15](#t15())()` |  |
	| `[T16](Tuple20.html "type parameter in Tuple20")` | `[t16](#t16())()` |  |
	| `[T17](Tuple20.html "type parameter in Tuple20")` | `[t17](#t17())()` |  |
	| `[T18](Tuple20.html "type parameter in Tuple20")` | `[t18](#t18())()` |  |
	| `[T19](Tuple20.html "type parameter in Tuple20")` | `[t19](#t19())()` |  |
	| `[T2](Tuple20.html "type parameter in Tuple20")` | `[t2](#t2())()` |  |
	| `[T20](Tuple20.html "type parameter in Tuple20")` | `[t20](#t20())()` |  |
	| `[T3](Tuple20.html "type parameter in Tuple20")` | `[t3](#t3())()` |  |
	| `[T4](Tuple20.html "type parameter in Tuple20")` | `[t4](#t4())()` |  |
	| `[T5](Tuple20.html "type parameter in Tuple20")` | `[t5](#t5())()` |  |
	| `[T6](Tuple20.html "type parameter in Tuple20")` | `[t6](#t6())()` |  |
	| `[T7](Tuple20.html "type parameter in Tuple20")` | `[t7](#t7())()` |  |
	| `[T8](Tuple20.html "type parameter in Tuple20")` | `[t8](#t8())()` |  |
	| `[T9](Tuple20.html "type parameter in Tuple20")` | `[t9](#t9())()` |  |
	| `scala.Tuple20<[T1](Tuple20.html "type parameter in Tuple20"),​[T2](Tuple20.html "type parameter in Tuple20"),​[T3](Tuple20.html "type parameter in Tuple20"),​[T4](Tuple20.html "type parameter in Tuple20"),​[T5](Tuple20.html "type parameter in Tuple20"),​[T6](Tuple20.html "type parameter in Tuple20"),​[T7](Tuple20.html "type parameter in Tuple20"),​[T8](Tuple20.html "type parameter in Tuple20"),​[T9](Tuple20.html "type parameter in Tuple20"),​[T10](Tuple20.html "type parameter in Tuple20"),​[T11](Tuple20.html "type parameter in Tuple20"),​[T12](Tuple20.html "type parameter in Tuple20"),​[T13](Tuple20.html "type parameter in Tuple20"),​[T14](Tuple20.html "type parameter in Tuple20"),​[T15](Tuple20.html "type parameter in Tuple20"),​[T16](Tuple20.html "type parameter in Tuple20"),​[T17](Tuple20.html "type parameter in Tuple20"),​[T18](Tuple20.html "type parameter in Tuple20"),​[T19](Tuple20.html "type parameter in Tuple20"),​[T20](Tuple20.html "type parameter in Tuple20")>` | `[toScala](#toScala())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>scala.Option<scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>>` | `[unapply](#unapply(akka.japi.tuple.Tuple20))​([Tuple20](Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Tuple20
		
		
		
		```
		public Tuple20​([T1](Tuple20.html "type parameter in Tuple20") t1,
		               [T2](Tuple20.html "type parameter in Tuple20") t2,
		               [T3](Tuple20.html "type parameter in Tuple20") t3,
		               [T4](Tuple20.html "type parameter in Tuple20") t4,
		               [T5](Tuple20.html "type parameter in Tuple20") t5,
		               [T6](Tuple20.html "type parameter in Tuple20") t6,
		               [T7](Tuple20.html "type parameter in Tuple20") t7,
		               [T8](Tuple20.html "type parameter in Tuple20") t8,
		               [T9](Tuple20.html "type parameter in Tuple20") t9,
		               [T10](Tuple20.html "type parameter in Tuple20") t10,
		               [T11](Tuple20.html "type parameter in Tuple20") t11,
		               [T12](Tuple20.html "type parameter in Tuple20") t12,
		               [T13](Tuple20.html "type parameter in Tuple20") t13,
		               [T14](Tuple20.html "type parameter in Tuple20") t14,
		               [T15](Tuple20.html "type parameter in Tuple20") t15,
		               [T16](Tuple20.html "type parameter in Tuple20") t16,
		               [T17](Tuple20.html "type parameter in Tuple20") t17,
		               [T18](Tuple20.html "type parameter in Tuple20") t18,
		               [T19](Tuple20.html "type parameter in Tuple20") t19,
		               [T20](Tuple20.html "type parameter in Tuple20") t20)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> [Tuple20](Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> create​(T1 t1,
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
		                                                                                                                                                                                                                                                                                                                                                                                                                  T19 t19,
		                                                                                                                                                                                                                                                                                                                                                                                                                  T20 t20)
		```
		- #### apply
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> [Tuple20](Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> apply​(T1 t1,
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
		                                                                                                                                                                                                                                                                                                                                                                                                                 T19 t19,
		                                                                                                                                                                                                                                                                                                                                                                                                                 T20 t20)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> scala.Option<scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>> unapply​([Tuple20](Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> x$0)
		```
		- #### t1
		
		
		
		```
		public [T1](Tuple20.html "type parameter in Tuple20") t1()
		```
		- #### t2
		
		
		
		```
		public [T2](Tuple20.html "type parameter in Tuple20") t2()
		```
		- #### t3
		
		
		
		```
		public [T3](Tuple20.html "type parameter in Tuple20") t3()
		```
		- #### t4
		
		
		
		```
		public [T4](Tuple20.html "type parameter in Tuple20") t4()
		```
		- #### t5
		
		
		
		```
		public [T5](Tuple20.html "type parameter in Tuple20") t5()
		```
		- #### t6
		
		
		
		```
		public [T6](Tuple20.html "type parameter in Tuple20") t6()
		```
		- #### t7
		
		
		
		```
		public [T7](Tuple20.html "type parameter in Tuple20") t7()
		```
		- #### t8
		
		
		
		```
		public [T8](Tuple20.html "type parameter in Tuple20") t8()
		```
		- #### t9
		
		
		
		```
		public [T9](Tuple20.html "type parameter in Tuple20") t9()
		```
		- #### t10
		
		
		
		```
		public [T10](Tuple20.html "type parameter in Tuple20") t10()
		```
		- #### t11
		
		
		
		```
		public [T11](Tuple20.html "type parameter in Tuple20") t11()
		```
		- #### t12
		
		
		
		```
		public [T12](Tuple20.html "type parameter in Tuple20") t12()
		```
		- #### t13
		
		
		
		```
		public [T13](Tuple20.html "type parameter in Tuple20") t13()
		```
		- #### t14
		
		
		
		```
		public [T14](Tuple20.html "type parameter in Tuple20") t14()
		```
		- #### t15
		
		
		
		```
		public [T15](Tuple20.html "type parameter in Tuple20") t15()
		```
		- #### t16
		
		
		
		```
		public [T16](Tuple20.html "type parameter in Tuple20") t16()
		```
		- #### t17
		
		
		
		```
		public [T17](Tuple20.html "type parameter in Tuple20") t17()
		```
		- #### t18
		
		
		
		```
		public [T18](Tuple20.html "type parameter in Tuple20") t18()
		```
		- #### t19
		
		
		
		```
		public [T19](Tuple20.html "type parameter in Tuple20") t19()
		```
		- #### t20
		
		
		
		```
		public [T20](Tuple20.html "type parameter in Tuple20") t20()
		```
		- #### toScala
		
		
		
		```
		public scala.Tuple20<[T1](Tuple20.html "type parameter in Tuple20"),​[T2](Tuple20.html "type parameter in Tuple20"),​[T3](Tuple20.html "type parameter in Tuple20"),​[T4](Tuple20.html "type parameter in Tuple20"),​[T5](Tuple20.html "type parameter in Tuple20"),​[T6](Tuple20.html "type parameter in Tuple20"),​[T7](Tuple20.html "type parameter in Tuple20"),​[T8](Tuple20.html "type parameter in Tuple20"),​[T9](Tuple20.html "type parameter in Tuple20"),​[T10](Tuple20.html "type parameter in Tuple20"),​[T11](Tuple20.html "type parameter in Tuple20"),​[T12](Tuple20.html "type parameter in Tuple20"),​[T13](Tuple20.html "type parameter in Tuple20"),​[T14](Tuple20.html "type parameter in Tuple20"),​[T15](Tuple20.html "type parameter in Tuple20"),​[T16](Tuple20.html "type parameter in Tuple20"),​[T17](Tuple20.html "type parameter in Tuple20"),​[T18](Tuple20.html "type parameter in Tuple20"),​[T19](Tuple20.html "type parameter in Tuple20"),​[T20](Tuple20.html "type parameter in Tuple20")> toScala()
		```
		- #### copy
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> [Tuple20](Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> copy​(T1 t1,
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
		                                                                                                                                                                                                                                                                                                                                                                                                         T19 t19,
		                                                                                                                                                                                                                                                                                                                                                                                                         T20 t20)
		```
		- #### copy$default$1
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T1 copy$default$1()
		```
		- #### copy$default$10
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T10 copy$default$10()
		```
		- #### copy$default$11
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T11 copy$default$11()
		```
		- #### copy$default$12
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T12 copy$default$12()
		```
		- #### copy$default$13
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T13 copy$default$13()
		```
		- #### copy$default$14
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T14 copy$default$14()
		```
		- #### copy$default$15
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T15 copy$default$15()
		```
		- #### copy$default$16
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T16 copy$default$16()
		```
		- #### copy$default$17
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T17 copy$default$17()
		```
		- #### copy$default$18
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T18 copy$default$18()
		```
		- #### copy$default$19
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T19 copy$default$19()
		```
		- #### copy$default$2
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T2 copy$default$2()
		```
		- #### copy$default$20
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T20 copy$default$20()
		```
		- #### copy$default$3
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T3 copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T4 copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T5 copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T6 copy$default$6()
		```
		- #### copy$default$7
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T7 copy$default$7()
		```
		- #### copy$default$8
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T8 copy$default$8()
		```
		- #### copy$default$9
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> T9 copy$default$9()
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

- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple20.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple20.html](https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple20.html)*