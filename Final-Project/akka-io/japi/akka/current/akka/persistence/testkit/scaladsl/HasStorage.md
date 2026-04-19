---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/HasStorage.html
title: HasStorage
---

# HasStorage

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Interface HasStorage\<P,​R\>

- All Known Implementing Classes:
`[PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl")`, `[SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl")`

---

```
public interface HasStorage<P,​R>
```

Abstract persistent storage for tests.
 Has additional methods for keeping track of the indexes of last events persisted in the storage during test.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[addToIndex](#addToIndex(java.lang.String,int))​(java.lang.String persistenceId,  int add)` |  |
	| `void` | `[clearIndexStorage](#clearIndexStorage())()` |  |
	| `int` | `[nextIndex](#nextIndex(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `void` | `[nextIndexByPersistenceId_$eq](#nextIndexByPersistenceId_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)` |  |
	| `void` | `[removeLastIndex](#removeLastIndex(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `void` | `[setIndex](#setIndex(java.lang.String,int))​(java.lang.String persistenceId,  int index)` |  |
	| `[TestKitStorage](../internal/TestKitStorage.html "interface in akka.persistence.testkit.internal")<[P](HasStorage.html "type parameter in HasStorage"),​[R](HasStorage.html "type parameter in HasStorage")>` | `[storage](#storage())()` |  |

- - ### Method Detail
	
	
	
		- #### addToIndex
		
		
		
		```
		void addToIndex​(java.lang.String persistenceId,
		                int add)
		```
		- #### clearIndexStorage
		
		
		
		```
		void clearIndexStorage()
		```
		- #### nextIndex
		
		
		
		```
		int nextIndex​(java.lang.String persistenceId)
		```
		- #### nextIndexByPersistenceId\_$eq
		
		
		
		```
		void nextIndexByPersistenceId_$eq​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)
		```
		- #### removeLastIndex
		
		
		
		```
		void removeLastIndex​(java.lang.String persistenceId)
		```
		- #### setIndex
		
		
		
		```
		void setIndex​(java.lang.String persistenceId,
		              int index)
		```
		- #### storage
		
		
		
		```
		[TestKitStorage](../internal/TestKitStorage.html "interface in akka.persistence.testkit.internal")<[P](HasStorage.html "type parameter in HasStorage"),​[R](HasStorage.html "type parameter in HasStorage")> storage()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/TestKitStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/HasStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/HasStorage.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/HasStorage.html)*