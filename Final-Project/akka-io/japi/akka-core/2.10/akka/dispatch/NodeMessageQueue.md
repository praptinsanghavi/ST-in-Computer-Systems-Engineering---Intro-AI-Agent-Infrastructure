---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NodeMessageQueue.html
title: NodeMessageQueue
---

# NodeMessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class NodeMessageQueue

- java.lang.Object
- - java.util.concurrent.atomic.AtomicReference\<[AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")\<T\>\>
	- - [akka.dispatch.AbstractNodeQueue](AbstractNodeQueue.html "class in akka.dispatch")\<[Envelope](Envelope.html "class in akka.dispatch")\>
		- - akka.dispatch.NodeMessageQueue

- All Implemented Interfaces:
`[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")`, `java.io.Serializable`

---

```
public class NodeMessageQueue
extends [AbstractNodeQueue](AbstractNodeQueue.html "class in akka.dispatch")<[Envelope](Envelope.html "class in akka.dispatch")>
implements [MessageQueue](MessageQueue.html "interface in akka.dispatch"), [UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.NodeMessageQueue)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.dispatch.[AbstractNodeQueue](AbstractNodeQueue.html "class in akka.dispatch")
		
		
		`[AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NodeMessageQueue](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cleanUp](#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue))​([ActorRef](../actor/ActorRef.html "class in akka.actor") owner,  [MessageQueue](MessageQueue.html "interface in akka.dispatch") deadLetters)` | Called when the mailbox this queue belongs to is disposed of. |
	| `[Envelope](Envelope.html "class in akka.dispatch")` | `[dequeue](#dequeue())()` | Try to dequeue the next message from this queue, return null failing that. |
	| `void` | `[enqueue](#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))​([ActorRef](../actor/ActorRef.html "class in akka.actor") receiver,  [Envelope](Envelope.html "class in akka.dispatch") handle)` | Try to enqueue the message to this queue, or throw an exception. |
	| `boolean` | `[hasMessages](#hasMessages())()` | Indicates whether this queue is non\-empty. |
	| `int` | `[numberOfMessages](#numberOfMessages())()` | Should return the current number of messages held in this queue; may  always return 0 if no other value is available efficiently. |
	
	
		- ### Methods inherited from class akka.dispatch.[AbstractNodeQueue](AbstractNodeQueue.html "class in akka.dispatch")
		
		
		`[add](AbstractNodeQueue.html#add(T)), [addNode](AbstractNodeQueue.html#addNode(akka.dispatch.AbstractNodeQueue.Node)), [count](AbstractNodeQueue.html#count()), [isEmpty](AbstractNodeQueue.html#isEmpty()), [peek](AbstractNodeQueue.html#peek()), [peekNode](AbstractNodeQueue.html#peekNode()), [poll](AbstractNodeQueue.html#poll()), [pollNode](AbstractNodeQueue.html#pollNode())`
		- ### Methods inherited from class java.util.concurrent.atomic.AtomicReference
		
		
		`accumulateAndGet, compareAndExchange, compareAndExchangeAcquire, compareAndExchangeRelease, compareAndSet, get, getAcquire, getAndAccumulate, getAndSet, getAndUpdate, getOpaque, getPlain, lazySet, set, setOpaque, setPlain, setRelease, toString, updateAndGet, weakCompareAndSet, weakCompareAndSetAcquire, weakCompareAndSetPlain, weakCompareAndSetRelease, weakCompareAndSetVolatile`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NodeMessageQueue
		
		
		
		```
		public NodeMessageQueue()
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/AbstractNodeQueue.Node.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/AbstractNodeQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NodeMessageQueue.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/NodeMessageQueue.html)*