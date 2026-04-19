---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/NoMarkerLogging.html
title: NoMarkerLogging
---

# NoMarkerLogging

## Content

Package [akka.event](package-summary.html)
## Class NoMarkerLogging

- java.lang.Object
- - akka.event.NoMarkerLogging

- ---

```
public class NoMarkerLogging
extends java.lang.Object
```

NoLogging is a MarkerLoggingAdapter that does absolutely nothing – no logging at all.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoMarkerLogging](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LoggingBus](LoggingBus.html "interface in akka.event")` | `[bus](#bus())()` |  |
	| `static void` | `[debug](#debug(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` |  |
	| `static void` | `[debug](#debug(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `static void` | `[debug](#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `static void` | `[debug](#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `static void` | `[debug](#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String message)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `static void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `static java.lang.String` | `[format](#format(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String t,  scala.collection.immutable.Seq<java.lang.Object> arg)` |  |
	| `static [NoMarkerLogging$](NoMarkerLogging$.html "class in akka.event")` | `[getInstance](#getInstance())()` | Java API to return the reference to NoLogging |
	| `static void` | `[info](#info(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` |  |
	| `static void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `static void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `static void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `static boolean` | `[isDebugEnabled](#isDebugEnabled())()` |  |
	| `static boolean` | `[isEnabled](#isEnabled(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level)` |  |
	| `static boolean` | `[isErrorEnabled](#isErrorEnabled())()` |  |
	| `static boolean` | `[isInfoEnabled](#isInfoEnabled())()` |  |
	| `static boolean` | `[isWarningEnabled](#isWarningEnabled())()` |  |
	| `static void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String message)` |  |
	| `static void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `static void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `static void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `static void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `static void` | `[log](#log(akka.event.LogMarker,akka.event.Logging.LogLevel,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String message)` |  |
	| `static java.lang.Class<?>` | `[logClass](#logClass())()` |  |
	| `static [LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event")` | `[loggingFilterWithMarker](#loggingFilterWithMarker())()` |  |
	| `static java.lang.String` | `[logSource](#logSource())()` |  |
	| `static scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[mdc](#mdc())()` |  |
	| `protected static void` | `[notifyDebug](#notifyDebug(java.lang.String))​(java.lang.String message)` |  |
	| `protected static void` | `[notifyError](#notifyError(java.lang.String))​(java.lang.String message)` |  |
	| `protected static void` | `[notifyError](#notifyError(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `protected static void` | `[notifyInfo](#notifyInfo(java.lang.String))​(java.lang.String message)` |  |
	| `static void` | `[notifyLog](#notifyLog(akka.event.Logging.LogLevel,java.lang.String))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String message)` |  |
	| `protected static void` | `[notifyWarning](#notifyWarning(java.lang.String))​(java.lang.String message)` |  |
	| `protected static void` | `[notifyWarning](#notifyWarning(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `static void` | `[warning](#warning(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` |  |
	| `static void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `static void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `static void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `static void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoMarkerLogging
		
		
		
		```
		public NoMarkerLogging()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [NoMarkerLogging$](NoMarkerLogging$.html "class in akka.event") getInstance()
		```
		
		Java API to return the reference to NoLogging
		
		Returns:
		The NoLogging instance
		- #### isErrorEnabled
		
		
		
		```
		public static final boolean isErrorEnabled()
		```
		- #### isWarningEnabled
		
		
		
		```
		public static final boolean isWarningEnabled()
		```
		- #### isInfoEnabled
		
		
		
		```
		public static final boolean isInfoEnabled()
		```
		- #### isDebugEnabled
		
		
		
		```
		public static final boolean isDebugEnabled()
		```
		- #### notifyError
		
		
		
		```
		protected static final void notifyError​(java.lang.String message)
		```
		- #### notifyError
		
		
		
		```
		protected static final void notifyError​(java.lang.Throwable cause,
		                                        java.lang.String message)
		```
		- #### notifyWarning
		
		
		
		```
		protected static final void notifyWarning​(java.lang.String message)
		```
		- #### notifyWarning
		
		
		
		```
		protected static final void notifyWarning​(java.lang.Throwable cause,
		                                          java.lang.String message)
		```
		- #### notifyInfo
		
		
		
		```
		protected static final void notifyInfo​(java.lang.String message)
		```
		- #### notifyDebug
		
		
		
		```
		protected static final void notifyDebug​(java.lang.String message)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.Throwable cause,
		                               java.lang.String message)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.Throwable cause,
		                               java.lang.String template,
		                               java.lang.Object arg1)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.Throwable cause,
		                               java.lang.String template,
		                               java.lang.Object arg1,
		                               java.lang.Object arg2)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.Throwable cause,
		                               java.lang.String template,
		                               java.lang.Object arg1,
		                               java.lang.Object arg2,
		                               java.lang.Object arg3)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.Throwable cause,
		                               java.lang.String template,
		                               java.lang.Object arg1,
		                               java.lang.Object arg2,
		                               java.lang.Object arg3,
		                               java.lang.Object arg4)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String message)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String template,
		                               java.lang.Object arg1)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String template,
		                               java.lang.Object arg1,
		                               java.lang.Object arg2)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String template,
		                               java.lang.Object arg1,
		                               java.lang.Object arg2,
		                               java.lang.Object arg3)
		```
		- #### error
		
		
		
		```
		public static final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String template,
		                               java.lang.Object arg1,
		                               java.lang.Object arg2,
		                               java.lang.Object arg3,
		                               java.lang.Object arg4)
		```
		- #### warning
		
		
		
		```
		public static final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                                 java.lang.String message)
		```
		- #### warning
		
		
		
		```
		public static final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                                 java.lang.String template,
		                                 java.lang.Object arg1)
		```
		- #### warning
		
		
		
		```
		public static final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                                 java.lang.String template,
		                                 java.lang.Object arg1,
		                                 java.lang.Object arg2)
		```
		- #### warning
		
		
		
		```
		public static final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                                 java.lang.String template,
		                                 java.lang.Object arg1,
		                                 java.lang.Object arg2,
		                                 java.lang.Object arg3)
		```
		- #### warning
		
		
		
		```
		public static final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                                 java.lang.String template,
		                                 java.lang.Object arg1,
		                                 java.lang.Object arg2,
		                                 java.lang.Object arg3,
		                                 java.lang.Object arg4)
		```
		- #### info
		
		
		
		```
		public static final void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                              java.lang.String message)
		```
		- #### info
		
		
		
		```
		public static final void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                              java.lang.String template,
		                              java.lang.Object arg1,
		                              java.lang.Object arg2)
		```
		- #### info
		
		
		
		```
		public static final void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                              java.lang.String template,
		                              java.lang.Object arg1,
		                              java.lang.Object arg2,
		                              java.lang.Object arg3)
		```
		- #### info
		
		
		
		```
		public static final void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                              java.lang.String template,
		                              java.lang.Object arg1,
		                              java.lang.Object arg2,
		                              java.lang.Object arg3,
		                              java.lang.Object arg4)
		```
		- #### debug
		
		
		
		```
		public static final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String message)
		```
		- #### debug
		
		
		
		```
		public static final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String template,
		                               java.lang.Object arg1)
		```
		- #### debug
		
		
		
		```
		public static final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String template,
		                               java.lang.Object arg1,
		                               java.lang.Object arg2)
		```
		- #### debug
		
		
		
		```
		public static final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String template,
		                               java.lang.Object arg1,
		                               java.lang.Object arg2,
		                               java.lang.Object arg3)
		```
		- #### debug
		
		
		
		```
		public static final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                               java.lang.String template,
		                               java.lang.Object arg1,
		                               java.lang.Object arg2,
		                               java.lang.Object arg3,
		                               java.lang.Object arg4)
		```
		- #### mdc
		
		
		
		```
		public static scala.collection.immutable.Map<java.lang.String,​java.lang.Object> mdc()
		```
		- #### log
		
		
		
		```
		public static void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		                       java.lang.String message)
		```
		- #### log
		
		
		
		```
		public static void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		                       java.lang.String template,
		                       java.lang.Object arg1)
		```
		- #### log
		
		
		
		```
		public static void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		                       java.lang.String template,
		                       java.lang.Object arg1,
		                       java.lang.Object arg2)
		```
		- #### log
		
		
		
		```
		public static void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		                       java.lang.String template,
		                       java.lang.Object arg1,
		                       java.lang.Object arg2,
		                       java.lang.Object arg3)
		```
		- #### log
		
		
		
		```
		public static void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		                       java.lang.String template,
		                       java.lang.Object arg1,
		                       java.lang.Object arg2,
		                       java.lang.Object arg3,
		                       java.lang.Object arg4)
		```
		- #### isEnabled
		
		
		
		```
		public static final boolean isEnabled​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level)
		```
		- #### notifyLog
		
		
		
		```
		public static final void notifyLog​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		                                   java.lang.String message)
		```
		- #### format
		
		
		
		```
		public static java.lang.String format​(java.lang.String t,
		                                      scala.collection.immutable.Seq<java.lang.Object> arg)
		```
		- #### bus
		
		
		
		```
		public static [LoggingBus](LoggingBus.html "interface in akka.event") bus()
		```
		- #### logSource
		
		
		
		```
		public static java.lang.String logSource()
		```
		- #### logClass
		
		
		
		```
		public static java.lang.Class<?> logClass()
		```
		- #### loggingFilterWithMarker
		
		
		
		```
		public static [LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event") loggingFilterWithMarker()
		```
		- #### log
		
		
		
		```
		public static void log​([LogMarker](LogMarker.html "class in akka.event") marker,
		                       [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		                       java.lang.String message)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/NoMarkerLogging$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/NoMarkerLogging.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/NoMarkerLogging.html)*