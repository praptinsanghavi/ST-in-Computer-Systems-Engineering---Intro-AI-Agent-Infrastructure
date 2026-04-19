---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/ControlAwareMessageQueueSemantics.html
title: ControlAwareMessageQueueSemantics
---

# ControlAwareMessageQueueSemantics

## Content

Package [akka.dispatch](package-summary.html)
## Interface ControlAwareMessageQueueSemantics

- All Superinterfaces:
`[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

All Known Subinterfaces:
`[BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedControlAwareMessageQueueSemantics](UnboundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`

All Known Implementing Classes:
`[BoundedControlAwareMailbox.MessageQueue](BoundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`, `[UnboundedControlAwareMailbox.MessageQueue](UnboundedControlAwareMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface ControlAwareMessageQueueSemantics
extends [QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
```

ControlAwareMessageQueue handles messages that extend [`ControlMessage`](ControlMessage.html "interface in akka.dispatch") with priority.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[controlQueue](#controlQueue())()` |  |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[dequeue](#dequeue())()` | Try to dequeue the next message from this queue, return null failing that. |
	| `void` | `[enqueue](#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](Envelope.html "class in akka.dispatch") handle)` | Try to enqueue the message to this queue, or throw an exception. |
	| `boolean` | `[hasMessages](#hasMessages())()` | Indicates whether this queue is non\-empty. |
	| `int` | `[numberOfMessages](#numberOfMessages())()` | Should return the current number of messages held in this queue; may  always return 0 if no other value is available efficiently. |
	| `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))`

- - ### Method Detail
	
	
	
		- #### controlQueue
		
		
		
		```
		java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")> controlQueue()
		```
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
		- #### hasMessages
		
		
		
		```
		boolean hasMessages()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#hasMessages())`
		Indicates whether this queue is non\-empty.
		
		Specified by:
		`[hasMessages](MessageQueue.html#hasMessages())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		Specified by:
		`[hasMessages](QueueBasedMessageQueue.html#hasMessages())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`
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
		Specified by:
		`[numberOfMessages](QueueBasedMessageQueue.html#numberOfMessages())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`
		- #### queue
		
		
		
		```
		java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")> queue()
		```
		
		
		Specified by:
		`[queue](QueueBasedMessageQueue.html#queue())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/ControlMessage.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/UnboundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/ControlAwareMessageQueueSemantics.html](https://doc.akka.io/japi/akka/current/akka/dispatch/ControlAwareMessageQueueSemantics.html)*