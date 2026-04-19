---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:07:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.TuningParameters.html
title: ClusterShardingSettings.TuningParameters
---

# ClusterShardingSettings.TuningParameters

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ClusterShardingSettings.TuningParameters

- java.lang.Object
- - akka.cluster.sharding.ClusterShardingSettings.TuningParameters

- Enclosing class:
[ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding")

---

```
public static class ClusterShardingSettings.TuningParameters
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TuningParameters](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,int,int,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.String,scala.concurrent.duration.FiniteDuration,int))​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,  scala.concurrent.duration.FiniteDuration retryInterval,  int bufferSize,  scala.concurrent.duration.FiniteDuration handOffTimeout,  scala.concurrent.duration.FiniteDuration shardStartTimeout,  scala.concurrent.duration.FiniteDuration shardFailureBackoff,  scala.concurrent.duration.FiniteDuration entityRestartBackoff,  scala.concurrent.duration.FiniteDuration rebalanceInterval,  int snapshotAfter,  int keepNrOfBatches,  int leastShardAllocationRebalanceThreshold,  int leastShardAllocationMaxSimultaneousRebalance,  scala.concurrent.duration.FiniteDuration waitingForStateTimeout,  scala.concurrent.duration.FiniteDuration updatingStateTimeout,  java.lang.String entityRecoveryStrategy,  scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,  int entityRecoveryConstantRateStrategyNumberOfEntities)` | Deprecated. Use the ClusterShardingSettings factory methods or the constructor including coordinatorStateWriteMajorityPlus and coordinatorStateReadMajorityPlus instead. |
	| `[TuningParameters](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,int,int,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.String,scala.concurrent.duration.FiniteDuration,int,int,int))​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,  scala.concurrent.duration.FiniteDuration retryInterval,  int bufferSize,  scala.concurrent.duration.FiniteDuration handOffTimeout,  scala.concurrent.duration.FiniteDuration shardStartTimeout,  scala.concurrent.duration.FiniteDuration shardFailureBackoff,  scala.concurrent.duration.FiniteDuration entityRestartBackoff,  scala.concurrent.duration.FiniteDuration rebalanceInterval,  int snapshotAfter,  int keepNrOfBatches,  int leastShardAllocationRebalanceThreshold,  int leastShardAllocationMaxSimultaneousRebalance,  scala.concurrent.duration.FiniteDuration waitingForStateTimeout,  scala.concurrent.duration.FiniteDuration updatingStateTimeout,  java.lang.String entityRecoveryStrategy,  scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,  int entityRecoveryConstantRateStrategyNumberOfEntities,  int coordinatorStateWriteMajorityPlus,  int coordinatorStateReadMajorityPlus)` | Deprecated. Use the TuningParameters factory methods or the constructor including leastShardAllocationAbsoluteLimit and leastShardAllocationRelativeLimit instead. |
	| `[TuningParameters](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,int,int,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.String,scala.concurrent.duration.FiniteDuration,int,int,int,int,double))​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,  scala.concurrent.duration.FiniteDuration retryInterval,  int bufferSize,  scala.concurrent.duration.FiniteDuration handOffTimeout,  scala.concurrent.duration.FiniteDuration shardStartTimeout,  scala.concurrent.duration.FiniteDuration shardFailureBackoff,  scala.concurrent.duration.FiniteDuration entityRestartBackoff,  scala.concurrent.duration.FiniteDuration rebalanceInterval,  int snapshotAfter,  int keepNrOfBatches,  int leastShardAllocationRebalanceThreshold,  int leastShardAllocationMaxSimultaneousRebalance,  scala.concurrent.duration.FiniteDuration waitingForStateTimeout,  scala.concurrent.duration.FiniteDuration updatingStateTimeout,  java.lang.String entityRecoveryStrategy,  scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,  int entityRecoveryConstantRateStrategyNumberOfEntities,  int coordinatorStateWriteMajorityPlus,  int coordinatorStateReadMajorityPlus,  int leastShardAllocationAbsoluteLimit,  double leastShardAllocationRelativeLimit)` | Deprecated. Use the TuningParameters factory methods or the constructor including passivationStopTimeout instead. |
	| `[TuningParameters](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,int,int,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.String,scala.concurrent.duration.FiniteDuration,int,int,int,int,double,scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,  scala.concurrent.duration.FiniteDuration retryInterval,  int bufferSize,  scala.concurrent.duration.FiniteDuration handOffTimeout,  scala.concurrent.duration.FiniteDuration shardStartTimeout,  scala.concurrent.duration.FiniteDuration shardFailureBackoff,  scala.concurrent.duration.FiniteDuration entityRestartBackoff,  scala.concurrent.duration.FiniteDuration rebalanceInterval,  int snapshotAfter,  int keepNrOfBatches,  int leastShardAllocationRebalanceThreshold,  int leastShardAllocationMaxSimultaneousRebalance,  scala.concurrent.duration.FiniteDuration waitingForStateTimeout,  scala.concurrent.duration.FiniteDuration updatingStateTimeout,  java.lang.String entityRecoveryStrategy,  scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,  int entityRecoveryConstantRateStrategyNumberOfEntities,  int coordinatorStateWriteMajorityPlus,  int coordinatorStateReadMajorityPlus,  int leastShardAllocationAbsoluteLimit,  double leastShardAllocationRelativeLimit,  scala.concurrent.duration.FiniteDuration passivationStopTimeout)` |  |
	| `[TuningParameters](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,int,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,  scala.concurrent.duration.FiniteDuration retryInterval,  int bufferSize,  scala.concurrent.duration.FiniteDuration handOffTimeout,  scala.concurrent.duration.FiniteDuration shardStartTimeout,  scala.concurrent.duration.FiniteDuration shardFailureBackoff,  scala.concurrent.duration.FiniteDuration entityRestartBackoff,  scala.concurrent.duration.FiniteDuration rebalanceInterval,  int snapshotAfter,  int leastShardAllocationRebalanceThreshold,  int leastShardAllocationMaxSimultaneousRebalance,  scala.concurrent.duration.FiniteDuration waitingForStateTimeout,  scala.concurrent.duration.FiniteDuration updatingStateTimeout)` | Deprecated. Use the ClusterShardingSettings factory methods or the full constructor instead. |
	| `[TuningParameters](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,int,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.String,scala.concurrent.duration.FiniteDuration,int))​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,  scala.concurrent.duration.FiniteDuration retryInterval,  int bufferSize,  scala.concurrent.duration.FiniteDuration handOffTimeout,  scala.concurrent.duration.FiniteDuration shardStartTimeout,  scala.concurrent.duration.FiniteDuration shardFailureBackoff,  scala.concurrent.duration.FiniteDuration entityRestartBackoff,  scala.concurrent.duration.FiniteDuration rebalanceInterval,  int snapshotAfter,  int leastShardAllocationRebalanceThreshold,  int leastShardAllocationMaxSimultaneousRebalance,  scala.concurrent.duration.FiniteDuration waitingForStateTimeout,  scala.concurrent.duration.FiniteDuration updatingStateTimeout,  java.lang.String entityRecoveryStrategy,  scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,  int entityRecoveryConstantRateStrategyNumberOfEntities)` | Deprecated. Use the ClusterShardingSettings factory methods or the full constructor instead. |

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
	| `scala.concurrent.duration.FiniteDuration` | `[updatingStateTimeout](#updatingStateTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[waitingForStateTimeout](#waitingForStateTimeout())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TuningParameters
		
		
		
		```
		public TuningParameters​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration retryInterval,
		                        int bufferSize,
		                        scala.concurrent.duration.FiniteDuration handOffTimeout,
		                        scala.concurrent.duration.FiniteDuration shardStartTimeout,
		                        scala.concurrent.duration.FiniteDuration shardFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration entityRestartBackoff,
		                        scala.concurrent.duration.FiniteDuration rebalanceInterval,
		                        int snapshotAfter,
		                        int keepNrOfBatches,
		                        int leastShardAllocationRebalanceThreshold,
		                        int leastShardAllocationMaxSimultaneousRebalance,
		                        scala.concurrent.duration.FiniteDuration waitingForStateTimeout,
		                        scala.concurrent.duration.FiniteDuration updatingStateTimeout,
		                        java.lang.String entityRecoveryStrategy,
		                        scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,
		                        int entityRecoveryConstantRateStrategyNumberOfEntities,
		                        int coordinatorStateWriteMajorityPlus,
		                        int coordinatorStateReadMajorityPlus,
		                        int leastShardAllocationAbsoluteLimit,
		                        double leastShardAllocationRelativeLimit,
		                        scala.concurrent.duration.FiniteDuration passivationStopTimeout)
		```
		- #### TuningParameters
		
		
		
		```
		public TuningParameters​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration retryInterval,
		                        int bufferSize,
		                        scala.concurrent.duration.FiniteDuration handOffTimeout,
		                        scala.concurrent.duration.FiniteDuration shardStartTimeout,
		                        scala.concurrent.duration.FiniteDuration shardFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration entityRestartBackoff,
		                        scala.concurrent.duration.FiniteDuration rebalanceInterval,
		                        int snapshotAfter,
		                        int keepNrOfBatches,
		                        int leastShardAllocationRebalanceThreshold,
		                        int leastShardAllocationMaxSimultaneousRebalance,
		                        scala.concurrent.duration.FiniteDuration waitingForStateTimeout,
		                        scala.concurrent.duration.FiniteDuration updatingStateTimeout,
		                        java.lang.String entityRecoveryStrategy,
		                        scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,
		                        int entityRecoveryConstantRateStrategyNumberOfEntities,
		                        int coordinatorStateWriteMajorityPlus,
		                        int coordinatorStateReadMajorityPlus,
		                        int leastShardAllocationAbsoluteLimit,
		                        double leastShardAllocationRelativeLimit)
		```
		
		Deprecated.
		Use the TuningParameters factory methods or the constructor including passivationStopTimeout instead. Since 2\.9\.4\.
		- #### TuningParameters
		
		
		
		```
		public TuningParameters​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration retryInterval,
		                        int bufferSize,
		                        scala.concurrent.duration.FiniteDuration handOffTimeout,
		                        scala.concurrent.duration.FiniteDuration shardStartTimeout,
		                        scala.concurrent.duration.FiniteDuration shardFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration entityRestartBackoff,
		                        scala.concurrent.duration.FiniteDuration rebalanceInterval,
		                        int snapshotAfter,
		                        int keepNrOfBatches,
		                        int leastShardAllocationRebalanceThreshold,
		                        int leastShardAllocationMaxSimultaneousRebalance,
		                        scala.concurrent.duration.FiniteDuration waitingForStateTimeout,
		                        scala.concurrent.duration.FiniteDuration updatingStateTimeout,
		                        java.lang.String entityRecoveryStrategy,
		                        scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,
		                        int entityRecoveryConstantRateStrategyNumberOfEntities,
		                        int coordinatorStateWriteMajorityPlus,
		                        int coordinatorStateReadMajorityPlus)
		```
		
		Deprecated.
		Use the TuningParameters factory methods or the constructor including leastShardAllocationAbsoluteLimit and leastShardAllocationRelativeLimit instead. Since 2\.6\.10\.
		- #### TuningParameters
		
		
		
		```
		public TuningParameters​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration retryInterval,
		                        int bufferSize,
		                        scala.concurrent.duration.FiniteDuration handOffTimeout,
		                        scala.concurrent.duration.FiniteDuration shardStartTimeout,
		                        scala.concurrent.duration.FiniteDuration shardFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration entityRestartBackoff,
		                        scala.concurrent.duration.FiniteDuration rebalanceInterval,
		                        int snapshotAfter,
		                        int keepNrOfBatches,
		                        int leastShardAllocationRebalanceThreshold,
		                        int leastShardAllocationMaxSimultaneousRebalance,
		                        scala.concurrent.duration.FiniteDuration waitingForStateTimeout,
		                        scala.concurrent.duration.FiniteDuration updatingStateTimeout,
		                        java.lang.String entityRecoveryStrategy,
		                        scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,
		                        int entityRecoveryConstantRateStrategyNumberOfEntities)
		```
		
		Deprecated.
		Use the ClusterShardingSettings factory methods or the constructor including coordinatorStateWriteMajorityPlus and coordinatorStateReadMajorityPlus instead. Since 2\.6\.5\.
		- #### TuningParameters
		
		
		
		```
		public TuningParameters​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration retryInterval,
		                        int bufferSize,
		                        scala.concurrent.duration.FiniteDuration handOffTimeout,
		                        scala.concurrent.duration.FiniteDuration shardStartTimeout,
		                        scala.concurrent.duration.FiniteDuration shardFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration entityRestartBackoff,
		                        scala.concurrent.duration.FiniteDuration rebalanceInterval,
		                        int snapshotAfter,
		                        int leastShardAllocationRebalanceThreshold,
		                        int leastShardAllocationMaxSimultaneousRebalance,
		                        scala.concurrent.duration.FiniteDuration waitingForStateTimeout,
		                        scala.concurrent.duration.FiniteDuration updatingStateTimeout,
		                        java.lang.String entityRecoveryStrategy,
		                        scala.concurrent.duration.FiniteDuration entityRecoveryConstantRateStrategyFrequency,
		                        int entityRecoveryConstantRateStrategyNumberOfEntities)
		```
		
		Deprecated.
		Use the ClusterShardingSettings factory methods or the full constructor instead. Since 2\.6\.5\.
		- #### TuningParameters
		
		
		
		```
		public TuningParameters​(scala.concurrent.duration.FiniteDuration coordinatorFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration retryInterval,
		                        int bufferSize,
		                        scala.concurrent.duration.FiniteDuration handOffTimeout,
		                        scala.concurrent.duration.FiniteDuration shardStartTimeout,
		                        scala.concurrent.duration.FiniteDuration shardFailureBackoff,
		                        scala.concurrent.duration.FiniteDuration entityRestartBackoff,
		                        scala.concurrent.duration.FiniteDuration rebalanceInterval,
		                        int snapshotAfter,
		                        int leastShardAllocationRebalanceThreshold,
		                        int leastShardAllocationMaxSimultaneousRebalance,
		                        scala.concurrent.duration.FiniteDuration waitingForStateTimeout,
		                        scala.concurrent.duration.FiniteDuration updatingStateTimeout)
		```
		
		Deprecated.
		Use the ClusterShardingSettings factory methods or the full constructor instead. Since 2\.6\.5\.

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
		- #### updatingStateTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration updatingStateTimeout()
		```
		- #### waitingForStateTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration waitingForStateTimeout()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.TuningParameters.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.TuningParameters.html)*