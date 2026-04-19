---
description: Akka 2.10.17 - akka.pki
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:48:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pki/index.html
title: Akka 2.10.17 - akka.pki
---

# Akka 2.10.17 - akka.pki

> **Summary:** Akka 2.10.17 - akka.pki

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
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
- [**](../../akka/pki/index.html "Permalink")  package pkiDefinition Classes[akka](../index.html)
- [**](../../akka/pki/pem/index.html "Permalink")  package [pem](pem/index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# pki[**](../../akka/pki/index.html "Permalink")

#### package pki

### Package Members

1. [**](../../akka/pki/pem/index.html "Permalink")  package [pem](pem/index.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/current/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/current/akka/event/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/io/index.html
- https://doc.akka.io/api/akka-core/current/akka/japi/index.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/current/akka/pki/index.html
- https://doc.akka.io/api/akka-core/current/akka/pki/pem/index.html
- https://doc.akka.io/api/akka-core/current/akka/remote/index.html
- https://doc.akka.io/api/akka-core/current/akka/routing/index.html
- https://doc.akka.io/api/akka-core/current/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/current/akka/stream/index.html
- https://doc.akka.io/api/akka-core/current/akka/testkit/index.html
- https://doc.akka.io/api/akka-core/current/akka/util/index.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/pki/index.html](https://doc.akka.io/api/akka-core/current/akka/pki/index.html)*