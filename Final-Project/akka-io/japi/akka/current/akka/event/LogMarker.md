---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html
title: LogMarker
---

# LogMarker

## Content

Package [akka.event](package-summary.html)
## Class LogMarker

- java.lang.Object
- - akka.event.LogMarker

- Direct Known Subclasses:
`[Slf4jLogMarker](slf4j/Slf4jLogMarker.html "class in akka.event.slf4j")`

---

```
public class LogMarker
extends java.lang.Object
```

DO NOT INHERIT: Class is open only for use by akka\-slf4j

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[LogMarker.Properties$](LogMarker.Properties$.html "class in akka.event")` | INTERNAL API |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogMarker](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |
	| `[LogMarker](#%3Cinit%3E(java.lang.String,scala.collection.immutable.Map))​(java.lang.String name,  scala.collection.immutable.Map<java.lang.String,​java.lang.Object> properties)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LogMarker](LogMarker.html "class in akka.event")` | `[apply](#apply(java.lang.String))​(java.lang.String name)` |  |
	| `static [LogMarker](LogMarker.html "class in akka.event")` | `[apply](#apply(java.lang.String,scala.collection.immutable.Map))​(java.lang.String name,  scala.collection.immutable.Map<java.lang.String,​java.lang.Object> properties)` |  |
	| `static [LogMarker](LogMarker.html "class in akka.event")` | `[create](#create(java.lang.String))​(java.lang.String name)` | Java API |
	| `static [LogMarker](LogMarker.html "class in akka.event")` | `[create](#create(java.lang.String,java.util.Map))​(java.lang.String name,  java.util.Map<java.lang.String,​java.lang.Object> properties)` | Java API |
	| `java.util.Map<java.lang.String,​java.lang.Object>` | `[getProperties](#getProperties())()` | Java API |
	| `java.lang.String` | `[name](#name())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[properties](#properties())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LogMarker
		
		
		
		```
		public LogMarker​(java.lang.String name,
		                 scala.collection.immutable.Map<java.lang.String,​java.lang.Object> properties)
		```
		- #### LogMarker
		
		
		
		```
		public LogMarker​(java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [LogMarker](LogMarker.html "class in akka.event") apply​(java.lang.String name)
		```
		- #### apply
		
		
		
		```
		public static [LogMarker](LogMarker.html "class in akka.event") apply​(java.lang.String name,
		                              scala.collection.immutable.Map<java.lang.String,​java.lang.Object> properties)
		```
		- #### create
		
		
		
		```
		public static [LogMarker](LogMarker.html "class in akka.event") create​(java.lang.String name)
		```
		
		Java API
		- #### create
		
		
		
		```
		public static [LogMarker](LogMarker.html "class in akka.event") create​(java.lang.String name,
		                               java.util.Map<java.lang.String,​java.lang.Object> properties)
		```
		
		Java API
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### properties
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.Object> properties()
		```
		- #### getProperties
		
		
		
		```
		public java.util.Map<java.lang.String,​java.lang.Object> getProperties()
		```
		
		Java API
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/LogMarker.Properties$.html
- https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/event/slf4j/Slf4jLogMarker.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html](https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html)*