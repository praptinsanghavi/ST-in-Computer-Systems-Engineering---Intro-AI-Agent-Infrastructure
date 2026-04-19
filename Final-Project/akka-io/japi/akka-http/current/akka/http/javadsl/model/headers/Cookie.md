---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Cookie.html
title: Cookie
---

# Cookie

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class Cookie

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - akka.http.javadsl.model.headers.Cookie

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[Cookie](../../../scaladsl/model/headers/Cookie.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class Cookie
extends [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
```

Model for the \`Cookie\` header.
 Specification: https://tools.ietf.org/html/rfc6265\#section\-4\.2

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Cookie](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Cookie](Cookie.html "class in akka.http.javadsl.model.headers")` | `[create](#create(akka.http.javadsl.model.headers.HttpCookiePair...))​([HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers")... cookies)` |  |
	| `static [Cookie](Cookie.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `abstract java.lang.Iterable<[HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers")>` | `[getCookies](#getCookies())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../../../scaladsl/model/HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../../../scaladsl/model/HttpHeader.html#is(java.lang.String)), [isNot](../../../scaladsl/model/HttpHeader.html#isNot(java.lang.String)), [lowercaseName](../../../scaladsl/model/HttpHeader.html#lowercaseName()), [name](../../../scaladsl/model/HttpHeader.html#name()), [parse](../../../scaladsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../../../scaladsl/model/HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../../../scaladsl/model/HttpHeader.html#unsafeToString()), [value](../../../scaladsl/model/HttpHeader.html#value())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../HttpHeader.html#renderInRequests()), [renderInResponses](../HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### Cookie
		
		
		
		```
		public Cookie()
		```

	- ### Method Detail
	
	
	
		- #### getCookies
		
		
		
		```
		public abstract java.lang.Iterable<[HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers")> getCookies()
		```
		- #### create
		
		
		
		```
		public static [Cookie](Cookie.html "class in akka.http.javadsl.model.headers") create​([HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers")... cookies)
		```
		- #### create
		
		
		
		```
		public static [Cookie](Cookie.html "class in akka.http.javadsl.model.headers") create​(java.lang.String name,
		                            java.lang.String value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Cookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Cookie.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Cookie.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Cookie.html)*