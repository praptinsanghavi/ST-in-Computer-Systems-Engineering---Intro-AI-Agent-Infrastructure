---
description: Akka 2.10.17 - akka.io.dns.ResourceRecord
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:02:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/dns/ResourceRecord.html
title: Akka 2.10.17 - akka.io.dns.ResourceRecord
---

# Akka 2.10.17 - akka.io.dns.ResourceRecord

> **Summary:** Akka 2.10.17 - akka.io.dns.ResourceRecord

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
- ResourceRecord
- [SRVRecord](SRVRecord.html)
- [UnknownRecord](UnknownRecord.html)
c[akka](../../index.html).[io](../index.html).[dns](index.html)

# ResourceRecord[**](../../../akka/io/dns/ResourceRecord.html "Permalink")

### 

#### sealed abstract  class ResourceRecord extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[DnsResourceRecords.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/dns/DnsResourceRecords.scala#L25)Linear Supertypes[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AAAARecord](AAAARecord.html), [ARecord](ARecord.html), [CNameRecord](CNameRecord.html), [SRVRecord](SRVRecord.html), [UnknownRecord](UnknownRecord.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ResourceRecord
2. NoSerializationVerificationNeeded
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
### Value Members

1. [**](../../../akka/io/dns/ResourceRecord.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/io/dns/ResourceRecord.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/io/dns/ResourceRecord.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ResourceRecord toany2stringadd\[ResourceRecord] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/io/dns/ResourceRecord.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ResourceRecord, B)ImplicitThis member is added by an implicit conversion from ResourceRecord toArrowAssoc\[ResourceRecord] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/io/dns/ResourceRecord.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/io/dns/ResourceRecord.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/io/dns/ResourceRecord.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/io/dns/ResourceRecord.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ResourceRecord) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResourceRecordImplicitThis member is added by an implicit conversion from ResourceRecord toEnsuring\[ResourceRecord] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/io/dns/ResourceRecord.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ResourceRecord) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResourceRecordImplicitThis member is added by an implicit conversion from ResourceRecord toEnsuring\[ResourceRecord] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/io/dns/ResourceRecord.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResourceRecordImplicitThis member is added by an implicit conversion from ResourceRecord toEnsuring\[ResourceRecord] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/io/dns/ResourceRecord.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResourceRecordImplicitThis member is added by an implicit conversion from ResourceRecord toEnsuring\[ResourceRecord] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/io/dns/ResourceRecord.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/io/dns/ResourceRecord.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/io/dns/ResourceRecord.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/io/dns/ResourceRecord.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/io/dns/ResourceRecord.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/io/dns/ResourceRecord.html#name:String "Permalink")  val name: String
18. [**](../../../akka/io/dns/ResourceRecord.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/io/dns/ResourceRecord.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/io/dns/ResourceRecord.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/io/dns/ResourceRecord.html#recClass:Short "Permalink")  val recClass: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)
22. [**](../../../akka/io/dns/ResourceRecord.html#recType:Short "Permalink")  val recType: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)
23. [**](../../../akka/io/dns/ResourceRecord.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/io/dns/ResourceRecord.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../akka/io/dns/ResourceRecord.html#ttl:akka.io.dns.CachePolicy.Ttl "Permalink")  val ttl: [Ttl](CachePolicy$$Ttl.html)
26. [**](../../../akka/io/dns/ResourceRecord.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/io/dns/ResourceRecord.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/io/dns/ResourceRecord.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/io/dns/ResourceRecord.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/io/dns/ResourceRecord.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ResourceRecord toStringFormat\[ResourceRecord] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/io/dns/ResourceRecord.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ResourceRecord, B)ImplicitThis member is added by an implicit conversion from ResourceRecord toArrowAssoc\[ResourceRecord] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromResourceRecord to any2stringadd\[ResourceRecord]

### Inherited by implicit conversion StringFormat fromResourceRecord to StringFormat\[ResourceRecord]

### Inherited by implicit conversion Ensuring fromResourceRecord to Ensuring\[ResourceRecord]

### Inherited by implicit conversion ArrowAssoc fromResourceRecord to ArrowAssoc\[ResourceRecord]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/AAAARecord.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/ARecord.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/CNameRecord.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/CachePolicy$$Ttl.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/CachePolicy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsProtocol$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/DnsSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/RecordClass$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/RecordClass.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/RecordType$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/RecordType.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/ResourceRecord.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/SRVRecord.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/UnknownRecord.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/ResourceRecord.html](https://doc.akka.io/api/akka-core/2.10.17/akka/io/dns/ResourceRecord.html)*