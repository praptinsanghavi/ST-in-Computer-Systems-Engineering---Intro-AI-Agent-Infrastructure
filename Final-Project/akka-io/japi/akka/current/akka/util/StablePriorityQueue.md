---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/StablePriorityQueue.html
title: StablePriorityQueue
---

# StablePriorityQueue

## Content

Package [akka.util](package-summary.html)
## Class StablePriorityQueue\<E\>

- java.lang.Object
- - java.util.AbstractCollection\<E\>
	- - java.util.AbstractQueue\<E\>
		- - akka.util.StablePriorityQueue\<E\>

- All Implemented Interfaces:
`[PriorityQueueStabilizer](PriorityQueueStabilizer.html "interface in akka.util")<E>`, `java.lang.Iterable<E>`, `java.util.Collection<E>`, `java.util.Queue<E>`

---

```
public class StablePriorityQueue<E>
extends java.util.AbstractQueue<E>
implements [PriorityQueueStabilizer](PriorityQueueStabilizer.html "interface in akka.util")<E>
```

StablePriorityQueue is a priority queue that preserves order for elements of equal priority.
 param: capacity \- the initial capacity of this Queue, needs to be \> 0\.
 param: cmp \- Comparator for comparing Queue elements

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.util.[PriorityQueueStabilizer](PriorityQueueStabilizer.html "interface in akka.util")
		
		
		`[PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](PriorityQueueStabilizer.WrappedElement.html "type parameter in PriorityQueueStabilizer.WrappedElement")>, [PriorityQueueStabilizer.WrappedElementComparator](PriorityQueueStabilizer.WrappedElementComparator.html "class in akka.util")<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StablePriorityQueue](#%3Cinit%3E(int,java.util.Comparator))​(int capacity,  java.util.Comparator<[E](StablePriorityQueue.html "type parameter in StablePriorityQueue")> cmp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq](#akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq(java.util.concurrent.atomic.AtomicLong))​(java.util.concurrent.atomic.AtomicLong x$1)` |  |
	| `java.util.PriorityQueue<[PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](StablePriorityQueue.html "type parameter in StablePriorityQueue")>>` | `[backingQueue](#backingQueue())()` |  |
	| `java.util.concurrent.atomic.AtomicLong` | `[seqNum](#seqNum())()` |  |
	
	
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
		- ### Methods inherited from interface akka.util.[PriorityQueueStabilizer](PriorityQueueStabilizer.html "interface in akka.util")
		
		
		`[iterator](PriorityQueueStabilizer.html#iterator()), [offer](PriorityQueueStabilizer.html#offer(E)), [peek](PriorityQueueStabilizer.html#peek()), [poll](PriorityQueueStabilizer.html#poll()), [size](PriorityQueueStabilizer.html#size())`
		- ### Methods inherited from interface java.util.Queue
		
		
		`offer, peek, poll`

- - ### Constructor Detail
	
	
	
		- #### StablePriorityQueue
		
		
		
		```
		public StablePriorityQueue​(int capacity,
		                           java.util.Comparator<[E](StablePriorityQueue.html "type parameter in StablePriorityQueue")> cmp)
		```

	- ### Method Detail
	
	
	
		- #### akka$util$PriorityQueueStabilizer$\_setter\_$seqNum\_$eq
		
		
		
		```
		protected void akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq​(java.util.concurrent.atomic.AtomicLong x$1)
		```
		
		
		Specified by:
		`[akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq](PriorityQueueStabilizer.html#akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq(java.util.concurrent.atomic.AtomicLong))` in interface `[PriorityQueueStabilizer](PriorityQueueStabilizer.html "interface in akka.util")<[E](StablePriorityQueue.html "type parameter in StablePriorityQueue")>`
		- #### backingQueue
		
		
		
		```
		public java.util.PriorityQueue<[PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](StablePriorityQueue.html "type parameter in StablePriorityQueue")>> backingQueue()
		```
		
		
		Specified by:
		`[backingQueue](PriorityQueueStabilizer.html#backingQueue())` in interface `[PriorityQueueStabilizer](PriorityQueueStabilizer.html "interface in akka.util")<[E](StablePriorityQueue.html "type parameter in StablePriorityQueue")>`
		- #### seqNum
		
		
		
		```
		public java.util.concurrent.atomic.AtomicLong seqNum()
		```
		
		
		Specified by:
		`[seqNum](PriorityQueueStabilizer.html#seqNum())` in interface `[PriorityQueueStabilizer](PriorityQueueStabilizer.html "interface in akka.util")<[E](StablePriorityQueue.html "type parameter in StablePriorityQueue")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/PriorityQueueStabilizer.WrappedElement.html
- https://doc.akka.io/japi/akka/current/akka/util/PriorityQueueStabilizer.WrappedElementComparator.html
- https://doc.akka.io/japi/akka/current/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/japi/akka/current/akka/util/StablePriorityQueue.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/StablePriorityQueue.html](https://doc.akka.io/japi/akka/current/akka/util/StablePriorityQueue.html)*