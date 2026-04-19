---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/jul/Logger$.html
title: Logger$
---

# Logger$

## Content

Package [akka.event.jul](package-summary.html)
## Class Logger$

- java.lang.Object
- - akka.event.jul.Logger$

- ---

```
public class Logger$
extends java.lang.Object
```

Deprecated.
Use SLF4J or direct java.util.logging instead. Since 2\.6\.0\.

Logger is a factory for obtaining JUL Loggers

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Logger$](Logger$.html "class in akka.event.jul")` | `[MODULE$](#MODULE$)` | Deprecated. Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Logger$](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `java.util.logging.Logger` | `[apply](#apply(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` | Deprecated. |
	| `java.util.logging.Logger` | `[apply](#apply(java.lang.String))​(java.lang.String logger)` | Deprecated. |
	| `java.util.logging.Level` | `[mapLevel](#mapLevel(akka.event.Logging.LogLevel))​([Logging.LogLevel](../Logging.LogLevel.html "class in akka.event") level)` | Deprecated. |
	| `java.util.logging.Logger` | `[root](#root())()` | Deprecated. Returns the JUL Root Logger |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Logger$](Logger$.html "class in akka.event.jul") MODULE$
		```
		
		Deprecated.
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Logger$
		
		
		
		```
		public Logger$()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public java.util.logging.Logger apply​(java.lang.String logger)
		```
		
		Deprecated.
		
		Parameters:
		`logger` \- \- which logger
		Returns:
		a Logger that corresponds for the given logger name
		- #### apply
		
		
		
		```
		public java.util.logging.Logger apply​(java.lang.Class<?> logClass,
		                                      java.lang.String logSource)
		```
		
		Deprecated.
		
		Parameters:
		`logClass` \- \- the class to log for
		`logSource` \- \- the textual representation of the source of this log stream
		Returns:
		a Logger for the specified parameters
		- #### root
		
		
		
		```
		public java.util.logging.Logger root()
		```
		
		Deprecated.
		Returns the JUL Root Logger
		- #### mapLevel
		
		
		
		```
		public java.util.logging.Level mapLevel​([Logging.LogLevel](../Logging.LogLevel.html "class in akka.event") level)
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/current/akka/event/jul/Logger$.html
- https://doc.akka.io/japi/akka/current/akka/event/jul/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/jul/Logger$.html](https://doc.akka.io/japi/akka/current/akka/event/jul/Logger$.html)*