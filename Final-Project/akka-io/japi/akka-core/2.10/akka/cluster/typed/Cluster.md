---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Cluster.html
title: Cluster
---

# Cluster

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Cluster

- java.lang.Object
- - akka.cluster.typed.Cluster

- All Implemented Interfaces:
`[Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")`

---

```
public abstract class Cluster
extends java.lang.Object
implements [Extension](../../actor/typed/Extension.html "interface in akka.actor.typed")
```

This class is not intended for user extension other than for test purposes (e.g.
 stub implementation). More methods may be added in the future and that may break
 such implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Cluster](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static [Cluster](Cluster.html "class in akka.cluster.typed")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [Cluster](Cluster.html "class in akka.cluster.typed")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")<T>` | `[id](#id())()` |  |
	| `abstract boolean` | `[isTerminated](#isTerminated())()` | Returns true if this cluster instance has be shutdown. |
	| `abstract [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed")>` | `[manager](#manager())()` |  |
	| `abstract [Member](../Member.html "class in akka.cluster")` | `[selfMember](#selfMember())()` | Details about this cluster node itself |
	| `abstract [ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")` | `[state](#state())()` | Current snapshot state of the cluster. |
	| `abstract [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterStateSubscription](ClusterStateSubscription.html "interface in akka.cluster.typed")>` | `[subscriptions](#subscriptions())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Cluster
		
		
		
		```
		public Cluster()
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public static [Cluster](Cluster.html "class in akka.cluster.typed") createExtension​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### get
		
		
		
		```
		public static [Cluster](Cluster.html "class in akka.cluster.typed") get​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static final T apply​([ActorSystem](../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### id
		
		
		
		```
		public static [ExtensionId](../../actor/typed/ExtensionId.html "class in akka.actor.typed")<T> id()
		```
		- #### selfMember
		
		
		
		```
		public abstract [Member](../Member.html "class in akka.cluster") selfMember()
		```
		
		Details about this cluster node itself
		- #### isTerminated
		
		
		
		```
		public abstract boolean isTerminated()
		```
		
		Returns true if this cluster instance has be shutdown.
		- #### state
		
		
		
		```
		public abstract [ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") state()
		```
		
		Current snapshot state of the cluster.
		- #### subscriptions
		
		
		
		```
		public abstract [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterStateSubscription](ClusterStateSubscription.html "interface in akka.cluster.typed")> subscriptions()
		```
		
		
		Returns:
		an actor that allows for subscribing to messages when the cluster state changes
		- #### manager
		
		
		
		```
		public abstract [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed")> manager()
		```
		
		
		Returns:
		an actor that accepts commands to join, leave and down nodes in a cluster

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Cluster.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Cluster.html)*