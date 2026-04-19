---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState$.html
title: SlotState$
---

# SlotState$

## Content

Package [akka.http.impl.engine.client.pool](package-summary.html)
## Class SlotState$

- java.lang.Object
- - akka.http.impl.engine.client.pool.SlotState$

- ---

```
public class SlotState$
extends java.lang.Object
```

Internal API
 
 Implementation of slot logic that is completed decoupled from the machinery bits which are implemented in the GraphStageLogic
 and exposed only through [`SlotContext`](SlotContext.html "class in akka.http.impl.engine.client.pool").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SlotState$](SlotState$.html "class in akka.http.impl.engine.client.pool")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SlotState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SlotState$](SlotState$.html "class in akka.http.impl.engine.client.pool") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SlotState$
		
		
		
		```
		public SlotState$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/pool/SlotState$.html)*