---
description: Akka 2.10.17 - akka.io.UdpConnected.Received
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:13:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/UdpConnected$$Received.html
title: Akka 2.10.17 - akka.io.UdpConnected.Received
---

# Akka 2.10.17 - akka.io.UdpConnected.Received

> **Summary:** Akka 2.10.17 - akka.io.UdpConnected.Received

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
- Received
- [ResumeReading](UdpConnected$$ResumeReading$.html "This message must be sent to the listener actor to re-enable reading from the socket after a SuspendReading command.")
- [Send](UdpConnected$$Send.html "This message is understood by the connection actors to send data to their designated destination.")
- [SuspendReading](UdpConnected$$SuspendReading$.html "Send this message to a listener actor (which sent a Udp.Bound message) to have it stop reading datagrams from the network.")
c[akka](../index.html).[io](index.html).[UdpConnected](UdpConnected$.html)

# Received[**](../../akka/io/UdpConnected$$Received.html "Permalink")

### 

#### final  case class Received(data: [ByteString](../util/ByteString.html)) extends [Event](UdpConnected$$Event.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

When a connection actor receives a datagram from its socket it will send
it to the handler designated in the [Udp.Bind](Udp$$Bind.html) message using this message type.

Source[UdpConnected.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/UdpConnected.scala#L132)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Event](UdpConnected$$Event.html), [Message](UdpConnected$$Message.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Received
2. Serializable
3. Product
4. Equals
5. Event
6. Message
7. AnyRef
8. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/io/UdpConnected$$Received.html#<init>(data:akka.util.ByteString):akka.io.UdpConnected.Received "Permalink")  new Received(data: [ByteString](../util/ByteString.html))
### Value Members

1. [**](../../akka/io/UdpConnected$$Received.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/UdpConnected$$Received.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/UdpConnected$$Received.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Received toany2stringadd\[Received] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/UdpConnected$$Received.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Received, B)ImplicitThis member is added by an implicit conversion from Received toArrowAssoc\[Received] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/UdpConnected$$Received.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/UdpConnected$$Received.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/UdpConnected$$Received.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/io/UdpConnected$$Received.html#data:akka.util.ByteString "Permalink")  val data: [ByteString](../util/ByteString.html)
9. [**](../../akka/io/UdpConnected$$Received.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Received) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceivedImplicitThis member is added by an implicit conversion from Received toEnsuring\[Received] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/io/UdpConnected$$Received.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Received) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceivedImplicitThis member is added by an implicit conversion from Received toEnsuring\[Received] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/io/UdpConnected$$Received.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceivedImplicitThis member is added by an implicit conversion from Received toEnsuring\[Received] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/io/UdpConnected$$Received.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceivedImplicitThis member is added by an implicit conversion from Received toEnsuring\[Received] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/UdpConnected$$Received.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/io/UdpConnected$$Received.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/io/UdpConnected$$Received.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/io/UdpConnected$$Received.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/io/UdpConnected$$Received.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/io/UdpConnected$$Received.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/UdpConnected$$Received.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/io/UdpConnected$$Received.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/io/UdpConnected$$Received.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/io/UdpConnected$$Received.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/io/UdpConnected$$Received.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/UdpConnected$$Received.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/UdpConnected$$Received.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Received toStringFormat\[Received] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/UdpConnected$$Received.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Received, B)ImplicitThis member is added by an implicit conversion from Received toArrowAssoc\[Received] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Event](UdpConnected$$Event.html)

### Inherited from [Message](UdpConnected$$Message.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReceived to any2stringadd\[Received]

### Inherited by implicit conversion StringFormat fromReceived to StringFormat\[Received]

### Inherited by implicit conversion Ensuring fromReceived to Ensuring\[Received]

### Inherited by implicit conversion ArrowAssoc fromReceived to ArrowAssoc\[Received]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bind.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$CommandFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Connect.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Connected$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Connected.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Disconnect$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Disconnected$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Disconnected.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Event.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Message.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$NoAck$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$NoAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Received.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$ResumeReading$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Send$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Send.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$SuspendReading$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Received.html](https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$$Received.html)*