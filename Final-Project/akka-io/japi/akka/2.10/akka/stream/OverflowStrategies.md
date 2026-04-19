---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:03:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/OverflowStrategies.Fail$.html
title: OverflowStrategies.Fail$
---

# OverflowStrategies.Fail$

## Content

Package [akka.stream](package-summary.html)
## Class OverflowStrategies.Fail$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.Fail\>
	- - akka.stream.OverflowStrategies.Fail$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.Fail>`

Enclosing class:
[OverflowStrategies](OverflowStrategies.html "class in akka.stream")

---

```
public static class OverflowStrategies.Fail$
extends scala.runtime.AbstractFunction1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.Fail>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.OverflowStrategies.Fail$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [OverflowStrategies.Fail$](OverflowStrategies.Fail$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Fail$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.OverflowStrategies.Fail` | `[apply](#apply(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")>` | `[unapply](#unapply(akka.stream.OverflowStrategies.Fail))​(akka.stream.OverflowStrategies.Fail x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [OverflowStrategies.Fail$](OverflowStrategies.Fail$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Fail$
		
		
		
		```
		public Fail$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.Fail>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.Fail>`
		- #### apply
		
		
		
		```
		public akka.stream.OverflowStrategies.Fail apply​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.Fail>`
		- #### unapply
		
		
		
		```
		public scala.Option<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")> unapply​(akka.stream.OverflowStrategies.Fail x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/OverflowStrategies.Fail$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/OverflowStrategies.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/OverflowStrategies.Fail$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/OverflowStrategies.Fail$.html)*