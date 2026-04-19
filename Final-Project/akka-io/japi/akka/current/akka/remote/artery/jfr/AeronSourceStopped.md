---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSourceStopped.html
title: AeronSourceStopped
---

# AeronSourceStopped

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class AeronSourceStopped

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.AeronSourceStopped

- ---

```
public final class AeronSourceStopped
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AeronSourceStopped](#%3Cinit%3E(java.lang.String,int))​(java.lang.String channel,  int streamId)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[channel](#channel())()` |  |
	| `int` | `[streamId](#streamId())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AeronSourceStopped
		
		
		
		```
		public AeronSourceStopped​(java.lang.String channel,
		                          int streamId)
		```

	- ### Method Detail
	
	
	
		- #### channel
		
		
		
		```
		public java.lang.String channel()
		```
		- #### streamId
		
		
		
		```
		public int streamId()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSourceStopped.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSourceStopped.html)*