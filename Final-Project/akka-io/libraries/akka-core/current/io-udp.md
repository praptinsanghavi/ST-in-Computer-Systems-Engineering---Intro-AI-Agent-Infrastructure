---
description: Low level API for using UDP with classic actors.
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:44Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/io-udp.html
title: Using UDP • Akka core
---

# Using UDP • Akka core

> **Summary:** Low level API for using UDP with classic actors.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Using UDP

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use UDP, you must add the following dependency in your project:

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

UDP is a connectionless datagram protocol which offers two different ways of communication on the JDK level:

- sockets which are free to send datagrams to any destination and receive datagrams from any origin
- sockets which are restricted to communication with one specific remote socket address

In the low\-level API the distinction is made—confusingly—by whether or not `connect` has been called on the socket (even when connect has been called the protocol is still connectionless). These two forms of UDP usage are offered using distinct IO extensions described below.

## Unconnected UDP

### Simple Send

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/UdpDocSpec.scala#L27-L46 "Go to snippet source")class SimpleSender(remote: InetSocketAddress) extends Actor {
  import context.system
  IO(Udp) ! Udp.SimpleSender

  def receive = {
    case Udp.SimpleSenderReady =>
      context.become(ready(sender()))
  }

  def ready(send: ActorRef): Receive = {
    case msg: String =>
      send ! Udp.Send(ByteString(msg), remote)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/UdpDocTest.java#L23-L63 "Go to snippet source")public static class SimpleSender extends AbstractActor {
  final InetSocketAddress remote;

  public SimpleSender(InetSocketAddress remote) {
    this.remote = remote;

    // request creation of a SimpleSender
    final ActorRef mgr = Udp.get(getContext().getSystem()).getManager();
    mgr.tell(UdpMessage.simpleSender(), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Udp.SimpleSenderReady.class,
            message -> {
              getContext().become(ready(getSender()));
            })
        .build();
  }

  private Receive ready(final ActorRef send) {
    return receiveBuilder()
        .match(
            String.class,
            message -> {
              send.tell(UdpMessage.send(ByteString.fromString(message), remote), getSelf());
            })
        .build();
  }
}
```

The simplest form of UDP usage is to just send datagrams without the need of getting a reply. To this end a “simple sender” facility is provided as demonstrated above. The UDP extension is queried using the `SimpleSender``UdpMessage.simpleSender` message, which is answered by a `SimpleSenderReady` notification. The sender of this message is the newly created sender actor which from this point onward can be used to send datagrams to arbitrary destinations; in this example it will send any UTF\-8 encoded `String` it receives to a predefined remote address.

Note
The simple sender will not shut itself down because it cannot know when you are done with it. You will need to send it a [`PoisonPill`](https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill")[`PoisonPill`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill") when you want to close the ephemeral port the sender is bound to.

### Bind (and Send)

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/UdpDocSpec.scala#L50-L73 "Go to snippet source")class Listener(nextActor: ActorRef) extends Actor {
  import context.system
  IO(Udp) ! Udp.Bind(self, new InetSocketAddress("localhost", 0))

  def receive = {
    case Udp.Bound(local) =>
      context.become(ready(sender()))
  }

  def ready(socket: ActorRef): Receive = {
    case Udp.Received(data, remote) =>
      val processed = // parse data etc., e.g. using PipelineStage
      socket ! Udp.Send(data, remote) // example server echoes back
      nextActor ! processed
    case Udp.Unbind  => socket ! Udp.Unbind
    case Udp.Unbound => context.stop(self)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/UdpDocTest.java#L67-L118 "Go to snippet source")public static class Listener extends AbstractActor {
  final ActorRef nextActor;

  public Listener(ActorRef nextActor) {
    this.nextActor = nextActor;

    // request creation of a bound listen socket
    final ActorRef mgr = Udp.get(getContext().getSystem()).getManager();
    mgr.tell(UdpMessage.bind(getSelf(), new InetSocketAddress("localhost", 0)), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Udp.Bound.class,
            bound -> {
              getContext().become(ready(getSender()));
            })
        .build();
  }

  private Receive ready(final ActorRef socket) {
    return receiveBuilder()
        .match(
            Udp.Received.class,
            r -> {
              // echo server example: send back the data
              socket.tell(UdpMessage.send(r.data(), r.sender()), getSelf());
              // or do some processing and forward it on
              final Object processed = // parse data etc., e.g. using PipelineStage
              nextActor.tell(processed, getSelf());
            })
        .matchEquals(
            UdpMessage.unbind(),
            message -> {
              socket.tell(message, getSelf());
            })
        .match(
            Udp.Unbound.class,
            message -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

If you want to implement a UDP server which listens on a socket for incoming datagrams then you need to use the [`Bind`](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bind.html "akka.io.Udp.Bind")[`UdpMessage.bind`](https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpMessage.html#bind(akka.actor.ActorRef,java.net.InetSocketAddress,java.lang.Iterable) "akka.io.UdpMessage") message as shown above. The local address specified may have a zero port in which case the operating system will automatically choose a free port and assign it to the new socket. Which port was actually bound can be found out by inspecting the `Bound` message.

The sender of the [`Bound`](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bound.html "akka.io.Udp.Bound")[`Bound`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Udp.Bound.html "akka.io.Udp.Bound") message is the actor which manages the new socket. Sending datagrams is achieved by using the [`Send`](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Send.html "akka.io.Udp.Send")[`UdpMessage.send`](https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpMessage.html#send(akka.util.ByteString,java.net.InetSocketAddress) "akka.io.UdpMessage") message and the socket can be closed by sending a [`Unbind`](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbind$.html "akka.io.Udp.Unbind")[`UdpMessage.unbind`](https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpMessage.html#unbind() "akka.io.UdpMessage") message, in which case the socket actor will reply with a [`Unbound`](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbound.html "akka.io.Udp.Unbound")[`Unbound`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Udp.Unbound.html "akka.io.Udp.Unbound") notification.

Received datagrams are sent to the actor designated in the `Bind` message, whereas the `Bound` message will be sent to the sender of the [`Bind`](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bind.html "akka.io.Udp.Bind")[`UdpMessage.bind`](https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpMessage.html#bind(akka.actor.ActorRef,java.net.InetSocketAddress,java.lang.Iterable) "akka.io.UdpMessage").

## Connected UDP

The service provided by the connection based UDP API is similar to the bind\-and\-send service we saw earlier, but the main difference is that a connection is only able to send to the `remoteAddress` it was connected to, and will receive datagrams only from that address.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/UdpDocSpec.scala#L77-L102 "Go to snippet source")class Connected(remote: InetSocketAddress) extends Actor {
  import context.system
  IO(UdpConnected) ! UdpConnected.Connect(self, remote)

  def receive = {
    case UdpConnected.Connected =>
      context.become(ready(sender()))
  }

  def ready(connection: ActorRef): Receive = {
    case UdpConnected.Received(data) =>
      // process data, send it on, etc.
    case msg: String =>
      connection ! UdpConnected.Send(ByteString(msg))
    case UdpConnected.Disconnect =>
      connection ! UdpConnected.Disconnect
    case UdpConnected.Disconnected => context.stop(self)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/UdpDocTest.java#L122-L178 "Go to snippet source")public static class Connected extends AbstractActor {
  final InetSocketAddress remote;

  public Connected(InetSocketAddress remote) {
    this.remote = remote;

    // create a restricted a.k.a. “connected” socket
    final ActorRef mgr = UdpConnected.get(getContext().getSystem()).getManager();
    mgr.tell(UdpConnectedMessage.connect(getSelf(), remote), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            UdpConnected.Connected.class,
            message -> {
              getContext().become(ready(getSender()));
            })
        .build();
  }

  private Receive ready(final ActorRef connection) {
    return receiveBuilder()
        .match(
            UdpConnected.Received.class,
            r -> {
              // process data, send it on, etc.
            })
        .match(
            String.class,
            str -> {
              connection.tell(UdpConnectedMessage.send(ByteString.fromString(str)), getSelf());
            })
        .matchEquals(
            UdpConnectedMessage.disconnect(),
            message -> {
              connection.tell(message, getSelf());
            })
        .match(
            UdpConnected.Disconnected.class,
            x -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

Consequently the example shown here looks quite similar to the previous one, the biggest difference is the absence of remote address information in `Send``UdpMessage.send` and `Received` messages.

Note
There is a small performance benefit in using connection based UDP API over the connectionless one. If there is a SecurityManager enabled on the system, every connectionless message send has to go through a security check, while in the case of connection\-based UDP the security check is cached after connect, thus writes do not suffer an additional performance penalty.

## UDP Multicast

Akka provides a way to control various options of [`DatagramChannel`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/channels/DatagramChannel.html "java.nio.channels.DatagramChannel") through the [`SocketOption`](https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SocketOption.html "akka.io.Inet.SocketOption")[`SocketOption`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Inet.SocketOption.html "akka.io.Inet.SocketOption") interface. The example below shows how to setup a receiver of multicast messages using IPv6 protocol.

To select a Protocol Family you must extend [`DatagramChannelCreator`](https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$DatagramChannelCreator.html "akka.io.Inet.DatagramChannelCreator")[`DatagramChannelCreator`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Inet.DatagramChannelCreator.html "akka.io.Inet.DatagramChannelCreator") class which extendsimplements [`SocketOption`](https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SocketOption.html "akka.io.Inet.SocketOption")[`SocketOption`](https://doc.akka.io/japi/akka-core/2.10/akka/io/Inet.SocketOption.html "akka.io.Inet.SocketOption"). Provide custom logic for opening a datagram channel by overriding `create` method.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/ScalaUdpMulticast.scala#L17-L20 "Go to snippet source")final case class Inet6ProtocolFamily() extends DatagramChannelCreator {
  override def create() =
    DatagramChannel.open(StandardProtocolFamily.INET6)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/JavaUdpMulticast.java#L29-L34 "Go to snippet source")public static class Inet6ProtocolFamily extends Inet.DatagramChannelCreator {
  @Override
  public DatagramChannel create() throws Exception {
    return DatagramChannel.open(StandardProtocolFamily.INET6);
  }
}
```

