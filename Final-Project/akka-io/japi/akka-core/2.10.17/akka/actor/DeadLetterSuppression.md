---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html
title: DeadLetterSuppression
---

# DeadLetterSuppression

## Content

Package [akka.actor](package-summary.html)
## Interface DeadLetterSuppression

- All Known Subinterfaces:
`[ClusterEvent.ClusterDomainEvent](../cluster/ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")`, `[ClusterEvent.DataCenterReachabilityEvent](../cluster/ClusterEvent.DataCenterReachabilityEvent.html "interface in akka.cluster")`, `[ClusterEvent.MemberEvent](../cluster/ClusterEvent.MemberEvent.html "interface in akka.cluster")`, `[ClusterEvent.ReachabilityEvent](../cluster/ClusterEvent.ReachabilityEvent.html "interface in akka.cluster")`, `[Tcp.CloseCommand](../io/Tcp.CloseCommand.html "interface in akka.io")`, `[Tcp.ConnectionClosed](../io/Tcp.ConnectionClosed.html "interface in akka.io")`, `[TestPublisher.PublisherEvent](../stream/testkit/TestPublisher.PublisherEvent.html "interface in akka.stream.testkit")`, `[TestSubscriber.SubscriberEvent](../stream/testkit/TestSubscriber.SubscriberEvent.html "interface in akka.stream.testkit")`

