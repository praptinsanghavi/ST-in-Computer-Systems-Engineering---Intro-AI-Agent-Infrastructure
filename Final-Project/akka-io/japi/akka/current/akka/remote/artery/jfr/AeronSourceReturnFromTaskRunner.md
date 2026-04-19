---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSourceReturnFromTaskRunner.html
title: AeronSourceReturnFromTaskRunner
---

# AeronSourceReturnFromTaskRunner

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class AeronSourceReturnFromTaskRunner

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.AeronSourceReturnFromTaskRunner

- ---

```
public final class AeronSourceReturnFromTaskRunner
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AeronSourceReturnFromTaskRunner](#%3Cinit%3E(long))​(long nanosSinceTaskStartTime)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[nanosSinceTaskStartTime](#nanosSinceTaskStartTime())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AeronSourceReturnFromTaskRunner
		
		
		
		```
		public AeronSourceReturnFromTaskRunner​(long nanosSinceTaskStartTime)
		```

	- ### Method Detail
	
	
	
		- #### nanosSinceTaskStartTime
		
		
		
		```
		public long nanosSinceTaskStartTime()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSourceReturnFromTaskRunner.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSourceReturnFromTaskRunner.html)*