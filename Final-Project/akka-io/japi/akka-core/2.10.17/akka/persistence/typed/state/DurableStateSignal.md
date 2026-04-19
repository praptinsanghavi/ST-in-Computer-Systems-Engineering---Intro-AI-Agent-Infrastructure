---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/DurableStateSignal.html
title: DurableStateSignal
---

# DurableStateSignal

## Content

Package [akka.persistence.typed.state](package-summary.html)
## Interface DurableStateSignal

- All Superinterfaces:
`[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")`

All Known Implementing Classes:
`[RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")`, `[RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence.typed.state")`, `[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed.state")`

---

```
public interface DurableStateSignal
extends [Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")
```

Supertype for all `DurableStateBehavior` specific signals
 
 Not for user extension

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryFailed.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/DurableStateSignal.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/DurableStateSignal.html)*