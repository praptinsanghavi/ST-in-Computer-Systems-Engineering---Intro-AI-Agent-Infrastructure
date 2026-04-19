---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/ControlMessage.html
title: ControlMessage
---

# ControlMessage

## Content

Package [akka.remote.artery](package-summary.html)
## Interface ControlMessage

- All Superinterfaces:
`[ArteryMessage](ArteryMessage.html "interface in akka.remote.artery")`, `java.io.Serializable`

All Known Subinterfaces:
`[CompressionProtocol.CompressionAdvertisement](compress/CompressionProtocol.CompressionAdvertisement.html "interface in akka.remote.artery.compress")<T>`, `[Reply](Reply.html "interface in akka.remote.artery")`

All Known Implementing Classes:
`[Flush$](Flush$.html "class in akka.remote.artery")`

---

```
public interface ControlMessage
extends [ArteryMessage](ArteryMessage.html "interface in akka.remote.artery")
```

INTERNAL API
 Marker trait for control messages that can be sent via the system message sub\-channel
 but don't need full reliable delivery. E.g. `HandshakeReq` and `Reply`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/ArteryMessage.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/Flush$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/Reply.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/CompressionProtocol.CompressionAdvertisement.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/ControlMessage.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/ControlMessage.html)*