---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerReceivedResend.html
title: DeliveryConsumerReceivedResend
---

# DeliveryConsumerReceivedResend

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryConsumerReceivedResend

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryConsumerReceivedResend

- ---

```
public final class DeliveryConsumerReceivedResend
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryConsumerReceivedResend](#%3Cinit%3E(long))​(long seqNr)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[seqNr](#seqNr())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeliveryConsumerReceivedResend
		
		
		
		```
		public DeliveryConsumerReceivedResend​(long seqNr)
		```

	- ### Method Detail
	
	
	
		- #### seqNr
		
		
		
		```
		public long seqNr()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerReceivedResend.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerReceivedResend.html)*