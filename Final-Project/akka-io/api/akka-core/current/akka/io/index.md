---
description: Akka 2.10.17 - akka.io
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:48:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/index.html
title: Akka 2.10.17 - akka.io
---

# Akka 2.10.17 - akka.io

> **Summary:** Akka 2.10.17 - akka.io

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
- [**](../../akka/io/index.html "Permalink")  package ioDefinition Classes[akka](../index.html)
- [**](../../akka/io/dns/index.html "Permalink")  package [dns](dns/index.html)
- [BufferPool](BufferPool.html)
- [Dns](Dns.html "Not for user extension.")
- [DnsExt](DnsExt.html)
- [DnsProvider](DnsProvider.html "Where as it is possible to plug in alternative DNS implementations it is not recommended.")
- [IO](IO$.html "Entry point to Akka’s IO layer.")
- [Inet](Inet$.html)
- [InetAddressDnsProvider](InetAddressDnsProvider.html "INTERNAL API")
- [InetAddressDnsResolver](InetAddressDnsResolver.html "INTERNAL API")
- [IpVersionSelector](IpVersionSelector$.html "INTERNAL API")
- [SelectionHandlerSettings](SelectionHandlerSettings.html)
- [SimpleDnsCache](SimpleDnsCache.html)
- [SimpleDnsManager](SimpleDnsManager.html)
- [Tcp](Tcp$.html "TCP Extension for Akka’s IO layer.")
- [TcpExt](TcpExt.html)
- [TcpMessage](TcpMessage$.html)
- [TcpSO](TcpSO$.html "Java API for accessing socket options.")
- [Udp](Udp$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnected](UdpConnected$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnectedExt](UdpConnectedExt.html)
- [UdpConnectedMessage](UdpConnectedMessage$.html "Java API: factory methods for the message types used when communicating with the UdpConnected service.")
- [UdpExt](UdpExt.html)
- [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")
- [UdpSO](UdpSO$.html)
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

# io[**](../../akka/io/index.html "Permalink")

#### package io

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/io/dns/index.html "Permalink")  package [dns](dns/index.html)
### Type Members

