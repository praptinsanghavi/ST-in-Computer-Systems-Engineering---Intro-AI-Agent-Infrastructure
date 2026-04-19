---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes$.html
title: StreamRefAttributes$
---

# StreamRefAttributes$

## Content

Package [akka.stream](package-summary.html)
## Class StreamRefAttributes$

- java.lang.Object
- - akka.stream.StreamRefAttributes$

- ---

```
public class StreamRefAttributes$
extends java.lang.Object
```

Attributes for stream refs ([`SourceRef`](SourceRef.html "interface in akka.stream") and [`SinkRef`](SinkRef.html "interface in akka.stream")).
 Note that more attributes defined in [`Attributes`](Attributes.html "class in akka.stream") and [`ActorAttributes`](ActorAttributes.html "class in akka.stream").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamRefAttributes$](StreamRefAttributes$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamRefAttributes$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[bufferCapacity](#bufferCapacity(int))​(int capacity)` | Specifies the size of the buffer on the receiving side that is eagerly filled even without demand. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[demandRedeliveryInterval](#demandRedeliveryInterval(java.time.Duration))​(java.time.Duration timeout)` | Java API: If no new elements arrive within this timeout, demand is redelivered. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[demandRedeliveryInterval](#demandRedeliveryInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | Scala API: If no new elements arrive within this timeout, demand is redelivered. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[finalTerminationSignalDeadline](#finalTerminationSignalDeadline(java.time.Duration))​(java.time.Duration timeout)` | Java API: The time between the Terminated signal being received and when the local SourceRef determines to fail itself |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[finalTerminationSignalDeadline](#finalTerminationSignalDeadline(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | Scala API: The time between the Terminated signal being received and when the local SourceRef determines to fail itself |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[subscriptionTimeout](#subscriptionTimeout(java.time.Duration))​(java.time.Duration timeout)` | Java API: Specifies the subscription timeout within which the remote side MUST subscribe to the handed out stream reference. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[subscriptionTimeout](#subscriptionTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | Scala API: Specifies the subscription timeout within which the remote side MUST subscribe to the handed out stream reference. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamRefAttributes$](StreamRefAttributes$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StreamRefAttributes$
		
		
		
		```
		public StreamRefAttributes$()
		```

	- ### Method Detail
	
	
	
		- #### subscriptionTimeout
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") subscriptionTimeout​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Scala API: Specifies the subscription timeout within which the remote side MUST subscribe to the handed out stream reference.
		- #### subscriptionTimeout
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") subscriptionTimeout​(java.time.Duration timeout)
		```
		
		Java API: Specifies the subscription timeout within which the remote side MUST subscribe to the handed out stream reference.
		- #### bufferCapacity
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") bufferCapacity​(int capacity)
		```
		
		Specifies the size of the buffer on the receiving side that is eagerly filled even without demand.
		- #### demandRedeliveryInterval
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") demandRedeliveryInterval​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Scala API: If no new elements arrive within this timeout, demand is redelivered.
		- #### demandRedeliveryInterval
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") demandRedeliveryInterval​(java.time.Duration timeout)
		```
		
		Java API: If no new elements arrive within this timeout, demand is redelivered.
		- #### finalTerminationSignalDeadline
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") finalTerminationSignalDeadline​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Scala API: The time between the Terminated signal being received and when the local SourceRef determines to fail itself
		- #### finalTerminationSignalDeadline
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") finalTerminationSignalDeadline​(java.time.Duration timeout)
		```
		
		Java API: The time between the Terminated signal being received and when the local SourceRef determines to fail itself

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/ActorAttributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes$.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes$.html](https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes$.html)*