---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset$.html
title: Offset$
---

# Offset$

## Content

Package [akka.persistence.query](package-summary.html)
## Class Offset$

- java.lang.Object
- - akka.persistence.query.Offset$

- ---

```
public class Offset$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Offset$](Offset$.html "class in akka.persistence.query")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Offset$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Offset](Offset.html "class in akka.persistence.query")` | `[noOffset](#noOffset())()` |  |
	| `[Offset](Offset.html "class in akka.persistence.query")` | `[sequence](#sequence(long))​(long value)` |  |
	| `[Offset](Offset.html "class in akka.persistence.query")` | `[timeBasedUUID](#timeBasedUUID(java.util.UUID))​(java.util.UUID uuid)` |  |
	| `[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[timestamp](#timestamp(java.time.Instant))​(java.time.Instant instant)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Offset$](Offset$.html "class in akka.persistence.query") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Offset$
		
		
		
		```
		public Offset$()
		```

	- ### Method Detail
	
	
	
		- #### noOffset
		
		
		
		```
		public [Offset](Offset.html "class in akka.persistence.query") noOffset()
		```
		- #### sequence
		
		
		
		```
		public [Offset](Offset.html "class in akka.persistence.query") sequence​(long value)
		```
		- #### timeBasedUUID
		
		
		
		```
		public [Offset](Offset.html "class in akka.persistence.query") timeBasedUUID​(java.util.UUID uuid)
		```
		- #### timestamp
		
		
		
		```
		public [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") timestamp​(java.time.Instant instant)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset$.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset$.html)*