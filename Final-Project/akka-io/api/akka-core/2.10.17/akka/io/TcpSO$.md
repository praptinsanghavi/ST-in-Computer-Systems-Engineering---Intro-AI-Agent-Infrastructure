---
description: Akka 2.10.17 - akka.io.TcpSO
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:03:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/TcpSO$.html
title: Akka 2.10.17 - akka.io.TcpSO
---

# Akka 2.10.17 - akka.io.TcpSO

> **Summary:** Akka 2.10.17 - akka.io.TcpSO

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
- TcpSO
- [Udp](Udp$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnected](UdpConnected$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnectedExt](UdpConnectedExt.html)
- [UdpConnectedMessage](UdpConnectedMessage$.html "Java API: factory methods for the message types used when communicating with the UdpConnected service.")
- [UdpExt](UdpExt.html)
- [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")
- [UdpSO](UdpSO$.html)
o[akka](../index.html).[io](index.html)

# TcpSO[**](../../akka/io/TcpSO$.html "Permalink")

### 

#### object TcpSO extends [SoJavaFactories](Inet$$SoJavaFactories.html)

Java API for accessing socket options.

Source[Tcp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Tcp.scala#L663)Linear Supertypes[SoJavaFactories](Inet$$SoJavaFactories.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TcpSO
2. SoJavaFactories
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/TcpSO$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/TcpSO$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/TcpSO$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/TcpSO$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/io/TcpSO$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/io/TcpSO$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/io/TcpSO$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/io/TcpSO$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/io/TcpSO$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/io/TcpSO$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/io/TcpSO$.html#keepAlive(on:Boolean):akka.io.Tcp.SO.KeepAlive "Permalink")  def keepAlive(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [KeepAlive](Tcp$$SO$$KeepAlive.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable SO\_KEEPALIVE

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable SO\_KEEPALIVE

For more information see `java.net.Socket.setKeepAlive`
12. [**](../../akka/io/TcpSO$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/io/TcpSO$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/TcpSO$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/io/TcpSO$.html#oobInline(on:Boolean):akka.io.Tcp.SO.OOBInline "Permalink")  def oobInline(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [OOBInline](Tcp$$SO$$OOBInline.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable OOBINLINE (receipt
of TCP urgent data) By default, this option is disabled and TCP urgent
data is silently discarded.

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable OOBINLINE (receipt
of TCP urgent data) By default, this option is disabled and TCP urgent
data is silently discarded.

For more information see `java.net.Socket.setOOBInline`
16. [**](../../akka/io/TcpSO$.html#receiveBufferSize(size:Int):akka.io.Inet.SO.ReceiveBufferSize "Permalink")  def receiveBufferSize(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ReceiveBufferSize](Inet$$SO$$ReceiveBufferSize.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_RCVBUF option

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_RCVBUF option

For more information see [java.net.Socket\#setReceiveBufferSize](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setReceiveBufferSize(x$1:Int):Unit)

Definition Classes[SoJavaFactories](Inet$$SoJavaFactories.html)
17. [**](../../akka/io/TcpSO$.html#reuseAddress(on:Boolean):akka.io.Inet.SO.ReuseAddress "Permalink")  def reuseAddress(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ReuseAddress](Inet$$SO$$ReuseAddress.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable SO\_REUSEADDR

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable SO\_REUSEADDR

For more information see [java.net.Socket\#setReuseAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setReuseAddress(x$1:Boolean):Unit)

Definition Classes[SoJavaFactories](Inet$$SoJavaFactories.html)
18. [**](../../akka/io/TcpSO$.html#sendBufferSize(size:Int):akka.io.Inet.SO.SendBufferSize "Permalink")  def sendBufferSize(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [SendBufferSize](Inet$$SO$$SendBufferSize.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_SNDBUF option.

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_SNDBUF option.

For more information see [java.net.Socket\#setSendBufferSize](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setSendBufferSize(x$1:Int):Unit)

Definition Classes[SoJavaFactories](Inet$$SoJavaFactories.html)
19. [**](../../akka/io/TcpSO$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../akka/io/TcpSO$.html#tcpNoDelay(on:Boolean):akka.io.Tcp.SO.TcpNoDelay "Permalink")  def tcpNoDelay(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [TcpNoDelay](Tcp$$SO$$TcpNoDelay.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable TCP\_NODELAY
(disable or enable Nagle's algorithm)

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable TCP\_NODELAY
(disable or enable Nagle's algorithm)

Please note, that TCP\_NODELAY is enabled by default.

For more information see `java.net.Socket.setTcpNoDelay`
21. [**](../../akka/io/TcpSO$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/io/TcpSO$.html#trafficClass(tc:Int):akka.io.Inet.SO.TrafficClass "Permalink")  def trafficClass(tc: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [TrafficClass](Inet$$SO$$TrafficClass.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the traffic class or
type\-of\-service octet in the IP header for packets sent from this
socket.

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the traffic class or
type\-of\-service octet in the IP header for packets sent from this
socket.

For more information see [java.net.Socket\#setTrafficClass](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setTrafficClass(x$1:Int):Unit)

Definition Classes[SoJavaFactories](Inet$$SoJavaFactories.html)
23. [**](../../akka/io/TcpSO$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/io/TcpSO$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/io/TcpSO$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/TcpSO$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [SoJavaFactories](Inet$$SoJavaFactories.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Inet$$SO$$ReceiveBufferSize.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Inet$$SO$$ReuseAddress.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Inet$$SO$$SendBufferSize.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Inet$$SO$$TrafficClass.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Inet$$SoJavaFactories.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$SO$$KeepAlive.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$SO$$OOBInline.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$SO$$TcpNoDelay.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpSO$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpSO$.html)*