---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:58:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/StrictTransportSecurity.html
title: StrictTransportSecurity
---

# StrictTransportSecurity

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class StrictTransportSecurity

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - akka.http.javadsl.model.headers.StrictTransportSecurity

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[Strict$minusTransport$minusSecurity](../../../scaladsl/model/headers/Strict$minusTransport$minusSecurity.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class StrictTransportSecurity
extends [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
```

Model for the \`Strict\-Transport\-Security\` header.
 Specification: https://tools.ietf.org/html/rfc6797

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StrictTransportSecurity](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [StrictTransportSecurity](StrictTransportSecurity.html "class in akka.http.javadsl.model.headers")` | `[create](#create(long))​(long maxAge)` |  |
	| `static [StrictTransportSecurity](StrictTransportSecurity.html "class in akka.http.javadsl.model.headers")` | `[create](#create(long,boolean))​(long maxAge,  boolean includeSubDomains)` |  |
	| `abstract boolean` | `[includeSubDomains](#includeSubDomains())()` |  |
	| `abstract long` | `[maxAge](#maxAge())()` |  |
	
	
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
	
	
	
		- #### StrictTransportSecurity
		
		
		
		```
		public StrictTransportSecurity()
		```

	- ### Method Detail
	
	
	
		- #### maxAge
		
		
		
		```
		public abstract long maxAge()
		```
		- #### includeSubDomains
		
		
		
		```
		public abstract boolean includeSubDomains()
		```
		- #### create
		
		
		
		```
		public static [StrictTransportSecurity](StrictTransportSecurity.html "class in akka.http.javadsl.model.headers") create​(long maxAge)
		```
		- #### create
		
		
		
		```
		public static [StrictTransportSecurity](StrictTransportSecurity.html "class in akka.http.javadsl.model.headers") create​(long maxAge,
		                                             boolean includeSubDomains)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/StrictTransportSecurity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/StrictTransportSecurity.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/StrictTransportSecurity.html)*