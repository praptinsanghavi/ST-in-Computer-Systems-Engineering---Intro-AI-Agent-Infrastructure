---
description: Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling.Unmarshaller
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller$.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling.Unmarshaller
---

# Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling.Unmarshaller

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling.Unmarshaller

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[unmarshalling](index.html)
- [StringUnmarshaller](StringUnmarshaller$.html)
- [StringUnmarshallers](StringUnmarshallers.html)
- [Unmarshaller](Unmarshaller.html "An unmarshaller transforms values of type A into type B.")
- [UnmarshallerBase](UnmarshallerBase.html)
- [Unmarshallers](Unmarshallers.html)
[o](Unmarshaller.html "See companion class")[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[unmarshalling](index.html)

# [Unmarshaller](Unmarshaller.html "See companion class")[**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html "Permalink")

### Companion [class Unmarshaller](Unmarshaller.html "See companion class")

#### object Unmarshaller extends [Unmarshallers](Unmarshallers.html)

Source[Unmarshaller.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/unmarshalling/Unmarshaller.scala#L28)Linear Supertypes[Unmarshallers](Unmarshallers.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Unmarshaller
2. Unmarshallers
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#async[A,B](f:java.util.function.Function[A,java.util.concurrent.CompletionStage[B]]):akka.http.javadsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def async\[A, B](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[A, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]]): [Unmarshaller](Unmarshaller.html)\[A, B]Creates an unmarshaller from an asynchronous Java function.

Creates an unmarshaller from an asynchronous Java function.

Definition ClassesUnmarshaller → [Unmarshallers](Unmarshallers.html)
6. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#entityToByteArray:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,Array[Byte]] "Permalink")  def entityToByteArray: [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]
8. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#entityToByteString:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,akka.util.ByteString] "Permalink")  def entityToByteString: [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]
9. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#entityToCharArray:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,Array[Char]] "Permalink")  def entityToCharArray: [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]]
10. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#entityToMultipartByteRangesUnmarshaller:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,akka.http.javadsl.model.Multipart.ByteRanges] "Permalink")  def entityToMultipartByteRangesUnmarshaller: [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), ByteRanges]
11. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#entityToMultipartFormData:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,akka.http.javadsl.model.Multipart.FormData] "Permalink")  def entityToMultipartFormData: [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), FormData]
12. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#entityToString:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,String] "Permalink")  def entityToString: [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), String]
13. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#entityToWwwUrlEncodedFormData:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,akka.http.javadsl.model.FormData] "Permalink")  def entityToWwwUrlEncodedFormData: [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), [FormData](../model/FormData.html)]
14. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#firstOf[A,B](u1:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u2:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u3:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u4:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u5:akka.http.javadsl.unmarshalling.Unmarshaller[A,B]):akka.http.javadsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def firstOf\[A, B](u1: [Unmarshaller](Unmarshaller.html)\[A, B], u2: [Unmarshaller](Unmarshaller.html)\[A, B], u3: [Unmarshaller](Unmarshaller.html)\[A, B], u4: [Unmarshaller](Unmarshaller.html)\[A, B], u5: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, B]Definition ClassesUnmarshaller → [Unmarshallers](Unmarshallers.html)
17. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#firstOf[A,B](u1:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u2:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u3:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u4:akka.http.javadsl.unmarshalling.Unmarshaller[A,B]):akka.http.javadsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def firstOf\[A, B](u1: [Unmarshaller](Unmarshaller.html)\[A, B], u2: [Unmarshaller](Unmarshaller.html)\[A, B], u3: [Unmarshaller](Unmarshaller.html)\[A, B], u4: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, B]Definition ClassesUnmarshaller → [Unmarshallers](Unmarshallers.html)
18. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#firstOf[A,B](u1:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u2:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u3:akka.http.javadsl.unmarshalling.Unmarshaller[A,B]):akka.http.javadsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def firstOf\[A, B](u1: [Unmarshaller](Unmarshaller.html)\[A, B], u2: [Unmarshaller](Unmarshaller.html)\[A, B], u3: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, B]Definition ClassesUnmarshaller → [Unmarshallers](Unmarshallers.html)
19. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#firstOf[A,B](u1:akka.http.javadsl.unmarshalling.Unmarshaller[A,B],u2:akka.http.javadsl.unmarshalling.Unmarshaller[A,B]):akka.http.javadsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def firstOf\[A, B](u1: [Unmarshaller](Unmarshaller.html)\[A, B], u2: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, B]Definition ClassesUnmarshaller → [Unmarshallers](Unmarshallers.html)
20. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#forMediaType[B](t:akka.http.javadsl.model.MediaType,um:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,B]):akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,B] "Permalink")  def forMediaType\[B](t: [MediaType](../model/MediaType.html), um: [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), B]): [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), B]
21. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#forMediaTypes[B](types:Iterable[akka.http.javadsl.model.MediaType],um:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,B]):akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpEntity,B] "Permalink")  def forMediaTypes\[B](types: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[MediaType](../model/MediaType.html)], um: [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), B]): [Unmarshaller](Unmarshaller.html)\[[HttpEntity](../model/HttpEntity.html), B]
22. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#fromScala[A,B](scalaUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.javadsl.unmarshalling.Unmarshaller[A,B] "Permalink") implicit  def fromScala\[A, B](scalaUnmarshaller: [scaladsl.unmarshalling.Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, B]
23. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#requestToEntity:akka.http.javadsl.unmarshalling.Unmarshaller[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.RequestEntity] "Permalink")  val requestToEntity: [Unmarshaller](Unmarshaller.html)\[[HttpRequest](../model/HttpRequest.html), [RequestEntity](../model/RequestEntity.html)]
30. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#sync[A,B](f:java.util.function.Function[A,B]):akka.http.javadsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def sync\[A, B](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, B]Creates an unmarshaller from a Java function.

Creates an unmarshaller from a Java function.

Definition ClassesUnmarshaller → [Unmarshallers](Unmarshallers.html)
31. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
33. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Unmarshallers](Unmarshallers.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/StringUnmarshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/StringUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/UnmarshallerBase.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller$.html)*