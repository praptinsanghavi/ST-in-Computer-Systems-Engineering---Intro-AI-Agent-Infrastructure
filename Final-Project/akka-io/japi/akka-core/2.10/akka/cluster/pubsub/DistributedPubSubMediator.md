---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.html
title: DistributedPubSubMediator.Internal$
---

# DistributedPubSubMediator.Internal$

## Content

Package [akka.cluster.pubsub](package-summary.html)
## Class DistributedPubSubMediator.Internal$

- java.lang.Object
- - akka.cluster.pubsub.DistributedPubSubMediator.Internal$

- Enclosing class:
[DistributedPubSubMediator](DistributedPubSubMediator.html "class in akka.cluster.pubsub")

---

```
public static class DistributedPubSubMediator.Internal$
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[DistributedPubSubMediator.Internal$.Bucket](DistributedPubSubMediator.Internal$.Bucket.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Bucket$](DistributedPubSubMediator.Internal$.Bucket$.html "class in akka.cluster.pubsub")` |  |
	| `static interface` | `[DistributedPubSubMediator.Internal$.ChildActorTerminationProtocol](DistributedPubSubMediator.Internal$.ChildActorTerminationProtocol.html "interface in akka.cluster.pubsub")` | Messages used to encode protocol to make sure that we do not send Subscribe/Unsubscribe message to  child (mediator \-\> topic, topic \-\> group) during a period of transition. |
	| `class` | `[DistributedPubSubMediator.Internal$.Delta](DistributedPubSubMediator.Internal$.Delta.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Delta$](DistributedPubSubMediator.Internal$.Delta$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.DeltaCount](DistributedPubSubMediator.Internal$.DeltaCount.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.DeltaCount$](DistributedPubSubMediator.Internal$.DeltaCount$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.GossipTick](DistributedPubSubMediator.Internal$.GossipTick.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.GossipTick$](DistributedPubSubMediator.Internal$.GossipTick$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Group](DistributedPubSubMediator.Internal$.Group.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.MediatorRouterEnvelope](DistributedPubSubMediator.Internal$.MediatorRouterEnvelope.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.MediatorRouterEnvelope$](DistributedPubSubMediator.Internal$.MediatorRouterEnvelope$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.NewSubscriberArrived](DistributedPubSubMediator.Internal$.NewSubscriberArrived.html "class in akka.cluster.pubsub")` | Sent from child to parent actor as response to [`DistributedPubSubMediator.Internal$.TerminateRequest`](DistributedPubSubMediator.Internal$.TerminateRequest.html "class in akka.cluster.pubsub") in case [`DistributedPubSubMediator.Subscribe`](DistributedPubSubMediator.Subscribe.html "class in akka.cluster.pubsub") message arrived  after sending [`DistributedPubSubMediator.Internal$.NoMoreSubscribers`](DistributedPubSubMediator.Internal$.NoMoreSubscribers.html "class in akka.cluster.pubsub") but before receiving [`DistributedPubSubMediator.Internal$.TerminateRequest`](DistributedPubSubMediator.Internal$.TerminateRequest.html "class in akka.cluster.pubsub"). |
	| `class` | `[DistributedPubSubMediator.Internal$.NewSubscriberArrived$](DistributedPubSubMediator.Internal$.NewSubscriberArrived$.html "class in akka.cluster.pubsub")` | Sent from child to parent actor as response to [`DistributedPubSubMediator.Internal$.TerminateRequest`](DistributedPubSubMediator.Internal$.TerminateRequest.html "class in akka.cluster.pubsub") in case [`DistributedPubSubMediator.Subscribe`](DistributedPubSubMediator.Subscribe.html "class in akka.cluster.pubsub") message arrived  after sending [`DistributedPubSubMediator.Internal$.NoMoreSubscribers`](DistributedPubSubMediator.Internal$.NoMoreSubscribers.html "class in akka.cluster.pubsub") but before receiving [`DistributedPubSubMediator.Internal$.TerminateRequest`](DistributedPubSubMediator.Internal$.TerminateRequest.html "class in akka.cluster.pubsub"). |
	| `class` | `[DistributedPubSubMediator.Internal$.NoMoreSubscribers](DistributedPubSubMediator.Internal$.NoMoreSubscribers.html "class in akka.cluster.pubsub")` | Passivate\-like message sent from child to parent, used to signal that sender has no subscribers and no child actors. |
	| `class` | `[DistributedPubSubMediator.Internal$.NoMoreSubscribers$](DistributedPubSubMediator.Internal$.NoMoreSubscribers$.html "class in akka.cluster.pubsub")` | Passivate\-like message sent from child to parent, used to signal that sender has no subscribers and no child actors. |
	| `class` | `[DistributedPubSubMediator.Internal$.Prune](DistributedPubSubMediator.Internal$.Prune.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Prune$](DistributedPubSubMediator.Internal$.Prune$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.RegisterTopic](DistributedPubSubMediator.Internal$.RegisterTopic.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.RegisterTopic$](DistributedPubSubMediator.Internal$.RegisterTopic$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.SendToOneSubscriber](DistributedPubSubMediator.Internal$.SendToOneSubscriber.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.SendToOneSubscriber$](DistributedPubSubMediator.Internal$.SendToOneSubscriber$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Status](DistributedPubSubMediator.Internal$.Status.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Status$](DistributedPubSubMediator.Internal$.Status$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Subscribed](DistributedPubSubMediator.Internal$.Subscribed.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Subscribed$](DistributedPubSubMediator.Internal$.Subscribed$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.TerminateRequest](DistributedPubSubMediator.Internal$.TerminateRequest.html "class in akka.cluster.pubsub")` | Sent from parent to child actor to signalize that messages are being buffered. |
	| `class` | `[DistributedPubSubMediator.Internal$.TerminateRequest$](DistributedPubSubMediator.Internal$.TerminateRequest$.html "class in akka.cluster.pubsub")` | Sent from parent to child actor to signalize that messages are being buffered. |
	| `class` | `[DistributedPubSubMediator.Internal$.Topic](DistributedPubSubMediator.Internal$.Topic.html "class in akka.cluster.pubsub")` |  |
	| `static interface` | `[DistributedPubSubMediator.Internal$.TopicLike](DistributedPubSubMediator.Internal$.TopicLike.html "interface in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Unsubscribed](DistributedPubSubMediator.Internal$.Unsubscribed.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.Unsubscribed$](DistributedPubSubMediator.Internal$.Unsubscribed$.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.ValueHolder](DistributedPubSubMediator.Internal$.ValueHolder.html "class in akka.cluster.pubsub")` |  |
	| `class` | `[DistributedPubSubMediator.Internal$.ValueHolder$](DistributedPubSubMediator.Internal$.ValueHolder$.html "class in akka.cluster.pubsub")` |  |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DistributedPubSubMediator.Internal$](DistributedPubSubMediator.Internal$.html "class in akka.cluster.pubsub")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Internal$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[encName](#encName(java.lang.String))​(java.lang.String s)` |  |
	| `java.lang.String` | `[mkKey](#mkKey(akka.actor.ActorPath))​([ActorPath](../../actor/ActorPath.html "interface in akka.actor") path)` |  |
	| `java.lang.String` | `[mkKey](#mkKey(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `scala.Function1<java.lang.Object,​java.lang.Object>` | `[wrapIfNeeded](#wrapIfNeeded())()` | Mediator uses [`Router`](../../routing/Router.html "class in akka.routing") to send messages to multiple destinations, Router in general  unwraps messages from [`RouterEnvelope`](../../routing/RouterEnvelope.html "interface in akka.routing") and sends the contents to [`Routee`](../../routing/Routee.html "interface in akka.routing")s. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DistributedPubSubMediator.Internal$](DistributedPubSubMediator.Internal$.html "class in akka.cluster.pubsub") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Internal$
		
		
		
		```
		public Internal$()
		```

	- ### Method Detail
	
	
	
		- #### encName
		
		
		
		```
		public java.lang.String encName​(java.lang.String s)
		```
		- #### mkKey
		
		
		
		```
		public java.lang.String mkKey​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		- #### mkKey
		
		
		
		```
		public java.lang.String mkKey​([ActorPath](../../actor/ActorPath.html "interface in akka.actor") path)
		```
		- #### wrapIfNeeded
		
		
		
		```
		public scala.Function1<java.lang.Object,​java.lang.Object> wrapIfNeeded()
		```
		
		Mediator uses [`Router`](../../routing/Router.html "class in akka.routing") to send messages to multiple destinations, Router in general
		 unwraps messages from [`RouterEnvelope`](../../routing/RouterEnvelope.html "interface in akka.routing") and sends the contents to [`Routee`](../../routing/Routee.html "interface in akka.routing")s.
		 
		 Using mediator services should not have an undesired effect of unwrapping messages
		 out of [`RouterEnvelope`](../../routing/RouterEnvelope.html "interface in akka.routing"). For this reason user messages are wrapped in
		 [`DistributedPubSubMediator.Internal$.MediatorRouterEnvelope`](DistributedPubSubMediator.Internal$.MediatorRouterEnvelope.html "class in akka.cluster.pubsub") which will be unwrapped by the [`Router`](../../routing/Router.html "class in akka.routing") leaving original
		 user message.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Bucket$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Bucket.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ChildActorTerminationProtocol.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Delta$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Delta.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.DeltaCount$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.DeltaCount.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.GossipTick$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.GossipTick.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Group.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.MediatorRouterEnvelope$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.MediatorRouterEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.NewSubscriberArrived$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.NewSubscriberArrived.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.NoMoreSubscribers$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.NoMoreSubscribers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Prune$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Prune.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.RegisterTopic$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.RegisterTopic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.SendToOneSubscriber$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.SendToOneSubscriber.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Status$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Status.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Subscribed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Subscribed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TerminateRequest$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TerminateRequest.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Topic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TopicLike.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Unsubscribed$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.Unsubscribed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ValueHolder$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ValueHolder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Subscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterEnvelope.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.html)*