---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.MessageQueue.html
title: UnboundedStablePriorityMailbox.MessageQueue
---

# UnboundedStablePriorityMailbox.MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class UnboundedStablePriorityMailbox.MessageQueue

- java.lang.Object
- - java.util.AbstractCollection\<E\>
	- - java.util.AbstractQueue\<E\>
		- - [akka.util.StablePriorityBlockingQueue](../util/StablePriorityBlockingQueue.html "class in akka.util")\<[Envelope](Envelope.html "class in akka.dispatch")\>
			- - akka.dispatch.UnboundedStablePriorityMailbox.MessageQueue

- All Implemented Interfaces:
`[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `[UnboundedMessageQueueSemantics](UnboundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")`, `[PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html "interface in akka.util")<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.lang.Iterable<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Collection<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>`

Enclosing class:
[UnboundedStablePriorityMailbox](UnboundedStablePriorityMailbox.html "class in akka.dispatch")

---

```
public static class UnboundedStablePriorityMailbox.MessageQueue
extends [StablePriorityBlockingQueue](../util/StablePriorityBlockingQueue.html "class in akka.util")<[Envelope](Envelope.html "class in akka.dispatch")>
implements [UnboundedQueueBasedMessageQueue](UnboundedQueueBasedMessageQueue.html "interface in akka.dispatch")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.util.[PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html "interface in akka.util")
		
		
		`[PriorityQueueStabilizer.WrappedElement](../util/PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](../util/PriorityQueueStabilizer.WrappedElement.html "type parameter in PriorityQueueStabilizer.WrappedElement")>, [PriorityQueueStabilizer.WrappedElementComparator](../util/PriorityQueueStabilizer.WrappedElementComparator.html "class in akka.util")<[E](../util/PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageQueue](#%3Cinit%3E(int,java.util.Comparator))​(int initialCapacity,  java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from class akka.util.[StablePriorityBlockingQueue](../util/StablePriorityBlockingQueue.html "class in akka.util")
		
		
		`[akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq](../util/StablePriorityBlockingQueue.html#akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq(java.util.concurrent.atomic.AtomicLong)), [backingQueue](../util/StablePriorityBlockingQueue.html#backingQueue()), [seqNum](../util/StablePriorityBlockingQueue.html#seqNum())`
		- ### Methods inherited from class java.util.AbstractQueue
		
		
		`add, addAll, clear, element, remove`
		- ### Methods inherited from class java.util.AbstractCollection
		
		
		`contains, containsAll, isEmpty, iterator, remove, removeAll, retainAll, size, toArray, toArray, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface java.util.Collection
		
		
		`contains, containsAll, equals, hashCode, isEmpty, iterator, parallelStream, remove, removeAll, removeIf, retainAll, size, spliterator, stream, toArray, toArray, toArray`
		- ### Methods inherited from interface java.lang.Iterable
		
		
		`forEach`
		- ### Methods inherited from interface akka.util.[PriorityQueueStabilizer](../util/PriorityQueueStabilizer.html "interface in akka.util")
		
		
		`[iterator](../util/PriorityQueueStabilizer.html#iterator()), [offer](../util/PriorityQueueStabilizer.html#offer(E)), [peek](../util/PriorityQueueStabilizer.html#peek()), [poll](../util/PriorityQueueStabilizer.html#poll()), [size](../util/PriorityQueueStabilizer.html#size())`
		- ### Methods inherited from interface java.util.Queue
		
		
		`offer, peek, poll`
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

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.WrappedElement.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.WrappedElementComparator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/StablePriorityBlockingQueue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.MessageQueue.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.MessageQueue.html)*