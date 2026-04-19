---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:28:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamSubscriptionTimeoutSettings.html
title: StreamSubscriptionTimeoutSettings
---

# StreamSubscriptionTimeoutSettings

## Content

Package [akka.stream](package-summary.html)
## Class StreamSubscriptionTimeoutSettings

- java.lang.Object
- - akka.stream.StreamSubscriptionTimeoutSettings

- ---

```
public final class StreamSubscriptionTimeoutSettings
extends java.lang.Object
```

Leaked publishers and subscribers are cleaned up when they are not used within a given
 deadline, configured by [`StreamSubscriptionTimeoutSettings`](StreamSubscriptionTimeoutSettings.html "class in akka.stream").

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamSubscriptionTimeoutSettings](#%3Cinit%3E(akka.stream.StreamSubscriptionTimeoutTerminationMode,scala.concurrent.duration.FiniteDuration))​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,  scala.concurrent.duration.FiniteDuration timeout)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream")` | `[apply](#apply(akka.stream.StreamSubscriptionTimeoutTerminationMode,scala.concurrent.duration.FiniteDuration))​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,  scala.concurrent.duration.FiniteDuration timeout)` | Create settings from individual values (Scala). |
	| `static [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a Config subsection (Scala). |
	| `static [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream")` | `[create](#create(akka.stream.StreamSubscriptionTimeoutTerminationMode,scala.concurrent.duration.FiniteDuration))​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,  scala.concurrent.duration.FiniteDuration timeout)` | Create settings from individual values (Java). |
	| `static [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a Config subsection (Java). |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `[StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream")` | `[mode](#mode())()` | Deprecated. Use attribute 'ActorAttributes.StreamSubscriptionTimeoutMode' to read the concrete setting value. |
	| `scala.concurrent.duration.FiniteDuration` | `[timeout](#timeout())()` | Deprecated. Use attribute 'ActorAttributes.StreamSubscriptionTimeout' to read the concrete setting value. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StreamSubscriptionTimeoutSettings
		
		
		
		```
		public StreamSubscriptionTimeoutSettings​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,
		                                         scala.concurrent.duration.FiniteDuration timeout)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") create​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,
		                                                       scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Create settings from individual values (Java).
		- #### apply
		
		
		
		```
		public static [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") apply​([StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode,
		                                                      scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Create settings from individual values (Scala).
		- #### create
		
		
		
		```
		public static [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") create​(com.typesafe.config.Config config)
		```
		
		Create settings from a Config subsection (Java).
		- #### apply
		
		
		
		```
		public static [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a Config subsection (Scala).
		- #### mode
		
		
		
		```
		public [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") mode()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.StreamSubscriptionTimeoutMode' to read the concrete setting value. Since 2\.6\.0\.
		- #### timeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration timeout()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.StreamSubscriptionTimeout' to read the concrete setting value. Since 2\.6\.0\.
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamSubscriptionTimeoutSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamSubscriptionTimeoutTerminationMode.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamSubscriptionTimeoutSettings.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamSubscriptionTimeoutSettings.html)*