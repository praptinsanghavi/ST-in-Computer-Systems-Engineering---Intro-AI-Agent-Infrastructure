---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html
title: LoggingTestKit$
---

# LoggingTestKit$

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class LoggingTestKit$

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.LoggingTestKit$

- ---

```
public class LoggingTestKit$
extends java.lang.Object
```

Facilities for selectively matching log messages.
 
 Requires Logback.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LoggingTestKit$](LoggingTestKit$.html "class in akka.actor.testkit.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingTestKit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[custom](#custom(scala.Function1))​(scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object> test)` | Create a custom event filter. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[deadLetters](#deadLetters())()` | Filter for the logging of dead letters. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[debug](#debug(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for DEBUG level events with a log message  that contains the given `messageIncludes`. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[empty](#empty())()` | An empty filter that doesn't match any events. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[error](#error(java.lang.Class))​(java.lang.Class<? extends java.lang.Throwable> causeClass)` | Create a filter for ERROR level events with a an included  `throwable` that is a class or subclass of the given  \* `Throwable` class. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[error](#error(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for ERROR level events with a log message  that contains the given `messageIncludes`. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[info](#info(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for INFO level events with a log message  that contains the given `messageIncludes`. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[messageContains](#messageContains(java.lang.String))​(java.lang.String str)` | Create a filter for events with a log message  that contains the given `messageIncludes`. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[trace](#trace(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for TRACE level events with a log message  that contains the given `messageIncludes`. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[warn](#warn(java.lang.Class))​(java.lang.Class<java.lang.Throwable> causeClass)` | Create a filter for WARN level events with a an included  `throwable` that is a class or subclass of the given  \* `Throwable` class. |
	| `[LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[warn](#warn(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for WARN level events with a log message  that contains the given `messageIncludes`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LoggingTestKit$](LoggingTestKit$.html "class in akka.actor.testkit.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LoggingTestKit$
		
		
		
		```
		public LoggingTestKit$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") empty()
		```
		
		An empty filter that doesn't match any events.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### messageContains
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") messageContains​(java.lang.String str)
		```
		
		Create a filter for events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### trace
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") trace​(java.lang.String messageIncludes)
		```
		
		Create a filter for TRACE level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### debug
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") debug​(java.lang.String messageIncludes)
		```
		
		Create a filter for DEBUG level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### info
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") info​(java.lang.String messageIncludes)
		```
		
		Create a filter for INFO level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### warn
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") warn​(java.lang.String messageIncludes)
		```
		
		Create a filter for WARN level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### warn
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") warn​(java.lang.Class<java.lang.Throwable> causeClass)
		```
		
		Create a filter for WARN level events with a an included
		 `throwable` that is a class or subclass of the given
		 \* `Throwable` class.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### error
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") error​(java.lang.String messageIncludes)
		```
		
		Create a filter for ERROR level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### error
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") error​(java.lang.Class<? extends java.lang.Throwable> causeClass)
		```
		
		Create a filter for ERROR level events with a an included
		 `throwable` that is a class or subclass of the given
		 \* `Throwable` class.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### custom
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") custom​(scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object> test)
		```
		
		Create a custom event filter. The filter will match those events for
		 which for which the supplied function returns `true`.
		- #### deadLetters
		
		
		
		```
		public [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") deadLetters()
		```
		
		Filter for the logging of dead letters.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html)*