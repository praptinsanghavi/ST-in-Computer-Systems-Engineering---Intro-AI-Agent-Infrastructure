---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
title: Effect
---

# Effect

## Content

Package [akka.persistence.typed.state.scaladsl](package-summary.html)
## Interface Effect\<State\>

- All Known Subinterfaces:
`[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>`, `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.state.scaladsl")<State>`

All Known Implementing Classes:
`[PersistNothing$](../internal/PersistNothing$.html "class in akka.persistence.typed.state.internal")`, `[Stash$](../internal/Stash$.html "class in akka.persistence.typed.state.internal")`, `[Unhandled$](../internal/Unhandled$.html "class in akka.persistence.typed.state.internal")`

---

```
public interface Effect<State>
```

A command handler returns an `Effect` directive that defines what state to persist.
 
 Instances are created through the factories in the [`Effect`](Effect.html "interface in akka.persistence.typed.state.scaladsl") companion object.
 

 Not for user extension.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Stash$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Unhandled$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/Effect.html)*