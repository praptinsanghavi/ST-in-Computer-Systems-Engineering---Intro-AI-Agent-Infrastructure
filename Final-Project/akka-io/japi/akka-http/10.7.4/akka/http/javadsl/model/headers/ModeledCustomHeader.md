---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html
title: ModeledCustomHeader
---

# ModeledCustomHeader

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class ModeledCustomHeader

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.CustomHeader](CustomHeader.html "class in akka.http.javadsl.model.headers")
			- - akka.http.javadsl.model.headers.ModeledCustomHeader

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

---

```
public abstract class ModeledCustomHeader
extends [CustomHeader](CustomHeader.html "class in akka.http.javadsl.model.headers")
```

Support class for building user\-defined custom headers defined by implementing \`name\` and \`value\`.
 Implement [`ModeledCustomHeader`](ModeledCustomHeader.html "class in akka.http.javadsl.model.headers") and [`ModeledCustomHeaderFactory`](ModeledCustomHeaderFactory.html "class in akka.http.javadsl.model.headers") instead of [`CustomHeader`](CustomHeader.html "class in akka.http.javadsl.model.headers") to be
 able to use the convenience methods that allow parsing the custom user\-defined header from [`HttpHeader`](../HttpHeader.html "class in akka.http.javadsl.model").

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Modifier | Constructor | Description |
	| `protected` | `[ModeledCustomHeader](#%3Cinit%3E(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[lowercaseName](#lowercaseName())()` | Returns the lower\-cased name of the header. |
	| `java.lang.String` | `[name](#name())()` | Returns the name of the header. |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>R` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[value](#value())()` | Returns the String representation of the value of the header. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../../../scaladsl/model/HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../../../scaladsl/model/HttpHeader.html#is(java.lang.String)), [isNot](../../../scaladsl/model/HttpHeader.html#isNot(java.lang.String)), [parse](../../../scaladsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../../../scaladsl/model/HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../../../scaladsl/model/HttpHeader.html#unsafeToString())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../HttpHeader.html#renderInRequests()), [renderInResponses](../HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### ModeledCustomHeader
		
		
		
		```
		protected ModeledCustomHeader​(java.lang.String name,
		                              java.lang.String value)
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		
		Description copied from class: `[HttpHeader](../HttpHeader.html#name())`
		Returns the name of the header.
		
		Specified by:
		`[name](CustomHeader.html#name())` in class `[CustomHeader](CustomHeader.html "class in akka.http.javadsl.model.headers")`
		- #### lowercaseName
		
		
		
		```
		public java.lang.String lowercaseName()
		```
		
		Description copied from class: `[HttpHeader](../HttpHeader.html#lowercaseName())`
		Returns the lower\-cased name of the header.
		
		Specified by:
		`[lowercaseName](../../../scaladsl/model/HttpHeader.html#lowercaseName())` in class `[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")`
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		Description copied from class: `[HttpHeader](../HttpHeader.html#value())`
		Returns the String representation of the value of the header.
		
		Specified by:
		`[value](CustomHeader.html#value())` in class `[CustomHeader](CustomHeader.html "class in akka.http.javadsl.model.headers")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> R render​(R r)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeaderFactory.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html)*