---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/jul/JavaLoggingFilter.html
title: JavaLoggingFilter
---

# JavaLoggingFilter

## Content

Package [akka.event.jul](package-summary.html)
## Class JavaLoggingFilter

- java.lang.Object
- - akka.event.jul.JavaLoggingFilter

- All Implemented Interfaces:
`[LoggingFilter](../LoggingFilter.html "interface in akka.event")`

---

```
public class JavaLoggingFilter
extends java.lang.Object
implements [LoggingFilter](../LoggingFilter.html "interface in akka.event")
```

Deprecated.
Use Slf4jLoggingFilter instead. Since 2\.6\.0\.

[`LoggingFilter`](../LoggingFilter.html "interface in akka.event") that uses the log level defined in the JUL
 backend configuration to filter log events before publishing
 the log events to the `eventStream`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JavaLoggingFilter](#%3Cinit%3E(akka.actor.ActorSystem.Settings,akka.event.EventStream))​([ActorSystem.Settings](../../actor/ActorSystem.Settings.html "class in akka.actor") settings,  [EventStream](../EventStream.html "class in akka.event") eventStream)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` | Deprecated. |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` | Deprecated. |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` | Deprecated. |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JavaLoggingFilter
		
		
		
		```
		public JavaLoggingFilter​([ActorSystem.Settings](../../actor/ActorSystem.Settings.html "class in akka.actor") settings,
		                         [EventStream](../EventStream.html "class in akka.event") eventStream)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### isDebugEnabled
		
		
		
		```
		public boolean isDebugEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource)
		```
		
		Deprecated.
		
		Specified by:
		`[isDebugEnabled](../LoggingFilter.html#isDebugEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](../LoggingFilter.html "interface in akka.event")`
		- #### isErrorEnabled
		
		
		
		```
		public boolean isErrorEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource)
		```
		
		Deprecated.
		
		Specified by:
		`[isErrorEnabled](../LoggingFilter.html#isErrorEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](../LoggingFilter.html "interface in akka.event")`
		- #### isInfoEnabled
		
		
		
		```
		public boolean isInfoEnabled​(java.lang.Class<?> logClass,
		                             java.lang.String logSource)
		```
		
		Deprecated.
		
		Specified by:
		`[isInfoEnabled](../LoggingFilter.html#isInfoEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](../LoggingFilter.html "interface in akka.event")`
		- #### isWarningEnabled
		
		
		
		```
		public boolean isWarningEnabled​(java.lang.Class<?> logClass,
		                                java.lang.String logSource)
		```
		
		Deprecated.
		
		Specified by:
		`[isWarningEnabled](../LoggingFilter.html#isWarningEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](../LoggingFilter.html "interface in akka.event")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka/current/akka/event/EventStream.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka/current/akka/event/jul/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/jul/JavaLoggingFilter.html](https://doc.akka.io/japi/akka/current/akka/event/jul/JavaLoggingFilter.html)*