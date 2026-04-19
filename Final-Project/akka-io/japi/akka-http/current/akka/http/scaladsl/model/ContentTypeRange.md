---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
title: ContentTypeRange
---

# ContentTypeRange

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class ContentTypeRange

- java.lang.Object
- - [akka.http.javadsl.model.ContentTypeRange](../../javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.ContentTypeRange

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ContentTypeRange
extends [ContentTypeRange](../../javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model")
implements [ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.ContentTypeRange)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ContentTypeRange](#%3Cinit%3E(akka.http.scaladsl.model.MediaRange,akka.http.scaladsl.model.HttpCharsetRange))​([MediaRange](MediaRange.html "class in akka.http.scaladsl.model") mediaRange,  [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model") charsetRange)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ContentTypeRange](ContentTypeRange.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.ContentType))​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |
	| `static [ContentTypeRange](ContentTypeRange.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.MediaRange))​([MediaRange](MediaRange.html "class in akka.http.scaladsl.model") mediaRange)` |  |
	| `static [ContentTypeRange](ContentTypeRange.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.MediaType))​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model")` | `[charsetRange](#charsetRange())()` |  |
	| `boolean` | `[matches](#matches(akka.http.javadsl.model.ContentType))​([ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model") contentType)` | Returns true if this range includes the given content type. |
	| `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")` | `[mediaRange](#mediaRange())()` |  |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### ContentTypeRange
		
		
		
		```
		public ContentTypeRange​([MediaRange](MediaRange.html "class in akka.http.scaladsl.model") mediaRange,
		                        [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model") charsetRange)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ContentTypeRange](ContentTypeRange.html "class in akka.http.scaladsl.model") apply​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### apply
		
		
		
		```
		public static [ContentTypeRange](ContentTypeRange.html "class in akka.http.scaladsl.model") apply​([MediaRange](MediaRange.html "class in akka.http.scaladsl.model") mediaRange)
		```
		- #### apply
		
		
		
		```
		public static [ContentTypeRange](ContentTypeRange.html "class in akka.http.scaladsl.model") apply​([ContentType](ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```
		- #### mediaRange
		
		
		
		```
		public [MediaRange](MediaRange.html "class in akka.http.scaladsl.model") mediaRange()
		```
		
		
		Specified by:
		`[mediaRange](../../javadsl/model/ContentTypeRange.html#mediaRange())` in class `[ContentTypeRange](../../javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model")`
		- #### charsetRange
		
		
		
		```
		public [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model") charsetRange()
		```
		
		
		Specified by:
		`[charsetRange](../../javadsl/model/ContentTypeRange.html#charsetRange())` in class `[ContentTypeRange](../../javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model")`
		- #### matches
		
		
		
		```
		public boolean matches​([ContentType](../../javadsl/model/ContentType.html "interface in akka.http.javadsl.model") contentType)
		```
		
		Description copied from class: `[ContentTypeRange](../../javadsl/model/ContentTypeRange.html#matches(akka.http.javadsl.model.ContentType))`
		Returns true if this range includes the given content type.
		
		Specified by:
		`[matches](../../javadsl/model/ContentTypeRange.html#matches(akka.http.javadsl.model.ContentType))` in class `[ContentTypeRange](../../javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html)*