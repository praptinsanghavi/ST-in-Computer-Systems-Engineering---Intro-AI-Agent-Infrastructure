---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/ContentTypeHeader.html
title: ContentTypeHeader
---

# ContentTypeHeader

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface ContentTypeHeader

- All Known Implementing Classes:
`[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")`

---

```
public interface ContentTypeHeader
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ContentType](../../../scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model")` | `[contentType](#contentType(java.lang.String,java.lang.String,scala.collection.immutable.Seq,scala.Option,scala.collection.mutable.Builder))​(java.lang.String main,  java.lang.String sub,  scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> params,  scala.Option<[HttpCharset](../../../scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model")> charset,  scala.collection.mutable.Builder<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>> builder)` |  |

- - ### Method Detail
	
	
	
		- #### contentType
		
		
		
		```
		[ContentType](../../../scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model") contentType​(java.lang.String main,
		                        java.lang.String sub,
		                        scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> params,
		                        scala.Option<[HttpCharset](../../../scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model")> charset,
		                        scala.collection.mutable.Builder<scala.Tuple2<java.lang.String,​java.lang.String>,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>> builder)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/ContentTypeHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/ContentTypeHeader.html)*