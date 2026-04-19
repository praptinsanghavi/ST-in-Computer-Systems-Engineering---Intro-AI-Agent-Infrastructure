---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:45:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair$.html
title: Pair$
---

# Pair$

## Content

Package [akka.japi](package-summary.html)
## Class Pair$

- java.lang.Object
- - akka.japi.Pair$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Pair$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.japi.Pair$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Pair$](Pair$.html "class in akka.japi")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Pair$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Pair](Pair.html "class in akka.japi")<A,​B>` | `[apply](#apply(A,B))​(A first,  B second)` |  |
	| `<A,​B>[Pair](Pair.html "class in akka.japi")<A,​B>` | `[create](#create(A,B))​(A first,  B second)` |  |
	| `<A,​B>scala.Option<scala.Tuple2<A,​B>>` | `[unapply](#unapply(akka.japi.Pair))​([Pair](Pair.html "class in akka.japi")<A,​B> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Pair$](Pair$.html "class in akka.japi") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Pair$
		
		
		
		```
		public Pair$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A,​B> [Pair](Pair.html "class in akka.japi")<A,​B> create​(A first,
		                                          B second)
		```
		- #### apply
		
		
		
		```
		public <A,​B> [Pair](Pair.html "class in akka.japi")<A,​B> apply​(A first,
		                                         B second)
		```
		- #### unapply
		
		
		
		```
		public <A,​B> scala.Option<scala.Tuple2<A,​B>> unapply​([Pair](Pair.html "class in akka.japi")<A,​B> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair$.html)*