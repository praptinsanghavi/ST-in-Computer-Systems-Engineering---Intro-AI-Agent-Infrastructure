---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.PredefinedFromEntityUnmarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:11:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.PredefinedFromEntityUnmarshallers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.PredefinedFromEntityUnmarshallers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.PredefinedFromEntityUnmarshallers

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
- PredefinedFromEntityUnmarshallers
- [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
- [Unmarshal](Unmarshal.html)
- [Unmarshaller](Unmarshaller.html)
[t](PredefinedFromEntityUnmarshallers$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[unmarshalling](index.html)

# [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers$.html "See companion object")[**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html "Permalink")

### Companion [object PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers$.html "See companion object")

#### trait PredefinedFromEntityUnmarshallers extends [MultipartUnmarshallers](MultipartUnmarshallers.html)

Source[PredefinedFromEntityUnmarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.scala#L11)Linear Supertypes[MultipartUnmarshallers](MultipartUnmarshallers.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers$.html), [Unmarshaller](Unmarshaller$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PredefinedFromEntityUnmarshallers
2. MultipartUnmarshallers
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

1. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PredefinedFromEntityUnmarshallers toany2stringadd\[PredefinedFromEntityUnmarshallers] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PredefinedFromEntityUnmarshallers, B)ImplicitThis member is added by an implicit conversion from PredefinedFromEntityUnmarshallers toArrowAssoc\[PredefinedFromEntityUnmarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#byteArrayUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[Array[Byte]] "Permalink") implicit  def byteArrayUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)]]
8. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#byteStringUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.util.ByteString] "Permalink") implicit  def byteStringUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]
9. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#charArrayUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[Array[Char]] "Permalink") implicit  def charArrayUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]]
10. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#defaultMultipartByteRangesUnmarshaller(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.ByteRanges] "Permalink") implicit  def defaultMultipartByteRangesUnmarshaller(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[ByteRanges](../model/Multipart$$ByteRanges.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
12. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#defaultMultipartGeneralUnmarshaller(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.General] "Permalink") implicit  def defaultMultipartGeneralUnmarshaller(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[General](../model/Multipart$$General.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
13. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#defaultUrlEncodedFormDataUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.FormData] "Permalink") implicit  def defaultUrlEncodedFormDataUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[FormData](../model/FormData.html)]
14. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PredefinedFromEntityUnmarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PredefinedFromEntityUnmarshallersImplicitThis member is added by an implicit conversion from PredefinedFromEntityUnmarshallers toEnsuring\[PredefinedFromEntityUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PredefinedFromEntityUnmarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PredefinedFromEntityUnmarshallersImplicitThis member is added by an implicit conversion from PredefinedFromEntityUnmarshallers toEnsuring\[PredefinedFromEntityUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PredefinedFromEntityUnmarshallersImplicitThis member is added by an implicit conversion from PredefinedFromEntityUnmarshallers toEnsuring\[PredefinedFromEntityUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PredefinedFromEntityUnmarshallersImplicitThis member is added by an implicit conversion from PredefinedFromEntityUnmarshallers toEnsuring\[PredefinedFromEntityUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#multipartByteRangesUnmarshaller(defaultCharset:akka.http.scaladsl.model.HttpCharset)(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.ByteRanges] "Permalink")  def multipartByteRangesUnmarshaller(defaultCharset: [HttpCharset](../model/HttpCharset.html))(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[ByteRanges](../model/Multipart$$ByteRanges.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
24. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#multipartFormDataUnmarshaller(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.FormData] "Permalink") implicit  def multipartFormDataUnmarshaller(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[FormData](../model/Multipart$$FormData.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
25. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#multipartGeneralUnmarshaller(defaultCharset:akka.http.scaladsl.model.HttpCharset)(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.General] "Permalink")  def multipartGeneralUnmarshaller(defaultCharset: [HttpCharset](../model/HttpCharset.html))(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[General](../model/Multipart$$General.html)]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
26. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#multipartUnmarshaller[T<:akka.http.scaladsl.model.Multipart,BP<:akka.http.scaladsl.model.Multipart.BodyPart,BPS<:akka.http.scaladsl.model.Multipart.BodyPart.Strict](mediaRange:akka.http.scaladsl.model.MediaRange,defaultContentType:akka.http.scaladsl.model.ContentType,createBodyPart:(akka.http.scaladsl.model.BodyPartEntity,List[akka.http.scaladsl.model.HttpHeader])=>BP,createStreamed:(akka.http.scaladsl.model.MediaType.Multipart,akka.stream.scaladsl.Source[BP,Any])=>T,createStrictBodyPart:(akka.http.scaladsl.model.HttpEntity.Strict,List[akka.http.scaladsl.model.HttpHeader])=>BPS,createStrict:(akka.http.scaladsl.model.MediaType.Multipart,Seq[BPS])=>T)(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T] "Permalink")  def multipartUnmarshaller\[T \<: [Multipart](../model/Multipart.html), BP \<: [BodyPart](../model/Multipart$$BodyPart.html), BPS \<: [Strict](../model/Multipart$$BodyPart$$Strict.html)](mediaRange: [MediaRange](../model/MediaRange.html), defaultContentType: [ContentType](../model/ContentType.html), createBodyPart: ([BodyPartEntity](../model/BodyPartEntity.html), List\[[HttpHeader](../model/HttpHeader.html)]) \=\> BP, createStreamed: ([Multipart](../model/MediaType$$Multipart.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[BP, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) \=\> T, createStrictBodyPart: ([Strict](../model/HttpEntity$$Strict.html), List\[[HttpHeader](../model/HttpHeader.html)]) \=\> BPS, createStrict: ([Multipart](../model/MediaType$$Multipart.html), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[BPS]) \=\> T)(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T]Definition Classes[MultipartUnmarshallers](MultipartUnmarshallers.html)
27. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#stringUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[String] "Permalink") implicit  def stringUnmarshaller: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[String]
31. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
33. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#urlEncodedFormDataUnmarshaller(ranges:akka.http.scaladsl.model.ContentTypeRange*):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.FormData] "Permalink")  def urlEncodedFormDataUnmarshaller(ranges: [ContentTypeRange](../model/ContentTypeRange.html)\*): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[FormData](../model/FormData.html)]
34. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PredefinedFromEntityUnmarshallers toStringFormat\[PredefinedFromEntityUnmarshallers] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PredefinedFromEntityUnmarshallers, B)ImplicitThis member is added by an implicit conversion from PredefinedFromEntityUnmarshallers toArrowAssoc\[PredefinedFromEntityUnmarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [MultipartUnmarshallers](MultipartUnmarshallers.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPredefinedFromEntityUnmarshallers to any2stringadd\[PredefinedFromEntityUnmarshallers]

### Inherited by implicit conversion StringFormat fromPredefinedFromEntityUnmarshallers to StringFormat\[PredefinedFromEntityUnmarshallers]

### Inherited by implicit conversion Ensuring fromPredefinedFromEntityUnmarshallers to Ensuring\[PredefinedFromEntityUnmarshallers]

### Inherited by implicit conversion ArrowAssoc fromPredefinedFromEntityUnmarshallers to ArrowAssoc\[PredefinedFromEntityUnmarshallers]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$BodyPart$$Strict.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$BodyPart.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$ByteRanges.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$FormData.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$General.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html)*