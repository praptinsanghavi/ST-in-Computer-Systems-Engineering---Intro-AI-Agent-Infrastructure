---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:50:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMessageQueue.html
title: UnboundedDequeBasedMessageQueue
---

# UnboundedDequeBasedMessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Interface UnboundedDequeBasedMessageQueue

- All Superinterfaces:
`[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")`, `[DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`, `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueueSemantics](UnboundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface UnboundedDequeBasedMessageQueue
extends [DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch"), [UnboundedDequeBasedMessageQueueSemantics](UnboundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")
```

UnboundedDequeBasedMessageQueueSemantics adds unbounded semantics to a DequeBasedMessageQueue,
 i.e. a non\-blocking enqueue and dequeue.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[dequeue](#dequeue())()` | Try to dequeue the next message from this queue, return null failing that. |
	| `void` | `[enqueue](#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](Envelope.html "class in akka.dispatch") handle)` | Try to enqueue the message to this queue, or throw an exception. |
	| `void` | `[enqueueFirst](#enqueueFirst(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](Envelope.html "class in akka.dispatch") handle)` |  |
	
	
		- ### Methods inherited from interface akka.dispatch.[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[queue](DequeBasedMessageQueue.html#queue())`
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue)), [hasMessages](QueueBasedMessageQueue.html#hasMessages()), [numberOfMessages](QueueBasedMessageQueue.html#numberOfMessages())`

- - ### Method Detail
	
	
	
		- #### dequeue
		
		
		
		```
		[Envelope](Envelope.html "class in akka.dispatch") dequeue()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#dequeue())`
		Try to dequeue the next message from this queue, return null failing that.
		
		Specified by:
		`[dequeue](MessageQueue.html#dequeue())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### enqueue
		
		
		
		```
		void enqueue​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,
		             [Envelope](Envelope.html "class in akka.dispatch") handle)
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))`
		Try to enqueue the message to this queue, or throw an exception.
		
		Specified by:
		`[enqueue](MessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### enqueueFirst
		
		
		
		```
		void enqueueFirst​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,
		                  [Envelope](Envelope.html "class in akka.dispatch") handle)
		```
		
		
		Specified by:
		`[enqueueFirst](DequeBasedMessageQueueSemantics.html#enqueueFirst(akka.actor.ActorRef,akka.dispatch.Envelope))` in interface `[DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMessageQueue.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMessageQueue.html)*