---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/Logging$.html
title: Logging$
---

# Logging$

## Content

Package [akka.event](package-summary.html)
## Class Logging$

- java.lang.Object
- - akka.event.Logging$

- ---

```
public class Logging$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Logging$](Logging$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Logging$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")>` | `[AllLogLevels](#AllLogLevels())()` |  |
	| `[DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "interface in akka.event")` | `[apply](#apply(akka.actor.Actor))​([Actor](../actor/Actor.html "interface in akka.actor") logSource)` | Obtain LoggingAdapter with MDC support for the given actor. |
	| `<T> [LoggingAdapter](LoggingAdapter.html "interface in akka.event")` | `[apply](#apply(akka.actor.ActorSystem,T,akka.event.LogSource))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  T logSource,  [LogSource](LogSource.html "interface in akka.event")<T> evidence$3)` | Obtain LoggingAdapter for the given actor system and source object. |
	| `<T> [LoggingAdapter](LoggingAdapter.html "interface in akka.event")` | `[apply](#apply(akka.event.LoggingBus,T,akka.event.LogSource))​([LoggingBus](LoggingBus.html "interface in akka.event") bus,  T logSource,  [LogSource](LogSource.html "interface in akka.event")<T> evidence$5)` | Obtain LoggingAdapter for the given logging bus and source object. |
	| `java.lang.Class<? extends [Logging.LogEvent](Logging.LogEvent.html "interface in akka.event")>` | `[classFor](#classFor(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level)` | Returns the event class associated with the given LogLevel |
	| `[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")` | `[DebugLevel](#DebugLevel())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[emptyMDC](#emptyMDC())()` | LoggingAdapter extension which adds MDC support. |
	| `[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")` | `[ErrorLevel](#ErrorLevel())()` |  |
	| `[DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "interface in akka.event")` | `[getLogger](#getLogger(akka.actor.Actor))​([Actor](../actor/Actor.html "interface in akka.actor") logSource)` | Obtain LoggingAdapter with MDC support for the given actor. |
	| `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")` | `[getLogger](#getLogger(akka.actor.ActorSystem,java.lang.Object))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  java.lang.Object logSource)` | Obtain LoggingAdapter for the given actor system and source object. |
	| `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")` | `[getLogger](#getLogger(akka.event.LoggingBus,java.lang.Object))​([LoggingBus](LoggingBus.html "interface in akka.event") bus,  java.lang.Object logSource)` | Obtain LoggingAdapter for the given logging bus and source object. |
	| `[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")` | `[InfoLevel](#InfoLevel())()` |  |
	| `[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")` | `[levelFor](#levelFor(java.lang.Class))​(java.lang.Class<? extends [Logging.LogEvent](Logging.LogEvent.html "interface in akka.event")> eventClass)` | Returns the LogLevel associated with the given event class. |
	| `scala.Option<[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")>` | `[levelFor](#levelFor(java.lang.String))​(java.lang.String s)` |  |
	| `[Logging.LoggerInitialized$](Logging.LoggerInitialized$.html "class in akka.event")` | `[loggerInitialized](#loggerInitialized())()` |  |
	| `java.lang.String` | `[messageClassName](#messageClassName(java.lang.Object))​(java.lang.Object message)` |  |
	| `akka.event.Logging.Error.NoCause$` | `[noCause](#noCause())()` |  |
	| `java.lang.String` | `[simpleName](#simpleName(java.lang.Class))​(java.lang.Class<?> clazz)` |  |
	| `java.lang.String` | `[simpleName](#simpleName(java.lang.Object))​(java.lang.Object obj)` |  |
	| `java.lang.String` | `[stackTraceFor](#stackTraceFor(java.lang.Throwable))​(java.lang.Throwable e)` |  |
	| `[Logging.StandardOutLogger](Logging.StandardOutLogger.html "class in akka.event")` | `[StandardOutLogger](#StandardOutLogger())()` |  |
	| `[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")` | `[WarningLevel](#WarningLevel())()` |  |
	| `[DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html "class in akka.event")` | `[withMarker](#withMarker(akka.actor.Actor))​([Actor](../actor/Actor.html "interface in akka.actor") logSource)` |  |
	| `<T> [MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")` | `[withMarker](#withMarker(akka.actor.ActorSystem,T,akka.event.LogSource))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  T logSource,  [LogSource](LogSource.html "interface in akka.event")<T> evidence$4)` | Obtain LoggingAdapter with additional "marker" support (which some logging frameworks are able to utilise)  for the given actor system and source object. |
	| `<T> [MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")` | `[withMarker](#withMarker(akka.event.LoggingBus,T,akka.event.LogSource))​([LoggingBus](LoggingBus.html "interface in akka.event") bus,  T logSource,  [LogSource](LogSource.html "interface in akka.event")<T> evidence$6)` | Obtain LoggingAdapter for the given logging bus and source object. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Logging$](Logging$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Logging$
		
		
		
		```
		public Logging$()
		```

	- ### Method Detail
	
	
	
		- #### simpleName
		
		
		
		```
		public java.lang.String simpleName​(java.lang.Object obj)
		```
		- #### simpleName
		
		
		
		```
		public java.lang.String simpleName​(java.lang.Class<?> clazz)
		```
		- #### messageClassName
		
		
		
		```
		public java.lang.String messageClassName​(java.lang.Object message)
		```
		- #### ErrorLevel
		
		
		
		```
		public final [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") ErrorLevel()
		```
		- #### WarningLevel
		
		
		
		```
		public final [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") WarningLevel()
		```
		- #### InfoLevel
		
		
		
		```
		public final [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") InfoLevel()
		```
		- #### DebugLevel
		
		
		
		```
		public final [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") DebugLevel()
		```
		- #### levelFor
		
		
		
		```
		public scala.Option<[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")> levelFor​(java.lang.String s)
		```
		- #### levelFor
		
		
		
		```
		public [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") levelFor​(java.lang.Class<? extends [Logging.LogEvent](Logging.LogEvent.html "interface in akka.event")> eventClass)
		```
		
		Returns the LogLevel associated with the given event class.
		 Defaults to DebugLevel.
		- #### classFor
		
		
		
		```
		public java.lang.Class<? extends [Logging.LogEvent](Logging.LogEvent.html "interface in akka.event")> classFor​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level)
		```
		
		Returns the event class associated with the given LogLevel
		- #### AllLogLevels
		
		
		
		```
		public scala.collection.immutable.Seq<[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")> AllLogLevels()
		```
		- #### apply
		
		
		
		```
		public <T> [LoggingAdapter](LoggingAdapter.html "interface in akka.event") apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                T logSource,
		                                [LogSource](LogSource.html "interface in akka.event")<T> evidence$3)
		```
		
		Obtain LoggingAdapter for the given actor system and source object. This
		 will use the system\&rsquo;s event stream and include the system\&rsquo;s address in the
		 log source string.
		 
		**Do not use this if you want to supply a log category string (like
		 \&ldquo;com.example.app.whatever\&rdquo;) unaltered,** supply `system.eventStream` in this
		 case or use
		 
		
		
		
		
		
		```
		
		 Logging(system, this.getClass)
		 
		```
		
		
		 The source is used to identify the source of this logging channel and
		 must have a corresponding implicit LogSource\[T] instance in scope; by
		 default these are provided for Class\[\_], Actor, ActorRef and String types.
		 See the companion object of [`LogSource`](LogSource.html "interface in akka.event") for details.
		 
		
		
		 You can add your own rules quite easily, see [`LogSource`](LogSource.html "interface in akka.event").
		- #### withMarker
		
		
		
		```
		public <T> [MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event") withMarker​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                           T logSource,
		                                           [LogSource](LogSource.html "interface in akka.event")<T> evidence$4)
		```
		
		Obtain LoggingAdapter with additional "marker" support (which some logging frameworks are able to utilise)
		 for the given actor system and source object. This will use the system\&rsquo;s event stream and include the system\&rsquo;s
		 address in the log source string.
		 
		**Do not use this if you want to supply a log category string (like
		 \&ldquo;com.example.app.whatever\&rdquo;) unaltered,** supply `system.eventStream` in this
		 case or use
		 
		
		
		
		
		
		```
		
		 Logging(system, this.getClass)
		 
		```
		
		
		 The source is used to identify the source of this logging channel and
		 must have a corresponding implicit LogSource\[T] instance in scope; by
		 default these are provided for Class\[\_], Actor, ActorRef and String types.
		 See the companion object of [`LogSource`](LogSource.html "interface in akka.event") for details.
		 
		
		
		 You can add your own rules quite easily, see [`LogSource`](LogSource.html "interface in akka.event").
		- #### apply
		
		
		
		```
		public <T> [LoggingAdapter](LoggingAdapter.html "interface in akka.event") apply​([LoggingBus](LoggingBus.html "interface in akka.event") bus,
		                                T logSource,
		                                [LogSource](LogSource.html "interface in akka.event")<T> evidence$5)
		```
		
		Obtain LoggingAdapter for the given logging bus and source object.
		 
		 The source is used to identify the source of this logging channel and
		 must have a corresponding implicit LogSource\[T] instance in scope; by
		 default these are provided for Class\[\_], Actor, ActorRef and String types.
		 See the companion object of [`LogSource`](LogSource.html "interface in akka.event") for details.
		 
		
		
		 You can add your own rules quite easily, see [`LogSource`](LogSource.html "interface in akka.event").
		 
		
		
		 Note that this `LoggingAdapter` will use the [`DefaultLoggingFilter`](DefaultLoggingFilter.html "class in akka.event"),
		 and not the [`LoggingFilter`](LoggingFilter.html "interface in akka.event") configured for the system
		 (if different from `DefaultLoggingFilter`).
		- #### withMarker
		
		
		
		```
		public <T> [MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event") withMarker​([LoggingBus](LoggingBus.html "interface in akka.event") bus,
		                                           T logSource,
		                                           [LogSource](LogSource.html "interface in akka.event")<T> evidence$6)
		```
		
		Obtain LoggingAdapter for the given logging bus and source object.
		 
		 The source is used to identify the source of this logging channel and
		 must have a corresponding implicit LogSource\[T] instance in scope; by
		 default these are provided for Class\[\_], Actor, ActorRef and String types.
		 See the companion object of [`LogSource`](LogSource.html "interface in akka.event") for details.
		 
		
		
		 You can add your own rules quite easily, see [`LogSource`](LogSource.html "interface in akka.event").
		 
		
		
		 Note that this `LoggingAdapter` will use the [`DefaultLoggingFilter`](DefaultLoggingFilter.html "class in akka.event"),
		 and not the [`LoggingFilter`](LoggingFilter.html "interface in akka.event") configured for the system
		 (if different from `DefaultLoggingFilter`).
		- #### apply
		
		
		
		```
		public [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "interface in akka.event") apply​([Actor](../actor/Actor.html "interface in akka.actor") logSource)
		```
		
		Obtain LoggingAdapter with MDC support for the given actor.
		 Don't use it outside its specific Actor as it isn't thread safe
		- #### withMarker
		
		
		
		```
		public [DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html "class in akka.event") withMarker​([Actor](../actor/Actor.html "interface in akka.actor") logSource)
		```
		- #### getLogger
		
		
		
		```
		public [LoggingAdapter](LoggingAdapter.html "interface in akka.event") getLogger​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                                java.lang.Object logSource)
		```
		
		Obtain LoggingAdapter for the given actor system and source object. This
		 will use the system\&rsquo;s event stream and include the system\&rsquo;s address in the
		 log source string.
		 
		**Do not use this if you want to supply a log category string (like
		 \&ldquo;com.example.app.whatever\&rdquo;) unaltered,** supply `system.eventStream` in this
		 case or use
		 
		
		
		
		
		
		```
		
		 Logging.getLogger(system, this.getClass());
		 
		```
		
		
		 The source is used to identify the source of this logging channel and
		 must have a corresponding implicit LogSource\[T] instance in scope; by
		 default these are provided for Class\[\_], Actor, ActorRef and String types.
		 See the companion object of [`LogSource`](LogSource.html "interface in akka.event") for details.
		- #### getLogger
		
		
		
		```
		public [LoggingAdapter](LoggingAdapter.html "interface in akka.event") getLogger​([LoggingBus](LoggingBus.html "interface in akka.event") bus,
		                                java.lang.Object logSource)
		```
		
		Obtain LoggingAdapter for the given logging bus and source object.
		 
		 The source is used to identify the source of this logging channel and
		 must have a corresponding implicit LogSource\[T] instance in scope; by
		 default these are provided for Class\[\_], Actor, ActorRef and String types.
		 See the companion object of [`LogSource`](LogSource.html "interface in akka.event") for details.
		 
		
		
		 Note that this `LoggingAdapter` will use the [`DefaultLoggingFilter`](DefaultLoggingFilter.html "class in akka.event"),
		 and not the [`LoggingFilter`](LoggingFilter.html "interface in akka.event") configured for the system
		 (if different from `DefaultLoggingFilter`).
		- #### getLogger
		
		
		
		```
		public [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "interface in akka.event") getLogger​([Actor](../actor/Actor.html "interface in akka.actor") logSource)
		```
		
		Obtain LoggingAdapter with MDC support for the given actor.
		 Don't use it outside its specific Actor as it isn't thread safe
		- #### noCause
		
		
		
		```
		public akka.event.Logging.Error.NoCause$ noCause()
		```
		- #### loggerInitialized
		
		
		
		```
		public [Logging.LoggerInitialized$](Logging.LoggerInitialized$.html "class in akka.event") loggerInitialized()
		```
		- #### StandardOutLogger
		
		
		
		```
		public [Logging.StandardOutLogger](Logging.StandardOutLogger.html "class in akka.event") StandardOutLogger()
		```
		- #### stackTraceFor
		
		
		
		```
		public java.lang.String stackTraceFor​(java.lang.Throwable e)
		```
		- #### emptyMDC
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.Object> emptyMDC()
		```
		
		LoggingAdapter extension which adds MDC support.
		 Only recommended to be used within Actors as it isn't thread safe.

## Code Examples

### Example 1: apply

```text
Logging(system, this.getClass)
```

### Example 2: withMarker

```text
Logging(system, this.getClass)
```

### Example 3: getLogger

```text
Logging.getLogger(system, this.getClass());
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/event/DefaultLoggingFilter.html
- https://doc.akka.io/japi/akka/current/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/event/LogSource.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging$.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.LoggerInitialized$.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.StandardOutLogger.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingBus.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/Logging$.html](https://doc.akka.io/japi/akka/current/akka/event/Logging$.html)*