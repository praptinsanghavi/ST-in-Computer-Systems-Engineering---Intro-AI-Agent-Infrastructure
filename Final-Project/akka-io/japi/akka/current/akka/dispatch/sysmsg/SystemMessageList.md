---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessageList.html
title: SystemMessageList
---

# SystemMessageList

## Content

Package [akka.dispatch.sysmsg](package-summary.html)
## Class SystemMessageList

- java.lang.Object
- - akka.dispatch.sysmsg.SystemMessageList

- ---

```
public class SystemMessageList
extends java.lang.Object
```

INTERNAL API
 
 Helper companion object for `LatestFirstSystemMessageList` and
 `EarliestFirstSystemMessageList`

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SystemMessageList](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.dispatch.sysmsg.EarliestFirstSystemMessageList` | `[ENil](#ENil())()` |  |
	| `static akka.dispatch.sysmsg.LatestFirstSystemMessageList` | `[LNil](#LNil())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SystemMessageList
		
		
		
		```
		public SystemMessageList()
		```

	- ### Method Detail
	
	
	
		- #### LNil
		
		
		
		```
		public static final akka.dispatch.sysmsg.LatestFirstSystemMessageList LNil()
		```
		- #### ENil
		
		
		
		```
		public static final akka.dispatch.sysmsg.EarliestFirstSystemMessageList ENil()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessageList.html](https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessageList.html)*