---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/index.html
title: Akka Management
---

# Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka Management

Akka Management is a suite of tools for operating Akka Clusters. The current version may only be used with Akka 2\.10\.

## Overview

Akka Management consists of multiple modules:

- [akka\-management](akka-management.html) is the base module that provides an extensible HTTP management endpoint for Akka management tools as well a [pluggable health check mechanism](healthchecks.html).
- [akka\-cluster\-bootstrap](bootstrap/index.html) helps bootstrapping an Akka cluster using [Akka Discovery](https://doc.akka.io/libraries/akka-core/current/discovery/index.html).
- [akka\-management\-cluster\-http](cluster-http-management.html) is a module that provides HTTP endpoints for introspecting and managing Akka clusters.
- [kubernetes\-lease](kubernetes-lease.html) a lease backed by Kubernetes API server.
- [rolling\-updates](rolling-updates.html) provides recommendations and extensions for having smoother rolling updates.

As well as [Akka Discovery](https://doc.akka.io/libraries/akka-core/current/discovery/index.html) methods for:

- [Kubernetes API](discovery/kubernetes.html)
- [AWS](discovery/aws.html)
- [Azure](discovery/azure.html)

Various parts of Akka management can be used together for deploying Akka Cluster applications to Kubernetes.

- [Deploying Akka Cluster to Kubernetes](kubernetes-deployment/index.html)

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/discovery/index.html
- https://doc.akka.io/libraries/akka-management/current/akka-management.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html
- https://doc.akka.io/libraries/akka-management/current/cluster-http-management.html
- https://doc.akka.io/libraries/akka-management/current/discovery/aws.html
- https://doc.akka.io/libraries/akka-management/current/discovery/azure.html
- https://doc.akka.io/libraries/akka-management/current/discovery/kubernetes.html
- https://doc.akka.io/libraries/akka-management/current/healthchecks.html
- https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/index.html
- https://doc.akka.io/libraries/akka-management/current/kubernetes-lease.html
- https://doc.akka.io/libraries/akka-management/current/rolling-updates.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/](https://doc.akka.io/libraries/akka-management/current/)*