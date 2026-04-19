---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/BoundedBlockingQueue.html
title: BoundedBlockingQueue
---

# BoundedBlockingQueue

## Content

Package [akka.util](package-summary.html)
## Class BoundedBlockingQueue\<E\>

- java.lang.Object
- - java.util.AbstractCollection\<E\>
	- - java.util.AbstractQueue\<E\>
		- - akka.util.BoundedBlockingQueue\<E\>

- All Implemented Interfaces:
`java.lang.Iterable<E>`, `java.util.Collection<E>`, `java.util.concurrent.BlockingQueue<E>`, `java.util.Queue<E>`

Direct Known Subclasses:
`[BoundedPriorityMailbox.MessageQueue](../dispatch/BoundedPriorityMailbox.MessageQueue.html "class in akka.dispatch")`, `[BoundedStablePriorityMailbox.MessageQueue](../dispatch/BoundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public class BoundedBlockingQueue<E>
extends java.util.AbstractQueue<E>
implements java.util.concurrent.BlockingQueue<E>
```

BoundedBlockingQueue wraps any Queue and turns the result into a BlockingQueue with a limited capacity.
 param: maxCapacity \- the maximum capacity of this Queue, needs to be \> 0
 param: backing \- the backing Queue

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BoundedBlockingQueue](#%3Cinit%3E(int,java.util.Queue))​(int maxCapacity,  java.util.Queue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")> backing)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clear](#clear())()` |  |
	| `boolean` | `[contains](#contains(java.lang.Object))​(java.lang.Object e)` |  |
	| `boolean` | `[containsAll](#containsAll(java.util.Collection))​(java.util.Collection<?> c)` |  |
	| `protected java.util.concurrent.locks.ReentrantLock` | `[createLock](#createLock())()` |  |
	| `protected java.util.concurrent.locks.Condition` | `[createNotEmptyCondition](#createNotEmptyCondition())()` |  |
	| `protected java.util.concurrent.locks.Condition` | `[createNotFullCondition](#createNotFullCondition())()` |  |
	| `int` | `[drainTo](#drainTo(java.util.Collection))​(java.util.Collection<? super [E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")> c)` |  |
	| `int` | `[drainTo](#drainTo(java.util.Collection,int))​(java.util.Collection<? super [E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")> c,  int maxElements)` |  |
	| `boolean` | `[isEmpty](#isEmpty())()` |  |
	| `java.util.Iterator<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>` | `[iterator](#iterator())()` |  |
	| `protected java.util.concurrent.locks.ReentrantLock` | `[lock](#lock())()` |  |
	| `int` | `[maxCapacity](#maxCapacity())()` |  |
	| `protected java.util.concurrent.locks.Condition` | `[notEmpty](#notEmpty())()` |  |
	| `protected java.util.concurrent.locks.Condition` | `[notFull](#notFull())()` |  |
	| `boolean` | `[offer](#offer(E))​([E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") e)` |  |
	| `boolean` | `[offer](#offer(E,long,java.util.concurrent.TimeUnit))​([E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") e,  long timeout,  java.util.concurrent.TimeUnit unit)` |  |
	| `[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")` | `[peek](#peek())()` |  |
	| `[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")` | `[poll](#poll())()` |  |
	| `[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")` | `[poll](#poll(long,java.util.concurrent.TimeUnit))​(long timeout,  java.util.concurrent.TimeUnit unit)` |  |
	| `void` | `[put](#put(E))​([E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") e)` |  |
	| `int` | `[remainingCapacity](#remainingCapacity())()` |  |
	| `boolean` | `[remove](#remove(java.lang.Object))​(java.lang.Object e)` |  |
	| `boolean` | `[removeAll](#removeAll(java.util.Collection))​(java.util.Collection<?> c)` |  |
	| `boolean` | `[retainAll](#retainAll(java.util.Collection))​(java.util.Collection<?> c)` |  |
	| `int` | `[size](#size())()` |  |
	| `[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")` | `[take](#take())()` |  |
	| `java.lang.Object[]` | `[toArray](#toArray())()` |  |
	| `<X> X[]` | `[toArray](#toArray(X%5B%5D))​(X[] a)` |  |
	
	
		- ### Methods inherited from class java.util.AbstractQueue
		
		
		`add, addAll, element, remove`
		- ### Methods inherited from class java.util.AbstractCollection
		
		
		`toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface java.util.concurrent.BlockingQueue
		
		
		`add`
		- ### Methods inherited from interface java.util.Collection
		
		
		`addAll, equals, hashCode, parallelStream, removeIf, spliterator, stream, toArray`
		- ### Methods inherited from interface java.lang.Iterable
		
		
		`forEach`
		- ### Methods inherited from interface java.util.Queue
		
		
		`element, remove`

- - ### Constructor Detail
	
	
	
		- #### BoundedBlockingQueue
		
		
		
		```
		public BoundedBlockingQueue​(int maxCapacity,
		                            java.util.Queue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")> backing)
		```

	- ### Method Detail
	
	
	
		- #### clear
		
		
		
		```
		public void clear()
		```
		
		
		Specified by:
		`clear` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Overrides:
		`clear` in class `java.util.AbstractQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### contains
		
		
		
		```
		public boolean contains​(java.lang.Object e)
		```
		
		
		Specified by:
		`contains` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Specified by:
		`contains` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Overrides:
		`contains` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### containsAll
		
		
		
		```
		public boolean containsAll​(java.util.Collection<?> c)
		```
		
		
		Specified by:
		`containsAll` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Overrides:
		`containsAll` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### createLock
		
		
		
		```
		protected java.util.concurrent.locks.ReentrantLock createLock()
		```
		- #### createNotEmptyCondition
		
		
		
		```
		protected java.util.concurrent.locks.Condition createNotEmptyCondition()
		```
		- #### createNotFullCondition
		
		
		
		```
		protected java.util.concurrent.locks.Condition createNotFullCondition()
		```
		- #### drainTo
		
		
		
		```
		public int drainTo​(java.util.Collection<? super [E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")> c)
		```
		
		
		Specified by:
		`drainTo` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### drainTo
		
		
		
		```
		public int drainTo​(java.util.Collection<? super [E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")> c,
		                   int maxElements)
		```
		
		
		Specified by:
		`drainTo` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		
		Specified by:
		`isEmpty` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Overrides:
		`isEmpty` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### iterator
		
		
		
		```
		public java.util.Iterator<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")> iterator()
		```
		
		
		Specified by:
		`iterator` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Specified by:
		`iterator` in interface `java.lang.Iterable<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Specified by:
		`iterator` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### lock
		
		
		
		```
		protected java.util.concurrent.locks.ReentrantLock lock()
		```
		- #### maxCapacity
		
		
		
		```
		public int maxCapacity()
		```
		- #### notEmpty
		
		
		
		```
		protected java.util.concurrent.locks.Condition notEmpty()
		```
		- #### notFull
		
		
		
		```
		protected java.util.concurrent.locks.Condition notFull()
		```
		- #### offer
		
		
		
		```
		public boolean offer​([E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") e)
		```
		
		
		Specified by:
		`offer` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Specified by:
		`offer` in interface `java.util.Queue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### offer
		
		
		
		```
		public boolean offer​([E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") e,
		                     long timeout,
		                     java.util.concurrent.TimeUnit unit)
		```
		
		
		Specified by:
		`offer` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### peek
		
		
		
		```
		public [E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") peek()
		```
		
		
		Specified by:
		`peek` in interface `java.util.Queue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### poll
		
		
		
		```
		public [E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") poll​(long timeout,
		              java.util.concurrent.TimeUnit unit)
		```
		
		
		Specified by:
		`poll` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### poll
		
		
		
		```
		public [E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") poll()
		```
		
		
		Specified by:
		`poll` in interface `java.util.Queue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### put
		
		
		
		```
		public void put​([E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") e)
		```
		
		
		Specified by:
		`put` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### remainingCapacity
		
		
		
		```
		public int remainingCapacity()
		```
		
		
		Specified by:
		`remainingCapacity` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### remove
		
		
		
		```
		public boolean remove​(java.lang.Object e)
		```
		
		
		Specified by:
		`remove` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Specified by:
		`remove` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Overrides:
		`remove` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### removeAll
		
		
		
		```
		public boolean removeAll​(java.util.Collection<?> c)
		```
		
		
		Specified by:
		`removeAll` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Overrides:
		`removeAll` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### retainAll
		
		
		
		```
		public boolean retainAll​(java.util.Collection<?> c)
		```
		
		
		Specified by:
		`retainAll` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Overrides:
		`retainAll` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### size
		
		
		
		```
		public int size()
		```
		
		
		Specified by:
		`size` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Specified by:
		`size` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### take
		
		
		
		```
		public [E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue") take()
		```
		
		
		Specified by:
		`take` in interface `java.util.concurrent.BlockingQueue<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### toArray
		
		
		
		```
		public java.lang.Object[] toArray()
		```
		
		
		Specified by:
		`toArray` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Overrides:
		`toArray` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		- #### toArray
		
		
		
		```
		public <X> X[] toArray​(X[] a)
		```
		
		
		Specified by:
		`toArray` in interface `java.util.Collection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`
		Overrides:
		`toArray` in class `java.util.AbstractCollection<[E](BoundedBlockingQueue.html "type parameter in BoundedBlockingQueue")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedPriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/util/BoundedBlockingQueue.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/BoundedBlockingQueue.html](https://doc.akka.io/japi/akka/current/akka/util/BoundedBlockingQueue.html)*