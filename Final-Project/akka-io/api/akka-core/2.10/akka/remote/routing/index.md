---
description: Akka 2.10.17 - akka.remote.routing
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/routing/index.html
title: Akka 2.10.17 - akka.remote.routing
---

# Akka 2.10.17 - akka.remote.routing

> **Summary:** Akka 2.10.17 - akka.remote.routing

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/artery/index.html "Permalink")  package [artery](../artery/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/routing/index.html "Permalink")  package routingDefinition Classes[remote](../index.html)
- [RemoteRouterConfig](RemoteRouterConfig.html "akka.routing.RouterConfig implementation for remote deployment on defined target nodes.")
- [**](../../../akka/remote/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](../testconductor/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[remote](../index.html)
p[akka](../../index.html).[remote](../index.html)

# routing[**](../../../akka/remote/routing/index.html "Permalink")

#### package routing

### Type Members

1. [**](../../../akka/remote/routing/RemoteRouterConfig.html "Permalink") final  case class [RemoteRouterConfig](RemoteRouterConfig.html "akka.routing.RouterConfig implementation for remote deployment on defined target nodes.")(local: [Pool](../../routing/Pool.html), nodes: Iterable\[[Address](../../actor/Address.html)]) extends [Pool](../../routing/Pool.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[akka.routing.RouterConfig](../../routing/RouterConfig.html) implementation for remote deployment on defined
target nodes.

[akka.routing.RouterConfig](../../routing/RouterConfig.html) implementation for remote deployment on defined
target nodes. Delegates other duties to the local [akka.routing.Pool](../../routing/Pool.html),
which makes it possible to mix this with the built\-in routers such as
[akka.routing.RoundRobinGroup](../../routing/RoundRobinGroup.html) or custom routers.

Annotations@SerialVersionUID()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/routing/RemoteRouterConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/routing/index.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/routing/index.html)*