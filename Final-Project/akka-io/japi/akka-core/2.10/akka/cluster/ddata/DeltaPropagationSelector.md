---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaPropagationSelector.html
title: DeltaPropagationSelector
---

# DeltaPropagationSelector

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface DeltaPropagationSelector

- ---

```
public interface DeltaPropagationSelector
```

INTERNAL API: Used by the Replicator actor.
 Extracted to separate trait to make it easy to test.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_propagationCount_$eq](#_propagationCount_$eq(long))​(long x$1)` |  |
	| `scala.collection.immutable.Vector<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[allNodes](#allNodes())()` |  |
	| `void` | `[cleanupDeltaEntries](#cleanupDeltaEntries())()` |  |
	| `void` | `[cleanupRemovedNode](#cleanupRemovedNode(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") address)` |  |
	| `scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​akka.cluster.ddata.Replicator.Internal.DeltaPropagation>` | `[collectPropagations](#collectPropagations())()` |  |
	| `akka.cluster.ddata.Replicator.Internal.DeltaPropagation` | `[createDeltaPropagation](#createDeltaPropagation(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​scala.Tuple3<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata"),​java.lang.Object,​java.lang.Object>> deltas)` |  |
	| `long` | `[currentVersion](#currentVersion(java.lang.String))​(java.lang.String key)` |  |
	| `void` | `[delete](#delete(java.lang.String))​(java.lang.String key)` |  |
	| `void` | `[deltaCounter_$eq](#deltaCounter_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)` |  |
	| `void` | `[deltaEntries_$eq](#deltaEntries_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.TreeMap<java.lang.Object,​[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>> x$1)` |  |
	| `scala.collection.immutable.TreeMap<java.lang.Object,​[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | `[deltaEntriesAfter](#deltaEntriesAfter(scala.collection.immutable.TreeMap,long))​(scala.collection.immutable.TreeMap<java.lang.Object,​[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> entries,  long version)` |  |
	| `void` | `[deltaNodeRoundRobinCounter_$eq](#deltaNodeRoundRobinCounter_$eq(long))​(long x$1)` |  |
	| `void` | `[deltaSentToNode_$eq](#deltaSentToNode_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>> x$1)` |  |
	| `long` | `[findSmallestVersionPropagatedToAllNodes](#findSmallestVersionPropagatedToAllNodes(java.lang.String,scala.collection.immutable.Vector))​(java.lang.String key,  scala.collection.immutable.Vector<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> all)` |  |
	| `int` | `[gossipIntervalDivisor](#gossipIntervalDivisor())()` |  |
	| `boolean` | `[hasDeltaEntries](#hasDeltaEntries(java.lang.String))​(java.lang.String key)` |  |
	| `int` | `[maxDeltaSize](#maxDeltaSize())()` |  |
	| `int` | `[nodesSliceSize](#nodesSliceSize(int))​(int allNodesSize)` |  |
	| `long` | `[propagationCount](#propagationCount())()` |  |
	| `void` | `[update](#update(java.lang.String,akka.cluster.ddata.ReplicatedData))​(java.lang.String key,  [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") delta)` |  |

- - ### Method Detail
	
	
	
		- #### \_propagationCount\_$eq
		
		
		
		```
		void _propagationCount_$eq​(long x$1)
		```
		- #### allNodes
		
		
		
		```
		scala.collection.immutable.Vector<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> allNodes()
		```
		- #### cleanupDeltaEntries
		
		
		
		```
		void cleanupDeltaEntries()
		```
		- #### cleanupRemovedNode
		
		
		
		```
		void cleanupRemovedNode​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") address)
		```
		- #### collectPropagations
		
		
		
		```
		scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​akka.cluster.ddata.Replicator.Internal.DeltaPropagation> collectPropagations()
		```
		- #### createDeltaPropagation
		
		
		
		```
		akka.cluster.ddata.Replicator.Internal.DeltaPropagation createDeltaPropagation​(scala.collection.immutable.Map<java.lang.String,​scala.Tuple3<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata"),​java.lang.Object,​java.lang.Object>> deltas)
		```
		- #### currentVersion
		
		
		
		```
		long currentVersion​(java.lang.String key)
		```
		- #### delete
		
		
		
		```
		void delete​(java.lang.String key)
		```
		- #### deltaCounter\_$eq
		
		
		
		```
		void deltaCounter_$eq​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)
		```
		- #### deltaEntriesAfter
		
		
		
		```
		scala.collection.immutable.TreeMap<java.lang.Object,​[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> deltaEntriesAfter​(scala.collection.immutable.TreeMap<java.lang.Object,​[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> entries,
		                                                                                            long version)
		```
		- #### deltaEntries\_$eq
		
		
		
		```
		void deltaEntries_$eq​(scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.TreeMap<java.lang.Object,​[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>> x$1)
		```
		- #### deltaNodeRoundRobinCounter\_$eq
		
		
		
		```
		void deltaNodeRoundRobinCounter_$eq​(long x$1)
		```
		- #### deltaSentToNode\_$eq
		
		
		
		```
		void deltaSentToNode_$eq​(scala.collection.immutable.Map<java.lang.String,​scala.collection.immutable.Map<[UniqueAddress](../UniqueAddress.html "class in akka.cluster"),​java.lang.Object>> x$1)
		```
		- #### findSmallestVersionPropagatedToAllNodes
		
		
		
		```
		long findSmallestVersionPropagatedToAllNodes​(java.lang.String key,
		                                             scala.collection.immutable.Vector<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> all)
		```
		- #### gossipIntervalDivisor
		
		
		
		```
		int gossipIntervalDivisor()
		```
		- #### hasDeltaEntries
		
		
		
		```
		boolean hasDeltaEntries​(java.lang.String key)
		```
		- #### maxDeltaSize
		
		
		
		```
		int maxDeltaSize()
		```
		- #### nodesSliceSize
		
		
		
		```
		int nodesSliceSize​(int allNodesSize)
		```
		- #### propagationCount
		
		
		
		```
		long propagationCount()
		```
		- #### update
		
		
		
		```
		void update​(java.lang.String key,
		            [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata") delta)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaPropagationSelector.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/DeltaPropagationSelector.html)*