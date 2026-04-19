---
description: Akka 2.10.17 - akka.coordination.lease
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/coordination/lease/index.html
title: Akka 2.10.17 - akka.coordination.lease
---

# Akka 2.10.17 - akka.coordination.lease

> **Summary:** Akka 2.10.17 - akka.coordination.lease

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/coordination/index.html "Permalink")  package [coordination](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/coordination/lease/index.html "Permalink")  package leaseDefinition Classes[coordination](../index.html)
- [**](../../../akka/coordination/lease/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../akka/coordination/lease/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [LeaseException](LeaseException.html)
- [LeaseSettings](LeaseSettings.html)
- [LeaseTimeoutException](LeaseTimeoutException.html)
- [LeaseUsageSettings](LeaseUsageSettings.html)
- [TimeoutSettings](TimeoutSettings.html)
p[akka](../../index.html).[coordination](../index.html)

# lease[**](../../../akka/coordination/lease/index.html "Permalink")

#### package lease

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/coordination/lease/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
2. [**](../../../akka/coordination/lease/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../../akka/coordination/lease/LeaseException.html "Permalink")  class [LeaseException](LeaseException.html) extends RuntimeException
2. [**](../../../akka/coordination/lease/LeaseSettings.html "Permalink") final  class [LeaseSettings](LeaseSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../akka/coordination/lease/LeaseTimeoutException.html "Permalink") final  class [LeaseTimeoutException](LeaseTimeoutException.html) extends [LeaseException](LeaseException.html)
4. [**](../../../akka/coordination/lease/LeaseUsageSettings.html "Permalink") final  class [LeaseUsageSettings](LeaseUsageSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../akka/coordination/lease/TimeoutSettings.html "Permalink") final  class [TimeoutSettings](TimeoutSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../akka/coordination/lease/LeaseSettings$.html "Permalink")  object [LeaseSettings](LeaseSettings$.html)
2. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html "Permalink")  object [LeaseUsageSettings](LeaseUsageSettings$.html "Note that if you define a custom lease name and have several Cluster Singletons or Cluster Sharding entity types each one must have a unique lease name.")Note that if you define a custom lease name and have several Cluster Singletons or Cluster Sharding
entity types each one must have a unique lease name.

Note that if you define a custom lease name and have several Cluster Singletons or Cluster Sharding
entity types each one must have a unique lease name. If the lease name is undefined it will be derived
from ActorSystem name and other component names, but that may result in too long lease names.
3. [**](../../../akka/coordination/lease/TimeoutSettings$.html "Permalink")  object [TimeoutSettings](TimeoutSettings$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseException.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/TimeoutSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/TimeoutSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/index.html](https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/index.html)*