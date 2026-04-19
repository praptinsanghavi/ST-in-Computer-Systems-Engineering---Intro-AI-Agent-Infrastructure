---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.FormData
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$FormData$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.FormData
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.FormData

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.FormData

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Multipart$.html "Permalink")  object [Multipart](Multipart$.html)Definition Classes[model](index.html)
- [BodyPart](Multipart$$BodyPart.html "The general model for a single part of a multipart message.")
- [ByteRanges](Multipart$$ByteRanges.html "Model for multipart/byteranges content as defined by https://tools.ietf.org/html/rfc7233#section-5.4.1 and https://tools.ietf.org/html/rfc7233#appendix-A")
- [FormData](Multipart$$FormData.html "Model for multipart/form-data content as defined in http://tools.ietf.org/html/rfc2388.")
- [General](Multipart$$General.html "Basic model for general multipart content as defined by http://tools.ietf.org/html/rfc2046.")
- [Strict](Multipart$$Strict.html "A type of multipart content for which all parts have already been loaded into memory and are therefore allow random access.")
[o](Multipart$$FormData.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Multipart](Multipart$.html)

# [FormData](Multipart$$FormData.html "See companion class")[**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html "Permalink")

### Companion [class FormData](Multipart$$FormData.html "See companion class")

#### object FormData

Source[Multipart.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Multipart.scala#L345)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FormData
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$$BodyPart.html "Permalink") sealed abstract  class [BodyPart](Multipart$$FormData$$BodyPart.html "Body part of the FormData model.") extends [Multipart.BodyPart](Multipart$$BodyPart.html) with javadsl.model.Multipart.FormData.BodyPartBody part of the [FormData](Multipart$$FormData.html) model.
2. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$$Strict.html "Permalink")  case class [Strict](Multipart$$FormData$$Strict.html "Strict FormData.")(strictParts: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[BodyPart.Strict](Multipart$$FormData$$BodyPart$$Strict.html)]) extends [FormData](Multipart$$FormData.html) with [Multipart.Strict](Multipart$$Strict.html) with javadsl.model.Multipart.FormData.Strict with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStrict [FormData](Multipart$$FormData.html).
### Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#apply(_parts:akka.stream.scaladsl.Source[akka.http.scaladsl.model.Multipart.FormData.BodyPart,Any]):akka.http.scaladsl.model.Multipart.FormData "Permalink")  def apply(\_parts: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[BodyPart](Multipart$$FormData$$BodyPart.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [FormData](Multipart$$FormData.html)
5. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#apply(fields:Map[String,akka.http.scaladsl.model.HttpEntity.Strict]):akka.http.scaladsl.model.Multipart.FormData.Strict "Permalink")  def apply(fields: Map\[String, [HttpEntity.Strict](HttpEntity$$Strict.html)]): [Strict](Multipart$$FormData$$Strict.html)
6. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#apply(parts:akka.http.scaladsl.model.Multipart.FormData.BodyPart*):akka.http.scaladsl.model.Multipart.FormData "Permalink")  def apply(parts: [BodyPart](Multipart$$FormData$$BodyPart.html)\*): [FormData](Multipart$$FormData.html)
7. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#apply(parts:akka.http.scaladsl.model.Multipart.FormData.BodyPart.Strict*):akka.http.scaladsl.model.Multipart.FormData.Strict "Permalink")  def apply(parts: [FormData.BodyPart.Strict](Multipart$$FormData$$BodyPart$$Strict.html)\*): [Strict](Multipart$$FormData$$Strict.html)
8. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#fromFile(name:String,contentType:akka.http.scaladsl.model.ContentType,file:java.io.File,chunkSize:Int):akka.http.scaladsl.model.Multipart.FormData "Permalink")  def fromFile(name: String, contentType: [ContentType](ContentType.html), file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), chunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= \-1): [FormData](Multipart$$FormData.html)Creates a FormData instance that contains a single part backed by the given file.

Creates a FormData instance that contains a single part backed by the given file.

To create an instance with several parts or for multiple files, use
`FormData(BodyPart.fromFile("field1", ...), BodyPart.fromFile("field2", ...)`
13. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#fromPath(name:String,contentType:akka.http.scaladsl.model.ContentType,file:java.nio.file.Path,chunkSize:Int):akka.http.scaladsl.model.Multipart.FormData "Permalink")  def fromPath(name: String, contentType: [ContentType](ContentType.html), file: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), chunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= \-1): [FormData](Multipart$$FormData.html)Creates a FormData instance that contains a single part backed by the given file.

Creates a FormData instance that contains a single part backed by the given file.

To create an instance with several parts or for multiple files, use
`FormData(BodyPart.fromPath("field1", ...), BodyPart.fromPath("field2", ...)`
14. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$$BodyPart$.html "Permalink")  object [BodyPart](Multipart$$FormData$$BodyPart$.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$ByteRanges$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$ByteRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$$BodyPart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$$BodyPart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$.html)*