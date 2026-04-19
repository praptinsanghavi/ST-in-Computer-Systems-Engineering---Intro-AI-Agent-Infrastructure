---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset.html
title: TimestampOffset
---

# TimestampOffset

## Content

Package [akka.persistence.query](package-summary.html)
## Class TimestampOffset

- java.lang.Object
- - [akka.persistence.query.Offset](Offset.html "class in akka.persistence.query")
	- - akka.persistence.query.TimestampOffset

- ---

```
public final class TimestampOffset
extends [Offset](Offset.html "class in akka.persistence.query")
```

Timestamp based offset. Since there can be several events for the same timestamp it keeps
 track of what sequence nrs for every persistence id that have been seen at this specific timestamp.
 
 The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
 in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
 as the `offset` parameter in a subsequent query.
 

 API May Change
 

 param: timestamp
 time when the event was stored, microsecond granularity database timestamp
 param: readTimestamp
 time when the event was read, microsecond granularity database timestamp
 param: seen
 List of sequence nrs for every persistence id seen at this timestamp

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimestampOffset](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[apply](#apply(java.time.Instant,java.time.Instant,scala.collection.immutable.Map))​(java.time.Instant timestamp,  java.time.Instant readTimestamp,  scala.collection.immutable.Map<java.lang.String,​java.lang.Object> seen)` |  |
	| `static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[apply](#apply(java.time.Instant,scala.collection.immutable.Map))​(java.time.Instant timestamp,  scala.collection.immutable.Map<java.lang.String,​java.lang.Object> seen)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `java.util.Map<java.lang.String,​java.lang.Long>` | `[getSeen](#getSeen())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.time.Instant` | `[readTimestamp](#readTimestamp())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[seen](#seen())()` |  |
	| `java.time.Instant` | `[timestamp](#timestamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[toTimestampOffset](#toTimestampOffset(akka.persistence.query.Offset))​([Offset](Offset.html "class in akka.persistence.query") offset)` | Try to convert the Offset to a TimestampOffset. |
	| `static scala.Option<scala.Tuple3<java.time.Instant,​java.time.Instant,​scala.collection.immutable.Map<java.lang.String,​java.lang.Object>>>` | `[unapply](#unapply(akka.persistence.query.TimestampOffset))​([TimestampOffset](TimestampOffset.html "class in akka.persistence.query") timestampOffset)` |  |
	| `static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[Zero](#Zero())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.query.[Offset](Offset.html "class in akka.persistence.query")
		
		
		`[noOffset](Offset.html#noOffset()), [sequence](Offset.html#sequence(long)), [timeBasedUUID](Offset.html#timeBasedUUID(java.util.UUID)), [timestamp](Offset.html#timestamp(java.time.Instant))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TimestampOffset
		
		
		
		```
		public TimestampOffset()
		```

	- ### Method Detail
	
	
	
		- #### Zero
		
		
		
		```
		public static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") Zero()
		```
		- #### apply
		
		
		
		```
		public static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") apply​(java.time.Instant timestamp,
		                                    scala.collection.immutable.Map<java.lang.String,​java.lang.Object> seen)
		```
		- #### apply
		
		
		
		```
		public static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") apply​(java.time.Instant timestamp,
		                                    java.time.Instant readTimestamp,
		                                    scala.collection.immutable.Map<java.lang.String,​java.lang.Object> seen)
		```
		- #### toTimestampOffset
		
		
		
		```
		public static [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") toTimestampOffset​([Offset](Offset.html "class in akka.persistence.query") offset)
		```
		
		Try to convert the Offset to a TimestampOffset. Epoch timestamp is used for `NoOffset`.
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<java.time.Instant,​java.time.Instant,​scala.collection.immutable.Map<java.lang.String,​java.lang.Object>>> unapply​([TimestampOffset](TimestampOffset.html "class in akka.persistence.query") timestampOffset)
		```
		- #### timestamp
		
		
		
		```
		public java.time.Instant timestamp()
		```
		- #### readTimestamp
		
		
		
		```
		public java.time.Instant readTimestamp()
		```
		- #### seen
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.Object> seen()
		```
		- #### getSeen
		
		
		
		```
		public java.util.Map<java.lang.String,​java.lang.Long> getSeen()
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
		public boolean equals​(java.lang.Object obj)
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
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset.html)*