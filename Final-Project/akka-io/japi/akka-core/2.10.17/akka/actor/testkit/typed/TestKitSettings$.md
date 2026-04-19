---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings$.html
title: TestKitSettings$
---

# TestKitSettings$

## Content

Package [akka.actor.testkit.typed](package-summary.html)
## Class TestKitSettings$

- java.lang.Object
- - akka.actor.testkit.typed.TestKitSettings$

- ---

```
public class TestKitSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestKitSettings$](TestKitSettings$.html "class in akka.actor.testkit.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKitSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Reads configuration settings from `akka.actor.testkit.typed` section. |
	| `[TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Reads configuration settings from given `Config` that  must have the same layout as the `akka.actor.testkit.typed` section. |
	| `[TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Java API: Reads configuration settings from `akka.actor.testkit.typed` section. |
	| `[TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Reads configuration settings from given `Config` that  must have the same layout as the `akka.actor.testkit.typed` section. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestKitSettings$](TestKitSettings$.html "class in akka.actor.testkit.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestKitSettings$
		
		
		
		```
		public TestKitSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed") apply​([ActorSystem](../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Reads configuration settings from `akka.actor.testkit.typed` section.
		- #### apply
		
		
		
		```
		public [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed") apply​(com.typesafe.config.Config config)
		```
		
		Reads configuration settings from given `Config` that
		 must have the same layout as the `akka.actor.testkit.typed` section.
		- #### create
		
		
		
		```
		public [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed") create​([ActorSystem](../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Java API: Reads configuration settings from `akka.actor.testkit.typed` section.
		- #### create
		
		
		
		```
		public [TestKitSettings](TestKitSettings.html "class in akka.actor.testkit.typed") create​(com.typesafe.config.Config config)
		```
		
		Reads configuration settings from given `Config` that
		 must have the same layout as the `akka.actor.testkit.typed` section.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/TestKitSettings$.html)*