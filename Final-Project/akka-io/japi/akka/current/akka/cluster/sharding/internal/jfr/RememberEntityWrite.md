---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/jfr/RememberEntityWrite.html
title: RememberEntityWrite
---

# RememberEntityWrite

## Content

Package [akka.cluster.sharding.internal.jfr](package-summary.html)
## Class RememberEntityWrite

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.cluster.sharding.internal.jfr.RememberEntityWrite

- ---

```
public final class RememberEntityWrite
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RememberEntityWrite](#%3Cinit%3E(long))​(long timeTaken)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[timeTaken](#timeTaken())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RememberEntityWrite
		
		
		
		```
		public RememberEntityWrite​(long timeTaken)
		```

	- ### Method Detail
	
	
	
		- #### timeTaken
		
		
		
		```
		public long timeTaken()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/jfr/RememberEntityWrite.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/jfr/RememberEntityWrite.html)*