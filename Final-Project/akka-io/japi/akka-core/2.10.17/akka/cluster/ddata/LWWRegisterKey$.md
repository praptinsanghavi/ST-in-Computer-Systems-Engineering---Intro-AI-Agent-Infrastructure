---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:31:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWRegisterKey$.html
title: LWWRegisterKey$
---

# LWWRegisterKey$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class LWWRegisterKey$

- java.lang.Object
- - akka.cluster.ddata.LWWRegisterKey$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class LWWRegisterKey$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.LWWRegisterKey$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LWWRegisterKey$](LWWRegisterKey$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LWWRegisterKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [LWWRegisterKey](LWWRegisterKey.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `<A> [Key](Key.html "class in akka.cluster.ddata")<[LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>>` | `[create](#create(java.lang.String))​(java.lang.String id)` |  |
	| `<A> scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.LWWRegisterKey))​([LWWRegisterKey](LWWRegisterKey.html "class in akka.cluster.ddata")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LWWRegisterKey$](LWWRegisterKey$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LWWRegisterKey$
		
		
		
		```
		public LWWRegisterKey$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A> [Key](Key.html "class in akka.cluster.ddata")<[LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>> create​(java.lang.String id)
		```
		- #### apply
		
		
		
		```
		public <A> [LWWRegisterKey](LWWRegisterKey.html "class in akka.cluster.ddata")<A> apply​(java.lang.String _id)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<java.lang.String> unapply​([LWWRegisterKey](LWWRegisterKey.html "class in akka.cluster.ddata")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWRegisterKey$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWRegisterKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWRegisterKey$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/LWWRegisterKey$.html)*