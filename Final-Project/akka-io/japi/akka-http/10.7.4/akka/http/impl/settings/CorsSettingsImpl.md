---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/settings/CorsSettingsImpl.html
title: CorsSettingsImpl
---

# CorsSettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class CorsSettingsImpl

- java.lang.Object
- - [akka.http.javadsl.settings.CorsSettings](../../javadsl/settings/CorsSettings.html "class in akka.http.javadsl.settings")
	- - akka.http.impl.settings.CorsSettingsImpl

- All Implemented Interfaces:
`[CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class CorsSettingsImpl
extends [CorsSettings](../../javadsl/settings/CorsSettings.html "class in akka.http.javadsl.settings")
implements [CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings"), scala.Product, java.io.Serializable
```

This implementation is based on the akka\-http\-cors project by Lomig Mégard, licensed under the Apache License, Version 2\.0\.
 
 INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.CorsSettingsImpl)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CorsSettingsImpl](#%3Cinit%3E(boolean,boolean,scala.collection.immutable.Set,scala.collection.immutable.Set,scala.collection.immutable.Set,scala.collection.immutable.Set,scala.concurrent.duration.FiniteDuration))​(boolean allowGenericHttpRequests,  boolean allowCredentials,  scala.collection.immutable.Set<java.lang.String> allowedOrigins,  scala.collection.immutable.Set<java.lang.String> allowedHeaders,  scala.collection.immutable.Set<[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")> allowedMethods,  scala.collection.immutable.Set<java.lang.String> exposedHeaders,  scala.concurrent.duration.FiniteDuration maxAge)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.List<[HttpHeader](../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")>` | `[actualResponseHeaders](#actualResponseHeaders(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")> origins)` |  |
	| `static scala.collection.immutable.Set<java.lang.String>` | `[allowAnySet](#allowAnySet())()` |  |
	| `boolean` | `[allowCredentials](#allowCredentials())()` | If enabled, the header `Access-Control-Allow-Credentials`  is included in the response, indicating that the actual request can include user credentials. |
	| `scala.collection.immutable.Set<java.lang.String>` | `[allowedHeaders](#allowedHeaders())()` | Set of request headers that are allowed when making an actual request. |
	| `scala.collection.immutable.Set<[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")>` | `[allowedMethods](#allowedMethods())()` | List of methods allowed when making an actual request. |
	| `scala.collection.immutable.Set<java.lang.String>` | `[allowedOrigins](#allowedOrigins())()` | List of origins that the CORS filter must allow. |
	| `boolean` | `[allowGenericHttpRequests](#allowGenericHttpRequests())()` | Allow generic requests, that are outside the scope of the specification, for example lacking an `Origin` header  to pass through the directive. |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[exposedHeaders](#exposedHeaders())()` | Set of headers (other than simple response headers) that browsers are allowed to access. |
	| `static [CorsSettingsImpl](CorsSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config config)` |  |
	| `scala.Function1<java.lang.String,​java.lang.Object>` | `[headerNameAllowed](#headerNameAllowed())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[maxAge](#maxAge())()` | The time the browser is allowed to cache the results of a preflight request. |
	| `scala.Function1<scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")>,​java.lang.Object>` | `[originsMatches](#originsMatches())()` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `scala.collection.immutable.List<[HttpHeader](../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")>` | `[preflightResponseHeaders](#preflightResponseHeaders(scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")> origins,  scala.collection.immutable.Seq<java.lang.String> requestHeaders)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.settings.[CorsSettings](../../javadsl/settings/CorsSettings.html "class in akka.http.javadsl.settings")
		
		
		`[getAllowedHeaders](../../javadsl/settings/CorsSettings.html#getAllowedHeaders()), [getAllowedMethods](../../javadsl/settings/CorsSettings.html#getAllowedMethods()), [getAllowedOrigins](../../javadsl/settings/CorsSettings.html#getAllowedOrigins()), [getExposedHeaders](../../javadsl/settings/CorsSettings.html#getExposedHeaders()), [getMaxAge](../../javadsl/settings/CorsSettings.html#getMaxAge()), [withAllowAnyHeader](../../javadsl/settings/CorsSettings.html#withAllowAnyHeader()), [withAllowAnyOrigin](../../javadsl/settings/CorsSettings.html#withAllowAnyOrigin()), [withAllowCredentials](../../javadsl/settings/CorsSettings.html#withAllowCredentials(boolean)), [withAllowedHeaders](../../javadsl/settings/CorsSettings.html#withAllowedHeaders(java.util.Set)), [withAllowedMethods](../../javadsl/settings/CorsSettings.html#withAllowedMethods(java.util.Set)), [withAllowedOrigins](../../javadsl/settings/CorsSettings.html#withAllowedOrigins(java.util.Set)), [withAllowGenericHttpRequests](../../javadsl/settings/CorsSettings.html#withAllowGenericHttpRequests(boolean)), [withExposedHeaders](../../javadsl/settings/CorsSettings.html#withExposedHeaders(java.util.Set))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.settings.[CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings")
		
		
		`[withAllowAnyHeader](../../scaladsl/settings/CorsSettings.html#withAllowAnyHeader()), [withAllowAnyOrigin](../../scaladsl/settings/CorsSettings.html#withAllowAnyOrigin()), [withAllowCredentials](../../scaladsl/settings/CorsSettings.html#withAllowCredentials(boolean)), [withAllowedHeaders](../../scaladsl/settings/CorsSettings.html#withAllowedHeaders(scala.collection.immutable.Set)), [withAllowedMethods](../../scaladsl/settings/CorsSettings.html#withAllowedMethods(scala.collection.immutable.Set)), [withAllowedOrigins](../../scaladsl/settings/CorsSettings.html#withAllowedOrigins(scala.collection.immutable.Set)), [withAllowGenericHttpRequests](../../scaladsl/settings/CorsSettings.html#withAllowGenericHttpRequests(boolean)), [withExposedHeaders](../../scaladsl/settings/CorsSettings.html#withExposedHeaders(scala.collection.immutable.Set)), [withMaxAge](../../scaladsl/settings/CorsSettings.html#withMaxAge(scala.concurrent.duration.FiniteDuration))`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### CorsSettingsImpl
		
		
		
		```
		public CorsSettingsImpl​(boolean allowGenericHttpRequests,
		                        boolean allowCredentials,
		                        scala.collection.immutable.Set<java.lang.String> allowedOrigins,
		                        scala.collection.immutable.Set<java.lang.String> allowedHeaders,
		                        scala.collection.immutable.Set<[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")> allowedMethods,
		                        scala.collection.immutable.Set<java.lang.String> exposedHeaders,
		                        scala.concurrent.duration.FiniteDuration maxAge)
		```

	- ### Method Detail
	
	
	
		- #### allowAnySet
		
		
		
		```
		public static scala.collection.immutable.Set<java.lang.String> allowAnySet()
		```
		- #### fromSubConfig
		
		
		
		```
		public static [CorsSettingsImpl](CorsSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                             com.typesafe.config.Config config)
		```
		- #### prefix
		
		
		
		```
		protected static java.lang.String prefix()
		```
		- #### apply
		
		
		
		```
		public static T apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public static T apply​(java.lang.String configOverrides)
		```
		- #### apply
		
		
		
		```
		public static T apply​(com.typesafe.config.Config config)
		```
		- #### allowGenericHttpRequests
		
		
		
		```
		public boolean allowGenericHttpRequests()
		```
		
		Description copied from class: `[CorsSettings](../../javadsl/settings/CorsSettings.html#allowGenericHttpRequests())`
		Allow generic requests, that are outside the scope of the specification, for example lacking an `Origin` header
		 to pass through the directive.
		 
		 When false strict CORS filtering is applied and any invalid request will be rejected.
		
		
		
		Specified by:
		`[allowGenericHttpRequests](../../scaladsl/settings/CorsSettings.html#allowGenericHttpRequests())` in interface `[CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings")`
		Specified by:
		`[allowGenericHttpRequests](../../javadsl/settings/CorsSettings.html#allowGenericHttpRequests())` in class `[CorsSettings](../../javadsl/settings/CorsSettings.html "class in akka.http.javadsl.settings")`
		Returns:
		(undocumented)
		- #### allowCredentials
		
		
		
		```
		public boolean allowCredentials()
		```
		
		Description copied from class: `[CorsSettings](../../javadsl/settings/CorsSettings.html#allowCredentials())`
		If enabled, the header `Access-Control-Allow-Credentials`
		 is included in the response, indicating that the actual request can include user credentials. Examples of user
		 credentials are: cookies, HTTP authentication or client\-side certificates.
		
		Specified by:
		`[allowCredentials](../../scaladsl/settings/CorsSettings.html#allowCredentials())` in interface `[CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings")`
		Specified by:
		`[allowCredentials](../../javadsl/settings/CorsSettings.html#allowCredentials())` in class `[CorsSettings](../../javadsl/settings/CorsSettings.html "class in akka.http.javadsl.settings")`
		Returns:
		(undocumented)
		- #### allowedOrigins
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> allowedOrigins()
		```
		
		Description copied from interface: `[CorsSettings](../../scaladsl/settings/CorsSettings.html#allowedOrigins())`
		List of origins that the CORS filter must allow.
		 
		 Can also be set to a single `*` to allow access to the resource from any origin.
		 
		
		
		 Controls the content of the `Access-Control-Allow-Origin` response header: if parameter is `*` and
		 credentials are not allowed, a `*` is returned in `Access-Control-Allow-Origin`. Otherwise, the origins given in the
		 `Origin` request header are echoed.
		 
		
		
		 Hostname starting with `*.` will match any sub\-domain. The scheme and the port are always strictly matched.
		 
		
		
		 The actual or preflight request is rejected if any of the origins from the request is not allowed.
		
		
		
		Specified by:
		`[allowedOrigins](../../scaladsl/settings/CorsSettings.html#allowedOrigins())` in interface `[CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings")`
		Returns:
		(undocumented)
		- #### allowedHeaders
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> allowedHeaders()
		```
		
		Description copied from interface: `[CorsSettings](../../scaladsl/settings/CorsSettings.html#allowedHeaders())`
		Set of request headers that are allowed when making an actual request.
		 
		 Controls the content of the `Access-Control-Allow-Headers` header in a preflight response: If set to a single `*`,
		 the headers from `Access-Control-Request-Headers` are echoed. Otherwise specified list of header names is returned
		 as part of the header.
		
		
		
		Specified by:
		`[allowedHeaders](../../scaladsl/settings/CorsSettings.html#allowedHeaders())` in interface `[CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings")`
		Returns:
		(undocumented)
		- #### allowedMethods
		
		
		
		```
		public scala.collection.immutable.Set<[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")> allowedMethods()
		```
		
		Description copied from interface: `[CorsSettings](../../scaladsl/settings/CorsSettings.html#allowedMethods())`
		List of methods allowed when making an actual request. The listed headers are returned as part of the
		 `Access-Control-Allow-Methods` preflight response header.
		 
		 The preflight request will be rejected if the `Access-Control-Request-Method` header's method is not part of the
		 list.
		
		
		
		Specified by:
		`[allowedMethods](../../scaladsl/settings/CorsSettings.html#allowedMethods())` in interface `[CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings")`
		Returns:
		(undocumented)
		- #### exposedHeaders
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> exposedHeaders()
		```
		
		Description copied from interface: `[CorsSettings](../../scaladsl/settings/CorsSettings.html#exposedHeaders())`
		Set of headers (other than simple response headers) that browsers are allowed to access. If not empty, the listed
		 headers are returned as part of the `Access-Control-Expose-Headers` header in responses.
		
		Specified by:
		`[exposedHeaders](../../scaladsl/settings/CorsSettings.html#exposedHeaders())` in interface `[CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings")`
		Returns:
		(undocumented)
		- #### maxAge
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration maxAge()
		```
		
		Description copied from interface: `[CorsSettings](../../scaladsl/settings/CorsSettings.html#maxAge())`
		The time the browser is allowed to cache the results of a preflight request. This value is
		 returned as part of the `Access-Control-Max-Age` preflight response header. If `scala.concurrent.duration.Duration.Zero`,
		 the header is not added to the preflight response.
		
		Specified by:
		`[maxAge](../../scaladsl/settings/CorsSettings.html#maxAge())` in interface `[CorsSettings](../../scaladsl/settings/CorsSettings.html "interface in akka.http.scaladsl.settings")`
		Returns:
		(undocumented)
		- #### originsMatches
		
		
		
		```
		public scala.Function1<scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")>,​java.lang.Object> originsMatches()
		```
		- #### headerNameAllowed
		
		
		
		```
		public scala.Function1<java.lang.String,​java.lang.Object> headerNameAllowed()
		```
		- #### actualResponseHeaders
		
		
		
		```
		public scala.collection.immutable.List<[HttpHeader](../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> actualResponseHeaders​(scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")> origins)
		```
		- #### preflightResponseHeaders
		
		
		
		```
		public scala.collection.immutable.List<[HttpHeader](../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> preflightResponseHeaders​(scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")> origins,
		                                                                            scala.collection.immutable.Seq<java.lang.String> requestHeaders)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/settings/CorsSettingsImpl.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/CorsSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/CorsSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/settings/CorsSettingsImpl.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/settings/CorsSettingsImpl.html)*