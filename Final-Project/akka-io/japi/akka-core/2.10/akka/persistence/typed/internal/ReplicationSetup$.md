---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplicationSetup$.html
title: ReplicationSetup$
---

# ReplicationSetup$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class ReplicationSetup$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​scala.collection.immutable.Map\<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String\>,​akka.persistence.typed.internal.ReplicationContextImpl,​akka.persistence.typed.internal.ReplicationSetup\>
	- - akka.persistence.typed.internal.ReplicationSetup$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String>,​akka.persistence.typed.internal.ReplicationContextImpl,​akka.persistence.typed.internal.ReplicationSetup>`

---

```
public class ReplicationSetup$
extends scala.runtime.AbstractFunction3<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String>,​akka.persistence.typed.internal.ReplicationContextImpl,​akka.persistence.typed.internal.ReplicationSetup>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.ReplicationSetup$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicationSetup$](ReplicationSetup$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicationSetup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.typed.internal.ReplicationSetup` | `[apply](#apply(akka.persistence.typed.ReplicaId,scala.collection.immutable.Map,akka.persistence.typed.internal.ReplicationContextImpl))​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId,  scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String> allReplicasAndQueryPlugins,  akka.persistence.typed.internal.ReplicationContextImpl replicationContext)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String>,​akka.persistence.typed.internal.ReplicationContextImpl>>` | `[unapply](#unapply(akka.persistence.typed.internal.ReplicationSetup))​(akka.persistence.typed.internal.ReplicationSetup x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicationSetup$](ReplicationSetup$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicationSetup$
		
		
		
		```
		public ReplicationSetup$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String>,​akka.persistence.typed.internal.ReplicationContextImpl,​akka.persistence.typed.internal.ReplicationSetup>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String>,​akka.persistence.typed.internal.ReplicationContextImpl,​akka.persistence.typed.internal.ReplicationSetup>`
		- #### apply
		
		
		
		```
		public akka.persistence.typed.internal.ReplicationSetup apply​([ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId,
		                                                              scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String> allReplicasAndQueryPlugins,
		                                                              akka.persistence.typed.internal.ReplicationContextImpl replicationContext)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String>,​akka.persistence.typed.internal.ReplicationContextImpl,​akka.persistence.typed.internal.ReplicationSetup>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​scala.collection.immutable.Map<[ReplicaId](../ReplicaId.html "class in akka.persistence.typed"),​java.lang.String>,​akka.persistence.typed.internal.ReplicationContextImpl>> unapply​(akka.persistence.typed.internal.ReplicationSetup x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplicationSetup$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplicationSetup$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/ReplicationSetup$.html)*