---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:31:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWMapKey$.html
title: LWWMapKey$
---

# LWWMapKey$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class LWWMapKey$

- java.lang.Object
- - akka.cluster.ddata.LWWMapKey$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class LWWMapKey$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.LWWMapKey$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LWWMapKey$](LWWMapKey$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LWWMapKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[LWWMapKey](LWWMapKey.html "class in akka.cluster.ddata")<A,​B>` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `<A,​B>[Key](Key.html "class in akka.cluster.ddata")<[LWWMap](LWWMap.html "class in akka.cluster.ddata")<A,​B>>` | `[create](#create(java.lang.String))​(java.lang.String id)` |  |
	| `<A,​B>scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.LWWMapKey))​([LWWMapKey](LWWMapKey.html "class in akka.cluster.ddata")<A,​B> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LWWMapKey$](LWWMapKey$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LWWMapKey$
		
		
		
		```
		public LWWMapKey$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A,​B> [Key](Key.html "class in akka.cluster.ddata")<[LWWMap](LWWMap.html "class in akka.cluster.ddata")<A,​B>> create​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public <A,​B> [LWWMapKey](LWWMapKey.html "class in akka.cluster.ddata")<A,​B> apply​(java.lang.String _id)
		```
		- #### unapply
		
		
		
		```
		public <A,​B> scala.Option<java.lang.String> unapply​([LWWMapKey](LWWMapKey.html "class in akka.cluster.ddata")<A,​B> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWMapKey$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWMapKey$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWMapKey$.html)*