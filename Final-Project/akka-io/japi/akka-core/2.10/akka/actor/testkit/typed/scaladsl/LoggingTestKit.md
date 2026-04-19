---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
title: LoggingTestKit
---

# LoggingTestKit

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Interface LoggingTestKit

- ---

```
public interface LoggingTestKit
```

Facilities for verifying logs.
 
 Requires Logback.
 

 See the companion object for convenient factory methods.
 

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T> T` | `[expect](#expect(scala.Function0,akka.actor.typed.ActorSystem))​(scala.Function0<T> code,  [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Run the given code block and assert that the criteria of this `LoggingTestKit` has  matched within the configured `akka.actor.testkit.typed.filter-leeway`  as often as requested by its `occurrences` parameter specifies. |
	| `<T> T` | `[intercept](#intercept(scala.Function0,akka.actor.typed.ActorSystem))​(scala.Function0<T> code,  [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Deprecated. Use expect instead. |
	| `boolean` | `[matches](#matches(akka.actor.testkit.typed.LoggingEvent))​([LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed") event)` |  |
	| `<A extends java.lang.Throwable>[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withCause](#withCause(scala.reflect.ClassTag))​(scala.reflect.ClassTag<A> evidence$1)` | Matching events with an included `throwable` that is a class or subclass of the given  `Throwable` `ClassTag`. |
	| `[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withCheckExcess](#withCheckExcess(boolean))​(boolean checkExcess)` | After matching the expected number of hits, check for excess messages |
	| `[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withCustom](#withCustom(scala.Function1))​(scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object> newCustom)` | Matching events for which the supplied function returns`true`. |
	| `[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withLoggerName](#withLoggerName(java.lang.String))​(java.lang.String newLoggerName)` | Matching events with the given logger name or sub\-names in the same way  as configuration loggers are configured in logback.xml. |
	| `[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withLogLevel](#withLogLevel(org.slf4j.event.Level))​(org.slf4j.event.Level newLogLevel)` | Matching events with the given log level. |
	| `[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withMdc](#withMdc(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> newMdc)` | Matching events with MDC containing all entries of the given `Map`. |
	| `[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withMessageContains](#withMessageContains(java.lang.String))​(java.lang.String newMessageContains)` | Matching events with a message that contains the given value. |
	| `[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withMessageRegex](#withMessageRegex(java.lang.String))​(java.lang.String newMessageRegex)` | Matching events with a message that matches the given regular expression. |
	| `[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withOccurrences](#withOccurrences(int))​(int newOccurrences)` | Number of events the testkit is supposed to match. |
	| `[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl")` | `[withSource](#withSource(java.lang.String))​(java.lang.String newSource)` | Matching events that have "akkaSource" MDC value equal to the given value. |

- - ### Method Detail
	
	
	
		- #### withOccurrences
		
		
		
		```
		[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withOccurrences​(int newOccurrences)
		```
		
		Number of events the testkit is supposed to match. By default 1\.
		 
		 When occurrences \> 0 it will not look for excess messages that are logged asynchronously
		 outside (after) the `expect` thunk and it has already found expected number.
		 
		
		
		 When occurrences is 0 it will look for unexpected matching events, and then it will
		 also look for excess messages during the configured `akka.actor.testkit.typed.expect-no-message-default`
		 duration.
		- #### withLogLevel
		
		
		
		```
		[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withLogLevel​(org.slf4j.event.Level newLogLevel)
		```
		
		Matching events with the given log level.
		- #### withLoggerName
		
		
		
		```
		[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withLoggerName​(java.lang.String newLoggerName)
		```
		
		Matching events with the given logger name or sub\-names in the same way
		 as configuration loggers are configured in logback.xml.
		 By default the root logger is used.
		- #### withSource
		
		
		
		```
		[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withSource​(java.lang.String newSource)
		```
		
		Matching events that have "akkaSource" MDC value equal to the given value.
		 "akkaSource" is typically the actor path.
		- #### withMessageContains
		
		
		
		```
		[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withMessageContains​(java.lang.String newMessageContains)
		```
		
		Matching events with a message that contains the given value.
		- #### withMessageRegex
		
		
		
		```
		[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withMessageRegex​(java.lang.String newMessageRegex)
		```
		
		Matching events with a message that matches the given regular expression.
		- #### withCause
		
		
		
		```
		<A extends java.lang.Throwable> [LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withCause​(scala.reflect.ClassTag<A> evidence$1)
		```
		
		Matching events with an included `throwable` that is a class or subclass of the given
		 `Throwable` `ClassTag`.
		- #### withMdc
		
		
		
		```
		[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withMdc​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> newMdc)
		```
		
		Matching events with MDC containing all entries of the given `Map`.
		 The event MDC may have more entries than the given `Map`.
		- #### withCheckExcess
		
		
		
		```
		[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withCheckExcess​(boolean checkExcess)
		```
		
		After matching the expected number of hits, check for excess messages
		- #### withCustom
		
		
		
		```
		[LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") withCustom​(scala.Function1<[LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed"),​java.lang.Object> newCustom)
		```
		
		Matching events for which the supplied function returns`true`.
		- #### matches
		
		
		
		```
		boolean matches​([LoggingEvent](../LoggingEvent.html "class in akka.actor.testkit.typed") event)
		```
		
		
		Returns:
		`true` if the event matches the conditions of the filter.
		- #### expect
		
		
		
		```
		<T> T expect​(scala.Function0<T> code,
		             [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Run the given code block and assert that the criteria of this `LoggingTestKit` has
		 matched within the configured `akka.actor.testkit.typed.filter-leeway`
		 as often as requested by its `occurrences` parameter specifies.
		 
		 Care is taken to remove the testkit when the block is finished or aborted.
		- #### intercept
		
		
		
		```
		<T> T intercept​(scala.Function0<T> code,
		                [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Deprecated.
		Use expect instead. Since 2\.6\.0\.
		
		Run the given code block and assert that the criteria of this `LoggingTestKit` has
		 matched within the configured `akka.actor.testkit.typed.filter-leeway`
		 as often as requested by its `occurrences` parameter specifies.
		 
		 Care is taken to remove the testkit when the block is finished or aborted.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html)*