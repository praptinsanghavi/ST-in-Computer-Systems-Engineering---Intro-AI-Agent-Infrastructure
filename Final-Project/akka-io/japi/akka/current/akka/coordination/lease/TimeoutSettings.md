---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/coordination/lease/TimeoutSettings.html
title: TimeoutSettings
---

# TimeoutSettings

## Content

Package [akka.coordination.lease](package-summary.html)
## Class TimeoutSettings

- java.lang.Object
- - akka.coordination.lease.TimeoutSettings

- ---

```
public final class TimeoutSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimeoutSettings](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration heartbeatInterval,  scala.concurrent.duration.FiniteDuration heartbeatTimeout,  scala.concurrent.duration.FiniteDuration operationTimeout)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `java.time.Duration` | `[getHeartbeatInterval](#getHeartbeatInterval())()` | Java API |
	| `java.time.Duration` | `[getHeartbeatTimeout](#getHeartbeatTimeout())()` | Java API |
	| `java.time.Duration` | `[getOperationTimeout](#getOperationTimeout())()` | Java API |
	| `scala.concurrent.duration.FiniteDuration` | `[heartbeatInterval](#heartbeatInterval())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[heartbeatTimeout](#heartbeatTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[operationTimeout](#operationTimeout())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease")` | `[withHeartbeatInterval](#withHeartbeatInterval(java.time.Duration))​(java.time.Duration heartbeatInterval)` | Java API |
	| `[TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease")` | `[withHeartbeatInterval](#withHeartbeatInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration heartbeatInterval)` |  |
	| `[TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease")` | `[withHeartbeatTimeout](#withHeartbeatTimeout(java.time.Duration))​(java.time.Duration heartbeatTimeout)` | Java API |
	| `[TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease")` | `[withHeartbeatTimeout](#withHeartbeatTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration heartbeatTimeout)` |  |
	| `[TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease")` | `[withOperationTimeout](#withOperationTimeout(java.time.Duration))​(java.time.Duration operationTimeout)` | Java API |
	| `[TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease")` | `[withOperationTimeout](#withOperationTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration operationTimeout)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TimeoutSettings
		
		
		
		```
		public TimeoutSettings​(scala.concurrent.duration.FiniteDuration heartbeatInterval,
		                       scala.concurrent.duration.FiniteDuration heartbeatTimeout,
		                       scala.concurrent.duration.FiniteDuration operationTimeout)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") apply​(com.typesafe.config.Config config)
		```
		- #### heartbeatInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration heartbeatInterval()
		```
		- #### heartbeatTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration heartbeatTimeout()
		```
		- #### operationTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration operationTimeout()
		```
		- #### getHeartbeatInterval
		
		
		
		```
		public java.time.Duration getHeartbeatInterval()
		```
		
		Java API
		- #### getHeartbeatTimeout
		
		
		
		```
		public java.time.Duration getHeartbeatTimeout()
		```
		
		Java API
		- #### getOperationTimeout
		
		
		
		```
		public java.time.Duration getOperationTimeout()
		```
		
		Java API
		- #### withHeartbeatInterval
		
		
		
		```
		public [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") withHeartbeatInterval​(java.time.Duration heartbeatInterval)
		```
		
		Java API
		- #### withHeartbeatTimeout
		
		
		
		```
		public [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") withHeartbeatTimeout​(java.time.Duration heartbeatTimeout)
		```
		
		Java API
		- #### withOperationTimeout
		
		
		
		```
		public [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") withOperationTimeout​(java.time.Duration operationTimeout)
		```
		
		Java API
		- #### withHeartbeatInterval
		
		
		
		```
		public [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") withHeartbeatInterval​(scala.concurrent.duration.FiniteDuration heartbeatInterval)
		```
		- #### withHeartbeatTimeout
		
		
		
		```
		public [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") withHeartbeatTimeout​(scala.concurrent.duration.FiniteDuration heartbeatTimeout)
		```
		- #### withOperationTimeout
		
		
		
		```
		public [TimeoutSettings](TimeoutSettings.html "class in akka.coordination.lease") withOperationTimeout​(scala.concurrent.duration.FiniteDuration operationTimeout)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/coordination/lease/TimeoutSettings.html
- https://doc.akka.io/japi/akka/current/akka/coordination/lease/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/coordination/lease/TimeoutSettings.html](https://doc.akka.io/japi/akka/current/akka/coordination/lease/TimeoutSettings.html)*