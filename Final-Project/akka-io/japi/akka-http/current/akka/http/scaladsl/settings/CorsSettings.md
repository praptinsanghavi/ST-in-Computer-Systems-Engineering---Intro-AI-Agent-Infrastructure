---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html
title: CorsSettings
---

# CorsSettings

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Interface CorsSettings

- All Known Implementing Classes:
`[CorsSettingsImpl](../../impl/settings/CorsSettingsImpl.html "class in akka.http.impl.settings")`

---

```
public interface CorsSettings
```

Settings for the CORS support
 
 This implementation is based on the akka\-http\-cors project by Lomig Mégard, licensed under the Apache License, Version 2\.0\.
 

 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[allowCredentials](#allowCredentials())()` | If enabled, the header `Access-Control-Allow-Credentials`  is included in the response, indicating that the actual request can include user credentials. |
	| `scala.collection.immutable.Set<java.lang.String>` | `[allowedHeaders](#allowedHeaders())()` | Set of request headers that are allowed when making an actual request. |
	| `scala.collection.immutable.Set<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")>` | `[allowedMethods](#allowedMethods())()` | List of methods allowed when making an actual request. |
	| `scala.collection.immutable.Set<java.lang.String>` | `[allowedOrigins](#allowedOrigins())()` | List of origins that the CORS filter must allow. |
	| `boolean` | `[allowGenericHttpRequests](#allowGenericHttpRequests())()` | Allow generic requests, that are outside the scope of the specification, for example lacking an `Origin` header  to pass through the directive. |
	| `scala.collection.immutable.Set<java.lang.String>` | `[exposedHeaders](#exposedHeaders())()` | Set of headers (other than simple response headers) that browsers are allowed to access. |
	| `scala.concurrent.duration.FiniteDuration` | `[maxAge](#maxAge())()` | The time the browser is allowed to cache the results of a preflight request. |
	| `[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings")` | `[withAllowAnyHeader](#withAllowAnyHeader())()` |  |
	| `[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings")` | `[withAllowAnyOrigin](#withAllowAnyOrigin())()` |  |
	| `[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings")` | `[withAllowCredentials](#withAllowCredentials(boolean))​(boolean allow)` |  |
	| `[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings")` | `[withAllowedHeaders](#withAllowedHeaders(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> headerNames)` |  |
	| `[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings")` | `[withAllowedMethods](#withAllowedMethods(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")> methods)` |  |
	| `[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings")` | `[withAllowedOrigins](#withAllowedOrigins(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> origins)` |  |
	| `[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings")` | `[withAllowGenericHttpRequests](#withAllowGenericHttpRequests(boolean))​(boolean allow)` |  |
	| `[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings")` | `[withExposedHeaders](#withExposedHeaders(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> headerNames)` |  |
	| `[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings")` | `[withMaxAge](#withMaxAge(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration maxAge)` |  |

- - ### Method Detail
	
	
	
		- #### allowGenericHttpRequests
		
		
		
		```
		boolean allowGenericHttpRequests()
		```
		
		Allow generic requests, that are outside the scope of the specification, for example lacking an `Origin` header
		 to pass through the directive.
		 
		 When false strict CORS filtering is applied and any invalid request will be rejected.
		
		
		
		Returns:
		(undocumented)
		- #### allowCredentials
		
		
		
		```
		boolean allowCredentials()
		```
		
		If enabled, the header `Access-Control-Allow-Credentials`
		 is included in the response, indicating that the actual request can include user credentials. Examples of user
		 credentials are: cookies, HTTP authentication or client\-side certificates.
		
		Returns:
		(undocumented)
		- #### allowedOrigins
		
		
		
		```
		scala.collection.immutable.Set<java.lang.String> allowedOrigins()
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
		- #### allowedHeaders
		
		
		
		```
		scala.collection.immutable.Set<java.lang.String> allowedHeaders()
		```
		
		Set of request headers that are allowed when making an actual request.
		 
		 Controls the content of the `Access-Control-Allow-Headers` header in a preflight response: If set to a single `*`,
		 the headers from `Access-Control-Request-Headers` are echoed. Otherwise specified list of header names is returned
		 as part of the header.
		
		
		
		Returns:
		(undocumented)
		- #### allowedMethods
		
		
		
		```
		scala.collection.immutable.Set<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")> allowedMethods()
		```
		
		List of methods allowed when making an actual request. The listed headers are returned as part of the
		 `Access-Control-Allow-Methods` preflight response header.
		 
		 The preflight request will be rejected if the `Access-Control-Request-Method` header's method is not part of the
		 list.
		
		
		
		Returns:
		(undocumented)
		- #### exposedHeaders
		
		
		
		```
		scala.collection.immutable.Set<java.lang.String> exposedHeaders()
		```
		
		Set of headers (other than simple response headers) that browsers are allowed to access. If not empty, the listed
		 headers are returned as part of the `Access-Control-Expose-Headers` header in responses.
		
		Returns:
		(undocumented)
		- #### maxAge
		
		
		
		```
		scala.concurrent.duration.FiniteDuration maxAge()
		```
		
		The time the browser is allowed to cache the results of a preflight request. This value is
		 returned as part of the `Access-Control-Max-Age` preflight response header. If `scala.concurrent.duration.Duration.Zero`,
		 the header is not added to the preflight response.
		
		Returns:
		(undocumented)
		- #### withMaxAge
		
		
		
		```
		[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings") withMaxAge​(scala.concurrent.duration.FiniteDuration maxAge)
		```
		- #### withAllowAnyOrigin
		
		
		
		```
		[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings") withAllowAnyOrigin()
		```
		- #### withAllowedOrigins
		
		
		
		```
		[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings") withAllowedOrigins​(scala.collection.immutable.Set<java.lang.String> origins)
		```
		- #### withAllowAnyHeader
		
		
		
		```
		[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings") withAllowAnyHeader()
		```
		- #### withAllowedHeaders
		
		
		
		```
		[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings") withAllowedHeaders​(scala.collection.immutable.Set<java.lang.String> headerNames)
		```
		- #### withAllowedMethods
		
		
		
		```
		[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings") withAllowedMethods​(scala.collection.immutable.Set<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")> methods)
		```
		- #### withExposedHeaders
		
		
		
		```
		[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings") withExposedHeaders​(scala.collection.immutable.Set<java.lang.String> headerNames)
		```
		- #### withAllowGenericHttpRequests
		
		
		
		```
		[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings") withAllowGenericHttpRequests​(boolean allow)
		```
		- #### withAllowCredentials
		
		
		
		```
		[CorsSettings](CorsSettings.html "interface in akka.http.scaladsl.settings") withAllowCredentials​(boolean allow)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/CorsSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html)*