---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:09:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/PriorityMessage.html
title: PriorityMessage
---

# PriorityMessage

## Content

Package [akka.remote](package-summary.html)
## Interface PriorityMessage

- All Known Subinterfaces:
`[HeartbeatMessage](HeartbeatMessage.html "interface in akka.remote")`

---

```
public interface PriorityMessage
```

INTERNAL API
 Messages marked with this trait will be sent before other messages when buffering is active.
 This means that these messages don't obey normal message ordering.
 It is used for failure detector heartbeat messages.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/HeartbeatMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/PriorityMessage.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/PriorityMessage.html)*