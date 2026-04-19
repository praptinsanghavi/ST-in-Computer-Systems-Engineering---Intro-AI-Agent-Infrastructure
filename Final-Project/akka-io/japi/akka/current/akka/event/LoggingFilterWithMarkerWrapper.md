---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/LoggingFilterWithMarkerWrapper.html
title: LoggingFilterWithMarkerWrapper
---

# LoggingFilterWithMarkerWrapper

## Content

Package [akka.event](package-summary.html)
## Class LoggingFilterWithMarkerWrapper

- java.lang.Object
- - akka.event.LoggingFilterWithMarkerWrapper

- All Implemented Interfaces:
`[LoggingFilter](LoggingFilter.html "interface in akka.event")`, `[LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event")`

---

```
public class LoggingFilterWithMarkerWrapper
extends java.lang.Object
implements [LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingFilterWithMarkerWrapper](#%3Cinit%3E(akka.event.LoggingFilter))​([LoggingFilter](LoggingFilter.html "interface in akka.event") loggingFilter)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.event.[LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event")
		
		
		`[isDebugEnabled](LoggingFilterWithMarker.html#isDebugEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker)), [isErrorEnabled](LoggingFilterWithMarker.html#isErrorEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker)), [isInfoEnabled](LoggingFilterWithMarker.html#isInfoEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker)), [isWarningEnabled](LoggingFilterWithMarker.html#isWarningEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))`

- - ### Constructor Detail
	
	
	
		- #### LoggingFilterWithMarkerWrapper
		
		
		
		```
		public LoggingFilterWithMarkerWrapper​([LoggingFilter](LoggingFilter.html "interface in akka.event") loggingFilter)
		```

	- ### Method Detail
	
	
	
		- #### isDebugEnabled
		
		
		
		```
		public boolean isDebugEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource)
		```
		
		
		Specified by:
		`[isDebugEnabled](LoggingFilter.html#isDebugEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](LoggingFilter.html "interface in akka.event")`
		- #### isErrorEnabled
		
		
		
		```
		public boolean isErrorEnabled​(java.lang.Class<?> logClass,
		                              java.lang.String logSource)
		```
		
		
		Specified by:
		`[isErrorEnabled](LoggingFilter.html#isErrorEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](LoggingFilter.html "interface in akka.event")`
		- #### isInfoEnabled
		
		
		
		```
		public boolean isInfoEnabled​(java.lang.Class<?> logClass,
		                             java.lang.String logSource)
		```
		
		
		Specified by:
		`[isInfoEnabled](LoggingFilter.html#isInfoEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](LoggingFilter.html "interface in akka.event")`
		- #### isWarningEnabled
		
		
		
		```
		public boolean isWarningEnabled​(java.lang.Class<?> logClass,
		                                java.lang.String logSource)
		```
		
		
		Specified by:
		`[isWarningEnabled](LoggingFilter.html#isWarningEnabled(java.lang.Class,java.lang.String))` in interface `[LoggingFilter](LoggingFilter.html "interface in akka.event")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/LoggingFilterWithMarkerWrapper.html](https://doc.akka.io/japi/akka/current/akka/event/LoggingFilterWithMarkerWrapper.html)*