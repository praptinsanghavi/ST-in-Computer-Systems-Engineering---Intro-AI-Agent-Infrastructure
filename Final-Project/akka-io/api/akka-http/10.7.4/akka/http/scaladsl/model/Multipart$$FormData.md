---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.FormData
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:06:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$FormData.html
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
- FormData
- [General](Multipart$$General.html "Basic model for general multipart content as defined by http://tools.ietf.org/html/rfc2046.")
- [Strict](Multipart$$Strict.html "A type of multipart content for which all parts have already been loaded into memory and are therefore allow random access.")
[c](Multipart$$FormData$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Multipart](Multipart$.html)

# [FormData](Multipart$$FormData$.html "See companion object")[**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html "Permalink")

### Companion [object FormData](Multipart$$FormData$.html "See companion object")

#### sealed abstract  class FormData extends [Multipart](Multipart.html) with javadsl.model.Multipart.FormData

Model for `multipart/form-data` content as defined in http://tools.ietf.org/html/rfc2388\.
All parts must have distinct names. (This is not verified!)

Source[Multipart.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Multipart.scala#L327)Linear Supertypesjavadsl.model.Multipart.FormData, [Multipart](Multipart.html), [javadsl.model.Multipart](../../javadsl/model/Multipart.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Strict](Multipart$$FormData$$Strict.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FormData
2. FormData
3. Multipart
4. Multipart
5. AnyRef
6. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#parts:akka.stream.scaladsl.Source[akka.http.scaladsl.model.Multipart.FormData.BodyPart,Any] "Permalink") abstract  def parts: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[FormData.BodyPart](Multipart$$FormData$$BodyPart.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]The stream of body parts this content consists of.

The stream of body parts this content consists of.

Definition ClassesFormData → [Multipart](Multipart.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FormData toany2stringadd\[FormData] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FormData, B)ImplicitThis member is added by an implicit conversion from FormData toArrowAssoc\[FormData] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FormData) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FormDataImplicitThis member is added by an implicit conversion from FormData toEnsuring\[FormData] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FormData) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FormDataImplicitThis member is added by an implicit conversion from FormData toEnsuring\[FormData] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FormDataImplicitThis member is added by an implicit conversion from FormData toEnsuring\[FormData] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FormDataImplicitThis member is added by an implicit conversion from FormData toEnsuring\[FormData] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#getMediaType():akka.http.javadsl.model.MediaType.Multipart "Permalink")  def getMediaType(): [javadsl.model.MediaType.Multipart](../../javadsl/model/MediaType$$Multipart.html)Java API

Java API

Definition Classes[Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
16. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#getParts():akka.stream.javadsl.Source[_<:akka.http.javadsl.model.Multipart.FormData.BodyPart,AnyRef] "Permalink")  def getParts(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[\_ \<: javadsl.model.Multipart.FormData.BodyPart, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Java API

Java API

Definition ClassesFormData → FormData → [Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
17. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#mediaType:akka.http.scaladsl.model.MediaType.Multipart "Permalink")  def mediaType: [MediaType.Multipart](MediaType$$Multipart.html)The media\-type this multipart content carries.

The media\-type this multipart content carries.

Definition ClassesFormData → [Multipart](Multipart.html)
20. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#toEntity():akka.http.scaladsl.model.MessageEntity "Permalink")  def toEntity(): [MessageEntity](index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)Creates an entity from this multipart object using a random boundary.

Creates an entity from this multipart object using a random boundary.

Definition Classes[Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
25. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#toEntity(boundary:String):akka.http.scaladsl.model.MessageEntity "Permalink")  def toEntity(boundary: String): [MessageEntity](index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)Creates an entity from this multipart object using the specified boundary.

Creates an entity from this multipart object using the specified boundary.

Definition Classes[Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
26. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#toEntity(boundary:String,log:akka.event.LoggingAdapter):akka.http.scaladsl.model.MessageEntity "Permalink")  def toEntity(boundary: String, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [MessageEntity](index.html#MessageEntity=akka.http.scaladsl.model.RequestEntity)Creates an entity from this multipart object using the specified boundary and logger.

Creates an entity from this multipart object using the specified boundary and logger.

Definition Classes[Multipart](Multipart.html)
27. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.Multipart.FormData.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.Multipart.FormData.Strict]Java API

Java API

Definition ClassesFormData → FormData → [Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
28. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.Multipart.FormData.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[FormData.Strict](Multipart$$FormData$$Strict.html)]Converts this content into its strict counterpart.

Converts this content into its strict counterpart.
The given `timeout` denotes the max time that an individual part must be read in.
The Future is failed with an TimeoutException if one part isn't read completely after the given timeout.

Definition ClassesFormData → [Multipart](Multipart.html)
29. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FormData toStringFormat\[FormData] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/Multipart$$FormData.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FormData, B)ImplicitThis member is added by an implicit conversion from FormData toArrowAssoc\[FormData] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from javadsl.model.Multipart.FormData

### Inherited from [Multipart](Multipart.html)

### Inherited from [javadsl.model.Multipart](../../javadsl/model/Multipart.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFormData to any2stringadd\[FormData]

### Inherited by implicit conversion StringFormat fromFormData to StringFormat\[FormData]

### Inherited by implicit conversion Ensuring fromFormData to Ensuring\[FormData]

### Inherited by implicit conversion ArrowAssoc fromFormData to ArrowAssoc\[FormData]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$ByteRanges$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$ByteRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData.html)*