---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings$.html
title: LeaseUsageSettings$
---

# LeaseUsageSettings$

## Content

Package [akka.coordination.lease](package-summary.html)
## Class LeaseUsageSettings$

- java.lang.Object
- - akka.coordination.lease.LeaseUsageSettings$

- ---

```
public class LeaseUsageSettings$
extends java.lang.Object
```

Note that if you define a custom lease name and have several Cluster Singletons or Cluster Sharding
 entity types each one must have a unique lease name. If the lease name is undefined it will be derived
 from ActorSystem name and other component names, but that may result in too long lease names.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LeaseUsageSettings$](LeaseUsageSettings$.html "class in akka.coordination.lease")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeaseUsageSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Scala API: Load the settings from the given lease config block |
	| `[LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[apply](#apply(java.lang.String,scala.concurrent.duration.FiniteDuration))​(java.lang.String leaseImplementation,  scala.concurrent.duration.FiniteDuration leaseRetryInterval)` | Scala API: Create lease settings with undefined lease name to trigger auto generated names when used with  for example singleton or sharding |
	| `[LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[apply](#apply(java.lang.String,scala.concurrent.duration.FiniteDuration,java.lang.String))​(java.lang.String leaseImplementation,  scala.concurrent.duration.FiniteDuration leaseRetryInterval,  java.lang.String leaseName)` | Scala API: |
	| `[LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Load the settings from the given lease config block |
	| `[LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[create](#create(java.lang.String,java.time.Duration))​(java.lang.String leaseImplementation,  java.time.Duration leaseRetryInterval)` | Java API: Create lease settings with undefined lease name to trigger auto generated names when used with  for example singleton or sharding |
	| `[LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease")` | `[create](#create(java.lang.String,java.time.Duration,java.lang.String))​(java.lang.String leaseImplementation,  java.time.Duration leaseRetryInterval,  java.lang.String leaseName)` | Java API: |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LeaseUsageSettings$](LeaseUsageSettings$.html "class in akka.coordination.lease") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LeaseUsageSettings$
		
		
		
		```
		public LeaseUsageSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") apply​(com.typesafe.config.Config config)
		```
		
		Scala API: Load the settings from the given lease config block
		- #### create
		
		
		
		```
		public [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") create​(com.typesafe.config.Config config)
		```
		
		Java API: Load the settings from the given lease config block
		- #### apply
		
		
		
		```
		public [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") apply​(java.lang.String leaseImplementation,
		                                scala.concurrent.duration.FiniteDuration leaseRetryInterval)
		```
		
		Scala API: Create lease settings with undefined lease name to trigger auto generated names when used with
		 for example singleton or sharding
		- #### apply
		
		
		
		```
		public [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") apply​(java.lang.String leaseImplementation,
		                                scala.concurrent.duration.FiniteDuration leaseRetryInterval,
		                                java.lang.String leaseName)
		```
		
		Scala API:
		 
		
		Parameters:
		`leaseName` \- Note that if you have several Cluster Singletons or Cluster Sharding
		 entity types using lease each one must have a unique lease name
		- #### create
		
		
		
		```
		public [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") create​(java.lang.String leaseImplementation,
		                                 java.time.Duration leaseRetryInterval)
		```
		
		Java API: Create lease settings with undefined lease name to trigger auto generated names when used with
		 for example singleton or sharding
		- #### create
		
		
		
		```
		public [LeaseUsageSettings](LeaseUsageSettings.html "class in akka.coordination.lease") create​(java.lang.String leaseImplementation,
		                                 java.time.Duration leaseRetryInterval,
		                                 java.lang.String leaseName)
		```
		
		Java API:
		
		Parameters:
		`leaseName` \- Note that if you have several Cluster Singletons or Cluster Sharding
		 entity types using lease each one must have a unique lease name

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings$.html)*