---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Host.html
title: Host
---

# Host

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class Host

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - akka.http.javadsl.model.headers.Host

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[Host](../../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class Host
extends [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Host](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Host](Host.html "class in akka.http.javadsl.model.headers")` | `[create](#create(akka.http.javadsl.model.Authority))​([Authority](../Authority.html "class in akka.http.javadsl.model") authority)` |  |
	| `static [Host](Host.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String))​(java.lang.String host)` |  |
	| `static [Host](Host.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,int))​(java.lang.String host,  int port)` |  |
	| `static [Host](Host.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.net.InetSocketAddress))​(java.net.InetSocketAddress address)` |  |
	| `abstract [Host](../Host.html "class in akka.http.javadsl.model")` | `[host](#host())()` |  |
	| `abstract int` | `[port](#port())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../../../scaladsl/model/HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../../../scaladsl/model/HttpHeader.html#is(java.lang.String)), [isNot](../../../scaladsl/model/HttpHeader.html#isNot(java.lang.String)), [lowercaseName](../../../scaladsl/model/HttpHeader.html#lowercaseName()), [name](../../../scaladsl/model/HttpHeader.html#name()), [parse](../../../scaladsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../../../scaladsl/model/HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../../../scaladsl/model/HttpHeader.html#unsafeToString()), [value](../../../scaladsl/model/HttpHeader.html#value())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../HttpHeader.html#renderInRequests()), [renderInResponses](../HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### Host
		
		
		
		```
		public Host()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [Host](Host.html "class in akka.http.javadsl.model.headers") create​(java.net.InetSocketAddress address)
		```
		- #### create
		
		
		
		```
		public static [Host](Host.html "class in akka.http.javadsl.model.headers") create​(java.lang.String host)
		```
		- #### create
		
		
		
		```
		public static [Host](Host.html "class in akka.http.javadsl.model.headers") create​(java.lang.String host,
		                          int port)
		```
		- #### create
		
		
		
		```
		public static [Host](Host.html "class in akka.http.javadsl.model.headers") create​([Authority](../Authority.html "class in akka.http.javadsl.model") authority)
		```
		- #### host
		
		
		
		```
		public abstract [Host](../Host.html "class in akka.http.javadsl.model") host()
		```
		- #### port
		
		
		
		```
		public abstract int port()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Authority.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Host.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Host.html)*