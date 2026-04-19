---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UriRendering.UriRenderer$.html
title: UriRendering.UriRenderer$
---

# UriRendering.UriRenderer$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class UriRendering.UriRenderer$

- java.lang.Object
- - akka.http.scaladsl.model.UriRendering.UriRenderer$

- All Implemented Interfaces:
`[Renderer](../../impl/util/Renderer.html "interface in akka.http.impl.util")<[Uri](Uri.html "class in akka.http.scaladsl.model")>`

Enclosing class:
[UriRendering](UriRendering.html "class in akka.http.scaladsl.model")

---

```
public static class UriRendering.UriRenderer$
extends java.lang.Object
implements [Renderer](../../impl/util/Renderer.html "interface in akka.http.impl.util")<[Uri](Uri.html "class in akka.http.scaladsl.model")>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.impl.util.[Renderer](../../impl/util/Renderer.html "interface in akka.http.impl.util")
		
		
		`[Renderer.ByteStringRenderer$](../../impl/util/Renderer.ByteStringRenderer$.html "class in akka.http.impl.util"), [Renderer.CharRenderer$](../../impl/util/Renderer.CharRenderer$.html "class in akka.http.impl.util"), [Renderer.CharsRenderer$](../../impl/util/Renderer.CharsRenderer$.html "class in akka.http.impl.util"), [Renderer.IntRenderer$](../../impl/util/Renderer.IntRenderer$.html "class in akka.http.impl.util"), [Renderer.RenderableRenderer$](../../impl/util/Renderer.RenderableRenderer$.html "class in akka.http.impl.util"), [Renderer.StringRenderer$](../../impl/util/Renderer.StringRenderer$.html "class in akka.http.impl.util")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UriRendering.UriRenderer$](UriRendering.UriRenderer$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UriRenderer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R,akka.http.scaladsl.model.Uri))​(R r,  [Uri](Uri.html "class in akka.http.scaladsl.model") value)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UriRendering.UriRenderer$](UriRendering.UriRenderer$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UriRenderer$
		
		
		
		```
		public UriRenderer$()
		```

	- ### Method Detail
	
	
	
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r,
		                                              [Uri](Uri.html "class in akka.http.scaladsl.model") value)
		```
		
		
		Specified by:
		`[render](../../impl/util/Renderer.html#render(R,T))` in interface `[Renderer](../../impl/util/Renderer.html "interface in akka.http.impl.util")<[Uri](Uri.html "class in akka.http.scaladsl.model")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.ByteStringRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.CharRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.CharsRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.IntRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.RenderableRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.StringRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UriRendering.UriRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UriRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UriRendering.UriRenderer$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/UriRendering.UriRenderer$.html)*