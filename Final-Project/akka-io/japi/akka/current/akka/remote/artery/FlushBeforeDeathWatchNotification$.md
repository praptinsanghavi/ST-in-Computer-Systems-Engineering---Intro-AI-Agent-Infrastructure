---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/FlushBeforeDeathWatchNotification$.html
title: FlushBeforeDeathWatchNotification$
---

# FlushBeforeDeathWatchNotification$

## Content

Package [akka.remote.artery](package-summary.html)
## Class FlushBeforeDeathWatchNotification$

- java.lang.Object
- - akka.remote.artery.FlushBeforeDeathWatchNotification$

- ---

```
public class FlushBeforeDeathWatchNotification$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FlushBeforeDeathWatchNotification$](FlushBeforeDeathWatchNotification$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlushBeforeDeathWatchNotification$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[nextName](#nextName())()` |  |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(scala.concurrent.Promise,scala.concurrent.duration.FiniteDuration,akka.remote.artery.Association))​(scala.concurrent.Promise<[Done](../../Done.html "class in akka")> done,  scala.concurrent.duration.FiniteDuration timeout,  akka.remote.artery.Association association)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FlushBeforeDeathWatchNotification$](FlushBeforeDeathWatchNotification$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FlushBeforeDeathWatchNotification$
		
		
		
		```
		public FlushBeforeDeathWatchNotification$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​(scala.concurrent.Promise<[Done](../../Done.html "class in akka")> done,
		                   scala.concurrent.duration.FiniteDuration timeout,
		                   akka.remote.artery.Association association)
		```
		- #### nextName
		
		
		
		```
		public java.lang.String nextName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/FlushBeforeDeathWatchNotification$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/FlushBeforeDeathWatchNotification$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/FlushBeforeDeathWatchNotification$.html)*