Another socket option will be needed to join a multicast group.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/ScalaUdpMulticast.scala#L24-L30 "Go to snippet source")final case class MulticastGroup(address: String, interface: String) extends SocketOptionV2 {
  override def afterBind(s: DatagramSocket): Unit = {
    val group = InetAddress.getByName(address)
    val networkInterface = NetworkInterface.getByName(interface)
    s.getChannel.join(group, networkInterface)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/JavaUdpMulticast.java#L38-L57 "Go to snippet source")public static class MulticastGroup extends Inet.AbstractSocketOptionV2 {
  private String address;
  private String interf;

  public MulticastGroup(String address, String interf) {
    this.address = address;
    this.interf = interf;
  }

  @Override
  public void afterBind(DatagramSocket s) {
    try {
      InetAddress group = InetAddress.getByName(address);
      NetworkInterface networkInterface = NetworkInterface.getByName(interf);
      s.getChannel().join(group, networkInterface);
    } catch (Exception ex) {
      System.out.println("Unable to join multicast group.");
    }
  }
}
```

Socket options must be provided to [`Bind`](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bind.html "akka.io.Udp.Bind")[`UdpMessage.bind`](https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpMessage.html#bind(akka.actor.ActorRef,java.net.InetSocketAddress,java.lang.Iterable) "akka.io.UdpMessage") message.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/io/ScalaUdpMulticast.scala#L35-L37 "Go to snippet source")import context.system
val opts = List(Inet6ProtocolFamily(), MulticastGroup(group, iface))
IO(Udp) ! Udp.Bind(self, new InetSocketAddress(port), opts)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/io/JavaUdpMulticast.java#L69-L76 "Go to snippet source")List<Inet.SocketOption> options = new ArrayList<>();
options.add(new Inet6ProtocolFamily());
options.add(new MulticastGroup(group, iface));

final ActorRef mgr = Udp.get(getContext().getSystem()).getManager();
// listen for datagrams on this address
InetSocketAddress endpoint = new InetSocketAddress(port);
mgr.tell(UdpMessage.bind(getSelf(), endpoint, options), getSelf());
```

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

