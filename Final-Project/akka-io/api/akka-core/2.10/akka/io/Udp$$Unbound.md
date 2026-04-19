---
description: Akka 2.10.17 - akka.io.Udp.Unbound
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:13:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Udp$$Unbound.html
title: Akka 2.10.17 - akka.io.Udp.Unbound
---

# Akka 2.10.17 - akka.io.Udp.Unbound

> **Summary:** Akka 2.10.17 - akka.io.Udp.Unbound

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
- [Send](Udp$$Send.html "This message is understood by the “simple sender” which can be obtained by sending the SimpleSender query to the UdpExt#manager as well as by the listener actors which are created in response to Bind.")
- [SimpleSender](Udp$$SimpleSender.html "Retrieve a reference to a “simple sender” actor of the UDP extension.")
- [SimpleSenderReady](Udp$$SimpleSenderReady.html "The “simple sender” sends this message type in response to a SimpleSender query.")
- [SuspendReading](Udp$$SuspendReading$.html "Send this message to a listener actor (which sent a Bound message) to have it stop reading datagrams from the network.")
- [Unbind](Udp$$Unbind$.html "Send this message to the listener actor that previously sent a Bound message in order to close the listening socket.")
- Unbound
[t](Udp$$Unbound$.html "See companion object")[akka](../index.html).[io](index.html).[Udp](Udp$.html)

# [Unbound](Udp$$Unbound$.html "See companion object")[**](../../akka/io/Udp$$Unbound.html "Permalink")

### Companion [object Unbound](Udp$$Unbound$.html "See companion object")

#### sealed  trait Unbound extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

This message is sent by the listener actor in response to an `Unbind` command
after the socket has been closed.

Source[Udp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Udp.scala#L177)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Unbound](Udp$$Unbound$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Unbound
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/Udp$$Unbound.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Udp$$Unbound.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Udp$$Unbound.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Unbound toany2stringadd\[Unbound] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/Udp$$Unbound.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Unbound, B)ImplicitThis member is added by an implicit conversion from Unbound toArrowAssoc\[Unbound] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/Udp$$Unbound.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/Udp$$Unbound.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/Udp$$Unbound.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/io/Udp$$Unbound.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Unbound) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnboundImplicitThis member is added by an implicit conversion from Unbound toEnsuring\[Unbound] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/io/Udp$$Unbound.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Unbound) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnboundImplicitThis member is added by an implicit conversion from Unbound toEnsuring\[Unbound] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/io/Udp$$Unbound.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnboundImplicitThis member is added by an implicit conversion from Unbound toEnsuring\[Unbound] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/io/Udp$$Unbound.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnboundImplicitThis member is added by an implicit conversion from Unbound toEnsuring\[Unbound] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/io/Udp$$Unbound.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/io/Udp$$Unbound.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/io/Udp$$Unbound.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/io/Udp$$Unbound.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/io/Udp$$Unbound.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/io/Udp$$Unbound.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/io/Udp$$Unbound.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/Udp$$Unbound.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/Udp$$Unbound.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/io/Udp$$Unbound.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/io/Udp$$Unbound.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/io/Udp$$Unbound.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/io/Udp$$Unbound.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Udp$$Unbound.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/Udp$$Unbound.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Unbound toStringFormat\[Unbound] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/Udp$$Unbound.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Unbound, B)ImplicitThis member is added by an implicit conversion from Unbound toArrowAssoc\[Unbound] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnbound to any2stringadd\[Unbound]

### Inherited by implicit conversion StringFormat fromUnbound to StringFormat\[Unbound]

### Inherited by implicit conversion Ensuring fromUnbound to Ensuring\[Unbound]

### Inherited by implicit conversion ArrowAssoc fromUnbound to ArrowAssoc\[Unbound]

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
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbound.html](https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$$Unbound.html)*