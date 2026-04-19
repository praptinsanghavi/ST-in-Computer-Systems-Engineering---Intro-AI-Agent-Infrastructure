---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/JwtDirectives.html
title: JwtDirectives
---

# JwtDirectives

## Content

Package [akka.http.jwt.javadsl.server.directives](package-summary.html)
## Class JwtDirectives

- java.lang.Object
- - akka.http.jwt.javadsl.server.directives.JwtDirectives

- ---

```
public abstract class JwtDirectives
extends java.lang.Object
```

JwtDirectives provides utilities to easily assert and extract claims from a JSON Web Token (JWT).
 
 For more information about JWTs, see {@link https://jwt.io/} or consult RFC 7519: {@link https://datatracker.ietf.org/doc/html/rfc7519}

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JwtDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Route](../../../../javadsl/server/Route.html "interface in akka.http.javadsl.server")` | `[jwt](#jwt(akka.http.jwt.javadsl.JwtSettings,java.util.function.Function))​([JwtSettings](../../JwtSettings.html "class in akka.http.jwt.javadsl") settings,  java.util.function.Function<[JwtClaims](JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives"),​[Route](../../../../javadsl/server/Route.html "interface in akka.http.javadsl.server")> inner)` | Wraps its inner route with support for the JWT mechanism, enabling JWT token validation using the given jwt settings. |
	| `[Route](../../../../javadsl/server/Route.html "interface in akka.http.javadsl.server")` | `[jwt](#jwt(java.util.function.Function))​(java.util.function.Function<[JwtClaims](JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives"),​[Route](../../../../javadsl/server/Route.html "interface in akka.http.javadsl.server")> inner)` | Wraps its inner route with support for the JWT mechanism, enabling JWT token validation. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JwtDirectives
		
		
		
		```
		public JwtDirectives()
		```

	- ### Method Detail
	
	
	
		- #### jwt
		
		
		
		```
		public [Route](../../../../javadsl/server/Route.html "interface in akka.http.javadsl.server") jwt​(java.util.function.Function<[JwtClaims](JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives"),​[Route](../../../../javadsl/server/Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Wraps its inner route with support for the JWT mechanism, enabling JWT token validation.
		 JWT token validation is done automatically extracting the token from the Authorization header.
		 If the token is valid, the inner route is executed and provided the set of claims as [`JwtClaims`](JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives"),
		 otherwise a 401 Unauthorized response is returned.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### jwt
		
		
		
		```
		public [Route](../../../../javadsl/server/Route.html "interface in akka.http.javadsl.server") jwt​([JwtSettings](../../JwtSettings.html "class in akka.http.jwt.javadsl") settings,
		                 java.util.function.Function<[JwtClaims](JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives"),​[Route](../../../../javadsl/server/Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Wraps its inner route with support for the JWT mechanism, enabling JWT token validation using the given jwt settings.
		 JWT token validation is done automatically extracting the token from the Authorization header.
		 If the token is valid, the inner route is executed and provided the set of claims as [`JwtClaims`](JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives"),
		 otherwise a 401 Unauthorized response is returned.
		
		Parameters:
		`settings` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/JwtSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/JwtClaims.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/JwtDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/JwtDirectives.html)*