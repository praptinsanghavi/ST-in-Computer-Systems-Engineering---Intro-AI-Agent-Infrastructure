---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:25:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.html
title: InternalClusterAction
---

# InternalClusterAction

## Content

Package [akka.cluster](package-summary.html)
## Class InternalClusterAction

- java.lang.Object
- - akka.cluster.InternalClusterAction

- ---

```
public class InternalClusterAction
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[InternalClusterAction.AddOnMemberRemovedListener](InternalClusterAction.AddOnMemberRemovedListener.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.AddOnMemberRemovedListener$](InternalClusterAction.AddOnMemberRemovedListener$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.AddOnMemberUpListener](InternalClusterAction.AddOnMemberUpListener.html "class in akka.cluster")` | Command to `ClusterDaemon` to create a  `OnMemberStatusChangedListener`. |
	| `static class` | `[InternalClusterAction.AddOnMemberUpListener$](InternalClusterAction.AddOnMemberUpListener$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.CompatibleConfig](InternalClusterAction.CompatibleConfig.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.CompatibleConfig$](InternalClusterAction.CompatibleConfig$.html "class in akka.cluster")` |  |
	| `static interface` | `[InternalClusterAction.ConfigCheck](InternalClusterAction.ConfigCheck.html "interface in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.ConfigCheckUnsupportedByJoiningNode$](InternalClusterAction.ConfigCheckUnsupportedByJoiningNode$.html "class in akka.cluster")` | Node with version 2\.5\.9 or earlier is joining. |
	| `static class` | `[InternalClusterAction.ExitingCompleted$](InternalClusterAction.ExitingCompleted$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.ExitingConfirmed](InternalClusterAction.ExitingConfirmed.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.ExitingConfirmed$](InternalClusterAction.ExitingConfirmed$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.GetClusterCoreRef$](InternalClusterAction.GetClusterCoreRef$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.GossipSpeedupTick$](InternalClusterAction.GossipSpeedupTick$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.GossipTick$](InternalClusterAction.GossipTick$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.IncompatibleConfig$](InternalClusterAction.IncompatibleConfig$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.InitJoin](InternalClusterAction.InitJoin.html "class in akka.cluster")` | see JoinSeedNode |
	| `static class` | `[InternalClusterAction.InitJoin$](InternalClusterAction.InitJoin$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.InitJoinAck](InternalClusterAction.InitJoinAck.html "class in akka.cluster")` | see JoinSeedNode |
	| `static class` | `[InternalClusterAction.InitJoinAck$](InternalClusterAction.InitJoinAck$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.InitJoinNack](InternalClusterAction.InitJoinNack.html "class in akka.cluster")` | see JoinSeedNode |
	| `static class` | `[InternalClusterAction.InitJoinNack$](InternalClusterAction.InitJoinNack$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.Join](InternalClusterAction.Join.html "class in akka.cluster")` | Command to join the cluster. |
	| `static class` | `[InternalClusterAction.Join$](InternalClusterAction.Join$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.JoinSeedNode$](InternalClusterAction.JoinSeedNode$.html "class in akka.cluster")` | Start message of the process to join one of the seed nodes. |
	| `static class` | `[InternalClusterAction.JoinSeedNodes](InternalClusterAction.JoinSeedNodes.html "class in akka.cluster")` | Command to initiate the process to join the specified  seed nodes. |
	| `static class` | `[InternalClusterAction.JoinSeedNodes$](InternalClusterAction.JoinSeedNodes$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.LeaderActionsTick$](InternalClusterAction.LeaderActionsTick$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.PublishChanges](InternalClusterAction.PublishChanges.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.PublishChanges$](InternalClusterAction.PublishChanges$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.PublishEvent](InternalClusterAction.PublishEvent.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.PublishEvent$](InternalClusterAction.PublishEvent$.html "class in akka.cluster")` |  |
	| `static interface` | `[InternalClusterAction.PublishMessage](InternalClusterAction.PublishMessage.html "interface in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.PublishStatsTick$](InternalClusterAction.PublishStatsTick$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.ReapUnreachableTick$](InternalClusterAction.ReapUnreachableTick$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.SendCurrentClusterState](InternalClusterAction.SendCurrentClusterState.html "class in akka.cluster")` | param: receiver [`ClusterEvent.CurrentClusterState`](ClusterEvent.CurrentClusterState.html "class in akka.cluster") will be sent to the `receiver` |
	| `static class` | `[InternalClusterAction.SendCurrentClusterState$](InternalClusterAction.SendCurrentClusterState$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.SendGossipTo](InternalClusterAction.SendGossipTo.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.SendGossipTo$](InternalClusterAction.SendGossipTo$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.Subscribe](InternalClusterAction.Subscribe.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.Subscribe$](InternalClusterAction.Subscribe$.html "class in akka.cluster")` |  |
	| `static interface` | `[InternalClusterAction.SubscriptionMessage](InternalClusterAction.SubscriptionMessage.html "interface in akka.cluster")` |  |
	| `static interface` | `[InternalClusterAction.Tick](InternalClusterAction.Tick.html "interface in akka.cluster")` | Marker interface for periodic tick messages |
	| `static class` | `[InternalClusterAction.UncheckedConfig$](InternalClusterAction.UncheckedConfig$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.Unsubscribe](InternalClusterAction.Unsubscribe.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.Unsubscribe$](InternalClusterAction.Unsubscribe$.html "class in akka.cluster")` |  |
	| `static class` | `[InternalClusterAction.Welcome](InternalClusterAction.Welcome.html "class in akka.cluster")` | Reply to Join |
	| `static class` | `[InternalClusterAction.Welcome$](InternalClusterAction.Welcome$.html "class in akka.cluster")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InternalClusterAction](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### InternalClusterAction
		
		
		
		```
		public InternalClusterAction()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.AddOnMemberRemovedListener$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.AddOnMemberRemovedListener.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.AddOnMemberUpListener$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.AddOnMemberUpListener.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.CompatibleConfig$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.CompatibleConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.ConfigCheck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.ConfigCheckUnsupportedByJoiningNode$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.ExitingCompleted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.ExitingConfirmed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.ExitingConfirmed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.GetClusterCoreRef$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.GossipSpeedupTick$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.GossipTick$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.IncompatibleConfig$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.InitJoin$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.InitJoin.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.InitJoinAck$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.InitJoinAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.InitJoinNack$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.InitJoinNack.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Join$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Join.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.JoinSeedNode$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.JoinSeedNodes$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.JoinSeedNodes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.LeaderActionsTick$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.PublishChanges$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.PublishChanges.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.PublishEvent$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.PublishEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.PublishMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.PublishStatsTick$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.ReapUnreachableTick$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.SendCurrentClusterState$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.SendCurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.SendGossipTo$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.SendGossipTo.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Subscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Subscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.SubscriptionMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Tick.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.UncheckedConfig$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Unsubscribe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Welcome$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Welcome.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.html)*