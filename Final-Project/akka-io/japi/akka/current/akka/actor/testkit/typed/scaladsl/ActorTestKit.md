---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
title: ActorTestKit
---

# ActorTestKit

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class ActorTestKit

- java.lang.Object
- - akka.actor.testkit.typed.scaladsl.ActorTestKit

- ---

```
public final class ActorTestKit
extends java.lang.Object
```

Testkit for asynchronous testing of typed actors, meant for mixing into the test class.
 
 Provides a typed actor system started on creation, used for all test cases and shut down when `shutdown` is called.
 

 The actor system has a custom guardian that allows for spawning arbitrary actors using the `spawn` methods.
 

 Designed to work with any test framework, but framework glue code that calls shutdown after all tests has
 run needs to be provided by the user.
 

 For synchronous testing of a `Behavior` see [`BehaviorTestKit`](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static com.typesafe.config.Config` | `[ApplicationTestConfig](#ApplicationTestConfig())()` | Config loaded from `application-test.conf`, which is used if no specific config is given. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply())()` | Create a testkit named from the ActorTestKit class. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create a testkit from the provided actor system. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config customConfig)` | Create a testkit named from the ActorTestKit class,  and use a custom config for the actor system. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(java.lang.String))​(java.lang.String name)` | Create a testkit using the provided name. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config))​(java.lang.String name,  com.typesafe.config.Config customConfig)` | Create a test kit named based on the provided name,  and uses the provided custom config for the actor system. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[apply](#apply(java.lang.String,com.typesafe.config.Config,akka.actor.testkit.typed.TestKitSettings))​(java.lang.String name,  com.typesafe.config.Config customConfig,  [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)` | Create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") named based on the provided name,  use the provided custom config for the actor system, and the testkit will use the provided setting. |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `[TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[DeadLetter](../../../DeadLetter.html "class in akka.actor")>` | `[createDeadLetterProbe](#createDeadLetterProbe())()` |  |
	| `[TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[Dropped](../../../Dropped.html "class in akka.actor")>` | `[createDroppedMessageProbe](#createDroppedMessageProbe())()` |  |
	| `<M> [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<M>` | `[createTestProbe](#createTestProbe())()` | Shortcut for creating a new test probe for the testkit actor system |
	| `<M> [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<M>` | `[createTestProbe](#createTestProbe(java.lang.String))​(java.lang.String name)` | Shortcut for creating a new named test probe for the testkit actor system |
	| `[TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[UnhandledMessage](../../../UnhandledMessage.html "class in akka.actor")>` | `[createUnhandledMessageProbe](#createUnhandledMessageProbe())()` |  |
	| `[ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?>` | `[internalSystem](#internalSystem())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `[Scheduler](../../../typed/Scheduler.html "interface in akka.actor.typed")` | `[scheduler](#scheduler())()` |  |
	| `[SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[serializationTestKit](#serializationTestKit())()` | Additional testing utilities for serialization. |
	| `static void` | `[shutdown](#shutdown(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down,  if more time than `TestKitSettings.DefaultActorSystemShutdownTimeout` passes an exception is thrown |
	| `static void` | `[shutdown](#shutdown(akka.actor.typed.ActorSystem,scala.concurrent.duration.Duration,boolean))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,  scala.concurrent.duration.Duration timeout,  boolean throwIfShutdownFails)` | Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down  or the `duration` hits. |
	| `static boolean` | `[shutdown$default$3](#shutdown$default$3())()` |  |
	| `void` | `[shutdownTestKit](#shutdownTestKit())()` |  |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)` | Spawn the given behavior. |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | Spawn the given behavior. |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name)` | Spawn the given behavior. |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | Spawn the given behavior. |
	| `<T> void` | `[stop](#stop(akka.actor.typed.ActorRef,scala.concurrent.duration.FiniteDuration))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref,  scala.concurrent.duration.FiniteDuration max)` | Stop the actor under test and wait until it terminates. |
	| `<T> scala.concurrent.duration.FiniteDuration` | `[stop$default$2](#stop$default$2())()` |  |
	| `[ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$>` | `[system](#system())()` | INTERNAL API |
	| `[TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed")` | `[testKitSettings](#testKitSettings())()` |  |
	| `[Timeout](../../../../util/Timeout.html "class in akka.util")` | `[timeout](#timeout())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply()
		```
		
		Create a testkit named from the ActorTestKit class.
		 
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		 
		
		
		 Config loaded from `application-test.conf` if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		 The application.conf of your project is not used in this case.
		- #### apply
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Create a testkit from the provided actor system.
		 
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		 
		
		
		 Config loaded from the provided actor if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		- #### apply
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​(java.lang.String name)
		```
		
		Create a testkit using the provided name.
		 
		 It will create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") with this name,
		 e.g. threads will include the name.
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		 
		
		
		 Config loaded from `application-test.conf` if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		 The application.conf of your project is not used in this case.
		- #### apply
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​(com.typesafe.config.Config customConfig)
		```
		
		Create a testkit named from the ActorTestKit class,
		 and use a custom config for the actor system.
		 
		 It will also used the provided customConfig provided to create the `ActorSystem`
		
		
		
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		- #### apply
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​(java.lang.String name,
		                                 com.typesafe.config.Config customConfig)
		```
		
		Create a test kit named based on the provided name,
		 and uses the provided custom config for the actor system.
		 
		 It will create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") with this name,
		 e.g. threads will include the name.
		 
		
		
		 It will also used the provided customConfig provided to create the `ActorSystem`
		
		
		
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		- #### apply
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") apply​(java.lang.String name,
		                                 com.typesafe.config.Config customConfig,
		                                 [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)
		```
		
		Create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") named based on the provided name,
		 use the provided custom config for the actor system, and the testkit will use the provided setting.
		 
		 It will create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") with this name,
		 e.g. threads will include the name.
		 
		
		
		 It will also used the provided customConfig provided to create the `ActorSystem`, and provided setting.
		 
		
		
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		- #### shutdown
		
		
		
		```
		public static void shutdown​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down,
		 if more time than `TestKitSettings.DefaultActorSystemShutdownTimeout` passes an exception is thrown
		- #### shutdown
		
		
		
		```
		public static void shutdown​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                            scala.concurrent.duration.Duration timeout,
		                            boolean throwIfShutdownFails)
		```
		
		Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down
		 or the `duration` hits. If the timeout hits `verifySystemShutdown` decides
		- #### shutdown$default$3
		
		
		
		```
		public static boolean shutdown$default$3()
		```
		- #### ApplicationTestConfig
		
		
		
		```
		public static com.typesafe.config.Config ApplicationTestConfig()
		```
		
		Config loaded from `application-test.conf`, which is used if no specific config is given.
		- #### internalSystem
		
		
		
		```
		public [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> internalSystem()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		- #### testKitSettings
		
		
		
		```
		public [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") testKitSettings()
		```
		- #### system
		
		
		
		```
		public [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$> system()
		```
		
		INTERNAL API
		- #### timeout
		
		
		
		```
		public [Timeout](../../../../util/Timeout.html "class in akka.util") timeout()
		```
		- #### scheduler
		
		
		
		```
		public [Scheduler](../../../typed/Scheduler.html "interface in akka.actor.typed") scheduler()
		```
		- #### shutdownTestKit
		
		
		
		```
		public void shutdownTestKit()
		```
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Spawn the given behavior. This is created as a child of the test kit
		 guardian
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		Spawn the given behavior. This is created as a child of the test kit
		 guardian
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             java.lang.String name)
		```
		
		Spawn the given behavior. This is created as a child of the test kit
		 guardian
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             java.lang.String name,
		                             [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		Spawn the given behavior. This is created as a child of the test kit
		 guardian
		- #### stop
		
		
		
		```
		public <T> void stop​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref,
		                     scala.concurrent.duration.FiniteDuration max)
		```
		
		Stop the actor under test and wait until it terminates.
		 It can only be used for actors that were spawned by this `ActorTestKit`.
		 Other actors will not be stopped by this method.
		- #### stop$default$2
		
		
		
		```
		public <T> scala.concurrent.duration.FiniteDuration stop$default$2()
		```
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<M> createTestProbe()
		```
		
		Shortcut for creating a new test probe for the testkit actor system
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<M> createTestProbe​(java.lang.String name)
		```
		
		Shortcut for creating a new named test probe for the testkit actor system
		- #### createUnhandledMessageProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[UnhandledMessage](../../../UnhandledMessage.html "class in akka.actor")> createUnhandledMessageProbe()
		```
		
		
		Returns:
		A test probe that is subscribed to unhandled messages from the system event bus. Subscription
		 will be completed and verified so any unhandled message after it will be caught by the probe.
		- #### createDeadLetterProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[DeadLetter](../../../DeadLetter.html "class in akka.actor")> createDeadLetterProbe()
		```
		
		
		Returns:
		A test probe that is subscribed to dead letters from the system event bus. Subscription
		 will be completed and verified so any dead letter after it will be caught by the probe.
		- #### createDroppedMessageProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[Dropped](../../../Dropped.html "class in akka.actor")> createDroppedMessageProbe()
		```
		
		
		Returns:
		A test probe that is subscribed to dropped letters from the system event bus. Subscription
		 will be completed and verified so any dropped letter after it will be caught by the probe.
		- #### serializationTestKit
		
		
		
		```
		public [SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.scaladsl") serializationTestKit()
		```
		
		Additional testing utilities for serialization.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka/current/akka/actor/Dropped.html
- https://doc.akka.io/japi/akka/current/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html)*