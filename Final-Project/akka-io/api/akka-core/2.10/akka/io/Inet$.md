---
description: Akka 2.10.17 - akka.io.Inet
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Inet$.html
title: Akka 2.10.17 - akka.io.Inet
---

# Akka 2.10.17 - akka.io.Inet

> **Summary:** Akka 2.10.17 - akka.io.Inet

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
- Inet
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
o[akka](../index.html).[io](index.html)

# Inet[**](../../akka/io/Inet$.html "Permalink")

### 

#### object Inet

Source[Inet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Inet.scala#L12)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Inet
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/io/Inet$$AbstractSocketOption.html "Permalink") abstract  class [AbstractSocketOption](Inet$$AbstractSocketOption.html "Java API: AbstractSocketOption is a package of data (from the user) and associated behavior (how to apply that to a channel).") extends [SocketOption](Inet$$SocketOption.html)Java API: AbstractSocketOption is a package of data (from the user) and associated
behavior (how to apply that to a channel).
2. [**](../../akka/io/Inet$$AbstractSocketOptionV2.html "Permalink") abstract  class [AbstractSocketOptionV2](Inet$$AbstractSocketOptionV2.html "Java API") extends [SocketOptionV2](Inet$$SocketOptionV2.html)Java API
3. [**](../../akka/io/Inet$$DatagramChannelCreator.html "Permalink")  class [DatagramChannelCreator](Inet$$DatagramChannelCreator.html "DatagramChannel creation behavior.") extends [SocketOption](Inet$$SocketOption.html)DatagramChannel creation behavior.
4. [**](../../akka/io/Inet$$SoForwarders.html "Permalink")  trait [SoForwarders](Inet$$SoForwarders.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../akka/io/Inet$$SoJavaFactories.html "Permalink")  trait [SoJavaFactories](Inet$$SoJavaFactories.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../akka/io/Inet$$SocketOption.html "Permalink")  trait [SocketOption](Inet$$SocketOption.html "SocketOption is a package of data (from the user) and associated behavior (how to apply that to a channel).") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)SocketOption is a package of data (from the user) and associated
behavior (how to apply that to a channel).
7. [**](../../akka/io/Inet$$SocketOptionV2.html "Permalink")  trait [SocketOptionV2](Inet$$SocketOptionV2.html) extends [SocketOption](Inet$$SocketOption.html)
### Value Members

1. [**](../../akka/io/Inet$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Inet$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Inet$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/Inet$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/io/Inet$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/io/Inet$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/io/Inet$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/io/Inet$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/io/Inet$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/io/Inet$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/io/Inet$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/io/Inet$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/io/Inet$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/Inet$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/io/Inet$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/io/Inet$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/io/Inet$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../akka/io/Inet$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/io/Inet$$DatagramChannelCreator$.html "Permalink")  object [DatagramChannelCreator](Inet$$DatagramChannelCreator$.html)
20. [**](../../akka/io/Inet$$SO$.html "Permalink")  object [SO](Inet$$SO$.html)
### Deprecated Value Members

1. [**](../../akka/io/Inet$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$AbstractSocketOption.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$AbstractSocketOptionV2.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$DatagramChannelCreator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$DatagramChannelCreator.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SoForwarders.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SoJavaFactories.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SocketOptionV2.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$.html](https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$.html)*