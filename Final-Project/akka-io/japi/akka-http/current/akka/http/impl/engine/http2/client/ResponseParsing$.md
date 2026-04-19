---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/ResponseParsing$.html
title: ResponseParsing$
---

# ResponseParsing$

## Content

Package [akka.http.impl.engine.http2\.client](package-summary.html)
## Class ResponseParsing$

- java.lang.Object
- - akka.http.impl.engine.http2\.client.ResponseParsing$

- ---

```
public class ResponseParsing$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ResponseParsing$](ResponseParsing$.html "class in akka.http.impl.engine.http2.client")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResponseParsing$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<[Http2SubStream](../Http2SubStream.html "class in akka.http.impl.engine.http2"),​[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[parseResponse](#parseResponse(akka.http.impl.engine.parsing.HttpHeaderParser,akka.http.scaladsl.settings.ParserSettings,akka.stream.Attributes))​([HttpHeaderParser](../../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") httpHeaderParser,  [ParserSettings](../../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") settings,  akka.stream.Attributes attributes)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ResponseParsing$](ResponseParsing$.html "class in akka.http.impl.engine.http2.client") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ResponseParsing$
		
		
		
		```
		public ResponseParsing$()
		```

	- ### Method Detail
	
	
	
		- #### parseResponse
		
		
		
		```
		public scala.Function1<[Http2SubStream](../Http2SubStream.html "class in akka.http.impl.engine.http2"),​[HttpResponse](../../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")> parseResponse​([HttpHeaderParser](../../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") httpHeaderParser,
		                                                                        [ParserSettings](../../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                        akka.stream.Attributes attributes)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/ResponseParsing$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/ResponseParsing$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/client/ResponseParsing$.html)*