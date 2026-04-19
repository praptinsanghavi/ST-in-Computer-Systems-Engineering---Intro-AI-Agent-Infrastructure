---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutSettings$.html
title: StreamSubscriptionTimeoutSettings$
---

# StreamSubscriptionTimeoutSettings$

## Content

Package [akka.stream](package-summary.html)
## Class StreamSubscriptionTimeoutSettings$

- java.lang.Object
- - akka.stream.StreamSubscriptionTimeoutSettings$

- ---

```
public class StreamSubscriptionTimeoutSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamSubscriptionTimeoutSettings$](StreamSubscriptionTimeoutSettings$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamSubscriptionTimeoutSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream")` | `[apply](#apply(akka.stream.StreamSubscriptionTimeoutTerminationMode,scala.concurrent.duration.FiniteDuration))​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,  scala.concurrent.duration.FiniteDuration timeout)` | Create settings from individual values (Scala). |
	| `[StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a Config subsection (Scala). |
	| `[StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream")` | `[create](#create(akka.stream.StreamSubscriptionTimeoutTerminationMode,scala.concurrent.duration.FiniteDuration))​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,  scala.concurrent.duration.FiniteDuration timeout)` | Create settings from individual values (Java). |
	| `[StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a Config subsection (Java). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamSubscriptionTimeoutSettings$](StreamSubscriptionTimeoutSettings$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StreamSubscriptionTimeoutSettings$
		
		
		
		```
		public StreamSubscriptionTimeoutSettings$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") create​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,
		                                                scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Create settings from individual values (Java).
		- #### apply
		
		
		
		```
		public [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") apply​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,
		                                               scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Create settings from individual values (Scala).
		- #### create
		
		
		
		```
		public [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") create​(com.typesafe.config.Config config)
		```
		
		Create settings from a Config subsection (Java).
		- #### apply
		
		
		
		```
		public [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a Config subsection (Scala).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutSettings$.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutTerminationMode.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutSettings$.html](https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutSettings$.html)*