---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AllDeadLetters.html
title: AllDeadLetters
---

# AllDeadLetters

## Content

Package [akka.actor](package-summary.html)
## Interface AllDeadLetters

- All Superinterfaces:
`[WrappedMessage](WrappedMessage.html "interface in akka.actor")`

All Known Implementing Classes:
`[DeadLetter](DeadLetter.html "class in akka.actor")`, `[Dropped](Dropped.html "class in akka.actor")`, `[SuppressedDeadLetter](SuppressedDeadLetter.html "class in akka.actor")`, `[UnhandledMessage](UnhandledMessage.html "class in akka.actor")`

---

```
public interface AllDeadLetters
extends [WrappedMessage](WrappedMessage.html "interface in akka.actor")
```

Subscribe to this class to be notified about all [`DeadLetter`](DeadLetter.html "class in akka.actor") (also the suppressed ones)
 and [`Dropped`](Dropped.html "class in akka.actor").
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[message](#message())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[recipient](#recipient())()` |  |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[sender](#sender())()` |  |

- - ### Method Detail
	
	
	
		- #### message
		
		
		
		```
		java.lang.Object message()
		```
		
		
		Specified by:
		`[message](WrappedMessage.html#message())` in interface `[WrappedMessage](WrappedMessage.html "interface in akka.actor")`
		- #### recipient
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") recipient()
		```
		- #### sender
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") sender()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Dropped.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SuppressedDeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/WrappedMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AllDeadLetters.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AllDeadLetters.html)*