---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:43:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventSourcedSignal.html
title: EventSourcedSignal
---

# EventSourcedSignal

## Content

Package [akka.persistence.typed](package-summary.html)
## Interface EventSourcedSignal

- All Superinterfaces:
`[Signal](../../actor/typed/Signal.html "interface in akka.actor.typed")`

All Known Implementing Classes:
`[DeleteEventsCompleted](DeleteEventsCompleted.html "class in akka.persistence.typed")`, `[DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed")`, `[DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html "class in akka.persistence.typed")`, `[DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed")`, `[PersistFailed](PersistFailed.html "class in akka.persistence.typed")`, `[PersistRejected](PersistRejected.html "class in akka.persistence.typed")`, `[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed")`, `[RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence.typed")`, `[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")`, `[SnapshotCompleted](SnapshotCompleted.html "class in akka.persistence.typed")`, `[SnapshotFailed](SnapshotFailed.html "class in akka.persistence.typed")`, `[SnapshotRecovered](SnapshotRecovered.html "class in akka.persistence.typed")`

---

```
public interface EventSourcedSignal
extends [Signal](../../actor/typed/Signal.html "interface in akka.actor.typed")
```

Supertype for all Akka Persistence Typed specific signals
 
 Not for user extension

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/RecoveryCompleted$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotCompleted.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotFailed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotRecovered.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventSourcedSignal.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventSourcedSignal.html)*