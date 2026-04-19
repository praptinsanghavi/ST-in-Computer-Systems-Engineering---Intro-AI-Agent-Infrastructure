---
description: Akka 2.10.17 - akka.io.dns.RecordType
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:26:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/dns/RecordType$.html
title: Akka 2.10.17 - akka.io.dns.RecordType
---

# Akka 2.10.17 - akka.io.dns.RecordType

> **Summary:** Akka 2.10.17 - akka.io.dns.RecordType

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/io/index.html "Permalink")  package [io](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/io/dns/index.html "Permalink")  package [dns](index.html)Definition Classes[io](../index.html)
- [AAAARecord](AAAARecord.html)
- [ARecord](ARecord.html)
- [CNameRecord](CNameRecord.html)
- [CachePolicy](CachePolicy$.html)
- [DnsProtocol](DnsProtocol$.html "Supersedes akka.io.Dns protocol.")
- [DnsSettings](DnsSettings$.html)
- [RecordClass](RecordClass.html)
- [RecordType](RecordType.html "DNS Record Type")
- [ResourceRecord](ResourceRecord.html "Not for user extension")
- [SRVRecord](SRVRecord.html)
- [UnknownRecord](UnknownRecord.html)
[o](RecordType.html "See companion class")[akka](../../index.html).[io](../index.html).[dns](index.html)

# [RecordType](RecordType.html "See companion class")[**](../../../akka/io/dns/RecordType$.html "Permalink")

### Companion [class RecordType](RecordType.html "See companion class")

#### object RecordType extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[RecordType.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/dns/RecordType.scala#L14)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RecordType
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/io/dns/RecordType$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/io/dns/RecordType$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/io/dns/RecordType$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/io/dns/RecordType$.html#A:akka.io.dns.RecordType "Permalink") final  val A: [RecordType](RecordType.html)A host address
5. [**](../../../akka/io/dns/RecordType$.html#AAAA:akka.io.dns.RecordType "Permalink") final  val AAAA: [RecordType](RecordType.html)The AAAA resource record type is a record specific to the Internet class that stores a single IPv6 address.
6. [**](../../../akka/io/dns/RecordType$.html#AXFR:akka.io.dns.RecordType "Permalink") final  val AXFR: [RecordType](RecordType.html)
7. [**](../../../akka/io/dns/RecordType$.html#CNAME:akka.io.dns.RecordType "Permalink") final  val CNAME: [RecordType](RecordType.html)the canonical name for an alias
8. [**](../../../akka/io/dns/RecordType$.html#HINFO:akka.io.dns.RecordType "Permalink") final  val HINFO: [RecordType](RecordType.html)host information
9. [**](../../../akka/io/dns/RecordType$.html#MAILA:akka.io.dns.RecordType "Permalink") final  val MAILA: [RecordType](RecordType.html)
10. [**](../../../akka/io/dns/RecordType$.html#MAILB:akka.io.dns.RecordType "Permalink") final  val MAILB: [RecordType](RecordType.html)
11. [**](../../../akka/io/dns/RecordType$.html#MB:akka.io.dns.RecordType "Permalink") final  val MB: [RecordType](RecordType.html)A mailbox domain name (EXPERIMENTAL)
12. [**](../../../akka/io/dns/RecordType$.html#MD:akka.io.dns.RecordType "Permalink") final  val MD: [RecordType](RecordType.html)A mail destination (Obsolete \- use MX)
13. [**](../../../akka/io/dns/RecordType$.html#MF:akka.io.dns.RecordType "Permalink") final  val MF: [RecordType](RecordType.html)A mail forwarder (Obsolete \- use MX)
14. [**](../../../akka/io/dns/RecordType$.html#MG:akka.io.dns.RecordType "Permalink") final  val MG: [RecordType](RecordType.html)A mail group member (EXPERIMENTAL)
15. [**](../../../akka/io/dns/RecordType$.html#MINFO:akka.io.dns.RecordType "Permalink") final  val MINFO: [RecordType](RecordType.html)mailbox or mail list information
16. [**](../../../akka/io/dns/RecordType$.html#MR:akka.io.dns.RecordType "Permalink") final  val MR: [RecordType](RecordType.html)A mail rename domain name (EXPERIMENTAL)
17. [**](../../../akka/io/dns/RecordType$.html#MX:akka.io.dns.RecordType "Permalink") final  val MX: [RecordType](RecordType.html)mail exchange
18. [**](../../../akka/io/dns/RecordType$.html#NS:akka.io.dns.RecordType "Permalink") final  val NS: [RecordType](RecordType.html)An authoritative name server
19. [**](../../../akka/io/dns/RecordType$.html#NULL:akka.io.dns.RecordType "Permalink") final  val NULL: [RecordType](RecordType.html)A null RR (EXPERIMENTAL)
20. [**](../../../akka/io/dns/RecordType$.html#PTR:akka.io.dns.RecordType "Permalink") final  val PTR: [RecordType](RecordType.html)A domain name pointer
21. [**](../../../akka/io/dns/RecordType$.html#SOA:akka.io.dns.RecordType "Permalink") final  val SOA: [RecordType](RecordType.html)marks the start of a zone of authority
22. [**](../../../akka/io/dns/RecordType$.html#SRV:akka.io.dns.RecordType "Permalink") final  val SRV: [RecordType](RecordType.html)The SRV RR allows administrators to use several servers for a single
domain, to move services from host to host with little fuss, and to
designate some hosts as primary servers for a service and others as
backups.
23. [**](../../../akka/io/dns/RecordType$.html#TXT:akka.io.dns.RecordType "Permalink") final  val TXT: [RecordType](RecordType.html)text strings
24. [**](../../../akka/io/dns/RecordType$.html#WILDCARD:akka.io.dns.RecordType "Permalink") final  val WILDCARD: [RecordType](RecordType.html)
25. [**](../../../akka/io/dns/RecordType$.html#WKS:akka.io.dns.RecordType "Permalink") final  val WKS: [RecordType](RecordType.html)A well known service description
26. [**](../../../akka/io/dns/RecordType$.html#apply(id:Short):akka.util.OptionVal[akka.io.dns.RecordType] "Permalink")  def apply(id: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)): OptionVal\[[RecordType](RecordType.html)]
27. [**](../../../akka/io/dns/RecordType$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
28. [**](../../../akka/io/dns/RecordType$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/io/dns/RecordType$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../../akka/io/dns/RecordType$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
31. [**](../../../akka/io/dns/RecordType$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../akka/io/dns/RecordType$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../akka/io/dns/RecordType$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
34. [**](../../../akka/io/dns/RecordType$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
35. [**](../../../akka/io/dns/RecordType$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../../akka/io/dns/RecordType$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../../akka/io/dns/RecordType$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
38. [**](../../../akka/io/dns/RecordType$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../../akka/io/dns/RecordType$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../akka/io/dns/RecordType$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../../akka/io/dns/RecordType$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/io/dns/RecordType$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/dns/AAAARecord.html
- https://doc.akka.io/api/akka/current/akka/io/dns/ARecord.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CNameRecord.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsSettings$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/RecordClass$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/RecordClass.html
- https://doc.akka.io/api/akka/current/akka/io/dns/RecordType$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/RecordType.html
- https://doc.akka.io/api/akka/current/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/api/akka/current/akka/io/dns/SRVRecord.html
- https://doc.akka.io/api/akka/current/akka/io/dns/UnknownRecord.html
- https://doc.akka.io/api/akka/current/akka/io/dns/index.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/dns/RecordType$.html](https://doc.akka.io/api/akka/current/akka/io/dns/RecordType$.html)*