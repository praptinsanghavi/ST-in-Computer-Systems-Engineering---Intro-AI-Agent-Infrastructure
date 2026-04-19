---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/event/NoMarkerLogging$.html
title: NoMarkerLogging$
---

# NoMarkerLogging$

## Content

Package [akka.event](package-summary.html)
## Class NoMarkerLogging$

- java.lang.Object
- - [akka.event.BusLogging](BusLogging.html "class in akka.event")
	- - [akka.event.MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")
		- - akka.event.NoMarkerLogging$

- All Implemented Interfaces:
`[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`

---

```
public class NoMarkerLogging$
extends [MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")
```

NoLogging is a MarkerLoggingAdapter that does absolutely nothing – no logging at all.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoMarkerLogging$](NoMarkerLogging$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoMarkerLogging$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
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
	| `[NoMarkerLogging$](NoMarkerLogging$.html "class in akka.event")` | `[getInstance](#getInstance())()` | Java API to return the reference to NoLogging |
	| `void` | `[info](#info(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` | Log message at info level. |
	| `void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` | Message template with 2 replacement arguments. |
	| `void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` | Message template with 3 replacement arguments. |
	| `void` | `[info](#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` | Message template with 4 replacement arguments. |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled())()` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled())()` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled())()` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled())()` |  |
	| `protected void` | `[notifyDebug](#notifyDebug(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyError](#notifyError(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyError](#notifyError(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `protected void` | `[notifyInfo](#notifyInfo(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyWarning](#notifyWarning(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyWarning](#notifyWarning(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String message)` | Log message at warning level. |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1)` | Message template with 1 replacement argument. |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2)` | Message template with 2 replacement arguments. |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3)` | Message template with 3 replacement arguments. |
	| `void` | `[warning](#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))​([LogMarker](LogMarker.html "class in akka.event") marker,  java.lang.String template,  java.lang.Object arg1,  java.lang.Object arg2,  java.lang.Object arg3,  java.lang.Object arg4)` | Message template with 4 replacement arguments. |
	
	
		- ### Methods inherited from class akka.event.[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")
		
		
		`[bus](MarkerLoggingAdapter.html#bus()), [info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object)), [isDebugEnabled](MarkerLoggingAdapter.html#isDebugEnabled(akka.event.LogMarker)), [isErrorEnabled](MarkerLoggingAdapter.html#isErrorEnabled(akka.event.LogMarker)), [isInfoEnabled](MarkerLoggingAdapter.html#isInfoEnabled(akka.event.LogMarker)), [isWarningEnabled](MarkerLoggingAdapter.html#isWarningEnabled(akka.event.LogMarker)), [log](MarkerLoggingAdapter.html#log(akka.event.LogMarker,akka.event.Logging.LogLevel,java.lang.String)), [logClass](MarkerLoggingAdapter.html#logClass()), [loggingFilterWithMarker](MarkerLoggingAdapter.html#loggingFilterWithMarker()), [logSource](MarkerLoggingAdapter.html#logSource())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.event.[LoggingAdapter](LoggingAdapter.html "interface in akka.event")
		
		
		`[debug](LoggingAdapter.html#debug(java.lang.String)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [format](LoggingAdapter.html#format(java.lang.String,scala.collection.immutable.Seq)), [format1](LoggingAdapter.html#format1(java.lang.String,java.lang.Object)), [formatImpl](LoggingAdapter.html#formatImpl(java.lang.String,scala.collection.immutable.Seq)), [info](LoggingAdapter.html#info(java.lang.String)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [isEnabled](LoggingAdapter.html#isEnabled(akka.event.Logging.LogLevel)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [mdc](LoggingAdapter.html#mdc()), [notifyLog](LoggingAdapter.html#notifyLog(akka.event.Logging.LogLevel,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoMarkerLogging$](NoMarkerLogging$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoMarkerLogging$
		
		
		
		```
		public NoMarkerLogging$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [NoMarkerLogging$](NoMarkerLogging$.html "class in akka.event") getInstance()
		```
		
		Java API to return the reference to NoLogging
		
		Returns:
		The NoLogging instance
		- #### isErrorEnabled
		
		
		
		```
		public final boolean isErrorEnabled()
		```
		
		
		Specified by:
		`[isErrorEnabled](LoggingAdapter.html#isErrorEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[isErrorEnabled](BusLogging.html#isErrorEnabled())` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### isWarningEnabled
		
		
		
		```
		public final boolean isWarningEnabled()
		```
		
		
		Specified by:
		`[isWarningEnabled](LoggingAdapter.html#isWarningEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[isWarningEnabled](BusLogging.html#isWarningEnabled())` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### isInfoEnabled
		
		
		
		```
		public final boolean isInfoEnabled()
		```
		
		
		Specified by:
		`[isInfoEnabled](LoggingAdapter.html#isInfoEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[isInfoEnabled](BusLogging.html#isInfoEnabled())` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### isDebugEnabled
		
		
		
		```
		public final boolean isDebugEnabled()
		```
		
		
		Specified by:
		`[isDebugEnabled](LoggingAdapter.html#isDebugEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[isDebugEnabled](BusLogging.html#isDebugEnabled())` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### notifyError
		
		
		
		```
		protected final void notifyError​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyError](LoggingAdapter.html#notifyError(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[notifyError](BusLogging.html#notifyError(java.lang.String))` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### notifyError
		
		
		
		```
		protected final void notifyError​(java.lang.Throwable cause,
		                                 java.lang.String message)
		```
		
		
		Specified by:
		`[notifyError](LoggingAdapter.html#notifyError(java.lang.Throwable,java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[notifyError](BusLogging.html#notifyError(java.lang.Throwable,java.lang.String))` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### notifyWarning
		
		
		
		```
		protected final void notifyWarning​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[notifyWarning](BusLogging.html#notifyWarning(java.lang.String))` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### notifyWarning
		
		
		
		```
		protected final void notifyWarning​(java.lang.Throwable cause,
		                                   java.lang.String message)
		```
		
		
		Specified by:
		`[notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.Throwable,java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[notifyWarning](BusLogging.html#notifyWarning(java.lang.Throwable,java.lang.String))` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### notifyInfo
		
		
		
		```
		protected final void notifyInfo​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyInfo](LoggingAdapter.html#notifyInfo(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[notifyInfo](BusLogging.html#notifyInfo(java.lang.String))` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### notifyDebug
		
		
		
		```
		protected final void notifyDebug​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyDebug](LoggingAdapter.html#notifyDebug(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Overrides:
		`[notifyDebug](BusLogging.html#notifyDebug(java.lang.String))` in class `[BusLogging](BusLogging.html "class in akka.event")`
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.Throwable cause,
		                        java.lang.String message)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String))`
		Log message at error level, including the exception that caused the error.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.Throwable cause,
		                        java.lang.String template,
		                        java.lang.Object arg1)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object))`
		Message template with 1 replacement argument.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		 
		 If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
		 there are more than four arguments.
		
		
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.Throwable cause,
		                        java.lang.String template,
		                        java.lang.Object arg1,
		                        java.lang.Object arg2)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object))`
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.Throwable cause,
		                        java.lang.String template,
		                        java.lang.Object arg1,
		                        java.lang.Object arg2,
		                        java.lang.Object arg3)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.Throwable cause,
		                        java.lang.String template,
		                        java.lang.Object arg1,
		                        java.lang.Object arg2,
		                        java.lang.Object arg3,
		                        java.lang.Object arg4)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String message)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String))`
		Log message at error level, without providing the exception that caused the error.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String template,
		                        java.lang.Object arg1)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object))`
		Message template with 1 replacement argument.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		 
		 If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
		 there are more than four arguments.
		
		
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String template,
		                        java.lang.Object arg1,
		                        java.lang.Object arg2)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))`
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String template,
		                        java.lang.Object arg1,
		                        java.lang.Object arg2,
		                        java.lang.Object arg3)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### error
		
		
		
		```
		public final void error​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String template,
		                        java.lang.Object arg1,
		                        java.lang.Object arg2,
		                        java.lang.Object arg3,
		                        java.lang.Object arg4)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### warning
		
		
		
		```
		public final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                          java.lang.String message)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String))`
		Log message at warning level.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### warning
		
		
		
		```
		public final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                          java.lang.String template,
		                          java.lang.Object arg1)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object))`
		Message template with 1 replacement argument.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		 
		 If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
		 there are more than four arguments.
		
		
		
		Overrides:
		`[warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### warning
		
		
		
		```
		public final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                          java.lang.String template,
		                          java.lang.Object arg1,
		                          java.lang.Object arg2)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))`
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### warning
		
		
		
		```
		public final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                          java.lang.String template,
		                          java.lang.Object arg1,
		                          java.lang.Object arg2,
		                          java.lang.Object arg3)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### warning
		
		
		
		```
		public final void warning​([LogMarker](LogMarker.html "class in akka.event") marker,
		                          java.lang.String template,
		                          java.lang.Object arg1,
		                          java.lang.Object arg2,
		                          java.lang.Object arg3,
		                          java.lang.Object arg4)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### info
		
		
		
		```
		public final void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                       java.lang.String message)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String))`
		Log message at info level.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### info
		
		
		
		```
		public final void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                       java.lang.String template,
		                       java.lang.Object arg1,
		                       java.lang.Object arg2)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))`
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### info
		
		
		
		```
		public final void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                       java.lang.String template,
		                       java.lang.Object arg1,
		                       java.lang.Object arg2,
		                       java.lang.Object arg3)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### info
		
		
		
		```
		public final void info​([LogMarker](LogMarker.html "class in akka.event") marker,
		                       java.lang.String template,
		                       java.lang.Object arg1,
		                       java.lang.Object arg2,
		                       java.lang.Object arg3,
		                       java.lang.Object arg4)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### debug
		
		
		
		```
		public final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String message)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String))`
		Log message at debug level.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### debug
		
		
		
		```
		public final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String template,
		                        java.lang.Object arg1)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object))`
		Message template with 1 replacement argument.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		 
		 If `arg1` is an `Array` it will be expanded into replacement arguments, which is useful when
		 there are more than four arguments.
		
		
		
		Overrides:
		`[debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### debug
		
		
		
		```
		public final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String template,
		                        java.lang.Object arg1,
		                        java.lang.Object arg2)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))`
		Message template with 2 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### debug
		
		
		
		```
		public final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String template,
		                        java.lang.Object arg1,
		                        java.lang.Object arg2,
		                        java.lang.Object arg3)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 3 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")
		- #### debug
		
		
		
		```
		public final void debug​([LogMarker](LogMarker.html "class in akka.event") marker,
		                        java.lang.String template,
		                        java.lang.Object arg1,
		                        java.lang.Object arg2,
		                        java.lang.Object arg3,
		                        java.lang.Object arg4)
		```
		
		Description copied from class: `[MarkerLoggingAdapter](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`
		Message template with 4 replacement arguments.
		 The marker argument can be picked up by various logging frameworks such as slf4j to mark this log statement as "special".
		
		Overrides:
		`[debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		See Also:
		[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/event/BusLogging.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/NoMarkerLogging$.html
- https://doc.akka.io/japi/akka/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/event/NoMarkerLogging$.html](https://doc.akka.io/japi/akka/2.10/akka/event/NoMarkerLogging$.html)*