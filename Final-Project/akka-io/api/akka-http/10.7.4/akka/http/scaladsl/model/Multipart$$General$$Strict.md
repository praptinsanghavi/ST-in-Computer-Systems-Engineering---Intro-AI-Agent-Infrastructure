---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.General.Strict
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:07:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Multipart$$General$$Strict.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.General.Strict
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.General.Strict

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Multipart.General.Strict

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Multipart$.html "Permalink")  object [Multipart](Multipart$.html)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/Multipart$$General$.html "Permalink")  object [General](Multipart$$General$.html)Definition Classes[Multipart](Multipart$.html)
- [BodyPart](Multipart$$General$$BodyPart.html "Body part of the General model.")
- Strict
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Multipart](Multipart$.html).[General](Multipart$$General$.html)

# Strict[**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html "Permalink")

### 

#### case class Strict(mediaType: [MediaType.Multipart](MediaType$$Multipart.html), strictParts: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[BodyPart.Strict](Multipart$$General$$BodyPart$$Strict.html)]) extends [General](Multipart$$General.html) with [Multipart.Strict](Multipart$$Strict.html) with javadsl.model.Multipart.General.Strict with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Strict [General](Multipart$$General.html) multipart content.

Source[Multipart.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Multipart.scala#L250)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), javadsl.model.Multipart.General.Strict, [Multipart.Strict](Multipart$$Strict.html), javadsl.model.Multipart.Strict, [General](Multipart$$General.html), javadsl.model.Multipart.General, [Multipart](Multipart.html), [javadsl.model.Multipart](../../javadsl/model/Multipart.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Strict
2. Serializable
3. Product
4. Equals
5. Strict
6. Strict
7. Strict
8. General
9. General
10. Multipart
11. Multipart
12. AnyRef
13. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#<init>(mediaType:akka.http.scaladsl.model.MediaType.Multipart,strictParts:Seq[akka.http.scaladsl.model.Multipart.General.BodyPart.Strict]):akka.http.scaladsl.model.Multipart.General.Strict "Permalink")  new Strict(mediaType: [MediaType.Multipart](MediaType$$Multipart.html), strictParts: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[BodyPart.Strict](Multipart$$General$$BodyPart$$Strict.html)])
### Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Strict toany2stringadd\[Strict] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Strict, B)ImplicitThis member is added by an implicit conversion from Strict toArrowAssoc\[Strict] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Strict) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Strict) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#getMediaType():akka.http.javadsl.model.MediaType.Multipart "Permalink")  def getMediaType(): [javadsl.model.MediaType.Multipart](../../javadsl/model/MediaType$$Multipart.html)Java API

Java API

Definition Classes[Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
15. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#getParts():akka.stream.javadsl.Source[akka.http.javadsl.model.Multipart.General.BodyPart.Strict,AnyRef] "Permalink")  def getParts(): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[javadsl.model.Multipart.General.BodyPart.Strict, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Java API

Java API

Definition ClassesStrict → Strict → [Strict](Multipart$$Strict.html) → Strict → [General](Multipart$$General.html) → General → [Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
16. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#getStrictParts():Iterable[akka.http.javadsl.model.Multipart.General.BodyPart.Strict] "Permalink")  def getStrictParts(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[javadsl.model.Multipart.General.BodyPart.Strict]Java API

Java API

Definition ClassesStrict → Strict → [Strict](Multipart$$Strict.html) → Strict
17. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#mediaType:akka.http.scaladsl.model.MediaType.Multipart "Permalink")  val mediaType: [MediaType.Multipart](MediaType$$Multipart.html)The media\-type this multipart content carries.

The media\-type this multipart content carries.

Definition ClassesStrict → [Multipart](Multipart.html)
19. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#parts:akka.stream.scaladsl.Source[akka.http.scaladsl.model.Multipart.General.BodyPart.Strict,Any] "Permalink")  def parts: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[BodyPart.Strict](Multipart$$General$$BodyPart$$Strict.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]The stream of body parts this content consists of.

The stream of body parts this content consists of.

Definition ClassesStrict → [Strict](Multipart$$Strict.html) → [General](Multipart$$General.html) → [Multipart](Multipart.html)
23. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#productPrefix:String "Permalink")  def productPrefix: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesStrict → Product
25. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#strictParts:Seq[akka.http.scaladsl.model.Multipart.General.BodyPart.Strict] "Permalink")  val strictParts: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[BodyPart.Strict](Multipart$$General$$BodyPart$$Strict.html)]The parts of this content as a strict collection.

The parts of this content as a strict collection.

Definition ClassesStrict → [Strict](Multipart$$Strict.html)
26. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#toEntity():akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def toEntity(): [HttpEntity.Strict](HttpEntity$$Strict.html)Creates an entity from this multipart object using a random boundary.

Creates an entity from this multipart object using a random boundary.

Definition Classes[Strict](Multipart$$Strict.html) → Strict → [Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
28. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#toEntity(boundary:String):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def toEntity(boundary: String): [HttpEntity.Strict](HttpEntity$$Strict.html)Creates an entity from this multipart object using the specified boundary.

Creates an entity from this multipart object using the specified boundary.

Definition Classes[Strict](Multipart$$Strict.html) → Strict → [Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
29. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#toEntity(boundary:String,log:akka.event.LoggingAdapter):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def toEntity(boundary: String, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [HttpEntity.Strict](HttpEntity$$Strict.html)Creates an entity from this multipart object using the specified boundary and logger.

Creates an entity from this multipart object using the specified boundary and logger.

Definition Classes[Strict](Multipart$$Strict.html) → [Multipart](Multipart.html)
30. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.Multipart.General.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Strict]Converts this content into its strict counterpart.

Converts this content into its strict counterpart.
The given `timeout` denotes the max time that an individual part must be read in.
The Future is failed with an TimeoutException if one part isn't read completely after the given timeout.

Definition ClassesStrict → [General](Multipart$$General.html) → [Multipart](Multipart.html)
31. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.model.Multipart.General.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[javadsl.model.Multipart.General.Strict]Java API

Java API

Definition Classes[General](Multipart$$General.html) → General → [Multipart](Multipart.html) → [Multipart](../../javadsl/model/Multipart.html)
32. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Strict toStringFormat\[Strict] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/Multipart$$General$$Strict.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Strict, B)ImplicitThis member is added by an implicit conversion from Strict toArrowAssoc\[Strict] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from javadsl.model.Multipart.General.Strict

### Inherited from [Multipart.Strict](Multipart$$Strict.html)

### Inherited from javadsl.model.Multipart.Strict

### Inherited from [General](Multipart$$General.html)

### Inherited from javadsl.model.Multipart.General

### Inherited from [Multipart](Multipart.html)

### Inherited from [javadsl.model.Multipart](../../javadsl/model/Multipart.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStrict to any2stringadd\[Strict]

### Inherited by implicit conversion StringFormat fromStrict to StringFormat\[Strict]

### Inherited by implicit conversion Ensuring fromStrict to Ensuring\[Strict]

### Inherited by implicit conversion ArrowAssoc fromStrict to ArrowAssoc\[Strict]

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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$$BodyPart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$$BodyPart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$$BodyPart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$$Strict.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Multipart$$General$$Strict.html)*