---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkValue.html
title: LinkValue
---

# LinkValue

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class LinkValue

- java.lang.Object
- - akka.http.javadsl.model.headers.LinkValue

- Direct Known Subclasses:
`[LinkValue](../../../scaladsl/model/headers/LinkValue.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class LinkValue
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LinkValue](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LinkValue](LinkValue.html "class in akka.http.javadsl.model.headers")` | `[create](#create(akka.http.javadsl.model.Uri,akka.http.javadsl.model.headers.LinkParam...))​([Uri](../Uri.html "class in akka.http.javadsl.model") uri,  [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")... params)` |  |
	| `abstract java.lang.Iterable<[LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")>` | `[getParams](#getParams())()` |  |
	| `abstract [Uri](../Uri.html "class in akka.http.javadsl.model")` | `[getUri](#getUri())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LinkValue
		
		
		
		```
		public LinkValue()
		```

	- ### Method Detail
	
	
	
		- #### getUri
		
		
		
		```
		public abstract [Uri](../Uri.html "class in akka.http.javadsl.model") getUri()
		```
		- #### getParams
		
		
		
		```
		public abstract java.lang.Iterable<[LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")> getParams()
		```
		- #### create
		
		
		
		```
		public static [LinkValue](LinkValue.html "class in akka.http.javadsl.model.headers") create​([Uri](../Uri.html "class in akka.http.javadsl.model") uri,
		                               [LinkParam](LinkParam.html "class in akka.http.javadsl.model.headers")... params)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkParam.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LinkValue.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkValue.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LinkValue.html)*