---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/slf4j/Slf4jLogMarker.html
title: Slf4jLogMarker
---

# Slf4jLogMarker

## Content

Package [akka.event.slf4j](package-summary.html)
## Class Slf4jLogMarker

- java.lang.Object
- - [akka.event.LogMarker](../LogMarker.html "class in akka.event")
	- - akka.event.slf4j.Slf4jLogMarker

- ---

```
public final class Slf4jLogMarker
extends [LogMarker](../LogMarker.html "class in akka.event")
```

Wraps `Marker`

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.event.[LogMarker](../LogMarker.html "class in akka.event")
		
		
		`[LogMarker.Properties$](../LogMarker.Properties$.html "class in akka.event")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Slf4jLogMarker](#%3Cinit%3E(org.slf4j.Marker))​(org.slf4j.Marker marker)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Slf4jLogMarker](Slf4jLogMarker.html "class in akka.event.slf4j")` | `[apply](#apply(org.slf4j.Marker))​(org.slf4j.Marker marker)` |  |
	| `static [Slf4jLogMarker](Slf4jLogMarker.html "class in akka.event.slf4j")` | `[create](#create(org.slf4j.Marker))​(org.slf4j.Marker marker)` | Java API |
	| `org.slf4j.Marker` | `[marker](#marker())()` |  |
	
	
		- ### Methods inherited from class akka.event.[LogMarker](../LogMarker.html "class in akka.event")
		
		
		`[apply](../LogMarker.html#apply(java.lang.String)), [apply](../LogMarker.html#apply(java.lang.String,scala.collection.immutable.Map)), [create](../LogMarker.html#create(java.lang.String)), [create](../LogMarker.html#create(java.lang.String,java.util.Map)), [getProperties](../LogMarker.html#getProperties()), [name](../LogMarker.html#name()), [properties](../LogMarker.html#properties()), [toString](../LogMarker.html#toString())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Slf4jLogMarker
		
		
		
		```
		public Slf4jLogMarker​(org.slf4j.Marker marker)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Slf4jLogMarker](Slf4jLogMarker.html "class in akka.event.slf4j") apply​(org.slf4j.Marker marker)
		```
		- #### create
		
		
		
		```
		public static [Slf4jLogMarker](Slf4jLogMarker.html "class in akka.event.slf4j") create​(org.slf4j.Marker marker)
		```
		
		Java API
		- #### marker
		
		
		
		```
		public org.slf4j.Marker marker()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/LogMarker.Properties$.html
- https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/slf4j/Slf4jLogMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/slf4j/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/slf4j/Slf4jLogMarker.html](https://doc.akka.io/japi/akka/current/akka/event/slf4j/Slf4jLogMarker.html)*