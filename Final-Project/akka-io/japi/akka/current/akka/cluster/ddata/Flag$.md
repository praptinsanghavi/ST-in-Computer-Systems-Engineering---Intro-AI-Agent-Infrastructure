---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Flag$.html
title: Flag$
---

# Flag$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Flag$

- java.lang.Object
- - akka.cluster.ddata.Flag$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Flag$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.Flag$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Flag$](Flag$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Flag$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Flag](Flag.html "class in akka.cluster.ddata")` | `[apply](#apply())()` |  |
	| `[Flag](Flag.html "class in akka.cluster.ddata")` | `[apply](#apply(boolean))​(boolean enabled)` | Implements a boolean flag CRDT that is initialized to `false` and  can be switched to `true`. |
	| `[Flag](Flag.html "class in akka.cluster.ddata")` | `[create](#create())()` | Java API: `Flag` that is initialized to `false`. |
	| `[Flag](Flag.html "class in akka.cluster.ddata")` | `[Disabled](#Disabled())()` | `Flag` that is initialized to `false`. |
	| `[Flag](Flag.html "class in akka.cluster.ddata")` | `[empty](#empty())()` | `Flag` that is initialized to `false`. |
	| `[Flag](Flag.html "class in akka.cluster.ddata")` | `[Enabled](#Enabled())()` | `Flag` that is initialized to `true`. |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.cluster.ddata.Flag))​([Flag](Flag.html "class in akka.cluster.ddata") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Flag$](Flag$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Flag$
		
		
		
		```
		public Flag$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public [Flag](Flag.html "class in akka.cluster.ddata") empty()
		```
		
		`Flag` that is initialized to `false`.
		- #### Disabled
		
		
		
		```
		public [Flag](Flag.html "class in akka.cluster.ddata") Disabled()
		```
		
		`Flag` that is initialized to `false`.
		- #### Enabled
		
		
		
		```
		public [Flag](Flag.html "class in akka.cluster.ddata") Enabled()
		```
		
		`Flag` that is initialized to `true`.
		- #### apply
		
		
		
		```
		public [Flag](Flag.html "class in akka.cluster.ddata") apply()
		```
		- #### create
		
		
		
		```
		public [Flag](Flag.html "class in akka.cluster.ddata") create()
		```
		
		Java API: `Flag` that is initialized to `false`.
		- #### apply
		
		
		
		```
		public [Flag](Flag.html "class in akka.cluster.ddata") apply​(boolean enabled)
		```
		
		Implements a boolean flag CRDT that is initialized to `false` and
		 can be switched to `true`. `true` wins over `false` in merge.
		 
		 This class is immutable, i.e. "modifying" methods return a new instance.
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([Flag](Flag.html "class in akka.cluster.ddata") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Flag$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Flag.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Flag$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Flag$.html)*