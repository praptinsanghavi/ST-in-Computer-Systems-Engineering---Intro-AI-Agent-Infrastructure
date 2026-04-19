---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/PrepareForFullClusterShutdown.html
title: PrepareForFullClusterShutdown
---

# PrepareForFullClusterShutdown

## Content

Package [akka.cluster.typed](package-summary.html)
## Interface PrepareForFullClusterShutdown

- All Superinterfaces:
`[ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed")`

All Known Implementing Classes:
`[PrepareForFullClusterShutdown$](PrepareForFullClusterShutdown$.html "class in akka.cluster.typed")`

---

```
public interface PrepareForFullClusterShutdown
extends [ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed")
```

Initiate a full cluster shutdown. This stops:
 \- New members joining the cluster
 \- New rebalances in Cluster Sharding
 \- Singleton handovers
 
 However, it does not stop the nodes. That is expected to be signalled externally.
 

 Not for user extension

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/PrepareForFullClusterShutdown$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/PrepareForFullClusterShutdown.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/PrepareForFullClusterShutdown.html)*