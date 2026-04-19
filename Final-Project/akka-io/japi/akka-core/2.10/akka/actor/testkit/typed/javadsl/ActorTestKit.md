---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html
title: ActorTestKit
---

# ActorTestKit

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class ActorTestKit

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.ActorTestKit

- ---

```
public final class ActorTestKit
extends java.lang.Object
```

Java API: Test kit for asynchronous testing of typed actors.
 Provides a typed actor system started on creation, that can be used for multiple test cases and is
 shut down when `shutdown` is called.
 
 The actor system has a custom guardian that allows for spawning arbitrary actors using the `spawn` methods.
 

 Designed to work with any test framework, but framework glue code that calls `shutdownTestKit` after all tests has
 run needs to be provided by the user or with [`TestKitJunitResource`](TestKitJunitResource.html "class in akka.actor.testkit.typed.javadsl").
 

 Use `TestKit.create` factories to construct manually or [`TestKitJunitResource`](TestKitJunitResource.html "class in akka.actor.testkit.typed.javadsl") to use together with JUnit tests
 

 For synchronous testing of a `Behavior` see [`BehaviorTestKit`](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static com.typesafe.config.Config` | `[applicationTestConfig](#applicationTestConfig())()` | Config loaded from `application-test.conf`, which is used if no specific config is given. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[create](#create())()` | Create a testkit named from the ActorTestKit class. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[create](#create(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Create a testkit from the provided actor system. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config customConfig)` | Create a testkit named from the ActorTestKit class,  and use a custom config for the actor system. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[create](#create(java.lang.String))​(java.lang.String name)` | Create a testkit using the provided name. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[create](#create(java.lang.String,com.typesafe.config.Config))​(java.lang.String name,  com.typesafe.config.Config customConfig)` | Create a test kit named based on the provided name,  and uses the provided custom config for the actor system. |
	| `static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[create](#create(java.lang.String,com.typesafe.config.Config,akka.actor.testkit.typed.TestKitSettings))​(java.lang.String name,  com.typesafe.config.Config customConfig,  [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)` | Create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") named based on the provided name,  use the provided custom config for the actor system, and the testkit will use the provided setting. |
	| `[TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[DeadLetter](../../../DeadLetter.html "class in akka.actor")>` | `[createDeadLetterProbe](#createDeadLetterProbe())()` |  |
	| `[TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[Dropped](../../../Dropped.html "class in akka.actor")>` | `[createDroppedMessageProbe](#createDroppedMessageProbe())()` |  |
	| `<M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[createTestProbe](#createTestProbe())()` | Shortcut for creating a new test probe for the testkit actor system |
	| `<M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[createTestProbe](#createTestProbe(java.lang.Class))​(java.lang.Class<M> clazz)` | Shortcut for creating a new test probe for the testkit actor system |
	| `<M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[createTestProbe](#createTestProbe(java.lang.String))​(java.lang.String name)` | Shortcut for creating a new named test probe for the testkit actor system |
	| `<M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[createTestProbe](#createTestProbe(java.lang.String,java.lang.Class))​(java.lang.String name,  java.lang.Class<M> clazz)` | Shortcut for creating a new named test probe for the testkit actor system |
	| `[TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[UnhandledMessage](../../../UnhandledMessage.html "class in akka.actor")>` | `[createUnhandledMessageProbe](#createUnhandledMessageProbe())()` |  |
	| `[Scheduler](../../../typed/Scheduler.html "interface in akka.actor.typed")` | `[scheduler](#scheduler())()` | The scheduler of the testkit actor system |
	| `[SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[serializationTestKit](#serializationTestKit())()` | Additional testing utilities for serialization. |
	| `static void` | `[shutdown](#shutdown(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down,  if more time than `system-shutdown-default` passes an exception is thrown  (can be configured with `throw-on-shutdown-timeout`). |
	| `static void` | `[shutdown](#shutdown(akka.actor.typed.ActorSystem,java.time.Duration))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,  java.time.Duration duration)` | Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down,  if more time than `system-shutdown-default` passes an exception is thrown  (can be configured with `throw-on-shutdown-timeout`). |
	| `static void` | `[shutdown](#shutdown(akka.actor.typed.ActorSystem,java.time.Duration,boolean))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,  java.time.Duration duration,  boolean throwIfShutdownTimesOut)` | Shutdown the given actor system and wait up to `duration` for shutdown to complete. |
	| `void` | `[shutdownTestKit](#shutdownTestKit())()` | Terminate the actor system and the testkit |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)` | Spawn a new auto\-named actor under the testkit user guardian and return the ActorRef for the spawned actor |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | Spawn a new auto\-named actor under the testkit user guardian with the given props  and return the ActorRef for the spawned actor |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name)` | Spawn a new named actor under the testkit user guardian and return the ActorRef for the spawned actor,  note that spawning actors with the same name in multiple test cases will cause failures. |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | Spawn a new named actor under the testkit user guardian with the given props and return the ActorRef  for the spawned actor, note that spawning actors with the same name in multiple test cases will cause failures. |
	| `<T> void` | `[stop](#stop(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)` | Stop the actor under test and wait until it terminates. |
	| `<T> void` | `[stop](#stop(akka.actor.typed.ActorRef,java.time.Duration))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref,  java.time.Duration max)` | Stop the actor under test and wait `max` until it terminates. |
	| `[ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<java.lang.Void>` | `[system](#system())()` | The actor system running for this testkit. |
	| `[TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed")` | `[testKitSettings](#testKitSettings())()` |  |
	| `[Timeout](../../../../util/Timeout.html "class in akka.util")` | `[timeout](#timeout())()` | The default timeout as specified with the config/[`TestKitSettings`](../TestKitSettings.html "class in akka.actor.testkit.typed") |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") create()
		```
		
		Create a testkit named from the ActorTestKit class.
		 
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		 
		
		
		 Config loaded from `application-test.conf` if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		 The application.conf of your project is not used in this case.
		- #### create
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") create​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Create a testkit from the provided actor system.
		 
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		 
		
		
		 Config loaded from the provided actor if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		- #### create
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") create​(java.lang.String name)
		```
		
		Create a testkit using the provided name.
		 
		 It will create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") with this name,
		 e.g. threads will include the name.
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		 
		
		
		 Config loaded from `application-test.conf` if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		 The application.conf of your project is not used in this case.
		- #### create
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") create​(com.typesafe.config.Config customConfig)
		```
		
		Create a testkit named from the ActorTestKit class,
		 and use a custom config for the actor system.
		 
		 It will also used the provided customConfig provided to create the `ActorSystem`
		
		
		
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		- #### create
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") create​(java.lang.String name,
		                                  com.typesafe.config.Config customConfig)
		```
		
		Create a test kit named based on the provided name,
		 and uses the provided custom config for the actor system.
		 
		 It will create an [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") with this name,
		 e.g. threads will include the name.
		 
		
		
		 It will also used the provided customConfig provided to create the `ActorSystem`
		
		
		
		 When the test has completed you should terminate the `ActorSystem` and
		 the testkit with [`shutdownTestKit()`](#shutdownTestKit()).
		- #### create
		
		
		
		```
		public static [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") create​(java.lang.String name,
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
		public static void shutdown​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                            java.time.Duration duration,
		                            boolean throwIfShutdownTimesOut)
		```
		
		Shutdown the given actor system and wait up to `duration` for shutdown to complete.
		
		Parameters:
		`throwIfShutdownTimesOut` \- Fail the test if the system fails to shut down, if false
		 an error is printed to stdout when the system did not shutdown but
		 no exception is thrown.
		- #### shutdown
		
		
		
		```
		public static void shutdown​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system,
		                            java.time.Duration duration)
		```
		
		Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down,
		 if more time than `system-shutdown-default` passes an exception is thrown
		 (can be configured with `throw-on-shutdown-timeout`).
		- #### shutdown
		
		
		
		```
		public static void shutdown​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Shutdown the given [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") and block until it shuts down,
		 if more time than `system-shutdown-default` passes an exception is thrown
		 (can be configured with `throw-on-shutdown-timeout`).
		- #### applicationTestConfig
		
		
		
		```
		public static com.typesafe.config.Config applicationTestConfig()
		```
		
		Config loaded from `application-test.conf`, which is used if no specific config is given.
		- #### timeout
		
		
		
		```
		public [Timeout](../../../../util/Timeout.html "class in akka.util") timeout()
		```
		
		The default timeout as specified with the config/[`TestKitSettings`](../TestKitSettings.html "class in akka.actor.testkit.typed")
		- #### system
		
		
		
		```
		public [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<java.lang.Void> system()
		```
		
		The actor system running for this testkit. Interaction with the user guardian is done through methods on the testkit
		 which is why it is typed to `Void`.
		- #### testKitSettings
		
		
		
		```
		public [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") testKitSettings()
		```
		- #### scheduler
		
		
		
		```
		public [Scheduler](../../../typed/Scheduler.html "interface in akka.actor.typed") scheduler()
		```
		
		The scheduler of the testkit actor system
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Spawn a new auto\-named actor under the testkit user guardian and return the ActorRef for the spawned actor
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             java.lang.String name)
		```
		
		Spawn a new named actor under the testkit user guardian and return the ActorRef for the spawned actor,
		 note that spawning actors with the same name in multiple test cases will cause failures.
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		Spawn a new auto\-named actor under the testkit user guardian with the given props
		 and return the ActorRef for the spawned actor
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             java.lang.String name,
		                             [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		Spawn a new named actor under the testkit user guardian with the given props and return the ActorRef
		 for the spawned actor, note that spawning actors with the same name in multiple test cases will cause failures.
		- #### stop
		
		
		
		```
		public <T> void stop​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)
		```
		
		Stop the actor under test and wait until it terminates.
		 It can only be used for actors that were spawned by this `ActorTestKit`.
		 Other actors will not be stopped by this method.
		- #### stop
		
		
		
		```
		public <T> void stop​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref,
		                     java.time.Duration max)
		```
		
		Stop the actor under test and wait `max` until it terminates.
		 It can only be used for actors that were spawned by this `ActorTestKit`.
		 Other actors will not be stopped by this method.
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> createTestProbe()
		```
		
		Shortcut for creating a new test probe for the testkit actor system
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> createTestProbe​(java.lang.Class<M> clazz)
		```
		
		Shortcut for creating a new test probe for the testkit actor system
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> createTestProbe​(java.lang.String name)
		```
		
		Shortcut for creating a new named test probe for the testkit actor system
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> createTestProbe​(java.lang.String name,
		                                        java.lang.Class<M> clazz)
		```
		
		Shortcut for creating a new named test probe for the testkit actor system
		- #### createDroppedMessageProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[Dropped](../../../Dropped.html "class in akka.actor")> createDroppedMessageProbe()
		```
		
		
		Returns:
		A test probe that is subscribed to dropped letters from the system event bus. Subscription
		 will be completed and verified so any dropped letter after it will be caught by the probe.
		- #### createDeadLetterProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[DeadLetter](../../../DeadLetter.html "class in akka.actor")> createDeadLetterProbe()
		```
		
		
		Returns:
		A test probe that is subscribed to dead letters from the system event bus. Subscription
		 will be completed and verified so any dead letter after it will be caught by the probe.
		- #### createUnhandledMessageProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[UnhandledMessage](../../../UnhandledMessage.html "class in akka.actor")> createUnhandledMessageProbe()
		```
		
		
		Returns:
		A test probe that is subscribed to unhandled messages from the system event bus. Subscription
		 will be completed and verified so any unhandled message after it will be caught by the probe.
		- #### shutdownTestKit
		
		
		
		```
		public void shutdownTestKit()
		```
		
		Terminate the actor system and the testkit
		- #### serializationTestKit
		
		
		
		```
		public [SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.javadsl") serializationTestKit()
		```
		
		Additional testing utilities for serialization.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Dropped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/SerializationTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html)*