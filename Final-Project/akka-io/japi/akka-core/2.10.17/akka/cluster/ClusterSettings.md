---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:17:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterSettings.html
title: ClusterSettings
---

# ClusterSettings

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterSettings

- java.lang.Object
- - akka.cluster.ClusterSettings

- ---

```
public final class ClusterSettings
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[ClusterSettings.CrossDcFailureDetectorSettings](ClusterSettings.CrossDcFailureDetectorSettings.html "class in akka.cluster")` |  |
	| `class` | `[ClusterSettings.Debug$](ClusterSettings.Debug$.html "class in akka.cluster")` |  |
	| `class` | `[ClusterSettings.MultiDataCenter$](ClusterSettings.MultiDataCenter$.html "class in akka.cluster")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSettings](#%3Cinit%3E(com.typesafe.config.Config,java.lang.String))​(com.typesafe.config.Config config,  java.lang.String systemName)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[AllowWeaklyUpMembers](#AllowWeaklyUpMembers())()` |  |
	| `[Version](../util/Version.html "class in akka.util")` | `[AppVersion](#AppVersion())()` |  |
	| `boolean` | `[ByPassConfigCompatCheck](#ByPassConfigCompatCheck())()` |  |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[ConfigCompatCheckers](#ConfigCompatCheckers())()` |  |
	| `[ClusterSettings.Debug$](ClusterSettings.Debug$.html "class in akka.cluster")` | `[Debug](#Debug())()` | Accessor for nested Scala object |
	| `java.lang.String` | `[DowningProviderClassName](#DowningProviderClassName())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[DownRemovalMargin](#DownRemovalMargin())()` |  |
	| `com.typesafe.config.Config` | `[FailureDetectorConfig](#FailureDetectorConfig())()` |  |
	| `java.lang.String` | `[FailureDetectorImplementationClass](#FailureDetectorImplementationClass())()` |  |
	| `double` | `[GossipDifferentViewProbability](#GossipDifferentViewProbability())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[GossipInterval](#GossipInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[GossipTimeToLive](#GossipTimeToLive())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[HeartbeatExpectedResponseAfter](#HeartbeatExpectedResponseAfter())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[HeartbeatInterval](#HeartbeatInterval())()` |  |
	| `boolean` | `[JmxEnabled](#JmxEnabled())()` |  |
	| `boolean` | `[JmxMultiMbeansInSameEnabled](#JmxMultiMbeansInSameEnabled())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[LeaderActionsInterval](#LeaderActionsInterval())()` |  |
	| `boolean` | `[LogInfo](#LogInfo())()` |  |
	| `boolean` | `[LogInfoVerbose](#LogInfoVerbose())()` |  |
	| `int` | `[MinNrOfMembers](#MinNrOfMembers())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[MinNrOfMembersOfRole](#MinNrOfMembersOfRole())()` |  |
	| `int` | `[MonitoredByNrOfMembers](#MonitoredByNrOfMembers())()` |  |
	| `[ClusterSettings.MultiDataCenter$](ClusterSettings.MultiDataCenter$.html "class in akka.cluster")` | `[MultiDataCenter](#MultiDataCenter())()` | Accessor for nested Scala object |
	| `scala.concurrent.duration.FiniteDuration` | `[PeriodicTasksInitialDelay](#PeriodicTasksInitialDelay())()` |  |
	| `scala.concurrent.duration.Duration` | `[PruneGossipTombstonesAfter](#PruneGossipTombstonesAfter())()` | Is in fact always a `FiniteDuration` but needs to stay `Duration` for binary compatibility |
	| `scala.concurrent.duration.Duration` | `[PublishStatsInterval](#PublishStatsInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[QuarantineRemovedNodeAfter](#QuarantineRemovedNodeAfter())()` |  |
	| `int` | `[ReduceGossipDifferentViewProbability](#ReduceGossipDifferentViewProbability())()` |  |
	| `scala.concurrent.duration.Duration` | `[RetryUnsuccessfulJoinAfter](#RetryUnsuccessfulJoinAfter())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[Roles](#Roles())()` |  |
	| `boolean` | `[RunCoordinatedShutdownWhenDown](#RunCoordinatedShutdownWhenDown())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[SchedulerTickDuration](#SchedulerTickDuration())()` |  |
	| `int` | `[SchedulerTicksPerWheel](#SchedulerTicksPerWheel())()` |  |
	| `scala.collection.immutable.IndexedSeq<[Address](../actor/Address.html "class in akka.actor")>` | `[SeedNodes](#SeedNodes())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[SeedNodeTimeout](#SeedNodeTimeout())()` |  |
	| `java.lang.String` | `[SelfDataCenter](#SelfDataCenter())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[SensitiveConfigPaths](#SensitiveConfigPaths())()` |  |
	| `scala.concurrent.duration.Duration` | `[ShutdownAfterUnsuccessfulJoinSeedNodes](#ShutdownAfterUnsuccessfulJoinSeedNodes())()` |  |
	| `java.lang.String` | `[systemName](#systemName())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[UnreachableNodesReaperInterval](#UnreachableNodesReaperInterval())()` |  |
	| `java.lang.String` | `[UseDispatcher](#UseDispatcher())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[WeaklyUpAfter](#WeaklyUpAfter())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterSettings
		
		
		
		```
		public ClusterSettings​(com.typesafe.config.Config config,
		                       java.lang.String systemName)
		```

	- ### Method Detail
	
	
	
		- #### MultiDataCenter
		
		
		
		```
		public [ClusterSettings.MultiDataCenter$](ClusterSettings.MultiDataCenter$.html "class in akka.cluster") MultiDataCenter()
		```
		
		Accessor for nested Scala object
		
		Returns:
		(undocumented)
		- #### Debug
		
		
		
		```
		public [ClusterSettings.Debug$](ClusterSettings.Debug$.html "class in akka.cluster") Debug()
		```
		
		Accessor for nested Scala object
		
		Returns:
		(undocumented)
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		- #### systemName
		
		
		
		```
		public java.lang.String systemName()
		```
		- #### LogInfoVerbose
		
		
		
		```
		public boolean LogInfoVerbose()
		```
		- #### LogInfo
		
		
		
		```
		public boolean LogInfo()
		```
		- #### FailureDetectorConfig
		
		
		
		```
		public com.typesafe.config.Config FailureDetectorConfig()
		```
		- #### FailureDetectorImplementationClass
		
		
		
		```
		public java.lang.String FailureDetectorImplementationClass()
		```
		- #### HeartbeatInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration HeartbeatInterval()
		```
		- #### HeartbeatExpectedResponseAfter
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration HeartbeatExpectedResponseAfter()
		```
		- #### MonitoredByNrOfMembers
		
		
		
		```
		public int MonitoredByNrOfMembers()
		```
		- #### SeedNodes
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Address](../actor/Address.html "class in akka.actor")> SeedNodes()
		```
		- #### SeedNodeTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration SeedNodeTimeout()
		```
		- #### RetryUnsuccessfulJoinAfter
		
		
		
		```
		public scala.concurrent.duration.Duration RetryUnsuccessfulJoinAfter()
		```
		- #### ShutdownAfterUnsuccessfulJoinSeedNodes
		
		
		
		```
		public scala.concurrent.duration.Duration ShutdownAfterUnsuccessfulJoinSeedNodes()
		```
		- #### PeriodicTasksInitialDelay
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration PeriodicTasksInitialDelay()
		```
		- #### GossipInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration GossipInterval()
		```
		- #### GossipTimeToLive
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration GossipTimeToLive()
		```
		- #### LeaderActionsInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration LeaderActionsInterval()
		```
		- #### UnreachableNodesReaperInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration UnreachableNodesReaperInterval()
		```
		- #### PublishStatsInterval
		
		
		
		```
		public scala.concurrent.duration.Duration PublishStatsInterval()
		```
		- #### PruneGossipTombstonesAfter
		
		
		
		```
		public scala.concurrent.duration.Duration PruneGossipTombstonesAfter()
		```
		
		Is in fact always a `FiniteDuration` but needs to stay `Duration` for binary compatibility
		- #### DownRemovalMargin
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration DownRemovalMargin()
		```
		- #### DowningProviderClassName
		
		
		
		```
		public java.lang.String DowningProviderClassName()
		```
		- #### QuarantineRemovedNodeAfter
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration QuarantineRemovedNodeAfter()
		```
		- #### WeaklyUpAfter
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration WeaklyUpAfter()
		```
		- #### AllowWeaklyUpMembers
		
		
		
		```
		public boolean AllowWeaklyUpMembers()
		```
		- #### SelfDataCenter
		
		
		
		```
		public java.lang.String SelfDataCenter()
		```
		- #### Roles
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> Roles()
		```
		- #### AppVersion
		
		
		
		```
		public [Version](../util/Version.html "class in akka.util") AppVersion()
		```
		- #### MinNrOfMembers
		
		
		
		```
		public int MinNrOfMembers()
		```
		- #### MinNrOfMembersOfRole
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.Object> MinNrOfMembersOfRole()
		```
		- #### RunCoordinatedShutdownWhenDown
		
		
		
		```
		public boolean RunCoordinatedShutdownWhenDown()
		```
		- #### JmxEnabled
		
		
		
		```
		public boolean JmxEnabled()
		```
		- #### JmxMultiMbeansInSameEnabled
		
		
		
		```
		public boolean JmxMultiMbeansInSameEnabled()
		```
		- #### UseDispatcher
		
		
		
		```
		public java.lang.String UseDispatcher()
		```
		- #### GossipDifferentViewProbability
		
		
		
		```
		public double GossipDifferentViewProbability()
		```
		- #### ReduceGossipDifferentViewProbability
		
		
		
		```
		public int ReduceGossipDifferentViewProbability()
		```
		- #### SchedulerTickDuration
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration SchedulerTickDuration()
		```
		- #### SchedulerTicksPerWheel
		
		
		
		```
		public int SchedulerTicksPerWheel()
		```
		- #### ByPassConfigCompatCheck
		
		
		
		```
		public boolean ByPassConfigCompatCheck()
		```
		- #### ConfigCompatCheckers
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> ConfigCompatCheckers()
		```
		- #### SensitiveConfigPaths
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> SensitiveConfigPaths()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterSettings.CrossDcFailureDetectorSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterSettings.Debug$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterSettings.MultiDataCenter$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Version.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterSettings.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterSettings.html)*