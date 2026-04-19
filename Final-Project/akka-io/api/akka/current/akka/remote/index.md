---
description: Akka 2.10.17 - akka.remote
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:37:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/index.html
title: Akka 2.10.17 - akka.remote
---

# Akka 2.10.17 - akka.remote

> **Summary:** Akka 2.10.17 - akka.remote

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
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package remoteDefinition Classes[akka](../index.html)
- [**](../../akka/remote/artery/index.html "Permalink")  package [artery](artery/index.html)
- [**](../../akka/remote/routing/index.html "Permalink")  package [routing](routing/index.html)
- [**](../../akka/remote/serialization/index.html "Permalink")  package [serialization](serialization/index.html)
- [**](../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](testconductor/index.html)
- [**](../../akka/remote/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [AddressUidExtension](AddressUidExtension.html)
- [ArteryControlFormats](ArteryControlFormats.html)
- [BoundAddressesExtension](BoundAddressesExtension.html)
- [ContainerFormats](ContainerFormats.html)
- [DeadlineFailureDetector](DeadlineFailureDetector.html "Implementation of failure detector using an absolute timeout of missing heartbeats to trigger unavailability.")
- [DefaultFailureDetectorRegistry](DefaultFailureDetectorRegistry.html "A lock-less thread-safe implementation of akka.remote.FailureDetectorRegistry.")
- [FailureDetector](FailureDetector.html "A failure detector must be a thread-safe mutable construct that registers heartbeat events of a resource and is able to decide the availability of that monitored resource.")
- [FailureDetectorRegistry](FailureDetectorRegistry.html "Interface for a registry of Akka failure detectors.")
- [NotAllowedClassRemoteDeploymentAttemptException](NotAllowedClassRemoteDeploymentAttemptException.html "INTERNAL API")
- [PhiAccrualFailureDetector](PhiAccrualFailureDetector.html "Implementation of 'The Phi Accrual Failure Detector' by Hayashibara et al.")
- [RemoteLogMarker](RemoteLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [RemoteScope](RemoteScope.html)
- [RemoteSettings](RemoteSettings.html)
- [RemoteTransportException](RemoteTransportException.html "RemoteTransportException represents a general failure within a RemoteTransport, such as inability to start, wrong configuration etc.")
- [RemoteTransportExceptionNoStackTrace](RemoteTransportExceptionNoStackTrace.html "RemoteTransportException without stack trace.")
- [SystemMessageFormats](SystemMessageFormats.html)
- [UniqueAddress](UniqueAddress.html)
- [WireFormats](WireFormats.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# remote[**](../../akka/remote/index.html "Permalink")

#### package remote

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/remote/artery/index.html "Permalink")  package [artery](artery/index.html)
2. [**](../../akka/remote/routing/index.html "Permalink")  package [routing](routing/index.html)
3. [**](../../akka/remote/serialization/index.html "Permalink")  package [serialization](serialization/index.html)
4. [**](../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](testconductor/index.html)
5. [**](../../akka/remote/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
### Type Members

1. [**](../../akka/remote/ArteryControlFormats.html "Permalink") final  class [ArteryControlFormats](ArteryControlFormats.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../akka/remote/BoundAddressesExtension.html "Permalink")  class [BoundAddressesExtension](BoundAddressesExtension.html) extends [Extension](../actor/Extension.html)
3. [**](../../akka/remote/ContainerFormats.html "Permalink") final  class [ContainerFormats](ContainerFormats.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../akka/remote/DeadlineFailureDetector.html "Permalink")  class [DeadlineFailureDetector](DeadlineFailureDetector.html "Implementation of failure detector using an absolute timeout of missing heartbeats to trigger unavailability.") extends [FailureDetector](FailureDetector.html)Implementation of failure detector using an absolute timeout of missing heartbeats
to trigger unavailability.

Implementation of failure detector using an absolute timeout of missing heartbeats
to trigger unavailability.

[\#isAvailable](DeadlineFailureDetector.html#isAvailable:Boolean) will return `false` if there is no [\#heartbeat](DeadlineFailureDetector.html#heartbeat():Unit) within the duration
`heartbeatInterval + acceptableHeartbeatPause`.
5. [**](../../akka/remote/DefaultFailureDetectorRegistry.html "Permalink")  class [DefaultFailureDetectorRegistry](DefaultFailureDetectorRegistry.html "A lock-less thread-safe implementation of akka.remote.FailureDetectorRegistry.")\[A] extends [FailureDetectorRegistry](FailureDetectorRegistry.html)\[A]A lock\-less thread\-safe implementation of [akka.remote.FailureDetectorRegistry](FailureDetectorRegistry.html).
6. [**](../../akka/remote/FailureDetector.html "Permalink")  trait [FailureDetector](FailureDetector.html "A failure detector must be a thread-safe mutable construct that registers heartbeat events of a resource and is able to decide the availability of that monitored resource.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A failure detector must be a thread\-safe mutable construct that registers heartbeat events of a resource and is able to
decide the availability of that monitored resource.
7. [**](../../akka/remote/FailureDetectorRegistry.html "Permalink")  trait [FailureDetectorRegistry](FailureDetectorRegistry.html "Interface for a registry of Akka failure detectors.")\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Interface for a registry of Akka failure detectors.

Interface for a registry of Akka failure detectors. New resources are implicitly registered when heartbeat is first
called with the resource given as parameter.

type parameter A:

	- The type of the key that identifies a resource to be monitored by a failure detector
8. [**](../../akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html "Permalink") final  class [NotAllowedClassRemoteDeploymentAttemptException](NotAllowedClassRemoteDeploymentAttemptException.html "INTERNAL API") extends RuntimeExceptionINTERNAL API
9. [**](../../akka/remote/PhiAccrualFailureDetector.html "Permalink")  class [PhiAccrualFailureDetector](PhiAccrualFailureDetector.html "Implementation of 'The Phi Accrual Failure Detector' by Hayashibara et al.") extends [FailureDetector](FailureDetector.html)Implementation of 'The Phi Accrual Failure Detector' by Hayashibara et al.

Implementation of 'The Phi Accrual Failure Detector' by Hayashibara et al. as defined in their paper:
\[https://oneofus.la/have\-emacs\-will\-hack/files/HDY04\.pdf]

The suspicion level of failure is given by a value called φ (phi).
The basic idea of the φ failure detector is to express the value of φ on a scale that
is dynamically adjusted to reflect current network conditions. A configurable
threshold is used to decide if φ is considered to be a failure.

The value of φ is calculated as:

```
φ = -log10(1 - F(timeSinceLastHeartbeat)
```
where F is the cumulative distribution function of a normal distribution with mean
and standard deviation estimated from historical heartbeat inter\-arrival times.
10. [**](../../akka/remote/RemoteScope.html "Permalink") final  case class [RemoteScope](RemoteScope.html)(node: [Address](../actor/Address.html)) extends [Scope](../actor/Scope.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
11. [**](../../akka/remote/RemoteSettings.html "Permalink") final  class [RemoteSettings](RemoteSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../akka/remote/RemoteTransportException.html "Permalink")  class [RemoteTransportException](RemoteTransportException.html "RemoteTransportException represents a general failure within a RemoteTransport, such as inability to start, wrong configuration etc.") extends [AkkaException](../AkkaException.html)RemoteTransportException represents a general failure within a RemoteTransport,
such as inability to start, wrong configuration etc.

RemoteTransportException represents a general failure within a RemoteTransport,
such as inability to start, wrong configuration etc.

Annotations@SerialVersionUID()
13. [**](../../akka/remote/RemoteTransportExceptionNoStackTrace.html "Permalink")  class [RemoteTransportExceptionNoStackTrace](RemoteTransportExceptionNoStackTrace.html "RemoteTransportException without stack trace.") extends [RemoteTransportException](RemoteTransportException.html) with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)[RemoteTransportException](RemoteTransportException.html) without stack trace.

[RemoteTransportException](RemoteTransportException.html) without stack trace.

Annotations@SerialVersionUID()
14. [**](../../akka/remote/SystemMessageFormats.html "Permalink") final  class [SystemMessageFormats](SystemMessageFormats.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
15. [**](../../akka/remote/UniqueAddress.html "Permalink") final  case class [UniqueAddress](UniqueAddress.html)(address: [Address](../actor/Address.html), uid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends Ordered\[[UniqueAddress](UniqueAddress.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
16. [**](../../akka/remote/WireFormats.html "Permalink") final  class [WireFormats](WireFormats.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Deprecated Type Members

1. [**](../../akka/remote/AddressUidExtension.html "Permalink")  class [AddressUidExtension](AddressUidExtension.html) extends [Extension](../actor/Extension.html)Annotations@deprecated Deprecated*(Since version 2\.8\.0\)* Use ExtendedActorSystem.uid instead.
### Value Members

1. [**](../../akka/remote/BoundAddressesExtension$.html "Permalink")  object [BoundAddressesExtension](BoundAddressesExtension$.html "Extension provides access to bound addresses.") extends [ExtensionId](../actor/ExtensionId.html)\[[BoundAddressesExtension](BoundAddressesExtension.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Extension provides access to bound addresses.
2. [**](../../akka/remote/FailureDetector$.html "Permalink")  object [FailureDetector](FailureDetector$.html)
3. [**](../../akka/remote/RemoteLogMarker$.html "Permalink")  object [RemoteLogMarker](RemoteLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")This is public with the purpose to document the used markers and properties of log events.

This is public with the purpose to document the used markers and properties of log events.
No guarantee that it will remain binary compatible, but the marker names and properties
are considered public API and will not be changed without notice.
### Deprecated Value Members

1. [**](../../akka/remote/AddressUidExtension$.html "Permalink")  object [AddressUidExtension](AddressUidExtension$.html "Extension that holds a uid that is assigned as a random Long.") extends [ExtensionId](../actor/ExtensionId.html)\[[AddressUidExtension](AddressUidExtension.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Extension that holds a uid that is assigned as a random `Long`.

Extension that holds a uid that is assigned as a random `Long`.

The uid is intended to be used together with an [akka.actor.Address](../actor/Address.html)
to be able to distinguish restarted actor system using the same host
and port.

Annotations@deprecated Deprecated*(Since version 2\.8\.0\)* Use ExtendedActorSystem.uid instead.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/AkkaException.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/Scope.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/index.html
- https://doc.akka.io/api/akka/current/akka/discovery/index.html
- https://doc.akka.io/api/akka/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka/current/akka/event/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/akka/japi/index.html
- https://doc.akka.io/api/akka/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/current/akka/pattern/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/pki/index.html
- https://doc.akka.io/api/akka/current/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/api/akka/current/akka/remote/AddressUidExtension.html
- https://doc.akka.io/api/akka/current/akka/remote/ArteryControlFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/BoundAddressesExtension$.html
- https://doc.akka.io/api/akka/current/akka/remote/BoundAddressesExtension.html
- https://doc.akka.io/api/akka/current/akka/remote/ContainerFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/DeadlineFailureDetector.html
- https://doc.akka.io/api/akka/current/akka/remote/DefaultFailureDetectorRegistry.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetector$.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetector.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/api/akka/current/akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html
- https://doc.akka.io/api/akka/current/akka/remote/PhiAccrualFailureDetector.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteScope.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteSettings.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteTransportException.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteTransportExceptionNoStackTrace.html
- https://doc.akka.io/api/akka/current/akka/remote/SystemMessageFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/api/akka/current/akka/remote/WireFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/routing/index.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/routing/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/index.html](https://doc.akka.io/api/akka/current/akka/remote/index.html)*