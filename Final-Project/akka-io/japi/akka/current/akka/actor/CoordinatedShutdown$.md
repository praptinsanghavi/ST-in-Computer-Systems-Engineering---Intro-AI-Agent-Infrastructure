---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/CoordinatedShutdown$.html
title: CoordinatedShutdown$
---

# CoordinatedShutdown$

## Content

Package [akka.actor](package-summary.html)
## Class CoordinatedShutdown$

- java.lang.Object
- - akka.actor.CoordinatedShutdown$

- All Implemented Interfaces:
`[ExtensionId](ExtensionId.html "interface in akka.actor")<[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")>`, `[ExtensionIdProvider](ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class CoordinatedShutdown$
extends java.lang.Object
implements [ExtensionId](ExtensionId.html "interface in akka.actor")<[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")>, [ExtensionIdProvider](ExtensionIdProvider.html "interface in akka.actor")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CoordinatedShutdown$](CoordinatedShutdown$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CoordinatedShutdown$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[actorSystemTerminateReason](#actorSystemTerminateReason())()` |  |
	| `[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[clusterDowningReason](#clusterDowningReason())()` |  |
	| `[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[clusterJoinUnsuccessfulReason](#clusterJoinUnsuccessfulReason())()` |  |
	| `[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[clusterLeavingReason](#clusterLeavingReason())()` |  |
	| `[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[incompatibleConfigurationDetectedReason](#incompatibleConfigurationDetectedReason())()` |  |
	| `[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[jvmExitReason](#jvmExitReason())()` |  |
	| `[CoordinatedShutdown$](CoordinatedShutdown$.html "class in akka.actor")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	| `java.lang.String` | `[PhaseActorSystemTerminate](#PhaseActorSystemTerminate())()` | Last phase. |
	| `java.lang.String` | `[PhaseBeforeActorSystemTerminate](#PhaseBeforeActorSystemTerminate())()` | Phase for custom application tasks that are to be run  after cluster shutdown and before ActorSystem termination. |
	| `java.lang.String` | `[PhaseBeforeClusterShutdown](#PhaseBeforeClusterShutdown())()` | Phase for custom application tasks that are to be run  after service shutdown and before cluster shutdown. |
	| `java.lang.String` | `[PhaseBeforeServiceUnbind](#PhaseBeforeServiceUnbind())()` |  |
	| `java.lang.String` | `[PhaseClusterExiting](#PhaseClusterExiting())()` | Shutdown cluster singletons |
	| `java.lang.String` | `[PhaseClusterExitingDone](#PhaseClusterExitingDone())()` | Wait until exiting has been completed |
	| `java.lang.String` | `[PhaseClusterLeave](#PhaseClusterLeave())()` | Emit the leave command for the node that is shutting down. |
	| `java.lang.String` | `[PhaseClusterShardingShutdownRegion](#PhaseClusterShardingShutdownRegion())()` | Graceful shutdown of the Cluster Sharding regions. |
	| `java.lang.String` | `[PhaseClusterShutdown](#PhaseClusterShutdown())()` | Shutdown the cluster extension |
	| `java.lang.String` | `[PhaseServiceRequestsDone](#PhaseServiceRequestsDone())()` | Wait for requests that are in progress to be completed. |
	| `java.lang.String` | `[PhaseServiceStop](#PhaseServiceStop())()` | Final shutdown of service endpoints. |
	| `java.lang.String` | `[PhaseServiceUnbind](#PhaseServiceUnbind())()` | Stop accepting new incoming requests in for example HTTP. |
	| `[CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor")` | `[unknownReason](#unknownReason())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](ExtensionId.html "interface in akka.actor")
		
		
		`[apply](ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](ExtensionId.html#equals(java.lang.Object)), [hashCode](ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CoordinatedShutdown$](CoordinatedShutdown$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CoordinatedShutdown$
		
		
		
		```
		public CoordinatedShutdown$()
		```

	- ### Method Detail
	
	
	
		- #### PhaseBeforeServiceUnbind
		
		
		
		```
		public java.lang.String PhaseBeforeServiceUnbind()
		```
		- #### PhaseServiceUnbind
		
		
		
		```
		public java.lang.String PhaseServiceUnbind()
		```
		
		Stop accepting new incoming requests in for example HTTP.
		- #### PhaseServiceRequestsDone
		
		
		
		```
		public java.lang.String PhaseServiceRequestsDone()
		```
		
		Wait for requests that are in progress to be completed.
		- #### PhaseServiceStop
		
		
		
		```
		public java.lang.String PhaseServiceStop()
		```
		
		Final shutdown of service endpoints.
		- #### PhaseBeforeClusterShutdown
		
		
		
		```
		public java.lang.String PhaseBeforeClusterShutdown()
		```
		
		Phase for custom application tasks that are to be run
		 after service shutdown and before cluster shutdown.
		- #### PhaseClusterShardingShutdownRegion
		
		
		
		```
		public java.lang.String PhaseClusterShardingShutdownRegion()
		```
		
		Graceful shutdown of the Cluster Sharding regions.
		- #### PhaseClusterLeave
		
		
		
		```
		public java.lang.String PhaseClusterLeave()
		```
		
		Emit the leave command for the node that is shutting down.
		- #### PhaseClusterExiting
		
		
		
		```
		public java.lang.String PhaseClusterExiting()
		```
		
		Shutdown cluster singletons
		- #### PhaseClusterExitingDone
		
		
		
		```
		public java.lang.String PhaseClusterExitingDone()
		```
		
		Wait until exiting has been completed
		- #### PhaseClusterShutdown
		
		
		
		```
		public java.lang.String PhaseClusterShutdown()
		```
		
		Shutdown the cluster extension
		- #### PhaseBeforeActorSystemTerminate
		
		
		
		```
		public java.lang.String PhaseBeforeActorSystemTerminate()
		```
		
		Phase for custom application tasks that are to be run
		 after cluster shutdown and before ActorSystem termination.
		- #### PhaseActorSystemTerminate
		
		
		
		```
		public java.lang.String PhaseActorSystemTerminate()
		```
		
		Last phase. See terminate\-actor\-system and exit\-jvm above.
		 Don't add phases that depends on this phase because the
		 dispatcher and scheduler of the ActorSystem have been shutdown.
		- #### unknownReason
		
		
		
		```
		public [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") unknownReason()
		```
		- #### actorSystemTerminateReason
		
		
		
		```
		public [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") actorSystemTerminateReason()
		```
		- #### jvmExitReason
		
		
		
		```
		public [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") jvmExitReason()
		```
		- #### clusterDowningReason
		
		
		
		```
		public [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") clusterDowningReason()
		```
		- #### clusterJoinUnsuccessfulReason
		
		
		
		```
		public [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") clusterJoinUnsuccessfulReason()
		```
		- #### incompatibleConfigurationDetectedReason
		
		
		
		```
		public [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") incompatibleConfigurationDetectedReason()
		```
		- #### clusterLeavingReason
		
		
		
		```
		public [CoordinatedShutdown.Reason](CoordinatedShutdown.Reason.html "interface in akka.actor") clusterLeavingReason()
		```
		- #### get
		
		
		
		```
		public [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor") get​([ActorSystem](ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](ExtensionId.html "interface in akka.actor")<[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")>`
		- #### get
		
		
		
		```
		public [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor") get​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](ExtensionId.html "interface in akka.actor")<[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")>`
		- #### lookup
		
		
		
		```
		public [CoordinatedShutdown$](CoordinatedShutdown$.html "class in akka.actor") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor") createExtension​([ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](ExtensionId.html "interface in akka.actor")<[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")>`

## Code Examples

### Example 1: get

```text
override def get(system: ActorSystem): TheExtension = super.get(system)
```

### Example 2: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/CoordinatedShutdown$.html
- https://doc.akka.io/japi/akka/current/akka/actor/CoordinatedShutdown.Reason.html
- https://doc.akka.io/japi/akka/current/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/CoordinatedShutdown$.html](https://doc.akka.io/japi/akka/current/akka/actor/CoordinatedShutdown$.html)*