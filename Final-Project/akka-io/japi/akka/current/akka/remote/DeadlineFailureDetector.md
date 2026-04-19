---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:33:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/DeadlineFailureDetector.html
title: DeadlineFailureDetector
---

# DeadlineFailureDetector

## Content

Package [akka.remote](package-summary.html)
## Class DeadlineFailureDetector

- java.lang.Object
- - akka.remote.DeadlineFailureDetector

- All Implemented Interfaces:
`[FailureDetector](FailureDetector.html "interface in akka.remote")`

---

```
public class DeadlineFailureDetector
extends java.lang.Object
implements [FailureDetector](FailureDetector.html "interface in akka.remote")
```

Implementation of failure detector using an absolute timeout of missing heartbeats
 to trigger unavailability.
 
[`isAvailable()`](#isAvailable()) will return `false` if there is no [`heartbeat()`](#heartbeat()) within the duration
 `heartbeatInterval + acceptableHeartbeatPause`.
 

 param: acceptableHeartbeatPause Duration corresponding to number of potentially lost/delayed
 heartbeats that will be accepted before considering it to be an anomaly.
 

 param: heartbeatInterval Expected heartbeat interval
 

 param: clock The clock, returning current time in milliseconds, but can be faked for testing
 purposes. It is only used for measuring intervals (duration).

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.remote.[FailureDetector](FailureDetector.html "interface in akka.remote")
		
		
		`[FailureDetector.Clock](FailureDetector.Clock.html "class in akka.remote")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeadlineFailureDetector](#%3Cinit%3E(com.typesafe.config.Config,akka.event.EventStream))​(com.typesafe.config.Config config,  [EventStream](../event/EventStream.html "class in akka.event") ev)` | Constructor that reads parameters from config. |
	| `[DeadlineFailureDetector](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.remote.FailureDetector.Clock))​(scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,  scala.concurrent.duration.FiniteDuration heartbeatInterval,  [FailureDetector.Clock](FailureDetector.Clock.html "class in akka.remote") clock)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[acceptableHeartbeatPause](#acceptableHeartbeatPause())()` |  |
	| `void` | `[heartbeat](#heartbeat())()` | Notifies the FailureDetector that a heartbeat arrived from the monitored resource. |
	| `scala.concurrent.duration.FiniteDuration` | `[heartbeatInterval](#heartbeatInterval())()` |  |
	| `boolean` | `[isAvailable](#isAvailable())()` | Returns true if the resource is considered to be up and healthy and returns false otherwise. |
	| `boolean` | `[isMonitoring](#isMonitoring())()` | Returns true if the failure detector has received any heartbeats and started monitoring  of the resource. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeadlineFailureDetector
		
		
		
		```
		public DeadlineFailureDetector​(scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,
		                               scala.concurrent.duration.FiniteDuration heartbeatInterval,
		                               [FailureDetector.Clock](FailureDetector.Clock.html "class in akka.remote") clock)
		```
		- #### DeadlineFailureDetector
		
		
		
		```
		public DeadlineFailureDetector​(com.typesafe.config.Config config,
		                               [EventStream](../event/EventStream.html "class in akka.event") ev)
		```
		
		Constructor that reads parameters from config.
		 Expecting config properties named `acceptable-heartbeat-pause`.

	- ### Method Detail
	
	
	
		- #### acceptableHeartbeatPause
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause()
		```
		- #### heartbeat
		
		
		
		```
		public final void heartbeat()
		```
		
		Description copied from interface: `[FailureDetector](FailureDetector.html#heartbeat())`
		Notifies the FailureDetector that a heartbeat arrived from the monitored resource. This causes the FailureDetector
		 to update its state.
		
		Specified by:
		`[heartbeat](FailureDetector.html#heartbeat())` in interface `[FailureDetector](FailureDetector.html "interface in akka.remote")`
		- #### heartbeatInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration heartbeatInterval()
		```
		- #### isAvailable
		
		
		
		```
		public boolean isAvailable()
		```
		
		Description copied from interface: `[FailureDetector](FailureDetector.html#isAvailable())`
		Returns true if the resource is considered to be up and healthy and returns false otherwise.
		
		Specified by:
		`[isAvailable](FailureDetector.html#isAvailable())` in interface `[FailureDetector](FailureDetector.html "interface in akka.remote")`
		- #### isMonitoring
		
		
		
		```
		public boolean isMonitoring()
		```
		
		Description copied from interface: `[FailureDetector](FailureDetector.html#isMonitoring())`
		Returns true if the failure detector has received any heartbeats and started monitoring
		 of the resource.
		
		Specified by:
		`[isMonitoring](FailureDetector.html#isMonitoring())` in interface `[FailureDetector](FailureDetector.html "interface in akka.remote")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/EventStream.html
- https://doc.akka.io/japi/akka/current/akka/remote/FailureDetector.Clock.html
- https://doc.akka.io/japi/akka/current/akka/remote/FailureDetector.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/DeadlineFailureDetector.html](https://doc.akka.io/japi/akka/current/akka/remote/DeadlineFailureDetector.html)*