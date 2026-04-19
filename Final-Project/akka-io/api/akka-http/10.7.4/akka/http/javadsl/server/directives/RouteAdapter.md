---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.RouteAdapter
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:19:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.RouteAdapter
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.RouteAdapter

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.RouteAdapter

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
- [HostDirectives](HostDirectives.html)
- [LogEntry](LogEntry.html)
- [MarshallingDirectives](MarshallingDirectives.html)
- [MethodDirectives](MethodDirectives.html)
- [MiscDirectives](MiscDirectives.html)
- [ParameterDirectives](ParameterDirectives.html)
- [PathDirectives](PathDirectives.html "Only path prefixes are matched by these methods, since any kind of chaining path extractions in Java would just look cumbersome without operator overloads; hence, no PathMatcher for Java.")
- [RangeDirectives](RangeDirectives.html)
- [RespondWithDirectives](RespondWithDirectives.html)
- RouteAdapter
- [RouteDirectives](RouteDirectives.html)
- [SchemeDirectives](SchemeDirectives.html)
- [SecurityDirectives](SecurityDirectives.html)
- [TimeoutDirectives](TimeoutDirectives.html)
- [TlsDirectives](TlsDirectives.html)
- [WebSocketDirectives](WebSocketDirectives.html)
[c](RouteAdapter$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[javadsl](../../index.html).[server](../index.html).[directives](index.html)

# [RouteAdapter](RouteAdapter$.html "See companion object")[**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html "Permalink")

### Companion [object RouteAdapter](RouteAdapter$.html "See companion object")

#### final  class RouteAdapter extends [Route](../Route.html)

INTERNAL API

Annotations@InternalApi() Source[RouteAdapter.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/server/directives/RouteAdapter.scala#L28)Linear Supertypes[Route](../Route.html), [HandlerProvider](../../HandlerProvider.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RouteAdapter
2. Route
3. HandlerProvider
4. AnyRef
5. Any
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

1. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#<init>(delegate:akka.http.scaladsl.server.Route):akka.http.javadsl.server.directives.RouteAdapter "Permalink")  new RouteAdapter(delegate: [scaladsl.server.Route](../../../scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]))
### Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RouteAdapter toany2stringadd\[RouteAdapter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RouteAdapter, B)ImplicitThis member is added by an implicit conversion from RouteAdapter toArrowAssoc\[RouteAdapter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#asScala:akka.http.scaladsl.server.Route "Permalink")  def asScala: [scaladsl.server.Route](../../../scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Converts to the Scala DSL form of an Route.

Converts to the Scala DSL form of an Route.

Definition Classes[Route](../Route.html)
8. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#delegate:akka.http.scaladsl.server.Route "Permalink")  val delegate: [scaladsl.server.Route](../../../scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])INTERNAL API

INTERNAL API

Definition ClassesRouteAdapter → [Route](../Route.html)
10. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RouteAdapter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouteAdapterImplicitThis member is added by an implicit conversion from RouteAdapter toEnsuring\[RouteAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RouteAdapter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouteAdapterImplicitThis member is added by an implicit conversion from RouteAdapter toEnsuring\[RouteAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouteAdapterImplicitThis member is added by an implicit conversion from RouteAdapter toEnsuring\[RouteAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouteAdapterImplicitThis member is added by an implicit conversion from RouteAdapter toEnsuring\[RouteAdapter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#flow(system:akka.actor.ActorSystem,materializer:akka.stream.Materializer):akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,akka.NotUsed] "Permalink")  def flow(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](../../model/HttpRequest.html), [HttpResponse](../../model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Definition ClassesRouteAdapter → [Route](../Route.html)
17. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#flow(system:akka.actor.ClassicActorSystemProvider):akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,akka.NotUsed] "Permalink")  def flow(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](../../model/HttpRequest.html), [HttpResponse](../../model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Definition Classes[Route](../Route.html)
18. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#function(system:akka.actor.ClassicActorSystemProvider):akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]] "Permalink")  def function(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](../../model/HttpResponse.html)]]Definition Classes[Route](../Route.html)
19. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#handler(system:akka.actor.ClassicActorSystemProvider):akka.japi.function.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]] "Permalink")  def handler(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html#akka.japi.function.Function)\[[HttpRequest](../../model/HttpRequest.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](../../model/HttpResponse.html)]]Definition ClassesRouteAdapter → [Route](../Route.html) → [HandlerProvider](../../HandlerProvider.html)
21. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#orElse(alternative:akka.http.javadsl.server.Route):akka.http.javadsl.server.Route "Permalink")  def orElse(alternative: [Route](../Route.html)): [Route](../Route.html)Definition ClassesRouteAdapter → [Route](../Route.html)
27. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#seal(rejectionHandler:akka.http.javadsl.server.RejectionHandler,exceptionHandler:akka.http.javadsl.server.ExceptionHandler):akka.http.javadsl.server.Route "Permalink")  def seal(rejectionHandler: [RejectionHandler](../RejectionHandler.html), exceptionHandler: [ExceptionHandler](../ExceptionHandler.html)): [Route](../Route.html)Seals a route by wrapping it with explicit exception handling and rejection conversion.

Seals a route by wrapping it with explicit exception handling and rejection conversion.

A sealed route has these properties:

	- The result of the route will always be a complete response, i.e. the result of the future is a
	 `Success(RouteResult.Complete(response))`, never a failed future and never a rejected route. These
	 will be already be handled using the given [RejectionHandler](../RejectionHandler.html) and [ExceptionHandler](../ExceptionHandler.html).
	- Consequently, no route alternatives will be tried that were combined with this route.Definition ClassesRouteAdapter → [Route](../Route.html)
28. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#seal():akka.http.javadsl.server.Route "Permalink")  def seal(): [Route](../Route.html)Seals a route by wrapping it with default exception handling and rejection conversion.

Seals a route by wrapping it with default exception handling and rejection conversion.

A sealed route has these properties:

	- The result of the route will always be a complete response, i.e. the result of the future is a
	 `Success(RouteResult.Complete(response))`, never a failed future and never a rejected route. These
	 will be already be handled using the default [RejectionHandler](../RejectionHandler.html) and [ExceptionHandler](../ExceptionHandler.html).
	- Consequently, no route alternatives will be tried that were combined with this route.Definition ClassesRouteAdapter → [Route](../Route.html)
29. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesRouteAdapter → AnyRef → Any
31. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RouteAdapter toStringFormat\[RouteAdapter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/javadsl/server/directives/RouteAdapter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RouteAdapter, B)ImplicitThis member is added by an implicit conversion from RouteAdapter toArrowAssoc\[RouteAdapter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Route](../Route.html)

### Inherited from [HandlerProvider](../../HandlerProvider.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRouteAdapter to any2stringadd\[RouteAdapter]

### Inherited by implicit conversion StringFormat fromRouteAdapter to StringFormat\[RouteAdapter]

### Inherited by implicit conversion Ensuring fromRouteAdapter to Ensuring\[RouteAdapter]

### Inherited by implicit conversion ArrowAssoc fromRouteAdapter to ArrowAssoc\[RouteAdapter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Route.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RangeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RespondWithDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SchemeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives$.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html)*