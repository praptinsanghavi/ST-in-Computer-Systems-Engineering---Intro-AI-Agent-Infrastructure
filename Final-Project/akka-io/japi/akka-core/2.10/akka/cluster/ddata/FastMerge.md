---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:27:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/FastMerge.html
title: FastMerge
---

# FastMerge

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface FastMerge

- All Known Implementing Classes:
`[GCounter](GCounter.html "class in akka.cluster.ddata")`, `[GSet](GSet.html "class in akka.cluster.ddata")`, `[ORSet](ORSet.html "class in akka.cluster.ddata")`

---

```
public interface FastMerge
```

INTERNAL API
 
 Optimization for add/remove followed by merge and merge should just fast forward to
 the new instance.
 

 It's like a cache between calls of the same thread, you can think of it as a thread local.
 The Replicator actor invokes the user's modify function, which returns a new ReplicatedData instance,
 with the ancestor field set (see for example the add method in ORSet). Then (in same thread) the
 Replication calls merge, which makes use of the ancestor field to perform quick merge
 (see for example merge method in ORSet).
 

 It's not thread safe if the modifying function and merge are called from different threads,
 i.e. if used outside the Replicator infrastructure, but the worst thing that can happen is that
 a full merge is performed instead of the fast forward merge.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[ancestor_$eq](#ancestor_$eq(akka.cluster.ddata.FastMerge))​([FastMerge](FastMerge.html "interface in akka.cluster.ddata") x$1)` |  |
	| `[FastMerge](FastMerge.html "interface in akka.cluster.ddata")` | `[assignAncestor](#assignAncestor(akka.cluster.ddata.ReplicatedData.T))​(akka.cluster.ddata.ReplicatedData.T newData)` | INTERNAL API: should be called from "updating" methods, and \`resetDelta\` |
	| `[FastMerge](FastMerge.html "interface in akka.cluster.ddata")` | `[clearAncestor](#clearAncestor())()` | INTERNAL API: should be called from merge |
	| `boolean` | `[isAncestorOf](#isAncestorOf(akka.cluster.ddata.ReplicatedData.T))​(akka.cluster.ddata.ReplicatedData.T that)` | INTERNAL API: should be used from merge |

- - ### Method Detail
	
	
	
		- #### ancestor\_$eq
		
		
		
		```
		void ancestor_$eq​([FastMerge](FastMerge.html "interface in akka.cluster.ddata") x$1)
		```
		- #### assignAncestor
		
		
		
		```
		[FastMerge](FastMerge.html "interface in akka.cluster.ddata") assignAncestor​(akka.cluster.ddata.ReplicatedData.T newData)
		```
		
		INTERNAL API: should be called from "updating" methods, and \`resetDelta\`
		- #### clearAncestor
		
		
		
		```
		[FastMerge](FastMerge.html "interface in akka.cluster.ddata") clearAncestor()
		```
		
		INTERNAL API: should be called from merge
		- #### isAncestorOf
		
		
		
		```
		boolean isAncestorOf​(akka.cluster.ddata.ReplicatedData.T that)
		```
		
		INTERNAL API: should be used from merge

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/FastMerge.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GCounter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/FastMerge.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/FastMerge.html)*