---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.BasicDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/BasicDirectives$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.BasicDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.BasicDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.BasicDirectives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [AttributeDirectives](AttributeDirectives.html)
- [AuthenticationDirective](AuthenticationDirective.html)
- [AuthenticationResult](AuthenticationResult$.html)
- [BasicDirectives](BasicDirectives.html)
- [CacheConditionDirectives](CacheConditionDirectives.html)
- [CachingDirectives](CachingDirectives.html)
- [CodingDirectives](CodingDirectives.html)
- [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html)
- [ContentTypeResolver](ContentTypeResolver.html)
- [CookieDirectives](CookieDirectives.html)
- [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.")
- [Credentials](Credentials.html "Represents authentication credentials supplied with a request.")
- [DebuggingDirectives](DebuggingDirectives.html)
- [DirectoryListing](DirectoryListing.html)
- [ExecutionDirectives](ExecutionDirectives.html)
- [FileAndResourceDirectives](FileAndResourceDirectives.html)
- [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives")
- [FileUploadDirectives](FileUploadDirectives.html)
- [FormFieldDirectives](FormFieldDirectives.html)
- [FormFieldDirectivesInstances](FormFieldDirectivesInstances.html)
- [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "Allows the MarshallingDirectives.entity directive to extract a akka.stream.scaladsl.Source of elements.")
- [FutureDirectives](FutureDirectives.html)
- [HeaderDirectives](HeaderDirectives.html)
- [HeaderMagnet](HeaderMagnet.html)
- [HostDirectives](HostDirectives.html)
- [LogEntry](LogEntry.html)
- [LoggingMagnet](LoggingMagnet.html)
- [LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html)
- [MarshallingDirectives](MarshallingDirectives.html)
- [MethodDirectives](MethodDirectives.html)
- [MiscDirectives](MiscDirectives.html)
- [OnSuccessMagnet](OnSuccessMagnet.html)
- [ParameterDirectives](ParameterDirectives.html)
- [ParameterDirectivesInstances](ParameterDirectivesInstances.html)
- [PathDirectives](PathDirectives.html)
- [RangeDirectives](RangeDirectives.html)
- [RespondWithDirectives](RespondWithDirectives.html)
- [RouteDirectives](RouteDirectives.html)
- [SchemeDirectives](SchemeDirectives.html)
- [SecurityDirectives](SecurityDirectives.html "Provides directives for securing an inner route using the standard Http authentication headers `WWW-Authenticate` and Authorization.")
- [TimeoutDirectives](TimeoutDirectives.html)
- [TlsDirectives](TlsDirectives.html)
- [WebSocketDirectives](WebSocketDirectives.html)
[o](BasicDirectives.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# [BasicDirectives](BasicDirectives.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html "Permalink")

### Companion [trait BasicDirectives](BasicDirectives.html "See companion trait")

#### object BasicDirectives extends [BasicDirectives](BasicDirectives.html)

Source[BasicDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/BasicDirectives.scala#L414)Linear Supertypes[BasicDirectives](BasicDirectives.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. BasicDirectives
2. BasicDirectives
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#cancelRejection(rejection:akka.http.scaladsl.server.Rejection):akka.http.scaladsl.server.Directive0 "Permalink")  def cancelRejection(rejection: [Rejection](../Rejection.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds a TransformationRejection cancelling all rejections equal to the given one
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections equal to the given one
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](BasicDirectives.html)
6. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#cancelRejections(cancelFilter:akka.http.scaladsl.server.Rejection=>Boolean):akka.http.scaladsl.server.Directive0 "Permalink")  def cancelRejections(cancelFilter: ([Rejection](../Rejection.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](BasicDirectives.html)
7. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#cancelRejections(classes:Class[_]*):akka.http.scaladsl.server.Directive0 "Permalink")  def cancelRejections(classes: Class\[\_]\*): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Adds a TransformationRejection cancelling all rejections of one of the given classes
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections of one of the given classes
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](BasicDirectives.html)
8. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extract[T](f:akka.http.scaladsl.server.RequestContext=>T):akka.http.scaladsl.server.Directive1[T] "Permalink")  def extract\[T](f: ([RequestContext](../RequestContext.html)) \=\> T): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Extracts a single value using the given function.

Extracts a single value using the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
12. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractActorSystem:akka.http.scaladsl.server.Directive1[akka.actor.ActorSystem] "Permalink")  def extractActorSystem: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)]Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).

Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).
Otherwise throws an exception as it won't be able to extract the system from arbitrary materializers.

