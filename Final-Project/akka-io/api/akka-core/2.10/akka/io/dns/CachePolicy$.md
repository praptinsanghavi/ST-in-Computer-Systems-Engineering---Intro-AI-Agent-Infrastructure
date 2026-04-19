---
description: Akka 2.10.17 - akka.io.dns.CachePolicy
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:12:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/dns/CachePolicy$.html
title: Akka 2.10.17 - akka.io.dns.CachePolicy
---

# Akka 2.10.17 - akka.io.dns.CachePolicy

> **Summary:** Akka 2.10.17 - akka.io.dns.CachePolicy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/io/index.html "Permalink")  package [io](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/io/dns/index.html "Permalink")  package [dns](index.html)Definition Classes[io](../index.html)
- [AAAARecord](AAAARecord.html)
- [ARecord](ARecord.html)
- [CNameRecord](CNameRecord.html)
- CachePolicy
- [DnsProtocol](DnsProtocol$.html "Supersedes akka.io.Dns protocol.")
- [DnsSettings](DnsSettings$.html)
- [RecordClass](RecordClass.html)
- [RecordType](RecordType.html "DNS Record Type")
- [ResourceRecord](ResourceRecord.html "Not for user extension")
- [SRVRecord](SRVRecord.html)
- [UnknownRecord](UnknownRecord.html)
o[akka](../../index.html).[io](../index.html).[dns](index.html)

# CachePolicy[**](../../../akka/io/dns/CachePolicy$.html "Permalink")

### 

#### object CachePolicy

Source[CachePolicy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/dns/CachePolicy.scala#L12)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CachePolicy
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/io/dns/CachePolicy$$CachePolicy.html "Permalink") sealed  trait [CachePolicy](CachePolicy$$CachePolicy.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../akka/io/dns/CachePolicy$$Ttl.html "Permalink") final  class [Ttl](CachePolicy$$Ttl.html) extends [CachePolicy](CachePolicy$$CachePolicy.html)
### Value Members

1. [**](../../../akka/io/dns/CachePolicy$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/io/dns/CachePolicy$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/io/dns/CachePolicy$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/io/dns/CachePolicy$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/io/dns/CachePolicy$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/io/dns/CachePolicy$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/io/dns/CachePolicy$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/io/dns/CachePolicy$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/io/dns/CachePolicy$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/io/dns/CachePolicy$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/io/dns/CachePolicy$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/io/dns/CachePolicy$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/io/dns/CachePolicy$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/io/dns/CachePolicy$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/io/dns/CachePolicy$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/io/dns/CachePolicy$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/io/dns/CachePolicy$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/io/dns/CachePolicy$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/io/dns/CachePolicy$$Forever$.html "Permalink")  case object [Forever](CachePolicy$$Forever$.html) extends [CachePolicy](CachePolicy$$CachePolicy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
20. [**](../../../akka/io/dns/CachePolicy$$Never$.html "Permalink")  case object [Never](CachePolicy$$Never$.html) extends [CachePolicy](CachePolicy$$CachePolicy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
21. [**](../../../akka/io/dns/CachePolicy$$Ttl$.html "Permalink")  object [Ttl](CachePolicy$$Ttl$.html)
### Deprecated Value Members

1. [**](../../../akka/io/dns/CachePolicy$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/AAAARecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/ARecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CNameRecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$$CachePolicy.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$$Forever$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$$Never$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$$Ttl$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$$Ttl.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/DnsProtocol$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/DnsSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/RecordClass$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/RecordClass.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/RecordType$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/RecordType.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/SRVRecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/UnknownRecord.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$.html](https://doc.akka.io/api/akka-core/2.10/akka/io/dns/CachePolicy$.html)*