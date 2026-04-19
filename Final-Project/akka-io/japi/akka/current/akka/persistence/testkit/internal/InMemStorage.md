---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InMemStorage.html
title: InMemStorage
---

# InMemStorage

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Interface InMemStorage\<K,​R\>

- All Superinterfaces:
`[InternalReprSupport](InternalReprSupport.html "interface in akka.persistence.testkit.internal")<R>`

All Known Subinterfaces:
`[EventStorage](../EventStorage.html "interface in akka.persistence.testkit")`, `[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")`, `[TestKitStorage](TestKitStorage.html "interface in akka.persistence.testkit.internal")<P,​R>`

---

```
public interface InMemStorage<K,​R>
extends [InternalReprSupport](InternalReprSupport.html "interface in akka.persistence.testkit.internal")<R>
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[add](#add(K,R))​([K](InMemStorage.html "type parameter in InMemStorage") key,  [R](InMemStorage.html "type parameter in InMemStorage") p)` |  |
	| `void` | `[add](#add(K,scala.collection.immutable.Seq))​([K](InMemStorage.html "type parameter in InMemStorage") key,  scala.collection.immutable.Seq<[R](InMemStorage.html "type parameter in InMemStorage")> elems)` | Adds elements ordered by seqnum, sets new seqnum as max(old, max(newElemsSeqNums))) |
	| `void` | `[clearAll](#clearAll())()` |  |
	| `void` | `[clearAllPreservingSeqNumbers](#clearAllPreservingSeqNumbers())()` |  |
	| `scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>` | `[delete](#delete(K,scala.Function1))​([K](InMemStorage.html "type parameter in InMemStorage") key,  scala.Function1<[R](InMemStorage.html "type parameter in InMemStorage"),​java.lang.Object> needsToBeDeleted)` | Deletes elements preserving highest sequence number. |
	| `void` | `[deleteToSeqNumber](#deleteToSeqNumber(K,long))​([K](InMemStorage.html "type parameter in InMemStorage") key,  long toSeqNumberInclusive)` |  |
	| `void` | `[eventsMap_$eq](#eventsMap_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[K](InMemStorage.html "type parameter in InMemStorage"),​scala.Tuple2<java.lang.Object,​scala.collection.immutable.Vector<java.lang.Object>>> x$1)` |  |
	| `void` | `[expectNextQueue_$eq](#expectNextQueue_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[K](InMemStorage.html "type parameter in InMemStorage"),​scala.collection.immutable.Vector<java.lang.Object>> x$1)` |  |
	| `scala.Option<scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>>` | `[findMany](#findMany(K,int,int))​([K](InMemStorage.html "type parameter in InMemStorage") key,  int fromInclusive,  int maxNum)` |  |
	| `scala.Option<[R](InMemStorage.html "type parameter in InMemStorage")>` | `[findOneByIndex](#findOneByIndex(K,int))​([K](InMemStorage.html "type parameter in InMemStorage") key,  int index)` |  |
	| `scala.Option<[R](InMemStorage.html "type parameter in InMemStorage")>` | `[firstInExpectNextQueue](#firstInExpectNextQueue(K))​([K](InMemStorage.html "type parameter in InMemStorage") key)` |  |
	| `long` | `[getHighestSeqNumber](#getHighestSeqNumber(K))​([K](InMemStorage.html "type parameter in InMemStorage") key)` |  |
	| `long` | `[getLastSeqNumber](#getLastSeqNumber(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[R](InMemStorage.html "type parameter in InMemStorage")> elems)` |  |
	| `scala.collection.immutable.Seq<[K](InMemStorage.html "type parameter in InMemStorage")>` | `[keys](#keys())()` |  |
	| `scala.Option<scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>>` | `[read](#read(K))​([K](InMemStorage.html "type parameter in InMemStorage") key)` |  |
	| `scala.collection.immutable.Seq<[R](InMemStorage.html "type parameter in InMemStorage")>` | `[read](#read(K,long,long,long))​([K](InMemStorage.html "type parameter in InMemStorage") key,  long fromInclusive,  long toInclusive,  long maxNumber)` | Reads elems within the range of seqnums. |
	| `scala.collection.Iterable<[R](InMemStorage.html "type parameter in InMemStorage")>` | `[readAll](#readAll())()` |  |
	| `void` | `[removeFirstInExpectNextQueue](#removeFirstInExpectNextQueue(K))​([K](InMemStorage.html "type parameter in InMemStorage") key)` |  |
	| `scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>` | `[removeKey](#removeKey(K))​([K](InMemStorage.html "type parameter in InMemStorage") key)` | Removes key and the whole value including seqnum. |
	| `void` | `[removePreservingSeqNumber](#removePreservingSeqNumber(K))​([K](InMemStorage.html "type parameter in InMemStorage") key)` |  |
	| `long` | `[reprToSeqNum](#reprToSeqNum(R))​([R](InMemStorage.html "type parameter in InMemStorage") repr)` |  |
	| `scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>` | `[updateOrSetNew](#updateOrSetNew(K,scala.Function1))​([K](InMemStorage.html "type parameter in InMemStorage") key,  scala.Function1<scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>,​scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>> updater)` | Sets new elements returned by updater ordered by seqnum. |
	
	
		- ### Methods inherited from interface akka.persistence.testkit.internal.[InternalReprSupport](InternalReprSupport.html "interface in akka.persistence.testkit.internal")
		
		
		`[toInternal](InternalReprSupport.html#toInternal(R)), [toRepr](InternalReprSupport.html#toRepr(java.lang.Object))`

