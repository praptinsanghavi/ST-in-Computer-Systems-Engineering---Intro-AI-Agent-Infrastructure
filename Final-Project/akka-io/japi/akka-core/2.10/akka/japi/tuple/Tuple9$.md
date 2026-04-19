---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple9$.html
title: Tuple9$
---

# Tuple9$

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple9$

- java.lang.Object
- - akka.japi.tuple.Tuple9$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Tuple9$
extends java.lang.Object
implements java.io.Serializable
```

Used to create tuples with 9 elements in Java.

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple9$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tuple9$](Tuple9$.html "class in akka.japi.tuple")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple9$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>[Tuple9](Tuple9.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9)` | Java API Tuple container. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>[Tuple9](Tuple9.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>` | `[create](#create(T1,T2,T3,T4,T5,T6,T7,T8,T9))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5,  T6 t6,  T7 t7,  T8 t8,  T9 t9)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>scala.Option<scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>>` | `[unapply](#unapply(akka.japi.tuple.Tuple9))​([Tuple9](Tuple9.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tuple9$](Tuple9$.html "class in akka.japi.tuple") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Tuple9$
		
		
		
		```
		public Tuple9$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9> [Tuple9](Tuple9.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9> create​(T1 t1,
		                                                                                                                                                                              T2 t2,
		                                                                                                                                                                              T3 t3,
		                                                                                                                                                                              T4 t4,
		                                                                                                                                                                              T5 t5,
		                                                                                                                                                                              T6 t6,
		                                                                                                                                                                              T7 t7,
		                                                                                                                                                                              T8 t8,
		                                                                                                                                                                              T9 t9)
		```
		- #### apply
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9> [Tuple9](Tuple9.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9> apply​(T1 t1,
		                                                                                                                                                                             T2 t2,
		                                                                                                                                                                             T3 t3,
		                                                                                                                                                                             T4 t4,
		                                                                                                                                                                             T5 t5,
		                                                                                                                                                                             T6 t6,
		                                                                                                                                                                             T7 t7,
		                                                                                                                                                                             T8 t8,
		                                                                                                                                                                             T9 t9)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9> scala.Option<scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>> unapply​([Tuple9](Tuple9.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple9$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple9.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple9$.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/tuple/Tuple9$.html)*