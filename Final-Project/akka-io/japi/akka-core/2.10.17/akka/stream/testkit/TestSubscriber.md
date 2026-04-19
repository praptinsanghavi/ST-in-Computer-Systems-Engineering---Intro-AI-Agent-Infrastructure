---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:55:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/TestSubscriber.OnSubscribe$.html
title: TestSubscriber.OnSubscribe$
---

# TestSubscriber.OnSubscribe$

## Content

Package [akka.stream.testkit](package-summary.html)
## Class TestSubscriber.OnSubscribe$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<org.reactivestreams.Subscription,​[TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")\>
	- - akka.stream.testkit.TestSubscriber.OnSubscribe$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<org.reactivestreams.Subscription,​[TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")>`

Enclosing class:
[TestSubscriber](TestSubscriber.html "class in akka.stream.testkit")

---

```
public static class TestSubscriber.OnSubscribe$
extends scala.runtime.AbstractFunction1<org.reactivestreams.Subscription,​[TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.testkit.TestSubscriber.OnSubscribe$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestSubscriber.OnSubscribe$](TestSubscriber.OnSubscribe$.html "class in akka.stream.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OnSubscribe$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")` | `[apply](#apply(org.reactivestreams.Subscription))​(org.reactivestreams.Subscription subscription)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<org.reactivestreams.Subscription>` | `[unapply](#unapply(akka.stream.testkit.TestSubscriber.OnSubscribe))​([TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestSubscriber.OnSubscribe$](TestSubscriber.OnSubscribe$.html "class in akka.stream.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### OnSubscribe$
		
		
		
		```
		public OnSubscribe$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<org.reactivestreams.Subscription,​[TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<org.reactivestreams.Subscription,​[TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")>`
		- #### apply
		
		
		
		```
		public [TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit") apply​(org.reactivestreams.Subscription subscription)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<org.reactivestreams.Subscription,​[TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit")>`
		- #### unapply
		
		
		
		```
		public scala.Option<org.reactivestreams.Subscription> unapply​([TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/TestSubscriber.OnSubscribe$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/TestSubscriber.OnSubscribe.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/TestSubscriber.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/TestSubscriber.OnSubscribe$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/TestSubscriber.OnSubscribe$.html)*