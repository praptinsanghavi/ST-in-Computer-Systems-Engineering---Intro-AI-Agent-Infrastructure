---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox$.html
title: BoundedDequeBasedMailbox$
---

# BoundedDequeBasedMailbox$

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedDequeBasedMailbox$

- java.lang.Object
- - akka.dispatch.BoundedDequeBasedMailbox$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class BoundedDequeBasedMailbox$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.BoundedDequeBasedMailbox$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BoundedDequeBasedMailbox$](BoundedDequeBasedMailbox$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BoundedDequeBasedMailbox$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "class in akka.dispatch")` | `[apply](#apply(int,scala.concurrent.duration.FiniteDuration))​(int capacity,  scala.concurrent.duration.FiniteDuration pushTimeOut)` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​scala.concurrent.duration.FiniteDuration>>` | `[unapply](#unapply(akka.dispatch.BoundedDequeBasedMailbox))​([BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BoundedDequeBasedMailbox$](BoundedDequeBasedMailbox$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BoundedDequeBasedMailbox$
		
		
		
		```
		public BoundedDequeBasedMailbox$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "class in akka.dispatch") apply​(int capacity,
		                                      scala.concurrent.duration.FiniteDuration pushTimeOut)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​scala.concurrent.duration.FiniteDuration>> unapply​([BoundedDequeBasedMailbox](BoundedDequeBasedMailbox.html "class in akka.dispatch") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox$.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BoundedDequeBasedMailbox$.html)*