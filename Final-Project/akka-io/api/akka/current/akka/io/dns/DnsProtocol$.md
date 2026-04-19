---
description: Akka 2.10.17 - akka.io.dns.DnsProtocol
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:26:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/dns/DnsProtocol$.html
title: Akka 2.10.17 - akka.io.dns.DnsProtocol
---

# Akka 2.10.17 - akka.io.dns.DnsProtocol

> **Summary:** Akka 2.10.17 - akka.io.dns.DnsProtocol

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
- DnsProtocol
- [DnsSettings](DnsSettings$.html)
- [RecordClass](RecordClass.html)
- [RecordType](RecordType.html "DNS Record Type")
- [ResourceRecord](ResourceRecord.html "Not for user extension")
- [SRVRecord](SRVRecord.html)
- [UnknownRecord](UnknownRecord.html)
o[akka](../../index.html).[io](../index.html).[dns](index.html)

# DnsProtocol[**](../../../akka/io/dns/DnsProtocol$.html "Permalink")

### 

#### object DnsProtocol

Supersedes [akka.io.Dns](../Dns.html) protocol.

Note that one MUST configure `akka.io.dns.resolver = async-dns` to make use of this protocol and resolver.

Allows for more detailed lookups, by specifying which records should be checked,
and responses can more information than plain IP addresses (e.g. ports for SRV records).

Source[DnsProtocol.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/dns/DnsProtocol.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DnsProtocol
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/io/dns/DnsProtocol$$Ip.html "Permalink") final  case class [Ip](DnsProtocol$$Ip.html)(ipv4: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= true, ipv6: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= true) extends [RequestType](DnsProtocol$$RequestType.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../akka/io/dns/DnsProtocol$$RequestType.html "Permalink") sealed  trait [RequestType](DnsProtocol$$RequestType.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../akka/io/dns/DnsProtocol$$Resolve.html "Permalink") final  case class [Resolve](DnsProtocol$$Resolve.html "Sending this to the AsyncDnsManager will either lead to a Resolved or a akka.actor.Status.Failure response.")(name: String, requestType: [RequestType](DnsProtocol$$RequestType.html)) extends [ConsistentHashable](../../routing/ConsistentHashingRouter$$ConsistentHashable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSending this to the AsyncDnsManager will either lead to a [Resolved](DnsProtocol$$Resolved.html) or a [akka.actor.Status.Failure](../../actor/Status$$Failure.html) response.

Sending this to the AsyncDnsManager will either lead to a [Resolved](DnsProtocol$$Resolved.html) or a [akka.actor.Status.Failure](../../actor/Status$$Failure.html) response.
If request type are both, both resolutions must succeed or the response is a failure.
4. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html "Permalink") final  case class [Resolved](DnsProtocol$$Resolved.html)(name: String, records: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResourceRecord](ResourceRecord.html)], additionalRecords: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResourceRecord](ResourceRecord.html)]) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializablenameof the record

recordsresource records for the query

additionalRecordsrecords that relate to the query but are not strictly answers
### Value Members

1. [**](../../../akka/io/dns/DnsProtocol$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/io/dns/DnsProtocol$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/io/dns/DnsProtocol$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/io/dns/DnsProtocol$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/io/dns/DnsProtocol$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/io/dns/DnsProtocol$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/io/dns/DnsProtocol$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/io/dns/DnsProtocol$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/io/dns/DnsProtocol$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/io/dns/DnsProtocol$.html#ipRequestType():akka.io.dns.DnsProtocol.RequestType "Permalink")  def ipRequestType(): [RequestType](DnsProtocol$$RequestType.html)Java API
11. [**](../../../akka/io/dns/DnsProtocol$.html#ipRequestType(ipv4:Boolean,ipv6:Boolean):akka.io.dns.DnsProtocol.RequestType "Permalink")  def ipRequestType(ipv4: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), ipv6: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [RequestType](DnsProtocol$$RequestType.html)Java API
12. [**](../../../akka/io/dns/DnsProtocol$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/io/dns/DnsProtocol$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/io/dns/DnsProtocol$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/io/dns/DnsProtocol$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/io/dns/DnsProtocol$.html#resolve(name:String,requestType:akka.io.dns.DnsProtocol.RequestType):akka.io.dns.DnsProtocol.Resolve "Permalink")  def resolve(name: String, requestType: [RequestType](DnsProtocol$$RequestType.html)): [Resolve](DnsProtocol$$Resolve.html)Java API
17. [**](../../../akka/io/dns/DnsProtocol$.html#resolve(name:String):akka.io.dns.DnsProtocol.Resolve "Permalink")  def resolve(name: String): [Resolve](DnsProtocol$$Resolve.html)Java API
18. [**](../../../akka/io/dns/DnsProtocol$.html#srvRequestType():akka.io.dns.DnsProtocol.RequestType "Permalink")  def srvRequestType(): [RequestType](DnsProtocol$$RequestType.html)Java API
19. [**](../../../akka/io/dns/DnsProtocol$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/io/dns/DnsProtocol$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../akka/io/dns/DnsProtocol$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/io/dns/DnsProtocol$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/io/dns/DnsProtocol$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/io/dns/DnsProtocol$$Resolve$.html "Permalink")  object [Resolve](DnsProtocol$$Resolve$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
25. [**](../../../akka/io/dns/DnsProtocol$$Resolved$.html "Permalink")  object [Resolved](DnsProtocol$$Resolved$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
26. [**](../../../akka/io/dns/DnsProtocol$$Srv$.html "Permalink")  case object [Srv](DnsProtocol$$Srv$.html) extends [RequestType](DnsProtocol$$RequestType.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../akka/io/dns/DnsProtocol$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/Dns.html
- https://doc.akka.io/api/akka/current/akka/io/dns/AAAARecord.html
- https://doc.akka.io/api/akka/current/akka/io/dns/ARecord.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CNameRecord.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$Ip.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$RequestType.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$Resolve$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$Resolve.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$Resolved$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$Resolved.html
- https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$$Srv$.html
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
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$.html](https://doc.akka.io/api/akka/current/akka/io/dns/DnsProtocol$.html)*