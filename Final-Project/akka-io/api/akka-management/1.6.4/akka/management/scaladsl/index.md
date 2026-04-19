---
description: Akka Management 1.6.4 - akka.management.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-management/current/akka/management/scaladsl/index.html
title: Akka Management 1.6.4 - akka.management.scaladsl
---

# Akka Management 1.6.4 - akka.management.scaladsl

> **Summary:** Akka Management 1.6.4 - akka.management.scaladsl

## Content

Akka Management1\.6\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/management/index.html "Permalink")  package [management](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/management/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[management](../index.html)
- [**](../../../akka/management/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[management](../index.html)
- [**](../../../akka/management/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[management](../index.html)
- [**](../../../akka/management/loglevels/index.html "Permalink")  package [loglevels](../loglevels/index.html)Definition Classes[management](../index.html)
- [**](../../../akka/management/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[management](../index.html)
- [AkkaManagement](AkkaManagement.html)
- [HealthChecks](HealthChecks.html "Not for user extension")
- [LivenessCheckSetup](LivenessCheckSetup.html "Setup for liveness checks, constructor is *Internal API*, use factories in LivenessCheckSetup")
- [ManagementRouteProvider](ManagementRouteProvider.html "Extend this trait in your extension in order to allow it to contribute routes to Akka Management starts its HTTP endpoint")
- [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html "Settings object used to pass through information about the environment the routes will be running in, from the component starting the actual HTTP server, to the ManagementRouteProvider")
- [ReadinessCheckSetup](ReadinessCheckSetup.html "Setup for readiness checks, constructor is *Internal API*, use factories in ReadinessCheckSetup")
p[akka](../../index.html).[management](../index.html)

# scaladsl[**](../../../akka/management/scaladsl/index.html "Permalink")

#### package scaladsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/management/scaladsl/AkkaManagement.html "Permalink") final  class [AkkaManagement](AkkaManagement.html) extends [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)
2. [**](../../../akka/management/scaladsl/HealthChecks.html "Permalink") abstract  class [HealthChecks](HealthChecks.html "Not for user extension") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension

Not for user extension

Annotations@DoNotInherit()
3. [**](../../../akka/management/scaladsl/LivenessCheckSetup.html "Permalink") final  class [LivenessCheckSetup](LivenessCheckSetup.html "Setup for liveness checks, constructor is *Internal API*, use factories in LivenessCheckSetup") extends [Setup](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/setup/Setup.html#akka.actor.setup.Setup)Setup for liveness checks, constructor is \*Internal API\*, use factories in [LivenessCheckSetup](LivenessCheckSetup.html)
4. [**](../../../akka/management/scaladsl/ManagementRouteProvider.html "Permalink")  trait [ManagementRouteProvider](ManagementRouteProvider.html "Extend this trait in your extension in order to allow it to contribute routes to Akka Management starts its HTTP endpoint") extends [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)Extend this trait in your extension in order to allow it to contribute routes to Akka Management starts its HTTP endpoint
5. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings.html "Permalink") sealed  trait [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html "Settings object used to pass through information about the environment the routes will be running in, from the component starting the actual HTTP server, to the ManagementRouteProvider") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Settings object used to pass through information about the environment the routes will be running in,
from the component starting the actual HTTP server, to the [ManagementRouteProvider](ManagementRouteProvider.html)

Settings object used to pass through information about the environment the routes will be running in,
from the component starting the actual HTTP server, to the [ManagementRouteProvider](ManagementRouteProvider.html)

Annotations@DoNotInherit()
6. [**](../../../akka/management/scaladsl/ReadinessCheckSetup.html "Permalink") final  class [ReadinessCheckSetup](ReadinessCheckSetup.html "Setup for readiness checks, constructor is *Internal API*, use factories in ReadinessCheckSetup") extends [Setup](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/setup/Setup.html#akka.actor.setup.Setup)Setup for readiness checks, constructor is \*Internal API\*, use factories in [ReadinessCheckSetup](ReadinessCheckSetup.html)
### Value Members

1. [**](../../../akka/management/scaladsl/AkkaManagement$.html "Permalink")  object [AkkaManagement](AkkaManagement$.html) extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[AkkaManagement](AkkaManagement.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)
2. [**](../../../akka/management/scaladsl/HealthChecks$.html "Permalink")  object [HealthChecks](HealthChecks$.html "Loads health checks from configuration and ActorSystem Setup")Loads health checks from configuration and ActorSystem Setup
3. [**](../../../akka/management/scaladsl/LivenessCheckSetup$.html "Permalink")  object [LivenessCheckSetup](LivenessCheckSetup$.html)
4. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html "Permalink")  object [ManagementRouteProviderSettings](ManagementRouteProviderSettings$.html)
5. [**](../../../akka/management/scaladsl/ReadinessCheckSetup$.html "Permalink")  object [ReadinessCheckSetup](ReadinessCheckSetup$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/cluster/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/internal/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/javadsl/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/loglevels/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/HealthChecks$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/HealthChecks.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/LivenessCheckSetup$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/LivenessCheckSetup.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ManagementRouteProvider.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ManagementRouteProviderSettings$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ManagementRouteProviderSettings.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ReadinessCheckSetup$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ReadinessCheckSetup.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/index.html
- https://doc.akka.io/api/akka-management/1.6.4/index.html

---
*Source: [https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/index.html](https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/index.html)*