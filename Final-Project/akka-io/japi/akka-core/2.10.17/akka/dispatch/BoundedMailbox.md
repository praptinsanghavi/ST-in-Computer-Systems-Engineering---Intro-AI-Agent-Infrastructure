---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:42:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMailbox.MessageQueue.html
title: BoundedMailbox.MessageQueue
---

# BoundedMailbox.MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedMailbox.MessageQueue

- java.lang.Object
- - java.util.AbstractCollection\<E\>
	- - java.util.AbstractQueue\<E\>
		- - java.util.concurrent.LinkedBlockingQueue\<[Envelope](Envelope.html "class in akka.dispatch")\>
			- - akka.dispatch.BoundedMailbox.MessageQueue

- All Implemented Interfaces:
`[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")`, `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `java.io.Serializable`, `java.lang.Iterable<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Collection<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.concurrent.BlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>`

Enclosing class:
[BoundedMailbox](BoundedMailbox.html "class in akka.dispatch")

---

```
public static class BoundedMailbox.MessageQueue
extends java.util.concurrent.LinkedBlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")>
implements [BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.BoundedMailbox.MessageQueue)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageQueue](#%3Cinit%3E(int,scala.concurrent.duration.FiniteDuration))​(int capacity,  scala.concurrent.duration.FiniteDuration pushTimeOut)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[pushTimeOut](#pushTimeOut())()` |  |
	| `java.util.concurrent.BlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from class java.util.concurrent.LinkedBlockingQueue
		
		
		`clear, contains, drainTo, drainTo, forEach, iterator, offer, offer, peek, poll, poll, put, remainingCapacity, remove, removeAll, removeIf, retainAll, size, spliterator, take, toArray, toArray, toString`
		- ### Methods inherited from class java.util.AbstractQueue
		
		
		`add, addAll, element, remove`
		- ### Methods inherited from class java.util.AbstractCollection
		
		
		`containsAll, isEmpty`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface java.util.concurrent.BlockingQueue
		
		
		`add`
		- ### Methods inherited from interface akka.dispatch.[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[dequeue](BoundedQueueBasedMessageQueue.html#dequeue()), [enqueue](BoundedQueueBasedMessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))`
		- ### Methods inherited from interface java.util.Collection
		
		
		`addAll, containsAll, equals, hashCode, isEmpty, parallelStream, stream, toArray`
		- ### Methods inherited from interface java.util.Queue
		
		
		`element, remove`
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue)), [hasMessages](QueueBasedMessageQueue.html#hasMessages()), [numberOfMessages](QueueBasedMessageQueue.html#numberOfMessages())`

- - ### Constructor Detail
	
	
	
		- #### MessageQueue
		
		
		
		```
		public MessageQueue​(int capacity,
		                    scala.concurrent.duration.FiniteDuration pushTimeOut)
		```

	- ### Method Detail
	
	
	
		- #### pushTimeOut
		
		
		
		```
		public final scala.concurrent.duration.FiniteDuration pushTimeOut()
		```
		
		
		Specified by:
		`[pushTimeOut](BoundedMessageQueueSemantics.html#pushTimeOut())` in interface `[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`
		- #### queue
		
		
		
		```
		public final java.util.concurrent.BlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")> queue()
		```
		
		
		Specified by:
		`[queue](BoundedQueueBasedMessageQueue.html#queue())` in interface `[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")`
		Specified by:
		`[queue](QueueBasedMessageQueue.html#queue())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMailbox.MessageQueue.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMailbox.MessageQueue.html)*