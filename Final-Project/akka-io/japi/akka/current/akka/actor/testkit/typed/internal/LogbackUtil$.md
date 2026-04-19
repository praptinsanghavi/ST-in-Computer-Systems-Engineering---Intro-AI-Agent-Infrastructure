---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/LogbackUtil$.html
title: LogbackUtil$
---

# LogbackUtil$

## Content

Package [akka.actor.testkit.typed.internal](package-summary.html)
## Class LogbackUtil$

- java.lang.Object
- - akka.actor.testkit.typed.internal.LogbackUtil$

- ---

```
public class LogbackUtil$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LogbackUtil$](LogbackUtil$.html "class in akka.actor.testkit.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogbackUtil$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `org.slf4j.event.Level` | `[convertLevel](#convertLevel(ch.qos.logback.classic.Level))​(ch.qos.logback.classic.Level level)` |  |
	| `ch.qos.logback.classic.Logger` | `[getLogbackLogger](#getLogbackLogger(java.lang.String))​(java.lang.String loggerName)` |  |
	| `java.lang.String` | `[loggerNameOrRoot](#loggerNameOrRoot(java.lang.String))​(java.lang.String loggerName)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LogbackUtil$](LogbackUtil$.html "class in akka.actor.testkit.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LogbackUtil$
		
		
		
		```
		public LogbackUtil$()
		```

	- ### Method Detail
	
	
	
		- #### loggerNameOrRoot
		
		
		
		```
		public java.lang.String loggerNameOrRoot​(java.lang.String loggerName)
		```
		- #### getLogbackLogger
		
		
		
		```
		public ch.qos.logback.classic.Logger getLogbackLogger​(java.lang.String loggerName)
		```
		- #### convertLevel
		
		
		
		```
		public org.slf4j.event.Level convertLevel​(ch.qos.logback.classic.Level level)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/LogbackUtil$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/LogbackUtil$.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/internal/LogbackUtil$.html)*