---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeader.html
title: ModeledCustomHeader
---

# ModeledCustomHeader

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class ModeledCustomHeader\<H extends ModeledCustomHeader\<H\>\>

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")
			- - [akka.http.scaladsl.model.headers.CustomHeader](CustomHeader.html "class in akka.http.scaladsl.model.headers")
				- - akka.http.scaladsl.model.headers.ModeledCustomHeader\<H\>

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

---

```
public abstract class ModeledCustomHeader<H extends ModeledCustomHeader<H>>
extends [CustomHeader](CustomHeader.html "class in akka.http.scaladsl.model.headers")
```

Support class for building user\-defined custom headers defined by implementing `name` and `value`.
 By implementing a [`ModeledCustomHeader`](ModeledCustomHeader.html "class in akka.http.scaladsl.model.headers") instead of [`CustomHeader`](CustomHeader.html "class in akka.http.scaladsl.model.headers") directly, all needed unapply
 methods are provided for this class, such that it can be pattern matched on from [`RawHeader`](RawHeader.html "class in akka.http.scaladsl.model.headers") and
 the other way around as well.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ModeledCustomHeader](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [ModeledCustomHeaderCompanion](ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<[H](ModeledCustomHeader.html "type parameter in ModeledCustomHeader")>` | `[companion](#companion())()` |  |
	| `java.lang.String` | `[lowercaseName](#lowercaseName())()` | Returns the lower\-cased name of the header. |
	| `java.lang.String` | `[name](#name())()` | Returns the name of the header. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[CustomHeader](CustomHeader.html "class in akka.http.scaladsl.model.headers")
		
		
		`[render](CustomHeader.html#render(R))`
		- ### Methods inherited from class akka.http.javadsl.model.headers.[CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")
		
		
		`[value](../../../javadsl/model/headers/CustomHeader.html#value())`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../HttpHeader.html#is(java.lang.String)), [isNot](../HttpHeader.html#isNot(java.lang.String)), [parse](../HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../HttpHeader.html#unsafeToString())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../../../javadsl/model/HttpHeader.html#renderInRequests()), [renderInResponses](../../../javadsl/model/HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### ModeledCustomHeader
		
		
		
		```
		public ModeledCustomHeader()
		```

	- ### Method Detail
	
	
	
		- #### companion
		
		
		
		```
		public abstract [ModeledCustomHeaderCompanion](ModeledCustomHeaderCompanion.html "class in akka.http.scaladsl.model.headers")<[H](ModeledCustomHeader.html "type parameter in ModeledCustomHeader")> companion()
		```
		- #### lowercaseName
		
		
		
		```
		public final java.lang.String lowercaseName()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#lowercaseName())`
		Returns the lower\-cased name of the header.
		
		Overrides:
		`[lowercaseName](CustomHeader.html#lowercaseName())` in class `[CustomHeader](CustomHeader.html "class in akka.http.scaladsl.model.headers")`
		- #### name
		
		
		
		```
		public final java.lang.String name()
		```
		
		Description copied from class: `[HttpHeader](../../../javadsl/model/HttpHeader.html#name())`
		Returns the name of the header.
		
		Specified by:
		`[name](../../../javadsl/model/headers/CustomHeader.html#name())` in class `[CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeaderCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCustomHeader.html)*