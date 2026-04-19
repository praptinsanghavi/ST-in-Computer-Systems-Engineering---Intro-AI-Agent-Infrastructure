---
description: Akka 2.10.17 - akka.io.Udp.Send
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:13:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Udp$$Send.html
title: Akka 2.10.17 - akka.io.Udp.Send
---

# Akka 2.10.17 - akka.io.Udp.Send

> **Summary:** Akka 2.10.17 - akka.io.Udp.Send

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/Udp$.html "Permalink")  object [Udp](Udp$.html "UDP Extension for Akka’s IO layer.") extends [ExtensionId](../actor/ExtensionId.html)\[[UdpExt](UdpExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)UDP Extension for Akka’s IO layer.

UDP Extension for Akka’s IO layer.

This extension implements the connectionless UDP protocol without
calling `connect` on the underlying sockets, i.e. without restricting
from whom data can be received. For “connected” UDP mode see [UdpConnected](UdpConnected$.html).

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

The Java API for generating UDP commands is available at [UdpMessage](UdpMessage$.html).

Definition Classes[io](index.html)
- [Bind](Udp$$Bind.html "Send this message to the UdpExt#manager in order to bind to the given local port (or an automatically assigned one if the port number is zero).")
- [Bound](Udp$$Bound.html "This message is sent by the listener actor in response to a Bind command.")
- [Command](Udp$$Command.html "The common type of all commands supported by the UDP implementation.")
- [CommandFailed](Udp$$CommandFailed.html "When a command fails it will be replied to with this message type, wrapping the failing command object.")
- [Event](Udp$$Event.html "The common type of all events emitted by the UDP implementation.")
- [Message](Udp$$Message.html "The common interface for Command and Event.")
- [NoAck](Udp$$NoAck.html "Each Send can optionally request a positive acknowledgment to be sent to the commanding actor.")
- [Received](Udp$$Received.html "When a listener actor receives a datagram from its socket it will send it to the handler designated in the Bind message using this message type.")
- [ResumeReading](Udp$$ResumeReading$.html "This message must be sent to the listener actor to re-enable reading from the socket after a SuspendReading command.")
- [SO](Udp$$SO$.html "Scala API: This object provides access to all socket options applicable to UDP sockets.")
- Send
- [SimpleSender](Udp$$SimpleSender.html "Retrieve a reference to a “simple sender” actor of the UDP extension.")
- [SimpleSenderReady](Udp$$SimpleSenderReady.html "The “simple sender” sends this message type in response to a SimpleSender query.")
- [SuspendReading](Udp$$SuspendReading$.html "Send this message to a listener actor (which sent a Bound message) to have it stop reading datagrams from the network.")
- [Unbind](Udp$$Unbind$.html "Send this message to the listener actor that previously sent a Bound message in order to close the listening socket.")
- [Unbound](Udp$$Unbound.html "This message is sent by the listener actor in response to an Unbind command after the socket has been closed.")
[c](Udp$$Send$.html "See companion object")[akka](../index.html).[io](index.html).[Udp](Udp$.html)

# [Send](Udp$$Send$.html "See companion object")[**](../../akka/io/Udp$$Send.html "Permalink")

### Companion [object Send](Udp$$Send$.html "See companion object")

#### final  case class Send(payload: [ByteString](../util/ByteString.html), target: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), ack: [Event](Udp$$Event.html)) extends [Command](Udp$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

This message is understood by the “simple sender” which can be obtained by
sending the [SimpleSender](Udp$$SimpleSender.html) query to the [UdpExt\#manager](UdpExt.html#manager:akka.actor.ActorRef) as well as by
the listener actors which are created in response to [Bind](Udp$$Bind.html). It will send
the given payload data as one UDP datagram to the given target address. The
UDP actor will respond with [CommandFailed](Udp$$CommandFailed.html) if the send could not be
enqueued to the O/S kernel because the send buffer was full. If the given
`ack` is not of type [NoAck](Udp$$NoAck.html) the UDP actor will reply with the given
object as soon as the datagram has been successfully enqueued to the O/S
kernel.

The sending UDP socket’s address belongs to the “simple sender” which does
not handle inbound datagrams and sends from an ephemeral port; therefore
sending using this mechanism is not suitable if replies are expected, use
[Bind](Udp$$Bind.html) in that case.

Source[Udp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Udp.scala#L86)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Command](Udp$$Command.html), [Message](Udp$$Message.html), HasFailureMessage, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Send
2. Serializable
3. Product
4. Equals
5. Command
6. Message
7. HasFailureMessage
8. AnyRef
9. Any
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

1. [**](../../akka/io/Udp$$Send.html#<init>(payload:akka.util.ByteString,target:java.net.InetSocketAddress,ack:akka.io.Udp.Event):akka.io.Udp.Send "Permalink")  new Send(payload: [ByteString](../util/ByteString.html), target: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), ack: [Event](Udp$$Event.html))
### Value Members

1. [**](../../akka/io/Udp$$Send.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Udp$$Send.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Udp$$Send.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Send toany2stringadd\[Send] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/Udp$$Send.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Send, B)ImplicitThis member is added by an implicit conversion from Send toArrowAssoc\[Send] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/Udp$$Send.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/Udp$$Send.html#ack:akka.io.Udp.Event "Permalink")  val ack: [Event](Udp$$Event.html)
7. [**](../../akka/io/Udp$$Send.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/io/Udp$$Send.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/io/Udp$$Send.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Send) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SendImplicitThis member is added by an implicit conversion from Send toEnsuring\[Send] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/io/Udp$$Send.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Send) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SendImplicitThis member is added by an implicit conversion from Send toEnsuring\[Send] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/io/Udp$$Send.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SendImplicitThis member is added by an implicit conversion from Send toEnsuring\[Send] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/io/Udp$$Send.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SendImplicitThis member is added by an implicit conversion from Send toEnsuring\[Send] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/Udp$$Send.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/io/Udp$$Send.html#failureMessage:akka.io.Udp.CommandFailed "Permalink")  def failureMessage: [CommandFailed](Udp$$CommandFailed.html)Definition Classes[Command](Udp$$Command.html) → HasFailureMessage
15. [**](../../akka/io/Udp$$Send.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/io/Udp$$Send.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/io/Udp$$Send.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/io/Udp$$Send.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/Udp$$Send.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/Udp$$Send.html#payload:akka.util.ByteString "Permalink")  val payload: [ByteString](../util/ByteString.html)
21. [**](../../akka/io/Udp$$Send.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../akka/io/Udp$$Send.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/io/Udp$$Send.html#target:java.net.InetSocketAddress "Permalink")  val target: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)
24. [**](../../akka/io/Udp$$Send.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/io/Udp$$Send.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/io/Udp$$Send.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/io/Udp$$Send.html#wantsAck:Boolean "Permalink")  def wantsAck: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
### Deprecated Value Members

1. [**](../../akka/io/Udp$$Send.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/Udp$$Send.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Send toStringFormat\[Send] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/Udp$$Send.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Send, B)ImplicitThis member is added by an implicit conversion from Send toArrowAssoc\[Send] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Command](Udp$$Command.html)

### Inherited from [Message](Udp$$Message.html)

### Inherited from HasFailureMessage

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSend to any2stringadd\[Send]

### Inherited by implicit conversion StringFormat fromSend to StringFormat\[Send]

### Inherited by implicit conversion Ensuring fromSend to Ensuring\[Send]

### Inherited by implicit conversion ArrowAssoc fromSend to ArrowAssoc\[Send]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bind.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Bound.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$CommandFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Event.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Message.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$NoAck$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$NoAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Received.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$ResumeReading$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Send$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Send.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SimpleSender$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SimpleSender.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SimpleSenderReady$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SimpleSenderReady.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$SuspendReading$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbind$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbound$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbound.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Send.html](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Send.html)*