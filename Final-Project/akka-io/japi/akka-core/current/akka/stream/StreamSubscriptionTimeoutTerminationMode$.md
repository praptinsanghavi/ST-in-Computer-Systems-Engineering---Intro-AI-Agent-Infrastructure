---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:03:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/StreamSubscriptionTimeoutTerminationMode$.html
title: StreamSubscriptionTimeoutTerminationMode$
---

# StreamSubscriptionTimeoutTerminationMode$

## Content

Package [akka.stream](package-summary.html)
## Class StreamSubscriptionTimeoutTerminationMode$

- java.lang.Object
- - akka.stream.StreamSubscriptionTimeoutTerminationMode$

- ---

```
public class StreamSubscriptionTimeoutTerminationMode$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamSubscriptionTimeoutTerminationMode$](StreamSubscriptionTimeoutTerminationMode$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamSubscriptionTimeoutTerminationMode$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream")` | `[cancel](#cancel())()` | When the timeout expires attach a Subscriber that will immediately cancel its subscription. |
	| `[StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream")` | `[noop](#noop())()` | Do not do anything when timeout expires. |
	| `[StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream")` | `[warn](#warn())()` | Log a warning when the timeout expires. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamSubscriptionTimeoutTerminationMode$](StreamSubscriptionTimeoutTerminationMode$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StreamSubscriptionTimeoutTerminationMode$
		
		
		
		```
		public StreamSubscriptionTimeoutTerminationMode$()
		```

	- ### Method Detail
	
	
	
		- #### noop
		
		
		
		```
		public [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") noop()
		```
		
		Do not do anything when timeout expires.
		- #### warn
		
		
		
		```
		public [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") warn()
		```
		
		Log a warning when the timeout expires.
		- #### cancel
		
		
		
		```
		public [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") cancel()
		```
		
		When the timeout expires attach a Subscriber that will immediately cancel its subscription.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamSubscriptionTimeoutTerminationMode$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/StreamSubscriptionTimeoutTerminationMode.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/StreamSubscriptionTimeoutTerminationMode$.html](https://doc.akka.io/japi/akka-core/current/akka/stream/StreamSubscriptionTimeoutTerminationMode$.html)*