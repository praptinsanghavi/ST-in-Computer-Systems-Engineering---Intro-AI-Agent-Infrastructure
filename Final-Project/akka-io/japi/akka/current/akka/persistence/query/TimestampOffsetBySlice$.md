---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice$.html
title: TimestampOffsetBySlice$
---

# TimestampOffsetBySlice$

## Content

Package [akka.persistence.query](package-summary.html)
## Class TimestampOffsetBySlice$

- java.lang.Object
- - akka.persistence.query.TimestampOffsetBySlice$

- ---

```
public class TimestampOffsetBySlice$
extends java.lang.Object
```

Timestamp\-based offset by slice.
 
 API May Change

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TimestampOffsetBySlice$](TimestampOffsetBySlice$.html "class in akka.persistence.query")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TimestampOffsetBySlice$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query")` | `[apply](#apply(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offsets)` |  |
	| `[TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query")` | `[create](#create(java.util.Map))​(java.util.Map<java.lang.Integer,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offsets)` | Java API |
	| `[TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query")` | `[empty](#empty())()` |  |
	| `scala.Option<scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")>>` | `[unapply](#unapply(akka.persistence.query.TimestampOffsetBySlice))​([TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") timestampOffsetBySlice)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TimestampOffsetBySlice$](TimestampOffsetBySlice$.html "class in akka.persistence.query") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TimestampOffsetBySlice$
		
		
		
		```
		public TimestampOffsetBySlice$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") empty()
		```
		- #### apply
		
		
		
		```
		public [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") apply​(scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offsets)
		```
		- #### create
		
		
		
		```
		public [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") create​(java.util.Map<java.lang.Integer,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")> offsets)
		```
		
		Java API
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Map<java.lang.Object,​[TimestampOffset](TimestampOffset.html "class in akka.persistence.query")>> unapply​([TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") timestampOffsetBySlice)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice$.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice$.html)*