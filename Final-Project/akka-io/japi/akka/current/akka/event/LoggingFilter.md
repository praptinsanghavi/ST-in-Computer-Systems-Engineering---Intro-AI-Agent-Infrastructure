---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/LoggingFilter.html
title: LoggingFilter
---

# LoggingFilter

## Content

Package [akka.event](package-summary.html)
## Interface LoggingFilter

- All Known Subinterfaces:
`[LoggingFilterWithMarker](LoggingFilterWithMarker.html "interface in akka.event")`

All Known Implementing Classes:
`[DefaultLoggingFilter](DefaultLoggingFilter.html "class in akka.event")`, `[JavaLoggingFilter](jul/JavaLoggingFilter.html "class in akka.event.jul")`, `[LoggingFilterWithMarkerWrapper](LoggingFilterWithMarkerWrapper.html "class in akka.event")`, `[Slf4jLoggingFilter](slf4j/Slf4jLoggingFilter.html "class in akka.event.slf4j")`

---

```
public interface LoggingFilter
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isDebugEnabled](#isDebugEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isErrorEnabled](#isErrorEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isInfoEnabled](#isInfoEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `boolean` | `[isWarningEnabled](#isWarningEnabled(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |

- - ### Method Detail
	
	
	
		- #### isDebugEnabled
		
		
		
		```
		boolean isDebugEnabled​(java.lang.Class<?> logClass,
		                       java.lang.String logSource)
		```
		- #### isErrorEnabled
		
		
		
		```
		boolean isErrorEnabled​(java.lang.Class<?> logClass,
		                       java.lang.String logSource)
		```
		- #### isInfoEnabled
		
		
		
		```
		boolean isInfoEnabled​(java.lang.Class<?> logClass,
		                      java.lang.String logSource)
		```
		- #### isWarningEnabled
		
		
		
		```
		boolean isWarningEnabled​(java.lang.Class<?> logClass,
		                         java.lang.String logSource)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/DefaultLoggingFilter.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingFilterWithMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingFilterWithMarkerWrapper.html
- https://doc.akka.io/japi/akka/current/akka/event/jul/JavaLoggingFilter.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/event/slf4j/Slf4jLoggingFilter.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/LoggingFilter.html](https://doc.akka.io/japi/akka/current/akka/event/LoggingFilter.html)*