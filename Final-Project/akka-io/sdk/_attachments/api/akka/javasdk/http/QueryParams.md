---
description: 'declaration: package: akka.javasdk.http, interface: QueryParams'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:46Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/QueryParams.html
title: QueryParams
---

# QueryParams

> **Summary:** declaration: package: akka.javasdk.http, interface: QueryParams

## Content

Package [akka.javasdk.http](package-summary.html)
# Interface QueryParams

---

public interface QueryParams
Interface for accessing HTTP query parameters with type\-safe getters.

 QueryParams provides convenient methods for extracting query parameters from HTTP requests
 with automatic type conversion for common types like integers, booleans, and doubles.

 

**Access:** Available through [`RequestContext.queryParams()`](RequestContext.html#queryParams()) when
 processing HTTP requests in endpoint methods.

 

**Type Safety:** The typed getter methods ([`getInteger(java.lang.String)`](#getInteger(java.lang.String)), [`getBoolean(java.lang.String)`](#getBoolean(java.lang.String)), etc.) handle conversion from string values to the requested type, returning `Optional.empty()` if the parameter is missing or cannot be converted.

 

**Multiple Values:** Query parameters can have multiple values (e.g., `?tag=java&tag=http`). Use [`getAll(String)`](#getAll(java.lang.String)) to retrieve all values for a parameter name.

 

**Map Conversion:** Use [`toMap()`](#toMap()) for a simple key\-value map (first value
 only) or [`toMultiMap()`](#toMultiMap()) to preserve all values for parameters that appear multiple times.

- ## Method Summary

Modifier and Type
Method
Description
`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[getAll](#getAll(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)`

Returns the value of all parameters with the given key.

`<T> [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<T>`
`[getAll](#getAll(java.lang.String,java.util.function.Function))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key,
 [Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),T> mapper)`

Returns the value of all parameters with the given key using mapper function.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Boolean](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html "class or interface in java.lang")>`
`[getBoolean](#getBoolean(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)`

Returns the Boolean value of the first parameter with the given key if it exists.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Double](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html "class or interface in java.lang")>`
`[getDouble](#getDouble(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)`

Returns the Double value of the first parameter with the given key if it exists.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")>`
`[getInteger](#getInteger(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)`

Returns the Integer value of the first parameter with the given key if it exists.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Long](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Long.html "class or interface in java.lang")>`
`[getLong](#getLong(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)`

Returns the Long value of the first parameter with the given key if it exists.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[getString](#getString(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)`

Returns the value of the first parameter with the given key if it exists.

`[Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[toMap](#toMap())()`

Returns a key/value map of the parameters.

`[Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>>`
`[toMultiMap](#toMultiMap())()`

Returns a \`Map\` of all parameters.

- ## Method Details

	- ### getString
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> getString([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)
	Returns the value of the first parameter with the given key if it exists.
	- ### getInteger
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Integer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html "class or interface in java.lang")\> getInteger([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)
	Returns the Integer value of the first parameter with the given key if it exists.
	- ### getLong
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Long](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Long.html "class or interface in java.lang")\> getLong([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)
	Returns the Long value of the first parameter with the given key if it exists.
	- ### getBoolean
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Boolean](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html "class or interface in java.lang")\> getBoolean([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)
	Returns the Boolean value of the first parameter with the given key if it exists.
	- ### getDouble
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Double](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html "class or interface in java.lang")\> getDouble([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)
	Returns the Double value of the first parameter with the given key if it exists.
	- ### getAll
	
	
	[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> getAll([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key)
	Returns the value of all parameters with the given key.
	- ### getAll
	
	
	\<T\> [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<T\> getAll([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key,
	 [Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),T\> mapper)
	Returns the value of all parameters with the given key using mapper function.
	- ### toMap
	
	
	[Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> toMap()
	Returns a key/value map of the parameters. Use the \`toMultiMap()\` method to return all
	 parameters if keys may occur multiple times.
	- ### toMultiMap
	
	
	[Map](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\>\> toMultiMap()
	Returns a \`Map\` of all parameters. Use the \`toMap()\` method to filter out entries with
	 duplicated keys.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/QueryParams.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/QueryParams.html)*