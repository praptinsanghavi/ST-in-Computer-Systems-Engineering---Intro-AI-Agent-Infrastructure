---
description: Akka 2.10.17 - akka.remote.artery
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:43:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/index.html
title: Akka 2.10.17 - akka.remote.artery
---

# Akka 2.10.17 - akka.remote.artery

> **Summary:** Akka 2.10.17 - akka.remote.artery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/artery/index.html "Permalink")  package arteryDefinition Classes[remote](../index.html)
- [**](../../../akka/remote/artery/aeron/index.html "Permalink")  package [aeron](aeron/index.html)
- [**](../../../akka/remote/artery/compress/index.html "Permalink")  package [compress](compress/index.html)
- [**](../../../akka/remote/artery/jfr/index.html "Permalink")  package [jfr](jfr/index.html)
- [**](../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](tcp/index.html)
- [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html)
- [QuarantinedEvent](QuarantinedEvent.html)
- [RemoteInstrument](RemoteInstrument.html "INTERNAL API")
- [RemotingFlightRecorder](RemotingFlightRecorder$.html "INTERNAL API")
- [TestManagementCommands](TestManagementCommands$.html)
- [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html)
- [**](../../../akka/remote/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](../testconductor/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[remote](../index.html)
p[akka](../../index.html).[remote](../index.html)

# artery[**](../../../akka/remote/artery/index.html "Permalink")

#### package artery

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/remote/artery/aeron/index.html "Permalink")  package [aeron](aeron/index.html)
2. [**](../../../akka/remote/artery/compress/index.html "Permalink")  package [compress](compress/index.html)
3. [**](../../../akka/remote/artery/jfr/index.html "Permalink")  package [jfr](jfr/index.html)
4. [**](../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](tcp/index.html)
### Type Members

1. [**](../../../akka/remote/artery/GracefulShutdownQuarantinedEvent.html "Permalink") final  case class [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html)(uniqueAddress: [UniqueAddress](../UniqueAddress.html), reason: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../akka/remote/artery/QuarantinedEvent.html "Permalink") final  case class [QuarantinedEvent](QuarantinedEvent.html)(uniqueAddress: [UniqueAddress](../UniqueAddress.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../akka/remote/artery/RemoteInstrument.html "Permalink") abstract  class [RemoteInstrument](RemoteInstrument.html "INTERNAL API") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)INTERNAL API

INTERNAL API

Part of the monitoring SPI which allows attaching metadata to outbound remote messages,
and reading in metadata from incoming messages.

Multiple instruments are automatically handled, however they MUST NOT overlap in their idenfitiers.

Instances of `RemoteInstrument` are created from configuration. A new instance of RemoteInstrument
will be created for each encoder and decoder. It's only called from the operator, so if it doesn't
delegate to any shared instance it doesn't have to be thread\-safe.
4. [**](../../../akka/remote/artery/ThisActorSystemQuarantinedEvent.html "Permalink") final  case class [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html)(localAddress: [UniqueAddress](../UniqueAddress.html), remoteAddress: [UniqueAddress](../UniqueAddress.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../akka/remote/artery/RemotingFlightRecorder$.html "Permalink")  object [RemotingFlightRecorder](RemotingFlightRecorder$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)()
2. [**](../../../akka/remote/artery/TestManagementCommands$.html "Permalink")  object [TestManagementCommands](TestManagementCommands$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/GracefulShutdownQuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/QuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/RemoteInstrument.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/RemotingFlightRecorder$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/TestManagementCommands$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/ThisActorSystemQuarantinedEvent.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/aeron/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/compress/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/jfr/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/routing/index.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/artery/index.html](https://doc.akka.io/api/akka/current/akka/remote/artery/index.html)*