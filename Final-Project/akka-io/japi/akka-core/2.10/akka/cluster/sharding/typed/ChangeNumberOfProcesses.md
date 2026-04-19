---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
title: ChangeNumberOfProcesses
---

# ChangeNumberOfProcesses

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ChangeNumberOfProcesses

- java.lang.Object
- - akka.cluster.sharding.typed.ChangeNumberOfProcesses

- All Implemented Interfaces:
`[ClusterShardingTypedSerializable](internal/ClusterShardingTypedSerializable.html "interface in akka.cluster.sharding.typed.internal")`, `[ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed")`

---

```
public final class ChangeNumberOfProcesses
extends java.lang.Object
implements [ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed"), [ClusterShardingTypedSerializable](internal/ClusterShardingTypedSerializable.html "interface in akka.cluster.sharding.typed.internal")
```

Tell the sharded daemon process to rescale to the given number of processes.
 
 param: newNumberOfProcesses The number of processes to scale up to
 param: replyTo Reply to this actor once scaling is successfully done, or with details if it failed
 Note that a successful response may take a long time, depending on how fast
 the daemon process actors stop after getting their stop message.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChangeNumberOfProcesses](#%3Cinit%3E(int,akka.actor.typed.ActorRef))​(int newNumberOfProcesses,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<[Done](../../../Done.html "class in akka")>> replyTo)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ChangeNumberOfProcesses](ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed")` | `[apply](#apply(int,akka.actor.typed.ActorRef))​(int newNumberOfProcesses,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<[Done](../../../Done.html "class in akka")>> replyTo)` | Scala API: Tell the sharded daemon process to rescale to the given number of processes. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[newNumberOfProcesses](#newNumberOfProcesses())()` |  |
	| `[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<[Done](../../../Done.html "class in akka")>>` | `[replyTo](#replyTo())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ChangeNumberOfProcesses
		
		
		
		```
		public ChangeNumberOfProcesses​(int newNumberOfProcesses,
		                               [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<[Done](../../../Done.html "class in akka")>> replyTo)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ChangeNumberOfProcesses](ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed") apply​(int newNumberOfProcesses,
		                                            [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<[Done](../../../Done.html "class in akka")>> replyTo)
		```
		
		Scala API: Tell the sharded daemon process to rescale to the given number of processes.
		 
		
		Parameters:
		`newNumberOfProcesses` \- The number of processes to scale up to
		`replyTo` \- Reply to this actor once scaling is successfully done, or with details if it failed
		 Note that a successful response may take a long time, depending on how fast
		 the daemon process actors stop after getting their stop message.
		- #### newNumberOfProcesses
		
		
		
		```
		public int newNumberOfProcesses()
		```
		- #### replyTo
		
		
		
		```
		public [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<[Done](../../../Done.html "class in akka")>> replyTo()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/internal/ClusterShardingTypedSerializable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html)*