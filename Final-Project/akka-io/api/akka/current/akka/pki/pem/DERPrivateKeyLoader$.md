---
description: Akka 2.10.17 - akka.pki.pem.DERPrivateKeyLoader
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:36:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pki/pem/DERPrivateKeyLoader$.html
title: Akka 2.10.17 - akka.pki.pem.DERPrivateKeyLoader
---

# Akka 2.10.17 - akka.pki.pem.DERPrivateKeyLoader

> **Summary:** Akka 2.10.17 - akka.pki.pem.DERPrivateKeyLoader

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/pki/index.html "Permalink")  package [pki](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/pki/pem/index.html "Permalink")  package [pem](index.html)Definition Classes[pki](../index.html)
- DERPrivateKeyLoader
- [PEMDecoder](PEMDecoder$.html "Decodes lax PEM encoded data, according to")
- [PEMLoadingException](PEMLoadingException.html)
o[akka](../../index.html).[pki](../index.html).[pem](index.html)

# DERPrivateKeyLoader[**](../../../akka/pki/pem/DERPrivateKeyLoader$.html "Permalink")

### 

#### object DERPrivateKeyLoader

Source[DERPrivateKeyLoader.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-pki/src/main/scala/akka/pki/pem/DERPrivateKeyLoader.scala#L33)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DERPrivateKeyLoader
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#load(derData:akka.pki.pem.PEMDecoder.DERData):java.security.PrivateKey "Permalink")  def load(derData: [DERData](PEMDecoder$$DERData.html)): [PrivateKey](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/PrivateKey.html#java.security.PrivateKey)Converts the DER payload in [PEMDecoder.DERData](PEMDecoder$$DERData.html) into a [java.security.PrivateKey](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/PrivateKey.html).

Converts the DER payload in [PEMDecoder.DERData](PEMDecoder$$DERData.html) into a [java.security.PrivateKey](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/PrivateKey.html). The received DER
data must be a valid PKCS\#1 PKCS\#1 (identified in PEM as "RSA PRIVATE KEY") or non\-encrypted PKCS\#8 (identified
\* in PEM as "PRIVATE KEY" or "EC PRIVATE KEY").

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)() @throws("when the \`derData\` is for an unsupported format") Exceptions thrown[`PEMLoadingException`](PEMLoadingException.html) when the `derData` is for an unsupported format
12. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#load(derData:Seq[akka.pki.pem.PEMDecoder.DERData]):java.security.PrivateKey "Permalink")  def load(derData: Seq\[[DERData](PEMDecoder$$DERData.html)]): [PrivateKey](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/PrivateKey.html#java.security.PrivateKey)Scala API: Converts the DER payload in the first private key entry in the given [PEMDecoder.DERData](PEMDecoder$$DERData.html) into a [java.security.PrivateKey](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/PrivateKey.html).

Scala API: Converts the DER payload in the first private key entry in the given [PEMDecoder.DERData](PEMDecoder$$DERData.html) into a [java.security.PrivateKey](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/PrivateKey.html).
The received DER data must be a valid PKCS\#1 (identified in PEM as "RSA PRIVATE KEY") or non\-encrypted PKCS\#8 (identified
in PEM as "PRIVATE KEY" or "EC PRIVATE KEY").

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)() @throws("when the \`derData\` is for an unsupported format") Exceptions thrown[`PEMLoadingException`](PEMLoadingException.html) when the no entry in `derData` is a supported format
13. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#load(derData:java.util.List[akka.pki.pem.PEMDecoder.DERData]):java.security.PrivateKey "Permalink")  def load(derData: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[DERData](PEMDecoder$$DERData.html)]): [PrivateKey](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/PrivateKey.html#java.security.PrivateKey)Java API: Converts the DER payload in the first private key entry in the given [PEMDecoder.DERData](PEMDecoder$$DERData.html) into a [java.security.PrivateKey](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/PrivateKey.html).

Java API: Converts the DER payload in the first private key entry in the given [PEMDecoder.DERData](PEMDecoder$$DERData.html) into a [java.security.PrivateKey](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/PrivateKey.html).
The received DER data must be a valid PKCS\#1 (identified in PEM as "RSA PRIVATE KEY") or non\-encrypted PKCS\#8 (identified
in PEM as "PRIVATE KEY" or "EC PRIVATE KEY").

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)() @throws("when the \`derData\` is for an unsupported format") Exceptions thrown[`PEMLoadingException`](PEMLoadingException.html) when the no entry in `derData` is a supported format
14. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/pki/pem/DERPrivateKeyLoader$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/pki/index.html
- https://doc.akka.io/api/akka/current/akka/pki/pem/DERPrivateKeyLoader$.html
- https://doc.akka.io/api/akka/current/akka/pki/pem/PEMDecoder$$DERData.html
- https://doc.akka.io/api/akka/current/akka/pki/pem/PEMDecoder$.html
- https://doc.akka.io/api/akka/current/akka/pki/pem/PEMLoadingException.html
- https://doc.akka.io/api/akka/current/akka/pki/pem/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/pki/pem/DERPrivateKeyLoader$.html](https://doc.akka.io/api/akka/current/akka/pki/pem/DERPrivateKeyLoader$.html)*