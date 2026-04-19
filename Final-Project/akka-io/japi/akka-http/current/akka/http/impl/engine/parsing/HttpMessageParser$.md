---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser$.html
title: HttpMessageParser$
---

# HttpMessageParser$

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class HttpMessageParser$

- java.lang.Object
- - akka.http.impl.engine.parsing.HttpMessageParser$

- ---

```
public class HttpMessageParser$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpMessageParser$](HttpMessageParser$.html "class in akka.http.impl.engine.parsing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpMessageParser$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Function0<scala.Option<[ParserOutput.ErrorOutput](ParserOutput.ErrorOutput.html "interface in akka.http.impl.engine.parsing")>>` | `[CompletionIsEntityStreamError](#CompletionIsEntityStreamError())()` |  |
	| `scala.Function0<scala.Option<[ParserOutput.ErrorOutput](ParserOutput.ErrorOutput.html "interface in akka.http.impl.engine.parsing")>>` | `[CompletionIsMessageStartError](#CompletionIsMessageStartError())()` |  |
	| `scala.Function0<scala.Option<[ParserOutput.ErrorOutput](ParserOutput.ErrorOutput.html "interface in akka.http.impl.engine.parsing")>>` | `[CompletionOk](#CompletionOk())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpMessageParser$](HttpMessageParser$.html "class in akka.http.impl.engine.parsing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpMessageParser$
		
		
		
		```
		public HttpMessageParser$()
		```

	- ### Method Detail
	
	
	
		- #### CompletionOk
		
		
		
		```
		public scala.Function0<scala.Option<[ParserOutput.ErrorOutput](ParserOutput.ErrorOutput.html "interface in akka.http.impl.engine.parsing")>> CompletionOk()
		```
		- #### CompletionIsMessageStartError
		
		
		
		```
		public scala.Function0<scala.Option<[ParserOutput.ErrorOutput](ParserOutput.ErrorOutput.html "interface in akka.http.impl.engine.parsing")>> CompletionIsMessageStartError()
		```
		- #### CompletionIsEntityStreamError
		
		
		
		```
		public scala.Function0<scala.Option<[ParserOutput.ErrorOutput](ParserOutput.ErrorOutput.html "interface in akka.http.impl.engine.parsing")>> CompletionIsEntityStreamError()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.ErrorOutput.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser$.html)*