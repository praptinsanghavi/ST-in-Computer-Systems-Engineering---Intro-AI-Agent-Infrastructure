---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/package-summary.html
title: akka.persistence.typed.state.internal
---

# akka.persistence.typed.state.internal

## Content

# Package akka.persistence.typed.state.internal

- Interface Summary 
| Interface | Description |
| [DurableStateStoreInteractions](DurableStateStoreInteractions.html "interface in akka.persistence.typed.state.internal")\<C,​S\> | INTERNAL API |
| --- | --- |
| [InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal") | Protocol used internally by the DurableStateBehavior. |
| [StashManagement](StashManagement.html "interface in akka.persistence.typed.state.internal")\<C,​S\> | INTERNAL API: Stash management for persistent behaviors |
| [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.state.internal") | INTERNAL API |
- Class Summary 
| Class | Description |
| [CompositeEffect$](CompositeEffect$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| --- | --- |
| [Delete$](Delete$.html "class in akka.persistence.typed.state.internal") |  |
| [DurableStateBehaviorImpl$](DurableStateBehaviorImpl$.html "class in akka.persistence.typed.state.internal") |  |
| [DurableStateSettings$](DurableStateSettings$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [InternalProtocol.ContinueUnstash$](InternalProtocol.ContinueUnstash$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.DeleteFailure](InternalProtocol.DeleteFailure.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.DeleteFailure$](InternalProtocol.DeleteFailure$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.DeleteSuccess$](InternalProtocol.DeleteSuccess$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.GetFailure](InternalProtocol.GetFailure.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.GetFailure$](InternalProtocol.GetFailure$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.GetSuccess](InternalProtocol.GetSuccess.html "class in akka.persistence.typed.state.internal")\<S\> |  |
| [InternalProtocol.GetSuccess$](InternalProtocol.GetSuccess$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.IncomingCommand](InternalProtocol.IncomingCommand.html "class in akka.persistence.typed.state.internal")\<C\> |  |
| [InternalProtocol.IncomingCommand$](InternalProtocol.IncomingCommand$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.RecoveryPermitGranted$](InternalProtocol.RecoveryPermitGranted$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.RecoveryTimeout$](InternalProtocol.RecoveryTimeout$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.UpsertFailure](InternalProtocol.UpsertFailure.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.UpsertFailure$](InternalProtocol.UpsertFailure$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol.UpsertSuccess$](InternalProtocol.UpsertSuccess$.html "class in akka.persistence.typed.state.internal") |  |
| [InternalProtocol$](InternalProtocol$.html "class in akka.persistence.typed.state.internal") |  |
| [NoOpSnapshotAdapter$](NoOpSnapshotAdapter$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [Persist$](Persist$.html "class in akka.persistence.typed.state.internal") |  |
| [PersistenceMdc](PersistenceMdc.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [PersistenceMdc$](PersistenceMdc$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [PersistNothing](PersistNothing.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [PersistNothing$](PersistNothing$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [Recovering$](Recovering$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [RequestingRecoveryPermit$](RequestingRecoveryPermit$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [Running$](Running$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [SideEffect$](SideEffect$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [Stash](Stash.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [Stash$](Stash$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [StashOverflowStrategy.Drop$](StashOverflowStrategy.Drop$.html "class in akka.persistence.typed.state.internal") |  |
| [StashOverflowStrategy.Fail$](StashOverflowStrategy.Fail$.html "class in akka.persistence.typed.state.internal") |  |
| [StashOverflowStrategy$](StashOverflowStrategy$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [Stop](Stop.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [Stop$](Stop$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [Unhandled](Unhandled.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [Unhandled$](Unhandled$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [UnstashAll](UnstashAll.html "class in akka.persistence.typed.state.internal") | INTERNAL API |
| [UnstashAll$](UnstashAll$.html "class in akka.persistence.typed.state.internal") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/CompositeEffect$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Delete$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/DurableStateBehaviorImpl$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/DurableStateSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/DurableStateStoreInteractions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.ContinueUnstash$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.DeleteFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.DeleteFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.DeleteSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.GetFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.GetFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.GetSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.GetSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.IncomingCommand$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.IncomingCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.RecoveryPermitGranted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.RecoveryTimeout$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.UpsertFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.UpsertFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.UpsertSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/NoOpSnapshotAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Persist$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/PersistNothing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/PersistenceMdc$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/PersistenceMdc.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Recovering$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/RequestingRecoveryPermit$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Running$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/SideEffect$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Stash$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Stash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/StashManagement.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/StashOverflowStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/StashOverflowStrategy.Drop$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/StashOverflowStrategy.Fail$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Stop$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Stop.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Unhandled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/Unhandled.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/UnstashAll$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/UnstashAll.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/package-summary.html)*