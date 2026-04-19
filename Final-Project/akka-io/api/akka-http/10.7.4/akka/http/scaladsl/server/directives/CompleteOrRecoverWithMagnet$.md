---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.CompleteOrRecoverWithMagnet
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.CompleteOrRecoverWithMagnet
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.CompleteOrRecoverWithMagnet

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.CompleteOrRecoverWithMagnet

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
[o](CompleteOrRecoverWithMagnet.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html "Permalink")

### Companion [trait CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html "See companion trait")

#### object CompleteOrRecoverWithMagnet

Source[FutureDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/FutureDirectives.scala#L106)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CompleteOrRecoverWithMagnet
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#apply[T](future:=>scala.concurrent.Future[T])(implicitm:akka.http.scaladsl.marshalling.ToResponseMarshaller[T]):akka.http.scaladsl.server.directives.CompleteOrRecoverWithMagnet "Permalink") implicit  def apply\[T](future: \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T])(implicit m: [ToResponseMarshaller](../../marshalling/index.html#ToResponseMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.HttpResponse])\[T]): [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html)
5. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FutureDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FutureDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HostDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HostDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/LogEntry$.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html)*