- - ### Method Detail
	
	
	
		- #### add
		
		
		
		```
		void add​([K](InMemStorage.html "type parameter in InMemStorage") key,
		         [R](InMemStorage.html "type parameter in InMemStorage") p)
		```
		- #### add
		
		
		
		```
		void add​([K](InMemStorage.html "type parameter in InMemStorage") key,
		         scala.collection.immutable.Seq<[R](InMemStorage.html "type parameter in InMemStorage")> elems)
		```
		
		Adds elements ordered by seqnum, sets new seqnum as max(old, max(newElemsSeqNums)))
		- #### clearAll
		
		
		
		```
		void clearAll()
		```
		- #### clearAllPreservingSeqNumbers
		
		
		
		```
		void clearAllPreservingSeqNumbers()
		```
		- #### delete
		
		
		
		```
		scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")> delete​([K](InMemStorage.html "type parameter in InMemStorage") key,
		                                            scala.Function1<[R](InMemStorage.html "type parameter in InMemStorage"),​java.lang.Object> needsToBeDeleted)
		```
		
		Deletes elements preserving highest sequence number.
		- #### deleteToSeqNumber
		
		
		
		```
		void deleteToSeqNumber​([K](InMemStorage.html "type parameter in InMemStorage") key,
		                       long toSeqNumberInclusive)
		```
		- #### eventsMap\_$eq
		
		
		
		```
		void eventsMap_$eq​(scala.collection.immutable.Map<[K](InMemStorage.html "type parameter in InMemStorage"),​scala.Tuple2<java.lang.Object,​scala.collection.immutable.Vector<java.lang.Object>>> x$1)
		```
		- #### expectNextQueue\_$eq
		
		
		
		```
		void expectNextQueue_$eq​(scala.collection.immutable.Map<[K](InMemStorage.html "type parameter in InMemStorage"),​scala.collection.immutable.Vector<java.lang.Object>> x$1)
		```
		- #### findMany
		
		
		
		```
		scala.Option<scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>> findMany​([K](InMemStorage.html "type parameter in InMemStorage") key,
		                                                            int fromInclusive,
		                                                            int maxNum)
		```
		- #### findOneByIndex
		
		
		
		```
		scala.Option<[R](InMemStorage.html "type parameter in InMemStorage")> findOneByIndex​([K](InMemStorage.html "type parameter in InMemStorage") key,
		                               int index)
		```
		- #### firstInExpectNextQueue
		
		
		
		```
		scala.Option<[R](InMemStorage.html "type parameter in InMemStorage")> firstInExpectNextQueue​([K](InMemStorage.html "type parameter in InMemStorage") key)
		```
		- #### getHighestSeqNumber
		
		
		
		```
		long getHighestSeqNumber​([K](InMemStorage.html "type parameter in InMemStorage") key)
		```
		- #### getLastSeqNumber
		
		
		
		```
		long getLastSeqNumber​(scala.collection.immutable.Seq<[R](InMemStorage.html "type parameter in InMemStorage")> elems)
		```
		- #### keys
		
		
		
		```
		scala.collection.immutable.Seq<[K](InMemStorage.html "type parameter in InMemStorage")> keys()
		```
		- #### read
		
		
		
		```
		scala.Option<scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>> read​([K](InMemStorage.html "type parameter in InMemStorage") key)
		```
		- #### read
		
		
		
		```
		scala.collection.immutable.Seq<[R](InMemStorage.html "type parameter in InMemStorage")> read​([K](InMemStorage.html "type parameter in InMemStorage") key,
		                                       long fromInclusive,
		                                       long toInclusive,
		                                       long maxNumber)
		```
		
		Reads elems within the range of seqnums.
		- #### readAll
		
		
		
		```
		scala.collection.Iterable<[R](InMemStorage.html "type parameter in InMemStorage")> readAll()
		```
		- #### removeFirstInExpectNextQueue
		
		
		
		```
		void removeFirstInExpectNextQueue​([K](InMemStorage.html "type parameter in InMemStorage") key)
		```
		- #### removeKey
		
		
		
		```
		scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")> removeKey​([K](InMemStorage.html "type parameter in InMemStorage") key)
		```
		
		Removes key and the whole value including seqnum.
		- #### removePreservingSeqNumber
		
		
		
		```
		void removePreservingSeqNumber​([K](InMemStorage.html "type parameter in InMemStorage") key)
		```
		- #### reprToSeqNum
		
		
		
		```
		long reprToSeqNum​([R](InMemStorage.html "type parameter in InMemStorage") repr)
		```
		- #### updateOrSetNew
		
		
		
		```
		scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")> updateOrSetNew​([K](InMemStorage.html "type parameter in InMemStorage") key,
		                                                    scala.Function1<scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>,​scala.collection.immutable.Vector<[R](InMemStorage.html "type parameter in InMemStorage")>> updater)
		```
		
		Sets new elements returned by updater ordered by seqnum. Sets new seqnum as max(old, max(newElemsFromUpdaterSeqNums))

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/EventStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InMemStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InternalReprSupport.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/TestKitStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InMemStorage.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InMemStorage.html)*