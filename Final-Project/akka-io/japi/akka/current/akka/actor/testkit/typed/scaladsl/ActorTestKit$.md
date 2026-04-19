---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html
title: ActorTestKit$
---

# ActorTestKit$

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class ActorTestKit$

- java.lang.Object
- - akka.actor.testkit.typed.scaladsl.ActorTestKit$

- ---

```
public class ActorTestKit$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorTestKit$](ActorTestKit$.html "class in akka.actor.testkit.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorTestKit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[ApplicationTestConfig](#ApplicationTestConfig())()` | Config loaded from `application-test.conf`, which is used if no specific config is given. |
	| `[ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply())()` | Create a testkit named from the ActorTestKit class. |
	| `[ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create a testkit from the provided actor system. |
	| `[ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config customConfig)` | Create a testkit named from the ActorTestKit class,  and use a custom config for the actor system. |
	| `[ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(java.lang.String))​(java.lang.String name)` | Create a testkit using the provided name. |
	| `[ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config))​(java.lang.String name,  com.typesafe.config.Config customConfig)` | Create a test kit named based on the provided name,  and uses the provided custom config for the actor system. |
	| `[ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config,akka.actor.testkit.typed.TestKitSettings))​(java.lang.String name,  com.typesafe.config.Config customConfig,  [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)` | Create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") named based on the provided name,  use the provided custom config for the actor system, and the testkit will use the provided setting. |
	| `void` | `[shutdown](#shutdown(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down,  if more time than `TestKitSettings.DefaultActorSystemShutdownTimeout` passes an exception is thrown |
	| `void` | `[shutdown](#shutdown(akka.actor.typed.ActorSystem,scala.concurrent.duration.Duration,boolean))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,  scala.concurrent.duration.Duration timeout,  boolean throwIfShutdownFails)` | Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down  or the `duration` hits. |
	| `boolean` | `[shutdown$default$3](#shutdown$default$3())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorTestKit$](ActorTestKit$.html "class in akka.actor.testkit.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorTestKit$
		
		
		
		```
		public ActorTestKit$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply()
		```
		
		Create a testkit named from the ActorTestKit class.
		 
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`ActorTestKit.shutdownTestKit()`](ActorTestKit.html#shutdownTestKit()).
		 
		
		
		 Config loaded from `application-test.conf` if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		 The application.conf of your project is not used in this case.
		- #### apply
		
		
		
		```
		public [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Create a testkit from the provided actor system.
		 
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`ActorTestKit.shutdownTestKit()`](ActorTestKit.html#shutdownTestKit()).
		 
		
		
		 Config loaded from the provided actor if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		- #### apply
		
		
		
		```
		public [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​(java.lang.String name)
		```
		
		Create a testkit using the provided name.
		 
		 It will create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") with this name,
		 e.g. threads will include the name.
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`ActorTestKit.shutdownTestKit()`](ActorTestKit.html#shutdownTestKit()).
		 
		
		
		 Config loaded from `application-test.conf` if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		 The application.conf of your project is not used in this case.
		- #### apply
		
		
		
		```
		public [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​(com.typesafe.config.Config customConfig)
		```
		
		Create a testkit named from the ActorTestKit class,
		 and use a custom config for the actor system.
		 
		 It will also used the provided customConfig provided to create the `ActorSystem`
		
		
		
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`ActorTestKit.shutdownTestKit()`](ActorTestKit.html#shutdownTestKit()).
		- #### apply
		
		
		
		```
		public [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​(java.lang.String name,
		                          com.typesafe.config.Config customConfig)
		```
		
		Create a test kit named based on the provided name,
		 and uses the provided custom config for the actor system.
		 
		 It will create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") with this name,
		 e.g. threads will include the name.
		 
		
		
		 It will also used the provided customConfig provided to create the `ActorSystem`
		
		
		
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`ActorTestKit.shutdownTestKit()`](ActorTestKit.html#shutdownTestKit()).
		- #### apply
		
		
		
		```
		public [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​(java.lang.String name,
		                          com.typesafe.config.Config customConfig,
		                          [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)
		```
		
		Create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") named based on the provided name,
		 use the provided custom config for the actor system, and the testkit will use the provided setting.
		 
		 It will create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") with this name,
		 e.g. threads will include the name.
		 
		
		
		 It will also used the provided customConfig provided to create the `ActorSystem`, and provided setting.
		 
		
		
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`ActorTestKit.shutdownTestKit()`](ActorTestKit.html#shutdownTestKit()).
		- #### shutdown
		
		
		
		```
		public void shutdown​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down,
		 if more time than `TestKitSettings.DefaultActorSystemShutdownTimeout` passes an exception is thrown
		- #### shutdown
		
		
		
		```
		public void shutdown​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                     scala.concurrent.duration.Duration timeout,
		                     boolean throwIfShutdownFails)
		```
		
		Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down
		 or the `duration` hits. If the timeout hits `verifySystemShutdown` decides
		- #### shutdown$default$3
		
		
		
		```
		public boolean shutdown$default$3()
		```
		- #### ApplicationTestConfig
		
		
		
		```
		public com.typesafe.config.Config ApplicationTestConfig()
		```
		
		Config loaded from `application-test.conf`, which is used if no specific config is given.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html)*