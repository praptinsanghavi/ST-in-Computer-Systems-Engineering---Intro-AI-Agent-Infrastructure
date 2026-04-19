---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedPriorityMailbox.MessageQueue.html
title: BoundedPriorityMailbox.MessageQueue
---

# BoundedPriorityMailbox.MessageQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedPriorityMailbox.MessageQueue

- java.lang.Object
- - java.util.AbstractCollection\<E\>
	- - java.util.AbstractQueue\<E\>
		- - [akka.util.BoundedBlockingQueue](../util/BoundedBlockingQueue.html "class in akka.util")\<[Envelope](Envelope.html "class in akka.dispatch")\>
			- - akka.dispatch.BoundedPriorityMailbox.MessageQueue

- All Implemented Interfaces:
`[BoundedMessageQueueSemantics](BoundedMessageQueueSemantics.html "interface in akka.dispatch")`, `[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")`, `[MessageQueue](MessageQueue.html "interface in akka.dispatch")`, `[MultipleConsumerSemantics](MultipleConsumerSemantics.html "interface in akka.dispatch")`, `[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")`, `java.lang.Iterable<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Collection<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.concurrent.BlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")>`, `java.util.Queue<[Envelope](Envelope.html "class in akka.dispatch")>`

Enclosing class:
[BoundedPriorityMailbox](BoundedPriorityMailbox.html "class in akka.dispatch")

---

```
public static class BoundedPriorityMailbox.MessageQueue
extends [BoundedBlockingQueue](../util/BoundedBlockingQueue.html "class in akka.util")<[Envelope](Envelope.html "class in akka.dispatch")>
implements [BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageQueue](#%3Cinit%3E(int,java.util.Comparator,scala.concurrent.duration.Duration))​(int capacity,  java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp,  scala.concurrent.duration.Duration pushTimeOut)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.Duration` | `[pushTimeOut](#pushTimeOut())()` |  |
	| `java.util.concurrent.BlockingQueue<[Envelope](Envelope.html "class in akka.dispatch")>` | `[queue](#queue())()` |  |
	
	
		- ### Methods inherited from class akka.util.[BoundedBlockingQueue](../util/BoundedBlockingQueue.html "class in akka.util")
		
		
		`[clear](../util/BoundedBlockingQueue.html#clear()), [contains](../util/BoundedBlockingQueue.html#contains(java.lang.Object)), [containsAll](../util/BoundedBlockingQueue.html#containsAll(java.util.Collection)), [createLock](../util/BoundedBlockingQueue.html#createLock()), [createNotEmptyCondition](../util/BoundedBlockingQueue.html#createNotEmptyCondition()), [createNotFullCondition](../util/BoundedBlockingQueue.html#createNotFullCondition()), [drainTo](../util/BoundedBlockingQueue.html#drainTo(java.util.Collection)), [drainTo](../util/BoundedBlockingQueue.html#drainTo(java.util.Collection,int)), [isEmpty](../util/BoundedBlockingQueue.html#isEmpty()), [iterator](../util/BoundedBlockingQueue.html#iterator()), [lock](../util/BoundedBlockingQueue.html#lock()), [maxCapacity](../util/BoundedBlockingQueue.html#maxCapacity()), [notEmpty](../util/BoundedBlockingQueue.html#notEmpty()), [notFull](../util/BoundedBlockingQueue.html#notFull()), [offer](../util/BoundedBlockingQueue.html#offer(E)), [offer](../util/BoundedBlockingQueue.html#offer(E,long,java.util.concurrent.TimeUnit)), [peek](../util/BoundedBlockingQueue.html#peek()), [poll](../util/BoundedBlockingQueue.html#poll()), [poll](../util/BoundedBlockingQueue.html#poll(long,java.util.concurrent.TimeUnit)), [put](../util/BoundedBlockingQueue.html#put(E)), [remainingCapacity](../util/BoundedBlockingQueue.html#remainingCapacity()), [remove](../util/BoundedBlockingQueue.html#remove(java.lang.Object)), [removeAll](../util/BoundedBlockingQueue.html#removeAll(java.util.Collection)), [retainAll](../util/BoundedBlockingQueue.html#retainAll(java.util.Collection)), [size](../util/BoundedBlockingQueue.html#size()), [take](../util/BoundedBlockingQueue.html#take()), [toArray](../util/BoundedBlockingQueue.html#toArray()), [toArray](../util/BoundedBlockingQueue.html#toArray(X%5B%5D))`
		- ### Methods inherited from class java.util.AbstractQueue
		
		
		`add, addAll, element, remove`
		- ### Methods inherited from class java.util.AbstractCollection
		
		
		`toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface java.util.concurrent.BlockingQueue
		
		
		`add`
		- ### Methods inherited from interface akka.dispatch.[BoundedQueueBasedMessageQueue](BoundedQueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[dequeue](BoundedQueueBasedMessageQueue.html#dequeue()), [enqueue](BoundedQueueBasedMessageQueue.html#enqueue(akka.actor.ActorRef,akka.dispatch.Envelope))`
		- ### Methods inherited from interface java.util.Collection
		
		
		`addAll, equals, hashCode, parallelStream, removeIf, spliterator, stream, toArray`
		- ### Methods inherited from interface java.lang.Iterable
		
		
		`forEach`
		- ### Methods inherited from interface java.util.Queue
		
		
		`element, remove`
		- ### Methods inherited from interface akka.dispatch.[QueueBasedMessageQueue](QueueBasedMessageQueue.html "interface in akka.dispatch")
		
		
		`[cleanUp](QueueBasedMessageQueue.html#cleanUp(akka.actor.ActorRef,akka.dispatch.MessageQueue)), [hasMessages](QueueBasedMessageQueue.html#hasMessages()), [numberOfMessages](QueueBasedMessageQueue.html#numberOfMessages())`

- - ### Constructor Detail
	
	
	
		- #### MessageQueue
		
		
		
		```
		public MessageQueue​(int capacity,
		                    java.util.Comparator<[Envelope](Envelope.html "class in akka.dispatch")> cmp,
		                    scala.concurrent.duration.Duration pushTimeOut)
		```

	- ### Method Detail
	
	
	
		- #### pushTimeOut
		
		
		
		```
		public scala.concurrent.duration.Duration pushTimeOut()
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

- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedPriorityMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedQueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/Envelope.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/MultipleConsumerSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/QueueBasedMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/BoundedBlockingQueue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedPriorityMailbox.MessageQueue.html](https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedPriorityMailbox.MessageQueue.html)*