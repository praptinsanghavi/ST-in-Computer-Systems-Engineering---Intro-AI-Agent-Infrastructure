---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WebSocketExtension.html
title: WebSocketExtension
---

# WebSocketExtension

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class WebSocketExtension

- java.lang.Object
- - akka.http.scaladsl.model.headers.WebSocketExtension

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class WebSocketExtension
extends java.lang.Object
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

A websocket extension as defined in http://tools.ietf.org/html/rfc6455\#section\-4\.3

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.WebSocketExtension)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocketExtension](#%3Cinit%3E(java.lang.String,scala.collection.immutable.Map))​(java.lang.String name,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2))​(T1 v1,  T2 v2)` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[params](#params())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
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
	
	
	
		- #### WebSocketExtension
		
		
		
		```
		public WebSocketExtension​(java.lang.String name,
		                          scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### params
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.String> params()
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
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WebSocketExtension.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WebSocketExtension.html)*