---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html
title: StatusCodes
---

# StatusCodes

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class StatusCodes

- java.lang.Object
- - akka.http.javadsl.model.StatusCodes

- ---

```
public final class StatusCodes
extends java.lang.Object
```

Contains the set of predefined status\-codes along with static methods to access and create custom
 status\-codes.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[ACCEPTED](#ACCEPTED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[ALREADY_REPORTED](#ALREADY_REPORTED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[BAD_GATEWAY](#BAD_GATEWAY)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[BAD_REQUEST](#BAD_REQUEST)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[BANDWIDTH_LIMIT_EXCEEDED](#BANDWIDTH_LIMIT_EXCEEDED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[BLOCKED_BY_PARENTAL_CONTROLS](#BLOCKED_BY_PARENTAL_CONTROLS)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[CONFLICT](#CONFLICT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[CONTENT_TOO_LARGE](#CONTENT_TOO_LARGE)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[CONTINUE](#CONTINUE)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[CREATED](#CREATED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[EARLY_HINTS](#EARLY_HINTS)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[ENHANCE_YOUR_CALM](#ENHANCE_YOUR_CALM)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[EXPECTATION_FAILED](#EXPECTATION_FAILED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[FAILED_DEPENDENCY](#FAILED_DEPENDENCY)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[FORBIDDEN](#FORBIDDEN)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[FOUND](#FOUND)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[GATEWAY_TIMEOUT](#GATEWAY_TIMEOUT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[GONE](#GONE)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[HTTPVERSION_NOT_SUPPORTED](#HTTPVERSION_NOT_SUPPORTED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[IM_A_TEAPOT](#IM_A_TEAPOT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[IMUSED](#IMUSED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[INSUFFICIENT_STORAGE](#INSUFFICIENT_STORAGE)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[INTERNAL_SERVER_ERROR](#INTERNAL_SERVER_ERROR)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[LENGTH_REQUIRED](#LENGTH_REQUIRED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[LOCKED](#LOCKED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[LOOP_DETECTED](#LOOP_DETECTED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[METHOD_NOT_ALLOWED](#METHOD_NOT_ALLOWED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[MISDIRECTED_REQUEST](#MISDIRECTED_REQUEST)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[MOVED_PERMANENTLY](#MOVED_PERMANENTLY)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[MULTI_STATUS](#MULTI_STATUS)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[MULTIPLE_CHOICES](#MULTIPLE_CHOICES)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NETWORK_AUTHENTICATION_REQUIRED](#NETWORK_AUTHENTICATION_REQUIRED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NETWORK_CONNECT_TIMEOUT](#NETWORK_CONNECT_TIMEOUT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NETWORK_READ_TIMEOUT](#NETWORK_READ_TIMEOUT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NO_CONTENT](#NO_CONTENT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NON_AUTHORITATIVE_INFORMATION](#NON_AUTHORITATIVE_INFORMATION)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NOT_ACCEPTABLE](#NOT_ACCEPTABLE)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NOT_EXTENDED](#NOT_EXTENDED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NOT_FOUND](#NOT_FOUND)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NOT_IMPLEMENTED](#NOT_IMPLEMENTED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[NOT_MODIFIED](#NOT_MODIFIED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[OK](#OK)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[PARTIAL_CONTENT](#PARTIAL_CONTENT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[PAYLOAD_TOO_LARGE](#PAYLOAD_TOO_LARGE)` | Deprecated. deprecated in favor of CONTENT\_TOO\_LARGE |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[PAYMENT_REQUIRED](#PAYMENT_REQUIRED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[PERMANENT_REDIRECT](#PERMANENT_REDIRECT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[PRECONDITION_FAILED](#PRECONDITION_FAILED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[PRECONDITION_REQUIRED](#PRECONDITION_REQUIRED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[PROCESSING](#PROCESSING)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[PROXY_AUTHENTICATION_REQUIRED](#PROXY_AUTHENTICATION_REQUIRED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[RANGE_NOT_SATISFIABLE](#RANGE_NOT_SATISFIABLE)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[REQUEST_ENTITY_TOO_LARGE](#REQUEST_ENTITY_TOO_LARGE)` | Deprecated. deprecated in favor of CONTENT\_TOO\_LARGE |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[REQUEST_HEADER_FIELDS_TOO_LARGE](#REQUEST_HEADER_FIELDS_TOO_LARGE)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[REQUEST_TIMEOUT](#REQUEST_TIMEOUT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[REQUEST_URI_TOO_LONG](#REQUEST_URI_TOO_LONG)` | Deprecated. deprecated in favor of URI\_TOO\_LONG |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[REQUESTED_RANGE_NOT_SATISFIABLE](#REQUESTED_RANGE_NOT_SATISFIABLE)` | Deprecated. deprecated in favor of RANGE\_NOT\_SATISFIABLE |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[RESET_CONTENT](#RESET_CONTENT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[RETRY_WITH](#RETRY_WITH)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[SEE_OTHER](#SEE_OTHER)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[SERVICE_UNAVAILABLE](#SERVICE_UNAVAILABLE)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[SWITCHING_PROTOCOLS](#SWITCHING_PROTOCOLS)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[TEMPORARY_REDIRECT](#TEMPORARY_REDIRECT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[TOO_EARLY](#TOO_EARLY)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[TOO_MANY_REQUESTS](#TOO_MANY_REQUESTS)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[UNAUTHORIZED](#UNAUTHORIZED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[UNAVAILABLE_FOR_LEGAL_REASONS](#UNAVAILABLE_FOR_LEGAL_REASONS)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[UNORDERED_COLLECTION](#UNORDERED_COLLECTION)` | Deprecated. Non\-standard Unordered Collection should not be used, deprecated in favor of TOO\_EARLY |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[UNPROCESSABLE_CONTENT](#UNPROCESSABLE_CONTENT)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[UNPROCESSABLE_ENTITY](#UNPROCESSABLE_ENTITY)` | Deprecated. deprecated in favor of UNPROCESSABLE\_CONTENT |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[UNSUPPORTED_MEDIA_TYPE](#UNSUPPORTED_MEDIA_TYPE)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[UPGRADE_REQUIRED](#UPGRADE_REQUIRED)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[URI_TOO_LONG](#URI_TOO_LONG)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[USE_PROXY](#USE_PROXY)` |  |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[VARIANT_ALSO_NEGOTIATES](#VARIANT_ALSO_NEGOTIATES)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[custom](#custom(int,java.lang.String,java.lang.String))​(int intValue,  java.lang.String reason,  java.lang.String defaultMessage)` | Create a custom status code. |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[custom](#custom(int,java.lang.String,java.lang.String,boolean,boolean))​(int intValue,  java.lang.String reason,  java.lang.String defaultMessage,  boolean isSuccess,  boolean allowsEntity)` | Create a custom status code. |
	| `static [StatusCode](StatusCode.html "class in akka.http.javadsl.model")` | `[get](#get(int))​(int intValue)` | Looks up a status\-code by numeric code. |
	| `static java.util.Optional<[StatusCode](StatusCode.html "class in akka.http.javadsl.model")>` | `[lookup](#lookup(int))​(int intValue)` | Looks up a status\-code by numeric code and returns Some(code). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### CONTINUE
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") CONTINUE
		```
		- #### SWITCHING\_PROTOCOLS
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") SWITCHING_PROTOCOLS
		```
		- #### PROCESSING
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") PROCESSING
		```
		- #### EARLY\_HINTS
		
		
		
		```
		@ApiMayChange
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") EARLY_HINTS
		```
		- #### OK
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") OK
		```
		- #### CREATED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") CREATED
		```
		- #### ACCEPTED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") ACCEPTED
		```
		- #### NON\_AUTHORITATIVE\_INFORMATION
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NON_AUTHORITATIVE_INFORMATION
		```
		- #### NO\_CONTENT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NO_CONTENT
		```
		- #### RESET\_CONTENT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") RESET_CONTENT
		```
		- #### PARTIAL\_CONTENT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") PARTIAL_CONTENT
		```
		- #### MULTI\_STATUS
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") MULTI_STATUS
		```
		- #### ALREADY\_REPORTED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") ALREADY_REPORTED
		```
		- #### IMUSED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") IMUSED
		```
		- #### MULTIPLE\_CHOICES
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") MULTIPLE_CHOICES
		```
		- #### MOVED\_PERMANENTLY
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") MOVED_PERMANENTLY
		```
		- #### FOUND
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") FOUND
		```
		- #### SEE\_OTHER
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") SEE_OTHER
		```
		- #### NOT\_MODIFIED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NOT_MODIFIED
		```
		- #### USE\_PROXY
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") USE_PROXY
		```
		- #### TEMPORARY\_REDIRECT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") TEMPORARY_REDIRECT
		```
		- #### PERMANENT\_REDIRECT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") PERMANENT_REDIRECT
		```
		- #### BAD\_REQUEST
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") BAD_REQUEST
		```
		- #### UNAUTHORIZED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") UNAUTHORIZED
		```
		- #### PAYMENT\_REQUIRED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") PAYMENT_REQUIRED
		```
		- #### FORBIDDEN
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") FORBIDDEN
		```
		- #### NOT\_FOUND
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NOT_FOUND
		```
		- #### METHOD\_NOT\_ALLOWED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") METHOD_NOT_ALLOWED
		```
		- #### NOT\_ACCEPTABLE
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NOT_ACCEPTABLE
		```
		- #### PROXY\_AUTHENTICATION\_REQUIRED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") PROXY_AUTHENTICATION_REQUIRED
		```
		- #### REQUEST\_TIMEOUT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") REQUEST_TIMEOUT
		```
		- #### CONFLICT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") CONFLICT
		```
		- #### GONE
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") GONE
		```
		- #### LENGTH\_REQUIRED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") LENGTH_REQUIRED
		```
		- #### PRECONDITION\_FAILED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") PRECONDITION_FAILED
		```
		- #### CONTENT\_TOO\_LARGE
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") CONTENT_TOO_LARGE
		```
		- #### PAYLOAD\_TOO\_LARGE
		
		
		
		```
		@Deprecated
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") PAYLOAD_TOO_LARGE
		```
		
		Deprecated.
		deprecated in favor of CONTENT\_TOO\_LARGE
		- #### REQUEST\_ENTITY\_TOO\_LARGE
		
		
		
		```
		@Deprecated
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") REQUEST_ENTITY_TOO_LARGE
		```
		
		Deprecated.
		deprecated in favor of CONTENT\_TOO\_LARGE
		- #### URI\_TOO\_LONG
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") URI_TOO_LONG
		```
		- #### REQUEST\_URI\_TOO\_LONG
		
		
		
		```
		@Deprecated
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") REQUEST_URI_TOO_LONG
		```
		
		Deprecated.
		deprecated in favor of URI\_TOO\_LONG
		- #### UNSUPPORTED\_MEDIA\_TYPE
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") UNSUPPORTED_MEDIA_TYPE
		```
		- #### RANGE\_NOT\_SATISFIABLE
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") RANGE_NOT_SATISFIABLE
		```
		- #### REQUESTED\_RANGE\_NOT\_SATISFIABLE
		
		
		
		```
		@Deprecated
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") REQUESTED_RANGE_NOT_SATISFIABLE
		```
		
		Deprecated.
		deprecated in favor of RANGE\_NOT\_SATISFIABLE
		- #### EXPECTATION\_FAILED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") EXPECTATION_FAILED
		```
		- #### IM\_A\_TEAPOT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") IM_A_TEAPOT
		```
		- #### ENHANCE\_YOUR\_CALM
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") ENHANCE_YOUR_CALM
		```
		- #### MISDIRECTED\_REQUEST
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") MISDIRECTED_REQUEST
		```
		- #### UNPROCESSABLE\_CONTENT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") UNPROCESSABLE_CONTENT
		```
		- #### UNPROCESSABLE\_ENTITY
		
		
		
		```
		@Deprecated
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") UNPROCESSABLE_ENTITY
		```
		
		Deprecated.
		deprecated in favor of UNPROCESSABLE\_CONTENT
		- #### LOCKED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") LOCKED
		```
		- #### FAILED\_DEPENDENCY
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") FAILED_DEPENDENCY
		```
		- #### UNORDERED\_COLLECTION
		
		
		
		```
		@Deprecated
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") UNORDERED_COLLECTION
		```
		
		Deprecated.
		Non\-standard Unordered Collection should not be used, deprecated in favor of TOO\_EARLY
		- #### TOO\_EARLY
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") TOO_EARLY
		```
		- #### UPGRADE\_REQUIRED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") UPGRADE_REQUIRED
		```
		- #### PRECONDITION\_REQUIRED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") PRECONDITION_REQUIRED
		```
		- #### TOO\_MANY\_REQUESTS
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") TOO_MANY_REQUESTS
		```
		- #### REQUEST\_HEADER\_FIELDS\_TOO\_LARGE
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") REQUEST_HEADER_FIELDS_TOO_LARGE
		```
		- #### RETRY\_WITH
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") RETRY_WITH
		```
		- #### BLOCKED\_BY\_PARENTAL\_CONTROLS
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") BLOCKED_BY_PARENTAL_CONTROLS
		```
		- #### UNAVAILABLE\_FOR\_LEGAL\_REASONS
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") UNAVAILABLE_FOR_LEGAL_REASONS
		```
		- #### INTERNAL\_SERVER\_ERROR
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") INTERNAL_SERVER_ERROR
		```
		- #### NOT\_IMPLEMENTED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NOT_IMPLEMENTED
		```
		- #### BAD\_GATEWAY
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") BAD_GATEWAY
		```
		- #### SERVICE\_UNAVAILABLE
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") SERVICE_UNAVAILABLE
		```
		- #### GATEWAY\_TIMEOUT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") GATEWAY_TIMEOUT
		```
		- #### HTTPVERSION\_NOT\_SUPPORTED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") HTTPVERSION_NOT_SUPPORTED
		```
		- #### VARIANT\_ALSO\_NEGOTIATES
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") VARIANT_ALSO_NEGOTIATES
		```
		- #### INSUFFICIENT\_STORAGE
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") INSUFFICIENT_STORAGE
		```
		- #### LOOP\_DETECTED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") LOOP_DETECTED
		```
		- #### BANDWIDTH\_LIMIT\_EXCEEDED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") BANDWIDTH_LIMIT_EXCEEDED
		```
		- #### NOT\_EXTENDED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NOT_EXTENDED
		```
		- #### NETWORK\_AUTHENTICATION\_REQUIRED
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NETWORK_AUTHENTICATION_REQUIRED
		```
		- #### NETWORK\_READ\_TIMEOUT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NETWORK_READ_TIMEOUT
		```
		- #### NETWORK\_CONNECT\_TIMEOUT
		
		
		
		```
		public static final [StatusCode](StatusCode.html "class in akka.http.javadsl.model") NETWORK_CONNECT_TIMEOUT
		```

	- ### Method Detail
	
	
	
		- #### custom
		
		
		
		```
		public static [StatusCode](StatusCode.html "class in akka.http.javadsl.model") custom​(int intValue,
		                                java.lang.String reason,
		                                java.lang.String defaultMessage,
		                                boolean isSuccess,
		                                boolean allowsEntity)
		```
		
		Create a custom status code.
		- #### custom
		
		
		
		```
		public static [StatusCode](StatusCode.html "class in akka.http.javadsl.model") custom​(int intValue,
		                                java.lang.String reason,
		                                java.lang.String defaultMessage)
		```
		
		Create a custom status code.
		- #### get
		
		
		
		```
		public static [StatusCode](StatusCode.html "class in akka.http.javadsl.model") get​(int intValue)
		```
		
		Looks up a status\-code by numeric code. Throws an exception if no such status\-code is found.
		- #### lookup
		
		
		
		```
		public static java.util.Optional<[StatusCode](StatusCode.html "class in akka.http.javadsl.model")> lookup​(int intValue)
		```
		
		Looks up a status\-code by numeric code and returns Some(code). Returns None otherwise.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html)*