### Example 4: Simple Send

```scala
class SimpleSender(remote: InetSocketAddress) extends Actor {
  import context.system
  IO(Udp) ! Udp.SimpleSender

  def receive = {
    case Udp.SimpleSenderReady =>
      context.become(ready(sender()))
  }

  def ready(send: ActorRef): Receive = {
    case msg: String =>
      send ! Udp.Send(ByteString(msg), remote)
  }
}
```

### Example 5: Simple Send

```java
public static class SimpleSender extends AbstractActor {
  final InetSocketAddress remote;

  public SimpleSender(InetSocketAddress remote) {
    this.remote = remote;

    // request creation of a SimpleSender
    final ActorRef mgr = Udp.get(getContext().getSystem()).getManager();
    mgr.tell(UdpMessage.simpleSender(), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Udp.SimpleSenderReady.class,
            message -> {
              getContext().become(ready(getSender()));
            })
        .build();
  }

  private Receive ready(final ActorRef send) {
    return receiveBuilder()
        .match(
            String.class,
            message -> {
              send.tell(UdpMessage.send(ByteString.fromString(message), remote), getSelf());
            })
        .build();
  }
}
```

### Example 6: Bind (and Send)

```scala
class Listener(nextActor: ActorRef) extends Actor {
  import context.system
  IO(Udp) ! Udp.Bind(self, new InetSocketAddress("localhost", 0))

  def receive = {
    case Udp.Bound(local) =>
      context.become(ready(sender()))
  }

  def ready(socket: ActorRef): Receive = {
    case Udp.Received(data, remote) =>
      val processed = // parse data etc., e.g. using PipelineStage
      socket ! Udp.Send(data, remote) // example server echoes back
      nextActor ! processed
    case Udp.Unbind  => socket ! Udp.Unbind
    case Udp.Unbound => context.stop(self)
  }
}
```

