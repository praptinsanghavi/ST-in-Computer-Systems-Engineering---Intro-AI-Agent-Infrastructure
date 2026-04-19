---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:51:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/Gossip$.html
title: Gossip$
---

# Gossip$

## Content

Package [akka.cluster](package-summary.html)
## Class Gossip$

- java.lang.Object
- - akka.cluster.Gossip$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Gossip$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.Gossip$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Gossip$](Gossip$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Gossip$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.GossipOverview` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` | INTERNAL API |
	| `[VectorClock](VectorClock.html "class in akka.cluster")` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object>` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `akka.cluster.Gossip` | `[apply](#apply(scala.collection.immutable.SortedSet))​(scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")> members)` |  |
	| `akka.cluster.Gossip` | `[apply](#apply(scala.collection.immutable.SortedSet,akka.cluster.GossipOverview,akka.cluster.VectorClock,scala.collection.immutable.Map))​(scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")> members,  akka.cluster.GossipOverview overview,  [VectorClock](VectorClock.html "class in akka.cluster") version,  scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object> tombstones)` | INTERNAL API |
	| `akka.cluster.GossipOverview` | `[apply$default$2](#apply$default$2())()` | INTERNAL API |
	| `[VectorClock](VectorClock.html "class in akka.cluster")` | `[apply$default$3](#apply$default$3())()` |  |
	| `scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object>` | `[apply$default$4](#apply$default$4())()` |  |
	| `akka.cluster.Gossip` | `[empty](#empty())()` |  |
	| `scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")>` | `[emptyMembers](#emptyMembers())()` |  |
	| `scala.Option<scala.Tuple4<scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")>,​akka.cluster.GossipOverview,​[VectorClock](VectorClock.html "class in akka.cluster"),​scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object>>>` | `[unapply](#unapply(akka.cluster.Gossip))​(akka.cluster.Gossip x$0)` |  |
	| `java.lang.String` | `[vclockName](#vclockName(akka.cluster.UniqueAddress))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") node)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Gossip$](Gossip$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Gossip$
		
		
		
		```
		public Gossip$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public akka.cluster.GossipOverview $lessinit$greater$default$2()
		```
		
		INTERNAL API
		 
		 Represents the state of the cluster; cluster ring membership, ring convergence \-
		 all versioned by a vector clock.
		 
		
		
		 When a node is joining the `Member`, with status `Joining`, is added to `members`.
		 If the joining node was downed it is moved from `overview.unreachable` (status `Down`)
		 to `members` (status `Joining`). It cannot rejoin if not first downed.
		 
		
		
		 When convergence is reached the leader change status of `members` from `Joining`
		 to `Up`.
		 
		
		
		 When failure detector consider a node as unavailable it will be moved from
		 `members` to `overview.unreachable`.
		 
		
		
		 When a node is downed, either manually or automatically, its status is changed to `Down`.
		 It is also removed from `overview.seen` table. The node will reside as `Down` in the
		 `overview.unreachable` set until joining again and it will then go through the normal
		 joining procedure.
		 
		
		
		 When a `Gossip` is received the version (vector clock) is used to determine if the
		 received `Gossip` is newer or older than the current local `Gossip`. The received `Gossip`
		 and local `Gossip` is merged in case of conflicting version, i.e. vector clocks without
		 same history.
		 
		
		
		 When a node is told by the user to leave the cluster the leader will move it to `Leaving`
		 and then rebalance and repartition the cluster and start hand\-off by migrating the actors
		 from the leaving node to the new partitions. Once this process is complete the leader will
		 move the node to the `Exiting` state and once a convergence is complete move the node to
		 `Removed` by removing it from the `members` set and sending a `Removed` command to the
		 removed node telling it to shut itself down.
		- #### $lessinit$greater$default$3
		
		
		
		```
		public [VectorClock](VectorClock.html "class in akka.cluster") $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object> $lessinit$greater$default$4()
		```
		- #### emptyMembers
		
		
		
		```
		public scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")> emptyMembers()
		```
		- #### empty
		
		
		
		```
		public akka.cluster.Gossip empty()
		```
		- #### apply
		
		
		
		```
		public akka.cluster.Gossip apply​(scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")> members)
		```
		- #### apply$default$2
		
		
		
		```
		public akka.cluster.GossipOverview apply$default$2()
		```
		
		INTERNAL API
		 
		 Represents the state of the cluster; cluster ring membership, ring convergence \-
		 all versioned by a vector clock.
		 
		
		
		 When a node is joining the `Member`, with status `Joining`, is added to `members`.
		 If the joining node was downed it is moved from `overview.unreachable` (status `Down`)
		 to `members` (status `Joining`). It cannot rejoin if not first downed.
		 
		
		
		 When convergence is reached the leader change status of `members` from `Joining`
		 to `Up`.
		 
		
		
		 When failure detector consider a node as unavailable it will be moved from
		 `members` to `overview.unreachable`.
		 
		
		
		 When a node is downed, either manually or automatically, its status is changed to `Down`.
		 It is also removed from `overview.seen` table. The node will reside as `Down` in the
		 `overview.unreachable` set until joining again and it will then go through the normal
		 joining procedure.
		 
		
		
		 When a `Gossip` is received the version (vector clock) is used to determine if the
		 received `Gossip` is newer or older than the current local `Gossip`. The received `Gossip`
		 and local `Gossip` is merged in case of conflicting version, i.e. vector clocks without
		 same history.
		 
		
		
		 When a node is told by the user to leave the cluster the leader will move it to `Leaving`
		 and then rebalance and repartition the cluster and start hand\-off by migrating the actors
		 from the leaving node to the new partitions. Once this process is complete the leader will
		 move the node to the `Exiting` state and once a convergence is complete move the node to
		 `Removed` by removing it from the `members` set and sending a `Removed` command to the
		 removed node telling it to shut itself down.
		- #### apply$default$3
		
		
		
		```
		public [VectorClock](VectorClock.html "class in akka.cluster") apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object> apply$default$4()
		```
		- #### vclockName
		
		
		
		```
		public java.lang.String vclockName​([UniqueAddress](UniqueAddress.html "class in akka.cluster") node)
		```
		- #### apply
		
		
		
		```
		public akka.cluster.Gossip apply​(scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")> members,
		                                 akka.cluster.GossipOverview overview,
		                                 [VectorClock](VectorClock.html "class in akka.cluster") version,
		                                 scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object> tombstones)
		```
		
		INTERNAL API
		 
		 Represents the state of the cluster; cluster ring membership, ring convergence \-
		 all versioned by a vector clock.
		 
		
		
		 When a node is joining the `Member`, with status `Joining`, is added to `members`.
		 If the joining node was downed it is moved from `overview.unreachable` (status `Down`)
		 to `members` (status `Joining`). It cannot rejoin if not first downed.
		 
		
		
		 When convergence is reached the leader change status of `members` from `Joining`
		 to `Up`.
		 
		
		
		 When failure detector consider a node as unavailable it will be moved from
		 `members` to `overview.unreachable`.
		 
		
		
		 When a node is downed, either manually or automatically, its status is changed to `Down`.
		 It is also removed from `overview.seen` table. The node will reside as `Down` in the
		 `overview.unreachable` set until joining again and it will then go through the normal
		 joining procedure.
		 
		
		
		 When a `Gossip` is received the version (vector clock) is used to determine if the
		 received `Gossip` is newer or older than the current local `Gossip`. The received `Gossip`
		 and local `Gossip` is merged in case of conflicting version, i.e. vector clocks without
		 same history.
		 
		
		
		 When a node is told by the user to leave the cluster the leader will move it to `Leaving`
		 and then rebalance and repartition the cluster and start hand\-off by migrating the actors
		 from the leaving node to the new partitions. Once this process is complete the leader will
		 move the node to the `Exiting` state and once a convergence is complete move the node to
		 `Removed` by removing it from the `members` set and sending a `Removed` command to the
		 removed node telling it to shut itself down.
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<scala.collection.immutable.SortedSet<[Member](Member.html "class in akka.cluster")>,​akka.cluster.GossipOverview,​[VectorClock](VectorClock.html "class in akka.cluster"),​scala.collection.immutable.Map<[UniqueAddress](UniqueAddress.html "class in akka.cluster"),​java.lang.Object>>> unapply​(akka.cluster.Gossip x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/Gossip$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/VectorClock.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/Gossip$.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/Gossip$.html)*