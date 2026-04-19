---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/PriorityQueueStabilizer.WrappedElementComparator.html
title: PriorityQueueStabilizer.WrappedElementComparator
---

# PriorityQueueStabilizer.WrappedElementComparator

## Content

Package [akka.util](package-summary.html)
## Class PriorityQueueStabilizer.WrappedElementComparator\<E\>

- java.lang.Object
- - akka.util.PriorityQueueStabilizer.WrappedElementComparator\<E\>

- All Implemented Interfaces:
`java.util.Comparator<[PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<E>>`

Enclosing interface:
[PriorityQueueStabilizer](PriorityQueueStabilizer.html "interface in akka.util")\<[E](PriorityQueueStabilizer.html "type parameter in PriorityQueueStabilizer")\>

---

```
public static class PriorityQueueStabilizer.WrappedElementComparator<E>
extends java.lang.Object
implements java.util.Comparator<[PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<E>>
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WrappedElementComparator](#%3Cinit%3E(java.util.Comparator))​(java.util.Comparator<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")> cmp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.Comparator<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")>` | `[cmp](#cmp())()` |  |
	| `int` | `[compare](#compare(akka.util.PriorityQueueStabilizer.WrappedElement,akka.util.PriorityQueueStabilizer.WrappedElement))​([PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")> e1,  [PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")> e2)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.util.Comparator
		
		
		`equals, reversed, thenComparing, thenComparing, thenComparing, thenComparingDouble, thenComparingInt, thenComparingLong`

- - ### Constructor Detail
	
	
	
		- #### WrappedElementComparator
		
		
		
		```
		public WrappedElementComparator​(java.util.Comparator<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")> cmp)
		```

	- ### Method Detail
	
	
	
		- #### cmp
		
		
		
		```
		public java.util.Comparator<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")> cmp()
		```
		- #### compare
		
		
		
		```
		public int compare​([PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")> e1,
		                   [PriorityQueueStabilizer.WrappedElement](PriorityQueueStabilizer.WrappedElement.html "class in akka.util")<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")> e2)
		```
		
		
		Specified by:
		`compare` in interface `java.util.Comparator<[E](PriorityQueueStabilizer.WrappedElementComparator.html "type parameter in PriorityQueueStabilizer.WrappedElementComparator")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/PriorityQueueStabilizer.WrappedElement.html
- https://doc.akka.io/japi/akka/current/akka/util/PriorityQueueStabilizer.WrappedElementComparator.html
- https://doc.akka.io/japi/akka/current/akka/util/PriorityQueueStabilizer.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/PriorityQueueStabilizer.WrappedElementComparator.html](https://doc.akka.io/japi/akka/current/akka/util/PriorityQueueStabilizer.WrappedElementComparator.html)*