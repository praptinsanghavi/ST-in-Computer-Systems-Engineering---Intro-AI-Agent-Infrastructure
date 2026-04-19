---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtClaimsImpl.html
title: JwtClaimsImpl
---

# JwtClaimsImpl

## Content

Package [akka.http.jwt.internal](package-summary.html)
## Class JwtClaimsImpl

- java.lang.Object
- - akka.http.jwt.internal.JwtClaimsImpl

- All Implemented Interfaces:
`[JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives")`, `[JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class JwtClaimsImpl
extends java.lang.Object
implements [JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives"), [JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives"), scala.Product, java.io.Serializable
```

INTERNAL API
 
 JwtClaims provides utilities to easily assert and extract claims from the JWT token

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.jwt.internal.JwtClaimsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JwtClaimsImpl](#%3Cinit%3E(spray.json.JsObject))​(spray.json.JsObject claims)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `scala.Option<java.lang.Object>` | `[booleanClaim](#booleanClaim(java.lang.String))​(java.lang.String name)` | Extracts a boolean claim from the list of claims. |
	| `spray.json.JsObject` | `[claims](#claims())()` |  |
	| `scala.Option<java.lang.Object>` | `[doubleClaim](#doubleClaim(java.lang.String))​(java.lang.String name)` | Extracts a double claim from the list of claims. |
	| `java.util.Optional<java.lang.Object>` | `[getBooleanClaim](#getBooleanClaim(java.lang.String))​(java.lang.String name)` | Extracts a boolean claim from the list of claims. |
	| `java.util.Optional<java.lang.Object>` | `[getDoubleClaim](#getDoubleClaim(java.lang.String))​(java.lang.String name)` | Extracts a double claim from the list of claims. |
	| `java.util.Optional<java.lang.Object>` | `[getIntClaim](#getIntClaim(java.lang.String))​(java.lang.String name)` | Extracts an integer claim from the list of claims. |
	| `java.util.Optional<java.lang.Object>` | `[getLongClaim](#getLongClaim(java.lang.String))​(java.lang.String name)` | Extracts a long claim from the list of claims. |
	| `java.util.Optional<java.lang.String>` | `[getRawClaim](#getRawClaim(java.lang.String))​(java.lang.String name)` | Extracts a raw claim from the list of claims. |
	| `java.util.Optional<java.lang.String>` | `[getStringClaim](#getStringClaim(java.lang.String))​(java.lang.String name)` | Extracts a string claim from the list of claims. |
	| `java.util.List<java.lang.String>` | `[getStringClaims](#getStringClaims(java.lang.String))​(java.lang.String name)` | Extracts a list of string claims from the list of claims. |
	| `boolean` | `[hasClaim](#hasClaim(java.lang.String))​(java.lang.String name)` | Checks if a claim with the given name exists in the list of claims. |
	| `scala.Option<java.lang.Object>` | `[intClaim](#intClaim(java.lang.String))​(java.lang.String name)` | Extracts an integer claim from the list of claims. |
	| `scala.Option<java.lang.Object>` | `[longClaim](#longClaim(java.lang.String))​(java.lang.String name)` | Extracts a long claim from the list of claims. |
	| `scala.Option<spray.json.JsValue>` | `[rawClaim](#rawClaim(java.lang.String))​(java.lang.String name)` | Extracts a raw claim from the list of claims. |
	| `scala.Option<java.lang.String>` | `[stringClaim](#stringClaim(java.lang.String))​(java.lang.String name)` | Extracts a string claim from the list of claims. |
	| `scala.collection.immutable.List<java.lang.String>` | `[stringClaims](#stringClaims(java.lang.String))​(java.lang.String name)` | Extracts a list of string claims from the list of claims. |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### JwtClaimsImpl
		
		
		
		```
		public JwtClaimsImpl​(spray.json.JsObject claims)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### claims
		
		
		
		```
		public spray.json.JsObject claims()
		```
		- #### hasClaim
		
		
		
		```
		public boolean hasClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../scaladsl/server/directives/JwtClaims.html#hasClaim(java.lang.String))`
		Checks if a claim with the given name exists in the list of claims.
		 
		
		Specified by:
		`[hasClaim](../javadsl/server/directives/JwtClaims.html#hasClaim(java.lang.String))` in interface `[JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives")`
		Specified by:
		`[hasClaim](../scaladsl/server/directives/JwtClaims.html#hasClaim(java.lang.String))` in interface `[JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		true if the claim exists, false otherwise.
		- #### intClaim
		
		
		
		```
		public scala.Option<java.lang.Object> intClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../scaladsl/server/directives/JwtClaims.html#intClaim(java.lang.String))`
		Extracts an integer claim from the list of claims.
		 
		
		Specified by:
		`[intClaim](../scaladsl/server/directives/JwtClaims.html#intClaim(java.lang.String))` in interface `[JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the integer value of the claim if it exists and is an integer, None otherwise.
		- #### longClaim
		
		
		
		```
		public scala.Option<java.lang.Object> longClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../scaladsl/server/directives/JwtClaims.html#longClaim(java.lang.String))`
		Extracts a long claim from the list of claims.
		 
		
		Specified by:
		`[longClaim](../scaladsl/server/directives/JwtClaims.html#longClaim(java.lang.String))` in interface `[JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the long value of the claim if it exists and is a long, None otherwise.
		- #### doubleClaim
		
		
		
		```
		public scala.Option<java.lang.Object> doubleClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../scaladsl/server/directives/JwtClaims.html#doubleClaim(java.lang.String))`
		Extracts a double claim from the list of claims.
		 
		
		Specified by:
		`[doubleClaim](../scaladsl/server/directives/JwtClaims.html#doubleClaim(java.lang.String))` in interface `[JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the double value of the claim if it exists and is a double, None otherwise.
		- #### stringClaim
		
		
		
		```
		public scala.Option<java.lang.String> stringClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../scaladsl/server/directives/JwtClaims.html#stringClaim(java.lang.String))`
		Extracts a string claim from the list of claims.
		 
		
		Specified by:
		`[stringClaim](../scaladsl/server/directives/JwtClaims.html#stringClaim(java.lang.String))` in interface `[JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the string value of the claim if it exists and is a string, None otherwise.
		- #### stringClaims
		
		
		
		```
		public scala.collection.immutable.List<java.lang.String> stringClaims​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../scaladsl/server/directives/JwtClaims.html#stringClaims(java.lang.String))`
		Extracts a list of string claims from the list of claims.
		 
		
		Specified by:
		`[stringClaims](../scaladsl/server/directives/JwtClaims.html#stringClaims(java.lang.String))` in interface `[JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		a List containing the string values of the claim if it exists and is a list of strings, empty list otherwise.
		- #### booleanClaim
		
		
		
		```
		public scala.Option<java.lang.Object> booleanClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../scaladsl/server/directives/JwtClaims.html#booleanClaim(java.lang.String))`
		Extracts a boolean claim from the list of claims.
		 
		
		Specified by:
		`[booleanClaim](../scaladsl/server/directives/JwtClaims.html#booleanClaim(java.lang.String))` in interface `[JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the boolean value of the claim if it exists and is a boolean, None otherwise.
		- #### rawClaim
		
		
		
		```
		public scala.Option<spray.json.JsValue> rawClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../scaladsl/server/directives/JwtClaims.html#rawClaim(java.lang.String))`
		Extracts a raw claim from the list of claims.
		 This can be useful if you need to extract a claim that is not a primitive type but a complex one.
		 
		
		Specified by:
		`[rawClaim](../scaladsl/server/directives/JwtClaims.html#rawClaim(java.lang.String))` in interface `[JwtClaims](../scaladsl/server/directives/JwtClaims.html "interface in akka.http.jwt.scaladsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Option containing the raw JsValue of the claim if it exists, None otherwise.
		- #### getIntClaim
		
		
		
		```
		public java.util.Optional<java.lang.Object> getIntClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../javadsl/server/directives/JwtClaims.html#getIntClaim(java.lang.String))`
		Extracts an integer claim from the list of claims.
		 
		
		Specified by:
		`[getIntClaim](../javadsl/server/directives/JwtClaims.html#getIntClaim(java.lang.String))` in interface `[JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the integer value of the claim if it exists and is an integer, Optional.empty otherwise.
		- #### getLongClaim
		
		
		
		```
		public java.util.Optional<java.lang.Object> getLongClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../javadsl/server/directives/JwtClaims.html#getLongClaim(java.lang.String))`
		Extracts a long claim from the list of claims.
		 
		
		Specified by:
		`[getLongClaim](../javadsl/server/directives/JwtClaims.html#getLongClaim(java.lang.String))` in interface `[JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the long value of the claim if it exists and is a long, Optional.empty otherwise.
		- #### getDoubleClaim
		
		
		
		```
		public java.util.Optional<java.lang.Object> getDoubleClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../javadsl/server/directives/JwtClaims.html#getDoubleClaim(java.lang.String))`
		Extracts a double claim from the list of claims.
		 
		
		Specified by:
		`[getDoubleClaim](../javadsl/server/directives/JwtClaims.html#getDoubleClaim(java.lang.String))` in interface `[JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the double value of the claim if it exists and is a double, Optional.empty otherwise.
		- #### getStringClaim
		
		
		
		```
		public java.util.Optional<java.lang.String> getStringClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../javadsl/server/directives/JwtClaims.html#getStringClaim(java.lang.String))`
		Extracts a string claim from the list of claims.
		 
		
		Specified by:
		`[getStringClaim](../javadsl/server/directives/JwtClaims.html#getStringClaim(java.lang.String))` in interface `[JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the string value of the claim if it exists and is a string, Optional.empty otherwise.
		- #### getStringClaims
		
		
		
		```
		public java.util.List<java.lang.String> getStringClaims​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../javadsl/server/directives/JwtClaims.html#getStringClaims(java.lang.String))`
		Extracts a list of string claims from the list of claims.
		 
		
		Specified by:
		`[getStringClaims](../javadsl/server/directives/JwtClaims.html#getStringClaims(java.lang.String))` in interface `[JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		a List containing the string values of the claim if it exists and is a list of strings, empty list otherwise.
		- #### getBooleanClaim
		
		
		
		```
		public java.util.Optional<java.lang.Object> getBooleanClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../javadsl/server/directives/JwtClaims.html#getBooleanClaim(java.lang.String))`
		Extracts a boolean claim from the list of claims.
		 
		
		Specified by:
		`[getBooleanClaim](../javadsl/server/directives/JwtClaims.html#getBooleanClaim(java.lang.String))` in interface `[JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the boolean value of the claim if it exists and is a boolean, Optional.empty otherwise.
		- #### getRawClaim
		
		
		
		```
		public java.util.Optional<java.lang.String> getRawClaim​(java.lang.String name)
		```
		
		Description copied from interface: `[JwtClaims](../javadsl/server/directives/JwtClaims.html#getRawClaim(java.lang.String))`
		Extracts a raw claim from the list of claims.
		 This can be useful if you need to extract a claim that is not a primitive type but a complex one.
		 
		
		Specified by:
		`[getRawClaim](../javadsl/server/directives/JwtClaims.html#getRawClaim(java.lang.String))` in interface `[JwtClaims](../javadsl/server/directives/JwtClaims.html "interface in akka.http.jwt.javadsl.server.directives")`
		Parameters:
		`name` \- the name of the claim.
		Returns:
		an Optional containing the raw JSON String value of the claim if it exists, Optional.empty otherwise.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/javadsl/server/directives/JwtClaims.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/scaladsl/server/directives/JwtClaims.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtClaimsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtClaimsImpl.html)*