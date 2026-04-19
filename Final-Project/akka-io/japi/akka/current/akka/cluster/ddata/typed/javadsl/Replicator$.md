---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:03:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$.html
title: Replicator$
---

# Replicator$

## Content

Package [akka.cluster.ddata.typed.javadsl](package-summary.html)
## Class Replicator$

- java.lang.Object
- - akka.cluster.ddata.typed.javadsl.Replicator$

- ---

```
public class Replicator$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Replicator$](Replicator$.html "class in akka.cluster.ddata.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Replicator$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl")>` | `[behavior](#behavior(akka.cluster.ddata.ReplicatorSettings))​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings)` | The `Behavior` for the `Replicator` actor. |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl")>` | `[behavior](#behavior(akka.cluster.ddata.ReplicatorSettings,akka.actor.ActorRef))​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings,  [ActorRef](../../../../actor/ActorRef.html "class in akka.actor") underlyingReplicator)` | The `Behavior` for the `Replicator` actor. |
	| `[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl")` | `[flushChanges](#flushChanges())()` | The `FlushChanges` instance. |
	| `[Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata.typed.javadsl")` | `[readLocal](#readLocal())()` | The `ReadLocal` instance |
	| `[Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata.typed.javadsl")` | `[writeLocal](#writeLocal())()` | The `WriteLocal` instance |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Replicator$](Replicator$.html "class in akka.cluster.ddata.typed.javadsl") MODULE$
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
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl")> behavior​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings)
		```
		
		The `Behavior` for the `Replicator` actor.
		- #### behavior
		
		
		
		```
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl")> behavior​([ReplicatorSettings](../../ReplicatorSettings.html "class in akka.cluster.ddata") settings,
		                                             [ActorRef](../../../../actor/ActorRef.html "class in akka.actor") underlyingReplicator)
		```
		
		The `Behavior` for the `Replicator` actor.
		 It will use the given underlying [`Replicator`](../../Replicator.html "class in akka.cluster.ddata")
		- #### readLocal
		
		
		
		```
		public [Replicator.ReadConsistency](Replicator.ReadConsistency.html "interface in akka.cluster.ddata.typed.javadsl") readLocal()
		```
		
		The `ReadLocal` instance
		- #### writeLocal
		
		
		
		```
		public [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata.typed.javadsl") writeLocal()
		```
		
		The `WriteLocal` instance
		- #### flushChanges
		
		
		
		```
		public [Replicator.Command](Replicator.Command.html "interface in akka.cluster.ddata.typed.javadsl") flushChanges()
		```
		
		The `FlushChanges` instance. Notify subscribers of changes now, otherwise they will be notified periodically
		 with the configured `notify-subscribers-interval`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.ReadConsistency.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator.WriteConsistency.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/typed/javadsl/Replicator$.html)*