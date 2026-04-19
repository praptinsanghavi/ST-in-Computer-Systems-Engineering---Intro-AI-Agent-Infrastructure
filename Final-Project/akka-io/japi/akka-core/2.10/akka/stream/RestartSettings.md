---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:57:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/RestartSettings.LogSettings.html
title: RestartSettings.LogSettings
---

# RestartSettings.LogSettings

## Content

Package [akka.stream](package-summary.html)
## Class RestartSettings.LogSettings

- java.lang.Object
- - akka.stream.RestartSettings.LogSettings

- Enclosing class:
[RestartSettings](RestartSettings.html "class in akka.stream")

---

```
public static final class RestartSettings.LogSettings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogSettings](#%3Cinit%3E(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,int))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") criticalLogLevel,  int criticalLogLevelAfter)` |  |
	| `[LogSettings](#%3Cinit%3E(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,int,scala.Option))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") criticalLogLevel,  int criticalLogLevelAfter,  scala.Option<java.lang.Object> verboseLogsAfter)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[criticalLogLevel](#criticalLogLevel())()` |  |
	| `int` | `[criticalLogLevelAfter](#criticalLogLevelAfter())()` |  |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevel](#logLevel())()` |  |
	| `scala.Option<java.lang.Object>` | `[verboseLogsAfter](#verboseLogsAfter())()` |  |
	| `[RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream")` | `[withCriticalLogLevel](#withCriticalLogLevel(akka.event.Logging.LogLevel,int))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") criticalLevel,  int afterErrors)` | Possibility to use another log level after a given number of errors. |
	| `[RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream")` | `[withLogLevel](#withLogLevel(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") level)` |  |
	| `[RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream")` | `[withVerboseLogsAfter](#withVerboseLogsAfter(int))​(int afterErrors)` | If set, warning and error logs will use only the exception message up to `afterErrors` consecutive errors,  after reaching the number of consecutive errors, the entire exception with stacktrace is logged. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LogSettings
		
		
		
		```
		public LogSettings​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel,
		                   [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") criticalLogLevel,
		                   int criticalLogLevelAfter,
		                   scala.Option<java.lang.Object> verboseLogsAfter)
		```
		- #### LogSettings
		
		
		
		```
		public LogSettings​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel,
		                   [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") criticalLogLevel,
		                   int criticalLogLevelAfter)
		```

	- ### Method Detail
	
	
	
		- #### logLevel
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel()
		```
		- #### criticalLogLevel
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") criticalLogLevel()
		```
		- #### criticalLogLevelAfter
		
		
		
		```
		public int criticalLogLevelAfter()
		```
		- #### verboseLogsAfter
		
		
		
		```
		public scala.Option<java.lang.Object> verboseLogsAfter()
		```
		- #### withLogLevel
		
		
		
		```
		public [RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream") withLogLevel​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") level)
		```
		- #### withCriticalLogLevel
		
		
		
		```
		public [RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream") withCriticalLogLevel​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") criticalLevel,
		                                                        int afterErrors)
		```
		
		Possibility to use another log level after a given number of errors.
		 The initial errors are logged at the level defined with `LogSettings.withLogLevel`.
		 For example, the first 3 errors can be logged at INFO level and thereafter at ERROR level.
		 
		 The counter (and log level) is reset after the `RestartSettings.maxRestartsWithin`
		 duration.
		- #### withVerboseLogsAfter
		
		
		
		```
		public [RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream") withVerboseLogsAfter​(int afterErrors)
		```
		
		If set, warning and error logs will use only the exception message up to `afterErrors` consecutive errors,
		 after reaching the number of consecutive errors, the entire exception with stacktrace is logged.
		 
		 The counter (and verbosity level) is reset after the `RestartSettings.maxRestartsWithin`
		 duration.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/RestartSettings.LogSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/RestartSettings.LogSettings.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/RestartSettings.LogSettings.html)*