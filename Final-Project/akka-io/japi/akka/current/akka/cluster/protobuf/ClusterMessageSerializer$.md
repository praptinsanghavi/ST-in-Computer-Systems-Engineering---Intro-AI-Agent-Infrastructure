---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:04:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/ClusterMessageSerializer$.html
title: ClusterMessageSerializer$
---

# ClusterMessageSerializer$

## Content

Package [akka.cluster.protobuf](package-summary.html)
## Class ClusterMessageSerializer$

- java.lang.Object
- - akka.cluster.protobuf.ClusterMessageSerializer$

- ---

```
public class ClusterMessageSerializer$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterMessageSerializer$](ClusterMessageSerializer$.html "class in akka.cluster.protobuf")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterMessageSerializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[ClusterRouterPoolManifest](#ClusterRouterPoolManifest())()` |  |
	| `java.lang.String` | `[DownManifest](#DownManifest())()` |  |
	| `java.lang.String` | `[ExitingConfirmedManifest](#ExitingConfirmedManifest())()` |  |
	| `java.lang.String` | `[GossipEnvelopeManifest](#GossipEnvelopeManifest())()` |  |
	| `java.lang.String` | `[GossipStatusManifest](#GossipStatusManifest())()` |  |
	| `java.lang.String` | `[HeartbeatManifest](#HeartbeatManifest())()` |  |
	| `java.lang.String` | `[HeartBeatManifestPre2523](#HeartBeatManifestPre2523())()` |  |
	| `java.lang.String` | `[HeartbeatRspManifest](#HeartbeatRspManifest())()` |  |
	| `java.lang.String` | `[HeartBeatRspManifest2523](#HeartBeatRspManifest2523())()` |  |
	| `java.lang.String` | `[InitJoinAckManifest](#InitJoinAckManifest())()` |  |
	| `java.lang.String` | `[InitJoinManifest](#InitJoinManifest())()` |  |
	| `java.lang.String` | `[InitJoinNackManifest](#InitJoinNackManifest())()` |  |
	| `java.lang.String` | `[JoinManifest](#JoinManifest())()` |  |
	| `java.lang.String` | `[LeaveManifest](#LeaveManifest())()` |  |
	| `java.lang.String` | `[OldClusterRouterPoolManifest](#OldClusterRouterPoolManifest())()` |  |
	| `java.lang.String` | `[OldDownManifest](#OldDownManifest())()` |  |
	| `java.lang.String` | `[OldExitingConfirmedManifest](#OldExitingConfirmedManifest())()` |  |
	| `java.lang.String` | `[OldGossipEnvelopeManifest](#OldGossipEnvelopeManifest())()` |  |
	| `java.lang.String` | `[OldGossipStatusManifest](#OldGossipStatusManifest())()` |  |
	| `java.lang.String` | `[OldInitJoinAckManifest](#OldInitJoinAckManifest())()` |  |
	| `java.lang.String` | `[OldInitJoinManifest](#OldInitJoinManifest())()` |  |
	| `java.lang.String` | `[OldInitJoinNackManifest](#OldInitJoinNackManifest())()` |  |
	| `java.lang.String` | `[OldJoinManifest](#OldJoinManifest())()` |  |
	| `java.lang.String` | `[OldLeaveManifest](#OldLeaveManifest())()` |  |
	| `java.lang.String` | `[OldWelcomeManifest](#OldWelcomeManifest())()` |  |
	| `java.lang.String` | `[PrepareForShutdownManifest](#PrepareForShutdownManifest())()` |  |
	| `java.lang.String` | `[WelcomeManifest](#WelcomeManifest())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterMessageSerializer$](ClusterMessageSerializer$.html "class in akka.cluster.protobuf") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterMessageSerializer$
		
		
		
		```
		public ClusterMessageSerializer$()
		```

	- ### Method Detail
	
	
	
		- #### OldJoinManifest
		
		
		
		```
		public java.lang.String OldJoinManifest()
		```
		- #### OldWelcomeManifest
		
		
		
		```
		public java.lang.String OldWelcomeManifest()
		```
		- #### OldLeaveManifest
		
		
		
		```
		public java.lang.String OldLeaveManifest()
		```
		- #### OldDownManifest
		
		
		
		```
		public java.lang.String OldDownManifest()
		```
		- #### OldInitJoinManifest
		
		
		
		```
		public java.lang.String OldInitJoinManifest()
		```
		- #### OldInitJoinAckManifest
		
		
		
		```
		public java.lang.String OldInitJoinAckManifest()
		```
		- #### OldInitJoinNackManifest
		
		
		
		```
		public java.lang.String OldInitJoinNackManifest()
		```
		- #### HeartBeatManifestPre2523
		
		
		
		```
		public java.lang.String HeartBeatManifestPre2523()
		```
		- #### HeartBeatRspManifest2523
		
		
		
		```
		public java.lang.String HeartBeatRspManifest2523()
		```
		- #### OldExitingConfirmedManifest
		
		
		
		```
		public java.lang.String OldExitingConfirmedManifest()
		```
		- #### OldGossipStatusManifest
		
		
		
		```
		public java.lang.String OldGossipStatusManifest()
		```
		- #### OldGossipEnvelopeManifest
		
		
		
		```
		public java.lang.String OldGossipEnvelopeManifest()
		```
		- #### OldClusterRouterPoolManifest
		
		
		
		```
		public java.lang.String OldClusterRouterPoolManifest()
		```
		- #### JoinManifest
		
		
		
		```
		public java.lang.String JoinManifest()
		```
		- #### WelcomeManifest
		
		
		
		```
		public java.lang.String WelcomeManifest()
		```
		- #### LeaveManifest
		
		
		
		```
		public java.lang.String LeaveManifest()
		```
		- #### DownManifest
		
		
		
		```
		public java.lang.String DownManifest()
		```
		- #### PrepareForShutdownManifest
		
		
		
		```
		public java.lang.String PrepareForShutdownManifest()
		```
		- #### InitJoinManifest
		
		
		
		```
		public java.lang.String InitJoinManifest()
		```
		- #### InitJoinAckManifest
		
		
		
		```
		public java.lang.String InitJoinAckManifest()
		```
		- #### InitJoinNackManifest
		
		
		
		```
		public java.lang.String InitJoinNackManifest()
		```
		- #### HeartbeatManifest
		
		
		
		```
		public java.lang.String HeartbeatManifest()
		```
		- #### HeartbeatRspManifest
		
		
		
		```
		public java.lang.String HeartbeatRspManifest()
		```
		- #### ExitingConfirmedManifest
		
		
		
		```
		public java.lang.String ExitingConfirmedManifest()
		```
		- #### GossipStatusManifest
		
		
		
		```
		public java.lang.String GossipStatusManifest()
		```
		- #### GossipEnvelopeManifest
		
		
		
		```
		public java.lang.String GossipEnvelopeManifest()
		```
		- #### ClusterRouterPoolManifest
		
		
		
		```
		public java.lang.String ClusterRouterPoolManifest()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/ClusterMessageSerializer$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/ClusterMessageSerializer$.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/ClusterMessageSerializer$.html)*