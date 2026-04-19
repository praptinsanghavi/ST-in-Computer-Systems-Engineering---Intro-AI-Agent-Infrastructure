---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[unmarshalling](index.html)
- [GenericUnmarshallers](GenericUnmarshallers.html)
- [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
- [MultipartUnmarshallers](MultipartUnmarshallers.html "Provides akka.http.scaladsl.model.Multipart marshallers.")
- [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
- [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
- [Unmarshal](Unmarshal.html)
- [Unmarshaller](Unmarshaller.html)
[o](Unmarshaller.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[unmarshalling](index.html)

# [Unmarshaller](Unmarshaller.html "See companion trait")[**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html "Permalink")

### Companion [trait Unmarshaller](Unmarshaller.html "See companion trait")

#### object Unmarshaller extends [GenericUnmarshallers](GenericUnmarshallers.html) with [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html) with [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)

Source[Unmarshaller.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/Unmarshaller.scala#L41)Linear Supertypes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html), [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html), [MultipartUnmarshallers](MultipartUnmarshallers.html), [GenericUnmarshallers](GenericUnmarshallers.html), [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Unmarshaller
2. PredefinedFromStringUnmarshallers
3. PredefinedFromEntityUnmarshallers
4. MultipartUnmarshallers
5. GenericUnmarshallers
6. LowerPriorityGenericUnmarshallers
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EitherUnmarshallingException.html "Permalink") final  case class [EitherUnmarshallingException](Unmarshaller$$EitherUnmarshallingException.html "Order of parameters (right first, left second) is intentional, since that's the order we evaluate them in.")(rightClass: Class\[\_], right: Throwable, leftClass: Class\[\_], left: Throwable) extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableOrder of parameters (`right` first, `left` second) is intentional, since that's the order we evaluate them in.
2. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html "Permalink") implicit final  class [EnhancedFromEntityUnmarshaller](Unmarshaller$$EnhancedFromEntityUnmarshaller.html)\[A] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
3. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html "Permalink") implicit final  class [EnhancedUnmarshaller](Unmarshaller$$EnhancedUnmarshaller.html)\[A, B] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
4. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$UnsupportedContentTypeException.html "Permalink") final  class [UnsupportedContentTypeException](Unmarshaller$$UnsupportedContentTypeException.html "Signals that unmarshalling failed because the entity content-type did not match one of the supported ranges.") extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSignals that unmarshalling failed because the entity content\-type did not match one of the supported ranges.

Signals that unmarshalling failed because the entity content\-type did not match one of the supported ranges.
This error cannot be thrown by custom code, you need to use the `forContentTypes` modifier on a base
[akka.http.scaladsl.unmarshalling.Unmarshaller](Unmarshaller.html) instead.
### Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#CsvSeq[T](implicitunmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,T]):akka.http.scaladsl.unmarshalling.Unmarshaller[String,Seq[T]] "Permalink") implicit  def CsvSeq\[T](implicit unmarshaller: [Unmarshaller](Unmarshaller.html)\[String, T]): [Unmarshaller](Unmarshaller.html)\[String, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
5. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#HexByte:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Byte] "Permalink")  val HexByte: [Unmarshaller](Unmarshaller.html)\[String, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
6. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#HexInt:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Int] "Permalink")  val HexInt: [Unmarshaller](Unmarshaller.html)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
7. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#HexLong:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Long] "Permalink")  val HexLong: [Unmarshaller](Unmarshaller.html)\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
8. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#HexShort:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Short] "Permalink")  val HexShort: [Unmarshaller](Unmarshaller.html)\[String, [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
9. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#_fromStringUnmarshallerFromByteStringUnmarshaller[T](implicitbsum:akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[T]):akka.http.scaladsl.unmarshalling.Unmarshaller[String,T] "Permalink") implicit  def \_fromStringUnmarshallerFromByteStringUnmarshaller\[T](implicit bsum: [FromByteStringUnmarshaller](index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[T]): [Unmarshaller](Unmarshaller.html)\[String, T]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
10. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#apply[A,B](f:scala.concurrent.ExecutionContext=>(A=>scala.concurrent.Future[B])):akka.http.scaladsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def apply\[A, B](f: ([ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) \=\> (A) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]): [Unmarshaller](Unmarshaller.html)\[A, B]Creates an `Unmarshaller` from the given function.
11. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#bestUnmarshallingCharsetFor(entity:akka.http.scaladsl.model.HttpEntity):akka.http.scaladsl.model.HttpCharset "Permalink")  def bestUnmarshallingCharsetFor(entity: [HttpEntity](../model/HttpEntity.html)): [HttpCharset](../model/HttpCharset.html)Returns the best charset for unmarshalling the given entity to a character\-based representation.

Returns the best charset for unmarshalling the given entity to a character\-based representation.
Falls back to UTF\-8 if no better alternative can be determined.
13. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#booleanFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Boolean] "Permalink") implicit  val booleanFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
14. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#byteArrayUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[Array[Byte]] "Permalink") implicit  def byteArrayUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]Definition Classes[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
15. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#byteFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Byte] "Permalink") implicit  val byteFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
16. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#byteStringUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.util.ByteString] "Permalink") implicit  def byteStringUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]Definition Classes[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
17. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#charArrayUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[Array[Char]] "Permalink") implicit  def charArrayUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]]Definition Classes[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
18. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#defaultMultipartByteRangesUnmarshaller(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.ByteRanges] "Permalink") implicit  def defaultMultipartByteRangesUnmarshaller(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[ByteRanges](../model/Multipart$$ByteRanges.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
20. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#defaultMultipartGeneralUnmarshaller(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.General] "Permalink") implicit  def defaultMultipartGeneralUnmarshaller(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[General](../model/Multipart$$General.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
21. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#defaultUrlEncodedFormDataUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.FormData] "Permalink") implicit  def defaultUrlEncodedFormDataUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[FormData](../model/FormData.html)]Definition Classes[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
22. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#doubleFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Double] "Permalink") implicit  val doubleFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
23. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#eitherUnmarshaller[L,R](implicitua:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[L],implicitrightTag:scala.reflect.ClassTag[R],implicitub:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[R],implicitleftTag:scala.reflect.ClassTag[L]):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[Either[L,R]] "Permalink") implicit  def eitherUnmarshaller\[L, R](implicit ua: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[L], rightTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[R], ub: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[R], leftTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[L]): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[Either\[L, R]]Enables using Either to encode the following unmarshalling logic:
Attempt unmarshalling the entity as as `R` first (yielding `R`),
and if it fails attempt unmarshalling as `L` (yielding `Left`).

Enables using Either to encode the following unmarshalling logic:
Attempt unmarshalling the entity as as `R` first (yielding `R`),
and if it fails attempt unmarshalling as `L` (yielding `Left`).

The either unmarshaller only works with strict entities, so make sure to wrap routes that want to use it with
`toStrictEntity`. Otherwise, if a non\-strict entity is provided, it will fail with an `IllegalArgumentException`.

Note that the Either's "R" type will be attempted first (as Left is often considered as the "failed case" in Either).

Definition Classes[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
24. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
26. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#firstOf[A,B](unmarshallers:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]*):akka.http.scaladsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def firstOf\[A, B](unmarshallers: [Unmarshaller](Unmarshaller.html)\[A, B]\*): [Unmarshaller](Unmarshaller.html)\[A, B]Helper for creating a "super\-unmarshaller" from a sequence of "sub\-unmarshallers", which are tried
in the given order.

Helper for creating a "super\-unmarshaller" from a sequence of "sub\-unmarshallers", which are tried
in the given order. The first successful unmarshalling of a "sub\-unmarshallers" is the one produced by the
"super\-unmarshaller".
27. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#floatFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Float] "Permalink") implicit  val floatFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
28. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#identityUnmarshaller[T]:akka.http.scaladsl.unmarshalling.Unmarshaller[T,T] "Permalink") implicit  def identityUnmarshaller\[T]: [Unmarshaller](Unmarshaller.html)\[T, T]
31. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#intFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Int] "Permalink") implicit  val intFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
32. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
33. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#liftToSourceOptionUnmarshaller[A,B](um:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.scaladsl.unmarshalling.Unmarshaller[Option[A],B] "Permalink") implicit  def liftToSourceOptionUnmarshaller\[A, B](um: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A], B]Definition Classes[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
34. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#liftToTargetOptionUnmarshaller[A,B](um:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.scaladsl.unmarshalling.Unmarshaller[A,Option[B]] "Permalink") implicit  def liftToTargetOptionUnmarshaller\[A, B](um: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]]Definition Classes[GenericUnmarshallers](GenericUnmarshallers.html)
35. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#longFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Long] "Permalink") implicit  val longFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
36. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#messageUnmarshallerFromEntityUnmarshaller[T](implicitum:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T]):akka.http.scaladsl.unmarshalling.FromMessageUnmarshaller[T] "Permalink") implicit  def messageUnmarshallerFromEntityUnmarshaller\[T](implicit um: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T]): [FromMessageUnmarshaller](index.html#FromMessageUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpMessage,T])\[T]Definition Classes[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
37. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#multipartByteRangesUnmarshaller(defaultCharset:akka.http.scaladsl.model.HttpCharset)(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.ByteRanges] "Permalink")  def multipartByteRangesUnmarshaller(defaultCharset: [HttpCharset](../model/HttpCharset.html))(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[ByteRanges](../model/Multipart$$ByteRanges.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
38. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#multipartFormDataUnmarshaller(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.FormData] "Permalink") implicit  def multipartFormDataUnmarshaller(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[FormData](../model/Multipart$$FormData.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
39. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#multipartGeneralUnmarshaller(defaultCharset:akka.http.scaladsl.model.HttpCharset)(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.General] "Permalink")  def multipartGeneralUnmarshaller(defaultCharset: [HttpCharset](../model/HttpCharset.html))(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[General](../model/Multipart$$General.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
40. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#multipartUnmarshaller[T<:akka.http.scaladsl.model.Multipart,BP<:akka.http.scaladsl.model.Multipart.BodyPart,BPS<:akka.http.scaladsl.model.Multipart.BodyPart.Strict](mediaRange:akka.http.scaladsl.model.MediaRange,defaultContentType:akka.http.scaladsl.model.ContentType,createBodyPart:(akka.http.scaladsl.model.BodyPartEntity,List[akka.http.scaladsl.model.HttpHeader])=>BP,createStreamed:(akka.http.scaladsl.model.MediaType.Multipart,akka.stream.scaladsl.Source[BP,Any])=>T,createStrictBodyPart:(akka.http.scaladsl.model.HttpEntity.Strict,List[akka.http.scaladsl.model.HttpHeader])=>BPS,createStrict:(akka.http.scaladsl.model.MediaType.Multipart,Seq[BPS])=>T)(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T] "Permalink")  def multipartUnmarshaller\[T \<: [Multipart](../model/Multipart.html), BP \<: [BodyPart](../model/Multipart$$BodyPart.html), BPS \<: [Strict](../model/Multipart$$BodyPart$$Strict.html)](mediaRange: [MediaRange](../model/MediaRange.html), defaultContentType: [ContentType](../model/ContentType.html), createBodyPart: ([BodyPartEntity](../model/BodyPartEntity.html), List\[[HttpHeader](../model/HttpHeader.html)]) \=\> BP, createStreamed: ([Multipart](../model/MediaType$$Multipart.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[BP, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) \=\> T, createStrictBodyPart: ([Strict](../model/HttpEntity$$Strict.html), List\[[HttpHeader](../model/HttpHeader.html)]) \=\> BPS, createStrict: ([Multipart](../model/MediaType$$Multipart.html), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[BPS]) \=\> T)(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
41. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
42. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
43. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
44. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#shortFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,Short] "Permalink") implicit  val shortFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
45. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#sourceOptionUnmarshaller[A,B](implicitum:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.scaladsl.unmarshalling.Unmarshaller[Option[A],B] "Permalink") implicit  def sourceOptionUnmarshaller\[A, B](implicit um: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A], B]Definition Classes[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
46. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#strict[A,B](f:A=>B):akka.http.scaladsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def strict\[A, B](f: (A) \=\> B): [Unmarshaller](Unmarshaller.html)\[A, B]Helper for creating a synchronous `Unmarshaller` from the given function.
47. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#stringUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[String] "Permalink") implicit  def stringUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[String]Definition Classes[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
48. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
49. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#targetOptionUnmarshaller[A,B](implicitum:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.scaladsl.unmarshalling.Unmarshaller[A,Option[B]] "Permalink") implicit  def targetOptionUnmarshaller\[A, B](implicit um: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]]Definition Classes[GenericUnmarshallers](GenericUnmarshallers.html)
50. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
51. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#urlEncodedFormDataUnmarshaller(ranges:akka.http.scaladsl.model.ContentTypeRange*):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.FormData] "Permalink")  def urlEncodedFormDataUnmarshaller(ranges: [ContentTypeRange](../model/ContentTypeRange.html)\*): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[FormData](../model/FormData.html)]Definition Classes[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
52. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#uuidFromStringUnmarshaller:akka.http.scaladsl.unmarshalling.Unmarshaller[String,java.util.UUID] "Permalink") implicit  val uuidFromStringUnmarshaller: [Unmarshaller](Unmarshaller.html)\[String, [UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)]Definition Classes[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
53. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
54. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
55. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
56. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#withMaterializer[A,B](f:scala.concurrent.ExecutionContext=>(akka.stream.Materializer=>(A=>scala.concurrent.Future[B]))):akka.http.scaladsl.unmarshalling.Unmarshaller[A,B] "Permalink")  def withMaterializer\[A, B](f: ([ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) \=\> ([Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)) \=\> (A) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]): [Unmarshaller](Unmarshaller.html)\[A, B]
57. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$NoContentException$.html "Permalink")  case object [NoContentException](Unmarshaller$$NoContentException$.html "Signals that unmarshalling failed because the entity was unexpectedly empty.") extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSignals that unmarshalling failed because the entity was unexpectedly empty.
58. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$UnsupportedContentTypeException$.html "Permalink")  object [UnsupportedContentTypeException](Unmarshaller$$UnsupportedContentTypeException$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)

### Inherited from [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)

### Inherited from [MultipartUnmarshallers](MultipartUnmarshallers.html)

### Inherited from [GenericUnmarshallers](GenericUnmarshallers.html)

### Inherited from [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$ByteRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshal$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshal.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EitherUnmarshallingException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$NoContentException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$UnsupportedContentTypeException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$UnsupportedContentTypeException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$.html)*