---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/inmem/InmemMessages.html
title: InmemMessages
---

# InmemMessages

## Content

Package [akka.persistence.journal.inmem](package-summary.html)
## Interface InmemMessages

- ---

```
public interface InmemMessages
```

INTERNAL API.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[add](#add(akka.persistence.PersistentRepr))​([PersistentRepr](../../PersistentRepr.html "interface in akka.persistence") p)` |  |
	| `void` | `[delete](#delete(java.lang.String,long))​(java.lang.String pid,  long snr)` |  |
	| `long` | `[highestSequenceNr](#highestSequenceNr(java.lang.String))​(java.lang.String pid)` |  |
	| `void` | `[highestSequenceNumbers_$eq](#highestSequenceNumbers_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Vector<scala.Tuple2<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​<any>>>>` | `[messages](#messages())()` |  |
	| `void` | `[messages_$eq](#messages_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Vector<scala.Tuple2<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​<any>>>> x$1)` |  |
	| `scala.collection.immutable.Seq<scala.Tuple2<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​<any>>>` | `[read](#read(java.lang.String,long,long,long))​(java.lang.String pid,  long fromSnr,  long toSnr,  long max)` |  |
	| `int` | `[safeLongToInt](#safeLongToInt(long))​(long l)` |  |

- - ### Method Detail
	
	
	
		- #### add
		
		
		
		```
		void add​([PersistentRepr](../../PersistentRepr.html "interface in akka.persistence") p)
		```
		- #### delete
		
		
		
		```
		void delete​(java.lang.String pid,
		            long snr)
		```
		- #### highestSequenceNr
		
		
		
		```
		long highestSequenceNr​(java.lang.String pid)
		```
		- #### highestSequenceNumbers\_$eq
		
		
		
		```
		void highestSequenceNumbers_$eq​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)
		```
		- #### messages
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Vector<scala.Tuple2<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​<any>>>> messages()
		```
		- #### messages\_$eq
		
		
		
		```
		void messages_$eq​(scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Vector<scala.Tuple2<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​<any>>>> x$1)
		```
		- #### read
		
		
		
		```
		scala.collection.immutable.Seq<scala.Tuple2<[PersistentRepr](../../PersistentRepr.html "interface in akka.persistence"),​<any>>> read​(java.lang.String pid,
		                                                                              long fromSnr,
		                                                                              long toSnr,
		                                                                              long max)
		```
		- #### safeLongToInt
		
		
		
		```
		int safeLongToInt​(long l)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/inmem/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/inmem/InmemMessages.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/inmem/InmemMessages.html)*