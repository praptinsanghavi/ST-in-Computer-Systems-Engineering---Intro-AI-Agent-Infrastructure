---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentTypes.html
title: ContentTypes
---

# ContentTypes

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class ContentTypes

- java.lang.Object
- - akka.http.javadsl.model.ContentTypes

- ---

```
public final class ContentTypes
extends java.lang.Object
```

Contains the set of predefined content\-types for convenience.
 
 If the [`ContentType`](ContentType.html "interface in akka.http.javadsl.model") you're looking for is not pre\-defined here,
 you can obtain it from a [`MediaType`](MediaType.html "interface in akka.http.javadsl.model") by using: `MediaTypes.TEXT_HTML.toContentType()`

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ContentType.Binary](ContentType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_GRPC_PROTO](#APPLICATION_GRPC_PROTO)` |  |
	| `static [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_JSON](#APPLICATION_JSON)` |  |
	| `static [ContentType.Binary](ContentType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_OCTET_STREAM](#APPLICATION_OCTET_STREAM)` |  |
	| `static [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_WWW_FORM_URLENCODED](#APPLICATION_X_WWW_FORM_URLENCODED)` |  |
	| `static [ContentType.Binary](ContentType.Binary.html "interface in akka.http.javadsl.model")` | `[NO_CONTENT_TYPE](#NO_CONTENT_TYPE)` |  |
	| `static [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_CSV_UTF8](#TEXT_CSV_UTF8)` |  |
	| `static [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_HTML_UTF8](#TEXT_HTML_UTF8)` |  |
	| `static [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_PLAIN_UTF8](#TEXT_PLAIN_UTF8)` |  |
	| `static [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_XML_UTF8](#TEXT_XML_UTF8)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ContentType.Binary](ContentType.Binary.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.MediaType.Binary))​([MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") mediaType)` |  |
	| `static [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.MediaType.WithFixedCharset))​([MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") mediaType)` |  |
	| `static [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model")` | `[create](#create(akka.http.javadsl.model.MediaType.WithOpenCharset,akka.http.javadsl.model.HttpCharset))​([MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") mediaType,  [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)` |  |
	| `static [ContentType](ContentType.html "interface in akka.http.javadsl.model")` | `[parse](#parse(java.lang.String))​(java.lang.String contentType)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### APPLICATION\_JSON
		
		
		
		```
		public static final [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model") APPLICATION_JSON
		```
		- #### APPLICATION\_OCTET\_STREAM
		
		
		
		```
		public static final [ContentType.Binary](ContentType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_OCTET_STREAM
		```
		- #### TEXT\_PLAIN\_UTF8
		
		
		
		```
		public static final [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model") TEXT_PLAIN_UTF8
		```
		- #### TEXT\_HTML\_UTF8
		
		
		
		```
		public static final [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model") TEXT_HTML_UTF8
		```
		- #### TEXT\_XML\_UTF8
		
		
		
		```
		public static final [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model") TEXT_XML_UTF8
		```
		- #### TEXT\_CSV\_UTF8
		
		
		
		```
		public static final [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model") TEXT_CSV_UTF8
		```
		- #### APPLICATION\_GRPC\_PROTO
		
		
		
		```
		public static final [ContentType.Binary](ContentType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_GRPC_PROTO
		```
		- #### APPLICATION\_X\_WWW\_FORM\_URLENCODED
		
		
		
		```
		public static final [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model") APPLICATION_X_WWW_FORM_URLENCODED
		```
		- #### NO\_CONTENT\_TYPE
		
		
		
		```
		public static final [ContentType.Binary](ContentType.Binary.html "interface in akka.http.javadsl.model") NO_CONTENT_TYPE
		```

	- ### Method Detail
	
	
	
		- #### parse
		
		
		
		```
		public static [ContentType](ContentType.html "interface in akka.http.javadsl.model") parse​(java.lang.String contentType)
		```
		- #### create
		
		
		
		```
		public static [ContentType.Binary](ContentType.Binary.html "interface in akka.http.javadsl.model") create​([MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") mediaType)
		```
		- #### create
		
		
		
		```
		public static [ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model") create​([MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") mediaType)
		```
		- #### create
		
		
		
		```
		public static [ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model") create​([MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") mediaType,
		                                             [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentTypes.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentTypes.html)*