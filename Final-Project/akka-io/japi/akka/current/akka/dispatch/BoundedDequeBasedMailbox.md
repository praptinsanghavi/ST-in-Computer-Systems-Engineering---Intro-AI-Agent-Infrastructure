---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html
title: BoundedDequeBasedMailbox.MessageQueue
---

# BoundedDequeBasedMailbox.MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedDequeBasedMailbox.MessageQueue

- java.lang.Object
- - java.util.AbstractCollection\<E\>
	- - java.util.AbstractQueue\<E\>
		- - java.util.concurrent.LinkedBlockingDeque\<[Envelope](Envelope.html "class in akka.dispatch")\>
			- - akka.dispatch.BoundedDequeBasedMailbox.MessageQueue

- All Implemented Interfaces:
`[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[BoundedDequeBasedMessageQueueSemantics](BoundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`, `[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")`, `[DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`, `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `java.io.Serializable`, `java.lang.Iterable<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Collection<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.concurrent.BlockingDeque<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.concurrent.BlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Deque<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>`

Enclosing class:
[BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "class in akka.dispatch")

---

```
public static class BoundedDequeBasedMailbox.MessageQueue
extends java.util.concurrent.LinkedBlockingDeque<[Envelope](Envelope.html "class in akka.dispatch")>
implements [BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.BoundedDequeBasedMailbox.MessageQueue)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageQueue](#%3Cinit%3E(int,scala.concurrent.duration.FiniteDuration))​(int capacity,  scala.concurrent.duration.FiniteDuration pushTimeOut)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[pushTimeOut](#pushTimeOut())()` |  |
	| `[BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from class java.util.concurrent.LinkedBlockingDeque
		
		
		`add, addAll, addFirst, addLast, clear, contains, descendingIterator, drainTo, drainTo, element, forEach, getFirst, getLast, iterator, offer, offer, offerFirst, offerFirst, offerLast, offerLast, peek, peekFirst, peekLast, poll, poll, pollFirst, pollFirst, pollLast, pollLast, pop, push, put, putFirst, putLast, remainingCapacity, remove, remove, removeAll, removeFirst, removeFirstOccurrence, removeIf, removeLast, removeLastOccurrence, retainAll, size, spliterator, take, takeFirst, takeLast, toArray, toArray, toString`
		- ### Methods inherited from class java.util.AbstractCollection
		
		
		`containsAll, isEmpty`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.dispatch.[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[dequeue](BoundedDequeBasedMessageQueue.html#dequeue()), [enqueue](BoundedDequeBasedMessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope)), [enqueueFirst](BoundedDequeBasedMessageQueue.html#enqueueFirst(akka.actor.ActorRef,akka.dispatch.Envelope))`
		- ### Methods inherited from interface java.util.Collection
		
		
		`containsAll, equals, hashCode, isEmpty, parallelStream, stream, toArray`
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
		public scala.concurrent.duration.FiniteDuration pushTimeOut()
		```
		
		
		Specified by:
		`[pushTimeOut](BoundedDequeBasedMessageQueue.html#pushTimeOut())` in interface `[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")`
		Specified by:
		`[pushTimeOut](BoundedMessageQueueSemantics.html#pushTimeOut())` in interface `[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`
		- #### queue
		
		
		
		```
		public final [BoundedDequeBasedMailbox.MessageQueue](BoundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch") queue()
		```
		
		
		Specified by:
		`[queue](BoundedDequeBasedMessageQueue.html#queue())` in interface `[BoundedDequeBasedMessageQueue](BoundedDequeBasedMessageQueue.html "interface in akka.dispatch")`
		Specified by:
		`[queue](DequeBasedMessageQueue.html#queue())` in interface `[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")`
		Specified by:
		`[queue](QueueBasedMessageQueue.html#queue())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html](https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedDequeBasedMailbox.MessageQueue.html)*