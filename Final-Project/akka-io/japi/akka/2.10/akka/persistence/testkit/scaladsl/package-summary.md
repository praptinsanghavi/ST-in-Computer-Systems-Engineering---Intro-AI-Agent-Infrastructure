---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:11:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/package-summary.html
title: akka.persistence.testkit.scaladsl
---

# akka.persistence.testkit.scaladsl

## Content

# Package akka.persistence.testkit.scaladsl

- Interface Summary 
| Interface | Description |
| [ClearOps](ClearOps.html "interface in akka.persistence.testkit.scaladsl") |  |
| --- | --- |
| [ClearPreservingSeqNums](ClearPreservingSeqNums.html "interface in akka.persistence.testkit.scaladsl") |  |
| [CommonTestKitOps](CommonTestKitOps.html "interface in akka.persistence.testkit.scaladsl")\<S,​P\> |  |
| [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "interface in akka.persistence.testkit.scaladsl")\<Command,​Event,​State\> |  |
| [EventSourcedBehaviorTestKit.CommandResult](EventSourcedBehaviorTestKit.CommandResult.html "interface in akka.persistence.testkit.scaladsl")\<Command,​Event,​State\> | The result of running a command. |
| [EventSourcedBehaviorTestKit.CommandResultWithReply](EventSourcedBehaviorTestKit.CommandResultWithReply.html "interface in akka.persistence.testkit.scaladsl")\<Command,​Event,​State,​Reply\> | The result of running a command with a `replyTo: ActorRef[R]`, i.e. |
| [EventSourcedBehaviorTestKit.RestartResult](EventSourcedBehaviorTestKit.RestartResult.html "interface in akka.persistence.testkit.scaladsl")\<State\> | The result of restarting the behavior. |
| [ExpectOps](ExpectOps.html "interface in akka.persistence.testkit.scaladsl")\<U\> |  |
| [HasStorage](HasStorage.html "interface in akka.persistence.testkit.scaladsl")\<P,​R\> | Abstract persistent storage for tests. |
| [PersistenceProbe](PersistenceProbe.html "interface in akka.persistence.testkit.scaladsl")\<T\> | Not for user extension |
| [PersistenceTestKitOps](PersistenceTestKitOps.html "interface in akka.persistence.testkit.scaladsl")\<S,​P\> |  |
| [PolicyOpsTestKit](PolicyOpsTestKit.html "interface in akka.persistence.testkit.scaladsl")\<P\> |  |
| [RejectSupport](RejectSupport.html "interface in akka.persistence.testkit.scaladsl")\<U\> |  |
| [UnpersistentBehavior](UnpersistentBehavior.html "interface in akka.persistence.testkit.scaladsl")\<Command,​State\> |  |
- Class Summary 
| Class | Description |
| [EventSourcedBehaviorTestKit.SerializationSettings](EventSourcedBehaviorTestKit.SerializationSettings.html "class in akka.persistence.testkit.scaladsl") | Customization of which serialization checks that are performed. |
| --- | --- |
| [EventSourcedBehaviorTestKit.SerializationSettings$](EventSourcedBehaviorTestKit.SerializationSettings$.html "class in akka.persistence.testkit.scaladsl") |  |
| [EventSourcedBehaviorTestKit$](EventSourcedBehaviorTestKit$.html "class in akka.persistence.testkit.scaladsl") | Testing of [`EventSourcedBehavior`](../../typed/scaladsl/EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl") implementations. |
| [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")\<T\> |  |
| [PersistenceEffect$](PersistenceEffect$.html "class in akka.persistence.testkit.scaladsl") |  |
| [PersistenceInit](PersistenceInit.html "class in akka.persistence.testkit.scaladsl") | Test utility to initialize persistence plugins. |
| [PersistenceInit$](PersistenceInit$.html "class in akka.persistence.testkit.scaladsl") | Test utility to initialize persistence plugins. |
| [PersistenceTestKit](PersistenceTestKit.html "class in akka.persistence.testkit.scaladsl") | Class for testing events of persistent actors. |
| [PersistenceTestKit.Settings](PersistenceTestKit.Settings.html "class in akka.persistence.testkit.scaladsl") |  |
| [PersistenceTestKit.Settings$](PersistenceTestKit.Settings$.html "class in akka.persistence.testkit.scaladsl") |  |
| [PersistenceTestKit$](PersistenceTestKit$.html "class in akka.persistence.testkit.scaladsl") |  |
| [SnapshotTestKit](SnapshotTestKit.html "class in akka.persistence.testkit.scaladsl") | Class for testing snapshots of persistent actors. |
| [SnapshotTestKit.Settings](SnapshotTestKit.Settings.html "class in akka.persistence.testkit.scaladsl") |  |
| [SnapshotTestKit.Settings$](SnapshotTestKit.Settings$.html "class in akka.persistence.testkit.scaladsl") |  |
| [SnapshotTestKit$](SnapshotTestKit$.html "class in akka.persistence.testkit.scaladsl") |  |
| [UnpersistentBehavior.DurableState](UnpersistentBehavior.DurableState.html "class in akka.persistence.testkit.scaladsl")\<Command,​State\> |  |
| [UnpersistentBehavior.DurableState$](UnpersistentBehavior.DurableState$.html "class in akka.persistence.testkit.scaladsl") |  |
| [UnpersistentBehavior.EventSourced](UnpersistentBehavior.EventSourced.html "class in akka.persistence.testkit.scaladsl")\<Command,​Event,​State\> |  |
| [UnpersistentBehavior.EventSourced$](UnpersistentBehavior.EventSourced$.html "class in akka.persistence.testkit.scaladsl") |  |
| [UnpersistentBehavior$](UnpersistentBehavior$.html "class in akka.persistence.testkit.scaladsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/ClearOps.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/ClearPreservingSeqNums.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/CommonTestKitOps.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.CommandResult.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.CommandResultWithReply.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.RestartResult.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.SerializationSettings$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.SerializationSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/ExpectOps.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/HasStorage.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceInit$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceInit.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.Settings$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.Settings.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKitOps.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/PolicyOpsTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/RejectSupport.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.Settings$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.Settings.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.DurableState$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.DurableState.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.EventSourced.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/persistence/testkit/scaladsl/package-summary.html)*