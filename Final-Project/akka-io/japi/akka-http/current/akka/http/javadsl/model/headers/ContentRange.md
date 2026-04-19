---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/ContentRange.html
title: ContentRange
---

# ContentRange

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class ContentRange

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - akka.http.javadsl.model.headers.ContentRange

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[Content$minusRange](../../../scaladsl/model/headers/Content$minusRange.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class ContentRange
extends [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
```

Model for the \`Content\-Range\` header.
 Specification: http://tools.ietf.org/html/draft\-ietf\-httpbis\-p5\-range\-26\#section\-4\.2

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ContentRange](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [ContentRange](../ContentRange.html "class in akka.http.javadsl.model")` | `[contentRange](#contentRange())()` |  |
	| `static [ContentRange](ContentRange.html "class in akka.http.javadsl.model.headers")` | `[create](#create(akka.http.javadsl.model.headers.RangeUnit,akka.http.javadsl.model.ContentRange))​([RangeUnit](RangeUnit.html "class in akka.http.javadsl.model.headers") rangeUnit,  [ContentRange](../ContentRange.html "class in akka.http.javadsl.model") contentRange)` |  |
	| `abstract [RangeUnit](RangeUnit.html "class in akka.http.javadsl.model.headers")` | `[rangeUnit](#rangeUnit())()` |  |
	
	
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
	
	
	
		- #### ContentRange
		
		
		
		```
		public ContentRange()
		```

	- ### Method Detail
	
	
	
		- #### rangeUnit
		
		
		
		```
		public abstract [RangeUnit](RangeUnit.html "class in akka.http.javadsl.model.headers") rangeUnit()
		```
		- #### contentRange
		
		
		
		```
		public abstract [ContentRange](../ContentRange.html "class in akka.http.javadsl.model") contentRange()
		```
		- #### create
		
		
		
		```
		public static [ContentRange](ContentRange.html "class in akka.http.javadsl.model.headers") create​([RangeUnit](RangeUnit.html "class in akka.http.javadsl.model.headers") rangeUnit,
		                                  [ContentRange](../ContentRange.html "class in akka.http.javadsl.model") contentRange)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/ContentRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/RangeUnit.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Content$minusRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/ContentRange.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/ContentRange.html)*