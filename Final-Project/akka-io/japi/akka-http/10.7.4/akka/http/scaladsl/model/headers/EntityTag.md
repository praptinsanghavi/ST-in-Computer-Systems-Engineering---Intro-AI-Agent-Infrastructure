---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/EntityTag.html
title: EntityTag
---

# EntityTag

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class EntityTag

- java.lang.Object
- - [akka.http.javadsl.model.headers.EntityTag](../../../javadsl/model/headers/EntityTag.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.EntityTag

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class EntityTag
extends [EntityTag](../../../javadsl/model/headers/EntityTag.html "class in akka.http.javadsl.model.headers")
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.EntityTag)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityTag](#%3Cinit%3E(java.lang.String,boolean))​(java.lang.String tag,  boolean weak)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[matches](#matches(akka.http.scaladsl.model.headers.EntityTag,akka.http.scaladsl.model.headers.EntityTag,boolean))​([EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,  [EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") other,  boolean weakComparison)` |  |
	| `static boolean` | `[matchesRange](#matchesRange(akka.http.scaladsl.model.headers.EntityTag,akka.http.scaladsl.model.headers.EntityTagRange,boolean))​([EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,  [EntityTagRange](EntityTagRange.html "class in akka.http.scaladsl.model.headers") entityTagRange,  boolean weakComparison)` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[tag](#tag())()` |  |
	| `boolean` | `[weak](#weak())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[EntityTag](../../../javadsl/model/headers/EntityTag.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/EntityTag.html#create(java.lang.String,boolean)), [matches](../../../javadsl/model/headers/EntityTag.html#matches(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.headers.EntityTag,boolean)), [matchesRange](../../../javadsl/model/headers/EntityTag.html#matchesRange(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.headers.EntityTagRange,boolean))`
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
	
	
	
		- #### EntityTag
		
		
		
		```
		public EntityTag​(java.lang.String tag,
		                 boolean weak)
		```

	- ### Method Detail
	
	
	
		- #### matchesRange
		
		
		
		```
		public static boolean matchesRange​([EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,
		                                   [EntityTagRange](EntityTagRange.html "class in akka.http.scaladsl.model.headers") entityTagRange,
		                                   boolean weakComparison)
		```
		- #### matches
		
		
		
		```
		public static boolean matches​([EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,
		                              [EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") other,
		                              boolean weakComparison)
		```
		- #### tag
		
		
		
		```
		public java.lang.String tag()
		```
		
		
		Specified by:
		`[tag](../../../javadsl/model/headers/EntityTag.html#tag())` in class `[EntityTag](../../../javadsl/model/headers/EntityTag.html "class in akka.http.javadsl.model.headers")`
		- #### weak
		
		
		
		```
		public boolean weak()
		```
		
		
		Specified by:
		`[weak](../../../javadsl/model/headers/EntityTag.html#weak())` in class `[EntityTag](../../../javadsl/model/headers/EntityTag.html "class in akka.http.javadsl.model.headers")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/EntityTagRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/EntityTag.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/EntityTag.html)*