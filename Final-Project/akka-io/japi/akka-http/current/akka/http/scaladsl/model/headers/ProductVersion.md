---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion.html
title: ProductVersion
---

# ProductVersion

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class ProductVersion

- java.lang.Object
- - [akka.http.javadsl.model.headers.ProductVersion](../../../javadsl/model/headers/ProductVersion.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.ProductVersion

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ProductVersion
extends [ProductVersion](../../../javadsl/model/headers/ProductVersion.html "class in akka.http.javadsl.model.headers")
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.ProductVersion)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProductVersion](#%3Cinit%3E(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String product,  java.lang.String version,  java.lang.String comment)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[comment](#comment())()` |  |
	| `static scala.collection.immutable.Seq<[ProductVersion](ProductVersion.html "class in akka.http.scaladsl.model.headers")>` | `[parseMultiple](#parseMultiple(java.lang.String))​(java.lang.String string)` | parses a string of multiple ProductVersions |
	| `java.lang.String` | `[product](#product())()` |  |
	| `static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<[ProductVersion](ProductVersion.html "class in akka.http.scaladsl.model.headers")>>` | `[productsRenderer](#productsRenderer())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[version](#version())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[ProductVersion](../../../javadsl/model/headers/ProductVersion.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/ProductVersion.html#create(java.lang.String,java.lang.String)), [create](../../../javadsl/model/headers/ProductVersion.html#create(java.lang.String,java.lang.String,java.lang.String))`
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
	
	
	
		- #### ProductVersion
		
		
		
		```
		public ProductVersion​(java.lang.String product,
		                      java.lang.String version,
		                      java.lang.String comment)
		```

	- ### Method Detail
	
	
	
		- #### productsRenderer
		
		
		
		```
		public static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<[ProductVersion](ProductVersion.html "class in akka.http.scaladsl.model.headers")>> productsRenderer()
		```
		- #### parseMultiple
		
		
		
		```
		public static scala.collection.immutable.Seq<[ProductVersion](ProductVersion.html "class in akka.http.scaladsl.model.headers")> parseMultiple​(java.lang.String string)
		```
		
		parses a string of multiple ProductVersions
		- #### product
		
		
		
		```
		public java.lang.String product()
		```
		
		
		Specified by:
		`[product](../../../javadsl/model/headers/ProductVersion.html#product())` in class `[ProductVersion](../../../javadsl/model/headers/ProductVersion.html "class in akka.http.javadsl.model.headers")`
		- #### version
		
		
		
		```
		public java.lang.String version()
		```
		
		
		Specified by:
		`[version](../../../javadsl/model/headers/ProductVersion.html#version())` in class `[ProductVersion](../../../javadsl/model/headers/ProductVersion.html "class in akka.http.javadsl.model.headers")`
		- #### comment
		
		
		
		```
		public java.lang.String comment()
		```
		
		
		Specified by:
		`[comment](../../../javadsl/model/headers/ProductVersion.html#comment())` in class `[ProductVersion](../../../javadsl/model/headers/ProductVersion.html "class in akka.http.javadsl.model.headers")`
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
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/ProductVersion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion.html)*