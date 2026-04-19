---
description: Akka 2.10.17 - akka.io.UdpMessage
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:03:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/UdpMessage$.html
title: Akka 2.10.17 - akka.io.UdpMessage
---

# Akka 2.10.17 - akka.io.UdpMessage

> **Summary:** Akka 2.10.17 - akka.io.UdpMessage

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
- UdpMessage
- [UdpSO](UdpSO$.html)
o[akka](../index.html).[io](index.html)

# UdpMessage[**](../../akka/io/UdpMessage$.html "Permalink")

### 

#### object UdpMessage

Java API: factory methods for the message types used when communicating with the Udp service.

Source[Udp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Udp.scala#L245)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UdpMessage
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/UdpMessage$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/UdpMessage$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/UdpMessage$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/UdpMessage$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/io/UdpMessage$.html#bind(handler:akka.actor.ActorRef,endpoint:java.net.InetSocketAddress):akka.io.Udp.Command "Permalink")  def bind(handler: [ActorRef](../actor/ActorRef.html), endpoint: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Command](Udp$$Command.html)Bind without specifying options.
6. [**](../../akka/io/UdpMessage$.html#bind(handler:akka.actor.ActorRef,endpoint:java.net.InetSocketAddress,options:Iterable[akka.io.Inet.SocketOption]):akka.io.Udp.Command "Permalink")  def bind(handler: [ActorRef](../actor/ActorRef.html), endpoint: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](Inet$$SocketOption.html)]): [Command](Udp$$Command.html)Send this message to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) in order to bind to the given
local port (or an automatically assigned one if the port number is zero).

Send this message to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) in order to bind to the given
local port (or an automatically assigned one if the port number is zero).
The listener actor for the newly bound port will reply with a [Udp.Bound](Udp$$Bound.html)
message, or the manager will reply with a [Udp.CommandFailed](Udp$$CommandFailed.html) message.
7. [**](../../akka/io/UdpMessage$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/io/UdpMessage$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/io/UdpMessage$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/io/UdpMessage$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/io/UdpMessage$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/io/UdpMessage$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/io/UdpMessage$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/io/UdpMessage$.html#noAck:akka.io.Udp.NoAck "Permalink")  def noAck: [NoAck](Udp$$NoAck.html)Default [Udp.NoAck](Udp$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided.

Default [Udp.NoAck](Udp$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided. Its “token” is `null`.
15. [**](../../akka/io/UdpMessage$.html#noAck(token:AnyRef):akka.io.Udp.NoAck "Permalink")  def noAck(token: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [NoAck](Udp$$NoAck.html)Each [Udp.Send](Udp$$Send.html) can optionally request a positive acknowledgment to be sent
to the commanding actor.

Each [Udp.Send](Udp$$Send.html) can optionally request a positive acknowledgment to be sent
to the commanding actor. If such notification is not desired the [Udp.Send\#ack](Udp$$Send.html#ack:akka.io.Udp.Event)
must be set to an instance of this class. The token contained within can be used
to recognize which write failed when receiving a [Udp.CommandFailed](Udp$$CommandFailed.html) message.
16. [**](../../akka/io/UdpMessage$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/io/UdpMessage$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/io/UdpMessage$.html#resumeReading:akka.io.Udp.Command "Permalink")  def resumeReading: [Command](Udp$$Command.html)This message must be sent to the listener actor to re\-enable reading from
the socket after a `Udp.SuspendReading` command.
19. [**](../../akka/io/UdpMessage$.html#send(payload:akka.util.ByteString,target:java.net.InetSocketAddress):akka.io.Udp.Command "Permalink")  def send(payload: [ByteString](../util/ByteString.html), target: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Command](Udp$$Command.html)The same as `send(payload, target, noAck())`.
20. [**](../../akka/io/UdpMessage$.html#send(payload:akka.util.ByteString,target:java.net.InetSocketAddress,ack:akka.io.Udp.Event):akka.io.Udp.Command "Permalink")  def send(payload: [ByteString](../util/ByteString.html), target: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), ack: [Event](Udp$$Event.html)): [Command](Udp$$Command.html)This message is understood by the “simple sender” which can be obtained by
sending the [Udp.SimpleSender](Udp$$SimpleSender.html) query to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) as well as by
the listener actors which are created in response to [Udp.Bind](Udp$$Bind.html).

This message is understood by the “simple sender” which can be obtained by
sending the [Udp.SimpleSender](Udp$$SimpleSender.html) query to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) as well as by
the listener actors which are created in response to [Udp.Bind](Udp$$Bind.html). It will send
the given payload data as one UDP datagram to the given target address. The
UDP actor will respond with [Udp.CommandFailed](Udp$$CommandFailed.html) if the send could not be
enqueued to the O/S kernel because the send buffer was full. If the given
`ack` is not of type [Udp.NoAck](Udp$$NoAck.html) the UDP actor will reply with the given
object as soon as the datagram has been successfully enqueued to the O/S
kernel.

The sending UDP socket’s address belongs to the “simple sender” which does
not handle inbound datagrams and sends from an ephemeral port; therefore
sending using this mechanism is not suitable if replies are expected, use
[Udp.Bind](Udp$$Bind.html) in that case.
21. [**](../../akka/io/UdpMessage$.html#simpleSender:akka.io.Udp.Command "Permalink")  def simpleSender: [Command](Udp$$Command.html)Retrieve a simple sender without specifying options.
22. [**](../../akka/io/UdpMessage$.html#simpleSender(options:Iterable[akka.io.Inet.SocketOption]):akka.io.Udp.Command "Permalink")  def simpleSender(options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](Inet$$SocketOption.html)]): [Command](Udp$$Command.html)Retrieve a reference to a “simple sender” actor of the UDP extension.

Retrieve a reference to a “simple sender” actor of the UDP extension.
The newly created “simple sender” will reply with the [Udp.SimpleSenderReady](Udp$$SimpleSenderReady.html) notification.

The “simple sender” is a convenient service for being able to send datagrams
when the originating address is meaningless, i.e. when no reply is expected.

The “simple sender” will not stop itself, you will have to send it a [akka.actor.PoisonPill](../actor/PoisonPill.html)
when you want to close the socket.
23. [**](../../akka/io/UdpMessage$.html#suspendReading:akka.io.Udp.Command "Permalink")  def suspendReading: [Command](Udp$$Command.html)Send this message to a listener actor (which sent a [Udp.Bound](Udp$$Bound.html) message) to
have it stop reading datagrams from the network.

Send this message to a listener actor (which sent a [Udp.Bound](Udp$$Bound.html) message) to
have it stop reading datagrams from the network. If the O/S kernel’s receive
buffer runs full then subsequent datagrams will be silently discarded.
Re\-enable reading from the socket using the `Udp.ResumeReading` command.
24. [**](../../akka/io/UdpMessage$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/io/UdpMessage$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../akka/io/UdpMessage$.html#unbind:akka.io.Udp.Command "Permalink")  def unbind: [Command](Udp$$Command.html)Send this message to the listener actor that previously sent a [Udp.Bound](Udp$$Bound.html)
message in order to close the listening socket.

Send this message to the listener actor that previously sent a [Udp.Bound](Udp$$Bound.html)
message in order to close the listening socket. The recipient will reply
with an [Udp.Unbound](Udp$$Unbound.html) message.
27. [**](../../akka/io/UdpMessage$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/io/UdpMessage$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/io/UdpMessage$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/UdpMessage$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/IO$.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$Bind.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$Bound.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$CommandFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$Event.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$NoAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$Send.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$SimpleSender.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$SimpleSenderReady.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$$Unbound.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpMessage$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpMessage$.html)*