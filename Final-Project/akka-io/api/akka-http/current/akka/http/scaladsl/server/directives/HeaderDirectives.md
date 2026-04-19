---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.HeaderDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:48:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/HeaderDirectives.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.HeaderDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.HeaderDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.HeaderDirectives

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
- HeaderDirectives
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
[t](HeaderDirectives$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# [HeaderDirectives](HeaderDirectives$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html "Permalink")

### Companion [object HeaderDirectives](HeaderDirectives$.html "See companion object")

#### trait HeaderDirectives extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[HeaderDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/HeaderDirectives.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Directives](../Directives.html), [Directives](../Directives$.html), [HeaderDirectives](HeaderDirectives$.html), [HttpApp](../HttpApp.html)Type Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. HeaderDirectives
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

1. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HeaderDirectives toany2stringadd\[HeaderDirectives] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HeaderDirectives, B)ImplicitThis member is added by an implicit conversion from HeaderDirectives toArrowAssoc\[HeaderDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#checkSameOrigin(allowed:akka.http.scaladsl.model.headers.HttpOriginRange.Default):akka.http.scaladsl.server.Directive0 "Permalink")  def checkSameOrigin(allowed: [Default](../../model/headers/HttpOriginRange$$Default.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Checks that request comes from the same origin.

Checks that request comes from the same origin. Extracts the Origin header value and verifies that
allowed range contains the obtained value. In the case of absent of the Origin header rejects
with [MissingHeaderRejection](../MissingHeaderRejection.html). If the origin value is not in the allowed range
rejects with an [InvalidOriginRejection](../InvalidOriginRejection.html) and StatusCodes.Forbidden status.
8. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HeaderDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HeaderDirectivesImplicitThis member is added by an implicit conversion from HeaderDirectives toEnsuring\[HeaderDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HeaderDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HeaderDirectivesImplicitThis member is added by an implicit conversion from HeaderDirectives toEnsuring\[HeaderDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HeaderDirectivesImplicitThis member is added by an implicit conversion from HeaderDirectives toEnsuring\[HeaderDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HeaderDirectivesImplicitThis member is added by an implicit conversion from HeaderDirectives toEnsuring\[HeaderDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#headerValue[T](f:akka.http.scaladsl.model.HttpHeader=>Option[T]):akka.http.scaladsl.server.Directive1[T] "Permalink")  def headerValue\[T](f: ([HttpHeader](../../model/HttpHeader.html)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Extracts an HTTP header value using the given function.

Extracts an HTTP header value using the given function. If the function result is undefined for all headers the
request is rejected with an empty rejection set. If the given function throws an exception the request is rejected
with a [akka.http.scaladsl.server.MalformedHeaderRejection](../MalformedHeaderRejection.html).
18. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#headerValueByName(headerName:String):akka.http.scaladsl.server.Directive1[String] "Permalink")  def headerValueByName(headerName: String): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[String]Extracts the value of the HTTP request header with the given name.

Extracts the value of the HTTP request header with the given name.
If no header with a matching name is found the request is rejected with a [akka.http.scaladsl.server.MissingHeaderRejection](../MissingHeaderRejection.html).
19. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#headerValueByType[T](magnet:akka.http.scaladsl.server.directives.HeaderMagnet[T]):akka.http.scaladsl.server.Directive1[T] "Permalink")  def headerValueByType\[T](magnet: [HeaderMagnet](HeaderMagnet.html)\[T]): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Extracts the first HTTP request header of the given type.

Extracts the first HTTP request header of the given type.
If no header with a matching type is found the request is rejected with a [akka.http.scaladsl.server.MissingHeaderRejection](../MissingHeaderRejection.html).

Custom headers will only be matched by this directive if they extend ModeledCustomHeader
and provide a companion extending ModeledCustomHeaderCompanion.
20. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#headerValuePF[T](pf:PartialFunction[akka.http.scaladsl.model.HttpHeader,T]):akka.http.scaladsl.server.Directive1[T] "Permalink")  def headerValuePF\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpHeader](../../model/HttpHeader.html), T]): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[T]Extracts an HTTP header value using the given partial function.

Extracts an HTTP header value using the given partial function. If the function is undefined for all headers the
request is rejected with an empty rejection set.
21. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#optionalHeaderValue[T](f:akka.http.scaladsl.model.HttpHeader=>Option[T]):akka.http.scaladsl.server.Directive1[Option[T]] "Permalink")  def optionalHeaderValue\[T](f: ([HttpHeader](../../model/HttpHeader.html)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]Extracts an optional HTTP header value using the given function.

Extracts an optional HTTP header value using the given function.
If the given function throws an exception the request is rejected
with a [akka.http.scaladsl.server.MalformedHeaderRejection](../MalformedHeaderRejection.html).
26. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#optionalHeaderValueByName(headerName:String):akka.http.scaladsl.server.Directive1[Option[String]] "Permalink")  def optionalHeaderValueByName(headerName: String): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]]Extracts the value of the optional HTTP request header with the given name.
27. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#optionalHeaderValueByType[T<:akka.http.scaladsl.model.HttpHeader](magnet:akka.http.scaladsl.server.directives.HeaderMagnet[T]):akka.http.scaladsl.server.Directive1[Option[T]] "Permalink")  def optionalHeaderValueByType\[T \<: [HttpHeader](../../model/HttpHeader.html)](magnet: [HeaderMagnet](HeaderMagnet.html)\[T]): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]Extract the header value of the optional HTTP request header with the given type.

Extract the header value of the optional HTTP request header with the given type.

Custom headers will only be matched by this directive if they extend ModeledCustomHeader
and provide a companion extending ModeledCustomHeaderCompanion.
28. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#optionalHeaderValuePF[T](pf:PartialFunction[akka.http.scaladsl.model.HttpHeader,T]):akka.http.scaladsl.server.Directive1[Option[T]] "Permalink")  def optionalHeaderValuePF\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[HttpHeader](../../model/HttpHeader.html), T]): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]Extracts an optional HTTP header value using the given partial function.

Extracts an optional HTTP header value using the given partial function.
If the given function throws an exception the request is rejected
with a [akka.http.scaladsl.server.MalformedHeaderRejection](../MalformedHeaderRejection.html).
29. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HeaderDirectives toStringFormat\[HeaderDirectives] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#headerValueByName(headerName:Symbol):akka.http.scaladsl.server.Directive1[String] "Permalink")  def headerValueByName(headerName: [Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol)): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[String]Extracts the value of the first HTTP request header with the given name.

Extracts the value of the first HTTP request header with the given name.
If no header with a matching name is found the request is rejected with a [akka.http.scaladsl.server.MissingHeaderRejection](../MissingHeaderRejection.html).

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use string argument version or `headerValueByType`, e.g. instead of `headerValueByName('Referer)` use `headerValueByType(Referer)`
4. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#optionalHeaderValueByName(headerName:Symbol):akka.http.scaladsl.server.Directive1[Option[String]] "Permalink")  def optionalHeaderValueByName(headerName: [Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol)): [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]]Extracts the value of the optional HTTP request header with the given name.

Extracts the value of the optional HTTP request header with the given name.

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use string argument version or `headerValueByType`, e.g. instead of `optionalHeaderValueByName('Referer)` use `optionalHeaderValueByType(Referer)`
5. [**](../../../../../akka/http/scaladsl/server/directives/HeaderDirectives.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HeaderDirectives, B)ImplicitThis member is added by an implicit conversion from HeaderDirectives toArrowAssoc\[HeaderDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHeaderDirectives to any2stringadd\[HeaderDirectives]

### Inherited by implicit conversion StringFormat fromHeaderDirectives to StringFormat\[HeaderDirectives]

### Inherited by implicit conversion Ensuring fromHeaderDirectives to Ensuring\[HeaderDirectives]

### Inherited by implicit conversion ArrowAssoc fromHeaderDirectives to ArrowAssoc\[HeaderDirectives]

### Header directives

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpOriginRange$$Default.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/InvalidOriginRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/MissingHeaderRejection.html
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

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/HeaderDirectives.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/HeaderDirectives.html)*