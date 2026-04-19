---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HttpOriginMatcher.html
title: HttpOriginMatcher
---

# HttpOriginMatcher

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class HttpOriginMatcher

- java.lang.Object
- - akka.http.impl.settings.HttpOriginMatcher

- ---

```
public class HttpOriginMatcher
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpOriginMatcher](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Function1<scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")>,​java.lang.Object>` | `[apply](#apply(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> allowedOrigins)` |  |
	| `static scala.Function1<scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")>,​java.lang.Object>` | `[matchAny](#matchAny())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpOriginMatcher
		
		
		
		```
		public HttpOriginMatcher()
		```

	- ### Method Detail
	
	
	
		- #### matchAny
		
		
		
		```
		public static scala.Function1<scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")>,​java.lang.Object> matchAny()
		```
		- #### apply
		
		
		
		```
		public static scala.Function1<scala.collection.immutable.Seq<[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")>,​java.lang.Object> apply​(scala.collection.immutable.Set<java.lang.String> allowedOrigins)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOrigin.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HttpOriginMatcher.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HttpOriginMatcher.html)*