---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/ContentDispositionHeader.html
title: ContentDispositionHeader
---

# ContentDispositionHeader

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface ContentDispositionHeader

- All Known Implementing Classes:
`[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")`

---

```
public interface ContentDispositionHeader
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.nio.charset.Charset,​akka.parboiled2.support.hlist.HNil>>` | `[charset](#charset())()` |  |
	| `java.lang.String` | `[decodeExtValue](#decodeExtValue(java.nio.charset.Charset,scala.Option,java.lang.String))​(java.nio.charset.Charset cs,  scala.Option<[Language](../../../scaladsl/model/headers/Language.html "class in akka.http.scaladsl.model.headers")> language,  java.lang.String extValue)` |  |

- - ### Method Detail
	
	
	
		- #### charset
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.nio.charset.Charset,​akka.parboiled2.support.hlist.HNil>> charset()
		```
		- #### decodeExtValue
		
		
		
		```
		java.lang.String decodeExtValue​(java.nio.charset.Charset cs,
		                                scala.Option<[Language](../../../scaladsl/model/headers/Language.html "class in akka.http.scaladsl.model.headers")> language,
		                                java.lang.String extValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Language.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/ContentDispositionHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/ContentDispositionHeader.html)*