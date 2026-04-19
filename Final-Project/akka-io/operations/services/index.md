---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:36:47Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/services/index.html
title: 'Services :: Akka Documentation'
---

# Services :: Akka Documentation

## Content

# Services

A *Service* is the core unit of deployment and scale in Akka. A service contains all the domain objects, components, and endpoints outlined in [Architecture](../../concepts/architecture-model.html). A service in Akka equates neatly to a microservice in general.

Akka *Services* are deployed to [Projects](../projects/index.html) where they run and are *grouped* with other services. Services are fundamentally managed independently in keeping with established microservice principles, though some operations at the project level will be performed on all services, they are not done in an atomic unit.

Services can be managed via the Akka CLI or the [Akka Console](https://console.akka.io). See [Deploy and manage services](deploy-service.html) for more on how to manage services.

- [Service configuration overrides](service-config.html)
- [Invoking Akka services](invoke-service.html)
- [Viewing data](view-data.html)
- [Data migration](data-management.html)
- [Configuring a custom JVM truststore](custom-truststore.html)

## Related Pages (Internal Links)

- https://doc.akka.io/concepts/architecture-model.html
- https://doc.akka.io/operations/projects/index.html
- https://doc.akka.io/operations/services/custom-truststore.html
- https://doc.akka.io/operations/services/data-management.html
- https://doc.akka.io/operations/services/deploy-service.html
- https://doc.akka.io/operations/services/invoke-service.html
- https://doc.akka.io/operations/services/service-config.html
- https://doc.akka.io/operations/services/view-data.html

---
*Source: [https://doc.akka.io/operations/services/index.html](https://doc.akka.io/operations/services/index.html)*