### Example 7: Bind (and Send)

```java
public static class Listener extends AbstractActor {
  final ActorRef nextActor;

  public Listener(ActorRef nextActor) {
    this.nextActor = nextActor;

    // request creation of a bound listen socket
    final ActorRef mgr = Udp.get(getContext().getSystem()).getManager();
    mgr.tell(UdpMessage.bind(getSelf(), new InetSocketAddress("localhost", 0)), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Udp.Bound.class,
            bound -> {
              getContext().become(ready(getSender()));
            })
        .build();
  }

  private Receive ready(final ActorRef socket) {
    return receiveBuilder()
        .match(
            Udp.Received.class,
            r -> {
              // echo server example: send back the data
              socket.tell(UdpMessage.send(r.data(), r.sender()), getSelf());
              // or do some processing and forward it on
              final Object processed = // parse data etc., e.g. using PipelineStage
              nextActor.tell(processed, getSelf());
            })
        .matchEquals(
            UdpMessage.unbind(),
            message -> {
              socket.tell(message, getSelf());
            })
        .match(
            Udp.Unbound.class,
            message -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

### Example 8: Connected UDP

```scala
class Connected(remote: InetSocketAddress) extends Actor {
  import context.system
  IO(UdpConnected) ! UdpConnected.Connect(self, remote)

  def receive = {
    case UdpConnected.Connected =>
      context.become(ready(sender()))
  }

