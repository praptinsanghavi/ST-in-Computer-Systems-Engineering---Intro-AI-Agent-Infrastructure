---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
title: ShardedDaemonProcessContext
---

# ShardedDaemonProcessContext

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Interface ShardedDaemonProcessContext

- ---

```
public interface ShardedDaemonProcessContext
```

Context with details about the Sharded Daemon Process instance to use when starting it
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[name](#name())()` |  |
	| `int` | `[processNumber](#processNumber())()` |  |
	| `long` | `[revision](#revision())()` | The revision starts at 0 and each time the number of processes is changed, the revision increases with 1 |
	| `int` | `[totalProcesses](#totalProcesses())()` |  |

- - ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		java.lang.String name()
		```
		- #### processNumber
		
		
		
		```
		int processNumber()
		```
		- #### revision
		
		
		
		```
		long revision()
		```
		
		The revision starts at 0 and each time the number of processes is changed, the revision increases with 1
		- #### totalProcesses
		
		
		
		```
		int totalProcesses()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html)*