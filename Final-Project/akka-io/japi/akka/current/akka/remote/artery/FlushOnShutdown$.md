---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/FlushOnShutdown$.html
title: FlushOnShutdown$
---

# FlushOnShutdown$

## Content

Package [akka.remote.artery](package-summary.html)
## Class FlushOnShutdown$

- java.lang.Object
- - akka.remote.artery.FlushOnShutdown$

- ---

```
public class FlushOnShutdown$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FlushOnShutdown$](FlushOnShutdown$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlushOnShutdown$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(scala.concurrent.Promise,scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Set))​(scala.concurrent.Promise<[Done](../../Done.html "class in akka")> done,  scala.concurrent.duration.FiniteDuration timeout,  scala.collection.immutable.Set<akka.remote.artery.Association> associations)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FlushOnShutdown$](FlushOnShutdown$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FlushOnShutdown$
		
		
		
		```
		public FlushOnShutdown$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​(scala.concurrent.Promise<[Done](../../Done.html "class in akka")> done,
		                   scala.concurrent.duration.FiniteDuration timeout,
		                   scala.collection.immutable.Set<akka.remote.artery.Association> associations)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/FlushOnShutdown$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/FlushOnShutdown$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/FlushOnShutdown$.html)*