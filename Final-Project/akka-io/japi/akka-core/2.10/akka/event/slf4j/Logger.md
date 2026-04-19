---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Logger.html
title: Logger
---

# Logger

## Content

Package [akka.event.slf4j](package-summary.html)
## Class Logger

- java.lang.Object
- - akka.event.slf4j.Logger

- ---

```
public class Logger
extends java.lang.Object
```

Logger is a factory for obtaining SLF4J\-Loggers

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Logger](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static org.slf4j.Logger` | `[apply](#apply(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `static org.slf4j.Logger` | `[apply](#apply(java.lang.String))​(java.lang.String logger)` |  |
	| `static org.slf4j.Logger` | `[root](#root())()` | Returns the SLF4J Root Logger |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Logger
		
		
		
		```
		public Logger()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static org.slf4j.Logger apply​(java.lang.String logger)
		```
		
		
		Parameters:
		`logger` \- \- which logger
		Returns:
		a Logger that corresponds for the given logger name
		- #### apply
		
		
		
		```
		public static org.slf4j.Logger apply​(java.lang.Class<?> logClass,
		                                     java.lang.String logSource)
		```
		
		
		Parameters:
		`logClass` \- \- the class to log for
		`logSource` \- \- the textual representation of the source of this log stream
		Returns:
		a Logger for the specified parameters
		- #### root
		
		
		
		```
		public static org.slf4j.Logger root()
		```
		
		Returns the SLF4J Root Logger

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Logger.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Logger.html)*