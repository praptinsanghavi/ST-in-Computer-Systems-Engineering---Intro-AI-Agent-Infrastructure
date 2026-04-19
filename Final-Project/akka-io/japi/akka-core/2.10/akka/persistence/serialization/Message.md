---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:45:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/Message.html
title: Message
---

# Message

## Content

Package [akka.persistence.serialization](package-summary.html)
## Interface Message

- All Superinterfaces:
`java.io.Serializable`

All Known Subinterfaces:
`[PersistentFSM.PersistentFsmEvent](../fsm/PersistentFSM.PersistentFsmEvent.html "interface in akka.persistence.fsm")`, `[PersistentRepr](../PersistentRepr.html "interface in akka.persistence")`

All Known Implementing Classes:
`[AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence")`, `[AtomicWrite](../AtomicWrite.html "class in akka.persistence")`, `[PersistentFSM.StateChangeEvent](../fsm/PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm")`

---

```
public interface Message
extends java.io.Serializable
```

Marker trait for all protobuf\-serializable messages in `akka.persistence`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/fsm/PersistentFSM.PersistentFsmEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/fsm/PersistentFSM.StateChangeEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/Message.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/Message.html)*