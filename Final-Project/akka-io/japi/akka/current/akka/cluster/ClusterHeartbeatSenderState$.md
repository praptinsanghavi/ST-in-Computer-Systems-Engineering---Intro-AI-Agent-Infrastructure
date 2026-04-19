---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:41:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ClusterHeartbeatSenderState$.html
title: ClusterHeartbeatSenderState$
---

# ClusterHeartbeatSenderState$

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterHeartbeatSenderState$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<akka.cluster.HeartbeatNodeRing,​scala.collection.immutable.Set\<[UniqueAddress](UniqueAddress.html "class in akka.cluster")\>,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")\<[Address](../actor/Address.html "class in akka.actor")\>,​akka.cluster.ClusterHeartbeatSenderState\>
	- - akka.cluster.ClusterHeartbeatSenderState$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<akka.cluster.HeartbeatNodeRing,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>,​akka.cluster.ClusterHeartbeatSenderState>`

---

```
public class ClusterHeartbeatSenderState$
extends scala.runtime.AbstractFunction3<akka.cluster.HeartbeatNodeRing,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>,​akka.cluster.ClusterHeartbeatSenderState>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.ClusterHeartbeatSenderState$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterHeartbeatSenderState$](ClusterHeartbeatSenderState$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterHeartbeatSenderState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.ClusterHeartbeatSenderState` | `[apply](#apply(akka.cluster.HeartbeatNodeRing,scala.collection.immutable.Set,akka.remote.FailureDetectorRegistry))​(akka.cluster.HeartbeatNodeRing ring,  scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")> oldReceiversNowUnreachable,  [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> failureDetector)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<akka.cluster.HeartbeatNodeRing,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>>>` | `[unapply](#unapply(akka.cluster.ClusterHeartbeatSenderState))​(akka.cluster.ClusterHeartbeatSenderState x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterHeartbeatSenderState$](ClusterHeartbeatSenderState$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterHeartbeatSenderState$
		
		
		
		```
		public ClusterHeartbeatSenderState$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<akka.cluster.HeartbeatNodeRing,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>,​akka.cluster.ClusterHeartbeatSenderState>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<akka.cluster.HeartbeatNodeRing,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>,​akka.cluster.ClusterHeartbeatSenderState>`
		- #### apply
		
		
		
		```
		public akka.cluster.ClusterHeartbeatSenderState apply​(akka.cluster.HeartbeatNodeRing ring,
		                                                      scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")> oldReceiversNowUnreachable,
		                                                      [FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")> failureDetector)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<akka.cluster.HeartbeatNodeRing,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>,​akka.cluster.ClusterHeartbeatSenderState>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<akka.cluster.HeartbeatNodeRing,​scala.collection.immutable.Set<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>,​[FailureDetectorRegistry](../remote/FailureDetectorRegistry.html "interface in akka.remote")<[Address](../actor/Address.html "class in akka.actor")>>> unapply​(akka.cluster.ClusterHeartbeatSenderState x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ClusterHeartbeatSenderState$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ClusterHeartbeatSenderState$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ClusterHeartbeatSenderState$.html)*