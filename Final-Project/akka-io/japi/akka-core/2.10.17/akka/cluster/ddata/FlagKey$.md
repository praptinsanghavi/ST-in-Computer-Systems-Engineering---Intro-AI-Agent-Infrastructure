---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:31:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FlagKey$.html
title: FlagKey$
---

# FlagKey$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class FlagKey$

- java.lang.Object
- - akka.cluster.ddata.FlagKey$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class FlagKey$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.FlagKey$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FlagKey$](FlagKey$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlagKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[FlagKey](FlagKey.html "class in akka.cluster.ddata")` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `[Key](Key.html "class in akka.cluster.ddata")<[Flag](Flag.html "class in akka.cluster.ddata")>` | `[create](#create(java.lang.String))​(java.lang.String id)` |  |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.FlagKey))​([FlagKey](FlagKey.html "class in akka.cluster.ddata") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FlagKey$](FlagKey$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FlagKey$
		
		
		
		```
		public FlagKey$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [Key](Key.html "class in akka.cluster.ddata")<[Flag](Flag.html "class in akka.cluster.ddata")> create​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public [FlagKey](FlagKey.html "class in akka.cluster.ddata") apply​(java.lang.String _id)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​([FlagKey](FlagKey.html "class in akka.cluster.ddata") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Flag.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FlagKey$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FlagKey$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/FlagKey$.html)*