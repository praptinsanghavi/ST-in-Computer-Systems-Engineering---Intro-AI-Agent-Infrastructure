---
description: Akka 2.10.17 - akka.io.UdpConnected.SuspendReading
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:34:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/UdpConnected$$SuspendReading$.html
title: Akka 2.10.17 - akka.io.UdpConnected.SuspendReading
---

# Akka 2.10.17 - akka.io.UdpConnected.SuspendReading

> **Summary:** Akka 2.10.17 - akka.io.UdpConnected.SuspendReading

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/UdpConnected$.html "Permalink")  object [UdpConnected](UdpConnected$.html "UDP Extension for Akka’s IO layer.") extends [ExtensionId](../actor/ExtensionId.html)\[[UdpConnectedExt](UdpConnectedExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)UDP Extension for Akka’s IO layer.

UDP Extension for Akka’s IO layer.

This extension implements the connectionless UDP protocol with
calling `connect` on the underlying sockets, i.e. with restricting
from whom data can be received. For “unconnected” UDP mode see [Udp](Udp$.html).

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

The Java API for generating UDP commands is available at [UdpConnectedMessage](UdpConnectedMessage$.html).

Definition Classes[io](index.html)
- [Command](UdpConnected$$Command.html "The common type of all commands supported by the UDP implementation.")
- [CommandFailed](UdpConnected$$CommandFailed.html "When a command fails it will be replied to with this message type, wrapping the failing command object.")
- [Connect](UdpConnected$$Connect.html "Send this message to the UdpExt#manager in order to bind to a local port (optionally with the chosen localAddress) and create a UDP socket which is restricted to sending to and receiving from the given remoteAddress.")
- [Connected](UdpConnected$$Connected.html "This message is sent by the connection actor to the actor which sent the Connect message when the UDP socket has been bound to the local and remote addresses given.")
- [Disconnect](UdpConnected$$Disconnect$.html "Send this message to a connection actor (which had previously sent the Connected message) in order to close the socket.")
- [Disconnected](UdpConnected$$Disconnected.html "This message is sent by the connection actor to the actor which sent the Disconnect message when the UDP socket has been closed.")
- [Event](UdpConnected$$Event.html "The common type of all events emitted by the UDP implementation.")
- [Message](UdpConnected$$Message.html "The common interface for Command and Event.")
- [NoAck](UdpConnected$$NoAck.html "Each Send can optionally request a positive acknowledgment to be sent to the commanding actor.")
- [Received](UdpConnected$$Received.html "When a connection actor receives a datagram from its socket it will send it to the handler designated in the Udp.Bind message using this message type.")
- [ResumeReading](UdpConnected$$ResumeReading$.html "This message must be sent to the listener actor to re-enable reading from the socket after a SuspendReading command.")
- [Send](UdpConnected$$Send.html "This message is understood by the connection actors to send data to their designated destination.")
- SuspendReading
o[akka](../index.html).[io](index.html).[UdpConnected](UdpConnected$.html)

# SuspendReading[**](../../akka/io/UdpConnected$$SuspendReading$.html "Permalink")

### 

#### case object SuspendReading extends [Command](UdpConnected$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Send this message to a listener actor (which sent a [Udp.Bound](Udp$$Bound.html) message) to
have it stop reading datagrams from the network. If the O/S kernel’s receive
buffer runs full then subsequent datagrams will be silently discarded.
Re\-enable reading from the socket using the `ResumeReading` command.

Source[UdpConnected.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/UdpConnected.scala#L115)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Command](UdpConnected$$Command.html), [Message](UdpConnected$$Message.html), HasFailureMessage, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SuspendReading
2. Serializable
3. Product
4. Equals
5. Command
6. Message
7. HasFailureMessage
8. AnyRef
9. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/UdpConnected$$SuspendReading$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/UdpConnected$$SuspendReading$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/UdpConnected$$SuspendReading$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/UdpConnected$$SuspendReading$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/io/UdpConnected$$SuspendReading$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/io/UdpConnected$$SuspendReading$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/io/UdpConnected$$SuspendReading$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/io/UdpConnected$$SuspendReading$.html#failureMessage:akka.io.UdpConnected.CommandFailed "Permalink")  def failureMessage: [CommandFailed](UdpConnected$$CommandFailed.html)Definition Classes[Command](UdpConnected$$Command.html) → HasFailureMessage
9. [**](../../akka/io/UdpConnected$$SuspendReading$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/io/UdpConnected$$SuspendReading$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/io/UdpConnected$$SuspendReading$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/io/UdpConnected$$SuspendReading$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/io/UdpConnected$$SuspendReading$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/UdpConnected$$SuspendReading$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
15. [**](../../akka/io/UdpConnected$$SuspendReading$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
16. [**](../../akka/io/UdpConnected$$SuspendReading$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../akka/io/UdpConnected$$SuspendReading$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/io/UdpConnected$$SuspendReading$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../akka/io/UdpConnected$$SuspendReading$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/UdpConnected$$SuspendReading$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Command](UdpConnected$$Command.html)

### Inherited from [Message](UdpConnected$$Message.html)

### Inherited from HasFailureMessage

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$$Bound.html
- https://doc.akka.io/api/akka/current/akka/io/Udp$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Command.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$CommandFailed.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Connect.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Connected$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Connected.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Disconnect$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Disconnected$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Disconnected.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Event.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Message.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$NoAck$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$NoAck.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Received.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$ResumeReading$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Send$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$Send.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$SuspendReading$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka/current/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$SuspendReading$.html](https://doc.akka.io/api/akka/current/akka/io/UdpConnected$$SuspendReading$.html)*