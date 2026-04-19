---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/PossiblyHarmful.html
title: PossiblyHarmful
---

# PossiblyHarmful

## Content

Package [akka.actor](package-summary.html)
## Interface PossiblyHarmful

- All Known Subinterfaces:
`[SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg")`

All Known Implementing Classes:
`[Kill](Kill.html "class in akka.actor")`, `[Kill$](Kill$.html "class in akka.actor")`, `[NoMessage$](../dispatch/sysmsg/NoMessage$.html "class in akka.dispatch.sysmsg")`, `[PoisonPill](PoisonPill.html "class in akka.actor")`, `[PoisonPill$](PoisonPill$.html "class in akka.actor")`, `[ReceiveTimeout](ReceiveTimeout.html "class in akka.actor")`, `[ReceiveTimeout$](ReceiveTimeout$.html "class in akka.actor")`, `[Terminated](Terminated.html "class in akka.actor")`

---

```
public interface PossiblyHarmful
```

Marker trait to indicate that a message might be potentially harmful,
 this is used to block messages coming in over remoting.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Kill$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Kill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ReceiveTimeout$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ReceiveTimeout.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/NoMessage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/SystemMessage.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/PossiblyHarmful.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PossiblyHarmful.html)*