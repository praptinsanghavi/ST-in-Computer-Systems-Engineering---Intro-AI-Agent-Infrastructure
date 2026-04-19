---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub.html
title: PubSub
---

# PubSub

## Content

Package [akka.actor.typed.pubsub](package-summary.html)
## Class PubSub

- java.lang.Object
- - akka.actor.typed.pubsub.PubSub

- All Implemented Interfaces:
`[Extension](../Extension.html "interface in akka.actor.typed")`

---

```
public final class PubSub
extends java.lang.Object
implements [Extension](../Extension.html "interface in akka.actor.typed")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PubSub](#%3Cinit%3E(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `static [PubSub](PubSub.html "class in akka.actor.typed.pubsub")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[currentTopics](#currentTopics())()` | Scala API: return the current set of running topics |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [PubSub](PubSub.html "class in akka.actor.typed.pubsub")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	| `java.util.Set<java.lang.String>` | `[getCurrentTopics](#getCurrentTopics())()` | Java API: return the current set of running topics |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T>` | `[id](#id())()` |  |
	| `<T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>>` | `[topic](#topic(java.lang.Class,java.lang.String))​(java.lang.Class<T> messageClass,  java.lang.String name)` | Java API: Spawn an actor with the given topic name or share an existing one if it is already running. |
	| `<T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>>` | `[topic](#topic(java.lang.Class,java.lang.String,java.time.Duration))​(java.lang.Class<T> messageClass,  java.lang.String name,  java.time.Duration ttl)` | Scala API: Spawn an actor with the given topic name or share an existing one if it is already running. |
	| `<T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>>` | `[topic](#topic(java.lang.String,scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag))​(java.lang.String name,  scala.concurrent.duration.FiniteDuration ttl,  scala.reflect.ClassTag<T> classTag)` | Scala API: Spawn an actor with the given topic name or share an existing one if it is already running. |
	| `<T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>>` | `[topic](#topic(java.lang.String,scala.reflect.ClassTag))​(java.lang.String name,  scala.reflect.ClassTag<T> classTag)` | Scala API: Spawn an actor with the given topic name or share an existing one if it is already running. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PubSub
		
		
		
		```
		public PubSub​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```

	- ### Method Detail
	
	
	
		- #### createExtension
		
		
		
		```
		public static [PubSub](PubSub.html "class in akka.actor.typed.pubsub") createExtension​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### get
		
		
		
		```
		public static [PubSub](PubSub.html "class in akka.actor.typed.pubsub") get​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### apply
		
		
		
		```
		public static final T apply​([ActorSystem](../ActorSystem.html "class in akka.actor.typed")<?> system)
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
		public static [ExtensionId](../ExtensionId.html "class in akka.actor.typed")<T> id()
		```
		- #### topic
		
		
		
		```
		public <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> topic​(java.lang.String name,
		                                            scala.reflect.ClassTag<T> classTag)
		```
		
		Scala API: Spawn an actor with the given topic name or share an existing one if it is already running.
		 
		 Note that [`Topic`](Topic.html "class in akka.actor.typed.pubsub") actors manually started will not be part of this registry.
		- #### topic
		
		
		
		```
		public <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> topic​(java.lang.String name,
		                                            scala.concurrent.duration.FiniteDuration ttl,
		                                            scala.reflect.ClassTag<T> classTag)
		```
		
		Scala API: Spawn an actor with the given topic name or share an existing one if it is already running.
		 
		 Note that [`Topic`](Topic.html "class in akka.actor.typed.pubsub") actors manually started will not be part of this registry.
		 
		
		
		
		Parameters:
		`ttl` \- If the topic is idle this long, shut the actor down. All calls to `topic` for the same topic name should
		 use the same ttl.
		- #### topic
		
		
		
		```
		public <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> topic​(java.lang.Class<T> messageClass,
		                                            java.lang.String name)
		```
		
		Java API: Spawn an actor with the given topic name or share an existing one if it is already running.
		 
		 Note that [`Topic`](Topic.html "class in akka.actor.typed.pubsub") actors manually started will not be part of this registry.
		 
		
		
		
		Parameters:
		`messageClass` \- the type of messages the topic accepts for publishing and subscribing
		- #### topic
		
		
		
		```
		public <T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Topic.Command](Topic.Command.html "interface in akka.actor.typed.pubsub")<T>> topic​(java.lang.Class<T> messageClass,
		                                            java.lang.String name,
		                                            java.time.Duration ttl)
		```
		
		Scala API: Spawn an actor with the given topic name or share an existing one if it is already running.
		 
		 Note that [`Topic`](Topic.html "class in akka.actor.typed.pubsub") actors manually started will not be part of this registry.
		 
		
		
		
		Parameters:
		`ttl` \- If the topic is idle this long, shut the actor down. All calls to `topic` for the same topic name should
		 use the same ttl.
		- #### currentTopics
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> currentTopics()
		```
		
		Scala API: return the current set of running topics
		- #### getCurrentTopics
		
		
		
		```
		public java.util.Set<java.lang.String> getCurrentTopics()
		```
		
		Java API: return the current set of running topics

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/Topic.Command.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/Topic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/pubsub/PubSub.html)*