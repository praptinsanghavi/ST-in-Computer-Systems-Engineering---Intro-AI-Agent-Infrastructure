---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSinkDelegateToTaskRunner.html
title: AeronSinkDelegateToTaskRunner
---

# AeronSinkDelegateToTaskRunner

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class AeronSinkDelegateToTaskRunner

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.AeronSinkDelegateToTaskRunner

- ---

```
public final class AeronSinkDelegateToTaskRunner
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AeronSinkDelegateToTaskRunner](#%3Cinit%3E(long))​(long countBeforeDelegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[countBeforeDelegate](#countBeforeDelegate())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AeronSinkDelegateToTaskRunner
		
		
		
		```
		public AeronSinkDelegateToTaskRunner​(long countBeforeDelegate)
		```

	- ### Method Detail
	
	
	
		- #### countBeforeDelegate
		
		
		
		```
		public long countBeforeDelegate()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSinkDelegateToTaskRunner.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSinkDelegateToTaskRunner.html)*