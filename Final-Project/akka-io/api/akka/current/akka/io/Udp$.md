---
description: Akka 2.10.17 - akka.io.Udp
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:40:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Udp$.html
title: Akka 2.10.17 - akka.io.Udp
---

# Akka 2.10.17 - akka.io.Udp

> **Summary:** Akka 2.10.17 - akka.io.Udp

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
- Udp
- [UdpConnected](UdpConnected$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnectedExt](UdpConnectedExt.html)
- [UdpConnectedMessage](UdpConnectedMessage$.html "Java API: factory methods for the message types used when communicating with the UdpConnected service.")
- [UdpExt](UdpExt.html)
- [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")
- [UdpSO](UdpSO$.html)
o[akka](../index.html).[io](index.html)

# Udp[**](../../akka/io/Udp$.html "Permalink")

### 

#### object Udp extends [ExtensionId](../actor/ExtensionId.html)\[[UdpExt](UdpExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

UDP Extension for Akka’s IO layer.

This extension implements the connectionless UDP protocol without
calling `connect` on the underlying sockets, i.e. without restricting
from whom data can be received. For “connected” UDP mode see [UdpConnected](UdpConnected$.html).

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

The Java API for generating UDP commands is available at [UdpMessage](UdpMessage$.html).

Source[Udp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Udp.scala#L32)Linear Supertypes[ExtensionIdProvider](../actor/ExtensionIdProvider.html), [ExtensionId](../actor/ExtensionId.html)\[[UdpExt](UdpExt.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Udp
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/io/Udp$$Bind.html "Permalink") final  case class [Bind](Udp$$Bind.html "Send this message to the UdpExt#manager in order to bind to the given local port (or an automatically assigned one if the port number is zero).")(handler: [ActorRef](../actor/ActorRef.html), localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), options: Traversable\[[SocketOption](Inet$$SocketOption.html)] \= Nil) extends [Command](Udp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) in order to bind to the given
local port (or an automatically assigned one if the port number is zero).

Send this message to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) in order to bind to the given
local port (or an automatically assigned one if the port number is zero).
The listener actor for the newly bound port will reply with a [Bound](Udp$$Bound.html)
message, or the manager will reply with a [CommandFailed](Udp$$CommandFailed.html) message.

