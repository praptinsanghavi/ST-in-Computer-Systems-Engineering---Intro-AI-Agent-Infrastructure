---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent$.html
title: LoggingEvent$
---

# LoggingEvent$

## Content

Package [akka.actor.testkit.typed](package-summary.html)
## Class LoggingEvent$

- java.lang.Object
- - akka.actor.testkit.typed.LoggingEvent$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class LoggingEvent$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.testkit.typed.LoggingEvent$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LoggingEvent$](LoggingEvent$.html "class in akka.actor.testkit.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingEvent$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed")` | `[apply](#apply(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp)` | Scala API |
	| `[LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed")` | `[apply](#apply(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long,scala.Option,scala.Option,scala.collection.immutable.Map))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp,  scala.Option<org.slf4j.Marker> marker,  scala.Option<java.lang.Throwable> throwable,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> mdc)` | Representation of logging event when testing with [`LoggingTestKit`](scaladsl/LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")  or [`LoggingTestKit`](javadsl/LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl"). |
	| `[LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed")` | `[create](#create(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp)` | Java API |
	| `[LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed")` | `[create](#create(org.slf4j.event.Level,java.lang.String,java.lang.String,java.lang.String,long,java.util.Optional,java.util.Optional,java.util.Map))​(org.slf4j.event.Level level,  java.lang.String loggerName,  java.lang.String threadName,  java.lang.String message,  long timeStamp,  java.util.Optional<org.slf4j.Marker> marker,  java.util.Optional<java.lang.Throwable> throwable,  java.util.Map<java.lang.String,​java.lang.String> mdc)` | Java API |
	| `scala.Option<scala.Tuple8<org.slf4j.event.Level,​java.lang.String,​java.lang.String,​java.lang.String,​java.lang.Object,​scala.Option<org.slf4j.Marker>,​scala.Option<java.lang.Throwable>,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>>>` | `[unapply](#unapply(akka.actor.testkit.typed.LoggingEvent))​([LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LoggingEvent$](LoggingEvent$.html "class in akka.actor.testkit.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LoggingEvent$
		
		
		
		```
		public LoggingEvent$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") apply​(org.slf4j.event.Level level,
		                          java.lang.String loggerName,
		                          java.lang.String threadName,
		                          java.lang.String message,
		                          long timeStamp)
		```
		
		Scala API
		- #### create
		
		
		
		```
		public [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") create​(org.slf4j.event.Level level,
		                           java.lang.String loggerName,
		                           java.lang.String threadName,
		                           java.lang.String message,
		                           long timeStamp)
		```
		
		Java API
		- #### create
		
		
		
		```
		public [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") create​(org.slf4j.event.Level level,
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
		public [LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") apply​(org.slf4j.event.Level level,
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
		public scala.Option<scala.Tuple8<org.slf4j.event.Level,​java.lang.String,​java.lang.String,​java.lang.String,​java.lang.Object,​scala.Option<org.slf4j.Marker>,​scala.Option<java.lang.Throwable>,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>>> unapply​([LoggingEvent](LoggingEvent.html "class in akka.actor.testkit.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent$.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent$.html)*