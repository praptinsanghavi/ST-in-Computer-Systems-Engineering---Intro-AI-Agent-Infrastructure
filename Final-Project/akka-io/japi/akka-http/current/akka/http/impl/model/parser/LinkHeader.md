---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/LinkHeader.html
title: LinkHeader
---

# LinkHeader

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface LinkHeader

- All Known Implementing Classes:
`[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")`

---

```
public interface LinkHeader
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Link](../../../scaladsl/model/headers/Link.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>>` | `[link](#link())()` |  |
	| `scala.collection.immutable.Seq<[LinkParam](../../../scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers")>` | `[sanitize](#sanitize(scala.collection.immutable.Seq,scala.collection.immutable.Seq,boolean,boolean,boolean,boolean,boolean))​(scala.collection.immutable.Seq<[LinkParam](../../../scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers")> params,  scala.collection.immutable.Seq<[LinkParam](../../../scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers")> result,  boolean seenRel,  boolean seenMedia,  boolean seenTitle,  boolean seenTitleS,  boolean seenType)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>>` | `[URI](#URI())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model"),​akka.parboiled2.support.hlist.HNil>>` | `[UriReference](#UriReference(char))​(char terminationChar)` |  |

- - ### Method Detail
	
	
	
		- #### URI
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<java.lang.String,​akka.parboiled2.support.hlist.HNil>> URI()
		```
		- #### UriReference
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Uri](../../../scaladsl/model/Uri.html "class in akka.http.scaladsl.model"),​akka.parboiled2.support.hlist.HNil>> UriReference​(char terminationChar)
		```
		- #### link
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.$colon$colon<[Link](../../../scaladsl/model/headers/Link.html "class in akka.http.scaladsl.model.headers"),​akka.parboiled2.support.hlist.HNil>> link()
		```
		- #### sanitize
		
		
		
		```
		scala.collection.immutable.Seq<[LinkParam](../../../scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers")> sanitize​(scala.collection.immutable.Seq<[LinkParam](../../../scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers")> params,
		                                                   scala.collection.immutable.Seq<[LinkParam](../../../scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers")> result,
		                                                   boolean seenRel,
		                                                   boolean seenMedia,
		                                                   boolean seenTitle,
		                                                   boolean seenTitleS,
		                                                   boolean seenType)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Link.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkParam.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/LinkHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/LinkHeader.html)*