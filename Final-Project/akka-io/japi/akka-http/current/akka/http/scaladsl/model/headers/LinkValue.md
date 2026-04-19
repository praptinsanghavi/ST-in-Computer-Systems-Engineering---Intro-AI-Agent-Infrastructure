---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkValue.html
title: LinkValue
---

# LinkValue

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class LinkValue

- java.lang.Object
- - [akka.http.javadsl.model.headers.LinkValue](../../../javadsl/model/headers/LinkValue.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.LinkValue

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class LinkValue
extends [LinkValue](../../../javadsl/model/headers/LinkValue.html "class in akka.http.javadsl.model.headers")
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.LinkValue)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LinkValue](#%3Cinit%3E(akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq))​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")> params)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.Uri,akka.http.scaladsl.model.headers.LinkParam,scala.collection.immutable.Seq))​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,  [LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers") firstParam,  scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")> otherParams)` |  |
	| `java.lang.Iterable<[LinkParam](../../../javadsl/model/headers/LinkParam.html "class in akka.http.javadsl.model.headers")>` | `[getParams](#getParams())()` |  |
	| `[Uri](../../../javadsl/model/Uri.html "class in akka.http.javadsl.model")` | `[getUri](#getUri())()` |  |
	| `scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")>` | `[params](#params())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `[Uri](../Uri.html "class in akka.http.scaladsl.model")` | `[uri](#uri())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[LinkValue](../../../javadsl/model/headers/LinkValue.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/LinkValue.html#create(akka.http.javadsl.model.Uri,akka.http.javadsl.model.headers.LinkParam...))`
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
	
	
	
		- #### LinkValue
		
		
		
		```
		public LinkValue​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,
		                 scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")> params)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers") apply​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,
		                              [LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers") firstParam,
		                              scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")> otherParams)
		```
		- #### uri
		
		
		
		```
		public [Uri](../Uri.html "class in akka.http.scaladsl.model") uri()
		```
		- #### params
		
		
		
		```
		public scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")> params()
		```
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`
		- #### getUri
		
		
		
		```
		public [Uri](../../../javadsl/model/Uri.html "class in akka.http.javadsl.model") getUri()
		```
		
		
		Specified by:
		`[getUri](../../../javadsl/model/headers/LinkValue.html#getUri())` in class `[LinkValue](../../../javadsl/model/headers/LinkValue.html "class in akka.http.javadsl.model.headers")`
		- #### getParams
		
		
		
		```
		public java.lang.Iterable<[LinkParam](../../../javadsl/model/headers/LinkParam.html "class in akka.http.javadsl.model.headers")> getParams()
		```
		
		
		Specified by:
		`[getParams](../../../javadsl/model/headers/LinkValue.html#getParams())` in class `[LinkValue](../../../javadsl/model/headers/LinkValue.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkParam.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParam.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkValue.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkValue.html)*