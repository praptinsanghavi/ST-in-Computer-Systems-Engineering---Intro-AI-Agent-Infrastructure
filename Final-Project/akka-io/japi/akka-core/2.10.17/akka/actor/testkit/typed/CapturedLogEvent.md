---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html
title: CapturedLogEvent
---

# CapturedLogEvent

## Content

Package [akka.actor.testkit.typed](package-summary.html)
## Class CapturedLogEvent

- java.lang.Object
- - akka.actor.testkit.typed.CapturedLogEvent

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class CapturedLogEvent
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Representation of a Log Event issued by a [`Behavior`](../../typed/Behavior.html "class in akka.actor.typed")
 when testing with [`BehaviorTestKit`](scaladsl/BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")
 or [`BehaviorTestKit`](javadsl/BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl").

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.testkit.typed.CapturedLogEvent)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CapturedLogEvent](#%3Cinit%3E(org.slf4j.event.Level,java.lang.String))​(org.slf4j.event.Level level,  java.lang.String message)` | Constructor for Java API |
	| `[CapturedLogEvent](#%3Cinit%3E(org.slf4j.event.Level,java.lang.String,java.lang.Throwable))​(org.slf4j.event.Level level,  java.lang.String message,  java.lang.Throwable errorCause)` | Constructor for Java API |
	| `[CapturedLogEvent](#%3Cinit%3E(org.slf4j.event.Level,java.lang.String,java.lang.Throwable,org.slf4j.Marker))​(org.slf4j.event.Level level,  java.lang.String message,  java.lang.Throwable errorCause,  org.slf4j.Marker marker)` | Constructor for Java API |
	| `[CapturedLogEvent](#%3Cinit%3E(org.slf4j.event.Level,java.lang.String,java.util.Optional,java.util.Optional,java.util.Map))​(org.slf4j.event.Level level,  java.lang.String message,  java.util.Optional<java.lang.Throwable> errorCause,  java.util.Optional<org.slf4j.Marker> marker,  java.util.Map<java.lang.String,​java.lang.Object> mdc)` | Constructor for Java API |
	| `[CapturedLogEvent](#%3Cinit%3E(org.slf4j.event.Level,java.lang.String,org.slf4j.Marker))​(org.slf4j.event.Level level,  java.lang.String message,  org.slf4j.Marker marker)` | Constructor for Java API |
	| `[CapturedLogEvent](#%3Cinit%3E(org.slf4j.event.Level,java.lang.String,scala.Option,scala.Option))​(org.slf4j.event.Level level,  java.lang.String message,  scala.Option<java.lang.Throwable> cause,  scala.Option<org.slf4j.Marker> marker)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed")` | `[apply](#apply(org.slf4j.event.Level,java.lang.String))​(org.slf4j.event.Level level,  java.lang.String message)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.Option<java.lang.Throwable>` | `[cause](#cause())()` |  |
	| `[CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed")` | `[copy](#copy(org.slf4j.event.Level,java.lang.String,scala.Option,scala.Option))​(org.slf4j.event.Level level,  java.lang.String message,  scala.Option<java.lang.Throwable> cause,  scala.Option<org.slf4j.Marker> marker)` |  |
	| `org.slf4j.event.Level` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.Option<java.lang.Throwable>` | `[copy$default$3](#copy$default$3())()` |  |
	| `scala.Option<org.slf4j.Marker>` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.util.Optional<java.lang.Throwable>` | `[getErrorCause](#getErrorCause())()` |  |
	| `java.util.Optional<org.slf4j.Marker>` | `[getMarker](#getMarker())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `org.slf4j.event.Level` | `[level](#level())()` |  |
	| `scala.Option<org.slf4j.Marker>` | `[marker](#marker())()` |  |
	| `java.lang.String` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple4<org.slf4j.event.Level,​java.lang.String,​scala.Option<java.lang.Throwable>,​scala.Option<org.slf4j.Marker>>>` | `[unapply](#unapply(akka.actor.testkit.typed.CapturedLogEvent))​([CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### CapturedLogEvent
		
		
		
		```
		public CapturedLogEvent​(org.slf4j.event.Level level,
		                        java.lang.String message,
		                        scala.Option<java.lang.Throwable> cause,
		                        scala.Option<org.slf4j.Marker> marker)
		```
		- #### CapturedLogEvent
		
		
		
		```
		public CapturedLogEvent​(org.slf4j.event.Level level,
		                        java.lang.String message,
		                        java.util.Optional<java.lang.Throwable> errorCause,
		                        java.util.Optional<org.slf4j.Marker> marker,
		                        java.util.Map<java.lang.String,​java.lang.Object> mdc)
		```
		
		Constructor for Java API
		- #### CapturedLogEvent
		
		
		
		```
		public CapturedLogEvent​(org.slf4j.event.Level level,
		                        java.lang.String message)
		```
		
		Constructor for Java API
		- #### CapturedLogEvent
		
		
		
		```
		public CapturedLogEvent​(org.slf4j.event.Level level,
		                        java.lang.String message,
		                        java.lang.Throwable errorCause)
		```
		
		Constructor for Java API
		- #### CapturedLogEvent
		
		
		
		```
		public CapturedLogEvent​(org.slf4j.event.Level level,
		                        java.lang.String message,
		                        org.slf4j.Marker marker)
		```
		
		Constructor for Java API
		- #### CapturedLogEvent
		
		
		
		```
		public CapturedLogEvent​(org.slf4j.event.Level level,
		                        java.lang.String message,
		                        java.lang.Throwable errorCause,
		                        org.slf4j.Marker marker)
		```
		
		Constructor for Java API

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed") apply​(org.slf4j.event.Level level,
		                                     java.lang.String message)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<org.slf4j.event.Level,​java.lang.String,​scala.Option<java.lang.Throwable>,​scala.Option<org.slf4j.Marker>>> unapply​([CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed") x$0)
		```
		- #### level
		
		
		
		```
		public org.slf4j.event.Level level()
		```
		- #### message
		
		
		
		```
		public java.lang.String message()
		```
		- #### cause
		
		
		
		```
		public scala.Option<java.lang.Throwable> cause()
		```
		- #### marker
		
		
		
		```
		public scala.Option<org.slf4j.Marker> marker()
		```
		- #### getErrorCause
		
		
		
		```
		public java.util.Optional<java.lang.Throwable> getErrorCause()
		```
		- #### getMarker
		
		
		
		```
		public java.util.Optional<org.slf4j.Marker> getMarker()
		```
		- #### copy
		
		
		
		```
		public [CapturedLogEvent](CapturedLogEvent.html "class in akka.actor.testkit.typed") copy​(org.slf4j.event.Level level,
		                             java.lang.String message,
		                             scala.Option<java.lang.Throwable> cause,
		                             scala.Option<org.slf4j.Marker> marker)
		```
		- #### copy$default$1
		
		
		
		```
		public org.slf4j.event.Level copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.String copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public scala.Option<java.lang.Throwable> copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public scala.Option<org.slf4j.Marker> copy$default$4()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/CapturedLogEvent.html)*