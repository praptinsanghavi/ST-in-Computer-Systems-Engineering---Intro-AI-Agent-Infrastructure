---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
title: LoggingTestKit
---

# LoggingTestKit

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class LoggingTestKit

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.LoggingTestKit

- ---

```
public abstract class LoggingTestKit
extends java.lang.Object
```

Facilities for verifying logs.
 
 Requires Logback.
 

 See the static factory methods as starting point for creating `LoggingTestKit`.
 

 Not for user extension.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingTestKit](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[custom](#custom(scala.Function1))​(scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object> test)` | Create a custom event filter. |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[deadLetters](#deadLetters())()` | Filter for the logging of dead letters. |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[debug](#debug(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for DEBUG level events with a log message  that contains the given `messageIncludes`. |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[empty](#empty())()` | An empty filter that doesn't match any events. |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[error](#error(java.lang.Class))​(java.lang.Class<? extends java.lang.Throwable> causeClass)` | Create a filter for ERROR level events with a an included  `throwable` that is a class or subclass of the given  \* `Throwable` class. |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[error](#error(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for ERROR level events with a log message  that contains the given `messageIncludes`. |
	| `abstract <T> T` | `[expect](#expect(akka.actor.typed.ActorSystem,java.util.function.Supplier))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,  java.util.function.Supplier<T> code)` | Run the given code block and assert that the criteria of this `LoggingTestKit` has  matched within the configured `akka.actor.testkit.typed.filter-leeway`  as often as requested by its `occurrences` parameter specifies. |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[info](#info(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for INFO level events with a log message  that contains the given `messageIncludes`. |
	| `abstract boolean` | `[matches](#matches(akka.actor.testkit.typed.LoggingEvent))​([LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed") event)` |  |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[messageContains](#messageContains(java.lang.String))​(java.lang.String str)` | Create a filter for events with a log message  that contains the given `messageIncludes`. |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[trace](#trace(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for TRACE level events with a log message  that contains the given `messageIncludes`. |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[warn](#warn(java.lang.Class))​(java.lang.Class<java.lang.Throwable> causeClass)` | Create a filter for WARN level events with a an included  `throwable` that is a class or subclass of the given  \* `Throwable` class. |
	| `static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[warn](#warn(java.lang.String))​(java.lang.String messageIncludes)` | Create a filter for WARN level events with a log message  that contains the given `messageIncludes`. |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withCause](#withCause(java.lang.Class))​(java.lang.Class<? extends java.lang.Throwable> newCause)` | Matching events with an included `throwable` that is a class or subclass of the given  `Throwable` class. |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withCheckExcess](#withCheckExcess(boolean))​(boolean check)` | After matching the expected number of hits, check for excess messages |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withCustom](#withCustom(scala.Function1))​(scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object> newCustom)` | Matching events for which the supplied function returns `true`. |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withLoggerName](#withLoggerName(java.lang.String))​(java.lang.String newLoggerName)` | Matching events with the given logger name or sub\-names in the same way  as configuration loggers are configured in logback.xml. |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withLogLevel](#withLogLevel(org.slf4j.event.Level))​(org.slf4j.event.Level newLogLevel)` | Matching events with the given log level. |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withMdc](#withMdc(java.util.Map))​(java.util.Map<java.lang.String,​java.lang.String> newMdc)` | Matching events with MDC containing all entries of the given `Map`. |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withMessageContains](#withMessageContains(java.lang.String))​(java.lang.String newMessageContains)` | Matching events with a message that contains the given value. |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withMessageRegex](#withMessageRegex(java.lang.String))​(java.lang.String newMessageRegex)` | Matching events with a message that matches the given regular expression. |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withOccurrences](#withOccurrences(int))​(int newOccurrences)` | Number of events the testkit is supposed to match. |
	| `abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[withSource](#withSource(java.lang.String))​(java.lang.String newSource)` | Matching events that have "akkaSource" MDC value equal to the given value. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LoggingTestKit
		
		
		
		```
		public LoggingTestKit()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") empty()
		```
		
		An empty filter that doesn't match any events.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### messageContains
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") messageContains​(java.lang.String str)
		```
		
		Create a filter for events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### trace
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") trace​(java.lang.String messageIncludes)
		```
		
		Create a filter for TRACE level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### debug
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") debug​(java.lang.String messageIncludes)
		```
		
		Create a filter for DEBUG level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### info
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") info​(java.lang.String messageIncludes)
		```
		
		Create a filter for INFO level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### warn
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") warn​(java.lang.String messageIncludes)
		```
		
		Create a filter for WARN level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### warn
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") warn​(java.lang.Class<java.lang.Throwable> causeClass)
		```
		
		Create a filter for WARN level events with a an included
		 `throwable` that is a class or subclass of the given
		 \* `Throwable` class.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### error
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") error​(java.lang.String messageIncludes)
		```
		
		Create a filter for ERROR level events with a log message
		 that contains the given `messageIncludes`.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### error
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") error​(java.lang.Class<? extends java.lang.Throwable> causeClass)
		```
		
		Create a filter for ERROR level events with a an included
		 `throwable` that is a class or subclass of the given
		 \* `Throwable` class.
		 
		 More conditions can be added to the returned \[LoggingEventFilter].
		- #### custom
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") custom​(scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object> test)
		```
		
		Create a custom event filter. The filter will match those events for
		 which for which the supplied function returns `true`.
		- #### deadLetters
		
		
		
		```
		public static [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") deadLetters()
		```
		
		Filter for the logging of dead letters.
		- #### withOccurrences
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withOccurrences​(int newOccurrences)
		```
		
		Number of events the testkit is supposed to match. By default 1\.
		 
		 When occurrences \> 0 it will not look for excess messages that are logged asynchronously
		 outside (after) the `intercept` thunk and it has already found expected number.
		 
		
		
		 When occurrences is 0 it will look for unexpected matching events, and then it will
		 also look for excess messages during the configured `akka.actor.testkit.typed.expect-no-message-default`
		 duration.
		- #### withLogLevel
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withLogLevel​(org.slf4j.event.Level newLogLevel)
		```
		
		Matching events with the given log level.
		- #### withLoggerName
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withLoggerName​(java.lang.String newLoggerName)
		```
		
		Matching events with the given logger name or sub\-names in the same way
		 as configuration loggers are configured in logback.xml.
		 By default the root logger is used.
		- #### withSource
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withSource​(java.lang.String newSource)
		```
		
		Matching events that have "akkaSource" MDC value equal to the given value.
		 "akkaSource" is typically the actor path.
		- #### withMessageContains
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withMessageContains​(java.lang.String newMessageContains)
		```
		
		Matching events with a message that contains the given value.
		- #### withMessageRegex
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withMessageRegex​(java.lang.String newMessageRegex)
		```
		
		Matching events with a message that matches the given regular expression.
		- #### withCause
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withCause​(java.lang.Class<? extends java.lang.Throwable> newCause)
		```
		
		Matching events with an included `throwable` that is a class or subclass of the given
		 `Throwable` class.
		- #### withMdc
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withMdc​(java.util.Map<java.lang.String,​java.lang.String> newMdc)
		```
		
		Matching events with MDC containing all entries of the given `Map`.
		 The event MDC may have more entries than the given `Map`.
		- #### withCheckExcess
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withCheckExcess​(boolean check)
		```
		
		After matching the expected number of hits, check for excess messages
		- #### withCustom
		
		
		
		```
		public abstract [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") withCustom​(scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object> newCustom)
		```
		
		Matching events for which the supplied function returns `true`.
		- #### matches
		
		
		
		```
		public abstract boolean matches​([LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed") event)
		```
		
		
		Returns:
		`true` if the event matches the conditions of the filter.
		- #### expect
		
		
		
		```
		public abstract <T> T expect​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                             java.util.function.Supplier<T> code)
		```
		
		Run the given code block and assert that the criteria of this `LoggingTestKit` has
		 matched within the configured `akka.actor.testkit.typed.filter-leeway`
		 as often as requested by its `occurrences` parameter specifies.
		 
		 Care is taken to remove the testkit when the block is finished or aborted.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/LoggingTestKit.html)*