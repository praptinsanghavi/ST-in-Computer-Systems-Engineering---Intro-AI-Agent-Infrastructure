---
description: Akka 2.10.11 - akka.io.DnsExt
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:17:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/DnsExt.html
title: Akka 2.10.11 - akka.io.DnsExt
---

# Akka 2.10.11 - akka.io.DnsExt

> **Summary:** Akka 2.10.11 - akka.io.DnsExt

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/dns/index.html "Permalink")  package [dns](dns/index.html)Definition Classes[io](index.html)
- [BufferPool](BufferPool.html)
- [Dns](Dns.html "Not for user extension.")
- DnsExt
- [DnsProvider](DnsProvider.html "Where as it is possible to plug in alternative DNS implementations it is not recommended.")
- [IO](IO$.html "Entry point to Akka’s IO layer.")
- [Inet](Inet$.html)
- [InetAddressDnsProvider](InetAddressDnsProvider.html "INTERNAL API")
- [InetAddressDnsResolver](InetAddressDnsResolver.html "INTERNAL API")
- [IpVersionSelector](IpVersionSelector$.html "INTERNAL API")
- [SelectionHandlerSettings](SelectionHandlerSettings.html)
- [SimpleDnsCache](SimpleDnsCache.html)
- [SimpleDnsManager](SimpleDnsManager.html)
- [Tcp](Tcp$.html "TCP Extension for Akka’s IO layer.")
- [TcpExt](TcpExt.html)
- [TcpMessage](TcpMessage$.html)
- [TcpSO](TcpSO$.html "Java API for accessing socket options.")
- [Udp](Udp$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnected](UdpConnected$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnectedExt](UdpConnectedExt.html)
- [UdpConnectedMessage](UdpConnectedMessage$.html "Java API: factory methods for the message types used when communicating with the UdpConnected service.")
- [UdpExt](UdpExt.html)
- [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")
- [UdpSO](UdpSO$.html)
c[akka](../index.html).[io](index.html)

# DnsExt[**](../../akka/io/DnsExt.html "Permalink")

### 

#### class DnsExt extends [Extension](IO$$Extension.html)

Source[Dns.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/io/Dns.scala#L147)Linear Supertypes[Extension](IO$$Extension.html), [Extension](../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DnsExt
2. Extension
3. Extension
4. AnyRef
5. Any
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

1. [**](../../akka/io/DnsExt.html#<init>(system:akka.actor.ExtendedActorSystem):akka.io.DnsExt "Permalink")  new DnsExt(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))INTERNAL API

INTERNAL API

Use IO(DNS) or Dns(system). Do not instantiate directly

For binary compat as DnsExt constructor didn't used to have internal API on

Annotations@[InternalApi](../annotation/InternalApi.html)()
### Type Members

1. [**](../../akka/io/DnsExt$Settings.html "Permalink")  class [Settings](DnsExt$Settings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../akka/io/DnsExt.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/DnsExt.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/DnsExt.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DnsExt toany2stringadd\[DnsExt] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/DnsExt.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DnsExt, B)ImplicitThis member is added by an implicit conversion from DnsExt toArrowAssoc\[DnsExt] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/DnsExt.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/DnsExt.html#Settings:DnsExt.this.Settings "Permalink")  val Settings: [Settings](DnsExt$Settings.html)
7. [**](../../akka/io/DnsExt.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/io/DnsExt.html#cache:akka.io.Dns "Permalink")  val cache: [Dns](Dns.html)
9. [**](../../akka/io/DnsExt.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/io/DnsExt.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DnsExt) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DnsExtImplicitThis member is added by an implicit conversion from DnsExt toEnsuring\[DnsExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/io/DnsExt.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DnsExt) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DnsExtImplicitThis member is added by an implicit conversion from DnsExt toEnsuring\[DnsExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/io/DnsExt.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DnsExtImplicitThis member is added by an implicit conversion from DnsExt toEnsuring\[DnsExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/DnsExt.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DnsExtImplicitThis member is added by an implicit conversion from DnsExt toEnsuring\[DnsExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/io/DnsExt.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/io/DnsExt.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../akka/io/DnsExt.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/io/DnsExt.html#getResolver:akka.actor.ActorRef "Permalink")  def getResolver: [ActorRef](../actor/ActorRef.html)
18. [**](../../akka/io/DnsExt.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/DnsExt.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../akka/io/DnsExt.html#manager:akka.actor.ActorRef "Permalink")  val manager: [ActorRef](../actor/ActorRef.html)Definition ClassesDnsExt → [Extension](IO$$Extension.html)
21. [**](../../akka/io/DnsExt.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/io/DnsExt.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/io/DnsExt.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/io/DnsExt.html#provider:akka.io.DnsProvider "Permalink")  val provider: [DnsProvider](DnsProvider.html)
25. [**](../../akka/io/DnsExt.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/io/DnsExt.html#system:akka.actor.ExtendedActorSystem "Permalink")  val system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)
27. [**](../../akka/io/DnsExt.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../akka/io/DnsExt.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/io/DnsExt.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../akka/io/DnsExt.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/DnsExt.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/DnsExt.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DnsExt toStringFormat\[DnsExt] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/DnsExt.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DnsExt, B)ImplicitThis member is added by an implicit conversion from DnsExt toArrowAssoc\[DnsExt] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](IO$$Extension.html)

### Inherited from [Extension](../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDnsExt to any2stringadd\[DnsExt]

### Inherited by implicit conversion StringFormat fromDnsExt to StringFormat\[DnsExt]

### Inherited by implicit conversion Ensuring fromDnsExt to Ensuring\[DnsExt]

### Inherited by implicit conversion ArrowAssoc fromDnsExt to ArrowAssoc\[DnsExt]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/DnsExt$Settings.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/IO$$Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/io/DnsExt.html](https://doc.akka.io/api/akka-core/2.10.11/akka/io/DnsExt.html)*