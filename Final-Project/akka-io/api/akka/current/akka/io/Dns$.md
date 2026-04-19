---
description: Akka 2.10.17 - akka.io.Dns
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:39:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Dns$.html
title: Akka 2.10.17 - akka.io.Dns
---

# Akka 2.10.17 - akka.io.Dns

> **Summary:** Akka 2.10.17 - akka.io.Dns

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/dns/index.html "Permalink")  package [dns](dns/index.html)Definition Classes[io](index.html)
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
[o](Dns.html "See companion class")[akka](../index.html).[io](index.html)

# [Dns](Dns.html "See companion class")[**](../../akka/io/Dns$.html "Permalink")

### Companion [class Dns](Dns.html "See companion class")

#### object Dns extends [ExtensionId](../actor/ExtensionId.html)\[[DnsExt](DnsExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

Source[Dns.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Dns.scala#L63)Linear Supertypes[ExtensionIdProvider](../actor/ExtensionIdProvider.html), [ExtensionId](../actor/ExtensionId.html)\[[DnsExt](DnsExt.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Dns
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/io/Dns$$Command.html "Permalink") sealed  trait [Command](Dns$$Command.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Deprecated Type Members

1. [**](../../akka/io/Dns$$Resolve.html "Permalink")  case class [Resolve](Dns$$Resolve.html)(name: String) extends [Command](Dns$$Command.html) with [ConsistentHashable](../routing/ConsistentHashingRouter$$ConsistentHashable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use cached(DnsProtocol.Resolve)
2. [**](../../akka/io/Dns$$Resolved.html "Permalink")  case class [Resolved](Dns$$Resolved.html)(name: String, ipv4: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inet4Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet4Address.html#java.net.Inet4Address)], ipv6: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inet6Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet6Address.html#java.net.Inet6Address)]) extends [Command](Dns$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use cached(DnsProtocol.Resolved)
### Value Members

1. [**](../../akka/io/Dns$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Dns$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Dns$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/Dns$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [DnsExt](DnsExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
5. [**](../../akka/io/Dns$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../actor/ActorSystem.html)): [DnsExt](DnsExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
6. [**](../../akka/io/Dns$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/Dns$.html#cached(name:akka.io.dns.DnsProtocol.Resolve)(system:akka.actor.ActorSystem):Option[akka.io.dns.DnsProtocol.Resolved] "Permalink")  def cached(name: [dns.DnsProtocol.Resolve](dns/DnsProtocol$$Resolve.html))(system: [ActorSystem](../actor/ActorSystem.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[dns.DnsProtocol.Resolved](dns/DnsProtocol$$Resolved.html)]Lookup if a DNS resolved is cached.

Lookup if a DNS resolved is cached. The exact behavior of caching will depend on
the akka.actor.io.dns.resolver that is configured.
8. [**](../../akka/io/Dns$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/io/Dns$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.io.DnsExt "Permalink")  def createExtension(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)): [DnsExt](DnsExt.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesDns → [ExtensionId](../actor/ExtensionId.html)
10. [**](../../akka/io/Dns$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../akka/io/Dns$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
12. [**](../../akka/io/Dns$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.io.DnsExt "Permalink")  def get(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [DnsExt](DnsExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesDns → [ExtensionId](../actor/ExtensionId.html)
13. [**](../../akka/io/Dns$.html#get(system:akka.actor.ActorSystem):akka.io.DnsExt "Permalink")  def get(system: [ActorSystem](../actor/ActorSystem.html)): [DnsExt](DnsExt.html)Java API: retrieve the Udp extension for the given system.

Java API: retrieve the Udp extension for the given system.

Definition ClassesDns → [ExtensionId](../actor/ExtensionId.html)
14. [**](../../akka/io/Dns$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/io/Dns$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
16. [**](../../akka/io/Dns$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/io/Dns$.html#lookup:akka.io.Dns.type "Permalink")  def lookup: DnsReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesDns → [ExtensionIdProvider](../actor/ExtensionIdProvider.html)
18. [**](../../akka/io/Dns$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/io/Dns$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/Dns$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/io/Dns$.html#resolve(name:akka.io.dns.DnsProtocol.Resolve,system:akka.actor.ActorSystem,sender:akka.actor.ActorRef):Option[akka.io.dns.DnsProtocol.Resolved] "Permalink")  def resolve(name: [dns.DnsProtocol.Resolve](dns/DnsProtocol$$Resolve.html), system: [ActorSystem](../actor/ActorSystem.html), sender: [ActorRef](../actor/ActorRef.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[dns.DnsProtocol.Resolved](dns/DnsProtocol$$Resolved.html)]If an entry is cached return it immediately.

If an entry is cached return it immediately. If it is not then
trigger a resolve and return None.
22. [**](../../akka/io/Dns$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/io/Dns$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/io/Dns$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/io/Dns$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/io/Dns$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Dns$.html#cached(name:String)(system:akka.actor.ActorSystem):Option[akka.io.Dns.Resolved] "Permalink")  def cached(name: String)(system: [ActorSystem](../actor/ActorSystem.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](Dns$$Resolved.html)]Lookup if a DNS resolved is cached.

Lookup if a DNS resolved is cached. The exact behavior of caching will depend on
the akka.actor.io.dns.resolver that is configured.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* use cached(DnsProtocol.Resolve)
2. [**](../../akka/io/Dns$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../akka/io/Dns$.html#resolve(name:String)(system:akka.actor.ActorSystem,sender:akka.actor.ActorRef):Option[akka.io.Dns.Resolved] "Permalink")  def resolve(name: String)(system: [ActorSystem](../actor/ActorSystem.html), sender: [ActorRef](../actor/ActorRef.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](Dns$$Resolved.html)]If an entry is cached return it immediately.

If an entry is cached return it immediately. If it is not then
trigger a resolve and return None.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* use resolve(DnsProtocol.Resolve)
4. [**](../../akka/io/Dns$$Resolved$.html "Permalink")  object [Resolved](Dns$$Resolved$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use cached(DnsProtocol.Resolved)
### Inherited from [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../actor/ExtensionId.html)\[[DnsExt](DnsExt.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/BufferPool.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Command.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolve.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved$.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$.html
- https://doc.akka.io/api/akka/current/akka/io/Dns.html
- https://doc.akka.io/api/akka/current/akka/io/DnsExt.html
- https://doc.akka.io/api/akka/current/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka/current/akka/io/IO$.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$.html
- https://doc.akka.io/api/akka/current/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka/current/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka/current/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka/current/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka/current/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka/current/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka/current/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka/current/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka/current/akka/io/Tcp$.html
- https://doc.akka.io/api/akka/current/akka/io/TcpExt.html
- https://doc.akka.io/api/akka/current/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka/current/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpExt.html
- https://doc.akka.io/api/akka/current/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$Resolve.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$Resolved.html
- https://doc.akka.io/api/akka/current/akka/io/dns/index.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/Dns$.html](https://doc.akka.io/api/akka/current/akka/io/Dns$.html)*