---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedStablePriorityMailbox.html
title: BoundedStablePriorityMailbox
---

# BoundedStablePriorityMailbox

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedStablePriorityMailbox

- java.lang.Object
- - akka.dispatch.BoundedStablePriorityMailbox

- All Implemented Interfaces:
`[MailboxType](MailboxType.html "interface in akka.dispatch")`, `[ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[BoundedStablePriorityMailbox.MessageQueue](BoundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")>`, `[ProducesPushTimeoutSemanticsMailbox](ProducesPushTimeoutSemanticsMailbox.html "interface in akka.dispatch")`

---

```
public class BoundedStablePriorityMailbox
extends java.lang.Object
implements [MailboxType](MailboxType.html "interface in akka.dispatch"), [ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[BoundedStablePriorityMailbox.MessageQueue](BoundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")>, [ProducesPushTimeoutSemanticsMailbox](ProducesPushTimeoutSemanticsMailbox.html "interface in akka.dispatch")
```

BoundedStablePriorityMailbox is a bounded mailbox that allows for prioritization of its contents. Unlike the
 [`BoundedPriorityMailbox`](BoundedPriorityMailbox.html "class in akka.dispatch") it preserves ordering for messages of equal priority.
 Extend this class and provide the Comparator in the constructor.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[BoundedStablePriorityMailbox.MessageQueue](BoundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BoundedStablePriorityMailbox](#%3Cinit%3E(java.util.Comparator,int,scala.concurrent.duration.Duration))​(java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp,  int capacity,  scala.concurrent.duration.Duration pushTimeOut)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[capacity](#capacity())()` |  |
	| `java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")>` | `[cmp](#cmp())()` |  |
	| `[MessageQueue](MessageQueue.html "interface in akka.dispatch")` | `[create](#create(scala.Option,scala.Option))​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,  scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)` |  |
	| `scala.concurrent.duration.Duration` | `[pushTimeOut](#pushTimeOut())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BoundedStablePriorityMailbox
		
		
		
		```
		public BoundedStablePriorityMailbox​(java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp,
		                                    int capacity,
		                                    scala.concurrent.duration.Duration pushTimeOut)
		```

	- ### Method Detail
	
	
	
		- #### cmp
		
		
		
		```
		public final java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp()
		```
		- #### capacity
		
		
		
		```
		public final int capacity()
		```
		- #### pushTimeOut
		
		
		
		```
		public final scala.concurrent.duration.Duration pushTimeOut()
		```
		
		
		Specified by:
		`[pushTimeOut](ProducesPushTimeoutSemanticsMailbox.html#pushTimeOut())` in interface `[ProducesPushTimeoutSemanticsMailbox](ProducesPushTimeoutSemanticsMailbox.html "interface in akka.dispatch")`
		- #### create
		
		
		
		```
		public final [MessageQueue](MessageQueue.html "interface in akka.dispatch") create​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,
		                                 scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)
		```
		
		
		Specified by:
		`[create](MailboxType.html#create(scala.Option,scala.Option))` in interface `[MailboxType](MailboxType.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ProducesMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ProducesPushTimeoutSemanticsMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedStablePriorityMailbox.html](https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedStablePriorityMailbox.html)*