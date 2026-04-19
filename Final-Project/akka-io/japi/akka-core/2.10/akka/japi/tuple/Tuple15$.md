---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple15$.html
title: Tuple15$
---

# Tuple15$

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple15$

- java.lang.Object
- - akka.japi.tuple.Tuple15$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Tuple15$
extends java.lang.Object
implements java.io.Serializable
```

Used to create tuples with 15 elements in Java.

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple15$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tuple15$](Tuple15$.html "class in akka.japi.tuple")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple15$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>[Tuple15](Tuple15.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14,  T15 t15)` | Java API Tuple container. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>[Tuple15](Tuple15.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>` | `[create](#create(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14,  T15 t15)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>scala.Option<scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>>` | `[unapply](#unapply(akka.japi.tuple.Tuple15))​([Tuple15](Tuple15.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tuple15$](Tuple15$.html "class in akka.japi.tuple") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Tuple15$
		
		
		
		```
		public Tuple15$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15> [Tuple15](Tuple15.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15> create​(T1 t1,
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
		                                                                                                                                                                                                                                                                                                       T15 t15)
		```
		- #### apply
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15> [Tuple15](Tuple15.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15> apply​(T1 t1,
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
		                                                                                                                                                                                                                                                                                                      T15 t15)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15> scala.Option<scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>> unapply​([Tuple15](Tuple15.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple15$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple15.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple15$.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple15$.html)*