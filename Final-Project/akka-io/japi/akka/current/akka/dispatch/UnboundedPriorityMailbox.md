---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedPriorityMailbox.html
title: UnboundedPriorityMailbox
---

# UnboundedPriorityMailbox

## Content

Package [akka.dispatch](package-summary.html)
## Class UnboundedPriorityMailbox

- java.lang.Object
- - akka.dispatch.UnboundedPriorityMailbox

- All Implemented Interfaces:
`[MailboxType](MailboxType.html "interface in akka.dispatch")`, `[ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")>`

---

```
public class UnboundedPriorityMailbox
extends java.lang.Object
implements [MailboxType](MailboxType.html "interface in akka.dispatch"), [ProducesMessageQueue](ProducesMessageQueue.html "interface in akka.dispatch")<[UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")>
```

UnboundedPriorityMailbox is an unbounded mailbox that allows for prioritization of its contents.
 Extend this class and provide the Comparator in the constructor.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnboundedPriorityMailbox](#%3Cinit%3E(java.util.Comparator))​(java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp)` |  |
	| `[UnboundedPriorityMailbox](#%3Cinit%3E(java.util.Comparator,int))​(java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp,  int initialCapacity)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")>` | `[cmp](#cmp())()` |  |
	| `[MessageQueue](MessageQueue.html "interface in akka.dispatch")` | `[create](#create(scala.Option,scala.Option))​(scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> owner,  scala.Option<[ActorSystem](../actor/ActorSystem.html "class in akka.actor")> system)` |  |
	| `int` | `[initialCapacity](#initialCapacity())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UnboundedPriorityMailbox
		
		
		
		```
		public UnboundedPriorityMailbox​(java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp,
		                                int initialCapacity)
		```
		- #### UnboundedPriorityMailbox
		
		
		
		```
		public UnboundedPriorityMailbox​(java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp)
		```

	- ### Method Detail
	
	
	
		- #### cmp
		
		
		
		```
		public java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp()
		```
		- #### initialCapacity
		
		
		
		```
		public int initialCapacity()
		```
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
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MailboxType.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ProducesMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedPriorityMailbox.html](https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedPriorityMailbox.html)*