---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:53:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope$.html
title: ConsistentHashingRouter.ConsistentHashableEnvelope$
---

# ConsistentHashingRouter.ConsistentHashableEnvelope$

## Content

Package [akka.routing](package-summary.html)
## Class ConsistentHashingRouter.ConsistentHashableEnvelope$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​[ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")\>
	- - akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​java.lang.Object,​[ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")>`

Enclosing class:
[ConsistentHashingRouter](ConsistentHashingRouter.html "class in akka.routing")

---

```
public static class ConsistentHashingRouter.ConsistentHashableEnvelope$
extends scala.runtime.AbstractFunction2<java.lang.Object,​java.lang.Object,​[ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConsistentHashingRouter.ConsistentHashableEnvelope$](ConsistentHashingRouter.ConsistentHashableEnvelope$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConsistentHashableEnvelope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")` | `[apply](#apply(java.lang.Object,java.lang.Object))​(java.lang.Object message,  java.lang.Object hashKey)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope))​([ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConsistentHashingRouter.ConsistentHashableEnvelope$](ConsistentHashingRouter.ConsistentHashableEnvelope$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConsistentHashableEnvelope$
		
		
		
		```
		public ConsistentHashableEnvelope$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​java.lang.Object,​[ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​java.lang.Object,​[ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing") apply​(java.lang.Object message,
		                                                                java.lang.Object hashKey)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<java.lang.Object,​java.lang.Object,​[ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>> unapply​([ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ConsistentHashingRouter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope$.html)*