---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/Status$.html
title: Status$
---

# Status$

## Content

Package [akka.actor](package-summary.html)
## Class Status$

- java.lang.Object
- - akka.actor.Status$

- ---

```
public class Status$
extends java.lang.Object
```

Superseeded by [`StatusReply`](../pattern/StatusReply.html "class in akka.pattern"), prefer that when possible.
 
 Classes for passing status back to the sender.
 Used for internal ACKing protocol. But exposed as utility class for user\-specific ACKing protocols as well.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Status$](Status$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Status$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Status$](Status$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Status$
		
		
		
		```
		public Status$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Status$.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/Status$.html](https://doc.akka.io/japi/akka/current/akka/actor/Status$.html)*