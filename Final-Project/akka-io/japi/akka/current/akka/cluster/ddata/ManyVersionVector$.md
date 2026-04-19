---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ManyVersionVector$.html
title: ManyVersionVector$
---

# ManyVersionVector$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class ManyVersionVector$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.TreeMap\<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object\>,​[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")\>
	- - akka.cluster.ddata.ManyVersionVector$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>,​[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")>`

---

```
public class ManyVersionVector$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>,​[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.ManyVersionVector$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ManyVersionVector$](ManyVersionVector$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ManyVersionVector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")` | `[apply](#apply(scala.collection.immutable.TreeMap))​(scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object> versions)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.ddata.ManyVersionVector))​([ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ManyVersionVector$](ManyVersionVector$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ManyVersionVector$
		
		
		
		```
		public ManyVersionVector$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>,​[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>,​[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")>`
		- #### apply
		
		
		
		```
		public [ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata") apply​(scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object> versions)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>,​[ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.TreeMap<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>> unapply​([ManyVersionVector](ManyVersionVector.html "class in akka.cluster.ddata") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ManyVersionVector$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ManyVersionVector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ManyVersionVector$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ManyVersionVector$.html)*