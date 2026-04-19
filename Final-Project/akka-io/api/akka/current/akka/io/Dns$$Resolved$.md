---
description: Akka 2.10.17 - akka.io.Dns.Resolved
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:26:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Dns$$Resolved$.html
title: Akka 2.10.17 - akka.io.Dns.Resolved
---

# Akka 2.10.17 - akka.io.Dns.Resolved

> **Summary:** Akka 2.10.17 - akka.io.Dns.Resolved

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/Dns$.html "Permalink")  object [Dns](Dns$.html) extends [ExtensionId](../actor/ExtensionId.html)\[[DnsExt](DnsExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Definition Classes[io](index.html)
- [Command](Dns$$Command.html)
- [Resolve](Dns$$Resolve.html)
- [Resolved](Dns$$Resolved.html)
[o](Dns$$Resolved.html "See companion class")[akka](../index.html).[io](index.html).[Dns](Dns$.html)

# [Resolved](Dns$$Resolved.html "See companion class")[**](../../akka/io/Dns$$Resolved$.html "Permalink")

### Companion [class Resolved](Dns$$Resolved.html "See companion class")

#### object Resolved extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use cached(DnsProtocol.Resolved)

Source[Dns.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Dns.scala#L84)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Resolved
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/Dns$$Resolved$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Dns$$Resolved$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Dns$$Resolved$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/io/Dns$$Resolved$.html#apply(name:String,addresses:Iterable[java.net.InetAddress]):akka.io.Dns.Resolved "Permalink")  def apply(name: String, addresses: Iterable\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]): [Resolved](Dns$$Resolved.html)
5. [**](../../akka/io/Dns$$Resolved$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/io/Dns$$Resolved$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/io/Dns$$Resolved$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/io/Dns$$Resolved$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/io/Dns$$Resolved$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/io/Dns$$Resolved$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/io/Dns$$Resolved$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../akka/io/Dns$$Resolved$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/io/Dns$$Resolved$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/io/Dns$$Resolved$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/io/Dns$$Resolved$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/io/Dns$$Resolved$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../akka/io/Dns$$Resolved$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/io/Dns$$Resolved$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../akka/io/Dns$$Resolved$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Dns$$Resolved$.html#apply(newProtocol:akka.io.dns.DnsProtocol.Resolved):akka.io.Dns.Resolved "Permalink")  def apply(newProtocol: [dns.DnsProtocol.Resolved](dns/DnsProtocol$$Resolved.html)): [Resolved](Dns$$Resolved.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use cached(DnsProtocol.Resolve)
2. [**](../../akka/io/Dns$$Resolved$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Command.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolve.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved$.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$.html
- https://doc.akka.io/api/akka/current/akka/io/DnsExt.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$Resolved.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved$.html](https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved$.html)*