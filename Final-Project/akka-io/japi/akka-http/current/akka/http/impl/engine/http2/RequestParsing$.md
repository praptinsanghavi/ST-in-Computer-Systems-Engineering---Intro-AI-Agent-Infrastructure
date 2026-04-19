---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestParsing$.html
title: RequestParsing$
---

# RequestParsing$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class RequestParsing$

- java.lang.Object
- - akka.http.impl.engine.http2\.RequestParsing$

- ---

```
public class RequestParsing$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RequestParsing$](RequestParsing$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestParsing$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[checkNoRegularHeadersBeforePseudoHeader](#checkNoRegularHeadersBeforePseudoHeader(java.lang.String,boolean))​(java.lang.String name,  boolean seenRegularHeader)` |  |
	| `void` | `[checkRequiredPseudoHeader](#checkRequiredPseudoHeader(java.lang.String,java.lang.Object))​(java.lang.String name,  java.lang.Object value)` |  |
	| `void` | `[checkUniquePseudoHeader](#checkUniquePseudoHeader(java.lang.String,java.lang.Object))​(java.lang.String name,  java.lang.Object value)` |  |
	| `scala.runtime.Nothing$` | `[parseError](#parseError(java.lang.String,java.lang.String))​(java.lang.String summary,  java.lang.String headerName)` |  |
	| `[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")` | `[parseHeaderPair](#parseHeaderPair(akka.http.impl.engine.parsing.HttpHeaderParser,java.lang.String,java.lang.String))​([HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") httpHeaderParser,  java.lang.String name,  java.lang.String value)` |  |
	| `scala.Function1<[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2")>` | `[parseRequest](#parseRequest(akka.http.impl.engine.parsing.HttpHeaderParser,akka.http.scaladsl.settings.ServerSettings,akka.stream.Attributes))​([HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") httpHeaderParser,  [ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") serverSettings,  akka.stream.Attributes streamAttributes)` |  |
	| `scala.runtime.Nothing$` | `[protocolError](#protocolError(java.lang.String))​(java.lang.String summary)` |  |
	| `void` | `[validateHeader](#validateHeader(akka.http.scaladsl.model.HttpHeader))​([HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") httpHeader)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RequestParsing$](RequestParsing$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RequestParsing$
		
		
		
		```
		public RequestParsing$()
		```

	- ### Method Detail
	
	
	
		- #### parseRequest
		
		
		
		```
		public scala.Function1<[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2")> parseRequest​([HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") httpHeaderParser,
		                                                                                            [ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") serverSettings,
		                                                                                            akka.stream.Attributes streamAttributes)
		```
		- #### parseHeaderPair
		
		
		
		```
		public [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") parseHeaderPair​([HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") httpHeaderParser,
		                                  java.lang.String name,
		                                  java.lang.String value)
		```
		- #### checkRequiredPseudoHeader
		
		
		
		```
		public void checkRequiredPseudoHeader​(java.lang.String name,
		                                      java.lang.Object value)
		```
		- #### checkUniquePseudoHeader
		
		
		
		```
		public void checkUniquePseudoHeader​(java.lang.String name,
		                                    java.lang.Object value)
		```
		- #### checkNoRegularHeadersBeforePseudoHeader
		
		
		
		```
		public void checkNoRegularHeadersBeforePseudoHeader​(java.lang.String name,
		                                                    boolean seenRegularHeader)
		```
		- #### validateHeader
		
		
		
		```
		public void validateHeader​([HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") httpHeader)
		```
		- #### protocolError
		
		
		
		```
		public scala.runtime.Nothing$ protocolError​(java.lang.String summary)
		```
		- #### parseError
		
		
		
		```
		public scala.runtime.Nothing$ parseError​(java.lang.String summary,
		                                         java.lang.String headerName)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestParsing$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestParsing.ParseRequestResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestParsing$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestParsing$.html)*