---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SystemMessage.html
title: SystemMessage
---

# SystemMessage

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Interface SystemMessage

- All Superinterfaces:
`java.io.Serializable`

All Known Implementing Classes:
`[NoMessage$](NoMessage$.html "class in akka.actor.typed.internal")`

---

```
public interface SystemMessage
extends java.io.Serializable
```

System messages are handled specially: they form their own queue within
 each actor\&rsquo;s mailbox. This queue is encoded in the messages themselves to
 avoid extra allocations and overhead. The next pointer is a normal var, and
 it does not need to be volatile because in the enqueuing method its update
 is immediately succeeded by a volatile write and all reads happen after the
 volatile read in the dequeuing thread. Afterwards, the obtained list of
 system messages is handled in a single thread only and not ever passed around,
 hence no further synchronization is needed.
 
 INTERNAL API
 

**NEVER SEND THE SAME SYSTEM MESSAGE OBJECT TO TWO ACTORS**

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal")` | `[next](#next())()` |  |
	| `void` | `[next_$eq](#next_$eq(akka.actor.typed.internal.SystemMessage))​([SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") x$1)` |  |
	| `void` | `[unlink](#unlink())()` |  |
	| `boolean` | `[unlinked](#unlinked())()` |  |

- - ### Method Detail
	
	
	
		- #### next
		
		
		
		```
		[SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") next()
		```
		- #### next\_$eq
		
		
		
		```
		void next_$eq​([SystemMessage](SystemMessage.html "interface in akka.actor.typed.internal") x$1)
		```
		- #### unlink
		
		
		
		```
		void unlink()
		```
		- #### unlinked
		
		
		
		```
		boolean unlinked()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/NoMessage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SystemMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SystemMessage.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SystemMessage.html)*