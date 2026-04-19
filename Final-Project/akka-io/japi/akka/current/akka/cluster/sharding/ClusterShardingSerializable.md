---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:07:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSerializable.html
title: ClusterShardingSerializable
---

# ClusterShardingSerializable

## Content

Package [akka.cluster.sharding](package-summary.html)
## Interface ClusterShardingSerializable

- All Superinterfaces:
`java.io.Serializable`

All Known Subinterfaces:
`[ShardCoordinator.Internal$.CoordinatorCommand](ShardCoordinator.Internal$.CoordinatorCommand.html "interface in akka.cluster.sharding")`, `[ShardCoordinator.Internal$.CoordinatorMessage](ShardCoordinator.Internal$.CoordinatorMessage.html "interface in akka.cluster.sharding")`, `[ShardCoordinator.Internal$.DomainEvent](ShardCoordinator.Internal$.DomainEvent.html "interface in akka.cluster.sharding")`

All Known Implementing Classes:
`[ShardCoordinator.Internal$.State](ShardCoordinator.Internal$.State.html "class in akka.cluster.sharding")`

---

```
public interface ClusterShardingSerializable
extends java.io.Serializable
```

Marker trait for remote messages and persistent events/snapshots with special serializer.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.Internal$.CoordinatorCommand.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.Internal$.CoordinatorMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.Internal$.DomainEvent.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.Internal$.State.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSerializable.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSerializable.html)*