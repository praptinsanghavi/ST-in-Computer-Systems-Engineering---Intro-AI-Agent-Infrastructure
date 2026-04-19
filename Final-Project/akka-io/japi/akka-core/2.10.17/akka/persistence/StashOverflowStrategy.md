---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:42:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/StashOverflowStrategy.html
title: StashOverflowStrategy
---

# StashOverflowStrategy

## Content

Package [akka.persistence](package-summary.html)
## Interface StashOverflowStrategy

- All Known Implementing Classes:
`[DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence")`, `[ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence")`, `[ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence")`

---

```
public interface StashOverflowStrategy
```

This defines how to handle the current received message which failed to stash, when the size of
 Stash exceeding the capacity of Stash.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/ReplyToStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/ThrowOverflowExceptionStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/StashOverflowStrategy.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/StashOverflowStrategy.html)*