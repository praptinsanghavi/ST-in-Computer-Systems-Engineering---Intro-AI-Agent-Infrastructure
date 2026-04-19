---
description: Akka 2.10.17 - akka.stream.javadsl.Tcp.IncomingConnection
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/Tcp$$IncomingConnection.html
title: Akka 2.10.17 - akka.stream.javadsl.Tcp.IncomingConnection
---

# Akka 2.10.17 - akka.stream.javadsl.Tcp.IncomingConnection

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.Tcp.IncomingConnection

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/javadsl/Tcp$.html "Permalink")  object [Tcp](Tcp$.html) extends [ExtensionId](../../actor/ExtensionId.html)\[[Tcp](Tcp.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)Definition Classes[javadsl](index.html)
- IncomingConnection
- [OutgoingConnection](Tcp$$OutgoingConnection.html "Represents a prospective outgoing TCP connection.")
- [ServerBinding](Tcp$$ServerBinding.html "Represents a prospective TCP server binding.")
c[akka](../../index.html).[stream](../index.html).[javadsl](index.html).[Tcp](Tcp$.html)

# IncomingConnection[**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html "Permalink")

### 

#### class IncomingConnection extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Represents an accepted incoming TCP connection.

Source[Tcp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Tcp.scala#L72)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. IncomingConnection
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

1. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from IncomingConnection toany2stringadd\[IncomingConnection] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (IncomingConnection, B)ImplicitThis member is added by an implicit conversion from IncomingConnection toArrowAssoc\[IncomingConnection] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (IncomingConnection) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): IncomingConnectionImplicitThis member is added by an implicit conversion from IncomingConnection toEnsuring\[IncomingConnection] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (IncomingConnection) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): IncomingConnectionImplicitThis member is added by an implicit conversion from IncomingConnection toEnsuring\[IncomingConnection] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): IncomingConnectionImplicitThis member is added by an implicit conversion from IncomingConnection toEnsuring\[IncomingConnection] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): IncomingConnectionImplicitThis member is added by an implicit conversion from IncomingConnection toEnsuring\[IncomingConnection] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#flow:akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "Permalink")  def flow: [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [NotUsed](../../NotUsed.html)]A flow representing the client on the other side of the connection.

A flow representing the client on the other side of the connection.
This flow can be materialized only once.
15. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#handleWith[Mat](handler:akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,Mat],materializer:akka.stream.Materializer):Mat "Permalink")  def handleWith\[Mat](handler: [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), Mat], materializer: [Materializer](../Materializer.html)): MatHandles the connection using the given flow, which is materialized exactly once and the respective
materialized value is returned.

Handles the connection using the given flow, which is materialized exactly once and the respective
materialized value is returned.

Convenience shortcut for: `flow.joinMat(handler, Keep.right).run(materializer)`.

Prefer the method taking an `ActorSystem` unless you have special requirements
17. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#handleWith[Mat](handler:akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,Mat],systemProvider:akka.actor.ClassicActorSystemProvider):Mat "Permalink")  def handleWith\[Mat](handler: [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), Mat], systemProvider: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): MatHandles the connection using the given flow, which is materialized exactly once and the respective
materialized value is returned.

Handles the connection using the given flow, which is materialized exactly once and the respective
materialized value is returned.

Convenience shortcut for: `flow.joinMat(handler, Keep.right).run(systemProvider)`.

Note that the classic or typed `ActorSystem` can be used as the `systemProvider` parameter.
18. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#localAddress:java.net.InetSocketAddress "Permalink")  def localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)The local address this connection is bound to.
21. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#remoteAddress:java.net.InetSocketAddress "Permalink")  def remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)The remote address this connection is bound to.
25. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from IncomingConnection toStringFormat\[IncomingConnection] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/Tcp$$IncomingConnection.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (IncomingConnection, B)ImplicitThis member is added by an implicit conversion from IncomingConnection toArrowAssoc\[IncomingConnection] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromIncomingConnection to any2stringadd\[IncomingConnection]

### Inherited by implicit conversion StringFormat fromIncomingConnection to StringFormat\[IncomingConnection]

### Inherited by implicit conversion Ensuring fromIncomingConnection to Ensuring\[IncomingConnection]

### Inherited by implicit conversion ArrowAssoc fromIncomingConnection to ArrowAssoc\[IncomingConnection]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Tcp$$IncomingConnection.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Tcp$$OutgoingConnection.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Tcp$$ServerBinding.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Tcp$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Tcp.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/util/ByteString.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/Tcp$$IncomingConnection.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/Tcp$$IncomingConnection.html)*