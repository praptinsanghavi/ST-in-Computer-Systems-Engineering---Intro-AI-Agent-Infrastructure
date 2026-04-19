---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:33:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ProducerController.Settings.html
title: ProducerController.Settings
---

# ProducerController.Settings

## Content

Package [akka.actor.typed.delivery](package-summary.html)
## Class ProducerController.Settings

- java.lang.Object
- - akka.actor.typed.delivery.ProducerController.Settings

- Enclosing class:
[ProducerController](ProducerController.html "class in akka.actor.typed.delivery")

---

```
public static final class ProducerController.Settings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[chunkLargeMessagesBytes](#chunkLargeMessagesBytes())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[durableQueueRequestTimeout](#durableQueueRequestTimeout())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[durableQueueResendFirstInterval](#durableQueueResendFirstInterval())()` |  |
	| `int` | `[durableQueueRetryAttempts](#durableQueueRetryAttempts())()` |  |
	| `java.time.Duration` | `[getDurableQueueRequestTimeout](#getDurableQueueRequestTimeout())()` | Java API |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[withChunkLargeMessagesBytes](#withChunkLargeMessagesBytes(int))​(int newChunkLargeMessagesBytes)` |  |
	| `[ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[withDurableQueueRequestTimeout](#withDurableQueueRequestTimeout(java.time.Duration))​(java.time.Duration newDurableQueueRequestTimeout)` | Java API |
	| `[ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[withDurableQueueRequestTimeout](#withDurableQueueRequestTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration newDurableQueueRequestTimeout)` | Scala API |
	| `[ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[withDurableQueueResendFirstInterval](#withDurableQueueResendFirstInterval(java.time.Duration))​(java.time.Duration newDurableQueueResendFirstInterval)` | Java API |
	| `[ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[withDurableQueueResendFirstInterval](#withDurableQueueResendFirstInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration newDurableQueueResendFirstInterval)` | Scala API |
	| `[ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery")` | `[withDurableQueueRetryAttempts](#withDurableQueueRetryAttempts(int))​(int newDurableQueueRetryAttempts)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Settings
		
		
		
		```
		public Settings()
		```

	- ### Method Detail
	
	
	
		- #### durableQueueRequestTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration durableQueueRequestTimeout()
		```
		- #### durableQueueRetryAttempts
		
		
		
		```
		public int durableQueueRetryAttempts()
		```
		- #### durableQueueResendFirstInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration durableQueueResendFirstInterval()
		```
		- #### chunkLargeMessagesBytes
		
		
		
		```
		public int chunkLargeMessagesBytes()
		```
		- #### withDurableQueueRetryAttempts
		
		
		
		```
		public [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") withDurableQueueRetryAttempts​(int newDurableQueueRetryAttempts)
		```
		- #### withDurableQueueRequestTimeout
		
		
		
		```
		public [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") withDurableQueueRequestTimeout​(scala.concurrent.duration.FiniteDuration newDurableQueueRequestTimeout)
		```
		
		Scala API
		- #### withDurableQueueResendFirstInterval
		
		
		
		```
		public [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") withDurableQueueResendFirstInterval​(scala.concurrent.duration.FiniteDuration newDurableQueueResendFirstInterval)
		```
		
		Scala API
		- #### withDurableQueueRequestTimeout
		
		
		
		```
		public [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") withDurableQueueRequestTimeout​(java.time.Duration newDurableQueueRequestTimeout)
		```
		
		Java API
		- #### withDurableQueueResendFirstInterval
		
		
		
		```
		public [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") withDurableQueueResendFirstInterval​(java.time.Duration newDurableQueueResendFirstInterval)
		```
		
		Java API
		- #### getDurableQueueRequestTimeout
		
		
		
		```
		public java.time.Duration getDurableQueueRequestTimeout()
		```
		
		Java API
		- #### withChunkLargeMessagesBytes
		
		
		
		```
		public [ProducerController.Settings](ProducerController.Settings.html "class in akka.actor.typed.delivery") withChunkLargeMessagesBytes​(int newChunkLargeMessagesBytes)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ProducerController.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ProducerController.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ProducerController.Settings.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/delivery/ProducerController.Settings.html)*