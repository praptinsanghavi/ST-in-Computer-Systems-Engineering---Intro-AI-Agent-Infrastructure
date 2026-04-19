---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:57:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html
title: Topic$
---

# Topic$

## Content

Package [akka.actor.typed.pubsub](package-summary.html)
## Class Topic$

- java.lang.Object
- - akka.actor.typed.pubsub.Topic$

- ---

```
public class Topic$
extends java.lang.Object
```

A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.
 
 It is mostly useful in a clustered setting, where it is intended to be started once on every node that want to
 house subscribers or publish messages to the topic, but it also works in a local setting without cluster.
 

 In a clustered context messages are deduplicated so that there is at most one message sent to each node for
 each publish and if there are no subscribers on a node, no message is sent to it. Note that the list of subscribers
 is eventually consistent and there are no delivery guarantees built in.
 

 Each topic results in a [`ServiceKey`](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist") in the [`Receptionist`](../receptionist/Receptionist.html "class in akka.actor.typed.receptionist")
 so the same scaling recommendation holds for topics, see docs:
 https://doc.akka.io/libraries/akka\-core/current/typed/actor\-discovery.html\#receptionist\-scalability

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Topic$](Topic$.html "class in akka.actor.typed.pubsub")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Topic$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>>` | `[apply](#apply(java.lang.String,scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag))​(java.lang.String topicName,  scala.concurrent.duration.FiniteDuration ttl,  scala.reflect.ClassTag<T> classTag)` | Scala API: Create a topic actor behavior for the given topic name and message type with a TTL  making it terminate itself after a time period with no local subscribers and no locally published messages. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>>` | `[apply](#apply(java.lang.String,scala.reflect.ClassTag))​(java.lang.String topicName,  scala.reflect.ClassTag<T> classTag)` | Scala API: Create a topic actor behavior for the given topic name and message type. |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>>` | `[create](#create(java.lang.Class,java.lang.String))​(java.lang.Class<T> messageClass,  java.lang.String topicName)` | Java API: Create a topic actor behavior for the given topic name and message class |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>>` | `[create](#create(java.lang.Class,java.lang.String,java.time.Duration))​(java.lang.Class<T> messageClass,  java.lang.String topicName,  java.time.Duration ttl)` | Java API: Create a topic actor behavior for the given topic name and message class with a TTL  making it terminate itself after a time period with no local subscribers and no locally published messages. |
	| `<T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>` | `[getTopicStats](#getTopicStats(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.TopicStats](Topic.TopicStats.html "interface in akka.actor.typed.pubsub")> replyTo)` | Java API: Get a summary of the state for a local topic actor. |
	| `<T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>` | `[publish](#publish(T))​(T message)` | Java API: Publish the message to all currently known subscribers. |
	| `<T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>` | `[subscribe](#subscribe(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> subscriber)` | Java API: Subscribe to this topic. |
	| `<T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>` | `[unsubscribe](#unsubscribe(akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> subscriber)` | Java API: Unsubscribe a previously subscribed actor from this topic. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Topic$](Topic$.html "class in akka.actor.typed.pubsub") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Topic$
		
		
		
		```
		public Topic$()
		```

	- ### Method Detail
	
	
	
		- #### publish
		
		
		
		```
		public <T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T> publish​(T message)
		```
		
		Java API: Publish the message to all currently known subscribers.
		- #### subscribe
		
		
		
		```
		public <T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T> subscribe​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> subscriber)
		```
		
		Java API: Subscribe to this topic. Should only be used for local subscribers.
		- #### getTopicStats
		
		
		
		```
		public <T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T> getTopicStats​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.TopicStats](Topic.TopicStats.html "interface in akka.actor.typed.pubsub")> replyTo)
		```
		
		Java API: Get a summary of the state for a local topic actor.
		 
		 See `TopicStats` for caveats
		- #### unsubscribe
		
		
		
		```
		public <T> [Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T> unsubscribe​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> subscriber)
		```
		
		Java API: Unsubscribe a previously subscribed actor from this topic.
		- #### apply
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> apply​(java.lang.String topicName,
		                                            scala.reflect.ClassTag<T> classTag)
		```
		
		Scala API: Create a topic actor behavior for the given topic name and message type.
		 
		 Note: for many use cases it is more convenient to use the [`PubSub`](PubSub.html "class in akka.actor.typed.pubsub") registry to have an ActorSystem global
		 set of re\-usable topics instead of manually creating and managing the topic actors.
		- #### apply
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> apply​(java.lang.String topicName,
		                                            scala.concurrent.duration.FiniteDuration ttl,
		                                            scala.reflect.ClassTag<T> classTag)
		```
		
		Scala API: Create a topic actor behavior for the given topic name and message type with a TTL
		 making it terminate itself after a time period with no local subscribers and no locally published messages.
		 
		 Note: for many use cases it is more convenient to use the [`PubSub`](PubSub.html "class in akka.actor.typed.pubsub") registry to have an ActorSystem global
		 set of re\-usable topics instead of manually creating and managing the topic actors.
		- #### create
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> create​(java.lang.Class<T> messageClass,
		                                             java.lang.String topicName)
		```
		
		Java API: Create a topic actor behavior for the given topic name and message class
		 
		 Note: for many use cases it is more convenient to use the [`PubSub`](PubSub.html "class in akka.actor.typed.pubsub") registry to have an ActorSystem global
		 set of re\-usable topics instead of manually creating and managing the topic actors.
		- #### create
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> create​(java.lang.Class<T> messageClass,
		                                             java.lang.String topicName,
		                                             java.time.Duration ttl)
		```
		
		Java API: Create a topic actor behavior for the given topic name and message class with a TTL
		 making it terminate itself after a time period with no local subscribers and no locally published messages.
		 
		 Note: for many use cases it is more convenient to use the [`PubSub`](PubSub.html "class in akka.actor.typed.pubsub") registry to have an ActorSystem global
		 set of re\-usable topics instead of manually creating and managing the topic actors.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.TopicStats.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html)*