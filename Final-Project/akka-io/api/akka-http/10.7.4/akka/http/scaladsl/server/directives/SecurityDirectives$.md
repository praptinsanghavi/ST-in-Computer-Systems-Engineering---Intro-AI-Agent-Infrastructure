---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.SecurityDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/SecurityDirectives$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.SecurityDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.SecurityDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.SecurityDirectives

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
[o](SecurityDirectives.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# [SecurityDirectives](SecurityDirectives.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html "Permalink")

### Companion [trait SecurityDirectives](SecurityDirectives.html "See companion trait")

#### object SecurityDirectives extends [SecurityDirectives](SecurityDirectives.html)

Source[SecurityDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/SecurityDirectives.scala#L276)Linear Supertypes[SecurityDirectives](SecurityDirectives.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. SecurityDirectives
2. SecurityDirectives
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#AsyncAuthenticator[T]=akka.http.scaladsl.server.directives.Credentials=>scala.concurrent.Future[Option[T]] "Permalink")  type AsyncAuthenticator\[T] \= ([Credentials](Credentials.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]Definition Classes[SecurityDirectives](SecurityDirectives.html)
2. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#AsyncAuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,scala.concurrent.Future[T]] "Permalink")  type AsyncAuthenticatorPF\[T] \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Credentials](Credentials.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]Definition Classes[SecurityDirectives](SecurityDirectives.html)
3. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#AuthenticationResult[+T]=Either[akka.http.scaladsl.model.headers.HttpChallenge,T] "Permalink")  type AuthenticationResult\[\+T] \= [Either](https://www.scala-lang.org/api/2.13.17/scala/util/Either.html#scala.util.Either)\[[HttpChallenge](../../model/headers/HttpChallenge.html), T]The result of an HTTP authentication attempt is either the user object or
an HttpChallenge to present to the browser.

The result of an HTTP authentication attempt is either the user object or
an HttpChallenge to present to the browser.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
4. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#Authenticator[T]=akka.http.scaladsl.server.directives.Credentials=>Option[T] "Permalink")  type Authenticator\[T] \= ([Credentials](Credentials.html)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]Definition Classes[SecurityDirectives](SecurityDirectives.html)
5. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#AuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,T] "Permalink")  type AuthenticatorPF\[T] \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Credentials](Credentials.html), T]Definition Classes[SecurityDirectives](SecurityDirectives.html)
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateBasic[T](realm:String,authenticator:SecurityDirectives.this.Authenticator[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateBasic\[T](realm: String, authenticator: [Authenticator](#Authenticator[T]=akka.http.scaladsl.server.directives.Credentials=>Option[T])\[T]): [AuthenticationDirective](AuthenticationDirective.html)\[T]Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`.

Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
6. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateBasicAsync[T](realm:String,authenticator:SecurityDirectives.this.AsyncAuthenticator[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateBasicAsync\[T](realm: String, authenticator: [AsyncAuthenticator](#AsyncAuthenticator[T]=akka.http.scaladsl.server.directives.Credentials=>scala.concurrent.Future[Option[T]])\[T]): [AuthenticationDirective](AuthenticationDirective.html)\[T]Wraps the inner route with Http Basic authentication support.

Wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
7. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateBasicPF[T](realm:String,authenticator:SecurityDirectives.this.AuthenticatorPF[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateBasicPF\[T](realm: String, authenticator: [AuthenticatorPF](#AuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,T])\[T]): [AuthenticationDirective](AuthenticationDirective.html)\[T]A directive that wraps the inner route with Http Basic authentication support.

A directive that wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
8. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateBasicPFAsync[T](realm:String,authenticator:SecurityDirectives.this.AsyncAuthenticatorPF[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateBasicPFAsync\[T](realm: String, authenticator: [AsyncAuthenticatorPF](#AsyncAuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,scala.concurrent.Future[T]])\[T]): [AuthenticationDirective](AuthenticationDirective.html)\[T]A directive that wraps the inner route with Http Basic authentication support.

A directive that wraps the inner route with Http Basic authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
9. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateOAuth2[T](realm:String,authenticator:SecurityDirectives.this.Authenticator[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOAuth2\[T](realm: String, authenticator: [Authenticator](#Authenticator[T]=akka.http.scaladsl.server.directives.Credentials=>Option[T])\[T]): [AuthenticationDirective](AuthenticationDirective.html)\[T]A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
10. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateOAuth2Async[T](realm:String,authenticator:SecurityDirectives.this.AsyncAuthenticator[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOAuth2Async\[T](realm: String, authenticator: [AsyncAuthenticator](#AsyncAuthenticator[T]=akka.http.scaladsl.server.directives.Credentials=>scala.concurrent.Future[Option[T]])\[T]): [AuthenticationDirective](AuthenticationDirective.html)\[T]A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
11. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateOAuth2PF[T](realm:String,authenticator:SecurityDirectives.this.AuthenticatorPF[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOAuth2PF\[T](realm: String, authenticator: [AuthenticatorPF](#AuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,T])\[T]): [AuthenticationDirective](AuthenticationDirective.html)\[T]A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
12. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateOAuth2PFAsync[T](realm:String,authenticator:SecurityDirectives.this.AsyncAuthenticatorPF[T]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOAuth2PFAsync\[T](realm: String, authenticator: [AsyncAuthenticatorPF](#AsyncAuthenticatorPF[T]=PartialFunction[akka.http.scaladsl.server.directives.Credentials,scala.concurrent.Future[T]])\[T]): [AuthenticationDirective](AuthenticationDirective.html)\[T]A directive that wraps the inner route with OAuth2 Bearer Token authentication support.

A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
The given authenticator determines whether the credentials in the request are valid
and, if so, which user object to supply to the inner route.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
13. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateOrRejectWithChallenge[C<:akka.http.scaladsl.model.headers.HttpCredentials,T](authenticator:Option[C]=>scala.concurrent.Future[SecurityDirectives.this.AuthenticationResult[T]])(implicitevidence$1:scala.reflect.ClassTag[C]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOrRejectWithChallenge\[C \<: [HttpCredentials](../../model/headers/HttpCredentials.html), T](authenticator: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[C]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AuthenticationResult](#AuthenticationResult[+T]=Either[akka.http.scaladsl.model.headers.HttpChallenge,T])\[T]])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[C]): [AuthenticationDirective](AuthenticationDirective.html)\[T]Lifts an authenticator function into a directive.

Lifts an authenticator function into a directive. Same as `authenticateOrRejectWithChallenge`
but only applies the authenticator function with a certain type of credentials.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
14. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authenticateOrRejectWithChallenge[T](authenticator:Option[akka.http.scaladsl.model.headers.HttpCredentials]=>scala.concurrent.Future[SecurityDirectives.this.AuthenticationResult[T]]):akka.http.scaladsl.server.directives.AuthenticationDirective[T] "Permalink")  def authenticateOrRejectWithChallenge\[T](authenticator: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpCredentials](../../model/headers/HttpCredentials.html)]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[AuthenticationResult](#AuthenticationResult[+T]=Either[akka.http.scaladsl.model.headers.HttpChallenge,T])\[T]]): [AuthenticationDirective](AuthenticationDirective.html)\[T]Lifts an authenticator function into a directive.

Lifts an authenticator function into a directive. The authenticator function gets passed in credentials from the
Authorization header of the request. If the function returns `Right(user)` the user object is provided
to the inner route. If the function returns `Left(challenge)` the request is rejected with an
[AuthenticationFailedRejection](../AuthenticationFailedRejection.html) that contains this challenge to be added to the response.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
15. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0 "Permalink")  def authorize(check: ([RequestContext](../RequestContext.html)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Applies the given authorization check to the request.

Applies the given authorization check to the request.
If the check fails the route is rejected with an [AuthorizationFailedRejection](../AuthorizationFailedRejection$.html).

Definition Classes[SecurityDirectives](SecurityDirectives.html)
16. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authorize(check:=>Boolean):akka.http.scaladsl.server.Directive0 "Permalink")  def authorize(check: \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Applies the given authorization check to the request.

Applies the given authorization check to the request.
If the check fails the route is rejected with an [AuthorizationFailedRejection](../AuthorizationFailedRejection$.html).

Definition Classes[SecurityDirectives](SecurityDirectives.html)
17. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authorizeAsync(check:akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[Boolean]):akka.http.scaladsl.server.Directive0 "Permalink")  def authorizeAsync(check: ([RequestContext](../RequestContext.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Asynchronous version of [authorize](#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0).

Asynchronous version of [authorize](#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0).
If the Future fails or is completed with `false`
authorization fails and the route is rejected with an [AuthorizationFailedRejection](../AuthorizationFailedRejection$.html).

Definition Classes[SecurityDirectives](SecurityDirectives.html)
18. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#authorizeAsync(check:=>scala.concurrent.Future[Boolean]):akka.http.scaladsl.server.Directive0 "Permalink")  def authorizeAsync(check: \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Asynchronous version of [authorize](#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0).

Asynchronous version of [authorize](#authorize(check:akka.http.scaladsl.server.RequestContext=>Boolean):akka.http.scaladsl.server.Directive0).
If the Future fails or is completed with `false`
authorization fails and the route is rejected with an [AuthorizationFailedRejection](../AuthorizationFailedRejection$.html).

Definition Classes[SecurityDirectives](SecurityDirectives.html)
19. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#extractCredentials:akka.http.scaladsl.server.Directive1[Option[akka.http.scaladsl.model.headers.HttpCredentials]] "Permalink")  def extractCredentials: [Directive1](../index.html#Directive1[T]=akka.http.scaladsl.server.Directive[(T,)])\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpCredentials](../../model/headers/HttpCredentials.html)]]Extracts the potentially present HttpCredentials provided with the request's Authorization header.

Extracts the potentially present HttpCredentials provided with the request's Authorization header.

Definition Classes[SecurityDirectives](SecurityDirectives.html)
23. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/SecurityDirectives$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [SecurityDirectives](SecurityDirectives.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Security directives

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpChallenge.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
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

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/SecurityDirectives$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/SecurityDirectives$.html)*