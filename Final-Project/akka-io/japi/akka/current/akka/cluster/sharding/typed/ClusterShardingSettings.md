---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.TuningParameters.html
title: ClusterShardingSettings.TuningParameters
---

# ClusterShardingSettings.TuningParameters

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ClusterShardingSettings.TuningParameters

- java.lang.Object
- - akka.cluster.sharding.typed.ClusterShardingSettings.TuningParameters

- Enclosing class:
[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed")

---

```
public static final class ClusterShardingSettings.TuningParameters
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TuningParameters](#%3Cinit%3E(akka.cluster.sharding.ClusterShardingSettings.TuningParameters))​([ClusterShardingSettings.TuningParameters](../ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding") classic)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[bufferSize](#bufferSize())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[coordinatorFailureBackoff](#coordinatorFailureBackoff())()` |  |
	| `int` | `[coordinatorStateReadMajorityPlus](#coordinatorStateReadMajorityPlus())()` |  |
	| `int` | `[coordinatorStateWriteMajorityPlus](#coordinatorStateWriteMajorityPlus())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[entityRecoveryConstantRateStrategyFrequency](#entityRecoveryConstantRateStrategyFrequency())()` |  |
	| `int` | `[entityRecoveryConstantRateStrategyNumberOfEntities](#entityRecoveryConstantRateStrategyNumberOfEntities())()` |  |
	| `java.lang.String` | `[entityRecoveryStrategy](#entityRecoveryStrategy())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[entityRestartBackoff](#entityRestartBackoff())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[handOffTimeout](#handOffTimeout())()` |  |
	| `int` | `[keepNrOfBatches](#keepNrOfBatches())()` |  |
	| `int` | `[leastShardAllocationAbsoluteLimit](#leastShardAllocationAbsoluteLimit())()` |  |
	| `int` | `[leastShardAllocationMaxSimultaneousRebalance](#leastShardAllocationMaxSimultaneousRebalance())()` |  |
	| `int` | `[leastShardAllocationRebalanceThreshold](#leastShardAllocationRebalanceThreshold())()` |  |
	| `double` | `[leastShardAllocationRelativeLimit](#leastShardAllocationRelativeLimit())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[passivationStopTimeout](#passivationStopTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[rebalanceInterval](#rebalanceInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[retryInterval](#retryInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[shardFailureBackoff](#shardFailureBackoff())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[shardStartTimeout](#shardStartTimeout())()` |  |
	| `int` | `[snapshotAfter](#snapshotAfter())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[updatingStateTimeout](#updatingStateTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[waitingForStateTimeout](#waitingForStateTimeout())()` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withBufferSize](#withBufferSize(int))​(int value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withCoordinatorFailureBackoff](#withCoordinatorFailureBackoff(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withCoordinatorFailureBackoff](#withCoordinatorFailureBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withCoordinatorStateReadMajorityPlus](#withCoordinatorStateReadMajorityPlus(int))​(int value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withCoordinatorStateWriteMajorityPlus](#withCoordinatorStateWriteMajorityPlus(int))​(int value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withEntityRecoveryConstantRateStrategyFrequency](#withEntityRecoveryConstantRateStrategyFrequency(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withEntityRecoveryConstantRateStrategyFrequency](#withEntityRecoveryConstantRateStrategyFrequency(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withEntityRecoveryConstantRateStrategyNumberOfEntities](#withEntityRecoveryConstantRateStrategyNumberOfEntities(int))​(int value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withEntityRecoveryStrategy](#withEntityRecoveryStrategy(java.lang.String))​(java.lang.String value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withEntityRestartBackoff](#withEntityRestartBackoff(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withEntityRestartBackoff](#withEntityRestartBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withHandOffTimeout](#withHandOffTimeout(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withHandOffTimeout](#withHandOffTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withKeepNrOfBatches](#withKeepNrOfBatches(int))​(int value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withLeastShardAllocationAbsoluteLimit](#withLeastShardAllocationAbsoluteLimit(int))​(int value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withLeastShardAllocationMaxSimultaneousRebalance](#withLeastShardAllocationMaxSimultaneousRebalance(int))​(int value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withLeastShardAllocationRebalanceThreshold](#withLeastShardAllocationRebalanceThreshold(int))​(int value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withLeastShardAllocationRelativeLimit](#withLeastShardAllocationRelativeLimit(double))​(double value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withPassivationStopTimeout](#withPassivationStopTimeout(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withPassivationStopTimeout](#withPassivationStopTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withRebalanceInterval](#withRebalanceInterval(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withRebalanceInterval](#withRebalanceInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withRetryInterval](#withRetryInterval(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withRetryInterval](#withRetryInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withShardFailureBackoff](#withShardFailureBackoff(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withShardFailureBackoff](#withShardFailureBackoff(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withShardStartTimeout](#withShardStartTimeout(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withShardStartTimeout](#withShardStartTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withSnapshotAfter](#withSnapshotAfter(int))​(int value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withUpdatingStateTimeout](#withUpdatingStateTimeout(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withUpdatingStateTimeout](#withUpdatingStateTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withWaitingForStateTimeout](#withWaitingForStateTimeout(java.time.Duration))​(java.time.Duration value)` |  |
	| `[ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed")` | `[withWaitingForStateTimeout](#withWaitingForStateTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration value)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TuningParameters
		
		
		
		```
		public TuningParameters​([ClusterShardingSettings.TuningParameters](../ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding") classic)
		```

	- ### Method Detail
	
	
	
		- #### bufferSize
		
		
		
		```
		public int bufferSize()
		```
		- #### coordinatorFailureBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff()
		```
		- #### coordinatorStateReadMajorityPlus
		
		
		
		```
		public int coordinatorStateReadMajorityPlus()
		```
		- #### coordinatorStateWriteMajorityPlus
		
		
		
		```
		public int coordinatorStateWriteMajorityPlus()
		```
		- #### entityRecoveryConstantRateStrategyFrequency
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency()
		```
		- #### entityRecoveryConstantRateStrategyNumberOfEntities
		
		
		
		```
		public int entityRecoveryConstantRateStrategyNumberOfEntities()
		```
		- #### entityRecoveryStrategy
		
		
		
		```
		public java.lang.String entityRecoveryStrategy()
		```
		- #### entityRestartBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration entityRestartBackoff()
		```
		- #### handOffTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration handOffTimeout()
		```
		- #### keepNrOfBatches
		
		
		
		```
		public int keepNrOfBatches()
		```
		- #### leastShardAllocationAbsoluteLimit
		
		
		
		```
		public int leastShardAllocationAbsoluteLimit()
		```
		- #### leastShardAllocationMaxSimultaneousRebalance
		
		
		
		```
		public int leastShardAllocationMaxSimultaneousRebalance()
		```
		- #### leastShardAllocationRebalanceThreshold
		
		
		
		```
		public int leastShardAllocationRebalanceThreshold()
		```
		- #### leastShardAllocationRelativeLimit
		
		
		
		```
		public double leastShardAllocationRelativeLimit()
		```
		- #### passivationStopTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration passivationStopTimeout()
		```
		- #### rebalanceInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration rebalanceInterval()
		```
		- #### retryInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration retryInterval()
		```
		- #### shardFailureBackoff
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration shardFailureBackoff()
		```
		- #### shardStartTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration shardStartTimeout()
		```
		- #### snapshotAfter
		
		
		
		```
		public int snapshotAfter()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### updatingStateTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration updatingStateTimeout()
		```
		- #### waitingForStateTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration waitingForStateTimeout()
		```
		- #### withBufferSize
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withBufferSize​(int value)
		```
		- #### withCoordinatorFailureBackoff
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withCoordinatorFailureBackoff​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withCoordinatorFailureBackoff
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withCoordinatorFailureBackoff​(java.time.Duration value)
		```
		- #### withCoordinatorStateReadMajorityPlus
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withCoordinatorStateReadMajorityPlus​(int value)
		```
		- #### withCoordinatorStateWriteMajorityPlus
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withCoordinatorStateWriteMajorityPlus​(int value)
		```
		- #### withEntityRecoveryConstantRateStrategyFrequency
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withEntityRecoveryConstantRateStrategyFrequency​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withEntityRecoveryConstantRateStrategyFrequency
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withEntityRecoveryConstantRateStrategyFrequency​(java.time.Duration value)
		```
		- #### withEntityRecoveryConstantRateStrategyNumberOfEntities
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withEntityRecoveryConstantRateStrategyNumberOfEntities​(int value)
		```
		- #### withEntityRecoveryStrategy
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withEntityRecoveryStrategy​(java.lang.String value)
		```
		- #### withEntityRestartBackoff
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withEntityRestartBackoff​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withEntityRestartBackoff
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withEntityRestartBackoff​(java.time.Duration value)
		```
		- #### withHandOffTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withHandOffTimeout​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withHandOffTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withHandOffTimeout​(java.time.Duration value)
		```
		- #### withKeepNrOfBatches
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withKeepNrOfBatches​(int value)
		```
		- #### withLeastShardAllocationAbsoluteLimit
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withLeastShardAllocationAbsoluteLimit​(int value)
		```
		- #### withLeastShardAllocationMaxSimultaneousRebalance
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withLeastShardAllocationMaxSimultaneousRebalance​(int value)
		```
		- #### withLeastShardAllocationRebalanceThreshold
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withLeastShardAllocationRebalanceThreshold​(int value)
		```
		- #### withLeastShardAllocationRelativeLimit
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withLeastShardAllocationRelativeLimit​(double value)
		```
		- #### withPassivationStopTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withPassivationStopTimeout​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withPassivationStopTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withPassivationStopTimeout​(java.time.Duration value)
		```
		- #### withRebalanceInterval
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withRebalanceInterval​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withRebalanceInterval
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withRebalanceInterval​(java.time.Duration value)
		```
		- #### withRetryInterval
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withRetryInterval​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withRetryInterval
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withRetryInterval​(java.time.Duration value)
		```
		- #### withShardFailureBackoff
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withShardFailureBackoff​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withShardFailureBackoff
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withShardFailureBackoff​(java.time.Duration value)
		```
		- #### withShardStartTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withShardStartTimeout​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withShardStartTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withShardStartTimeout​(java.time.Duration value)
		```
		- #### withSnapshotAfter
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withSnapshotAfter​(int value)
		```
		- #### withUpdatingStateTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withUpdatingStateTimeout​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withUpdatingStateTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withUpdatingStateTimeout​(java.time.Duration value)
		```
		- #### withWaitingForStateTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withWaitingForStateTimeout​(scala.concurrent.duration.FiniteDuration value)
		```
		- #### withWaitingForStateTimeout
		
		
		
		```
		public [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") withWaitingForStateTimeout​(java.time.Duration value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.TuningParameters.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.TuningParameters.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.TuningParameters.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.TuningParameters.html)*