---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DiagnosticLoggingAdapter.html
title: DiagnosticLoggingAdapter
---

# DiagnosticLoggingAdapter

## Content

Package [akka.event](package-summary.html)
## Interface DiagnosticLoggingAdapter

- All Superinterfaces:
`[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`

All Known Implementing Classes:
`[DiagnosticMarkerBusLoggingAdapter](DiagnosticMarkerBusLoggingAdapter.html "class in akka.event")`

---

```
public interface DiagnosticLoggingAdapter
extends [LoggingAdapter](LoggingAdapter.html "interface in akka.event")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_mdc_$eq](#_mdc_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)` |  |
	| `void` | `[clearMDC](#clearMDC())()` | Clear all entries in the MDC |
	| `java.util.Map<java.lang.String,​java.lang.Object>` | `[getMDC](#getMDC())()` | Java API:  Mapped Diagnostic Context for application defined values  which can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured. |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[mdc](#mdc())()` | Scala API:  Mapped Diagnostic Context for application defined values  which can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured. |
	| `void` | `[mdc](#mdc(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> mdc)` | Scala API:  Sets the values to be added to the MDC (Mapped Diagnostic Context) before the log is appended. |
	| `void` | `[setMDC](#setMDC(java.util.Map))​(java.util.Map<java.lang.String,​java.lang.Object> jMdc)` | Java API:  Sets the values to be added to the MDC (Mapped Diagnostic Context) before the log is appended. |
	
	
		- ### Methods inherited from interface akka.event.[LoggingAdapter](LoggingAdapter.html "interface in akka.event")
		
		
		`[debug](LoggingAdapter.html#debug(java.lang.String)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [format](LoggingAdapter.html#format(java.lang.String,scala.collection.immutable.Seq)), [format1](LoggingAdapter.html#format1(java.lang.String,java.lang.Object)), [formatImpl](LoggingAdapter.html#formatImpl(java.lang.String,scala.collection.immutable.Seq)), [info](LoggingAdapter.html#info(java.lang.String)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [isDebugEnabled](LoggingAdapter.html#isDebugEnabled()), [isEnabled](LoggingAdapter.html#isEnabled(akka.event.Logging.LogLevel)), [isErrorEnabled](LoggingAdapter.html#isErrorEnabled()), [isInfoEnabled](LoggingAdapter.html#isInfoEnabled()), [isWarningEnabled](LoggingAdapter.html#isWarningEnabled()), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [notifyDebug](LoggingAdapter.html#notifyDebug(java.lang.String)), [notifyError](LoggingAdapter.html#notifyError(java.lang.String)), [notifyError](LoggingAdapter.html#notifyError(java.lang.Throwable,java.lang.String)), [notifyInfo](LoggingAdapter.html#notifyInfo(java.lang.String)), [notifyLog](LoggingAdapter.html#notifyLog(akka.event.Logging.LogLevel,java.lang.String)), [notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.String)), [notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.Throwable,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`

- - ### Method Detail
	
	
	
		- #### \_mdc\_$eq
		
		
		
		```
		void _mdc_$eq​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)
		```
		- #### clearMDC
		
		
		
		```
		void clearMDC()
		```
		
		Clear all entries in the MDC
		- #### getMDC
		
		
		
		```
		java.util.Map<java.lang.String,​java.lang.Object> getMDC()
		```
		
		Java API:
		 Mapped Diagnostic Context for application defined values
		 which can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.
		 Visit [Logback Docs: MDC](https://logback.qos.ch/manual/mdc.html) for more information.
		 Note tha it returns a **COPY** of the actual MDC values.
		 You cannot modify any value by changing the returned Map.
		 Code like the following won't have any effect unless you set back the modified Map.
		 
		
		
		
		```
		
		   Map mdc = log.getMDC();
		   mdc.put("key", value);
		   // NEEDED
		   log.setMDC(mdc);
		 
		```
		
		
		
		Returns:
		A copy of the actual MDC values
		- #### mdc
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​java.lang.Object> mdc()
		```
		
		Scala API:
		 Mapped Diagnostic Context for application defined values
		 which can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.
		 Visit [Logback Docs: MDC](https://logback.qos.ch/manual/mdc.html) for more information.
		 
		
		Specified by:
		`[mdc](LoggingAdapter.html#mdc())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		Returns:
		A Map containing the MDC values added by the application, or empty Map if no value was added.
		- #### mdc
		
		
		
		```
		void mdc​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> mdc)
		```
		
		Scala API:
		 Sets the values to be added to the MDC (Mapped Diagnostic Context) before the log is appended.
		 These values can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.
		 Visit [Logback Docs: MDC](https://logback.qos.ch/manual/mdc.html) for more information.
		- #### setMDC
		
		
		
		```
		void setMDC​(java.util.Map<java.lang.String,​java.lang.Object> jMdc)
		```
		
		Java API:
		 Sets the values to be added to the MDC (Mapped Diagnostic Context) before the log is appended.
		 These values can be used in PatternLayout when `akka.event.slf4j.Slf4jLogger` is configured.
		 Visit [Logback Docs: MDC](https://logback.qos.ch/manual/mdc.html) for more information.

## Code Examples

### Example 1: getMDC

```text
Map mdc = log.getMDC();
   mdc.put("key", value);
   // NEEDED
   log.setMDC(mdc);
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DiagnosticMarkerBusLoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DiagnosticLoggingAdapter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/event/DiagnosticLoggingAdapter.html)*