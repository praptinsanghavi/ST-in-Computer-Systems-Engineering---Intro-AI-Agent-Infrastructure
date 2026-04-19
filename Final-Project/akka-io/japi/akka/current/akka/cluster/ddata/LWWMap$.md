---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWMap$.html
title: LWWMap$
---

# LWWMap$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class LWWMap$

- java.lang.Object
- - akka.cluster.ddata.LWWMap$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class LWWMap$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.LWWMap$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LWWMap$](LWWMap$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LWWMap$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LWWMap](LWWMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object>` | `[apply](#apply())()` |  |
	| `<A,​B>[LWWMap](LWWMap.html "class in akka.cluster.ddata")<A,​B>` | `[create](#create())()` | Java API |
	| `<A,​B>[LWWMap](LWWMap.html "class in akka.cluster.ddata")<A,​B>` | `[empty](#empty())()` |  |
	| `<A,​B>scala.Option<scala.collection.immutable.Map<A,​B>>` | `[unapply](#unapply(akka.cluster.ddata.LWWMap))​([LWWMap](LWWMap.html "class in akka.cluster.ddata")<A,​B> m)` | Extract the [`LWWMap.entries()`](LWWMap.html#entries()). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LWWMap$](LWWMap$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LWWMap$
		
		
		
		```
		public LWWMap$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public <A,​B> [LWWMap](LWWMap.html "class in akka.cluster.ddata")<A,​B> empty()
		```
		- #### apply
		
		
		
		```
		public [LWWMap](LWWMap.html "class in akka.cluster.ddata")<java.lang.Object,​java.lang.Object> apply()
		```
		- #### create
		
		
		
		```
		public <A,​B> [LWWMap](LWWMap.html "class in akka.cluster.ddata")<A,​B> create()
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public <A,​B> scala.Option<scala.collection.immutable.Map<A,​B>> unapply​([LWWMap](LWWMap.html "class in akka.cluster.ddata")<A,​B> m)
		```
		
		Extract the [`LWWMap.entries()`](LWWMap.html#entries()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWMap$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWMap$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWMap$.html)*