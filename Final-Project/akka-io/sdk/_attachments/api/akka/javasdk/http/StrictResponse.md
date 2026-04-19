---
description: 'declaration: package: akka.javasdk.http, record: StrictResponse'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:40Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/StrictResponse.html
title: StrictResponse
---

# StrictResponse

> **Summary:** declaration: package: akka.javasdk.http, record: StrictResponse

## Content

Package [akka.javasdk.http](package-summary.html)
# Record Class StrictResponse\<T\>

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.http.StrictResponse\<T\>

Type Parameters:
`T` \- The type of the body in the response.
Record Components:
`httpResponse` \- The HTTP response.
`body` \- The body of the response, already parsed and ready to be used.

---

public record StrictResponse\<T\>(akka.http.javadsl.model.HttpResponse httpResponse, [T](StrictResponse.html "type parameter in StrictResponse") body)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
A strict response that contains both the HTTP response and the body.

 The body is derived from the HttpResponse. Meaning that the HttpResponse body content have
 already been fully received and cannot be consumed once more. To access its content use the body
 field.

 

The HttpResponse can be used to access other response fields, like content\-type, headers and
 http status code.

 

- ## Constructor Summary

Constructors

Constructor
Description
`[StrictResponse](#%3Cinit%3E(akka.http.javadsl.model.HttpResponse,T))(akka.http.javadsl.model.HttpResponse httpResponse,
 [T](StrictResponse.html "type parameter in StrictResponse") body)`

Creates an instance of a `StrictResponse` record class.
- ## Method Summary

Modifier and Type
Method
Description
`[T](StrictResponse.html "type parameter in StrictResponse")`
`[body](#body())()`

Returns the value of the [`body`](#param-body) record component.

`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`akka.http.javadsl.model.HttpResponse`
`[httpResponse](#httpResponse())()`

Returns the value of the [`httpResponse`](#param-httpResponse) record component.

`akka.http.javadsl.model.StatusCode`
`[status](#status())()`
 
`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### StrictResponse
	
	
	public StrictResponse(akka.http.javadsl.model.HttpResponse httpResponse,
	 [T](StrictResponse.html "type parameter in StrictResponse") body)
	Creates an instance of a `StrictResponse` record class.
	
	Parameters:
	`httpResponse` \- the value for the [`httpResponse`](#param-httpResponse) record component
	`body` \- the value for the [`body`](#param-body) record component
- ## Method Details

	- ### status
	
	
	public akka.http.javadsl.model.StatusCode status()
	- ### toString
	
	
	public final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toString()
	Returns a string representation of this record class. The representation contains the name of the class, followed by the name and value of each of the record components.
	
	Specified by:
	`[toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#toString() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a string representation of this object
	- ### hashCode
	
	
	public final int hashCode()
	Returns a hash code value for this object. The value is derived from the hash code of each of the record components.
	
	Specified by:
	`[hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#hashCode() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a hash code value for this object
	- ### equals
	
	
	public final boolean equals([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)
	Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object) "class or interface in java.util").
	
	Specified by:
	`[equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#equals(java.lang.Object) "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Parameters:
	`o` \- the object with which to compare
	Returns:
	`true` if this object is the same as the `o` argument; `false` otherwise.
	- ### httpResponse
	
	
	public akka.http.javadsl.model.HttpResponse httpResponse()
	Returns the value of the [`httpResponse`](#param-httpResponse) record component.
	
	Returns:
	the value of the [`httpResponse`](#param-httpResponse) record component
	- ### body
	
	
	public [T](StrictResponse.html "type parameter in StrictResponse") body()
	Returns the value of the [`body`](#param-body) record component.
	
	Returns:
	the value of the [`body`](#param-body) record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/StrictResponse.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/StrictResponse.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/StrictResponse.html)*