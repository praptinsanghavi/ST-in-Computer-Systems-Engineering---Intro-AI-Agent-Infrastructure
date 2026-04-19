---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective.html
title: CacheDirective.CustomCacheDirective
---

# CacheDirective.CustomCacheDirective

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class CacheDirective.CustomCacheDirective

- java.lang.Object
- - akka.http.scaladsl.model.headers.CacheDirective.CustomCacheDirective

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `[CacheDirective](../../../javadsl/model/headers/CacheDirective.html "interface in akka.http.javadsl.model.headers")`, `[CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers")`, `[CacheDirective.RequestDirective](CacheDirective.RequestDirective.html "interface in akka.http.scaladsl.model.headers")`, `[CacheDirective.ResponseDirective](CacheDirective.ResponseDirective.html "interface in akka.http.scaladsl.model.headers")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers")

---

```
public static final class CacheDirective.CustomCacheDirective
extends java.lang.Object
implements [CacheDirective.RequestDirective](CacheDirective.RequestDirective.html "interface in akka.http.scaladsl.model.headers"), [CacheDirective.ResponseDirective](CacheDirective.ResponseDirective.html "interface in akka.http.scaladsl.model.headers"), [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.CacheDirective.CustomCacheDirective)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.headers.[CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[CacheDirective.CustomCacheDirective](CacheDirective.CustomCacheDirective.html "class in akka.http.scaladsl.model.headers"), [CacheDirective.CustomCacheDirective$](CacheDirective.CustomCacheDirective$.html "class in akka.http.scaladsl.model.headers"), [CacheDirective.FieldNamesDirective](CacheDirective.FieldNamesDirective.html "class in akka.http.scaladsl.model.headers"), [CacheDirective.RequestDirective](CacheDirective.RequestDirective.html "interface in akka.http.scaladsl.model.headers"), [CacheDirective.ResponseDirective](CacheDirective.ResponseDirective.html "interface in akka.http.scaladsl.model.headers")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CustomCacheDirective](#%3Cinit%3E(java.lang.String,scala.Option))​(java.lang.String name,  scala.Option<java.lang.String> content)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.lang.String>` | `[content](#content())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[CacheDirective](CacheDirective.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[value](CacheDirective.html#value())`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### CustomCacheDirective
		
		
		
		```
		public CustomCacheDirective​(java.lang.String name,
		                            scala.Option<java.lang.String> content)
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### content
		
		
		
		```
		public scala.Option<java.lang.String> content()
		```
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CacheDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.FieldNamesDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.RequestDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.ResponseDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective.html)*