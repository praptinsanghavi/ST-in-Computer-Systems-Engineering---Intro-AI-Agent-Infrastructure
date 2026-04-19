---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Listeners.html
title: Listeners
---

# Listeners

## Content

Package [akka.routing](package-summary.html)
## Interface Listeners

- All Known Subinterfaces:
`[FSM](../actor/FSM.html "interface in akka.actor")<S,​D>`, `[LoggingFSM](../actor/LoggingFSM.html "interface in akka.actor")<S,​D>`

All Known Implementing Classes:
`[AbstractFSM](../actor/AbstractFSM.html "class in akka.actor")`, `[AbstractFSMWithStash](../actor/AbstractFSMWithStash.html "class in akka.actor")`, `[AbstractLoggingFSM](../actor/AbstractLoggingFSM.html "class in akka.actor")`, `[ClusterSingletonManager](../cluster/singleton/ClusterSingletonManager.html "class in akka.cluster.singleton")`

---

```
public interface Listeners
```

Listeners is a generic trait to implement listening capability on an Actor.
 
 Use the `gossip(msg)` method to have it sent to the listeners.
 
 Send `Listen(self)` to start listening.
 
 Send `Deafen(self)` to stop listening.
 
 Send `WithListeners(fun)` to traverse the current listeners.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$routing$Listeners$_setter_$listeners_$eq](#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set))​(java.util.Set<[ActorRef](../actor/ActorRef.html "class in akka.actor")> x$1)` |  |
	| `void` | `[gossip](#gossip(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object msg,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` | Sends the supplied message to all current listeners using the provided sender() as sender. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[gossip$default$2](#gossip$default$2(java.lang.Object))​(java.lang.Object msg)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[listenerManagement](#listenerManagement())()` | Chain this into the receive function. |
	| `java.util.Set<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[listeners](#listeners())()` |  |

- - ### Method Detail
	
	
	
		- #### akka$routing$Listeners$\_setter\_$listeners\_$eq
		
		
		
		```
		void akka$routing$Listeners$_setter_$listeners_$eq​(java.util.Set<[ActorRef](../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		- #### gossip
		
		
		
		```
		void gossip​(java.lang.Object msg,
		            [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		Sends the supplied message to all current listeners using the provided sender() as sender.
		- #### gossip$default$2
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") gossip$default$2​(java.lang.Object msg)
		```
		- #### listenerManagement
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> listenerManagement()
		```
		
		Chain this into the receive function.
		 
		
		
		
		```
		 def receive = listenerManagement orElse … 
		```
		- #### listeners
		
		
		
		```
		java.util.Set<[ActorRef](../actor/ActorRef.html "class in akka.actor")> listeners()
		```

## Code Examples

### Example 1: listenerManagement

```text
def receive = listenerManagement orElse …
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractFSM.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/LoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Listeners.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Listeners.html)*