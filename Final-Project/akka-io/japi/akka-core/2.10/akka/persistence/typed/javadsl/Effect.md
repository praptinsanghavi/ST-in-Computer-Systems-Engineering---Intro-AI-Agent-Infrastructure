---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html
title: Effect
---

# Effect

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Interface Effect\<Event,​State\>

- All Known Subinterfaces:
`[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")<Event,​State>`

All Known Implementing Classes:
`[EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")`, `[PersistNothing$](../internal/PersistNothing$.html "class in akka.persistence.typed.internal")`, `[Stash$](../internal/Stash$.html "class in akka.persistence.typed.internal")`, `[Unhandled$](../internal/Unhandled$.html "class in akka.persistence.typed.internal")`

---

```
public interface Effect<Event,​State>
```

A command handler returns an `Effect` directive that defines what event or events to persist.
 
 Instances of `Effect` are available through factories `EventSourcedBehavior.Effect`.
 

 Not intended for user extension.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Stash$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Unhandled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html)*