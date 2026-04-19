---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSetKey$.html
title: ORSetKey$
---

# ORSetKey$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ORSetKey$

- java.lang.Object
- - akka.cluster.ddata.ORSetKey$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ORSetKey$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.ORSetKey$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ORSetKey$](ORSetKey$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ORSetKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [ORSetKey](ORSetKey.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `<A> [Key](Key.html "class in akka.cluster.ddata")<[ORSet](ORSet.html "class in akka.cluster.ddata")<A>>` | `[create](#create(java.lang.String))​(java.lang.String id)` |  |
	| `<A> scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.ORSetKey))​([ORSetKey](ORSetKey.html "class in akka.cluster.ddata")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ORSetKey$](ORSetKey$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ORSetKey$
		
		
		
		```
		public ORSetKey$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A> [Key](Key.html "class in akka.cluster.ddata")<[ORSet](ORSet.html "class in akka.cluster.ddata")<A>> create​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public <A> [ORSetKey](ORSetKey.html "class in akka.cluster.ddata")<A> apply​(java.lang.String _id)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<java.lang.String> unapply​([ORSetKey](ORSetKey.html "class in akka.cluster.ddata")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSetKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSetKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSetKey$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSetKey$.html)*