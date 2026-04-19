---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/QueueBasedMessageQueue.html
title: QueueBasedMessageQueue
---

# QueueBasedMessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Interface QueueBasedMessageQueue

- All Superinterfaces:
`[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`

All Known Subinterfaces:
`[BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")`, `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedMailbox.MessageQueue](BoundedMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedPriorityMailbox.MessageQueue](BoundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedStablePriorityMailbox.MessageQueue](BoundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedMailbox.MessageQueue](UnboundedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedStablePriorityMailbox.MessageQueue](UnboundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface QueueBasedMessageQueue
extends [MessageQueue](MessageQueue.html "interface in akka.dispatch"), [MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")
```

A QueueBasedMessageQueue is a MessageQueue backed by a java.util.Queue.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cleanUp](#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))​([ActorRef](../actor/ActorRef.html "class in akka.actor") owner,  [MessageQueue](MessageQueue.html "interface in akka.dispatch") deadLetters)` | Called when the mailbox this queue belongs to is disposed of. |
	| `boolean` | `[hasMessages](#hasMessages())()` | Indicates whether this queue is non\-empty. |
	| `int` | `[numberOfMessages](#numberOfMessages())()` | Should return the current number of messages held in this queue; may  always return 0 if no other value is available efficiently. |
	| `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from interface akka.dispatch.[MessageQueue](MessageQueue.html "interface in akka.dispatch")
		
		
		`[dequeue](MessageQueue.html#dequeue()), [enqueue](MessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))`

- - ### Method Detail
	
	
	
		- #### cleanUp
		
		
		
		```
		void cleanUp​([ActorRef](../actor/ActorRef.html "class in akka.actor") owner,
		             [MessageQueue](MessageQueue.html "interface in akka.dispatch") deadLetters)
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))`
		Called when the mailbox this queue belongs to is disposed of. Normally it
		 is expected to transfer all remaining messages into the dead letter queue
		 which is passed in. The owner of this MessageQueue is passed in if
		 available (e.g. for creating DeadLetters()), \&ldquo;/deadletters\&rdquo; otherwise.
		 
		 Note that we implement the method in a recursive manner mainly for
		 atomicity (not touching the queue twice).
		
		
		
		Specified by:
		`[cleanUp](MessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### hasMessages
		
		
		
		```
		boolean hasMessages()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#hasMessages())`
		Indicates whether this queue is non\-empty.
		
		Specified by:
		`[hasMessages](MessageQueue.html#hasMessages())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### numberOfMessages
		
		
		
		```
		int numberOfMessages()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#numberOfMessages())`
		Should return the current number of messages held in this queue; may
		 always return 0 if no other value is available efficiently. Do not use
		 this for testing for presence of messages, use `hasMessages` instead.
		
		Specified by:
		`[numberOfMessages](MessageQueue.html#numberOfMessages())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### queue
		
		
		
		```
		java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")> queue()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/QueueBasedMessageQueue.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/QueueBasedMessageQueue.html)*