  def ready(connection: ActorRef): Receive = {
    case UdpConnected.Received(data) =>
      // process data, send it on, etc.
    case msg: String =>
      connection ! UdpConnected.Send(ByteString(msg))
    case UdpConnected.Disconnect =>
      connection ! UdpConnected.Disconnect
    case UdpConnected.Disconnected => context.stop(self)
  }
}
```

### Example 9: Connected UDP

```java
public static class Connected extends AbstractActor {
  final InetSocketAddress remote;

  public Connected(InetSocketAddress remote) {
    this.remote = remote;

    // create a restricted a.k.a. “connected” socket
    final ActorRef mgr = UdpConnected.get(getContext().getSystem()).getManager();
    mgr.tell(UdpConnectedMessage.connect(getSelf(), remote), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            UdpConnected.Connected.class,
            message -> {
              getContext().become(ready(getSender()));
            })
        .build();
  }

  private Receive ready(final ActorRef connection) {
    return receiveBuilder()
        .match(
            UdpConnected.Received.class,
            r -> {
              // process data, send it on, etc.
            })
        .match(
            String.class,
            str -> {
              connection.tell(UdpConnectedMessage.send(ByteString.fromString(str)), getSelf());
            })
        .matchEquals(
            UdpConnectedMessage.disconnect(),
            message -> {
              connection.tell(message, getSelf());
            })
        .match(
            UdpConnected.Disconnected.class,
            x -> {
              getContext().stop(getSelf());
            })
        .build();
  }
}
```

### Example 10: UDP Multicast

```scala
final case class Inet6ProtocolFamily() extends DatagramChannelCreator {
  override def create() =
    DatagramChannel.open(StandardProtocolFamily.INET6)
}
```

### Example 11: UDP Multicast

```java
public static class Inet6ProtocolFamily extends Inet.DatagramChannelCreator {
  @Override
  public DatagramChannel create() throws Exception {
    return DatagramChannel.open(StandardProtocolFamily.INET6);
  }
}
```

### Example 12: UDP Multicast

```scala
final case class MulticastGroup(address: String, interface: String) extends SocketOptionV2 {
  override def afterBind(s: DatagramSocket): Unit = {
    val group = InetAddress.getByName(address)
    val networkInterface = NetworkInterface.getByName(interface)
    s.getChannel.join(group, networkInterface)
  }
}
```

### Example 13: UDP Multicast

```java
public static class MulticastGroup extends Inet.AbstractSocketOptionV2 {
  private String address;
  private String interf;

  public MulticastGroup(String address, String interf) {
    this.address = address;
    this.interf = interf;
  }

  @Override
  public void afterBind(DatagramSocket s) {
    try {
      InetAddress group = InetAddress.getByName(address);
      NetworkInterface networkInterface = NetworkInterface.getByName(interf);
      s.getChannel().join(group, networkInterface);
    } catch (Exception ex) {
      System.out.println("Unable to join multicast group.");
    }
  }
}
```

### Example 14: UDP Multicast

```scala
import context.system
val opts = List(Inet6ProtocolFamily(), MulticastGroup(group, iface))
IO(Udp) ! Udp.Bind(self, new InetSocketAddress(port), opts)
```

### Example 15: UDP Multicast

```java
List<Inet.SocketOption> options = new ArrayList<>();
options.add(new Inet6ProtocolFamily());
options.add(new MulticastGroup(group, iface));

final ActorRef mgr = Udp.get(getContext().getSystem()).getManager();
// listen for datagrams on this address
InetSocketAddress endpoint = new InetSocketAddress(port);
mgr.tell(UdpMessage.bind(getSelf(), endpoint, options), getSelf());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$DatagramChannelCreator.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bind.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bound.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Send.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbind$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbound.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Inet.DatagramChannelCreator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Udp.Bound.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Udp.Unbound.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/UdpMessage.html
- https://doc.akka.io/libraries/akka-core/current/io-dns.html
- https://doc.akka.io/libraries/akka-core/current/io-tcp.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/io-udp.html](https://doc.akka.io/libraries/akka-core/current/io-udp.html)*