---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/InternalCustomHeader.html
title: InternalCustomHeader
---

# InternalCustomHeader

## Content

Package [akka.http.impl.engine.server](package-summary.html)
## Class InternalCustomHeader

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")
			- - [akka.http.scaladsl.model.headers.CustomHeader](../../../scaladsl/model/headers/CustomHeader.html "class in akka.http.scaladsl.model.headers")
				- - akka.http.impl.engine.server.InternalCustomHeader

- All Implemented Interfaces:
`[Renderable](../../util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[UpgradeToOtherProtocolResponseHeader](UpgradeToOtherProtocolResponseHeader.html "class in akka.http.impl.engine.server")`, `[UpgradeToWebSocketLowLevel](../ws/UpgradeToWebSocketLowLevel.html "class in akka.http.impl.engine.ws")`

---

```
public abstract class InternalCustomHeader
extends [CustomHeader](../../../scaladsl/model/headers/CustomHeader.html "class in akka.http.scaladsl.model.headers")
```

Internal API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InternalCustomHeader](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[name](#name())()` | Returns the name of the header. |
	| `boolean` | `[renderInRequests](#renderInRequests())()` | Returns true if and only if the header is to be rendered in requests. |
	| `boolean` | `[renderInResponses](#renderInResponses())()` | Returns true if and only if the header is to be rendered in responses. |
	| `java.lang.String` | `[value](#value())()` | Returns the String representation of the value of the header. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[CustomHeader](../../../scaladsl/model/headers/CustomHeader.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](../../../scaladsl/model/headers/CustomHeader.html#lowercaseName()), [render](../../../scaladsl/model/headers/CustomHeader.html#render(R))`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../../../scaladsl/model/HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../../../scaladsl/model/HttpHeader.html#is(java.lang.String)), [isNot](../../../scaladsl/model/HttpHeader.html#isNot(java.lang.String)), [parse](../../../scaladsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../../../scaladsl/model/HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../../../scaladsl/model/HttpHeader.html#unsafeToString())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### InternalCustomHeader
		
		
		
		```
		public InternalCustomHeader​(java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#name())`
		Returns the name of the header.
		
		Specified by:
		`[name](../../../javadsl/model/headers/CustomHeader.html#name())` in class `[CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")`
		- #### renderInRequests
		
		
		
		```
		public final boolean renderInRequests()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#renderInRequests())`
		Returns true if and only if the header is to be rendered in requests.
		
		Specified by:
		`[renderInRequests](../../../javadsl/model/HttpHeader.html#renderInRequests())` in class `[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")`
		- #### renderInResponses
		
		
		
		```
		public final boolean renderInResponses()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#renderInResponses())`
		Returns true if and only if the header is to be rendered in responses.
		
		Specified by:
		`[renderInResponses](../../../javadsl/model/HttpHeader.html#renderInResponses())` in class `[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")`
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#value())`
		Returns the String representation of the value of the header.
		
		Specified by:
		`[value](../../../javadsl/model/headers/CustomHeader.html#value())` in class `[CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/UpgradeToOtherProtocolResponseHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/UpgradeToWebSocketLowLevel.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CustomHeader.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/InternalCustomHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/InternalCustomHeader.html)*