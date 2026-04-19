---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/LoggerClass.html
title: LoggerClass
---

# LoggerClass

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class LoggerClass

- java.lang.Object
- - akka.actor.typed.internal.LoggerClass

- ---

```
public class LoggerClass
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggerClass](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.Class<?>` | `[detectLoggerClassFromStack](#detectLoggerClassFromStack(java.lang.Class,scala.collection.immutable.List))​(java.lang.Class<?> default_,  scala.collection.immutable.List<java.lang.String> additionalPrefixesToSkip)` | Try to extract a logger class from the call stack, if not possible the provided default is used |
	| `static scala.collection.immutable.List<java.lang.String>` | `[detectLoggerClassFromStack$default$2](#detectLoggerClassFromStack$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LoggerClass
		
		
		
		```
		public LoggerClass()
		```

	- ### Method Detail
	
	
	
		- #### detectLoggerClassFromStack
		
		
		
		```
		public static java.lang.Class<?> detectLoggerClassFromStack​(java.lang.Class<?> default_,
		                                                            scala.collection.immutable.List<java.lang.String> additionalPrefixesToSkip)
		```
		
		Try to extract a logger class from the call stack, if not possible the provided default is used
		- #### detectLoggerClassFromStack$default$2
		
		
		
		```
		public static scala.collection.immutable.List<java.lang.String> detectLoggerClassFromStack$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/LoggerClass.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/LoggerClass.html)*