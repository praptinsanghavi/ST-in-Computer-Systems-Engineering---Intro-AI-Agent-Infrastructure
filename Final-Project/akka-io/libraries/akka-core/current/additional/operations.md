---
description: Operating, managing and monitoring Akka and Akka Cluster applications.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/additional/operations.html
title: Operating a Cluster • Akka core
---

# Operating a Cluster • Akka core

> **Summary:** Operating, managing and monitoring Akka and Akka Cluster applications.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Operating a Cluster

This documentation discusses how to operate a cluster. For related, more specific guides see [Packaging](packaging.html), [Deploying](deploying.html) and [Rolling Updates](rolling-updates.html).

## Starting

### Cluster Bootstrap

When starting clusters on cloud systems such as Kubernetes, AWS, Google Cloud, Azure, Mesos or others, you may want to automate the discovery of nodes for the cluster joining process, using your cloud providers, cluster orchestrator, or other form of service discovery (such as managed DNS).

The Akka Management library includes the [Cluster Bootstrap](https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html) module which handles just that. Please refer to its documentation for more details.

Note
If you are running Akka in a Docker container or the nodes for some other reason have separate internal and external ip addresses you must configure remoting according to [Akka behind NAT or in a Docker container](../remoting-artery.html#remote-configuration-nat-artery)

## Stopping

See [Rolling Updates, Cluster Shutdown and Coordinated Shutdown](rolling-updates.html#cluster-shutdown).

## Cluster Management

There are several management tools for the cluster. Complete information on running and managing Akka applications can be found in the project documentation.

### HTTP

Information and management of the cluster is available with a HTTP API. See documentation of [Akka Management](https://doc.akka.io/libraries/akka-management/current/).

### JMX

Information and management of the cluster is available as JMX MBeans with the root name `akka.Cluster`. The JMX information can be displayed with an ordinary JMX console such as JConsole or JVisualVM.

From JMX you can:

- see what members that are part of the cluster
- see status of this node
- see roles of each member
- join this node to another node in cluster
- mark any node in the cluster as down
- tell any node in the cluster to leave

Member nodes are identified by their address, in format *`akka://actor-system-name@hostname:port`*.

## Monitoring and Observability

Aside from log monitoring and the monitoring provided by your APM or platform provider, [Akka Insights](https://doc.akka.io/libraries/akka-insights/current/home.html), available through a [Akka Subscription](https://akka.io/pricing/do-it-yourself), can provide additional insights in the run\-time characteristics of your application, including metrics, events, and distributed tracing for Akka Actors, Cluster, HTTP, and more.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/additional/deploying.html
- https://doc.akka.io/libraries/akka-core/current/additional/packaging.html
- https://doc.akka.io/libraries/akka-core/current/additional/rolling-updates.html
- https://doc.akka.io/libraries/akka-core/current/remoting-artery.html
- https://doc.akka.io/libraries/akka-insights/current/home.html
- https://doc.akka.io/libraries/akka-management/current/
- https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/additional/operations.html](https://doc.akka.io/libraries/akka-core/current/additional/operations.html)*