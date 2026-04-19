---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnits.Other.html
title: RangeUnits.Other
---

# RangeUnits.Other

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class RangeUnits.Other

- java.lang.Object
- - [akka.http.javadsl.model.headers.RangeUnit](../../../javadsl/model/headers/RangeUnit.html "class in akka.http.javadsl.model.headers")
	- - [akka.http.scaladsl.model.headers.RangeUnit](RangeUnit.html "class in akka.http.scaladsl.model.headers")
		- - akka.http.scaladsl.model.headers.RangeUnits.Other

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[RangeUnits](RangeUnits.html "class in akka.http.scaladsl.model.headers")

---

```
public static final class RangeUnits.Other
extends [RangeUnit](RangeUnit.html "class in akka.http.scaladsl.model.headers")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.RangeUnits.Other)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Other](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[name](#name())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[RangeUnit](../../../javadsl/model/headers/RangeUnit.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/RangeUnit.html#create(java.lang.String))`
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
	
	
	
		- #### Other
		
		
		
		```
		public Other​(java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		
		Specified by:
		`[name](RangeUnit.html#name())` in class `[RangeUnit](RangeUnit.html "class in akka.http.scaladsl.model.headers")`
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
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/RangeUnit.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnit.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnits.Other.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RangeUnits.Other.html)*