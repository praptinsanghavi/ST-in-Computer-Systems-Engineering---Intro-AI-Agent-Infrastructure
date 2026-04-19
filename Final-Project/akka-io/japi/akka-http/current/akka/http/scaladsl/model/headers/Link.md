---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html
title: Link
---

# Link

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Link

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.Link](../../../javadsl/model/headers/Link.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.Link

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `[RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers")`, `[RequestResponseHeader](RequestResponseHeader.html "interface in akka.http.scaladsl.model.headers")`, `[ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Link
extends [Link](../../../javadsl/model/headers/Link.html "class in akka.http.javadsl.model.headers")
implements [RequestResponseHeader](RequestResponseHeader.html "interface in akka.http.scaladsl.model.headers"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Link)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Link](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")> values)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Link](Link.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.headers.LinkValue,scala.collection.immutable.Seq))​([LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers") firstValue,  scala.collection.immutable.Seq<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")> otherValues)` |  |
	| `static [Link](Link.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.Uri,akka.http.scaladsl.model.headers.LinkParam,scala.collection.immutable.Seq))​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,  [LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")> more)` |  |
	| `protected [Link$](Link$.html "class in akka.http.scaladsl.model.headers")` | `[companion](#companion())()` |  |
	| `java.lang.Iterable<[LinkValue](../../../javadsl/model/headers/LinkValue.html "class in akka.http.javadsl.model.headers")>` | `[getValues](#getValues())()` | Java API |
	| `static java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `static java.lang.String` | `[name](#name())()` |  |
	| `static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T>` | `[parseFromValueString](#parseFromValueString(java.lang.String))​(java.lang.String value)` |  |
	| `static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderValue](#renderValue(R))​(R r)` |  |
	| `scala.collection.immutable.Seq<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")>` | `[values](#values())()` |  |
	| `static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")>>` | `[valuesRenderer](#valuesRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[Link](../../../javadsl/model/headers/Link.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/Link.html#create(akka.http.javadsl.model.headers.LinkValue...))`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../HttpHeader.html#is(java.lang.String)), [isNot](../HttpHeader.html#isNot(java.lang.String)), [lowercaseName](../HttpHeader.html#lowercaseName()), [name](../HttpHeader.html#name()), [parse](../HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../HttpHeader.html#unsafeToString()), [value](../HttpHeader.html#value())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../../../javadsl/model/HttpHeader.html#renderInRequests()), [renderInResponses](../../../javadsl/model/HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledHeader.html#lowercaseName()), [name](ModeledHeader.html#name()), [render](ModeledHeader.html#render(R)), [value](ModeledHeader.html#value())`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[renderInRequests](RequestHeader.html#renderInRequests())`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[renderInResponses](ResponseHeader.html#renderInResponses())`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### Link
		
		
		
		```
		public Link​(scala.collection.immutable.Seq<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")> values)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Link](Link.html "class in akka.http.scaladsl.model.headers") apply​([Uri](../Uri.html "class in akka.http.scaladsl.model") uri,
		                         [LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers") first,
		                         scala.collection.immutable.Seq<[LinkParam](LinkParam.html "class in akka.http.scaladsl.model.headers")> more)
		```
		- #### apply
		
		
		
		```
		public static [Link](Link.html "class in akka.http.scaladsl.model.headers") apply​([LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers") firstValue,
		                         scala.collection.immutable.Seq<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")> otherValues)
		```
		- #### valuesRenderer
		
		
		
		```
		public static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")>> valuesRenderer()
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
		- #### values
		
		
		
		```
		public scala.collection.immutable.Seq<[LinkValue](LinkValue.html "class in akka.http.scaladsl.model.headers")> values()
		```
		- #### renderValue
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") renderValue​(R r)
		```
		
		
		Specified by:
		`[renderValue](ModeledHeader.html#renderValue(R))` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### companion
		
		
		
		```
		protected [Link$](Link$.html "class in akka.http.scaladsl.model.headers") companion()
		```
		
		
		Specified by:
		`[companion](ModeledHeader.html#companion())` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### getValues
		
		
		
		```
		public java.lang.Iterable<[LinkValue](../../../javadsl/model/headers/LinkValue.html "class in akka.http.javadsl.model.headers")> getValues()
		```
		
		Java API
		
		Specified by:
		`[getValues](../../../javadsl/model/headers/Link.html#getValues())` in class `[Link](../../../javadsl/model/headers/Link.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Link.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParam.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestResponseHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ResponseHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html)*