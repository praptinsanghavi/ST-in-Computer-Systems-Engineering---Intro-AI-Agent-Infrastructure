---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader.html
title: RawHeader
---

# RawHeader

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class RawHeader

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.RawHeader](../../../javadsl/model/headers/RawHeader.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.RawHeader

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RawHeader
extends [RawHeader](../../../javadsl/model/headers/RawHeader.html "class in akka.http.javadsl.model.headers")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.RawHeader)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RawHeader](#%3Cinit%3E(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[lowercaseName](#lowercaseName())()` | Returns the lower\-cased name of the header. |
	| `java.lang.String` | `[name](#name())()` | Returns the name of the header. |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `boolean` | `[renderInRequests](#renderInRequests())()` | Returns true if and only if the header is to be rendered in requests. |
	| `boolean` | `[renderInResponses](#renderInResponses())()` | Returns true if and only if the header is to be rendered in responses. |
	| `static <H extends [HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")>scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[unapply](#unapply(H))​(H customHeader)` |  |
	| `java.lang.String` | `[value](#value())()` | Returns the String representation of the value of the header. |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[RawHeader](../../../javadsl/model/headers/RawHeader.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/RawHeader.html#create(java.lang.String,java.lang.String))`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../HttpHeader.html#is(java.lang.String)), [isNot](../HttpHeader.html#isNot(java.lang.String)), [parse](../HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../HttpHeader.html#unsafeToString())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### RawHeader
		
		
		
		```
		public RawHeader​(java.lang.String name,
		                 java.lang.String value)
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public static <H extends [HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")> scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> unapply​(H customHeader)
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#name())`
		Returns the name of the header.
		
		Specified by:
		`[name](../../../javadsl/model/headers/RawHeader.html#name())` in class `[RawHeader](../../../javadsl/model/headers/RawHeader.html "class in akka.http.javadsl.model.headers")`
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#value())`
		Returns the String representation of the value of the header.
		
		Specified by:
		`[value](../../../javadsl/model/headers/RawHeader.html#value())` in class `[RawHeader](../../../javadsl/model/headers/RawHeader.html "class in akka.http.javadsl.model.headers")`
		- #### renderInRequests
		
		
		
		```
		public boolean renderInRequests()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#renderInRequests())`
		Returns true if and only if the header is to be rendered in requests.
		
		Specified by:
		`[renderInRequests](../../../javadsl/model/HttpHeader.html#renderInRequests())` in class `[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")`
		- #### renderInResponses
		
		
		
		```
		public boolean renderInResponses()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#renderInResponses())`
		Returns true if and only if the header is to be rendered in responses.
		
		Specified by:
		`[renderInResponses](../../../javadsl/model/HttpHeader.html#renderInResponses())` in class `[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")`
		- #### lowercaseName
		
		
		
		```
		public java.lang.String lowercaseName()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#lowercaseName())`
		Returns the lower\-cased name of the header.
		
		Specified by:
		`[lowercaseName](../HttpHeader.html#lowercaseName())` in class `[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")`
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
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/RawHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader.html)*