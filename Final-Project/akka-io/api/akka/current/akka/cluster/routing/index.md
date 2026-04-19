---
description: Akka 2.10.17 - akka.cluster.routing
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:44:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/routing/index.html
title: Akka 2.10.17 - akka.cluster.routing
---

# Akka 2.10.17 - akka.cluster.routing

> **Summary:** Akka 2.10.17 - akka.cluster.routing

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../ddata/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](../metrics/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](../protobuf/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package routingDefinition Classes[cluster](../index.html)
- [ClusterRouterGroup](ClusterRouterGroup.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")
- [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "totalInstances of cluster router must be > 0")
- [ClusterRouterPool](ClusterRouterPool.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")
- [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "totalInstances of cluster router must be > 0 maxInstancesPerNode of cluster router must be > 0 maxInstancesPerNode of cluster router must be 1 when routeesPath is defined")
- [**](../../../akka/cluster/sbr/index.html "Permalink")  package [sbr](../sbr/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../sharding/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](../singleton/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[cluster](../index.html)
p[akka](../../index.html).[cluster](../index.html)

# routing[**](../../../akka/cluster/routing/index.html "Permalink")

#### package routing

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/routing/ClusterRouterGroup.html "Permalink") final  case class [ClusterRouterGroup](ClusterRouterGroup.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")(local: [Group](../../routing/Group.html), settings: [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html)) extends [Group](../../routing/Group.html) with ClusterRouterConfigBase with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[akka.routing.RouterConfig](../../routing/RouterConfig.html) implementation for deployment on cluster nodes.

[akka.routing.RouterConfig](../../routing/RouterConfig.html) implementation for deployment on cluster nodes.
Delegates other duties to the local [akka.routing.RouterConfig](../../routing/RouterConfig.html),
which makes it possible to mix this with the built\-in routers such as
[akka.routing.RoundRobinGroup](../../routing/RoundRobinGroup.html) or custom routers.

Annotations@SerialVersionUID()
2. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html "Permalink") final  class [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "totalInstances of cluster router must be > 0") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable with ClusterRouterSettingsBase`totalInstances` of cluster router must be \> 0

`totalInstances` of cluster router must be \> 0

Annotations@SerialVersionUID()
3. [**](../../../akka/cluster/routing/ClusterRouterPool.html "Permalink") final  case class [ClusterRouterPool](ClusterRouterPool.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")(local: [Pool](../../routing/Pool.html), settings: [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html)) extends [Pool](../../routing/Pool.html) with ClusterRouterConfigBase with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[akka.routing.RouterConfig](../../routing/RouterConfig.html) implementation for deployment on cluster nodes.

[akka.routing.RouterConfig](../../routing/RouterConfig.html) implementation for deployment on cluster nodes.
Delegates other duties to the local [akka.routing.RouterConfig](../../routing/RouterConfig.html),
which makes it possible to mix this with the built\-in routers such as
[akka.routing.RoundRobinGroup](../../routing/RoundRobinGroup.html) or custom routers.

Annotations@SerialVersionUID()
4. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html "Permalink") final  class [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "totalInstances of cluster router must be > 0 maxInstancesPerNode of cluster router must be > 0 maxInstancesPerNode of cluster router must be 1 when routeesPath is defined") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable with ClusterRouterSettingsBase`totalInstances` of cluster router must be \> 0
`maxInstancesPerNode` of cluster router must be \> 0
`maxInstancesPerNode` of cluster router must be 1 when routeesPath is defined

`totalInstances` of cluster router must be \> 0
`maxInstancesPerNode` of cluster router must be \> 0
`maxInstancesPerNode` of cluster router must be 1 when routeesPath is defined

Annotations@SerialVersionUID()
### Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html "Permalink")  object [ClusterRouterGroupSettings](ClusterRouterGroupSettings$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
2. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings$.html "Permalink")  object [ClusterRouterPoolSettings](ClusterRouterPoolSettings$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterPoolSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/routing/Group.html
- https://doc.akka.io/api/akka/current/akka/routing/Pool.html
- https://doc.akka.io/api/akka/current/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/api/akka/current/akka/routing/RouterConfig.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/routing/index.html](https://doc.akka.io/api/akka/current/akka/cluster/routing/index.html)*