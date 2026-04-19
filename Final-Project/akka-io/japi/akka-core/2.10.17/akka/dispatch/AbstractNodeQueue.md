---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:42:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/AbstractNodeQueue.html
title: AbstractNodeQueue
---

# AbstractNodeQueue

## Content

Package [akka.dispatch](package-summary.html)
## Class AbstractNodeQueue\<T\>

- java.lang.Object
- - java.util.concurrent.atomic.AtomicReference\<[AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")\<T\>\>
	- - akka.dispatch.AbstractNodeQueue\<T\>

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[NodeMessageQueue](NodeMessageQueue.html "class in akka.dispatch")`

---

```
public abstract class AbstractNodeQueue<T>
extends java.util.concurrent.atomic.AtomicReference<[AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<T>>
```

Lock\-free MPSC linked queue implementation based on Dmitriy Vyukov's non\-intrusive MPSC queue:
 https://www.1024cores.net/home/lock\-free\-algorithms/queues/non\-intrusive\-mpsc\-node\-based\-queue
 
 This queue could be wait\-free (i.e. without the spinning loops in peekNode and pollNode) if
 it were permitted to return null while the queue is not quite empty anymore but the enqueued
 element is not yet visible. This would break actor scheduling, though.

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.AbstractNodeQueue)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.Node.html "type parameter in AbstractNodeQueue.Node")>` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Modifier | Constructor | Description |
	| `protected` | `[AbstractNodeQueue](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[add](#add(T))​([T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue") value)` | Add an element to the head of the queue. |
	| `void` | `[addNode](#addNode(akka.dispatch.AbstractNodeQueue.Node))​([AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue")> n)` | Add an element to the head of the queue, providing the queue node to be used. |
	| `int` | `[count](#count())()` | This method returns an upper bound on the queue size at the time it  starts executing. |
	| `boolean` | `[isEmpty](#isEmpty())()` | Query the queue whether it is empty right now. |
	| `[T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue")` | `[peek](#peek())()` | Query the queue tail for the next element without dequeuing it. |
	| `protected [AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue")>` | `[peekNode](#peekNode())()` | Query the queue tail for the next element without dequeuing it. |
	| `[T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue")` | `[poll](#poll())()` | Pull one item from the queue’s tail if there is one. |
	| `[AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue")>` | `[pollNode](#pollNode())()` | Pull one item from the queue, returning it within a queue node. |
	
	
		- ### Methods inherited from class java.util.concurrent.atomic.AtomicReference
		
		
		`accumulateAndGet, compareAndExchange, compareAndExchangeAcquire, compareAndExchangeRelease, compareAndSet, get, getAcquire, getAndAccumulate, getAndSet, getAndUpdate, getOpaque, getPlain, lazySet, set, setOpaque, setPlain, setRelease, toString, updateAndGet, weakCompareAndSet, weakCompareAndSetAcquire, weakCompareAndSetPlain, weakCompareAndSetRelease, weakCompareAndSetVolatile`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AbstractNodeQueue
		
		
		
		```
		protected AbstractNodeQueue()
		```

	- ### Method Detail
	
	
	
		- #### peekNode
		
		
		
		```
		protected final [AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue")> peekNode()
		```
		
		Query the queue tail for the next element without dequeuing it.
		 
		 Use this method only from the consumer thread!
		 
		 !!! There is a copy of this code in pollNode() !!!
		
		Returns:
		queue node with element inside if there was one, or null if there was none
		- #### peek
		
		
		
		```
		public final [T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue") peek()
		```
		
		Query the queue tail for the next element without dequeuing it.
		 
		 Use this method only from the consumer thread!
		
		Returns:
		element if there was one, or null if there was none
		- #### add
		
		
		
		```
		public final void add​([T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue") value)
		```
		
		Add an element to the head of the queue.
		 
		 This method can be used from any thread.
		
		Parameters:
		`value` \- the element to be added; must not be null
		- #### addNode
		
		
		
		```
		public final void addNode​([AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue")> n)
		```
		
		Add an element to the head of the queue, providing the queue node to be used.
		 
		 This method can be used from any thread.
		
		Parameters:
		`n` \- the node containing the element to be added; both must not be null
		- #### isEmpty
		
		
		
		```
		public final boolean isEmpty()
		```
		
		Query the queue whether it is empty right now.
		 
		 This method can be used from any thread.
		
		Returns:
		true if queue was empty at some point in the past
		- #### count
		
		
		
		```
		public final int count()
		```
		
		This method returns an upper bound on the queue size at the time it
		 starts executing. It may spuriously return smaller values (including
		 zero) if the consumer pulls items out concurrently.
		 
		 This method can be used from any thread.
		
		Returns:
		an upper bound on queue length at some time in the past
		- #### poll
		
		
		
		```
		public final [T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue") poll()
		```
		
		Pull one item from the queue’s tail if there is one.
		 
		 Use this method only from the consumer thread!
		
		Returns:
		element if there was one, or null if there was none
		- #### pollNode
		
		
		
		```
		public final [AbstractNodeQueue.Node](AbstractNodeQueue.Node.html "class in akka.dispatch")<[T](AbstractNodeQueue.html "type parameter in AbstractNodeQueue")> pollNode()
		```
		
		Pull one item from the queue, returning it within a queue node.
		 
		 Use this method only from the consumer thread!
		
		Returns:
		queue node with element inside if there was one, or null if there was none

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/AbstractNodeQueue.Node.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/AbstractNodeQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/NodeMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/AbstractNodeQueue.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/AbstractNodeQueue.html)*