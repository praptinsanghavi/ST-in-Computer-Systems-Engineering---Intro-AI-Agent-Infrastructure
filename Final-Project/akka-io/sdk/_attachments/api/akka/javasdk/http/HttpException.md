---
description: 'declaration: package: akka.javasdk.http, class: HttpException'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:38Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpException.html
title: HttpException
---

# HttpException

> **Summary:** declaration: package: akka.javasdk.http, class: HttpException

## Content

Package [akka.javasdk.http](package-summary.html)
# Class HttpException

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.http.HttpException

---

public final class HttpException
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
Factory class for creating HTTP exceptions that result in specific HTTP error responses.

 HttpException provides static factory methods for creating exceptions that, when thrown from
 HTTP endpoint methods, are automatically converted to appropriate HTTP error responses with the
 corresponding status codes.

 

**Common Error Responses:**

- [`badRequest()`](#badRequest()) \- 400 Bad Request for invalid client input
- [`unauthorized()`](#unauthorized()) \- 401 Unauthorized for authentication failures
- [`forbidden()`](#forbidden()) \- 403 Forbidden for authorization failures
- [`notFound()`](#notFound()) \- 404 Not Found for missing resources
- [`notImplemented()`](#notImplemented()) \- 501 Not Implemented for unsupported operations

**Custom Status Codes:** Use [`error(akka.http.javadsl.model.StatusCode)`](#error(akka.http.javadsl.model.StatusCode))
 for arbitrary HTTP status codes not covered by the predefined factory methods.

 

**Error Messages:** Most factory methods have overloads that accept a response
 text parameter to provide additional error details to the client.

 

**Alternative Error Handling:**

- `IllegalArgumentException` is automatically converted to 400 Bad Request
- Other exceptions become 500 Internal Server Error
- Return [`HttpResponses`](HttpResponses.html "class in akka.javasdk.http") error methods for more control

- ## Method Summary

Modifier and Type
Method
Description
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[badRequest](#badRequest())()`
 
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[badRequest](#badRequest(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responseText)`
 
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[error](#error(akka.http.javadsl.model.StatusCode))(akka.http.javadsl.model.StatusCode statusCode)`
 
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[error](#error(akka.http.javadsl.model.StatusCode,java.lang.String))(akka.http.javadsl.model.StatusCode statusCode,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responseText)`
 
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[forbidden](#forbidden())()`
 
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[forbidden](#forbidden(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responseText)`
 
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[notFound](#notFound())()`
 
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[notImplemented](#notImplemented())()`
 
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[unauthorized](#unauthorized())()`
 
`static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")`
`[unauthorized](#unauthorized(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responseText)`
 

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Method Details

	- ### badRequest
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") badRequest()
	- ### badRequest
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") badRequest([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responseText)
	- ### notFound
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") notFound()
	- ### forbidden
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") forbidden()
	- ### forbidden
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") forbidden([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responseText)
	- ### unauthorized
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") unauthorized()
	- ### unauthorized
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") unauthorized([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responseText)
	- ### notImplemented
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") notImplemented()
	- ### error
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") error(akka.http.javadsl.model.StatusCode statusCode)
	
	Returns:
	An exception with an arbitrary HTTP status code.
	 Note: a large list of predefined status codes can be found in `StatusCodes`
	- ### error
	
	
	public static [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang") error(akka.http.javadsl.model.StatusCode statusCode,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responseText)
	
	Returns:
	An exception with an arbitrary HTTP status code.
	 Note: a large list of predefined status codes can be found in `StatusCodes`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpResponses.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpException.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpException.html)*