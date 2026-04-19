---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AttributeDirectives.html
title: AttributeDirectives
---

# AttributeDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface AttributeDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[AttributeDirectives$](AttributeDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface AttributeDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[attribute](#attribute(akka.http.scaladsl.model.AttributeKey))​([AttributeKey](../../model/AttributeKey.html "class in akka.http.scaladsl.model")<T> key)` | Extracts a request attribute value for the given key. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<T>>>` | `[optionalAttribute](#optionalAttribute(akka.http.scaladsl.model.AttributeKey))​([AttributeKey](../../model/AttributeKey.html "class in akka.http.scaladsl.model")<T> key)` | Extracts an optional request attribute for the given key. |

- - ### Method Detail
	
	
	
		- #### attribute
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> attribute​([AttributeKey](../../model/AttributeKey.html "class in akka.http.scaladsl.model")<T> key)
		```
		
		Extracts a request attribute value for the given key.
		 
		
		Parameters:
		`key` \- (undocumented)
		Returns:
		(undocumented)
		- #### optionalAttribute
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<T>>> optionalAttribute​([AttributeKey](../../model/AttributeKey.html "class in akka.http.scaladsl.model")<T> key)
		```
		
		Extracts an optional request attribute for the given key.
		 
		
		Parameters:
		`key` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AttributeDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AttributeDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AttributeDirectives.html)*