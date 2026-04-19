---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.BasicDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:19:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.BasicDirectives
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.BasicDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.BasicDirectives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[javadsl](../../index.html)
- [**](../../../../../akka/http/javadsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [AttributeDirectives](AttributeDirectives.html)
- BasicDirectives
- [CacheConditionDirectives](CacheConditionDirectives.html)
- [CachingDirectives](CachingDirectives$.html)
- [CodingDirectives](CodingDirectives.html)
- [ContentTypeResolver](ContentTypeResolver.html "Implement this interface to provide a custom mapping from a file name to a akka.http.javadsl.model.ContentType.")
- [CookieDirectives](CookieDirectives.html)
- [CorrespondsTo](CorrespondsTo.html)
- [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.")
- [DebuggingDirectives](DebuggingDirectives.html)
- [DirectoryListing](DirectoryListing.html)
- [DirectoryRenderer](DirectoryRenderer.html)
- [ExecutionDirectives](ExecutionDirectives.html)
- [FileAndResourceDirectives](FileAndResourceDirectives.html "Directives that load files and resources.")
- [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives")
- [FileUploadDirectives](FileUploadDirectives.html)
- [FormFieldDirectives](FormFieldDirectives.html)
- [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "EXPERIMENTAL API")
- [FutureDirectives](FutureDirectives.html)
- [HeaderDirectives](HeaderDirectives.html)
- [HostDirectives](HostDirectives.html)
- [LogEntry](LogEntry.html)
- [MarshallingDirectives](MarshallingDirectives.html)
- [MethodDirectives](MethodDirectives.html)
- [MiscDirectives](MiscDirectives.html)
- [ParameterDirectives](ParameterDirectives.html)
- [PathDirectives](PathDirectives.html "Only path prefixes are matched by these methods, since any kind of chaining path extractions in Java would just look cumbersome without operator overloads; hence, no PathMatcher for Java.")
- [RangeDirectives](RangeDirectives.html)
- [RespondWithDirectives](RespondWithDirectives.html)
- [RouteAdapter](RouteAdapter.html "INTERNAL API")
- [RouteDirectives](RouteDirectives.html)
- [SchemeDirectives](SchemeDirectives.html)
- [SecurityDirectives](SecurityDirectives.html)
- [TimeoutDirectives](TimeoutDirectives.html)
- [TlsDirectives](TlsDirectives.html)
- [WebSocketDirectives](WebSocketDirectives.html)
c[akka](../../../../index.html).[http](../../../index.html).[javadsl](../../index.html).[server](../index.html).[directives](index.html)

# BasicDirectives[**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html "Permalink")

### 

#### abstract  class BasicDirectives extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[BasicDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/server/directives/BasicDirectives.scala#L45)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AllDirectives](../AllDirectives.html), [Directives](../Directives$.html), [AttributeDirectives](AttributeDirectives.html), [CacheConditionDirectives](CacheConditionDirectives.html), [CodingDirectives](CodingDirectives.html), [CookieDirectives](CookieDirectives.html), [CorsDirectives](CorsDirectives.html), [DebuggingDirectives](DebuggingDirectives.html), [ExecutionDirectives](ExecutionDirectives.html), [FileAndResourceDirectives](FileAndResourceDirectives.html), [FileUploadDirectives](FileUploadDirectives.html), [FormFieldDirectives](FormFieldDirectives.html), [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html), [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives$.html), [FutureDirectives](FutureDirectives.html), [HeaderDirectives](HeaderDirectives.html), [HostDirectives](HostDirectives.html), [MarshallingDirectives](MarshallingDirectives.html), [MethodDirectives](MethodDirectives.html), [MiscDirectives](MiscDirectives.html), [ParameterDirectives](ParameterDirectives.html), [PathDirectives](PathDirectives.html), [RangeDirectives](RangeDirectives.html), [RespondWithDirectives](RespondWithDirectives.html), [RouteDirectives](RouteDirectives.html), [SchemeDirectives](SchemeDirectives.html), [SecurityDirectives](SecurityDirectives.html), [TimeoutDirectives](TimeoutDirectives.html), [TlsDirectives](TlsDirectives.html), [WebSocketDirectives](WebSocketDirectives.html), [JUnitRouteTest](../../testkit/JUnitRouteTest.html), [JUnitRouteTestBase](../../testkit/JUnitRouteTestBase.html), [RouteTest](../../testkit/RouteTest.html), [HttpApp](../HttpApp.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BasicDirectives
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
### Instance Constructors

1. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#<init>():akka.http.javadsl.server.directives.BasicDirectives "Permalink")  new BasicDirectives()
### Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BasicDirectives toany2stringadd\[BasicDirectives] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BasicDirectives, B)ImplicitThis member is added by an implicit conversion from BasicDirectives toArrowAssoc\[BasicDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#cancelRejection(rejection:akka.http.javadsl.server.Rejection,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cancelRejection(rejection: [Rejection](../Rejection.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a TransformationRejection cancelling all rejections equal to the given one
to the list of rejections potentially coming back from the inner route.
8. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#cancelRejections(filter:java.util.function.Predicate[akka.http.javadsl.server.Rejection],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cancelRejections(filter: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[[Rejection](../Rejection.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
to the list of rejections potentially coming back from the inner route.
9. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#cancelRejections(classes:Iterable[Class[_]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cancelRejections(classes: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[Class\[\_]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a TransformationRejection cancelling all rejections of one of the given classes
to the list of rejections potentially coming back from the inner route.
10. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BasicDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BasicDirectivesImplicitThis member is added by an implicit conversion from BasicDirectives toEnsuring\[BasicDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BasicDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BasicDirectivesImplicitThis member is added by an implicit conversion from BasicDirectives toEnsuring\[BasicDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BasicDirectivesImplicitThis member is added by an implicit conversion from BasicDirectives toEnsuring\[BasicDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BasicDirectivesImplicitThis member is added by an implicit conversion from BasicDirectives toEnsuring\[BasicDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extract[T](extract:java.util.function.Function[akka.http.javadsl.server.RequestContext,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extract\[T](extract: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestContext](../RequestContext.html), T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Extracts a single value using the given function.
18. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractActorSystem(inner:java.util.function.Function[akka.actor.ActorSystem,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractActorSystem(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), [Route](../Route.html)]): [Route](../Route.html)Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).

Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).
Otherwise throws an exception as it won't be able to extract the system from arbitrary materializers.
19. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractDataBytes(inner:java.util.function.Function[akka.stream.javadsl.Source[akka.util.ByteString,Any],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractDataBytes(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the entities `dataBytes` [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).
20. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractEntity(inner:java.util.function.Function[akka.http.javadsl.model.RequestEntity,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractEntity(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestEntity](../../model/RequestEntity.html), [Route](../Route.html)]): [Route](../Route.html)Extracts the current http request entity.

Extracts the current http request entity.

Annotations@[CorrespondsTo](CorrespondsTo.html)()
21. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractExecutionContext(inner:java.util.function.Function[scala.concurrent.ExecutionContextExecutor,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractExecutionContext(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor), [Route](../Route.html)]): [Route](../Route.html)Extracts the ExecutionContextExecutor from the [RequestContext](../RequestContext.html).
22. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractLog(inner:java.util.function.Function[akka.event.LoggingAdapter,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractLog(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), [Route](../Route.html)]): [Route](../Route.html)Extracts the LoggingAdapter
23. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractMatchedPath(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractMatchedPath(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the already matched path from the RequestContext.
24. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractMaterializer(inner:java.util.function.Function[akka.stream.Materializer,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractMaterializer(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer), [Route](../Route.html)]): [Route](../Route.html)Extracts the Materializer from the [RequestContext](../RequestContext.html).
25. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractParserSettings(inner:java.util.function.Function[akka.http.javadsl.settings.ParserSettings,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractParserSettings(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ParserSettings](../../settings/ParserSettings.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the [akka.http.javadsl.settings.ParserSettings](../../settings/ParserSettings.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).
26. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractRequest(inner:java.util.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractRequest(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the current HttpRequest instance.
27. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractRequestContext(inner:java.util.function.Function[akka.http.javadsl.server.RequestContext,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractRequestContext(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestContext](../RequestContext.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself.
28. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractRequestEntity(inner:java.util.function.Function[akka.http.javadsl.model.RequestEntity,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractRequestEntity(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestEntity](../../model/RequestEntity.html), [Route](../Route.html)]): [Route](../Route.html)Extracts the [akka.http.javadsl.model.RequestEntity](../../model/RequestEntity.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).
29. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractSettings(inner:java.util.function.Function[akka.http.javadsl.settings.RoutingSettings,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractSettings(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RoutingSettings](../../settings/RoutingSettings.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the RoutingSettings from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).
30. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long,inner:java.util.function.Function[akka.http.javadsl.model.HttpEntity.Strict,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Strict, [Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.javadsl.server.RequestContext](../RequestContext.html) into an
akka.http.javadsl.model.HttpEntity.Strict and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.
31. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,inner:java.util.function.Function[akka.http.javadsl.model.HttpEntity.Strict,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Strict, [Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.javadsl.server.RequestContext](../RequestContext.html) into an
akka.http.javadsl.model.HttpEntity.Strict and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.
32. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractUnmatchedPath(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractUnmatchedPath(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the yet unmatched path from the RequestContext.
33. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#extractUri(inner:java.util.function.Function[akka.http.javadsl.model.Uri,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractUri(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Uri](../../model/Uri.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the complete request URI.
34. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
37. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapInnerRoute(f:java.util.function.Function[akka.http.javadsl.server.Route,akka.http.javadsl.server.Route],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapInnerRoute(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Route](../Route.html), [Route](../Route.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
38. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapRejections(f:java.util.function.Function[java.util.List[akka.http.javadsl.server.Rejection],java.util.List[akka.http.javadsl.server.Rejection]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRejections(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)], [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
39. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapRequest(f:java.util.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpRequest],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRequest(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [HttpRequest](../../model/HttpRequest.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
40. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapRequestContext(f:java.util.function.Function[akka.http.javadsl.server.RequestContext,akka.http.javadsl.server.RequestContext],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRequestContext(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestContext](../RequestContext.html), [RequestContext](../RequestContext.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
41. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapResponse(f:java.util.function.Function[akka.http.javadsl.model.HttpResponse,akka.http.javadsl.model.HttpResponse],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapResponse(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpResponse](../../model/HttpResponse.html), [HttpResponse](../../model/HttpResponse.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
42. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapResponseEntity(f:java.util.function.Function[akka.http.javadsl.model.ResponseEntity,akka.http.javadsl.model.ResponseEntity],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapResponseEntity(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ResponseEntity](../../model/ResponseEntity.html), [ResponseEntity](../../model/ResponseEntity.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
43. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapResponseHeaders(f:java.util.function.Function[java.util.List[akka.http.javadsl.model.HttpHeader],java.util.List[akka.http.javadsl.model.HttpHeader]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapResponseHeaders(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[HttpHeader](../../model/HttpHeader.html)], [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[HttpHeader](../../model/HttpHeader.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
44. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapRouteResult(f:java.util.function.Function[akka.http.javadsl.server.RouteResult,akka.http.javadsl.server.RouteResult],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResult(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RouteResult](../RouteResult.html), [RouteResult](../RouteResult.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
45. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapRouteResultFuture(f:java.util.function.Function[java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult],java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultFuture(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
46. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapRouteResultPF(f:PartialFunction[akka.http.javadsl.server.RouteResult,akka.http.javadsl.server.RouteResult],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](../RouteResult.html), [RouteResult](../RouteResult.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
47. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapRouteResultWith(f:java.util.function.Function[akka.http.javadsl.server.RouteResult,java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultWith(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RouteResult](../RouteResult.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
48. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapRouteResultWithPF(f:PartialFunction[akka.http.javadsl.server.RouteResult,java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultWithPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](../RouteResult.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
49. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapSettings(f:java.util.function.Function[akka.http.javadsl.settings.RoutingSettings,akka.http.javadsl.settings.RoutingSettings],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapSettings(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RoutingSettings](../../settings/RoutingSettings.html), [RoutingSettings](../../settings/RoutingSettings.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs the inner route with settings mapped by the given function.
50. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#mapUnmatchedPath(f:java.util.function.Function[String,String],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapUnmatchedPath(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, String], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Transforms the unmatchedPath of the RequestContext using the given function.
51. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
52. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
53. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#pass(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pass(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Always passes the request on to its inner route
(i.e.

Always passes the request on to its inner route
(i.e. does nothing with the request or the response).
55. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#provide[T](t:T,inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def provide\[T](t: T, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Injects the given value into a directive.
56. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#recoverRejections(f:java.util.function.Function[Iterable[akka.http.javadsl.server.Rejection],akka.http.javadsl.server.RouteResult],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def recoverRejections(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Rejection](../Rejection.html)], [RouteResult](../RouteResult.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
57. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#recoverRejectionsWith(f:java.util.function.Function[Iterable[akka.http.javadsl.server.Rejection],java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def recoverRejectionsWith(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Rejection](../Rejection.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)
58. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
59. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.
60. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.
61. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
62. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
63. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
64. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
65. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#withExecutionContext(ec:scala.concurrent.ExecutionContextExecutor,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withExecutionContext(ec: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).
66. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#withLog(log:akka.event.LoggingAdapter,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withLog(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative LoggingAdapter.
67. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#withMaterializer(mat:akka.stream.Materializer,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withMaterializer(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html).
68. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#withSettings(s:akka.http.javadsl.settings.RoutingSettings,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withSettings(s: [RoutingSettings](../../settings/RoutingSettings.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative RoutingSettings.
### Deprecated Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BasicDirectives toStringFormat\[BasicDirectives] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/javadsl/server/directives/BasicDirectives.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BasicDirectives, B)ImplicitThis member is added by an implicit conversion from BasicDirectives toArrowAssoc\[BasicDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBasicDirectives to any2stringadd\[BasicDirectives]

### Inherited by implicit conversion StringFormat fromBasicDirectives to StringFormat\[BasicDirectives]

### Inherited by implicit conversion Ensuring fromBasicDirectives to Ensuring\[BasicDirectives]

### Inherited by implicit conversion ArrowAssoc fromBasicDirectives to ArrowAssoc\[BasicDirectives]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AllDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CodingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CookieDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CorrespondsTo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/CorsDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryListing.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryRenderer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FileInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FramedEntityStreamingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FramedEntityStreamingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/FutureDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/HeaderDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/HostDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/LogEntry.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/MarshallingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/MethodDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/MiscDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/ParameterDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/PathDirectives.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/BasicDirectives.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/BasicDirectives.html)*