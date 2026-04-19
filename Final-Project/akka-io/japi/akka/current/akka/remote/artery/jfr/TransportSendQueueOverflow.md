---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportSendQueueOverflow.html
title: TransportSendQueueOverflow
---

# TransportSendQueueOverflow

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class TransportSendQueueOverflow

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.TransportSendQueueOverflow

- ---

```
public final class TransportSendQueueOverflow
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransportSendQueueOverflow](#%3Cinit%3E(int))​(int queueIndex)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[queueIndex](#queueIndex())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TransportSendQueueOverflow
		
		
		
		```
		public TransportSendQueueOverflow​(int queueIndex)
		```

	- ### Method Detail
	
	
	
		- #### queueIndex
		
		
		
		```
		public int queueIndex()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportSendQueueOverflow.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/TransportSendQueueOverflow.html)*