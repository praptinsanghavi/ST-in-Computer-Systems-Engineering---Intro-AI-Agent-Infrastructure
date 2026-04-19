---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterMessage.html
title: ClusterMessage
---

# ClusterMessage

## Content

Package [akka.cluster](package-summary.html)
## Interface ClusterMessage

- All Superinterfaces:
`java.io.Serializable`

All Known Implementing Classes:
`[ClusterUserAction.Down](ClusterUserAction.Down.html "class in akka.cluster")`, `[ClusterUserAction.Leave](ClusterUserAction.Leave.html "class in akka.cluster")`, `[ClusterUserAction.PrepareForShutdown$](ClusterUserAction.PrepareForShutdown$.html "class in akka.cluster")`, `[InternalClusterAction.ExitingConfirmed](InternalClusterAction.ExitingConfirmed.html "class in akka.cluster")`, `[InternalClusterAction.InitJoin](InternalClusterAction.InitJoin.html "class in akka.cluster")`, `[InternalClusterAction.InitJoinAck](InternalClusterAction.InitJoinAck.html "class in akka.cluster")`, `[InternalClusterAction.InitJoinNack](InternalClusterAction.InitJoinNack.html "class in akka.cluster")`, `[InternalClusterAction.Join](InternalClusterAction.Join.html "class in akka.cluster")`, `[InternalClusterAction.Welcome](InternalClusterAction.Welcome.html "class in akka.cluster")`

---

```
public interface ClusterMessage
extends java.io.Serializable
```

Base trait for all cluster messages. All ClusterMessage's are serializable.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.Down.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.Leave.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterUserAction.PrepareForShutdown$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.ExitingConfirmed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.InitJoin.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.InitJoinAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.InitJoinNack.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Join.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/InternalClusterAction.Welcome.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterMessage.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterMessage.html)*