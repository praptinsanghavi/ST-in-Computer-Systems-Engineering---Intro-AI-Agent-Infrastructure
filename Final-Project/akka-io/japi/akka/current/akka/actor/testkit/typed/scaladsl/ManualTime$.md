---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime$.html
title: ManualTime$
---

# ManualTime$

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class ManualTime$

- java.lang.Object
- - akka.actor.testkit.typed.scaladsl.ManualTime$

- ---

```
public class ManualTime$
extends java.lang.Object
```

Manual time allows you to do async tests while controlling the scheduler of the system.
 
 To use it you need to configure the `ActorSystem`/`ActorTestKit` with `ManualTime.config` and access the
 scheduler control through `ManualTime.apply`

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ManualTime$](ManualTime$.html "class in akka.actor.testkit.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ManualTime$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ManualTime](ManualTime.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Access the manual scheduler, note that you need to setup the actor system/testkit with `ManualTime.config`  for this to work. |
	| `com.typesafe.config.Config` | `[config](#config())()` | Config needed to use the `ExplicitlyTriggeredScheduler` |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ManualTime$](ManualTime$.html "class in akka.actor.testkit.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ManualTime$
		
		
		
		```
		public ManualTime$()
		```

	- ### Method Detail
	
	
	
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		
		Config needed to use the `ExplicitlyTriggeredScheduler`
		- #### apply
		
		
		
		```
		public [ManualTime](ManualTime.html "class in akka.actor.testkit.typed.scaladsl") apply​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Access the manual scheduler, note that you need to setup the actor system/testkit with `ManualTime.config`
		 for this to work.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime$.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ManualTime$.html)*