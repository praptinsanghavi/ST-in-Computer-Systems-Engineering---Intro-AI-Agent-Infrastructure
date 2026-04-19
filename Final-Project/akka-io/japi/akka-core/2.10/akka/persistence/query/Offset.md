---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
title: Offset
---

# Offset

## Content

Package [akka.persistence.query](package-summary.html)
## Class Offset

- java.lang.Object
- - akka.persistence.query.Offset

- Direct Known Subclasses:
`[NoOffset$](NoOffset$.html "class in akka.persistence.query")`, `[Sequence](Sequence.html "class in akka.persistence.query")`, `[TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query")`, `[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")`, `[TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query")`

---

```
public abstract class Offset
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Offset](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Offset](Offset.html "class in akka.persistence.query")` | `[noOffset](#noOffset())()` |  |
	| `static [Offset](Offset.html "class in akka.persistence.query")` | `[sequence](#sequence(long))​(long value)` |  |
	| `static [Offset](Offset.html "class in akka.persistence.query")` | `[timeBasedUUID](#timeBasedUUID(java.util.UUID))​(java.util.UUID uuid)` |  |
	| `static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[timestamp](#timestamp(java.time.Instant))​(java.time.Instant instant)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Offset
		
		
		
		```
		public Offset()
		```

	- ### Method Detail
	
	
	
		- #### noOffset
		
		
		
		```
		public static [Offset](Offset.html "class in akka.persistence.query") noOffset()
		```
		- #### sequence
		
		
		
		```
		public static [Offset](Offset.html "class in akka.persistence.query") sequence​(long value)
		```
		- #### timeBasedUUID
		
		
		
		```
		public static [Offset](Offset.html "class in akka.persistence.query") timeBasedUUID​(java.util.UUID uuid)
		```
		- #### timestamp
		
		
		
		```
		public static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") timestamp​(java.time.Instant instant)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Sequence.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html)*