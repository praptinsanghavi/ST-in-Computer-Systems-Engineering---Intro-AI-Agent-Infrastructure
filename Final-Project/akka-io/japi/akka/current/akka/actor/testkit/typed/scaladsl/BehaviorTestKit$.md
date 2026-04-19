---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html
title: BehaviorTestKit$
---

# BehaviorTestKit$

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class BehaviorTestKit$

- java.lang.Object
- - akka.actor.testkit.typed.scaladsl.BehaviorTestKit$

- ---

```
public class BehaviorTestKit$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BehaviorTestKit$](BehaviorTestKit$.html "class in akka.actor.testkit.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BehaviorTestKit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[ApplicationTestConfig](#ApplicationTestConfig())()` |  |
	| `<T> [BehaviorTestKit](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<T>` | `[apply](#apply(akka.actor.typed.Behavior))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior)` |  |
	| `<T> [BehaviorTestKit](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior,  java.lang.String name)` |  |
	| `<T> [BehaviorTestKit](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,com.typesafe.config.Config))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior,  java.lang.String name,  com.typesafe.config.Config config)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BehaviorTestKit$](BehaviorTestKit$.html "class in akka.actor.testkit.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BehaviorTestKit$
		
		
		
		```
		public BehaviorTestKit$()
		```

	- ### Method Detail
	
	
	
		- #### ApplicationTestConfig
		
		
		
		```
		public com.typesafe.config.Config ApplicationTestConfig()
		```
		- #### apply
		
		
		
		```
		public <T> [BehaviorTestKit](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<T> apply​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior,
		                                    java.lang.String name,
		                                    com.typesafe.config.Config config)
		```
		- #### apply
		
		
		
		```
		public <T> [BehaviorTestKit](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<T> apply​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior,
		                                    java.lang.String name)
		```
		- #### apply
		
		
		
		```
		public <T> [BehaviorTestKit](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")<T> apply​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> initialBehavior)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html)*