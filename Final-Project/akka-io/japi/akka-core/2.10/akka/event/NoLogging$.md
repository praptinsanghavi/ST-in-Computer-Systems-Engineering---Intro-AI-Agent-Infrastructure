---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:40:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/NoLogging$.html
title: NoLogging$
---

# NoLogging$

## Content

Package [akka.event](package-summary.html)
## Class NoLogging$

- java.lang.Object
- - akka.event.NoLogging$

- All Implemented Interfaces:
`[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`

---

```
public class NoLogging$
extends java.lang.Object
implements [LoggingAdapter](LoggingAdapter.html "interface in akka.event")
```

NoLogging is a LoggingAdapter that does absolutely nothing – no logging at all.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoLogging$](NoLogging$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoLogging$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[NoLogging$](NoLogging$.html "class in akka.event")` | `[getInstance](#getInstance())()` | Java API to return the reference to NoLogging |
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
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.event.[LoggingAdapter](LoggingAdapter.html "interface in akka.event")
		
		
		`[debug](LoggingAdapter.html#debug(java.lang.String)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [debug](LoggingAdapter.html#debug(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [error](LoggingAdapter.html#error(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [format](LoggingAdapter.html#format(java.lang.String,scala.collection.immutable.Seq)), [format1](LoggingAdapter.html#format1(java.lang.String,java.lang.Object)), [formatImpl](LoggingAdapter.html#formatImpl(java.lang.String,scala.collection.immutable.Seq)), [info](LoggingAdapter.html#info(java.lang.String)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [info](LoggingAdapter.html#info(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [isEnabled](LoggingAdapter.html#isEnabled(akka.event.Logging.LogLevel)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [log](LoggingAdapter.html#log(akka.event.Logging.LogLevel,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [mdc](LoggingAdapter.html#mdc()), [notifyLog](LoggingAdapter.html#notifyLog(akka.event.Logging.LogLevel,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)), [warning](LoggingAdapter.html#warning(java.lang.Throwable,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoLogging$](NoLogging$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoLogging$
		
		
		
		```
		public NoLogging$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [NoLogging$](NoLogging$.html "class in akka.event") getInstance()
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
		- #### isWarningEnabled
		
		
		
		```
		public final boolean isWarningEnabled()
		```
		
		
		Specified by:
		`[isWarningEnabled](LoggingAdapter.html#isWarningEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### isInfoEnabled
		
		
		
		```
		public final boolean isInfoEnabled()
		```
		
		
		Specified by:
		`[isInfoEnabled](LoggingAdapter.html#isInfoEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### isDebugEnabled
		
		
		
		```
		public final boolean isDebugEnabled()
		```
		
		
		Specified by:
		`[isDebugEnabled](LoggingAdapter.html#isDebugEnabled())` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyError
		
		
		
		```
		protected final void notifyError​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyError](LoggingAdapter.html#notifyError(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyError
		
		
		
		```
		protected final void notifyError​(java.lang.Throwable cause,
		                                 java.lang.String message)
		```
		
		
		Specified by:
		`[notifyError](LoggingAdapter.html#notifyError(java.lang.Throwable,java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyWarning
		
		
		
		```
		protected final void notifyWarning​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyWarning
		
		
		
		```
		protected final void notifyWarning​(java.lang.Throwable cause,
		                                   java.lang.String message)
		```
		
		
		Specified by:
		`[notifyWarning](LoggingAdapter.html#notifyWarning(java.lang.Throwable,java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyInfo
		
		
		
		```
		protected final void notifyInfo​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyInfo](LoggingAdapter.html#notifyInfo(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`
		- #### notifyDebug
		
		
		
		```
		protected final void notifyDebug​(java.lang.String message)
		```
		
		
		Specified by:
		`[notifyDebug](LoggingAdapter.html#notifyDebug(java.lang.String))` in interface `[LoggingAdapter](LoggingAdapter.html "interface in akka.event")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/NoLogging$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/NoLogging$.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/NoLogging$.html)*