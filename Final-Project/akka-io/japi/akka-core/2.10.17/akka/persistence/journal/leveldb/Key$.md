---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/Key$.html
title: Key$
---

# Key$

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Class Key$

- java.lang.Object
- - akka.persistence.journal.leveldb.Key$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Key$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.journal.leveldb.Key$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Key$](Key$.html "class in akka.persistence.journal.leveldb")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Key$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.journal.leveldb.Key` | `[apply](#apply(int,long,int))​(int persistenceId,  long sequenceNr,  int mappingId)` |  |
	| `long` | `[counterFromBytes](#counterFromBytes(byte%5B%5D))​(byte[] bytes)` |  |
	| `akka.persistence.journal.leveldb.Key` | `[counterKey](#counterKey(int))​(int persistenceId)` |  |
	| `byte[]` | `[counterToBytes](#counterToBytes(long))​(long ctr)` |  |
	| `akka.persistence.journal.leveldb.Key` | `[deletionKey](#deletionKey(int,long))​(int persistenceId,  long sequenceNr)` |  |
	| `boolean` | `[isDeletionKey](#isDeletionKey(akka.persistence.journal.leveldb.Key))​(akka.persistence.journal.leveldb.Key key)` |  |
	| `boolean` | `[isMappingKey](#isMappingKey(akka.persistence.journal.leveldb.Key))​(akka.persistence.journal.leveldb.Key key)` |  |
	| `akka.persistence.journal.leveldb.Key` | `[keyFromBytes](#keyFromBytes(byte%5B%5D))​(byte[] bytes)` |  |
	| `byte[]` | `[keyToBytes](#keyToBytes(akka.persistence.journal.leveldb.Key))​(akka.persistence.journal.leveldb.Key key)` |  |
	| `akka.persistence.journal.leveldb.Key` | `[mappingKey](#mappingKey(int))​(int id)` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.journal.leveldb.Key))​(akka.persistence.journal.leveldb.Key x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Key$](Key$.html "class in akka.persistence.journal.leveldb") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Key$
		
		
		
		```
		public Key$()
		```

	- ### Method Detail
	
	
	
		- #### keyToBytes
		
		
		
		```
		public byte[] keyToBytes​(akka.persistence.journal.leveldb.Key key)
		```
		- #### keyFromBytes
		
		
		
		```
		public akka.persistence.journal.leveldb.Key keyFromBytes​(byte[] bytes)
		```
		- #### counterKey
		
		
		
		```
		public akka.persistence.journal.leveldb.Key counterKey​(int persistenceId)
		```
		- #### counterToBytes
		
		
		
		```
		public byte[] counterToBytes​(long ctr)
		```
		- #### counterFromBytes
		
		
		
		```
		public long counterFromBytes​(byte[] bytes)
		```
		- #### mappingKey
		
		
		
		```
		public akka.persistence.journal.leveldb.Key mappingKey​(int id)
		```
		- #### isMappingKey
		
		
		
		```
		public boolean isMappingKey​(akka.persistence.journal.leveldb.Key key)
		```
		- #### deletionKey
		
		
		
		```
		public akka.persistence.journal.leveldb.Key deletionKey​(int persistenceId,
		                                                        long sequenceNr)
		```
		- #### isDeletionKey
		
		
		
		```
		public boolean isDeletionKey​(akka.persistence.journal.leveldb.Key key)
		```
		- #### apply
		
		
		
		```
		public akka.persistence.journal.leveldb.Key apply​(int persistenceId,
		                                                  long sequenceNr,
		                                                  int mappingId)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​(akka.persistence.journal.leveldb.Key x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/Key$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/Key$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/leveldb/Key$.html)*