---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html
title: akka.cluster
---

# akka.cluster

## Content

# Package akka.cluster

- Interface Summary 
| Interface | Description |
| [ClusterEvent.ClusterDomainEvent](ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster") | Marker interface for cluster domain events. |
| --- | --- |
| [ClusterEvent.DataCenterReachabilityEvent](ClusterEvent.DataCenterReachabilityEvent.html "interface in akka.cluster") | Deprecated. Use Akka Distributed Cluster instead. |
| [ClusterEvent.MemberEvent](ClusterEvent.MemberEvent.html "interface in akka.cluster") | Marker interface for membership events. |
| [ClusterEvent.ReachabilityEvent](ClusterEvent.ReachabilityEvent.html "interface in akka.cluster") | Marker interface to facilitate subscription of  both [`ClusterEvent.UnreachableMember`](ClusterEvent.UnreachableMember.html "class in akka.cluster") and [`ClusterEvent.ReachableMember`](ClusterEvent.ReachableMember.html "class in akka.cluster"). |
| [ClusterMessage](ClusterMessage.html "interface in akka.cluster") | Base trait for all cluster messages. |
| [ClusterNodeMBean](ClusterNodeMBean.html "interface in akka.cluster") | Interface for the cluster JMX MBean. |
| [ConfigValidation](ConfigValidation.html "interface in akka.cluster") |  |
| [InternalClusterAction.ConfigCheck](InternalClusterAction.ConfigCheck.html "interface in akka.cluster") |  |
| [InternalClusterAction.PublishMessage](InternalClusterAction.PublishMessage.html "interface in akka.cluster") |  |
| [InternalClusterAction.SubscriptionMessage](InternalClusterAction.SubscriptionMessage.html "interface in akka.cluster") |  |
| [InternalClusterAction.Tick](InternalClusterAction.Tick.html "interface in akka.cluster") | Marker interface for periodic tick messages |
| [VectorClock.Ordering](VectorClock.Ordering.html "interface in akka.cluster") |  |
- Class Summary 
| Class | Description |
| [Cluster](Cluster.html "class in akka.cluster") | This module is responsible cluster membership information. |
| --- | --- |
| [Cluster$](Cluster$.html "class in akka.cluster") | Cluster Extension Id and factory for creating Cluster extension. |
| [ClusterCoreDaemon$](ClusterCoreDaemon$.html "class in akka.cluster") | INTERNAL API. |
| [ClusterEvent](ClusterEvent.html "class in akka.cluster") | Domain events published to the event bus. |
| [ClusterEvent.ClusterShuttingDown$](ClusterEvent.ClusterShuttingDown$.html "class in akka.cluster") | This event is published when the cluster node is shutting down,  before the final [`ClusterEvent.MemberRemoved`](ClusterEvent.MemberRemoved.html "class in akka.cluster") events are published. |
| [ClusterEvent.CurrentClusterState](ClusterEvent.CurrentClusterState.html "class in akka.cluster") |  |
| [ClusterEvent.CurrentClusterState$](ClusterEvent.CurrentClusterState$.html "class in akka.cluster") |  |
| [ClusterEvent.CurrentInternalStats$](ClusterEvent.CurrentInternalStats$.html "class in akka.cluster") |  |
| [ClusterEvent.InitialStateAsEvents$](ClusterEvent.InitialStateAsEvents$.html "class in akka.cluster") | When using this subscription mode the events corresponding  to the current state will be sent to the subscriber to mimic what you would  have seen if you were listening to the events when they occurred in the past. |
| [ClusterEvent.InitialStateAsSnapshot$](ClusterEvent.InitialStateAsSnapshot$.html "class in akka.cluster") | When using this subscription mode a snapshot of  [`ClusterEvent.CurrentClusterState`](ClusterEvent.CurrentClusterState.html "class in akka.cluster") will be sent to the  subscriber as the first message. |
| [ClusterEvent.LeaderChanged](ClusterEvent.LeaderChanged.html "class in akka.cluster") | Leader of the cluster data center of this node changed. |
| [ClusterEvent.LeaderChanged$](ClusterEvent.LeaderChanged$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberDowned](ClusterEvent.MemberDowned.html "class in akka.cluster") | Member status changed to `MemberStatus.Down` and will be removed  when all members have seen the `Down` status. |
| [ClusterEvent.MemberDowned$](ClusterEvent.MemberDowned$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberExited](ClusterEvent.MemberExited.html "class in akka.cluster") | Member status changed to `MemberStatus.Exiting` and will be removed  when all members have seen the `Exiting` status. |
| [ClusterEvent.MemberExited$](ClusterEvent.MemberExited$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberJoined](ClusterEvent.MemberJoined.html "class in akka.cluster") | Member status changed to Joining. |
| [ClusterEvent.MemberJoined$](ClusterEvent.MemberJoined$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberLeft](ClusterEvent.MemberLeft.html "class in akka.cluster") | Member status changed to Leaving. |
| [ClusterEvent.MemberLeft$](ClusterEvent.MemberLeft$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberPreparingForShutdown](ClusterEvent.MemberPreparingForShutdown.html "class in akka.cluster") |  |
| [ClusterEvent.MemberPreparingForShutdown$](ClusterEvent.MemberPreparingForShutdown$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberReadyForShutdown](ClusterEvent.MemberReadyForShutdown.html "class in akka.cluster") |  |
| [ClusterEvent.MemberReadyForShutdown$](ClusterEvent.MemberReadyForShutdown$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberRemoved](ClusterEvent.MemberRemoved.html "class in akka.cluster") | Member completely removed from the cluster. |
| [ClusterEvent.MemberRemoved$](ClusterEvent.MemberRemoved$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberTombstonesChanged$](ClusterEvent.MemberTombstonesChanged$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberUp](ClusterEvent.MemberUp.html "class in akka.cluster") | Member status changed to Up. |
| [ClusterEvent.MemberUp$](ClusterEvent.MemberUp$.html "class in akka.cluster") |  |
| [ClusterEvent.MemberWeaklyUp](ClusterEvent.MemberWeaklyUp.html "class in akka.cluster") | Member status changed to WeaklyUp. |
| [ClusterEvent.MemberWeaklyUp$](ClusterEvent.MemberWeaklyUp$.html "class in akka.cluster") |  |
| [ClusterEvent.ReachabilityChanged$](ClusterEvent.ReachabilityChanged$.html "class in akka.cluster") |  |
| [ClusterEvent.ReachableDataCenter](ClusterEvent.ReachableDataCenter.html "class in akka.cluster") | Deprecated. Use Akka Distributed Cluster instead. |
| [ClusterEvent.ReachableDataCenter$](ClusterEvent.ReachableDataCenter$.html "class in akka.cluster") |  |
| [ClusterEvent.ReachableMember](ClusterEvent.ReachableMember.html "class in akka.cluster") | A member is considered as reachable by the failure detector  after having been unreachable. |
| [ClusterEvent.ReachableMember$](ClusterEvent.ReachableMember$.html "class in akka.cluster") |  |
| [ClusterEvent.RoleLeaderChanged](ClusterEvent.RoleLeaderChanged.html "class in akka.cluster") | First member (leader) of the members within a role set (in the same data center as this node,  if data centers are used) changed. |
| [ClusterEvent.RoleLeaderChanged$](ClusterEvent.RoleLeaderChanged$.html "class in akka.cluster") |  |
| [ClusterEvent.SeenChanged$](ClusterEvent.SeenChanged$.html "class in akka.cluster") |  |
| [ClusterEvent.SubscriptionInitialStateMode](ClusterEvent.SubscriptionInitialStateMode.html "class in akka.cluster") |  |
| [ClusterEvent.UnreachableDataCenter](ClusterEvent.UnreachableDataCenter.html "class in akka.cluster") | Deprecated. Use Akka Distributed Cluster instead. |
| [ClusterEvent.UnreachableDataCenter$](ClusterEvent.UnreachableDataCenter$.html "class in akka.cluster") |  |
| [ClusterEvent.UnreachableMember](ClusterEvent.UnreachableMember.html "class in akka.cluster") | A member is considered as unreachable by the failure detector. |
| [ClusterEvent.UnreachableMember$](ClusterEvent.UnreachableMember$.html "class in akka.cluster") |  |
| [ClusterEvent$](ClusterEvent$.html "class in akka.cluster") | Domain events published to the event bus. |
| [ClusterHeartbeatReceiver$](ClusterHeartbeatReceiver$.html "class in akka.cluster") | INTERNAL API: Utilities to obtain ClusterHeartbeatReceiver paths |
| [ClusterHeartbeatSender$](ClusterHeartbeatSender$.html "class in akka.cluster") | INTERNAL API |
| [ClusterHeartbeatSenderState$](ClusterHeartbeatSenderState$.html "class in akka.cluster") |  |
| [ClusterLogClass](ClusterLogClass.html "class in akka.cluster") | INTERNAL API |
| [ClusterLogClass$](ClusterLogClass$.html "class in akka.cluster") | INTERNAL API |
| [ClusterLogMarker](ClusterLogMarker.html "class in akka.cluster") | This is public with the purpose to document the used markers and properties of log events. |
| [ClusterLogMarker.Properties$](ClusterLogMarker.Properties$.html "class in akka.cluster") | INTERNAL API |
| [ClusterLogMarker$](ClusterLogMarker$.html "class in akka.cluster") | This is public with the purpose to document the used markers and properties of log events. |
| [ClusterReadView$](ClusterReadView$.html "class in akka.cluster") | INTERNAL API |
| [ClusterRemoteWatcher$](ClusterRemoteWatcher$.html "class in akka.cluster") | INTERNAL API |
| [ClusterScope](ClusterScope.html "class in akka.cluster") |  |
| [ClusterScope$](ClusterScope$.html "class in akka.cluster") | Cluster aware scope of a [`Deploy`](../actor/Deploy.html "class in akka.actor") |
| [ClusterSettings](ClusterSettings.html "class in akka.cluster") |  |
| [ClusterSettings$](ClusterSettings$.html "class in akka.cluster") |  |
| [ClusterUserAction](ClusterUserAction.html "class in akka.cluster") | INTERNAL API  Cluster commands sent by the USER via  [`Cluster`](Cluster.html "class in akka.cluster") extension  or JMX. |
| [ClusterUserAction.Down](ClusterUserAction.Down.html "class in akka.cluster") | Command to mark node as temporary down. |
| [ClusterUserAction.Down$](ClusterUserAction.Down$.html "class in akka.cluster") |  |
| [ClusterUserAction.JoinTo](ClusterUserAction.JoinTo.html "class in akka.cluster") | Command to initiate join another node (represented by `address`). |
| [ClusterUserAction.JoinTo$](ClusterUserAction.JoinTo$.html "class in akka.cluster") |  |
| [ClusterUserAction.Leave](ClusterUserAction.Leave.html "class in akka.cluster") | Command to leave the cluster. |
| [ClusterUserAction.Leave$](ClusterUserAction.Leave$.html "class in akka.cluster") |  |
| [ClusterUserAction.PrepareForShutdown$](ClusterUserAction.PrepareForShutdown$.html "class in akka.cluster") | Command to mark all nodes as shutting down |
| [ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster") | Command to set the `appVersion` after system startup but before joining. |
| [ClusterUserAction.SetAppVersion$](ClusterUserAction.SetAppVersion$.html "class in akka.cluster") |  |
| [ClusterUserAction.SetAppVersionLater$](ClusterUserAction.SetAppVersionLater$.html "class in akka.cluster") | The `appVersion` is defined after system startup but before joining. |
| [ClusterUserAction$](ClusterUserAction$.html "class in akka.cluster") | INTERNAL API  Cluster commands sent by the USER via  [`Cluster`](Cluster.html "class in akka.cluster") extension  or JMX. |
| [CoordinatedShutdownLeave$](CoordinatedShutdownLeave$.html "class in akka.cluster") | INTERNAL API |
| [CrossDcHeartbeatingState$](CrossDcHeartbeatingState$.html "class in akka.cluster") | INTERNAL API |
| [CrossDcHeartbeatSender$](CrossDcHeartbeatSender$.html "class in akka.cluster") | INTERNAL API |
| [DowningProvider](DowningProvider.html "class in akka.cluster") | API for plugins that will handle downing of cluster nodes. |
| [DowningProvider$](DowningProvider$.html "class in akka.cluster") | INTERNAL API |
| [Gossip$](Gossip$.html "class in akka.cluster") | INTERNAL API |
| [GossipEnvelope$](GossipEnvelope$.html "class in akka.cluster") |  |
| [GossipOverview$](GossipOverview$.html "class in akka.cluster") |  |
| [GossipStats$](GossipStats$.html "class in akka.cluster") |  |
| [GossipStatus$](GossipStatus$.html "class in akka.cluster") |  |
| [HeartbeatNodeRing$](HeartbeatNodeRing$.html "class in akka.cluster") |  |
| [InternalClusterAction](InternalClusterAction.html "class in akka.cluster") | INTERNAL API |
| [InternalClusterAction.AddOnMemberRemovedListener](InternalClusterAction.AddOnMemberRemovedListener.html "class in akka.cluster") |  |
| [InternalClusterAction.AddOnMemberRemovedListener$](InternalClusterAction.AddOnMemberRemovedListener$.html "class in akka.cluster") |  |
| [InternalClusterAction.AddOnMemberUpListener](InternalClusterAction.AddOnMemberUpListener.html "class in akka.cluster") | Command to `ClusterDaemon` to create a  `OnMemberStatusChangedListener`. |
| [InternalClusterAction.AddOnMemberUpListener$](InternalClusterAction.AddOnMemberUpListener$.html "class in akka.cluster") |  |
| [InternalClusterAction.CompatibleConfig](InternalClusterAction.CompatibleConfig.html "class in akka.cluster") |  |
| [InternalClusterAction.CompatibleConfig$](InternalClusterAction.CompatibleConfig$.html "class in akka.cluster") |  |
| [InternalClusterAction.ConfigCheckUnsupportedByJoiningNode$](InternalClusterAction.ConfigCheckUnsupportedByJoiningNode$.html "class in akka.cluster") | Node with version 2\.5\.9 or earlier is joining. |
| [InternalClusterAction.ExitingCompleted$](InternalClusterAction.ExitingCompleted$.html "class in akka.cluster") |  |
| [InternalClusterAction.ExitingConfirmed](InternalClusterAction.ExitingConfirmed.html "class in akka.cluster") |  |
| [InternalClusterAction.ExitingConfirmed$](InternalClusterAction.ExitingConfirmed$.html "class in akka.cluster") |  |
| [InternalClusterAction.GetClusterCoreRef$](InternalClusterAction.GetClusterCoreRef$.html "class in akka.cluster") |  |
| [InternalClusterAction.GossipSpeedupTick$](InternalClusterAction.GossipSpeedupTick$.html "class in akka.cluster") |  |
| [InternalClusterAction.GossipTick$](InternalClusterAction.GossipTick$.html "class in akka.cluster") |  |
| [InternalClusterAction.IncompatibleConfig$](InternalClusterAction.IncompatibleConfig$.html "class in akka.cluster") |  |
| [InternalClusterAction.InitJoin](InternalClusterAction.InitJoin.html "class in akka.cluster") | see JoinSeedNode |
| [InternalClusterAction.InitJoin$](InternalClusterAction.InitJoin$.html "class in akka.cluster") |  |
| [InternalClusterAction.InitJoinAck](InternalClusterAction.InitJoinAck.html "class in akka.cluster") | see JoinSeedNode |
| [InternalClusterAction.InitJoinAck$](InternalClusterAction.InitJoinAck$.html "class in akka.cluster") |  |
| [InternalClusterAction.InitJoinNack](InternalClusterAction.InitJoinNack.html "class in akka.cluster") | see JoinSeedNode |
| [InternalClusterAction.InitJoinNack$](InternalClusterAction.InitJoinNack$.html "class in akka.cluster") |  |
| [InternalClusterAction.Join](InternalClusterAction.Join.html "class in akka.cluster") | Command to join the cluster. |
| [InternalClusterAction.Join$](InternalClusterAction.Join$.html "class in akka.cluster") |  |
| [InternalClusterAction.JoinSeedNode$](InternalClusterAction.JoinSeedNode$.html "class in akka.cluster") | Start message of the process to join one of the seed nodes. |
| [InternalClusterAction.JoinSeedNodes](InternalClusterAction.JoinSeedNodes.html "class in akka.cluster") | Command to initiate the process to join the specified  seed nodes. |
| [InternalClusterAction.JoinSeedNodes$](InternalClusterAction.JoinSeedNodes$.html "class in akka.cluster") |  |
| [InternalClusterAction.LeaderActionsTick$](InternalClusterAction.LeaderActionsTick$.html "class in akka.cluster") |  |
| [InternalClusterAction.PublishChanges](InternalClusterAction.PublishChanges.html "class in akka.cluster") |  |
| [InternalClusterAction.PublishChanges$](InternalClusterAction.PublishChanges$.html "class in akka.cluster") |  |
| [InternalClusterAction.PublishEvent](InternalClusterAction.PublishEvent.html "class in akka.cluster") |  |
| [InternalClusterAction.PublishEvent$](InternalClusterAction.PublishEvent$.html "class in akka.cluster") |  |
| [InternalClusterAction.PublishStatsTick$](InternalClusterAction.PublishStatsTick$.html "class in akka.cluster") |  |
| [InternalClusterAction.ReapUnreachableTick$](InternalClusterAction.ReapUnreachableTick$.html "class in akka.cluster") |  |
| [InternalClusterAction.SendCurrentClusterState](InternalClusterAction.SendCurrentClusterState.html "class in akka.cluster") | param: receiver [`ClusterEvent.CurrentClusterState`](ClusterEvent.CurrentClusterState.html "class in akka.cluster") will be sent to the `receiver` |
| [InternalClusterAction.SendCurrentClusterState$](InternalClusterAction.SendCurrentClusterState$.html "class in akka.cluster") |  |
| [InternalClusterAction.SendGossipTo](InternalClusterAction.SendGossipTo.html "class in akka.cluster") |  |
| [InternalClusterAction.SendGossipTo$](InternalClusterAction.SendGossipTo$.html "class in akka.cluster") |  |
| [InternalClusterAction.Subscribe](InternalClusterAction.Subscribe.html "class in akka.cluster") |  |
| [InternalClusterAction.Subscribe$](InternalClusterAction.Subscribe$.html "class in akka.cluster") |  |
| [InternalClusterAction.UncheckedConfig$](InternalClusterAction.UncheckedConfig$.html "class in akka.cluster") |  |
| [InternalClusterAction.Unsubscribe](InternalClusterAction.Unsubscribe.html "class in akka.cluster") |  |
| [InternalClusterAction.Unsubscribe$](InternalClusterAction.Unsubscribe$.html "class in akka.cluster") |  |
| [InternalClusterAction.Welcome](InternalClusterAction.Welcome.html "class in akka.cluster") | Reply to Join |
| [InternalClusterAction.Welcome$](InternalClusterAction.Welcome$.html "class in akka.cluster") |  |
| [InternalClusterAction$](InternalClusterAction$.html "class in akka.cluster") | INTERNAL API |
| [Invalid](Invalid.html "class in akka.cluster") |  |
| [Invalid$](Invalid$.html "class in akka.cluster") |  |
| [JoinConfigCompatCheckCluster](JoinConfigCompatCheckCluster.html "class in akka.cluster") | INTERNAL API |
| [JoinConfigCompatCheckCluster$](JoinConfigCompatCheckCluster$.html "class in akka.cluster") | INTERNAL API |
| [JoinConfigCompatChecker](JoinConfigCompatChecker.html "class in akka.cluster") |  |
| [JoinConfigCompatChecker$](JoinConfigCompatChecker$.html "class in akka.cluster") |  |
| [Member](Member.html "class in akka.cluster") | Represents the address, current status, and roles of a cluster member node. |
| [Member$](Member$.html "class in akka.cluster") | Module with factory and ordering methods for Member instances. |
| [MembershipState$](MembershipState$.html "class in akka.cluster") | INTERNAL API |
| [MemberStatus](MemberStatus.html "class in akka.cluster") | Defines the current status of a cluster member node |
| [MemberStatus.Down$](MemberStatus.Down$.html "class in akka.cluster") |  |
| [MemberStatus.Exiting$](MemberStatus.Exiting$.html "class in akka.cluster") |  |
| [MemberStatus.Joining$](MemberStatus.Joining$.html "class in akka.cluster") |  |
| [MemberStatus.Leaving$](MemberStatus.Leaving$.html "class in akka.cluster") |  |
| [MemberStatus.PreparingForShutdown$](MemberStatus.PreparingForShutdown$.html "class in akka.cluster") |  |
| [MemberStatus.ReadyForShutdown$](MemberStatus.ReadyForShutdown$.html "class in akka.cluster") |  |
| [MemberStatus.Removed$](MemberStatus.Removed$.html "class in akka.cluster") |  |
| [MemberStatus.Up$](MemberStatus.Up$.html "class in akka.cluster") |  |
| [MemberStatus.WeaklyUp$](MemberStatus.WeaklyUp$.html "class in akka.cluster") |  |
| [MemberStatus$](MemberStatus$.html "class in akka.cluster") |  |
| [NoDowning](NoDowning.html "class in akka.cluster") | Default downing provider used when no provider is configured. |
| [Reachability$](Reachability$.html "class in akka.cluster") | INTERNAL API |
| [UniqueAddress](UniqueAddress.html "class in akka.cluster") | Member identifier consisting of address and random `uid`. |
| [UniqueAddress$](UniqueAddress$.html "class in akka.cluster") |  |
| [Valid](Valid.html "class in akka.cluster") |  |
| [Valid$](Valid$.html "class in akka.cluster") |  |
| [VectorClock](VectorClock.html "class in akka.cluster") |  |
| [VectorClock.After$](VectorClock.After$.html "class in akka.cluster") |  |
| [VectorClock.Before$](VectorClock.Before$.html "class in akka.cluster") |  |
| [VectorClock.Concurrent$](VectorClock.Concurrent$.html "class in akka.cluster") |  |
| [VectorClock.Node$](VectorClock.Node$.html "class in akka.cluster") |  |
| [VectorClock.Same$](VectorClock.Same$.html "class in akka.cluster") |  |
| [VectorClock.Timestamp$](VectorClock.Timestamp$.html "class in akka.cluster") |  |
| [VectorClock$](VectorClock$.html "class in akka.cluster") | VectorClock module with helper classes and methods. |
| [VectorClockStats$](VectorClockStats$.html "class in akka.cluster") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterCoreDaemon$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.ClusterShuttingDown$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentClusterState$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentInternalStats$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.DataCenterReachabilityEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.InitialStateAsEvents$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.InitialStateAsSnapshot$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.LeaderChanged$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.LeaderChanged.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberDowned$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberDowned.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberExited$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberExited.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberJoined$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberJoined.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberLeft$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberLeft.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberPreparingForShutdown$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberPreparingForShutdown.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberReadyForShutdown$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberReadyForShutdown.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberRemoved$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberRemoved.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberTombstonesChanged$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberUp$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberUp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberWeaklyUp$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberWeaklyUp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.ReachabilityChanged$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.ReachabilityEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.ReachableDataCenter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.ReachableDataCenter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.ReachableMember$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.ReachableMember.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.RoleLeaderChanged$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.RoleLeaderChanged.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.SeenChanged$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.SubscriptionInitialStateMode.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.UnreachableDataCenter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.UnreachableDataCenter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.UnreachableMember$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.UnreachableMember.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html)*