1. [**](../../akka/io/BufferPool.html "Permalink")  trait [BufferPool](BufferPool.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../akka/io/Dns.html "Permalink") abstract  class [Dns](Dns.html "Not for user extension.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension.

Not for user extension.

This used to be a supported extension point but will be removed in future versions of Akka.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
3. [**](../../akka/io/DnsExt.html "Permalink")  class [DnsExt](DnsExt.html) extends [Extension](IO$$Extension.html)
4. [**](../../akka/io/InetAddressDnsProvider.html "Permalink")  class [InetAddressDnsProvider](InetAddressDnsProvider.html "INTERNAL API") extends [DnsProvider](DnsProvider.html)INTERNAL API

INTERNAL API

Annotations@nowarn() @[InternalApi](../annotation/InternalApi.html)()
5. [**](../../akka/io/InetAddressDnsResolver.html "Permalink")  class [InetAddressDnsResolver](InetAddressDnsResolver.html "INTERNAL API") extends [Actor](../actor/Actor.html) with [ActorLogging](../actor/ActorLogging.html)INTERNAL API

INTERNAL API

Respects the settings that can be set on the Java runtime via parameters.

Annotations@nowarn() @[InternalApi](../annotation/InternalApi.html)()
6. [**](../../akka/io/SelectionHandlerSettings.html "Permalink") abstract  class [SelectionHandlerSettings](SelectionHandlerSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../akka/io/SimpleDnsCache.html "Permalink")  class [SimpleDnsCache](SimpleDnsCache.html) extends [Dns](Dns.html) with PeriodicCacheCleanup with [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)
8. [**](../../akka/io/SimpleDnsManager.html "Permalink") final  class [SimpleDnsManager](SimpleDnsManager.html) extends [Actor](../actor/Actor.html) with [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[UnboundedMessageQueueSemantics](../dispatch/UnboundedMessageQueueSemantics.html)] with [ActorLogging](../actor/ActorLogging.html)
9. [**](../../akka/io/TcpExt.html "Permalink")  class [TcpExt](TcpExt.html) extends [Extension](IO$$Extension.html)
10. [**](../../akka/io/UdpConnectedExt.html "Permalink")  class [UdpConnectedExt](UdpConnectedExt.html) extends [Extension](IO$$Extension.html)
11. [**](../../akka/io/UdpExt.html "Permalink")  class [UdpExt](UdpExt.html) extends [Extension](IO$$Extension.html)
### Deprecated Type Members

1. [**](../../akka/io/DnsProvider.html "Permalink")  trait [DnsProvider](DnsProvider.html "Where as it is possible to plug in alternative DNS implementations it is not recommended.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Where as it is possible to plug in alternative DNS implementations it is not recommended.

Where as it is possible to plug in alternative DNS implementations it is not recommended.

It is expected that this will be deprecated/removed in future Akka versions

 TODO make private and remove deprecated in 2\.7\.0

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Overriding the DNS implementation will be removed in future versions of Akka
### Value Members

1. [**](../../akka/io/Dns$.html "Permalink")  object [Dns](Dns$.html) extends [ExtensionId](../actor/ExtensionId.html)\[[DnsExt](DnsExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)
2. [**](../../akka/io/IO$.html "Permalink")  object [IO](IO$.html "Entry point to Akka’s IO layer.")Entry point to Akka’s IO layer.

Entry point to Akka’s IO layer.

See also[the Akka online documentation](https://akka.io/docs/)
3. [**](../../akka/io/Inet$.html "Permalink")  object [Inet](Inet$.html)
4. [**](../../akka/io/IpVersionSelector$.html "Permalink")  object [IpVersionSelector](IpVersionSelector$.html "INTERNAL API")INTERNAL API

INTERNAL API

Annotations@[InternalApi](../annotation/InternalApi.html)()
5. [**](../../akka/io/SimpleDnsCache$.html "Permalink")  object [SimpleDnsCache](SimpleDnsCache$.html)
6. [**](../../akka/io/SimpleDnsManager$.html "Permalink")  object [SimpleDnsManager](SimpleDnsManager$.html)
7. [**](../../akka/io/Tcp$.html "Permalink")  object [Tcp](Tcp$.html "TCP Extension for Akka’s IO layer.") extends [ExtensionId](../actor/ExtensionId.html)\[[TcpExt](TcpExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)TCP Extension for Akka’s IO layer.

TCP Extension for Akka’s IO layer.

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

In order to open an outbound connection send a [Tcp.Connect](Tcp$$Connect.html) message
to the [TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef).

In order to start listening for inbound connections send a [Tcp.Bind](Tcp$$Bind.html)
message to the [TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef).

The Java API for generating TCP commands is available at [TcpMessage](TcpMessage$.html).
8. [**](../../akka/io/TcpMessage$.html "Permalink")  object [TcpMessage](TcpMessage$.html)
9. [**](../../akka/io/TcpSO$.html "Permalink")  object [TcpSO](TcpSO$.html "Java API for accessing socket options.") extends [SoJavaFactories](Inet$$SoJavaFactories.html)Java API for accessing socket options.
10. [**](../../akka/io/Udp$.html "Permalink")  object [Udp](Udp$.html "UDP Extension for Akka’s IO layer.") extends [ExtensionId](../actor/ExtensionId.html)\[[UdpExt](UdpExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)UDP Extension for Akka’s IO layer.

UDP Extension for Akka’s IO layer.

This extension implements the connectionless UDP protocol without
calling `connect` on the underlying sockets, i.e. without restricting
from whom data can be received. For “connected” UDP mode see [UdpConnected](UdpConnected$.html).

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

The Java API for generating UDP commands is available at [UdpMessage](UdpMessage$.html).
11. [**](../../akka/io/UdpConnected$.html "Permalink")  object [UdpConnected](UdpConnected$.html "UDP Extension for Akka’s IO layer.") extends [ExtensionId](../actor/ExtensionId.html)\[[UdpConnectedExt](UdpConnectedExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)UDP Extension for Akka’s IO layer.

UDP Extension for Akka’s IO layer.

This extension implements the connectionless UDP protocol with
calling `connect` on the underlying sockets, i.e. with restricting
from whom data can be received. For “unconnected” UDP mode see [Udp](Udp$.html).

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

The Java API for generating UDP commands is available at [UdpConnectedMessage](UdpConnectedMessage$.html).
12. [**](../../akka/io/UdpConnectedMessage$.html "Permalink")  object [UdpConnectedMessage](UdpConnectedMessage$.html "Java API: factory methods for the message types used when communicating with the UdpConnected service.")Java API: factory methods for the message types used when communicating with the UdpConnected service.
13. [**](../../akka/io/UdpMessage$.html "Permalink")  object [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")Java API: factory methods for the message types used when communicating with the Udp service.
14. [**](../../akka/io/UdpSO$.html "Permalink")  object [UdpSO](UdpSO$.html) extends [SoJavaFactories](Inet$$SoJavaFactories.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/current/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/current/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/current/akka/dispatch/UnboundedMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/current/akka/event/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/current/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/current/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/current/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/current/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/current/akka/io/IO$$Extension.html
- https://doc.akka.io/api/akka-core/current/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/current/akka/io/Inet$$SoJavaFactories.html
- https://doc.akka.io/api/akka-core/current/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/current/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/current/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/current/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/current/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/current/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/current/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/current/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/current/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/current/akka/io/Tcp$$Bind.html
- https://doc.akka.io/api/akka-core/current/akka/io/Tcp$$Connect.html
- https://doc.akka.io/api/akka-core/current/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/current/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/current/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/current/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/current/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/current/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/current/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/current/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/current/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/current/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/current/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/current/akka/io/dns/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/io/index.html](https://doc.akka.io/api/akka-core/current/akka/io/index.html)*