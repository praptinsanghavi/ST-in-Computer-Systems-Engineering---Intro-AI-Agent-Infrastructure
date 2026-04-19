---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/UdpConnectedMessage.html
title: UdpConnectedMessage
---

# UdpConnectedMessage

## Content

Package [akka.io](package-summary.html)
## Class UdpConnectedMessage

- java.lang.Object
- - akka.io.UdpConnectedMessage

- ---

```
public class UdpConnectedMessage
extends java.lang.Object
```

Java API: factory methods for the message types used when communicating with the UdpConnected service.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UdpConnectedMessage](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")` | `[connect](#connect(akka.actor.ActorRef,java.net.InetSocketAddress))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,  java.net.InetSocketAddress remoteAddress)` | Connect without specifying the `localAddress` or `options`. |
	| `static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")` | `[connect](#connect(akka.actor.ActorRef,java.net.InetSocketAddress,java.lang.Iterable))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,  java.net.InetSocketAddress remoteAddress,  java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options)` | Connect without specifying the `localAddress`. |
	| `static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")` | `[connect](#connect(akka.actor.ActorRef,java.net.InetSocketAddress,java.net.InetSocketAddress,java.lang.Iterable))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,  java.net.InetSocketAddress remoteAddress,  java.net.InetSocketAddress localAddress,  java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options)` | Send this message to the [`UdpExt.manager()`](UdpExt.html#manager()) in order to bind to a local  port (optionally with the chosen `localAddress`) and create a UDP socket  which is restricted to sending to and receiving from the given `remoteAddress`. |
	| `static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")` | `[disconnect](#disconnect())()` | Send this message to a connection actor (which had previously sent the  [`UdpConnected.Connected`](UdpConnected.Connected.html "interface in akka.io") message) in order to close the socket. |
	| `static [UdpConnected.NoAck](UdpConnected.NoAck.html "class in akka.io")` | `[noAck](#noAck())()` | Default [`UdpConnected.NoAck`](UdpConnected.NoAck.html "class in akka.io") instance which is used when no acknowledgment information is  explicitly provided. |
	| `static [UdpConnected.NoAck](UdpConnected.NoAck.html "class in akka.io")` | `[noAck](#noAck(java.lang.Object))​(java.lang.Object token)` | Each [`UdpConnected.Send`](UdpConnected.Send.html "class in akka.io") can optionally request a positive acknowledgment to be sent  to the commanding actor. |
	| `static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")` | `[resumeReading](#resumeReading())()` | This message must be sent to the listener actor to re\-enable reading from  the socket after a `UdpConnected.SuspendReading` command. |
	| `static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")` | `[send](#send(akka.util.ByteString))​([ByteString](../util/ByteString.html "class in akka.util") data)` | Send without requesting acknowledgment. |
	| `static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")` | `[send](#send(akka.util.ByteString,java.lang.Object))​([ByteString](../util/ByteString.html "class in akka.util") data,  java.lang.Object ack)` | This message is understood by the connection actors to send data to their  designated destination. |
	| `static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io")` | `[suspendReading](#suspendReading())()` | Send this message to a listener actor (which sent a [`Udp.Bound`](Udp.Bound.html "class in akka.io") message) to  have it stop reading datagrams from the network. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UdpConnectedMessage
		
		
		
		```
		public UdpConnectedMessage()
		```

	- ### Method Detail
	
	
	
		- #### connect
		
		
		
		```
		public static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io") connect​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,
		                                           java.net.InetSocketAddress remoteAddress,
		                                           java.net.InetSocketAddress localAddress,
		                                           java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options)
		```
		
		Send this message to the [`UdpExt.manager()`](UdpExt.html#manager()) in order to bind to a local
		 port (optionally with the chosen `localAddress`) and create a UDP socket
		 which is restricted to sending to and receiving from the given `remoteAddress`.
		 All received datagrams will be sent to the designated `handler` actor.
		- #### connect
		
		
		
		```
		public static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io") connect​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,
		                                           java.net.InetSocketAddress remoteAddress,
		                                           java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options)
		```
		
		Connect without specifying the `localAddress`.
		- #### connect
		
		
		
		```
		public static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io") connect​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,
		                                           java.net.InetSocketAddress remoteAddress)
		```
		
		Connect without specifying the `localAddress` or `options`.
		- #### send
		
		
		
		```
		public static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io") send​([ByteString](../util/ByteString.html "class in akka.util") data,
		                                        java.lang.Object ack)
		```
		
		This message is understood by the connection actors to send data to their
		 designated destination. The connection actor will respond with
		 [`UdpConnected.CommandFailed`](UdpConnected.CommandFailed.html "class in akka.io") if the send could not be enqueued to the O/S kernel
		 because the send buffer was full. If the given `ack` is not of type [`UdpConnected.NoAck`](UdpConnected.NoAck.html "class in akka.io")
		 the connection actor will reply with the given object as soon as the datagram
		 has been successfully enqueued to the O/S kernel.
		- #### send
		
		
		
		```
		public static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io") send​([ByteString](../util/ByteString.html "class in akka.util") data)
		```
		
		Send without requesting acknowledgment.
		- #### disconnect
		
		
		
		```
		public static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io") disconnect()
		```
		
		Send this message to a connection actor (which had previously sent the
		 [`UdpConnected.Connected`](UdpConnected.Connected.html "interface in akka.io") message) in order to close the socket. The connection actor
		 will reply with a [`UdpConnected.Disconnected`](UdpConnected.Disconnected.html "interface in akka.io") message.
		- #### noAck
		
		
		
		```
		public static [UdpConnected.NoAck](UdpConnected.NoAck.html "class in akka.io") noAck​(java.lang.Object token)
		```
		
		Each [`UdpConnected.Send`](UdpConnected.Send.html "class in akka.io") can optionally request a positive acknowledgment to be sent
		 to the commanding actor. If such notification is not desired the [`UdpConnected.Send.ack()`](UdpConnected.Send.html#ack())
		 must be set to an instance of this class. The token contained within can be used
		 to recognize which write failed when receiving a [`UdpConnected.CommandFailed`](UdpConnected.CommandFailed.html "class in akka.io") message.
		- #### noAck
		
		
		
		```
		public static [UdpConnected.NoAck](UdpConnected.NoAck.html "class in akka.io") noAck()
		```
		
		Default [`UdpConnected.NoAck`](UdpConnected.NoAck.html "class in akka.io") instance which is used when no acknowledgment information is
		 explicitly provided. Its \&ldquo;token\&rdquo; is `null`.
		- #### suspendReading
		
		
		
		```
		public static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io") suspendReading()
		```
		
		Send this message to a listener actor (which sent a [`Udp.Bound`](Udp.Bound.html "class in akka.io") message) to
		 have it stop reading datagrams from the network. If the O/S kernel\&rsquo;s receive
		 buffer runs full then subsequent datagrams will be silently discarded.
		 Re\-enable reading from the socket using the `UdpConnected.ResumeReading` command.
		- #### resumeReading
		
		
		
		```
		public static [UdpConnected.Command](UdpConnected.Command.html "interface in akka.io") resumeReading()
		```
		
		This message must be sent to the listener actor to re\-enable reading from
		 the socket after a `UdpConnected.SuspendReading` command.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.Bound.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.Command.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.CommandFailed.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.Connected.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.Disconnected.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.NoAck.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpConnected.Send.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpExt.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/UdpConnectedMessage.html](https://doc.akka.io/japi/akka/current/akka/io/UdpConnectedMessage.html)*