---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent.html
title: LoggingEvent
---

# LoggingEvent

## Content

Package [akka.actor.testkit.typed](package-summary.html)
## Class LoggingEvent

- java.lang.Object
- - akka.actor.testkit.typed.LoggingEvent

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class LoggingEvent
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.testkit.typed.LoggingEvent)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingEvent](#%3Cinit%3E(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long,scala.Option,scala.Option,scala.collection.immutable.Map))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp,  scala.Option<org.slf4j.Marker> marker,  scala.Option<java.lang.Throwable> throwable,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed")` | `[apply](#apply(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp)` | Scala API |
	| `static [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed")` | `[apply](#apply(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long,scala.Option,scala.Option,scala.collection.immutable.Map))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp,  scala.Option<org.slf4j.Marker> marker,  scala.Option<java.lang.Throwable> throwable,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc)` | Representation of logging event when testing with [`LoggingTestKit`](scaladsl/LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")  or [`LoggingTestKit`](javadsl/LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl"). |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed")` | `[copy](#copy(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long,scala.Option,scala.Option,scala.collection.immutable.Map))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp,  scala.Option<org.slf4j.Marker> marker,  scala.Option<java.lang.Throwable> throwable,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc)` |  |
	| `org.slf4j.event.Level` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.lang.String` | `[copy$default$3](#copy$default$3())()` |  |
	| `java.lang.String` | `[copy$default$4](#copy$default$4())()` |  |
	| `long` | `[copy$default$5](#copy$default$5())()` |  |
	| `scala.Option<org.slf4j.Marker>` | `[copy$default$6](#copy$default$6())()` |  |
	| `scala.Option<java.lang.Throwable>` | `[copy$default$7](#copy$default$7())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[copy$default$8](#copy$default$8())()` |  |
	| `static [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed")` | `[create](#create(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp)` | Java API |
	| `static [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed")` | `[create](#create(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long,java.util.Optional,java.util.Optional,java.util.Map))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp,  java.util.Optional<org.slf4j.Marker> marker,  java.util.Optional<java.lang.Throwable> throwable,  java.util.Map<java.lang.String,​java.lang.String> mdc)` | Java API |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.util.Optional<org.slf4j.Marker>` | `[getMarker](#getMarker())()` | Java API |
	| `java.util.Map<java.lang.String,​java.lang.String>` | `[getMdc](#getMdc())()` | Java API |
	| `java.util.Optional<java.lang.Throwable>` | `[getThrowable](#getThrowable())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `org.slf4j.event.Level` | `[level](#level())()` |  |
	| `java.lang.String` | `[loggerName](#loggerName())()` |  |
	| `scala.Option<org.slf4j.Marker>` | `[marker](#marker())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[mdc](#mdc())()` |  |
	| `java.lang.String` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[threadName](#threadName())()` |  |
	| `scala.Option<java.lang.Throwable>` | `[throwable](#throwable())()` |  |
	| `long` | `[timeStamp](#timeStamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple8<org.slf4j.event.Level,​java.lang.String,​java.lang.String,​java.lang.String,​java.lang.Object,​scala.Option<org.slf4j.Marker>,​scala.Option<java.lang.Throwable>,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>>>` | `[unapply](#unapply(akka.actor.testkit.typed.LoggingEvent))​([LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### LoggingEvent
		
		
		
		```
		public LoggingEvent​(org.slf4j.event.Level level,
		                    java.lang.String loggerName,
		                    java.lang.String threadName,
		                    java.lang.String message,
		                    long timeStamp,
		                    scala.Option<org.slf4j.Marker> marker,
		                    scala.Option<java.lang.Throwable> throwable,
		                    scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") apply​(org.slf4j.event.Level level,
		                                 java.lang.String loggerName,
		                                 java.lang.String threadName,
		                                 java.lang.String message,
		                                 long timeStamp)
		```
		
		Scala API
		- #### create
		
		
		
		```
		public static [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") create​(org.slf4j.event.Level level,
		                                  java.lang.String loggerName,
		                                  java.lang.String threadName,
		                                  java.lang.String message,
		                                  long timeStamp)
		```
		
		Java API
		- #### create
		
		
		
		```
		public static [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") create​(org.slf4j.event.Level level,
		                                  java.lang.String loggerName,
		                                  java.lang.String threadName,
		                                  java.lang.String message,
		                                  long timeStamp,
		                                  java.util.Optional<org.slf4j.Marker> marker,
		                                  java.util.Optional<java.lang.Throwable> throwable,
		                                  java.util.Map<java.lang.String,​java.lang.String> mdc)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") apply​(org.slf4j.event.Level level,
		                                 java.lang.String loggerName,
		                                 java.lang.String threadName,
		                                 java.lang.String message,
		                                 long timeStamp,
		                                 scala.Option<org.slf4j.Marker> marker,
		                                 scala.Option<java.lang.Throwable> throwable,
		                                 scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc)
		```
		
		Representation of logging event when testing with [`LoggingTestKit`](scaladsl/LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")
		 or [`LoggingTestKit`](javadsl/LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl").
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple8<org.slf4j.event.Level,​java.lang.String,​java.lang.String,​java.lang.String,​java.lang.Object,​scala.Option<org.slf4j.Marker>,​scala.Option<java.lang.Throwable>,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>>> unapply​([LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") x$0)
		```
		- #### level
		
		
		
		```
		public org.slf4j.event.Level level()
		```
		- #### loggerName
		
		
		
		```
		public java.lang.String loggerName()
		```
		- #### threadName
		
		
		
		```
		public java.lang.String threadName()
		```
		- #### message
		
		
		
		```
		public java.lang.String message()
		```
		- #### timeStamp
		
		
		
		```
		public long timeStamp()
		```
		- #### marker
		
		
		
		```
		public scala.Option<org.slf4j.Marker> marker()
		```
		- #### throwable
		
		
		
		```
		public scala.Option<java.lang.Throwable> throwable()
		```
		- #### mdc
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc()
		```
		- #### getMarker
		
		
		
		```
		public java.util.Optional<org.slf4j.Marker> getMarker()
		```
		
		Java API
		- #### getThrowable
		
		
		
		```
		public java.util.Optional<java.lang.Throwable> getThrowable()
		```
		
		Java API
		- #### getMdc
		
		
		
		```
		public java.util.Map<java.lang.String,​java.lang.String> getMdc()
		```
		
		Java API
		- #### copy
		
		
		
		```
		public [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") copy​(org.slf4j.event.Level level,
		                         java.lang.String loggerName,
		                         java.lang.String threadName,
		                         java.lang.String message,
		                         long timeStamp,
		                         scala.Option<org.slf4j.Marker> marker,
		                         scala.Option<java.lang.Throwable> throwable,
		                         scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc)
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
		public java.lang.String copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public java.lang.String copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public long copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public scala.Option<org.slf4j.Marker> copy$default$6()
		```
		- #### copy$default$7
		
		
		
		```
		public scala.Option<java.lang.Throwable> copy$default$7()
		```
		- #### copy$default$8
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.String> copy$default$8()
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

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent.html)*