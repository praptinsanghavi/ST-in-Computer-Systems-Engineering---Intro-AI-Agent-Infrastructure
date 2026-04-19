---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/JwtClaims.html
title: JwtClaims
---

# JwtClaims

## Content

Package [akka.http.jwt.javadsl.server.directives](package-summary.html)
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
	| `java.util.Optional<java.lang.Object>` | `[getBooleanClaim](#getBooleanClaim(java.lang.String))​(java.lang.String name)` | Extracts a boolean claim from the list of claims. |
	| `java.util.Optional<java.lang.Object>` | `[getDoubleClaim](#getDoubleClaim(java.lang.String))​(java.lang.String name)` | Extracts a double claim from the list of claims. |
	| `java.util.Optional<java.lang.Object>` | `[getIntClaim](#getIntClaim(java.lang.String))​(java.lang.String name)` | Extracts an integer claim from the list of claims. |
	| `java.util.Optional<java.lang.Object>` | `[getLongClaim](#getLongClaim(java.lang.String))​(java.lang.String name)` | Extracts a long claim from the list of claims. |
	| `java.util.Optional<java.lang.String>` | `[getRawClaim](#getRawClaim(java.lang.String))​(java.lang.String name)` | Extracts a raw claim from the list of claims. |
	| `java.util.Optional<java.lang.String>` | `[getStringClaim](#getStringClaim(java.lang.String))​(java.lang.String name)` | Extracts a string claim from the list of claims. |
	| `java.util.List<java.lang.String>` | `[getStringClaims](#getStringClaims(java.lang.String))​(java.lang.String name)` | Extracts a list of string claims from the list of claims. |
	| `boolean` | `[hasClaim](#hasClaim(java.lang.String))​(java.lang.String name)` | Checks if a claim with the given name exists in the list of claims. |

- - ### Method Detail
	
	
	
		- #### getBooleanClaim
		
		
		
		```
		java.util.Optional<java.lang.Object> getBooleanClaim​(java.lang.String name)
		```
		
		Extracts a boolean claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the boolean value of the claim if it exists and is a boolean, Optional.empty otherwise.
		- #### getDoubleClaim
		
		
		
		```
		java.util.Optional<java.lang.Object> getDoubleClaim​(java.lang.String name)
		```
		
		Extracts a double claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the double value of the claim if it exists and is a double, Optional.empty otherwise.
		- #### getIntClaim
		
		
		
		```
		java.util.Optional<java.lang.Object> getIntClaim​(java.lang.String name)
		```
		
		Extracts an integer claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the integer value of the claim if it exists and is an integer, Optional.empty otherwise.
		- #### getLongClaim
		
		
		
		```
		java.util.Optional<java.lang.Object> getLongClaim​(java.lang.String name)
		```
		
		Extracts a long claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the long value of the claim if it exists and is a long, Optional.empty otherwise.
		- #### getRawClaim
		
		
		
		```
		java.util.Optional<java.lang.String> getRawClaim​(java.lang.String name)
		```
		
		Extracts a raw claim from the list of claims.
		 This can be useful if you need to extract a claim that is not a primitive type but a complex one.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the raw JSON String value of the claim if it exists, Optional.empty otherwise.
		- #### getStringClaim
		
		
		
		```
		java.util.Optional<java.lang.String> getStringClaim​(java.lang.String name)
		```
		
		Extracts a string claim from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the string value of the claim if it exists and is a string, Optional.empty otherwise.
		- #### getStringClaims
		
		
		
		```
		java.util.List<java.lang.String> getStringClaims​(java.lang.String name)
		```
		
		Extracts a list of string claims from the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		a List containing the string values of the claim if it exists and is a list of strings, empty list otherwise.
		- #### hasClaim
		
		
		
		```
		boolean hasClaim​(java.lang.String name)
		```
		
		Checks if a claim with the given name exists in the list of claims.
		 
		
		Parameters:
		`name` \- the name of the claim.
		Returns:
		true if the claim exists, false otherwise.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtClaimsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/JwtClaims.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/JwtClaims.html)*