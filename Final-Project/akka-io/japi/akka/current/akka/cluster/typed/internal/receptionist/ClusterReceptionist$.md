---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/receptionist/ClusterReceptionist$.html
title: ClusterReceptionist$
---

# ClusterReceptionist$

## Content

Package [akka.cluster.typed.internal.receptionist](package-summary.html)
## Class ClusterReceptionist$

- java.lang.Object
- - akka.cluster.typed.internal.receptionist.ClusterReceptionist$

- All Implemented Interfaces:
`[ReceptionistBehaviorProvider](../../../../actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html "interface in akka.actor.typed.internal.receptionist")`

---

```
public class ClusterReceptionist$
extends java.lang.Object
implements [ReceptionistBehaviorProvider](../../../../actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html "interface in akka.actor.typed.internal.receptionist")
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterReceptionist$](ClusterReceptionist$.html "class in akka.cluster.typed.internal.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterReceptionist$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Receptionist.Command](../../../../actor/typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")>` | `[behavior](#behavior())()` |  |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Receptionist.Command](../../../../actor/typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")>` | `[behavior](#behavior(akka.cluster.typed.internal.receptionist.ClusterReceptionist.Setup,akka.cluster.typed.internal.receptionist.ClusterReceptionist.State))​(akka.cluster.typed.internal.receptionist.ClusterReceptionist.Setup setup,  akka.cluster.typed.internal.receptionist.ClusterReceptionist.State state)` |  |
	| `[ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry>` | `[EmptyORMultiMap](#EmptyORMultiMap())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterReceptionist$](ClusterReceptionist$.html "class in akka.cluster.typed.internal.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterReceptionist$
		
		
		
		```
		public ClusterReceptionist$()
		```

	- ### Method Detail
	
	
	
		- #### EmptyORMultiMap
		
		
		
		```
		public final [ORMultiMap](../../../ddata/ORMultiMap.html "class in akka.cluster.ddata")<[ServiceKey](../../../../actor/typed/receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<?>,​akka.cluster.typed.internal.receptionist.ClusterReceptionist.Entry> EmptyORMultiMap()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		
		Specified by:
		`[name](../../../../actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html#name())` in interface `[ReceptionistBehaviorProvider](../../../../actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html "interface in akka.actor.typed.internal.receptionist")`
		- #### behavior
		
		
		
		```
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Receptionist.Command](../../../../actor/typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")> behavior()
		```
		
		
		Specified by:
		`[behavior](../../../../actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html#behavior())` in interface `[ReceptionistBehaviorProvider](../../../../actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html "interface in akka.actor.typed.internal.receptionist")`
		- #### behavior
		
		
		
		```
		public [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[Receptionist.Command](../../../../actor/typed/receptionist/Receptionist.Command.html "class in akka.actor.typed.receptionist")> behavior​(akka.cluster.typed.internal.receptionist.ClusterReceptionist.Setup setup,
		                                               akka.cluster.typed.internal.receptionist.ClusterReceptionist.State state)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistBehaviorProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Command.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORMultiMap.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/receptionist/ClusterReceptionist$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/receptionist/ClusterReceptionist$.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/internal/receptionist/ClusterReceptionist$.html)*