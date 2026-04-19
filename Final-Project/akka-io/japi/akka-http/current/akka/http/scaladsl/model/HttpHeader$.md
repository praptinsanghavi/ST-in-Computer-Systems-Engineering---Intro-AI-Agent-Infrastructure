---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader$.html
title: HttpHeader$
---

# HttpHeader$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpHeader$

- java.lang.Object
- - akka.http.scaladsl.model.HttpHeader$

- ---

```
public class HttpHeader$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpHeader$](HttpHeader$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpHeader$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T extends [HttpHeader](../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")>akka.util.OptionVal<T>` | `[fastFind](#fastFind(java.lang.Class,scala.collection.immutable.Seq))​(java.lang.Class<T> clazz,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers)` | INTERNAL API |
	| `[HttpHeader.ParsingResult](HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model")` | `[parse](#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings))​(java.lang.String name,  java.lang.String value,  [HeaderParser.Settings](../../impl/model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser") settings)` | Attempts to parse the given header name and value string into a header model instance. |
	| `scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[unapply](#unapply(akka.http.scaladsl.model.HttpHeader))​([HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model") header)` | Extract name and value from a header. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpHeader$](HttpHeader$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpHeader$
		
		
		
		```
		public HttpHeader$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> unapply​([HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model") header)
		```
		
		Extract name and value from a header.
		 CAUTION: The name must be matched in \*all\-lowercase\*!.
		
		Parameters:
		`header` \- (undocumented)
		Returns:
		(undocumented)
		- #### parse
		
		
		
		```
		public [HttpHeader.ParsingResult](HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model") parse​(java.lang.String name,
		                                      java.lang.String value,
		                                      [HeaderParser.Settings](../../impl/model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser") settings)
		```
		
		Attempts to parse the given header name and value string into a header model instance.
		 
		 This process has several possible outcomes:
		 
		
		
		 1\. The header name corresponds to a properly modelled header and
		 a) the value is valid for this header type.
		 In this case the method returns a `ParsingResult.Ok` with the respective header instance and no errors.
		 b) the value consists of a number elements, some of which valid and some invalid, and the header type supports
		 partial value parsing. In this case the method returns a `ParsingResult.Ok` with the respective header
		 instance holding the valid value elements and an [`ErrorInfo`](ErrorInfo.html "class in akka.http.scaladsl.model") for each invalid value.
		 c) the value has invalid elements and the header type doesn't support partial value parsing.
		 In this case the method returns a `ParsingResult.Ok` with a [`RawHeader`](headers/RawHeader.html "class in akka.http.scaladsl.model.headers") instance and
		 a single [`ErrorInfo`](ErrorInfo.html "class in akka.http.scaladsl.model") for the value parsing problem.
		 
		
		
		 2\. The header name does not correspond to a properly modelled header but the header name and the value are both
		 syntactically legal according to the basic header requirements from the HTTP specification.
		 (http://tools.ietf.org/html/rfc7230\#section\-3\.2\)
		 In this case the method returns a `ParsingResult.Ok` with a [`RawHeader`](headers/RawHeader.html "class in akka.http.scaladsl.model.headers") instance and no errors.
		 
		
		
		 3\. The header name or value are illegal according to the basic requirements for HTTP headers
		 (http://tools.ietf.org/html/rfc7230\#section\-3\.2\). In this case the method returns a `ParsingResult.Error`.
		
		
		
		Parameters:
		`name` \- (undocumented)
		`value` \- (undocumented)
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### fastFind
		
		
		
		```
		public <T extends [HttpHeader](../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")> akka.util.OptionVal<T> fastFind​(java.lang.Class<T> clazz,
		                                                              scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers)
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/RawHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader$.html)*