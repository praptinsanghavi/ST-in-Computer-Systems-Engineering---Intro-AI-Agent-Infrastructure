---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:41:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$.html
title: ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$
---

# ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.Option\<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")\>,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged\>
	- - akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged>`

Enclosing class:
[ClusterSingletonManager.Internal$.OldestChangedBuffer](ClusterSingletonManager.Internal$.OldestChangedBuffer.html "class in akka.cluster.singleton")

---

```
public class ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$
extends scala.runtime.AbstractFunction1<scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$](ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$.html "class in akka.cluster.singleton")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OldestChanged$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged` | `[apply](#apply(scala.Option))​(scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> oldest)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>>` | `[unapply](#unapply(akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged))​(akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$](ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$.html "class in akka.cluster.singleton") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### OldestChanged$
		
		
		
		```
		public OldestChanged$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged>`
		- #### apply
		
		
		
		```
		public akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged apply​(scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> oldest)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>> unapply​(akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.OldestChanged x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.OldestChanged$.html)*