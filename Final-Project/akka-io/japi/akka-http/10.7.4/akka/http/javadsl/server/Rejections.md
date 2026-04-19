---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejections.html
title: Rejections
---

# Rejections

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class Rejections

- java.lang.Object
- - akka.http.javadsl.server.Rejections

- ---

```
public class Rejections
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Rejections](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [AuthenticationFailedRejection](AuthenticationFailedRejection.html "interface in akka.http.javadsl.server")` | `[authenticationCredentialsMissing](#authenticationCredentialsMissing(akka.http.javadsl.model.headers.HttpChallenge))​([HttpChallenge](../model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers") challenge)` |  |
	| `static [AuthenticationFailedRejection](AuthenticationFailedRejection.html "interface in akka.http.javadsl.server")` | `[authenticationCredentialsRejected](#authenticationCredentialsRejected(akka.http.javadsl.model.headers.HttpChallenge))​([HttpChallenge](../model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers") challenge)` |  |
	| `static [AuthorizationFailedRejection$](../../scaladsl/server/AuthorizationFailedRejection$.html "class in akka.http.scaladsl.server")` | `[authorizationFailed](#authorizationFailed())()` |  |
	| `static [ExpectedWebSocketRequestRejection$](../../scaladsl/server/ExpectedWebSocketRequestRejection$.html "class in akka.http.scaladsl.server")` | `[expectedWebSocketRequest](#expectedWebSocketRequest())()` |  |
	| `static [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "interface in akka.http.javadsl.server")` | `[invalidRequiredValueForQueryParam](#invalidRequiredValueForQueryParam(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String parameterName,  java.lang.String requiredValue,  java.lang.String actualValue)` |  |
	| `static [MalformedFormFieldRejection](MalformedFormFieldRejection.html "interface in akka.http.javadsl.server")` | `[malformedFormField](#malformedFormField(java.lang.String,java.lang.String))​(java.lang.String fieldName,  java.lang.String errorMsg)` |  |
	| `static [MalformedFormFieldRejection](../../scaladsl/server/MalformedFormFieldRejection.html "class in akka.http.scaladsl.server")` | `[malformedFormField](#malformedFormField(java.lang.String,java.lang.String,java.util.Optional))​(java.lang.String fieldName,  java.lang.String errorMsg,  java.util.Optional<java.lang.Throwable> cause)` |  |
	| `static [MalformedHeaderRejection](MalformedHeaderRejection.html "interface in akka.http.javadsl.server")` | `[malformedHeader](#malformedHeader(java.lang.String,java.lang.String))​(java.lang.String headerName,  java.lang.String errorMsg)` |  |
	| `static [MalformedHeaderRejection](../../scaladsl/server/MalformedHeaderRejection.html "class in akka.http.scaladsl.server")` | `[malformedHeader](#malformedHeader(java.lang.String,java.lang.String,java.util.Optional))​(java.lang.String headerName,  java.lang.String errorMsg,  java.util.Optional<java.lang.Throwable> cause)` |  |
	| `static [MalformedQueryParamRejection](MalformedQueryParamRejection.html "interface in akka.http.javadsl.server")` | `[malformedQueryParam](#malformedQueryParam(java.lang.String,java.lang.String))​(java.lang.String parameterName,  java.lang.String errorMsg)` |  |
	| `static [MalformedQueryParamRejection](MalformedQueryParamRejection.html "interface in akka.http.javadsl.server")` | `[malformedQueryParam](#malformedQueryParam(java.lang.String,java.lang.String,java.util.Optional))​(java.lang.String parameterName,  java.lang.String errorMsg,  java.util.Optional<java.lang.Throwable> cause)` |  |
	| `static [MalformedRequestContentRejection](../../scaladsl/server/MalformedRequestContentRejection.html "class in akka.http.scaladsl.server")` | `[malformedRequestContent](#malformedRequestContent(java.lang.String,java.lang.Throwable))​(java.lang.String message,  java.lang.Throwable cause)` |  |
	| `static [MethodRejection](MethodRejection.html "interface in akka.http.javadsl.server")` | `[method](#method(akka.http.javadsl.model.HttpMethod))​([HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model") supported)` |  |
	| `static [MissingCookieRejection](../../scaladsl/server/MissingCookieRejection.html "class in akka.http.scaladsl.server")` | `[missingCookie](#missingCookie(java.lang.String))​(java.lang.String cookieName)` |  |
	| `static [MissingFormFieldRejection](MissingFormFieldRejection.html "interface in akka.http.javadsl.server")` | `[missingFormField](#missingFormField(java.lang.String))​(java.lang.String fieldName)` |  |
	| `static [MissingHeaderRejection](MissingHeaderRejection.html "interface in akka.http.javadsl.server")` | `[missingHeader](#missingHeader(java.lang.String))​(java.lang.String headerName)` |  |
	| `static [MissingQueryParamRejection](MissingQueryParamRejection.html "interface in akka.http.javadsl.server")` | `[missingQueryParam](#missingQueryParam(java.lang.String))​(java.lang.String parameterName)` |  |
	| `static [RejectionError](../../scaladsl/server/RejectionError.html "class in akka.http.scaladsl.server")` | `[rejectionError](#rejectionError(akka.http.javadsl.server.Rejection))​([Rejection](Rejection.html "interface in akka.http.javadsl.server") rejection)` |  |
	| `static [RequestEntityExpectedRejection$](RequestEntityExpectedRejection$.html "class in akka.http.javadsl.server")` | `[requestEntityExpected](#requestEntityExpected())()` |  |
	| `static [SchemeRejection](SchemeRejection.html "interface in akka.http.javadsl.server")` | `[scheme](#scheme(java.lang.String))​(java.lang.String supported)` |  |
	| `static [TooManyRangesRejection](../../scaladsl/server/TooManyRangesRejection.html "class in akka.http.scaladsl.server")` | `[tooManyRanges](#tooManyRanges(int))​(int maxRanges)` |  |
	| `static [TransformationRejection](../../scaladsl/server/TransformationRejection.html "class in akka.http.scaladsl.server")` | `[transformationRejection](#transformationRejection(java.util.function.Function))​(java.util.function.Function<java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>> f)` |  |
	| `static [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "interface in akka.http.javadsl.server")` | `[unacceptedResponseContentType](#unacceptedResponseContentType(java.lang.Iterable,java.lang.Iterable))​(java.lang.Iterable<[ContentType](../model/ContentType.html "interface in akka.http.javadsl.model")> supportedContentTypes,  java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> supportedMediaTypes)` |  |
	| `static [UnacceptedResponseEncodingRejection](../../scaladsl/server/UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server")` | `[unacceptedResponseEncoding](#unacceptedResponseEncoding(akka.http.javadsl.model.headers.HttpEncoding))​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") supported)` |  |
	| `static [UnacceptedResponseEncodingRejection](../../scaladsl/server/UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server")` | `[unacceptedResponseEncoding](#unacceptedResponseEncoding(java.lang.Iterable))​(java.lang.Iterable<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")> supported)` |  |
	| `static [UnsatisfiableRangeRejection](../../scaladsl/server/UnsatisfiableRangeRejection.html "class in akka.http.scaladsl.server")` | `[unsatisfiableRange](#unsatisfiableRange(java.lang.Iterable,long))​(java.lang.Iterable<[ByteRange](../model/headers/ByteRange.html "class in akka.http.javadsl.model.headers")> unsatisfiableRanges,  long actualEntityLength)` |  |
	| `static [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "interface in akka.http.javadsl.server")` | `[unsupportedRequestContentType](#unsupportedRequestContentType(java.lang.Iterable))​(java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> supported)` |  |
	| `static [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "interface in akka.http.javadsl.server")` | `[unsupportedRequestContentType](#unsupportedRequestContentType(java.lang.Iterable,java.util.Optional))​(java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> supported,  java.util.Optional<[ContentType](../model/ContentType.html "interface in akka.http.javadsl.model")> contentType)` |  |
	| `static [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "interface in akka.http.javadsl.server")` | `[unsupportedRequestEncoding](#unsupportedRequestEncoding(akka.http.javadsl.model.headers.HttpEncoding))​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") supported)` |  |
	| `static [ValidationRejection](../../scaladsl/server/ValidationRejection.html "class in akka.http.scaladsl.server")` | `[validationRejection](#validationRejection(java.lang.String))​(java.lang.String message)` |  |
	| `static [ValidationRejection](../../scaladsl/server/ValidationRejection.html "class in akka.http.scaladsl.server")` | `[validationRejection](#validationRejection(java.lang.String,java.util.Optional))​(java.lang.String message,  java.util.Optional<java.lang.Throwable> cause)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Rejections
		
		
		
		```
		public Rejections()
		```

	- ### Method Detail
	
	
	
		- #### method
		
		
		
		```
		public static [MethodRejection](MethodRejection.html "interface in akka.http.javadsl.server") method​([HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model") supported)
		```
		- #### scheme
		
		
		
		```
		public static [SchemeRejection](SchemeRejection.html "interface in akka.http.javadsl.server") scheme​(java.lang.String supported)
		```
		- #### missingQueryParam
		
		
		
		```
		public static [MissingQueryParamRejection](MissingQueryParamRejection.html "interface in akka.http.javadsl.server") missingQueryParam​(java.lang.String parameterName)
		```
		- #### invalidRequiredValueForQueryParam
		
		
		
		```
		public static [InvalidRequiredValueForQueryParamRejection](InvalidRequiredValueForQueryParamRejection.html "interface in akka.http.javadsl.server") invalidRequiredValueForQueryParam​(java.lang.String parameterName,
		                                                                                           java.lang.String requiredValue,
		                                                                                           java.lang.String actualValue)
		```
		- #### malformedQueryParam
		
		
		
		```
		public static [MalformedQueryParamRejection](MalformedQueryParamRejection.html "interface in akka.http.javadsl.server") malformedQueryParam​(java.lang.String parameterName,
		                                                               java.lang.String errorMsg)
		```
		- #### malformedQueryParam
		
		
		
		```
		public static [MalformedQueryParamRejection](MalformedQueryParamRejection.html "interface in akka.http.javadsl.server") malformedQueryParam​(java.lang.String parameterName,
		                                                               java.lang.String errorMsg,
		                                                               java.util.Optional<java.lang.Throwable> cause)
		```
		- #### missingFormField
		
		
		
		```
		public static [MissingFormFieldRejection](MissingFormFieldRejection.html "interface in akka.http.javadsl.server") missingFormField​(java.lang.String fieldName)
		```
		- #### malformedFormField
		
		
		
		```
		public static [MalformedFormFieldRejection](MalformedFormFieldRejection.html "interface in akka.http.javadsl.server") malformedFormField​(java.lang.String fieldName,
		                                                             java.lang.String errorMsg)
		```
		- #### malformedFormField
		
		
		
		```
		public static [MalformedFormFieldRejection](../../scaladsl/server/MalformedFormFieldRejection.html "class in akka.http.scaladsl.server") malformedFormField​(java.lang.String fieldName,
		                                                             java.lang.String errorMsg,
		                                                             java.util.Optional<java.lang.Throwable> cause)
		```
		- #### missingHeader
		
		
		
		```
		public static [MissingHeaderRejection](MissingHeaderRejection.html "interface in akka.http.javadsl.server") missingHeader​(java.lang.String headerName)
		```
		- #### malformedHeader
		
		
		
		```
		public static [MalformedHeaderRejection](MalformedHeaderRejection.html "interface in akka.http.javadsl.server") malformedHeader​(java.lang.String headerName,
		                                                       java.lang.String errorMsg)
		```
		- #### malformedHeader
		
		
		
		```
		public static [MalformedHeaderRejection](../../scaladsl/server/MalformedHeaderRejection.html "class in akka.http.scaladsl.server") malformedHeader​(java.lang.String headerName,
		                                                       java.lang.String errorMsg,
		                                                       java.util.Optional<java.lang.Throwable> cause)
		```
		- #### unsupportedRequestContentType
		
		
		
		```
		public static [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "interface in akka.http.javadsl.server") unsupportedRequestContentType​(java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> supported,
		                                                                                   java.util.Optional<[ContentType](../model/ContentType.html "interface in akka.http.javadsl.model")> contentType)
		```
		- #### unsupportedRequestContentType
		
		
		
		```
		public static [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "interface in akka.http.javadsl.server") unsupportedRequestContentType​(java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> supported)
		```
		- #### unsupportedRequestEncoding
		
		
		
		```
		public static [UnsupportedRequestEncodingRejection](UnsupportedRequestEncodingRejection.html "interface in akka.http.javadsl.server") unsupportedRequestEncoding​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") supported)
		```
		- #### unsatisfiableRange
		
		
		
		```
		public static [UnsatisfiableRangeRejection](../../scaladsl/server/UnsatisfiableRangeRejection.html "class in akka.http.scaladsl.server") unsatisfiableRange​(java.lang.Iterable<[ByteRange](../model/headers/ByteRange.html "class in akka.http.javadsl.model.headers")> unsatisfiableRanges,
		                                                             long actualEntityLength)
		```
		- #### tooManyRanges
		
		
		
		```
		public static [TooManyRangesRejection](../../scaladsl/server/TooManyRangesRejection.html "class in akka.http.scaladsl.server") tooManyRanges​(int maxRanges)
		```
		- #### malformedRequestContent
		
		
		
		```
		public static [MalformedRequestContentRejection](../../scaladsl/server/MalformedRequestContentRejection.html "class in akka.http.scaladsl.server") malformedRequestContent​(java.lang.String message,
		                                                                       java.lang.Throwable cause)
		```
		- #### requestEntityExpected
		
		
		
		```
		public static [RequestEntityExpectedRejection$](RequestEntityExpectedRejection$.html "class in akka.http.javadsl.server") requestEntityExpected()
		```
		- #### unacceptedResponseContentType
		
		
		
		```
		public static [UnacceptedResponseContentTypeRejection](UnacceptedResponseContentTypeRejection.html "interface in akka.http.javadsl.server") unacceptedResponseContentType​(java.lang.Iterable<[ContentType](../model/ContentType.html "interface in akka.http.javadsl.model")> supportedContentTypes,
		                                                                                   java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> supportedMediaTypes)
		```
		- #### unacceptedResponseEncoding
		
		
		
		```
		public static [UnacceptedResponseEncodingRejection](../../scaladsl/server/UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server") unacceptedResponseEncoding​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") supported)
		```
		- #### unacceptedResponseEncoding
		
		
		
		```
		public static [UnacceptedResponseEncodingRejection](../../scaladsl/server/UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server") unacceptedResponseEncoding​(java.lang.Iterable<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers")> supported)
		```
		- #### authenticationCredentialsMissing
		
		
		
		```
		public static [AuthenticationFailedRejection](AuthenticationFailedRejection.html "interface in akka.http.javadsl.server") authenticationCredentialsMissing​([HttpChallenge](../model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers") challenge)
		```
		- #### authenticationCredentialsRejected
		
		
		
		```
		public static [AuthenticationFailedRejection](AuthenticationFailedRejection.html "interface in akka.http.javadsl.server") authenticationCredentialsRejected​([HttpChallenge](../model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers") challenge)
		```
		- #### authorizationFailed
		
		
		
		```
		public static [AuthorizationFailedRejection$](../../scaladsl/server/AuthorizationFailedRejection$.html "class in akka.http.scaladsl.server") authorizationFailed()
		```
		- #### missingCookie
		
		
		
		```
		public static [MissingCookieRejection](../../scaladsl/server/MissingCookieRejection.html "class in akka.http.scaladsl.server") missingCookie​(java.lang.String cookieName)
		```
		- #### expectedWebSocketRequest
		
		
		
		```
		public static [ExpectedWebSocketRequestRejection$](../../scaladsl/server/ExpectedWebSocketRequestRejection$.html "class in akka.http.scaladsl.server") expectedWebSocketRequest()
		```
		- #### validationRejection
		
		
		
		```
		public static [ValidationRejection](../../scaladsl/server/ValidationRejection.html "class in akka.http.scaladsl.server") validationRejection​(java.lang.String message)
		```
		- #### validationRejection
		
		
		
		```
		public static [ValidationRejection](../../scaladsl/server/ValidationRejection.html "class in akka.http.scaladsl.server") validationRejection​(java.lang.String message,
		                                                      java.util.Optional<java.lang.Throwable> cause)
		```
		- #### transformationRejection
		
		
		
		```
		public static [TransformationRejection](../../scaladsl/server/TransformationRejection.html "class in akka.http.scaladsl.server") transformationRejection​(java.util.function.Function<java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>,​java.util.List<[Rejection](Rejection.html "interface in akka.http.javadsl.server")>> f)
		```
		- #### rejectionError
		
		
		
		```
		public static [RejectionError](../../scaladsl/server/RejectionError.html "class in akka.http.scaladsl.server") rejectionError​([Rejection](Rejection.html "interface in akka.http.javadsl.server") rejection)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ByteRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/AuthenticationFailedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/InvalidRequiredValueForQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestEntityExpectedRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/SchemeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/AuthorizationFailedRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedFormFieldRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MissingCookieRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RejectionError.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/TooManyRangesRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsatisfiableRangeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/ValidationRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejections.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejections.html)*