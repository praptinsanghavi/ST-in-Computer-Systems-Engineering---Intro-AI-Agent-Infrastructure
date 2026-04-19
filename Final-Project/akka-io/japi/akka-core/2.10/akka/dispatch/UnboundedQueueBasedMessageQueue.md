---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedQueueBasedMessageQueue.html
title: UnboundedQueueBasedMessageQueue
---

# UnboundedQueueBasedMessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Interface UnboundedQueueBasedMessageQueue

- All Superinterfaces:
`[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[UnboundedMailbox.MessageQueue](UnboundedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedStablePriorityMailbox.MessageQueue](UnboundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface UnboundedQueueBasedMessageQueue
extends [QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch"), [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[dequeue](#dequeue())()` | Try to dequeue the next message from this queue, return null failing that. |
	| `void` | `[enqueue](#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](Envelope.html "class in akka.dispatch") handle)` | Try to enqueue the message to this queue, or throw an exception. |
	
	
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue)), [hasMessages](QueueBasedMessageQueue.html#hasMessages()), [numberOfMessages](QueueBasedMessageQueue.html#numberOfMessages()), [queue](QueueBasedMessageQueue.html#queue())`

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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedQueueBasedMessageQueue.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedQueueBasedMessageQueue.html)*