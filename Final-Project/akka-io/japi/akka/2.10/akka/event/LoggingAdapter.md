---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
title: LoggingAdapter
---

# LoggingAdapter

## Content

Package [akka.event](package-summary.html)
## Interface LoggingAdapter

- All Known Subinterfaces:
`[DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "interface in akka.event")`

All Known Implementing Classes:
`[BusLogging](BusLogging.html "class in akka.event")`, `[DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html "class in akka.event")`, `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`, `[NoLogging$](NoLogging$.html "class in akka.event")`, `[NoMarkerLogging$](NoMarkerLogging$.html "class in akka.event")`

---

```
public interface LoggingAdapter
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[debug](#debug(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[debug](#debug(java.lang.String,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[debug](#debug(java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[debug](#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[debug](#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `void` | `[error](#error(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[error](#error(java.lang.String,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[error](#error(java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[error](#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[error](#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `void` | `[error](#error(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `void` | `[error](#error(java.lang.Throwable,java.lang.String,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[error](#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[error](#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[error](#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `java.lang.String` | `[format](#format(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String t,  scala.collection.immutable.Seq<java.lang.Object> arg)` |  |
	| `java.lang.String` | `[format1](#format1(java.lang.String,java.lang.Object))​(java.lang.String t,  java.lang.Object arg)` |  |
	| `java.lang.String` | `[formatImpl](#formatImpl(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String t,  scala.collection.immutable.Seq<java.lang.Object> arg)` |  |
	| `void` | `[info](#info(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[info](#info(java.lang.String,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[info](#info(java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[info](#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[info](#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled())()` |  |
	| `boolean` | `[isEnabled](#isEnabled(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level)` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled())()` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled())()` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled())()` |  |
	| `void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String message)` |  |
	| `void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[log](#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[mdc](#mdc())()` | LoggingAdapter extension which adds MDC support. |
	| `void` | `[notifyDebug](#notifyDebug(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[notifyError](#notifyError(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[notifyError](#notifyError(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `void` | `[notifyInfo](#notifyInfo(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[notifyLog](#notifyLog(akka.event.Logging.LogLevel,java.lang.String))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String message)` |  |
	| `void` | `[notifyWarning](#notifyWarning(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[notifyWarning](#notifyWarning(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `void` | `[warning](#warning(java.lang.String))​(java.lang.String message)` |  |
	| `void` | `[warning](#warning(java.lang.String,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[warning](#warning(java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[warning](#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[warning](#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |
	| `void` | `[warning](#warning(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `void` | `[warning](#warning(java.lang.Throwable,java.lang.String,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1)` |  |
	| `void` | `[warning](#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` |  |
	| `void` | `[warning](#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` |  |
	| `void` | `[warning](#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​(java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` |  |

- - ### Method Detail
	
	
	
		- #### debug
		
		
		
		```
		void debug​(java.lang.String message)
		```
		- #### debug
		
		
		
		```
		void debug​(java.lang.String template,
		           java.lang.Object arg1)
		```
		- #### debug
		
		
		
		```
		void debug​(java.lang.String template,
		           java.lang.Object arg1,
		           java.lang.Object arg2)
		```
		- #### debug
		
		
		
		```
		void debug​(java.lang.String template,
		           java.lang.Object arg1,
		           java.lang.Object arg2,
		           java.lang.Object arg3)
		```
		- #### debug
		
		
		
		```
		void debug​(java.lang.String template,
		           java.lang.Object arg1,
		           java.lang.Object arg2,
		           java.lang.Object arg3,
		           java.lang.Object arg4)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.Throwable cause,
		           java.lang.String message)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.Throwable cause,
		           java.lang.String template,
		           java.lang.Object arg1)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.Throwable cause,
		           java.lang.String template,
		           java.lang.Object arg1,
		           java.lang.Object arg2)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.Throwable cause,
		           java.lang.String template,
		           java.lang.Object arg1,
		           java.lang.Object arg2,
		           java.lang.Object arg3)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.Throwable cause,
		           java.lang.String template,
		           java.lang.Object arg1,
		           java.lang.Object arg2,
		           java.lang.Object arg3,
		           java.lang.Object arg4)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.String message)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.String template,
		           java.lang.Object arg1)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.String template,
		           java.lang.Object arg1,
		           java.lang.Object arg2)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.String template,
		           java.lang.Object arg1,
		           java.lang.Object arg2,
		           java.lang.Object arg3)
		```
		- #### error
		
		
		
		```
		void error​(java.lang.String template,
		           java.lang.Object arg1,
		           java.lang.Object arg2,
		           java.lang.Object arg3,
		           java.lang.Object arg4)
		```
		- #### format
		
		
		
		```
		java.lang.String format​(java.lang.String t,
		                        scala.collection.immutable.Seq<java.lang.Object> arg)
		```
		- #### format1
		
		
		
		```
		java.lang.String format1​(java.lang.String t,
		                         java.lang.Object arg)
		```
		- #### formatImpl
		
		
		
		```
		java.lang.String formatImpl​(java.lang.String t,
		                            scala.collection.immutable.Seq<java.lang.Object> arg)
		```
		- #### info
		
		
		
		```
		void info​(java.lang.String message)
		```
		- #### info
		
		
		
		```
		void info​(java.lang.String template,
		          java.lang.Object arg1)
		```
		- #### info
		
		
		
		```
		void info​(java.lang.String template,
		          java.lang.Object arg1,
		          java.lang.Object arg2)
		```
		- #### info
		
		
		
		```
		void info​(java.lang.String template,
		          java.lang.Object arg1,
		          java.lang.Object arg2,
		          java.lang.Object arg3)
		```
		- #### info
		
		
		
		```
		void info​(java.lang.String template,
		          java.lang.Object arg1,
		          java.lang.Object arg2,
		          java.lang.Object arg3,
		          java.lang.Object arg4)
		```
		- #### isDebugEnabled
		
		
		
		```
		boolean isDebugEnabled()
		```
		- #### isEnabled
		
		
		
		```
		boolean isEnabled​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level)
		```
		- #### isErrorEnabled
		
		
		
		```
		boolean isErrorEnabled()
		```
		- #### isInfoEnabled
		
		
		
		```
		boolean isInfoEnabled()
		```
		- #### isWarningEnabled
		
		
		
		```
		boolean isWarningEnabled()
		```
		- #### log
		
		
		
		```
		void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		         java.lang.String message)
		```
		- #### log
		
		
		
		```
		void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		         java.lang.String template,
		         java.lang.Object arg1)
		```
		- #### log
		
		
		
		```
		void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		         java.lang.String template,
		         java.lang.Object arg1,
		         java.lang.Object arg2)
		```
		- #### log
		
		
		
		```
		void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		         java.lang.String template,
		         java.lang.Object arg1,
		         java.lang.Object arg2,
		         java.lang.Object arg3)
		```
		- #### log
		
		
		
		```
		void log​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		         java.lang.String template,
		         java.lang.Object arg1,
		         java.lang.Object arg2,
		         java.lang.Object arg3,
		         java.lang.Object arg4)
		```
		- #### mdc
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​java.lang.Object> mdc()
		```
		
		LoggingAdapter extension which adds MDC support.
		 Only recommended to be used within Actors as it isn't thread safe.
		- #### notifyDebug
		
		
		
		```
		void notifyDebug​(java.lang.String message)
		```
		- #### notifyError
		
		
		
		```
		void notifyError​(java.lang.String message)
		```
		- #### notifyError
		
		
		
		```
		void notifyError​(java.lang.Throwable cause,
		                 java.lang.String message)
		```
		- #### notifyInfo
		
		
		
		```
		void notifyInfo​(java.lang.String message)
		```
		- #### notifyLog
		
		
		
		```
		void notifyLog​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		               java.lang.String message)
		```
		- #### notifyWarning
		
		
		
		```
		void notifyWarning​(java.lang.String message)
		```
		- #### notifyWarning
		
		
		
		```
		void notifyWarning​(java.lang.Throwable cause,
		                   java.lang.String message)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.Throwable cause,
		             java.lang.String message)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.Throwable cause,
		             java.lang.String template,
		             java.lang.Object arg1)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.Throwable cause,
		             java.lang.String template,
		             java.lang.Object arg1,
		             java.lang.Object arg2)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.Throwable cause,
		             java.lang.String template,
		             java.lang.Object arg1,
		             java.lang.Object arg2,
		             java.lang.Object arg3)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.Throwable cause,
		             java.lang.String template,
		             java.lang.Object arg1,
		             java.lang.Object arg2,
		             java.lang.Object arg3,
		             java.lang.Object arg4)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.String message)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.String template,
		             java.lang.Object arg1)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.String template,
		             java.lang.Object arg1,
		             java.lang.Object arg2)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.String template,
		             java.lang.Object arg1,
		             java.lang.Object arg2,
		             java.lang.Object arg3)
		```
		- #### warning
		
		
		
		```
		void warning​(java.lang.String template,
		             java.lang.Object arg1,
		             java.lang.Object arg2,
		             java.lang.Object arg3,
		             java.lang.Object arg4)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/event/BusLogging.html
- https://doc.akka.io/japi/akka/2.10/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/NoLogging$.html
- https://doc.akka.io/japi/akka/2.10/akka/event/NoMarkerLogging$.html
- https://doc.akka.io/japi/akka/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html](https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html)*