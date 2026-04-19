---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:18:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.Failure$.html
title: QueueOfferResult.Failure$
---

# QueueOfferResult.Failure$

## Content

Package [akka.stream](package-summary.html)
## Class QueueOfferResult.Failure$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Throwable,​[QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream")\>
	- - akka.stream.QueueOfferResult.Failure$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Throwable,​[QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream")>`

Enclosing class:
[QueueOfferResult](QueueOfferResult.html "class in akka.stream")

---

```
public static class QueueOfferResult.Failure$
extends scala.runtime.AbstractFunction1<java.lang.Throwable,​[QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.QueueOfferResult.Failure$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [QueueOfferResult.Failure$](QueueOfferResult.Failure$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Failure$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream")` | `[apply](#apply(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.stream.QueueOfferResult.Failure))​([QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [QueueOfferResult.Failure$](QueueOfferResult.Failure$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Failure$
		
		
		
		```
		public Failure$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Throwable,​[QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Throwable,​[QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream")>`
		- #### apply
		
		
		
		```
		public [QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream") apply​(java.lang.Throwable cause)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.Throwable,​[QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream")>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Throwable> unapply​([QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.Failure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.Failure$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/QueueOfferResult.Failure$.html)*