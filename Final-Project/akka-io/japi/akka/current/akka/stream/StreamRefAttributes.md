---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes.SubscriptionTimeout$.html
title: StreamRefAttributes.SubscriptionTimeout$
---

# StreamRefAttributes.SubscriptionTimeout$

## Content

Package [akka.stream](package-summary.html)
## Class StreamRefAttributes.SubscriptionTimeout$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​[StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream")\>
	- - akka.stream.StreamRefAttributes.SubscriptionTimeout$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.concurrent.duration.FiniteDuration,​[StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream")>`

Enclosing class:
[StreamRefAttributes](StreamRefAttributes.html "class in akka.stream")

---

```
public static class StreamRefAttributes.SubscriptionTimeout$
extends scala.runtime.AbstractFunction1<scala.concurrent.duration.FiniteDuration,​[StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.StreamRefAttributes.SubscriptionTimeout$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamRefAttributes.SubscriptionTimeout$](StreamRefAttributes.SubscriptionTimeout$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SubscriptionTimeout$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream")` | `[apply](#apply(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.concurrent.duration.FiniteDuration>` | `[unapply](#unapply(akka.stream.StreamRefAttributes.SubscriptionTimeout))​([StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamRefAttributes.SubscriptionTimeout$](StreamRefAttributes.SubscriptionTimeout$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SubscriptionTimeout$
		
		
		
		```
		public SubscriptionTimeout$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.concurrent.duration.FiniteDuration,​[StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.concurrent.duration.FiniteDuration,​[StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream")>`
		- #### apply
		
		
		
		```
		public [StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream") apply​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.concurrent.duration.FiniteDuration,​[StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.concurrent.duration.FiniteDuration> unapply​([StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes.SubscriptionTimeout$.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes.SubscriptionTimeout.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes.SubscriptionTimeout$.html](https://doc.akka.io/japi/akka/current/akka/stream/StreamRefAttributes.SubscriptionTimeout$.html)*