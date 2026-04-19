---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/event/slf4j/Logger$.html
title: Logger$
---

# Logger$

## Content

Package [akka.event.slf4j](package-summary.html)
## Class Logger$

- java.lang.Object
- - akka.event.slf4j.Logger$

- ---

```
public class Logger$
extends java.lang.Object
```

Logger is a factory for obtaining SLF4J\-Loggers

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Logger$](Logger$.html "class in akka.event.slf4j")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Logger$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `org.slf4j.Logger` | `[apply](#apply(java.lang.Class,java.lang.String))​(java.lang.Class<?> logClass,  java.lang.String logSource)` |  |
	| `org.slf4j.Logger` | `[apply](#apply(java.lang.String))​(java.lang.String logger)` |  |
	| `org.slf4j.Logger` | `[root](#root())()` | Returns the SLF4J Root Logger |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Logger$](Logger$.html "class in akka.event.slf4j") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Logger$
		
		
		
		```
		public Logger$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public org.slf4j.Logger apply​(java.lang.String logger)
		```
		
		
		Parameters:
		`logger` \- \- which logger
		Returns:
		a Logger that corresponds for the given logger name
		- #### apply
		
		
		
		```
		public org.slf4j.Logger apply​(java.lang.Class<?> logClass,
		                              java.lang.String logSource)
		```
		
		
		Parameters:
		`logClass` \- \- the class to log for
		`logSource` \- \- the textual representation of the source of this log stream
		Returns:
		a Logger for the specified parameters
		- #### root
		
		
		
		```
		public org.slf4j.Logger root()
		```
		
		Returns the SLF4J Root Logger

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/slf4j/Logger$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/slf4j/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/event/slf4j/Logger$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/event/slf4j/Logger$.html)*