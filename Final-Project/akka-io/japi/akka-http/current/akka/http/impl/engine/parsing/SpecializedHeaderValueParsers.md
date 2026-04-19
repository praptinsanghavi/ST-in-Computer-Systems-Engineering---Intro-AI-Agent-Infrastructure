---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/SpecializedHeaderValueParsers.ContentLengthParser$.html
title: SpecializedHeaderValueParsers.ContentLengthParser$
---

# SpecializedHeaderValueParsers.ContentLengthParser$

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class SpecializedHeaderValueParsers.ContentLengthParser$

- java.lang.Object
- - [akka.http.impl.engine.parsing.HttpHeaderParser.HeaderValueParser](HttpHeaderParser.HeaderValueParser.html "class in akka.http.impl.engine.parsing")
	- - akka.http.impl.engine.parsing.SpecializedHeaderValueParsers.ContentLengthParser$

- Enclosing class:
[SpecializedHeaderValueParsers](SpecializedHeaderValueParsers.html "class in akka.http.impl.engine.parsing")

---

```
public static class SpecializedHeaderValueParsers.ContentLengthParser$
extends [HttpHeaderParser.HeaderValueParser](HttpHeaderParser.HeaderValueParser.html "class in akka.http.impl.engine.parsing")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SpecializedHeaderValueParsers.ContentLengthParser$](SpecializedHeaderValueParsers.ContentLengthParser$.html "class in akka.http.impl.engine.parsing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ContentLengthParser$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Tuple2<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model"),​java.lang.Object>` | `[apply](#apply(akka.http.impl.engine.parsing.HttpHeaderParser,akka.util.ByteString,int,scala.Function1))​([HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") hhp,  akka.util.ByteString input,  int valueStart,  scala.Function1<[ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​scala.runtime.BoxedUnit> onIllegalHeader)` |  |
	
	
		- ### Methods inherited from class akka.http.impl.engine.parsing.[HttpHeaderParser.HeaderValueParser](HttpHeaderParser.HeaderValueParser.html "class in akka.http.impl.engine.parsing")
		
		
		`[cachingEnabled](HttpHeaderParser.HeaderValueParser.html#cachingEnabled()), [headerName](HttpHeaderParser.HeaderValueParser.html#headerName()), [maxValueCount](HttpHeaderParser.HeaderValueParser.html#maxValueCount()), [toString](HttpHeaderParser.HeaderValueParser.html#toString())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SpecializedHeaderValueParsers.ContentLengthParser$](SpecializedHeaderValueParsers.ContentLengthParser$.html "class in akka.http.impl.engine.parsing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ContentLengthParser$
		
		
		
		```
		public ContentLengthParser$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public scala.Tuple2<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model"),​java.lang.Object> apply​([HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") hhp,
		                                                             akka.util.ByteString input,
		                                                             int valueStart,
		                                                             scala.Function1<[ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​scala.runtime.BoxedUnit> onIllegalHeader)
		```
		
		
		Specified by:
		`[apply](HttpHeaderParser.HeaderValueParser.html#apply(akka.http.impl.engine.parsing.HttpHeaderParser,akka.util.ByteString,int,scala.Function1))` in class `[HttpHeaderParser.HeaderValueParser](HttpHeaderParser.HeaderValueParser.html "class in akka.http.impl.engine.parsing")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.HeaderValueParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/SpecializedHeaderValueParsers.ContentLengthParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/SpecializedHeaderValueParsers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/SpecializedHeaderValueParsers.ContentLengthParser$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/SpecializedHeaderValueParsers.ContentLengthParser$.html)*