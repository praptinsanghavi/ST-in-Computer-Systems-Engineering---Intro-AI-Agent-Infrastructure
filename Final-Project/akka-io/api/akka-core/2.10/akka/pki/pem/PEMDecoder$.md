---
description: Akka 2.10.17 - akka.pki.pem.PEMDecoder
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:16:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pki/pem/PEMDecoder$.html
title: Akka 2.10.17 - akka.pki.pem.PEMDecoder
---

# Akka 2.10.17 - akka.pki.pem.PEMDecoder

> **Summary:** Akka 2.10.17 - akka.pki.pem.PEMDecoder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/pki/index.html "Permalink")  package [pki](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/pki/pem/index.html "Permalink")  package [pem](index.html)Definition Classes[pki](../index.html)
- [DERPrivateKeyLoader](DERPrivateKeyLoader$.html)
- PEMDecoder
- [PEMLoadingException](PEMLoadingException.html)
o[akka](../../index.html).[pki](../index.html).[pem](index.html)

# PEMDecoder[**](../../../akka/pki/pem/PEMDecoder$.html "Permalink")

### 

#### object PEMDecoder

Decodes lax PEM encoded data, according to

https://tools.ietf.org/html/rfc7468

Source[PEMDecoder.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-pki/src/main/scala/akka/pki/pem/PEMDecoder.scala#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PEMDecoder
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/pki/pem/PEMDecoder$$DERData.html "Permalink") final  class [DERData](PEMDecoder$$DERData.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)()
### Value Members

1. [**](../../../akka/pki/pem/PEMDecoder$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/pki/pem/PEMDecoder$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/pki/pem/PEMDecoder$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/pki/pem/PEMDecoder$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/pki/pem/PEMDecoder$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/pki/pem/PEMDecoder$.html#decode(pemData:String):akka.pki.pem.PEMDecoder.DERData "Permalink")  def decode(pemData: String): [DERData](PEMDecoder$$DERData.html)Decodes the first entry in a PEM String into an identifier and the
DER bytes of the content.

Decodes the first entry in a PEM String into an identifier and the
DER bytes of the content.

Note that for EDCSA and possibly other key types a pem string will contain multiple entries,
see [decodeAll](#decodeAll(pemData:String):Seq[akka.pki.pem.PEMDecoder.DERData]) or [getAllDecoded](#getAllDecoded(pemData:String):java.util.List[akka.pki.pem.PEMDecoder.DERData]) for extracting all entries.

See https://tools.ietf.org/html/rfc7468 and https://en.wikipedia.org/wiki/Privacy\-Enhanced\_Mail

pemDatathe PEM data (pre\-eb, base64\-MIME data and ponst\-eb)

returnsthe decoded bytes and the content type.

Annotations@throws("If the \`pemData\` is not valid PEM format (according to https://tools.ietf.org/html/rfc7468\).") @[ApiMayChange](../../annotation/ApiMayChange.html)()
7. [**](../../../akka/pki/pem/PEMDecoder$.html#decodeAll(pemData:String):Seq[akka.pki.pem.PEMDecoder.DERData] "Permalink")  def decodeAll(pemData: String): Seq\[[DERData](PEMDecoder$$DERData.html)]Scala API: Decodes all entries in a PEM String.

Scala API: Decodes all entries in a PEM String.

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)()
8. [**](../../../akka/pki/pem/PEMDecoder$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/pki/pem/PEMDecoder$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/pki/pem/PEMDecoder$.html#getAllDecoded(pemData:String):java.util.List[akka.pki.pem.PEMDecoder.DERData] "Permalink")  def getAllDecoded(pemData: String): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[DERData](PEMDecoder$$DERData.html)]Java API: Decodes all entries in a PEM String.

Java API: Decodes all entries in a PEM String.

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)() @throws("If the \`pemData\` is not valid PEM format (according to https://tools.ietf.org/html/rfc7468\).")
11. [**](../../../akka/pki/pem/PEMDecoder$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/pki/pem/PEMDecoder$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/pki/pem/PEMDecoder$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/pki/pem/PEMDecoder$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/pki/pem/PEMDecoder$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/pki/pem/PEMDecoder$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/pki/pem/PEMDecoder$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/pki/pem/PEMDecoder$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/pki/pem/PEMDecoder$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/pki/pem/PEMDecoder$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../akka/pki/pem/PEMDecoder$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/pki/pem/PEMDecoder$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pki/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pki/pem/DERPrivateKeyLoader$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pki/pem/PEMDecoder$$DERData.html
- https://doc.akka.io/api/akka-core/2.10/akka/pki/pem/PEMDecoder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pki/pem/PEMLoadingException.html
- https://doc.akka.io/api/akka-core/2.10/akka/pki/pem/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/pki/pem/PEMDecoder$.html](https://doc.akka.io/api/akka-core/2.10/akka/pki/pem/PEMDecoder$.html)*