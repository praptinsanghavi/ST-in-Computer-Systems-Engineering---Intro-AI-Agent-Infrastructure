---
description: Akka 2.10.17 - akka.io.Inet.SoJavaFactories
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:40:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Inet$$SoJavaFactories.html
title: Akka 2.10.17 - akka.io.Inet.SoJavaFactories
---

# Akka 2.10.17 - akka.io.Inet.SoJavaFactories

> **Summary:** Akka 2.10.17 - akka.io.Inet.SoJavaFactories

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/Inet$.html "Permalink")  object [Inet](Inet$.html)Definition Classes[io](index.html)
- [AbstractSocketOption](Inet$$AbstractSocketOption.html "Java API: AbstractSocketOption is a package of data (from the user) and associated behavior (how to apply that to a channel).")
- [AbstractSocketOptionV2](Inet$$AbstractSocketOptionV2.html "Java API")
- [DatagramChannelCreator](Inet$$DatagramChannelCreator.html "DatagramChannel creation behavior.")
- [SO](Inet$$SO$.html)
- [SoForwarders](Inet$$SoForwarders.html)
- SoJavaFactories
- [SocketOption](Inet$$SocketOption.html "SocketOption is a package of data (from the user) and associated behavior (how to apply that to a channel).")
- [SocketOptionV2](Inet$$SocketOptionV2.html)
t[akka](../index.html).[io](index.html).[Inet](Inet$.html)

# SoJavaFactories[**](../../akka/io/Inet$$SoJavaFactories.html "Permalink")

### 

#### trait SoJavaFactories extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[Inet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Inet.scala#L175)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[TcpSO](TcpSO$.html), [UdpSO](UdpSO$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SoJavaFactories
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

1. [**](../../akka/io/Inet$$SoJavaFactories.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Inet$$SoJavaFactories.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Inet$$SoJavaFactories.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SoJavaFactories toany2stringadd\[SoJavaFactories] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/Inet$$SoJavaFactories.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SoJavaFactories, B)ImplicitThis member is added by an implicit conversion from SoJavaFactories toArrowAssoc\[SoJavaFactories] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/Inet$$SoJavaFactories.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/Inet$$SoJavaFactories.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/Inet$$SoJavaFactories.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/io/Inet$$SoJavaFactories.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SoJavaFactories) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SoJavaFactoriesImplicitThis member is added by an implicit conversion from SoJavaFactories toEnsuring\[SoJavaFactories] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/io/Inet$$SoJavaFactories.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SoJavaFactories) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SoJavaFactoriesImplicitThis member is added by an implicit conversion from SoJavaFactories toEnsuring\[SoJavaFactories] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/io/Inet$$SoJavaFactories.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SoJavaFactoriesImplicitThis member is added by an implicit conversion from SoJavaFactories toEnsuring\[SoJavaFactories] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/io/Inet$$SoJavaFactories.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SoJavaFactoriesImplicitThis member is added by an implicit conversion from SoJavaFactories toEnsuring\[SoJavaFactories] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/io/Inet$$SoJavaFactories.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/io/Inet$$SoJavaFactories.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/io/Inet$$SoJavaFactories.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/io/Inet$$SoJavaFactories.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/io/Inet$$SoJavaFactories.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/io/Inet$$SoJavaFactories.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/io/Inet$$SoJavaFactories.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/Inet$$SoJavaFactories.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/Inet$$SoJavaFactories.html#receiveBufferSize(size:Int):akka.io.Inet.SO.ReceiveBufferSize "Permalink")  def receiveBufferSize(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ReceiveBufferSize](Inet$$SO$$ReceiveBufferSize.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_RCVBUF option

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_RCVBUF option

For more information see [java.net.Socket\#setReceiveBufferSize](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setReceiveBufferSize(x$1:Int):Unit)
21. [**](../../akka/io/Inet$$SoJavaFactories.html#reuseAddress(on:Boolean):akka.io.Inet.SO.ReuseAddress "Permalink")  def reuseAddress(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ReuseAddress](Inet$$SO$$ReuseAddress.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable SO\_REUSEADDR

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to enable or disable SO\_REUSEADDR

For more information see [java.net.Socket\#setReuseAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setReuseAddress(x$1:Boolean):Unit)
22. [**](../../akka/io/Inet$$SoJavaFactories.html#sendBufferSize(size:Int):akka.io.Inet.SO.SendBufferSize "Permalink")  def sendBufferSize(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [SendBufferSize](Inet$$SO$$SendBufferSize.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_SNDBUF option.

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the SO\_SNDBUF option.

For more information see [java.net.Socket\#setSendBufferSize](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setSendBufferSize(x$1:Int):Unit)
23. [**](../../akka/io/Inet$$SoJavaFactories.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/io/Inet$$SoJavaFactories.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../akka/io/Inet$$SoJavaFactories.html#trafficClass(tc:Int):akka.io.Inet.SO.TrafficClass "Permalink")  def trafficClass(tc: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [TrafficClass](Inet$$SO$$TrafficClass.html)[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the traffic class or
type\-of\-service octet in the IP header for packets sent from this
socket.

[akka.io.Inet.SocketOption](Inet$$SocketOption.html) to set the traffic class or
type\-of\-service octet in the IP header for packets sent from this
socket.

For more information see [java.net.Socket\#setTrafficClass](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Socket.html#setTrafficClass(x$1:Int):Unit)
26. [**](../../akka/io/Inet$$SoJavaFactories.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/io/Inet$$SoJavaFactories.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/io/Inet$$SoJavaFactories.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Inet$$SoJavaFactories.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/Inet$$SoJavaFactories.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SoJavaFactories toStringFormat\[SoJavaFactories] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/Inet$$SoJavaFactories.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SoJavaFactories, B)ImplicitThis member is added by an implicit conversion from SoJavaFactories toArrowAssoc\[SoJavaFactories] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSoJavaFactories to any2stringadd\[SoJavaFactories]

### Inherited by implicit conversion StringFormat fromSoJavaFactories to StringFormat\[SoJavaFactories]

### Inherited by implicit conversion Ensuring fromSoJavaFactories to Ensuring\[SoJavaFactories]

### Inherited by implicit conversion ArrowAssoc fromSoJavaFactories to ArrowAssoc\[SoJavaFactories]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$AbstractSocketOption.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$AbstractSocketOptionV2.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$DatagramChannelCreator$.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$DatagramChannelCreator.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$ReceiveBufferSize.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$ReuseAddress.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$SendBufferSize.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$$TrafficClass.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SO$.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SoForwarders.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SoJavaFactories.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SocketOptionV2.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$.html
- https://doc.akka.io/api/akka/current/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka/current/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/Inet$$SoJavaFactories.html](https://doc.akka.io/api/akka/current/akka/io/Inet$$SoJavaFactories.html)*