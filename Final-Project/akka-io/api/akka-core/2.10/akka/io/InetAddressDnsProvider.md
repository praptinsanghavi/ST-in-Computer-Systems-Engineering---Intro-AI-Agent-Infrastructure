---
description: Akka 2.10.17 - akka.io.InetAddressDnsProvider
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/InetAddressDnsProvider.html
title: Akka 2.10.17 - akka.io.InetAddressDnsProvider
---

# Akka 2.10.17 - akka.io.InetAddressDnsProvider

> **Summary:** Akka 2.10.17 - akka.io.InetAddressDnsProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/dns/index.html "Permalink")  package [dns](dns/index.html)Definition Classes[io](index.html)
- [BufferPool](BufferPool.html)
- [Dns](Dns.html "Not for user extension.")
- [DnsExt](DnsExt.html)
- [DnsProvider](DnsProvider.html "Where as it is possible to plug in alternative DNS implementations it is not recommended.")
- [IO](IO$.html "Entry point to Akka’s IO layer.")
- [Inet](Inet$.html)
- InetAddressDnsProvider
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

# InetAddressDnsProvider[**](../../akka/io/InetAddressDnsProvider.html "Permalink")

### 

#### class InetAddressDnsProvider extends [DnsProvider](DnsProvider.html)

INTERNAL API

Annotations@nowarn() @[InternalApi](../annotation/InternalApi.html)() Source[InetAddressDnsProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/InetAddressDnsProvider.scala#L16)Linear Supertypes[DnsProvider](DnsProvider.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. InetAddressDnsProvider
2. DnsProvider
3. AnyRef
4. Any
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

1. [**](../../akka/io/InetAddressDnsProvider.html#<init>():akka.io.InetAddressDnsProvider "Permalink")  new InetAddressDnsProvider()
### Value Members

1. [**](../../akka/io/InetAddressDnsProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/InetAddressDnsProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/InetAddressDnsProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from InetAddressDnsProvider toany2stringadd\[InetAddressDnsProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/InetAddressDnsProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (InetAddressDnsProvider, B)ImplicitThis member is added by an implicit conversion from InetAddressDnsProvider toArrowAssoc\[InetAddressDnsProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/InetAddressDnsProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/InetAddressDnsProvider.html#actorClass:Class[akka.io.InetAddressDnsResolver] "Permalink")  def actorClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[[InetAddressDnsResolver](InetAddressDnsResolver.html)]DNS resolver actor.

DNS resolver actor. Should respond to [akka.io.dns.DnsProtocol.Resolve](dns/DnsProtocol$$Resolve.html) with
[akka.io.dns.DnsProtocol.Resolved](dns/DnsProtocol$$Resolved.html)

Definition ClassesInetAddressDnsProvider → [DnsProvider](DnsProvider.html)
7. [**](../../akka/io/InetAddressDnsProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/io/InetAddressDnsProvider.html#cache:akka.io.Dns "Permalink")  def cache: [Dns](Dns.html)Cache implementation that can be accessed via Dns(system) to avoid asks to the resolver actors.

Cache implementation that can be accessed via Dns(system) to avoid asks to the resolver actors.
It is not recommended to override the default SimpleDnsCache

Definition ClassesInetAddressDnsProvider → [DnsProvider](DnsProvider.html)
9. [**](../../akka/io/InetAddressDnsProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/io/InetAddressDnsProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (InetAddressDnsProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): InetAddressDnsProviderImplicitThis member is added by an implicit conversion from InetAddressDnsProvider toEnsuring\[InetAddressDnsProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/io/InetAddressDnsProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (InetAddressDnsProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): InetAddressDnsProviderImplicitThis member is added by an implicit conversion from InetAddressDnsProvider toEnsuring\[InetAddressDnsProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/io/InetAddressDnsProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): InetAddressDnsProviderImplicitThis member is added by an implicit conversion from InetAddressDnsProvider toEnsuring\[InetAddressDnsProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/InetAddressDnsProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): InetAddressDnsProviderImplicitThis member is added by an implicit conversion from InetAddressDnsProvider toEnsuring\[InetAddressDnsProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/io/InetAddressDnsProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/io/InetAddressDnsProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../akka/io/InetAddressDnsProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/io/InetAddressDnsProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/io/InetAddressDnsProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/io/InetAddressDnsProvider.html#managerClass:Class[akka.io.SimpleDnsManager] "Permalink")  def managerClass: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[[SimpleDnsManager](SimpleDnsManager.html)]DNS manager class.

DNS manager class. Is responsible for creating resolvers and doing any cache cleanup.
The DNS extension will create one of these Actors. It should have a ctr that accepts
a [DnsExt](DnsExt.html)

Definition ClassesInetAddressDnsProvider → [DnsProvider](DnsProvider.html)
20. [**](../../akka/io/InetAddressDnsProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/io/InetAddressDnsProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/io/InetAddressDnsProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/io/InetAddressDnsProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/io/InetAddressDnsProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../akka/io/InetAddressDnsProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/io/InetAddressDnsProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/io/InetAddressDnsProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/InetAddressDnsProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/InetAddressDnsProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from InetAddressDnsProvider toStringFormat\[InetAddressDnsProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/InetAddressDnsProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (InetAddressDnsProvider, B)ImplicitThis member is added by an implicit conversion from InetAddressDnsProvider toArrowAssoc\[InetAddressDnsProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DnsProvider](DnsProvider.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromInetAddressDnsProvider to any2stringadd\[InetAddressDnsProvider]

### Inherited by implicit conversion StringFormat fromInetAddressDnsProvider to StringFormat\[InetAddressDnsProvider]

### Inherited by implicit conversion Ensuring fromInetAddressDnsProvider to Ensuring\[InetAddressDnsProvider]

### Inherited by implicit conversion ArrowAssoc fromInetAddressDnsProvider to ArrowAssoc\[InetAddressDnsProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/DnsProtocol$$Resolve.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/DnsProtocol$$Resolved.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/InetAddressDnsProvider.html](https://doc.akka.io/api/akka-core/2.10/akka/io/InetAddressDnsProvider.html)*