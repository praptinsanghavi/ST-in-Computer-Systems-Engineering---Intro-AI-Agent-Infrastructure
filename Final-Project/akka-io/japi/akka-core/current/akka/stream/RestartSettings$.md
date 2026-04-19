---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:02:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/RestartSettings$.html
title: RestartSettings$
---

# RestartSettings$

## Content

Package [akka.stream](package-summary.html)
## Class RestartSettings$

- java.lang.Object
- - akka.stream.RestartSettings$

- ---

```
public class RestartSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RestartSettings$](RestartSettings$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[apply](#apply(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,double))​(scala.concurrent.duration.FiniteDuration minBackoff,  scala.concurrent.duration.FiniteDuration maxBackoff,  double randomFactor)` | Scala API |
	| `[RestartSettings](RestartSettings.html "class in akka.stream")` | `[create](#create(java.time.Duration,java.time.Duration,double))​(java.time.Duration minBackoff,  java.time.Duration maxBackoff,  double randomFactor)` | Java API |
	| `[RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream")` | `[createLogSettings](#createLogSettings(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RestartSettings$](RestartSettings$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RestartSettings$
		
		
		
		```
		public RestartSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") apply​(scala.concurrent.duration.FiniteDuration minBackoff,
		                             scala.concurrent.duration.FiniteDuration maxBackoff,
		                             double randomFactor)
		```
		
		Scala API
		- #### create
		
		
		
		```
		public [RestartSettings](RestartSettings.html "class in akka.stream") create​(java.time.Duration minBackoff,
		                              java.time.Duration maxBackoff,
		                              double randomFactor)
		```
		
		Java API
		- #### createLogSettings
		
		
		
		```
		public [RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream") createLogSettings​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevel)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/RestartSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/RestartSettings.LogSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/RestartSettings$.html](https://doc.akka.io/japi/akka-core/current/akka/stream/RestartSettings$.html)*