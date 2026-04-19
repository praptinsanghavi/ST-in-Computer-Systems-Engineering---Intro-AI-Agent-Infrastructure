---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html
title: ClusterClientReceptionist
---

# ClusterClientReceptionist

## Content

Package [akka.cluster.client](package-summary.html)
## Class ClusterClientReceptionist

- java.lang.Object
- - akka.cluster.client.ClusterClientReceptionist

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public final class ClusterClientReceptionist
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

Deprecated.
Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. Since 2\.6\.0\.

Extension that starts [`ClusterReceptionist`](ClusterReceptionist.html "class in akka.cluster.client") and accompanying [`DistributedPubSubMediator`](../pubsub/DistributedPubSubMediator.html "class in akka.cluster.pubsub")
 with settings defined in config section `akka.cluster.client.receptionist`.
 The [`DistributedPubSubMediator`](../pubsub/DistributedPubSubMediator.html "class in akka.cluster.pubsub") is started by the [`DistributedPubSub`](../pubsub/DistributedPubSub.html "class in akka.cluster.pubsub") extension.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterClientReceptionist](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Deprecated. |
	| `static [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Deprecated. |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` | Deprecated. |
	| `static [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. |
	| `static [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Deprecated. |
	| `static int` | `[hashCode](#hashCode())()` | Deprecated. |
	| `boolean` | `[isTerminated](#isTerminated())()` | Deprecated. Returns true if this member is not tagged with the role configured for the  receptionist. |
	| `static [ClusterClientReceptionist$](ClusterClientReceptionist$.html "class in akka.cluster.client")` | `[lookup](#lookup())()` | Deprecated. |
	| `void` | `[registerService](#registerService(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)` | Deprecated. Register an actor that should be reachable for the clients. |
	| `void` | `[registerSubscriber](#registerSubscriber(java.lang.String,akka.actor.ActorRef))​(java.lang.String topic,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)` | Deprecated. Register an actor that should be reachable for the clients to a named topic. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[underlying](#underlying())()` | Deprecated. Returns the underlying receptionist actor, particularly so that its  events can be observed via subscribe/unsubscribe. |
	| `void` | `[unregisterService](#unregisterService(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)` | Deprecated. A registered actor will be automatically unregistered when terminated,  but it can also be explicitly unregistered before termination. |
	| `void` | `[unregisterSubscriber](#unregisterSubscriber(java.lang.String,akka.actor.ActorRef))​(java.lang.String topic,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)` | Deprecated. A registered subscriber will be automatically unregistered when terminated,  but it can also be explicitly unregistered before termination. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterClientReceptionist
		
		
		
		```
		public ClusterClientReceptionist​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		- #### get
		
		
		
		```
		public static [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Deprecated.
		- #### lookup
		
		
		
		```
		public static [ClusterClientReceptionist$](ClusterClientReceptionist$.html "class in akka.cluster.client") lookup()
		```
		
		Deprecated.
		- #### createExtension
		
		
		
		```
		public static [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Deprecated.
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		
		Deprecated.
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		
		Deprecated.
		- #### isTerminated
		
		
		
		```
		public boolean isTerminated()
		```
		
		Deprecated.
		Returns true if this member is not tagged with the role configured for the
		 receptionist.
		- #### registerService
		
		
		
		```
		public void registerService​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)
		```
		
		Deprecated.
		Register an actor that should be reachable for the clients.
		 The clients can send messages to this actor with `Send` or `SendToAll` using
		 the path elements of the `ActorRef`, e.g. `"/user/myservice"`.
		- #### unregisterService
		
		
		
		```
		public void unregisterService​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)
		```
		
		Deprecated.
		A registered actor will be automatically unregistered when terminated,
		 but it can also be explicitly unregistered before termination.
		- #### registerSubscriber
		
		
		
		```
		public void registerSubscriber​(java.lang.String topic,
		                               [ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)
		```
		
		Deprecated.
		Register an actor that should be reachable for the clients to a named topic.
		 Several actors can be registered to the same topic name, and all will receive
		 published messages.
		 The client can publish messages to this topic with `Publish`.
		- #### unregisterSubscriber
		
		
		
		```
		public void unregisterSubscriber​(java.lang.String topic,
		                                 [ActorRef](../../actor/ActorRef.html "class in akka.actor") actor)
		```
		
		Deprecated.
		A registered subscriber will be automatically unregistered when terminated,
		 but it can also be explicitly unregistered before termination.
		- #### underlying
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") underlying()
		```
		
		Deprecated.
		Returns the underlying receptionist actor, particularly so that its
		 events can be observed via subscribe/unsubscribe.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html)*