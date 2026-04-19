---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html
title: HttpCookiePair
---

# HttpCookiePair

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpCookiePair

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpCookiePair](../../../javadsl/model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.HttpCookiePair

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public abstract class HttpCookiePair
extends [HttpCookiePair](../../../javadsl/model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")
implements [ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

for a full definition of the http cookie header fields, see
 http://tools.ietf.org/html/rfc6265
 This class is sealed abstract to prevent generation of default apply method in companion

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.HttpCookiePair)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCookiePair](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `static [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(scala.Tuple2))​(scala.Tuple2<java.lang.String,​java.lang.String> pair)` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `static [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[raw](#raw(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `static [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[raw](#raw(scala.Tuple2))​(scala.Tuple2<java.lang.String,​java.lang.String> pair)` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `[HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers")` | `[toCookie](#toCookie())()` | Converts this cookie pair into an HttpCookie to be used with the  \`Set\-Cookie\` header. |
	| `static void` | `[validate](#validate(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `static void` | `[validateRaw](#validateRaw(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `java.lang.String` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[HttpCookiePair](../../../javadsl/model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/HttpCookiePair.html#create(java.lang.String,java.lang.String)), [createRaw](../../../javadsl/model/headers/HttpCookiePair.html#createRaw(java.lang.String,java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### HttpCookiePair
		
		
		
		```
		public HttpCookiePair()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") apply​(scala.Tuple2<java.lang.String,​java.lang.String> pair)
		```
		- #### apply
		
		
		
		```
		public static [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String name,
		                                   java.lang.String value)
		```
		- #### raw
		
		
		
		```
		public static [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") raw​(scala.Tuple2<java.lang.String,​java.lang.String> pair)
		```
		- #### raw
		
		
		
		```
		public static [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") raw​(java.lang.String name,
		                                 java.lang.String value)
		```
		- #### validate
		
		
		
		```
		public static void validate​(java.lang.String name,
		                            java.lang.String value)
		```
		- #### validateRaw
		
		
		
		```
		public static void validateRaw​(java.lang.String name,
		                               java.lang.String value)
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		
		Specified by:
		`[name](../../../javadsl/model/headers/HttpCookiePair.html#name())` in class `[HttpCookiePair](../../../javadsl/model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")`
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		
		Specified by:
		`[value](../../../javadsl/model/headers/HttpCookiePair.html#value())` in class `[HttpCookiePair](../../../javadsl/model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`
		- #### toCookie
		
		
		
		```
		public [HttpCookie](HttpCookie.html "class in akka.http.scaladsl.model.headers") toCookie()
		```
		
		Description copied from class: `[HttpCookiePair](../../../javadsl/model/headers/HttpCookiePair.html#toCookie())`
		Converts this cookie pair into an HttpCookie to be used with the
		 \`Set\-Cookie\` header.
		
		Specified by:
		`[toCookie](../../../javadsl/model/headers/HttpCookiePair.html#toCookie())` in class `[HttpCookiePair](../../../javadsl/model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html)*