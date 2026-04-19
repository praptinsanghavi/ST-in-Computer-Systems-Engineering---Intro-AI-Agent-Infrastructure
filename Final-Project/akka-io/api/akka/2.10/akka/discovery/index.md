---
description: Akka 2.10.17 - akka.discovery
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:49:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/index.html
title: Akka 2.10.17 - akka.discovery
---

# Akka 2.10.17 - akka.discovery

> **Summary:** Akka 2.10.17 - akka.discovery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package discoveryDefinition Classes[akka](../index.html)
- [Discovery](Discovery.html)
- [Lookup](Lookup.html "A service lookup.")
- [ServiceDiscovery](ServiceDiscovery.html "Implement to provide a service discovery method")
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# discovery[**](../../akka/discovery/index.html "Permalink")

#### package discovery

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/discovery/Discovery.html "Permalink") final  class [Discovery](Discovery.html) extends [Extension](../actor/Extension.html)
2. [**](../../akka/discovery/Lookup.html "Permalink") final  class [Lookup](Lookup.html "A service lookup.") extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)A service lookup.

A service lookup. It is up to each method to decide
what to do with the optional portName and protocol fields.
For example `portName` could be used to distinguish between
Akka remoting ports and HTTP ports.
3. [**](../../akka/discovery/ServiceDiscovery.html "Permalink") abstract  class [ServiceDiscovery](ServiceDiscovery.html "Implement to provide a service discovery method") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Implement to provide a service discovery method
### Value Members

1. [**](../../akka/discovery/Discovery$.html "Permalink")  object [Discovery](Discovery$.html) extends [ExtensionId](../actor/ExtensionId.html)\[[Discovery](Discovery.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)
2. [**](../../akka/discovery/Lookup$.html "Permalink")  case object [Lookup](Lookup$.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../akka/discovery/ServiceDiscovery$.html "Permalink")  object [ServiceDiscovery](ServiceDiscovery$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka/2.10/akka/coordination/index.html
- https://doc.akka.io/api/akka/2.10/akka/discovery/Discovery$.html
- https://doc.akka.io/api/akka/2.10/akka/discovery/Discovery.html
- https://doc.akka.io/api/akka/2.10/akka/discovery/Lookup$.html
- https://doc.akka.io/api/akka/2.10/akka/discovery/Lookup.html
- https://doc.akka.io/api/akka/2.10/akka/discovery/ServiceDiscovery$.html
- https://doc.akka.io/api/akka/2.10/akka/discovery/ServiceDiscovery.html
- https://doc.akka.io/api/akka/2.10/akka/discovery/index.html
- https://doc.akka.io/api/akka/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka/2.10/akka/event/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/io/index.html
- https://doc.akka.io/api/akka/2.10/akka/japi/index.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.10/akka/pki/index.html
- https://doc.akka.io/api/akka/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka/2.10/akka/routing/index.html
- https://doc.akka.io/api/akka/2.10/akka/serialization/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/testkit/index.html
- https://doc.akka.io/api/akka/2.10/akka/util/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/discovery/index.html](https://doc.akka.io/api/akka/2.10/akka/discovery/index.html)*