---
description: Akka 2.10.17 - akka.io.TcpMessage
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:03:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/TcpMessage$.html
title: Akka 2.10.17 - akka.io.TcpMessage
---

# Akka 2.10.17 - akka.io.TcpMessage

> **Summary:** Akka 2.10.17 - akka.io.TcpMessage

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
- TcpMessage
- [TcpSO](TcpSO$.html "Java API for accessing socket options.")
- [Udp](Udp$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnected](UdpConnected$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnectedExt](UdpConnectedExt.html)
- [UdpConnectedMessage](UdpConnectedMessage$.html "Java API: factory methods for the message types used when communicating with the UdpConnected service.")
- [UdpExt](UdpExt.html)
- [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")
- [UdpSO](UdpSO$.html)
o[akka](../index.html).[io](index.html)

# TcpMessage[**](../../akka/io/TcpMessage$.html "Permalink")

### 

#### object TcpMessage

Source[Tcp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Tcp.scala#L693)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TcpMessage
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/TcpMessage$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/TcpMessage$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/TcpMessage$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/TcpMessage$.html#abort:akka.io.Tcp.Command "Permalink")  def abort: [Command](Tcp$$Command.html)An abort operation will not flush pending writes and will issue a TCP ABORT
command to the O/S kernel which should result in a TCP\_RST packet being sent
to the peer.

An abort operation will not flush pending writes and will issue a TCP ABORT
command to the O/S kernel which should result in a TCP\_RST packet being sent
to the peer. The sender of this command and the registered handler for
incoming data will both be notified once the socket is closed using a
`Tcp.Aborted` message.
5. [**](../../akka/io/TcpMessage$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/io/TcpMessage$.html#bind(handler:akka.actor.ActorRef,endpoint:java.net.InetSocketAddress,backlog:Int):akka.io.Tcp.Command "Permalink")  def bind(handler: [ActorRef](../actor/ActorRef.html), endpoint: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Command](Tcp$$Command.html)Open a listening socket without specifying options.
7. [**](../../akka/io/TcpMessage$.html#bind(handler:akka.actor.ActorRef,endpoint:java.net.InetSocketAddress,backlog:Int,options:Iterable[akka.io.Inet.SocketOption],pullMode:Boolean):akka.io.Tcp.Command "Permalink")  def bind(handler: [ActorRef](../actor/ActorRef.html), endpoint: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](Inet$$SocketOption.html)], pullMode: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Command](Tcp$$Command.html)The Bind message is send to the TCP manager actor, which is obtained via
[TcpExt\#getManager](TcpExt.html#getManager:akka.actor.ActorRef) in order to bind to a listening socket.

The Bind message is send to the TCP manager actor, which is obtained via
[TcpExt\#getManager](TcpExt.html#getManager:akka.actor.ActorRef) in order to bind to a listening socket. The manager
replies either with a [Tcp.CommandFailed](Tcp$$CommandFailed.html) or the actor handling the listen
socket replies with a [Tcp.Bound](Tcp$$Bound.html) message. If the local port is set to 0 in
the Bind message, then the [Tcp.Bound](Tcp$$Bound.html) message should be inspected to find
the actual port which was bound to.

handlerThe actor which will receive all incoming connection requests
 in the form of [Tcp.Connected](Tcp$$Connected.html) messages.

endpointThe socket address to bind to; use port zero for
 automatic assignment (i.e. an ephemeral port, see [Tcp.Bound](Tcp$$Bound.html))

backlogThis specifies the number of unaccepted connections the O/S
 kernel will hold for this port before refusing connections.

optionsPlease refer to [TcpSO](TcpSO$.html) for a list of all supported options.

pullModeenables pull based accepting and of connections and pull
 based reading from the accepted connections.
8. [**](../../akka/io/TcpMessage$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/io/TcpMessage$.html#close:akka.io.Tcp.Command "Permalink")  def close: [Command](Tcp$$Command.html)A normal close operation will first flush pending writes and then close the
socket.

A normal close operation will first flush pending writes and then close the
socket. The sender of this command and the registered handler for incoming
data will both be notified once the socket is closed using a `Tcp.Closed`
message.
10. [**](../../akka/io/TcpMessage$.html#confirmedClose:akka.io.Tcp.Command "Permalink")  def confirmedClose: [Command](Tcp$$Command.html)A confirmed close operation will flush pending writes and half\-close the
connection, waiting for the peer to close the other half.

A confirmed close operation will flush pending writes and half\-close the
connection, waiting for the peer to close the other half. The sender of this
command and the registered handler for incoming data will both be notified
once the socket is closed using a `Tcp.ConfirmedClosed` message.
11. [**](../../akka/io/TcpMessage$.html#connect(remoteAddress:java.net.InetSocketAddress):akka.io.Tcp.Command "Permalink")  def connect(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [Command](Tcp$$Command.html)Connect to the given `remoteAddress` without binding to a local address and without
specifying options.
12. [**](../../akka/io/TcpMessage$.html#connect(remoteAddress:java.net.InetSocketAddress,localAddress:java.net.InetSocketAddress,options:Iterable[akka.io.Inet.SocketOption],timeout:java.time.Duration,pullMode:Boolean):akka.io.Tcp.Command "Permalink")  def connect(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](Inet$$SocketOption.html)], timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), pullMode: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Command](Tcp$$Command.html)The Connect message is sent to the TCP manager actor, which is obtained via
[TcpExt\#getManager](TcpExt.html#getManager:akka.actor.ActorRef).

The Connect message is sent to the TCP manager actor, which is obtained via
[TcpExt\#getManager](TcpExt.html#getManager:akka.actor.ActorRef). Either the manager replies with a [Tcp.CommandFailed](Tcp$$CommandFailed.html)
or the actor handling the new connection replies with a [Tcp.Connected](Tcp$$Connected.html)
message.

remoteAddressis the address to connect to

localAddressoptionally specifies a specific address to bind to

optionsPlease refer to [TcpSO](TcpSO$.html) for a list of all supported options.

timeoutis the desired connection timeout, `null` means "no timeout"

pullModeenables pull based reading from the connection
13. [**](../../akka/io/TcpMessage$.html#connect(remoteAddress:java.net.InetSocketAddress,localAddress:java.net.InetSocketAddress,options:Iterable[akka.io.Inet.SocketOption],timeout:scala.concurrent.duration.FiniteDuration,pullMode:Boolean):akka.io.Tcp.Command "Permalink")  def connect(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](Inet$$SocketOption.html)], timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), pullMode: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Command](Tcp$$Command.html)The Connect message is sent to the TCP manager actor, which is obtained via
[TcpExt\#getManager](TcpExt.html#getManager:akka.actor.ActorRef).

The Connect message is sent to the TCP manager actor, which is obtained via
[TcpExt\#getManager](TcpExt.html#getManager:akka.actor.ActorRef). Either the manager replies with a [Tcp.CommandFailed](Tcp$$CommandFailed.html)
or the actor handling the new connection replies with a [Tcp.Connected](Tcp$$Connected.html)
message.

remoteAddressis the address to connect to

localAddressoptionally specifies a specific address to bind to

optionsPlease refer to [TcpSO](TcpSO$.html) for a list of all supported options.

timeoutis the desired connection timeout, `null` means "no timeout"

pullModeenables pull based reading from the connection
14. [**](../../akka/io/TcpMessage$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/io/TcpMessage$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../akka/io/TcpMessage$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/io/TcpMessage$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/io/TcpMessage$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/io/TcpMessage$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/io/TcpMessage$.html#noAck:akka.io.Tcp.NoAck "Permalink")  def noAck: [NoAck](Tcp$$NoAck.html)Default [Tcp.NoAck](Tcp$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided.

Default [Tcp.NoAck](Tcp$$NoAck.html) instance which is used when no acknowledgment information is
explicitly provided. Its “token” is `null`.
21. [**](../../akka/io/TcpMessage$.html#noAck(token:AnyRef):akka.io.Tcp.NoAck "Permalink")  def noAck(token: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [NoAck](Tcp$$NoAck.html)Each [Tcp.WriteCommand](Tcp$$WriteCommand.html) can optionally request a positive acknowledgment to be sent
to the commanding actor.

Each [Tcp.WriteCommand](Tcp$$WriteCommand.html) can optionally request a positive acknowledgment to be sent
to the commanding actor. If such notification is not desired the [Tcp.SimpleWriteCommand\#ack](Tcp$$SimpleWriteCommand.html#ack:akka.io.Tcp.Event)
must be set to an instance of this class. The token contained within can be used
to recognize which write failed when receiving a [Tcp.CommandFailed](Tcp$$CommandFailed.html) message.
22. [**](../../akka/io/TcpMessage$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/io/TcpMessage$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/io/TcpMessage$.html#register(handler:akka.actor.ActorRef):akka.io.Tcp.Command "Permalink")  def register(handler: [ActorRef](../actor/ActorRef.html)): [Command](Tcp$$Command.html)The same as `register(handler, false, false)`.
25. [**](../../akka/io/TcpMessage$.html#register(handler:akka.actor.ActorRef,keepOpenOnPeerClosed:Boolean,useResumeWriting:Boolean):akka.io.Tcp.Command "Permalink")  def register(handler: [ActorRef](../actor/ActorRef.html), keepOpenOnPeerClosed: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), useResumeWriting: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Command](Tcp$$Command.html)This message must be sent to a TCP connection actor after receiving the
[Tcp.Connected](Tcp$$Connected.html) message.

This message must be sent to a TCP connection actor after receiving the
[Tcp.Connected](Tcp$$Connected.html) message. The connection will not read any data from the
socket until this message is received, because this message defines the
actor which will receive all inbound data.

handlerThe actor which will receive all incoming data and which
 will be informed when the connection is closed.

keepOpenOnPeerClosedIf this is set to true then the connection
 is not automatically closed when the peer closes its half,
 requiring an explicit `Tcp.ConnectionClosed from our side when finished.`

useResumeWritingIf this is set to true then the connection actor
 will refuse all further writes after issuing a [Tcp.CommandFailed](Tcp$$CommandFailed.html)
 notification until [Tcp](Tcp$.html) `ResumeWriting` is received. This can
 be used to implement NACK\-based write backpressure.
26. [**](../../akka/io/TcpMessage$.html#resumeAccepting(batchSize:Int):akka.io.Tcp.Command "Permalink")  def resumeAccepting(batchSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Command](Tcp$$Command.html)This message enables the accepting of the next connection if pull reading is enabled
for connection actors.

This message enables the accepting of the next connection if pull reading is enabled
for connection actors.

batchSizeThe number of connections to accept before waiting for the next resume command
27. [**](../../akka/io/TcpMessage$.html#resumeReading:akka.io.Tcp.Command "Permalink")  def resumeReading: [Command](Tcp$$Command.html)This command needs to be sent to the connection actor after a `Tcp.SuspendReading`
command in order to resume reading from the socket.
28. [**](../../akka/io/TcpMessage$.html#resumeWriting:akka.io.Tcp.Command "Permalink")  def resumeWriting: [Command](Tcp$$Command.html)When `useResumeWriting` is in effect as was indicated in the [Tcp.Register](Tcp$$Register.html) message
then this command needs to be sent to the connection actor in order to re\-enable
writing after a [Tcp.CommandFailed](Tcp$$CommandFailed.html) event.

When `useResumeWriting` is in effect as was indicated in the [Tcp.Register](Tcp$$Register.html) message
then this command needs to be sent to the connection actor in order to re\-enable
writing after a [Tcp.CommandFailed](Tcp$$CommandFailed.html) event. All [Tcp.WriteCommand](Tcp$$WriteCommand.html) processed by the
connection actor between the first [Tcp.CommandFailed](Tcp$$CommandFailed.html) and subsequent reception of
this message will also be rejected with [Tcp.CommandFailed](Tcp$$CommandFailed.html).
29. [**](../../akka/io/TcpMessage$.html#suspendReading:akka.io.Tcp.Command "Permalink")  def suspendReading: [Command](Tcp$$Command.html)Sending this command to the connection actor will disable reading from the TCP
socket.

Sending this command to the connection actor will disable reading from the TCP
socket. TCP flow\-control will then propagate backpressure to the sender side
as buffers fill up on either end. To re\-enable reading send `Tcp.ResumeReading`.
30. [**](../../akka/io/TcpMessage$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../akka/io/TcpMessage$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../akka/io/TcpMessage$.html#unbind:akka.io.Tcp.Command "Permalink")  def unbind: [Command](Tcp$$Command.html)In order to close down a listening socket, send this message to that socket’s
actor (that is the actor which previously had sent the [Tcp.Bound](Tcp$$Bound.html) message).

In order to close down a listening socket, send this message to that socket’s
actor (that is the actor which previously had sent the [Tcp.Bound](Tcp$$Bound.html) message). The
listener socket actor will reply with a `Tcp.Unbound` message.
33. [**](../../akka/io/TcpMessage$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../akka/io/TcpMessage$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../akka/io/TcpMessage$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../akka/io/TcpMessage$.html#write(data:akka.util.ByteString):akka.io.Tcp.Command "Permalink")  def write(data: [ByteString](../util/ByteString.html)): [Command](Tcp$$Command.html)The same as `write(data, noAck())`.
37. [**](../../akka/io/TcpMessage$.html#write(data:akka.util.ByteString,ack:akka.io.Tcp.Event):akka.io.Tcp.Command "Permalink")  def write(data: [ByteString](../util/ByteString.html), ack: [Event](Tcp$$Event.html)): [Command](Tcp$$Command.html)Write data to the TCP connection.

Write data to the TCP connection. If no ack is needed use the special
`NoAck` object. The connection actor will reply with a [Tcp.CommandFailed](Tcp$$CommandFailed.html)
message if the write could not be enqueued. If [Tcp.SimpleWriteCommand\#wantsAck](Tcp$$SimpleWriteCommand.html#wantsAck:Boolean)
returns true, the connection actor will reply with the supplied [Tcp.SimpleWriteCommand\#ack](Tcp$$SimpleWriteCommand.html#ack:akka.io.Tcp.Event)
token once the write has been successfully enqueued to the O/S kernel.
**Note that this does not in any way guarantee that the data will be
or have been sent!** Unfortunately there is no way to determine whether
a particular write has been sent by the O/S.
38. [**](../../akka/io/TcpMessage$.html#writeFile(filePath:String,position:Long,count:Long,ack:akka.io.Tcp.Event):akka.io.Tcp.Command "Permalink")  def writeFile(filePath: String, position: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), count: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ack: [Event](Tcp$$Event.html)): [Command](Tcp$$Command.html)Write `count` bytes starting at `position` from file at `filePath` to the connection.

Write `count` bytes starting at `position` from file at `filePath` to the connection.
The count must be \> 0\. The connection actor will reply with a [Tcp.CommandFailed](Tcp$$CommandFailed.html)
message if the write could not be enqueued. If [Tcp.SimpleWriteCommand\#wantsAck](Tcp$$SimpleWriteCommand.html#wantsAck:Boolean)
returns true, the connection actor will reply with the supplied [Tcp.SimpleWriteCommand\#ack](Tcp$$SimpleWriteCommand.html#ack:akka.io.Tcp.Event)
token once the write has been successfully enqueued to the O/S kernel.
**Note that this does not in any way guarantee that the data will be
or have been sent!** Unfortunately there is no way to determine whether
a particular write has been sent by the O/S.
39. [**](../../akka/io/TcpMessage$.html#writePath(filePath:java.nio.file.Path,position:Long,count:Long,ack:akka.io.Tcp.Event):akka.io.Tcp.Command "Permalink")  def writePath(filePath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), position: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), count: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), ack: [Event](Tcp$$Event.html)): [Command](Tcp$$Command.html)Write `count` bytes starting at `position` from file at `filePath` to the connection.

Write `count` bytes starting at `position` from file at `filePath` to the connection.
The count must be \> 0\. The connection actor will reply with a [Tcp.CommandFailed](Tcp$$CommandFailed.html)
message if the write could not be enqueued. If [Tcp.SimpleWriteCommand\#wantsAck](Tcp$$SimpleWriteCommand.html#wantsAck:Boolean)
returns true, the connection actor will reply with the supplied [Tcp.SimpleWriteCommand\#ack](Tcp$$SimpleWriteCommand.html#ack:akka.io.Tcp.Event)
token once the write has been successfully enqueued to the O/S kernel.
**Note that this does not in any way guarantee that the data will be
or have been sent!** Unfortunately there is no way to determine whether
a particular write has been sent by the O/S.
### Deprecated Value Members

1. [**](../../akka/io/TcpMessage$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$Bound.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$CommandFailed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$Connected.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$Event.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$NoAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$Register.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$SimpleWriteCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$$WriteCommand.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpMessage$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpMessage$.html)*