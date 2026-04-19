---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CacheDirectives.html
title: CacheDirectives
---

# CacheDirectives

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class CacheDirectives

- java.lang.Object
- - akka.http.javadsl.model.headers.CacheDirectives

- ---

```
public final class CacheDirectives
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[IMMUTABLE](#IMMUTABLE)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[MUST_REVALIDATE](#MUST_REVALIDATE)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[NO_CACHE](#NO_CACHE)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[NO_STORE](#NO_STORE)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[NO_TRANSFORM](#NO_TRANSFORM)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[ONLY_IF_CACHED](#ONLY_IF_CACHED)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[PROXY_REVALIDATE](#PROXY_REVALIDATE)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[PUBLIC](#PUBLIC)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[MAX_AGE](#MAX_AGE(long))​(long deltaSeconds)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[MAX_STALE](#MAX_STALE())()` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[MAX_STALE](#MAX_STALE(long))​(long deltaSeconds)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[MIN_FRESH](#MIN_FRESH(long))​(long deltaSeconds)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[NO_CACHE](#NO_CACHE(java.lang.String...))​(java.lang.String... fieldNames)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[PRIVATE](#PRIVATE(java.lang.String...))​(java.lang.String... fieldNames)` |  |
	| `static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers")` | `[S_MAXAGE](#S_MAXAGE(long))​(long deltaSeconds)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### NO\_CACHE
		
		
		
		```
		public static final [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") NO_CACHE
		```
		- #### NO\_STORE
		
		
		
		```
		public static final [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") NO_STORE
		```
		- #### NO\_TRANSFORM
		
		
		
		```
		public static final [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") NO_TRANSFORM
		```
		- #### ONLY\_IF\_CACHED
		
		
		
		```
		public static final [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") ONLY_IF_CACHED
		```
		- #### MUST\_REVALIDATE
		
		
		
		```
		public static final [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") MUST_REVALIDATE
		```
		- #### PUBLIC
		
		
		
		```
		public static final [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") PUBLIC
		```
		- #### PROXY\_REVALIDATE
		
		
		
		```
		public static final [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") PROXY_REVALIDATE
		```
		- #### IMMUTABLE
		
		
		
		```
		public static final [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") IMMUTABLE
		```

	- ### Method Detail
	
	
	
		- #### MAX\_AGE
		
		
		
		```
		public static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") MAX_AGE​(long deltaSeconds)
		```
		- #### MAX\_STALE
		
		
		
		```
		public static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") MAX_STALE()
		```
		- #### MAX\_STALE
		
		
		
		```
		public static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") MAX_STALE​(long deltaSeconds)
		```
		- #### MIN\_FRESH
		
		
		
		```
		public static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") MIN_FRESH​(long deltaSeconds)
		```
		- #### NO\_CACHE
		
		
		
		```
		public static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") NO_CACHE​(java.lang.String... fieldNames)
		```
		- #### PRIVATE
		
		
		
		```
		public static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") PRIVATE​(java.lang.String... fieldNames)
		```
		- #### S\_MAXAGE
		
		
		
		```
		public static [CacheDirective](CacheDirective.html "interface in akka.http.javadsl.model.headers") S_MAXAGE​(long deltaSeconds)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CacheDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CacheDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CacheDirectives.html)*