---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:58:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html
title: Effect
---

# Effect

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Interface Effect\<Event,​State\>

- All Known Subinterfaces:
`[EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`, `[ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>`

All Known Implementing Classes:
`[PersistNothing$](../internal/PersistNothing$.html "class in akka.persistence.typed.internal")`, `[Stash$](../internal/Stash$.html "class in akka.persistence.typed.internal")`, `[Unhandled$](../internal/Unhandled$.html "class in akka.persistence.typed.internal")`

---

```
public interface Effect<Event,​State>
```

A command handler returns an `Effect` directive that defines what event or events to persist.
 
 Instances are created through the factories in the [`Effect`](Effect.html "interface in akka.persistence.typed.scaladsl") companion object.
 

 Not for user extension.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/PersistNothing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Stash$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/Unhandled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html)*