---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html
title: EventSourcedBehaviorTestKit$
---

# EventSourcedBehaviorTestKit$

## Content

Package [akka.persistence.testkit.javadsl](package-summary.html)
## Class EventSourcedBehaviorTestKit$

- java.lang.Object
- - akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit$

- ---

```
public class EventSourcedBehaviorTestKit$
extends java.lang.Object
```

Testing of [`EventSourcedBehavior`](../../typed/javadsl/EventSourcedBehavior.html "class in akka.persistence.typed.javadsl") implementations.
 It supports running one command at a time and you can assert that the synchronously returned result is as expected.
 The result contains the events emitted by the command and the new state after applying the events.
 It also has support for verifying the reply to a command.
 
 Serialization of commands, events and state are verified automatically.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedBehaviorTestKit$](EventSourcedBehaviorTestKit$.html "class in akka.persistence.testkit.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedBehaviorTestKit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[config](#config())()` | The configuration to be included in the configuration of the `ActorSystem`. |
	| `<Command,​Event,​State>[EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "class in akka.persistence.testkit.javadsl")<Command,​Event,​State>` | `[create](#create(akka.actor.typed.ActorSystem,akka.actor.typed.Behavior))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,  [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior)` | Factory method to create a new EventSourcedBehaviorTestKit. |
	| `<Command,​Event,​State>[EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "class in akka.persistence.testkit.javadsl")<Command,​Event,​State>` | `[create](#create(akka.actor.typed.ActorSystem,akka.actor.typed.Behavior,akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.SerializationSettings))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,  [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl") serializationSettings)` | Factory method to create a new EventSourcedBehaviorTestKit with custom `SerializationSettings`. |
	| `[EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl")` | `[disabledSerializationSettings](#disabledSerializationSettings())()` |  |
	| `[EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl")` | `[enabledSerializationSettings](#enabledSerializationSettings())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedBehaviorTestKit$](EventSourcedBehaviorTestKit$.html "class in akka.persistence.testkit.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSourcedBehaviorTestKit$
		
		
		
		```
		public EventSourcedBehaviorTestKit$()
		```

	- ### Method Detail
	
	
	
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		
		The configuration to be included in the configuration of the `ActorSystem`. Typically used as
		 constructor parameter to `TestKitJunitResource`. The configuration enables the in\-memory
		 journal and snapshot storage.
		- #### enabledSerializationSettings
		
		
		
		```
		public [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl") enabledSerializationSettings()
		```
		- #### disabledSerializationSettings
		
		
		
		```
		public [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl") disabledSerializationSettings()
		```
		- #### create
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "class in akka.persistence.testkit.javadsl")<Command,​Event,​State> create​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                                                                                                             [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior)
		```
		
		Factory method to create a new EventSourcedBehaviorTestKit.
		- #### create
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "class in akka.persistence.testkit.javadsl")<Command,​Event,​State> create​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                                                                                                             [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                                                                             [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.javadsl") serializationSettings)
		```
		
		Factory method to create a new EventSourcedBehaviorTestKit with custom `SerializationSettings`.
		 
		 Note that `equals` must be implemented in the commands, events and state if `verifyEquality` is enabled.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.SerializationSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehavior.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html)*