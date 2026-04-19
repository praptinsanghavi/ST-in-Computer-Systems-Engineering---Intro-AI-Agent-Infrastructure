---
description: Low level API for using TCP with classic actors.
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:22Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/io-tcp.html
title: Using TCP • Akka core
---

# Using TCP • Akka core

> **Summary:** Low level API for using TCP with classic actors.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Using TCP

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use TCP, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

## Introduction

The code snippets through\-out this section assume the following imports:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/IODocSpec.scala#L8-L13 "Go to snippet source")import akka.actor.{ Actor, ActorRef, Props }
import akka.io.{ IO, Tcp }
import akka.util.ByteString

import java.net.InetSocketAddress
import scala.annotation.nowarn
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/IODocTest.java#L14-L26 "Go to snippet source")import java.net.InetSocketAddress;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.AbstractActor;
import akka.io.Tcp;
import akka.io.Tcp.Bound;
import akka.io.Tcp.CommandFailed;
import akka.io.Tcp.Connected;
import akka.io.Tcp.ConnectionClosed;
import akka.io.Tcp.Received;
import akka.io.TcpMessage;
import akka.util.ByteString;
```

All of the Akka I/O APIs are accessed through manager objects. When using an I/O API, the first step is to acquire a reference to the appropriate manager. The code below shows how to acquire a reference to the [`Tcp`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$.html "akka.io.Tcp")[`Tcp`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.html "akka.io.Tcp") manager.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/IODocSpec.scala#L21-L24 "Go to snippet source")import akka.io.{ IO, Tcp }
import context.system // implicitly used by IO(Tcp)

val manager = IO(Tcp)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/EchoManager.java#L38 "Go to snippet source")final ActorRef tcpManager = Tcp.get(getContext().getSystem()).manager();
```

The manager is an actor that handles the underlying low level I/O resources (selectors, channels) and instantiates workers for specific tasks, such as listening to incoming connections.

## Connecting

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/IODocSpec.scala#L69-L108 "Go to snippet source")object Client {
  def props(remote: InetSocketAddress, replies: ActorRef) =
    Props(classOf[Client], remote, replies)
}

class Client(remote: InetSocketAddress, listener: ActorRef) extends Actor {

  import Tcp._
  import context.system

  IO(Tcp) ! Connect(remote)

