---
description: Akka Management 1.6.4 - akka.management
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-management/current/akka/management/index.html
title: Akka Management 1.6.4 - akka.management
---

# Akka Management 1.6.4 - akka.management

> **Summary:** Akka Management 1.6.4 - akka.management

## Content

Akka Management1\.6\.4 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/management/index.html "Permalink")  package managementDefinition Classes[akka](../index.html)
- [**](../../akka/management/cluster/index.html "Permalink")  package [cluster](cluster/index.html)
- [**](../../akka/management/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../akka/management/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../akka/management/loglevels/index.html "Permalink")  package [loglevels](loglevels/index.html)
- [**](../../akka/management/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [AkkaManagementSettings](AkkaManagementSettings.html)
- [HealthCheckSettings](HealthCheckSettings.html)
- [InvalidHealthCheckException](InvalidHealthCheckException.html)
- [ManagementLogMarker](ManagementLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [NamedHealthCheck](NamedHealthCheck.html)
- [NamedRouteProvider](NamedRouteProvider.html)
- [**](../../akka/rollingupdate/index.html "Permalink")  package [rollingupdate](../rollingupdate/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# management[**](../../akka/management/index.html "Permalink")

#### package management

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/management/cluster/index.html "Permalink")  package [cluster](cluster/index.html)
2. [**](../../akka/management/internal/index.html "Permalink")  package [internal](internal/index.html)
3. [**](../../akka/management/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
4. [**](../../akka/management/loglevels/index.html "Permalink")  package [loglevels](loglevels/index.html)
5. [**](../../akka/management/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../akka/management/AkkaManagementSettings.html "Permalink") final  class [AkkaManagementSettings](AkkaManagementSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../akka/management/HealthCheckSettings.html "Permalink") final  class [HealthCheckSettings](HealthCheckSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../akka/management/InvalidHealthCheckException.html "Permalink") final  class [InvalidHealthCheckException](InvalidHealthCheckException.html) extends RuntimeException
4. [**](../../akka/management/NamedHealthCheck.html "Permalink") final  case class [NamedHealthCheck](NamedHealthCheck.html)(name: String, fullyQualifiedClassName: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
5. [**](../../akka/management/NamedRouteProvider.html "Permalink") final  case class [NamedRouteProvider](NamedRouteProvider.html)(name: String, fullyQualifiedClassName: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../akka/management/HealthCheckSettings$.html "Permalink")  object [HealthCheckSettings](HealthCheckSettings$.html)
2. [**](../../akka/management/ManagementLogMarker$.html "Permalink")  object [ManagementLogMarker](ManagementLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")This is public with the purpose to document the used markers and properties of log events.

This is public with the purpose to document the used markers and properties of log events.
No guarantee that it will remain binary compatible, but the marker names and properties
are considered public API and will not be changed without notice.

Annotations@ApiMayChange()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-management/1.6.4/akka/cluster/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/coordination/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/discovery/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/AkkaManagementSettings.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/HealthCheckSettings$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/HealthCheckSettings.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/InvalidHealthCheckException.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/ManagementLogMarker$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/NamedHealthCheck.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/NamedRouteProvider.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/cluster/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/internal/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/javadsl/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/loglevels/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/rollingupdate/index.html
- https://doc.akka.io/api/akka-management/1.6.4/index.html

---
*Source: [https://doc.akka.io/api/akka-management/1.6.4/akka/management/index.html](https://doc.akka.io/api/akka-management/1.6.4/akka/management/index.html)*