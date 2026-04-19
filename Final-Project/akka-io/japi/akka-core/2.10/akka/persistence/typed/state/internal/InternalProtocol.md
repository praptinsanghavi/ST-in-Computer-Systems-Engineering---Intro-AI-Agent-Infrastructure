---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.html
title: InternalProtocol
---

# InternalProtocol

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Interface InternalProtocol

- All Known Implementing Classes:
`[InternalProtocol.ContinueUnstash$](InternalProtocol.ContinueUnstash$.html "class in akka.persistence.typed.state.internal")`, `[InternalProtocol.DeleteFailure](InternalProtocol.DeleteFailure.html "class in akka.persistence.typed.state.internal")`, `[InternalProtocol.DeleteSuccess$](InternalProtocol.DeleteSuccess$.html "class in akka.persistence.typed.state.internal")`, `[InternalProtocol.GetFailure](InternalProtocol.GetFailure.html "class in akka.persistence.typed.state.internal")`, `[InternalProtocol.GetSuccess](InternalProtocol.GetSuccess.html "class in akka.persistence.typed.state.internal")`, `[InternalProtocol.IncomingCommand](InternalProtocol.IncomingCommand.html "class in akka.persistence.typed.state.internal")`, `[InternalProtocol.RecoveryPermitGranted$](InternalProtocol.RecoveryPermitGranted$.html "class in akka.persistence.typed.state.internal")`, `[InternalProtocol.RecoveryTimeout$](InternalProtocol.RecoveryTimeout$.html "class in akka.persistence.typed.state.internal")`, `[InternalProtocol.UpsertFailure](InternalProtocol.UpsertFailure.html "class in akka.persistence.typed.state.internal")`, `[InternalProtocol.UpsertSuccess$](InternalProtocol.UpsertSuccess$.html "class in akka.persistence.typed.state.internal")`

---

```
public interface InternalProtocol
```

Protocol used internally by the DurableStateBehavior.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[InternalProtocol.ContinueUnstash$](InternalProtocol.ContinueUnstash$.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.DeleteFailure](InternalProtocol.DeleteFailure.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.DeleteFailure$](InternalProtocol.DeleteFailure$.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.DeleteSuccess$](InternalProtocol.DeleteSuccess$.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.GetFailure](InternalProtocol.GetFailure.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.GetFailure$](InternalProtocol.GetFailure$.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.GetSuccess](InternalProtocol.GetSuccess.html "class in akka.persistence.typed.state.internal")<[S](InternalProtocol.GetSuccess.html "type parameter in InternalProtocol.GetSuccess")>` |  |
	| `static class` | `[InternalProtocol.GetSuccess$](InternalProtocol.GetSuccess$.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.IncomingCommand](InternalProtocol.IncomingCommand.html "class in akka.persistence.typed.state.internal")<[C](InternalProtocol.IncomingCommand.html "type parameter in InternalProtocol.IncomingCommand")>` |  |
	| `static class` | `[InternalProtocol.IncomingCommand$](InternalProtocol.IncomingCommand$.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.RecoveryPermitGranted$](InternalProtocol.RecoveryPermitGranted$.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.RecoveryTimeout$](InternalProtocol.RecoveryTimeout$.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.UpsertFailure](InternalProtocol.UpsertFailure.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.UpsertFailure$](InternalProtocol.UpsertFailure$.html "class in akka.persistence.typed.state.internal")` |  |
	| `static class` | `[InternalProtocol.UpsertSuccess$](InternalProtocol.UpsertSuccess$.html "class in akka.persistence.typed.state.internal")` |  |

## Related Pages (Internal Links)

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
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/internal/InternalProtocol.html)*