---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/TestKitStorage.html
title: TestKitStorage
---

# TestKitStorage

## Content

Package [akka.persistence.testkit.internal](package-summary.html)
## Interface TestKitStorage\<P,​R\>

- All Superinterfaces:
`[InMemStorage](InMemStorage.html "interface in akka.persistence.testkit.internal")<java.lang.String,​R>`, `[InternalReprSupport](InternalReprSupport.html "interface in akka.persistence.testkit.internal")<R>`, `[PolicyOps](PolicyOps.html "interface in akka.persistence.testkit.internal")<P>`

All Known Subinterfaces:
`[EventStorage](../EventStorage.html "interface in akka.persistence.testkit")`, `[SnapshotStorage](../SnapshotStorage.html "interface in akka.persistence.testkit")`

---

```
public interface TestKitStorage<P,​R>
extends [InMemStorage](InMemStorage.html "interface in akka.persistence.testkit.internal")<java.lang.String,​R>, [PolicyOps](PolicyOps.html "interface in akka.persistence.testkit.internal")<P>
```

INTERNAL API

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.persistence.testkit.internal.[InMemStorage](InMemStorage.html "interface in akka.persistence.testkit.internal")
		
		
		`[add](InMemStorage.html#add(K,R)), [add](InMemStorage.html#add(K,scala.collection.immutable.Seq)), [clearAll](InMemStorage.html#clearAll()), [clearAllPreservingSeqNumbers](InMemStorage.html#clearAllPreservingSeqNumbers()), [delete](InMemStorage.html#delete(K,scala.Function1)), [deleteToSeqNumber](InMemStorage.html#deleteToSeqNumber(K,long)), [eventsMap_$eq](InMemStorage.html#eventsMap_$eq(scala.collection.immutable.Map)), [expectNextQueue_$eq](InMemStorage.html#expectNextQueue_$eq(scala.collection.immutable.Map)), [findMany](InMemStorage.html#findMany(K,int,int)), [findOneByIndex](InMemStorage.html#findOneByIndex(K,int)), [firstInExpectNextQueue](InMemStorage.html#firstInExpectNextQueue(K)), [getHighestSeqNumber](InMemStorage.html#getHighestSeqNumber(K)), [getLastSeqNumber](InMemStorage.html#getLastSeqNumber(scala.collection.immutable.Seq)), [keys](InMemStorage.html#keys()), [read](InMemStorage.html#read(K)), [read](InMemStorage.html#read(K,long,long,long)), [readAll](InMemStorage.html#readAll()), [removeFirstInExpectNextQueue](InMemStorage.html#removeFirstInExpectNextQueue(K)), [removeKey](InMemStorage.html#removeKey(K)), [removePreservingSeqNumber](InMemStorage.html#removePreservingSeqNumber(K)), [reprToSeqNum](InMemStorage.html#reprToSeqNum(R)), [updateOrSetNew](InMemStorage.html#updateOrSetNew(K,scala.Function1))`
		- ### Methods inherited from interface akka.persistence.testkit.internal.[InternalReprSupport](InternalReprSupport.html "interface in akka.persistence.testkit.internal")
		
		
		`[toInternal](InternalReprSupport.html#toInternal(R)), [toRepr](InternalReprSupport.html#toRepr(java.lang.Object))`
		- ### Methods inherited from interface akka.persistence.testkit.internal.[PolicyOps](PolicyOps.html "interface in akka.persistence.testkit.internal")
		
		
		`[currentPolicy](PolicyOps.html#currentPolicy()), [DefaultPolicy](PolicyOps.html#DefaultPolicy()), [resetPolicy](PolicyOps.html#resetPolicy()), [setPolicy](PolicyOps.html#setPolicy(akka.persistence.testkit.ProcessingPolicy))`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/EventStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InMemStorage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/InternalReprSupport.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/PolicyOps.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/TestKitStorage.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/internal/TestKitStorage.html)*