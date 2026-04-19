---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:58:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html
title: ActorTestKitBase
---

# ActorTestKitBase

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class ActorTestKitBase

- java.lang.Object
- - akka.actor.testkit.typed.scaladsl.ActorTestKitBase

- Direct Known Subclasses:
`[ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")`

---

```
public abstract class ActorTestKitBase
extends java.lang.Object
```

A base class for the [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl"), making it possible to have testing framework (e.g. ScalaTest)
 manage the lifecycle of the testkit.
 
 An implementation for ScalaTest is [`ScalaTestWithActorTestKit`](ScalaTestWithActorTestKit.html "class in akka.actor.testkit.typed.scaladsl").
 

 Another abstract class that is testing framework specific should extend this class and
 automatically shut down the `testKit` when the test completes or fails by implementing [`afterAll()`](#afterAll()).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorTestKitBase](#%3Cinit%3E())()` |  |
	| `[ActorTestKitBase](#%3Cinit%3E(akka.actor.testkit.typed.scaladsl.ActorTestKit))​([ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") testKit)` |  |
	| `[ActorTestKitBase](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Use a custom config for the actor system. |
	| `[ActorTestKitBase](#%3Cinit%3E(com.typesafe.config.Config,akka.actor.testkit.typed.TestKitSettings))​(com.typesafe.config.Config config,  [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)` | Use a custom config for the actor system, and a custom [`TestKitSettings`](../TestKitSettings.html "class in akka.actor.testkit.typed"). |
	| `[ActorTestKitBase](#%3Cinit%3E(java.lang.String))​(java.lang.String config)` | Use a custom config for the actor system. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract void` | `[afterAll](#afterAll())()` | To be implemented by "more" concrete class that can mixin `BeforeAndAfterAll` or similar,  for example `FlatSpecLike with BeforeAndAfterAll`. |
	| `[TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[DeadLetter](../../../DeadLetter.html "class in akka.actor")>` | `[createDeadLetterProbe](#createDeadLetterProbe())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `[TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[Dropped](../../../Dropped.html "class in akka.actor")>` | `[createDroppedMessageProbe](#createDroppedMessageProbe())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `<M> [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<M>` | `[createTestProbe](#createTestProbe())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `<M> [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<M>` | `[createTestProbe](#createTestProbe(java.lang.String))​(java.lang.String name)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `[TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[UnhandledMessage](../../../UnhandledMessage.html "class in akka.actor")>` | `[createUnhandledMessageProbe](#createUnhandledMessageProbe())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `[SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[serializationTestKit](#serializationTestKit())()` | Additional testing utilities for serialization. |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `<T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T>` | `[spawn](#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props))​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name,  [Props](../../../typed/Props.html "class in akka.actor.typed") props)` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `[ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$>` | `[system](#system())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `[ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")` | `[testKit](#testKit())()` |  |
	| `[TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed")` | `[testKitSettings](#testKitSettings())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	| `static java.lang.String` | `[testNameFromCallStack](#testNameFromCallStack())()` |  |
	| `[Timeout](../../../../util/Timeout.html "class in akka.util")` | `[timeout](#timeout())()` | See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorTestKitBase
		
		
		
		```
		public ActorTestKitBase​([ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") testKit)
		```
		- #### ActorTestKitBase
		
		
		
		```
		public ActorTestKitBase()
		```
		- #### ActorTestKitBase
		
		
		
		```
		public ActorTestKitBase​(java.lang.String config)
		```
		
		Use a custom config for the actor system.
		- #### ActorTestKitBase
		
		
		
		```
		public ActorTestKitBase​(com.typesafe.config.Config config)
		```
		
		Use a custom config for the actor system.
		- #### ActorTestKitBase
		
		
		
		```
		public ActorTestKitBase​(com.typesafe.config.Config config,
		                        [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)
		```
		
		Use a custom config for the actor system, and a custom [`TestKitSettings`](../TestKitSettings.html "class in akka.actor.testkit.typed").

	- ### Method Detail
	
	
	
		- #### testNameFromCallStack
		
		
		
		```
		public static java.lang.String testNameFromCallStack()
		```
		- #### testKit
		
		
		
		```
		public [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") testKit()
		```
		- #### system
		
		
		
		```
		public [ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$> system()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### testKitSettings
		
		
		
		```
		public [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") testKitSettings()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### timeout
		
		
		
		```
		public [Timeout](../../../../util/Timeout.html "class in akka.util") timeout()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             java.lang.String name)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### spawn
		
		
		
		```
		public <T> [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<T> spawn​([Behavior](../../../typed/Behavior.html "class in akka.actor.typed")<T> behavior,
		                             java.lang.String name,
		                             [Props](../../../typed/Props.html "class in akka.actor.typed") props)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<M> createTestProbe()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### createTestProbe
		
		
		
		```
		public <M> [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<M> createTestProbe​(java.lang.String name)
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### createDroppedMessageProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[Dropped](../../../Dropped.html "class in akka.actor")> createDroppedMessageProbe()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### createDeadLetterProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[DeadLetter](../../../DeadLetter.html "class in akka.actor")> createDeadLetterProbe()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### createUnhandledMessageProbe
		
		
		
		```
		public [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")<[UnhandledMessage](../../../UnhandledMessage.html "class in akka.actor")> createUnhandledMessageProbe()
		```
		
		See corresponding method on [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl")
		- #### serializationTestKit
		
		
		
		```
		public [SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.scaladsl") serializationTestKit()
		```
		
		Additional testing utilities for serialization.
		- #### afterAll
		
		
		
		```
		protected abstract void afterAll()
		```
		
		To be implemented by "more" concrete class that can mixin `BeforeAndAfterAll` or similar,
		 for example `FlatSpecLike with BeforeAndAfterAll`. Implement by calling
		 `testKit.shutdownTestKit()`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Dropped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html)*