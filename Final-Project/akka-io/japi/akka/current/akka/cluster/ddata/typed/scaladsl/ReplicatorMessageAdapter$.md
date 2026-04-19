---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html
title: ReplicatorMessageAdapter$
---

# ReplicatorMessageAdapter$

## Content

Package [akka.cluster.ddata.typed.scaladsl](package-summary.html)
## Class ReplicatorMessageAdapter$

- java.lang.Object
- - akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter$

- ---

```
public class ReplicatorMessageAdapter$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatorMessageAdapter$](ReplicatorMessageAdapter$.html "class in akka.cluster.ddata.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatorMessageAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>[ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.scaladsl")<A,​B>` | `[apply](#apply(akka.actor.typed.scaladsl.ActorContext,akka.actor.typed.ActorRef,scala.concurrent.duration.FiniteDuration))​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<A> context,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> replicator,  scala.concurrent.duration.FiniteDuration unexpectedAskTimeout)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatorMessageAdapter$](ReplicatorMessageAdapter$.html "class in akka.cluster.ddata.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatorMessageAdapter$
		
		
		
		```
		public ReplicatorMessageAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A,​B extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")> [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "class in akka.cluster.ddata.typed.scaladsl")<A,​B> apply​([ActorContext](../../../../actor/typed/scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<A> context,
		                                                                                    [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> replicator,
		                                                                                    scala.concurrent.duration.FiniteDuration unexpectedAskTimeout)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html)*