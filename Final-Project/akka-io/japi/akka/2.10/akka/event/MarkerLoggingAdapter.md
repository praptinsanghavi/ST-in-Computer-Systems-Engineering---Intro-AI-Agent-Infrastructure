---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/event/MarkerLoggingAdapter.html
title: MarkerLoggingAdapter
---

# MarkerLoggingAdapter

## Content

Package [akka.event](package-summary.html)
## Class MarkerLoggingAdapter

- java.lang.Object
- - [akka.event.BusLogging](BusLogging.html "class in akka.event")
	- - akka.event.MarkerLoggingAdapter

- All Implemented Interfaces:
`[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`

Direct Known Subclasses:
`[DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html "class in akka.event")`, `[NoMarkerLogging$](NoMarkerLogging$.html "class in akka.event")`

---

```
public class MarkerLoggingAdapter
extends [BusLogging](BusLogging.html "class in akka.event")
```

[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event") extension which adds Marker support.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MarkerLoggingAdapter](#%3Cinit%3E(akka.event.LoggingBus,java.lang.String,java.lang.Class))​([LoggingBus](LoggingBus.html "interface in akka.event") bus,  java.lang.String logSource,  java.lang.Class<?> logClass)` |  |
	| `[MarkerLoggingAdapter](#%3Cinit%3E(akka.event.LoggingBus,java.lang.String,java.lang.Class,akka.event.LoggingFilter))​([LoggingBus](LoggingBus.html "interface in akka.event") bus,  java.lang.String logSource,  java.lang.Class<?> logClass,  [LoggingFilter](LoggingFilter.html "interface in akka.event") loggingFilter)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LoggingBus](LoggingBus.html "interface in akka.event")` | `[bus](#bus())()` |  |
	| `void` | `[debug](#debug(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` | Log message at debug level. |
	| `void` | `[debug](#debug(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` | Message template with 1 replacement argument. |
	| `void` | `[debug](#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` | Message template with 2 replacement arguments. |
	| `void` | `[debug](#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` | Message template with 3 replacement arguments. |
	| `void` | `[debug](#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` | Message template with 4 replacement arguments. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` | Log message at error level, without providing the exception that caused the error. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` | Message template with 1 replacement argument. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` | Message template with 2 replacement arguments. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` | Message template with 3 replacement arguments. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` | Message template with 4 replacement arguments. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String message)` | Log message at error level, including the exception that caused the error. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1)` | Message template with 1 replacement argument. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` | Message template with 2 replacement arguments. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` | Message template with 3 replacement arguments. |
	| `void` | `[error](#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.Throwable cause,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` | Message template with 4 replacement arguments. |
	| `void` | `[info](#info(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` | Log message at info level. |
	| `void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` | Message template with 1 replacement argument. |
	| `void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` | Message template with 2 replacement arguments. |
	| `void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` | Message template with 3 replacement arguments. |
	| `void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` | Message template with 4 replacement arguments. |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled(akka.event.LogMarker))​([LogMarker](LogMarker.html "class in akka.event") marker)` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled(akka.event.LogMarker))​([LogMarker](LogMarker.html "class in akka.event") marker)` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled(akka.event.LogMarker))​([LogMarker](LogMarker.html "class in akka.event") marker)` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled(akka.event.LogMarker))​([LogMarker](LogMarker.html "class in akka.event") marker)` |  |
	| `void` | `[log](#log(akka.event.LogMarker,akka.event.Logging.LogLevel,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,  java.lang.String message)` | Log message at the specified log level. |
	| `java.lang.Class<?>` | `[logClass](#logClass())()` |  |
	| `[LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event")` | `[loggingFilterWithMarker](#loggingFilterWithMarker())()` |  |
	| `java.lang.String` | `[logSource](#logSource())()` |  |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` | Log message at warning level. |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` | Message template with 1 replacement argument. |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` | Message template with 2 replacement arguments. |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` | Message template with 3 replacement arguments. |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` | Message template with 4 replacement arguments. |
	
	
		- ### Methods inherited from class akka.event.[BusLogging](BusLogging.html "class in akka.event")
		
		
		`[isDebugEnabled](BusLogging.html#isDebugEnabled()), [isErrorEnabled](BusLogging.html#isErrorEnabled()), [isInfoEnabled](BusLogging.html#isInfoEnabled()), [isWarningEnabled](BusLogging.html#isWarningEnabled()), [notifyDebug](BusLogging.html#notifyDebug(java.lang.String)), [notifyError](BusLogging.html#notifyError(java.lang.String)), [notifyError](BusLogging.html#notifyError(java.lang.Throwable,java.lang.String)), [notifyInfo](BusLogging.html#notifyInfo(java.lang.String)), [notifyWarning](BusLogging.html#notifyWarning(java.lang.String)), [notifyWarning](BusLogging.html#notifyWarning(java.lang.Throwable,java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.event.[LoggingAdapter](LoggingAdapter.html "interface in akka.event")
		
		
		`[debug](LoggingAdapter.html#debug(java.lang.String)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [format](LoggingAdapter.html#format(java.lang.String,scala.collection.immutable.Seq)), [format1](LoggingAdapter.html#format1(java.lang.String,java.lang.Object)), [formatImpl](LoggingAdapter.html#formatImpl(java.lang.String,scala.collection.immutable.Seq)), [info](LoggingAdapter.html#info(java.lang.String)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [isEnabled](LoggingAdapter.html#isEnabled(akka.event.Logging.LogLevel)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [mdc](LoggingAdapter.html#mdc()), [notifyLog](LoggingAdapter.html#notifyLog(akka.event.Logging.LogLevel,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### MarkerLoggingAdapter
		
		
		
		```
		public MarkerLoggingAdapter​([LoggingBus](LoggingBus.html "interface in akka.event") bus,
		                            java.lang.String logSource,
		                            java.lang.Class<?> logClass,
		                            [LoggingFilter](LoggingFilter.html "interface in akka.event") loggingFilter)
		```
		- #### MarkerLoggingAdapter
		
		
		
		```
		public MarkerLoggingAdapter​([LoggingBus](LoggingBus.html "interface in akka.event") bus,
		                            java.lang.String logSource,
		                            java.lang.Class<?> logClass)
		```

	- ### Method Detail
	
	
	
		- #### bus
		
		
		
		```
		public [LoggingBus](LoggingBus.html "interface in akka.event") bus()
		```
		
		
		Overrides:
		`[bus](BusLogging.html#bus())` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### debug
		
		
		
		```
		public void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String message)
		```
		
		Log message at debug level.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### debug
		
		
		
		```
		public void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String template,
		                  java.lang.Object arg1)
		```
		
		Message template with 1 replacement argument.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		 
		 If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
		 there are more than four arguments.
		
		
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### debug
		
		
		
		```
		public void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String template,
		                  java.lang.Object arg1,
		                  java.lang.Object arg2)
		```
		
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### debug
		
		
		
		```
		public void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String template,
		                  java.lang.Object arg1,
		                  java.lang.Object arg2,
		                  java.lang.Object arg3)
		```
		
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### debug
		
		
		
		```
		public void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String template,
		                  java.lang.Object arg1,
		                  java.lang.Object arg2,
		                  java.lang.Object arg3,
		                  java.lang.Object arg4)
		```
		
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.Throwable cause,
		                  java.lang.String message)
		```
		
		Log message at error level, including the exception that caused the error.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.Throwable cause,
		                  java.lang.String template,
		                  java.lang.Object arg1)
		```
		
		Message template with 1 replacement argument.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		 
		 If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
		 there are more than four arguments.
		
		
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.Throwable cause,
		                  java.lang.String template,
		                  java.lang.Object arg1,
		                  java.lang.Object arg2)
		```
		
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.Throwable cause,
		                  java.lang.String template,
		                  java.lang.Object arg1,
		                  java.lang.Object arg2,
		                  java.lang.Object arg3)
		```
		
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.Throwable cause,
		                  java.lang.String template,
		                  java.lang.Object arg1,
		                  java.lang.Object arg2,
		                  java.lang.Object arg3,
		                  java.lang.Object arg4)
		```
		
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String message)
		```
		
		Log message at error level, without providing the exception that caused the error.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String template,
		                  java.lang.Object arg1)
		```
		
		Message template with 1 replacement argument.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		 
		 If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
		 there are more than four arguments.
		
		
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String template,
		                  java.lang.Object arg1,
		                  java.lang.Object arg2)
		```
		
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String template,
		                  java.lang.Object arg1,
		                  java.lang.Object arg2,
		                  java.lang.Object arg3)
		```
		
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                  java.lang.String template,
		                  java.lang.Object arg1,
		                  java.lang.Object arg2,
		                  java.lang.Object arg3,
		                  java.lang.Object arg4)
		```
		
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### info
		
		
		
		```
		public void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                 java.lang.String message)
		```
		
		Log message at info level.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### info
		
		
		
		```
		public void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                 java.lang.String template,
		                 java.lang.Object arg1)
		```
		
		Message template with 1 replacement argument.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		 
		 If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
		 there are more than four arguments.
		
		
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### info
		
		
		
		```
		public void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                 java.lang.String template,
		                 java.lang.Object arg1,
		                 java.lang.Object arg2)
		```
		
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### info
		
		
		
		```
		public void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                 java.lang.String template,
		                 java.lang.Object arg1,
		                 java.lang.Object arg2,
		                 java.lang.Object arg3)
		```
		
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### info
		
		
		
		```
		public void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                 java.lang.String template,
		                 java.lang.Object arg1,
		                 java.lang.Object arg2,
		                 java.lang.Object arg3,
		                 java.lang.Object arg4)
		```
		
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### isDebugEnabled
		
		
		
		```
		public boolean isDebugEnabled​([LogMarker](LogMarker.html "class in akka.event") marker)
		```
		- #### isErrorEnabled
		
		
		
		```
		public boolean isErrorEnabled​([LogMarker](LogMarker.html "class in akka.event") marker)
		```
		- #### isInfoEnabled
		
		
		
		```
		public boolean isInfoEnabled​([LogMarker](LogMarker.html "class in akka.event") marker)
		```
		- #### isWarningEnabled
		
		
		
		```
		public boolean isWarningEnabled​([LogMarker](LogMarker.html "class in akka.event") marker)
		```
		- #### log
		
		
		
		```
		public void log​([LogMarker](LogMarker.html "class in akka.event") marker,
		                [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") level,
		                java.lang.String message)
		```
		
		Log message at the specified log level.
		- #### logClass
		
		
		
		```
		public java.lang.Class<?> logClass()
		```
		
		
		Overrides:
		`[logClass](BusLogging.html#logClass())` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### logSource
		
		
		
		```
		public java.lang.String logSource()
		```
		
		
		Overrides:
		`[logSource](BusLogging.html#logSource())` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### loggingFilterWithMarker
		
		
		
		```
		public [LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event") loggingFilterWithMarker()
		```
		- #### warning
		
		
		
		```
		public void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                    java.lang.String message)
		```
		
		Log message at warning level.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### warning
		
		
		
		```
		public void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                    java.lang.String template,
		                    java.lang.Object arg1)
		```
		
		Message template with 1 replacement argument.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		 
		 If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
		 there are more than four arguments.
		
		
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### warning
		
		
		
		```
		public void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                    java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2)
		```
		
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### warning
		
		
		
		```
		public void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                    java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2,
		                    java.lang.Object arg3)
		```
		
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### warning
		
		
		
		```
		public void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                    java.lang.String template,
		                    java.lang.Object arg1,
		                    java.lang.Object arg2,
		                    java.lang.Object arg3,
		                    java.lang.Object arg4)
		```
		
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/event/BusLogging.html
- https://doc.akka.io/japi/akka/2.10/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/2.10/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingBus.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/japi/akka/2.10/akka/event/NoMarkerLogging$.html
- https://doc.akka.io/japi/akka/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/event/MarkerLoggingAdapter.html](https://doc.akka.io/japi/akka/2.10/akka/event/MarkerLoggingAdapter.html)*