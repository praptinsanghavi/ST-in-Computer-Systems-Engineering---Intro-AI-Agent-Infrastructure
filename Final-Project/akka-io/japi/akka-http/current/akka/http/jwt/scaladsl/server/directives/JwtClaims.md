---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/JwtClaims.html
title: JwtClaims
---

# JwtClaims

## Content

Package [akka.http.jwt.scaladsl.server.directives](package-summary.html)
## Interface JwtClaims

- All Known Implementing Classes:
`[JwtClaimsImpl](../../../internal/JwtClaimsImpl.html "class in akka.http.jwt.internal")`

---

```
public interface JwtClaims
```

JwtClaims provides a utility to access claims extracted from a JWT token.
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.lang.Object>` | `[booleanClaim](#booleanClaim(java.lang.String))​(java.lang.String name)` | Extracts a boolean claim from the list of claims. |
	| `scala.Option<java.lang.Object>` | `[doubleClaim](#doubleClaim(java.lang.String))​(java.lang.String name)` | Extracts a double claim from the list of claims. |
	| `boolean` | `[hasClaim](#hasClaim(java.lang.String))​(java.lang.String name)` | Checks if a claim with the given name exists in the list of claims. |
	| `scala.Option<java.lang.Object>` | `[intClaim](#intClaim(java.lang.String))​(java.lang.String name)` | Extracts an integer claim from the list of claims. |
	| `scala.Option<java.lang.Object>` | `[longClaim](#longClaim(java.lang.String))​(java.lang.String name)` | Extracts a long claim from the list of claims. |
	| `scala.Option<spray.json.JsValue>` | `[rawClaim](#rawClaim(java.lang.String))​(java.lang.String name)` | Extracts a raw claim from the list of claims. |
	| `scala.Option<java.lang.String>` | `[stringClaim](#stringClaim(java.lang.String))​(java.lang.String name)` | Extracts a string claim from the list of claims. |
	| `scala.collection.immutable.List<java.lang.String>` | `[stringClaims](#stringClaims(java.lang.String))​(java.lang.String name)` | Extracts a list of string claims from the list of claims. |

- - ### Method Detail
	
	
	
		- #### booleanClaim
		
		
		
		```
		scala.Option<java.lang.Object> booleanClaim​(java.lang.String name)
		```
		
		Extracts a boolean claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the boolean value of the claim if it exists and is a boolean, None otherwise.
		- #### doubleClaim
		
		
		
		```
		scala.Option<java.lang.Object> doubleClaim​(java.lang.String name)
		```
		
		Extracts a double claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the double value of the claim if it exists and is a double, None otherwise.
		- #### hasClaim
		
		
		
		```
		boolean hasClaim​(java.lang.String name)
		```
		
		Checks if a claim with the given name exists in the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		true if the claim exists, false otherwise.
		- #### intClaim
		
		
		
		```
		scala.Option<java.lang.Object> intClaim​(java.lang.String name)
		```
		
		Extracts an integer claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the integer value of the claim if it exists and is an integer, None otherwise.
		- #### longClaim
		
		
		
		```
		scala.Option<java.lang.Object> longClaim​(java.lang.String name)
		```
		
		Extracts a long claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the long value of the claim if it exists and is a long, None otherwise.
		- #### rawClaim
		
		
		
		```
		scala.Option<spray.json.JsValue> rawClaim​(java.lang.String name)
		```
		
		Extracts a raw claim from the list of claims.
		 This can be useful if you need to extract a claim that is not a primitive type but a complex one.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the raw JsValue of the claim if it exists, None otherwise.
		- #### stringClaim
		
		
		
		```
		scala.Option<java.lang.String> stringClaim​(java.lang.String name)
		```
		
		Extracts a string claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the string value of the claim if it exists and is a string, None otherwise.
		- #### stringClaims
		
		
		
		```
		scala.collection.immutable.List<java.lang.String> stringClaims​(java.lang.String name)
		```
		
		Extracts a list of string claims from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		a List containing the string values of the claim if it exists and is a list of strings, empty list otherwise.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtClaimsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/JwtClaims.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/JwtClaims.html)*