---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$.html
title: Replicator$
---

# Replicator$

## Content

Package [akka.cluster.ddata.typed.scaladsl](package-summary.html)
## Class Replicator$

- java.lang.Object
- - akka.cluster.ddata.typed.scaladsl.Replicator$

- ---

```
public class Replicator$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Replicator$](Replicator$.html "class in akka.cluster.ddata.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Replicator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")>` | `[behavior](#behavior(akka.cluster.ddata.ReplicatorSettings))​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings)` | The `Behavior` for the `Replicator` actor. |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")>` | `[behavior](#behavior(akka.cluster.ddata.ReplicatorSettings,akka.actor.ActorRef))​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings,  [ActorRef](../../../../actor/ActorRef.html "class in akka.actor") underlyingReplicator)` | The `Behavior` for the `Replicator` actor. |
	| `[Replicator.ReadLocal$](../../Replicator.ReadLocal$.html "class in akka.cluster.ddata")` | `[ReadLocal](#ReadLocal())()` |  |
	| `[Replicator.WriteLocal$](../../Replicator.WriteLocal$.html "class in akka.cluster.ddata")` | `[WriteLocal](#WriteLocal())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Replicator$](Replicator$.html "class in akka.cluster.ddata.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Replicator$
		
		
		
		```
		public Replicator$()
		```

	- ### Method Detail
	
	
	
		- #### behavior
		
		
		
		```
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> behavior​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings)
		```
		
		The `Behavior` for the `Replicator` actor.
		- #### behavior
		
		
		
		```
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.scaladsl")> behavior​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings,
		                                             [ActorRef](../../../../actor/ActorRef.html "class in akka.actor") underlyingReplicator)
		```
		
		The `Behavior` for the `Replicator` actor.
		 It will use the given underlying [`Replicator`](../../Replicator.html "class in akka.cluster.ddata")
		- #### ReadLocal
		
		
		
		```
		public [Replicator.ReadLocal$](../../Replicator.ReadLocal$.html "class in akka.cluster.ddata") ReadLocal()
		```
		- #### WriteLocal
		
		
		
		```
		public [Replicator.WriteLocal$](../../Replicator.WriteLocal$.html "class in akka.cluster.ddata") WriteLocal()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.ReadLocal$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.WriteLocal$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/scaladsl/Replicator$.html)*