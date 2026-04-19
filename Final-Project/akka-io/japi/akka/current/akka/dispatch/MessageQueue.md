---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
title: MessageQueue
---

# MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Interface MessageQueue

- All Known Subinterfaces:
`[BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")`, `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedMailbox.MessageQueue](BoundedMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedNodeMessageQueue](BoundedNodeMessageQueue.html "class in akka.dispatch")`, `[BoundedPriorityMailbox.MessageQueue](BoundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedStablePriorityMailbox.MessageQueue](BoundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[NodeMessageQueue](NodeMessageQueue.html "class in akka.dispatch")`, `[UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedMailbox.MessageQueue](UnboundedMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedPriorityMailbox.MessageQueue](UnboundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedStablePriorityMailbox.MessageQueue](UnboundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface MessageQueue
```

A MessageQueue is one of the core components in forming an Akka Mailbox.
 The MessageQueue is where the normal messages that are sent to Actors will be enqueued (and subsequently dequeued)
 It needs to at least support N producers and 1 consumer thread\-safely.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cleanUp](#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))​([ActorRef](../actor/ActorRef.html "class in akka.actor") owner,  [MessageQueue](MessageQueue.html "interface in akka.dispatch") deadLetters)` | Called when the mailbox this queue belongs to is disposed of. |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[dequeue](#dequeue())()` | Try to dequeue the next message from this queue, return null failing that. |
	| `void` | `[enqueue](#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](Envelope.html "class in akka.dispatch") handle)` | Try to enqueue the message to this queue, or throw an exception. |
	| `boolean` | `[hasMessages](#hasMessages())()` | Indicates whether this queue is non\-empty. |
	| `int` | `[numberOfMessages](#numberOfMessages())()` | Should return the current number of messages held in this queue; may  always return 0 if no other value is available efficiently. |

- - ### Method Detail
	
	
	
		- #### cleanUp
		
		
		
		```
		void cleanUp​([ActorRef](../actor/ActorRef.html "class in akka.actor") owner,
		             [MessageQueue](MessageQueue.html "interface in akka.dispatch") deadLetters)
		```
		
		Called when the mailbox this queue belongs to is disposed of. Normally it
		 is expected to transfer all remaining messages into the dead letter queue
		 which is passed in. The owner of this MessageQueue is passed in if
		 available (e.g. for creating DeadLetters()), \&ldquo;/deadletters\&rdquo; otherwise.
		 
		 Note that we implement the method in a recursive manner mainly for
		 atomicity (not touching the queue twice).
		- #### dequeue
		
		
		
		```
		[Envelope](Envelope.html "class in akka.dispatch") dequeue()
		```
		
		Try to dequeue the next message from this queue, return null failing that.
		- #### enqueue
		
		
		
		```
		void enqueue​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,
		             [Envelope](Envelope.html "class in akka.dispatch") handle)
		```
		
		Try to enqueue the message to this queue, or throw an exception.
		- #### hasMessages
		
		
		
		```
		boolean hasMessages()
		```
		
		Indicates whether this queue is non\-empty.
		- #### numberOfMessages
		
		
		
		```
		int numberOfMessages()
		```
		
		Should return the current number of messages held in this queue; may
		 always return 0 if no other value is available efficiently. Do not use
		 this for testing for presence of messages, use `hasMessages` instead.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedNodeMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/NodeMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html](https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html)*