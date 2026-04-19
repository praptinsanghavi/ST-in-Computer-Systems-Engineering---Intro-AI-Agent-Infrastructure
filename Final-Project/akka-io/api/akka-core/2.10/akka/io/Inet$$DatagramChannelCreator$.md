---
description: Akka 2.10.17 - akka.io.Inet.DatagramChannelCreator
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:12:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Inet$$DatagramChannelCreator$.html
title: Akka 2.10.17 - akka.io.Inet.DatagramChannelCreator
---

# Akka 2.10.17 - akka.io.Inet.DatagramChannelCreator

> **Summary:** Akka 2.10.17 - akka.io.Inet.DatagramChannelCreator

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
- [SoJavaFactories](Inet$$SoJavaFactories.html)
- [SocketOption](Inet$$SocketOption.html "SocketOption is a package of data (from the user) and associated behavior (how to apply that to a channel).")
- [SocketOptionV2](Inet$$SocketOptionV2.html)
[o](Inet$$DatagramChannelCreator.html "See companion class")[akka](../index.html).[io](index.html).[Inet](Inet$.html)

# [DatagramChannelCreator](Inet$$DatagramChannelCreator.html "See companion class")[**](../../akka/io/Inet$$DatagramChannelCreator$.html "Permalink")

### Companion [class DatagramChannelCreator](Inet$$DatagramChannelCreator.html "See companion class")

#### object DatagramChannelCreator

Source[Inet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Inet.scala#L86)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DatagramChannelCreator
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Inet$$DatagramChannelCreator$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#apply():akka.io.Inet.DatagramChannelCreator "Permalink")  def apply(): [DatagramChannelCreator](Inet$$DatagramChannelCreator.html)
5. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#default:akka.io.Inet.DatagramChannelCreator "Permalink")  val default: [DatagramChannelCreator](Inet$$DatagramChannelCreator.html)
8. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Inet$$DatagramChannelCreator$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$AbstractSocketOption.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$AbstractSocketOptionV2.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$DatagramChannelCreator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$DatagramChannelCreator.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SoForwarders.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SoJavaFactories.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$SocketOptionV2.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$DatagramChannelCreator$.html](https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$$DatagramChannelCreator$.html)*