---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.StringRenderer$.html
title: Renderer.StringRenderer$
---

# Renderer.StringRenderer$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class Renderer.StringRenderer$

- java.lang.Object
- - akka.http.impl.util.Renderer.StringRenderer$

- All Implemented Interfaces:
`[Renderer](Renderer.html "interface in akka.http.impl.util")<java.lang.String>`

Enclosing interface:
[Renderer](Renderer.html "interface in akka.http.impl.util")\<[T](Renderer.html "type parameter in Renderer")\>

---

```
public static class Renderer.StringRenderer$
extends java.lang.Object
implements [Renderer](Renderer.html "interface in akka.http.impl.util")<java.lang.String>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.impl.util.[Renderer](Renderer.html "interface in akka.http.impl.util")
		
		
		`[Renderer.ByteStringRenderer$](Renderer.ByteStringRenderer$.html "class in akka.http.impl.util"), [Renderer.CharRenderer$](Renderer.CharRenderer$.html "class in akka.http.impl.util"), [Renderer.CharsRenderer$](Renderer.CharsRenderer$.html "class in akka.http.impl.util"), [Renderer.IntRenderer$](Renderer.IntRenderer$.html "class in akka.http.impl.util"), [Renderer.RenderableRenderer$](Renderer.RenderableRenderer$.html "class in akka.http.impl.util"), [Renderer.StringRenderer$](Renderer.StringRenderer$.html "class in akka.http.impl.util")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Renderer.StringRenderer$](Renderer.StringRenderer$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StringRenderer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<R extends [Rendering](Rendering.html "interface in akka.http.impl.util")>[Rendering](Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R,java.lang.String))​(R r,  java.lang.String value)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Renderer.StringRenderer$](Renderer.StringRenderer$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StringRenderer$
		
		
		
		```
		public StringRenderer$()
		```

	- ### Method Detail
	
	
	
		- #### render
		
		
		
		```
		public <R extends [Rendering](Rendering.html "interface in akka.http.impl.util")> [Rendering](Rendering.html "interface in akka.http.impl.util") render​(R r,
		                                              java.lang.String value)
		```
		
		
		Specified by:
		`[render](Renderer.html#render(R,T))` in interface `[Renderer](Renderer.html "interface in akka.http.impl.util")<java.lang.String>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.ByteStringRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.CharRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.CharsRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.IntRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.RenderableRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.StringRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.StringRenderer$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.StringRenderer$.html)*