---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html
title: akka.persistence.journal
---

# akka.persistence.journal

## Content

# Package akka.persistence.journal

- Interface Summary 
| Interface | Description |
| [AsyncRecovery](AsyncRecovery.html "interface in akka.persistence.journal") | Asynchronous message replay and sequence number recovery interface. |
| --- | --- |
| [AsyncReplay](AsyncReplay.html "interface in akka.persistence.journal") | A plugin may implement this trait as an optimization. |
| [AsyncWriteJournal](AsyncWriteJournal.html "interface in akka.persistence.journal") | Abstract journal, optimized for asynchronous, non\-blocking writes. |
| [AsyncWriteProxy](AsyncWriteProxy.html "interface in akka.persistence.journal") | INTERNAL API. |
| [EmptyEventSeq](EmptyEventSeq.html "interface in akka.persistence.journal") |  |
| [EventAdapter](EventAdapter.html "interface in akka.persistence.journal") | An [`EventAdapter`](EventAdapter.html "interface in akka.persistence.journal") is both a [`WriteEventAdapter`](WriteEventAdapter.html "interface in akka.persistence.journal") and a [`ReadEventAdapter`](ReadEventAdapter.html "interface in akka.persistence.journal"). |
| [PersistencePluginProxy.PluginType](PersistencePluginProxy.PluginType.html "interface in akka.persistence.journal") |  |
| [ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal") | Facility to convert from and to specialised data models, as may be required by specialized persistence Journals. |
| [WriteEventAdapter](WriteEventAdapter.html "interface in akka.persistence.journal") | Facility to convert to specialised data models, as may be required by specialized persistence Journals. |
| [WriteJournalBase](WriteJournalBase.html "interface in akka.persistence.journal") |  |
- Class Summary 
| Class | Description |
| [AsyncWriteJournal.Desequenced](AsyncWriteJournal.Desequenced.html "class in akka.persistence.journal") |  |
| --- | --- |
| [AsyncWriteJournal.Desequenced$](AsyncWriteJournal.Desequenced$.html "class in akka.persistence.journal") |  |
| [AsyncWriteJournal.Resequencer](AsyncWriteJournal.Resequencer.html "class in akka.persistence.journal") |  |
| [AsyncWriteJournal$](AsyncWriteJournal$.html "class in akka.persistence.journal") | INTERNAL API. |
| [AsyncWriteProxy.InitTimeout$](AsyncWriteProxy.InitTimeout$.html "class in akka.persistence.journal") |  |
| [AsyncWriteProxy.SetStore](AsyncWriteProxy.SetStore.html "class in akka.persistence.journal") |  |
| [AsyncWriteProxy.SetStore$](AsyncWriteProxy.SetStore$.html "class in akka.persistence.journal") |  |
| [AsyncWriteProxy$](AsyncWriteProxy$.html "class in akka.persistence.journal") | INTERNAL API. |
| [AsyncWriteTarget](AsyncWriteTarget.html "class in akka.persistence.journal") | INTERNAL API. |
| [AsyncWriteTarget.DeleteMessagesTo](AsyncWriteTarget.DeleteMessagesTo.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget.DeleteMessagesTo$](AsyncWriteTarget.DeleteMessagesTo$.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget.ReplayFailure](AsyncWriteTarget.ReplayFailure.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget.ReplayFailure$](AsyncWriteTarget.ReplayFailure$.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget.ReplayMessages](AsyncWriteTarget.ReplayMessages.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget.ReplayMessages$](AsyncWriteTarget.ReplayMessages$.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget.ReplaySuccess](AsyncWriteTarget.ReplaySuccess.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget.ReplaySuccess$](AsyncWriteTarget.ReplaySuccess$.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget.WriteMessages](AsyncWriteTarget.WriteMessages.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget.WriteMessages$](AsyncWriteTarget.WriteMessages$.html "class in akka.persistence.journal") |  |
| [AsyncWriteTarget$](AsyncWriteTarget$.html "class in akka.persistence.journal") | INTERNAL API. |
| [EmptyEventSeq$](EmptyEventSeq$.html "class in akka.persistence.journal") |  |
| [EventAdapters](EventAdapters.html "class in akka.persistence.journal") | `EventAdapters` serves as a per\-journal collection of bound event adapters. |
| [EventAdapters.CombinedReadEventAdapter$](EventAdapters.CombinedReadEventAdapter$.html "class in akka.persistence.journal") |  |
| [EventAdapters$](EventAdapters$.html "class in akka.persistence.journal") | INTERNAL API |
| [EventSeq](EventSeq.html "class in akka.persistence.journal") |  |
| [EventSeq$](EventSeq$.html "class in akka.persistence.journal") |  |
| [EventsSeq](EventsSeq.html "class in akka.persistence.journal")\<E\> |  |
| [EventsSeq$](EventsSeq$.html "class in akka.persistence.journal") |  |
| [IdentityEventAdapter](IdentityEventAdapter.html "class in akka.persistence.journal") | No\-op model adapter which passes through the incoming events as\-is. |
| [IdentityEventAdapter$](IdentityEventAdapter$.html "class in akka.persistence.journal") | No\-op model adapter which passes through the incoming events as\-is. |
| [IdentityEventAdapters](IdentityEventAdapters.html "class in akka.persistence.journal") |  |
| [IdentityEventAdapters$](IdentityEventAdapters$.html "class in akka.persistence.journal") |  |
| [JournalPerfSpec](JournalPerfSpec.html "class in akka.persistence.journal") | This spec measures execution times of the basic operations that an [`PersistentActor`](../PersistentActor.html "interface in akka.persistence") provides,  using the provided Journal (plugin). |
| [JournalPerfSpec.BenchActor](JournalPerfSpec.BenchActor.html "class in akka.persistence.journal") |  |
| [JournalPerfSpec.Cmd](JournalPerfSpec.Cmd.html "class in akka.persistence.journal") |  |
| [JournalPerfSpec.Cmd$](JournalPerfSpec.Cmd$.html "class in akka.persistence.journal") |  |
| [JournalPerfSpec.ResetCounter$](JournalPerfSpec.ResetCounter$.html "class in akka.persistence.journal") |  |
| [JournalPerfSpec$](JournalPerfSpec$.html "class in akka.persistence.journal") |  |
| [JournalSpec](JournalSpec.html "class in akka.persistence.journal") | This spec aims to verify custom akka\-persistence Journal implementations. |
| [JournalSpec$](JournalSpec$.html "class in akka.persistence.journal") |  |
| [NoopReadEventAdapter$](NoopReadEventAdapter$.html "class in akka.persistence.journal") |  |
| [NoopWriteEventAdapter$](NoopWriteEventAdapter$.html "class in akka.persistence.journal") |  |
| [PersistencePluginProxy](PersistencePluginProxy.html "class in akka.persistence.journal") |  |
| [PersistencePluginProxy.TargetLocation](PersistencePluginProxy.TargetLocation.html "class in akka.persistence.journal") |  |
| [PersistencePluginProxy.TargetLocation$](PersistencePluginProxy.TargetLocation$.html "class in akka.persistence.journal") |  |
| [PersistencePluginProxy$](PersistencePluginProxy$.html "class in akka.persistence.journal") |  |
| [PersistencePluginProxyExtension](PersistencePluginProxyExtension.html "class in akka.persistence.journal") |  |
| [PersistencePluginProxyExtension$](PersistencePluginProxyExtension$.html "class in akka.persistence.journal") |  |
| [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal") | PersistencePluginProxyExtensionImpl is an `Extension` that enables initialization of the `PersistencePluginProxy`  via configuration, without requiring any code changes or the creation of any actors. |
| [ReplayFilter$](ReplayFilter$.html "class in akka.persistence.journal") | INTERNAL API |
| [ReplayMediator](ReplayMediator.html "class in akka.persistence.journal") |  |
| [SingleEventSeq](SingleEventSeq.html "class in akka.persistence.journal") |  |
| [SingleEventSeq$](SingleEventSeq$.html "class in akka.persistence.journal") |  |
| [Tagged](Tagged.html "class in akka.persistence.journal") | The journal may support tagging of events that are used by the  `EventsByTag` query and it may support specifying the tags via an  [`EventAdapter`](EventAdapter.html "interface in akka.persistence.journal") that wraps the events  in a `Tagged` with the given `tags`. |
| [Tagged$](Tagged$.html "class in akka.persistence.journal") |  |
- Exception Summary 
| Exception | Description |
| [AsyncReplayTimeoutException](AsyncReplayTimeoutException.html "class in akka.persistence.journal") | Thrown if replay inactivity exceeds a specified timeout. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncReplay.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteJournal$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteJournal.Desequenced$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteJournal.Desequenced.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteJournal.Resequencer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteProxy$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteProxy.InitTimeout$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteProxy.SetStore$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteProxy.SetStore.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteProxy.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.DeleteMessagesTo$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.DeleteMessagesTo.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.ReplayFailure$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.ReplayFailure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.ReplayMessages$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.ReplayMessages.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.ReplaySuccess$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.ReplaySuccess.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.WriteMessages$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.WriteMessages.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/AsyncWriteTarget.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EmptyEventSeq.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters.CombinedReadEventAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventsSeq$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapters$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapters.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalPerfSpec$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalPerfSpec.Cmd$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalPerfSpec.Cmd.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalPerfSpec.ResetCounter$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalSpec$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/NoopReadEventAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/NoopWriteEventAdapter$.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html)*