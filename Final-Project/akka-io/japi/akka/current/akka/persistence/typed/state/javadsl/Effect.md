---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/Effect.html
title: Effect
---

# Effect

## Content

Package [akka.persistence.typed.state.javadsl](package-summary.html)
## Interface Effect\<State\>

- All Known Subinterfaces:
`[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.javadsl")<State>`

All Known Implementing Classes:
`[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.state.javadsl")`, `[PersistNothing$](../internal/PersistNothing$.html "class in akka.persistence.typed.state.internal")`, `[Stash$](../internal/Stash$.html "class in akka.persistence.typed.state.internal")`, `[Unhandled$](../internal/Unhandled$.html "class in akka.persistence.typed.state.internal")`

---

```
public interface Effect<State>
```

A command handler returns an `Effect` directive that defines what state to persist.
 
 Instances of `Effect` are available through factories `DurableStateBehavior.Effect`.
 

 Not intended for user extension.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Stash$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Unhandled$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/Effect.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/javadsl/Effect.html)*