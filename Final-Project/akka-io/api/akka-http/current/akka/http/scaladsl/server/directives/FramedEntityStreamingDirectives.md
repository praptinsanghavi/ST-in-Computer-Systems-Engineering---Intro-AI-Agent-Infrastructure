---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FramedEntityStreamingDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:49:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FramedEntityStreamingDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FramedEntityStreamingDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FramedEntityStreamingDirectives

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
- FramedEntityStreamingDirectives
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
t[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# FramedEntityStreamingDirectives[**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html "Permalink")

### 

#### trait FramedEntityStreamingDirectives extends [MarshallingDirectives](MarshallingDirectives.html)

Allows the [MarshallingDirectives.entity](MarshallingDirectives$.html#entity[T](um:akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[T]):akka.http.scaladsl.server.Directive1[T]) directive to extract a [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements.

See [common.EntityStreamingSupport](../../common/EntityStreamingSupport.html) for useful default framing `Flow` instances and
support traits such as `SprayJsonSupport` (or your other favourite JSON library) to provide the needed Marshaller s.

Source[FramedEntityStreamingDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.scala#L22)Linear Supertypes[MarshallingDirectives](MarshallingDirectives.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Directives](../Directives.html), [Directives](../Directives$.html), [HttpApp](../HttpApp.html)Type Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. FramedEntityStreamingDirectives
2. MarshallingDirectives
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
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#RequestToSourceUnmarshaller[T]=akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[akka.stream.scaladsl.Source[T,akka.NotUsed]] "Permalink")  type RequestToSourceUnmarshaller\[T] \= [Unmarshaller](../../unmarshalling/Unmarshaller.html)\[[HttpRequest](../../model/HttpRequest.html), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[T, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]]
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FramedEntityStreamingDirectives toany2stringadd\[FramedEntityStreamingDirectives] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FramedEntityStreamingDirectives, B)ImplicitThis member is added by an implicit conversion from FramedEntityStreamingDirectives toArrowAssoc\[FramedEntityStreamingDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#as[T](implicitum:akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[T]):akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[T] "Permalink")  def as\[T](implicit um: [FromRequestUnmarshaller](../../unmarshalling/index.html#FromRequestUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpRequest,T])\[T]): [FromRequestUnmarshaller](../../unmarshalling/index.html#FromRequestUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpRequest,T])\[T]Returns the in\-scope FromRequestUnmarshaller for the given type.

Returns the in\-scope FromRequestUnmarshaller for the given type.

Definition Classes[MarshallingDirectives](MarshallingDirectives.html)
7. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#asSourceOf[T](support:akka.http.scaladsl.common.EntityStreamingSupport)(implicitum:akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[T]):FramedEntityStreamingDirectives.this.RequestToSourceUnmarshaller[T] "Permalink") final  def asSourceOf\[T](support: [EntityStreamingSupport](../../common/EntityStreamingSupport.html))(implicit um: [FromByteStringUnmarshaller](../../unmarshalling/index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[T]): [RequestToSourceUnmarshaller](#RequestToSourceUnmarshaller[T]=akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[akka.stream.scaladsl.Source[T,akka.NotUsed]])\[T]Extracts entity as [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements of type `T`.

Extracts entity as [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements of type `T`.
This is achieved by applying the implicitly provided (in the following order):

\- 1st: chunk\-up the incoming ByteStrings by applying the `Content-Type`\-aware framing
\- 2nd: apply the Unmarshaller (from ByteString to `T`) for each of the respective "chunks" (e.g. for each JSON element contained within an array).

The request will be rejected with an [akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection](../UnsupportedRequestContentTypeRejection.html) if
its ContentType is not supported by the used `framing` or `unmarshaller`.

Cancelling extracted [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) closes the connection abruptly (same as cancelling the `entity.dataBytes`).

See also [MiscDirectives.withoutSizeLimit](MiscDirectives$.html#withoutSizeLimit:akka.http.scaladsl.server.Directive0) as you may want to allow streaming infinite streams of data in this route.
By default the uploaded data is limited by the `akka.http.parsing.max-content-length`.
9. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#asSourceOf[T](implicitum:akka.http.scaladsl.unmarshalling.FromByteStringUnmarshaller[T],implicitsupport:akka.http.scaladsl.common.EntityStreamingSupport):FramedEntityStreamingDirectives.this.RequestToSourceUnmarshaller[T] "Permalink") final  def asSourceOf\[T](implicit um: [FromByteStringUnmarshaller](../../unmarshalling/index.html#FromByteStringUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.util.ByteString,T])\[T], support: [EntityStreamingSupport](../../common/EntityStreamingSupport.html)): [RequestToSourceUnmarshaller](#RequestToSourceUnmarshaller[T]=akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[akka.stream.scaladsl.Source[T,akka.NotUsed]])\[T]Extracts entity as [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements of type `T`.

Extracts entity as [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of elements of type `T`.
This is achieved by applying the implicitly provided (in the following order):

\- 1st: chunk\-up the incoming ByteStrings by applying the `Content-Type`\-aware framing
\- 2nd: apply the Unmarshaller (from ByteString to `T`) for each of the respective "chunks" (e.g. for each JSON element contained within an array).

The request will be rejected with an [akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection](../UnsupportedRequestContentTypeRejection.html) if
its ContentType is not supported by the used `framing` or `unmarshaller`.

Cancelling extracted [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) closes the connection abruptly (same as cancelling the `entity.dataBytes`).

See also [MiscDirectives.withoutSizeLimit](MiscDirectives$.html#withoutSizeLimit:akka.http.scaladsl.server.Directive0) as you may want to allow streaming infinite streams of data in this route.
By default the uploaded data is limited by the `akka.http.parsing.max-content-length`.
10. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#completeWith[T](marshaller:akka.http.scaladsl.marshalling.ToResponseMarshaller[T])(inner:(T=>Unit)=>Unit):akka.http.scaladsl.server.Route "Permalink")  def completeWith\[T](marshaller: [ToResponseMarshaller](../../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T])(inner: ((T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Uses the marshaller for the given type to produce a completion function that is passed to its inner function.

Uses the marshaller for the given type to produce a completion function that is passed to its inner function.
You can use it do decouple marshaller resolution from request completion.

Definition Classes[MarshallingDirectives](MarshallingDirectives.html)
12. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FramedEntityStreamingDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FramedEntityStreamingDirectivesImplicitThis member is added by an implicit conversion from FramedEntityStreamingDirectives toEnsuring\[FramedEntityStreamingDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FramedEntityStreamingDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FramedEntityStreamingDirectivesImplicitThis member is added by an implicit conversion from FramedEntityStreamingDirectives toEnsuring\[FramedEntityStreamingDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FramedEntityStreamingDirectivesImplicitThis member is added by an implicit conversion from FramedEntityStreamingDirectives toEnsuring\[FramedEntityStreamingDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FramedEntityStreamingDirectivesImplicitThis member is added by an implicit conversion from FramedEntityStreamingDirectives toEnsuring\[FramedEntityStreamingDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#entity[T](um:akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[T]):akka.http.scaladsl.server.Directive1[T] "Permalink")  def entity\[T](um: [FromRequestUnmarshaller](../../unmarshalling/index.html#FromRequestUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpRequest,T])\[T]): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Unmarshalls the requests entity to the given type passes it to its inner Route.

Unmarshalls the requests entity to the given type passes it to its inner Route.
If there is a problem with unmarshalling the request is rejected with the [Rejection](../Rejection.html)
produced by the unmarshaller.

Definition Classes[MarshallingDirectives](MarshallingDirectives.html)
17. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#handleWith[A,B](f:A=>B)(implicitum:akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller[A],implicitm:akka.http.scaladsl.marshalling.ToResponseMarshaller[B]):akka.http.scaladsl.server.Route "Permalink")  def handleWith\[A, B](f: (A) \=\> B)(implicit um: [FromRequestUnmarshaller](../../unmarshalling/index.html#FromRequestUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpRequest,T])\[A], m: [ToResponseMarshaller](../../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[B]): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes the request using the given function.

Completes the request using the given function. The input to the function is produced with the in\-scope
entity unmarshaller and the result value of the function is marshalled with the in\-scope marshaller.

Definition Classes[MarshallingDirectives](MarshallingDirectives.html)
21. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#instanceOf[T](implicitm:akka.http.scaladsl.marshalling.ToResponseMarshaller[T]):akka.http.scaladsl.marshalling.ToResponseMarshaller[T] "Permalink")  def instanceOf\[T](implicit m: [ToResponseMarshaller](../../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]): [ToResponseMarshaller](../../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]Returns the in\-scope Marshaller for the given type.

Returns the in\-scope Marshaller for the given type.

Definition Classes[MarshallingDirectives](MarshallingDirectives.html)
23. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FramedEntityStreamingDirectives toStringFormat\[FramedEntityStreamingDirectives] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FramedEntityStreamingDirectives, B)ImplicitThis member is added by an implicit conversion from FramedEntityStreamingDirectives toArrowAssoc\[FramedEntityStreamingDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [MarshallingDirectives](MarshallingDirectives.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFramedEntityStreamingDirectives to any2stringadd\[FramedEntityStreamingDirectives]

### Inherited by implicit conversion StringFormat fromFramedEntityStreamingDirectives to StringFormat\[FramedEntityStreamingDirectives]

### Inherited by implicit conversion Ensuring fromFramedEntityStreamingDirectives to Ensuring\[FramedEntityStreamingDirectives]

### Inherited by implicit conversion ArrowAssoc fromFramedEntityStreamingDirectives to ArrowAssoc\[FramedEntityStreamingDirectives]

### Marshalling directives

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/AttributeDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/AuthenticationDirective$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/AuthenticationDirective.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/AuthenticationResult$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/BasicDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/BasicDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CacheConditionDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CachingDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/ContentTypeResolver$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CookieDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CookieDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CorsDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CorsDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/Credentials$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/DebuggingDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/DirectoryListing$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/DirectoryListing.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/ExecutionDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FileInfo.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FileUploadDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectivesInstances.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html)*