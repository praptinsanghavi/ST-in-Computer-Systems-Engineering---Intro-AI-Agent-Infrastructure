---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem$.html
title: ActorSystem$
---

# ActorSystem$

## Content

Package [akka.actor.typed](package-summary.html)
## Class ActorSystem$

- java.lang.Object
- - akka.actor.typed.ActorSystem$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ActorSystem$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.ActorSystem$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorSystem$](ActorSystem$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSystem$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name)` | Scala API: Create an ActorSystem |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,akka.actor.BootstrapSetup))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  [BootstrapSetup](../BootstrapSetup.html "class in akka.actor") bootstrapSetup)` | Scala API: Shortcut for creating an actor system with custom bootstrap settings. |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,akka.actor.setup.ActorSystemSetup,akka.actor.typed.Props))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  [ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup") setup,  [Props](Props.html "class in akka.actor.typed") guardianProps)` | Scala API: Creates a new actor system with the specified name and settings  The core actor system settings are defined in `BootstrapSetup` |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  com.typesafe.config.Config config)` | Scala API: Create an ActorSystem |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config,akka.actor.typed.Props))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  com.typesafe.config.Config config,  [Props](Props.html "class in akka.actor.typed") guardianProps)` | Scala API: Create an ActorSystem |
	| `<T> [Props](Props.html "class in akka.actor.typed")` | `[apply$default$4](#apply$default$4())()` |  |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name)` | Java API: Create an ActorSystem |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String,akka.actor.BootstrapSetup))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  [BootstrapSetup](../BootstrapSetup.html "class in akka.actor") bootstrapSetup)` | Java API: Shortcut for creating an actor system with custom bootstrap settings. |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String,akka.actor.setup.ActorSystemSetup))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  [ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup") setups)` | Java API: Creates a new actor system with the specified name and settings  The core actor system settings are defined in `BootstrapSetup` |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  com.typesafe.config.Config config)` | Java API: Create an ActorSystem |
	| `<T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T>` | `[create](#create(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config,akka.actor.typed.Props))​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,  java.lang.String name,  com.typesafe.config.Config config,  [Props](Props.html "class in akka.actor.typed") guardianProps)` | Java API: Create an ActorSystem |
	| `[ActorSystem](ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$>` | `[wrap](#wrap(akka.actor.ActorSystem))​([ActorSystem](../ActorSystem.html "class in akka.actor") system)` | Wrap a classic [`ActorSystem`](../ActorSystem.html "class in akka.actor") such that it can be used from  Akka Typed [`Behavior`](Behavior.html "class in akka.actor.typed"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorSystem$](ActorSystem$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorSystem$
		
		
		
		```
		public ActorSystem$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                java.lang.String name)
		```
		
		Scala API: Create an ActorSystem
		- #### apply
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                java.lang.String name,
		                                com.typesafe.config.Config config)
		```
		
		Scala API: Create an ActorSystem
		- #### apply
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                java.lang.String name,
		                                com.typesafe.config.Config config,
		                                [Props](Props.html "class in akka.actor.typed") guardianProps)
		```
		
		Scala API: Create an ActorSystem
		- #### apply
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                java.lang.String name,
		                                [ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup") setup,
		                                [Props](Props.html "class in akka.actor.typed") guardianProps)
		```
		
		Scala API: Creates a new actor system with the specified name and settings
		 The core actor system settings are defined in `BootstrapSetup`
		- #### apply
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                java.lang.String name,
		                                [BootstrapSetup](../BootstrapSetup.html "class in akka.actor") bootstrapSetup)
		```
		
		Scala API: Shortcut for creating an actor system with custom bootstrap settings.
		 Same behavior as calling `ActorSystem(name, ActorSystemSetup(bootstrapSetup))`
		- #### apply$default$4
		
		
		
		```
		public <T> [Props](Props.html "class in akka.actor.typed") apply$default$4()
		```
		- #### create
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                 java.lang.String name)
		```
		
		Java API: Create an ActorSystem
		- #### create
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                 java.lang.String name,
		                                 com.typesafe.config.Config config)
		```
		
		Java API: Create an ActorSystem
		- #### create
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                 java.lang.String name,
		                                 com.typesafe.config.Config config,
		                                 [Props](Props.html "class in akka.actor.typed") guardianProps)
		```
		
		Java API: Create an ActorSystem
		- #### create
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                 java.lang.String name,
		                                 [ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup") setups)
		```
		
		Java API: Creates a new actor system with the specified name and settings
		 The core actor system settings are defined in `BootstrapSetup`
		- #### create
		
		
		
		```
		public <T> [ActorSystem](ActorSystem.html "class in akka.actor.typed")<T> create​([Behavior](Behavior.html "class in akka.actor.typed")<T> guardianBehavior,
		                                 java.lang.String name,
		                                 [BootstrapSetup](../BootstrapSetup.html "class in akka.actor") bootstrapSetup)
		```
		
		Java API: Shortcut for creating an actor system with custom bootstrap settings.
		 Same behavior as calling `ActorSystem.create(name, ActorSystemSetup.create(bootstrapSettings))`
		- #### wrap
		
		
		
		```
		public [ActorSystem](ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$> wrap​([ActorSystem](../ActorSystem.html "class in akka.actor") system)
		```
		
		Wrap a classic [`ActorSystem`](../ActorSystem.html "class in akka.actor") such that it can be used from
		 Akka Typed [`Behavior`](Behavior.html "class in akka.actor.typed").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/BootstrapSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem$.html)*