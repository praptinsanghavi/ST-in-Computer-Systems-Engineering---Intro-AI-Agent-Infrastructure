---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/MethodDirectives.html
title: MethodDirectives
---

# MethodDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface MethodDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[MethodDirectives$](MethodDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface MethodDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[delete](#delete())()` | Rejects all non\-DELETE requests. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpMethod](../../model/HttpMethod.html "class in akka.http.scaladsl.model")>>` | `[extractMethod](#extractMethod())()` | Extracts the request method. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[get](#get())()` | Rejects all non\-GET requests. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[head](#head())()` | Rejects all non\-HEAD requests. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[method](#method(akka.http.scaladsl.model.HttpMethod))​([HttpMethod](../../model/HttpMethod.html "class in akka.http.scaladsl.model") httpMethod)` | Rejects all requests whose HTTP method does not match the given one. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[options](#options())()` | Rejects all non\-OPTIONS requests. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[overrideMethodWithParameter](#overrideMethodWithParameter(java.lang.String))​(java.lang.String paramName)` | Changes the HTTP method of the request to the value of the specified query string parameter. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[patch](#patch())()` | Rejects all non\-PATCH requests. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[post](#post())()` | Rejects all non\-POST requests. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[put](#put())()` | Rejects all non\-PUT requests. |

- - ### Method Detail
	
	
	
		- #### delete
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> delete()
		```
		
		Rejects all non\-DELETE requests.
		 
		
		Returns:
		(undocumented)
		- #### get
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> get()
		```
		
		Rejects all non\-GET requests.
		 
		
		Returns:
		(undocumented)
		- #### head
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> head()
		```
		
		Rejects all non\-HEAD requests.
		 
		
		Returns:
		(undocumented)
		- #### options
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> options()
		```
		
		Rejects all non\-OPTIONS requests.
		 
		
		Returns:
		(undocumented)
		- #### patch
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> patch()
		```
		
		Rejects all non\-PATCH requests.
		 
		
		Returns:
		(undocumented)
		- #### post
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> post()
		```
		
		Rejects all non\-POST requests.
		 
		
		Returns:
		(undocumented)
		- #### put
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> put()
		```
		
		Rejects all non\-PUT requests.
		 
		
		Returns:
		(undocumented)
		- #### extractMethod
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpMethod](../../model/HttpMethod.html "class in akka.http.scaladsl.model")>> extractMethod()
		```
		
		Extracts the request method.
		 
		
		Returns:
		(undocumented)
		- #### method
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> method​([HttpMethod](../../model/HttpMethod.html "class in akka.http.scaladsl.model") httpMethod)
		```
		
		Rejects all requests whose HTTP method does not match the given one.
		 
		
		Parameters:
		`httpMethod` \- (undocumented)
		Returns:
		(undocumented)
		- #### overrideMethodWithParameter
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> overrideMethodWithParameter​(java.lang.String paramName)
		```
		
		Changes the HTTP method of the request to the value of the specified query string parameter. If the query string
		 parameter is not specified this directive has no effect. If the query string is specified as something that is not
		 a HTTP method, then this directive completes the request with a `501 Not Implemented` response.
		 
		 This directive is useful for:
		 \- Use in combination with JSONP (JSONP only supports GET)
		 \- Supporting older browsers that lack support for certain HTTP methods. E.g. IE8 does not support PATCH
		 
		
		
		
		Parameters:
		`paramName` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/MethodDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/MethodDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/MethodDirectives.html)*