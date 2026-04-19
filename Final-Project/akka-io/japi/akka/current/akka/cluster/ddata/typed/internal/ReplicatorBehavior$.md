---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:57:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/internal/ReplicatorBehavior$.html
title: ReplicatorBehavior$
---

# ReplicatorBehavior$

## Content

Package [akka.cluster.ddata.typed.internal](package-summary.html)
## Class ReplicatorBehavior$

- java.lang.Object
- - akka.cluster.ddata.typed.internal.ReplicatorBehavior$

- ---

```
public class ReplicatorBehavior$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatorBehavior$](ReplicatorBehavior$.html "class in akka.cluster.ddata.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatorBehavior$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[additionalAskTimeout](#additionalAskTimeout())()` |  |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](../scaladsl/Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")>` | `[apply](#apply(akka.cluster.ddata.ReplicatorSettings,scala.Option))​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings,  scala.Option<[ActorRef](../../../../actor/ActorRef.html "class in akka.actor")> underlyingReplicator)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[localAskTimeout](#localAskTimeout())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatorBehavior$](ReplicatorBehavior$.html "class in akka.cluster.ddata.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatorBehavior$
		
		
		
		```
		public ReplicatorBehavior$()
		```

	- ### Method Detail
	
	
	
		- #### localAskTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration localAskTimeout()
		```
		- #### additionalAskTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration additionalAskTimeout()
		```
		- #### apply
		
		
		
		```
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](../scaladsl/Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> apply​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings,
		                                          scala.Option<[ActorRef](../../../../actor/ActorRef.html "class in akka.actor")> underlyingReplicator)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/internal/ReplicatorBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator.Command.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/internal/ReplicatorBehavior$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/internal/ReplicatorBehavior$.html)*