---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategies.DropNew$.html
title: OverflowStrategies.DropNew$
---

# OverflowStrategies.DropNew$

## Content

Package [akka.stream](package-summary.html)
## Class OverflowStrategies.DropNew$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropNew\>
	- - akka.stream.OverflowStrategies.DropNew$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropNew>`

Enclosing class:
[OverflowStrategies](OverflowStrategies.html "class in akka.stream")

---

```
public static class OverflowStrategies.DropNew$
extends scala.runtime.AbstractFunction1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropNew>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.OverflowStrategies.DropNew$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [OverflowStrategies.DropNew$](OverflowStrategies.DropNew$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DropNew$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.OverflowStrategies.DropNew` | `[apply](#apply(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")>` | `[unapply](#unapply(akka.stream.OverflowStrategies.DropNew))​(akka.stream.OverflowStrategies.DropNew x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [OverflowStrategies.DropNew$](OverflowStrategies.DropNew$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DropNew$
		
		
		
		```
		public DropNew$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropNew>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropNew>`
		- #### apply
		
		
		
		```
		public akka.stream.OverflowStrategies.DropNew apply​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event"),​akka.stream.OverflowStrategies.DropNew>`
		- #### unapply
		
		
		
		```
		public scala.Option<[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")> unapply​(akka.stream.OverflowStrategies.DropNew x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategies.DropNew$.html
- https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategies.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategies.DropNew$.html](https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategies.DropNew$.html)*