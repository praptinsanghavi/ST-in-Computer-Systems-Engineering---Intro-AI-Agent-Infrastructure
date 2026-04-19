---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.html
title: PriorityQueueStabilizer
---

# PriorityQueueStabilizer

## Content

Package [akka.util](package-summary.html)
## Interface PriorityQueueStabilizer\<E\>

- All Known Implementing Classes:
`[StablePriorityBlockingQueue](StablePriorityBlockingQueue.html "class in akka.util")`, `[StablePriorityQueue](StablePriorityQueue.html "class in akka.util")`, `[UnboundedStablePriorityMailbox.MessageQueue](../dispatch/UnboundedStablePriorityMailbox.MessageQueue.html "class in akka.dispatch")`

---

```
public interface PriorityQueueStabilizer<E>
```

PriorityQueueStabilizer wraps a priority queue so that it respects FIFO for elements of equal priority.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](PriorityQueueStabilizer.WrappedElement.html "type parameter in PriorityQueueStabilizer.WrappedElement")>` |  |
	| `static class` | `[PriorityQueueStabilizer.WrappedElementComparator](PriorityQueueStabilizer.WrappedElementComparator.html "class in akka.util")<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")>` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq](#akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq(java.util.concurrent.atomic.AtomicLong))​(java.util.concurrent.atomic.AtomicLong x$1)` |  |
	| `java.util.AbstractQueue<[PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer")>>` | `[backingQueue](#backingQueue())()` |  |
	| `java.util.Iterator<[E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer")>` | `[iterator](#iterator())()` |  |
	| `boolean` | `[offer](#offer(E))​([E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer") e)` |  |
	| `[E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer")` | `[peek](#peek())()` |  |
	| `[E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer")` | `[poll](#poll())()` |  |
	| `java.util.concurrent.atomic.AtomicLong` | `[seqNum](#seqNum())()` |  |
	| `int` | `[size](#size())()` |  |

- - ### Method Detail
	
	
	
		- #### akka$util$PriorityQueueStabilizer$\_setter\_$seqNum\_$eq
		
		
		
		```
		void akka$util$PriorityQueueStabilizer$_setter_$seqNum_$eq​(java.util.concurrent.atomic.AtomicLong x$1)
		```
		- #### backingQueue
		
		
		
		```
		java.util.AbstractQueue<[PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer")>> backingQueue()
		```
		- #### seqNum
		
		
		
		```
		java.util.concurrent.atomic.AtomicLong seqNum()
		```
		- #### peek
		
		
		
		```
		[E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer") peek()
		```
		- #### size
		
		
		
		```
		int size()
		```
		- #### offer
		
		
		
		```
		boolean offer​([E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer") e)
		```
		- #### iterator
		
		
		
		```
		java.util.Iterator<[E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer")> iterator()
		```
		- #### poll
		
		
		
		```
		[E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer") poll()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/UnboundedStablePriorityMailbox.MessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.WrappedElement.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.WrappedElementComparator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/StablePriorityBlockingQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/StablePriorityQueue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.html](https://doc.akka.io/japi/akka-core/2.10/akka/util/PriorityQueueStabilizer.html)*