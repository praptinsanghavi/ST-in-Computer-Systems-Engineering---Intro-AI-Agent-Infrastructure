---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:01:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey$.html
title: Key.UnspecificKey$
---

# Key.UnspecificKey$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Key.UnspecificKey$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.String,​[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")\>
	- - akka.cluster.ddata.Key.UnspecificKey$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.String,​[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")>`

Enclosing class:
[Key](Key.html "class in akka.cluster.ddata")\<[T](Key.html "type parameter in Key") extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\>

---

```
public static class Key.UnspecificKey$
extends scala.runtime.AbstractFunction1<java.lang.String,​[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.Key.UnspecificKey$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Key.UnspecificKey$](Key.UnspecificKey$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnspecificKey$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")` | `[apply](#apply(java.lang.String))​(java.lang.String _id)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.Key.UnspecificKey))​([Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Key.UnspecificKey$](Key.UnspecificKey$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UnspecificKey$
		
		
		
		```
		public UnspecificKey$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.String,​[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.String,​[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")>`
		- #### apply
		
		
		
		```
		public [Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata") apply​(java.lang.String _id)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.String,​[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​([Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Key.UnspecificKey$.html)*