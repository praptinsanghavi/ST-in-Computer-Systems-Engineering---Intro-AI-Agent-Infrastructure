---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.HostDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:18:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/directives/HostDirectives.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.HostDirectives
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.HostDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.HostDirectives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[javadsl](../../index.html)
- [**](../../../../../akka/http/javadsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [AttributeDirectives](AttributeDirectives.html)
- [BasicDirectives](BasicDirectives.html)
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
- HostDirectives
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

# HostDirectives[**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html "Permalink")

### 

#### abstract  class HostDirectives extends [AttributeDirectives](AttributeDirectives.html)

Source[HostDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/server/directives/HostDirectives.scala#L19)Linear Supertypes[AttributeDirectives](AttributeDirectives.html), [HeaderDirectives](HeaderDirectives.html), [FutureDirectives](FutureDirectives.html), [FormFieldDirectives](FormFieldDirectives.html), [FileUploadDirectives](FileUploadDirectives.html), [FileAndResourceDirectives](FileAndResourceDirectives.html), [ExecutionDirectives](ExecutionDirectives.html), [DebuggingDirectives](DebuggingDirectives.html), [CookieDirectives](CookieDirectives.html), [CodingDirectives](CodingDirectives.html), [CacheConditionDirectives](CacheConditionDirectives.html), [BasicDirectives](BasicDirectives.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AllDirectives](../AllDirectives.html), [Directives](../Directives$.html), [CorsDirectives](CorsDirectives.html), [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html), [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives$.html), [MarshallingDirectives](MarshallingDirectives.html), [MethodDirectives](MethodDirectives.html), [MiscDirectives](MiscDirectives.html), [ParameterDirectives](ParameterDirectives.html), [PathDirectives](PathDirectives.html), [RangeDirectives](RangeDirectives.html), [RespondWithDirectives](RespondWithDirectives.html), [RouteDirectives](RouteDirectives.html), [SchemeDirectives](SchemeDirectives.html), [SecurityDirectives](SecurityDirectives.html), [TimeoutDirectives](TimeoutDirectives.html), [TlsDirectives](TlsDirectives.html), [WebSocketDirectives](WebSocketDirectives.html), [JUnitRouteTest](../../testkit/JUnitRouteTest.html), [JUnitRouteTestBase](../../testkit/JUnitRouteTestBase.html), [RouteTest](../../testkit/RouteTest.html), [HttpApp](../HttpApp.html)Type Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. HostDirectives
2. AttributeDirectives
3. HeaderDirectives
4. FutureDirectives
5. FormFieldDirectives
6. FileUploadDirectives
7. FileAndResourceDirectives
8. ExecutionDirectives
9. DebuggingDirectives
10. CookieDirectives
11. CodingDirectives
12. CacheConditionDirectives
13. BasicDirectives
14. AnyRef
15. Any
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

1. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#<init>():akka.http.javadsl.server.directives.HostDirectives "Permalink")  new HostDirectives()
### Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HostDirectives toany2stringadd\[HostDirectives] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HostDirectives, B)ImplicitThis member is added by an implicit conversion from HostDirectives toArrowAssoc\[HostDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#attribute[T](key:akka.http.javadsl.model.AttributeKey[T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def attribute\[T](key: [AttributeKey](../../model/AttributeKey.html)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the value of the request attribute with the given key.

Extracts the value of the request attribute with the given key.
If no attribute is found the request is rejected with a [akka.http.javadsl.server.MissingAttributeRejection](../MissingAttributeRejection.html).

Definition Classes[AttributeDirectives](AttributeDirectives.html)
8. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#cancelRejection(rejection:akka.http.javadsl.server.Rejection,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cancelRejection(rejection: [Rejection](../Rejection.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a TransformationRejection cancelling all rejections equal to the given one
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections equal to the given one
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](BasicDirectives.html)
9. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#cancelRejections(filter:java.util.function.Predicate[akka.http.javadsl.server.Rejection],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cancelRejections(filter: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[[Rejection](../Rejection.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](BasicDirectives.html)
10. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#cancelRejections(classes:Iterable[Class[_]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cancelRejections(classes: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[Class\[\_]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a TransformationRejection cancelling all rejections of one of the given classes
to the list of rejections potentially coming back from the inner route.

Adds a TransformationRejection cancelling all rejections of one of the given classes
to the list of rejections potentially coming back from the inner route.

Definition Classes[BasicDirectives](BasicDirectives.html)
11. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#checkSameOrigin(allowed:akka.http.javadsl.model.headers.HttpOriginRange,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def checkSameOrigin(allowed: [HttpOriginRange](../../model/headers/HttpOriginRange.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Checks that request comes from the same origin.

Checks that request comes from the same origin. Extracts the Origin header value and verifies that
allowed range contains the obtained value. In the case of absent of the Origin header rejects
with [MissingHeaderRejection](../MissingHeaderRejection.html). If the origin value is not in the allowed range
rejects with an [InvalidOriginRejection](../InvalidOriginRejection.html) and StatusCodes.FORBIDDEN status.

Definition Classes[HeaderDirectives](HeaderDirectives.html)
12. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#completeOrRecoverWith[T](f:java.util.function.Supplier[java.util.concurrent.CompletionStage[T]],marshaller:akka.http.javadsl.marshalling.Marshaller[T,akka.http.javadsl.model.RequestEntity],inner:java.util.function.Function[Throwable,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def completeOrRecoverWith\[T](f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], marshaller: [Marshaller](../../marshalling/Marshaller.html)\[T, [RequestEntity](../../model/RequestEntity.html)], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Throwable, [Route](../Route.html)]): [Route](../Route.html)"Unwraps" a `CompletionStage<T>` and runs the inner route when the stage has failed
with the stage's failure exception as an extraction of type `Throwable`.

"Unwraps" a `CompletionStage<T>` and runs the inner route when the stage has failed
with the stage's failure exception as an extraction of type `Throwable`.
If the completion stage succeeds the request is completed using the values marshaller
(This directive therefore requires a marshaller for the completion stage value type to be
provided.)

Definition Classes[FutureDirectives](FutureDirectives.html)
14. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#conditional(eTag:java.util.Optional[akka.http.javadsl.model.headers.EntityTag],lastModified:java.util.Optional[akka.http.javadsl.model.DateTime],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def conditional(eTag: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[EntityTag](../../model/headers/EntityTag.html)], lastModified: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[DateTime](../../model/DateTime.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](CacheConditionDirectives.html)
15. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#conditional(eTag:akka.http.javadsl.model.headers.EntityTag,lastModified:akka.http.javadsl.model.DateTime,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def conditional(eTag: [EntityTag](../../model/headers/EntityTag.html), lastModified: [DateTime](../../model/DateTime.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](CacheConditionDirectives.html)
16. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#conditional(lastModified:akka.http.javadsl.model.DateTime,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def conditional(lastModified: [DateTime](../../model/DateTime.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](CacheConditionDirectives.html)
17. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#conditional(eTag:akka.http.javadsl.model.headers.EntityTag,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def conditional(eTag: [EntityTag](../../model/headers/EntityTag.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

Wraps its inner route with support for Conditional Requests as defined
by http://tools.ietf.org/html/rfc7232

In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
is implemented by this directive.

Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
must be on a deeper level in your route structure in order to function correctly.

Definition Classes[CacheConditionDirectives](CacheConditionDirectives.html)
18. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#cookie(name:String,inner:java.util.function.Function[akka.http.javadsl.model.headers.HttpCookiePair,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def cookie(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpCookiePair](../../model/headers/HttpCookiePair.html), [Route](../Route.html)]): [Route](../Route.html)Extracts the HttpCookiePair with the given name.

Extracts the HttpCookiePair with the given name. If the cookie is not present the
request is rejected with a respective [akka.http.javadsl.server.MissingCookieRejection](../MissingCookieRejection.html).

Definition Classes[CookieDirectives](CookieDirectives.html)
19. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#decodeRequest(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def decodeRequest(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Decompresses the incoming request if it is `gzip` or `deflate` compressed.

Decompresses the incoming request if it is `gzip` or `deflate` compressed.
Uncompressed requests are passed through untouched.
If the request encoded with another encoding the request is rejected with an `UnsupportedRequestEncodingRejection`.

Definition Classes[CodingDirectives](CodingDirectives.html)
20. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#decodeRequestWith(coders:Iterable[akka.http.javadsl.coding.Coder],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def decodeRequestWith(coders: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Coder](../../coding/Coder.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Decodes the incoming request if it is encoded with one of the given
encoders.

Decodes the incoming request if it is encoded with one of the given
encoders. If the request encoding doesn't match one of the given encoders
the request is rejected with an `UnsupportedRequestEncodingRejection`.
If no decoders are given the default encoders (`Gzip`, `Deflate`, `NoCoding`) are used.

Definition Classes[CodingDirectives](CodingDirectives.html)
21. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#decodeRequestWith(coder:akka.http.javadsl.coding.Coder,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def decodeRequestWith(coder: [Coder](../../coding/Coder.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Decodes the incoming request using the given Decoder.

Decodes the incoming request using the given Decoder.
If the request encoding doesn't match the request is rejected with an `UnsupportedRequestEncodingRejection`.

Definition Classes[CodingDirectives](CodingDirectives.html)
22. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#defaultContentTypeResolver:akka.http.javadsl.server.directives.ContentTypeResolver "Permalink")  def defaultContentTypeResolver: [ContentTypeResolver](ContentTypeResolver.html)Default [ContentTypeResolver](ContentTypeResolver.html).

Default [ContentTypeResolver](ContentTypeResolver.html).

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
23. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#defaultDirectoryRenderer:akka.http.javadsl.server.directives.DirectoryRenderer "Permalink")  def defaultDirectoryRenderer: [DirectoryRenderer](DirectoryRenderer.html)Default [DirectoryRenderer](DirectoryRenderer.html) to be used with directory listing directives.

Default [DirectoryRenderer](DirectoryRenderer.html) to be used with directory listing directives.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
24. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#deleteCookie(name:String,domain:String,path:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(name: String, domain: String, path: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the cookie with the given properties.

Adds a Set\-Cookie response header expiring the cookie with the given properties.

nameName of the cookie to match

domainDomain of the cookie to match, or empty string to match any domain

pathPath of the cookie to match, or empty string to match any path

Definition Classes[CookieDirectives](CookieDirectives.html)
25. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#deleteCookie(name:String,domain:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(name: String, domain: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the cookie with the given properties.

Adds a Set\-Cookie response header expiring the cookie with the given properties.

nameName of the cookie to match

domainDomain of the cookie to match, or empty string to match any domain

Definition Classes[CookieDirectives](CookieDirectives.html)
26. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#deleteCookie(name:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(name: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the cookie with the given properties.

Adds a Set\-Cookie response header expiring the cookie with the given properties.

nameName of the cookie to match

Definition Classes[CookieDirectives](CookieDirectives.html)
27. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#deleteCookie(cookies:Iterable[akka.http.javadsl.model.headers.HttpCookie],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(cookies: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpCookie](../../model/headers/HttpCookie.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the given cookies.

Adds a Set\-Cookie response header expiring the given cookies.

Definition Classes[CookieDirectives](CookieDirectives.html)
28. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#deleteCookie(cookie:akka.http.javadsl.model.headers.HttpCookie,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def deleteCookie(cookie: [HttpCookie](../../model/headers/HttpCookie.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header expiring the given cookie.

Adds a Set\-Cookie response header expiring the given cookie.

Definition Classes[CookieDirectives](CookieDirectives.html)
29. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#encodeResponse(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def encodeResponse(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header.

Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header. The response encoding is determined by the rules specified in
http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.

If the `Accept-Encoding` header is missing or empty or specifies an encoding other than
identity, gzip or deflate then no encoding is used.

Definition Classes[CodingDirectives](CodingDirectives.html)
30. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#encodeResponseWith(coders:Iterable[akka.http.javadsl.coding.Coder],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def encodeResponseWith(coders: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Coder](../../coding/Coder.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header.

Encodes the response with the encoding that is requested by the client via the `Accept-
Encoding` header. The response encoding is determined by the rules specified in
http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.

If the `Accept-Encoding` header is missing then the response is encoded using the `first`
encoder.

If the `Accept-Encoding` header is empty and `NoCoding` is part of the encoders then no
response encoding is used. Otherwise the request is rejected.

If \[encoders] is empty, no encoding is performed.

Definition Classes[CodingDirectives](CodingDirectives.html)
31. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HostDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HostDirectivesImplicitThis member is added by an implicit conversion from HostDirectives toEnsuring\[HostDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
32. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HostDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HostDirectivesImplicitThis member is added by an implicit conversion from HostDirectives toEnsuring\[HostDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
33. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HostDirectivesImplicitThis member is added by an implicit conversion from HostDirectives toEnsuring\[HostDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
34. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HostDirectivesImplicitThis member is added by an implicit conversion from HostDirectives toEnsuring\[HostDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
35. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
37. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extract[T](extract:java.util.function.Function[akka.http.javadsl.server.RequestContext,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extract\[T](extract: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestContext](../RequestContext.html), T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Extracts a single value using the given function.

Extracts a single value using the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
38. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractActorSystem(inner:java.util.function.Function[akka.actor.ActorSystem,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractActorSystem(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), [Route](../Route.html)]): [Route](../Route.html)Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).

Extracts the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html) if the available Materializer is an [akka.stream.ActorMaterializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html).
Otherwise throws an exception as it won't be able to extract the system from arbitrary materializers.

Definition Classes[BasicDirectives](BasicDirectives.html)
39. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractDataBytes(inner:java.util.function.Function[akka.stream.javadsl.Source[akka.util.ByteString,Any],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractDataBytes(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the entities `dataBytes` [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Extracts the entities `dataBytes` [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
40. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractEntity(inner:java.util.function.Function[akka.http.javadsl.model.RequestEntity,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractEntity(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestEntity](../../model/RequestEntity.html), [Route](../Route.html)]): [Route](../Route.html)Extracts the current http request entity.

Extracts the current http request entity.

Definition Classes[BasicDirectives](BasicDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
41. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractExecutionContext(inner:java.util.function.Function[scala.concurrent.ExecutionContextExecutor,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractExecutionContext(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor), [Route](../Route.html)]): [Route](../Route.html)Extracts the ExecutionContextExecutor from the [RequestContext](../RequestContext.html).

Extracts the ExecutionContextExecutor from the [RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
42. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractHost(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractHost(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Extracts the hostname part of the Host request header value.
43. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractLog(inner:java.util.function.Function[akka.event.LoggingAdapter,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractLog(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), [Route](../Route.html)]): [Route](../Route.html)Extracts the LoggingAdapter

Extracts the LoggingAdapter

Definition Classes[BasicDirectives](BasicDirectives.html)
44. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractMatchedPath(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractMatchedPath(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the already matched path from the RequestContext.

Extracts the already matched path from the RequestContext.

Definition Classes[BasicDirectives](BasicDirectives.html)
45. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractMaterializer(inner:java.util.function.Function[akka.stream.Materializer,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractMaterializer(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer), [Route](../Route.html)]): [Route](../Route.html)Extracts the Materializer from the [RequestContext](../RequestContext.html).

Extracts the Materializer from the [RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
46. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractParserSettings(inner:java.util.function.Function[akka.http.javadsl.settings.ParserSettings,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractParserSettings(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ParserSettings](../../settings/ParserSettings.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the [akka.http.javadsl.settings.ParserSettings](../../settings/ParserSettings.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Extracts the [akka.http.javadsl.settings.ParserSettings](../../settings/ParserSettings.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
47. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractRequest(inner:java.util.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractRequest(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the current HttpRequest instance.

Extracts the current HttpRequest instance.

Definition Classes[BasicDirectives](BasicDirectives.html)
48. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractRequestContext(inner:java.util.function.Function[akka.http.javadsl.server.RequestContext,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractRequestContext(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestContext](../RequestContext.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself.

Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself.

Definition Classes[BasicDirectives](BasicDirectives.html)
49. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractRequestEntity(inner:java.util.function.Function[akka.http.javadsl.model.RequestEntity,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractRequestEntity(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestEntity](../../model/RequestEntity.html), [Route](../Route.html)]): [Route](../Route.html)Extracts the [akka.http.javadsl.model.RequestEntity](../../model/RequestEntity.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Extracts the [akka.http.javadsl.model.RequestEntity](../../model/RequestEntity.html) from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
50. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractSettings(inner:java.util.function.Function[akka.http.javadsl.settings.RoutingSettings,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractSettings(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RoutingSettings](../../settings/RoutingSettings.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the RoutingSettings from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Extracts the RoutingSettings from the [akka.http.javadsl.server.RequestContext](../RequestContext.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
51. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long,inner:java.util.function.Function[akka.http.javadsl.model.HttpEntity.Strict,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Strict, [Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.javadsl.server.RequestContext](../RequestContext.html) into an
akka.http.javadsl.model.HttpEntity.Strict and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
52. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,inner:java.util.function.Function[akka.http.javadsl.model.HttpEntity.Strict,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def extractStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Strict, [Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Converts the HttpEntity from the [akka.http.javadsl.server.RequestContext](../RequestContext.html) into an
akka.http.javadsl.model.HttpEntity.Strict and extracts it, or fails the route if unable to drain the
entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
53. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractUnmatchedPath(inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractUnmatchedPath(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the yet unmatched path from the RequestContext.

Extracts the yet unmatched path from the RequestContext.

Definition Classes[BasicDirectives](BasicDirectives.html)
54. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#extractUri(inner:java.util.function.Function[akka.http.javadsl.model.Uri,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def extractUri(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Uri](../../model/Uri.html), [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the complete request URI.

Extracts the complete request URI.

Definition Classes[BasicDirectives](BasicDirectives.html)
55. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#fileUpload(fieldName:String,inner:java.util.function.BiFunction[akka.http.javadsl.server.directives.FileInfo,akka.stream.javadsl.Source[akka.util.ByteString,Any],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def fileUpload(fieldName: String, inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[FileInfo](FileInfo.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], [Route](../Route.html)]): [Route](../Route.html)Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere.

Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere. If there is no such field the request will be rejected,
if there are multiple file parts with the same name, the first one will be used and the subsequent
ones ignored.

Definition Classes[FileUploadDirectives](FileUploadDirectives.html)
56. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#fileUploadAll(fieldName:String,inner:java.util.function.Function[java.util.List[java.util.Map.Entry[akka.http.javadsl.server.directives.FileInfo,akka.stream.javadsl.Source[akka.util.ByteString,Any]]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def fileUploadAll(fieldName: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Entry\[[FileInfo](FileInfo.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]], [Route](../Route.html)]): [Route](../Route.html)Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere.

Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
for streaming the file contents somewhere. If there is no such field the request will be rejected.
Files are buffered into temporary files on disk so in\-memory buffers don't overflow. The temporary
files are cleaned up once materialized, or on exit if the stream is not consumed.

Definition Classes[FileUploadDirectives](FileUploadDirectives.html)
57. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formField[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],name:String,inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formField\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)
58. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formField(name:String,inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formField(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)
59. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formFieldList(inner:java.util.function.Function[java.util.List[java.util.Map.Entry[String,String]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldList(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Entry\[String, String]], [Route](../Route.html)]): [Route](../Route.html)Extracts HTTP form fields from the request as a `Map.Entry<String, String>>`.

Extracts HTTP form fields from the request as a `Map.Entry<String, String>>`.

Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
60. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formFieldList[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],name:String,inner:java.util.function.Function[java.util.List[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldList\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
61. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formFieldList(name:String,inner:java.util.function.Function[java.util.List[String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldList(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[String], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
62. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formFieldMap(inner:java.util.function.Function[java.util.Map[String,String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldMap(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String], [Route](../Route.html)]): [Route](../Route.html)Extracts HTTP form fields from the request as a `Map<String, String>`.

Extracts HTTP form fields from the request as a `Map<String, String>`.

Definition Classes[FormFieldDirectives](FormFieldDirectives.html)
63. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formFieldMultiMap(inner:java.util.function.Function[java.util.Map[String,java.util.List[String]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldMultiMap(inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[String]], [Route](../Route.html)]): [Route](../Route.html)Extracts HTTP form fields from the request as a `Map<String, List<String>>`.

Extracts HTTP form fields from the request as a `Map<String, List<String>>`.

Definition Classes[FormFieldDirectives](FormFieldDirectives.html)
64. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formFieldOptional[T](t:akka.http.javadsl.unmarshalling.Unmarshaller[String,T],name:String,inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldOptional\[T](t: [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[String, T], name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
65. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formFieldOptional(name:String,inner:java.util.function.Function[java.util.Optional[String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def formFieldOptional(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], [Route](../Route.html)]): [Route](../Route.html)Definition Classes[FormFieldDirectives](FormFieldDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
66. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
67. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromBrowseableDirectories(directories:String*):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: String\*): [Route](../Route.html)Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)Annotations@varargs()
68. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromBrowseableDirectories(directories:Iterable[String],resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String], resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
69. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromBrowseableDirectories(directories:Iterable[String],renderer:akka.http.javadsl.server.directives.DirectoryRenderer):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String], renderer: [DirectoryRenderer](DirectoryRenderer.html)): [Route](../Route.html)Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
70. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromBrowseableDirectories(directories:Iterable[String],renderer:akka.http.javadsl.server.directives.DirectoryRenderer,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String], renderer: [DirectoryRenderer](DirectoryRenderer.html), resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
71. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromBrowseableDirectory(directory:String):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String): [Route](../Route.html)Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
72. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromBrowseableDirectory(directory:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
73. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromBrowseableDirectory(directory:String,renderer:akka.http.javadsl.server.directives.DirectoryRenderer):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String, renderer: [DirectoryRenderer](DirectoryRenderer.html)): [Route](../Route.html)Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
74. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromBrowseableDirectory(directory:String,renderer:akka.http.javadsl.server.directives.DirectoryRenderer,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String, renderer: [DirectoryRenderer](DirectoryRenderer.html), resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
75. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromDirectory(directoryPath:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromDirectory(directoryPath: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Completes GET requests with the content of a file underneath the given directory, using the given content\-type resolver.

Completes GET requests with the content of a file underneath the given directory, using the given content\-type resolver.
If the file cannot be read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
76. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromDirectory(directoryPath:String):akka.http.javadsl.server.Route "Permalink")  def getFromDirectory(directoryPath: String): [Route](../Route.html)Completes GET requests with the content of a file underneath the given directory, using the default content\-type resolver.

Completes GET requests with the content of a file underneath the given directory, using the default content\-type resolver.
If the file cannot be read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
77. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromFile(file:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Completes GET requests with the content of the given file, resolving the content type using the given resolver.

Completes GET requests with the content of the given file, resolving the content type using the given resolver.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
78. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromFile(file:String):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: String): [Route](../Route.html)Completes GET requests with the content of the given file, resolving the content type using the default resolver.

Completes GET requests with the content of the given file, resolving the content type using the default resolver.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
79. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromFile(file:java.io.File,contentType:akka.http.javadsl.model.ContentType):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), contentType: [ContentType](../../model/ContentType.html)): [Route](../Route.html)Completes GET requests with the content of the given file, using the content type.

Completes GET requests with the content of the given file, using the content type.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
80. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromFile(file:java.io.File,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Completes GET requests with the content of the given file, resolving the content type using the given resolver.

Completes GET requests with the content of the given file, resolving the content type using the given resolver.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
81. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromFile(file:java.io.File):akka.http.javadsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)): [Route](../Route.html)Completes GET requests with the content of the given file, resolving the content type using the default resolver.

Completes GET requests with the content of the given file, resolving the content type using the default resolver.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
82. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromResource(path:String,contentType:akka.http.javadsl.model.ContentType,classLoader:ClassLoader):akka.http.javadsl.server.Route "Permalink")  def getFromResource(path: String, contentType: [ContentType](../../model/ContentType.html), classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader)): [Route](../Route.html)Completes GET requests with the content of the given resource loaded from the given ClassLoader,
with the given content type.

Completes GET requests with the content of the given resource loaded from the given ClassLoader,
with the given content type.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
83. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromResource(path:String,contentType:akka.http.javadsl.model.ContentType):akka.http.javadsl.server.Route "Permalink")  def getFromResource(path: String, contentType: [ContentType](../../model/ContentType.html)): [Route](../Route.html)Completes GET requests with the content of the given resource loaded from the default ClassLoader,
with the given content type.

Completes GET requests with the content of the given resource loaded from the default ClassLoader,
with the given content type.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
84. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromResource(path:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromResource(path: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Completes GET requests with the content of the given resource loaded from the default ClassLoader,
using the given content type resolver.

Completes GET requests with the content of the given resource loaded from the default ClassLoader,
using the given content type resolver.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
85. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromResource(path:String):akka.http.javadsl.server.Route "Permalink")  def getFromResource(path: String): [Route](../Route.html)Completes GET requests with the content of the given resource loaded from the default ClassLoader,
using the default content type resolver.

Completes GET requests with the content of the given resource loaded from the default ClassLoader,
using the default content type resolver.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
86. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromResourceDirectory(directoryName:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver,classLoader:ClassLoader):akka.http.javadsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String, resolver: [ContentTypeResolver](ContentTypeResolver.html), classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader)): [Route](../Route.html)Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the given ClassLoader, resolving content type using the given content type
resolver.

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the given ClassLoader, resolving content type using the given content type
resolver.

If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
87. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromResourceDirectory(directoryName:String,resolver:akka.http.javadsl.server.directives.ContentTypeResolver):akka.http.javadsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String, resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../Route.html)Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the default ClassLoader, resolving content type using the given content type
resolver.

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the default ClassLoader, resolving content type using the given content type
resolver.

If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
88. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromResourceDirectory(directoryName:String,classLoader:ClassLoader):akka.http.javadsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String, classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader)): [Route](../Route.html)Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the given ClassLoader, resolving content type using the default content type
resolver.

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the given ClassLoader, resolving content type using the default content type
resolver.

If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
89. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#getFromResourceDirectory(directoryName:String):akka.http.javadsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String): [Route](../Route.html)Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the default ClassLoader, resolving content type using the default content type
resolver.

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory", using the default ClassLoader, resolving content type using the default content type
resolver.

If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
90. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#handleExceptions(handler:akka.http.javadsl.server.ExceptionHandler,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def handleExceptions(handler: [ExceptionHandler](../ExceptionHandler.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Transforms exceptions thrown during evaluation of its inner route using the given
[akka.http.javadsl.server.ExceptionHandler](../ExceptionHandler.html).

Transforms exceptions thrown during evaluation of its inner route using the given
[akka.http.javadsl.server.ExceptionHandler](../ExceptionHandler.html).

Definition Classes[ExecutionDirectives](ExecutionDirectives.html)
91. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#handleRejections(handler:akka.http.javadsl.server.RejectionHandler,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def handleRejections(handler: [RejectionHandler](../RejectionHandler.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Transforms rejections produced by its inner route using the given
[akka.http.scaladsl.server.RejectionHandler](../../../scaladsl/server/RejectionHandler.html).

Transforms rejections produced by its inner route using the given
[akka.http.scaladsl.server.RejectionHandler](../../../scaladsl/server/RejectionHandler.html).

Definition Classes[ExecutionDirectives](ExecutionDirectives.html)
92. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
93. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#headerValue[T](f:java.util.function.Function[akka.http.javadsl.model.HttpHeader,java.util.Optional[T]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def headerValue\[T](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpHeader](../../model/HttpHeader.html), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts an HTTP header value using the given function.

Extracts an HTTP header value using the given function. If the function result is undefined for all headers the
request is rejected with an empty rejection set. If the given function throws an exception the request is rejected
with a [akka.http.javadsl.server.MalformedHeaderRejection](../MalformedHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
94. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#headerValueByName(headerName:String,inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def headerValueByName(headerName: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the value of the first HTTP request header with the given name.

Extracts the value of the first HTTP request header with the given name.
If no header with a matching name is found the request is rejected with a [akka.http.javadsl.server.MissingHeaderRejection](../MissingHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
95. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#headerValueByType[T<:akka.http.javadsl.model.HttpHeader](t:Class[T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def headerValueByType\[T \<: [HttpHeader](../../model/HttpHeader.html)](t: Class\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the first HTTP request header of the given type.

Extracts the first HTTP request header of the given type.
If no header with a matching type is found the request is rejected with a [akka.http.javadsl.server.MissingHeaderRejection](../MissingHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
96. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#headerValuePF[T](pf:PartialFunction[akka.http.javadsl.model.HttpHeader,T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def headerValuePF\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpHeader](../../model/HttpHeader.html), T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts an HTTP header value using the given partial function.

Extracts an HTTP header value using the given partial function. If the function is undefined for all headers the
request is rejected with an empty rejection set.

Definition Classes[HeaderDirectives](HeaderDirectives.html)
97. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#host(regex:java.util.regex.Pattern,inner:java.util.function.Function[String,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def host(regex: [Pattern](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#java.util.regex.Pattern), inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Route](../Route.html)]): [Route](../Route.html)Rejects all requests with a host name that doesn't have a prefix matching the given regular expression.

Rejects all requests with a host name that doesn't have a prefix matching the given regular expression.
For all matching requests the prefix string matching the regex is extracted and passed to the inner route.
If the regex contains a capturing group only the string matched by this group is extracted.
If the regex contains more than one capturing group an IllegalArgumentException is thrown.
98. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#host(predicate:java.util.function.Predicate[String],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def host(predicate: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[String], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects all requests for whose host name the given predicate function returns false.
99. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#host(hostName:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def host(hostName: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects all requests with a host name different from the given one.
100. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#host(hostNames:Iterable[String],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def host(hostNames: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects all requests with a host name different from the given ones.
101. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
102. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#listDirectoryContents(directoryRenderer:akka.http.javadsl.server.directives.DirectoryRenderer,directories:String*):akka.http.javadsl.server.Route "Permalink")  def listDirectoryContents(directoryRenderer: [DirectoryRenderer](DirectoryRenderer.html), directories: String\*): [Route](../Route.html)Completes GET requests with a unified listing of the contents of all given directories.

Completes GET requests with a unified listing of the contents of all given directories.
The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)Annotations@varargs()
103. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#listDirectoryContents(directories:String*):akka.http.javadsl.server.Route "Permalink")  def listDirectoryContents(directories: String\*): [Route](../Route.html)Completes GET requests with a unified listing of the contents of all given directories.

Completes GET requests with a unified listing of the contents of all given directories.
The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)Annotations@varargs()
104. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#logRequest(show:java.util.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.server.directives.LogEntry],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logRequest(show: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [LogEntry](LogEntry.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every incoming request.

Produces a log entry for every incoming request.

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
105. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#logRequest(marker:String,level:akka.event.Logging.LogLevel,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logRequest(marker: String, level: LogLevel, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every incoming request.

Produces a log entry for every incoming request.

levelOne of the log levels defined in akka.event.Logging

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
106. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#logRequest(marker:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logRequest(marker: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every incoming request.

Produces a log entry for every incoming request.

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
107. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#logRequestResult(showSuccess:java.util.function.BiFunction[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,akka.http.javadsl.server.directives.LogEntry],showRejection:java.util.function.BiFunction[akka.http.javadsl.model.HttpRequest,java.util.List[akka.http.javadsl.server.Rejection],akka.http.javadsl.server.directives.LogEntry],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def logRequestResult(showSuccess: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[HttpRequest](../../model/HttpRequest.html), [HttpResponse](../../model/HttpResponse.html), [LogEntry](LogEntry.html)], showRejection: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[HttpRequest](../../model/HttpRequest.html), [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)], [LogEntry](LogEntry.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Produces a log entry for every request/response combination.

Produces a log entry for every request/response combination.

showSuccessFunction invoked when the route result was successful and yielded an HTTP response

showRejectionFunction invoked when the route yielded a rejection

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
108. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#logRequestResultOptional(showSuccess:java.util.function.BiFunction[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,java.util.Optional[akka.http.javadsl.server.directives.LogEntry]],showRejection:java.util.function.BiFunction[akka.http.javadsl.model.HttpRequest,java.util.List[akka.http.javadsl.server.Rejection],java.util.Optional[akka.http.javadsl.server.directives.LogEntry]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def logRequestResultOptional(showSuccess: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[HttpRequest](../../model/HttpRequest.html), [HttpResponse](../../model/HttpResponse.html), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[LogEntry](LogEntry.html)]], showRejection: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[HttpRequest](../../model/HttpRequest.html), [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)], [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[LogEntry](LogEntry.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Optionally produces a log entry for every request/response combination.

Optionally produces a log entry for every request/response combination.

showSuccessFunction invoked when the route result was successful and yielded an HTTP response

showRejectionFunction invoked when the route yielded a rejection

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)Annotations@[CorrespondsTo](CorrespondsTo.html)()
109. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#logResult(showSuccess:java.util.function.Function[akka.http.javadsl.model.HttpResponse,akka.http.javadsl.server.directives.LogEntry],showRejection:java.util.function.Function[java.util.List[akka.http.javadsl.server.Rejection],akka.http.javadsl.server.directives.LogEntry],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def logResult(showSuccess: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpResponse](../../model/HttpResponse.html), [LogEntry](LogEntry.html)], showRejection: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)], [LogEntry](LogEntry.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Produces a log entry for every route result.

Produces a log entry for every route result.

showSuccessFunction invoked when the route result was successful and yielded an HTTP response

showRejectionFunction invoked when the route yielded a rejection

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
110. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#logResult(marker:String,level:akka.event.Logging.LogLevel,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logResult(marker: String, level: LogLevel, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every route result.

Produces a log entry for every route result.

levelOne of the log levels defined in akka.event.Logging

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
111. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#logResult(marker:String,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def logResult(marker: String, inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Produces a log entry for every route result.

Produces a log entry for every route result.

Definition Classes[DebuggingDirectives](DebuggingDirectives.html)
112. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapInnerRoute(f:java.util.function.Function[akka.http.javadsl.server.Route,akka.http.javadsl.server.Route],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapInnerRoute(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Route](../Route.html), [Route](../Route.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
113. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapRejections(f:java.util.function.Function[java.util.List[akka.http.javadsl.server.Rejection],java.util.List[akka.http.javadsl.server.Rejection]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRejections(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)], [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Rejection](../Rejection.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
114. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapRequest(f:java.util.function.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpRequest],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRequest(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [HttpRequest](../../model/HttpRequest.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
115. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapRequestContext(f:java.util.function.Function[akka.http.javadsl.server.RequestContext,akka.http.javadsl.server.RequestContext],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRequestContext(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RequestContext](../RequestContext.html), [RequestContext](../RequestContext.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
116. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapResponse(f:java.util.function.Function[akka.http.javadsl.model.HttpResponse,akka.http.javadsl.model.HttpResponse],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapResponse(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpResponse](../../model/HttpResponse.html), [HttpResponse](../../model/HttpResponse.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
117. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapResponseEntity(f:java.util.function.Function[akka.http.javadsl.model.ResponseEntity,akka.http.javadsl.model.ResponseEntity],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapResponseEntity(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ResponseEntity](../../model/ResponseEntity.html), [ResponseEntity](../../model/ResponseEntity.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
118. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapResponseHeaders(f:java.util.function.Function[java.util.List[akka.http.javadsl.model.HttpHeader],java.util.List[akka.http.javadsl.model.HttpHeader]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapResponseHeaders(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[HttpHeader](../../model/HttpHeader.html)], [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[HttpHeader](../../model/HttpHeader.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
119. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapRouteResult(f:java.util.function.Function[akka.http.javadsl.server.RouteResult,akka.http.javadsl.server.RouteResult],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResult(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RouteResult](../RouteResult.html), [RouteResult](../RouteResult.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
120. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapRouteResultFuture(f:java.util.function.Function[java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult],java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultFuture(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
121. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapRouteResultPF(f:PartialFunction[akka.http.javadsl.server.RouteResult,akka.http.javadsl.server.RouteResult],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](../RouteResult.html), [RouteResult](../RouteResult.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
122. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapRouteResultWith(f:java.util.function.Function[akka.http.javadsl.server.RouteResult,java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultWith(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RouteResult](../RouteResult.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
123. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapRouteResultWithPF(f:PartialFunction[akka.http.javadsl.server.RouteResult,java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapRouteResultWithPF(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[RouteResult](../RouteResult.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
124. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapSettings(f:java.util.function.Function[akka.http.javadsl.settings.RoutingSettings,akka.http.javadsl.settings.RoutingSettings],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapSettings(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[RoutingSettings](../../settings/RoutingSettings.html), [RoutingSettings](../../settings/RoutingSettings.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs the inner route with settings mapped by the given function.

Runs the inner route with settings mapped by the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
125. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#mapUnmatchedPath(f:java.util.function.Function[String,String],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def mapUnmatchedPath(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, String], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Transforms the unmatchedPath of the RequestContext using the given function.

Transforms the unmatchedPath of the RequestContext using the given function.

Definition Classes[BasicDirectives](BasicDirectives.html)
126. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
127. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
128. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
129. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#onComplete[T](cs:java.util.concurrent.CompletionStage[T],inner:java.util.function.Function[scala.util.Try[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onComplete\[T](cs: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage<T>` and runs the inner route after future
completion with the future's value as an extraction of type `Try<T>`.

"Unwraps" a `CompletionStage<T>` and runs the inner route after future
completion with the future's value as an extraction of type `Try<T>`.

Definition Classes[FutureDirectives](FutureDirectives.html)
130. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#onComplete[T](f:java.util.function.Supplier[java.util.concurrent.CompletionStage[T]],inner:java.util.function.Function[scala.util.Try[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onComplete\[T](f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage<T>` and runs the inner route after future
completion with the future's value as an extraction of type `Try<T>`.

"Unwraps" a `CompletionStage<T>` and runs the inner route after future
completion with the future's value as an extraction of type `Try<T>`.

Definition Classes[FutureDirectives](FutureDirectives.html)
131. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#onCompleteWithBreaker[T](breaker:akka.pattern.CircuitBreaker,f:java.util.function.Supplier[java.util.concurrent.CompletionStage[T]],inner:java.util.function.Function[scala.util.Try[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onCompleteWithBreaker\[T](breaker: [CircuitBreaker](https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreaker.html#akka.pattern.CircuitBreaker), f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage[T]` and runs the inner route after future
completion with the future's value as an extraction of type `T` if
the supplied `CircuitBreaker` is closed.

"Unwraps" a `CompletionStage[T]` and runs the inner route after future
completion with the future's value as an extraction of type `T` if
the supplied `CircuitBreaker` is closed.

If the supplied CircuitBreaker is open the request is rejected
with a [akka.http.javadsl.server.CircuitBreakerOpenRejection](../CircuitBreakerOpenRejection.html).

Definition Classes[FutureDirectives](FutureDirectives.html)
132. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#onSuccess[T](cs:java.util.concurrent.CompletionStage[T],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onSuccess\[T](cs: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage<T>` and runs the inner route after stage
completion with the stage's value as an extraction of type `T`.

"Unwraps" a `CompletionStage<T>` and runs the inner route after stage
completion with the stage's value as an extraction of type `T`.
If the stage fails its failure Throwable is bubbled up to the nearest
ExceptionHandler.

Definition Classes[FutureDirectives](FutureDirectives.html)
133. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#onSuccess[T](f:java.util.function.Supplier[java.util.concurrent.CompletionStage[T]],inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def onSuccess\[T](f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)"Unwraps" a `CompletionStage<T>` and runs the inner route after stage
completion with the stage's value as an extraction of type `T`.

"Unwraps" a `CompletionStage<T>` and runs the inner route after stage
completion with the stage's value as an extraction of type `T`.
If the stage fails its failure Throwable is bubbled up to the nearest
ExceptionHandler.

Definition Classes[FutureDirectives](FutureDirectives.html)
134. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#optionalAttribute[T](key:akka.http.javadsl.model.AttributeKey[T],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalAttribute\[T](key: [AttributeKey](../../model/AttributeKey.html)\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the value of the optional request attribute with the given key.

Extracts the value of the optional request attribute with the given key.

Definition Classes[AttributeDirectives](AttributeDirectives.html)
135. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#optionalCookie(name:String,inner:java.util.function.Function[java.util.Optional[akka.http.javadsl.model.headers.HttpCookiePair],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def optionalCookie(name: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[HttpCookiePair](../../model/headers/HttpCookiePair.html)], [Route](../Route.html)]): [Route](../Route.html)Extracts the HttpCookiePair with the given name as an `Option[HttpCookiePair]`.

Extracts the HttpCookiePair with the given name as an `Option[HttpCookiePair]`.
If the cookie is not present a value of `None` is extracted.

Definition Classes[CookieDirectives](CookieDirectives.html)
136. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#optionalHeaderValue[T](f:java.util.function.Function[akka.http.javadsl.model.HttpHeader,java.util.Optional[T]],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalHeaderValue\[T](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[HttpHeader](../../model/HttpHeader.html), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts an optional HTTP header value using the given function.

Extracts an optional HTTP header value using the given function.
If the given function throws an exception the request is rejected
with a [akka.http.javadsl.server.MalformedHeaderRejection](../MalformedHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
137. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#optionalHeaderValueByName(headerName:String,inner:java.util.function.Function[java.util.Optional[String],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalHeaderValueByName(headerName: String, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts the value of the optional HTTP request header with the given name.

Extracts the value of the optional HTTP request header with the given name.

Definition Classes[HeaderDirectives](HeaderDirectives.html)
138. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#optionalHeaderValueByType[T<:akka.http.javadsl.model.HttpHeader](t:Class[T],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalHeaderValueByType\[T \<: [HttpHeader](../../model/HttpHeader.html)](t: Class\[T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)FIXME: WARNING: Custom headers don't work yet with this directive!

FIXME: WARNING: Custom headers don't work yet with this directive!

Extract the header value of the optional HTTP request header with the given type.

Definition Classes[HeaderDirectives](HeaderDirectives.html)
139. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#optionalHeaderValuePF[T](pf:PartialFunction[akka.http.javadsl.model.HttpHeader,T],inner:java.util.function.Function[java.util.Optional[T],akka.http.javadsl.server.Route]):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  def optionalHeaderValuePF\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpHeader](../../model/HttpHeader.html), T], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T], [Route](../Route.html)]): [RouteAdapter](RouteAdapter.html)Extracts an optional HTTP header value using the given partial function.

Extracts an optional HTTP header value using the given partial function.
If the given function throws an exception the request is rejected
with a [akka.http.javadsl.server.MalformedHeaderRejection](../MalformedHeaderRejection.html).

Definition Classes[HeaderDirectives](HeaderDirectives.html)
140. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#pass(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def pass(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Always passes the request on to its inner route
(i.e.

Always passes the request on to its inner route
(i.e. does nothing with the request or the response).

Definition Classes[BasicDirectives](BasicDirectives.html)
141. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#provide[T](t:T,inner:java.util.function.Function[T,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def provide\[T](t: T, inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[T, [Route](../Route.html)]): [Route](../Route.html)Injects the given value into a directive.

Injects the given value into a directive.

Definition Classes[BasicDirectives](BasicDirectives.html)
142. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#recoverRejections(f:java.util.function.Function[Iterable[akka.http.javadsl.server.Rejection],akka.http.javadsl.server.RouteResult],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def recoverRejections(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Rejection](../Rejection.html)], [RouteResult](../RouteResult.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
143. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#recoverRejectionsWith(f:java.util.function.Function[Iterable[akka.http.javadsl.server.Rejection],java.util.concurrent.CompletionStage[akka.http.javadsl.server.RouteResult]],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def recoverRejectionsWith(f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Rejection](../Rejection.html)], [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[RouteResult](../RouteResult.html)]], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Definition Classes[BasicDirectives](BasicDirectives.html)
144. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#requestEncodedWith(encoding:akka.http.javadsl.model.headers.HttpEncoding,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def requestEncodedWith(encoding: [HttpEncoding](../../model/headers/HttpEncoding.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.

Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.

Definition Classes[CodingDirectives](CodingDirectives.html)
145. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#responseEncodingAccepted(encoding:akka.http.javadsl.model.headers.HttpEncoding,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def responseEncodingAccepted(encoding: [HttpEncoding](../../model/headers/HttpEncoding.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Rejects the request with an UnacceptedResponseEncodingRejection
if the given response encoding is not accepted by the client.

Rejects the request with an UnacceptedResponseEncodingRejection
if the given response encoding is not accepted by the client.

Definition Classes[CodingDirectives](CodingDirectives.html)
146. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#setCookie(cookies:Iterable[akka.http.javadsl.model.headers.HttpCookie],inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def setCookie(cookies: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[HttpCookie](../../model/headers/HttpCookie.html)], inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header with the given cookies.

Adds a Set\-Cookie response header with the given cookies.

Definition Classes[CookieDirectives](CookieDirectives.html)
147. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#setCookie(cookie:akka.http.javadsl.model.headers.HttpCookie,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def setCookie(cookie: [HttpCookie](../../model/headers/HttpCookie.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Adds a Set\-Cookie response header with the given cookie.

Adds a Set\-Cookie response header with the given cookie.

Definition Classes[CookieDirectives](CookieDirectives.html)
148. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#storeUploadedFile(fieldName:String,destFn:java.util.function.Function[akka.http.javadsl.server.directives.FileInfo,java.io.File],inner:java.util.function.BiFunction[akka.http.javadsl.server.directives.FileInfo,java.io.File,akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def storeUploadedFile(fieldName: String, destFn: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[FileInfo](FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)], inner: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[FileInfo](FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), [Route](../Route.html)]): [Route](../Route.html)Streams the bytes of the file submitted using multipart with the given file name into a designated file on disk.

Streams the bytes of the file submitted using multipart with the given file name into a designated file on disk.
If there is an error writing to disk the request will be failed with the thrown exception, if there is no such
field the request will be rejected, if there are multiple file parts with the same name, the first one will be
used and the subsequent ones ignored.

Definition Classes[FileUploadDirectives](FileUploadDirectives.html)
149. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#storeUploadedFiles(fieldName:String,destFn:java.util.function.Function[akka.http.javadsl.server.directives.FileInfo,java.io.File],inner:java.util.function.Function[java.util.List[java.util.Map.Entry[akka.http.javadsl.server.directives.FileInfo,java.io.File]],akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def storeUploadedFiles(fieldName: String, destFn: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[FileInfo](FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)], inner: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Entry\[[FileInfo](FileInfo.html), [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)]], [Route](../Route.html)]): [Route](../Route.html)Streams the bytes of the file submitted using multipart with the given field name into designated files on disk.

Streams the bytes of the file submitted using multipart with the given field name into designated files on disk.
If there is an error writing to disk the request will be failed with the thrown exception, if there is no such
field the request will be rejected. Stored files are cleaned up on exit but not on failure.

Definition Classes[FileUploadDirectives](FileUploadDirectives.html)
150. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
151. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,maxBytes:Long,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
152. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#toStrictEntity(timeout:scala.concurrent.duration.FiniteDuration,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def toStrictEntity(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)WARNING: This will read the entire request entity into memory and effectively disable streaming.

WARNING: This will read the entire request entity into memory and effectively disable streaming.

To help protect against excessive memory use, the request will be aborted if the request is larger
than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.

Extracts the [akka.http.javadsl.server.RequestContext](../RequestContext.html) itself with the strict HTTP entity,
or fails the route if unable to drain the entire request body within the timeout.

timeoutThe directive is failed if the stream isn't completed after the given timeout.

Definition Classes[BasicDirectives](BasicDirectives.html)
153. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
154. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
155. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
156. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
157. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#withExecutionContext(ec:scala.concurrent.ExecutionContextExecutor,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withExecutionContext(ec: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).

Runs its inner route with the given alternative [scala.concurrent.ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
158. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#withLog(log:akka.event.LoggingAdapter,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withLog(log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative LoggingAdapter.

Runs its inner route with the given alternative LoggingAdapter.

Definition Classes[BasicDirectives](BasicDirectives.html)
159. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#withMaterializer(mat:akka.stream.Materializer,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withMaterializer(mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html).

Runs its inner route with the given alternative [akka.stream.Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html).

Definition Classes[BasicDirectives](BasicDirectives.html)
160. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#withPrecompressedMediaTypeSupport(inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withPrecompressedMediaTypeSupport(inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Inspects the response entity and adds a `Content-Encoding: gzip` response header if
the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.

Inspects the response entity and adds a `Content-Encoding: gzip` response header if
the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.

Definition Classes[CodingDirectives](CodingDirectives.html)
161. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#withSettings(s:akka.http.javadsl.settings.RoutingSettings,inner:java.util.function.Supplier[akka.http.javadsl.server.Route]):akka.http.javadsl.server.Route "Permalink")  def withSettings(s: [RoutingSettings](../../settings/RoutingSettings.html), inner: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Route](../Route.html)]): [Route](../Route.html)Runs its inner route with the given alternative RoutingSettings.

Runs its inner route with the given alternative RoutingSettings.

Definition Classes[BasicDirectives](BasicDirectives.html)
### Deprecated Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HostDirectives toStringFormat\[HostDirectives] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/javadsl/server/directives/HostDirectives.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HostDirectives, B)ImplicitThis member is added by an implicit conversion from HostDirectives toArrowAssoc\[HostDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AttributeDirectives](AttributeDirectives.html)

### Inherited from [HeaderDirectives](HeaderDirectives.html)

### Inherited from [FutureDirectives](FutureDirectives.html)

### Inherited from [FormFieldDirectives](FormFieldDirectives.html)

### Inherited from [FileUploadDirectives](FileUploadDirectives.html)

### Inherited from [FileAndResourceDirectives](FileAndResourceDirectives.html)

### Inherited from [ExecutionDirectives](ExecutionDirectives.html)

### Inherited from [DebuggingDirectives](DebuggingDirectives.html)

### Inherited from [CookieDirectives](CookieDirectives.html)

### Inherited from [CodingDirectives](CodingDirectives.html)

### Inherited from [CacheConditionDirectives](CacheConditionDirectives.html)

### Inherited from [BasicDirectives](BasicDirectives.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHostDirectives to any2stringadd\[HostDirectives]

### Inherited by implicit conversion StringFormat fromHostDirectives to StringFormat\[HostDirectives]

### Inherited by implicit conversion Ensuring fromHostDirectives to Ensuring\[HostDirectives]

### Inherited by implicit conversion ArrowAssoc fromHostDirectives to ArrowAssoc\[HostDirectives]

### future

### header

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/coding/Coder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpOriginRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/AllDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/InvalidOriginRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingAttributeRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingCookieRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html
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

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/HostDirectives.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/HostDirectives.html)*