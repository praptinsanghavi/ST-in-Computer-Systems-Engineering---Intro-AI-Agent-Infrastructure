---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/event/DiagnosticMarkerBusLoggingAdapter.html
title: DiagnosticMarkerBusLoggingAdapter
---

# DiagnosticMarkerBusLoggingAdapter

## Content

Package [akka.event](package-summary.html)
## Class DiagnosticMarkerBusLoggingAdapter

- java.lang.Object
- - [akka.event.BusLogging](BusLogging.html "class in akka.event")
	- - [akka.event.MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")
		- - akka.event.DiagnosticMarkerBusLoggingAdapter

- All Implemented Interfaces:
`[DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "interface in akka.event")`, `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`

---

```
public final class DiagnosticMarkerBusLoggingAdapter
extends [MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")
implements [DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "interface in akka.event")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DiagnosticMarkerBusLoggingAdapter](#%3Cinit%3E(akka.event.LoggingBus,java.lang.String,java.lang.Class,akka.event.LoggingFilter))​([LoggingBus](LoggingBus.html "interface in akka.event") bus,  java.lang.String logSource,  java.lang.Class<?> logClass,  [LoggingFilter](LoggingFilter.html "interface in akka.event") loggingFilter)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LoggingBus](LoggingBus.html "interface in akka.event")` | `[bus](#bus())()` |  |
	| `java.lang.Class<?>` | `[logClass](#logClass())()` |  |
	| `java.lang.String` | `[logSource](#logSource())()` |  |
	
	
		- ### Methods inherited from class akka.event.[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")
		
		
		`[debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String)), [debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object)), [debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object)), [debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [debug](MarkerLoggingAdapter.html#debug(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](MarkerLoggingAdapter.html#error(akka.event.LogMarker,java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String)), [info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object)), [info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object)), [info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [info](MarkerLoggingAdapter.html#info(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [isDebugEnabled](MarkerLoggingAdapter.html#isDebugEnabled(akka.event.LogMarker)), [isErrorEnabled](MarkerLoggingAdapter.html#isErrorEnabled(akka.event.LogMarker)), [isInfoEnabled](MarkerLoggingAdapter.html#isInfoEnabled(akka.event.LogMarker)), [isWarningEnabled](MarkerLoggingAdapter.html#isWarningEnabled(akka.event.LogMarker)), [log](MarkerLoggingAdapter.html#log(akka.event.LogMarker,akka.event.Logging.LogLevel,java.lang.String)), [loggingFilterWithMarker](MarkerLoggingAdapter.html#loggingFilterWithMarker()), [warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String)), [warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object)), [warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object)), [warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](MarkerLoggingAdapter.html#warning(akka.event.LogMarker,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`
		- ### Methods inherited from class akka.event.[BusLogging](BusLogging.html "class in akka.event")
		
		
		`[isDebugEnabled](BusLogging.html#isDebugEnabled()), [isErrorEnabled](BusLogging.html#isErrorEnabled()), [isInfoEnabled](BusLogging.html#isInfoEnabled()), [isWarningEnabled](BusLogging.html#isWarningEnabled()), [notifyDebug](BusLogging.html#notifyDebug(java.lang.String)), [notifyError](BusLogging.html#notifyError(java.lang.String)), [notifyError](BusLogging.html#notifyError(java.lang.Throwable,java.lang.String)), [notifyInfo](BusLogging.html#notifyInfo(java.lang.String)), [notifyWarning](BusLogging.html#notifyWarning(java.lang.String)), [notifyWarning](BusLogging.html#notifyWarning(java.lang.Throwable,java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.event.[DiagnosticLoggingAdapter](DiagnosticLoggingAdapter.html "interface in akka.event")
		
		
		`[_mdc_$eq](DiagnosticLoggingAdapter.html#_mdc_$eq(scala.collection.immutable.Map)), [clearMDC](DiagnosticLoggingAdapter.html#clearMDC()), [getMDC](DiagnosticLoggingAdapter.html#getMDC()), [mdc](DiagnosticLoggingAdapter.html#mdc()), [mdc](DiagnosticLoggingAdapter.html#mdc(scala.collection.immutable.Map)), [setMDC](DiagnosticLoggingAdapter.html#setMDC(java.util.Map))`
		- ### Methods inherited from interface akka.event.[LoggingAdapter](LoggingAdapter.html "interface in akka.event")
		
		
		`[debug](LoggingAdapter.html#debug(java.lang.String)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [format](LoggingAdapter.html#format(java.lang.String,scala.collection.immutable.Seq)), [format1](LoggingAdapter.html#format1(java.lang.String,java.lang.Object)), [formatImpl](LoggingAdapter.html#formatImpl(java.lang.String,scala.collection.immutable.Seq)), [info](LoggingAdapter.html#info(java.lang.String)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [isDebugEnabled](LoggingAdapter.html#isDebugEnabled()), [isEnabled](LoggingAdapter.html#isEnabled(akka.event.Logging.LogLevel)), [isErrorEnabled](LoggingAdapter.html#isErrorEnabled()), [isInfoEnabled](LoggingAdapter.html#isInfoEnabled()), [isWarningEnabled](LoggingAdapter.html#isWarningEnabled()), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [notifyDebug](LoggingAdapter.html#notifyDebug(java.lang.String)), [notifyError](LoggingAdapter.html#notifyError(java.lang.String)), [notifyError](LoggingAdapter.html#notifyError(java.lang.Throwable,java.lang.String)), [notifyInfo](LoggingAdapter.html#notifyInfo(java.lang.String)), [notifyLog](LoggingAdapter.html#notifyLog(akka.event.Logging.LogLevel,java.lang.String)), [notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.String)), [notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.Throwable,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`

- - ### Constructor Detail
	
	
	
		- #### DiagnosticMarkerBusLoggingAdapter
		
		
		
		```
		public DiagnosticMarkerBusLoggingAdapter​([LoggingBus](LoggingBus.html "interface in akka.event") bus,
		                                         java.lang.String logSource,
		                                         java.lang.Class<?> logClass,
		                                         [LoggingFilter](LoggingFilter.html "interface in akka.event") loggingFilter)
		```

	- ### Method Detail
	
	
	
		- #### bus
		
		
		
		```
		public [LoggingBus](LoggingBus.html "interface in akka.event") bus()
		```
		
		
		Overrides:
		`[bus](MarkerLoggingAdapter.html#bus())` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		- #### logClass
		
		
		
		```
		public java.lang.Class<?> logClass()
		```
		
		
		Overrides:
		`[logClass](MarkerLoggingAdapter.html#logClass())` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`
		- #### logSource
		
		
		
		```
		public java.lang.String logSource()
		```
		
		
		Overrides:
		`[logSource](MarkerLoggingAdapter.html#logSource())` in class `[MarkerLoggingAdapter](MarkerLoggingAdapter.html "class in akka.event")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/event/BusLogging.html
- https://doc.akka.io/japi/akka/2.10/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingBus.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/event/DiagnosticMarkerBusLoggingAdapter.html](https://doc.akka.io/japi/akka/2.10/akka/event/DiagnosticMarkerBusLoggingAdapter.html)*