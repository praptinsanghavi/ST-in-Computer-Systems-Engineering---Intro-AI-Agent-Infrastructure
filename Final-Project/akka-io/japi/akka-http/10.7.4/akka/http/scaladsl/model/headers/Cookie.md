---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Cookie.html
title: Cookie
---

# Cookie

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Cookie

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.Cookie](../../../javadsl/model/headers/Cookie.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.Cookie

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `[RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers")`, `[SensitiveHttpHeader](../SensitiveHttpHeader.html "interface in akka.http.scaladsl.model")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Cookie
extends [Cookie](../../../javadsl/model/headers/Cookie.html "class in akka.http.javadsl.model.headers")
implements [RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers"), [SensitiveHttpHeader](../SensitiveHttpHeader.html "interface in akka.http.scaladsl.model"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Cookie)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Cookie](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")> cookies)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.headers.HttpCookiePair,scala.collection.immutable.Seq))​([HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")> more)` |  |
	| `static [Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `static [Cookie](Cookie.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(scala.Tuple2,scala.collection.immutable.Seq))​(scala.Tuple2<java.lang.String,​java.lang.String> first,  scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> more)` |  |
	| `protected [Cookie$](Cookie$.html "class in akka.http.scaladsl.model.headers")` | `[companion](#companion())()` |  |
	| `static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>>` | `[cookiePairsRenderer](#cookiePairsRenderer())()` |  |
	| `scala.collection.immutable.Seq<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>` | `[cookies](#cookies())()` |  |
	| `java.lang.Iterable<[HttpCookiePair](../../../javadsl/model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")>` | `[getCookies](#getCookies())()` | Java API |
	| `static java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `static java.lang.String` | `[name](#name())()` |  |
	| `static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T>` | `[parseFromValueString](#parseFromValueString(java.lang.String))​(java.lang.String value)` |  |
	| `static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderValue](#renderValue(R))​(R r)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[Cookie](../../../javadsl/model/headers/Cookie.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/Cookie.html#create(akka.http.javadsl.model.headers.HttpCookiePair...)), [create](../../../javadsl/model/headers/Cookie.html#create(java.lang.String,java.lang.String))`
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
		- ### Methods inherited from interface akka.http.scaladsl.model.[SensitiveHttpHeader](../SensitiveHttpHeader.html "interface in akka.http.scaladsl.model")
		
		
		`[toString](../SensitiveHttpHeader.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### Cookie
		
		
		
		```
		public Cookie​(scala.collection.immutable.Seq<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")> cookies)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Cookie](Cookie.html "class in akka.http.scaladsl.model.headers") apply​([HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") first,
		                           scala.collection.immutable.Seq<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")> more)
		```
		- #### apply
		
		
		
		```
		public static [Cookie](Cookie.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String name,
		                           java.lang.String value)
		```
		- #### apply
		
		
		
		```
		public static [Cookie](Cookie.html "class in akka.http.scaladsl.model.headers") apply​(scala.Tuple2<java.lang.String,​java.lang.String> first,
		                           scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> more)
		```
		- #### cookiePairsRenderer
		
		
		
		```
		public static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>> cookiePairsRenderer()
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
		- #### cookies
		
		
		
		```
		public scala.collection.immutable.Seq<[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")> cookies()
		```
		- #### renderValue
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") renderValue​(R r)
		```
		
		
		Specified by:
		`[renderValue](ModeledHeader.html#renderValue(R))` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### companion
		
		
		
		```
		protected [Cookie$](Cookie$.html "class in akka.http.scaladsl.model.headers") companion()
		```
		
		
		Specified by:
		`[companion](ModeledHeader.html#companion())` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### getCookies
		
		
		
		```
		public java.lang.Iterable<[HttpCookiePair](../../../javadsl/model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")> getCookies()
		```
		
		Java API
		
		Specified by:
		`[getCookies](../../../javadsl/model/headers/Cookie.html#getCookies())` in class `[Cookie](../../../javadsl/model/headers/Cookie.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Cookie.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/SensitiveHttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Cookie$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Cookie.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/RequestHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Cookie.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Cookie.html)*