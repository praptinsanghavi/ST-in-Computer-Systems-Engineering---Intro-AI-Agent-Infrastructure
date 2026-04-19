---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:42:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.YoungerData$.html
title: ClusterSingletonManager.Internal$.YoungerData$
---

# ClusterSingletonManager.Internal$.YoungerData$

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonManager.Internal$.YoungerData$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.List\<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData\>
	- - akka.cluster.singleton.ClusterSingletonManager.Internal$.YoungerData$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData>`

Enclosing class:
[ClusterSingletonManager.Internal$](ClusterSingletonManager.Internal$.html "class in akka.cluster.singleton")

---

```
public class ClusterSingletonManager.Internal$.YoungerData$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.singleton.ClusterSingletonManager.Internal$.YoungerData$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingletonManager.Internal$.YoungerData$](ClusterSingletonManager.Internal$.YoungerData$.html "class in akka.cluster.singleton")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[YoungerData$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData` | `[apply](#apply(scala.collection.immutable.List))​(scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> oldest)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>>` | `[unapply](#unapply(akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData))​(akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingletonManager.Internal$.YoungerData$](ClusterSingletonManager.Internal$.YoungerData$.html "class in akka.cluster.singleton") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### YoungerData$
		
		
		
		```
		public YoungerData$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData>`
		- #### apply
		
		
		
		```
		public akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData apply​(scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> oldest)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>> unapply​(akka.cluster.singleton.ClusterSingletonManager.Internal.YoungerData x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.YoungerData$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.YoungerData$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.YoungerData$.html)*