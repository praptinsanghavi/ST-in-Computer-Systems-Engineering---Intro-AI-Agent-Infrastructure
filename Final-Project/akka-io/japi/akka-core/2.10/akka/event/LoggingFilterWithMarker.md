---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilterWithMarker.html
title: LoggingFilterWithMarker
---

# LoggingFilterWithMarker

## Content

Package [akka.event](package-summary.html)
## Interface LoggingFilterWithMarker

- All Superinterfaces:
`[LoggingFilter](LoggingFilter.html "interface in akka.event")`

All Known Implementing Classes:
`[DefaultLoggingFilter](DefaultLoggingFilter.html "class in akka.event")`, `[LoggingFilterWithMarkerWrapper](LoggingFilterWithMarkerWrapper.html "class in akka.event")`, `[Slf4jLoggingFilter](slf4j/Slf4jLoggingFilter.html "class in akka.event.slf4j")`

---

```
public interface LoggingFilterWithMarker
extends [LoggingFilter](LoggingFilter.html "interface in akka.event")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))​(java.lang.Class<?> logClass,  java.lang.String logSource,  [LogMarker](LogMarker.html "class in akka.event") marker)` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))​(java.lang.Class<?> logClass,  java.lang.String logSource,  [LogMarker](LogMarker.html "class in akka.event") marker)` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))​(java.lang.Class<?> logClass,  java.lang.String logSource,  [LogMarker](LogMarker.html "class in akka.event") marker)` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled(java.lang.Class,java.lang.String,akka.event.LogMarker))​(java.lang.Class<?> logClass,  java.lang.String logSource,  [LogMarker](LogMarker.html "class in akka.event") marker)` |  |
	
	
		- ### Methods inherited from interface akka.event.[LoggingFilter](LoggingFilter.html "interface in akka.event")
		
		
		`[isDebugEnabled](LoggingFilter.html#isDebugEnabled(java.lang.Class,java.lang.String)), [isErrorEnabled](LoggingFilter.html#isErrorEnabled(java.lang.Class,java.lang.String)), [isInfoEnabled](LoggingFilter.html#isInfoEnabled(java.lang.Class,java.lang.String)), [isWarningEnabled](LoggingFilter.html#isWarningEnabled(java.lang.Class,java.lang.String))`

- - ### Method Detail
	
	
	
		- #### isErrorEnabled
		
		
		
		```
		boolean isErrorEnabled​(java.lang.Class<?> logClass,
		                       java.lang.String logSource,
		                       [LogMarker](LogMarker.html "class in akka.event") marker)
		```
		- #### isWarningEnabled
		
		
		
		```
		boolean isWarningEnabled​(java.lang.Class<?> logClass,
		                         java.lang.String logSource,
		                         [LogMarker](LogMarker.html "class in akka.event") marker)
		```
		- #### isInfoEnabled
		
		
		
		```
		boolean isInfoEnabled​(java.lang.Class<?> logClass,
		                      java.lang.String logSource,
		                      [LogMarker](LogMarker.html "class in akka.event") marker)
		```
		- #### isDebugEnabled
		
		
		
		```
		boolean isDebugEnabled​(java.lang.Class<?> logClass,
		                       java.lang.String logSource,
		                       [LogMarker](LogMarker.html "class in akka.event") marker)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/DefaultLoggingFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilterWithMarkerWrapper.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Slf4jLoggingFilter.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilterWithMarker.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilterWithMarker.html)*