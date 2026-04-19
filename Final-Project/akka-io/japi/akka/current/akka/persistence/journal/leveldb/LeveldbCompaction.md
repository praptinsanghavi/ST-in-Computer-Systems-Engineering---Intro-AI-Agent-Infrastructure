---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb$.html
title: LeveldbCompaction.TryCompactLeveldb$
---

# LeveldbCompaction.TryCompactLeveldb$

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Class LeveldbCompaction.TryCompactLeveldb$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb")\>
	- - akka.persistence.journal.leveldb.LeveldbCompaction.TryCompactLeveldb$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.String,​java.lang.Object,​[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb")>`

Enclosing interface:
[LeveldbCompaction](LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")

---

```
public static class LeveldbCompaction.TryCompactLeveldb$
extends scala.runtime.AbstractFunction2<java.lang.String,​java.lang.Object,​[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.journal.leveldb.LeveldbCompaction.TryCompactLeveldb$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LeveldbCompaction.TryCompactLeveldb$](LeveldbCompaction.TryCompactLeveldb$.html "class in akka.persistence.journal.leveldb")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TryCompactLeveldb$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb")` | `[apply](#apply(java.lang.String,long))​(java.lang.String persistenceId,  long toSeqNr)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.journal.leveldb.LeveldbCompaction.TryCompactLeveldb))​([LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LeveldbCompaction.TryCompactLeveldb$](LeveldbCompaction.TryCompactLeveldb$.html "class in akka.persistence.journal.leveldb") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TryCompactLeveldb$
		
		
		
		```
		public TryCompactLeveldb$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.String,​java.lang.Object,​[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.String,​java.lang.Object,​[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb")>`
		- #### apply
		
		
		
		```
		public [LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb") apply​(java.lang.String persistenceId,
		                                                 long toSeqNr)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>> unapply​([LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb$.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb$.html)*