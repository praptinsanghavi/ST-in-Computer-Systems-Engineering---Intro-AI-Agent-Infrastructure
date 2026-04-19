---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:35:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html
title: ChangeNumberOfProcesses$
---

# ChangeNumberOfProcesses$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ChangeNumberOfProcesses$

- java.lang.Object
- - akka.cluster.sharding.typed.ChangeNumberOfProcesses$

- ---

```
public class ChangeNumberOfProcesses$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ChangeNumberOfProcesses$](ChangeNumberOfProcesses$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChangeNumberOfProcesses$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ChangeNumberOfProcesses](ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed")` | `[apply](#apply(int,akka.actor.typed.ActorRef))​(int newNumberOfProcesses,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<[Done](../../../Done.html "class in akka")>> replyTo)` | Scala API: Tell the sharded daemon process to rescale to the given number of processes. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ChangeNumberOfProcesses$](ChangeNumberOfProcesses$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ChangeNumberOfProcesses$
		
		
		
		```
		public ChangeNumberOfProcesses$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ChangeNumberOfProcesses](ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed") apply​(int newNumberOfProcesses,
		                                     [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[StatusReply](../../../pattern/StatusReply.html "class in akka.pattern")<[Done](../../../Done.html "class in akka")>> replyTo)
		```
		
		Scala API: Tell the sharded daemon process to rescale to the given number of processes.
		 
		
		Parameters:
		`newNumberOfProcesses` \- The number of processes to scale up to
		`replyTo` \- Reply to this actor once scaling is successfully done, or with details if it failed
		 Note that a successful response may take a long time, depending on how fast
		 the daemon process actors stop after getting their stop message.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html)*