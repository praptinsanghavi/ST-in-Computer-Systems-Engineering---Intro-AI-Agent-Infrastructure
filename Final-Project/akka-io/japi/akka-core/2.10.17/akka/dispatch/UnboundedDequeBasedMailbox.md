---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html
title: UnboundedDequeBasedMailbox.MessageQueue
---

# UnboundedDequeBasedMailbox.MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class UnboundedDequeBasedMailbox.MessageQueue

- java.lang.Object
- - java.util.AbstractCollection\<E\>
	- - java.util.AbstractQueue\<E\>
		- - java.util.concurrent.LinkedBlockingDeque\<[Envelope](Envelope.html "class in akka.dispatch")\>
			- - akka.dispatch.UnboundedDequeBasedMailbox.MessageQueue

- All Implemented Interfaces:
`[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")`, `[DequeBasedMessageQueueSemantics](DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`, `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedDequeBasedMessageQueueSemantics](UnboundedDequeBasedMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")`, `java.io.Serializable`, `java.lang.Iterable<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Collection<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.concurrent.BlockingDeque<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.concurrent.BlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Deque<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>`

Enclosing class:
[UnboundedDequeBasedMailbox](UnboundedDequeBasedMailbox.html "class in akka.dispatch")

---

```
public static class UnboundedDequeBasedMailbox.MessageQueue
extends java.util.concurrent.LinkedBlockingDeque<[Envelope](Envelope.html "class in akka.dispatch")>
implements [UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "interface in akka.dispatch")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.UnboundedDequeBasedMailbox.MessageQueue)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageQueue](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch")` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from class java.util.concurrent.LinkedBlockingDeque
		
		
		`add, addAll, addFirst, addLast, clear, contains, descendingIterator, drainTo, drainTo, element, forEach, getFirst, getLast, iterator, offer, offer, offerFirst, offerFirst, offerLast, offerLast, peek, peekFirst, peekLast, poll, poll, pollFirst, pollFirst, pollLast, pollLast, pop, push, put, putFirst, putLast, remainingCapacity, remove, remove, removeAll, removeFirst, removeFirstOccurrence, removeIf, removeLast, removeLastOccurrence, retainAll, size, spliterator, take, takeFirst, takeLast, toArray, toArray, toString`
		- ### Methods inherited from class java.util.AbstractCollection
		
		
		`containsAll, isEmpty`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface java.util.Collection
		
		
		`containsAll, equals, hashCode, isEmpty, parallelStream, stream, toArray`
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue)), [hasMessages](QueueBasedMessageQueue.html#hasMessages()), [numberOfMessages](QueueBasedMessageQueue.html#numberOfMessages())`
		- ### Methods inherited from interface akka.dispatch.[UnboundedDequeBasedMessageQueue](UnboundedDequeBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[dequeue](UnboundedDequeBasedMessageQueue.html#dequeue()), [enqueue](UnboundedDequeBasedMessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope)), [enqueueFirst](UnboundedDequeBasedMessageQueue.html#enqueueFirst(akka.actor.ActorRef,akka.dispatch.Envelope))`

- - ### Constructor Detail
	
	
	
		- #### MessageQueue
		
		
		
		```
		public MessageQueue()
		```

	- ### Method Detail
	
	
	
		- #### queue
		
		
		
		```
		public final [UnboundedDequeBasedMailbox.MessageQueue](UnboundedDequeBasedMailbox.MessageQueue.html "class in akka.dispatch") queue()
		```
		
		
		Specified by:
		`[queue](DequeBasedMessageQueue.html#queue())` in interface `[DequeBasedMessageQueue](DequeBasedMessageQueue.html "interface in akka.dispatch")`
		Specified by:
		`[queue](QueueBasedMessageQueue.html#queue())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/DequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedDequeBasedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedDequeBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedDequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedDequeBasedMailbox.MessageQueue.html)*