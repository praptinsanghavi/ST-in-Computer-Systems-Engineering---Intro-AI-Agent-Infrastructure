---
description: Akka 2.10.17 - akka.io.Udp.SO
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:13:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Udp$$SO$.html
title: Akka 2.10.17 - akka.io.Udp.SO
---

# Akka 2.10.17 - akka.io.Udp.SO

> **Summary:** Akka 2.10.17 - akka.io.Udp.SO

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/Udp$.html "Permalink")  object [Udp](Udp$.html "UDP Extension for Akka’s IO layer.") extends [ExtensionId](../actor/ExtensionId.html)\[[UdpExt](UdpExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)UDP Extension for Akka’s IO layer.

UDP Extension for Akka’s IO layer.

This extension implements the connectionless UDP protocol without
calling `connect` on the underlying sockets, i.e. without restricting
from whom data can be received. For “connected” UDP mode see [UdpConnected](UdpConnected$.html).

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

The Java API for generating UDP commands is available at [UdpMessage](UdpMessage$.html).

Definition Classes[io](index.html)
- [Bind](Udp$$Bind.html "Send this message to the UdpExt#manager in order to bind to the given local port (or an automatically assigned one if the port number is zero).")
- [Bound](Udp$$Bound.html "This message is sent by the listener actor in response to a Bind command.")
- [Command](Udp$$Command.html "The common type of all commands supported by the UDP implementation.")
- [CommandFailed](Udp$$CommandFailed.html "When a command fails it will be replied to with this message type, wrapping the failing command object.")
- [Event](Udp$$Event.html "The common type of all events emitted by the UDP implementation.")
- [Message](Udp$$Message.html "The common interface for Command and Event.")
- [NoAck](Udp$$NoAck.html "Each Send can optionally request a positive acknowledgment to be sent to the commanding actor.")
- [Received](Udp$$Received.html "When a listener actor receives a datagram from its socket it will send it to the handler designated in the Bind message using this message type.")
- [ResumeReading](Udp$$ResumeReading$.html "This message must be sent to the listener actor to re-enable reading from the socket after a SuspendReading command.")
- SO
- [Send](Udp$$Send.html "This message is understood by the “simple sender” which can be obtained by sending the SimpleSender query to the UdpExt#manager as well as by the listener actors which are created in response to Bind.")
- [SimpleSender](Udp$$SimpleSender.html "Retrieve a reference to a “simple sender” actor of the UDP extension.")
- [SimpleSenderReady](Udp$$SimpleSenderReady.html "The “simple sender” sends this message type in response to a SimpleSender query.")
- [SuspendReading](Udp$$SuspendReading$.html "Send this message to a listener actor (which sent a Bound message) to have it stop reading datagrams from the network.")
- [Unbind](Udp$$Unbind$.html "Send this message to the listener actor that previously sent a Bound message in order to close the listening socket.")
- [Unbound](Udp$$Unbound.html "This message is sent by the listener actor in response to an Unbind command after the socket has been closed.")
o[akka](../index.html).[io](index.html).[Udp](Udp$.html)

# SO[**](../../akka/io/Udp$$SO$.html "Permalink")

### 

#### object SO extends [SoForwarders](Inet$$SoForwarders.html)

Scala API: This object provides access to all socket options applicable to UDP sockets.

For the Java API see [UdpSO](UdpSO$.html).

Source[Udp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Udp.scala#L185)Linear Supertypes[SoForwarders](Inet$$SoForwarders.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SO
2. SoForwarders
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/io/Udp$$SO$$Broadcast.html "Permalink") final  case class [Broadcast](Udp$$SO$$Broadcast.html "akka.io.Inet.SocketOption to set the SO_BROADCAST option")(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [SocketOption](Inet$$SocketOption.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_BROADCAST option

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_BROADCAST option

For more information see [java.net.DatagramSocket\#setBroadcast](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/DatagramSocket.html#setBroadcast(x$1:Boolean):Unit)
### Value Members

1. [**](../../akka/io/Udp$$SO$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Udp$$SO$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Udp$$SO$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/Udp$$SO$.html#ReceiveBufferSize:akka.io.Inet.SO.ReceiveBufferSize.type "Permalink")  val ReceiveBufferSize: Inet.SO.ReceiveBufferSize.type[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_RCVBUF option

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_RCVBUF option

For more information see [java.net.Socket\#setReceiveBufferSize](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setReceiveBufferSize(x$1:Int):Unit)

Definition Classes[SoForwarders](Inet$$SoForwarders.html)
5. [**](../../akka/io/Udp$$SO$.html#ReuseAddress:akka.io.Inet.SO.ReuseAddress.type "Permalink")  val ReuseAddress: Inet.SO.ReuseAddress.type[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable SO\_REUSEADDR

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable SO\_REUSEADDR

For more information see [java.net.Socket\#setReuseAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setReuseAddress(x$1:Boolean):Unit)

Definition Classes[SoForwarders](Inet$$SoForwarders.html)
6. [**](../../akka/io/Udp$$SO$.html#SendBufferSize:akka.io.Inet.SO.SendBufferSize.type "Permalink")  val SendBufferSize: Inet.SO.SendBufferSize.type[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_SNDBUF option.

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_SNDBUF option.

For more information see [java.net.Socket\#setSendBufferSize](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setSendBufferSize(x$1:Int):Unit)

Definition Classes[SoForwarders](Inet$$SoForwarders.html)
7. [**](../../akka/io/Udp$$SO$.html#TrafficClass:akka.io.Inet.SO.TrafficClass.type "Permalink")  val TrafficClass: Inet.SO.TrafficClass.type[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the traffic class or
type\-of\-service octet in the IP header for packets sent from this
socket.

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the traffic class or
type\-of\-service octet in the IP header for packets sent from this
socket.

For more information see [java.net.Socket\#setTrafficClass](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setTrafficClass(x$1:Int):Unit)

Definition Classes[SoForwarders](Inet$$SoForwarders.html)
8. [**](../../akka/io/Udp$$SO$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/io/Udp$$SO$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/io/Udp$$SO$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../akka/io/Udp$$SO$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../akka/io/Udp$$SO$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/io/Udp$$SO$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/Udp$$SO$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/io/Udp$$SO$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/io/Udp$$SO$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/io/Udp$$SO$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/io/Udp$$SO$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../akka/io/Udp$$SO$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../akka/io/Udp$$SO$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/io/Udp$$SO$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../akka/io/Udp$$SO$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Udp$$SO$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [SoForwarders](Inet$$SoForwarders.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SoForwarders.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bind.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bound.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$CommandFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Event.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Message.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$NoAck$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$NoAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Received.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$ResumeReading$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SO$$Broadcast.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Send$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Send.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SimpleSender$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SimpleSender.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SimpleSenderReady$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SimpleSenderReady.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SuspendReading$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbind$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbound$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbound.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SO$.html](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SO$.html)*