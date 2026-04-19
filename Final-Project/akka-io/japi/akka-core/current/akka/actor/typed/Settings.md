---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:50:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Settings.html
title: Settings
---

# Settings

## Content

Package [akka.actor.typed](package-summary.html)
## Class Settings

- java.lang.Object
- - akka.actor.typed.Settings

- ---

```
public final class Settings
extends java.lang.Object
```

The configuration settings that were parsed from the config by an [`ActorSystem`](ActorSystem.html "class in akka.actor.typed").
 This class is immutable.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings](#%3Cinit%3E(akka.actor.ActorSystem.Settings))​([ActorSystem.Settings](../ActorSystem.Settings.html "class in akka.actor") settings)` |  |
	| `[Settings](#%3Cinit%3E(com.typesafe.config.Config,akka.actor.ActorSystem.Settings,java.lang.String))​(com.typesafe.config.Config config,  [ActorSystem.Settings](../ActorSystem.Settings.html "class in akka.actor") classicSettings,  java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorSystem.Settings](../ActorSystem.Settings.html "class in akka.actor")` | `[classicSettings](#classicSettings())()` |  |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `boolean` | `[PubSubDeadLettersWhenNoSubscribers](#PubSubDeadLettersWhenNoSubscribers())()` |  |
	| `int` | `[RestartStashCapacity](#RestartStashCapacity())()` |  |
	| `[ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup")` | `[setup](#setup())()` |  |
	| `java.lang.String` | `[toString](#toString())()` | Returns the String representation of the Config that this Settings is backed by |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Settings
		
		
		
		```
		public Settings​(com.typesafe.config.Config config,
		                [ActorSystem.Settings](../ActorSystem.Settings.html "class in akka.actor") classicSettings,
		                java.lang.String name)
		```
		- #### Settings
		
		
		
		```
		public Settings​([ActorSystem.Settings](../ActorSystem.Settings.html "class in akka.actor") settings)
		```

	- ### Method Detail
	
	
	
		- #### PubSubDeadLettersWhenNoSubscribers
		
		
		
		```
		public boolean PubSubDeadLettersWhenNoSubscribers()
		```
		- #### RestartStashCapacity
		
		
		
		```
		public int RestartStashCapacity()
		```
		- #### classicSettings
		
		
		
		```
		public [ActorSystem.Settings](../ActorSystem.Settings.html "class in akka.actor") classicSettings()
		```
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### setup
		
		
		
		```
		public [ActorSystemSetup](../setup/ActorSystemSetup.html "class in akka.actor.setup") setup()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		Returns the String representation of the Config that this Settings is backed by
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorSystem.Settings.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Settings.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Settings.html)*