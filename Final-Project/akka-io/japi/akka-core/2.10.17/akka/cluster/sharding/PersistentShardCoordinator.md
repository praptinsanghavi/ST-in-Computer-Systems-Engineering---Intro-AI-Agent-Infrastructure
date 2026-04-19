---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:33:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html
title: PersistentShardCoordinator
---

# PersistentShardCoordinator

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class PersistentShardCoordinator

- java.lang.Object
- - [akka.cluster.sharding.ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")
	- - akka.cluster.sharding.PersistentShardCoordinator

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[Stash](../../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../../actor/StashSupport.html "interface in akka.actor")`, `[Timers](../../actor/Timers.html "interface in akka.actor")`, `[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")`, `[RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Eventsourced](../../persistence/Eventsourced.html "interface in akka.persistence")`, `[PersistenceIdentity](../../persistence/PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](../../persistence/PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](../../persistence/PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](../../persistence/PersistentActor.html "interface in akka.persistence")`, `[Snapshotter](../../persistence/Snapshotter.html "interface in akka.persistence")`

---

```
public class PersistentShardCoordinator
extends [ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")
implements [PersistentActor](../../persistence/PersistentActor.html "interface in akka.persistence")
```

Deprecated.
Use \`ddata\` mode, persistence mode is deprecated. Since 2\.6\.0\.

Singleton coordinator that decides where to allocate shards.
 
 Users can migrate to using DData to store state then either Event Sourcing or ddata to store
 the remembered entities.
 

See Also:
[`ClusterSharding extension`](ClusterSharding$.html "class in akka.cluster.sharding")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.cluster.sharding.[ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")
		
		
		`[ShardCoordinator.AbstractShardAllocationStrategy](ShardCoordinator.AbstractShardAllocationStrategy.html "class in akka.cluster.sharding"), [ShardCoordinator.ActorSystemDependentAllocationStrategy](ShardCoordinator.ActorSystemDependentAllocationStrategy.html "interface in akka.cluster.sharding"), [ShardCoordinator.Internal$](ShardCoordinator.Internal$.html "class in akka.cluster.sharding"), [ShardCoordinator.LeastShardAllocationStrategy](ShardCoordinator.LeastShardAllocationStrategy.html "class in akka.cluster.sharding"), [ShardCoordinator.RebalanceWorker$](ShardCoordinator.RebalanceWorker$.html "class in akka.cluster.sharding"), [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding"), [ShardCoordinator.ShardAllocationStrategy$](ShardCoordinator.ShardAllocationStrategy$.html "class in akka.cluster.sharding"), [ShardCoordinator.StartableAllocationStrategy](ShardCoordinator.StartableAllocationStrategy.html "interface in akka.cluster.sharding")`
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.[Eventsourced](../../persistence/Eventsourced.html "interface in akka.persistence")
		
		
		`[Eventsourced.AsyncHandlerInvocation](../../persistence/Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence"), [Eventsourced.AsyncHandlerInvocation$](../../persistence/Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.PendingHandlerInvocation](../../persistence/Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence"), [Eventsourced.RecoveryTick](../../persistence/Eventsourced.RecoveryTick.html "class in akka.persistence"), [Eventsourced.RecoveryTick$](../../persistence/Eventsourced.RecoveryTick$.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation](../../persistence/Eventsourced.StashingHandlerInvocation.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation$](../../persistence/Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.State](../../persistence/Eventsourced.State.html "interface in akka.persistence")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistentShardCoordinator](#%3Cinit%3E(java.lang.String,akka.cluster.sharding.ClusterShardingSettings,akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy))​(java.lang.String typeName,  [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,  [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$StashSupport$_setter_$mailbox_$eq](#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics))​([DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)` | Deprecated. |
	| `protected [ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[journal](#journal())()` | Deprecated. |
	| `java.lang.String` | `[journalPluginId](#journalPluginId())()` | Deprecated. Configuration id of the journal plugin servicing this persistent actor. |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` | Deprecated. Id of the persistent entity for which messages should be replayed. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveCommand](#receiveCommand())()` | Deprecated. Command handler. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveRecover](#receiveRecover())()` | Deprecated. Recovery handler that receives persisted events during recovery. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveSnapshotResult](#receiveSnapshotResult())()` | Deprecated. |
	| `void` | `[saveSnapshotWhenNeeded](#saveSnapshotWhenNeeded())()` | Deprecated. |
	| `java.lang.String` | `[snapshotPluginId](#snapshotPluginId())()` | Deprecated. Configuration id of the snapshot plugin servicing this persistent actor. |
	| `protected [ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[snapshotStore](#snapshotStore())()` | Deprecated. Snapshot store plugin actor. |
	| `java.lang.String` | `[typeName](#typeName())()` | Deprecated. |
	| `protected void` | `[unstashGetShardHomeRequestsForShard](#unstashGetShardHomeRequestsForShard(java.lang.String))​(java.lang.String shard)` | Deprecated. |
	| `protected void` | `[unstashOneGetShardHomeRequest](#unstashOneGetShardHomeRequest())()` | Deprecated. |
	| `<E extends akka.cluster.sharding.ShardCoordinator.Internal.DomainEvent>void` | `[update](#update(E,scala.Function1))​(E evt,  scala.Function1<E,​scala.runtime.BoxedUnit> f)` | Deprecated. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[waitingForStateInitialized](#waitingForStateInitialized())()` | Deprecated. |
	
	
		- ### Methods inherited from class akka.cluster.sharding.[ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")
		
		
		`[active](ShardCoordinator.html#active()), [akka$actor$Actor$_setter_$context_$eq](ShardCoordinator.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](ShardCoordinator.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aliveRegions](ShardCoordinator.html#aliveRegions()), [aliveRegions_$eq](ShardCoordinator.html#aliveRegions_$eq(scala.collection.immutable.Set)), [allocateShardHomesForRememberEntities](ShardCoordinator.html#allocateShardHomesForRememberEntities()), [allRegionsRegistered](ShardCoordinator.html#allRegionsRegistered()), [allRegionsRegistered_$eq](ShardCoordinator.html#allRegionsRegistered_$eq(boolean)), [cluster](ShardCoordinator.html#cluster()), [context](ShardCoordinator.html#context()), [continueGetShardHome](ShardCoordinator.html#continueGetShardHome(java.lang.String,akka.actor.ActorRef,akka.actor.ActorRef)), [continueRebalance](ShardCoordinator.html#continueRebalance(scala.collection.immutable.Set)), [gracefulShutdownInProgress](ShardCoordinator.html#gracefulShutdownInProgress()), [gracefulShutdownInProgress_$eq](ShardCoordinator.html#gracefulShutdownInProgress_$eq(scala.collection.immutable.Set)), [handleGetShardHome](ShardCoordinator.html#handleGetShardHome(java.lang.String)), [hasAllRegionsRegistered](ShardCoordinator.html#hasAllRegionsRegistered()), [ignoreRef](ShardCoordinator.html#ignoreRef()), [isMember](ShardCoordinator.html#isMember(akka.actor.ActorRef)), [leastShardAllocationStrategy](ShardCoordinator.html#leastShardAllocationStrategy(int,double)), [log](ShardCoordinator.html#log()), [minMembers](ShardCoordinator.html#minMembers()), [postStop](ShardCoordinator.html#postStop()), [preparingForShutdown](ShardCoordinator.html#preparingForShutdown()), [preparingForShutdown_$eq](ShardCoordinator.html#preparingForShutdown_$eq(boolean)), [preStart](ShardCoordinator.html#preStart()), [rebalanceInProgress](ShardCoordinator.html#rebalanceInProgress()), [rebalanceInProgress_$eq](ShardCoordinator.html#rebalanceInProgress_$eq(scala.collection.immutable.Map)), [rebalanceWorkers](ShardCoordinator.html#rebalanceWorkers()), [rebalanceWorkers_$eq](ShardCoordinator.html#rebalanceWorkers_$eq(scala.collection.immutable.Set)), [receiveTerminated](ShardCoordinator.html#receiveTerminated()), [regionProxyTerminated](ShardCoordinator.html#regionProxyTerminated(akka.actor.ActorRef)), [regionTerminated](ShardCoordinator.html#regionTerminated(akka.actor.ActorRef)), [regionTerminationInProgress](ShardCoordinator.html#regionTerminationInProgress()), [regionTerminationInProgress_$eq](ShardCoordinator.html#regionTerminationInProgress_$eq(scala.collection.immutable.Set)), [removalMargin](ShardCoordinator.html#removalMargin()), [self](ShardCoordinator.html#self()), [sendHostShardMsg](ShardCoordinator.html#sendHostShardMsg(java.lang.String,akka.actor.ActorRef)), [shutdownShards](ShardCoordinator.html#shutdownShards(akka.actor.ActorRef,scala.collection.immutable.Set)), [shuttingDown](ShardCoordinator.html#shuttingDown()), [state](ShardCoordinator.html#state()), [state_$eq](ShardCoordinator.html#state_$eq(akka.cluster.sharding.ShardCoordinator.Internal.State)), [stateInitialized](ShardCoordinator.html#stateInitialized()), [unAckedHostShards](ShardCoordinator.html#unAckedHostShards()), [unAckedHostShards_$eq](ShardCoordinator.html#unAckedHostShards_$eq(scala.collection.immutable.Map)), [waitingForLocalRegionToTerminate](ShardCoordinator.html#waitingForLocalRegionToTerminate()), [waitingForLocalRegionToTerminate_$eq](ShardCoordinator.html#waitingForLocalRegionToTerminate_$eq(boolean)), [waitingForShardsToStop](ShardCoordinator.html#waitingForShardsToStop()), [waitingForShardsToStop_$eq](ShardCoordinator.html#waitingForShardsToStop_$eq(scala.collection.immutable.Map)), [watchStateActors](ShardCoordinator.html#watchStateActors())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../../actor/Actor.html#context()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../../actor/Actor.html#preStart()), [self](../../actor/Actor.html#self()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy())`
		- ### Methods inherited from interface akka.persistence.[Eventsourced](../../persistence/Eventsourced.html "interface in akka.persistence")
		
		
		`[_lastSequenceNr_$eq](../../persistence/Eventsourced.html#_lastSequenceNr_$eq(long)), [aroundPostRestart](../../persistence/Eventsourced.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../persistence/Eventsourced.html#aroundPostStop()), [aroundPreRestart](../../persistence/Eventsourced.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../persistence/Eventsourced.html#aroundPreStart()), [aroundReceive](../../persistence/Eventsourced.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [batchAtomicWrite](../../persistence/Eventsourced.html#batchAtomicWrite(akka.persistence.AtomicWrite)), [changeState](../../persistence/Eventsourced.html#changeState(akka.persistence.Eventsourced.State)), [currentCommand](../../persistence/Eventsourced.html#currentCommand()), [currentState_$eq](../../persistence/Eventsourced.html#currentState_$eq(akka.persistence.Eventsourced.State)), [deleteMessages](../../persistence/Eventsourced.html#deleteMessages(long)), [eventBatch_$eq](../../persistence/Eventsourced.html#eventBatch_$eq(scala.collection.immutable.List)), [flushBatch](../../persistence/Eventsourced.html#flushBatch()), [flushJournalBatch](../../persistence/Eventsourced.html#flushJournalBatch()), [getAndClearInstrumentationContext](../../persistence/Eventsourced.html#getAndClearInstrumentationContext(long)), [instrumentationContexts_$eq](../../persistence/Eventsourced.html#instrumentationContexts_$eq(scala.collection.immutable.Map)), [internalDefer](../../persistence/Eventsourced.html#internalDefer(A,scala.Function1)), [internalDeferAsync](../../persistence/Eventsourced.html#internalDeferAsync(A,scala.Function1)), [internalDeleteMessagesBeforeSnapshot](../../persistence/Eventsourced.html#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int)), [internalPersist](../../persistence/Eventsourced.html#internalPersist(A,scala.Function1)), [internalPersistAll](../../persistence/Eventsourced.html#internalPersistAll(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAllAsync](../../persistence/Eventsourced.html#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAsync](../../persistence/Eventsourced.html#internalPersistAsync(A,scala.Function1)), [journalBatch_$eq](../../persistence/Eventsourced.html#journalBatch_$eq(scala.collection.immutable.Vector)), [lastSequenceNr](../../persistence/Eventsourced.html#lastSequenceNr()), [log](../../persistence/Eventsourced.html#log()), [nextSequenceNr](../../persistence/Eventsourced.html#nextSequenceNr()), [onPersistFailure](../../persistence/Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)), [onPersistRejected](../../persistence/Eventsourced.html#onPersistRejected(java.lang.Throwable,java.lang.Object,long)), [onRecoveryFailure](../../persistence/Eventsourced.html#onRecoveryFailure(java.lang.Throwable,scala.Option)), [onRecoveryFailureAndInstrumentation](../../persistence/Eventsourced.html#onRecoveryFailureAndInstrumentation(java.lang.Throwable,scala.Option)), [onReplaySuccess](../../persistence/Eventsourced.html#onReplaySuccess()), [peekApplyHandler](../../persistence/Eventsourced.html#peekApplyHandler(java.lang.Object)), [pendingStashingPersistInvocations_$eq](../../persistence/Eventsourced.html#pendingStashingPersistInvocations_$eq(long)), [recovering](../../persistence/Eventsourced.html#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration)), [recoveryFinished](../../persistence/Eventsourced.html#recoveryFinished()), [recoveryRunning](../../persistence/Eventsourced.html#recoveryRunning()), [recoveryStarted](../../persistence/Eventsourced.html#recoveryStarted(long,scala.concurrent.duration.FiniteDuration)), [requestRecoveryPermit](../../persistence/Eventsourced.html#requestRecoveryPermit()), [sendBatchedEventsToJournal](../../persistence/Eventsourced.html#sendBatchedEventsToJournal(scala.collection.immutable.Vector)), [sequenceNr_$eq](../../persistence/Eventsourced.html#sequenceNr_$eq(long)), [setLastSequenceNr](../../persistence/Eventsourced.html#setLastSequenceNr(long)), [snapshotSequenceNr](../../persistence/Eventsourced.html#snapshotSequenceNr()), [snapshotterId](../../persistence/Eventsourced.html#snapshotterId()), [startRecovery](../../persistence/Eventsourced.html#startRecovery(akka.persistence.Recovery)), [stash](../../persistence/Eventsourced.html#stash()), [stashInternally](../../persistence/Eventsourced.html#stashInternally(java.lang.Object)), [super$aroundPostRestart](../../persistence/Eventsourced.html#super$aroundPostRestart(java.lang.Throwable)), [super$aroundPostStop](../../persistence/Eventsourced.html#super$aroundPostStop()), [super$aroundPreRestart](../../persistence/Eventsourced.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundPreStart](../../persistence/Eventsourced.html#super$aroundPreStart()), [super$aroundReceive](../../persistence/Eventsourced.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [super$stash](../../persistence/Eventsourced.html#super$stash()), [super$unhandled](../../persistence/Eventsourced.html#super$unhandled(java.lang.Object)), [unhandled](../../persistence/Eventsourced.html#unhandled(java.lang.Object)), [unstashAll](../../persistence/Eventsourced.html#unstashAll()), [unstashInternally](../../persistence/Eventsourced.html#unstashInternally(boolean)), [updateLastSequenceNr](../../persistence/Eventsourced.html#updateLastSequenceNr(akka.persistence.PersistentRepr)), [waitingRecoveryPermit](../../persistence/Eventsourced.html#waitingRecoveryPermit(akka.persistence.Recovery)), [writeEventFailed](../../persistence/Eventsourced.html#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventRejected](../../persistence/Eventsourced.html#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventSucceeded](../../persistence/Eventsourced.html#writeEventSucceeded(akka.persistence.PersistentRepr)), [writeInProgress_$eq](../../persistence/Eventsourced.html#writeInProgress_$eq(boolean))`
		- ### Methods inherited from interface akka.persistence.[PersistenceRecovery](../../persistence/PersistenceRecovery.html "interface in akka.persistence")
		
		
		`[recovery](../../persistence/PersistenceRecovery.html#recovery())`
		- ### Methods inherited from interface akka.persistence.[PersistenceStash](../../persistence/PersistenceStash.html "interface in akka.persistence")
		
		
		`[internalStashOverflowStrategy](../../persistence/PersistenceStash.html#internalStashOverflowStrategy())`
		- ### Methods inherited from interface akka.persistence.[PersistentActor](../../persistence/PersistentActor.html "interface in akka.persistence")
		
		
		`[defer](../../persistence/PersistentActor.html#defer(A,scala.Function1)), [deferAsync](../../persistence/PersistentActor.html#deferAsync(A,scala.Function1)), [persist](../../persistence/PersistentActor.html#persist(A,scala.Function1)), [persistAll](../../persistence/PersistentActor.html#persistAll(scala.collection.immutable.Seq,scala.Function1)), [persistAllAsync](../../persistence/PersistentActor.html#persistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [persistAsync](../../persistence/PersistentActor.html#persistAsync(A,scala.Function1)), [receive](../../persistence/PersistentActor.html#receive())`
		- ### Methods inherited from interface akka.persistence.[Snapshotter](../../persistence/Snapshotter.html "interface in akka.persistence")
		
		
		`[deleteSnapshot](../../persistence/Snapshotter.html#deleteSnapshot(long)), [deleteSnapshots](../../persistence/Snapshotter.html#deleteSnapshots(akka.persistence.SnapshotSelectionCriteria)), [loadSnapshot](../../persistence/Snapshotter.html#loadSnapshot(java.lang.String,akka.persistence.SnapshotSelectionCriteria,long)), [saveSnapshot](../../persistence/Snapshotter.html#saveSnapshot(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashFactory](../../actor/StashFactory.html "interface in akka.actor")
		
		
		`[createStash](../../actor/StashFactory.html#createStash(akka.actor.ActorContext,akka.actor.ActorRef))`
		- ### Methods inherited from interface akka.actor.[StashSupport](../../actor/StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](../../actor/StashSupport.html#actorCell()), [clearStash](../../actor/StashSupport.html#clearStash()), [context](../../actor/StashSupport.html#context()), [enqueueFirst](../../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [prepend](../../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](../../actor/StashSupport.html#self()), [stashAtHead](../../actor/StashSupport.html#stashAtHead()), [theStash_$eq](../../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../../actor/StashSupport.html#unstash()), [unstashAll](../../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[Timers](../../actor/Timers.html "interface in akka.actor")
		
		
		`[actorCell](../../actor/Timers.html#actorCell()), [aroundPostStop](../../actor/Timers.html#aroundPostStop()), [aroundPreRestart](../../actor/Timers.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundReceive](../../actor/Timers.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [super$aroundPostStop](../../actor/Timers.html#super$aroundPostStop()), [super$aroundPreRestart](../../actor/Timers.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundReceive](../../actor/Timers.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [timers](../../actor/Timers.html#timers())`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../../actor/UnrestrictedStash.html#postStop()), [preRestart](../../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Constructor Detail
	
	
	
		- #### PersistentShardCoordinator
		
		
		
		```
		public PersistentShardCoordinator​(java.lang.String typeName,
		                                  [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,
		                                  [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### akka$actor$StashSupport$\_setter\_$mailbox\_$eq
		
		
		
		```
		protected void akka$actor$StashSupport$_setter_$mailbox_$eq​([DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$actor$StashSupport$_setter_$mailbox_$eq](../../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics))` in interface `[StashSupport](../../actor/StashSupport.html "interface in akka.actor")`
		- #### journal
		
		
		
		```
		protected [ActorRef](../../actor/ActorRef.html "class in akka.actor") journal()
		```
		
		Deprecated.
		
		Specified by:
		`[journal](../../persistence/Eventsourced.html#journal())` in interface `[Eventsourced](../../persistence/Eventsourced.html "interface in akka.persistence")`
		- #### journalPluginId
		
		
		
		```
		public java.lang.String journalPluginId()
		```
		
		Deprecated.
		Description copied from interface: `[PersistenceIdentity](../../persistence/PersistenceIdentity.html#journalPluginId())`
		Configuration id of the journal plugin servicing this persistent actor.
		 When empty, looks in `akka.persistence.journal.plugin` to find configuration entry path.
		 When configured, uses `journalPluginId` as absolute path to the journal configuration entry.
		 Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.
		
		Specified by:
		`[journalPluginId](../../persistence/PersistenceIdentity.html#journalPluginId())` in interface `[PersistenceIdentity](../../persistence/PersistenceIdentity.html "interface in akka.persistence")`
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		
		Deprecated.
		Description copied from interface: `[PersistenceIdentity](../../persistence/PersistenceIdentity.html#persistenceId())`
		Id of the persistent entity for which messages should be replayed.
		
		Specified by:
		`[persistenceId](../../persistence/PersistenceIdentity.html#persistenceId())` in interface `[PersistenceIdentity](../../persistence/PersistenceIdentity.html "interface in akka.persistence")`
		- #### receiveCommand
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveCommand()
		```
		
		Deprecated.
		Description copied from interface: `[Eventsourced](../../persistence/Eventsourced.html#receiveCommand())`
		Command handler. Typically validates commands against current state (and/or by
		 communication with other actors). On successful validation, one or more events are
		 derived from a command and these events are then persisted by calling `persist`.
		
		Specified by:
		`[receiveCommand](../../persistence/Eventsourced.html#receiveCommand())` in interface `[Eventsourced](../../persistence/Eventsourced.html "interface in akka.persistence")`
		- #### receiveRecover
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveRecover()
		```
		
		Deprecated.
		Description copied from interface: `[Eventsourced](../../persistence/Eventsourced.html#receiveRecover())`
		Recovery handler that receives persisted events during recovery. If a state snapshot
		 has been captured and saved, this handler will receive a [`SnapshotOffer`](../../persistence/SnapshotOffer.html "class in akka.persistence") message
		 followed by events that are younger than the offered snapshot.
		 
		 This handler must not have side\-effects other than changing persistent actor state i.e. it
		 should not perform actions that may fail, such as interacting with external services,
		 for example.
		 
		
		
		 If there is a problem with recovering the state of the actor from the journal, the error
		 will be logged and the actor will be stopped.
		 
		
		
		
		Specified by:
		`[receiveRecover](../../persistence/Eventsourced.html#receiveRecover())` in interface `[Eventsourced](../../persistence/Eventsourced.html "interface in akka.persistence")`
		See Also:
		[`Recovery`](../../persistence/Recovery.html "class in akka.persistence")
		- #### receiveSnapshotResult
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveSnapshotResult()
		```
		
		Deprecated.
		- #### saveSnapshotWhenNeeded
		
		
		
		```
		public void saveSnapshotWhenNeeded()
		```
		
		Deprecated.
		- #### snapshotPluginId
		
		
		
		```
		public java.lang.String snapshotPluginId()
		```
		
		Deprecated.
		Description copied from interface: `[PersistenceIdentity](../../persistence/PersistenceIdentity.html#snapshotPluginId())`
		Configuration id of the snapshot plugin servicing this persistent actor.
		 When empty, looks in `akka.persistence.snapshot-store.plugin` to find configuration entry path.
		 When configured, uses `snapshotPluginId` as absolute path to the snapshot store configuration entry.
		 Configuration entry must contain few required fields, such as `class`. See `src/main/resources/reference.conf`.
		
		Specified by:
		`[snapshotPluginId](../../persistence/PersistenceIdentity.html#snapshotPluginId())` in interface `[PersistenceIdentity](../../persistence/PersistenceIdentity.html "interface in akka.persistence")`
		- #### snapshotStore
		
		
		
		```
		protected [ActorRef](../../actor/ActorRef.html "class in akka.actor") snapshotStore()
		```
		
		Deprecated.
		Description copied from interface: `[Snapshotter](../../persistence/Snapshotter.html#snapshotStore())`
		Snapshot store plugin actor.
		
		Specified by:
		`[snapshotStore](../../persistence/Eventsourced.html#snapshotStore())` in interface `[Eventsourced](../../persistence/Eventsourced.html "interface in akka.persistence")`
		Specified by:
		`[snapshotStore](../../persistence/Snapshotter.html#snapshotStore())` in interface `[Snapshotter](../../persistence/Snapshotter.html "interface in akka.persistence")`
		- #### typeName
		
		
		
		```
		public java.lang.String typeName()
		```
		
		Deprecated.
		
		Specified by:
		`[typeName](ShardCoordinator.html#typeName())` in class `[ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")`
		- #### unstashGetShardHomeRequestsForShard
		
		
		
		```
		protected void unstashGetShardHomeRequestsForShard​(java.lang.String shard)
		```
		
		Deprecated.
		
		Specified by:
		`[unstashGetShardHomeRequestsForShard](ShardCoordinator.html#unstashGetShardHomeRequestsForShard(java.lang.String))` in class `[ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")`
		- #### unstashOneGetShardHomeRequest
		
		
		
		```
		protected void unstashOneGetShardHomeRequest()
		```
		
		Deprecated.
		
		Specified by:
		`[unstashOneGetShardHomeRequest](ShardCoordinator.html#unstashOneGetShardHomeRequest())` in class `[ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")`
		- #### update
		
		
		
		```
		public <E extends akka.cluster.sharding.ShardCoordinator.Internal.DomainEvent> void update​(E evt,
		                                                                                           scala.Function1<E,​scala.runtime.BoxedUnit> f)
		```
		
		Deprecated.
		
		Specified by:
		`[update](ShardCoordinator.html#update(E,scala.Function1))` in class `[ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")`
		- #### waitingForStateInitialized
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> waitingForStateInitialized()
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashFactory.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Timers.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.AbstractShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.ActorSystemDependentAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.Internal$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.LeastShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.StartableAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.AsyncHandlerInvocation$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.AsyncHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.PendingHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.RecoveryTick$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.RecoveryTick.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.StashingHandlerInvocation$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.StashingHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.State.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Snapshotter.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html)*