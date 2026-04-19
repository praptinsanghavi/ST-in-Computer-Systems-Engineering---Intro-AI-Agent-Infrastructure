---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterSharding.ShardCommand.html
title: ClusterSharding.ShardCommand
---

# ClusterSharding.ShardCommand

## Content

Package [akka.cluster.sharding.typed.scaladsl](package-summary.html)
## Interface ClusterSharding.ShardCommand

- All Known Subinterfaces:
`[ClusterSharding.ShardCommand](../javadsl/ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.javadsl")`

All Known Implementing Classes:
`[ClusterSharding.Passivate](../javadsl/ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.javadsl")`, `[ClusterSharding.Passivate](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.scaladsl")`

Enclosing interface:
[ClusterSharding](ClusterSharding.html "interface in akka.cluster.sharding.typed.scaladsl")

---

```
public static interface ClusterSharding.ShardCommand
```

When an entity is created an `ActorRef[ShardCommand]` is passed to the
 factory method. The entity can request passivation by sending the [`ClusterSharding.Passivate`](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.scaladsl")
 message to this ref. Sharding will then send back the specified
 `stopMessage` message to the entity, which is then supposed to stop itself.
 
 Not for user extension.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding.Passivate.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding.ShardCommand.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterSharding.Passivate.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterSharding.ShardCommand.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterSharding.ShardCommand.html)*