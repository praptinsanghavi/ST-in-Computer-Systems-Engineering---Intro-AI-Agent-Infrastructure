---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOrigin.html
title: HttpOrigin
---

# HttpOrigin

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpOrigin

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpOrigin](../../../javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.HttpOrigin

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class HttpOrigin
extends [HttpOrigin](../../../javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers")
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.HttpOrigin)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpOrigin](#%3Cinit%3E(java.lang.String,akka.http.scaladsl.model.headers.Host))​(java.lang.String scheme,  [Host](Host.html "class in akka.http.scaladsl.model.headers") host)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpOrigin](HttpOrigin.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String))​(java.lang.String str)` |  |
	| `[Host](Host.html "class in akka.http.scaladsl.model.headers")` | `[host](#host())()` |  |
	| `static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<[HttpOrigin](HttpOrigin.html "class in akka.http.scaladsl.model.headers")>>` | `[originsRenderer](#originsRenderer())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[scheme](#scheme())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[HttpOrigin](../../../javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/HttpOrigin.html#create(java.lang.String,akka.http.javadsl.model.headers.Host)), [parse](../../../javadsl/model/headers/HttpOrigin.html#parse(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### HttpOrigin
		
		
		
		```
		public HttpOrigin​(java.lang.String scheme,
		                  [Host](Host.html "class in akka.http.scaladsl.model.headers") host)
		```

	- ### Method Detail
	
	
	
		- #### originsRenderer
		
		
		
		```
		public static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<[HttpOrigin](HttpOrigin.html "class in akka.http.scaladsl.model.headers")>> originsRenderer()
		```
		- #### apply
		
		
		
		```
		public static [HttpOrigin](HttpOrigin.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String str)
		```
		- #### scheme
		
		
		
		```
		public java.lang.String scheme()
		```
		
		
		Specified by:
		`[scheme](../../../javadsl/model/headers/HttpOrigin.html#scheme())` in class `[HttpOrigin](../../../javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers")`
		- #### host
		
		
		
		```
		public [Host](Host.html "class in akka.http.scaladsl.model.headers") host()
		```
		
		
		Specified by:
		`[host](../../../javadsl/model/headers/HttpOrigin.html#host())` in class `[HttpOrigin](../../../javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOrigin.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOrigin.html)*