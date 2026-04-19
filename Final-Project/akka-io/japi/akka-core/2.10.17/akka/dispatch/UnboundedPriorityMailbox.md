---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html
title: UnboundedPriorityMailbox.MessageQueue
---

# UnboundedPriorityMailbox.MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class UnboundedPriorityMailbox.MessageQueue

- java.lang.Object
- - java.util.AbstractCollection\<E\>
	- - java.util.AbstractQueue\<E\>
		- - java.util.concurrent.PriorityBlockingQueue\<[Envelope](Envelope.html "class in akka.dispatch")\>
			- - akka.dispatch.UnboundedPriorityMailbox.MessageQueue

- All Implemented Interfaces:
`[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")`, `java.io.Serializable`, `java.lang.Iterable<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Collection<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.concurrent.BlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>`

Enclosing class:
[UnboundedPriorityMailbox](UnboundedPriorityMailbox.html "class in akka.dispatch")

---

```
public static class UnboundedPriorityMailbox.MessageQueue
extends java.util.concurrent.PriorityBlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")>
implements [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.UnboundedPriorityMailbox.MessageQueue)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageQueue](#%3Cinit%3E(int,java.util.Comparator))​(int initialCapacity,  java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from class java.util.concurrent.PriorityBlockingQueue
		
		
		`add, clear, comparator, contains, drainTo, drainTo, forEach, iterator, offer, offer, peek, poll, poll, put, remainingCapacity, remove, removeAll, removeIf, retainAll, size, spliterator, take, toArray, toArray, toString`
		- ### Methods inherited from class java.util.AbstractQueue
		
		
		`addAll, element, remove`
		- ### Methods inherited from class java.util.AbstractCollection
		
		
		`containsAll, isEmpty`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface java.util.Collection
		
		
		`addAll, containsAll, equals, hashCode, isEmpty, parallelStream, stream, toArray`
		- ### Methods inherited from interface java.util.Queue
		
		
		`element, remove`
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue)), [hasMessages](QueueBasedMessageQueue.html#hasMessages()), [numberOfMessages](QueueBasedMessageQueue.html#numberOfMessages())`
		- ### Methods inherited from interface akka.dispatch.[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[dequeue](UnboundedQueueBasedMessageQueue.html#dequeue()), [enqueue](UnboundedQueueBasedMessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))`

- - ### Constructor Detail
	
	
	
		- #### MessageQueue
		
		
		
		```
		public MessageQueue​(int initialCapacity,
		                    java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp)
		```

	- ### Method Detail
	
	
	
		- #### queue
		
		
		
		```
		public final java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")> queue()
		```
		
		
		Specified by:
		`[queue](QueueBasedMessageQueue.html#queue())` in interface `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedPriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/UnboundedPriorityMailbox.MessageQueue.html)*