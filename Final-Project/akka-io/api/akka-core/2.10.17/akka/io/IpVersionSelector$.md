---
description: Akka 2.10.17 - akka.io.IpVersionSelector
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:03:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/IpVersionSelector$.html
title: Akka 2.10.17 - akka.io.IpVersionSelector
---

# Akka 2.10.17 - akka.io.IpVersionSelector

> **Summary:** Akka 2.10.17 - akka.io.IpVersionSelector

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
- IpVersionSelector
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
o[akka](../index.html).[io](index.html)

# IpVersionSelector[**](../../akka/io/IpVersionSelector$.html "Permalink")

### 

#### object IpVersionSelector

INTERNAL API

Annotations@[InternalApi](../annotation/InternalApi.html)() Source[Dns.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Dns.scala#L242)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. IpVersionSelector
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/IpVersionSelector$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/IpVersionSelector$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/IpVersionSelector$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/IpVersionSelector$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/io/IpVersionSelector$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/io/IpVersionSelector$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/io/IpVersionSelector$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/io/IpVersionSelector$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/io/IpVersionSelector$.html#getInetAddress(ipv4:Option[java.net.Inet4Address],ipv6:Option[java.net.Inet6Address]):Option[java.net.InetAddress] "Permalink")  def getInetAddress(ipv4: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Inet4Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet4Address.html#java.net.Inet4Address)], ipv6: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Inet6Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet6Address.html#java.net.Inet6Address)]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]INTERNAL API

INTERNAL API

Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/io/IpVersionSelector$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/io/IpVersionSelector$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../akka/io/IpVersionSelector$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/io/IpVersionSelector$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/IpVersionSelector$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/io/IpVersionSelector$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/io/IpVersionSelector$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../akka/io/IpVersionSelector$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/io/IpVersionSelector$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../akka/io/IpVersionSelector$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/IpVersionSelector$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/io/IpVersionSelector$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/io/IpVersionSelector$.html)*