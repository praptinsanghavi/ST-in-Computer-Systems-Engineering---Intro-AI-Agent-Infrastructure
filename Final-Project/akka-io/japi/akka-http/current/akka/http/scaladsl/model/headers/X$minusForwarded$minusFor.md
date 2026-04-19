---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusFor.html
title: X$minusForwarded$minusFor
---

# X$minusForwarded$minusFor

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class X$minusForwarded$minusFor

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.XForwardedFor](../../../javadsl/model/headers/XForwardedFor.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.X$minusForwarded$minusFor

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `[RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers")`, `[SensitiveHttpHeader](../SensitiveHttpHeader.html "interface in akka.http.scaladsl.model")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class X$minusForwarded$minusFor
extends [XForwardedFor](../../../javadsl/model/headers/XForwardedFor.html "class in akka.http.javadsl.model.headers")
implements [RequestHeader](RequestHeader.html "interface in akka.http.scaladsl.model.headers"), [SensitiveHttpHeader](../SensitiveHttpHeader.html "interface in akka.http.scaladsl.model"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.X$minusForwarded$minusFor)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[X$minusForwarded$minusFor](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model")> addresses)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model")>` | `[addresses](#addresses())()` |  |
	| `static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model")>>` | `[addressesRenderer](#addressesRenderer())()` |  |
	| `static [X$minusForwarded$minusFor](X$minusForwarded$minusFor.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.RemoteAddress,scala.collection.immutable.Seq))​([RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model") first,  scala.collection.immutable.Seq<[RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model")> more)` |  |
	| `protected [X$minusForwarded$minusFor$](X$minusForwarded$minusFor$.html "class in akka.http.scaladsl.model.headers")` | `[companion](#companion())()` |  |
	| `java.lang.Iterable<[RemoteAddress](../../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")>` | `[getAddresses](#getAddresses())()` | Java API |
	| `static java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `static java.lang.String` | `[name](#name())()` |  |
	| `static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T>` | `[parseFromValueString](#parseFromValueString(java.lang.String))​(java.lang.String value)` |  |
	| `static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderValue](#renderValue(R))​(R r)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[XForwardedFor](../../../javadsl/model/headers/XForwardedFor.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/XForwardedFor.html#create(akka.http.javadsl.model.RemoteAddress...))`
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
	
	
	
		- #### X$minusForwarded$minusFor
		
		
		
		```
		public X$minusForwarded$minusFor​(scala.collection.immutable.Seq<[RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model")> addresses)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [X$minusForwarded$minusFor](X$minusForwarded$minusFor.html "class in akka.http.scaladsl.model.headers") apply​([RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model") first,
		                                              scala.collection.immutable.Seq<[RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model")> more)
		```
		- #### addressesRenderer
		
		
		
		```
		public static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model")>> addressesRenderer()
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
		- #### addresses
		
		
		
		```
		public scala.collection.immutable.Seq<[RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model")> addresses()
		```
		- #### renderValue
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") renderValue​(R r)
		```
		
		
		Specified by:
		`[renderValue](ModeledHeader.html#renderValue(R))` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### companion
		
		
		
		```
		protected [X$minusForwarded$minusFor$](X$minusForwarded$minusFor$.html "class in akka.http.scaladsl.model.headers") companion()
		```
		
		
		Specified by:
		`[companion](ModeledHeader.html#companion())` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### getAddresses
		
		
		
		```
		public java.lang.Iterable<[RemoteAddress](../../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")> getAddresses()
		```
		
		Java API
		
		Specified by:
		`[getAddresses](../../../javadsl/model/headers/XForwardedFor.html#getAddresses())` in class `[XForwardedFor](../../../javadsl/model/headers/XForwardedFor.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/XForwardedFor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SensitiveHttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RequestHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusFor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusFor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusFor.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/X$minusForwarded$minusFor.html)*