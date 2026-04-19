---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/PhiAccrualFailureDetector.html
title: PhiAccrualFailureDetector
---

# PhiAccrualFailureDetector

## Content

Package [akka.remote](package-summary.html)
## Class PhiAccrualFailureDetector

- java.lang.Object
- - akka.remote.PhiAccrualFailureDetector

- All Implemented Interfaces:
`[FailureDetector](FailureDetector.html "interface in akka.remote")`

---

```
public class PhiAccrualFailureDetector
extends java.lang.Object
implements [FailureDetector](FailureDetector.html "interface in akka.remote")
```

Implementation of 'The Phi Accrual Failure Detector' by Hayashibara et al. as defined in their paper:
 \[https://oneofus.la/have\-emacs\-will\-hack/files/HDY04\.pdf]
 
 The suspicion level of failure is given by a value called φ (phi).
 The basic idea of the φ failure detector is to express the value of φ on a scale that
 is dynamically adjusted to reflect current network conditions. A configurable
 threshold is used to decide if φ is considered to be a failure.
 

 The value of φ is calculated as:
 

```

 φ = -log10(1 - F(timeSinceLastHeartbeat)
 
```

 where F is the cumulative distribution function of a normal distribution with mean
 and standard deviation estimated from historical heartbeat inter\-arrival times.
 
 param: threshold A low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event
 of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect
 actual crashes
 param: maxSampleSize Number of samples to use for calculation of mean and standard deviation of
 inter\-arrival times.
 param: minStdDeviation Minimum standard deviation to use for the normal distribution used when calculating phi.
 Too low standard deviation might result in too much sensitivity for sudden, but normal, deviations
 in heartbeat inter arrival times.
 param: acceptableHeartbeatPause Duration corresponding to number of potentially lost/delayed
 heartbeats that will be accepted before considering it to be an anomaly.
 This margin is important to be able to survive sudden, occasional, pauses in heartbeat
 arrivals, due to for example garbage collect or network drop.
 param: firstHeartbeatEstimate Bootstrap the stats with heartbeats that corresponds to
 to this duration, with a with rather high standard deviation (since environment is unknown
 in the beginning)
 param: clock The clock, returning current time in milliseconds, but can be faked for testing
 purposes. It is only used for measuring intervals (duration).

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.remote.[FailureDetector](FailureDetector.html "interface in akka.remote")
		
		
		`[FailureDetector.Clock](FailureDetector.Clock.html "class in akka.remote")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PhiAccrualFailureDetector](#%3Cinit%3E(double,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.remote.FailureDetector.Clock))​(double threshold,  int maxSampleSize,  scala.concurrent.duration.FiniteDuration minStdDeviation,  scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,  scala.concurrent.duration.FiniteDuration firstHeartbeatEstimate,  [FailureDetector.Clock](FailureDetector.Clock.html "class in akka.remote") clock)` | Constructor without eventStream to support backwards compatibility |
	| `[PhiAccrualFailureDetector](#%3Cinit%3E(double,int,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Option,akka.remote.FailureDetector.Clock))​(double threshold,  int maxSampleSize,  scala.concurrent.duration.FiniteDuration minStdDeviation,  scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,  scala.concurrent.duration.FiniteDuration firstHeartbeatEstimate,  scala.Option<[EventStream](../event/EventStream.html "class in akka.event")> eventStream,  [FailureDetector.Clock](FailureDetector.Clock.html "class in akka.remote") clock)` |  |
	| `[PhiAccrualFailureDetector](#%3Cinit%3E(com.typesafe.config.Config,akka.event.EventStream))​(com.typesafe.config.Config config,  [EventStream](../event/EventStream.html "class in akka.event") ev)` | Constructor that reads parameters from config. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[acceptableHeartbeatPause](#acceptableHeartbeatPause())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[firstHeartbeatEstimate](#firstHeartbeatEstimate())()` |  |
	| `void` | `[heartbeat](#heartbeat())()` | Notifies the FailureDetector that a heartbeat arrived from the monitored resource. |
	| `boolean` | `[isAvailable](#isAvailable())()` | Returns true if the resource is considered to be up and healthy and returns false otherwise. |
	| `boolean` | `[isMonitoring](#isMonitoring())()` | Returns true if the failure detector has received any heartbeats and started monitoring  of the resource. |
	| `int` | `[maxSampleSize](#maxSampleSize())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[minStdDeviation](#minStdDeviation())()` |  |
	| `double` | `[phi](#phi())()` | The suspicion level of the accrual failure detector. |
	| `double` | `[threshold](#threshold())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PhiAccrualFailureDetector
		
		
		
		```
		public PhiAccrualFailureDetector​(double threshold,
		                                 int maxSampleSize,
		                                 scala.concurrent.duration.FiniteDuration minStdDeviation,
		                                 scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,
		                                 scala.concurrent.duration.FiniteDuration firstHeartbeatEstimate,
		                                 scala.Option<[EventStream](../event/EventStream.html "class in akka.event")> eventStream,
		                                 [FailureDetector.Clock](FailureDetector.Clock.html "class in akka.remote") clock)
		```
		- #### PhiAccrualFailureDetector
		
		
		
		```
		public PhiAccrualFailureDetector​(double threshold,
		                                 int maxSampleSize,
		                                 scala.concurrent.duration.FiniteDuration minStdDeviation,
		                                 scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause,
		                                 scala.concurrent.duration.FiniteDuration firstHeartbeatEstimate,
		                                 [FailureDetector.Clock](FailureDetector.Clock.html "class in akka.remote") clock)
		```
		
		Constructor without eventStream to support backwards compatibility
		- #### PhiAccrualFailureDetector
		
		
		
		```
		public PhiAccrualFailureDetector​(com.typesafe.config.Config config,
		                                 [EventStream](../event/EventStream.html "class in akka.event") ev)
		```
		
		Constructor that reads parameters from config.
		 Expecting config properties named `threshold`, `max-sample-size`,
		 `min-std-deviation`, `acceptable-heartbeat-pause` and
		 `heartbeat-interval`.

	- ### Method Detail
	
	
	
		- #### acceptableHeartbeatPause
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration acceptableHeartbeatPause()
		```
		- #### firstHeartbeatEstimate
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration firstHeartbeatEstimate()
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
		- #### maxSampleSize
		
		
		
		```
		public int maxSampleSize()
		```
		- #### minStdDeviation
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration minStdDeviation()
		```
		- #### phi
		
		
		
		```
		public double phi()
		```
		
		The suspicion level of the accrual failure detector.
		 
		 If a connection does not have any records in failure detector then it is
		 considered healthy.
		- #### threshold
		
		
		
		```
		public double threshold()
		```

## Code Examples

### Example 1: Class PhiAccrualFailureDetector

```text
φ = -log10(1 - F(timeSinceLastHeartbeat)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetector.Clock.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/FailureDetector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/PhiAccrualFailureDetector.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/PhiAccrualFailureDetector.html)*