All Known Implementing Classes:
`[AtLeastOnceDelivery.Internal$.RedeliveryTick$](../persistence/AtLeastOnceDelivery.Internal$.RedeliveryTick$.html "class in akka.persistence")`, `[BackoffSupervisor.StartChild$](../pattern/BackoffSupervisor.StartChild$.html "class in akka.pattern")`, `[ClusterEvent.ClusterShuttingDown$](../cluster/ClusterEvent.ClusterShuttingDown$.html "class in akka.cluster")`, `[ClusterEvent.LeaderChanged](../cluster/ClusterEvent.LeaderChanged.html "class in akka.cluster")`, `[ClusterEvent.MemberDowned](../cluster/ClusterEvent.MemberDowned.html "class in akka.cluster")`, `[ClusterEvent.MemberExited](../cluster/ClusterEvent.MemberExited.html "class in akka.cluster")`, `[ClusterEvent.MemberJoined](../cluster/ClusterEvent.MemberJoined.html "class in akka.cluster")`, `[ClusterEvent.MemberLeft](../cluster/ClusterEvent.MemberLeft.html "class in akka.cluster")`, `[ClusterEvent.MemberPreparingForShutdown](../cluster/ClusterEvent.MemberPreparingForShutdown.html "class in akka.cluster")`, `[ClusterEvent.MemberReadyForShutdown](../cluster/ClusterEvent.MemberReadyForShutdown.html "class in akka.cluster")`, `[ClusterEvent.MemberRemoved](../cluster/ClusterEvent.MemberRemoved.html "class in akka.cluster")`, `[ClusterEvent.MemberUp](../cluster/ClusterEvent.MemberUp.html "class in akka.cluster")`, `[ClusterEvent.MemberWeaklyUp](../cluster/ClusterEvent.MemberWeaklyUp.html "class in akka.cluster")`, `[ClusterEvent.ReachableDataCenter](../cluster/ClusterEvent.ReachableDataCenter.html "class in akka.cluster")`, `[ClusterEvent.ReachableMember](../cluster/ClusterEvent.ReachableMember.html "class in akka.cluster")`, `[ClusterEvent.RoleLeaderChanged](../cluster/ClusterEvent.RoleLeaderChanged.html "class in akka.cluster")`, `[ClusterEvent.UnreachableDataCenter](../cluster/ClusterEvent.UnreachableDataCenter.html "class in akka.cluster")`, `[ClusterEvent.UnreachableMember](../cluster/ClusterEvent.UnreachableMember.html "class in akka.cluster")`, `[ClusterSingletonManager.Internal$.AcquireLeaseFailure](../cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseFailure.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.AcquireLeaseResult](../cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseResult.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.HandOverToMe$](../cluster/singleton/ClusterSingletonManager.Internal$.HandOverToMe$.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.LeaseLost](../cluster/singleton/ClusterSingletonManager.Internal$.LeaseLost.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.ReleaseLeaseFailure](../cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseFailure.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.ReleaseLeaseResult](../cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseResult.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.TakeOverFromMe$](../cluster/singleton/ClusterSingletonManager.Internal$.TakeOverFromMe$.html "class in akka.cluster.singleton")`, `[ConsumerController.SequencedMessage](typed/delivery/ConsumerController.SequencedMessage.html "class in akka.actor.typed.delivery")`, `[DistributedPubSubMediator.Internal$.Delta](../cluster/pubsub/DistributedPubSubMediator.Internal$.Delta.html "class in akka.cluster.pubsub")`, `[DistributedPubSubMediator.Internal$.Status](../cluster/pubsub/DistributedPubSubMediator.Internal$.Status.html "class in akka.cluster.pubsub")`, `[DistributedPubSubMediator.SubscribeAck](../cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html "class in akka.cluster.pubsub")`, `[InternalClusterAction.ExitingConfirmed](../cluster/InternalClusterAction.ExitingConfirmed.html "class in akka.cluster")`, `[InternalClusterAction.InitJoin](../cluster/InternalClusterAction.InitJoin.html "class in akka.cluster")`, `[InternalClusterAction.InitJoinAck](../cluster/InternalClusterAction.InitJoinAck.html "class in akka.cluster")`, `[InternalClusterAction.InitJoinNack](../cluster/InternalClusterAction.InitJoinNack.html "class in akka.cluster")`, `[InternalClusterAction.JoinSeedNode$](../cluster/InternalClusterAction.JoinSeedNode$.html "class in akka.cluster")`, `[InternalClusterAction.Unsubscribe](../cluster/InternalClusterAction.Unsubscribe.html "class in akka.cluster")`, `[JournalProtocol.RecoverySuccess](../persistence/JournalProtocol.RecoverySuccess.html "class in akka.persistence")`, `[JournalProtocol.ReplayedMessage](../persistence/JournalProtocol.ReplayedMessage.html "class in akka.persistence")`, `[JournalProtocol.ReplayMessagesFailure](../persistence/JournalProtocol.ReplayMessagesFailure.html "class in akka.persistence")`, `[PoisonPill](PoisonPill.html "class in akka.actor")`, `[PoisonPill$](PoisonPill$.html "class in akka.actor")`, `[ProducerControllerImpl.Ack](typed/delivery/internal/ProducerControllerImpl.Ack.html "class in akka.actor.typed.delivery.internal")`, `[ProducerControllerImpl.Request](typed/delivery/internal/ProducerControllerImpl.Request.html "class in akka.actor.typed.delivery.internal")`, `[ProducerControllerImpl.Resend](typed/delivery/internal/ProducerControllerImpl.Resend.html "class in akka.actor.typed.delivery.internal")`, `[Replicator.Internal$.DeltaNack$](../cluster/ddata/Replicator.Internal$.DeltaNack$.html "class in akka.cluster.ddata")`, `[Replicator.Internal$.ReadResult](../cluster/ddata/Replicator.Internal$.ReadResult.html "class in akka.cluster.ddata")`, `[Replicator.Internal$.WriteAck$](../cluster/ddata/Replicator.Internal$.WriteAck$.html "class in akka.cluster.ddata")`, `[Replicator.Internal$.WriteNack$](../cluster/ddata/Replicator.Internal$.WriteNack$.html "class in akka.cluster.ddata")`, `[Replicator.UpdateSuccess](../cluster/ddata/Replicator.UpdateSuccess.html "class in akka.cluster.ddata")`, `[Replicator.UpdateSuccess](../cluster/ddata/typed/javadsl/Replicator.UpdateSuccess.html "class in akka.cluster.ddata.typed.javadsl")`, `[RestartSupervisor.ResetRestartCount](typed/internal/RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal")`, `[RestartSupervisor.ScheduledRestart](typed/internal/RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal")`, `[SelfRemoved](../cluster/typed/SelfRemoved.html "class in akka.cluster.typed")`, `[SelfUp](../cluster/typed/SelfUp.html "class in akka.cluster.typed")`, `[ServiceDiscovery.Resolved](../discovery/ServiceDiscovery.Resolved.html "class in akka.discovery")`, `[ShardCoordinator.Internal$.GetShardHome](../cluster/sharding/ShardCoordinator.Internal$.GetShardHome.html "class in akka.cluster.sharding")`, `[ShardCoordinator.Internal$.GracefulShutdownReq](../cluster/sharding/ShardCoordinator.Internal$.GracefulShutdownReq.html "class in akka.cluster.sharding")`, `[ShardCoordinator.Internal$.Register](../cluster/sharding/ShardCoordinator.Internal$.Register.html "class in akka.cluster.sharding")`, `[ShardCoordinator.Internal$.RegisterProxy](../cluster/sharding/ShardCoordinator.Internal$.RegisterProxy.html "class in akka.cluster.sharding")`, `[ShardCoordinator.Internal$.ShardHomes](../cluster/sharding/ShardCoordinator.Internal$.ShardHomes.html "class in akka.cluster.sharding")`, `[ShardCoordinator.Internal$.Terminate$](../cluster/sharding/ShardCoordinator.Internal$.Terminate$.html "class in akka.cluster.sharding")`, `[Tcp.Abort$](../io/Tcp.Abort$.html "class in akka.io")`, `[Tcp.Aborted$](../io/Tcp.Aborted$.html "class in akka.io")`, `[Tcp.Close$](../io/Tcp.Close$.html "class in akka.io")`, `[Tcp.Closed$](../io/Tcp.Closed$.html "class in akka.io")`, `[Tcp.ConfirmedClose$](../io/Tcp.ConfirmedClose$.html "class in akka.io")`, `[Tcp.ConfirmedClosed$](../io/Tcp.ConfirmedClosed$.html "class in akka.io")`, `[Tcp.ErrorClosed](../io/Tcp.ErrorClosed.html "class in akka.io")`, `[Tcp.PeerClosed$](../io/Tcp.PeerClosed$.html "class in akka.io")`, `[Tcp.ResumeReading$](../io/Tcp.ResumeReading$.html "class in akka.io")`, `[Terminated](Terminated.html "class in akka.actor")`, `[TestPublisher.CancelSubscription](../stream/testkit/TestPublisher.CancelSubscription.html "class in akka.stream.testkit")`, `[TestPublisher.RequestMore](../stream/testkit/TestPublisher.RequestMore.html "class in akka.stream.testkit")`, `[TestPublisher.Subscribe](../stream/testkit/TestPublisher.Subscribe.html "class in akka.stream.testkit")`, `[TestSubscriber.OnComplete$](../stream/testkit/TestSubscriber.OnComplete$.html "class in akka.stream.testkit")`, `[TestSubscriber.OnError](../stream/testkit/TestSubscriber.OnError.html "class in akka.stream.testkit")`, `[TestSubscriber.OnNext](../stream/testkit/TestSubscriber.OnNext.html "class in akka.stream.testkit")`, `[TestSubscriber.OnSubscribe](../stream/testkit/TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")`, `[TimerMessages.Scheduled](../stream/stage/TimerMessages.Scheduled.html "class in akka.stream.stage")`

