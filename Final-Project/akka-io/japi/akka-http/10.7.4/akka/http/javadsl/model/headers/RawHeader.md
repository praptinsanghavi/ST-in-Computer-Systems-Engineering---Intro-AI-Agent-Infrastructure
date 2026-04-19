---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RawHeader.html
title: RawHeader
---

# RawHeader

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class RawHeader

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - akka.http.javadsl.model.headers.RawHeader

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[RawHeader](../../../scaladsl/model/headers/RawHeader.html "class in akka.http.scaladsl.model.headers")`

---

```
@DoNotInherit
public abstract class RawHeader
extends [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
```

A header in its 'raw' name/value form, not parsed into a modelled header class.
 To add a custom header type, implement [`ModeledCustomHeader`](ModeledCustomHeader.html "class in akka.http.javadsl.model.headers") and [`ModeledCustomHeaderFactory`](ModeledCustomHeaderFactory.html "class in akka.http.javadsl.model.headers")
 rather than extending [`RawHeader`](RawHeader.html "class in akka.http.javadsl.model.headers")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RawHeader](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RawHeader](RawHeader.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
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
	
	
	
		- #### RawHeader
		
		
		
		```
		public RawHeader()
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
		- #### create
		
		
		
		```
		public static [RawHeader](RawHeader.html "class in akka.http.javadsl.model.headers") create​(java.lang.String name,
		                               java.lang.String value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeaderFactory.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RawHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/RawHeader.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RawHeader.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RawHeader.html)*