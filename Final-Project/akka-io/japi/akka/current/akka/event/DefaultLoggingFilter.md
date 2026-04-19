---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/DefaultLoggingFilter.html
title: DefaultLoggingFilter
---

# DefaultLoggingFilter

## Content

Package [akka.event](package-summary.html)
## Class DefaultLoggingFilter

- java.lang.Object
- - akka.event.DefaultLoggingFilter

- All Implemented Interfaces:
`[LoggingFilter](LoggingFilter.html "interface in akka.event")`, `[LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event")`

---

```
public class DefaultLoggingFilter
extends java.lang.Object
implements [LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultLoggingFilter](#%3Cinit%3E(akka.actor.ActorSystem.Settings,akka.event.EventStream))​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,  [EventStream](EventStream.html "class in akka.event") eventStream)` |  |
	| `[DefaultLoggingFilter](#%3Cinit%3E(scala.Function0))​(scala.Function0<[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")> logLevel)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.event.[LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event")
		
		
		`[isDebugEnabled](LoggingFilterWithMarker.html#isDebugEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker)), [isErrorEnabled](LoggingFilterWithMarker.html#isErrorEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker)), [isInfoEnabled](LoggingFilterWithMarker.html#isInfoEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker)), [isWarningEnabled](LoggingFilterWithMarker.html#isWarningEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))`

- - ### Constructor Detail
	
	
	
		- #### DefaultLoggingFilter
		
		
		
		```
		public DefaultLoggingFilter​(scala.Function0<[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")> logLevel)
		```
		- #### DefaultLoggingFilter
		
		
		
		```
		public DefaultLoggingFilter​([ActorSystem.Settings](../actor/ActorSystem.Settings.html "class in akka.actor") settings,
		                            [EventStream](EventStream.html "class in akka.event") eventStream)
		```

	- ### Method Detail
	
	
	
		- #### isDebugEnabled
		
		
		
		```
		public boolean isDebugEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource)
		```
		
		
		Specified by:
		`[isDebugEnabled](LoggingFilter.html#isDebugEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](LoggingFilter.html "interface in akka.event")`
		- #### isErrorEnabled
		
		
		
		```
		public boolean isErrorEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource)
		```
		
		
		Specified by:
		`[isErrorEnabled](LoggingFilter.html#isErrorEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](LoggingFilter.html "interface in akka.event")`
		- #### isInfoEnabled
		
		
		
		```
		public boolean isInfoEnabled​(java.lang.Class<?> logClass,
		                             java.lang.String logSource)
		```
		
		
		Specified by:
		`[isInfoEnabled](LoggingFilter.html#isInfoEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](LoggingFilter.html "interface in akka.event")`
		- #### isWarningEnabled
		
		
		
		```
		public boolean isWarningEnabled​(java.lang.Class<?> logClass,
		                                java.lang.String logSource)
		```
		
		
		Specified by:
		`[isWarningEnabled](LoggingFilter.html#isWarningEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](LoggingFilter.html "interface in akka.event")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka/current/akka/event/EventStream.html
- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/DefaultLoggingFilter.html](https://doc.akka.io/japi/akka/current/akka/event/DefaultLoggingFilter.html)*