Definition Classes[BasicDirectives](BasicDirectives.html)
13. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractDataBytes:akka.http.scaladsl.server.Directive1[akka.stream.scaladsl.Source[akka.util.ByteString,Any]] "Permalink")  def extractDataBytes: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]Extracts the entities `dataBytes` [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Extracts the entities `dataBytes` [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
14. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractExecutionContext:akka.http.scaladsl.server.Directive1[scala.concurrent.ExecutionContextExecutor] "Permalink")  def extractExecutionContext: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)]Extracts the [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Extracts the [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
15. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractLog:akka.http.scaladsl.server.Directive1[akka.event.LoggingAdapter] "Permalink")  def extractLog: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)]Extracts the [akka.event.LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Extracts the [akka.event.LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
16. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractMatchedPath:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.Uri.Path] "Permalink")  def extractMatchedPath: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Path](../../model/Uri$$Path.html)]Extracts the already matched path from the RequestContext.

Extracts the already matched path from the RequestContext.

Definition Classes[BasicDirectives](BasicDirectives.html)
17. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractMaterializer:akka.http.scaladsl.server.Directive1[akka.stream.Materializer] "Permalink")  def extractMaterializer: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)]Extracts the [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Extracts the [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
18. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractParserSettings:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.settings.ParserSettings] "Permalink")  def extractParserSettings: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[ParserSettings](../../settings/ParserSettings.html)]Extracts the [akka.http.scaladsl.settings.ParserSettings](../../settings/ParserSettings.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Extracts the [akka.http.scaladsl.settings.ParserSettings](../../settings/ParserSettings.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
19. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractRequest:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.HttpRequest] "Permalink")  def extractRequest: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[HttpRequest](../../model/HttpRequest.html)]Extracts the current HttpRequest instance.

Extracts the current HttpRequest instance.

Definition Classes[BasicDirectives](BasicDirectives.html)
20. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractRequestContext:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.server.RequestContext] "Permalink")  def extractRequestContext: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[RequestContext](../RequestContext.html)]Extracts the [akka.http.scaladsl.server.RequestContext](../RequestContext.html) itself.

Extracts the [akka.http.scaladsl.server.RequestContext](../RequestContext.html) itself.

Definition Classes[BasicDirectives](BasicDirectives.html)
21. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractRequestEntity:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.RequestEntity] "Permalink")  def extractRequestEntity: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[RequestEntity](../../model/RequestEntity.html)]Extracts the [akka.http.scaladsl.model.RequestEntity](../../model/RequestEntity.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Extracts the [akka.http.scaladsl.model.RequestEntity](../../model/RequestEntity.html) from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
22. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractSettings:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.settings.RoutingSettings] "Permalink")  def extractSettings: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[RoutingSettings](../../settings/RoutingSettings.html)]Extracts the RoutingSettings from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Extracts the RoutingSettings from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
23. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long):akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Strict](../../model/HttpEntity$$Strict.html)]WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html) into an
[akka.http.scaladsl.model.HttpEntity.Strict](../../model/HttpEntity$$Strict.html) and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
24. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.HttpEntity.Strict] "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Strict](../../model/HttpEntity$$Strict.html)]WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.scaladsl.server.RequestContext](../RequestContext.html) into an
[akka.http.scaladsl.model.HttpEntity.Strict](../../model/HttpEntity$$Strict.html) and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
25. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractUnmatchedPath:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.Uri.Path] "Permalink")  def extractUnmatchedPath: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Path](../../model/Uri$$Path.html)]Extracts the yet unmatched path from the RequestContext.

