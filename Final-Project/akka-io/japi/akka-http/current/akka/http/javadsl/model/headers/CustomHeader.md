---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CustomHeader.html
title: CustomHeader
---

# CustomHeader

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class CustomHeader

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - akka.http.javadsl.model.headers.CustomHeader

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[CustomHeader](../../../scaladsl/model/headers/CustomHeader.html "class in akka.http.scaladsl.model.headers")`, `[ModeledCustomHeader](ModeledCustomHeader.html "class in akka.http.javadsl.model.headers")`

---

```
public abstract class CustomHeader
extends [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
```

The model of an HTTP header. In its most basic form headers are simple name\-value pairs. Header names
 are compared in a case\-insensitive way.

 Implement [`ModeledCustomHeader`](ModeledCustomHeader.html "class in akka.http.javadsl.model.headers") and [`ModeledCustomHeaderFactory`](ModeledCustomHeaderFactory.html "class in akka.http.javadsl.model.headers") instead of [`CustomHeader`](CustomHeader.html "class in akka.http.javadsl.model.headers") to be
 able to use the convenience methods that allow parsing the custom user\-defined header from [`HttpHeader`](../HttpHeader.html "class in akka.http.javadsl.model").

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CustomHeader](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract java.lang.String` | `[name](#name())()` | Returns the name of the header. |
	| `abstract java.lang.String` | `[value](#value())()` | Returns the String representation of the value of the header. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../../../scaladsl/model/HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../../../scaladsl/model/HttpHeader.html#is(java.lang.String)), [isNot](../../../scaladsl/model/HttpHeader.html#isNot(java.lang.String)), [lowercaseName](../../../scaladsl/model/HttpHeader.html#lowercaseName()), [parse](../../../scaladsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../../../scaladsl/model/HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../../../scaladsl/model/HttpHeader.html#unsafeToString())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../HttpHeader.html#renderInRequests()), [renderInResponses](../HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### CustomHeader
		
		
		
		```
		public CustomHeader()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		
		Description copied from class: `[HttpHeader](../HttpHeader.html#name())`
		Returns the name of the header.
		
		Specified by:
		`[name](../../../scaladsl/model/HttpHeader.html#name())` in class `[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")`
		- #### value
		
		
		
		```
		public abstract java.lang.String value()
		```
		
		Description copied from class: `[HttpHeader](../HttpHeader.html#value())`
		Returns the String representation of the value of the header.
		
		Specified by:
		`[value](../../../scaladsl/model/HttpHeader.html#value())` in class `[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/ModeledCustomHeaderFactory.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CustomHeader.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CustomHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CustomHeader.html)*