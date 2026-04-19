---
description: Akka 2.10.17 - akka.io.Tcp.SO.OOBInline
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:12:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Tcp$$SO$$OOBInline.html
title: Akka 2.10.17 - akka.io.Tcp.SO.OOBInline
---

# Akka 2.10.17 - akka.io.Tcp.SO.OOBInline

> **Summary:** Akka 2.10.17 - akka.io.Tcp.SO.OOBInline

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/Tcp$.html "Permalink")  object [Tcp](Tcp$.html "TCP Extension for Akka’s IO layer.") extends [ExtensionId](../actor/ExtensionId.html)\[[TcpExt](TcpExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)TCP Extension for Akka’s IO layer.

TCP Extension for Akka’s IO layer.

For a full description of the design and philosophy behind this IO
implementation please refer to [the Akka online documentation](https://akka.io/docs/).

In order to open an outbound connection send a [Tcp.Connect](Tcp$$Connect.html) message
to the [TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef).

In order to start listening for inbound connections send a [Tcp.Bind](Tcp$$Bind.html)
message to the [TcpExt\#manager](TcpExt.html#manager:akka.actor.ActorRef).

The Java API for generating TCP commands is available at [TcpMessage](TcpMessage$.html).

Definition Classes[io](index.html)
- [**](../../akka/io/Tcp$$SO$.html "Permalink")  object [SO](Tcp$$SO$.html "Scala API: this object contains all applicable socket options for TCP.") extends [SoForwarders](Inet$$SoForwarders.html)Scala API: this object contains all applicable socket options for TCP.

Scala API: this object contains all applicable socket options for TCP.

For the Java API see [TcpSO](TcpSO$.html).

Definition Classes[Tcp](Tcp$.html)
- [KeepAlive](Tcp$$SO$$KeepAlive.html "akka.io.Inet.SocketOption to enable or disable SO_KEEPALIVE")
- OOBInline
- [TcpNoDelay](Tcp$$SO$$TcpNoDelay.html "akka.io.Inet.SocketOption to enable or disable TCP_NODELAY (disable or enable Nagle's algorithm)")
c[akka](../index.html).[io](index.html).[Tcp](Tcp$.html).[SO](Tcp$$SO$.html)

# OOBInline[**](../../akka/io/Tcp$$SO$$OOBInline.html "Permalink")

### 

#### final  case class OOBInline(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)) extends [SocketOption](Inet$$SocketOption.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable OOBINLINE (receipt
of TCP urgent data) By default, this option is disabled and TCP urgent
data is silently discarded.

For more information see `java.net.Socket.setOOBInline`

Source[Tcp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Tcp.scala#L78)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SocketOption](Inet$$SocketOption.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. OOBInline
2. Serializable
3. Product
4. Equals
5. SocketOption
6. AnyRef
7. Any
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

1. [**](../../akka/io/Tcp$$SO$$OOBInline.html#<init>(on:Boolean):akka.io.Tcp.SO.OOBInline "Permalink")  new OOBInline(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))
### Value Members

1. [**](../../akka/io/Tcp$$SO$$OOBInline.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Tcp$$SO$$OOBInline.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Tcp$$SO$$OOBInline.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from OOBInline toany2stringadd\[OOBInline] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/Tcp$$SO$$OOBInline.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (OOBInline, B)ImplicitThis member is added by an implicit conversion from OOBInline toArrowAssoc\[OOBInline] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/Tcp$$SO$$OOBInline.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/Tcp$$SO$$OOBInline.html#afterConnect(s:java.net.Socket):Unit "Permalink")  def afterConnect(s: [Socket](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#java.net.Socket)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Action to be taken for this option after connect returned.

Action to be taken for this option after connect returned.

Definition ClassesOOBInline → [SocketOption](Inet$$SocketOption.html)
7. [**](../../akka/io/Tcp$$SO$$OOBInline.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/io/Tcp$$SO$$OOBInline.html#beforeConnect(s:java.net.Socket):Unit "Permalink")  def beforeConnect(s: [Socket](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#java.net.Socket)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Action to be taken for this option before calling connect()

Action to be taken for this option before calling connect()

Definition Classes[SocketOption](Inet$$SocketOption.html)
9. [**](../../akka/io/Tcp$$SO$$OOBInline.html#beforeDatagramBind(ds:java.net.DatagramSocket):Unit "Permalink")  def beforeDatagramBind(ds: [DatagramSocket](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/DatagramSocket.html#java.net.DatagramSocket)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Action to be taken for this option before bind() is called

Action to be taken for this option before bind() is called

Definition Classes[SocketOption](Inet$$SocketOption.html)
10. [**](../../akka/io/Tcp$$SO$$OOBInline.html#beforeServerSocketBind(ss:java.net.ServerSocket):Unit "Permalink")  def beforeServerSocketBind(ss: [ServerSocket](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/ServerSocket.html#java.net.ServerSocket)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Action to be taken for this option before bind() is called

Action to be taken for this option before bind() is called

Definition Classes[SocketOption](Inet$$SocketOption.html)
11. [**](../../akka/io/Tcp$$SO$$OOBInline.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/io/Tcp$$SO$$OOBInline.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (OOBInline) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OOBInlineImplicitThis member is added by an implicit conversion from OOBInline toEnsuring\[OOBInline] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/Tcp$$SO$$OOBInline.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (OOBInline) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OOBInlineImplicitThis member is added by an implicit conversion from OOBInline toEnsuring\[OOBInline] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/io/Tcp$$SO$$OOBInline.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OOBInlineImplicitThis member is added by an implicit conversion from OOBInline toEnsuring\[OOBInline] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/io/Tcp$$SO$$OOBInline.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OOBInlineImplicitThis member is added by an implicit conversion from OOBInline toEnsuring\[OOBInline] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/io/Tcp$$SO$$OOBInline.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/io/Tcp$$SO$$OOBInline.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/io/Tcp$$SO$$OOBInline.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/io/Tcp$$SO$$OOBInline.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/io/Tcp$$SO$$OOBInline.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/io/Tcp$$SO$$OOBInline.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/io/Tcp$$SO$$OOBInline.html#on:Boolean "Permalink")  val on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
23. [**](../../akka/io/Tcp$$SO$$OOBInline.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../akka/io/Tcp$$SO$$OOBInline.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/io/Tcp$$SO$$OOBInline.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/io/Tcp$$SO$$OOBInline.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/io/Tcp$$SO$$OOBInline.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Tcp$$SO$$OOBInline.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/Tcp$$SO$$OOBInline.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from OOBInline toStringFormat\[OOBInline] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/Tcp$$SO$$OOBInline.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (OOBInline, B)ImplicitThis member is added by an implicit conversion from OOBInline toArrowAssoc\[OOBInline] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SocketOption](Inet$$SocketOption.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromOOBInline to any2stringadd\[OOBInline]

### Inherited by implicit conversion StringFormat fromOOBInline to StringFormat\[OOBInline]

### Inherited by implicit conversion Ensuring fromOOBInline to Ensuring\[OOBInline]

### Inherited by implicit conversion ArrowAssoc fromOOBInline to ArrowAssoc\[OOBInline]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SoForwarders.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Bind.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$Connect.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$SO$$KeepAlive.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$SO$$OOBInline.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$SO$$TcpNoDelay.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$SO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$SO$$OOBInline.html](https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$$SO$$OOBInline.html)*