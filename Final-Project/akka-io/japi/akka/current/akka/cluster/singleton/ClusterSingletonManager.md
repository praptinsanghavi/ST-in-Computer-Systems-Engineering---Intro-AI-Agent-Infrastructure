---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.html
title: ClusterSingletonManager.Internal$
---

# ClusterSingletonManager.Internal$

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonManager.Internal$

- java.lang.Object
- - akka.cluster.singleton.ClusterSingletonManager.Internal$

- Enclosing class:
[ClusterSingletonManager](ClusterSingletonManager.html "class in akka.cluster.singleton")

---

```
public static class ClusterSingletonManager.Internal$
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[ClusterSingletonManager.Internal$.AcquireLeaseFailure](ClusterSingletonManager.Internal$.AcquireLeaseFailure.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.AcquireLeaseFailure$](ClusterSingletonManager.Internal$.AcquireLeaseFailure$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.AcquireLeaseResult](ClusterSingletonManager.Internal$.AcquireLeaseResult.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.AcquireLeaseResult$](ClusterSingletonManager.Internal$.AcquireLeaseResult$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.AcquiringLease](ClusterSingletonManager.Internal$.AcquiringLease.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.AcquiringLease$](ClusterSingletonManager.Internal$.AcquiringLease$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.AcquiringLeaseData](ClusterSingletonManager.Internal$.AcquiringLeaseData.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.AcquiringLeaseData$](ClusterSingletonManager.Internal$.AcquiringLeaseData$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.BecomingOldest](ClusterSingletonManager.Internal$.BecomingOldest.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.BecomingOldest$](ClusterSingletonManager.Internal$.BecomingOldest$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.BecomingOldestData](ClusterSingletonManager.Internal$.BecomingOldestData.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.BecomingOldestData$](ClusterSingletonManager.Internal$.BecomingOldestData$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Cleanup](ClusterSingletonManager.Internal$.Cleanup.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Cleanup$](ClusterSingletonManager.Internal$.Cleanup$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.DelayedMemberRemoved](ClusterSingletonManager.Internal$.DelayedMemberRemoved.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.DelayedMemberRemoved$](ClusterSingletonManager.Internal$.DelayedMemberRemoved$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.End](ClusterSingletonManager.Internal$.End.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.End$](ClusterSingletonManager.Internal$.End$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.EndData](ClusterSingletonManager.Internal$.EndData.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.EndData$](ClusterSingletonManager.Internal$.EndData$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.HandingOver](ClusterSingletonManager.Internal$.HandingOver.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.HandingOver$](ClusterSingletonManager.Internal$.HandingOver$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.HandingOverData](ClusterSingletonManager.Internal$.HandingOverData.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.HandingOverData$](ClusterSingletonManager.Internal$.HandingOverData$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.HandOverDone](ClusterSingletonManager.Internal$.HandOverDone.html "class in akka.cluster.singleton")` | Confirmation by the previous oldest that the singleton  actor has been terminated and the hand\-over process is  completed. |
	| `class` | `[ClusterSingletonManager.Internal$.HandOverDone$](ClusterSingletonManager.Internal$.HandOverDone$.html "class in akka.cluster.singleton")` | Confirmation by the previous oldest that the singleton  actor has been terminated and the hand\-over process is  completed. |
	| `class` | `[ClusterSingletonManager.Internal$.HandOverInProgress](ClusterSingletonManager.Internal$.HandOverInProgress.html "class in akka.cluster.singleton")` | Confirmation by the previous oldest that the hand  over process, shut down of the singleton actor, has  started. |
	| `class` | `[ClusterSingletonManager.Internal$.HandOverInProgress$](ClusterSingletonManager.Internal$.HandOverInProgress$.html "class in akka.cluster.singleton")` | Confirmation by the previous oldest that the hand  over process, shut down of the singleton actor, has  started. |
	| `class` | `[ClusterSingletonManager.Internal$.HandOverRetry](ClusterSingletonManager.Internal$.HandOverRetry.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.HandOverRetry$](ClusterSingletonManager.Internal$.HandOverRetry$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.HandOverToMe](ClusterSingletonManager.Internal$.HandOverToMe.html "class in akka.cluster.singleton")` | Sent from new oldest to previous oldest to initiate the  hand\-over process. |
	| `class` | `[ClusterSingletonManager.Internal$.HandOverToMe$](ClusterSingletonManager.Internal$.HandOverToMe$.html "class in akka.cluster.singleton")` | Sent from new oldest to previous oldest to initiate the  hand\-over process. |
	| `class` | `[ClusterSingletonManager.Internal$.LeaseLost](ClusterSingletonManager.Internal$.LeaseLost.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.LeaseLost$](ClusterSingletonManager.Internal$.LeaseLost$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.LeaseRetry](ClusterSingletonManager.Internal$.LeaseRetry.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.LeaseRetry$](ClusterSingletonManager.Internal$.LeaseRetry$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Oldest](ClusterSingletonManager.Internal$.Oldest.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Oldest$](ClusterSingletonManager.Internal$.Oldest$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.OldestChangedBuffer](ClusterSingletonManager.Internal$.OldestChangedBuffer.html "class in akka.cluster.singleton")` | Notifications of member events that track oldest member are tunneled  via this actor (child of ClusterSingletonManager) to be able to deliver  one change at a time. |
	| `class` | `[ClusterSingletonManager.Internal$.OldestChangedBuffer$](ClusterSingletonManager.Internal$.OldestChangedBuffer$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.OldestData](ClusterSingletonManager.Internal$.OldestData.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.OldestData$](ClusterSingletonManager.Internal$.OldestData$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.ReleaseLeaseFailure](ClusterSingletonManager.Internal$.ReleaseLeaseFailure.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.ReleaseLeaseFailure$](ClusterSingletonManager.Internal$.ReleaseLeaseFailure$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.ReleaseLeaseResult](ClusterSingletonManager.Internal$.ReleaseLeaseResult.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.ReleaseLeaseResult$](ClusterSingletonManager.Internal$.ReleaseLeaseResult$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.SelfExiting](ClusterSingletonManager.Internal$.SelfExiting.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.SelfExiting$](ClusterSingletonManager.Internal$.SelfExiting$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Start](ClusterSingletonManager.Internal$.Start.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Start$](ClusterSingletonManager.Internal$.Start$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.StartOldestChangedBuffer](ClusterSingletonManager.Internal$.StartOldestChangedBuffer.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.StartOldestChangedBuffer$](ClusterSingletonManager.Internal$.StartOldestChangedBuffer$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Stopping](ClusterSingletonManager.Internal$.Stopping.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Stopping$](ClusterSingletonManager.Internal$.Stopping$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.StoppingData](ClusterSingletonManager.Internal$.StoppingData.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.StoppingData$](ClusterSingletonManager.Internal$.StoppingData$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.TakeOver](ClusterSingletonManager.Internal$.TakeOver.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.TakeOver$](ClusterSingletonManager.Internal$.TakeOver$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.TakeOverFromMe](ClusterSingletonManager.Internal$.TakeOverFromMe.html "class in akka.cluster.singleton")` | Sent from from previous oldest to new oldest to  initiate the normal hand\-over process. |
	| `class` | `[ClusterSingletonManager.Internal$.TakeOverFromMe$](ClusterSingletonManager.Internal$.TakeOverFromMe$.html "class in akka.cluster.singleton")` | Sent from from previous oldest to new oldest to  initiate the normal hand\-over process. |
	| `class` | `[ClusterSingletonManager.Internal$.TakeOverRetry](ClusterSingletonManager.Internal$.TakeOverRetry.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.TakeOverRetry$](ClusterSingletonManager.Internal$.TakeOverRetry$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Uninitialized](ClusterSingletonManager.Internal$.Uninitialized.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Uninitialized$](ClusterSingletonManager.Internal$.Uninitialized$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.WasOldest](ClusterSingletonManager.Internal$.WasOldest.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.WasOldest$](ClusterSingletonManager.Internal$.WasOldest$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.WasOldestData](ClusterSingletonManager.Internal$.WasOldestData.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.WasOldestData$](ClusterSingletonManager.Internal$.WasOldestData$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Younger](ClusterSingletonManager.Internal$.Younger.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.Younger$](ClusterSingletonManager.Internal$.Younger$.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.YoungerData](ClusterSingletonManager.Internal$.YoungerData.html "class in akka.cluster.singleton")` |  |
	| `class` | `[ClusterSingletonManager.Internal$.YoungerData$](ClusterSingletonManager.Internal$.YoungerData$.html "class in akka.cluster.singleton")` |  |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSingletonManager.Internal$](ClusterSingletonManager.Internal$.html "class in akka.cluster.singleton")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Internal$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[CleanupTimer](#CleanupTimer())()` |  |
	| `java.lang.String` | `[HandOverRetryTimer](#HandOverRetryTimer())()` |  |
	| `java.lang.String` | `[LeaseRetryTimer](#LeaseRetryTimer())()` |  |
	| `java.lang.String` | `[TakeOverRetryTimer](#TakeOverRetryTimer())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSingletonManager.Internal$](ClusterSingletonManager.Internal$.html "class in akka.cluster.singleton") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Internal$
		
		
		
		```
		public Internal$()
		```

	- ### Method Detail
	
	
	
		- #### HandOverRetryTimer
		
		
		
		```
		public java.lang.String HandOverRetryTimer()
		```
		- #### TakeOverRetryTimer
		
		
		
		```
		public java.lang.String TakeOverRetryTimer()
		```
		- #### CleanupTimer
		
		
		
		```
		public java.lang.String CleanupTimer()
		```
		- #### LeaseRetryTimer
		
		
		
		```
		public java.lang.String LeaseRetryTimer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseFailure$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseFailure.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseResult$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquireLeaseResult.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquiringLease$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquiringLease.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquiringLeaseData$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.AcquiringLeaseData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.BecomingOldest$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.BecomingOldest.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.BecomingOldestData$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.BecomingOldestData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.Cleanup$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.Cleanup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.DelayedMemberRemoved$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.DelayedMemberRemoved.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.End$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.End.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.EndData$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.EndData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverDone$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverDone.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverInProgress$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverInProgress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverRetry$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverRetry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverToMe$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverToMe.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandingOver$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandingOver.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandingOverData$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandingOverData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.LeaseLost$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.LeaseLost.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.LeaseRetry$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.LeaseRetry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.Oldest$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.Oldest.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestChangedBuffer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestData$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.OldestData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseFailure$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseFailure.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseResult$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.ReleaseLeaseResult.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.SelfExiting$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.SelfExiting.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.Start$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.Start.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.html](https://doc.akka.io/japi/akka/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.html)*