---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:32:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/PriorityMessage.html
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

- https://doc.akka.io/japi/akka/current/akka/remote/HeartbeatMessage.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/PriorityMessage.html](https://doc.akka.io/japi/akka/current/akka/remote/PriorityMessage.html)*