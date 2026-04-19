---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/WebSocketHeaders.html
title: WebSocketHeaders
---

# WebSocketHeaders

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface WebSocketHeaders

- All Known Implementing Classes:
`[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")`

---

```
public interface WebSocketHeaders
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[WebSocketExtension](../../../scaladsl/model/headers/WebSocketExtension.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[extension](#extension())()` |  |
	| `akka.parboiled2.CharPredicate` | `[NZDIGIT](#NZDIGIT())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>>` | `[version](#version())()` |  |

- - ### Method Detail
	
	
	
		- #### NZDIGIT
		
		
		
		```
		akka.parboiled2.CharPredicate NZDIGIT()
		```
		- #### extension
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[WebSocketExtension](../../../scaladsl/model/headers/WebSocketExtension.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> extension()
		```
		- #### version
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.Object,​akka.parboiled2.support.hlist.HNil>> version()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WebSocketExtension.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/WebSocketHeaders.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/WebSocketHeaders.html)*