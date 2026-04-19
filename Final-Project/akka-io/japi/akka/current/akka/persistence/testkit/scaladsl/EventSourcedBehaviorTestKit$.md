---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
title: EventSourcedBehaviorTestKit$
---

# EventSourcedBehaviorTestKit$

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Class EventSourcedBehaviorTestKit$

- java.lang.Object
- - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit$

- ---

```
public class EventSourcedBehaviorTestKit$
extends java.lang.Object
```

Testing of [`EventSourcedBehavior`](../../typed/scaladsl/EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl") implementations.
 It supports running one command at a time and you can assert that the synchronously returned result is as expected.
 The result contains the events emitted by the command and the new state after applying the events.
 It also has support for verifying the reply to a command.
 
 Serialization of commands, events and state are verified automatically.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedBehaviorTestKit$](EventSourcedBehaviorTestKit$.html "class in akka.persistence.testkit.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedBehaviorTestKit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Command,​Event,​State>[EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "interface in akka.persistence.testkit.scaladsl")<Command,​Event,​State>` | `[apply](#apply(akka.actor.typed.ActorSystem,akka.actor.typed.Behavior))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,  [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior)` | Factory method to create a new EventSourcedBehaviorTestKit. |
	| `<Command,​Event,​State>[EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "interface in akka.persistence.testkit.scaladsl")<Command,​Event,​State>` | `[apply](#apply(akka.actor.typed.ActorSystem,akka.actor.typed.Behavior,akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.SerializationSettings))​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,  [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,  [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.scaladsl") serializationSettings)` | Factory method to create a new EventSourcedBehaviorTestKit with custom `SerializationSettings`. |
	| `com.typesafe.config.Config` | `[config](#config())()` | The configuration to be included in the configuration of the `ActorSystem`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedBehaviorTestKit$](EventSourcedBehaviorTestKit$.html "class in akka.persistence.testkit.scaladsl") MODULE$
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
		 constructor parameter to `ScalaTestWithActorTestKit`. The configuration enables the in\-memory
		 journal and snapshot storage.
		- #### apply
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "interface in akka.persistence.testkit.scaladsl")<Command,​Event,​State> apply​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                                                                                                            [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior)
		```
		
		Factory method to create a new EventSourcedBehaviorTestKit.
		- #### apply
		
		
		
		```
		public <Command,​Event,​State> [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "interface in akka.persistence.testkit.scaladsl")<Command,​Event,​State> apply​([ActorSystem](../../../actor/typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                                                                                                            [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<Command> behavior,
		                                                                                                            [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.scaladsl") serializationSettings)
		```
		
		Factory method to create a new EventSourcedBehaviorTestKit with custom `SerializationSettings`.
		 
		 Note that `equals` must be implemented (or using `case class`) in the commands, events and state if
		 `verifyEquality` is enabled.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.SerializationSettings.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html)*