Extracts the yet unmatched path from the RequestContext.

Definition Classes[BasicDirectives](BasicDirectives.html)
26. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#extractUri:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.Uri] "Permalink")  def extractUri: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Uri](../../model/Uri.html)]Extracts the complete request URI.

Extracts the complete request URI.

Definition Classes[BasicDirectives](BasicDirectives.html)
27. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapInnerRoute(f:akka.http.scaladsl.server.Route=>akka.http.scaladsl.server.Route):akka.http.scaladsl.server.Directive0 "Permalink")  def mapInnerRoute(f: ([Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])) \=\> [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
31. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapRejections(f:Seq[akka.http.scaladsl.server.Rejection]=>Seq[akka.http.scaladsl.server.Rejection]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRejections(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](../Rejection.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](../Rejection.html)]): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
32. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapRequest(f:akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpRequest):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRequest(f: ([HttpRequest](../../model/HttpRequest.html)) \=\> [HttpRequest](../../model/HttpRequest.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
33. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapRequestContext(f:akka.http.scaladsl.server.RequestContext=>akka.http.scaladsl.server.RequestContext):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRequestContext(f: ([RequestContext](../RequestContext.html)) \=\> [RequestContext](../RequestContext.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
34. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapResponse(f:akka.http.scaladsl.model.HttpResponse=>akka.http.scaladsl.model.HttpResponse):akka.http.scaladsl.server.Directive0 "Permalink")  def mapResponse(f: ([HttpResponse](../../model/HttpResponse.html)) \=\> [HttpResponse](../../model/HttpResponse.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
35. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapResponseEntity(f:akka.http.scaladsl.model.ResponseEntity=>akka.http.scaladsl.model.ResponseEntity):akka.http.scaladsl.server.Directive0 "Permalink")  def mapResponseEntity(f: ([ResponseEntity](../../model/ResponseEntity.html)) \=\> [ResponseEntity](../../model/ResponseEntity.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
36. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapResponseHeaders(f:Seq[akka.http.scaladsl.model.HttpHeader]=>Seq[akka.http.scaladsl.model.HttpHeader]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapResponseHeaders(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../../model/HttpHeader.html)]) \=\> [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../../model/HttpHeader.html)]): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
37. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapRouteResult(f:akka.http.scaladsl.server.RouteResult=>akka.http.scaladsl.server.RouteResult):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResult(f: ([RouteResult](../RouteResult.html)) \=\> [RouteResult](../RouteResult.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
38. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapRouteResultFuture(f:scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResultFuture(f: ([Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](../RouteResult.html)]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](../RouteResult.html)]): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
39. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapRouteResultPF(f:PartialFunction[akka.http.scaladsl.server.RouteResult,akka.http.scaladsl.server.RouteResult]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResultPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](../RouteResult.html), [RouteResult](../RouteResult.html)]): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
40. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapRouteResultWith(f:akka.http.scaladsl.server.RouteResult=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResultWith(f: ([RouteResult](../RouteResult.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](../RouteResult.html)]): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
41. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapRouteResultWithPF(f:PartialFunction[akka.http.scaladsl.server.RouteResult,scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]]):akka.http.scaladsl.server.Directive0 "Permalink")  def mapRouteResultWithPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](../RouteResult.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](../RouteResult.html)]]): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
42. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapSettings(f:akka.http.scaladsl.settings.RoutingSettings=>akka.http.scaladsl.settings.RoutingSettings):akka.http.scaladsl.server.Directive0 "Permalink")  def mapSettings(f: ([RoutingSettings](../../settings/RoutingSettings.html)) \=\> [RoutingSettings](../../settings/RoutingSettings.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs the inner route with settings mapped by the given function.

Runs the inner route with settings mapped by the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
43. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#mapUnmatchedPath(f:akka.http.scaladsl.model.Uri.Path=>akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.server.Directive0 "Permalink")  def mapUnmatchedPath(f: ([Path](../../model/Uri$$Path.html)) \=\> [Path](../../model/Uri$$Path.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Transforms the unmatchedPath of the RequestContext using the given function.

Transforms the unmatchedPath of the RequestContext using the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
44. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
45. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
46. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
47. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#pass:akka.http.scaladsl.server.Directive0 "Permalink")  def pass: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])A Directive0 that always passes the request on to its inner route
(i.e.

A Directive0 that always passes the request on to its inner route
(i.e. does nothing with the request or the response).

Definition Classes[BasicDirectives](BasicDirectives.html)
48. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#provide[T](value:T):akka.http.scaladsl.server.Directive1[T] "Permalink")  def provide\[T](value: T): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Injects the given value into a directive.

Injects the given value into a directive.

Definition Classes[BasicDirectives](BasicDirectives.html)
49. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#recoverRejections(f:Seq[akka.http.scaladsl.server.Rejection]=>akka.http.scaladsl.server.RouteResult):akka.http.scaladsl.server.Directive0 "Permalink")  def recoverRejections(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](../Rejection.html)]) \=\> [RouteResult](../RouteResult.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
50. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#recoverRejectionsWith(f:Seq[akka.http.scaladsl.server.Rejection]=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]):akka.http.scaladsl.server.Directive0 "Permalink")  def recoverRejectionsWith(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Rejection](../Rejection.html)]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RouteResult](../RouteResult.html)]): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Definition Classes[BasicDirectives](BasicDirectives.html)
51. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
52. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#textract[L](f:akka.http.scaladsl.server.RequestContext=>L)(implicitevidence$2:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def textract\[L](f: ([RequestContext](../RequestContext.html)) \=\> L)(implicit arg0: [Tuple](../util/Tuple.html)\[L]): [Directive](../Directive.html)\[L]Extracts a number of values using the given function.

Extracts a number of values using the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
53. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long):akka.http.scaladsl.server.Directive0 "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.scaladsl.server.RequestContext](../RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
54. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.server.Directive0 "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.scaladsl.server.RequestContext](../RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
55. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
56. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#tprovide[L](values:L)(implicitevidence$1:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def tprovide\[L](values: L)(implicit arg0: [Tuple](../util/Tuple.html)\[L]): [Directive](../Directive.html)\[L]Injects the given values into a directive.

Injects the given values into a directive.

Definition Classes[BasicDirectives](BasicDirectives.html)
57. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
58. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
59. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
60. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#withExecutionContext(ec:scala.concurrent.ExecutionContextExecutor):akka.http.scaladsl.server.Directive0 "Permalink")  def withExecutionContext(ec: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs its inner route with the given alternative [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).

Runs its inner route with the given alternative [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
61. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#withLog(log:akka.event.LoggingAdapter):akka.http.scaladsl.server.Directive0 "Permalink")  def withLog(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs its inner route with the given alternative [akka.event.LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html).

Runs its inner route with the given alternative [akka.event.LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
62. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#withMaterializer(materializer:akka.stream.Materializer):akka.http.scaladsl.server.Directive0 "Permalink")  def withMaterializer(materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs its inner route with the given alternative [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html).

Runs its inner route with the given alternative [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
63. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#withSettings(settings:akka.http.scaladsl.settings.RoutingSettings):akka.http.scaladsl.server.Directive0 "Permalink")  def withSettings(settings: [RoutingSettings](../../settings/RoutingSettings.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Runs its inner route with the given alternative RoutingSettings.

Runs its inner route with the given alternative RoutingSettings.

Definition Classes[BasicDirectives](BasicDirectives.html)
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/BasicDirectives$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [BasicDirectives](BasicDirectives.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Basic directives

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationResult$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ExecutionDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives$.html)*