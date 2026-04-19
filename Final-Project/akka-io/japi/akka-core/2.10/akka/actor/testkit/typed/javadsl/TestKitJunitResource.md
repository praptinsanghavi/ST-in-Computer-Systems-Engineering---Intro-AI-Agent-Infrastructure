---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html
title: TestKitJunitResource
---

# TestKitJunitResource

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class TestKitJunitResource

- java.lang.Object
- - org.junit.rules.ExternalResource
	- - akka.actor.testkit.typed.javadsl.TestKitJunitResource

- All Implemented Interfaces:
`org.junit.rules.TestRule`

---

```
public final class TestKitJunitResource
extends org.junit.rules.ExternalResource
```

A Junit external resource for the [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl"), making it possible to have Junit manage the lifecycle of the testkit.
 The testkit will be automatically shut down when the test completes or fails.
 
 Note that Junit is not provided as a transitive dependency of the testkit module but must be added explicitly
 to your project to use this.
 

 Example:
 

```

 public class MyActorTest {
   @ClassRule
   public static final TestKitResource testKit = new TestKitResource();

   @Test
   public void testBlah() throws Exception {
           // spawn actors etc using the testKit
           ActorRef<Message> ref = testKit.spawn(behavior);
   }
 }
 
```

 By default config is loaded from `application-test.conf` if that exists, otherwise
 using default configuration from the reference.conf resources that ship with the Akka libraries.
 The application.conf of your project is not used in this case.
 A specific configuration can be passed as constructor parameter.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestKitJunitResource](#%3Cinit%3E())()` | Config loaded from `application-test.conf` if that exists, otherwise  using default configuration from the reference.conf resources that ship with the Akka libraries. |
	| `[TestKitJunitResource](#%3Cinit%3E(akka.actor.testkit.typed.javadsl.ActorTestKit))​([ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") _kit)` |  |
	| `[TestKitJunitResource](#%3Cinit%3E(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Use a custom [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") for the actor system. |
	| `[TestKitJunitResource](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config customConfig)` | Use a custom config for the actor system. |
	| `[TestKitJunitResource](#%3Cinit%3E(com.typesafe.config.Config,akka.actor.testkit.typed.TestKitSettings))​(com.typesafe.config.Config customConfig,  [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)` | Use a custom config for the actor system, and a custom [`TestKitSettings`](../TestKitSettings.html "class in akka.actor.testkit.typed"). |
	| `[TestKitJunitResource](#%3Cinit%3E(java.lang.String))​(java.lang.String customConfig)` | Use a custom config for the actor system. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[after](#after())()` |  |
	| `[TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[DeadLetter](../../../DeadLetter.html "class in akka.actor")>` | `[createDeadLetterProbe](#createDeadLetterProbe())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `[TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[Dropped](../../../Dropped.html "class in akka.actor")>` | `[createDroppedMessageProbe](#createDroppedMessageProbe())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `<M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[createTestProbe](#createTestProbe())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `<M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[createTestProbe](#createTestProbe(java.lang.Class))​(java.lang.Class<M> clazz)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `<M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[createTestProbe](#createTestProbe(java.lang.String))​(java.lang.String name)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `<M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M>` | `[createTestProbe](#createTestProbe(java.lang.String,java.lang.Class))​(java.lang.String name,  java.lang.Class<M> clazz)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `[TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[UnhandledMessage](../../../UnhandledMessage.html "class in akka.actor")>` | `[createUnhandledMessageProbe](#createUnhandledMessageProbe())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `[Scheduler](../../../typed/Scheduler.html "interface in akka.actor.typed")` | `[scheduler](#scheduler())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `[SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[serializationTestKit](#serializationTestKit())()` | Additional testing utilities for serialization. |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `<T> void` | `[stop](#stop(akka.actor.typed.ActorRef))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `<T> void` | `[stop](#stop(akka.actor.typed.ActorRef,java.time.Duration))​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref,  java.time.Duration max)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `[ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<java.lang.Void>` | `[system](#system())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `[ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")` | `[testKit](#testKit())()` |  |
	| `[TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed")` | `[testKitSettings](#testKitSettings())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	| `[Timeout](../../../../util/Timeout.html "class in akka.util")` | `[timeout](#timeout())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") |
	
	
		- ### Methods inherited from class org.junit.rules.ExternalResource
		
		
		`apply, before`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestKitJunitResource
		
		
		
		```
		public TestKitJunitResource​([ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") _kit)
		```
		- #### TestKitJunitResource
		
		
		
		```
		public TestKitJunitResource()
		```
		
		Config loaded from `application-test.conf` if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		 The application.conf of your project is not used in this case.
		- #### TestKitJunitResource
		
		
		
		```
		public TestKitJunitResource​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Use a custom [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") for the actor system.
		- #### TestKitJunitResource
		
		
		
		```
		public TestKitJunitResource​(java.lang.String customConfig)
		```
		
		Use a custom config for the actor system.
		- #### TestKitJunitResource
		
		
		
		```
		public TestKitJunitResource​(com.typesafe.config.Config customConfig)
		```
		
		Use a custom config for the actor system.
		- #### TestKitJunitResource
		
		
		
		```
		public TestKitJunitResource​(com.typesafe.config.Config customConfig,
		                            [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)
		```
		
		Use a custom config for the actor system, and a custom [`TestKitSettings`](../TestKitSettings.html "class in akka.actor.testkit.typed").

	- ### Method Detail
	
	
	
		- #### after
		
		
		
		```
		public void after()
		```
		
		
		Overrides:
		`after` in class `org.junit.rules.ExternalResource`
		- #### createDeadLetterProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[DeadLetter](../../../DeadLetter.html "class in akka.actor")> createDeadLetterProbe()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### createDroppedMessageProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[Dropped](../../../Dropped.html "class in akka.actor")> createDroppedMessageProbe()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> createTestProbe()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> createTestProbe​(java.lang.Class<M> clazz)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> createTestProbe​(java.lang.String name,
		                                        java.lang.Class<M> clazz)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<M> createTestProbe​(java.lang.String name)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### createUnhandledMessageProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")<[UnhandledMessage](../../../UnhandledMessage.html "class in akka.actor")> createUnhandledMessageProbe()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### scheduler
		
		
		
		```
		public [Scheduler](../../../typed/Scheduler.html "interface in akka.actor.typed") scheduler()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### serializationTestKit
		
		
		
		```
		public [SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.javadsl") serializationTestKit()
		```
		
		Additional testing utilities for serialization.
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             java.lang.String name)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             java.lang.String name,
		                             [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### stop
		
		
		
		```
		public <T> void stop​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref,
		                     java.time.Duration max)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### stop
		
		
		
		```
		public <T> void stop​([ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> ref)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### system
		
		
		
		```
		public [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<java.lang.Void> system()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### testKit
		
		
		
		```
		public [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") testKit()
		```
		- #### testKitSettings
		
		
		
		```
		public [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") testKitSettings()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")
		- #### timeout
		
		
		
		```
		public [Timeout](../../../../util/Timeout.html "class in akka.util") timeout()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl")

## Code Examples

### Example 1: Class TestKitJunitResource

```text
public class MyActorTest {
   @ClassRule
   public static final TestKitResource testKit = new TestKitResource();

   @Test
   public void testBlah() throws Exception {
           // spawn actors etc using the testKit
           ActorRef<Message> ref = testKit.spawn(behavior);
   }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Dropped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/SerializationTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html)*