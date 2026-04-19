---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/UriJavaAccessor$.html
title: UriJavaAccessor$
---

# UriJavaAccessor$

## Content

Package [akka.http.impl.model](package-summary.html)
## Class UriJavaAccessor$

- java.lang.Object
- - akka.http.impl.model.UriJavaAccessor$

- ---

```
public class UriJavaAccessor$
extends java.lang.Object
```

INTERNAL API.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UriJavaAccessor$](UriJavaAccessor$.html "class in akka.http.impl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UriJavaAccessor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")` | `[emptyHost](#emptyHost())()` |  |
	| `[Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[emptyQuery](#emptyQuery())()` |  |
	| `[Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")` | `[hostApply](#hostApply(java.lang.String))​(java.lang.String string)` |  |
	| `[Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")` | `[hostApply](#hostApply(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String string,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` |  |
	| `[Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model")` | `[hostApply](#hostApply(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` |  |
	| `[Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[pmRelaxed](#pmRelaxed())()` |  |
	| `[Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[pmStrict](#pmStrict())()` |  |
	| `[Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[queryApply](#queryApply(akka.japi.Pair%5B%5D))​(akka.japi.Pair<java.lang.String,​java.lang.String>[] params)` |  |
	| `[Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[queryApply](#queryApply(java.lang.String,akka.http.scaladsl.model.Uri.ParsingMode))​(java.lang.String string,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)` |  |
	| `[Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[queryApply](#queryApply(java.lang.String,java.nio.charset.Charset))​(java.lang.String string,  java.nio.charset.Charset charset)` |  |
	| `[Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model")` | `[queryApply](#queryApply(java.util.Map))​(java.util.Map<java.lang.String,​java.lang.String> params)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UriJavaAccessor$](UriJavaAccessor$.html "class in akka.http.impl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UriJavaAccessor$
		
		
		
		```
		public UriJavaAccessor$()
		```

	- ### Method Detail
	
	
	
		- #### hostApply
		
		
		
		```
		public [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") hostApply​(java.lang.String string)
		```
		- #### hostApply
		
		
		
		```
		public [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") hostApply​(java.lang.String string,
		                          [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		- #### hostApply
		
		
		
		```
		public [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") hostApply​(java.lang.String string,
		                          java.nio.charset.Charset charset)
		```
		- #### emptyHost
		
		
		
		```
		public [Uri.Host](../../scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") emptyHost()
		```
		- #### queryApply
		
		
		
		```
		public [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") queryApply​(akka.japi.Pair<java.lang.String,​java.lang.String>[] params)
		```
		- #### queryApply
		
		
		
		```
		public [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") queryApply​(java.util.Map<java.lang.String,​java.lang.String> params)
		```
		- #### queryApply
		
		
		
		```
		public [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") queryApply​(java.lang.String string,
		                            [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") mode)
		```
		- #### queryApply
		
		
		
		```
		public [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") queryApply​(java.lang.String string,
		                            java.nio.charset.Charset charset)
		```
		- #### emptyQuery
		
		
		
		```
		public [Uri.Query](../../scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") emptyQuery()
		```
		- #### pmStrict
		
		
		
		```
		public [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") pmStrict()
		```
		- #### pmRelaxed
		
		
		
		```
		public [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") pmRelaxed()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/UriJavaAccessor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Query.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/UriJavaAccessor$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/UriJavaAccessor$.html)*