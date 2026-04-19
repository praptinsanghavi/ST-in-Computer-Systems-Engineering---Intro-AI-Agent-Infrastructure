---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:15:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotStorage.html
title: SnapshotStorage
---

# SnapshotStorage

## Content

Package [akka.persistence.testkit](package-summary.html)
## Interface SnapshotStorage

- All Superinterfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`, `[InMemStorage](internal/InMemStorage.html "interface in akka.persistence.testkit.internal")<java.lang.String,​scala.Tuple2<[SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>>`, `[InternalReprSupport](internal/InternalReprSupport.html "interface in akka.persistence.testkit.internal")<scala.Tuple2<[SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>>`, `[PolicyOps](internal/PolicyOps.html "interface in akka.persistence.testkit.internal")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")>`, `[TestKitStorage](internal/TestKitStorage.html "interface in akka.persistence.testkit.internal")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit"),​scala.Tuple2<[SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>>`

---

```
public interface SnapshotStorage
extends [TestKitStorage](internal/TestKitStorage.html "interface in akka.persistence.testkit.internal")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit"),​scala.Tuple2<[SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>>, [Extension](../../actor/Extension.html "interface in akka.actor")
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[SnapshotStorage.SnapshotPolicies$](SnapshotStorage.SnapshotPolicies$.html "class in akka.persistence.testkit")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$persistence$testkit$SnapshotStorage$_setter_$DefaultPolicy_$eq](#akka$persistence$testkit$SnapshotStorage$_setter_$DefaultPolicy_$eq(akka.persistence.testkit.ProcessingPolicy.DefaultPolicies.PassAll))​([ProcessingPolicy.DefaultPolicies.PassAll](ProcessingPolicy.DefaultPolicies.PassAll.html "class in akka.persistence.testkit") x$1)` |  |
	| `[ProcessingPolicy.DefaultPolicies.PassAll](ProcessingPolicy.DefaultPolicies.PassAll.html "class in akka.persistence.testkit")` | `[DefaultPolicy](#DefaultPolicy())()` |  |
	| `long` | `[reprToSeqNum](#reprToSeqNum(scala.Tuple2))​(scala.Tuple2<[SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object> repr)` |  |
	| `void` | `[tryAdd](#tryAdd(akka.persistence.SnapshotMetadata,java.lang.Object))​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") meta,  java.lang.Object payload)` |  |
	| `void` | `[tryDelete](#tryDelete(akka.persistence.SnapshotMetadata))​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") meta)` |  |
	| `void` | `[tryDelete](#tryDelete(java.lang.String,akka.persistence.SnapshotSelectionCriteria))​(java.lang.String persistenceId,  [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") selectionCriteria)` |  |
	| `scala.Option<[SelectedSnapshot](../SelectedSnapshot.html "class in akka.persistence")>` | `[tryRead](#tryRead(java.lang.String,akka.persistence.SnapshotSelectionCriteria))​(java.lang.String persistenceId,  [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` |  |
	
	
		- ### Methods inherited from interface akka.persistence.testkit.internal.[InMemStorage](internal/InMemStorage.html "interface in akka.persistence.testkit.internal")
		
		
		`[add](internal/InMemStorage.html#add(K,R)), [add](internal/InMemStorage.html#add(K,scala.collection.immutable.Seq)), [clearAll](internal/InMemStorage.html#clearAll()), [clearAllPreservingSeqNumbers](internal/InMemStorage.html#clearAllPreservingSeqNumbers()), [delete](internal/InMemStorage.html#delete(K,scala.Function1)), [deleteToSeqNumber](internal/InMemStorage.html#deleteToSeqNumber(K,long)), [eventsMap_$eq](internal/InMemStorage.html#eventsMap_$eq(scala.collection.immutable.Map)), [expectNextQueue_$eq](internal/InMemStorage.html#expectNextQueue_$eq(scala.collection.immutable.Map)), [findMany](internal/InMemStorage.html#findMany(K,int,int)), [findOneByIndex](internal/InMemStorage.html#findOneByIndex(K,int)), [firstInExpectNextQueue](internal/InMemStorage.html#firstInExpectNextQueue(K)), [getHighestSeqNumber](internal/InMemStorage.html#getHighestSeqNumber(K)), [getLastSeqNumber](internal/InMemStorage.html#getLastSeqNumber(scala.collection.immutable.Seq)), [keys](internal/InMemStorage.html#keys()), [read](internal/InMemStorage.html#read(K)), [read](internal/InMemStorage.html#read(K,long,long,long)), [readAll](internal/InMemStorage.html#readAll()), [removeFirstInExpectNextQueue](internal/InMemStorage.html#removeFirstInExpectNextQueue(K)), [removeKey](internal/InMemStorage.html#removeKey(K)), [removePreservingSeqNumber](internal/InMemStorage.html#removePreservingSeqNumber(K)), [updateOrSetNew](internal/InMemStorage.html#updateOrSetNew(K,scala.Function1))`
		- ### Methods inherited from interface akka.persistence.testkit.internal.[InternalReprSupport](internal/InternalReprSupport.html "interface in akka.persistence.testkit.internal")
		
		
		`[toInternal](internal/InternalReprSupport.html#toInternal(R)), [toRepr](internal/InternalReprSupport.html#toRepr(java.lang.Object))`
		- ### Methods inherited from interface akka.persistence.testkit.internal.[PolicyOps](internal/PolicyOps.html "interface in akka.persistence.testkit.internal")
		
		
		`[currentPolicy](internal/PolicyOps.html#currentPolicy()), [resetPolicy](internal/PolicyOps.html#resetPolicy()), [setPolicy](internal/PolicyOps.html#setPolicy(akka.persistence.testkit.ProcessingPolicy))`

- - ### Method Detail
	
	
	
		- #### akka$persistence$testkit$SnapshotStorage$\_setter\_$DefaultPolicy\_$eq
		
		
		
		```
		void akka$persistence$testkit$SnapshotStorage$_setter_$DefaultPolicy_$eq​([ProcessingPolicy.DefaultPolicies.PassAll](ProcessingPolicy.DefaultPolicies.PassAll.html "class in akka.persistence.testkit") x$1)
		```
		- #### reprToSeqNum
		
		
		
		```
		long reprToSeqNum​(scala.Tuple2<[SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object> repr)
		```
		
		
		Specified by:
		`[reprToSeqNum](internal/InMemStorage.html#reprToSeqNum(R))` in interface `[InMemStorage](internal/InMemStorage.html "interface in akka.persistence.testkit.internal")<java.lang.String,​scala.Tuple2<[SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>>`
		- #### DefaultPolicy
		
		
		
		```
		[ProcessingPolicy.DefaultPolicies.PassAll](ProcessingPolicy.DefaultPolicies.PassAll.html "class in akka.persistence.testkit") DefaultPolicy()
		```
		
		
		Specified by:
		`[DefaultPolicy](internal/PolicyOps.html#DefaultPolicy())` in interface `[PolicyOps](internal/PolicyOps.html "interface in akka.persistence.testkit.internal")<[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")>`
		- #### tryAdd
		
		
		
		```
		void tryAdd​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") meta,
		            java.lang.Object payload)
		```
		- #### tryRead
		
		
		
		```
		scala.Option<[SelectedSnapshot](../SelectedSnapshot.html "class in akka.persistence")> tryRead​(java.lang.String persistenceId,
		                                       [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```
		- #### tryDelete
		
		
		
		```
		void tryDelete​(java.lang.String persistenceId,
		               [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") selectionCriteria)
		```
		- #### tryDelete
		
		
		
		```
		void tryDelete​([SnapshotMetadata](../SnapshotMetadata.html "class in akka.persistence") meta)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SelectedSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotStorage.SnapshotPolicies$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/internal/InMemStorage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/internal/InternalReprSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/internal/PolicyOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/internal/TestKitStorage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotStorage.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotStorage.html)*