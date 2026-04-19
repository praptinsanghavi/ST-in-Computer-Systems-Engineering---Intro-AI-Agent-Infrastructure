---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:45:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple14$.html
title: Tuple14$
---

# Tuple14$

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple14$

- java.lang.Object
- - akka.japi.tuple.Tuple14$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Tuple14$
extends java.lang.Object
implements java.io.Serializable
```

Used to create tuples with 14 elements in Java.

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple14$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tuple14$](Tuple14$.html "class in akka.japi.tuple")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple14$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>[Tuple14](Tuple14.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14)` | Java API Tuple container. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>[Tuple14](Tuple14.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>` | `[create](#create(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9,  T10 t10,  T11 t11,  T12 t12,  T13 t13,  T14 t14)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>scala.Option<scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>>` | `[unapply](#unapply(akka.japi.tuple.Tuple14))​([Tuple14](Tuple14.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tuple14$](Tuple14$.html "class in akka.japi.tuple") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Tuple14$
		
		
		
		```
		public Tuple14$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14> [Tuple14](Tuple14.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14> create​(T1 t1,
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
		                                                                                                                                                                                                                                                                                   T14 t14)
		```
		- #### apply
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14> [Tuple14](Tuple14.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14> apply​(T1 t1,
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
		                                                                                                                                                                                                                                                                                  T14 t14)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14> scala.Option<scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>> unapply​([Tuple14](Tuple14.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple14$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple14.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple14$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/tuple/Tuple14$.html)*