Annotations@nowarn()
2. [**](../../akka/io/Udp$$Bound.html "Permalink") final  case class [Bound](Udp$$Bound.html "This message is sent by the listener actor in response to a Bind command.")(localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)) extends [Event](Udp$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis message is sent by the listener actor in response to a [Bind](Udp$$Bind.html) command.

This message is sent by the listener actor in response to a [Bind](Udp$$Bind.html) command.
If the address to bind to specified a port number of zero, then this message
can be inspected to find out which port was automatically assigned.
3. [**](../../akka/io/Udp$$Command.html "Permalink")  trait [Command](Udp$$Command.html "The common type of all commands supported by the UDP implementation.") extends HasFailureMessage with [Message](Udp$$Message.html)The common type of all commands supported by the UDP implementation.
4. [**](../../akka/io/Udp$$CommandFailed.html "Permalink") final  case class [CommandFailed](Udp$$CommandFailed.html "When a command fails it will be replied to with this message type, wrapping the failing command object.")(cmd: [Command](Udp$$Command.html)) extends [Event](Udp$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen a command fails it will be replied to with this message type,
wrapping the failing command object.
5. [**](../../akka/io/Udp$$Event.html "Permalink")  trait [Event](Udp$$Event.html "The common type of all events emitted by the UDP implementation.") extends [Message](Udp$$Message.html)The common type of all events emitted by the UDP implementation.
6. [**](../../akka/io/Udp$$Message.html "Permalink") sealed  trait [Message](Udp$$Message.html "The common interface for Command and Event.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The common interface for [Command](Udp$$Command.html) and [Event](Udp$$Event.html).
7. [**](../../akka/io/Udp$$NoAck.html "Permalink")  case class [NoAck](Udp$$NoAck.html "Each Send can optionally request a positive acknowledgment to be sent to the commanding actor.")(token: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Event](Udp$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableEach [Send](Udp$$Send.html) can optionally request a positive acknowledgment to be sent
to the commanding actor.

Each [Send](Udp$$Send.html) can optionally request a positive acknowledgment to be sent
to the commanding actor. If such notification is not desired the [Send\#ack](Udp$$Send.html#ack:akka.io.Udp.Event)
must be set to an instance of this class. The token contained within can be used
to recognize which write failed when receiving a [CommandFailed](Udp$$CommandFailed.html) message.
8. [**](../../akka/io/Udp$$Received.html "Permalink") final  case class [Received](Udp$$Received.html "When a listener actor receives a datagram from its socket it will send it to the handler designated in the Bind message using this message type.")(data: [ByteString](../util/ByteString.html), sender: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)) extends [Event](Udp$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen a listener actor receives a datagram from its socket it will send
it to the handler designated in the [Bind](Udp$$Bind.html) message using this message type.
9. [**](../../akka/io/Udp$$Send.html "Permalink") final  case class [Send](Udp$$Send.html "This message is understood by the “simple sender” which can be obtained by sending the SimpleSender query to the UdpExt#manager as well as by the listener actors which are created in response to Bind.")(payload: [ByteString](../util/ByteString.html), target: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), ack: [Event](Udp$$Event.html)) extends [Command](Udp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis message is understood by the “simple sender” which can be obtained by
sending the [SimpleSender](Udp$$SimpleSender.html) query to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) as well as by
the listener actors which are created in response to [Bind](Udp$$Bind.html).

This message is understood by the “simple sender” which can be obtained by
sending the [SimpleSender](Udp$$SimpleSender.html) query to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) as well as by
the listener actors which are created in response to [Bind](Udp$$Bind.html). It will send
the given payload data as one UDP datagram to the given target address. The
UDP actor will respond with [CommandFailed](Udp$$CommandFailed.html) if the send could not be
enqueued to the O/S kernel because the send buffer was full. If the given
`ack` is not of type [NoAck](Udp$$NoAck.html) the UDP actor will reply with the given
object as soon as the datagram has been successfully enqueued to the O/S
kernel.

The sending UDP socket’s address belongs to the “simple sender” which does
not handle inbound datagrams and sends from an ephemeral port; therefore
sending using this mechanism is not suitable if replies are expected, use
[Bind](Udp$$Bind.html) in that case.
10. [**](../../akka/io/Udp$$SimpleSender.html "Permalink")  case class [SimpleSender](Udp$$SimpleSender.html "Retrieve a reference to a “simple sender” actor of the UDP extension.")(options: Traversable\[[SocketOption](Inet$$SocketOption.html)] \= Nil) extends [Command](Udp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRetrieve a reference to a “simple sender” actor of the UDP extension.

Retrieve a reference to a “simple sender” actor of the UDP extension.
The newly created “simple sender” will reply with the [SimpleSenderReady](Udp$$SimpleSenderReady.html) notification.

The “simple sender” is a convenient service for being able to send datagrams
when the originating address is meaningless, i.e. when no reply is expected.

The “simple sender” will not stop itself, you will have to send it a [akka.actor.PoisonPill](../actor/PoisonPill.html)
when you want to close the socket.

Annotations@nowarn()
11. [**](../../akka/io/Udp$$SimpleSenderReady.html "Permalink") sealed  trait [SimpleSenderReady](Udp$$SimpleSenderReady.html "The “simple sender” sends this message type in response to a SimpleSender query.") extends [Event](Udp$$Event.html)The “simple sender” sends this message type in response to a [SimpleSender](Udp$$SimpleSender.html) query.
12. [**](../../akka/io/Udp$$Unbound.html "Permalink") sealed  trait [Unbound](Udp$$Unbound.html "This message is sent by the listener actor in response to an Unbind command after the socket has been closed.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This message is sent by the listener actor in response to an `Unbind` command
after the socket has been closed.
### Value Members

1. [**](../../akka/io/Udp$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Udp$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Udp$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/Udp$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [UdpExt](UdpExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
5. [**](../../akka/io/Udp$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../actor/ActorSystem.html)): [UdpExt](UdpExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
6. [**](../../akka/io/Udp$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/Udp$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/io/Udp$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.io.UdpExt "Permalink")  def createExtension(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)): [UdpExt](UdpExt.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesUdp → [ExtensionId](../actor/ExtensionId.html)
9. [**](../../akka/io/Udp$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/io/Udp$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../akka/io/Udp$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.io.UdpExt "Permalink")  def get(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [UdpExt](UdpExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesUdp → [ExtensionId](../actor/ExtensionId.html)
12. [**](../../akka/io/Udp$.html#get(system:akka.actor.ActorSystem):akka.io.UdpExt "Permalink")  def get(system: [ActorSystem](../actor/ActorSystem.html)): [UdpExt](UdpExt.html)Java API: retrieve the Udp extension for the given system.

Java API: retrieve the Udp extension for the given system.

Definition ClassesUdp → [ExtensionId](../actor/ExtensionId.html)
13. [**](../../akka/io/Udp$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/Udp$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../akka/io/Udp$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/io/Udp$.html#lookup:akka.io.Udp.type "Permalink")  def lookup: UdpReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesUdp → [ExtensionIdProvider](../actor/ExtensionIdProvider.html)
17. [**](../../akka/io/Udp$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/io/Udp$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/Udp$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/Udp$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/io/Udp$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/io/Udp$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/io/Udp$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/io/Udp$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/io/Udp$$NoAck$.html "Permalink")  object [NoAck](Udp$$NoAck$.html "Default NoAck instance which is used when no acknowledgment information is explicitly provided.") extends [NoAck](Udp$$NoAck.html)Default [NoAck](Udp$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided.

Default [NoAck](Udp$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided. Its “token” is `null`.
26. [**](../../akka/io/Udp$$ResumeReading$.html "Permalink")  case object [ResumeReading](Udp$$ResumeReading$.html "This message must be sent to the listener actor to re-enable reading from the socket after a SuspendReading command.") extends [Command](Udp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis message must be sent to the listener actor to re\-enable reading from
the socket after a `SuspendReading` command.
27. [**](../../akka/io/Udp$$SO$.html "Permalink")  object [SO](Udp$$SO$.html "Scala API: This object provides access to all socket options applicable to UDP sockets.") extends [SoForwarders](Inet$$SoForwarders.html)Scala API: This object provides access to all socket options applicable to UDP sockets.

Scala API: This object provides access to all socket options applicable to UDP sockets.

For the Java API see [UdpSO](UdpSO$.html).
28. [**](../../akka/io/Udp$$Send$.html "Permalink")  object [Send](Udp$$Send$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
29. [**](../../akka/io/Udp$$SimpleSender$.html "Permalink")  object [SimpleSender](Udp$$SimpleSender$.html) extends [SimpleSender](Udp$$SimpleSender.html)
30. [**](../../akka/io/Udp$$SimpleSenderReady$.html "Permalink")  case object [SimpleSenderReady](Udp$$SimpleSenderReady$.html) extends [SimpleSenderReady](Udp$$SimpleSenderReady.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
31. [**](../../akka/io/Udp$$SuspendReading$.html "Permalink")  case object [SuspendReading](Udp$$SuspendReading$.html "Send this message to a listener actor (which sent a Bound message) to have it stop reading datagrams from the network.") extends [Command](Udp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to a listener actor (which sent a [Bound](Udp$$Bound.html) message) to
have it stop reading datagrams from the network.

Send this message to a listener actor (which sent a [Bound](Udp$$Bound.html) message) to
have it stop reading datagrams from the network. If the O/S kernel’s receive
buffer runs full then subsequent datagrams will be silently discarded.
Re\-enable reading from the socket using the `ResumeReading` command.
32. [**](../../akka/io/Udp$$Unbind$.html "Permalink")  case object [Unbind](Udp$$Unbind$.html "Send this message to the listener actor that previously sent a Bound message in order to close the listening socket.") extends [Command](Udp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the listener actor that previously sent a [Bound](Udp$$Bound.html)
message in order to close the listening socket.

Send this message to the listener actor that previously sent a [Bound](Udp$$Bound.html)
message in order to close the listening socket. The recipient will reply
with an [Unbound](Udp$$Unbound.html) message.
33. [**](../../akka/io/Udp$$Unbound$.html "Permalink")  case object [Unbound](Udp$$Unbound$.html) extends [Unbound](Udp$$Unbound.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../akka/io/Udp$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../actor/ExtensionId.html)\[[UdpExt](UdpExt.html)]

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
- https://doc.akka.io/api/akka/current/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/BufferPool.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$.html
- https://doc.akka.io/api/akka/current/akka/io/Dns.html
- https://doc.akka.io/api/akka/current/akka/io/DnsExt.html
- https://doc.akka.io/api/akka/current/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka/current/akka/io/IO$.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SoForwarders.html
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
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Bind.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Bound.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Command.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$CommandFailed.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Event.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Message.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$NoAck$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$NoAck.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Received.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$ResumeReading$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$SO$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Send$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Send.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$SimpleSender$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$SimpleSender.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$SimpleSenderReady$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$SimpleSenderReady.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$SuspendReading$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Unbind$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Unbound$.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Unbound.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/Udp$.html](https://doc.akka.io/api/akka/current/akka/io/Udp$.html)*