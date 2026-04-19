---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html
title: LeaseUsageSettings
---

# LeaseUsageSettings

## Content

Package [akka.coordination.lease](package-summary.html)
## Class LeaseUsageSettings

- java.lang.Object
- - akka.coordination.lease.LeaseUsageSettings

- ---

```
public final class LeaseUsageSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeaseUsageSettings](#%3Cinit%3E(java.lang.String,scala.concurrent.duration.FiniteDuration))​(java.lang.String leaseImplementation,  scala.concurrent.duration.FiniteDuration leaseRetryInterval)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Scala API: Load the settings from the given lease config block |
	| `static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[apply](#apply(java.lang.String,scala.concurrent.duration.FiniteDuration))​(java.lang.String leaseImplementation,  scala.concurrent.duration.FiniteDuration leaseRetryInterval)` | Scala API: Create lease settings with undefined lease name to trigger auto generated names when used with  for example singleton or sharding |
	| `static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[apply](#apply(java.lang.String,scala.concurrent.duration.FiniteDuration,java.lang.String))​(java.lang.String leaseImplementation,  scala.concurrent.duration.FiniteDuration leaseRetryInterval,  java.lang.String leaseName)` | Scala API: |
	| `static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Load the settings from the given lease config block |
	| `static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[create](#create(java.lang.String,java.time.Duration))​(java.lang.String leaseImplementation,  java.time.Duration leaseRetryInterval)` | Java API: Create lease settings with undefined lease name to trigger auto generated names when used with  for example singleton or sharding |
	| `static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[create](#create(java.lang.String,java.time.Duration,java.lang.String))​(java.lang.String leaseImplementation,  java.time.Duration leaseRetryInterval,  java.lang.String leaseName)` | Java API: |
	| `java.time.Duration` | `[getLeaseRetryInterval](#getLeaseRetryInterval())()` |  |
	| `java.lang.String` | `[leaseImplementation](#leaseImplementation())()` |  |
	| `java.lang.String` | `[leaseName](#leaseName())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[leaseRetryInterval](#leaseRetryInterval())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[withLeaseName](#withLeaseName(java.lang.String))​(java.lang.String name)` | Note that if you have several Cluster Singletons or Cluster Sharding entity types using lease each one must have  a unique lease name |
	| `[LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[withLeaseRetryInterval](#withLeaseRetryInterval(java.time.Duration))​(java.time.Duration leaseRetryInterval)` | Java API: |
	| `[LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[withLeaseRetryInterval](#withLeaseRetryInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration leaseRetryInterval)` | Scala API: |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LeaseUsageSettings
		
		
		
		```
		public LeaseUsageSettings​(java.lang.String leaseImplementation,
		                          scala.concurrent.duration.FiniteDuration leaseRetryInterval)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") apply​(com.typesafe.config.Config config)
		```
		
		Scala API: Load the settings from the given lease config block
		- #### create
		
		
		
		```
		public static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") create​(com.typesafe.config.Config config)
		```
		
		Java API: Load the settings from the given lease config block
		- #### apply
		
		
		
		```
		public static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") apply​(java.lang.String leaseImplementation,
		                                       scala.concurrent.duration.FiniteDuration leaseRetryInterval)
		```
		
		Scala API: Create lease settings with undefined lease name to trigger auto generated names when used with
		 for example singleton or sharding
		- #### apply
		
		
		
		```
		public static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") apply​(java.lang.String leaseImplementation,
		                                       scala.concurrent.duration.FiniteDuration leaseRetryInterval,
		                                       java.lang.String leaseName)
		```
		
		Scala API:
		 
		
		Parameters:
		`leaseName` \- Note that if you have several Cluster Singletons or Cluster Sharding
		 entity types using lease each one must have a unique lease name
		- #### create
		
		
		
		```
		public static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") create​(java.lang.String leaseImplementation,
		                                        java.time.Duration leaseRetryInterval)
		```
		
		Java API: Create lease settings with undefined lease name to trigger auto generated names when used with
		 for example singleton or sharding
		- #### create
		
		
		
		```
		public static [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") create​(java.lang.String leaseImplementation,
		                                        java.time.Duration leaseRetryInterval,
		                                        java.lang.String leaseName)
		```
		
		Java API:
		
		Parameters:
		`leaseName` \- Note that if you have several Cluster Singletons or Cluster Sharding
		 entity types using lease each one must have a unique lease name
		- #### leaseImplementation
		
		
		
		```
		public java.lang.String leaseImplementation()
		```
		- #### leaseRetryInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration leaseRetryInterval()
		```
		- #### leaseName
		
		
		
		```
		public java.lang.String leaseName()
		```
		- #### getLeaseRetryInterval
		
		
		
		```
		public java.time.Duration getLeaseRetryInterval()
		```
		- #### withLeaseName
		
		
		
		```
		public [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") withLeaseName​(java.lang.String name)
		```
		
		Note that if you have several Cluster Singletons or Cluster Sharding entity types using lease each one must have
		 a unique lease name
		- #### withLeaseRetryInterval
		
		
		
		```
		public [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") withLeaseRetryInterval​(scala.concurrent.duration.FiniteDuration leaseRetryInterval)
		```
		
		Scala API:
		- #### withLeaseRetryInterval
		
		
		
		```
		public [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") withLeaseRetryInterval​(java.time.Duration leaseRetryInterval)
		```
		
		Java API:
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html)*