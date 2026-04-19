---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html
title: LogEntry
---

# LogEntry

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class LogEntry

- java.lang.Object
- - akka.http.javadsl.server.directives.LogEntry

- Direct Known Subclasses:
`[LogEntry](../../../scaladsl/server/directives/LogEntry.html "class in akka.http.scaladsl.server.directives")`

---

```
public abstract class LogEntry
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogEntry](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")` | `[create](#create(java.lang.Object,akka.event.Logging.LogLevel))​(java.lang.Object obj,  akka.event.Logging.LogLevel level)` |  |
	| `static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")` | `[debug](#debug(java.lang.Object))​(java.lang.Object obj)` |  |
	| `static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")` | `[error](#error(java.lang.Object))​(java.lang.Object obj)` |  |
	| `abstract akka.event.Logging.LogLevel` | `[getLevel](#getLevel())()` |  |
	| `abstract java.lang.Object` | `[getObj](#getObj())()` |  |
	| `static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")` | `[info](#info(java.lang.Object))​(java.lang.Object obj)` |  |
	| `static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")` | `[warning](#warning(java.lang.Object))​(java.lang.Object obj)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LogEntry
		
		
		
		```
		public LogEntry()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives") create​(java.lang.Object obj,
		                              akka.event.Logging.LogLevel level)
		```
		- #### debug
		
		
		
		```
		public static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives") debug​(java.lang.Object obj)
		```
		- #### info
		
		
		
		```
		public static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives") info​(java.lang.Object obj)
		```
		- #### warning
		
		
		
		```
		public static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives") warning​(java.lang.Object obj)
		```
		- #### error
		
		
		
		```
		public static [LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives") error​(java.lang.Object obj)
		```
		- #### getObj
		
		
		
		```
		public abstract java.lang.Object getObj()
		```
		- #### getLevel
		
		
		
		```
		public abstract akka.event.Logging.LogLevel getLevel()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/LogEntry.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html)*