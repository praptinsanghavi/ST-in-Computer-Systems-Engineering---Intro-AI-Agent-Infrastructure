---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.MultipartUnmarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.MultipartUnmarshallers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.MultipartUnmarshallers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.MultipartUnmarshallers

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
- MultipartUnmarshallers
- [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
- [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
- [Unmarshal](Unmarshal.html)
- [Unmarshaller](Unmarshaller.html)
[t](MultipartUnmarshallers$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[unmarshalling](index.html)

# [MultipartUnmarshallers](MultipartUnmarshallers$.html "See companion object")[**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html "Permalink")

### Companion [object MultipartUnmarshallers](MultipartUnmarshallers$.html "See companion object")

#### trait MultipartUnmarshallers extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Provides [akka.http.scaladsl.model.Multipart](../model/Multipart.html) marshallers.
It is possible to configure the default parsing mode by providing an implicit [akka.http.scaladsl.settings.ParserSettings](../settings/ParserSettings.html) instance.

Source[MultipartUnmarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.scala#L26)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[MultipartUnmarshallers](MultipartUnmarshallers$.html), [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html), [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers$.html), [Unmarshaller](Unmarshaller$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MultipartUnmarshallers
2. AnyRef
3. Any
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

1. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MultipartUnmarshallers toany2stringadd\[MultipartUnmarshallers] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MultipartUnmarshallers, B)ImplicitThis member is added by an implicit conversion from MultipartUnmarshallers toArrowAssoc\[MultipartUnmarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#defaultMultipartByteRangesUnmarshaller(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.ByteRanges] "Permalink") implicit  def defaultMultipartByteRangesUnmarshaller(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[ByteRanges](../model/Multipart$$ByteRanges.html)]
9. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#defaultMultipartGeneralUnmarshaller(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.General] "Permalink") implicit  def defaultMultipartGeneralUnmarshaller(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[General](../model/Multipart$$General.html)]
10. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MultipartUnmarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MultipartUnmarshallersImplicitThis member is added by an implicit conversion from MultipartUnmarshallers toEnsuring\[MultipartUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MultipartUnmarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MultipartUnmarshallersImplicitThis member is added by an implicit conversion from MultipartUnmarshallers toEnsuring\[MultipartUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MultipartUnmarshallersImplicitThis member is added by an implicit conversion from MultipartUnmarshallers toEnsuring\[MultipartUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MultipartUnmarshallersImplicitThis member is added by an implicit conversion from MultipartUnmarshallers toEnsuring\[MultipartUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#multipartByteRangesUnmarshaller(defaultCharset:akka.http.scaladsl.model.HttpCharset)(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.ByteRanges] "Permalink")  def multipartByteRangesUnmarshaller(defaultCharset: [HttpCharset](../model/HttpCharset.html))(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[ByteRanges](../model/Multipart$$ByteRanges.html)]
20. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#multipartFormDataUnmarshaller(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.FormData] "Permalink") implicit  def multipartFormDataUnmarshaller(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[FormData](../model/Multipart$$FormData.html)]
21. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#multipartGeneralUnmarshaller(defaultCharset:akka.http.scaladsl.model.HttpCharset)(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.http.scaladsl.model.Multipart.General] "Permalink")  def multipartGeneralUnmarshaller(defaultCharset: [HttpCharset](../model/HttpCharset.html))(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[General](../model/Multipart$$General.html)]
22. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#multipartUnmarshaller[T<:akka.http.scaladsl.model.Multipart,BP<:akka.http.scaladsl.model.Multipart.BodyPart,BPS<:akka.http.scaladsl.model.Multipart.BodyPart.Strict](mediaRange:akka.http.scaladsl.model.MediaRange,defaultContentType:akka.http.scaladsl.model.ContentType,createBodyPart:(akka.http.scaladsl.model.BodyPartEntity,List[akka.http.scaladsl.model.HttpHeader])=>BP,createStreamed:(akka.http.scaladsl.model.MediaType.Multipart,akka.stream.scaladsl.Source[BP,Any])=>T,createStrictBodyPart:(akka.http.scaladsl.model.HttpEntity.Strict,List[akka.http.scaladsl.model.HttpHeader])=>BPS,createStrict:(akka.http.scaladsl.model.MediaType.Multipart,Seq[BPS])=>T)(implicitlog:akka.event.LoggingAdapter,implicitparserSettings:akka.http.scaladsl.settings.ParserSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T] "Permalink")  def multipartUnmarshaller\[T \<: [Multipart](../model/Multipart.html), BP \<: [BodyPart](../model/Multipart$$BodyPart.html), BPS \<: [Strict](../model/Multipart$$BodyPart$$Strict.html)](mediaRange: [MediaRange](../model/MediaRange.html), defaultContentType: [ContentType](../model/ContentType.html), createBodyPart: ([BodyPartEntity](../model/BodyPartEntity.html), List\[[HttpHeader](../model/HttpHeader.html)]) \=\> BP, createStreamed: ([Multipart](../model/MediaType$$Multipart.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[BP, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]) \=\> T, createStrictBodyPart: ([Strict](../model/HttpEntity$$Strict.html), List\[[HttpHeader](../model/HttpHeader.html)]) \=\> BPS, createStrict: ([Multipart](../model/MediaType$$Multipart.html), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[BPS]) \=\> T)(implicit log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [NoLogging](../../../index.html), parserSettings: [ParserSettings](../settings/ParserSettings.html) \= null): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T]
23. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MultipartUnmarshallers toStringFormat\[MultipartUnmarshallers] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MultipartUnmarshallers, B)ImplicitThis member is added by an implicit conversion from MultipartUnmarshallers toArrowAssoc\[MultipartUnmarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMultipartUnmarshallers to any2stringadd\[MultipartUnmarshallers]

### Inherited by implicit conversion StringFormat fromMultipartUnmarshallers to StringFormat\[MultipartUnmarshallers]

### Inherited by implicit conversion Ensuring fromMultipartUnmarshallers to Ensuring\[MultipartUnmarshallers]

### Inherited by implicit conversion ArrowAssoc fromMultipartUnmarshallers to ArrowAssoc\[MultipartUnmarshallers]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html)*