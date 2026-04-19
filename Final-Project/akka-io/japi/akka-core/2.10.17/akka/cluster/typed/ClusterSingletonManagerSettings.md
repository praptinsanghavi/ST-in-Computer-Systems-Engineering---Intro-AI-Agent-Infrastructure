---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonManagerSettings.html
title: ClusterSingletonManagerSettings
---

# ClusterSingletonManagerSettings

## Content

Package [akka.cluster.typed](package-summary.html)
## Class ClusterSingletonManagerSettings

- java.lang.Object
- - akka.cluster.typed.ClusterSingletonManagerSettings

- ---

```
public final class ClusterSingletonManagerSettings
extends java.lang.Object
```

param: singletonName The actor name of the child singleton actor.
 param: role Singleton among the nodes tagged with specified role.
 If the role is not specified it's a singleton among all nodes in
 the cluster.
 param: removalMargin Margin until the singleton instance that belonged to
 a downed/removed partition is created in surviving partition. The purpose of
 this margin is that in case of a network partition the singleton actors
 in the non\-surviving partitions must be stopped before corresponding actors
 are started somewhere else. This is especially important for persistent
 actors.
 param: handOverRetryInterval When a node is becoming oldest it sends hand\-over
 request to previous oldest, that might be leaving the cluster. This is
 retried with this interval until the previous oldest confirms that the hand
 over has started or the previous oldest member is removed from the cluster
 (\+ `removalMargin`).
 param: leaseSettings LeaseSettings for acquiring before creating the singleton actor.
 Note that if you define a custom lease name and have several singletons each
 one must have a unique lease name. If the lease name is undefined it will be
 derived from ActorSystem name and singleton actor path, but that may result in
 too long lease names.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonManagerSettings](#%3Cinit%3E(java.lang.String,scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(java.lang.String singletonName,  scala.Option<java.lang.String> role,  scala.concurrent.duration.FiniteDuration removalMargin,  scala.concurrent.duration.FiniteDuration handOverRetryInterval)` | Deprecated. Use constructor with leaseSettings. |
	| `[ClusterSingletonManagerSettings](#%3Cinit%3E(java.lang.String,scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Option))​(java.lang.String singletonName,  scala.Option<java.lang.String> role,  scala.concurrent.duration.FiniteDuration removalMargin,  scala.concurrent.duration.FiniteDuration handOverRetryInterval,  scala.Option<[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease")> leaseSettings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create settings from the default configuration  `akka.cluster.singleton`. |
	| `static [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.singleton`. |
	| `static [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Create settings from the default configuration  `akka.cluster.singleton`. |
	| `static [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Create settings from a configuration with the same layout as  the default configuration `akka.cluster.singleton`. |
	| `scala.concurrent.duration.FiniteDuration` | `[handOverRetryInterval](#handOverRetryInterval())()` |  |
	| `scala.Option<[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease")>` | `[leaseSettings](#leaseSettings())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[removalMargin](#removalMargin())()` |  |
	| `scala.Option<java.lang.String>` | `[role](#role())()` |  |
	| `java.lang.String` | `[singletonName](#singletonName())()` |  |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[withHandOverRetryInterval](#withHandOverRetryInterval(java.time.Duration))​(java.time.Duration retryInterval)` |  |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[withHandOverRetryInterval](#withHandOverRetryInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration retryInterval)` |  |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[withLeaseSettings](#withLeaseSettings(akka.coordination.lease.LeaseUsageSettings))​([LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease") leaseSettings)` | Note that if you define a custom lease name and have several singletons each one must have a unique  lease name. |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[withRemovalMargin](#withRemovalMargin(java.time.Duration))​(java.time.Duration removalMargin)` |  |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[withRemovalMargin](#withRemovalMargin(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration removalMargin)` |  |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[withRole](#withRole(java.lang.String))​(java.lang.String role)` |  |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[withRole](#withRole(scala.Option))​(scala.Option<java.lang.String> role)` |  |
	| `[ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed")` | `[withSingletonName](#withSingletonName(java.lang.String))​(java.lang.String name)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterSingletonManagerSettings
		
		
		
		```
		public ClusterSingletonManagerSettings​(java.lang.String singletonName,
		                                       scala.Option<java.lang.String> role,
		                                       scala.concurrent.duration.FiniteDuration removalMargin,
		                                       scala.concurrent.duration.FiniteDuration handOverRetryInterval,
		                                       scala.Option<[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease")> leaseSettings)
		```
		- #### ClusterSingletonManagerSettings
		
		
		
		```
		public ClusterSingletonManagerSettings​(java.lang.String singletonName,
		                                       scala.Option<java.lang.String> role,
		                                       scala.concurrent.duration.FiniteDuration removalMargin,
		                                       scala.concurrent.duration.FiniteDuration handOverRetryInterval)
		```
		
		Deprecated.
		Use constructor with leaseSettings. Since 2\.6\.15\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") apply​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.singleton`.
		- #### apply
		
		
		
		```
		public static [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.singleton`.
		- #### create
		
		
		
		```
		public static [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") create​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Create settings from the default configuration
		 `akka.cluster.singleton`.
		- #### create
		
		
		
		```
		public static [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") create​(com.typesafe.config.Config config)
		```
		
		Java API: Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.singleton`.
		- #### singletonName
		
		
		
		```
		public java.lang.String singletonName()
		```
		- #### role
		
		
		
		```
		public scala.Option<java.lang.String> role()
		```
		- #### removalMargin
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration removalMargin()
		```
		- #### handOverRetryInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration handOverRetryInterval()
		```
		- #### leaseSettings
		
		
		
		```
		public scala.Option<[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease")> leaseSettings()
		```
		- #### withSingletonName
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") withSingletonName​(java.lang.String name)
		```
		- #### withRole
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") withRole​(java.lang.String role)
		```
		- #### withRole
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") withRole​(scala.Option<java.lang.String> role)
		```
		- #### withRemovalMargin
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") withRemovalMargin​(scala.concurrent.duration.FiniteDuration removalMargin)
		```
		- #### withRemovalMargin
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") withRemovalMargin​(java.time.Duration removalMargin)
		```
		- #### withHandOverRetryInterval
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") withHandOverRetryInterval​(scala.concurrent.duration.FiniteDuration retryInterval)
		```
		- #### withHandOverRetryInterval
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") withHandOverRetryInterval​(java.time.Duration retryInterval)
		```
		- #### withLeaseSettings
		
		
		
		```
		public [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") withLeaseSettings​([LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease") leaseSettings)
		```
		
		Note that if you define a custom lease name and have several singletons each one must have a unique
		 lease name. If the lease name is undefined it will be derived from ActorSystem name and singleton
		 actor path, but that may result in too long lease names.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonManagerSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonManagerSettings.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonManagerSettings.html)*