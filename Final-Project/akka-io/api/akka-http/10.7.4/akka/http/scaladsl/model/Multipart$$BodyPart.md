---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.BodyPart
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$BodyPart.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.BodyPart
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.BodyPart

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.BodyPart

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Multipart$.html "Permalink")  object [Multipart](Multipart$.html)Definition Classes[model](index.html)
- BodyPart
- [ByteRanges](Multipart$$ByteRanges.html "Model for multipart/byteranges content as defined by https://tools.ietf.org/html/rfc7233#section-5.4.1 and https://tools.ietf.org/html/rfc7233#appendix-A")
- [FormData](Multipart$$FormData.html "Model for multipart/form-data content as defined in http://tools.ietf.org/html/rfc2388.")
- [General](Multipart$$General.html "Basic model for general multipart content as defined by http://tools.ietf.org/html/rfc2046.")
- [Strict](Multipart$$Strict.html "A type of multipart content for which all parts have already been loaded into memory and are therefore allow random access.")
[t](Multipart$$BodyPart$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Multipart](Multipart$.html)

# [BodyPart](Multipart$$BodyPart$.html "See companion object")[**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html "Permalink")

### Companion [object BodyPart](Multipart$$BodyPart$.html "See companion object")

#### trait BodyPart extends javadsl.model.Multipart.BodyPart

The general model for a single part of a multipart message.

Source[Multipart.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Multipart.scala#L138)Linear Supertypesjavadsl.model.Multipart.BodyPart, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Strict](Multipart$$BodyPart$$Strict.html), [BodyPart](Multipart$$ByteRanges$$BodyPart.html), [Strict](Multipart$$ByteRanges$$BodyPart$$Strict.html), [BodyPart](Multipart$$FormData$$BodyPart.html), [Strict](Multipart$$FormData$$BodyPart$$Strict.html), [BodyPart](Multipart$$General$$BodyPart.html), [Strict](Multipart$$General$$BodyPart$$Strict.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BodyPart
2. BodyPart
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
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#entity:akka.http.scaladsl.model.BodyPartEntity "Permalink") abstract  def entity: [BodyPartEntity](BodyPartEntity.html)The entity of the part.
2. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#headers:Seq[akka.http.scaladsl.model.HttpHeader] "Permalink") abstract  def headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](HttpHeader.html)]The headers the part carries.
3. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.Multipart.BodyPart.Strict] "Permalink") abstract  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[BodyPart.Strict](Multipart$$BodyPart$$Strict.html)]
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BodyPart toany2stringadd\[BodyPart] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BodyPart, B)ImplicitThis member is added by an implicit conversion from BodyPart toArrowAssoc\[BodyPart] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#contentDispositionHeader:Option[akka.http.scaladsl.model.headers.Content-Disposition] "Permalink")  def contentDispositionHeader: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Content\-Disposition](headers/Content$minusDisposition.html)]The potentially present \`Content\-Disposition\` header.
9. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#dispositionParams:Map[String,String] "Permalink")  def dispositionParams: Map\[String, String]The parameters of the potentially present \`Content\-Disposition\` header.

The parameters of the potentially present \`Content\-Disposition\` header.
Returns an empty map if no such header is present.
10. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#dispositionType:Option[akka.http.scaladsl.model.headers.ContentDispositionType] "Permalink")  def dispositionType: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ContentDispositionType](headers/ContentDispositionType.html)]The [akka.http.scaladsl.model.headers.ContentDispositionType](headers/ContentDispositionType.html) of the potentially present \`Content\-Disposition\` header.
11. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BodyPart) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BodyPartImplicitThis member is added by an implicit conversion from BodyPart toEnsuring\[BodyPart] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BodyPart) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BodyPartImplicitThis member is added by an implicit conversion from BodyPart toEnsuring\[BodyPart] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BodyPartImplicitThis member is added by an implicit conversion from BodyPart toEnsuring\[BodyPart] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BodyPartImplicitThis member is added by an implicit conversion from BodyPart toEnsuring\[BodyPart] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#getContentDispositionHeader():java.util.Optional[akka.http.javadsl.model.headers.ContentDisposition] "Permalink")  def getContentDispositionHeader(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ContentDisposition](../../javadsl/model/headers/ContentDisposition.html)]Java API

Java API

Definition ClassesBodyPart → BodyPart
19. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#getDispositionParams():java.util.Map[String,String] "Permalink")  def getDispositionParams(): [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]Java API

Java API

Definition ClassesBodyPart → BodyPart
20. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#getDispositionType():java.util.Optional[akka.http.javadsl.model.headers.ContentDispositionType] "Permalink")  def getDispositionType(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ContentDispositionType](../../javadsl/model/headers/ContentDispositionType.html)]Java API

Java API

Definition ClassesBodyPart → BodyPart
21. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#getEntity():akka.http.javadsl.model.BodyPartEntity "Permalink")  def getEntity(): [javadsl.model.BodyPartEntity](../../javadsl/model/BodyPartEntity.html)Java API

Java API

Definition ClassesBodyPart → BodyPart
22. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#getHeaders():Iterable[akka.http.javadsl.model.HttpHeader] "Permalink")  def getHeaders(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[javadsl.model.HttpHeader](../../javadsl/model/HttpHeader.html)]Java API

Java API

Definition ClassesBodyPart → BodyPart
23. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[_<:akka.http.javadsl.model.Multipart.BodyPart.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[\_ \<: javadsl.model.Multipart.BodyPart.Strict]Java API

Java API

Definition ClassesBodyPart → BodyPart
30. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BodyPart toStringFormat\[BodyPart] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/Multipart$$BodyPart.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BodyPart, B)ImplicitThis member is added by an implicit conversion from BodyPart toArrowAssoc\[BodyPart] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from javadsl.model.Multipart.BodyPart

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBodyPart to any2stringadd\[BodyPart]

### Inherited by implicit conversion StringFormat fromBodyPart to StringFormat\[BodyPart]

### Inherited by implicit conversion Ensuring fromBodyPart to Ensuring\[BodyPart]

### Inherited by implicit conversion ArrowAssoc fromBodyPart to ArrowAssoc\[BodyPart]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentDisposition.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/ContentDispositionType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/BodyPartEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$ByteRanges$$BodyPart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$ByteRanges$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$ByteRanges$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$ByteRanges.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$$BodyPart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$$BodyPart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Content$minusDisposition.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ContentDispositionType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$BodyPart.html)*