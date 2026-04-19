---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key$.html
title: Key$
---

# Key$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Key$

- java.lang.Object
- - akka.cluster.ddata.Key$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Key$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.Key$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Key$](Key$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Key$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.Key))​([Key](Key.html "class in akka.cluster.ddata")<?> k)` | Extract the [`Key.id()`](Key.html#id()). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Key$](Key$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Key$
		
		
		
		```
		public Key$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​([Key](Key.html "class in akka.cluster.ddata")<?> k)
		```
		
		Extract the [`Key.id()`](Key.html#id()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key$.html)*