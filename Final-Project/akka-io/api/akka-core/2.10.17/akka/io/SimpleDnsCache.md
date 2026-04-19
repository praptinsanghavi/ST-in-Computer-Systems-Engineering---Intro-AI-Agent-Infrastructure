---
description: Akka 2.10.17 - akka.io.SimpleDnsCache
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:01:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/SimpleDnsCache.html
title: Akka 2.10.17 - akka.io.SimpleDnsCache
---

# Akka 2.10.17 - akka.io.SimpleDnsCache

> **Summary:** Akka 2.10.17 - akka.io.SimpleDnsCache

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
- [InetAddressDnsProvider](InetAddressDnsProvider.html "INTERNAL API")
- [InetAddressDnsResolver](InetAddressDnsResolver.html "INTERNAL API")
- [IpVersionSelector](IpVersionSelector$.html "INTERNAL API")
- [SelectionHandlerSettings](SelectionHandlerSettings.html)
- SimpleDnsCache
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
[c](SimpleDnsCache$.html "See companion object")[akka](../index.html).[io](index.html)

# [SimpleDnsCache](SimpleDnsCache$.html "See companion object")[**](../../akka/io/SimpleDnsCache.html "Permalink")

### Companion [object SimpleDnsCache](SimpleDnsCache$.html "See companion object")

#### class SimpleDnsCache extends [Dns](Dns.html) with PeriodicCacheCleanup with [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

Source[SimpleDnsCache.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/SimpleDnsCache.scala#L27)Linear Supertypes[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html), PeriodicCacheCleanup, [Dns](Dns.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SimpleDnsCache
2. NoSerializationVerificationNeeded
3. PeriodicCacheCleanup
4. Dns
5. AnyRef
6. Any
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

1. [**](../../akka/io/SimpleDnsCache.html#<init>():akka.io.SimpleDnsCache "Permalink")  new SimpleDnsCache()
### Value Members

1. [**](../../akka/io/SimpleDnsCache.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/SimpleDnsCache.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/SimpleDnsCache.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SimpleDnsCache toany2stringadd\[SimpleDnsCache] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/SimpleDnsCache.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SimpleDnsCache, B)ImplicitThis member is added by an implicit conversion from SimpleDnsCache toArrowAssoc\[SimpleDnsCache] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/SimpleDnsCache.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/SimpleDnsCache.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/SimpleDnsCache.html#cached(request:akka.io.dns.DnsProtocol.Resolve):Option[akka.io.dns.DnsProtocol.Resolved] "Permalink")  def cached(request: [Resolve](dns/DnsProtocol$$Resolve.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](dns/DnsProtocol$$Resolved.html)]Definition ClassesSimpleDnsCache → [Dns](Dns.html)
8. [**](../../akka/io/SimpleDnsCache.html#cached(name:String):Option[akka.io.Dns.Resolved] "Permalink")  def cached(name: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](Dns$$Resolved.html)]Gets any IPv4 and IPv6 cached entries.

Gets any IPv4 and IPv6 cached entries.
To get Srv or just one type use DnsProtocol

This method is deprecated and involves a copy from the new protocol to
remain compatible

Definition ClassesSimpleDnsCache → [Dns](Dns.html)Annotations@nowarn()
9. [**](../../akka/io/SimpleDnsCache.html#cleanup():Unit "Permalink") final  def cleanup(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesSimpleDnsCache → PeriodicCacheCleanupAnnotations@tailrec()
10. [**](../../akka/io/SimpleDnsCache.html#clock():Long "Permalink")  def clock(): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Attributesprotected
11. [**](../../akka/io/SimpleDnsCache.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/io/SimpleDnsCache.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SimpleDnsCache) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SimpleDnsCacheImplicitThis member is added by an implicit conversion from SimpleDnsCache toEnsuring\[SimpleDnsCache] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/SimpleDnsCache.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SimpleDnsCache) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SimpleDnsCacheImplicitThis member is added by an implicit conversion from SimpleDnsCache toEnsuring\[SimpleDnsCache] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/io/SimpleDnsCache.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SimpleDnsCacheImplicitThis member is added by an implicit conversion from SimpleDnsCache toEnsuring\[SimpleDnsCache] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/io/SimpleDnsCache.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SimpleDnsCacheImplicitThis member is added by an implicit conversion from SimpleDnsCache toEnsuring\[SimpleDnsCache] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/io/SimpleDnsCache.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/io/SimpleDnsCache.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../akka/io/SimpleDnsCache.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/SimpleDnsCache.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/SimpleDnsCache.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/io/SimpleDnsCache.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/io/SimpleDnsCache.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/io/SimpleDnsCache.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/io/SimpleDnsCache.html#resolve(request:akka.io.dns.DnsProtocol.Resolve,system:akka.actor.ActorSystem,sender:akka.actor.ActorRef):Option[akka.io.dns.DnsProtocol.Resolved] "Permalink")  def resolve(request: [Resolve](dns/DnsProtocol$$Resolve.html), system: [ActorSystem](../actor/ActorSystem.html), sender: [ActorRef](../actor/ActorRef.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](dns/DnsProtocol$$Resolved.html)]Definition Classes[Dns](Dns.html)
25. [**](../../akka/io/SimpleDnsCache.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/io/SimpleDnsCache.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../akka/io/SimpleDnsCache.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/io/SimpleDnsCache.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/io/SimpleDnsCache.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/SimpleDnsCache.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/SimpleDnsCache.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SimpleDnsCache toStringFormat\[SimpleDnsCache] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/SimpleDnsCache.html#resolve(name:String)(system:akka.actor.ActorSystem,sender:akka.actor.ActorRef):Option[akka.io.Dns.Resolved] "Permalink")  def resolve(name: String)(system: [ActorSystem](../actor/ActorSystem.html), sender: [ActorRef](../actor/ActorRef.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resolved](Dns$$Resolved.html)]If an entry is cached return it immediately.

If an entry is cached return it immediately. If it is not then
trigger a resolve and return None.

Definition Classes[Dns](Dns.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use resolve(DnsProtocol.Resolve)
4. [**](../../akka/io/SimpleDnsCache.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SimpleDnsCache, B)ImplicitThis member is added by an implicit conversion from SimpleDnsCache toArrowAssoc\[SimpleDnsCache] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

### Inherited from PeriodicCacheCleanup

### Inherited from [Dns](Dns.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSimpleDnsCache to any2stringadd\[SimpleDnsCache]

### Inherited by implicit conversion StringFormat fromSimpleDnsCache to StringFormat\[SimpleDnsCache]

### Inherited by implicit conversion Ensuring fromSimpleDnsCache to Ensuring\[SimpleDnsCache]

### Inherited by implicit conversion ArrowAssoc fromSimpleDnsCache to ArrowAssoc\[SimpleDnsCache]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns$$Resolved.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Resolve.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Resolved.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsCache.html](https://doc.akka.io/api/akka-core/2.10.17/akka/io/SimpleDnsCache.html)*