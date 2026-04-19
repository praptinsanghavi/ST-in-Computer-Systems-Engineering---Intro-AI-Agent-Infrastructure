---
description: Akka 2.10.17 - akka.io.UdpConnected
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:59:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/UdpConnected$.html
title: Akka 2.10.17 - akka.io.UdpConnected
---

# Akka 2.10.17 - akka.io.UdpConnected

> **Summary:** Akka 2.10.17 - akka.io.UdpConnected

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
- UdpConnected
- [UdpConnectedExt](UdpConnectedExt.html)
- [UdpConnectedMessage](UdpConnectedMessage$.html "Java API: factory methods for the message types used when communicating with the UdpConnected service.")
- [UdpExt](UdpExt.html)
- [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")
- [UdpSO](UdpSO$.html)
o[akka](../index.html).[io](index.html)

# UdpConnected[**](../../akka/io/UdpConnected$.html "Permalink")

### 

#### object UdpConnected extends [ExtensionId](../actor/ExtensionId.html)\[[UdpConnectedExt](UdpConnectedExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

UDP Extension for Akka’s IO layer.

This extension implements the connectionless UDP protocol with
calling `connect` on the underlying sockets, i.e. with restricting
from whom data can be received. For “unconnected” UDP mode see [Udp](Udp$.html).

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

The Java API for generating UDP commands is available at [UdpConnectedMessage](UdpConnectedMessage$.html).

Source[UdpConnected.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/UdpConnected.scala#L30)Linear Supertypes[ExtensionIdProvider](../actor/ExtensionIdProvider.html), [ExtensionId](../actor/ExtensionId.html)\[[UdpConnectedExt](UdpConnectedExt.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UdpConnected
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/io/UdpConnected$$Command.html "Permalink")  trait [Command](UdpConnected$$Command.html "The common type of all commands supported by the UDP implementation.") extends HasFailureMessage with [Message](UdpConnected$$Message.html)The common type of all commands supported by the UDP implementation.
2. [**](../../akka/io/UdpConnected$$CommandFailed.html "Permalink") final  case class [CommandFailed](UdpConnected$$CommandFailed.html "When a command fails it will be replied to with this message type, wrapping the failing command object.")(cmd: [Command](UdpConnected$$Command.html)) extends [Event](UdpConnected$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen a command fails it will be replied to with this message type,
wrapping the failing command object.
3. [**](../../akka/io/UdpConnected$$Connect.html "Permalink") final  case class [Connect](UdpConnected$$Connect.html "Send this message to the UdpExt#manager in order to bind to a local port (optionally with the chosen localAddress) and create a UDP socket which is restricted to sending to and receiving from the given remoteAddress.")(handler: [ActorRef](../actor/ActorRef.html), remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), localAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)] \= None, options: Traversable\[[SocketOption](Inet$$SocketOption.html)] \= Nil) extends [Command](UdpConnected$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) in order to bind to a local
port (optionally with the chosen `localAddress`) and create a UDP socket
which is restricted to sending to and receiving from the given `remoteAddress`.

Send this message to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) in order to bind to a local
port (optionally with the chosen `localAddress`) and create a UDP socket
which is restricted to sending to and receiving from the given `remoteAddress`.
All received datagrams will be sent to the designated `handler` actor.

