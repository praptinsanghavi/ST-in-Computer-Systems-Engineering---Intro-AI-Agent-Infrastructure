---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonSettings.html
title: ClusterSingletonSettings
---

# ClusterSingletonSettings

## Content

Package [akka.cluster.typed](package-summary.html)
## Class ClusterSingletonSettings

- java.lang.Object
- - akka.cluster.typed.ClusterSingletonSettings

- ---

```
public final class ClusterSingletonSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonSettings](#%3Cinit%3E(scala.Option,scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int))​(scala.Option<java.lang.String> role,  scala.Option<java.lang.String> dataCenter,  scala.concurrent.duration.FiniteDuration singletonIdentificationInterval,  scala.concurrent.duration.FiniteDuration removalMargin,  scala.concurrent.duration.FiniteDuration handOverRetryInterval,  int bufferSize)` | Deprecated. Use constructor with leaseSettings. |
	| `[ClusterSingletonSettings](#%3Cinit%3E(scala.Option,scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,scala.Option))​(scala.Option<java.lang.String> role,  scala.Option<java.lang.String> dataCenter,  scala.concurrent.duration.FiniteDuration singletonIdentificationInterval,  scala.concurrent.duration.FiniteDuration removalMargin,  scala.concurrent.duration.FiniteDuration handOverRetryInterval,  int bufferSize,  scala.Option<[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease")> leaseSettings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `int` | `[bufferSize](#bufferSize())()` |  |
	| `static [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API |
	| `scala.Option<java.lang.String>` | `[dataCenter](#dataCenter())()` | Deprecated. Use Akka Distributed Cluster instead. |
	| `static [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[handOverRetryInterval](#handOverRetryInterval())()` |  |
	| `scala.Option<[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease")>` | `[leaseSettings](#leaseSettings())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[removalMargin](#removalMargin())()` |  |
	| `scala.Option<java.lang.String>` | `[role](#role())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[singletonIdentificationInterval](#singletonIdentificationInterval())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withBufferSize](#withBufferSize(int))​(int bufferSize)` |  |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withDataCenter](#withDataCenter(java.lang.String))​(java.lang.String dataCenter)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withHandoverRetryInterval](#withHandoverRetryInterval(java.time.Duration))​(java.time.Duration handOverRetryInterval)` |  |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withHandoverRetryInterval](#withHandoverRetryInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration handOverRetryInterval)` |  |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withLeaseSettings](#withLeaseSettings(akka.coordination.lease.LeaseUsageSettings))​([LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease") leaseSettings)` | Note that if you define a custom lease name and have several singletons each one must have a unique  lease name. |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withNoDataCenter](#withNoDataCenter())()` | Deprecated. Use Akka Distributed Cluster instead. |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withNoRole](#withNoRole())()` |  |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withRemovalMargin](#withRemovalMargin(java.time.Duration))​(java.time.Duration removalMargin)` |  |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withRemovalMargin](#withRemovalMargin(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration removalMargin)` |  |
	| `[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")` | `[withRole](#withRole(java.lang.String))​(java.lang.String role)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterSingletonSettings
		
		
		
		```
		public ClusterSingletonSettings​(scala.Option<java.lang.String> role,
		                                scala.Option<java.lang.String> dataCenter,
		                                scala.concurrent.duration.FiniteDuration singletonIdentificationInterval,
		                                scala.concurrent.duration.FiniteDuration removalMargin,
		                                scala.concurrent.duration.FiniteDuration handOverRetryInterval,
		                                int bufferSize,
		                                scala.Option<[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease")> leaseSettings)
		```
		- #### ClusterSingletonSettings
		
		
		
		```
		public ClusterSingletonSettings​(scala.Option<java.lang.String> role,
		                                scala.Option<java.lang.String> dataCenter,
		                                scala.concurrent.duration.FiniteDuration singletonIdentificationInterval,
		                                scala.concurrent.duration.FiniteDuration removalMargin,
		                                scala.concurrent.duration.FiniteDuration handOverRetryInterval,
		                                int bufferSize)
		```
		
		Deprecated.
		Use constructor with leaseSettings. Since 2\.6\.15\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") apply​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### create
		
		
		
		```
		public static [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") create​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API
		- #### fromConfig
		
		
		
		```
		public static [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") fromConfig​(com.typesafe.config.Config config)
		```
		- #### role
		
		
		
		```
		public scala.Option<java.lang.String> role()
		```
		- #### dataCenter
		
		
		
		```
		public scala.Option<java.lang.String> dataCenter()
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		- #### singletonIdentificationInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration singletonIdentificationInterval()
		```
		- #### removalMargin
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration removalMargin()
		```
		- #### handOverRetryInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration handOverRetryInterval()
		```
		- #### bufferSize
		
		
		
		```
		public int bufferSize()
		```
		- #### leaseSettings
		
		
		
		```
		public scala.Option<[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease")> leaseSettings()
		```
		- #### withRole
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withRole​(java.lang.String role)
		```
		- #### withNoRole
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withNoRole()
		```
		- #### withDataCenter
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withDataCenter​(java.lang.String dataCenter)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		- #### withNoDataCenter
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withNoDataCenter()
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		- #### withRemovalMargin
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withRemovalMargin​(scala.concurrent.duration.FiniteDuration removalMargin)
		```
		- #### withRemovalMargin
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withRemovalMargin​(java.time.Duration removalMargin)
		```
		- #### withHandoverRetryInterval
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withHandoverRetryInterval​(scala.concurrent.duration.FiniteDuration handOverRetryInterval)
		```
		- #### withHandoverRetryInterval
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withHandoverRetryInterval​(java.time.Duration handOverRetryInterval)
		```
		- #### withBufferSize
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withBufferSize​(int bufferSize)
		```
		- #### withLeaseSettings
		
		
		
		```
		public [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") withLeaseSettings​([LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html "class in akka.coordination.lease") leaseSettings)
		```
		
		Note that if you define a custom lease name and have several singletons each one must have a unique
		 lease name. If the lease name is undefined it will be derived from ActorSystem name and singleton
		 actor path, but that may result in too long lease names.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/coordination/lease/LeaseUsageSettings.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonSettings.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterSingletonSettings.html)*