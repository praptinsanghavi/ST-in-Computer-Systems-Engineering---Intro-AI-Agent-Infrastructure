---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:41:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$.html
title: ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$
---

# ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<java.lang.Object,​java.time.Instant,​java.lang.Object,​java.lang.Object,​[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal")\>
	- - akka.cluster.sharding.typed.internal.ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<java.lang.Object,​java.time.Instant,​java.lang.Object,​java.lang.Object,​[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal")>`

Enclosing class:
[ShardedDaemonProcessCoordinator](ShardedDaemonProcessCoordinator.html "class in akka.cluster.sharding.typed.internal")

---

```
public static class ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$
extends scala.runtime.AbstractFunction4<java.lang.Object,​java.time.Instant,​java.lang.Object,​java.lang.Object,​[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.sharding.typed.internal.ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$.html "class in akka.cluster.sharding.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetNumberOfProcessesReply$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal")` | `[apply](#apply(int,java.time.Instant,boolean,long))​(int numberOfProcesses,  java.time.Instant started,  boolean rescaleInProgress,  long revision)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<java.lang.Object,​java.time.Instant,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.sharding.typed.internal.ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply))​([ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$.html "class in akka.cluster.sharding.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GetNumberOfProcessesReply$
		
		
		
		```
		public GetNumberOfProcessesReply$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<java.lang.Object,​java.time.Instant,​java.lang.Object,​java.lang.Object,​[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<java.lang.Object,​java.time.Instant,​java.lang.Object,​java.lang.Object,​[ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal")>`
		- #### apply
		
		
		
		```
		public [ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal") apply​(int numberOfProcesses,
		                                                                       java.time.Instant started,
		                                                                       boolean rescaleInProgress,
		                                                                       long revision)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​java.time.Instant,​java.lang.Object,​java.lang.Object>> unapply​([ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply](ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html "class in akka.cluster.sharding.typed.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessCoordinator.GetNumberOfProcessesReply$.html)*