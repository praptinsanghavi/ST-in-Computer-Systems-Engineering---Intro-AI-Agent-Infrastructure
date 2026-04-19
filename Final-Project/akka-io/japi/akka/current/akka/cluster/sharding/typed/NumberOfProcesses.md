---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:10:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/NumberOfProcesses.html
title: NumberOfProcesses
---

# NumberOfProcesses

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Interface NumberOfProcesses

- All Known Implementing Classes:
`[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal")`

---

```
public interface NumberOfProcesses
```

Reply for [`GetNumberOfProcesses`](GetNumberOfProcesses.html "class in akka.cluster.sharding.typed")

 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[numberOfProcesses](#numberOfProcesses())()` |  |
	| `boolean` | `[rescaleInProgress](#rescaleInProgress())()` |  |
	| `long` | `[revision](#revision())()` | Revision number increased for every re\-scale that has been triggered with [`ChangeNumberOfProcesses`](ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed") |
	| `java.time.Instant` | `[started](#started())()` | The timestamp when the change to the current number of processes was initiated. |

- - ### Method Detail
	
	
	
		- #### numberOfProcesses
		
		
		
		```
		int numberOfProcesses()
		```
		- #### rescaleInProgress
		
		
		
		```
		boolean rescaleInProgress()
		```
		- #### revision
		
		
		
		```
		long revision()
		```
		
		Revision number increased for every re\-scale that has been triggered with [`ChangeNumberOfProcesses`](ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed")
		- #### started
		
		
		
		```
		java.time.Instant started()
		```
		
		The timestamp when the change to the current number of processes was initiated. If the number is the initial
		 number of processes this value is "some time" after cluster startup.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/GetNumberOfProcesses.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/NumberOfProcesses.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/NumberOfProcesses.html)*