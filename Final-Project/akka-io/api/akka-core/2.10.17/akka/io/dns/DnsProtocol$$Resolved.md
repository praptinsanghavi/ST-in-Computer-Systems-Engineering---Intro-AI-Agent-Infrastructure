---
description: Akka 2.10.17 - akka.io.dns.DnsProtocol.Resolved
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:02:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/dns/DnsProtocol$$Resolved.html
title: Akka 2.10.17 - akka.io.dns.DnsProtocol.Resolved
---

# Akka 2.10.17 - akka.io.dns.DnsProtocol.Resolved

> **Summary:** Akka 2.10.17 - akka.io.dns.DnsProtocol.Resolved

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/io/index.html "Permalink")  package [io](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/io/dns/index.html "Permalink")  package [dns](index.html)Definition Classes[io](../index.html)
- [**](../../../akka/io/dns/DnsProtocol$.html "Permalink")  object [DnsProtocol](DnsProtocol$.html "Supersedes akka.io.Dns protocol.")Supersedes [akka.io.Dns](../Dns.html) protocol.

Supersedes [akka.io.Dns](../Dns.html) protocol.

Note that one MUST configure `akka.io.dns.resolver = async-dns` to make use of this protocol and resolver.

Allows for more detailed lookups, by specifying which records should be checked,
and responses can more information than plain IP addresses (e.g. ports for SRV records).

Definition Classes[dns](index.html)
- [Ip](DnsProtocol$$Ip.html)
- [RequestType](DnsProtocol$$RequestType.html)
- [Resolve](DnsProtocol$$Resolve.html "Sending this to the AsyncDnsManager will either lead to a Resolved or a akka.actor.Status.Failure response.")
- Resolved
- [Srv](DnsProtocol$$Srv$.html)
[c](DnsProtocol$$Resolved$.html "See companion object")[akka](../../index.html).[io](../index.html).[dns](index.html).[DnsProtocol](DnsProtocol$.html)

# [Resolved](DnsProtocol$$Resolved$.html "See companion object")[**](../../../akka/io/dns/DnsProtocol$$Resolved.html "Permalink")

### Companion [object Resolved](DnsProtocol$$Resolved$.html "See companion object")

#### final  case class Resolved(name: String, records: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResourceRecord](ResourceRecord.html)], additionalRecords: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResourceRecord](ResourceRecord.html)]) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

nameof the record

recordsresource records for the query

additionalRecordsrecords that relate to the query but are not strictly answers

Source[DnsProtocol.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/dns/DnsProtocol.scala#L77)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Resolved
2. Serializable
3. Product
4. Equals
5. NoSerializationVerificationNeeded
6. AnyRef
7. Any
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

1. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#<init>(name:String,records:Seq[akka.io.dns.ResourceRecord],additionalRecords:Seq[akka.io.dns.ResourceRecord]):akka.io.dns.DnsProtocol.Resolved "Permalink")  new Resolved(name: String, records: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResourceRecord](ResourceRecord.html)], additionalRecords: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResourceRecord](ResourceRecord.html)])nameof the record

recordsresource records for the query

additionalRecordsrecords that relate to the query but are not strictly answers
### Value Members

1. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Resolved toany2stringadd\[Resolved] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Resolved, B)ImplicitThis member is added by an implicit conversion from Resolved toArrowAssoc\[Resolved] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#additionalRecords:Seq[akka.io.dns.ResourceRecord] "Permalink")  val additionalRecords: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResourceRecord](ResourceRecord.html)]
7. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#address():java.net.InetAddress "Permalink")  def address(): [InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)Return the host, taking into account the "java.net.preferIPv6Addresses" system property.

Return the host, taking into account the "java.net.preferIPv6Addresses" system property.

Annotations@throws("") Exceptions thrown
8. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Resolved) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Resolved) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#getAdditionalRecords():java.util.List[akka.io.dns.ResourceRecord] "Permalink")  def getAdditionalRecords(): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[ResourceRecord](ResourceRecord.html)]Java API

Java API

Records that relate to the query but are not strickly answers e.g. A records for the records returned for an SRV query.
16. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#getRecords():java.util.List[akka.io.dns.ResourceRecord] "Permalink")  def getRecords(): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[ResourceRecord](ResourceRecord.html)]Java API

Java API

Records for the query
18. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#name:String "Permalink")  val name: String
20. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#records:Seq[akka.io.dns.ResourceRecord] "Permalink")  val records: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResourceRecord](ResourceRecord.html)]
25. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Resolved toStringFormat\[Resolved] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/io/dns/DnsProtocol$$Resolved.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Resolved, B)ImplicitThis member is added by an implicit conversion from Resolved toArrowAssoc\[Resolved] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromResolved to any2stringadd\[Resolved]

### Inherited by implicit conversion StringFormat fromResolved to StringFormat\[Resolved]

### Inherited by implicit conversion Ensuring fromResolved to Ensuring\[Resolved]

### Inherited by implicit conversion ArrowAssoc fromResolved to ArrowAssoc\[Resolved]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Ip.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$RequestType.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Resolve$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Resolve.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Resolved$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Resolved.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Srv$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Resolved.html](https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$$Resolved.html)*