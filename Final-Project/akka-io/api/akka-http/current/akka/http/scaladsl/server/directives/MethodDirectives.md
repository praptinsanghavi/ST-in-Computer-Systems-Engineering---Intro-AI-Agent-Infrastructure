---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.MethodDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:49:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/MethodDirectives.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.MethodDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.MethodDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.MethodDirectives

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
- MethodDirectives
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
[t](MethodDirectives$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# [MethodDirectives](MethodDirectives$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html "Permalink")

### Companion [object MethodDirectives](MethodDirectives$.html "See companion object")

#### trait MethodDirectives extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[MethodDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/MethodDirectives.scala#L15)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Directives](../Directives.html), [Directives](../Directives$.html), [MethodDirectives](MethodDirectives$.html), [HttpApp](../HttpApp.html)Type Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. MethodDirectives
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
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MethodDirectives toany2stringadd\[MethodDirectives] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MethodDirectives, B)ImplicitThis member is added by an implicit conversion from MethodDirectives toArrowAssoc\[MethodDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#delete:akka.http.scaladsl.server.Directive0 "Permalink")  def delete: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-DELETE requests.
9. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MethodDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MethodDirectivesImplicitThis member is added by an implicit conversion from MethodDirectives toEnsuring\[MethodDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MethodDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MethodDirectivesImplicitThis member is added by an implicit conversion from MethodDirectives toEnsuring\[MethodDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MethodDirectivesImplicitThis member is added by an implicit conversion from MethodDirectives toEnsuring\[MethodDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MethodDirectivesImplicitThis member is added by an implicit conversion from MethodDirectives toEnsuring\[MethodDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#extractMethod:akka.http.scaladsl.server.Directive1[akka.http.scaladsl.model.HttpMethod] "Permalink")  def extractMethod: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[HttpMethod](../../model/HttpMethod.html)]Extracts the request method.
16. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#get:akka.http.scaladsl.server.Directive0 "Permalink")  def get: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-GET requests.
17. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#head:akka.http.scaladsl.server.Directive0 "Permalink")  def head: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-HEAD requests.
20. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#method(httpMethod:akka.http.scaladsl.model.HttpMethod):akka.http.scaladsl.server.Directive0 "Permalink")  def method(httpMethod: [HttpMethod](../../model/HttpMethod.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all requests whose HTTP method does not match the given one.
22. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#options:akka.http.scaladsl.server.Directive0 "Permalink")  def options: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-OPTIONS requests.
26. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#overrideMethodWithParameter(paramName:String):akka.http.scaladsl.server.Directive0 "Permalink")  def overrideMethodWithParameter(paramName: String): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Changes the HTTP method of the request to the value of the specified query string parameter.

Changes the HTTP method of the request to the value of the specified query string parameter. If the query string
parameter is not specified this directive has no effect. If the query string is specified as something that is not
a HTTP method, then this directive completes the request with a `501 Not Implemented` response.

This directive is useful for:

	- Use in combination with JSONP (JSONP only supports GET)
	- Supporting older browsers that lack support for certain HTTP methods. E.g. IE8 does not support PATCH
27. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#patch:akka.http.scaladsl.server.Directive0 "Permalink")  def patch: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-PATCH requests.
28. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#post:akka.http.scaladsl.server.Directive0 "Permalink")  def post: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-POST requests.
29. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#put:akka.http.scaladsl.server.Directive0 "Permalink")  def put: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects all non\-PUT requests.
30. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MethodDirectives toStringFormat\[MethodDirectives] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/directives/MethodDirectives.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MethodDirectives, B)ImplicitThis member is added by an implicit conversion from MethodDirectives toArrowAssoc\[MethodDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMethodDirectives to any2stringadd\[MethodDirectives]

### Inherited by implicit conversion StringFormat fromMethodDirectives to StringFormat\[MethodDirectives]

### Inherited by implicit conversion Ensuring fromMethodDirectives to Ensuring\[MethodDirectives]

### Inherited by implicit conversion ArrowAssoc fromMethodDirectives to ArrowAssoc\[MethodDirectives]

### Method directives

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/HttpApp.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FutureDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FutureDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/HeaderDirectives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/HeaderDirectives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/MethodDirectives.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/MethodDirectives.html)*