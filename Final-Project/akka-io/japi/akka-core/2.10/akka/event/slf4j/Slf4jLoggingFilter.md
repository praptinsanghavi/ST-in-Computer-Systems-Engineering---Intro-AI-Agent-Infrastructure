---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:34:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Slf4jLoggingFilter.html
title: Slf4jLoggingFilter
---

# Slf4jLoggingFilter

## Content

Package [akka.event.slf4j](package-summary.html)
## Class Slf4jLoggingFilter

- java.lang.Object
- - akka.event.slf4j.Slf4jLoggingFilter

- All Implemented Interfaces:
`[LoggingFilter](../LoggingFilter.html "interface in akka.event")`, `[LoggingFilterWithMarker](../LoggingFilterWithMarker.html "interface in akka.event")`

---

```
public class Slf4jLoggingFilter
extends java.lang.Object
implements [LoggingFilterWithMarker](../LoggingFilterWithMarker.html "interface in akka.event")
```

[`LoggingFilter`](../LoggingFilter.html "interface in akka.event") that uses the log level defined in the SLF4J
 backend configuration (e.g. logback.xml) to filter log events before publishing
 the log events to the `eventStream`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Slf4jLoggingFilter](#%3Cinit%3E(akka.actor.ActorSystem.Settings,akka.event.EventStream))​([ActorSystem.Settings](../../actor/ActorSystem.Settings.html "class in akka.actor") settings,  [EventStream](../EventStream.html "class in akka.event") eventStream)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))​(java.lang.Class<?> logClass,  java.lang.String logSource,  [LogMarker](../LogMarker.html "class in akka.event") marker)` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))​(java.lang.Class<?> logClass,  java.lang.String logSource,  [LogMarker](../LogMarker.html "class in akka.event") marker)` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))​(java.lang.Class<?> logClass,  java.lang.String logSource,  [LogMarker](../LogMarker.html "class in akka.event") marker)` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))​(java.lang.Class<?> logClass,  java.lang.String logSource,  [LogMarker](../LogMarker.html "class in akka.event") marker)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Slf4jLoggingFilter
		
		
		
		```
		public Slf4jLoggingFilter​([ActorSystem.Settings](../../actor/ActorSystem.Settings.html "class in akka.actor") settings,
		                          [EventStream](../EventStream.html "class in akka.event") eventStream)
		```

	- ### Method Detail
	
	
	
		- #### isDebugEnabled
		
		
		
		```
		public boolean isDebugEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource)
		```
		
		
		Specified by:
		`[isDebugEnabled](../LoggingFilter.html#isDebugEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](../LoggingFilter.html "interface in akka.event")`
		- #### isDebugEnabled
		
		
		
		```
		public boolean isDebugEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource,
		                              [LogMarker](../LogMarker.html "class in akka.event") marker)
		```
		
		
		Specified by:
		`[isDebugEnabled](../LoggingFilterWithMarker.html#isDebugEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))` in interface `[LoggingFilterWithMarker](../LoggingFilterWithMarker.html "interface in akka.event")`
		- #### isErrorEnabled
		
		
		
		```
		public boolean isErrorEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource)
		```
		
		
		Specified by:
		`[isErrorEnabled](../LoggingFilter.html#isErrorEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](../LoggingFilter.html "interface in akka.event")`
		- #### isErrorEnabled
		
		
		
		```
		public boolean isErrorEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource,
		                              [LogMarker](../LogMarker.html "class in akka.event") marker)
		```
		
		
		Specified by:
		`[isErrorEnabled](../LoggingFilterWithMarker.html#isErrorEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))` in interface `[LoggingFilterWithMarker](../LoggingFilterWithMarker.html "interface in akka.event")`
		- #### isInfoEnabled
		
		
		
		```
		public boolean isInfoEnabled​(java.lang.Class<?> logClass,
		                             java.lang.String logSource)
		```
		
		
		Specified by:
		`[isInfoEnabled](../LoggingFilter.html#isInfoEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](../LoggingFilter.html "interface in akka.event")`
		- #### isInfoEnabled
		
		
		
		```
		public boolean isInfoEnabled​(java.lang.Class<?> logClass,
		                             java.lang.String logSource,
		                             [LogMarker](../LogMarker.html "class in akka.event") marker)
		```
		
		
		Specified by:
		`[isInfoEnabled](../LoggingFilterWithMarker.html#isInfoEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))` in interface `[LoggingFilterWithMarker](../LoggingFilterWithMarker.html "interface in akka.event")`
		- #### isWarningEnabled
		
		
		
		```
		public boolean isWarningEnabled​(java.lang.Class<?> logClass,
		                                java.lang.String logSource)
		```
		
		
		Specified by:
		`[isWarningEnabled](../LoggingFilter.html#isWarningEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](../LoggingFilter.html "interface in akka.event")`
		- #### isWarningEnabled
		
		
		
		```
		public boolean isWarningEnabled​(java.lang.Class<?> logClass,
		                                java.lang.String logSource,
		                                [LogMarker](../LogMarker.html "class in akka.event") marker)
		```
		
		
		Specified by:
		`[isWarningEnabled](../LoggingFilterWithMarker.html#isWarningEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))` in interface `[LoggingFilterWithMarker](../LoggingFilterWithMarker.html "interface in akka.event")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Slf4jLoggingFilter.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Slf4jLoggingFilter.html)*