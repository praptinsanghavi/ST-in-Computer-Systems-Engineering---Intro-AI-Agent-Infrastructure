---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CustomHeader.html
title: CustomHeader
---

# CustomHeader

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class CustomHeader

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.CustomHeader

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[InternalCustomHeader](../../../impl/engine/server/InternalCustomHeader.html "class in akka.http.impl.engine.server")`, `[ModeledCustomHeader](ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class CustomHeader
extends [CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")
```

Superclass for user\-defined custom headers defined by implementing `name` and `value`.
 
 Prefer to extend [`ModeledCustomHeader`](ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers") and [`ModeledCustomHeaderCompanion`](ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers") instead if
 planning to use the defined header in match clauses (e.g. in the routing layer of Akka HTTP),
 as they allow the custom header to be matched from [`RawHeader`](RawHeader.html "class in akka.http.scaladsl.model.headers") and vice\-versa.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CustomHeader](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[lowercaseName](#lowercaseName())()` | Returns the lower\-cased name of the header. |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")
		
		
		`[name](../../../javadsl/model/headers/CustomHeader.html#name()), [value](../../../javadsl/model/headers/CustomHeader.html#value())`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../HttpHeader.html#is(java.lang.String)), [isNot](../HttpHeader.html#isNot(java.lang.String)), [parse](../HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../HttpHeader.html#unsafeToString())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../../../javadsl/model/HttpHeader.html#renderInRequests()), [renderInResponses](../../../javadsl/model/HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### CustomHeader
		
		
		
		```
		public CustomHeader()
		```

	- ### Method Detail
	
	
	
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
		public final <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/InternalCustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeaderCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CustomHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CustomHeader.html)*