---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/SameSite.html
title: SameSite
---

# SameSite

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Interface SameSite

- All Superinterfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`

All Known Implementing Classes:
`[SameSite.Lax$](SameSite.Lax$.html "class in akka.http.scaladsl.model.headers")`, `[SameSite.None$](SameSite.None$.html "class in akka.http.scaladsl.model.headers")`, `[SameSite.Strict$](SameSite.Strict$.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface SameSite
extends [Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
```

The Cookie SameSite attribute as defined by [RFC6265bis](https://tools.ietf.org/html/draft-ietf-httpbis-cookie-same-site-00)
 and [Incrementally Better Cookies](https://tools.ietf.org/html/draft-west-cookie-incrementalism-00).

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[SameSite.Lax$](SameSite.Lax$.html "class in akka.http.scaladsl.model.headers")` |  |
	| `static class` | `[SameSite.None$](SameSite.None$.html "class in akka.http.scaladsl.model.headers")` |  |
	| `static class` | `[SameSite.Strict$](SameSite.Strict$.html "class in akka.http.scaladsl.model.headers")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[SameSite](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers")` | `[asJava](#asJava())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |

- - ### Method Detail
	
	
	
		- #### asJava
		
		
		
		```
		[SameSite](../../../javadsl/model/headers/SameSite.html "enum in akka.http.javadsl.model.headers") asJava()
		```
		- #### render
		
		
		
		```
		<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/SameSite.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/SameSite.Lax$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/SameSite.None$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/SameSite.Strict$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/SameSite.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/SameSite.html)*