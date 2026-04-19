---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/CorsSettings.html
title: CorsSettings
---

# CorsSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class CorsSettings

- java.lang.Object
- - akka.http.javadsl.settings.CorsSettings

- Direct Known Subclasses:
`[CorsSettingsImpl](../../impl/settings/CorsSettingsImpl.html "class in akka.http.impl.settings")`

---

```
public abstract class CorsSettings
extends java.lang.Object
```

Settings for the CORS support
 
 This implementation is based on the akka\-http\-cors project by Lomig Mégard, licensed under the Apache License, Version 2\.0\.
 

 Not for user extension

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CorsSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract boolean` | `[allowCredentials](#allowCredentials())()` | If enabled, the header `Access-Control-Allow-Credentials`  is included in the response, indicating that the actual request can include user credentials. |
	| `abstract boolean` | `[allowGenericHttpRequests](#allowGenericHttpRequests())()` | Allow generic requests, that are outside the scope of the specification, for example lacking an `Origin` header  to pass through the directive. |
	| `java.util.Set<java.lang.String>` | `[getAllowedHeaders](#getAllowedHeaders())()` | Set of request headers that are allowed when making an actual request. |
	| `java.util.Set<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")>` | `[getAllowedMethods](#getAllowedMethods())()` | List of methods allowed when making an actual request. |
	| `java.util.Set<java.lang.String>` | `[getAllowedOrigins](#getAllowedOrigins())()` | List of origins that the CORS filter must allow. |
	| `java.util.Set<java.lang.String>` | `[getExposedHeaders](#getExposedHeaders())()` | Set of headers (other than simple response headers) that browsers are allowed to access. |
	| `java.time.Duration` | `[getMaxAge](#getMaxAge())()` | The time the browser is allowed to cache the results of a preflight request. |
	| `[CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings")` | `[withAllowAnyHeader](#withAllowAnyHeader())()` |  |
	| `[CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings")` | `[withAllowAnyOrigin](#withAllowAnyOrigin())()` |  |
	| `[CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings")` | `[withAllowCredentials](#withAllowCredentials(boolean))​(boolean allow)` |  |
	| `[CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings")` | `[withAllowedHeaders](#withAllowedHeaders(java.util.Set))​(java.util.Set<java.lang.String> headerNames)` |  |
	| `[CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings")` | `[withAllowedMethods](#withAllowedMethods(java.util.Set))​(java.util.Set<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")> methods)` |  |
	| `[CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings")` | `[withAllowedOrigins](#withAllowedOrigins(java.util.Set))​(java.util.Set<java.lang.String> origins)` |  |
	| `[CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings")` | `[withAllowGenericHttpRequests](#withAllowGenericHttpRequests(boolean))​(boolean allow)` |  |
	| `[CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings")` | `[withExposedHeaders](#withExposedHeaders(java.util.Set))​(java.util.Set<java.lang.String> headerNames)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CorsSettings
		
		
		
		```
		public CorsSettings()
		```

	- ### Method Detail
	
	
	
		- #### allowCredentials
		
		
		
		```
		public abstract boolean allowCredentials()
		```
		
		If enabled, the header `Access-Control-Allow-Credentials`
		 is included in the response, indicating that the actual request can include user credentials. Examples of user
		 credentials are: cookies, HTTP authentication or client\-side certificates.
		
		Returns:
		(undocumented)
		- #### allowGenericHttpRequests
		
		
		
		```
		public abstract boolean allowGenericHttpRequests()
		```
		
		Allow generic requests, that are outside the scope of the specification, for example lacking an `Origin` header
		 to pass through the directive.
		 
		 When false strict CORS filtering is applied and any invalid request will be rejected.
		
		
		
		Returns:
		(undocumented)
		- #### getAllowedHeaders
		
		
		
		```
		public java.util.Set<java.lang.String> getAllowedHeaders()
		```
		
		Set of request headers that are allowed when making an actual request.
		 
		 Controls the content of the `Access-Control-Allow-Headers` header in a preflight response: If set to a single `*`,
		 the headers from `Access-Control-Request-Headers` are echoed. Otherwise specified list of header names is returned
		 as part of the header.
		
		
		
		Returns:
		(undocumented)
		- #### getAllowedMethods
		
		
		
		```
		public java.util.Set<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")> getAllowedMethods()
		```
		
		List of methods allowed when making an actual request. The listed headers are returned as part of the
		 `Access-Control-Allow-Methods` preflight response header.
		 
		 The preflight request will be rejected if the `Access-Control-Request-Method` header's method is not part of the
		 list.
		
		
		
		Returns:
		(undocumented)
		- #### getAllowedOrigins
		
		
		
		```
		public java.util.Set<java.lang.String> getAllowedOrigins()
		```
		
		List of origins that the CORS filter must allow.
		 
		 Can also be set to a single `*` to allow access to the resource from any origin.
		 
		
		
		 Controls the content of the `Access-Control-Allow-Origin` response header: if parameter is `*` and
		 credentials are not allowed, a `*` is returned in `Access-Control-Allow-Origin`. Otherwise, the origins given in the
		 `Origin` request header are echoed.
		 
		
		
		 Hostname starting with `*.` will match any sub\-domain. The scheme and the port are always strictly matched.
		 
		
		
		 The actual or preflight request is rejected if any of the origins from the request is not allowed.
		
		
		
		Returns:
		(undocumented)
		- #### getExposedHeaders
		
		
		
		```
		public java.util.Set<java.lang.String> getExposedHeaders()
		```
		
		Set of headers (other than simple response headers) that browsers are allowed to access. If not empty, the listed
		 headers are returned as part of the `Access-Control-Expose-Headers` header in responses.
		
		Returns:
		(undocumented)
		- #### getMaxAge
		
		
		
		```
		public java.time.Duration getMaxAge()
		```
		
		The time the browser is allowed to cache the results of a preflight request. This value is
		 returned as part of the `Access-Control-Max-Age` preflight response header. If `java.time.Duration.ZERO`,
		 the header is not added to the preflight response.
		
		Returns:
		(undocumented)
		- #### withAllowAnyHeader
		
		
		
		```
		public [CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings") withAllowAnyHeader()
		```
		- #### withAllowAnyOrigin
		
		
		
		```
		public [CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings") withAllowAnyOrigin()
		```
		- #### withAllowCredentials
		
		
		
		```
		public [CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings") withAllowCredentials​(boolean allow)
		```
		- #### withAllowGenericHttpRequests
		
		
		
		```
		public [CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings") withAllowGenericHttpRequests​(boolean allow)
		```
		- #### withAllowedHeaders
		
		
		
		```
		public [CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings") withAllowedHeaders​(java.util.Set<java.lang.String> headerNames)
		```
		- #### withAllowedMethods
		
		
		
		```
		public [CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings") withAllowedMethods​(java.util.Set<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")> methods)
		```
		- #### withAllowedOrigins
		
		
		
		```
		public [CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings") withAllowedOrigins​(java.util.Set<java.lang.String> origins)
		```
		- #### withExposedHeaders
		
		
		
		```
		public [CorsSettings](CorsSettings.html "class in akka.http.javadsl.settings") withExposedHeaders​(java.util.Set<java.lang.String> headerNames)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/settings/CorsSettingsImpl.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/CorsSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/CorsSettings.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/CorsSettings.html)*