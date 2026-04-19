---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/Http2HeaderParsing$.html
title: Http2HeaderParsing$
---

# Http2HeaderParsing$

## Content

Package [akka.http.impl.engine.http2\.hpack](package-summary.html)
## Class Http2HeaderParsing$

- java.lang.Object
- - akka.http.impl.engine.http2\.hpack.Http2HeaderParsing$

- ---

```
public class Http2HeaderParsing$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2HeaderParsing$](Http2HeaderParsing$.html "class in akka.http.impl.engine.http2.hpack")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2HeaderParsing$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Tuple2<java.lang.String,​java.lang.Object>` | `[parse](#parse(java.lang.String,java.lang.String,akka.http.scaladsl.settings.ParserSettings))​(java.lang.String name,  java.lang.String value,  [ParserSettings](../../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​[Http2HeaderParsing.HeaderParser](Http2HeaderParsing.HeaderParser.html "class in akka.http.impl.engine.http2.hpack")<java.lang.Object>>` | `[Parsers](#Parsers())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2HeaderParsing$](Http2HeaderParsing$.html "class in akka.http.impl.engine.http2.hpack") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2HeaderParsing$
		
		
		
		```
		public Http2HeaderParsing$()
		```

	- ### Method Detail
	
	
	
		- #### Parsers
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​[Http2HeaderParsing.HeaderParser](Http2HeaderParsing.HeaderParser.html "class in akka.http.impl.engine.http2.hpack")<java.lang.Object>> Parsers()
		```
		- #### parse
		
		
		
		```
		public scala.Tuple2<java.lang.String,​java.lang.Object> parse​(java.lang.String name,
		                                                                   java.lang.String value,
		                                                                   [ParserSettings](../../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/Http2HeaderParsing$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/Http2HeaderParsing.HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/Http2HeaderParsing$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/Http2HeaderParsing$.html)*