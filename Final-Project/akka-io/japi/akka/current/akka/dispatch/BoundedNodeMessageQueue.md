---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedNodeMessageQueue.html
title: BoundedNodeMessageQueue
---

# BoundedNodeMessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedNodeMessageQueue

- java.lang.Object
- - [akka.dispatch.AbstractBoundedNodeQueue](AbstractBoundedNodeQueue.html "class in akka.dispatch")\<[Envelope](Envelope.html "class in akka.dispatch")\>
	- - akka.dispatch.BoundedNodeMessageQueue

- All Implemented Interfaces:
`[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`

---

```
public class BoundedNodeMessageQueue
extends [AbstractBoundedNodeQueue](AbstractBoundedNodeQueue.html "class in akka.dispatch")<[Envelope](Envelope.html "class in akka.dispatch")>
implements [MessageQueue](MessageQueue.html "interface in akka.dispatch"), [BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch"), [MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")
```

Lock\-free bounded non\-blocking multiple\-producer single\-consumer queue.
 Discards overflowing messages into DeadLetters.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.dispatch.[AbstractBoundedNodeQueue](AbstractBoundedNodeQueue.html "class in akka.dispatch")
		
		
		`[AbstractBoundedNodeQueue.Node](AbstractBoundedNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractBoundedNodeQueue.Node.html "type parameter in AbstractBoundedNodeQueue.Node")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BoundedNodeMessageQueue](#%3Cinit%3E(int))​(int capacity)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cleanUp](#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))​([ActorRef](../actor/ActorRef.html "class in akka.actor") owner,  [MessageQueue](MessageQueue.html "interface in akka.dispatch") deadLetters)` | Called when the mailbox this queue belongs to is disposed of. |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[dequeue](#dequeue())()` | Try to dequeue the next message from this queue, return null failing that. |
	| `void` | `[enqueue](#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](Envelope.html "class in akka.dispatch") handle)` | Try to enqueue the message to this queue, or throw an exception. |
	| `boolean` | `[hasMessages](#hasMessages())()` | Indicates whether this queue is non\-empty. |
	| `int` | `[numberOfMessages](#numberOfMessages())()` | Should return the current number of messages held in this queue; may  always return 0 if no other value is available efficiently. |
	| `scala.concurrent.duration.Duration` | `[pushTimeOut](#pushTimeOut())()` |  |
	
	
		- ### Methods inherited from class akka.dispatch.[AbstractBoundedNodeQueue](AbstractBoundedNodeQueue.html "class in akka.dispatch")
		
		
		`[add](AbstractBoundedNodeQueue.html#add(T)), [addNode](AbstractBoundedNodeQueue.html#addNode(akka.dispatch.AbstractBoundedNodeQueue.Node)), [capacity](AbstractBoundedNodeQueue.html#capacity()), [isEmpty](AbstractBoundedNodeQueue.html#isEmpty()), [peek](AbstractBoundedNodeQueue.html#peek()), [peekNode](AbstractBoundedNodeQueue.html#peekNode()), [poll](AbstractBoundedNodeQueue.html#poll()), [pollNode](AbstractBoundedNodeQueue.html#pollNode()), [size](AbstractBoundedNodeQueue.html#size())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BoundedNodeMessageQueue
		
		
		
		```
		public BoundedNodeMessageQueue​(int capacity)
		```

	- ### Method Detail
	
	
	
		- #### cleanUp
		
		
		
		```
		public final void cleanUp​([ActorRef](../actor/ActorRef.html "class in akka.actor") owner,
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
		- #### dequeue
		
		
		
		```
		public final [Envelope](Envelope.html "class in akka.dispatch") dequeue()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#dequeue())`
		Try to dequeue the next message from this queue, return null failing that.
		
		Specified by:
		`[dequeue](MessageQueue.html#dequeue())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### enqueue
		
		
		
		```
		public final void enqueue​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,
		                          [Envelope](Envelope.html "class in akka.dispatch") handle)
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))`
		Try to enqueue the message to this queue, or throw an exception.
		
		Specified by:
		`[enqueue](MessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### hasMessages
		
		
		
		```
		public final boolean hasMessages()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#hasMessages())`
		Indicates whether this queue is non\-empty.
		
		Specified by:
		`[hasMessages](MessageQueue.html#hasMessages())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### numberOfMessages
		
		
		
		```
		public final int numberOfMessages()
		```
		
		Description copied from interface: `[MessageQueue](MessageQueue.html#numberOfMessages())`
		Should return the current number of messages held in this queue; may
		 always return 0 if no other value is available efficiently. Do not use
		 this for testing for presence of messages, use `hasMessages` instead.
		
		Specified by:
		`[numberOfMessages](MessageQueue.html#numberOfMessages())` in interface `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`
		- #### pushTimeOut
		
		
		
		```
		public final scala.concurrent.duration.Duration pushTimeOut()
		```
		
		
		Specified by:
		`[pushTimeOut](BoundedMessageQueueSemantics.html#pushTimeOut())` in interface `[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/AbstractBoundedNodeQueue.Node.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/AbstractBoundedNodeQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedNodeMessageQueue.html](https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedNodeMessageQueue.html)*