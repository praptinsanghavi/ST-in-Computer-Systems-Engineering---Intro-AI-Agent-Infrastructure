---
description: 'declaration: package: akka.javasdk, interface: JwtClaims'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:46Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JwtClaims.html
title: JwtClaims
---

# JwtClaims

> **Summary:** declaration: package: akka.javasdk, interface: JwtClaims

## Content

Package [akka.javasdk](package-summary.html)
# Interface JwtClaims

---

public interface JwtClaims
Representation of JWT claims that have been validated and extracted from the bearer token of a
 request.

- ## Method Summary

Modifier and Type
Method
Description
`[Iterable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Iterable.html "class or interface in java.lang")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[allClaimNames](#allClaimNames())()`

Returns the names of all the claims in this request.

`[Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[asMap](#asMap())()`

Returns all the claims as a map of strings to strings.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[audience](#audience())()`

Get the audience, that is, the aud claim, as described in RFC 7519 section 4\.1\.3\.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")>`
`[expirationTime](#expirationTime())()`

Get the expiration time, that is, the exp claim, as described in RFC 7519 section
 4\.1\.4\.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Boolean](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html "class or interface in java.lang")>`
`[getBoolean](#getBoolean(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the boolean claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[Boolean](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html "class or interface in java.lang")>>`
`[getBooleanList](#getBooleanList(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the boolean list claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Double](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html "class or interface in java.lang")>`
`[getDouble](#getDouble(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the double claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[Double](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html "class or interface in java.lang")>>`
`[getDoubleList](#getDoubleList(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the double list claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")>`
`[getInteger](#getInteger(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the integer claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")>>`
`[getIntegerList](#getIntegerList(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the integer list claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Long](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Long.html "class or interface in java.lang")>`
`[getLong](#getLong(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the long claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[Long](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Long.html "class or interface in java.lang")>>`
`[getLongList](#getLongList(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the long list claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")>`
`[getNumericDate](#getNumericDate(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the numeric data claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")>>`
`[getNumericDateList](#getNumericDateList(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the numeric date list claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<com.fasterxml.jackson.databind.JsonNode>`
`[getObject](#getObject(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the object claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<com.fasterxml.jackson.databind.JsonNode>>`
`[getObjectList](#getObjectList(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the object list claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[getString](#getString(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the string claim with the given name.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>>`
`[getStringList](#getStringList(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

Get the string list claim with the given name.

`boolean`
`[hasClaims](#hasClaims())()`

Does this request have any claims that have been validated?

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")>`
`[issuedAt](#issuedAt())()`

Get the issued at, that is, the iat claim, as described in RFC 7519 section 4\.1\.6\.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[issuer](#issuer())()`

Get the issuer, that is, the iss claim, as described in RFC 7519 section 4\.1\.1\.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[jwtId](#jwtId())()`

Get the JWT ID, that is, the jti claim, as described in RFC 7519 section 4\.1\.7\.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")>`
`[notBefore](#notBefore())()`

Get the not before, that is, the nbf claim, as described in RFC 7519 section 4\.1\.5\.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[subject](#subject())()`

Get the subject, that is, the sub claim, as described in RFC 7519 section 4\.1\.2\.

- ## Method Details

	- ### allClaimNames
	
	
	[Iterable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Iterable.html "class or interface in java.lang")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> allClaimNames()
	Returns the names of all the claims in this request.
	
	Returns:
	The names of all the claims in this request.
	- ### asMap
	
	
	[Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> asMap()
	Returns all the claims as a map of strings to strings.
	
	 Note that all values will be encoded to JSON. This means that if the value is a string, it
	 will include the quotes. E.g. "\\"my\-string\-claim\\"" for a string claim.
	
	
	
	Returns:
	All the claims represented as a map of string claim names to string values containing a
	 JSON representation of its value.
	- ### hasClaims
	
	
	boolean hasClaims()
	Does this request have any claims that have been validated?
	
	Returns:
	true if there are claims.
	- ### issuer
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> issuer()
	Get the issuer, that is, the iss claim, as described in RFC 7519 section 4\.1\.1\.
	
	Returns:
	the issuer, if present.
	See Also:
	
	
		- [RFC 7519 section
		 4\.1\.1](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1.1)
	- ### subject
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> subject()
	Get the subject, that is, the sub claim, as described in RFC 7519 section 4\.1\.2\.
	
	Returns:
	the subject, if present.
	See Also:
	
	
		- [RFC 7519 section
		 4\.1\.2](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1.2)
	- ### audience
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> audience()
	Get the audience, that is, the aud claim, as described in RFC 7519 section 4\.1\.3\.
	
	Returns:
	the audience, if present.
	See Also:
	
	
		- [RFC 7519 section
		 4\.1\.3](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1.3)
	- ### expirationTime
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")\> expirationTime()
	Get the expiration time, that is, the exp claim, as described in RFC 7519 section
	 4\.1\.4\.
	
	Returns:
	the expiration time, if present. Returns empty if the value is not a numeric date.
	See Also:
	
	
		- [RFC 7519 section
		 4\.1\.4](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1.4)
	- ### notBefore
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")\> notBefore()
	Get the not before, that is, the nbf claim, as described in RFC 7519 section 4\.1\.5\.
	
	Returns:
	the not before, if present. Returns empty if the value is not a numeric date.
	See Also:
	
	
		- [RFC 7519 section
		 4\.1\.5](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1.5)
	- ### issuedAt
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")\> issuedAt()
	Get the issued at, that is, the iat claim, as described in RFC 7519 section 4\.1\.6\.
	
	Returns:
	the issued at, if present. Returns empty if the value is not a numeric date.
	See Also:
	
	
		- [RFC 7519 section
		 4\.1\.6](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1.6)
	- ### jwtId
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> jwtId()
	Get the JWT ID, that is, the jti claim, as described in RFC 7519 section 4\.1\.7\.
	
	Returns:
	the JWT ID, if present.
	See Also:
	
	
		- [RFC 7519 section
		 4\.1\.7](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1.7)
	- ### getString
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> getString([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the string claim with the given name.
	
	 Note that if the claim with the given name is not a string claim, this will return the JSON
	 encoding of it.
	
	
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The string claim, if present.
	- ### getInteger
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")\> getInteger([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the integer claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The integer claim, if present. Returns empty if the claim is not an integer or can't be
	 parsed as an integer.
	- ### getLong
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Long](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Long.html "class or interface in java.lang")\> getLong([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the long claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The long claim, if present. Returns empty if the claim is not a long or can't be parsed
	 as an long.
	- ### getDouble
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Double](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html "class or interface in java.lang")\> getDouble([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the double claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The double claim, if present. Returns empty if the claim is not a double or can't be
	 parsed as an double.
	- ### getBoolean
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Boolean](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html "class or interface in java.lang")\> getBoolean([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the boolean claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The boolean claim, if present. Returns empty if the claim is not a boolean or can't be
	 parsed as a boolean.
	- ### getNumericDate
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")\> getNumericDate([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the numeric data claim with the given name.
	
	 Numeric dates are expressed as a number of seconds since epoch, as described in RFC 7519
	 section 2\.
	
	
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The numeric date claim, if present. Returns empty if the claim is not a numeric date or
	 can't be parsed as a numeric date.
	See Also:
	
	
		- [RFC 7519 section 2](https://datatracker.ietf.org/doc/html/rfc7519#section-2)
	- ### getObject
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<com.fasterxml.jackson.databind.JsonNode\> getObject([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the object claim with the given name.
	
	 This returns the claim as a Jackson JsonNode AST.
	
	
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The object claim, if present. Returns empty if the claim is not an object or can't be
	 parsed as an object.
	- ### getStringList
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\>\> getStringList([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the string list claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The string list claim, if present. Returns empty if the claim is not a JSON array of
	 strings or cannot be parsed as a JSON array of strings.
	- ### getIntegerList
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")\>\> getIntegerList([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the integer list claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The integer list claim, if present. Returns empty if the claim is not a JSON array of
	 integers or cannot be parsed as a JSON array of integers.
	- ### getLongList
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[Long](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Long.html "class or interface in java.lang")\>\> getLongList([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the long list claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The long list claim, if present. Returns empty if the claim is not a JSON array of
	 longs or cannot be parsed as a JSON array of longs.
	- ### getDoubleList
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[Double](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html "class or interface in java.lang")\>\> getDoubleList([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the double list claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The double list claim, if present. Returns empty if the claim is not a JSON array of
	 doubles or cannot be parsed as a JSON array of doubles.
	- ### getBooleanList
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[Boolean](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html "class or interface in java.lang")\>\> getBooleanList([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the boolean list claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The boolean list claim, if present. Returns empty if the claim is not a JSON array of
	 booleans or cannot be parsed as a JSON array of booleans.
	- ### getNumericDateList
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")\>\> getNumericDateList([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the numeric date list claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The numeric date list claim, if present. Returns empty if the claim is not a JSON array
	 of numeric dates or cannot be parsed as a JSON array of numeric dates.
	- ### getObjectList
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<com.fasterxml.jackson.databind.JsonNode\>\> getObjectList([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	Get the object list claim with the given name.
	
	Parameters:
	`name` \- The name of the claim.
	Returns:
	The object list claim, if present. Returns empty if the claim is not a JSON array of
	 objects or cannot be parsed as a JSON array of objects.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JwtClaims.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JwtClaims.html)*