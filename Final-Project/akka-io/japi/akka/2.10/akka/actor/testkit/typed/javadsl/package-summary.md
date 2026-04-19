---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:10:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/package-summary.html
title: akka.actor.testkit.typed.javadsl
---

# akka.actor.testkit.typed.javadsl

## Content

# Package akka.actor.testkit.typed.javadsl

- Interface Summary 
| Interface | Description |
| [ReplyInbox](ReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")\<T\> | Similar to an [`TestInbox`](TestInbox.html "class in akka.actor.testkit.typed.javadsl"), but can only ever give access to a single message (a reply). |
| --- | --- |
| [StatusReplyInbox](StatusReplyInbox.html "interface in akka.actor.testkit.typed.javadsl")\<T\> | A [`ReplyInbox`](ReplyInbox.html "interface in akka.actor.testkit.typed.javadsl") which specially handles [`StatusReply`](../../../../pattern/StatusReply.html "class in akka.pattern"). |
- Class Summary 
| Class | Description |
| [ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl") | Java API: Test kit for asynchronous testing of typed actors. |
| --- | --- |
| [ActorTestKit$](ActorTestKit$.html "class in akka.actor.testkit.typed.javadsl") |  |
| [BehaviorTestKit](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl")\<T\> | Used for synchronous testing [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed")s. |
| [BehaviorTestKit$](BehaviorTestKit$.html "class in akka.actor.testkit.typed.javadsl") |  |
| [Effects](Effects.html "class in akka.actor.testkit.typed.javadsl") | Factories for behavior effects for [`BehaviorTestKit`](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl"), each effect has a suitable equals and can be used to compare  actual effects to expected ones. |
| [Effects$](Effects$.html "class in akka.actor.testkit.typed.javadsl") | Factories for behavior effects for [`BehaviorTestKit`](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl"), each effect has a suitable equals and can be used to compare  actual effects to expected ones. |
| [FishingOutcomes](FishingOutcomes.html "class in akka.actor.testkit.typed.javadsl") |  |
| [FishingOutcomes$](FishingOutcomes$.html "class in akka.actor.testkit.typed.javadsl") |  |
| [LogCapturing](LogCapturing.html "class in akka.actor.testkit.typed.javadsl") | JUnit `TestRule` to make log lines appear only when the test failed. |
| [LoggingTestKit](LoggingTestKit.html "class in akka.actor.testkit.typed.javadsl") | Facilities for verifying logs. |
| [LoggingTestKit$](LoggingTestKit$.html "class in akka.actor.testkit.typed.javadsl") | Facilities for selectively matching log messages. |
| [ManualTime](ManualTime.html "class in akka.actor.testkit.typed.javadsl") | Not for user instantiation, see [`ManualTime.get(akka.actor.typed.ActorSystem<A>)`](ManualTime.html#get(akka.actor.typed.ActorSystem)) |
| [ManualTime$](ManualTime$.html "class in akka.actor.testkit.typed.javadsl") | Manual time allows you to do async tests while controlling the scheduler of the system. |
| [SerializationTestKit](SerializationTestKit.html "class in akka.actor.testkit.typed.javadsl") | Utilities to test serialization. |
| [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")\<T\> | Utility for use as an `ActorRef` when \*synchronously\* testing [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed")  with [`BehaviorTestKit`](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl"). |
| [TestInbox$](TestInbox$.html "class in akka.actor.testkit.typed.javadsl") |  |
| [TestKitJunitResource](TestKitJunitResource.html "class in akka.actor.testkit.typed.javadsl") | A Junit external resource for the [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.javadsl"), making it possible to have Junit manage the lifecycle of the testkit. |
| [TestProbe](TestProbe.html "class in akka.actor.testkit.typed.javadsl")\<M\> | Java API: \* Create instances through the `create` factories in the [`TestProbe`](TestProbe.html "class in akka.actor.testkit.typed.javadsl") companion  or via [`ActorTestKit.createTestProbe()`](ActorTestKit.html#createTestProbe()). |
| [TestProbe$](TestProbe$.html "class in akka.actor.testkit.typed.javadsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/ActorTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/Effects$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/Effects.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/FishingOutcomes$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/FishingOutcomes.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/LogCapturing.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/LoggingTestKit$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/LoggingTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/ManualTime$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/ManualTime.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/ReplyInbox.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/SerializationTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/StatusReplyInbox.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/TestInbox$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/TestInbox.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/TestKitJunitResource.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/TestProbe$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/2.10/akka/pattern/StatusReply.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/actor/testkit/typed/javadsl/package-summary.html)*