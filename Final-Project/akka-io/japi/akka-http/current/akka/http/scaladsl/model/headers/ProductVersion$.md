---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion$.html
title: ProductVersion$
---

# ProductVersion$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class ProductVersion$

- java.lang.Object
- - akka.http.scaladsl.model.headers.ProductVersion$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ProductVersion$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.ProductVersion$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ProductVersion$](ProductVersion$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProductVersion$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[ProductVersion](ProductVersion.html "class in akka.http.scaladsl.model.headers")>` | `[parseMultiple](#parseMultiple(java.lang.String))​(java.lang.String string)` | parses a string of multiple ProductVersions |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<[ProductVersion](ProductVersion.html "class in akka.http.scaladsl.model.headers")>>` | `[productsRenderer](#productsRenderer())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ProductVersion$](ProductVersion$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ProductVersion$
		
		
		
		```
		public ProductVersion$()
		```

	- ### Method Detail
	
	
	
		- #### productsRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<[ProductVersion](ProductVersion.html "class in akka.http.scaladsl.model.headers")>> productsRenderer()
		```
		- #### parseMultiple
		
		
		
		```
		public scala.collection.immutable.Seq<[ProductVersion](ProductVersion.html "class in akka.http.scaladsl.model.headers")> parseMultiple​(java.lang.String string)
		```
		
		parses a string of multiple ProductVersions

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ProductVersion$.html)*