---

```
public interface DeadLetterSuppression
```

Use with caution: Messages extending this trait will not be logged by the default dead\-letters listener.
 Instead they will be wrapped as [`SuppressedDeadLetter`](SuppressedDeadLetter.html "class in akka.actor") and may be subscribed for explicitly.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PoisonPill$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SuppressedDeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/ConsumerController.SequencedMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl.Ack.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl.Request.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/ProducerControllerImpl.Resend.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/RestartSupervisor.ResetRestartCount.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/RestartSupervisor.ScheduledRestart.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.ClusterShuttingDown$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.DataCenterReachabilityEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.LeaderChanged.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberDowned.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberExited.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberJoined.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberLeft.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberPreparingForShutdown.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberReadyForShutdown.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberRemoved.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberUp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.MemberWeaklyUp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.ReachabilityEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.ReachableDataCenter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.ReachableMember.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.RoleLeaderChanged.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.UnreachableDataCenter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.UnreachableMember.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/InternalClusterAction.ExitingConfirmed.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/InternalClusterAction.InitJoin.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/InternalClusterAction.InitJoinAck.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/InternalClusterAction.InitJoinNack.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/InternalClusterAction.JoinSeedNode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/InternalClusterAction.Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.Internal$.DeltaNack$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.Internal$.ReadResult.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.Internal$.WriteAck$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.Internal$.WriteNack$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.UpdateSuccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/javadsl/Replicator.UpdateSuccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Delta.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Status.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.Internal$.GetShardHome.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.Internal$.GracefulShutdownReq.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.Internal$.Register.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.Internal$.RegisterProxy.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html)*