---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/DefaultNoLogging$.html
title: DefaultNoLogging$
---

# DefaultNoLogging$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class DefaultNoLogging$

- java.lang.Object
- - akka.http.impl.util.DefaultNoLogging$

- All Implemented Interfaces:
`akka.event.LoggingAdapter`

---

```
public class DefaultNoLogging$
extends java.lang.Object
implements akka.event.LoggingAdapter
```

INTERNAL API
 
 A copy of NoLogging that can be used as a place\-holder for "logging not explicitly specified".
 It can be matched on to be overridden with default behavior.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DefaultNoLogging$](DefaultNoLogging$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultNoLogging$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DefaultNoLogging$](DefaultNoLogging$.html "class in akka.http.impl.util")` | `[getInstance](#getInstance())()` | Java API to return the reference to NoLogging |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled())()` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled())()` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled())()` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled())()` |  |
	| `protected void` | `[notifyDebug](#notifyDebug(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyError](#notifyError(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyError](#notifyError(java.lang.Throwable,java.lang.String))​(java.lang.Throwable cause,  java.lang.String message)` |  |
	| `protected void` | `[notifyInfo](#notifyInfo(java.lang.String))​(java.lang.String message)` |  |
	| `protected void` | `[notifyWarning](#notifyWarning(java.lang.String))​(java.lang.String message)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.event.LoggingAdapter
		
		
		`debug, debug, debug, debug, debug, error, error, error, error, error, error, error, error, error, error, format, info, info, info, info, info, isEnabled, log, log, log, log, log, mdc, notifyLog, notifyWarning, warning, warning, warning, warning, warning, warning, warning, warning, warning, warning`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DefaultNoLogging$](DefaultNoLogging$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DefaultNoLogging$
		
		
		
		```
		public DefaultNoLogging$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [DefaultNoLogging$](DefaultNoLogging$.html "class in akka.http.impl.util") getInstance()
		```
		
		Java API to return the reference to NoLogging
		
		Returns:
		The NoLogging instance
		- #### isErrorEnabled
		
		
		
		```
		public final boolean isErrorEnabled()
		```
		
		
		Specified by:
		`isErrorEnabled` in interface `akka.event.LoggingAdapter`
		- #### isWarningEnabled
		
		
		
		```
		public final boolean isWarningEnabled()
		```
		
		
		Specified by:
		`isWarningEnabled` in interface `akka.event.LoggingAdapter`
		- #### isInfoEnabled
		
		
		
		```
		public final boolean isInfoEnabled()
		```
		
		
		Specified by:
		`isInfoEnabled` in interface `akka.event.LoggingAdapter`
		- #### isDebugEnabled
		
		
		
		```
		public final boolean isDebugEnabled()
		```
		
		
		Specified by:
		`isDebugEnabled` in interface `akka.event.LoggingAdapter`
		- #### notifyError
		
		
		
		```
		protected final void notifyError​(java.lang.String message)
		```
		
		
		Specified by:
		`notifyError` in interface `akka.event.LoggingAdapter`
		- #### notifyError
		
		
		
		```
		protected final void notifyError​(java.lang.Throwable cause,
		                                 java.lang.String message)
		```
		
		
		Specified by:
		`notifyError` in interface `akka.event.LoggingAdapter`
		- #### notifyWarning
		
		
		
		```
		protected final void notifyWarning​(java.lang.String message)
		```
		
		
		Specified by:
		`notifyWarning` in interface `akka.event.LoggingAdapter`
		- #### notifyInfo
		
		
		
		```
		protected final void notifyInfo​(java.lang.String message)
		```
		
		
		Specified by:
		`notifyInfo` in interface `akka.event.LoggingAdapter`
		- #### notifyDebug
		
		
		
		```
		protected final void notifyDebug​(java.lang.String message)
		```
		
		
		Specified by:
		`notifyDebug` in interface `akka.event.LoggingAdapter`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/DefaultNoLogging$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/DefaultNoLogging$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/DefaultNoLogging$.html)*