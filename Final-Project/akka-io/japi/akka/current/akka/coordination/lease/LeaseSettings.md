---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/coordination/lease/LeaseSettings.html
title: LeaseSettings
---

# LeaseSettings

## Content

Package [akka.coordination.lease](package-summary.html)
## Class LeaseSettings

- java.lang.Object
- - akka.coordination.lease.LeaseSettings

- ---

```
public final class LeaseSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeaseSettings](#%3Cinit%3E(java.lang.String,java.lang.String,akka.coordination.lease.TimeoutSettings,com.typesafe.config.Config))​(java.lang.String leaseName,  java.lang.String ownerName,  [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") timeoutSettings,  com.typesafe.config.Config leaseConfig)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LeaseSettings](LeaseSettings.html "class in akka.coordination.lease")` | `[apply](#apply(com.typesafe.config.Config,java.lang.String,java.lang.String))​(com.typesafe.config.Config config,  java.lang.String leaseName,  java.lang.String ownerName)` |  |
	| `com.typesafe.config.Config` | `[leaseConfig](#leaseConfig())()` |  |
	| `java.lang.String` | `[leaseName](#leaseName())()` |  |
	| `java.lang.String` | `[ownerName](#ownerName())()` |  |
	| `[TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease")` | `[timeoutSettings](#timeoutSettings())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[LeaseSettings](LeaseSettings.html "class in akka.coordination.lease")` | `[withTimeoutSettings](#withTimeoutSettings(akka.coordination.lease.TimeoutSettings))​([TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") timeoutSettings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LeaseSettings
		
		
		
		```
		public LeaseSettings​(java.lang.String leaseName,
		                     java.lang.String ownerName,
		                     [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") timeoutSettings,
		                     com.typesafe.config.Config leaseConfig)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [LeaseSettings](LeaseSettings.html "class in akka.coordination.lease") apply​(com.typesafe.config.Config config,
		                                  java.lang.String leaseName,
		                                  java.lang.String ownerName)
		```
		- #### leaseName
		
		
		
		```
		public java.lang.String leaseName()
		```
		- #### ownerName
		
		
		
		```
		public java.lang.String ownerName()
		```
		- #### timeoutSettings
		
		
		
		```
		public [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") timeoutSettings()
		```
		- #### leaseConfig
		
		
		
		```
		public com.typesafe.config.Config leaseConfig()
		```
		- #### withTimeoutSettings
		
		
		
		```
		public [LeaseSettings](LeaseSettings.html "class in akka.coordination.lease") withTimeoutSettings​([TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") timeoutSettings)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/japi/akka/current/akka/coordination/lease/TimeoutSettings.html
- https://doc.akka.io/japi/akka/current/akka/coordination/lease/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/coordination/lease/LeaseSettings.html](https://doc.akka.io/japi/akka/current/akka/coordination/lease/LeaseSettings.html)*