---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/Status.html
title: Status
---

# Status

## Content

Package [akka.actor](package-summary.html)
## Class Status

- java.lang.Object
- - akka.actor.Status

- ---

```
public class Status
extends java.lang.Object
```

Superseeded by [`StatusReply`](../pattern/StatusReply.html "class in akka.pattern"), prefer that when possible.
 
 Classes for passing status back to the sender.
 Used for internal ACKing protocol. But exposed as utility class for user\-specific ACKing protocols as well.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Status.Failure](Status.Failure.html "class in akka.actor")` | This class/message type is preferably used to indicate failure of some operation performed. |
	| `static class` | `[Status.Failure$](Status.Failure$.html "class in akka.actor")` |  |
	| `static class` | `[Status.Success](Status.Success.html "class in akka.actor")` | This class/message type is preferably used to indicate success of some operation performed. |
	| `static class` | `[Status.Success$](Status.Success$.html "class in akka.actor")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Status](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Status
		
		
		
		```
		public Status()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Failure$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Success$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Success.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/Status.html](https://doc.akka.io/japi/akka/2.10/akka/actor/Status.html)*