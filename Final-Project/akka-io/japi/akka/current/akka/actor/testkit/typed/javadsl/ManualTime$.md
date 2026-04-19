---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:52:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/ManualTime$.html
title: ManualTime$
---

# ManualTime$

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class ManualTime$

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.ManualTime$

- ---

```
public class ManualTime$
extends java.lang.Object
```

Manual time allows you to do async tests while controlling the scheduler of the system.
 
 To use it you need to configure the `ActorSystem`/`ActorTestKit` with `ManualTime.config` and access the
 scheduler control through `ManualTime.get`

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ManualTime$](ManualTime$.html "class in akka.actor.testkit.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ManualTime$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[config](#config())()` | Config that needs to be in place for the actor system to use the manual |
	| `<A> [ManualTime](ManualTime.html "class in akka.actor.testkit.typed.javadsl")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<A> system)` | Access the manual scheduler, note that you need to setup the actor system/testkit with `ManualTime.config`  for this to work. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ManualTime$](ManualTime$.html "class in akka.actor.testkit.typed.javadsl") MODULE$
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
		
		Config that needs to be in place for the actor system to use the manual
		- #### get
		
		
		
		```
		public <A> [ManualTime](ManualTime.html "class in akka.actor.testkit.typed.javadsl") get​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<A> system)
		```
		
		Access the manual scheduler, note that you need to setup the actor system/testkit with `ManualTime.config`
		 for this to work.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/ManualTime$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/ManualTime.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/ManualTime$.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/javadsl/ManualTime$.html)*