---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:42:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html
title: BoundedControlAwareMailbox.MessageQueue
---

# BoundedControlAwareMailbox.MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedControlAwareMailbox.MessageQueue

- java.lang.Object
- - akka.dispatch.BoundedControlAwareMailbox.MessageQueue

- All Implemented Interfaces:
`[BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`, `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `java.io.Serializable`

Enclosing class:
[BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch")

---

```
public static class BoundedControlAwareMailbox.MessageQueue
extends java.lang.Object
implements [BoundedControlAwareMessageQueueSemantics](BoundedControlAwareMessageQueueSemantics.html "interface in akka.dispatch"), java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.BoundedControlAwareMailbox.MessageQueue)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageQueue](#%3Cinit%3E(int,scala.concurrent.duration.FiniteDuration))​(int capacity,  scala.concurrent.duration.FiniteDuration pushTimeOut)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[capacity](#capacity())()` |  |
	| `java.util.concurrent.ConcurrentLinkedQueue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[controlQueue](#controlQueue())()` |  |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[dequeue](#dequeue())()` | Try to dequeue the next message from this queue, return null failing that. |
	| `void` | `[enqueue](#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](Envelope.html "class in akka.dispatch") handle)` | Try to enqueue the message to this queue, or throw an exception. |
	| `boolean` | `[hasMessages](#hasMessages())()` | Indicates whether this queue is non\-empty. |
	| `int` | `[numberOfMessages](#numberOfMessages())()` | Should return the current number of messages held in this queue; may  always return 0 if no other value is available efficiently. |
	| `scala.concurrent.duration.FiniteDuration` | `[pushTimeOut](#pushTimeOut())()` |  |
	| `java.util.concurrent.ConcurrentLinkedQueue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))`

- - ### Constructor Detail
	
	
	
		- #### MessageQueue
		
		
		
		```
		public MessageQueue​(int capacity,
		                    scala.concurrent.duration.FiniteDuration pushTimeOut)
		```

	- ### Method Detail
	
	
	
		- #### capacity
		
		
		
		```
		public int capacity()
		```
		- #### controlQueue
		
		
		
		```
		public java.util.concurrent.ConcurrentLinkedQueue<[Envelope](Envelope.html "class in akka.dispatch")> controlQueue()
		```
		
		
		Specified by:
		`[controlQueue](ControlAwareMessageQueueSemantics.html#controlQueue())` in interface `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`
		- #### dequeue
		
		
		
		```
		public final [Envelope](Envelope.html "class in akka.dispatch") dequeue()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#dequeue())`
		Try to dequeue the next message from this queue, return null failing that.
		
		Specified by:
		`[dequeue](ControlAwareMessageQueueSemantics.html#dequeue())` in interface `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`
		Specified by:
		`[dequeue](MessageQueue.html#dequeue())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### enqueue
		
		
		
		```
		public void enqueue​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,
		                    [Envelope](Envelope.html "class in akka.dispatch") handle)
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))`
		Try to enqueue the message to this queue, or throw an exception.
		
		Specified by:
		`[enqueue](ControlAwareMessageQueueSemantics.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))` in interface `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`
		Specified by:
		`[enqueue](MessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### hasMessages
		
		
		
		```
		public boolean hasMessages()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#hasMessages())`
		Indicates whether this queue is non\-empty.
		
		Specified by:
		`[hasMessages](ControlAwareMessageQueueSemantics.html#hasMessages())` in interface `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`
		Specified by:
		`[hasMessages](MessageQueue.html#hasMessages())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		Specified by:
		`[hasMessages](QueueBasedMessageQueue.html#hasMessages())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`
		- #### numberOfMessages
		
		
		
		```
		public int numberOfMessages()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#numberOfMessages())`
		Should return the current number of messages held in this queue; may
		 always return 0 if no other value is available efficiently. Do not use
		 this for testing for presence of messages, use `hasMessages` instead.
		
		Specified by:
		`[numberOfMessages](ControlAwareMessageQueueSemantics.html#numberOfMessages())` in interface `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`
		Specified by:
		`[numberOfMessages](MessageQueue.html#numberOfMessages())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		Specified by:
		`[numberOfMessages](QueueBasedMessageQueue.html#numberOfMessages())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`
		- #### pushTimeOut
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration pushTimeOut()
		```
		
		
		Specified by:
		`[pushTimeOut](BoundedMessageQueueSemantics.html#pushTimeOut())` in interface `[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`
		- #### queue
		
		
		
		```
		public java.util.concurrent.ConcurrentLinkedQueue<[Envelope](Envelope.html "class in akka.dispatch")> queue()
		```
		
		
		Specified by:
		`[queue](ControlAwareMessageQueueSemantics.html#queue())` in interface `[ControlAwareMessageQueueSemantics](ControlAwareMessageQueueSemantics.html "interface in akka.dispatch")`
		Specified by:
		`[queue](QueueBasedMessageQueue.html#queue())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ControlAwareMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedControlAwareMailbox.MessageQueue.html)*