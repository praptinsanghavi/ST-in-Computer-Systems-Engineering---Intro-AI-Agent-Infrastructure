---
description: Akka 2.10.17 - akka.cluster.sharding.internal
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:02:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/internal/index.html
title: Akka 2.10.17 - akka.cluster.sharding.internal
---

# Akka 2.10.17 - akka.cluster.sharding.internal

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.internal

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](../external/index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/internal/index.html "Permalink")  package internalDefinition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/internal/jfr/index.html "Permalink")  package [jfr](jfr/index.html)
- [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "INTERNAL API: Instrumentation SPI for Akka Cluster.")
- [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "INTERNAL API")
- [ClusterShardingTelemetryEnsemble](ClusterShardingTelemetryEnsemble.html "INTERNAL API")
- [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation.html "INTERNAL API")
- [ShardingFlightRecorder](ShardingFlightRecorder$.html "INTERNAL API")
- [**](../../../../akka/cluster/sharding/protobuf/index.html "Permalink")  package [protobuf](../protobuf/index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[sharding](../index.html)
p[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html)

# internal[**](../../../../akka/cluster/sharding/internal/index.html "Permalink")

#### package internal

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/cluster/sharding/internal/jfr/index.html "Permalink")  package [jfr](jfr/index.html)
### Type Members

1. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentation.html "Permalink")  trait [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "INTERNAL API: Instrumentation SPI for Akka Cluster.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API: Instrumentation SPI for Akka Cluster.

INTERNAL API: Instrumentation SPI for Akka Cluster.

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
2. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html "Permalink")  class [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "INTERNAL API") extends [Extension](../../../actor/Extension.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
3. [**](../../../../akka/cluster/sharding/internal/ClusterShardingTelemetryEnsemble.html "Permalink")  class [ClusterShardingTelemetryEnsemble](ClusterShardingTelemetryEnsemble.html "INTERNAL API") extends [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
4. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html "Permalink")  class [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation.html "INTERNAL API") extends [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
### Value Members

1. [**](../../../../akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html "Permalink")  object [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider$.html "INTERNAL API") extends [ExtensionId](../../../actor/ExtensionId.html)\[[ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html)] with [ExtensionIdProvider](../../../actor/ExtensionIdProvider.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
2. [**](../../../../akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation$.html "Permalink")  object [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation$.html "INTERNAL API") extends [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation.html)INTERNAL API

INTERNAL API

Annotations@[InternalStableApi](../../../annotation/InternalStableApi.html)()
3. [**](../../../../akka/cluster/sharding/internal/ShardingFlightRecorder$.html "Permalink")  object [ShardingFlightRecorder](ShardingFlightRecorder$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@[InternalApi](../../../annotation/InternalApi.html)()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ClusterShardingTelemetryEnsemble.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/ShardingFlightRecorder$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/jfr/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/index.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/index.html)*