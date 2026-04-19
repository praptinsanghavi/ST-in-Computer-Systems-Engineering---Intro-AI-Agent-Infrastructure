---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/event/BusLogging.html
title: BusLogging
---

# BusLogging

## Content

Package [akka.event](package-summary.html)
## Class BusLogging

- java.lang.Object
- - akka.event.BusLogging

- All Implemented Interfaces:
`[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`

Direct Known Subclasses:
`[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`

---

```
public class BusLogging
extends java.lang.Object
implements [LoggingAdapter](LoggingAdapter.html "interface in akka.event")
```

[`LoggingAdapter`](LoggingAdapter.html "interface in akka.event") that publishes [`Logging.LogEvent`](Logging.LogEvent.html "interface in akka.event") to event stream.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BusLogging](#%3Cinit%3E(akka.event.LoggingBus,java.lang.String,java.lang.Class))​([LoggingBus](LoggingBus.html "interface in akka.event") bus,  java.lang.String logSource,  java.lang.Class<?> logClass)` |  |
	| `[BusLogging](#%3Cinit%3E(akka.event.LoggingBus,java.lang.String,java.lang.Class,akka.event.LoggingFilter))​([LoggingBus](LoggingBus.html "interface in akka.event") bus,  java.lang.String logSource,  java.lang.Class<?> logClass,  [LoggingFilter](LoggingFilter.html "interface in akka.event") loggingFilter)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LoggingBus](LoggingBus.html "interface in akka.event")` | `[bus](#bus())()` |  |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled())()` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled())()` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled())()` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled())()` |  |
	| `java.lang.Class<?>` | `[logClass](#logClass())()` |  |
	| `java.lang.String` | `[logSource](#logSource())()` |  |
	| `protected void` | `[notifyDebug](#notifyDebug(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyError](#notifyError(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyError](#notifyError(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `protected void` | `[notifyInfo](#notifyInfo(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyWarning](#notifyWarning(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyWarning](#notifyWarning(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.event.[LoggingAdapter](LoggingAdapter.html "interface in akka.event")
		
		
		`[debug](LoggingAdapter.html#debug(java.lang.String)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [format](LoggingAdapter.html#format(java.lang.String,scala.collection.immutable.Seq)), [format1](LoggingAdapter.html#format1(java.lang.String,java.lang.Object)), [formatImpl](LoggingAdapter.html#formatImpl(java.lang.String,scala.collection.immutable.Seq)), [info](LoggingAdapter.html#info(java.lang.String)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [isEnabled](LoggingAdapter.html#isEnabled(akka.event.Logging.LogLevel)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [mdc](LoggingAdapter.html#mdc()), [notifyLog](LoggingAdapter.html#notifyLog(akka.event.Logging.LogLevel,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### BusLogging
		
		
		
		```
		public BusLogging​([LoggingBus](LoggingBus.html "interface in akka.event") bus,
		                  java.lang.String logSource,
		                  java.lang.Class<?> logClass,
		                  [LoggingFilter](LoggingFilter.html "interface in akka.event") loggingFilter)
		```
		- #### BusLogging
		
		
		
		```
		public BusLogging​([LoggingBus](LoggingBus.html "interface in akka.event") bus,
		                  java.lang.String logSource,
		                  java.lang.Class<?> logClass)
		```

	- ### Method Detail
	
	
	
		- #### bus
		
		
		
		```
		public [LoggingBus](LoggingBus.html "interface in akka.event") bus()
		```
		- #### isDebugEnabled
		
		
		
		```
		public boolean isDebugEnabled()
		```
		
		
		Specified by:
		`[isDebugEnabled](LoggingAdapter.html#isDebugEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### isErrorEnabled
		
		
		
		```
		public boolean isErrorEnabled()
		```
		
		
		Specified by:
		`[isErrorEnabled](LoggingAdapter.html#isErrorEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### isInfoEnabled
		
		
		
		```
		public boolean isInfoEnabled()
		```
		
		
		Specified by:
		`[isInfoEnabled](LoggingAdapter.html#isInfoEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### isWarningEnabled
		
		
		
		```
		public boolean isWarningEnabled()
		```
		
		
		Specified by:
		`[isWarningEnabled](LoggingAdapter.html#isWarningEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### logClass
		
		
		
		```
		public java.lang.Class<?> logClass()
		```
		- #### logSource
		
		
		
		```
		public java.lang.String logSource()
		```
		- #### notifyDebug
		
		
		
		```
		protected void notifyDebug​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyDebug](LoggingAdapter.html#notifyDebug(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyError
		
		
		
		```
		protected void notifyError​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyError](LoggingAdapter.html#notifyError(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyError
		
		
		
		```
		protected void notifyError​(java.lang.Throwable cause,
		                           java.lang.String message)
		```
		
		
		Specified by:
		`[notifyError](LoggingAdapter.html#notifyError(java.lang.Throwable,java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyInfo
		
		
		
		```
		protected void notifyInfo​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyInfo](LoggingAdapter.html#notifyInfo(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyWarning
		
		
		
		```
		protected void notifyWarning​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyWarning
		
		
		
		```
		protected void notifyWarning​(java.lang.Throwable cause,
		                             java.lang.String message)
		```
		
		
		Specified by:
		`[notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.Throwable,java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingBus.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/event/BusLogging.html](https://doc.akka.io/japi/akka/2.10/akka/event/BusLogging.html)*