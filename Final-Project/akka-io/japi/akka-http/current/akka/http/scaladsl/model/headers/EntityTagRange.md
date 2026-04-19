---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.Default.html
title: EntityTagRange.Default
---

# EntityTagRange.Default

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class EntityTagRange.Default

- java.lang.Object
- - [akka.http.javadsl.model.headers.EntityTagRange](../../../javadsl/model/headers/EntityTagRange.html "class in akka.http.javadsl.model.headers")
	- - [akka.http.scaladsl.model.headers.EntityTagRange](EntityTagRange.html "class in akka.http.scaladsl.model.headers")
		- - akka.http.scaladsl.model.headers.EntityTagRange.Default

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[EntityTagRange](EntityTagRange.html "class in akka.http.scaladsl.model.headers")

---

```
public static final class EntityTagRange.Default
extends [EntityTagRange](EntityTagRange.html "class in akka.http.scaladsl.model.headers")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.EntityTagRange.Default)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.headers.[EntityTagRange](EntityTagRange.html "class in akka.http.scaladsl.model.headers")
		
		
		`[EntityTagRange.$times$](EntityTagRange.$times$.html "class in akka.http.scaladsl.model.headers"), [EntityTagRange.Default](EntityTagRange.Default.html "class in akka.http.scaladsl.model.headers"), [EntityTagRange.Default$](EntityTagRange.Default$.html "class in akka.http.scaladsl.model.headers")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Default](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers")> tags)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `scala.collection.immutable.Seq<[EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers")>` | `[tags](#tags())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[EntityTagRange](EntityTagRange.html "class in akka.http.scaladsl.model.headers")
		
		
		`[apply](EntityTagRange.html#apply(scala.collection.immutable.Seq)), [tagsRenderer](EntityTagRange.html#tagsRenderer())`
		- ### Methods inherited from class akka.http.javadsl.model.headers.[EntityTagRange](../../../javadsl/model/headers/EntityTagRange.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/EntityTagRange.html#create(akka.http.javadsl.model.headers.EntityTag...))`
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
	
	
	
		- #### Default
		
		
		
		```
		public Default​(scala.collection.immutable.Seq<[EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers")> tags)
		```

	- ### Method Detail
	
	
	
		- #### tags
		
		
		
		```
		public scala.collection.immutable.Seq<[EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers")> tags()
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
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/EntityTagRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.$times$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.Default$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.Default.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.Default.html)*