---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/SecurityDirectives.html
title: SecurityDirectives
---

# SecurityDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface SecurityDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[SecurityDirectives$](SecurityDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface SecurityDirectives
```

Provides directives for securing an inner route using the standard Http authentication headers {@link `WWW-Authenticate`}
 and `Authorization`. Most prominently, HTTP Basic authentication and OAuth 2\.0 Authorization Framework
 as defined in RFC 2617 and RFC 6750 respectively.
 
 See: [RFC 2617](https://www.ietf.org/rfc/rfc2617.txt).
 See: [RFC 6750](https://www.ietf.org/rfc/rfc6750.txt).

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateBasic](#authenticateBasic(java.lang.String,scala.Function1))​(java.lang.String realm,  scala.Function1<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.Option<T>> authenticator)` | Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`. |
	| `<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateBasicAsync](#authenticateBasicAsync(java.lang.String,scala.Function1))​(java.lang.String realm,  scala.Function1<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.concurrent.Future<scala.Option<T>>> authenticator)` | Wraps the inner route with Http Basic authentication support. |
	| `<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateBasicPF](#authenticateBasicPF(java.lang.String,scala.PartialFunction))​(java.lang.String realm,  scala.PartialFunction<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​T> authenticator)` | A directive that wraps the inner route with Http Basic authentication support. |
	| `<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateBasicPFAsync](#authenticateBasicPFAsync(java.lang.String,scala.PartialFunction))​(java.lang.String realm,  scala.PartialFunction<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.concurrent.Future<T>> authenticator)` | A directive that wraps the inner route with Http Basic authentication support. |
	| `<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateOAuth2](#authenticateOAuth2(java.lang.String,scala.Function1))​(java.lang.String realm,  scala.Function1<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.Option<T>> authenticator)` | A directive that wraps the inner route with OAuth2 Bearer Token authentication support. |
	| `<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateOAuth2Async](#authenticateOAuth2Async(java.lang.String,scala.Function1))​(java.lang.String realm,  scala.Function1<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.concurrent.Future<scala.Option<T>>> authenticator)` | A directive that wraps the inner route with OAuth2 Bearer Token authentication support. |
	| `<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateOAuth2PF](#authenticateOAuth2PF(java.lang.String,scala.PartialFunction))​(java.lang.String realm,  scala.PartialFunction<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​T> authenticator)` | A directive that wraps the inner route with OAuth2 Bearer Token authentication support. |
	| `<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateOAuth2PFAsync](#authenticateOAuth2PFAsync(java.lang.String,scala.PartialFunction))​(java.lang.String realm,  scala.PartialFunction<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.concurrent.Future<T>> authenticator)` | A directive that wraps the inner route with OAuth2 Bearer Token authentication support. |
	| `<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateOrRejectWithChallenge](#authenticateOrRejectWithChallenge(scala.Function1))​(scala.Function1<scala.Option<[HttpCredentials](../../model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")>,​scala.concurrent.Future<scala.util.Either<[HttpChallenge](../../model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers"),​T>>> authenticator)` | Lifts an authenticator function into a directive. |
	| `<C extends [HttpCredentials](../../model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers"),​T>[AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[authenticateOrRejectWithChallenge](#authenticateOrRejectWithChallenge(scala.Function1,scala.reflect.ClassTag))​(scala.Function1<scala.Option<C>,​scala.concurrent.Future<scala.util.Either<[HttpChallenge](../../model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers"),​T>>> authenticator,  scala.reflect.ClassTag<C> evidence$1)` | Lifts an authenticator function into a directive. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[authorize](#authorize(scala.Function0))​(scala.Function0<java.lang.Object> check)` | Applies the given authorization check to the request. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[authorize](#authorize(scala.Function1))​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​java.lang.Object> check)` | Applies the given authorization check to the request. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[authorizeAsync](#authorizeAsync(scala.Function0))​(scala.Function0<scala.concurrent.Future<java.lang.Object>> check)` | Asynchronous version of [`authorize(scala.Function0<java.lang.Object>)`](#authorize(scala.Function0)). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[authorizeAsync](#authorizeAsync(scala.Function1))​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<java.lang.Object>> check)` | Asynchronous version of [`authorize(scala.Function0<java.lang.Object>)`](#authorize(scala.Function0)). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<[HttpCredentials](../../model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")>>>` | `[extractCredentials](#extractCredentials())()` | Extracts the potentially present `HttpCredentials` provided with the request's `Authorization` header. |
	| `<C extends [HttpCredentials](../../model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers"),​T>[AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T>` | `[extractCredentialsAndAuthenticateOrRejectWithChallenge](#extractCredentialsAndAuthenticateOrRejectWithChallenge(akka.http.scaladsl.server.Directive,scala.Function1))​([Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<C>>> extractCredentials,  scala.Function1<scala.Option<C>,​scala.concurrent.Future<scala.util.Either<[HttpChallenge](../../model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers"),​T>>> authenticator)` | Lifts an authenticator function into a directive. |

- - ### Method Detail
	
	
	
		- #### extractCredentials
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<[HttpCredentials](../../model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")>>> extractCredentials()
		```
		
		Extracts the potentially present `HttpCredentials` provided with the request's `Authorization` header.
		 
		
		Returns:
		(undocumented)
		- #### authenticateBasic
		
		
		
		```
		<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateBasic​(java.lang.String realm,
		                                                 scala.Function1<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.Option<T>> authenticator)
		```
		
		Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]`.
		 The given authenticator determines whether the credentials in the request are valid
		 and, if so, which user object to supply to the inner route.
		 
		
		Parameters:
		`realm` \- (undocumented)
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### authenticateBasicAsync
		
		
		
		```
		<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateBasicAsync​(java.lang.String realm,
		                                                      scala.Function1<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.concurrent.Future<scala.Option<T>>> authenticator)
		```
		
		Wraps the inner route with Http Basic authentication support.
		 The given authenticator determines whether the credentials in the request are valid
		 and, if so, which user object to supply to the inner route.
		 
		
		Parameters:
		`realm` \- (undocumented)
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### authenticateBasicPF
		
		
		
		```
		<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateBasicPF​(java.lang.String realm,
		                                                   scala.PartialFunction<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​T> authenticator)
		```
		
		A directive that wraps the inner route with Http Basic authentication support.
		 The given authenticator determines whether the credentials in the request are valid
		 and, if so, which user object to supply to the inner route.
		 
		
		Parameters:
		`realm` \- (undocumented)
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### authenticateBasicPFAsync
		
		
		
		```
		<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateBasicPFAsync​(java.lang.String realm,
		                                                        scala.PartialFunction<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.concurrent.Future<T>> authenticator)
		```
		
		A directive that wraps the inner route with Http Basic authentication support.
		 The given authenticator determines whether the credentials in the request are valid
		 and, if so, which user object to supply to the inner route.
		 
		
		Parameters:
		`realm` \- (undocumented)
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### authenticateOAuth2
		
		
		
		```
		<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateOAuth2​(java.lang.String realm,
		                                                  scala.Function1<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.Option<T>> authenticator)
		```
		
		A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
		 The given authenticator determines whether the credentials in the request are valid
		 and, if so, which user object to supply to the inner route.
		 
		
		Parameters:
		`realm` \- (undocumented)
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### authenticateOAuth2Async
		
		
		
		```
		<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateOAuth2Async​(java.lang.String realm,
		                                                       scala.Function1<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.concurrent.Future<scala.Option<T>>> authenticator)
		```
		
		A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
		 The given authenticator determines whether the credentials in the request are valid
		 and, if so, which user object to supply to the inner route.
		 
		
		Parameters:
		`realm` \- (undocumented)
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### authenticateOAuth2PF
		
		
		
		```
		<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateOAuth2PF​(java.lang.String realm,
		                                                    scala.PartialFunction<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​T> authenticator)
		```
		
		A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
		 The given authenticator determines whether the credentials in the request are valid
		 and, if so, which user object to supply to the inner route.
		 
		
		Parameters:
		`realm` \- (undocumented)
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### authenticateOAuth2PFAsync
		
		
		
		```
		<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateOAuth2PFAsync​(java.lang.String realm,
		                                                         scala.PartialFunction<[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.concurrent.Future<T>> authenticator)
		```
		
		A directive that wraps the inner route with OAuth2 Bearer Token authentication support.
		 The given authenticator determines whether the credentials in the request are valid
		 and, if so, which user object to supply to the inner route.
		 
		
		Parameters:
		`realm` \- (undocumented)
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractCredentialsAndAuthenticateOrRejectWithChallenge
		
		
		
		```
		<C extends [HttpCredentials](../../model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers"),​T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> extractCredentialsAndAuthenticateOrRejectWithChallenge​([Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<C>>> extractCredentials,
		                                                                                                                      scala.Function1<scala.Option<C>,​scala.concurrent.Future<scala.util.Either<[HttpChallenge](../../model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers"),​T>>> authenticator)
		```
		
		Lifts an authenticator function into a directive. The authenticator function gets passed in credentials from the
		 `Authorization` header of the request. If the function returns `Right(user)` the user object is provided
		 to the inner route. If the function returns `Left(challenge)` the request is rejected with an
		 `AuthenticationFailedRejection` that contains this challenge to be added to the response.
		 
		 You can supply a directive to extract the credentials (to support alternative ways of providing credentials).
		 
		
		
		
		Parameters:
		`extractCredentials` \- (undocumented)
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### authenticateOrRejectWithChallenge
		
		
		
		```
		<T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateOrRejectWithChallenge​(scala.Function1<scala.Option<[HttpCredentials](../../model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")>,​scala.concurrent.Future<scala.util.Either<[HttpChallenge](../../model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers"),​T>>> authenticator)
		```
		
		Lifts an authenticator function into a directive. The authenticator function gets passed in credentials from the
		 `Authorization` header of the request. If the function returns `Right(user)` the user object is provided
		 to the inner route. If the function returns `Left(challenge)` the request is rejected with an
		 `AuthenticationFailedRejection` that contains this challenge to be added to the response.
		 
		
		Parameters:
		`authenticator` \- (undocumented)
		Returns:
		(undocumented)
		- #### authenticateOrRejectWithChallenge
		
		
		
		```
		<C extends [HttpCredentials](../../model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers"),​T> [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")<T> authenticateOrRejectWithChallenge​(scala.Function1<scala.Option<C>,​scala.concurrent.Future<scala.util.Either<[HttpChallenge](../../model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers"),​T>>> authenticator,
		                                                                                                 scala.reflect.ClassTag<C> evidence$1)
		```
		
		Lifts an authenticator function into a directive. Same as `authenticateOrRejectWithChallenge`
		 but only applies the authenticator function with a certain type of credentials.
		 
		
		Parameters:
		`authenticator` \- (undocumented)
		`evidence$1` \- (undocumented)
		Returns:
		(undocumented)
		- #### authorize
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> authorize​(scala.Function0<java.lang.Object> check)
		```
		
		Applies the given authorization check to the request.
		 If the check fails the route is rejected with an `AuthorizationFailedRejection`.
		 
		
		Parameters:
		`check` \- (undocumented)
		Returns:
		(undocumented)
		- #### authorize
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> authorize​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​java.lang.Object> check)
		```
		
		Applies the given authorization check to the request.
		 If the check fails the route is rejected with an `AuthorizationFailedRejection`.
		 
		
		Parameters:
		`check` \- (undocumented)
		Returns:
		(undocumented)
		- #### authorizeAsync
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> authorizeAsync​(scala.Function0<scala.concurrent.Future<java.lang.Object>> check)
		```
		
		Asynchronous version of [`authorize(scala.Function0<java.lang.Object>)`](#authorize(scala.Function0)).
		 If the `Future` fails or is completed with `false`
		 authorization fails and the route is rejected with an `AuthorizationFailedRejection`.
		 
		
		Parameters:
		`check` \- (undocumented)
		Returns:
		(undocumented)
		- #### authorizeAsync
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> authorizeAsync​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<java.lang.Object>> check)
		```
		
		Asynchronous version of [`authorize(scala.Function0<java.lang.Object>)`](#authorize(scala.Function0)).
		 If the `Future` fails or is completed with `false`
		 authorization fails and the route is rejected with an `AuthorizationFailedRejection`.
		 
		
		Parameters:
		`check` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/SecurityDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/SecurityDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/SecurityDirectives.html)*