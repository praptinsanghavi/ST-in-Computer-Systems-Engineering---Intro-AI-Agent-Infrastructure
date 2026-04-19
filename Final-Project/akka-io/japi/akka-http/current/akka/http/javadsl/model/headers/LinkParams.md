---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkParams.html
title: LinkParams
---

# LinkParams

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class LinkParams

- java.lang.Object
- - akka.http.javadsl.model.headers.LinkParams

- ---

```
public final class LinkParams
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[first](#first)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[last](#last)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[next](#next)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[prev](#prev)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[anchor](#anchor(akka.http.javadsl.model.Uri))​([Uri](../Uri.html "class in akka.http.javadsl.model") uri)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[hreflang](#hreflang(akka.http.javadsl.model.headers.Language))​([Language](Language.html "class in akka.http.javadsl.model.headers") language)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[media](#media(java.lang.String))​(java.lang.String desc)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[rel](#rel(java.lang.String))​(java.lang.String value)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[rev](#rev(java.lang.String))​(java.lang.String value)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[title](#title(java.lang.String))​(java.lang.String title)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[title_All](#title_All(java.lang.String))​(java.lang.String title)` |  |
	| `static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")` | `[type](#type(akka.http.javadsl.model.MediaType))​([MediaType](../MediaType.html "interface in akka.http.javadsl.model") type)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### next
		
		
		
		```
		public static final [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") next
		```
		- #### prev
		
		
		
		```
		public static final [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") prev
		```
		- #### first
		
		
		
		```
		public static final [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") first
		```
		- #### last
		
		
		
		```
		public static final [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") last
		```

	- ### Method Detail
	
	
	
		- #### rel
		
		
		
		```
		public static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") rel​(java.lang.String value)
		```
		- #### anchor
		
		
		
		```
		public static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") anchor​([Uri](../Uri.html "class in akka.http.javadsl.model") uri)
		```
		- #### rev
		
		
		
		```
		public static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") rev​(java.lang.String value)
		```
		- #### hreflang
		
		
		
		```
		public static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") hreflang​([Language](Language.html "class in akka.http.javadsl.model.headers") language)
		```
		- #### media
		
		
		
		```
		public static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") media​(java.lang.String desc)
		```
		- #### title
		
		
		
		```
		public static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") title​(java.lang.String title)
		```
		- #### title\_All
		
		
		
		```
		public static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") title_All​(java.lang.String title)
		```
		- #### type
		
		
		
		```
		public static [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers") type​([MediaType](../MediaType.html "interface in akka.http.javadsl.model") type)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkParam.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkParams.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkParams.html)*