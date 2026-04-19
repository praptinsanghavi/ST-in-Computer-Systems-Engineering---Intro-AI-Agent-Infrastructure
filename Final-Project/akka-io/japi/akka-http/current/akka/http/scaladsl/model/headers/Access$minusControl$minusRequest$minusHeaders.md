---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html
title: Access$minusControl$minusRequest$minusHeaders
---

# Access$minusControl$minusRequest$minusHeaders

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Access$minusControl$minusRequest$minusHeaders

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.AccessControlRequestHeaders](../../../javadsl/model/headers/AccessControlRequestHeaders.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.Access$minusControl$minusRequest$minusHeaders

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `[RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Access$minusControl$minusRequest$minusHeaders
extends [AccessControlRequestHeaders](../../../javadsl/model/headers/AccessControlRequestHeaders.html "class in akka.http.javadsl.model.headers")
implements [RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Access$minusControl$minusRequest$minusHeaders)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Access$minusControl$minusRequest$minusHeaders](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> headers)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Access$minusControl$minusRequest$minusHeaders](Access$minusControl$minusRequest$minusHeaders.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String firstHeader,  scala.collection.immutable.Seq<java.lang.String> otherHeaders)` |  |
	| `protected [Access$minusControl$minusRequest$minusHeaders$](Access$minusControl$minusRequest$minusHeaders$.html "class in akka.http.scaladsl.model.headers")` | `[companion](#companion())()` |  |
	| `java.lang.Iterable<java.lang.String>` | `[getHeaders](#getHeaders())()` | Java API |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[headers](#headers())()` |  |
	| `static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<java.lang.String>>` | `[headersRenderer](#headersRenderer())()` |  |
	| `static java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `static java.lang.String` | `[name](#name())()` |  |
	| `static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T>` | `[parseFromValueString](#parseFromValueString(java.lang.String))​(java.lang.String value)` |  |
	| `static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderValue](#renderValue(R))​(R r)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[AccessControlRequestHeaders](../../../javadsl/model/headers/AccessControlRequestHeaders.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/AccessControlRequestHeaders.html#create(java.lang.String...))`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../HttpHeader.html#is(java.lang.String)), [isNot](../HttpHeader.html#isNot(java.lang.String)), [lowercaseName](../HttpHeader.html#lowercaseName()), [name](../HttpHeader.html#name()), [parse](../HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../HttpHeader.html#unsafeToString()), [value](../HttpHeader.html#value())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../../../javadsl/model/HttpHeader.html#renderInRequests()), [renderInResponses](../../../javadsl/model/HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledHeader.html#lowercaseName()), [name](ModeledHeader.html#name()), [render](ModeledHeader.html#render(R)), [renderInResponses](ModeledHeader.html#renderInResponses()), [value](ModeledHeader.html#value())`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[renderInRequests](RequestHeader.html#renderInRequests())`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### Access$minusControl$minusRequest$minusHeaders
		
		
		
		```
		public Access$minusControl$minusRequest$minusHeaders​(scala.collection.immutable.Seq<java.lang.String> headers)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Access$minusControl$minusRequest$minusHeaders](Access$minusControl$minusRequest$minusHeaders.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String firstHeader,
		                                                                  scala.collection.immutable.Seq<java.lang.String> otherHeaders)
		```
		- #### headersRenderer
		
		
		
		```
		public static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<java.lang.String>> headersRenderer()
		```
		- #### name
		
		
		
		```
		public static java.lang.String name()
		```
		- #### lowercaseName
		
		
		
		```
		public static java.lang.String lowercaseName()
		```
		- #### render
		
		
		
		```
		public static final <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		- #### parseFromValueString
		
		
		
		```
		public static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T> parseFromValueString​(java.lang.String value)
		```
		- #### headers
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> headers()
		```
		- #### renderValue
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") renderValue​(R r)
		```
		
		
		Specified by:
		`[renderValue](ModeledHeader.html#renderValue(R))` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### companion
		
		
		
		```
		protected [Access$minusControl$minusRequest$minusHeaders$](Access$minusControl$minusRequest$minusHeaders$.html "class in akka.http.scaladsl.model.headers") companion()
		```
		
		
		Specified by:
		`[companion](ModeledHeader.html#companion())` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### getHeaders
		
		
		
		```
		public java.lang.Iterable<java.lang.String> getHeaders()
		```
		
		Java API
		
		Specified by:
		`[getHeaders](../../../javadsl/model/headers/AccessControlRequestHeaders.html#getHeaders())` in class `[AccessControlRequestHeaders](../../../javadsl/model/headers/AccessControlRequestHeaders.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/AccessControlRequestHeaders.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html)*