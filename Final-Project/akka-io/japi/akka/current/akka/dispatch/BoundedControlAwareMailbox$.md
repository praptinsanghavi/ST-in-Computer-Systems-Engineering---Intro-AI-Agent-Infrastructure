---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox$.html
title: BoundedControlAwareMailbox$
---

# BoundedControlAwareMailbox$

## Content

Package [akka.dispatch](package-summary.html)
## Class BoundedControlAwareMailbox$

- java.lang.Object
- - akka.dispatch.BoundedControlAwareMailbox$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class BoundedControlAwareMailbox$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.BoundedControlAwareMailbox$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BoundedControlAwareMailbox$](BoundedControlAwareMailbox$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BoundedControlAwareMailbox$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch")` | `[apply](#apply(int,scala.concurrent.duration.FiniteDuration))​(int capacity,  scala.concurrent.duration.FiniteDuration pushTimeOut)` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​scala.concurrent.duration.FiniteDuration>>` | `[unapply](#unapply(akka.dispatch.BoundedControlAwareMailbox))​([BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BoundedControlAwareMailbox$](BoundedControlAwareMailbox$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BoundedControlAwareMailbox$
		
		
		
		```
		public BoundedControlAwareMailbox$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch") apply​(int capacity,
		                                        scala.concurrent.duration.FiniteDuration pushTimeOut)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​scala.concurrent.duration.FiniteDuration>> unapply​([BoundedControlAwareMailbox](BoundedControlAwareMailbox.html "class in akka.dispatch") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/BoundedControlAwareMailbox$.html)*