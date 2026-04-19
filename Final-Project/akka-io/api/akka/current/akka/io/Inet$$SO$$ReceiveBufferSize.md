---
description: Akka 2.10.17 - akka.io.Inet.SO.ReceiveBufferSize
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:27:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Inet$$SO$$ReceiveBufferSize.html
title: Akka 2.10.17 - akka.io.Inet.SO.ReceiveBufferSize
---

# Akka 2.10.17 - akka.io.Inet.SO.ReceiveBufferSize

> **Summary:** Akka 2.10.17 - akka.io.Inet.SO.ReceiveBufferSize

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/Inet$.html "Permalink")  object [Inet](Inet$.html)Definition Classes[io](index.html)
- [**](../../akka/io/Inet$$SO$.html "Permalink")  object [SO](Inet$$SO$.html)Definition Classes[Inet](Inet$.html)
- ReceiveBufferSize
- [ReuseAddress](Inet$$SO$$ReuseAddress.html "akka.io.Inet.SocketOption to enable or disable SO_REUSEADDR")
- [SendBufferSize](Inet$$SO$$SendBufferSize.html "akka.io.Inet.SocketOption to set the SO_SNDBUF option.")
- [TrafficClass](Inet$$SO$$TrafficClass.html "akka.io.Inet.SocketOption to set the traffic class or type-of-service octet in the IP header for packets sent from this socket.")
c[akka](../index.html).[io](index.html).[Inet](Inet$.html).[SO](Inet$$SO$.html)

# ReceiveBufferSize[**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html "Permalink")

### 

#### final  case class ReceiveBufferSize(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [SocketOption](Inet$$SocketOption.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_RCVBUF option

For more information see [java.net.Socket\#setReceiveBufferSize](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setReceiveBufferSize(x$1:Int):Unit)

Source[Inet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Inet.scala#L98)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SocketOption](Inet$$SocketOption.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReceiveBufferSize
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

1. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#<init>(size:Int):akka.io.Inet.SO.ReceiveBufferSize "Permalink")  new ReceiveBufferSize(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReceiveBufferSize toany2stringadd\[ReceiveBufferSize] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReceiveBufferSize, B)ImplicitThis member is added by an implicit conversion from ReceiveBufferSize toArrowAssoc\[ReceiveBufferSize] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#afterConnect(s:java.net.Socket):Unit "Permalink")  def afterConnect(s: [Socket](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#java.net.Socket)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Action to be taken for this option after connect returned.

Action to be taken for this option after connect returned.

Definition Classes[SocketOption](Inet$$SocketOption.html)
7. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#beforeConnect(s:java.net.Socket):Unit "Permalink")  def beforeConnect(s: [Socket](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#java.net.Socket)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Action to be taken for this option before calling connect()

Action to be taken for this option before calling connect()

Definition ClassesReceiveBufferSize → [SocketOption](Inet$$SocketOption.html)
9. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#beforeDatagramBind(s:java.net.DatagramSocket):Unit "Permalink")  def beforeDatagramBind(s: [DatagramSocket](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/DatagramSocket.html#java.net.DatagramSocket)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Action to be taken for this option before bind() is called

Action to be taken for this option before bind() is called

Definition ClassesReceiveBufferSize → [SocketOption](Inet$$SocketOption.html)
10. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#beforeServerSocketBind(s:java.net.ServerSocket):Unit "Permalink")  def beforeServerSocketBind(s: [ServerSocket](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/ServerSocket.html#java.net.ServerSocket)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Action to be taken for this option before bind() is called

Action to be taken for this option before bind() is called

Definition ClassesReceiveBufferSize → [SocketOption](Inet$$SocketOption.html)
11. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReceiveBufferSize) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceiveBufferSizeImplicitThis member is added by an implicit conversion from ReceiveBufferSize toEnsuring\[ReceiveBufferSize] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReceiveBufferSize) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceiveBufferSizeImplicitThis member is added by an implicit conversion from ReceiveBufferSize toEnsuring\[ReceiveBufferSize] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceiveBufferSizeImplicitThis member is added by an implicit conversion from ReceiveBufferSize toEnsuring\[ReceiveBufferSize] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceiveBufferSizeImplicitThis member is added by an implicit conversion from ReceiveBufferSize toEnsuring\[ReceiveBufferSize] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#size:Int "Permalink")  val size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
24. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReceiveBufferSize toStringFormat\[ReceiveBufferSize] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/Inet$$SO$$ReceiveBufferSize.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReceiveBufferSize, B)ImplicitThis member is added by an implicit conversion from ReceiveBufferSize toArrowAssoc\[ReceiveBufferSize] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SocketOption](Inet$$SocketOption.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReceiveBufferSize to any2stringadd\[ReceiveBufferSize]

### Inherited by implicit conversion StringFormat fromReceiveBufferSize to StringFormat\[ReceiveBufferSize]

### Inherited by implicit conversion Ensuring fromReceiveBufferSize to Ensuring\[ReceiveBufferSize]

### Inherited by implicit conversion ArrowAssoc fromReceiveBufferSize to ArrowAssoc\[ReceiveBufferSize]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$ReceiveBufferSize.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$ReuseAddress.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$SendBufferSize.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$TrafficClass.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$ReceiveBufferSize.html](https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$ReceiveBufferSize.html)*