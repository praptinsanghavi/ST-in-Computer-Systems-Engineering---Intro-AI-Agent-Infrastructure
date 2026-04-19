---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/UriJavaAccessor.html
title: UriJavaAccessor
---

# UriJavaAccessor

## Content

Package [akka.http.impl.model](package-summary.html)
## Class UriJavaAccessor

- java.lang.Object
- - akka.http.impl.model.UriJavaAccessor

- ---

```
public abstract class UriJavaAccessor
extends java.lang.Object
```

INTERNAL API.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UriJavaAccessor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")` | `[emptyHost](#emptyHost())()` |  |
	| `static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[emptyQuery](#emptyQuery())()` |  |
	| `static [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")` | `[hostApply](#hostApply(java.lang.String))​(java.lang.String string)` |  |
	| `static [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")` | `[hostApply](#hostApply(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String string,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` |  |
	| `static [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")` | `[hostApply](#hostApply(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` |  |
	| `static [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[pmRelaxed](#pmRelaxed())()` |  |
	| `static [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[pmStrict](#pmStrict())()` |  |
	| `static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[queryApply](#queryApply(akka.japi.Pair%5B%5D))​(akka.japi.Pair<java.lang.String,​java.lang.String>[] params)` |  |
	| `static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[queryApply](#queryApply(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String string,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` |  |
	| `static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[queryApply](#queryApply(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` |  |
	| `static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[queryApply](#queryApply(java.util.Map))​(java.util.Map<java.lang.String,​java.lang.String> params)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UriJavaAccessor
		
		
		
		```
		public UriJavaAccessor()
		```

	- ### Method Detail
	
	
	
		- #### hostApply
		
		
		
		```
		public static [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") hostApply​(java.lang.String string)
		```
		- #### hostApply
		
		
		
		```
		public static [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") hostApply​(java.lang.String string,
		                                 [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		- #### hostApply
		
		
		
		```
		public static [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") hostApply​(java.lang.String string,
		                                 java.nio.charset.Charset charset)
		```
		- #### emptyHost
		
		
		
		```
		public static [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") emptyHost()
		```
		- #### queryApply
		
		
		
		```
		public static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") queryApply​(akka.japi.Pair<java.lang.String,​java.lang.String>[] params)
		```
		- #### queryApply
		
		
		
		```
		public static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") queryApply​(java.util.Map<java.lang.String,​java.lang.String> params)
		```
		- #### queryApply
		
		
		
		```
		public static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") queryApply​(java.lang.String string,
		                                   [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		- #### queryApply
		
		
		
		```
		public static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") queryApply​(java.lang.String string,
		                                   java.nio.charset.Charset charset)
		```
		- #### emptyQuery
		
		
		
		```
		public static [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") emptyQuery()
		```
		- #### pmStrict
		
		
		
		```
		public static [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") pmStrict()
		```
		- #### pmRelaxed
		
		
		
		```
		public static [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") pmRelaxed()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/UriJavaAccessor.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/UriJavaAccessor.html)*