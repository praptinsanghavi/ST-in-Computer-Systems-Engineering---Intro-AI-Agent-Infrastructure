---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:17:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/TcpMessage.html
title: TcpMessage
---

# TcpMessage

## Content

Package [akka.io](package-summary.html)
## Class TcpMessage

- java.lang.Object
- - akka.io.TcpMessage

- ---

```
public class TcpMessage
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TcpMessage](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[abort](#abort())()` | An abort operation will not flush pending writes and will issue a TCP ABORT  command to the O/S kernel which should result in a TCP\_RST packet being sent  to the peer. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[bind](#bind(akka.actor.ActorRef,java.net.InetSocketAddress,int))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,  java.net.InetSocketAddress endpoint,  int backlog)` | Open a listening socket without specifying options. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[bind](#bind(akka.actor.ActorRef,java.net.InetSocketAddress,int,java.lang.Iterable,boolean))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,  java.net.InetSocketAddress endpoint,  int backlog,  java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options,  boolean pullMode)` | The Bind message is send to the TCP manager actor, which is obtained via  [`TcpExt.getManager()`](TcpExt.html#getManager()) in order to bind to a listening socket. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[close](#close())()` | A normal close operation will first flush pending writes and then close the  socket. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[confirmedClose](#confirmedClose())()` | A confirmed close operation will flush pending writes and half\-close the  connection, waiting for the peer to close the other half. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[connect](#connect(java.net.InetSocketAddress))​(java.net.InetSocketAddress remoteAddress)` | Connect to the given `remoteAddress` without binding to a local address and without  specifying options. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[connect](#connect(java.net.InetSocketAddress,java.net.InetSocketAddress,java.lang.Iterable,java.time.Duration,boolean))​(java.net.InetSocketAddress remoteAddress,  java.net.InetSocketAddress localAddress,  java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options,  java.time.Duration timeout,  boolean pullMode)` | The Connect message is sent to the TCP manager actor, which is obtained via  [`TcpExt.getManager()`](TcpExt.html#getManager()). |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[connect](#connect(java.net.InetSocketAddress,java.net.InetSocketAddress,java.lang.Iterable,scala.concurrent.duration.FiniteDuration,boolean))​(java.net.InetSocketAddress remoteAddress,  java.net.InetSocketAddress localAddress,  java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options,  scala.concurrent.duration.FiniteDuration timeout,  boolean pullMode)` | The Connect message is sent to the TCP manager actor, which is obtained via  [`TcpExt.getManager()`](TcpExt.html#getManager()). |
	| `static [Tcp.NoAck](Tcp.NoAck.html "class in akka.io")` | `[noAck](#noAck())()` | Default [`Tcp.NoAck`](Tcp.NoAck.html "class in akka.io") instance which is used when no acknowledgment information is  explicitly provided. |
	| `static [Tcp.NoAck](Tcp.NoAck.html "class in akka.io")` | `[noAck](#noAck(java.lang.Object))​(java.lang.Object token)` | Each [`Tcp.WriteCommand`](Tcp.WriteCommand.html "class in akka.io") can optionally request a positive acknowledgment to be sent  to the commanding actor. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[register](#register(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler)` | The same as `register(handler, false, false)`. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[register](#register(akka.actor.ActorRef,boolean,boolean))​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,  boolean keepOpenOnPeerClosed,  boolean useResumeWriting)` | This message must be sent to a TCP connection actor after receiving the  [`Tcp.Connected`](Tcp.Connected.html "class in akka.io") message. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[resumeAccepting](#resumeAccepting(int))​(int batchSize)` | This message enables the accepting of the next connection if pull reading is enabled  for connection actors. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[resumeReading](#resumeReading())()` | This command needs to be sent to the connection actor after a `Tcp.SuspendReading`  command in order to resume reading from the socket. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[resumeWriting](#resumeWriting())()` | When `useResumeWriting` is in effect as was indicated in the [`Tcp.Register`](Tcp.Register.html "class in akka.io") message  then this command needs to be sent to the connection actor in order to re\-enable  writing after a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io") event. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[suspendReading](#suspendReading())()` | Sending this command to the connection actor will disable reading from the TCP  socket. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[unbind](#unbind())()` | In order to close down a listening socket, send this message to that socket\&rsquo;s  actor (that is the actor which previously had sent the [`Tcp.Bound`](Tcp.Bound.html "class in akka.io") message). |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[write](#write(akka.util.ByteString))​([ByteString](../util/ByteString.html "class in akka.util") data)` | The same as `write(data, noAck())`. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[write](#write(akka.util.ByteString,akka.io.Tcp.Event))​([ByteString](../util/ByteString.html "class in akka.util") data,  [Tcp.Event](Tcp.Event.html "interface in akka.io") ack)` | Write data to the TCP connection. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[writeFile](#writeFile(java.lang.String,long,long,akka.io.Tcp.Event))​(java.lang.String filePath,  long position,  long count,  [Tcp.Event](Tcp.Event.html "interface in akka.io") ack)` | Write `count` bytes starting at `position` from file at `filePath` to the connection. |
	| `static [Tcp.Command](Tcp.Command.html "interface in akka.io")` | `[writePath](#writePath(java.nio.file.Path,long,long,akka.io.Tcp.Event))​(java.nio.file.Path filePath,  long position,  long count,  [Tcp.Event](Tcp.Event.html "interface in akka.io") ack)` | Write `count` bytes starting at `position` from file at `filePath` to the connection. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TcpMessage
		
		
		
		```
		public TcpMessage()
		```

	- ### Method Detail
	
	
	
		- #### connect
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") connect​(java.net.InetSocketAddress remoteAddress,
		                                  java.net.InetSocketAddress localAddress,
		                                  java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options,
		                                  scala.concurrent.duration.FiniteDuration timeout,
		                                  boolean pullMode)
		```
		
		The Connect message is sent to the TCP manager actor, which is obtained via
		 [`TcpExt.getManager()`](TcpExt.html#getManager()). Either the manager replies with a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io")
		 or the actor handling the new connection replies with a [`Tcp.Connected`](Tcp.Connected.html "class in akka.io")
		 message.
		 
		
		Parameters:
		`remoteAddress` \- is the address to connect to
		`localAddress` \- optionally specifies a specific address to bind to
		`options` \- Please refer to [`TcpSO`](TcpSO.html "class in akka.io") for a list of all supported options.
		`timeout` \- is the desired connection timeout, `null` means "no timeout"
		`pullMode` \- enables pull based reading from the connection
		- #### connect
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") connect​(java.net.InetSocketAddress remoteAddress,
		                                  java.net.InetSocketAddress localAddress,
		                                  java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options,
		                                  java.time.Duration timeout,
		                                  boolean pullMode)
		```
		
		The Connect message is sent to the TCP manager actor, which is obtained via
		 [`TcpExt.getManager()`](TcpExt.html#getManager()). Either the manager replies with a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io")
		 or the actor handling the new connection replies with a [`Tcp.Connected`](Tcp.Connected.html "class in akka.io")
		 message.
		 
		
		Parameters:
		`remoteAddress` \- is the address to connect to
		`localAddress` \- optionally specifies a specific address to bind to
		`options` \- Please refer to [`TcpSO`](TcpSO.html "class in akka.io") for a list of all supported options.
		`timeout` \- is the desired connection timeout, `null` means "no timeout"
		`pullMode` \- enables pull based reading from the connection
		- #### connect
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") connect​(java.net.InetSocketAddress remoteAddress)
		```
		
		Connect to the given `remoteAddress` without binding to a local address and without
		 specifying options.
		- #### bind
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") bind​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,
		                               java.net.InetSocketAddress endpoint,
		                               int backlog,
		                               java.lang.Iterable<[Inet.SocketOption](Inet.SocketOption.html "interface in akka.io")> options,
		                               boolean pullMode)
		```
		
		The Bind message is send to the TCP manager actor, which is obtained via
		 [`TcpExt.getManager()`](TcpExt.html#getManager()) in order to bind to a listening socket. The manager
		 replies either with a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io") or the actor handling the listen
		 socket replies with a [`Tcp.Bound`](Tcp.Bound.html "class in akka.io") message. If the local port is set to 0 in
		 the Bind message, then the [`Tcp.Bound`](Tcp.Bound.html "class in akka.io") message should be inspected to find
		 the actual port which was bound to.
		 
		
		Parameters:
		`handler` \- The actor which will receive all incoming connection requests
		 in the form of [`Tcp.Connected`](Tcp.Connected.html "class in akka.io") messages.
		 
		`endpoint` \- The socket address to bind to; use port zero for
		 automatic assignment (i.e. an ephemeral port, see [`Tcp.Bound`](Tcp.Bound.html "class in akka.io"))
		 
		`backlog` \- This specifies the number of unaccepted connections the O/S
		 kernel will hold for this port before refusing connections.
		 
		`options` \- Please refer to [`TcpSO`](TcpSO.html "class in akka.io") for a list of all supported options.
		 
		`pullMode` \- enables pull based accepting and of connections and pull
		 based reading from the accepted connections.
		- #### bind
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") bind​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,
		                               java.net.InetSocketAddress endpoint,
		                               int backlog)
		```
		
		Open a listening socket without specifying options.
		- #### register
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") register​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler,
		                                   boolean keepOpenOnPeerClosed,
		                                   boolean useResumeWriting)
		```
		
		This message must be sent to a TCP connection actor after receiving the
		 [`Tcp.Connected`](Tcp.Connected.html "class in akka.io") message. The connection will not read any data from the
		 socket until this message is received, because this message defines the
		 actor which will receive all inbound data.
		 
		
		Parameters:
		`handler` \- The actor which will receive all incoming data and which
		 will be informed when the connection is closed.
		 
		`keepOpenOnPeerClosed` \- If this is set to true then the connection
		 is not automatically closed when the peer closes its half,
		 requiring an explicit `Tcp.ConnectionClosed from our side when finished.`
		
		`useResumeWriting` \- If this is set to true then the connection actor
		 will refuse all further writes after issuing a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io")
		 notification until [`Tcp`](Tcp.html "class in akka.io") `ResumeWriting` is received. This can
		 be used to implement NACK\-based write backpressure.
		- #### register
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") register​([ActorRef](../actor/ActorRef.html "class in akka.actor") handler)
		```
		
		The same as `register(handler, false, false)`.
		- #### unbind
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") unbind()
		```
		
		In order to close down a listening socket, send this message to that socket\&rsquo;s
		 actor (that is the actor which previously had sent the [`Tcp.Bound`](Tcp.Bound.html "class in akka.io") message). The
		 listener socket actor will reply with a `Tcp.Unbound` message.
		- #### close
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") close()
		```
		
		A normal close operation will first flush pending writes and then close the
		 socket. The sender of this command and the registered handler for incoming
		 data will both be notified once the socket is closed using a `Tcp.Closed`
		 message.
		- #### confirmedClose
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") confirmedClose()
		```
		
		A confirmed close operation will flush pending writes and half\-close the
		 connection, waiting for the peer to close the other half. The sender of this
		 command and the registered handler for incoming data will both be notified
		 once the socket is closed using a `Tcp.ConfirmedClosed` message.
		- #### abort
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") abort()
		```
		
		An abort operation will not flush pending writes and will issue a TCP ABORT
		 command to the O/S kernel which should result in a TCP\_RST packet being sent
		 to the peer. The sender of this command and the registered handler for
		 incoming data will both be notified once the socket is closed using a
		 `Tcp.Aborted` message.
		- #### noAck
		
		
		
		```
		public static [Tcp.NoAck](Tcp.NoAck.html "class in akka.io") noAck​(java.lang.Object token)
		```
		
		Each [`Tcp.WriteCommand`](Tcp.WriteCommand.html "class in akka.io") can optionally request a positive acknowledgment to be sent
		 to the commanding actor. If such notification is not desired the [`Tcp.SimpleWriteCommand.ack()`](Tcp.SimpleWriteCommand.html#ack())
		 must be set to an instance of this class. The token contained within can be used
		 to recognize which write failed when receiving a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io") message.
		- #### noAck
		
		
		
		```
		public static [Tcp.NoAck](Tcp.NoAck.html "class in akka.io") noAck()
		```
		
		Default [`Tcp.NoAck`](Tcp.NoAck.html "class in akka.io") instance which is used when no acknowledgment information is
		 explicitly provided. Its \&ldquo;token\&rdquo; is `null`.
		- #### write
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") write​([ByteString](../util/ByteString.html "class in akka.util") data,
		                                [Tcp.Event](Tcp.Event.html "interface in akka.io") ack)
		```
		
		Write data to the TCP connection. If no ack is needed use the special
		 `NoAck` object. The connection actor will reply with a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io")
		 message if the write could not be enqueued. If [`Tcp.SimpleWriteCommand.wantsAck()`](Tcp.SimpleWriteCommand.html#wantsAck())
		 returns true, the connection actor will reply with the supplied [`Tcp.SimpleWriteCommand.ack()`](Tcp.SimpleWriteCommand.html#ack())
		 token once the write has been successfully enqueued to the O/S kernel.
		 **Note that this does not in any way guarantee that the data will be
		 or have been sent!** Unfortunately there is no way to determine whether
		 a particular write has been sent by the O/S.
		- #### write
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") write​([ByteString](../util/ByteString.html "class in akka.util") data)
		```
		
		The same as `write(data, noAck())`.
		- #### writeFile
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") writeFile​(java.lang.String filePath,
		                                    long position,
		                                    long count,
		                                    [Tcp.Event](Tcp.Event.html "interface in akka.io") ack)
		```
		
		Write `count` bytes starting at `position` from file at `filePath` to the connection.
		 The count must be \> 0\. The connection actor will reply with a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io")
		 message if the write could not be enqueued. If [`Tcp.SimpleWriteCommand.wantsAck()`](Tcp.SimpleWriteCommand.html#wantsAck())
		 returns true, the connection actor will reply with the supplied [`Tcp.SimpleWriteCommand.ack()`](Tcp.SimpleWriteCommand.html#ack())
		 token once the write has been successfully enqueued to the O/S kernel.
		 **Note that this does not in any way guarantee that the data will be
		 or have been sent!** Unfortunately there is no way to determine whether
		 a particular write has been sent by the O/S.
		- #### writePath
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") writePath​(java.nio.file.Path filePath,
		                                    long position,
		                                    long count,
		                                    [Tcp.Event](Tcp.Event.html "interface in akka.io") ack)
		```
		
		Write `count` bytes starting at `position` from file at `filePath` to the connection.
		 The count must be \> 0\. The connection actor will reply with a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io")
		 message if the write could not be enqueued. If [`Tcp.SimpleWriteCommand.wantsAck()`](Tcp.SimpleWriteCommand.html#wantsAck())
		 returns true, the connection actor will reply with the supplied [`Tcp.SimpleWriteCommand.ack()`](Tcp.SimpleWriteCommand.html#ack())
		 token once the write has been successfully enqueued to the O/S kernel.
		 **Note that this does not in any way guarantee that the data will be
		 or have been sent!** Unfortunately there is no way to determine whether
		 a particular write has been sent by the O/S.
		- #### resumeWriting
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") resumeWriting()
		```
		
		When `useResumeWriting` is in effect as was indicated in the [`Tcp.Register`](Tcp.Register.html "class in akka.io") message
		 then this command needs to be sent to the connection actor in order to re\-enable
		 writing after a [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io") event. All [`Tcp.WriteCommand`](Tcp.WriteCommand.html "class in akka.io") processed by the
		 connection actor between the first [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io") and subsequent reception of
		 this message will also be rejected with [`Tcp.CommandFailed`](Tcp.CommandFailed.html "class in akka.io").
		- #### suspendReading
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") suspendReading()
		```
		
		Sending this command to the connection actor will disable reading from the TCP
		 socket. TCP flow\-control will then propagate backpressure to the sender side
		 as buffers fill up on either end. To re\-enable reading send `Tcp.ResumeReading`.
		- #### resumeReading
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") resumeReading()
		```
		
		This command needs to be sent to the connection actor after a `Tcp.SuspendReading`
		 command in order to resume reading from the socket.
		- #### resumeAccepting
		
		
		
		```
		public static [Tcp.Command](Tcp.Command.html "interface in akka.io") resumeAccepting​(int batchSize)
		```
		
		This message enables the accepting of the next connection if pull reading is enabled
		 for connection actors.
		
		Parameters:
		`batchSize` \- The number of connections to accept before waiting for the next resume command

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.Bound.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.Command.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.CommandFailed.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.Connected.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.Event.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.NoAck.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.Register.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.SimpleWriteCommand.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.WriteCommand.html
- https://doc.akka.io/japi/akka/current/akka/io/Tcp.html
- https://doc.akka.io/japi/akka/current/akka/io/TcpExt.html
- https://doc.akka.io/japi/akka/current/akka/io/TcpSO.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/TcpMessage.html](https://doc.akka.io/japi/akka/current/akka/io/TcpMessage.html)*