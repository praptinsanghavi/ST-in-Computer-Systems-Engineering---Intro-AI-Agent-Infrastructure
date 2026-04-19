---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnected.Disconnected.html
title: UdpConnected.Disconnected
---

# UdpConnected.Disconnected

## Content

Package [akka.io](package-summary.html)
## Interface UdpConnected.Disconnected

- All Superinterfaces:
`[UdpConnected.Event](UdpConnected.Event.html "interface in akka.io")`, `[UdpConnected.Message](UdpConnected.Message.html "interface in akka.io")`

All Known Implementing Classes:
`[UdpConnected.Disconnected$](UdpConnected.Disconnected$.html "class in akka.io")`

Enclosing class:
[UdpConnected](UdpConnected.html "class in akka.io")

---

```
public static interface UdpConnected.Disconnected
extends [UdpConnected.Event](UdpConnected.Event.html "interface in akka.io")
```

This message is sent by the connection actor to the actor which sent the
 `Disconnect` message when the UDP socket has been closed.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnected.Disconnected$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnected.Event.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnected.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnected.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnected.Disconnected.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpConnected.Disconnected.html)*