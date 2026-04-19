---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:40:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone$.html
title: RememberEntitiesShardStore.UpdateDone$
---

# RememberEntitiesShardStore.UpdateDone$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class RememberEntitiesShardStore.UpdateDone$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<scala.collection.immutable.Set\<java.lang.String\>,​scala.collection.immutable.Set\<java.lang.String\>,​[RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal")\>
	- - akka.cluster.sharding.internal.RememberEntitiesShardStore.UpdateDone$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<scala.collection.immutable.Set<java.lang.String>,​scala.collection.immutable.Set<java.lang.String>,​[RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal")>`

Enclosing class:
[RememberEntitiesShardStore](RememberEntitiesShardStore.html "class in akka.cluster.sharding.internal")

---

```
public static class RememberEntitiesShardStore.UpdateDone$
extends scala.runtime.AbstractFunction2<scala.collection.immutable.Set<java.lang.String>,​scala.collection.immutable.Set<java.lang.String>,​[RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.internal.RememberEntitiesShardStore.UpdateDone$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RememberEntitiesShardStore.UpdateDone$](RememberEntitiesShardStore.UpdateDone$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UpdateDone$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal")` | `[apply](#apply(scala.collection.immutable.Set,scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> started,  scala.collection.immutable.Set<java.lang.String> stopped)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<scala.collection.immutable.Set<java.lang.String>,​scala.collection.immutable.Set<java.lang.String>>>` | `[unapply](#unapply(akka.cluster.sharding.internal.RememberEntitiesShardStore.UpdateDone))​([RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RememberEntitiesShardStore.UpdateDone$](RememberEntitiesShardStore.UpdateDone$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UpdateDone$
		
		
		
		```
		public UpdateDone$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<scala.collection.immutable.Set<java.lang.String>,​scala.collection.immutable.Set<java.lang.String>,​[RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<scala.collection.immutable.Set<java.lang.String>,​scala.collection.immutable.Set<java.lang.String>,​[RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal")>`
		- #### apply
		
		
		
		```
		public [RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal") apply​(scala.collection.immutable.Set<java.lang.String> started,
		                                                   scala.collection.immutable.Set<java.lang.String> stopped)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<scala.collection.immutable.Set<java.lang.String>,​scala.collection.immutable.Set<java.lang.String>,​[RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<scala.collection.immutable.Set<java.lang.String>,​scala.collection.immutable.Set<java.lang.String>>> unapply​([RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/RememberEntitiesShardStore.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/RememberEntitiesShardStore.UpdateDone$.html)*