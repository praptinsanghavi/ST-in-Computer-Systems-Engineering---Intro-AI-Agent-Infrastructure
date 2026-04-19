---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html
title: DeliveryConsumerStarted
---

# DeliveryConsumerStarted

## Content

Package [akka.actor.typed.internal.jfr](package-summary.html)
## Class DeliveryConsumerStarted

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.actor.typed.internal.jfr.DeliveryConsumerStarted

- ---

```
public final class DeliveryConsumerStarted
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeliveryConsumerStarted](#%3Cinit%3E(java.lang.String))​(java.lang.String actorPath)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[actorPath](#actorPath())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeliveryConsumerStarted
		
		
		
		```
		public DeliveryConsumerStarted​(java.lang.String actorPath)
		```

	- ### Method Detail
	
	
	
		- #### actorPath
		
		
		
		```
		public java.lang.String actorPath()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html)*