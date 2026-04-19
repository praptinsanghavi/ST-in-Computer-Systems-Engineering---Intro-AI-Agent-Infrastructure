---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:25:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes.SyncProcessingLimit$.html
title: ActorAttributes.SyncProcessingLimit$
---

# ActorAttributes.SyncProcessingLimit$

## Content

Package [akka.stream](package-summary.html)
## Class ActorAttributes.SyncProcessingLimit$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​[ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream")\>
	- - akka.stream.ActorAttributes.SyncProcessingLimit$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​[ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream")>`

Enclosing class:
[ActorAttributes](ActorAttributes.html "class in akka.stream")

---

```
public static class ActorAttributes.SyncProcessingLimit$
extends scala.runtime.AbstractFunction1<java.lang.Object,​[ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.ActorAttributes.SyncProcessingLimit$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorAttributes.SyncProcessingLimit$](ActorAttributes.SyncProcessingLimit$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SyncProcessingLimit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream")` | `[apply](#apply(int))​(int limit)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.stream.ActorAttributes.SyncProcessingLimit))​([ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorAttributes.SyncProcessingLimit$](ActorAttributes.SyncProcessingLimit$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SyncProcessingLimit$
		
		
		
		```
		public SyncProcessingLimit$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​[ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​[ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream")>`
		- #### apply
		
		
		
		```
		public [ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream") apply​(int limit)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes.SyncProcessingLimit$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes.SyncProcessingLimit.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes.SyncProcessingLimit$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorAttributes.SyncProcessingLimit$.html)*