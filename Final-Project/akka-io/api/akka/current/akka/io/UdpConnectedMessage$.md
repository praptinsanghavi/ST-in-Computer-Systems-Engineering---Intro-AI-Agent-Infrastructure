---
description: Akka 2.10.17 - akka.io.UdpConnectedMessage
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:40:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/UdpConnectedMessage$.html
title: Akka 2.10.17 - akka.io.UdpConnectedMessage
---

# Akka 2.10.17 - akka.io.UdpConnectedMessage

> **Summary:** Akka 2.10.17 - akka.io.UdpConnectedMessage

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
- UdpConnectedMessage
- [UdpExt](UdpExt.html)
- [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")
- [UdpSO](UdpSO$.html)
o[akka](../index.html).[io](index.html)

# UdpConnectedMessage[**](../../akka/io/UdpConnectedMessage$.html "Permalink")

### 

#### object UdpConnectedMessage

Java API: factory methods for the message types used when communicating with the UdpConnected service.

Source[UdpConnected.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/UdpConnected.scala#L180)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UdpConnectedMessage
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/UdpConnectedMessage$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/UdpConnectedMessage$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/UdpConnectedMessage$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/UdpConnectedMessage$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/io/UdpConnectedMessage$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/io/UdpConnectedMessage$.html#connect(handler:akka.actor.ActorRef,remoteAddress:java.net.InetSocketAddress):akka.io.UdpConnected.Command "Permalink")  def connect(handler: [ActorRef](../actor/ActorRef.html), remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Command](UdpConnected$$Command.html)Connect without specifying the `localAddress` or `options`.
7. [**](../../akka/io/UdpConnectedMessage$.html#connect(handler:akka.actor.ActorRef,remoteAddress:java.net.InetSocketAddress,options:Iterable[akka.io.Inet.SocketOption]):akka.io.UdpConnected.Command "Permalink")  def connect(handler: [ActorRef](../actor/ActorRef.html), remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](Inet$$SocketOption.html)]): [Command](UdpConnected$$Command.html)Connect without specifying the `localAddress`.
8. [**](../../akka/io/UdpConnectedMessage$.html#connect(handler:akka.actor.ActorRef,remoteAddress:java.net.InetSocketAddress,localAddress:java.net.InetSocketAddress,options:Iterable[akka.io.Inet.SocketOption]):akka.io.UdpConnected.Command "Permalink")  def connect(handler: [ActorRef](../actor/ActorRef.html), remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](Inet$$SocketOption.html)]): [Command](UdpConnected$$Command.html)Send this message to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) in order to bind to a local
port (optionally with the chosen `localAddress`) and create a UDP socket
which is restricted to sending to and receiving from the given `remoteAddress`.

Send this message to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) in order to bind to a local
port (optionally with the chosen `localAddress`) and create a UDP socket
which is restricted to sending to and receiving from the given `remoteAddress`.
All received datagrams will be sent to the designated `handler` actor.
9. [**](../../akka/io/UdpConnectedMessage$.html#disconnect:akka.io.UdpConnected.Command "Permalink")  def disconnect: [Command](UdpConnected$$Command.html)Send this message to a connection actor (which had previously sent the
[UdpConnected.Connected](UdpConnected$$Connected.html) message) in order to close the socket.

Send this message to a connection actor (which had previously sent the
[UdpConnected.Connected](UdpConnected$$Connected.html) message) in order to close the socket. The connection actor
will reply with a [UdpConnected.Disconnected](UdpConnected$$Disconnected.html) message.
10. [**](../../akka/io/UdpConnectedMessage$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../akka/io/UdpConnectedMessage$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../akka/io/UdpConnectedMessage$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/io/UdpConnectedMessage$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/UdpConnectedMessage$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/io/UdpConnectedMessage$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/io/UdpConnectedMessage$.html#noAck:akka.io.UdpConnected.NoAck "Permalink")  def noAck: [NoAck](UdpConnected$$NoAck.html)Default [UdpConnected.NoAck](UdpConnected$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided.

Default [UdpConnected.NoAck](UdpConnected$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided. Its “token” is `null`.
17. [**](../../akka/io/UdpConnectedMessage$.html#noAck(token:AnyRef):akka.io.UdpConnected.NoAck "Permalink")  def noAck(token: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [NoAck](UdpConnected$$NoAck.html)Each [UdpConnected.Send](UdpConnected$$Send.html) can optionally request a positive acknowledgment to be sent
to the commanding actor.

Each [UdpConnected.Send](UdpConnected$$Send.html) can optionally request a positive acknowledgment to be sent
to the commanding actor. If such notification is not desired the [UdpConnected.Send\#ack](UdpConnected$$Send.html#ack:Any)
must be set to an instance of this class. The token contained within can be used
to recognize which write failed when receiving a [UdpConnected.CommandFailed](UdpConnected$$CommandFailed.html) message.
18. [**](../../akka/io/UdpConnectedMessage$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/UdpConnectedMessage$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/UdpConnectedMessage$.html#resumeReading:akka.io.UdpConnected.Command "Permalink")  def resumeReading: [Command](UdpConnected$$Command.html)This message must be sent to the listener actor to re\-enable reading from
the socket after a `UdpConnected.SuspendReading` command.
21. [**](../../akka/io/UdpConnectedMessage$.html#send(data:akka.util.ByteString):akka.io.UdpConnected.Command "Permalink")  def send(data: [ByteString](../util/ByteString.html)): [Command](UdpConnected$$Command.html)Send without requesting acknowledgment.
22. [**](../../akka/io/UdpConnectedMessage$.html#send(data:akka.util.ByteString,ack:AnyRef):akka.io.UdpConnected.Command "Permalink")  def send(data: [ByteString](../util/ByteString.html), ack: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Command](UdpConnected$$Command.html)This message is understood by the connection actors to send data to their
designated destination.

This message is understood by the connection actors to send data to their
designated destination. The connection actor will respond with
[UdpConnected.CommandFailed](UdpConnected$$CommandFailed.html) if the send could not be enqueued to the O/S kernel
because the send buffer was full. If the given `ack` is not of type [UdpConnected.NoAck](UdpConnected$$NoAck.html)
the connection actor will reply with the given object as soon as the datagram
has been successfully enqueued to the O/S kernel.
23. [**](../../akka/io/UdpConnectedMessage$.html#suspendReading:akka.io.UdpConnected.Command "Permalink")  def suspendReading: [Command](UdpConnected$$Command.html)Send this message to a listener actor (which sent a [Udp.Bound](Udp$$Bound.html) message) to
have it stop reading datagrams from the network.

Send this message to a listener actor (which sent a [Udp.Bound](Udp$$Bound.html) message) to
have it stop reading datagrams from the network. If the O/S kernel’s receive
buffer runs full then subsequent datagrams will be silently discarded.
Re\-enable reading from the socket using the `UdpConnected.ResumeReading` command.
24. [**](../../akka/io/UdpConnectedMessage$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/io/UdpConnectedMessage$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../akka/io/UdpConnectedMessage$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/io/UdpConnectedMessage$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/io/UdpConnectedMessage$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/UdpConnectedMessage$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/BufferPool.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$.html
- https://doc.akka.io/api/akka/current/akka/io/Dns.html
- https://doc.akka.io/api/akka/current/akka/io/DnsExt.html
- https://doc.akka.io/api/akka/current/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka/current/akka/io/IO$.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SocketOption.html
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
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Bound.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Command.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$CommandFailed.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Connected.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Disconnected.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$NoAck.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Send.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpExt.html
- https://doc.akka.io/api/akka/current/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/index.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/akka/util/ByteString.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/UdpConnectedMessage$.html](https://doc.akka.io/api/akka/current/akka/io/UdpConnectedMessage$.html)*