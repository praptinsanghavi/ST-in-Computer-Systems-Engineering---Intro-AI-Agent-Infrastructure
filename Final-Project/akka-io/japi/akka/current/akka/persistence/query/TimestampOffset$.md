---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset$.html
title: TimestampOffset$
---

# TimestampOffset$

## Content

Package [akka.persistence.query](package-summary.html)
## Class TimestampOffset$

- java.lang.Object
- - akka.persistence.query.TimestampOffset$

- ---

```
public class TimestampOffset$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TimestampOffset$](TimestampOffset$.html "class in akka.persistence.query")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimestampOffset$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[apply](#apply(java.time.Instant,java.time.Instant,scala.collection.immutable.Map))​(java.time.Instant timestamp,  java.time.Instant readTimestamp,  scala.collection.immutable.Map<java.lang.String,​java.lang.Object> seen)` |  |
	| `[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[apply](#apply(java.time.Instant,scala.collection.immutable.Map))​(java.time.Instant timestamp,  scala.collection.immutable.Map<java.lang.String,​java.lang.Object> seen)` |  |
	| `[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[toTimestampOffset](#toTimestampOffset(akka.persistence.query.Offset))​([Offset](Offset.html "class in akka.persistence.query") offset)` | Try to convert the Offset to a TimestampOffset. |
	| `scala.Option<scala.Tuple3<java.time.Instant,​java.time.Instant,​scala.collection.immutable.Map<java.lang.String,​java.lang.Object>>>` | `[unapply](#unapply(akka.persistence.query.TimestampOffset))​([TimestampOffset](TimestampOffset.html "class in akka.persistence.query") timestampOffset)` |  |
	| `[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")` | `[Zero](#Zero())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TimestampOffset$](TimestampOffset$.html "class in akka.persistence.query") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TimestampOffset$
		
		
		
		```
		public TimestampOffset$()
		```

	- ### Method Detail
	
	
	
		- #### Zero
		
		
		
		```
		public [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") Zero()
		```
		- #### apply
		
		
		
		```
		public [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") apply​(java.time.Instant timestamp,
		                             scala.collection.immutable.Map<java.lang.String,​java.lang.Object> seen)
		```
		- #### apply
		
		
		
		```
		public [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") apply​(java.time.Instant timestamp,
		                             java.time.Instant readTimestamp,
		                             scala.collection.immutable.Map<java.lang.String,​java.lang.Object> seen)
		```
		- #### toTimestampOffset
		
		
		
		```
		public [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") toTimestampOffset​([Offset](Offset.html "class in akka.persistence.query") offset)
		```
		
		Try to convert the Offset to a TimestampOffset. Epoch timestamp is used for `NoOffset`.
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.time.Instant,​java.time.Instant,​scala.collection.immutable.Map<java.lang.String,​java.lang.Object>>> unapply​([TimestampOffset](TimestampOffset.html "class in akka.persistence.query") timestampOffset)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset$.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset$.html)*