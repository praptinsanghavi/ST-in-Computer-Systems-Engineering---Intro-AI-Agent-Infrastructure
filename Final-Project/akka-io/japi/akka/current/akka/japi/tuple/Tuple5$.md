---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:20:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple5$.html
title: Tuple5$
---

# Tuple5$

## Content

Package [akka.japi.tuple](package-summary.html)
## Class Tuple5$

- java.lang.Object
- - akka.japi.tuple.Tuple5$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Tuple5$
extends java.lang.Object
implements java.io.Serializable
```

Used to create tuples with 5 elements in Java.

See Also:
[Serialized Form](../../../serialized-form.html#akka.japi.tuple.Tuple5$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tuple5$](Tuple5$.html "class in akka.japi.tuple")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple5$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T1,​T2,​T3,​T4,​T5>[Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5>` | `[apply](#apply(T1,T2,T3,T4,T5))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5)` | Java API Tuple container. |
	| `<T1,​T2,​T3,​T4,​T5>[Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5>` | `[create](#create(T1,T2,T3,T4,T5))​(T1 t1,  T2 t2,  T3 t3,  T4 t4,  T5 t5)` |  |
	| `<T1,​T2,​T3,​T4,​T5>scala.Option<scala.Tuple5<T1,​T2,​T3,​T4,​T5>>` | `[unapply](#unapply(akka.japi.tuple.Tuple5))​([Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tuple5$](Tuple5$.html "class in akka.japi.tuple") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Tuple5$
		
		
		
		```
		public Tuple5$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5> [Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5> create​(T1 t1,
		                                                                                                      T2 t2,
		                                                                                                      T3 t3,
		                                                                                                      T4 t4,
		                                                                                                      T5 t5)
		```
		- #### apply
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5> [Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5> apply​(T1 t1,
		                                                                                                     T2 t2,
		                                                                                                     T3 t3,
		                                                                                                     T4 t4,
		                                                                                                     T5 t5)
		```
		
		Java API Tuple container.
		- #### unapply
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5> scala.Option<scala.Tuple5<T1,​T2,​T3,​T4,​T5>> unapply​([Tuple5](Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple5$.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple5.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple5$.html](https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple5$.html)*