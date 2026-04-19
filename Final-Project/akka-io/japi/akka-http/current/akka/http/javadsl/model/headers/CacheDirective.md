---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CacheDirective.html
title: CacheDirective
---

# CacheDirective

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Interface CacheDirective

- All Known Subinterfaces:
`[CacheDirective](../../../scaladsl/model/headers/CacheDirective.html "interface in akka.http.scaladsl.model.headers")`, `[CacheDirective.RequestDirective](../../../scaladsl/model/headers/CacheDirective.RequestDirective.html "interface in akka.http.scaladsl.model.headers")`, `[CacheDirective.ResponseDirective](../../../scaladsl/model/headers/CacheDirective.ResponseDirective.html "interface in akka.http.scaladsl.model.headers")`

All Known Implementing Classes:
`[CacheDirective.CustomCacheDirective](../../../scaladsl/model/headers/CacheDirective.CustomCacheDirective.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.immutableDirective$](../../../scaladsl/model/headers/CacheDirectives.immutableDirective$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.max$minusage](../../../scaladsl/model/headers/CacheDirectives.max$minusage.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.max$minusstale](../../../scaladsl/model/headers/CacheDirectives.max$minusstale.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.min$minusfresh](../../../scaladsl/model/headers/CacheDirectives.min$minusfresh.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.must$minusrevalidate$](../../../scaladsl/model/headers/CacheDirectives.must$minusrevalidate$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.no$minuscache](../../../scaladsl/model/headers/CacheDirectives.no$minuscache.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.no$minuscache$](../../../scaladsl/model/headers/CacheDirectives.no$minuscache$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.no$minusstore$](../../../scaladsl/model/headers/CacheDirectives.no$minusstore$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.no$minustransform$](../../../scaladsl/model/headers/CacheDirectives.no$minustransform$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.only$minusif$minuscached$](../../../scaladsl/model/headers/CacheDirectives.only$minusif$minuscached$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.proxy$minusrevalidate$](../../../scaladsl/model/headers/CacheDirectives.proxy$minusrevalidate$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.s$minusmaxage](../../../scaladsl/model/headers/CacheDirectives.s$minusmaxage.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface CacheDirective
```

See Also:
[`for convenience access to often used values.`](CacheDirectives.html "class in akka.http.javadsl.model.headers")

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[value](#value())()` |  |

- - ### Method Detail
	
	
	
		- #### value
		
		
		
		```
		java.lang.String value()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CacheDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.RequestDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.ResponseDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.immutableDirective$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.max$minusage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.max$minusstale.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.min$minusfresh.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.must$minusrevalidate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.no$minuscache$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.no$minuscache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.no$minusstore$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.no$minustransform$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.only$minusif$minuscached$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.proxy$minusrevalidate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.s$minusmaxage.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CacheDirective.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CacheDirective.html)*