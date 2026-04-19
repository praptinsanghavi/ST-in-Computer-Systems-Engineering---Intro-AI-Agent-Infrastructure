---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:41:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessState$.html
title: ShardedDaemonProcessState$
---

# ShardedDaemonProcessState$

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class ShardedDaemonProcessState$

- java.lang.Object
- - akka.cluster.sharding.typed.internal.ShardedDaemonProcessState$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ShardedDaemonProcessState$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.sharding.typed.internal.ShardedDaemonProcessState$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardedDaemonProcessState$](ShardedDaemonProcessState$.html "class in akka.cluster.sharding.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardedDaemonProcessState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.sharding.typed.internal.ShardedDaemonProcessState` | `[apply](#apply(long,int,boolean,java.time.Instant))​(long revision,  int numberOfProcesses,  boolean completed,  java.time.Instant started)` |  |
	| `akka.cluster.sharding.typed.internal.ShardedDaemonProcessState` | `[initialState](#initialState(int))​(int initialNumberOfProcesses)` |  |
	| `long` | `[startRevision](#startRevision())()` |  |
	| `scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.time.Instant>>` | `[unapply](#unapply(akka.cluster.sharding.typed.internal.ShardedDaemonProcessState))​(akka.cluster.sharding.typed.internal.ShardedDaemonProcessState x$0)` |  |
	| `<T> scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>>` | `[verifyRevisionBeforeStarting](#verifyRevisionBeforeStarting(akka.cluster.ddata.Replicator.ReadConsistency,scala.Function1))​([Replicator.ReadConsistency](../../../ddata/Replicator.ReadConsistency.html "interface in akka.cluster.ddata") stateReadConsistency,  scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardedDaemonProcessState$](ShardedDaemonProcessState$.html "class in akka.cluster.sharding.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardedDaemonProcessState$
		
		
		
		```
		public ShardedDaemonProcessState$()
		```

	- ### Method Detail
	
	
	
		- #### startRevision
		
		
		
		```
		public long startRevision()
		```
		- #### initialState
		
		
		
		```
		public akka.cluster.sharding.typed.internal.ShardedDaemonProcessState initialState​(int initialNumberOfProcesses)
		```
		- #### verifyRevisionBeforeStarting
		
		
		
		```
		public <T> scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> verifyRevisionBeforeStarting​([Replicator.ReadConsistency](../../../ddata/Replicator.ReadConsistency.html "interface in akka.cluster.ddata") stateReadConsistency,
		                                                                                                       scala.Function1<[ShardedDaemonProcessContext](../ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed"),​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<T>> behaviorFactory)
		```
		- #### apply
		
		
		
		```
		public akka.cluster.sharding.typed.internal.ShardedDaemonProcessState apply​(long revision,
		                                                                            int numberOfProcesses,
		                                                                            boolean completed,
		                                                                            java.time.Instant started)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.time.Instant>> unapply​(akka.cluster.sharding.typed.internal.ShardedDaemonProcessState x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.ReadConsistency.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessState$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessState$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessState$.html)*