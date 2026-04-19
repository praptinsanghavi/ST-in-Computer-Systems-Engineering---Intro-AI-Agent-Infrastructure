---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:01Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/akka-platform.html
title: 'Akka Automated Operations :: Akka Documentation'
---

# Akka Automated Operations :: Akka Documentation

## Content

# Akka Automated Operations

## Overview

Akka Automated Operations (AAO) is the operational backbone of the Akka platform. It manages, monitors, and gathers insights from your deployed Akka services so you can focus on building rather than babysitting infrastructure.

AAO is built on a Kubernetes\-based control plane and application plane purpose\-designed for executing Akka services with fully automated operations. It handles elasticity, agility, and resilience out of the box — you deploy your service and AAO takes care of the rest.

**When to use AAO:**

- You are moving an Akka service to production and need zero\-touch deployments, scaling, and recovery.
- You require multi\-region replication with automatic failover for business\-critical workloads.
- You need deep observability — logs, metrics, and traces — integrated from day one.
- You operate under regulatory or data\-sovereignty constraints that demand dedicated infrastructure.

## Reliability

Reliability is a first\-class dimension across every AAO tier. The platform is designed around the principle that failures are inevitable and recovery must be automatic:

- **99\.9999% availability target** — six nines, measured across regions.
- **Sub\-one\-minute RTO** — your service resumes serving traffic in under 60 seconds after a region\-level failure.
- **Zero\-byte RPO** — event\-sourced state is replicated synchronously across regions; no data is lost.

These guarantees are not aspirational — they are architectural. AAO continuously monitors region health, redistributes traffic on anomaly detection, and brings replacement capacity online without human intervention.

## Deploying and Managing Services

Operating [Services](services/index.html) provides an overview of what services are and how to manage them.

- [Deploy and manage services](services/deploy-service.html)
- [Invoking Akka services](services/invoke-service.html)
- [Viewing data](services/view-data.html)
- [Data migration](services/data-management.html)
- [Integrating with CI/CD tools](integrating-cicd/index.html)

## Observability and Monitoring

[Observability and monitoring](observability-and-monitoring/index.html) provides the tools and guidance you need to understand your running Akka services.

- [View logs](observability-and-monitoring/view-logs.html)
- [View metrics](observability-and-monitoring/metrics.html)
- [View traces](observability-and-monitoring/traces.html)
- [Exporting metrics, logs, and traces](observability-and-monitoring/observability-exports.html)

## Organizations

[Organizations](organizations/index.html) are the root of the Akka management tree. All services and artifacts live inside of them. They are primarily a logical construct.

- [Managing organization users](organizations/manage-users.html)
- [Regions](organizations/regions.html)
- [Billing](organizations/billing.html)

## Projects

[Projects](projects/index.html) in Akka are the place where services are deployed to. They can span [Regions](organizations/regions.html) and are the central management point for operating groups of [Services](services/index.html) in Akka.

- [Create a new project](projects/create-project.html)
- [Managing project users](projects/manage-project-access.html)
- [Configure a container registry](projects/container-registries.html)

	- [Configure an external container registry](projects/external-container-registries.html)
- [Configure message brokers](projects/message-brokers.html)

	- [Aiven for Kafka](projects/broker-aiven.html)
	- [AWS MSK Kafka](projects/broker-aws-msk.html)
	- [Confluent Cloud](projects/broker-confluent.html)
	- [Google Pub/Sub](projects/broker-google-pubsub.html)

## Regions

Projects in Akka can span across [Regions](regions/index.html) with data automatically replicated between all the regions.

## CLI

Using the Akka CLI, you control all aspects of your Akka account from your command line. With it, you create and deploy new services, stream logs, and invite new developers to join your projects.

- [Install the Akka CLI](cli/installation.html)
- [Using the Akka CLI](cli/using-cli.html)
- [Enable CLI command completion](cli/command-completion.html)

## See Also

- [Akka Automated Operations product page](https://akka.io/automated-operations)
- [Demo: Surviving the split — how Akka handles disaster scenarios](https://akka.io/blog/demo-surviving-the-split-how-akka-handles-disaster-scenarios)
- [Demo: Recovering a completely destroyed region](https://akka.io/blog/demo-recovering-a-completely-destroyed-region)

## Related Pages (Internal Links)

- https://doc.akka.io/operations/cli/command-completion.html
- https://doc.akka.io/operations/cli/installation.html
- https://doc.akka.io/operations/cli/using-cli.html
- https://doc.akka.io/operations/integrating-cicd/index.html
- https://doc.akka.io/operations/observability-and-monitoring/index.html
- https://doc.akka.io/operations/observability-and-monitoring/metrics.html
- https://doc.akka.io/operations/observability-and-monitoring/observability-exports.html
- https://doc.akka.io/operations/observability-and-monitoring/traces.html
- https://doc.akka.io/operations/observability-and-monitoring/view-logs.html
- https://doc.akka.io/operations/organizations/billing.html
- https://doc.akka.io/operations/organizations/index.html
- https://doc.akka.io/operations/organizations/manage-users.html
- https://doc.akka.io/operations/organizations/regions.html
- https://doc.akka.io/operations/projects/broker-aiven.html
- https://doc.akka.io/operations/projects/broker-aws-msk.html
- https://doc.akka.io/operations/projects/broker-confluent.html
- https://doc.akka.io/operations/projects/broker-google-pubsub.html
- https://doc.akka.io/operations/projects/container-registries.html
- https://doc.akka.io/operations/projects/create-project.html
- https://doc.akka.io/operations/projects/external-container-registries.html
- https://doc.akka.io/operations/projects/index.html
- https://doc.akka.io/operations/projects/manage-project-access.html
- https://doc.akka.io/operations/projects/message-brokers.html
- https://doc.akka.io/operations/regions/index.html
- https://doc.akka.io/operations/services/data-management.html
- https://doc.akka.io/operations/services/deploy-service.html
- https://doc.akka.io/operations/services/index.html
- https://doc.akka.io/operations/services/invoke-service.html
- https://doc.akka.io/operations/services/view-data.html

---
*Source: [https://doc.akka.io/operations/akka-platform.html](https://doc.akka.io/operations/akka-platform.html)*