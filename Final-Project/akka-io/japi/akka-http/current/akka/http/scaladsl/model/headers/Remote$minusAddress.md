---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Remote$minusAddress.html
title: Remote$minusAddress
---

# Remote$minusAddress

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Remote$minusAddress

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.RemoteAddress](../../../javadsl/model/headers/RemoteAddress.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.Remote$minusAddress

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `[SyntheticHeader](SyntheticHeader.html "interface in akka.http.scaladsl.model.headers")`, `[SensitiveHttpHeader](../SensitiveHttpHeader.html "interface in akka.http.scaladsl.model")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Remote$minusAddress
extends [RemoteAddress](../../../javadsl/model/headers/RemoteAddress.html "class in akka.http.javadsl.model.headers")
implements [SyntheticHeader](SyntheticHeader.html "interface in akka.http.scaladsl.model.headers"), [SensitiveHttpHeader](../SensitiveHttpHeader.html "interface in akka.http.scaladsl.model"), scala.Product, java.io.Serializable
```

Deprecated.
use remote\-address\-attribute instead. Since 10\.2\.0\.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Remote$minusAddress)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Remote$minusAddress](#%3Cinit%3E(akka.http.scaladsl.model.RemoteAddress))​([RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model") address)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model")` | `[address](#address())()` | Deprecated. |
	| `protected [Remote$minusAddress$](Remote$minusAddress$.html "class in akka.http.scaladsl.model.headers")` | `[companion](#companion())()` | Deprecated. |
	| `static java.lang.String` | `[lowercaseName](#lowercaseName())()` | Deprecated. |
	| `static java.lang.String` | `[name](#name())()` | Deprecated. |
	| `static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T>` | `[parseFromValueString](#parseFromValueString(java.lang.String))​(java.lang.String value)` | Deprecated. |
	| `static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` | Deprecated. |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderValue](#renderValue(R))​(R r)` | Deprecated. |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[RemoteAddress](../../../javadsl/model/headers/RemoteAddress.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/RemoteAddress.html#create(akka.http.javadsl.model.RemoteAddress))`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../HttpHeader.html#is(java.lang.String)), [isNot](../HttpHeader.html#isNot(java.lang.String)), [lowercaseName](../HttpHeader.html#lowercaseName()), [name](../HttpHeader.html#name()), [parse](../HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../HttpHeader.html#unsafeToString()), [value](../HttpHeader.html#value())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../../../javadsl/model/HttpHeader.html#renderInRequests()), [renderInResponses](../../../javadsl/model/HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledHeader.html#lowercaseName()), [name](ModeledHeader.html#name()), [render](ModeledHeader.html#render(R)), [renderInRequests](ModeledHeader.html#renderInRequests()), [renderInResponses](ModeledHeader.html#renderInResponses()), [value](ModeledHeader.html#value())`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.scaladsl.model.[SensitiveHttpHeader](../SensitiveHttpHeader.html "interface in akka.http.scaladsl.model")
		
		
		`[toString](../SensitiveHttpHeader.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### Remote$minusAddress
		
		
		
		```
		public Remote$minusAddress​([RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model") address)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public static java.lang.String name()
		```
		
		Deprecated.
		- #### lowercaseName
		
		
		
		```
		public static java.lang.String lowercaseName()
		```
		
		Deprecated.
		- #### render
		
		
		
		```
		public static final <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		Deprecated.
		- #### parseFromValueString
		
		
		
		```
		public static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T> parseFromValueString​(java.lang.String value)
		```
		
		Deprecated.
		- #### address
		
		
		
		```
		public [RemoteAddress](../RemoteAddress.html "class in akka.http.scaladsl.model") address()
		```
		
		Deprecated.
		
		Specified by:
		`[address](../../../javadsl/model/headers/RemoteAddress.html#address())` in class `[RemoteAddress](../../../javadsl/model/headers/RemoteAddress.html "class in akka.http.javadsl.model.headers")`
		- #### renderValue
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") renderValue​(R r)
		```
		
		Deprecated.
		
		Specified by:
		`[renderValue](ModeledHeader.html#renderValue(R))` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### companion
		
		
		
		```
		protected [Remote$minusAddress$](Remote$minusAddress$.html "class in akka.http.scaladsl.model.headers") companion()
		```
		
		Deprecated.
		
		Specified by:
		`[companion](ModeledHeader.html#companion())` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SensitiveHttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Remote$minusAddress$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/SyntheticHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Remote$minusAddress.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Remote$minusAddress.html)*