---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.RouteDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/RouteDirectives$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.RouteDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.RouteDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.RouteDirectives

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
[o](RouteDirectives.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# [RouteDirectives](RouteDirectives.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html "Permalink")

### Companion [trait RouteDirectives](RouteDirectives.html "See companion trait")

#### object RouteDirectives extends [RouteDirectives](RouteDirectives.html)

Source[RouteDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/RouteDirectives.scala#L157)Linear Supertypes[RouteDirectives](RouteDirectives.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. RouteDirectives
2. RouteDirectives
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#complete[T](status:akka.http.scaladsl.model.StatusCode,headers:Seq[akka.http.scaladsl.model.HttpHeader],v:=>T)(implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.server.StandardRoute "Permalink")  def complete\[T](status: [StatusCode](../../model/StatusCode.html), headers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../../model/HttpHeader.html)], v: \=\> T)(implicit m: [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [StandardRoute](../StandardRoute.html)Completes the request using the given arguments.

Completes the request using the given arguments.

Definition Classes[RouteDirectives](RouteDirectives.html)
7. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#complete[T](status:akka.http.scaladsl.model.StatusCode,v:=>T)(implicitm:akka.http.scaladsl.marshalling.ToEntityMarshaller[T]):akka.http.scaladsl.server.StandardRoute "Permalink")  def complete\[T](status: [StatusCode](../../model/StatusCode.html), v: \=\> T)(implicit m: [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[T]): [StandardRoute](../StandardRoute.html)Completes the request using the given arguments.

Completes the request using the given arguments.

Definition Classes[RouteDirectives](RouteDirectives.html)
8. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#complete(m:=>akka.http.scaladsl.marshalling.ToResponseMarshallable):akka.http.scaladsl.server.StandardRoute "Permalink")  def complete(m: \=\> [ToResponseMarshallable](../../marshalling/ToResponseMarshallable.html)): [StandardRoute](../StandardRoute.html)Completes the request using the given arguments.

Completes the request using the given arguments.

Definition Classes[RouteDirectives](RouteDirectives.html)
9. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#failWith(error:Throwable):akka.http.scaladsl.server.StandardRoute "Permalink")  def failWith(error: Throwable): [StandardRoute](../StandardRoute.html)Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`
directive and its ExceptionHandler.

Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`
directive and its ExceptionHandler.

Definition Classes[RouteDirectives](RouteDirectives.html)
12. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#handle(handler:PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]],rejections:Seq[akka.http.scaladsl.server.Rejection]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handle(handler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](../../model/HttpRequest.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](../../model/HttpResponse.html)]], rejections: Seq\[[Rejection](../Rejection.html)]): [StandardRoute](../StandardRoute.html)Handle the request using an asynchronous partial function.

Handle the request using an asynchronous partial function.

This directive can be used to include external components request processing components defined as PartialFunction
(like those provided by akka\-grpc) into a routing tree defined as routes.

rejectionsThe list of rejections to reject with if the handler is not defined for a request.

Definition Classes[RouteDirectives](RouteDirectives.html)
14. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#handle(handler:PartialFunction[akka.http.scaladsl.model.HttpRequest,scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handle(handler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](../../model/HttpRequest.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](../../model/HttpResponse.html)]]): [StandardRoute](../StandardRoute.html)Handle the request using an asynchronous partial function.

Handle the request using an asynchronous partial function.

This directive can be used to include external components request processing components defined as PartialFunction
(like those provided by akka\-grpc) into a routing tree defined as routes.

When the partial function is not defined for a request, the request is rejected with an empty list of rejections
which is equivalent to a "Not Found" rejection.

Definition Classes[RouteDirectives](RouteDirectives.html)
15. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#handle(handler:akka.http.scaladsl.model.HttpRequest=>scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handle(handler: ([HttpRequest](../../model/HttpRequest.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](../../model/HttpResponse.html)]): [StandardRoute](../StandardRoute.html)Handle the request using a function.

Handle the request using a function.

Definition Classes[RouteDirectives](RouteDirectives.html)
16. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#handleSync(handler:PartialFunction[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse],rejections:Seq[akka.http.scaladsl.server.Rejection]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handleSync(handler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](../../model/HttpRequest.html), [HttpResponse](../../model/HttpResponse.html)], rejections: Seq\[[Rejection](../Rejection.html)]): [StandardRoute](../StandardRoute.html)Handle the request using a synchronous partial function.

Handle the request using a synchronous partial function.

This directive can be used to include external components request processing components defined as PartialFunction
(like those provided by akka\-grpc) into a routing tree defined as routes.

rejectionsThe list of rejections to reject with if the handler is not defined for a request.

Definition Classes[RouteDirectives](RouteDirectives.html)
17. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#handleSync(handler:PartialFunction[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse]):akka.http.scaladsl.server.StandardRoute "Permalink")  def handleSync(handler: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpRequest](../../model/HttpRequest.html), [HttpResponse](../../model/HttpResponse.html)]): [StandardRoute](../StandardRoute.html)Handle the request using a synchronous partial function.

Handle the request using a synchronous partial function.

This directive can be used to include external components request processing components defined as PartialFunction
(like those provided by akka\-grpc) into a routing tree defined as routes.

When the partial function is not defined for a request, the request is rejected with an empty list of rejections
which is equivalent to a "Not Found" rejection.

Definition Classes[RouteDirectives](RouteDirectives.html)
18. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#handleSync(handler:akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpResponse):akka.http.scaladsl.server.StandardRoute "Permalink")  def handleSync(handler: ([HttpRequest](../../model/HttpRequest.html)) \=\> [HttpResponse](../../model/HttpResponse.html)): [StandardRoute](../StandardRoute.html)Handle the request using a function.

Handle the request using a function.

Definition Classes[RouteDirectives](RouteDirectives.html)
19. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#redirect(uri:akka.http.scaladsl.model.Uri,redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.StandardRoute "Permalink")  def redirect(uri: [Uri](../../model/Uri.html), redirectionType: [Redirection](../../model/StatusCodes$$Redirection.html)): [StandardRoute](../StandardRoute.html)Completes the request with redirection response of the given type to the given URI.

Completes the request with redirection response of the given type to the given URI.

Definition Classes[RouteDirectives](RouteDirectives.html)
25. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#reject(rejections:akka.http.scaladsl.server.Rejection*):akka.http.scaladsl.server.StandardRoute "Permalink")  def reject(rejections: [Rejection](../Rejection.html)\*): [StandardRoute](../StandardRoute.html)Rejects the request with the given rejections.

Rejects the request with the given rejections.

Definition Classes[RouteDirectives](RouteDirectives.html)
26. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#reject:akka.http.scaladsl.server.StandardRoute "Permalink")  def reject: [StandardRoute](../StandardRoute.html)Rejects the request with an empty set of rejections.

Rejects the request with an empty set of rejections.

Definition Classes[RouteDirectives](RouteDirectives.html)
27. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/RouteDirectives$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [RouteDirectives](RouteDirectives.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Route directives

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$Redirection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/StandardRoute.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectivesInstances.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives$.html)*