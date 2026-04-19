---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.ReadConsistency.html
title: Replicator.ReadConsistency
---

# Replicator.ReadConsistency

## Content

Package [akka.cluster.ddata.typed.javadsl](package-summary.html)
## Interface Replicator.ReadConsistency

- All Known Implementing Classes:
`[Replicator.ReadAll](Replicator.ReadAll.html "class in akka.cluster.ddata.typed.javadsl")`, `[Replicator.ReadFrom](Replicator.ReadFrom.html "class in akka.cluster.ddata.typed.javadsl")`, `[Replicator.ReadLocal$](Replicator.ReadLocal$.html "class in akka.cluster.ddata.typed.javadsl")`, `[Replicator.ReadMajority](Replicator.ReadMajority.html "class in akka.cluster.ddata.typed.javadsl")`

Enclosing class:
[Replicator](Replicator.html "class in akka.cluster.ddata.typed.javadsl")

---

```
public static interface Replicator.ReadConsistency
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.time.Duration` | `[timeout](#timeout())()` |  |
	| `[Replicator.ReadConsistency](../../Replicator.ReadConsistency.html "interface in akka.cluster.ddata")` | `[toClassic](#toClassic())()` | INTERNAL API |

- - ### Method Detail
	
	
	
		- #### timeout
		
		
		
		```
		java.time.Duration timeout()
		```
		- #### toClassic
		
		
		
		```
		[Replicator.ReadConsistency](../../Replicator.ReadConsistency.html "interface in akka.cluster.ddata") toClassic()
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/Replicator.ReadConsistency.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.ReadAll.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.ReadFrom.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.ReadLocal$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.ReadMajority.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.ReadConsistency.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator.ReadConsistency.html)*