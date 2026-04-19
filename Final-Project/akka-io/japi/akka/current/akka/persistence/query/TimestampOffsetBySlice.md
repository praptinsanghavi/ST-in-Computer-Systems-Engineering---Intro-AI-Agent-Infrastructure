---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice.html
title: TimestampOffsetBySlice
---

# TimestampOffsetBySlice

## Content

Package [akka.persistence.query](package-summary.html)
## Class TimestampOffsetBySlice

- java.lang.Object
- - [akka.persistence.query.Offset](Offset.html "class in akka.persistence.query")
	- - akka.persistence.query.TimestampOffsetBySlice

- ---

```
public final class TimestampOffsetBySlice
extends [Offset](Offset.html "class in akka.persistence.query")
```

Timestamp\-based offset by slice.
 
 API May Change
 

 param: offsets
 Map of TimestampOffset by slice

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimestampOffsetBySlice](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query")` | `[apply](#apply(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offsets)` |  |
	| `static [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query")` | `[create](#create(java.util.Map))​(java.util.Map<java.lang.Integer,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offsets)` | Java API |
	| `static [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query")` | `[empty](#empty())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `java.util.Optional<[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")>` | `[getOffset](#getOffset(int))​(int slice)` | Java API |
	| `java.util.Map<java.lang.Integer,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")>` | `[getOffsets](#getOffsets())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.Option<[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")>` | `[offset](#offset(int))​(int slice)` |  |
	| `scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")>` | `[offsets](#offsets())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")>>` | `[unapply](#unapply(akka.persistence.query.TimestampOffsetBySlice))​([TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") timestampOffsetBySlice)` |  |
	
	
		- ### Methods inherited from class akka.persistence.query.[Offset](Offset.html "class in akka.persistence.query")
		
		
		`[noOffset](Offset.html#noOffset()), [sequence](Offset.html#sequence(long)), [timeBasedUUID](Offset.html#timeBasedUUID(java.util.UUID)), [timestamp](Offset.html#timestamp(java.time.Instant))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TimestampOffsetBySlice
		
		
		
		```
		public TimestampOffsetBySlice()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") empty()
		```
		- #### apply
		
		
		
		```
		public static [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") apply​(scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offsets)
		```
		- #### create
		
		
		
		```
		public static [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") create​(java.util.Map<java.lang.Integer,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offsets)
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")>> unapply​([TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") timestampOffsetBySlice)
		```
		- #### offsets
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offsets()
		```
		- #### getOffsets
		
		
		
		```
		public java.util.Map<java.lang.Integer,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> getOffsets()
		```
		
		Java API
		- #### offset
		
		
		
		```
		public scala.Option<[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offset​(int slice)
		```
		- #### getOffset
		
		
		
		```
		public java.util.Optional<[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> getOffset​(int slice)
		```
		
		Java API
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice.html)*