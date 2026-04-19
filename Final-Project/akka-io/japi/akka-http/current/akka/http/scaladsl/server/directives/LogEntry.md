---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LogEntry.html
title: LogEntry
---

# LogEntry

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class LogEntry

- java.lang.Object
- - [akka.http.javadsl.server.directives.LogEntry](../../../javadsl/server/directives/LogEntry.html "class in akka.http.javadsl.server.directives")
	- - akka.http.scaladsl.server.directives.LogEntry

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class LogEntry
extends [LogEntry](../../../javadsl/server/directives/LogEntry.html "class in akka.http.javadsl.server.directives")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.server.directives.LogEntry)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogEntry](#%3Cinit%3E(java.lang.Object,akka.event.Logging.LogLevel))​(java.lang.Object obj,  akka.event.Logging.LogLevel level)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives")` | `[apply](#apply(java.lang.Object,java.lang.String,akka.event.Logging.LogLevel))​(java.lang.Object obj,  java.lang.String marker,  akka.event.Logging.LogLevel level)` |  |
	| `akka.event.Logging.LogLevel` | `[getLevel](#getLevel())()` |  |
	| `java.lang.Object` | `[getObj](#getObj())()` |  |
	| `akka.event.Logging.LogLevel` | `[level](#level())()` |  |
	| `void` | `[logTo](#logTo(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` |  |
	| `java.lang.Object` | `[obj](#obj())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.server.directives.[LogEntry](../../../javadsl/server/directives/LogEntry.html "class in akka.http.javadsl.server.directives")
		
		
		`[create](../../../javadsl/server/directives/LogEntry.html#create(java.lang.Object,akka.event.Logging.LogLevel)), [debug](../../../javadsl/server/directives/LogEntry.html#debug(java.lang.Object)), [error](../../../javadsl/server/directives/LogEntry.html#error(java.lang.Object)), [info](../../../javadsl/server/directives/LogEntry.html#info(java.lang.Object)), [warning](../../../javadsl/server/directives/LogEntry.html#warning(java.lang.Object))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### LogEntry
		
		
		
		```
		public LogEntry​(java.lang.Object obj,
		                akka.event.Logging.LogLevel level)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives") apply​(java.lang.Object obj,
		                             java.lang.String marker,
		                             akka.event.Logging.LogLevel level)
		```
		- #### obj
		
		
		
		```
		public java.lang.Object obj()
		```
		- #### level
		
		
		
		```
		public akka.event.Logging.LogLevel level()
		```
		- #### logTo
		
		
		
		```
		public void logTo​(akka.event.LoggingAdapter log)
		```
		- #### getObj
		
		
		
		```
		public java.lang.Object getObj()
		```
		
		
		Specified by:
		`[getObj](../../../javadsl/server/directives/LogEntry.html#getObj())` in class `[LogEntry](../../../javadsl/server/directives/LogEntry.html "class in akka.http.javadsl.server.directives")`
		- #### getLevel
		
		
		
		```
		public akka.event.Logging.LogLevel getLevel()
		```
		
		
		Specified by:
		`[getLevel](../../../javadsl/server/directives/LogEntry.html#getLevel())` in class `[LogEntry](../../../javadsl/server/directives/LogEntry.html "class in akka.http.javadsl.server.directives")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/LogEntry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LogEntry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LogEntry.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/LogEntry.html)*