---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2Utils
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:12:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2Utils.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2Utils
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2Utils

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2Utils

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[scaladsl](../index.html)
- [MarshallingTestUtils](MarshallingTestUtils.html)
- [RouteTest](RouteTest.html)
- [RouteTestResultComponent](RouteTestResultComponent.html)
- [RouteTestTimeout](RouteTestTimeout.html)
- [ScalatestRouteTest](ScalatestRouteTest.html)
- [ScalatestUtils](ScalatestUtils.html)
- [Specs2FrameworkInterface](Specs2FrameworkInterface$.html)
- [Specs2RouteTest](Specs2RouteTest.html)
- Specs2Utils
- [TestFrameworkInterface](TestFrameworkInterface.html)
- [WSProbe](WSProbe.html "A WSProbe is a probe that implements a Flow[Message, Message, Unit] for testing websocket code.")
- [WSTestRequestBuilding](WSTestRequestBuilding.html)
t[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[testkit](index.html)

# Specs2Utils[**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html "Permalink")

### 

#### trait Specs2Utils extends [MarshallingTestUtils](MarshallingTestUtils.html)

Source[Specs2Utils.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-testkit/src/main/scala/akka/http/scaladsl/testkit/Specs2Utils.scala#L19)Linear Supertypes[MarshallingTestUtils](MarshallingTestUtils.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Specs2RouteTest](Specs2RouteTest.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Specs2Utils
2. MarshallingTestUtils
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

1. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#testConfig:com.typesafe.config.Config "Permalink") abstract  def testConfig: [Config](https://javadoc.io/page/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Specs2Utils toany2stringadd\[Specs2Utils] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Specs2Utils, B)ImplicitThis member is added by an implicit conversion from Specs2Utils toArrowAssoc\[Specs2Utils] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Specs2Utils) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Specs2UtilsImplicitThis member is added by an implicit conversion from Specs2Utils toEnsuring\[Specs2Utils] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Specs2Utils) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Specs2UtilsImplicitThis member is added by an implicit conversion from Specs2Utils toEnsuring\[Specs2Utils] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Specs2UtilsImplicitThis member is added by an implicit conversion from Specs2Utils toEnsuring\[Specs2Utils] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Specs2UtilsImplicitThis member is added by an implicit conversion from Specs2Utils toEnsuring\[Specs2Utils] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#evaluateTo[T](value:T)(implicitee:org.specs2.concurrent.ExecutionEnv):org.specs2.matcher.Matcher[scala.concurrent.Future[T]] "Permalink")  def evaluateTo\[T](value: T)(implicit ee: [ExecutionEnv](https://javadoc.io/page/org.specs2/specs2-common_2.13/4.10.6/org/specs2/concurrent/ExecutionEnv.html#org.specs2.concurrent.ExecutionEnv)): [Matcher](https://javadoc.io/page/org.specs2/specs2-matcher_2.13/4.10.6/org/specs2/matcher/Matcher.html#org.specs2.matcher.Matcher)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]
15. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#haveFailedWith(t:Throwable)(implicitee:org.specs2.concurrent.ExecutionEnv):org.specs2.matcher.Matcher[scala.concurrent.Future[_]] "Permalink")  def haveFailedWith(t: Throwable)(implicit ee: [ExecutionEnv](https://javadoc.io/page/org.specs2/specs2-common_2.13/4.10.6/org/specs2/concurrent/ExecutionEnv.html#org.specs2.concurrent.ExecutionEnv)): [Matcher](https://javadoc.io/page/org.specs2/specs2-matcher_2.13/4.10.6/org/specs2/matcher/Matcher.html#org.specs2.matcher.Matcher)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[\_]]
18. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#marshal[T](value:T)(implicitevidence$1:akka.http.scaladsl.marshalling.ToEntityMarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpEntity.Strict "Permalink")  def marshal\[T](value: T)(implicit arg0: [ToEntityMarshaller](../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Strict](../model/HttpEntity$$Strict.html)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
20. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#marshalToResponse[T](value:T,request:akka.http.scaladsl.model.HttpRequest)(implicitevidence$3:akka.http.scaladsl.marshalling.ToResponseMarshaller[T],implicitec:scala.concurrent.ExecutionContext):akka.http.scaladsl.model.HttpResponse "Permalink")  def marshalToResponse\[T](value: T, request: [HttpRequest](../model/HttpRequest.html) \= [HttpRequest()](../../../index.html))(implicit arg0: [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [HttpResponse](../model/HttpResponse.html)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
21. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#marshalToResponseForRequestAccepting[T](value:T,mediaRanges:akka.http.scaladsl.model.MediaRange*)(implicitevidence$2:akka.http.scaladsl.marshalling.ToResponseMarshaller[T],implicitec:scala.concurrent.ExecutionContext):akka.http.scaladsl.model.HttpResponse "Permalink")  def marshalToResponseForRequestAccepting\[T](value: T, mediaRanges: [MediaRange](../model/MediaRange.html)\*)(implicit arg0: [ToResponseMarshaller](../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [HttpResponse](../model/HttpResponse.html)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
22. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#marshallingTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  def marshallingTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
23. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#unmarshal[T](entity:akka.http.scaladsl.model.HttpEntity)(implicitevidence$5:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):scala.util.Try[T] "Permalink")  def unmarshal\[T](entity: [HttpEntity](../model/HttpEntity.html))(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T]Definition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
29. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#unmarshalTo[T](value:scala.util.Try[T])(implicitevidence$2:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):org.specs2.matcher.Matcher[akka.http.scaladsl.model.HttpEntity] "Permalink")  def unmarshalTo\[T](value: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T])(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Matcher](https://javadoc.io/page/org.specs2/specs2-matcher_2.13/4.10.6/org/specs2/matcher/Matcher.html#org.specs2.matcher.Matcher)\[[HttpEntity](../model/HttpEntity.html)]
30. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#unmarshalToValue[T](value:T)(implicitevidence$1:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):org.specs2.matcher.Matcher[akka.http.scaladsl.model.HttpEntity] "Permalink")  def unmarshalToValue\[T](value: T)(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Matcher](https://javadoc.io/page/org.specs2/specs2-matcher_2.13/4.10.6/org/specs2/matcher/Matcher.html#org.specs2.matcher.Matcher)\[[HttpEntity](../model/HttpEntity.html)]
31. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#unmarshalValue[T](entity:akka.http.scaladsl.model.HttpEntity)(implicitevidence$4:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T],implicitec:scala.concurrent.ExecutionContext,implicitmat:akka.stream.Materializer):T "Permalink")  def unmarshalValue\[T](entity: [HttpEntity](../model/HttpEntity.html))(implicit arg0: [FromEntityUnmarshaller](../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T], ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): TDefinition Classes[MarshallingTestUtils](MarshallingTestUtils.html)
32. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Specs2Utils toStringFormat\[Specs2Utils] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/testkit/Specs2Utils.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Specs2Utils, B)ImplicitThis member is added by an implicit conversion from Specs2Utils toArrowAssoc\[Specs2Utils] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [MarshallingTestUtils](MarshallingTestUtils.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSpecs2Utils to any2stringadd\[Specs2Utils]

### Inherited by implicit conversion StringFormat fromSpecs2Utils to StringFormat\[Specs2Utils]

### Inherited by implicit conversion Ensuring fromSpecs2Utils to Ensuring\[Specs2Utils]

### Inherited by implicit conversion ArrowAssoc fromSpecs2Utils to ArrowAssoc\[Specs2Utils]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/MarshallingTestUtils.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTest$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestTimeout$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/RouteTestTimeout.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/ScalatestUtils.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2FrameworkInterface$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2RouteTest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2Utils.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSProbe$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSProbe.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/WSTestRequestBuilding.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2Utils.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2Utils.html)*