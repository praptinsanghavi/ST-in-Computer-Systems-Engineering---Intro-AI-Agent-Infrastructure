---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/JwtDirectives.html
title: JwtDirectives
---

# JwtDirectives

## Content

Package [akka.http.jwt.scaladsl.server.directives](package-summary.html)
## Interface JwtDirectives

- All Known Implementing Classes:
`[JwtDirectives$](JwtDirectives$.html "class in akka.http.jwt.scaladsl.server.directives")`

---

```
public interface JwtDirectives
```

JwtDirectives provides utilities to assert and extract claims from a JSON Web Token (JWT).
 
 For more information about JWTs, see {@link https://jwt.io/} or consult RFC 7519: {@link https://datatracker.ietf.org/doc/html/rfc7519}

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<[Credentials](../../../../scaladsl/server/directives/Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.Option<spray.json.JsObject>>` | `[bearerTokenAuthenticator](#bearerTokenAuthenticator(akka.http.jwt.internal.JwtSupport,akka.event.LoggingAdapter))​([JwtSupport](../../../internal/JwtSupport.html "interface in akka.http.jwt.internal") jwtSupport,  akka.event.LoggingAdapter log)` |  |
	| `[Directive](../../../../scaladsl/server/Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[JwtClaims](JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")>>` | `[jwt](#jwt())()` | Wraps its inner route with support for the JWT mechanism, enabling JWT token validation. |
	| `[Directive](../../../../scaladsl/server/Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[JwtClaims](JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")>>` | `[jwt](#jwt(akka.http.jwt.scaladsl.JwtSettings))​([JwtSettings](../../JwtSettings.html "interface in akka.http.jwt.scaladsl") settings)` | Wraps its inner route with support for the JWT mechanism, enabling JWT token validation using the given jwt settings. |

- - ### Method Detail
	
	
	
		- #### jwt
		
		
		
		```
		[Directive](../../../../scaladsl/server/Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[JwtClaims](JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")>> jwt()
		```
		
		Wraps its inner route with support for the JWT mechanism, enabling JWT token validation.
		 JWT token validation is done automatically extracting the token from the Authorization header.
		 If the token is valid, the inner route is executed and provided the set of claims as [`JwtClaims`](JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives"),
		 otherwise a 401 Unauthorized response is returned.
		
		Returns:
		(undocumented)
		- #### jwt
		
		
		
		```
		[Directive](../../../../scaladsl/server/Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[JwtClaims](JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")>> jwt​([JwtSettings](../../JwtSettings.html "interface in akka.http.jwt.scaladsl") settings)
		```
		
		Wraps its inner route with support for the JWT mechanism, enabling JWT token validation using the given jwt settings.
		 JWT token validation is done automatically extracting the token from the Authorization header.
		 If the token is valid, the inner route is executed and provided the set of claims as [`JwtClaims`](JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives"),
		 otherwise a 401 Unauthorized response is returned.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### bearerTokenAuthenticator
		
		
		
		```
		scala.Function1<[Credentials](../../../../scaladsl/server/directives/Credentials.html "interface in akka.http.scaladsl.server.directives"),​scala.Option<spray.json.JsObject>> bearerTokenAuthenticator​([JwtSupport](../../../internal/JwtSupport.html "interface in akka.http.jwt.internal") jwtSupport,
		                                                                                              akka.event.LoggingAdapter log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/JwtSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/JwtClaims.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/JwtDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/Credentials.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/JwtDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/JwtDirectives.html)*