---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetNumberOfProcesses.html
title: GetNumberOfProcesses
---

# GetNumberOfProcesses

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class GetNumberOfProcesses

- java.lang.Object
- - akka.cluster.sharding.typed.GetNumberOfProcesses

- All Implemented Interfaces:
`[ClusterShardingTypedSerializable](internal/ClusterShardingTypedSerializable.html "interface in akka.cluster.sharding.typed.internal")`, `[ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")`

---

```
public final class GetNumberOfProcesses
extends java.lang.Object
implements [ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed"), [ClusterShardingTypedSerializable](internal/ClusterShardingTypedSerializable.html "interface in akka.cluster.sharding.typed.internal")
```

Query the sharded daemon process for the current scale

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetNumberOfProcesses](#%3Cinit%3E(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[NumberOfProcesses](NumberOfProcesses.html "interface in akka.cluster.sharding.typed")> replyTo)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [GetNumberOfProcesses](GetNumberOfProcesses.html "class in akka.cluster.sharding.typed")` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[NumberOfProcesses](NumberOfProcesses.html "interface in akka.cluster.sharding.typed")> replyTo)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[NumberOfProcesses](NumberOfProcesses.html "interface in akka.cluster.sharding.typed")>` | `[replyTo](#replyTo())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GetNumberOfProcesses
		
		
		
		```
		public GetNumberOfProcesses​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[NumberOfProcesses](NumberOfProcesses.html "interface in akka.cluster.sharding.typed")> replyTo)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [GetNumberOfProcesses](GetNumberOfProcesses.html "class in akka.cluster.sharding.typed") apply​([ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[NumberOfProcesses](NumberOfProcesses.html "interface in akka.cluster.sharding.typed")> replyTo)
		```
		- #### replyTo
		
		
		
		```
		public [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[NumberOfProcesses](NumberOfProcesses.html "interface in akka.cluster.sharding.typed")> replyTo()
		```
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetNumberOfProcesses.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/NumberOfProcesses.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ClusterShardingTypedSerializable.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetNumberOfProcesses.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetNumberOfProcesses.html)*