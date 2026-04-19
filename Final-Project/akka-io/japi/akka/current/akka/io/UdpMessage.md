---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/UdpMessage.html
title: UdpMessage
---

# UdpMessage

## Content

Package [akka.io](package-summary.html)
## Class UdpMessage

- java.lang.Object
- - akka.io.UdpMessage

- ---

```
public class UdpMessage
extends java.lang.Object
```

Java API: factory methods for the message types used when communicating with the Udp service.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UdpMessage](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Udp.Command](Udp.Command.html "interface in akka.io")` | `[bind](#bind(akka.actor.ActorRef,java.net.InetSocketAddress))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,  java.net.InetSocketAddress endpoint)` | Bind without specifying options. |
	| `static [Udp.Command](Udp.Command.html "interface in akka.io")` | `[bind](#bind(akka.actor.ActorRef,java.net.InetSocketAddress,java.lang.Iterable))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,  java.net.InetSocketAddress endpoint,  java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options)` | Send this message to the [`UdpExt.manager()`](UdpExt.html#manager()) in order to bind to the given  local port (or an automatically assigned one if the port number is zero). |
	| `static [Udp.NoAck](Udp.NoAck.html "class in akka.io")` | `[noAck](#noAck())()` | Default [`Udp.NoAck`](Udp.NoAck.html "class in akka.io") instance which is used when no acknowledgment information is  explicitly provided. |
	| `static [Udp.NoAck](Udp.NoAck.html "class in akka.io")` | `[noAck](#noAck(java.lang.Object))​(java.lang.Object token)` | Each [`Udp.Send`](Udp.Send.html "class in akka.io") can optionally request a positive acknowledgment to be sent  to the commanding actor. |
	| `static [Udp.Command](Udp.Command.html "interface in akka.io")` | `[resumeReading](#resumeReading())()` | This message must be sent to the listener actor to re\-enable reading from  the socket after a `Udp.SuspendReading` command. |
	| `static [Udp.Command](Udp.Command.html "interface in akka.io")` | `[send](#send(akka.util.ByteString,java.net.InetSocketAddress))​([ByteString](../util/ByteString.html "class in akka.util") payload,  java.net.InetSocketAddress target)` | The same as `send(payload, target, noAck())`. |
	| `static [Udp.Command](Udp.Command.html "interface in akka.io")` | `[send](#send(akka.util.ByteString,java.net.InetSocketAddress,akka.io.Udp.Event))​([ByteString](../util/ByteString.html "class in akka.util") payload,  java.net.InetSocketAddress target,  [Udp.Event](Udp.Event.html "interface in akka.io") ack)` | This message is understood by the \&ldquo;simple sender\&rdquo; which can be obtained by  sending the [`Udp.SimpleSender`](Udp.SimpleSender.html "class in akka.io") query to the [`UdpExt.manager()`](UdpExt.html#manager()) as well as by  the listener actors which are created in response to [`Udp.Bind`](Udp.Bind.html "class in akka.io"). |
	| `static [Udp.Command](Udp.Command.html "interface in akka.io")` | `[simpleSender](#simpleSender())()` | Retrieve a simple sender without specifying options. |
	| `static [Udp.Command](Udp.Command.html "interface in akka.io")` | `[simpleSender](#simpleSender(java.lang.Iterable))​(java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options)` | Retrieve a reference to a \&ldquo;simple sender\&rdquo; actor of the UDP extension. |
	| `static [Udp.Command](Udp.Command.html "interface in akka.io")` | `[suspendReading](#suspendReading())()` | Send this message to a listener actor (which sent a [`Udp.Bound`](Udp.Bound.html "class in akka.io") message) to  have it stop reading datagrams from the network. |
	| `static [Udp.Command](Udp.Command.html "interface in akka.io")` | `[unbind](#unbind())()` | Send this message to the listener actor that previously sent a [`Udp.Bound`](Udp.Bound.html "class in akka.io")  message in order to close the listening socket. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UdpMessage
		
		
		
		```
		public UdpMessage()
		```

	- ### Method Detail
	
	
	
		- #### noAck
		
		
		
		```
		public static [Udp.NoAck](Udp.NoAck.html "class in akka.io") noAck​(java.lang.Object token)
		```
		
		Each [`Udp.Send`](Udp.Send.html "class in akka.io") can optionally request a positive acknowledgment to be sent
		 to the commanding actor. If such notification is not desired the [`Udp.Send.ack()`](Udp.Send.html#ack())
		 must be set to an instance of this class. The token contained within can be used
		 to recognize which write failed when receiving a [`Udp.CommandFailed`](Udp.CommandFailed.html "class in akka.io") message.
		- #### noAck
		
		
		
		```
		public static [Udp.NoAck](Udp.NoAck.html "class in akka.io") noAck()
		```
		
		Default [`Udp.NoAck`](Udp.NoAck.html "class in akka.io") instance which is used when no acknowledgment information is
		 explicitly provided. Its \&ldquo;token\&rdquo; is `null`.
		- #### send
		
		
		
		```
		public static [Udp.Command](Udp.Command.html "interface in akka.io") send​([ByteString](../util/ByteString.html "class in akka.util") payload,
		                               java.net.InetSocketAddress target,
		                               [Udp.Event](Udp.Event.html "interface in akka.io") ack)
		```
		
		This message is understood by the \&ldquo;simple sender\&rdquo; which can be obtained by
		 sending the [`Udp.SimpleSender`](Udp.SimpleSender.html "class in akka.io") query to the [`UdpExt.manager()`](UdpExt.html#manager()) as well as by
		 the listener actors which are created in response to [`Udp.Bind`](Udp.Bind.html "class in akka.io"). It will send
		 the given payload data as one UDP datagram to the given target address. The
		 UDP actor will respond with [`Udp.CommandFailed`](Udp.CommandFailed.html "class in akka.io") if the send could not be
		 enqueued to the O/S kernel because the send buffer was full. If the given
		 `ack` is not of type [`Udp.NoAck`](Udp.NoAck.html "class in akka.io") the UDP actor will reply with the given
		 object as soon as the datagram has been successfully enqueued to the O/S
		 kernel.
		 
		 The sending UDP socket\&rsquo;s address belongs to the \&ldquo;simple sender\&rdquo; which does
		 not handle inbound datagrams and sends from an ephemeral port; therefore
		 sending using this mechanism is not suitable if replies are expected, use
		 [`Udp.Bind`](Udp.Bind.html "class in akka.io") in that case.
		- #### send
		
		
		
		```
		public static [Udp.Command](Udp.Command.html "interface in akka.io") send​([ByteString](../util/ByteString.html "class in akka.util") payload,
		                               java.net.InetSocketAddress target)
		```
		
		The same as `send(payload, target, noAck())`.
		- #### bind
		
		
		
		```
		public static [Udp.Command](Udp.Command.html "interface in akka.io") bind​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,
		                               java.net.InetSocketAddress endpoint,
		                               java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options)
		```
		
		Send this message to the [`UdpExt.manager()`](UdpExt.html#manager()) in order to bind to the given
		 local port (or an automatically assigned one if the port number is zero).
		 The listener actor for the newly bound port will reply with a [`Udp.Bound`](Udp.Bound.html "class in akka.io")
		 message, or the manager will reply with a [`Udp.CommandFailed`](Udp.CommandFailed.html "class in akka.io") message.
		- #### bind
		
		
		
		```
		public static [Udp.Command](Udp.Command.html "interface in akka.io") bind​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,
		                               java.net.InetSocketAddress endpoint)
		```
		
		Bind without specifying options.
		- #### unbind
		
		
		
		```
		public static [Udp.Command](Udp.Command.html "interface in akka.io") unbind()
		```
		
		Send this message to the listener actor that previously sent a [`Udp.Bound`](Udp.Bound.html "class in akka.io")
		 message in order to close the listening socket. The recipient will reply
		 with an [`Udp.Unbound`](Udp.Unbound.html "interface in akka.io") message.
		- #### simpleSender
		
		
		
		```
		public static [Udp.Command](Udp.Command.html "interface in akka.io") simpleSender​(java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options)
		```
		
		Retrieve a reference to a \&ldquo;simple sender\&rdquo; actor of the UDP extension.
		 The newly created \&ldquo;simple sender\&rdquo; will reply with the [`Udp.SimpleSenderReady`](Udp.SimpleSenderReady.html "interface in akka.io") notification.
		 
		 The \&ldquo;simple sender\&rdquo; is a convenient service for being able to send datagrams
		 when the originating address is meaningless, i.e. when no reply is expected.
		 
		
		
		 The \&ldquo;simple sender\&rdquo; will not stop itself, you will have to send it a [`PoisonPill`](../actor/PoisonPill.html "class in akka.actor")
		 when you want to close the socket.
		- #### simpleSender
		
		
		
		```
		public static [Udp.Command](Udp.Command.html "interface in akka.io") simpleSender()
		```
		
		Retrieve a simple sender without specifying options.
		- #### suspendReading
		
		
		
		```
		public static [Udp.Command](Udp.Command.html "interface in akka.io") suspendReading()
		```
		
		Send this message to a listener actor (which sent a [`Udp.Bound`](Udp.Bound.html "class in akka.io") message) to
		 have it stop reading datagrams from the network. If the O/S kernel\&rsquo;s receive
		 buffer runs full then subsequent datagrams will be silently discarded.
		 Re\-enable reading from the socket using the `Udp.ResumeReading` command.
		- #### resumeReading
		
		
		
		```
		public static [Udp.Command](Udp.Command.html "interface in akka.io") resumeReading()
		```
		
		This message must be sent to the listener actor to re\-enable reading from
		 the socket after a `Udp.SuspendReading` command.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka/current/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.Bind.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.Bound.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.Command.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.CommandFailed.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.Event.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.NoAck.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.Send.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.SimpleSender.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.SimpleSenderReady.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.Unbound.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpExt.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/UdpMessage.html](https://doc.akka.io/japi/akka/current/akka/io/UdpMessage.html)*