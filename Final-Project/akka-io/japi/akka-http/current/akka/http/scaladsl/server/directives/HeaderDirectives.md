---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderDirectives.html
title: HeaderDirectives
---

# HeaderDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface HeaderDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HeaderDirectives$](HeaderDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface HeaderDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[checkSameOrigin](#checkSameOrigin(akka.http.scaladsl.model.headers.HttpOriginRange.Default))​([HttpOriginRange.Default](../../model/headers/HttpOriginRange.Default.html "class in akka.http.scaladsl.model.headers") allowed)` | Checks that request comes from the same origin. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[headerValue](#headerValue(scala.Function1))​(scala.Function1<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.Option<T>> f)` | Extracts an HTTP header value using the given function. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[headerValueByName](#headerValueByName(java.lang.String))​(java.lang.String headerName)` | Extracts the value of the HTTP request header with the given name. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[headerValueByName](#headerValueByName(scala.Symbol))​(scala.Symbol headerName)` | Deprecated. Use string argument version or \`headerValueByType\`, e.g. instead of \`headerValueByName('Referer)\` use \`headerValueByType(Referer)\`. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[headerValueByType](#headerValueByType(akka.http.scaladsl.server.directives.HeaderMagnet))​([HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> magnet)` | Extracts the first HTTP request header of the given type. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[headerValuePF](#headerValuePF(scala.PartialFunction))​(scala.PartialFunction<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​T> pf)` | Extracts an HTTP header value using the given partial function. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<T>>>` | `[optionalHeaderValue](#optionalHeaderValue(scala.Function1))​(scala.Function1<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.Option<T>> f)` | Extracts an optional HTTP header value using the given function. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<java.lang.String>>>` | `[optionalHeaderValueByName](#optionalHeaderValueByName(java.lang.String))​(java.lang.String headerName)` | Extracts the value of the optional HTTP request header with the given name. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<java.lang.String>>>` | `[optionalHeaderValueByName](#optionalHeaderValueByName(scala.Symbol))​(scala.Symbol headerName)` | Deprecated. Use string argument version or \`headerValueByType\`, e.g. instead of \`optionalHeaderValueByName('Referer)\` use \`optionalHeaderValueByType(Referer)\`. |
	| `<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")>[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<T>>>` | `[optionalHeaderValueByType](#optionalHeaderValueByType(akka.http.scaladsl.server.directives.HeaderMagnet))​([HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> magnet)` | Extract the header value of the optional HTTP request header with the given type. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<T>>>` | `[optionalHeaderValuePF](#optionalHeaderValuePF(scala.PartialFunction))​(scala.PartialFunction<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​T> pf)` | Extracts an optional HTTP header value using the given partial function. |
	| `scala.Function1<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.Option<java.lang.String>>` | `[optionalValue](#optionalValue(java.lang.String))​(java.lang.String lowerCaseName)` |  |

- - ### Method Detail
	
	
	
		- #### checkSameOrigin
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> checkSameOrigin​([HttpOriginRange.Default](../../model/headers/HttpOriginRange.Default.html "class in akka.http.scaladsl.model.headers") allowed)
		```
		
		Checks that request comes from the same origin. Extracts the `Origin` header value and verifies that
		 allowed range contains the obtained value. In the case of absent of the `Origin` header rejects
		 with `MissingHeaderRejection`. If the origin value is not in the allowed range
		 rejects with an `InvalidOriginRejection` and `StatusCodes.Forbidden` status.
		 
		
		Parameters:
		`allowed` \- (undocumented)
		Returns:
		(undocumented)
		- #### headerValue
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> headerValue​(scala.Function1<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.Option<T>> f)
		```
		
		Extracts an HTTP header value using the given function. If the function result is undefined for all headers the
		 request is rejected with an empty rejection set. If the given function throws an exception the request is rejected
		 with a [`MalformedHeaderRejection`](../MalformedHeaderRejection.html "class in akka.http.scaladsl.server").
		 
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### headerValuePF
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> headerValuePF​(scala.PartialFunction<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​T> pf)
		```
		
		Extracts an HTTP header value using the given partial function. If the function is undefined for all headers the
		 request is rejected with an empty rejection set.
		 
		
		Parameters:
		`pf` \- (undocumented)
		Returns:
		(undocumented)
		- #### headerValueByName
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> headerValueByName​(scala.Symbol headerName)
		```
		
		Deprecated.
		Use string argument version or \`headerValueByType\`, e.g. instead of \`headerValueByName('Referer)\` use \`headerValueByType(Referer)\`. Since 10\.2\.0\.
		
		Extracts the value of the first HTTP request header with the given name.
		 If no header with a matching name is found the request is rejected with a [`MissingHeaderRejection`](../MissingHeaderRejection.html "class in akka.http.scaladsl.server").
		 
		
		Parameters:
		`headerName` \- (undocumented)
		Returns:
		(undocumented)
		- #### headerValueByName
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> headerValueByName​(java.lang.String headerName)
		```
		
		Extracts the value of the HTTP request header with the given name.
		 If no header with a matching name is found the request is rejected with a [`MissingHeaderRejection`](../MissingHeaderRejection.html "class in akka.http.scaladsl.server").
		 
		
		Parameters:
		`headerName` \- (undocumented)
		Returns:
		(undocumented)
		- #### headerValueByType
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> headerValueByType​([HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> magnet)
		```
		
		Extracts the first HTTP request header of the given type.
		 If no header with a matching type is found the request is rejected with a [`MissingHeaderRejection`](../MissingHeaderRejection.html "class in akka.http.scaladsl.server").
		 
		 Custom headers will only be matched by this directive if they extend `ModeledCustomHeader`
		 and provide a companion extending `ModeledCustomHeaderCompanion`.
		 
		
		
		
		Parameters:
		`magnet` \- (undocumented)
		Returns:
		(undocumented)
		- #### optionalHeaderValue
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<T>>> optionalHeaderValue​(scala.Function1<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.Option<T>> f)
		```
		
		Extracts an optional HTTP header value using the given function.
		 If the given function throws an exception the request is rejected
		 with a [`MalformedHeaderRejection`](../MalformedHeaderRejection.html "class in akka.http.scaladsl.server").
		 
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### optionalHeaderValuePF
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<T>>> optionalHeaderValuePF​(scala.PartialFunction<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​T> pf)
		```
		
		Extracts an optional HTTP header value using the given partial function.
		 If the given function throws an exception the request is rejected
		 with a [`MalformedHeaderRejection`](../MalformedHeaderRejection.html "class in akka.http.scaladsl.server").
		 
		
		Parameters:
		`pf` \- (undocumented)
		Returns:
		(undocumented)
		- #### optionalHeaderValueByName
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<java.lang.String>>> optionalHeaderValueByName​(scala.Symbol headerName)
		```
		
		Deprecated.
		Use string argument version or \`headerValueByType\`, e.g. instead of \`optionalHeaderValueByName('Referer)\` use \`optionalHeaderValueByType(Referer)\`. Since 10\.2\.0\.
		
		Extracts the value of the optional HTTP request header with the given name.
		 
		
		Parameters:
		`headerName` \- (undocumented)
		Returns:
		(undocumented)
		- #### optionalHeaderValueByName
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<java.lang.String>>> optionalHeaderValueByName​(java.lang.String headerName)
		```
		
		Extracts the value of the optional HTTP request header with the given name.
		 
		
		Parameters:
		`headerName` \- (undocumented)
		Returns:
		(undocumented)
		- #### optionalHeaderValueByType
		
		
		
		```
		<T extends [HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<T>>> optionalHeaderValueByType​([HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")<T> magnet)
		```
		
		Extract the header value of the optional HTTP request header with the given type.
		 
		 Custom headers will only be matched by this directive if they extend `ModeledCustomHeader`
		 and provide a companion extending `ModeledCustomHeaderCompanion`.
		 
		
		
		
		Parameters:
		`magnet` \- (undocumented)
		Returns:
		(undocumented)
		- #### optionalValue
		
		
		
		```
		scala.Function1<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.Option<java.lang.String>> optionalValue​(java.lang.String lowerCaseName)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOriginRange.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MalformedHeaderRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingHeaderRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/HeaderDirectives.html)*