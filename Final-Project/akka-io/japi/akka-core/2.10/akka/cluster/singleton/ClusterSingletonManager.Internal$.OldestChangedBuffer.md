---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:07:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$.html
title: ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$
---

# ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<scala.collection.immutable.List\<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")\>,​java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState\>
	- - akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState>`

Enclosing class:
[ClusterSingletonManager.Internal$.OldestChangedBuffer](ClusterSingletonManager.Internal$.OldestChangedBuffer.html "class in akka.cluster.singleton")

---

```
public class ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$
extends scala.runtime.AbstractFunction2<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.singleton.ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$](ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$.html "class in akka.cluster.singleton")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InitialOldestState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState` | `[apply](#apply(scala.collection.immutable.List,boolean))​(scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> oldest,  boolean safeToBeOldest)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState))​(akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$](ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$.html "class in akka.cluster.singleton") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### InitialOldestState$
		
		
		
		```
		public InitialOldestState$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​java.lang.Object,​akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState>`
		- #### apply
		
		
		
		```
		public akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState apply​(scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> oldest,
		                                                                                                            boolean safeToBeOldest)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<scala.collection.immutable.List<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>,​java.lang.Object>> unapply​(akka.cluster.singleton.ClusterSingletonManager.Internal.OldestChangedBuffer.InitialOldestState x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.InitialOldestState$.html)*