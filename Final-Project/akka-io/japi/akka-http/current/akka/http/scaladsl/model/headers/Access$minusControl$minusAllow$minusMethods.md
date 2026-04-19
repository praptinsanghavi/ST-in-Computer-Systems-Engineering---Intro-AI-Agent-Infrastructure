---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html
title: Access$minusControl$minusAllow$minusMethods
---

# Access$minusControl$minusAllow$minusMethods

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Access$minusControl$minusAllow$minusMethods

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.AccessControlAllowMethods](../../../javadsl/model/headers/AccessControlAllowMethods.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusMethods

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `[ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Access$minusControl$minusAllow$minusMethods
extends [AccessControlAllowMethods](../../../javadsl/model/headers/AccessControlAllowMethods.html "class in akka.http.javadsl.model.headers")
implements [ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusMethods)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Access$minusControl$minusAllow$minusMethods](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")> methods)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Access$minusControl$minusAllow$minusMethods](Access$minusControl$minusAllow$minusMethods.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.HttpMethod,scala.collection.immutable.Seq))​([HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model") firstMethod,  scala.collection.immutable.Seq<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")> otherMethods)` |  |
	| `protected [Access$minusControl$minusAllow$minusMethods$](Access$minusControl$minusAllow$minusMethods$.html "class in akka.http.scaladsl.model.headers")` | `[companion](#companion())()` |  |
	| `java.lang.Iterable<[HttpMethod](../../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model")>` | `[getMethods](#getMethods())()` | Java API |
	| `static java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `scala.collection.immutable.Seq<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")>` | `[methods](#methods())()` |  |
	| `static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")>>` | `[methodsRenderer](#methodsRenderer())()` |  |
	| `static java.lang.String` | `[name](#name())()` |  |
	| `static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T>` | `[parseFromValueString](#parseFromValueString(java.lang.String))​(java.lang.String value)` |  |
	| `static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderValue](#renderValue(R))​(R r)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[AccessControlAllowMethods](../../../javadsl/model/headers/AccessControlAllowMethods.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/AccessControlAllowMethods.html#create(akka.http.javadsl.model.HttpMethod...))`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../HttpHeader.html#is(java.lang.String)), [isNot](../HttpHeader.html#isNot(java.lang.String)), [lowercaseName](../HttpHeader.html#lowercaseName()), [name](../HttpHeader.html#name()), [parse](../HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../HttpHeader.html#unsafeToString()), [value](../HttpHeader.html#value())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../../../javadsl/model/HttpHeader.html#renderInRequests()), [renderInResponses](../../../javadsl/model/HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledHeader.html#lowercaseName()), [name](ModeledHeader.html#name()), [render](ModeledHeader.html#render(R)), [renderInRequests](ModeledHeader.html#renderInRequests()), [value](ModeledHeader.html#value())`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[renderInResponses](ResponseHeader.html#renderInResponses())`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### Access$minusControl$minusAllow$minusMethods
		
		
		
		```
		public Access$minusControl$minusAllow$minusMethods​(scala.collection.immutable.Seq<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")> methods)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Access$minusControl$minusAllow$minusMethods](Access$minusControl$minusAllow$minusMethods.html "class in akka.http.scaladsl.model.headers") apply​([HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model") firstMethod,
		                                                                scala.collection.immutable.Seq<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")> otherMethods)
		```
		- #### methodsRenderer
		
		
		
		```
		public static [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")>> methodsRenderer()
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
		- #### methods
		
		
		
		```
		public scala.collection.immutable.Seq<[HttpMethod](../HttpMethod.html "class in akka.http.scaladsl.model")> methods()
		```
		- #### renderValue
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") renderValue​(R r)
		```
		
		
		Specified by:
		`[renderValue](ModeledHeader.html#renderValue(R))` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### companion
		
		
		
		```
		protected [Access$minusControl$minusAllow$minusMethods$](Access$minusControl$minusAllow$minusMethods$.html "class in akka.http.scaladsl.model.headers") companion()
		```
		
		
		Specified by:
		`[companion](ModeledHeader.html#companion())` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### getMethods
		
		
		
		```
		public java.lang.Iterable<[HttpMethod](../../../javadsl/model/HttpMethod.html "class in akka.http.javadsl.model")> getMethods()
		```
		
		Java API
		
		Specified by:
		`[getMethods](../../../javadsl/model/headers/AccessControlAllowMethods.html#getMethods())` in class `[AccessControlAllowMethods](../../../javadsl/model/headers/AccessControlAllowMethods.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/AccessControlAllowMethods.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ResponseHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html)*