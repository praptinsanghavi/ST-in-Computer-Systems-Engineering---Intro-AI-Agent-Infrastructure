---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:25:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterLogMarker$.html
title: ClusterLogMarker$
---

# ClusterLogMarker$

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterLogMarker$

- java.lang.Object
- - akka.cluster.ClusterLogMarker$

- ---

```
public class ClusterLogMarker$
extends java.lang.Object
```

This is public with the purpose to document the used markers and properties of log events.
 No guarantee that it will remain binary compatible, but the marker names and properties
 are considered public API and will not be changed without notice.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterLogMarker$](ClusterLogMarker$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterLogMarker$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[heartbeatStarvation](#heartbeatStarvation())()` | Marker "akkaHeartbeatStarvation" of log event when scheduled heartbeat was delayed. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[joinFailed](#joinFailed())()` | Marker "akkaJoinFailed" of log event when node couldn't join seed nodes. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[leaderIncapacitated](#leaderIncapacitated())()` | Marker "akkaClusterLeaderIncapacitated" of log event when leader can't perform its duties. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[leaderRestored](#leaderRestored())()` | Marker "akkaClusterLeaderRestored" of log event when leader can perform its duties again. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[memberChanged](#memberChanged(akka.cluster.UniqueAddress,akka.cluster.MemberStatus))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") node,  [MemberStatus](MemberStatus.html "class in akka.cluster") status)` | Marker "akkaMemberChanged" of log event when a member's status is changed by the leader. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[reachable](#reachable(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") node)` | Marker "akkaReachable" of log event when a node is marked as reachable again based no failure detector observation. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[sbrDowning](#sbrDowning(akka.cluster.sbr.DowningStrategy.Decision))​(akka.cluster.sbr.DowningStrategy.Decision decision)` | Marker "akkaSbrDowning" of log event when Split Brain Resolver has made a downing decision. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[sbrDowningNode](#sbrDowningNode(akka.cluster.UniqueAddress,akka.cluster.sbr.DowningStrategy.Decision))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") node,  akka.cluster.sbr.DowningStrategy.Decision decision)` | Marker "akkaSbrDowningNode" of log event when a member is downed by Split Brain Resolver. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[sbrInstability](#sbrInstability())()` | Marker "akkaSbrInstability" of log event when Split Brain Resolver has detected too much instability  and will down all nodes. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[sbrLeaseAcquired](#sbrLeaseAcquired(akka.cluster.sbr.DowningStrategy.Decision))​(akka.cluster.sbr.DowningStrategy.Decision decision)` | Marker "akkaSbrLeaseAcquired" of log event when Split Brain Resolver has acquired the lease. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[sbrLeaseDenied](#sbrLeaseDenied(akka.cluster.sbr.DowningStrategy.Decision))​(akka.cluster.sbr.DowningStrategy.Decision reverseDecision)` | Marker "akkaSbrLeaseDenied" of log event when Split Brain Resolver has acquired the lease. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[sbrLeaseReleased](#sbrLeaseReleased())()` | Marker "akkaSbrLeaseReleased" of log event when Split Brain Resolver has released the lease. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[singletonStarted](#singletonStarted())()` | Marker "akkaClusterSingletonStarted" of log event when Cluster Singleton  instance has started. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[singletonTerminated](#singletonTerminated())()` | Marker "akkaClusterSingletonTerminated" of log event when Cluster Singleton  instance has terminated. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[unreachable](#unreachable(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") node)` | Marker "akkaUnreachable" of log event when a node is marked as unreachable based no failure detector observation. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterLogMarker$](ClusterLogMarker$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterLogMarker$
		
		
		
		```
		public ClusterLogMarker$()
		```

	- ### Method Detail
	
	
	
		- #### unreachable
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") unreachable​([Address](../actor/Address.html "class in akka.actor") node)
		```
		
		Marker "akkaUnreachable" of log event when a node is marked as unreachable based no failure detector observation.
		
		Parameters:
		`node` \- The address of the node that is marked as unreachable. Included as property "akkaRemoteAddress".
		- #### reachable
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") reachable​([Address](../actor/Address.html "class in akka.actor") node)
		```
		
		Marker "akkaReachable" of log event when a node is marked as reachable again based no failure detector observation.
		
		Parameters:
		`node` \- The address of the node that is marked as reachable. Included as property "akkaRemoteAddress".
		- #### heartbeatStarvation
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") heartbeatStarvation()
		```
		
		Marker "akkaHeartbeatStarvation" of log event when scheduled heartbeat was delayed.
		- #### leaderIncapacitated
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") leaderIncapacitated()
		```
		
		Marker "akkaClusterLeaderIncapacitated" of log event when leader can't perform its duties.
		 Typically because there are unreachable nodes that have not been downed.
		- #### leaderRestored
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") leaderRestored()
		```
		
		Marker "akkaClusterLeaderRestored" of log event when leader can perform its duties again.
		- #### joinFailed
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") joinFailed()
		```
		
		Marker "akkaJoinFailed" of log event when node couldn't join seed nodes.
		- #### memberChanged
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") memberChanged​([UniqueAddress](UniqueAddress.html "class in akka.cluster") node,
		                               [MemberStatus](MemberStatus.html "class in akka.cluster") status)
		```
		
		Marker "akkaMemberChanged" of log event when a member's status is changed by the leader.
		
		Parameters:
		`node` \- The address of the node that is changed. Included as property "akkaRemoteAddress"
		 and "akkaRemoteAddressUid".
		`status` \- New member status. Included as property "akkaMemberStatus".
		- #### singletonStarted
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") singletonStarted()
		```
		
		Marker "akkaClusterSingletonStarted" of log event when Cluster Singleton
		 instance has started.
		- #### singletonTerminated
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") singletonTerminated()
		```
		
		Marker "akkaClusterSingletonTerminated" of log event when Cluster Singleton
		 instance has terminated.
		- #### sbrDowning
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") sbrDowning​(akka.cluster.sbr.DowningStrategy.Decision decision)
		```
		
		Marker "akkaSbrDowning" of log event when Split Brain Resolver has made a downing decision. Followed
		 by `ClusterLogMarker.sbrDowningNode` for each node that is downed.
		
		Parameters:
		`decision` \- The downing decision. Included as property "akkaSbrDecision".
		- #### sbrDowningNode
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") sbrDowningNode​([UniqueAddress](UniqueAddress.html "class in akka.cluster") node,
		                                akka.cluster.sbr.DowningStrategy.Decision decision)
		```
		
		Marker "akkaSbrDowningNode" of log event when a member is downed by Split Brain Resolver.
		
		Parameters:
		`node` \- The address of the node that is downed. Included as property "akkaRemoteAddress"
		 and "akkaRemoteAddressUid".
		`decision` \- The downing decision. Included as property "akkaSbrDecision".
		- #### sbrInstability
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") sbrInstability()
		```
		
		Marker "akkaSbrInstability" of log event when Split Brain Resolver has detected too much instability
		 and will down all nodes.
		- #### sbrLeaseAcquired
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") sbrLeaseAcquired​(akka.cluster.sbr.DowningStrategy.Decision decision)
		```
		
		Marker "akkaSbrLeaseAcquired" of log event when Split Brain Resolver has acquired the lease.
		
		Parameters:
		`decision` \- The downing decision. Included as property "akkaSbrDecision".
		- #### sbrLeaseDenied
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") sbrLeaseDenied​(akka.cluster.sbr.DowningStrategy.Decision reverseDecision)
		```
		
		Marker "akkaSbrLeaseDenied" of log event when Split Brain Resolver has acquired the lease.
		
		Parameters:
		`reverseDecision` \- The (reverse) downing decision. Included as property "akkaSbrDecision".
		- #### sbrLeaseReleased
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") sbrLeaseReleased()
		```
		
		Marker "akkaSbrLeaseReleased" of log event when Split Brain Resolver has released the lease.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/MemberStatus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LogMarker.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterLogMarker$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterLogMarker$.html)*