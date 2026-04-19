---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.Trampoline$.html
title: HttpMessageParser.Trampoline$
---

# HttpMessageParser.Trampoline$

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class HttpMessageParser.Trampoline$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.Function1\<akka.util.ByteString,​[HttpMessageParser.StateResult](HttpMessageParser.StateResult.html "interface in akka.http.impl.engine.parsing")\>,​[HttpMessageParser.Trampoline](HttpMessageParser.Trampoline.html "class in akka.http.impl.engine.parsing")\>
	- - akka.http.impl.engine.parsing.HttpMessageParser.Trampoline$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.Function1<akka.util.ByteString,​[HttpMessageParser.StateResult](HttpMessageParser.StateResult.html "interface in akka.http.impl.engine.parsing")>,​[HttpMessageParser.Trampoline](HttpMessageParser.Trampoline.html "class in akka.http.impl.engine.parsing")>`

Enclosing interface:
[HttpMessageParser](HttpMessageParser.html "interface in akka.http.impl.engine.parsing")\<[Output](HttpMessageParser.html "type parameter in HttpMessageParser") extends [ParserOutput](ParserOutput.html "interface in akka.http.impl.engine.parsing")\>

---

```
public static class HttpMessageParser.Trampoline$
extends scala.runtime.AbstractFunction1<scala.Function1<akka.util.ByteString,​[HttpMessageParser.StateResult](HttpMessageParser.StateResult.html "interface in akka.http.impl.engine.parsing")>,​[HttpMessageParser.Trampoline](HttpMessageParser.Trampoline.html "class in akka.http.impl.engine.parsing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.parsing.HttpMessageParser.Trampoline$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpMessageParser.Trampoline$](HttpMessageParser.Trampoline$.html "class in akka.http.impl.engine.parsing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Trampoline$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpMessageParser.Trampoline$](HttpMessageParser.Trampoline$.html "class in akka.http.impl.engine.parsing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Trampoline$
		
		
		
		```
		public Trampoline$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.StateResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.Trampoline$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.Trampoline.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.Trampoline$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.Trampoline$.html)*