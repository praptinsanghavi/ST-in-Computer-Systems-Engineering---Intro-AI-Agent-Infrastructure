---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDeltaSize.html
title: ReplicatedDeltaSize
---

# ReplicatedDeltaSize

## Content

Package [akka.cluster.ddata](package-summary.html)
## Interface ReplicatedDeltaSize

- ---

```
public interface ReplicatedDeltaSize
```

Some complex deltas grow in size for each update and above a configured
 threshold such deltas are discarded and sent as full state instead. This
 interface should be implemented by such deltas to define its size.
 This is number of elements or similar size hint, not size in bytes.
 The threshold is defined in `akka.cluster.distributed-data.delta-crdt.max-delta-size`
 or corresponding [`ReplicatorSettings`](ReplicatorSettings.html "class in akka.cluster.ddata").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[deltaSize](#deltaSize())()` |  |

- - ### Method Detail
	
	
	
		- #### deltaSize
		
		
		
		```
		int deltaSize()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDeltaSize.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/ReplicatedDeltaSize.html)*