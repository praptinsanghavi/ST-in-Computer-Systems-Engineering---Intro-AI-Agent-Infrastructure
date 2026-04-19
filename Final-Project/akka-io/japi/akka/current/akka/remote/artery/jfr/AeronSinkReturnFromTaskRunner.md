---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSinkReturnFromTaskRunner.html
title: AeronSinkReturnFromTaskRunner
---

# AeronSinkReturnFromTaskRunner

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class AeronSinkReturnFromTaskRunner

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.AeronSinkReturnFromTaskRunner

- ---

```
public final class AeronSinkReturnFromTaskRunner
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AeronSinkReturnFromTaskRunner](#%3Cinit%3E(long))​(long nanosSinceTaskStartTime)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[nanosSinceTaskStartTime](#nanosSinceTaskStartTime())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AeronSinkReturnFromTaskRunner
		
		
		
		```
		public AeronSinkReturnFromTaskRunner​(long nanosSinceTaskStartTime)
		```

	- ### Method Detail
	
	
	
		- #### nanosSinceTaskStartTime
		
		
		
		```
		public long nanosSinceTaskStartTime()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSinkReturnFromTaskRunner.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSinkReturnFromTaskRunner.html)*