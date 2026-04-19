---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LoggingBus.html
title: LoggingBus
---

# LoggingBus

## Content

Package [akka.event](package-summary.html)
## Interface LoggingBus

- All Superinterfaces:
`[ActorEventBus](ActorEventBus.html "interface in akka.event")`, `[EventBus](EventBus.html "interface in akka.event")`

All Known Implementing Classes:
`[EventStream](EventStream.html "class in akka.event")`

---

```
public interface LoggingBus
extends [ActorEventBus](ActorEventBus.html "interface in akka.event")
```

This trait brings log level handling to the EventStream: it reads the log
 levels for the initial logging (StandardOutLogger) and the loggers \& level
 for after\-init logging, possibly keeping the StandardOutLogger enabled if
 it is part of the configured loggers. All configured loggers are treated as
 system services and managed by this trait, i.e. subscribed/unsubscribed in
 response to changes of LoggingBus.logLevel.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_logLevel_$eq](#_logLevel_$eq(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") x$1)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[addLogger](#addLogger(akka.actor.ActorSystemImpl,java.lang.Class,akka.event.Logging.LogLevel,java.lang.String))​(akka.actor.ActorSystemImpl system,  java.lang.Class<? extends [Actor](../actor/Actor.html "interface in akka.actor")> clazz,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String logName)` | INTERNAL API |
	| `void` | `[loggers_$eq](#loggers_$eq(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[ActorRef](../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")` | `[logLevel](#logLevel())()` | Query currently set log level. |
	| `void` | `[setLogLevel](#setLogLevel(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level)` | Change log level: default loggers (i.e. |
	| `void` | `[setUpStdoutLogger](#setUpStdoutLogger(akka.actor.ActorSystem.Settings))​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") config)` |  |
	| `void` | `[startDefaultLoggers](#startDefaultLoggers(akka.actor.ActorSystemImpl))​(akka.actor.ActorSystemImpl system)` | Internal Akka use only |
	| `void` | `[startStdoutLogger](#startStdoutLogger(akka.actor.ActorSystem.Settings))​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") config)` | Internal Akka use only |
	| `void` | `[stopDefaultLoggers](#stopDefaultLoggers(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from interface akka.event.[ActorEventBus](ActorEventBus.html "interface in akka.event")
		
		
		`[compareSubscribers](ActorEventBus.html#compareSubscribers(akka.actor.ActorRef,akka.actor.ActorRef))`
		- ### Methods inherited from interface akka.event.[EventBus](EventBus.html "interface in akka.event")
		
		
		`[publish](EventBus.html#publish(akka.event.EventBus)), [subscribe](EventBus.html#subscribe(akka.event.EventBus,akka.event.EventBus)), [unsubscribe](EventBus.html#unsubscribe(akka.event.EventBus)), [unsubscribe](EventBus.html#unsubscribe(akka.event.EventBus,akka.event.EventBus))`

- - ### Method Detail
	
	
	
		- #### \_logLevel\_$eq
		
		
		
		```
		void _logLevel_$eq​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") x$1)
		```
		- #### addLogger
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") addLogger​(akka.actor.ActorSystemImpl system,
		                   java.lang.Class<? extends [Actor](../actor/Actor.html "interface in akka.actor")> clazz,
		                   [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		                   java.lang.String logName)
		```
		
		INTERNAL API
		- #### logLevel
		
		
		
		```
		[Logging.LogLevel](Logging.LogLevel.html "class in akka.event") logLevel()
		```
		
		Query currently set log level. See object Logging for more information.
		- #### loggers\_$eq
		
		
		
		```
		void loggers_$eq​(scala.collection.immutable.Seq<[ActorRef](../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### setLogLevel
		
		
		
		```
		void setLogLevel​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level)
		```
		
		Change log level: default loggers (i.e. from configuration file) are
		 subscribed/unsubscribed as necessary so that they listen to all levels
		 which are at least as severe as the given one. See object Logging for
		 more information.
		 
		 NOTE: if the StandardOutLogger is configured also as normal logger, it
		 will not participate in the automatic management of log level
		 subscriptions!
		- #### setUpStdoutLogger
		
		
		
		```
		void setUpStdoutLogger​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") config)
		```
		- #### startDefaultLoggers
		
		
		
		```
		void startDefaultLoggers​(akka.actor.ActorSystemImpl system)
		```
		
		Internal Akka use only
		- #### startStdoutLogger
		
		
		
		```
		void startStdoutLogger​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") config)
		```
		
		Internal Akka use only
		- #### stopDefaultLoggers
		
		
		
		```
		void stopDefaultLoggers​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/ActorEventBus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventBus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LoggingBus.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LoggingBus.html)*