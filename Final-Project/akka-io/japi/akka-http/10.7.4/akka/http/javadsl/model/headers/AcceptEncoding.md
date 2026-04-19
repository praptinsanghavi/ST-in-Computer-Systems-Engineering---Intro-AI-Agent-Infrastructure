---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:58:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/AcceptEncoding.html
title: AcceptEncoding
---

# AcceptEncoding

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class AcceptEncoding

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - akka.http.javadsl.model.headers.AcceptEncoding

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[Accept$minusEncoding](../../../scaladsl/model/headers/Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class AcceptEncoding
extends [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
```

Model for the \`Accept\-Encoding\` header.
 Specification: http://tools.ietf.org/html/draft\-ietf\-httpbis\-p2\-semantics\-26\#section\-5\.3\.4

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AcceptEncoding](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [AcceptEncoding](AcceptEncoding.html "class in akka.http.javadsl.model.headers")` | `[create](#create(akka.http.javadsl.model.headers.HttpEncoding))​([HttpEncoding](HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding)` |  |
	| `static [AcceptEncoding](AcceptEncoding.html "class in akka.http.javadsl.model.headers")` | `[create](#create(akka.http.javadsl.model.headers.HttpEncodingRange...))​([HttpEncodingRange](HttpEncodingRange.html "class in akka.http.javadsl.model.headers")... encodings)` |  |
	| `abstract java.lang.Iterable<[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.javadsl.model.headers")>` | `[getEncodings](#getEncodings())()` |  |
	
	
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
	
	
	
		- #### AcceptEncoding
		
		
		
		```
		public AcceptEncoding()
		```

	- ### Method Detail
	
	
	
		- #### getEncodings
		
		
		
		```
		public abstract java.lang.Iterable<[HttpEncodingRange](HttpEncodingRange.html "class in akka.http.javadsl.model.headers")> getEncodings()
		```
		- #### create
		
		
		
		```
		public static [AcceptEncoding](AcceptEncoding.html "class in akka.http.javadsl.model.headers") create​([HttpEncoding](HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding)
		```
		- #### create
		
		
		
		```
		public static [AcceptEncoding](AcceptEncoding.html "class in akka.http.javadsl.model.headers") create​([HttpEncodingRange](HttpEncodingRange.html "class in akka.http.javadsl.model.headers")... encodings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/AcceptEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodingRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept$minusEncoding.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/AcceptEncoding.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/AcceptEncoding.html)*