Annotations@nowarn()
4. [**](../../akka/io/UdpConnected$$Connected.html "Permalink") sealed  trait [Connected](UdpConnected$$Connected.html "This message is sent by the connection actor to the actor which sent the Connect message when the UDP socket has been bound to the local and remote addresses given.") extends [Event](UdpConnected$$Event.html)This message is sent by the connection actor to the actor which sent the
[Connect](UdpConnected$$Connect.html) message when the UDP socket has been bound to the local and
remote addresses given.
5. [**](../../akka/io/UdpConnected$$Disconnected.html "Permalink") sealed  trait [Disconnected](UdpConnected$$Disconnected.html "This message is sent by the connection actor to the actor which sent the Disconnect message when the UDP socket has been closed.") extends [Event](UdpConnected$$Event.html)This message is sent by the connection actor to the actor which sent the
`Disconnect` message when the UDP socket has been closed.
6. [**](../../akka/io/UdpConnected$$Event.html "Permalink")  trait [Event](UdpConnected$$Event.html "The common type of all events emitted by the UDP implementation.") extends [Message](UdpConnected$$Message.html)The common type of all events emitted by the UDP implementation.
7. [**](../../akka/io/UdpConnected$$Message.html "Permalink") sealed  trait [Message](UdpConnected$$Message.html "The common interface for Command and Event.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The common interface for [Command](UdpConnected$$Command.html) and [Event](UdpConnected$$Event.html).
8. [**](../../akka/io/UdpConnected$$NoAck.html "Permalink")  case class [NoAck](UdpConnected$$NoAck.html "Each Send can optionally request a positive acknowledgment to be sent to the commanding actor.")(token: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Event](UdpConnected$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableEach [Send](UdpConnected$$Send.html) can optionally request a positive acknowledgment to be sent
to the commanding actor.

Each [Send](UdpConnected$$Send.html) can optionally request a positive acknowledgment to be sent
to the commanding actor. If such notification is not desired the [Send\#ack](UdpConnected$$Send.html#ack:Any)
must be set to an instance of this class. The token contained within can be used
to recognize which write failed when receiving a [CommandFailed](UdpConnected$$CommandFailed.html) message.
9. [**](../../akka/io/UdpConnected$$Received.html "Permalink") final  case class [Received](UdpConnected$$Received.html "When a connection actor receives a datagram from its socket it will send it to the handler designated in the Udp.Bind message using this message type.")(data: [ByteString](../util/ByteString.html)) extends [Event](UdpConnected$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen a connection actor receives a datagram from its socket it will send
it to the handler designated in the [Udp.Bind](Udp$$Bind.html) message using this message type.
10. [**](../../akka/io/UdpConnected$$Send.html "Permalink") final  case class [Send](UdpConnected$$Send.html "This message is understood by the connection actors to send data to their designated destination.")(payload: [ByteString](../util/ByteString.html), ack: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Command](UdpConnected$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis message is understood by the connection actors to send data to their
designated destination.

This message is understood by the connection actors to send data to their
designated destination. The connection actor will respond with
[CommandFailed](UdpConnected$$CommandFailed.html) if the send could not be enqueued to the O/S kernel
because the send buffer was full. If the given `ack` is not of type [NoAck](UdpConnected$$NoAck.html)
the connection actor will reply with the given object as soon as the datagram
has been successfully enqueued to the O/S kernel.
### Value Members

1. [**](../../akka/io/UdpConnected$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/UdpConnected$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/UdpConnected$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/UdpConnected$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [UdpConnectedExt](UdpConnectedExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
5. [**](../../akka/io/UdpConnected$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../actor/ActorSystem.html)): [UdpConnectedExt](UdpConnectedExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
6. [**](../../akka/io/UdpConnected$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/UdpConnected$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/io/UdpConnected$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.io.UdpConnectedExt "Permalink")  def createExtension(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)): [UdpConnectedExt](UdpConnectedExt.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesUdpConnected → [ExtensionId](../actor/ExtensionId.html)
9. [**](../../akka/io/UdpConnected$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/io/UdpConnected$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../akka/io/UdpConnected$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.io.UdpConnectedExt "Permalink")  def get(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [UdpConnectedExt](UdpConnectedExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesUdpConnected → [ExtensionId](../actor/ExtensionId.html)
12. [**](../../akka/io/UdpConnected$.html#get(system:akka.actor.ActorSystem):akka.io.UdpConnectedExt "Permalink")  def get(system: [ActorSystem](../actor/ActorSystem.html)): [UdpConnectedExt](UdpConnectedExt.html)Java API: retrieve the UdpConnected extension for the given system.

Java API: retrieve the UdpConnected extension for the given system.

Definition ClassesUdpConnected → [ExtensionId](../actor/ExtensionId.html)
13. [**](../../akka/io/UdpConnected$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/UdpConnected$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../akka/io/UdpConnected$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/io/UdpConnected$.html#lookup:akka.io.UdpConnected.type "Permalink")  def lookup: UdpConnectedReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesUdpConnected → [ExtensionIdProvider](../actor/ExtensionIdProvider.html)
17. [**](../../akka/io/UdpConnected$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/io/UdpConnected$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/UdpConnected$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/UdpConnected$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/io/UdpConnected$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/io/UdpConnected$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/io/UdpConnected$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/io/UdpConnected$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/io/UdpConnected$$Connected$.html "Permalink")  case object [Connected](UdpConnected$$Connected$.html) extends [Connected](UdpConnected$$Connected.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
26. [**](../../akka/io/UdpConnected$$Disconnect$.html "Permalink")  case object [Disconnect](UdpConnected$$Disconnect$.html "Send this message to a connection actor (which had previously sent the Connected message) in order to close the socket.") extends [Command](UdpConnected$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to a connection actor (which had previously sent the
[Connected](UdpConnected$$Connected.html) message) in order to close the socket.

Send this message to a connection actor (which had previously sent the
[Connected](UdpConnected$$Connected.html) message) in order to close the socket. The connection actor
will reply with a [Disconnected](UdpConnected$$Disconnected.html) message.
27. [**](../../akka/io/UdpConnected$$Disconnected$.html "Permalink")  case object [Disconnected](UdpConnected$$Disconnected$.html) extends [Disconnected](UdpConnected$$Disconnected.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
28. [**](../../akka/io/UdpConnected$$NoAck$.html "Permalink")  object [NoAck](UdpConnected$$NoAck$.html "Default NoAck instance which is used when no acknowledgment information is explicitly provided.") extends [NoAck](UdpConnected$$NoAck.html)Default [NoAck](UdpConnected$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided.

Default [NoAck](UdpConnected$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided. Its “token” is `null`.
29. [**](../../akka/io/UdpConnected$$ResumeReading$.html "Permalink")  case object [ResumeReading](UdpConnected$$ResumeReading$.html "This message must be sent to the listener actor to re-enable reading from the socket after a SuspendReading command.") extends [Command](UdpConnected$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis message must be sent to the listener actor to re\-enable reading from
the socket after a `SuspendReading` command.
30. [**](../../akka/io/UdpConnected$$Send$.html "Permalink")  object [Send](UdpConnected$$Send$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
31. [**](../../akka/io/UdpConnected$$SuspendReading$.html "Permalink")  case object [SuspendReading](UdpConnected$$SuspendReading$.html "Send this message to a listener actor (which sent a Udp.Bound message) to have it stop reading datagrams from the network.") extends [Command](UdpConnected$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to a listener actor (which sent a [Udp.Bound](Udp$$Bound.html) message) to
have it stop reading datagrams from the network.

Send this message to a listener actor (which sent a [Udp.Bound](Udp$$Bound.html) message) to
have it stop reading datagrams from the network. If the O/S kernel’s receive
buffer runs full then subsequent datagrams will be silently discarded.
Re\-enable reading from the socket using the `ResumeReading` command.
### Deprecated Value Members

1. [**](../../akka/io/UdpConnected$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../actor/ExtensionId.html)\[[UdpConnectedExt](UdpConnectedExt.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$CommandFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Connect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Connected$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Connected.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Disconnect$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Disconnected$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Disconnected.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Event.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Message.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$NoAck$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$NoAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Received.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$ResumeReading$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Send$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$Send.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$$SuspendReading$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnectedMessage$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$.html)*