---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:42:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/ClusterReceptionistSettings$.html
title: ClusterReceptionistSettings$
---

# ClusterReceptionistSettings$

## Content

Package [akka.cluster.typed.internal.receptionist](package-summary.html)
## Class ClusterReceptionistSettings$

- java.lang.Object
- - akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ClusterReceptionistSettings$
extends java.lang.Object
implements java.io.Serializable
```

Internal API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterReceptionistSettings$](ClusterReceptionistSettings$.html "class in akka.cluster.typed.internal.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterReceptionistSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings` | `[apply](#apply(akka.cluster.ddata.Replicator.WriteConsistency,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,akka.cluster.ddata.ReplicatorSettings))​([Replicator.WriteConsistency](../../../ddata/Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,  scala.concurrent.duration.FiniteDuration pruningInterval,  scala.concurrent.duration.FiniteDuration pruneRemovedOlderThan,  int distributedKeyCount,  [ReplicatorSettings](../../../ddata/ReplicatorSettings.html "class in akka.cluster.ddata") replicatorSettings)` | Internal API |
	| `akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `scala.Option<scala.Tuple5<[Replicator.WriteConsistency](../../../ddata/Replicator.WriteConsistency.html "interface in akka.cluster.ddata"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​[ReplicatorSettings](../../../ddata/ReplicatorSettings.html "class in akka.cluster.ddata")>>` | `[unapply](#unapply(akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings))​(akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterReceptionistSettings$](ClusterReceptionistSettings$.html "class in akka.cluster.typed.internal.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterReceptionistSettings$
		
		
		
		```
		public ClusterReceptionistSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings apply​([ActorSystem](../../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### apply
		
		
		
		```
		public akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings apply​(com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings apply​([Replicator.WriteConsistency](../../../ddata/Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,
		                                                                                  scala.concurrent.duration.FiniteDuration pruningInterval,
		                                                                                  scala.concurrent.duration.FiniteDuration pruneRemovedOlderThan,
		                                                                                  int distributedKeyCount,
		                                                                                  [ReplicatorSettings](../../../ddata/ReplicatorSettings.html "class in akka.cluster.ddata") replicatorSettings)
		```
		
		Internal API
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<[Replicator.WriteConsistency](../../../ddata/Replicator.WriteConsistency.html "interface in akka.cluster.ddata"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.Object,​[ReplicatorSettings](../../../ddata/ReplicatorSettings.html "class in akka.cluster.ddata")>> unapply​(akka.cluster.typed.internal.receptionist.ClusterReceptionistSettings x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.WriteConsistency.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatorSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/ClusterReceptionistSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/ClusterReceptionistSettings$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/internal/receptionist/ClusterReceptionistSettings$.html)*