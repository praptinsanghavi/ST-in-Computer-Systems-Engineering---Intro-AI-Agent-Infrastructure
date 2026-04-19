---
description: Akka 2.10.17 - akka.io.Dns
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Dns.html
title: Akka 2.10.17 - akka.io.Dns
---

# Akka 2.10.17 - akka.io.Dns

> **Summary:** Akka 2.10.17 - akka.io.Dns

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/dns/index.html "Permalink")  package [dns](dns/index.html)Definition Classes[io](index.html)
- [BufferPool](BufferPool.html)
- Dns
- [DnsExt](DnsExt.html)
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
[c](Dns$.html "See companion object")[akka](../index.html).[io](index.html)

# [Dns](Dns$.html "See companion object")[**](../../akka/io/Dns.html "Permalink")

### Companion [object Dns](Dns$.html "See companion object")

#### abstract  class Dns extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Not for user extension.

This used to be a supported extension point but will be removed in future versions of Akka.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)() Source[Dns.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Dns.scala#L31)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[SimpleDnsCache](SimpleDnsCache.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Dns
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
### Instance Constructors

1. [**](../../akka/io/Dns.html#<init>():akka.io.Dns "Permalink")  new Dns()
### Value Members

1. [**](../../akka/io/Dns.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Dns.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Dns.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Dns toany2stringadd\[Dns] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/Dns.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Dns, B)ImplicitThis member is added by an implicit conversion from Dns toArrowAssoc\[Dns] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/Dns.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/Dns.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/Dns.html#cached(request:akka.io.dns.DnsProtocol.Resolve):Option[akka.io.dns.DnsProtocol.Resolved] "Permalink")  def cached(request: [Resolve](dns/DnsProtocol$$Resolve.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](dns/DnsProtocol$$Resolved.html)]
8. [**](../../akka/io/Dns.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/io/Dns.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Dns) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DnsImplicitThis member is added by an implicit conversion from Dns toEnsuring\[Dns] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/io/Dns.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Dns) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DnsImplicitThis member is added by an implicit conversion from Dns toEnsuring\[Dns] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/io/Dns.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DnsImplicitThis member is added by an implicit conversion from Dns toEnsuring\[Dns] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/io/Dns.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DnsImplicitThis member is added by an implicit conversion from Dns toEnsuring\[Dns] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/Dns.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/io/Dns.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/io/Dns.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/io/Dns.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/io/Dns.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/io/Dns.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/io/Dns.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/Dns.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/io/Dns.html#resolve(request:akka.io.dns.DnsProtocol.Resolve,system:akka.actor.ActorSystem,sender:akka.actor.ActorRef):Option[akka.io.dns.DnsProtocol.Resolved] "Permalink")  def resolve(request: [Resolve](dns/DnsProtocol$$Resolve.html), system: [ActorSystem](../actor/ActorSystem.html), sender: [ActorRef](../actor/ActorRef.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](dns/DnsProtocol$$Resolved.html)]
22. [**](../../akka/io/Dns.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/io/Dns.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/io/Dns.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/io/Dns.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/io/Dns.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Dns.html#cached(name:String):Option[akka.io.Dns.Resolved] "Permalink")  def cached(name: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](Dns$$Resolved.html)]Lookup if a DNS resolved is cached.

Lookup if a DNS resolved is cached. The exact behavior of caching will depend on
the akka.actor.io.dns.resolver that is configured.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use cached(DnsProtocol.Resolve)
2. [**](../../akka/io/Dns.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../akka/io/Dns.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Dns toStringFormat\[Dns] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../akka/io/Dns.html#resolve(name:String)(system:akka.actor.ActorSystem,sender:akka.actor.ActorRef):Option[akka.io.Dns.Resolved] "Permalink")  def resolve(name: String)(system: [ActorSystem](../actor/ActorSystem.html), sender: [ActorRef](../actor/ActorRef.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](Dns$$Resolved.html)]If an entry is cached return it immediately.

If an entry is cached return it immediately. If it is not then
trigger a resolve and return None.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use resolve(DnsProtocol.Resolve)
5. [**](../../akka/io/Dns.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Dns, B)ImplicitThis member is added by an implicit conversion from Dns toArrowAssoc\[Dns] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDns to any2stringadd\[Dns]

### Inherited by implicit conversion StringFormat fromDns to StringFormat\[Dns]

### Inherited by implicit conversion Ensuring fromDns to Ensuring\[Dns]

### Inherited by implicit conversion ArrowAssoc fromDns to ArrowAssoc\[Dns]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Dns$$Resolved.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/Dns.html](https://doc.akka.io/api/akka-core/2.10/akka/io/Dns.html)*