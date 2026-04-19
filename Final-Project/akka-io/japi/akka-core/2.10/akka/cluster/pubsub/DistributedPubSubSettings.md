---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubSettings.html
title: DistributedPubSubSettings
---

# DistributedPubSubSettings

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Class DistributedPubSubSettings

- java.lang.Object
- - akka.cluster.pubsub.DistributedPubSubSettings

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

---

```
public final class DistributedPubSubSettings
extends java.lang.Object
implements [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

param: role Start the mediator on members tagged with this role.
 All members are used if undefined.
 param: routingLogic The routing logic to use for `Send`.
 param: gossipInterval How often the DistributedPubSubMediator should send out gossip information
 param: removedTimeToLive Removed entries are pruned after this duration
 param: maxDeltaElements Maximum number of elements to transfer in one message when synchronizing
 the registries. Next chunk will be transferred in next round of gossip.
 param: sendToDeadLettersWhenNoSubscribers When a message is published to a topic with no subscribers send it to the dead letters.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DistributedPubSubSettings](#%3Cinit%3E(scala.Option,akka.routing.RoutingLogic,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int))​(scala.Option<java.lang.String> role,  [RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration removedTimeToLive,  int maxDeltaElements)` | Deprecated. Use the other constructor instead. |
	| `[DistributedPubSubSettings](#%3Cinit%3E(scala.Option,akka.routing.RoutingLogic,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,int,boolean))​(scala.Option<java.lang.String> role,  [RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic,  scala.concurrent.duration.FiniteDuration gossipInterval,  scala.concurrent.duration.FiniteDuration removedTimeToLive,  int maxDeltaElements,  boolean sendToDeadLettersWhenNoSubscribers)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create settings from the default configuration  `akka.cluster.pub-sub`. |
	| `static [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Create settings from a configuration with the same layout as  the default configuration `akka.cluster.pub-sub`. |
	| `static [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Java API: Create settings from the default configuration  `akka.cluster.pub-sub`. |
	| `static [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Java API: Create settings from a configuration with the same layout as  the default configuration `akka.cluster.pub-sub`. |
	| `scala.concurrent.duration.FiniteDuration` | `[gossipInterval](#gossipInterval())()` |  |
	| `int` | `[maxDeltaElements](#maxDeltaElements())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[removedTimeToLive](#removedTimeToLive())()` |  |
	| `scala.Option<java.lang.String>` | `[role](#role())()` |  |
	| `[RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing")` | `[routingLogic](#routingLogic())()` |  |
	| `boolean` | `[sendToDeadLettersWhenNoSubscribers](#sendToDeadLettersWhenNoSubscribers())()` |  |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[withGossipInterval](#withGossipInterval(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration gossipInterval)` |  |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[withMaxDeltaElements](#withMaxDeltaElements(int))​(int maxDeltaElements)` |  |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[withRemovedTimeToLive](#withRemovedTimeToLive(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration removedTimeToLive)` |  |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[withRole](#withRole(java.lang.String))​(java.lang.String role)` |  |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[withRole](#withRole(scala.Option))​(scala.Option<java.lang.String> role)` |  |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[withRoutingLogic](#withRoutingLogic(akka.routing.RoutingLogic))​([RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic)` |  |
	| `[DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub")` | `[withSendToDeadLettersWhenNoSubscribers](#withSendToDeadLettersWhenNoSubscribers(boolean))​(boolean sendToDeadLetterWhenNoSubscribers)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DistributedPubSubSettings
		
		
		
		```
		public DistributedPubSubSettings​(scala.Option<java.lang.String> role,
		                                 [RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic,
		                                 scala.concurrent.duration.FiniteDuration gossipInterval,
		                                 scala.concurrent.duration.FiniteDuration removedTimeToLive,
		                                 int maxDeltaElements,
		                                 boolean sendToDeadLettersWhenNoSubscribers)
		```
		- #### DistributedPubSubSettings
		
		
		
		```
		public DistributedPubSubSettings​(scala.Option<java.lang.String> role,
		                                 [RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic,
		                                 scala.concurrent.duration.FiniteDuration gossipInterval,
		                                 scala.concurrent.duration.FiniteDuration removedTimeToLive,
		                                 int maxDeltaElements)
		```
		
		Deprecated.
		Use the other constructor instead. Since 2\.5\.5\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Create settings from the default configuration
		 `akka.cluster.pub-sub`.
		- #### apply
		
		
		
		```
		public static [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") apply​(com.typesafe.config.Config config)
		```
		
		Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.pub-sub`.
		- #### create
		
		
		
		```
		public static [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") create​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Java API: Create settings from the default configuration
		 `akka.cluster.pub-sub`.
		- #### create
		
		
		
		```
		public static [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") create​(com.typesafe.config.Config config)
		```
		
		Java API: Create settings from a configuration with the same layout as
		 the default configuration `akka.cluster.pub-sub`.
		- #### role
		
		
		
		```
		public scala.Option<java.lang.String> role()
		```
		- #### routingLogic
		
		
		
		```
		public [RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic()
		```
		- #### gossipInterval
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration gossipInterval()
		```
		- #### removedTimeToLive
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration removedTimeToLive()
		```
		- #### maxDeltaElements
		
		
		
		```
		public int maxDeltaElements()
		```
		- #### sendToDeadLettersWhenNoSubscribers
		
		
		
		```
		public boolean sendToDeadLettersWhenNoSubscribers()
		```
		- #### withRole
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") withRole​(java.lang.String role)
		```
		- #### withRole
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") withRole​(scala.Option<java.lang.String> role)
		```
		- #### withRoutingLogic
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") withRoutingLogic​([RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic)
		```
		- #### withGossipInterval
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") withGossipInterval​(scala.concurrent.duration.FiniteDuration gossipInterval)
		```
		- #### withRemovedTimeToLive
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") withRemovedTimeToLive​(scala.concurrent.duration.FiniteDuration removedTimeToLive)
		```
		- #### withMaxDeltaElements
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") withMaxDeltaElements​(int maxDeltaElements)
		```
		- #### withSendToDeadLettersWhenNoSubscribers
		
		
		
		```
		public [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") withSendToDeadLettersWhenNoSubscribers​(boolean sendToDeadLetterWhenNoSubscribers)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubSettings.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubSettings.html)*