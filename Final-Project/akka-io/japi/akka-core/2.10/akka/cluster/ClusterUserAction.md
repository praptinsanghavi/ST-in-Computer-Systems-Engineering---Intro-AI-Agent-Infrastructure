---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:25:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.html
title: ClusterUserAction
---

# ClusterUserAction

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterUserAction

- java.lang.Object
- - akka.cluster.ClusterUserAction

- ---

```
public class ClusterUserAction
extends java.lang.Object
```

INTERNAL API
 Cluster commands sent by the USER via
 [`Cluster`](Cluster.html "class in akka.cluster") extension
 or JMX.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ClusterUserAction.Down](ClusterUserAction.Down.html "class in akka.cluster")` | Command to mark node as temporary down. |
	| `static class` | `[ClusterUserAction.Down$](ClusterUserAction.Down$.html "class in akka.cluster")` |  |
	| `static class` | `[ClusterUserAction.JoinTo](ClusterUserAction.JoinTo.html "class in akka.cluster")` | Command to initiate join another node (represented by `address`). |
	| `static class` | `[ClusterUserAction.JoinTo$](ClusterUserAction.JoinTo$.html "class in akka.cluster")` |  |
	| `static class` | `[ClusterUserAction.Leave](ClusterUserAction.Leave.html "class in akka.cluster")` | Command to leave the cluster. |
	| `static class` | `[ClusterUserAction.Leave$](ClusterUserAction.Leave$.html "class in akka.cluster")` |  |
	| `static class` | `[ClusterUserAction.PrepareForShutdown$](ClusterUserAction.PrepareForShutdown$.html "class in akka.cluster")` | Command to mark all nodes as shutting down |
	| `static class` | `[ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster")` | Command to set the `appVersion` after system startup but before joining. |
	| `static class` | `[ClusterUserAction.SetAppVersion$](ClusterUserAction.SetAppVersion$.html "class in akka.cluster")` |  |
	| `static class` | `[ClusterUserAction.SetAppVersionLater$](ClusterUserAction.SetAppVersionLater$.html "class in akka.cluster")` | The `appVersion` is defined after system startup but before joining. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterUserAction](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterUserAction
		
		
		
		```
		public ClusterUserAction()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.Down$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.Down.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.JoinTo$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.JoinTo.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.Leave$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.Leave.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.PrepareForShutdown$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.SetAppVersion$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.SetAppVersion.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.SetAppVersionLater$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.html)*