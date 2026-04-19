---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonMessage.html
title: ClusterSingletonMessage
---

# ClusterSingletonMessage

## Content

Package [akka.cluster.singleton](package-summary.html)
## Interface ClusterSingletonMessage

- All Superinterfaces:
`java.io.Serializable`

All Known Implementing Classes:
`[ClusterSingletonManager.Internal$.HandOverDone$](ClusterSingletonManager.Internal$.HandOverDone$.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.HandOverInProgress$](ClusterSingletonManager.Internal$.HandOverInProgress$.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.HandOverToMe$](ClusterSingletonManager.Internal$.HandOverToMe$.html "class in akka.cluster.singleton")`, `[ClusterSingletonManager.Internal$.TakeOverFromMe$](ClusterSingletonManager.Internal$.TakeOverFromMe$.html "class in akka.cluster.singleton")`

---

```
public interface ClusterSingletonMessage
extends java.io.Serializable
```

Marker trait for remote messages with special serializer.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverDone$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverInProgress$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.HandOverToMe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.Internal$.TakeOverFromMe$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonMessage.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonMessage.html)*