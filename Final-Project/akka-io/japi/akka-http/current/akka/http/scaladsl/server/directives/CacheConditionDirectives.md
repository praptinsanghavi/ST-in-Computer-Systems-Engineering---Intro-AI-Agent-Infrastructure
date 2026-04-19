---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CacheConditionDirectives.html
title: CacheConditionDirectives
---

# CacheConditionDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface CacheConditionDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[CacheConditionDirectives$](CacheConditionDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface CacheConditionDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[conditional](#conditional(akka.http.scaladsl.model.DateTime))​([DateTime](../../model/DateTime.html "class in akka.http.scaladsl.model") lastModified)` | Wraps its inner route with support for Conditional Requests as defined  by http://tools.ietf.org/html/rfc7232 |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[conditional](#conditional(akka.http.scaladsl.model.headers.EntityTag))​([EntityTag](../../model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers") eTag)` | Wraps its inner route with support for Conditional Requests as defined  by http://tools.ietf.org/html/rfc7232 |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[conditional](#conditional(akka.http.scaladsl.model.headers.EntityTag,akka.http.scaladsl.model.DateTime))​([EntityTag](../../model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,  [DateTime](../../model/DateTime.html "class in akka.http.scaladsl.model") lastModified)` | Wraps its inner route with support for Conditional Requests as defined  by http://tools.ietf.org/html/rfc7232 |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[conditional](#conditional(scala.Option,scala.Option))​(scala.Option<[EntityTag](../../model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers")> eTag,  scala.Option<[DateTime](../../model/DateTime.html "class in akka.http.scaladsl.model")> lastModified)` | Wraps its inner route with support for Conditional Requests as defined  by http://tools.ietf.org/html/rfc7232 |

- - ### Method Detail
	
	
	
		- #### conditional
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> conditional​([EntityTag](../../model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers") eTag)
		```
		
		Wraps its inner route with support for Conditional Requests as defined
		 by http://tools.ietf.org/html/rfc7232
		 
		 In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
		 is implemented by this directive.
		 
		
		
		 Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
		 it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
		 must be on a deeper level in your route structure in order to function correctly.
		 
		
		
		
		Parameters:
		`eTag` \- (undocumented)
		Returns:
		(undocumented)
		- #### conditional
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> conditional​([DateTime](../../model/DateTime.html "class in akka.http.scaladsl.model") lastModified)
		```
		
		Wraps its inner route with support for Conditional Requests as defined
		 by http://tools.ietf.org/html/rfc7232
		 
		 In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
		 is implemented by this directive.
		 
		
		
		 Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
		 it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
		 must be on a deeper level in your route structure in order to function correctly.
		 
		
		
		
		Parameters:
		`lastModified` \- (undocumented)
		Returns:
		(undocumented)
		- #### conditional
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> conditional​([EntityTag](../../model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,
		                                               [DateTime](../../model/DateTime.html "class in akka.http.scaladsl.model") lastModified)
		```
		
		Wraps its inner route with support for Conditional Requests as defined
		 by http://tools.ietf.org/html/rfc7232
		 
		 In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
		 is implemented by this directive.
		 
		
		
		 Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
		 it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
		 must be on a deeper level in your route structure in order to function correctly.
		 
		
		
		
		Parameters:
		`eTag` \- (undocumented)
		`lastModified` \- (undocumented)
		Returns:
		(undocumented)
		- #### conditional
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> conditional​(scala.Option<[EntityTag](../../model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers")> eTag,
		                                               scala.Option<[DateTime](../../model/DateTime.html "class in akka.http.scaladsl.model")> lastModified)
		```
		
		Wraps its inner route with support for Conditional Requests as defined
		 by http://tools.ietf.org/html/rfc7232
		 
		 In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
		 is implemented by this directive.
		 
		
		
		 Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
		 it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
		 must be on a deeper level in your route structure in order to function correctly.
		 
		
		
		
		Parameters:
		`eTag` \- (undocumented)
		`lastModified` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CacheConditionDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CacheConditionDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CacheConditionDirectives.html)*