---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:30:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DequeBasedMessageQueueSemantics.html
title: DequeBasedMessageQueueSemantics
---

# DequeBasedMessageQueueSemantics

## Content

Package [akka.dispatch](package-summary.html)
## Interface DequeBasedMessageQueueSemantics

- All Known Subinterfaces:
`[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[BoundedDequeBasedMessageQueueSemantics](BoundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`, `[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueueSemantics](UnboundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface DequeBasedMessageQueueSemantics
```

DequeBasedMessageQueue refines QueueBasedMessageQueue to be backed by a java.util.Deque.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[enqueueFirst](#enqueueFirst(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](Envelope.html "class in akka.dispatch") handle)` |  |

- - ### Method Detail
	
	
	
		- #### enqueueFirst
		
		
		
		```
		void enqueueFirst​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,
		                  [Envelope](Envelope.html "class in akka.dispatch") handle)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DequeBasedMessageQueueSemantics.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DequeBasedMessageQueueSemantics.html)*