---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:42:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMailbox$.html
title: BoundedMailbox$
---

# BoundedMailbox$

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedMailbox$

- java.lang.Object
- - akka.dispatch.BoundedMailbox$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class BoundedMailbox$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.BoundedMailbox$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BoundedMailbox$](BoundedMailbox$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BoundedMailbox$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BoundedMailbox](BoundedMailbox.html "class in akka.dispatch")` | `[apply](#apply(int,scala.concurrent.duration.FiniteDuration))​(int capacity,  scala.concurrent.duration.FiniteDuration pushTimeOut)` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​scala.concurrent.duration.FiniteDuration>>` | `[unapply](#unapply(akka.dispatch.BoundedMailbox))​([BoundedMailbox](BoundedMailbox.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BoundedMailbox$](BoundedMailbox$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BoundedMailbox$
		
		
		
		```
		public BoundedMailbox$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [BoundedMailbox](BoundedMailbox.html "class in akka.dispatch") apply​(int capacity,
		                            scala.concurrent.duration.FiniteDuration pushTimeOut)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​scala.concurrent.duration.FiniteDuration>> unapply​([BoundedMailbox](BoundedMailbox.html "class in akka.dispatch") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMailbox$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMailbox.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMailbox$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/BoundedMailbox$.html)*