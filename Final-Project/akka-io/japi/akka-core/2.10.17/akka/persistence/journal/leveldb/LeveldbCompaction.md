---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html
title: LeveldbCompaction.TryCompactLeveldb
---

# LeveldbCompaction.TryCompactLeveldb

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Class LeveldbCompaction.TryCompactLeveldb

- java.lang.Object
- - akka.persistence.journal.leveldb.LeveldbCompaction.TryCompactLeveldb

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[LeveldbCompaction](LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")

---

```
public static class LeveldbCompaction.TryCompactLeveldb
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.journal.leveldb.LeveldbCompaction.TryCompactLeveldb)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TryCompactLeveldb](#%3Cinit%3E(java.lang.String,long))​(java.lang.String persistenceId,  long toSeqNr)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb")` | `[copy](#copy(java.lang.String,long))​(java.lang.String persistenceId,  long toSeqNr)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[toSeqNr](#toSeqNr())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### TryCompactLeveldb
		
		
		
		```
		public TryCompactLeveldb​(java.lang.String persistenceId,
		                         long toSeqNr)
		```

	- ### Method Detail
	
	
	
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		- #### toSeqNr
		
		
		
		```
		public long toSeqNr()
		```
		- #### copy
		
		
		
		```
		public [LeveldbCompaction.TryCompactLeveldb](LeveldbCompaction.TryCompactLeveldb.html "class in akka.persistence.journal.leveldb") copy​(java.lang.String persistenceId,
		                                                long toSeqNr)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/LeveldbCompaction.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/LeveldbCompaction.TryCompactLeveldb.html)*