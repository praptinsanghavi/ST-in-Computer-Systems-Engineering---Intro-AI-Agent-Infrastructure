---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/AcceptEncodingHeader.html
title: AcceptEncodingHeader
---

# AcceptEncodingHeader

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface AcceptEncodingHeader

- All Known Implementing Classes:
`[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")`

---

```
public interface AcceptEncodingHeader
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[HttpEncodingRange](../../../scaladsl/model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[codings](#codings())()` |  |
	| `[HttpEncodingRange](../../../scaladsl/model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")` | `[getEncoding](#getEncoding(java.lang.String))​(java.lang.String name)` |  |

- - ### Method Detail
	
	
	
		- #### codings
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[HttpEncodingRange](../../../scaladsl/model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> codings()
		```
		- #### getEncoding
		
		
		
		```
		[HttpEncodingRange](../../../scaladsl/model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers") getEncoding​(java.lang.String name)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/AcceptEncodingHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/AcceptEncodingHeader.html)*