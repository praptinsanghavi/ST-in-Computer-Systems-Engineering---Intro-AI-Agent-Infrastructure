---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/package-summary.html
title: akka.actor.testkit.typed.scaladsl
---

# akka.actor.testkit.typed.scaladsl

## Content

# Package akka.actor.testkit.typed.scaladsl

- Interface Summary 
| Interface | Description |
| [BehaviorTestKit](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl")\<T\> | Used for synchronous testing [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed")s. |
| --- | --- |
| [LogCapturing](LogCapturing.html "interface in akka.actor.testkit.typed.scaladsl") | Mixin this trait to a ScalaTest test to make log lines appear only when the test failed. |
| [LoggingTestKit](LoggingTestKit.html "interface in akka.actor.testkit.typed.scaladsl") | Facilities for verifying logs. |
| [ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl")\<T\> | Similar to an [`TestInbox`](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl"), but can only ever give access to a single message (a reply). |
| [StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl")\<T\> | A [`ReplyInbox`](ReplyInbox.html "interface in akka.actor.testkit.typed.scaladsl") which specially handles [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern"). |
| [TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")\<T\> | Utility for use as an `ActorRef` when \*synchronously\* testing [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed")  with [`BehaviorTestKit`](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl"). |
| [TestProbe](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")\<M\> | Create instances through the factories in the [`TestProbe`](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl") companion. |
- Class Summary 
| Class | Description |
| [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") | Testkit for asynchronous testing of typed actors, meant for mixing into the test class. |
| --- | --- |
| [ActorTestKit$](ActorTestKit$.html "class in akka.actor.testkit.typed.scaladsl") |  |
| [ActorTestKitBase](ActorTestKitBase.html "class in akka.actor.testkit.typed.scaladsl") | A base class for the [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl"), making it possible to have testing framework (e.g. |
| [ActorTestKitBase$](ActorTestKitBase$.html "class in akka.actor.testkit.typed.scaladsl") |  |
| [BehaviorTestKit$](BehaviorTestKit$.html "class in akka.actor.testkit.typed.scaladsl") |  |
| [Effects](Effects.html "class in akka.actor.testkit.typed.scaladsl") | Factories for behavior effects for [`BehaviorTestKit`](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl"), each effect has a suitable equals and can be used to compare  actual effects to expected ones. |
| [Effects$](Effects$.html "class in akka.actor.testkit.typed.scaladsl") | Factories for behavior effects for [`BehaviorTestKit`](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl"), each effect has a suitable equals and can be used to compare  actual effects to expected ones. |
| [FishingOutcomes](FishingOutcomes.html "class in akka.actor.testkit.typed.scaladsl") |  |
| [FishingOutcomes$](FishingOutcomes$.html "class in akka.actor.testkit.typed.scaladsl") |  |
| [LoggingTestKit$](LoggingTestKit$.html "class in akka.actor.testkit.typed.scaladsl") | Facilities for selectively matching expected events from logging. |
| [ManualTime](ManualTime.html "class in akka.actor.testkit.typed.scaladsl") | Not for user instantiation, see [`ManualTime.apply(akka.actor.typed.ActorSystem<?>)`](ManualTime.html#apply(akka.actor.typed.ActorSystem)) |
| [ManualTime$](ManualTime$.html "class in akka.actor.testkit.typed.scaladsl") | Manual time allows you to do async tests while controlling the scheduler of the system. |
| [ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") | A ScalaTest base class for the [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl"), making it possible to have ScalaTest manage the lifecycle of the testkit. |
| [SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.scaladsl") | Utilities to test serialization. |
| [TestInbox$](TestInbox$.html "class in akka.actor.testkit.typed.scaladsl") |  |
| [TestProbe$](TestProbe$.html "class in akka.actor.testkit.typed.scaladsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/ActorTestKitBase$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/Effects$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/Effects.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/FishingOutcomes.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/LogCapturing.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/LoggingTestKit$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/ManualTime$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/ManualTime.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/ReplyInbox.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/TestInbox$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/TestProbe$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/current/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/actor/testkit/typed/scaladsl/package-summary.html)*