  def receive = {
    case CommandFailed(_: Connect) =>
      listener ! "connect failed"
      context.stop(self)

    case c @ Connected(remote, local) =>
      listener ! c
      val connection = sender()
      connection ! Register(self)
      context.become {
        case data: ByteString =>
          connection ! Write(data)
        case CommandFailed(_: Write) =>
          // O/S buffer was full
          listener ! "write failed"
        case Received(data) =>
          listener ! data
        case "close" =>
          connection ! Close
        case _: ConnectionClosed =>
          listener ! "connection closed"
          context.stop(self)
      }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/IODocTest.java#L107-L172 "Go to snippet source")static class Client extends AbstractActor {

  final InetSocketAddress remote;
  final ActorRef listener;

  public static Props props(InetSocketAddress remote, ActorRef listener) {
    return Props.create(Client.class, remote, listener);
  }

  public Client(InetSocketAddress remote, ActorRef listener) {
    this.remote = remote;
    this.listener = listener;

    final ActorRef tcp = Tcp.get(getContext().getSystem()).manager();
    tcp.tell(TcpMessage.connect(remote), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            CommandFailed.class,
            msg -> {
              listener.tell("failed", getSelf());
              getContext().stop(getSelf());
            })
        .match(
            Connected.class,
            msg -> {
              listener.tell(msg, getSelf());
              getSender().tell(TcpMessage.register(getSelf()), getSelf());
              getContext().become(connected(getSender()));
            })
        .build();
  }

  private Receive connected(final ActorRef connection) {
    return receiveBuilder()
        .match(
            ByteString.class,
            msg -> {
              connection.tell(TcpMessage.write((ByteString) msg), getSelf());
            })
        .match(
            CommandFailed.class,
            msg -> {
              // OS kernel socket buffer was full
            })
        .match(
            Received.class,
            msg -> {
              listener.tell(msg.data(), getSelf());
            })
        .matchEquals(
            "close",
            msg -> {
              connection.tell(TcpMessage.close(), getSelf());
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

The first step of connecting to a remote address is sending a [`Connect`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Connect.html "akka.io.Tcp.Connect") messagemessage by the [`TcpMessage.connect`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#connect(java.net.InetSocketAddress) "akka.io.TcpMessage") method to the TCP manager; in addition to the simplest form shown above there is also the possibility to specify a local [`InetSocketAddress`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html "java.net.InetSocketAddress") to bind to and a list of socket options to apply.

Note
The SO\_NODELAY (TCP\_NODELAY on Windows) socket option defaults to true in Akka, independently of the OS default settings. This setting disables Nagle’s algorithm, considerably improving latency for most applications. This setting could be overridden by passing `SO.TcpNoDelay(false)` in the list of socket options of the `Connect` messagemessage by the `TcpMessage.connect` method.

The TCP manager will then reply either with a [`CommandFailed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$CommandFailed.html "akka.io.Tcp.CommandFailed")[`CommandFailed`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.CommandFailed.html "akka.io.Tcp.CommandFailed") or it will spawn an internal actor representing the new connection. This new actor will then send a [`Connected`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Connected.html "akka.io.Tcp.Connected")[`Connected`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Connected.html "akka.io.Tcp.Connected") message to the original sender of the [`Connect`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Connect.html "akka.io.Tcp.Connect") messagemessage by the [`TcpMessage.connect`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#connect(java.net.InetSocketAddress) "akka.io.TcpMessage") method.

In order to activate the new connection a [`Register`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Register.html "akka.io.Tcp.Register") messagemessage by the [`TcpMessage.register`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#register(akka.actor.ActorRef) "akka.io.TcpMessage") method must be sent to the connection actor, informing that one about who shall receive data from the socket. Before this step is done the connection cannot be used, and there is an internal timeout after which the connection actor will shut itself down if no `Register` messagemessage by the `TcpMessage.register` method message is received.

The connection actor watches the registered handler and closes the connection when that one terminates, thereby cleaning up all internal resources associated with that connection.

The actor in the example above uses `become` to switch from unconnected to connected operation, demonstrating the commands and events which are observed in that state. For a discussion on `CommandFailed` see [Throttling Reads and Writes](#throttling-reads-and-writes) below. [`ConnectionClosed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ConnectionClosed.html "akka.io.Tcp.ConnectionClosed")[`ConnectionClosed`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.ConnectionClosed.html "akka.io.Tcp.ConnectionClosed") is a trait, which marks the different connection close events. The last line handles all connection close events in the same way. It is possible to listen for more fine\-grained connection close events, see [Closing Connections](io-tcp.html#closing-connections) below.

## Accepting connections

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/IODocSpec.scala#L31-L55 "Go to snippet source")class Server extends Actor {

  import Tcp._
  import context.system

  IO(Tcp) ! Bind(self, new InetSocketAddress("localhost", 0))

  def receive = {
    case b @ Bound(_) =>
      context.parent ! b

    case CommandFailed(_: Bind) => context.stop(self)

    case c @ Connected(_, _) =>
      val handler = context.actorOf(Props[SimplisticHandler]())
      val connection = sender()
      connection ! Register(handler)
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/IODocTest.java#L38-L79 "Go to snippet source")static class Server extends AbstractActor {

  final ActorRef manager;

  public Server(ActorRef manager) {
    this.manager = manager;
  }

  public static Props props(ActorRef manager) {
    return Props.create(Server.class, manager);
  }

  @Override
  public void preStart() throws Exception {
    final ActorRef tcp = Tcp.get(getContext().getSystem()).manager();
    tcp.tell(TcpMessage.bind(getSelf(), new InetSocketAddress("localhost", 0), 100), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Bound.class,
            msg -> {
              manager.tell(msg, getSelf());
            })
        .match(
            CommandFailed.class,
            msg -> {
              getContext().stop(getSelf());
            })
        .match(
            Connected.class,
            conn -> {
              manager.tell(conn, getSelf());
              final ActorRef handler =
                  getContext().actorOf(Props.create(SimplisticHandler.class));
              getSender().tell(TcpMessage.register(handler), getSelf());
            })
        .build();
  }
}
```

To create a TCP server and listen for inbound connections, a [`Bind`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Bind.html "akka.io.Tcp.Bind") commandmessage by the [`TcpMessage.bind`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#bind(akka.actor.ActorRef,java.net.InetSocketAddress,int) "akka.io.TcpMessage") method has to be sent to the TCP manager. This will instruct the TCP manager to listen for TCP connections on a particular [`InetSocketAddress`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html "java.net.InetSocketAddress"); the port may be specified as `0` in order to bind to a random port.

The actor sending the `Bind` messagemessage by the `TcpMessage.bind` method will receive a [`Bound`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Bound.html "akka.io.Tcp.Bound")[`Bound`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Bound.html "akka.io.Tcp.Bound") message signaling that the server is ready to accept incoming connections; this message also contains the `InetSocketAddress` to which the socket was actually bound (i.e. resolved IP address and correct port number). 

From this point forward the process of handling connections is the same as for outgoing connections. The example demonstrates that handling the reads from a certain connection can be delegated to another actor by naming it as the handler when sending the [`Register`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Register.html "akka.io.Tcp.Register") messagemessage by the [`TcpMessage.register`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#register(akka.actor.ActorRef) "akka.io.TcpMessage") method. Writes can be sent from any actor in the system to the connection actor (i.e. the actor which sent the `Connected` message). The simplistic handler is defined as:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/IODocSpec.scala#L59-L65 "Go to snippet source")class SimplisticHandler extends Actor {
  import Tcp._
  def receive = {
    case Received(data) => sender() ! Write(data)
    case PeerClosed     => context.stop(self)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/IODocTest.java#L84-L102 "Go to snippet source")static class SimplisticHandler extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              final ByteString data = msg.data();
              System.out.println(data);
              getSender().tell(TcpMessage.write(data), getSelf());
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

For a more complete sample which also takes into account the possibility of failures when sending please see [Throttling Reads and Writes](io-tcp.html#throttling-reads-and-writes) below.

The only difference to outgoing connections is that the internal actor managing the listen port—the sender of the [`Bound`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Bound.html "akka.io.Tcp.Bound")[`Bound`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Bound.html "akka.io.Tcp.Bound") message—watches the actor which was named as the recipient for [`Connected`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Connected.html "akka.io.Tcp.Connected")[`Connected`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Connected.html "akka.io.Tcp.Connected") messages in the `Bind` message`TcpMessage.bind` method. When that actor terminates the listen port will be closed and all resources associated with it will be released; existing connections will not be terminated at this point.

## Closing connections

A connection can be closed by sending one of the commands `Close`, `ConfirmedClose` or `Abort` a message by one of the methods `TcpMessage.close`, `TcpMessage.confirmedClose` or `TcpMessage.abort` to the connection actor.

[`Close`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Close$.html "akka.io.Tcp.Close")[`TcpMessage.close`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#close() "akka.io.TcpMessage") will close the connection by sending a `FIN` message, but without waiting for confirmation from the remote endpoint. Pending writes will be flushed. If the close is successful, the listener will be notified with [`Closed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Closed$.html "akka.io.Tcp.Closed").

[`ConfirmedClose`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ConfirmedClose$.html "akka.io.Tcp.ConfirmedClose")[`TcpMessage.confirmedClose`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#confirmedClose() "akka.io.TcpMessage") will close the sending direction of the connection by sending a `FIN` message, but data will continue to be received until the remote endpoint closes the connection, too. Pending writes will be flushed. If the close is successful, the listener will be notified with [`ConfirmedClosed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ConfirmedClosed$.html "akka.io.Tcp.ConfirmedClosed").

[`Abort`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Abort$.html "akka.io.Tcp.Abort")[`TcpMessage.abort`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#abort() "akka.io.TcpMessage") will immediately terminate the connection by sending a `RST` message to the remote endpoint. Pending writes will be not flushed. If the close is successful, the listener will be notified with [`Aborted`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Aborted$.html "akka.io.Tcp.Aborted").

[`PeerClosed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$PeerClosed$.html "akka.io.Tcp.PeerClosed") will be sent to the listener if the connection has been closed by the remote endpoint. Per default, the connection will then automatically be closed from this endpoint as well. To support half\-closed connections set the `keepOpenOnPeerClosed` member of the [`Register`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Register.html "akka.io.Tcp.Register") message[`TcpMessage.register`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#register(akka.actor.ActorRef,boolean,boolean) "akka.io.TcpMessage") method to `true` in which case the connection stays open until it receives one of the above close commands.

[`ErrorClosed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ErrorClosed.html "akka.io.Tcp.ErrorClosed")[`ErrorClosed`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.ErrorClosed.html "akka.io.Tcp.ErrorClosed") will be sent to the listener whenever an error happened that forced the connection to be closed.

All close notifications are sub\-types of [`ConnectionClosed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ConnectionClosed.html "akka.io.Tcp.ConnectionClosed")[`ConnectionClosed`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.ConnectionClosed.html "akka.io.Tcp.ConnectionClosed") so listeners who do not need fine\-grained close events may handle all close events in the same way.

## Writing to a connection

Once a connection has been established data can be sent to it from any actor in the form of a [`Tcp.WriteCommand`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$WriteCommand.html "akka.io.Tcp.WriteCommand")[`Tcp.WriteCommand`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.WriteCommand.html "akka.io.Tcp.WriteCommand"). `Tcp.WriteCommand` is an abstract class with three concrete implementations:

Tcp.Write
 
The simplest `WriteCommand` implementation which wraps a `ByteString` instance and an “ack” event. A `ByteString` (as explained in [this section](io.html#bytestring)) models one or more chunks of immutable in\-memory data with a maximum (total) size of 2 GB (2^31 bytes).
Tcp.WriteFile
 
If you want to send “raw” data from a file you can do so efficiently with the [`Tcp.WriteFile`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$WriteFile.html "akka.io.Tcp.WriteFile")[`Tcp.WriteFile`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.WriteFile.html "akka.io.Tcp.WriteFile") command. This allows you do designate a (contiguous) chunk of on\-disk bytes for sending across the connection without the need to first load them into the JVM memory. As such `Tcp.WriteFile` can “hold” more than 2GB of data and an “ack” event if required.
Tcp.CompoundWrite
 
Sometimes you might want to group (or interleave) several [`Tcp.Write`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Write.html "akka.io.Tcp.Write")[`Tcp.Write`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Write.html "akka.io.Tcp.Write") and/or [`Tcp.WriteFile`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$WriteFile.html "akka.io.Tcp.WriteFile")[`Tcp.WriteFile`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.WriteFile.html "akka.io.Tcp.WriteFile") commands into one atomic write command which gets written to the connection in one go. The [`Tcp.CompoundWrite`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$CompoundWrite.html "akka.io.Tcp.CompoundWrite")[`Tcp.CompoundWrite`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.CompoundWrite.html "akka.io.Tcp.CompoundWrite") allows you to do just that and offers three benefits:

1. As explained in the following section the TCP connection actor can only handle one single write command at a time. By combining several writes into one `CompoundWrite` you can have them be sent across the connection with minimum overhead and without the need to spoon feed them to the connection actor via an *ACK\-based* message protocol.
2. Because a [`WriteCommand`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$WriteCommand.html "akka.io.Tcp.WriteCommand")[`WriteCommand`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.WriteCommand.html "akka.io.Tcp.WriteCommand") is atomic you can be sure that no other actor can “inject” other writes into your series of writes if you combine them into one single `CompoundWrite`. In scenarios where several actors write to the same connection this can be an important feature which can be somewhat hard to achieve otherwise.
3. The “sub writes” of a `CompoundWrite` are regular [`Write`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Write.html "akka.io.Tcp.Write") or [`WriteFile`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$WriteFile.html "akka.io.Tcp.WriteFile") commandsmessages by [`TcpMessage.write`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#write(akka.util.ByteString,akka.io.Tcp.Event) "akka.io.TcpMessage") or [`TcpMessage.writeFile`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#writeFile(java.lang.String,long,long,akka.io.Tcp.Event) "akka.io.TcpMessage") methods that themselves can request “ack” events. These ACKs are sent out as soon as the respective “sub write” has been completed. This allows you to attach more than one ACK to a `Write` or `WriteFile`message by `TcpMessage.write` or `TcpMessage.writeFile` (by combining it with an empty write that itself requests an ACK) or to have the connection actor acknowledge the progress of transmitting the `CompoundWrite` by sending out intermediate ACKs at arbitrary points.

## Throttling Reads and Writes

The basic model of the TCP connection actor is that it has no internal buffering (i.e. it can only process one write at a time, meaning it can buffer one write until it has been passed on to the O/S kernel in full). Congestion needs to be handled at the user level, for both writes and reads.

For back\-pressuring writes there are three modes of operation

- *ACK\-based:* every [`Write`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Write.html "akka.io.Tcp.Write")[`Write`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Write.html "akka.io.Tcp.Write") command carries an arbitrary object, and if this object is not [`NoAck`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$NoAck.html "akka.io.Tcp.NoAck")[`NoAck`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.NoAck.html "akka.io.Tcp.NoAck") then it will be returned to the sender of the `Write` upon successfully writing all contained data to the socket. If no other write is initiated before having received this acknowledgement then no failures can happen due to buffer overrun.
- *NACK\-based:* every write which arrives while a previous write is not yet completed will be replied to with a [`CommandFailed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$CommandFailed.html "akka.io.Tcp.CommandFailed")[`CommandFailed`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.CommandFailed.html "akka.io.Tcp.CommandFailed") message containing the failed write. Just relying on this mechanism requires the implemented protocol to tolerate skipping writes (e.g. if each write is a valid message on its own and it is not required that all are delivered). This mode is enabled by setting the `useResumeWriting` flag to `false` within the [`Register`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Register.html "akka.io.Tcp.Register") message[`TcpMessage.register`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#register(akka.actor.ActorRef,boolean,boolean) "akka.io.TcpMessage") method during connection activation.
- *NACK\-based with write suspending:* this mode is very similar to the NACK\-based one, but once a single write has failed no further writes will succeed until a [`ResumeWriting`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ResumeWriting$.html "akka.io.Tcp.ResumeWriting") messagemessage by the [`TcpMessage.resumeWriting`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#resumeWriting() "akka.io.TcpMessage") method is received. This message will be answered with a [`WritingResumed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$WritingResumed.html "akka.io.Tcp.WritingResumed")[`WritingResumed`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.WritingResumed.html "akka.io.Tcp.WritingResumed") message once the last accepted write has completed. If the actor driving the connection implements buffering and resends the NACK’ed messages after having awaited the `WritingResumed` signal then every message is delivered exactly once to the network socket.

These write back\-pressure models (with the exception of the second which is rather specialised) are demonstrated in complete examples below. The full and contiguous source is available [on GitHub](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/EchoServer.scala)[on GitHub](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/rst/java/code/jdocs/io/japi).

For back\-pressuring reads there are two modes of operation

- *Push\-reading:* in this mode the connection actor sends the registered reader actor incoming data as soon as available as [`Received`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Received.html "akka.io.Tcp.Received")[`Received`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Received.html "akka.io.Tcp.Received") events. Whenever the reader actor wants to signal back\-pressure to the remote TCP endpoint it can send a [`SuspendReading`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$SuspendReading$.html "akka.io.Tcp.SuspendReading") messagemessage by the [`TcpMessage.suspendReading`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#suspendReading() "akka.io.TcpMessage") method to the connection actor to indicate that it wants to suspend the reception of new data. No `Received` events will arrive until a corresponding [`ResumeReading`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ResumeReading$.html "akka.io.Tcp.ResumeReading") is sent indicating that the receiver actor is ready again.
- *Pull\-reading:* after sending a `Received` event the connection actor automatically suspends accepting data from the socket until the reader actor signals with a `ResumeReading` message that it is ready to process more input data. Hence new data is “pulled” from the connection by sending `ResumeReading` messages.

Note
It should be obvious that all these flow control schemes only work between one writer/reader and one connection actor; as soon as multiple actors send write commands to a single connection no consistent result can be achieved.

## ACK\-Based Write Back\-Pressure

For proper function of the following example it is important to configure the connection to remain half\-open when the remote side closed its writing end: this allows the example `EchoHandler` to write all outstanding data back to the client before fully closing the connection. This is enabled using a flag upon connection activation (observe the [`Register`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Register.html "akka.io.Tcp.Register") message[`TcpMessage.register`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#register(akka.actor.ActorRef,boolean,boolean) "akka.io.TcpMessage") method):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/EchoServer.scala#L56-L59 "Go to snippet source")case Connected(remote, local) =>
  log.info("received connection from {}", remote)
  val handler = context.actorOf(Props(handlerClass, sender(), remote))
  sender() ! Register(handler, keepOpenOnPeerClosed = true)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/EchoManager.java#L77-L81 "Go to snippet source")connection.tell(
    TcpMessage.register(
        handler, true, // <-- keepOpenOnPeerClosed flag
        true),
    getSelf());
```

With this preparation let us dive into the handler itself:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/EchoServer.scala#L218-L294 "Go to snippet source")class SimpleEchoHandler(connection: ActorRef, remote: InetSocketAddress) extends Actor with ActorLogging {

  import Tcp._

  // sign death pact: this actor terminates when connection breaks
  context.watch(connection)

  case object Ack extends Event

  def receive = {
    case Received(data) =>
      buffer(data)
      connection ! Write(data, Ack)

      context.become({
        case Received(data) => buffer(data)
        case Ack            => acknowledge()
        case PeerClosed     => closing = true
      }, discardOld = false)

    case PeerClosed => context.stop(self)
  }

  override def postStop(): Unit = {
    log.info(s"transferred $transferred bytes from/to [$remote]")
  }

  var storage = Vector.empty[ByteString]
  var stored = 0L
  var transferred = 0L
  var closing = false

  val maxStored = 100000000L
  val highWatermark = maxStored * 5 / 10
  val lowWatermark = maxStored * 3 / 10
  var suspended = false

  private def buffer(data: ByteString): Unit = {
    storage :+= data
    stored += data.size

    if (stored > maxStored) {
      log.warning(s"drop connection to [$remote] (buffer overrun)")
      context.stop(self)

    } else if (stored > highWatermark) {
      log.debug(s"suspending reading")
      connection ! SuspendReading
      suspended = true
    }
  }

  private def acknowledge(): Unit = {
    require(storage.nonEmpty, "storage was empty")

    val size = storage(0).size
    stored -= size
    transferred += size

    storage = storage.drop(1)

    if (suspended && stored < lowWatermark) {
      log.debug("resuming reading")
      connection ! ResumeReading
      suspended = false
    }

    if (storage.isEmpty) {
      if (closing) context.stop(self)
      else context.unbecome()
    } else connection ! Write(storage(0), Ack)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/SimpleEchoHandler.java#L21-L139 "Go to snippet source")public class SimpleEchoHandler extends AbstractActor {

  final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), getSelf());

  final ActorRef connection;
  final InetSocketAddress remote;

  public static final long maxStored = 100000000;
  public static final long highWatermark = maxStored * 5 / 10;
  public static final long lowWatermark = maxStored * 2 / 10;

  public SimpleEchoHandler(ActorRef connection, InetSocketAddress remote) {
    this.connection = connection;
    this.remote = remote;

    // sign death pact: this actor stops when the connection is closed
    getContext().watch(connection);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              final ByteString data = msg.data();
              buffer(data);
              connection.tell(TcpMessage.write(data, ACK), getSelf());
              // now switch behavior to “waiting for acknowledgement”
              getContext().become(buffering(), false);
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              getContext().stop(getSelf());
            })
        .build();
  }

  private Receive buffering() {
    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              buffer(msg.data());
            })
        .match(
            Event.class,
            msg -> msg == ACK,
            msg -> {
              acknowledge();
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              if (msg.isPeerClosed()) {
                closing = true;
              } else {
                // could also be ErrorClosed, in which case we just give up
                getContext().stop(getSelf());
              }
            })
        .build();
  }

  public void postStop() {
    log.info("transferred {} bytes from/to [{}]", transferred, remote);
  }

  private long transferred;
  private long stored = 0;
  private Queue<ByteString> storage = new LinkedList<>();

  private boolean suspended = false;
  private boolean closing = false;

  private final Event ACK = new Event() {};

  protected void buffer(ByteString data) {
    storage.add(data);
    stored += data.size();

    if (stored > maxStored) {
      log.warning("drop connection to [{}] (buffer overrun)", remote);
      getContext().stop(getSelf());

    } else if (stored > highWatermark) {
      log.debug("suspending reading");
      connection.tell(TcpMessage.suspendReading(), getSelf());
      suspended = true;
    }
  }

  protected void acknowledge() {
    final ByteString acked = storage.remove();
    stored -= acked.size();
    transferred += acked.size();

    if (suspended && stored < lowWatermark) {
      log.debug("resuming reading");
      connection.tell(TcpMessage.resumeReading(), getSelf());
      suspended = false;
    }

    if (storage.isEmpty()) {
      if (closing) {
        getContext().stop(getSelf());
      } else {
        getContext().unbecome();
      }
    } else {
      connection.tell(TcpMessage.write(storage.peek(), ACK), getSelf());
    }
  }
}
```

The principle is simple: when having written a chunk always wait for the `Ack` to come back before sending the next chunk. While waiting we switch behavior such that new incoming data are buffered. The helper functions used are a bit lengthy but not complicated:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/EchoServer.scala#L257-L291 "Go to snippet source")private def buffer(data: ByteString): Unit = {
  storage :+= data
  stored += data.size

  if (stored > maxStored) {
    log.warning(s"drop connection to [$remote] (buffer overrun)")
    context.stop(self)

  } else if (stored > highWatermark) {
    log.debug(s"suspending reading")
    connection ! SuspendReading
    suspended = true
  }
}

private def acknowledge(): Unit = {
  require(storage.nonEmpty, "storage was empty")

  val size = storage(0).size
  stored -= size
  transferred += size

  storage = storage.drop(1)

  if (suspended && stored < lowWatermark) {
    log.debug("resuming reading")
    connection ! ResumeReading
    suspended = false
  }

  if (storage.isEmpty) {
    if (closing) context.stop(self)
    else context.unbecome()
  } else connection ! Write(storage(0), Ack)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/SimpleEchoHandler.java#L101-L136 "Go to snippet source")protected void buffer(ByteString data) {
  storage.add(data);
  stored += data.size();

  if (stored > maxStored) {
    log.warning("drop connection to [{}] (buffer overrun)", remote);
    getContext().stop(getSelf());

  } else if (stored > highWatermark) {
    log.debug("suspending reading");
    connection.tell(TcpMessage.suspendReading(), getSelf());
    suspended = true;
  }
}

protected void acknowledge() {
  final ByteString acked = storage.remove();
  stored -= acked.size();
  transferred += acked.size();

  if (suspended && stored < lowWatermark) {
    log.debug("resuming reading");
    connection.tell(TcpMessage.resumeReading(), getSelf());
    suspended = false;
  }

  if (storage.isEmpty()) {
    if (closing) {
      getContext().stop(getSelf());
    } else {
      getContext().unbecome();
    }
  } else {
    connection.tell(TcpMessage.write(storage.peek(), ACK), getSelf());
  }
}
```

The most interesting part is probably the last: an `Ack` removes the oldest data chunk from the buffer, and if that was the last chunk then we either close the connection (if the peer closed its half already) or return to the idle behavior; otherwise we send the next buffered chunk and stay waiting for the next `Ack`.

Back\-pressure can be propagated also across the reading side back to the writer on the other end of the connection by sending the [`SuspendReading`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$SuspendReading$.html "akka.io.Tcp.SuspendReading") commandmessage by the [`TcpMessage.suspendReading`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#suspendReading() "akka.io.TcpMessage") method to the connection actor. This will lead to no data being read from the socket anymore (although this does happen after a delay because it takes some time until the connection actor processes this command, hence appropriate head\-room in the buffer should be present), which in turn will lead to the O/S kernel buffer filling up on our end, then the TCP window mechanism will stop the remote side from writing, filling up its write buffer, until finally the writer on the other side cannot push any data into the socket anymore. This is how end\-to\-end back\-pressure is realized across a TCP connection.

## NACK\-Based Write Back\-Pressure with Suspending

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/EchoServer.scala#L66-L214 "Go to snippet source")object EchoHandler {
  final case class Ack(offset: Int) extends Tcp.Event

  def props(connection: ActorRef, remote: InetSocketAddress): Props =
    Props(classOf[EchoHandler], connection, remote)
}

class EchoHandler(connection: ActorRef, remote: InetSocketAddress) extends Actor with ActorLogging {

  import Tcp._
  import EchoHandler._

  // sign death pact: this actor terminates when connection breaks
  context.watch(connection)

  // start out in optimistic write-through mode
  def receive = writing

  def writing: Receive = {
    case Received(data) =>
      connection ! Write(data, Ack(currentOffset))
      buffer(data)

    case Ack(ack) =>
      acknowledge(ack)

    case CommandFailed(Write(_, Ack(ack))) =>
      connection ! ResumeWriting
      context.become(buffering(ack))

    case PeerClosed =>
      if (storage.isEmpty) context.stop(self)
      else context.become(closing)
  }

  def buffering(nack: Int): Receive = {
    var toAck = 10
    var peerClosed = false

    {
      case Received(data)         => buffer(data)
      case WritingResumed         => writeFirst()
      case PeerClosed             => peerClosed = true
      case Ack(ack) if ack < nack => acknowledge(ack)
      case Ack(ack) =>
        acknowledge(ack)
        if (storage.nonEmpty) {
          if (toAck > 0) {
            // stay in ACK-based mode for a while
            writeFirst()
            toAck -= 1
          } else {
            // then return to NACK-based again
            writeAll()
            context.become(if (peerClosed) closing else writing)
          }
        } else if (peerClosed) context.stop(self)
        else context.become(writing)
    }
  }

  def closing: Receive = {
    case CommandFailed(_: Write) =>
      connection ! ResumeWriting
      context.become({

        case WritingResumed =>
          writeAll()
          context.unbecome()

        case ack: Int => acknowledge(ack)

      }, discardOld = false)

    case Ack(ack) =>
      acknowledge(ack)
      if (storage.isEmpty) context.stop(self)
  }

  override def postStop(): Unit = {
    log.info(s"transferred $transferred bytes from/to [$remote]")
  }

  private var storageOffset = 0
  private var storage = Vector.empty[ByteString]
  private var stored = 0L
  private var transferred = 0L

  val maxStored = 100000000L
  val highWatermark = maxStored * 5 / 10
  val lowWatermark = maxStored * 3 / 10
  private var suspended = false

  private def currentOffset = storageOffset + storage.size

  private def buffer(data: ByteString): Unit = {
    storage :+= data
    stored += data.size

    if (stored > maxStored) {
      log.warning(s"drop connection to [$remote] (buffer overrun)")
      context.stop(self)

    } else if (stored > highWatermark) {
      log.debug(s"suspending reading at $currentOffset")
      connection ! SuspendReading
      suspended = true
    }
  }

  private def acknowledge(ack: Int): Unit = {
    require(ack == storageOffset, s"received ack $ack at $storageOffset")
    require(storage.nonEmpty, s"storage was empty at ack $ack")

    val size = storage(0).size
    stored -= size
    transferred += size

    storageOffset += 1
    storage = storage.drop(1)

    if (suspended && stored < lowWatermark) {
      log.debug("resuming reading")
      connection ! ResumeReading
      suspended = false
    }
  }

  private def writeFirst(): Unit = {
    connection ! Write(storage(0), Ack(storageOffset))
  }

  private def writeAll(): Unit = {
    for ((data, i) <- storage.zipWithIndex) {
      connection ! Write(data, Ack(storageOffset + i))
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/EchoHandler.java#L27-L257 "Go to snippet source")public class EchoHandler extends AbstractActor {

  final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), getSelf());

  final ActorRef connection;
  final InetSocketAddress remote;

  public static final long MAX_STORED = 100000000;
  public static final long HIGH_WATERMARK = MAX_STORED * 5 / 10;
  public static final long LOW_WATERMARK = MAX_STORED * 2 / 10;

  private long transferred;
  private int storageOffset = 0;
  private long stored = 0;
  private Queue<ByteString> storage = new LinkedList<>();

  private boolean suspended = false;

  private static class Ack implements Event {
    public final int ack;

    public Ack(int ack) {
      this.ack = ack;
    }
  }

  public EchoHandler(ActorRef connection, InetSocketAddress remote) {
    this.connection = connection;
    this.remote = remote;

    writing = writing();

    // sign death pact: this actor stops when the connection is closed
    getContext().watch(connection);

    // start out in optimistic write-through mode
    getContext().become(writing);
  }

  @Override
  public Receive createReceive() {
    return writing;
  }

  private final Receive writing;

  private Receive writing() {
    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              final ByteString data = msg.data();
              connection.tell(TcpMessage.write(data, new Ack(currentOffset())), getSelf());
              buffer(data);
            })
        .match(
            Integer.class,
            msg -> {
              acknowledge(msg);
            })
        .match(
            CommandFailed.class,
            msg -> {
              final Write w = (Write) msg.cmd();
              connection.tell(TcpMessage.resumeWriting(), getSelf());
              getContext().become(buffering((Ack) w.ack()));
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              if (msg.isPeerClosed()) {
                if (storage.isEmpty()) {
                  getContext().stop(getSelf());
                } else {
                  getContext().become(closing());
                }
              }
            })
        .build();
  }

  static final class BufferingState {
    int toAck = 10;
    boolean peerClosed = false;
  }

  protected Receive buffering(final Ack nack) {
    final BufferingState state = new BufferingState();

    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              buffer(msg.data());
            })
        .match(
            WritingResumed.class,
            msg -> {
              writeFirst();
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              if (msg.isPeerClosed()) state.peerClosed = true;
              else getContext().stop(getSelf());
            })
        .match(
            Integer.class,
            ack -> {
              acknowledge(ack);

              if (ack >= nack.ack) {
                // otherwise it was the ack of the last successful write

                if (storage.isEmpty()) {
                  if (state.peerClosed) getContext().stop(getSelf());
                  else getContext().become(writing);

                } else {
                  if (state.toAck > 0) {
                    // stay in ACK-based mode for a short while
                    writeFirst();
                    --state.toAck;
                  } else {
                    // then return to NACK-based again
                    writeAll();
                    if (state.peerClosed) getContext().become(closing());
                    else getContext().become(writing);
                  }
                }
              }
            })
        .build();
  }

  protected Receive closing() {
    return receiveBuilder()
        .match(
            CommandFailed.class,
            msg -> {
              // the command can only have been a Write
              connection.tell(TcpMessage.resumeWriting(), getSelf());
              getContext().become(closeResend(), false);
            })
        .match(
            Integer.class,
            msg -> {
              acknowledge(msg);
              if (storage.isEmpty()) getContext().stop(getSelf());
            })
        .build();
  }

  protected Receive closeResend() {
    return receiveBuilder()
        .match(
            WritingResumed.class,
            msg -> {
              writeAll();
              getContext().unbecome();
            })
        .match(
            Integer.class,
            msg -> {
              acknowledge(msg);
            })
        .build();
  }

  @Override
  public void postStop() {
    log.info("transferred {} bytes from/to [{}]", transferred, remote);
  }

  protected void buffer(ByteString data) {
    storage.add(data);
    stored += data.size();

    if (stored > MAX_STORED) {
      log.warning("drop connection to [{}] (buffer overrun)", remote);
      getContext().stop(getSelf());

    } else if (stored > HIGH_WATERMARK) {
      log.debug("suspending reading at {}", currentOffset());
      connection.tell(TcpMessage.suspendReading(), getSelf());
      suspended = true;
    }
  }

  protected void acknowledge(int ack) {
    assertEquals(storageOffset, ack);
    assertFalse(storage.isEmpty());

    final ByteString acked = storage.remove();
    stored -= acked.size();
    transferred += acked.size();
    storageOffset += 1;

    if (suspended && stored < LOW_WATERMARK) {
      log.debug("resuming reading");
      connection.tell(TcpMessage.resumeReading(), getSelf());
      suspended = false;
    }
  }

  protected int currentOffset() {
    return storageOffset + storage.size();
  }

  protected void writeAll() {
    int i = 0;
    for (ByteString data : storage) {
      connection.tell(TcpMessage.write(data, new Ack(storageOffset + i++)), getSelf());
    }
  }

  protected void writeFirst() {
    connection.tell(TcpMessage.write(storage.peek(), new Ack(storageOffset)), getSelf());
  }

}
```

The principle here is to keep writing until a [`CommandFailed`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$CommandFailed.html "akka.io.Tcp.CommandFailed")[`CommandFailed`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.CommandFailed.html "akka.io.Tcp.CommandFailed") is received, using acknowledgements only to prune the resend buffer. When a such a failure was received, transition into a different state for handling and handle resending of all queued data:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/EchoServer.scala#L104-L128 "Go to snippet source")def buffering(nack: Int): Receive = {
  var toAck = 10
  var peerClosed = false

  {
    case Received(data)         => buffer(data)
    case WritingResumed         => writeFirst()
    case PeerClosed             => peerClosed = true
    case Ack(ack) if ack < nack => acknowledge(ack)
    case Ack(ack) =>
      acknowledge(ack)
      if (storage.nonEmpty) {
        if (toAck > 0) {
          // stay in ACK-based mode for a while
          writeFirst()
          toAck -= 1
        } else {
          // then return to NACK-based again
          writeAll()
          context.become(if (peerClosed) closing else writing)
        }
      } else if (peerClosed) context.stop(self)
      else context.become(writing)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/EchoHandler.java#L109-L162 "Go to snippet source")  
static final class BufferingState {
  int toAck = 10;
  boolean peerClosed = false;
}

protected Receive buffering(final Ack nack) {
  final BufferingState state = new BufferingState();

  return receiveBuilder()
      .match(
          Received.class,
          msg -> {
            buffer(msg.data());
          })
      .match(
          WritingResumed.class,
          msg -> {
            writeFirst();
          })
      .match(
          ConnectionClosed.class,
          msg -> {
            if (msg.isPeerClosed()) state.peerClosed = true;
            else getContext().stop(getSelf());
          })
      .match(
          Integer.class,
          ack -> {
            acknowledge(ack);

            if (ack >= nack.ack) {
              // otherwise it was the ack of the last successful write

              if (storage.isEmpty()) {
                if (state.peerClosed) getContext().stop(getSelf());
                else getContext().become(writing);

              } else {
                if (state.toAck > 0) {
                  // stay in ACK-based mode for a short while
                  writeFirst();
                  --state.toAck;
                } else {
                  // then return to NACK-based again
                  writeAll();
                  if (state.peerClosed) getContext().become(closing());
                  else getContext().become(writing);
                }
              }
            }
          })
      .build();
}
```

It should be noted that all writes which are currently buffered have also been sent to the connection actor upon entering this state, which means that the [`ResumeWriting`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ResumeWriting$.html "akka.io.Tcp.ResumeWriting") messagemessage by the [`TcpMessage.resumeWriting`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#resumeWriting() "akka.io.TcpMessage") method is enqueued after those writes, leading to the reception of all outstanding `CommandFailed` messages (which are ignored in this state) before receiving the `WritingResumed` signal. That latter message is sent by the connection actor only once the internally queued write has been fully completed, meaning that a subsequent write will not fail. This is exploited by the `EchoHandler` to switch to an ACK\-based approach for the first ten writes after a failure before resuming the optimistic write\-through behavior.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/EchoServer.scala#L132-L148 "Go to snippet source")def closing: Receive = {
  case CommandFailed(_: Write) =>
    connection ! ResumeWriting
    context.become({

      case WritingResumed =>
        writeAll()
        context.unbecome()

      case ack: Int => acknowledge(ack)

    }, discardOld = false)

  case Ack(ack) =>
    acknowledge(ack)
    if (storage.isEmpty) context.stop(self)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/EchoHandler.java#L166-L198 "Go to snippet source")protected Receive closing() {
  return receiveBuilder()
      .match(
          CommandFailed.class,
          msg -> {
            // the command can only have been a Write
            connection.tell(TcpMessage.resumeWriting(), getSelf());
            getContext().become(closeResend(), false);
          })
      .match(
          Integer.class,
          msg -> {
            acknowledge(msg);
            if (storage.isEmpty()) getContext().stop(getSelf());
          })
      .build();
}

protected Receive closeResend() {
  return receiveBuilder()
      .match(
          WritingResumed.class,
          msg -> {
            writeAll();
            getContext().unbecome();
          })
      .match(
          Integer.class,
          msg -> {
            acknowledge(msg);
          })
      .build();
}
```

Closing the connection while still sending all data is a bit more involved than in the ACK\-based approach: the idea is to always send all outstanding messages and acknowledge all successful writes, and if a failure happens then switch behavior to await the `WritingResumed` event and start over.

The helper functions are very similar to the ACK\-based case:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/EchoServer.scala#L169-L200 "Go to snippet source")private def buffer(data: ByteString): Unit = {
  storage :+= data
  stored += data.size

  if (stored > maxStored) {
    log.warning(s"drop connection to [$remote] (buffer overrun)")
    context.stop(self)

  } else if (stored > highWatermark) {
    log.debug(s"suspending reading at $currentOffset")
    connection ! SuspendReading
    suspended = true
  }
}

private def acknowledge(ack: Int): Unit = {
  require(ack == storageOffset, s"received ack $ack at $storageOffset")
  require(storage.nonEmpty, s"storage was empty at ack $ack")

  val size = storage(0).size
  stored -= size
  transferred += size

  storageOffset += 1
  storage = storage.drop(1)

  if (suspended && stored < lowWatermark) {
    log.debug("resuming reading")
    connection ! ResumeReading
    suspended = false
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/japi/EchoHandler.java#L209-L238 "Go to snippet source")protected void buffer(ByteString data) {
  storage.add(data);
  stored += data.size();

  if (stored > MAX_STORED) {
    log.warning("drop connection to [{}] (buffer overrun)", remote);
    getContext().stop(getSelf());

  } else if (stored > HIGH_WATERMARK) {
    log.debug("suspending reading at {}", currentOffset());
    connection.tell(TcpMessage.suspendReading(), getSelf());
    suspended = true;
  }
}

protected void acknowledge(int ack) {
  assertEquals(storageOffset, ack);
  assertFalse(storage.isEmpty());

  final ByteString acked = storage.remove();
  stored -= acked.size();
  transferred += acked.size();
  storageOffset += 1;

  if (suspended && stored < LOW_WATERMARK) {
    log.debug("resuming reading");
    connection.tell(TcpMessage.resumeReading(), getSelf());
    suspended = false;
  }
}
```

## Read Back\-Pressure with Pull Mode

When using push based reading, data coming from the socket is sent to the actor as soon as it is available. In the case of the previous Echo server example this meant that we needed to maintain a buffer of incoming data to keep it around since the rate of writing might be slower than the rate of the arrival of new data.

With the Pull mode this buffer can be completely eliminated as the following snippet demonstrates:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/ReadBackPressure.scala#L57-L62 "Go to snippet source")override def preStart(): Unit = connection ! ResumeReading

def receive = {
  case Received(data) => connection ! Write(data, Ack)
  case Ack            => connection ! ResumeReading
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/JavaReadBackPressure.java#L81-L101 "Go to snippet source")@Override
public void preStart() throws Exception {
  connection.tell(TcpMessage.resumeReading(), getSelf());
}

@Override
public Receive createReceive() {
  return receiveBuilder()
      .match(
          Tcp.Received.class,
          message -> {
            ByteString data = message.data();
            connection.tell(TcpMessage.write(data, new Ack()), getSelf());
          })
      .match(
          Ack.class,
          message -> {
            connection.tell(TcpMessage.resumeReading(), getSelf());
          })
      .build();
}
```

The idea here is that reading is not resumed until the previous write has been completely acknowledged by the connection actor. Every pull mode connection actor starts from suspended state. To start the flow of data we send a [`ResumeReading`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ResumeReading$.html "akka.io.Tcp.ResumeReading")message by the [`TcpMessage.resumeReading`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#resumeReading() "akka.io.TcpMessage") method in the `preStart` method to tell the connection actor that we are ready to receive the first chunk of data. Since we only resume reading when the previous data chunk has been completely written there is no need for maintaining a buffer.

To enable pull reading on an outbound connection the `pullMode` parameter of the [`Connect`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Connect.html "akka.io.Tcp.Connect")[`TcpMessage.connect`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#connect(java.net.InetSocketAddress,java.net.InetSocketAddress,java.lang.Iterable,scala.concurrent.duration.FiniteDuration,boolean) "akka.io.TcpMessage") method should be set to `true`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/ReadBackPressure.scala#L76 "Go to snippet source")IO(Tcp) ! Connect(listenAddress, pullMode = true)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/JavaReadBackPressure.java#L61-L66 "Go to snippet source")final List<Inet.SocketOption> options = new ArrayList<Inet.SocketOption>();
Duration timeout = null;
tcp.tell(
    TcpMessage.connect(
        new InetSocketAddress("localhost", 3000), null, options, timeout, true),
    getSelf());
```

### Pull Mode Reading for Inbound Connections

The previous section demonstrated how to enable pull reading mode for outbound connections but it is possible to create a listener actor with this mode of reading by setting the `pullMode` parameter of the [`Bind`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Bind.html "akka.io.Tcp.Bind") commandmessage by the [`TcpMessage.bind`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#bind(akka.actor.ActorRef,java.net.InetSocketAddress,int,java.lang.Iterable,boolean) "akka.io.TcpMessage") method to `true`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/ReadBackPressure.scala#L28 "Go to snippet source")IO(Tcp) ! Bind(self, new InetSocketAddress("localhost", 0), pullMode = true)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/JavaReadBackPressure.java#L51-L55 "Go to snippet source")tcp = Tcp.get(getContext().getSystem()).manager();
final List<Inet.SocketOption> options = new ArrayList<Inet.SocketOption>();
tcp.tell(
    TcpMessage.bind(getSelf(), new InetSocketAddress("localhost", 0), 100, options, true),
    getSelf());
```

One of the effects of this setting is that all connections accepted by this listener actor will use pull mode reading.

Another effect of this setting is that in addition of setting all inbound connections to pull mode, accepting connections becomes pull based, too. This means that after handling one (or more) `Connected` events the listener actor has to be resumed by sending it a `ResumeAccepting` messagemessage by the `TcpMessage.resumeAccepting` method.

Listener actors with pull mode start suspended so to start accepting connections a [`ResumeAccepting`](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ResumeAccepting.html "akka.io.Tcp.ResumeAccepting") commandmessage by the [`TcpMessage.resumeAccepting`](https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html#resumeAccepting(int) "akka.io.TcpMessage") method has to be sent to the listener actor after binding was successful:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/ReadBackPressure.scala#L33-L36 "Go to snippet source")case Bound(localAddress) =>
  // Accept connections one by one
  sender() ! ResumeAccepting(batchSize = 1)
  context.become(listening(sender()))
def listening(listener: ActorRef): Receive = {
  case Connected(remote, local) =>
    val handler = context.actorOf(Props(classOf[PullEcho], sender()))
    sender() ! Register(handler, keepOpenOnPeerClosed = true)
    listener ! ResumeAccepting(batchSize = 1)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/JavaReadBackPressure.java#L27-L45 "Go to snippet source")public Receive createReceive() {
  return receiveBuilder()
      .match(
          Tcp.Bound.class,
          x -> {
            listener = getSender();
            // Accept connections one by one
            listener.tell(TcpMessage.resumeAccepting(1), getSelf());
          })
      .match(
          Tcp.Connected.class,
          x -> {
            ActorRef handler = getContext().actorOf(Props.create(PullEcho.class, getSender()));
            getSender().tell(TcpMessage.register(handler), getSelf());
            // Resume accepting connections
            listener.tell(TcpMessage.resumeAccepting(1), getSelf());
          })
      .build();
}
```

As shown in the example, after handling an incoming connection we need to resume accepting again.

The `ResumeAccepting``TcpMessage.resumeAccepting` method accepts a `batchSize` parameter that specifies how many new connections are accepted before a next `ResumeAccepting` message is needed to resume handling of new connections.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

### Example 4: Introduction

```scala
import akka.actor.{ Actor, ActorRef, Props }
import akka.io.{ IO, Tcp }
import akka.util.ByteString

import java.net.InetSocketAddress
import scala.annotation.nowarn
```

### Example 5: Introduction

```java
import java.net.InetSocketAddress;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.AbstractActor;
import akka.io.Tcp;
import akka.io.Tcp.Bound;
import akka.io.Tcp.CommandFailed;
import akka.io.Tcp.Connected;
import akka.io.Tcp.ConnectionClosed;
import akka.io.Tcp.Received;
import akka.io.TcpMessage;
import akka.util.ByteString;
```

### Example 6: Introduction

```scala
import akka.io.{ IO, Tcp }
import context.system // implicitly used by IO(Tcp)

val manager = IO(Tcp)
```

### Example 7: Introduction

```java
final ActorRef tcpManager = Tcp.get(getContext().getSystem()).manager();
```

### Example 8: Connecting

```scala
object Client {
  def props(remote: InetSocketAddress, replies: ActorRef) =
    Props(classOf[Client], remote, replies)
}

class Client(remote: InetSocketAddress, listener: ActorRef) extends Actor {

  import Tcp._
  import context.system

  IO(Tcp) ! Connect(remote)

  def receive = {
    case CommandFailed(_: Connect) =>
      listener ! "connect failed"
      context.stop(self)

    case c @ Connected(remote, local) =>
      listener ! c
      val connection = sender()
      connection ! Register(self)
      context.become {
        case data: ByteString =>
          connection ! Write(data)
        case CommandFailed(_: Write) =>
          // O/S buffer was full
          listener ! "write failed"
        case Received(data) =>
          listener ! data
        case "close" =>
          connection ! Close
        case _: ConnectionClosed =>
          listener ! "connection closed"
          context.stop(self)
      }
  }
}
```

### Example 9: Connecting

```java
static class Client extends AbstractActor {

  final InetSocketAddress remote;
  final ActorRef listener;

  public static Props props(InetSocketAddress remote, ActorRef listener) {
    return Props.create(Client.class, remote, listener);
  }

  public Client(InetSocketAddress remote, ActorRef listener) {
    this.remote = remote;
    this.listener = listener;

    final ActorRef tcp = Tcp.get(getContext().getSystem()).manager();
    tcp.tell(TcpMessage.connect(remote), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            CommandFailed.class,
            msg -> {
              listener.tell("failed", getSelf());
              getContext().stop(getSelf());
            })
        .match(
            Connected.class,
            msg -> {
              listener.tell(msg, getSelf());
              getSender().tell(TcpMessage.register(getSelf()), getSelf());
              getContext().become(connected(getSender()));
            })
        .build();
  }

  private Receive connected(final ActorRef connection) {
    return receiveBuilder()
        .match(
            ByteString.class,
            msg -> {
              connection.tell(TcpMessage.write((ByteString) msg), getSelf());
            })
        .match(
            CommandFailed.class,
            msg -> {
              // OS kernel socket buffer was full
            })
        .match(
            Received.class,
            msg -> {
              listener.tell(msg.data(), getSelf());
            })
        .matchEquals(
            "close",
            msg -> {
              connection.tell(TcpMessage.close(), getSelf());
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

### Example 10: Accepting connections

```scala
class Server extends Actor {

  import Tcp._
  import context.system

  IO(Tcp) ! Bind(self, new InetSocketAddress("localhost", 0))

  def receive = {
    case b @ Bound(_) =>
      context.parent ! b

    case CommandFailed(_: Bind) => context.stop(self)

    case c @ Connected(_, _) =>
      val handler = context.actorOf(Props[SimplisticHandler]())
      val connection = sender()
      connection ! Register(handler)
  }

}
```

### Example 11: Accepting connections

```java
static class Server extends AbstractActor {

  final ActorRef manager;

  public Server(ActorRef manager) {
    this.manager = manager;
  }

  public static Props props(ActorRef manager) {
    return Props.create(Server.class, manager);
  }

  @Override
  public void preStart() throws Exception {
    final ActorRef tcp = Tcp.get(getContext().getSystem()).manager();
    tcp.tell(TcpMessage.bind(getSelf(), new InetSocketAddress("localhost", 0), 100), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Bound.class,
            msg -> {
              manager.tell(msg, getSelf());
            })
        .match(
            CommandFailed.class,
            msg -> {
              getContext().stop(getSelf());
            })
        .match(
            Connected.class,
            conn -> {
              manager.tell(conn, getSelf());
              final ActorRef handler =
                  getContext().actorOf(Props.create(SimplisticHandler.class));
              getSender().tell(TcpMessage.register(handler), getSelf());
            })
        .build();
  }
}
```

### Example 12: Accepting connections

```scala
class SimplisticHandler extends Actor {
  import Tcp._
  def receive = {
    case Received(data) => sender() ! Write(data)
    case PeerClosed     => context.stop(self)
  }
}
```

### Example 13: Accepting connections

```java
static class SimplisticHandler extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              final ByteString data = msg.data();
              System.out.println(data);
              getSender().tell(TcpMessage.write(data), getSelf());
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

### Example 14: ACK-Based Write Back-Pressure

```scala
case Connected(remote, local) =>
  log.info("received connection from {}", remote)
  val handler = context.actorOf(Props(handlerClass, sender(), remote))
  sender() ! Register(handler, keepOpenOnPeerClosed = true)
```

### Example 15: ACK-Based Write Back-Pressure

```java
connection.tell(
    TcpMessage.register(
        handler, true, // <-- keepOpenOnPeerClosed flag
        true),
    getSelf());
```

### Example 16: ACK-Based Write Back-Pressure

```scala
class SimpleEchoHandler(connection: ActorRef, remote: InetSocketAddress) extends Actor with ActorLogging {

  import Tcp._

  // sign death pact: this actor terminates when connection breaks
  context.watch(connection)

  case object Ack extends Event

  def receive = {
    case Received(data) =>
      buffer(data)
      connection ! Write(data, Ack)

      context.become({
        case Received(data) => buffer(data)
        case Ack            => acknowledge()
        case PeerClosed     => closing = true
      }, discardOld = false)

    case PeerClosed => context.stop(self)
  }

  override def postStop(): Unit = {
    log.info(s"transferred $transferred bytes from/to [$remote]")
  }

  var storage = Vector.empty[ByteString]
  var stored = 0L
  var transferred = 0L
  var closing = false

  val maxStored = 100000000L
  val highWatermark = maxStored * 5 / 10
  val lowWatermark = maxStored * 3 / 10
  var suspended = false

  private def buffer(data: ByteString): Unit = {
    storage :+= data
    stored += data.size

    if (stored > maxStored) {
      log.warning(s"drop connection to [$remote] (buffer overrun)")
      context.stop(self)

    } else if (stored > highWatermark) {
      log.debug(s"suspending reading")
      connection ! SuspendReading
      suspended = true
    }
  }

  private def acknowledge(): Unit = {
    require(storage.nonEmpty, "storage was empty")

    val size = storage(0).size
    stored -= size
    transferred += size

    storage = storage.drop(1)

    if (suspended && stored < lowWatermark) {
      log.debug("resuming reading")
      connection ! ResumeReading
      suspended = false
    }

    if (storage.isEmpty) {
      if (closing) context.stop(self)
      else context.unbecome()
    } else connection ! Write(storage(0), Ack)
  }
}
```

### Example 17: ACK-Based Write Back-Pressure

```java
public class SimpleEchoHandler extends AbstractActor {

  final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), getSelf());

  final ActorRef connection;
  final InetSocketAddress remote;

  public static final long maxStored = 100000000;
  public static final long highWatermark = maxStored * 5 / 10;
  public static final long lowWatermark = maxStored * 2 / 10;

  public SimpleEchoHandler(ActorRef connection, InetSocketAddress remote) {
    this.connection = connection;
    this.remote = remote;

    // sign death pact: this actor stops when the connection is closed
    getContext().watch(connection);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              final ByteString data = msg.data();
              buffer(data);
              connection.tell(TcpMessage.write(data, ACK), getSelf());
              // now switch behavior to “waiting for acknowledgement”
              getContext().become(buffering(), false);
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              getContext().stop(getSelf());
            })
        .build();
  }

  private Receive buffering() {
    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              buffer(msg.data());
            })
        .match(
            Event.class,
            msg -> msg == ACK,
            msg -> {
              acknowledge();
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              if (msg.isPeerClosed()) {
                closing = true;
              } else {
                // could also be ErrorClosed, in which case we just give up
                getContext().stop(getSelf());
              }
            })
        .build();
  }

  public void postStop() {
    log.info("transferred {} bytes from/to [{}]", transferred, remote);
  }

  private long transferred;
  private long stored = 0;
  private Queue<ByteString> storage = new LinkedList<>();

  private boolean suspended = false;
  private boolean closing = false;

  private final Event ACK = new Event() {};

  protected void buffer(ByteString data) {
    storage.add(data);
    stored += data.size();

    if (stored > maxStored) {
      log.warning("drop connection to [{}] (buffer overrun)", remote);
      getContext().stop(getSelf());

    } else if (stored > highWatermark) {
      log.debug("suspending reading");
      connection.tell(TcpMessage.suspendReading(), getSelf());
      suspended = true;
    }
  }

  protected void acknowledge() {
    final ByteString acked = storage.remove();
    stored -= acked.size();
    transferred += acked.size();

    if (suspended && stored < lowWatermark) {
      log.debug("resuming reading");
      connection.tell(TcpMessage.resumeReading(), getSelf());
      suspended = false;
    }

    if (storage.isEmpty()) {
      if (closing) {
        getContext().stop(getSelf());
      } else {
        getContext().unbecome();
      }
    } else {
      connection.tell(TcpMessage.write(storage.peek(), ACK), getSelf());
    }
  }
}
```

### Example 18: ACK-Based Write Back-Pressure

```scala
private def buffer(data: ByteString): Unit = {
  storage :+= data
  stored += data.size

  if (stored > maxStored) {
    log.warning(s"drop connection to [$remote] (buffer overrun)")
    context.stop(self)

  } else if (stored > highWatermark) {
    log.debug(s"suspending reading")
    connection ! SuspendReading
    suspended = true
  }
}

private def acknowledge(): Unit = {
  require(storage.nonEmpty, "storage was empty")

  val size = storage(0).size
  stored -= size
  transferred += size

  storage = storage.drop(1)

  if (suspended && stored < lowWatermark) {
    log.debug("resuming reading")
    connection ! ResumeReading
    suspended = false
  }

  if (storage.isEmpty) {
    if (closing) context.stop(self)
    else context.unbecome()
  } else connection ! Write(storage(0), Ack)
}
```

### Example 19: ACK-Based Write Back-Pressure

```java
protected void buffer(ByteString data) {
  storage.add(data);
  stored += data.size();

  if (stored > maxStored) {
    log.warning("drop connection to [{}] (buffer overrun)", remote);
    getContext().stop(getSelf());

  } else if (stored > highWatermark) {
    log.debug("suspending reading");
    connection.tell(TcpMessage.suspendReading(), getSelf());
    suspended = true;
  }
}

protected void acknowledge() {
  final ByteString acked = storage.remove();
  stored -= acked.size();
  transferred += acked.size();

  if (suspended && stored < lowWatermark) {
    log.debug("resuming reading");
    connection.tell(TcpMessage.resumeReading(), getSelf());
    suspended = false;
  }

  if (storage.isEmpty()) {
    if (closing) {
      getContext().stop(getSelf());
    } else {
      getContext().unbecome();
    }
  } else {
    connection.tell(TcpMessage.write(storage.peek(), ACK), getSelf());
  }
}
```

### Example 20: NACK-Based Write Back-Pressure with Suspending

```scala
object EchoHandler {
  final case class Ack(offset: Int) extends Tcp.Event

  def props(connection: ActorRef, remote: InetSocketAddress): Props =
    Props(classOf[EchoHandler], connection, remote)
}

class EchoHandler(connection: ActorRef, remote: InetSocketAddress) extends Actor with ActorLogging {

  import Tcp._
  import EchoHandler._

  // sign death pact: this actor terminates when connection breaks
  context.watch(connection)

  // start out in optimistic write-through mode
  def receive = writing

  def writing: Receive = {
    case Received(data) =>
      connection ! Write(data, Ack(currentOffset))
      buffer(data)

    case Ack(ack) =>
      acknowledge(ack)

    case CommandFailed(Write(_, Ack(ack))) =>
      connection ! ResumeWriting
      context.become(buffering(ack))

    case PeerClosed =>
      if (storage.isEmpty) context.stop(self)
      else context.become(closing)
  }

  def buffering(nack: Int): Receive = {
    var toAck = 10
    var peerClosed = false

    {
      case Received(data)         => buffer(data)
      case WritingResumed         => writeFirst()
      case PeerClosed             => peerClosed = true
      case Ack(ack) if ack < nack => acknowledge(ack)
      case Ack(ack) =>
        acknowledge(ack)
        if (storage.nonEmpty) {
          if (toAck > 0) {
            // stay in ACK-based mode for a while
            writeFirst()
            toAck -= 1
          } else {
            // then return to NACK-based again
            writeAll()
            context.become(if (peerClosed) closing else writing)
          }
        } else if (peerClosed) context.stop(self)
        else context.become(writing)
    }
  }

  def closing: Receive = {
    case CommandFailed(_: Write) =>
      connection ! ResumeWriting
      context.become({

        case WritingResumed =>
          writeAll()
          context.unbecome()

        case ack: Int => acknowledge(ack)

      }, discardOld = false)

    case Ack(ack) =>
      acknowledge(ack)
      if (storage.isEmpty) context.stop(self)
  }

  override def postStop(): Unit = {
    log.info(s"transferred $transferred bytes from/to [$remote]")
  }

  private var storageOffset = 0
  private var storage = Vector.empty[ByteString]
  private var stored = 0L
  private var transferred = 0L

  val maxStored = 100000000L
  val highWatermark = maxStored * 5 / 10
  val lowWatermark = maxStored * 3 / 10
  private var suspended = false

  private def currentOffset = storageOffset + storage.size

  private def buffer(data: ByteString): Unit = {
    storage :+= data
    stored += data.size

    if (stored > maxStored) {
      log.warning(s"drop connection to [$remote] (buffer overrun)")
      context.stop(self)

    } else if (stored > highWatermark) {
      log.debug(s"suspending reading at $currentOffset")
      connection ! SuspendReading
      suspended = true
    }
  }

  private def acknowledge(ack: Int): Unit = {
    require(ack == storageOffset, s"received ack $ack at $storageOffset")
    require(storage.nonEmpty, s"storage was empty at ack $ack")

    val size = storage(0).size
    stored -= size
    transferred += size

    storageOffset += 1
    storage = storage.drop(1)

    if (suspended && stored < lowWatermark) {
      log.debug("resuming reading")
      connection ! ResumeReading
      suspended = false
    }
  }

  private def writeFirst(): Unit = {
    connection ! Write(storage(0), Ack(storageOffset))
  }

  private def writeAll(): Unit = {
    for ((data, i) <- storage.zipWithIndex) {
      connection ! Write(data, Ack(storageOffset + i))
    }
  }

}
```

### Example 21: NACK-Based Write Back-Pressure with Suspending

```java
public class EchoHandler extends AbstractActor {

  final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), getSelf());

  final ActorRef connection;
  final InetSocketAddress remote;

  public static final long MAX_STORED = 100000000;
  public static final long HIGH_WATERMARK = MAX_STORED * 5 / 10;
  public static final long LOW_WATERMARK = MAX_STORED * 2 / 10;

  private long transferred;
  private int storageOffset = 0;
  private long stored = 0;
  private Queue<ByteString> storage = new LinkedList<>();

  private boolean suspended = false;

  private static class Ack implements Event {
    public final int ack;

    public Ack(int ack) {
      this.ack = ack;
    }
  }

  public EchoHandler(ActorRef connection, InetSocketAddress remote) {
    this.connection = connection;
    this.remote = remote;

    writing = writing();

    // sign death pact: this actor stops when the connection is closed
    getContext().watch(connection);

    // start out in optimistic write-through mode
    getContext().become(writing);
  }

  @Override
  public Receive createReceive() {
    return writing;
  }

  private final Receive writing;

  private Receive writing() {
    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              final ByteString data = msg.data();
              connection.tell(TcpMessage.write(data, new Ack(currentOffset())), getSelf());
              buffer(data);
            })
        .match(
            Integer.class,
            msg -> {
              acknowledge(msg);
            })
        .match(
            CommandFailed.class,
            msg -> {
              final Write w = (Write) msg.cmd();
              connection.tell(TcpMessage.resumeWriting(), getSelf());
              getContext().become(buffering((Ack) w.ack()));
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              if (msg.isPeerClosed()) {
                if (storage.isEmpty()) {
                  getContext().stop(getSelf());
                } else {
                  getContext().become(closing());
                }
              }
            })
        .build();
  }


  static final class BufferingState {
    int toAck = 10;
    boolean peerClosed = false;
  }

  protected Receive buffering(final Ack nack) {
    final BufferingState state = new BufferingState();

    return receiveBuilder()
        .match(
            Received.class,
            msg -> {
              buffer(msg.data());
            })
        .match(
            WritingResumed.class,
            msg -> {
              writeFirst();
            })
        .match(
            ConnectionClosed.class,
            msg -> {
              if (msg.isPeerClosed()) state.peerClosed = true;
              else getContext().stop(getSelf());
            })
        .match(
            Integer.class,
            ack -> {
              acknowledge(ack);

              if (ack >= nack.ack) {
                // otherwise it was the ack of the last successful write

                if (storage.isEmpty()) {
                  if (state.peerClosed) getContext().stop(getSelf());
                  else getContext().become(writing);

                } else {
                  if (state.toAck > 0) {
                    // stay in ACK-based mode for a short while
                    writeFirst();
                    --state.toAck;
                  } else {
                    // then return to NACK-based again
                    writeAll();
                    if (state.peerClosed) getContext().become(closing());
                    else getContext().become(writing);
                  }
                }
              }
            })
        .build();
  }

  protected Receive closing() {
    return receiveBuilder()
        .match(
            CommandFailed.class,
            msg -> {
              // the command can only have been a Write
              connection.tell(TcpMessage.resumeWriting(), getSelf());
              getContext().become(closeResend(), false);
            })
        .match(
            Integer.class,
            msg -> {
              acknowledge(msg);
              if (storage.isEmpty()) getContext().stop(getSelf());
            })
        .build();
  }

  protected Receive closeResend() {
    return receiveBuilder()
        .match(
            WritingResumed.class,
            msg -> {
              writeAll();
              getContext().unbecome();
            })
        .match(
            Integer.class,
            msg -> {
              acknowledge(msg);
            })
        .build();
  }


  @Override
  public void postStop() {
    log.info("transferred {} bytes from/to [{}]", transferred, remote);
  }

  protected void buffer(ByteString data) {
    storage.add(data);
    stored += data.size();

    if (stored > MAX_STORED) {
      log.warning("drop connection to [{}] (buffer overrun)", remote);
      getContext().stop(getSelf());

    } else if (stored > HIGH_WATERMARK) {
      log.debug("suspending reading at {}", currentOffset());
      connection.tell(TcpMessage.suspendReading(), getSelf());
      suspended = true;
    }
  }

  protected void acknowledge(int ack) {
    assertEquals(storageOffset, ack);
    assertFalse(storage.isEmpty());

    final ByteString acked = storage.remove();
    stored -= acked.size();
    transferred += acked.size();
    storageOffset += 1;

    if (suspended && stored < LOW_WATERMARK) {
      log.debug("resuming reading");
      connection.tell(TcpMessage.resumeReading(), getSelf());
      suspended = false;
    }
  }

  protected int currentOffset() {
    return storageOffset + storage.size();
  }

  protected void writeAll() {
    int i = 0;
    for (ByteString data : storage) {
      connection.tell(TcpMessage.write(data, new Ack(storageOffset + i++)), getSelf());
    }
  }

  protected void writeFirst() {
    connection.tell(TcpMessage.write(storage.peek(), new Ack(storageOffset)), getSelf());
  }

}
```

### Example 22: NACK-Based Write Back-Pressure with Suspending

```scala
def buffering(nack: Int): Receive = {
  var toAck = 10
  var peerClosed = false

  {
    case Received(data)         => buffer(data)
    case WritingResumed         => writeFirst()
    case PeerClosed             => peerClosed = true
    case Ack(ack) if ack < nack => acknowledge(ack)
    case Ack(ack) =>
      acknowledge(ack)
      if (storage.nonEmpty) {
        if (toAck > 0) {
          // stay in ACK-based mode for a while
          writeFirst()
          toAck -= 1
        } else {
          // then return to NACK-based again
          writeAll()
          context.become(if (peerClosed) closing else writing)
        }
      } else if (peerClosed) context.stop(self)
      else context.become(writing)
  }
}
```

### Example 23: NACK-Based Write Back-Pressure with Suspending

```java
static final class BufferingState {
  int toAck = 10;
  boolean peerClosed = false;
}

protected Receive buffering(final Ack nack) {
  final BufferingState state = new BufferingState();

  return receiveBuilder()
      .match(
          Received.class,
          msg -> {
            buffer(msg.data());
          })
      .match(
          WritingResumed.class,
          msg -> {
            writeFirst();
          })
      .match(
          ConnectionClosed.class,
          msg -> {
            if (msg.isPeerClosed()) state.peerClosed = true;
            else getContext().stop(getSelf());
          })
      .match(
          Integer.class,
          ack -> {
            acknowledge(ack);

            if (ack >= nack.ack) {
              // otherwise it was the ack of the last successful write

              if (storage.isEmpty()) {
                if (state.peerClosed) getContext().stop(getSelf());
                else getContext().become(writing);

              } else {
                if (state.toAck > 0) {
                  // stay in ACK-based mode for a short while
                  writeFirst();
                  --state.toAck;
                } else {
                  // then return to NACK-based again
                  writeAll();
                  if (state.peerClosed) getContext().become(closing());
                  else getContext().become(writing);
                }
              }
            }
          })
      .build();
}
```

### Example 24: NACK-Based Write Back-Pressure with Suspending

```scala
def closing: Receive = {
  case CommandFailed(_: Write) =>
    connection ! ResumeWriting
    context.become({

      case WritingResumed =>
        writeAll()
        context.unbecome()

      case ack: Int => acknowledge(ack)

    }, discardOld = false)

  case Ack(ack) =>
    acknowledge(ack)
    if (storage.isEmpty) context.stop(self)
}
```

### Example 25: NACK-Based Write Back-Pressure with Suspending

```java
protected Receive closing() {
  return receiveBuilder()
      .match(
          CommandFailed.class,
          msg -> {
            // the command can only have been a Write
            connection.tell(TcpMessage.resumeWriting(), getSelf());
            getContext().become(closeResend(), false);
          })
      .match(
          Integer.class,
          msg -> {
            acknowledge(msg);
            if (storage.isEmpty()) getContext().stop(getSelf());
          })
      .build();
}

protected Receive closeResend() {
  return receiveBuilder()
      .match(
          WritingResumed.class,
          msg -> {
            writeAll();
            getContext().unbecome();
          })
      .match(
          Integer.class,
          msg -> {
            acknowledge(msg);
          })
      .build();
}
```

### Example 26: NACK-Based Write Back-Pressure with Suspending

```scala
private def buffer(data: ByteString): Unit = {
  storage :+= data
  stored += data.size

  if (stored > maxStored) {
    log.warning(s"drop connection to [$remote] (buffer overrun)")
    context.stop(self)

  } else if (stored > highWatermark) {
    log.debug(s"suspending reading at $currentOffset")
    connection ! SuspendReading
    suspended = true
  }
}

private def acknowledge(ack: Int): Unit = {
  require(ack == storageOffset, s"received ack $ack at $storageOffset")
  require(storage.nonEmpty, s"storage was empty at ack $ack")

  val size = storage(0).size
  stored -= size
  transferred += size

  storageOffset += 1
  storage = storage.drop(1)

  if (suspended && stored < lowWatermark) {
    log.debug("resuming reading")
    connection ! ResumeReading
    suspended = false
  }
}
```

### Example 27: NACK-Based Write Back-Pressure with Suspending

```java
protected void buffer(ByteString data) {
  storage.add(data);
  stored += data.size();

  if (stored > MAX_STORED) {
    log.warning("drop connection to [{}] (buffer overrun)", remote);
    getContext().stop(getSelf());

  } else if (stored > HIGH_WATERMARK) {
    log.debug("suspending reading at {}", currentOffset());
    connection.tell(TcpMessage.suspendReading(), getSelf());
    suspended = true;
  }
}

protected void acknowledge(int ack) {
  assertEquals(storageOffset, ack);
  assertFalse(storage.isEmpty());

  final ByteString acked = storage.remove();
  stored -= acked.size();
  transferred += acked.size();
  storageOffset += 1;

  if (suspended && stored < LOW_WATERMARK) {
    log.debug("resuming reading");
    connection.tell(TcpMessage.resumeReading(), getSelf());
    suspended = false;
  }
}
```

### Example 28: Read Back-Pressure with Pull Mode

```scala
override def preStart(): Unit = connection ! ResumeReading

def receive = {
  case Received(data) => connection ! Write(data, Ack)
  case Ack            => connection ! ResumeReading
}
```

### Example 29: Read Back-Pressure with Pull Mode

```java
@Override
public void preStart() throws Exception {
  connection.tell(TcpMessage.resumeReading(), getSelf());
}

@Override
public Receive createReceive() {
  return receiveBuilder()
      .match(
          Tcp.Received.class,
          message -> {
            ByteString data = message.data();
            connection.tell(TcpMessage.write(data, new Ack()), getSelf());
          })
      .match(
          Ack.class,
          message -> {
            connection.tell(TcpMessage.resumeReading(), getSelf());
          })
      .build();
}
```

### Example 30: Read Back-Pressure with Pull Mode

```scala
IO(Tcp) ! Connect(listenAddress, pullMode = true)
```

### Example 31: Read Back-Pressure with Pull Mode

```java
final List<Inet.SocketOption> options = new ArrayList<Inet.SocketOption>();
Duration timeout = null;
tcp.tell(
    TcpMessage.connect(
        new InetSocketAddress("localhost", 3000), null, options, timeout, true),
    getSelf());
```

### Example 32: Pull Mode Reading for Inbound Connections

```scala
IO(Tcp) ! Bind(self, new InetSocketAddress("localhost", 0), pullMode = true)
```

### Example 33: Pull Mode Reading for Inbound Connections

```java
tcp = Tcp.get(getContext().getSystem()).manager();
final List<Inet.SocketOption> options = new ArrayList<Inet.SocketOption>();
tcp.tell(
    TcpMessage.bind(getSelf(), new InetSocketAddress("localhost", 0), 100, options, true),
    getSelf());
```

### Example 34: Pull Mode Reading for Inbound Connections

```scala
case Bound(localAddress) =>
  // Accept connections one by one
  sender() ! ResumeAccepting(batchSize = 1)
  context.become(listening(sender()))
def listening(listener: ActorRef): Receive = {
  case Connected(remote, local) =>
    val handler = context.actorOf(Props(classOf[PullEcho], sender()))
    sender() ! Register(handler, keepOpenOnPeerClosed = true)
    listener ! ResumeAccepting(batchSize = 1)
}
```

### Example 35: Pull Mode Reading for Inbound Connections

```java
public Receive createReceive() {
  return receiveBuilder()
      .match(
          Tcp.Bound.class,
          x -> {
            listener = getSender();
            // Accept connections one by one
            listener.tell(TcpMessage.resumeAccepting(1), getSelf());
          })
      .match(
          Tcp.Connected.class,
          x -> {
            ActorRef handler = getContext().actorOf(Props.create(PullEcho.class, getSender()));
            getSender().tell(TcpMessage.register(handler), getSelf());
            // Resume accepting connections
            listener.tell(TcpMessage.resumeAccepting(1), getSelf());
          })
      .build();
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Abort$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Aborted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Bind.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Bound.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Close$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Closed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$CommandFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$CompoundWrite.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ConfirmedClose$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ConfirmedClosed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Connect.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Connected.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ConnectionClosed.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ErrorClosed.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$NoAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$PeerClosed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Received.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Register.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ResumeAccepting.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ResumeReading$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$ResumeWriting$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$SuspendReading$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Write.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$WriteCommand.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$WriteFile.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$WritingResumed.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Bound.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.CommandFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.CompoundWrite.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Connected.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.ConnectionClosed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.ErrorClosed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.NoAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Received.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.Write.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.WriteCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.WriteFile.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.WritingResumed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/TcpMessage.html
- https://doc.akka.io/libraries/akka-core/2.10/common/io-layer.html
- https://doc.akka.io/libraries/akka-core/2.10/io-tcp.html
- https://doc.akka.io/libraries/akka-core/2.10/io-udp.html
- https://doc.akka.io/libraries/akka-core/2.10/io.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/io-tcp.html](https://doc.akka.io/libraries/akka-core/2.10/io-tcp.html)*