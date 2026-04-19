---
description: Akka 2.10.11 - akka.io.Tcp
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Tcp$.html
title: Akka 2.10.11 - akka.io.Tcp
---

# Akka 2.10.11 - akka.io.Tcp

> **Summary:** Akka 2.10.11 - akka.io.Tcp

## Content

Akka2\.10\.11 \< Back****# Packages

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
- Tcp
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

# Tcp[**](../../akka/io/Tcp$.html "Permalink")

### 

#### object Tcp extends [ExtensionId](../actor/ExtensionId.html)\[[TcpExt](TcpExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

TCP Extension for Akka’s IO layer.

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

In order to open an outbound connection send a [Tcp.Connect](Tcp$$Connect.html) message
to the [TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef).

In order to start listening for inbound connections send a [Tcp.Bind](Tcp$$Bind.html)
message to the [TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef).

The Java API for generating TCP commands is available at [TcpMessage](TcpMessage$.html).

Source[Tcp.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/io/Tcp.scala#L40)Linear Supertypes[ExtensionIdProvider](../actor/ExtensionIdProvider.html), [ExtensionId](../actor/ExtensionId.html)\[[TcpExt](TcpExt.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Tcp
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/io/Tcp$$Bind.html "Permalink") final  case class [Bind](Tcp$$Bind.html "The Bind message is send to the TCP manager actor, which is obtained via TcpExt#manager in order to bind to a listening socket.")(handler: [ActorRef](../actor/ActorRef.html), localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 100, options: Traversable\[[SocketOption](Inet$$SocketOption.html)] \= Nil, pullMode: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Command](Tcp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe Bind message is send to the TCP manager actor, which is obtained via
[TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef) in order to bind to a listening socket.

The Bind message is send to the TCP manager actor, which is obtained via
[TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef) in order to bind to a listening socket. The manager
replies either with a [CommandFailed](Tcp$$CommandFailed.html) or the actor handling the listen
socket replies with a [Bound](Tcp$$Bound.html) message. If the local port is set to 0 in
the Bind message, then the [Bound](Tcp$$Bound.html) message should be inspected to find
the actual port which was bound to.

handlerThe actor which will receive all incoming connection requests
 in the form of [Connected](Tcp$$Connected.html) messages.

localAddressThe socket address to bind to; use port zero for
 automatic assignment (i.e. an ephemeral port, see [Bound](Tcp$$Bound.html))

backlogThis specifies the number of unaccepted connections the O/S
 kernel will hold for this port before refusing connections.

optionsPlease refer to the `Tcp.SO` object for a list of all supported options.

Annotations@nowarn()
2. [**](../../akka/io/Tcp$$Bound.html "Permalink") final  case class [Bound](Tcp$$Bound.html "The sender of a Bind command will—in case of success—receive confirmation in this form.")(localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)) extends [Event](Tcp$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe sender of a [Bind](Tcp$$Bind.html) command will—in case of success—receive confirmation
in this form.

The sender of a [Bind](Tcp$$Bind.html) command will—in case of success—receive confirmation
in this form. If the bind address indicated a 0 port number, then the contained
`localAddress` can be used to find out which port was automatically assigned.
3. [**](../../akka/io/Tcp$$CloseCommand.html "Permalink") sealed  trait [CloseCommand](Tcp$$CloseCommand.html "Common interface for all commands which aim to close down an open connection.") extends [Command](Tcp$$Command.html) with [DeadLetterSuppression](../actor/DeadLetterSuppression.html)Common interface for all commands which aim to close down an open connection.
4. [**](../../akka/io/Tcp$$Command.html "Permalink")  trait [Command](Tcp$$Command.html "This is the common trait for all commands understood by TCP actors.") extends [Message](Tcp$$Message.html) with HasFailureMessageThis is the common trait for all commands understood by TCP actors.
5. [**](../../akka/io/Tcp$$CommandFailed.html "Permalink") final  case class [CommandFailed](Tcp$$CommandFailed.html "Whenever a command cannot be completed, the queried actor will reply with this message, wrapping the original command which failed.")(cmd: [Command](Tcp$$Command.html)) extends [Event](Tcp$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhenever a command cannot be completed, the queried actor will reply with
this message, wrapping the original command which failed.
6. [**](../../akka/io/Tcp$$CompoundWrite.html "Permalink") final  case class [CompoundWrite](Tcp$$CompoundWrite.html "A write command which aggregates two other write commands.")(head: [SimpleWriteCommand](Tcp$$SimpleWriteCommand.html), tailCommand: [WriteCommand](Tcp$$WriteCommand.html)) extends [WriteCommand](Tcp$$WriteCommand.html) with [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[[SimpleWriteCommand](Tcp$$SimpleWriteCommand.html)] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA write command which aggregates two other write commands.

A write command which aggregates two other write commands. Using this construct
you can chain a number of [Write](Tcp$$Write.html) and/or [WriteFile](Tcp$$WriteFile.html) commands together in a way
that allows them to be handled as a single write which gets written out to the
network as quickly as possible.
If the sub commands contain `ack` requests they will be honored as soon as the
respective write has been written completely.
7. [**](../../akka/io/Tcp$$Connect.html "Permalink") final  case class [Connect](Tcp$$Connect.html "The Connect message is sent to the TCP manager actor, which is obtained via TcpExt#manager.")(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), localAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)] \= None, options: Traversable\[[SocketOption](Inet$$SocketOption.html)] \= Nil, timeout: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)] \= None, pullMode: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Command](Tcp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe Connect message is sent to the TCP manager actor, which is obtained via
[TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef).

The Connect message is sent to the TCP manager actor, which is obtained via
[TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef). Either the manager replies with a [CommandFailed](Tcp$$CommandFailed.html)
or the actor handling the new connection replies with a [Connected](Tcp$$Connected.html)
message.

remoteAddressis the address to connect to

localAddressoptionally specifies a specific address to bind to

optionsPlease refer to the `Tcp.SO` object for a list of all supported options.

Annotations@nowarn()
8. [**](../../akka/io/Tcp$$Connected.html "Permalink") final  case class [Connected](Tcp$$Connected.html "The connection actor sends this message either to the sender of a Connect command (for outbound) or to the handler for incoming connections designated in the Bind message.")(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)) extends [Event](Tcp$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe connection actor sends this message either to the sender of a [Connect](Tcp$$Connect.html)
command (for outbound) or to the handler for incoming connections designated
in the [Bind](Tcp$$Bind.html) message.

The connection actor sends this message either to the sender of a [Connect](Tcp$$Connect.html)
command (for outbound) or to the handler for incoming connections designated
in the [Bind](Tcp$$Bind.html) message. The connection is characterized by the `remoteAddress`
and `localAddress` TCP endpoints.
9. [**](../../akka/io/Tcp$$ConnectionClosed.html "Permalink") sealed  trait [ConnectionClosed](Tcp$$ConnectionClosed.html "This is the common interface for all events which indicate that a connection has been closed or half-closed.") extends [Event](Tcp$$Event.html) with [DeadLetterSuppression](../actor/DeadLetterSuppression.html)This is the common interface for all events which indicate that a connection
has been closed or half\-closed.
10. [**](../../akka/io/Tcp$$ErrorClosed.html "Permalink") final  case class [ErrorClosed](Tcp$$ErrorClosed.html "The connection has been closed due to an IO error.")(cause: String) extends [ConnectionClosed](Tcp$$ConnectionClosed.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe connection has been closed due to an IO error.
11. [**](../../akka/io/Tcp$$Event.html "Permalink")  trait [Event](Tcp$$Event.html "Common interface for all events generated by the TCP layer actors.") extends [Message](Tcp$$Message.html)Common interface for all events generated by the TCP layer actors.
12. [**](../../akka/io/Tcp$$Message.html "Permalink") sealed  trait [Message](Tcp$$Message.html "The common interface for Command and Event.") extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)The common interface for [Command](Tcp$$Command.html) and [Event](Tcp$$Event.html).
13. [**](../../akka/io/Tcp$$NoAck.html "Permalink")  case class [NoAck](Tcp$$NoAck.html "Each WriteCommand can optionally request a positive acknowledgment to be sent to the commanding actor.")(token: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Event](Tcp$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableEach [WriteCommand](Tcp$$WriteCommand.html) can optionally request a positive acknowledgment to be sent
to the commanding actor.

Each [WriteCommand](Tcp$$WriteCommand.html) can optionally request a positive acknowledgment to be sent
to the commanding actor. If such notification is not desired the [SimpleWriteCommand\#ack](Tcp$$SimpleWriteCommand.html#ack:akka.io.Tcp.Event)
must be set to an instance of this class. The token contained within can be used
to recognize which write failed when receiving a [CommandFailed](Tcp$$CommandFailed.html) message.
14. [**](../../akka/io/Tcp$$Received.html "Permalink") final  case class [Received](Tcp$$Received.html "Whenever data are read from a socket they will be transferred within this class to the handler actor which was designated in the Register message.")(data: [ByteString](../util/ByteString.html)) extends [Event](Tcp$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhenever data are read from a socket they will be transferred within this
class to the handler actor which was designated in the [Register](Tcp$$Register.html) message.
15. [**](../../akka/io/Tcp$$Register.html "Permalink") final  case class [Register](Tcp$$Register.html "This message must be sent to a TCP connection actor after receiving the Connected message.")(handler: [ActorRef](../actor/ActorRef.html), keepOpenOnPeerClosed: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, useResumeWriting: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= true) extends [Command](Tcp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis message must be sent to a TCP connection actor after receiving the
[Connected](Tcp$$Connected.html) message.

This message must be sent to a TCP connection actor after receiving the
[Connected](Tcp$$Connected.html) message. The connection will not read any data from the
socket until this message is received, because this message defines the
actor which will receive all inbound data.

handlerThe actor which will receive all incoming data and which
 will be informed when the connection is closed.

keepOpenOnPeerClosedIf this is set to true then the connection
 is not automatically closed when the peer closes its half,
 requiring an explicit [CloseCommand](Tcp$$CloseCommand.html) from our side when finished.

useResumeWritingIf this is set to true then the connection actor
 will refuse all further writes after issuing a [CommandFailed](Tcp$$CommandFailed.html)
 notification until `ResumeWriting` is received. This can
 be used to implement NACK\-based write backpressure.
16. [**](../../akka/io/Tcp$$ResumeAccepting.html "Permalink") final  case class [ResumeAccepting](Tcp$$ResumeAccepting.html "This message enables the accepting of the next connection if read throttling is enabled for connection actors.")(batchSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Command](Tcp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis message enables the accepting of the next connection if read throttling is enabled
for connection actors.

This message enables the accepting of the next connection if read throttling is enabled
for connection actors.

batchSizeThe number of connections to accept before waiting for the next resume command
17. [**](../../akka/io/Tcp$$SimpleWriteCommand.html "Permalink") sealed abstract  class [SimpleWriteCommand](Tcp$$SimpleWriteCommand.html "Common supertype of Write and WriteFile.") extends [WriteCommand](Tcp$$WriteCommand.html)Common supertype of [Write](Tcp$$Write.html) and [WriteFile](Tcp$$WriteFile.html).
18. [**](../../akka/io/Tcp$$Unbound.html "Permalink") sealed  trait [Unbound](Tcp$$Unbound.html "The sender of an Unbind command will receive confirmation through this message once the listening socket has been closed.") extends [Event](Tcp$$Event.html)The sender of an `Unbind` command will receive confirmation through this
message once the listening socket has been closed.
19. [**](../../akka/io/Tcp$$Write.html "Permalink") final  case class [Write](Tcp$$Write.html "Write data to the TCP connection.")(data: [ByteString](../util/ByteString.html), ack: [Event](Tcp$$Event.html)) extends [SimpleWriteCommand](Tcp$$SimpleWriteCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWrite data to the TCP connection.

Write data to the TCP connection. If no ack is needed use the special
`NoAck` object. The connection actor will reply with a [CommandFailed](Tcp$$CommandFailed.html)
message if the write could not be enqueued. If [SimpleWriteCommand\#wantsAck](Tcp$$SimpleWriteCommand.html#wantsAck:Boolean)
returns true, the connection actor will reply with the supplied [SimpleWriteCommand\#ack](Tcp$$SimpleWriteCommand.html#ack:akka.io.Tcp.Event)
token once the write has been successfully enqueued to the O/S kernel.
**Note that this does not in any way guarantee that the data will be
or have been sent!** Unfortunately there is no way to determine whether
a particular write has been sent by the O/S.
20. [**](../../akka/io/Tcp$$WriteCommand.html "Permalink") sealed abstract  class [WriteCommand](Tcp$$WriteCommand.html "Common interface for all write commands.") extends [Command](Tcp$$Command.html)Common interface for all write commands.
21. [**](../../akka/io/Tcp$$WritePath.html "Permalink") final  case class [WritePath](Tcp$$WritePath.html "Write count bytes starting at position from file at filePath to the connection.")(path: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), position: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), count: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ack: [Event](Tcp$$Event.html)) extends [SimpleWriteCommand](Tcp$$SimpleWriteCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWrite `count` bytes starting at `position` from file at `filePath` to the connection.

Write `count` bytes starting at `position` from file at `filePath` to the connection.
The count must be \> 0\. The connection actor will reply with a [CommandFailed](Tcp$$CommandFailed.html)
message if the write could not be enqueued. If [SimpleWriteCommand\#wantsAck](Tcp$$SimpleWriteCommand.html#wantsAck:Boolean)
returns true, the connection actor will reply with the supplied [SimpleWriteCommand\#ack](Tcp$$SimpleWriteCommand.html#ack:akka.io.Tcp.Event)
token once the write has been successfully enqueued to the O/S kernel.
**Note that this does not in any way guarantee that the data will be
or have been sent!** Unfortunately there is no way to determine whether
a particular write has been sent by the O/S.
22. [**](../../akka/io/Tcp$$WritingResumed.html "Permalink") sealed  trait [WritingResumed](Tcp$$WritingResumed.html "When useResumeWriting is in effect as indicated in the Register message, the ResumeWriting command will be acknowledged by this message type, upon which it is safe to send at least one write.") extends [Event](Tcp$$Event.html)When `useResumeWriting` is in effect as indicated in the [Register](Tcp$$Register.html) message,
the `ResumeWriting` command will be acknowledged by this message type, upon
which it is safe to send at least one write.

When `useResumeWriting` is in effect as indicated in the [Register](Tcp$$Register.html) message,
the `ResumeWriting` command will be acknowledged by this message type, upon
which it is safe to send at least one write. This means that all writes preceding
the first [CommandFailed](Tcp$$CommandFailed.html) message have been enqueued to the O/S kernel at this
point.
### Deprecated Type Members

1. [**](../../akka/io/Tcp$$WriteFile.html "Permalink") final  case class [WriteFile](Tcp$$WriteFile.html)(filePath: String, position: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), count: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ack: [Event](Tcp$$Event.html)) extends [SimpleWriteCommand](Tcp$$SimpleWriteCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@deprecated Deprecated*(Since version 2\.5\.10\)* Use WritePath instead

See also[WritePath](Tcp$$WritePath.html)
### Value Members

1. [**](../../akka/io/Tcp$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Tcp$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Tcp$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/Tcp$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [TcpExt](TcpExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
5. [**](../../akka/io/Tcp$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../actor/ActorSystem.html)): [TcpExt](TcpExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
6. [**](../../akka/io/Tcp$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/Tcp$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/io/Tcp$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.io.TcpExt "Permalink")  def createExtension(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)): [TcpExt](TcpExt.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesTcp → [ExtensionId](../actor/ExtensionId.html)
9. [**](../../akka/io/Tcp$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/io/Tcp$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../akka/io/Tcp$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.io.TcpExt "Permalink")  def get(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [TcpExt](TcpExt.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesTcp → [ExtensionId](../actor/ExtensionId.html)
12. [**](../../akka/io/Tcp$.html#get(system:akka.actor.ActorSystem):akka.io.TcpExt "Permalink")  def get(system: [ActorSystem](../actor/ActorSystem.html)): [TcpExt](TcpExt.html)Java API: retrieve the Tcp extension for the given system.

Java API: retrieve the Tcp extension for the given system.

Definition ClassesTcp → [ExtensionId](../actor/ExtensionId.html)
13. [**](../../akka/io/Tcp$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/Tcp$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../akka/io/Tcp$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/io/Tcp$.html#lookup:akka.io.Tcp.type "Permalink")  def lookup: TcpReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesTcp → [ExtensionIdProvider](../actor/ExtensionIdProvider.html)
17. [**](../../akka/io/Tcp$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/io/Tcp$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/Tcp$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/Tcp$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/io/Tcp$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/io/Tcp$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/io/Tcp$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/io/Tcp$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/io/Tcp$$Abort$.html "Permalink")  case object [Abort](Tcp$$Abort$.html "An abort operation will not flush pending writes and will issue a TCP ABORT command to the O/S kernel which should result in a TCP_RST packet being sent to the peer.") extends [CloseCommand](Tcp$$CloseCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAn abort operation will not flush pending writes and will issue a TCP ABORT
command to the O/S kernel which should result in a TCP\_RST packet being sent
to the peer.

An abort operation will not flush pending writes and will issue a TCP ABORT
command to the O/S kernel which should result in a TCP\_RST packet being sent
to the peer. The sender of this command and the registered handler for
incoming data will both be notified once the socket is closed using a
`Aborted` message.
26. [**](../../akka/io/Tcp$$Aborted$.html "Permalink")  case object [Aborted](Tcp$$Aborted$.html "The connection has been aborted in response to an Abort command.") extends [ConnectionClosed](Tcp$$ConnectionClosed.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe connection has been aborted in response to an `Abort` command.
27. [**](../../akka/io/Tcp$$Close$.html "Permalink")  case object [Close](Tcp$$Close$.html "A normal close operation will first flush pending writes and then close the socket.") extends [CloseCommand](Tcp$$CloseCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA normal close operation will first flush pending writes and then close the
socket.

A normal close operation will first flush pending writes and then close the
socket. The sender of this command and the registered handler for incoming
data will both be notified once the socket is closed using a `Closed`
message.
28. [**](../../akka/io/Tcp$$Closed$.html "Permalink")  case object [Closed](Tcp$$Closed$.html "The connection has been closed normally in response to a Close command.") extends [ConnectionClosed](Tcp$$ConnectionClosed.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe connection has been closed normally in response to a `Close` command.
29. [**](../../akka/io/Tcp$$ConfirmedClose$.html "Permalink")  case object [ConfirmedClose](Tcp$$ConfirmedClose$.html "A confirmed close operation will flush pending writes and half-close the connection, waiting for the peer to close the other half.") extends [CloseCommand](Tcp$$CloseCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA confirmed close operation will flush pending writes and half\-close the
connection, waiting for the peer to close the other half.

A confirmed close operation will flush pending writes and half\-close the
connection, waiting for the peer to close the other half. The sender of this
command and the registered handler for incoming data will both be notified
once the socket is closed using a `ConfirmedClosed` message.
30. [**](../../akka/io/Tcp$$ConfirmedClosed$.html "Permalink")  case object [ConfirmedClosed](Tcp$$ConfirmedClosed$.html "The connection has been half-closed by us and then half-close by the peer in response to a ConfirmedClose command.") extends [ConnectionClosed](Tcp$$ConnectionClosed.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe connection has been half\-closed by us and then half\-close by the peer
in response to a `ConfirmedClose` command.
31. [**](../../akka/io/Tcp$$NoAck$.html "Permalink")  object [NoAck](Tcp$$NoAck$.html "Default NoAck instance which is used when no acknowledgment information is explicitly provided.") extends [NoAck](Tcp$$NoAck.html)Default [NoAck](Tcp$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided.

Default [NoAck](Tcp$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided. Its “token” is `null`.
32. [**](../../akka/io/Tcp$$PeerClosed$.html "Permalink")  case object [PeerClosed](Tcp$$PeerClosed$.html "The peer has closed its writing half of the connection.") extends [ConnectionClosed](Tcp$$ConnectionClosed.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe peer has closed its writing half of the connection.
33. [**](../../akka/io/Tcp$$ResumeReading$.html "Permalink")  case object [ResumeReading](Tcp$$ResumeReading$.html "This command needs to be sent to the connection actor after a SuspendReading command in order to resume reading from the socket.") extends [Command](Tcp$$Command.html) with [DeadLetterSuppression](../actor/DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis command needs to be sent to the connection actor after a `SuspendReading`
command in order to resume reading from the socket.

This command needs to be sent to the connection actor after a `SuspendReading`
command in order to resume reading from the socket.

(This message is marked with DeadLetterSuppression as it is prone to end up in
 DeadLetters when the connection is torn down at the same time as the user wants
 to resume reading on that connection.)
34. [**](../../akka/io/Tcp$$ResumeWriting$.html "Permalink")  case object [ResumeWriting](Tcp$$ResumeWriting$.html "When useResumeWriting is in effect as was indicated in the Register message then this command needs to be sent to the connection actor in order to re-enable writing after a CommandFailed event.") extends [Command](Tcp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen `useResumeWriting` is in effect as was indicated in the [Register](Tcp$$Register.html) message
then this command needs to be sent to the connection actor in order to re\-enable
writing after a [CommandFailed](Tcp$$CommandFailed.html) event.

When `useResumeWriting` is in effect as was indicated in the [Register](Tcp$$Register.html) message
then this command needs to be sent to the connection actor in order to re\-enable
writing after a [CommandFailed](Tcp$$CommandFailed.html) event. All [WriteCommand](Tcp$$WriteCommand.html) processed by the
connection actor between the first [CommandFailed](Tcp$$CommandFailed.html) and subsequent reception of
this message will also be rejected with [CommandFailed](Tcp$$CommandFailed.html).
35. [**](../../akka/io/Tcp$$SO$.html "Permalink")  object [SO](Tcp$$SO$.html "Scala API: this object contains all applicable socket options for TCP.") extends [SoForwarders](Inet$$SoForwarders.html)Scala API: this object contains all applicable socket options for TCP.

Scala API: this object contains all applicable socket options for TCP.

For the Java API see [TcpSO](TcpSO$.html).
36. [**](../../akka/io/Tcp$$SuspendReading$.html "Permalink")  case object [SuspendReading](Tcp$$SuspendReading$.html "Sending this command to the connection actor will disable reading from the TCP socket.") extends [Command](Tcp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSending this command to the connection actor will disable reading from the TCP
socket.

Sending this command to the connection actor will disable reading from the TCP
socket. TCP flow\-control will then propagate backpressure to the sender side
as buffers fill up on either end. To re\-enable reading send `ResumeReading`.
37. [**](../../akka/io/Tcp$$Unbind$.html "Permalink")  case object [Unbind](Tcp$$Unbind$.html "In order to close down a listening socket, send this message to that socket’s actor (that is the actor which previously had sent the Bound message).") extends [Command](Tcp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableIn order to close down a listening socket, send this message to that socket’s
actor (that is the actor which previously had sent the [Bound](Tcp$$Bound.html) message).

In order to close down a listening socket, send this message to that socket’s
actor (that is the actor which previously had sent the [Bound](Tcp$$Bound.html) message). The
listener socket actor will reply with a [Unbound](Tcp$$Unbound.html) message.
38. [**](../../akka/io/Tcp$$Unbound$.html "Permalink")  case object [Unbound](Tcp$$Unbound$.html) extends [Unbound](Tcp$$Unbound.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
39. [**](../../akka/io/Tcp$$Write$.html "Permalink")  object [Write](Tcp$$Write$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
40. [**](../../akka/io/Tcp$$WriteCommand$.html "Permalink")  object [WriteCommand](Tcp$$WriteCommand$.html)
41. [**](../../akka/io/Tcp$$WritingResumed$.html "Permalink")  case object [WritingResumed](Tcp$$WritingResumed$.html) extends [WritingResumed](Tcp$$WritingResumed.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../akka/io/Tcp$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../actor/ExtensionId.html)\[[TcpExt](TcpExt.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Inet$$SoForwarders.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Abort$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Aborted$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Bind.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Bound.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Close$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$CloseCommand.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Closed$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Command.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$CommandFailed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$CompoundWrite.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$ConfirmedClose$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$ConfirmedClosed$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Connect.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Connected.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$ConnectionClosed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$ErrorClosed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Event.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Message.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$NoAck$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$NoAck.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$PeerClosed$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Received.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$Register.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$$ResumeAccepting.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$.html](https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$.html)*