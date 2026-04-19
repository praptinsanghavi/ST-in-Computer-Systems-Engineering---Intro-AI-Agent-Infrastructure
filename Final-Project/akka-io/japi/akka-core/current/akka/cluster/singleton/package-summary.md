---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:46:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/package-summary.html
title: akka.cluster.singleton
---

# akka.cluster.singleton

## Content

# Package akka.cluster.singleton

- Interface Summary 
| Interface | Description |
| [ClusterSingletonManager.Data](ClusterSingletonManager.Data.html "interface in akka.cluster.singleton") | INTERNAL API  public due to the `with FSM` type parameters |
| --- | --- |
| [ClusterSingletonManager.State](ClusterSingletonManager.State.html "interface in akka.cluster.singleton") | INTERNAL API  public due to the `with FSM` type parameters |
| [ClusterSingletonMessage](ClusterSingletonMessage.html "interface in akka.cluster.singleton") | Marker trait for remote messages with special serializer. |
- Class Summary 
| Class | Description |
| [ClusterSingletonManager](ClusterSingletonManager.html "class in akka.cluster.singleton") | Manages singleton actor instance among all cluster nodes or a group  of nodes tagged with a specific role. |
| --- | --- |
| [ClusterSingletonManager.Internal$](ClusterSingletonManager.Internal$.html "class in akka.cluster.singleton") | INTERNAL API |
| [ClusterSingletonManager$](ClusterSingletonManager$.html "class in akka.cluster.singleton") |  |
| [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.singleton") | param: singletonName The actor name of the child singleton actor. |
| [ClusterSingletonManagerSettings$](ClusterSingletonManagerSettings$.html "class in akka.cluster.singleton") |  |
| [ClusterSingletonProxy](ClusterSingletonProxy.html "class in akka.cluster.singleton") | The `ClusterSingletonProxy` works together with the [`ClusterSingletonManager`](ClusterSingletonManager.html "class in akka.cluster.singleton") to provide a  distributed proxy to the singleton actor. |
| [ClusterSingletonProxy$](ClusterSingletonProxy$.html "class in akka.cluster.singleton") |  |
| [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html "class in akka.cluster.singleton") | param: singletonName The actor name of the singleton actor that is started by the [`ClusterSingletonManager`](ClusterSingletonManager.html "class in akka.cluster.singleton"). |
| [ClusterSingletonProxySettings$](ClusterSingletonProxySettings$.html "class in akka.cluster.singleton") |  |
- Exception Summary 
| Exception | Description |
| [ClusterSingletonManagerIsStuck](ClusterSingletonManagerIsStuck.html "class in akka.cluster.singleton") | Thrown when a consistent state can't be determined within the  defined retry limits. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonManager.Data.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonManager.Internal$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonManager.State.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonMessage.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonProxy$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonProxy.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonProxySettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/ClusterSingletonProxySettings.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/singleton/package-summary.html)*