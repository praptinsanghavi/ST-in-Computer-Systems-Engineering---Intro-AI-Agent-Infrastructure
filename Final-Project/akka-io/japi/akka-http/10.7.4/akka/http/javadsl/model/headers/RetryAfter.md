---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:58:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RetryAfter.html
title: RetryAfter
---

# RetryAfter

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class RetryAfter

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - akka.http.javadsl.model.headers.RetryAfter

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[Retry$minusAfter](../../../scaladsl/model/headers/Retry$minusAfter.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class RetryAfter
extends [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
```

Model for the \`Retry\-After\` header.
 Specification: //https://tools.ietf.org/html/rfc7231\#section\-7\.1\.3

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetryAfter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RetryAfter](RetryAfter.html "class in akka.http.javadsl.model.headers")` | `[create](#create(akka.http.javadsl.model.DateTime))​([DateTime](../DateTime.html "class in akka.http.javadsl.model") dateTime)` |  |
	| `static [RetryAfter](RetryAfter.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.Long))​(java.lang.Long delaySeconds)` |  |
	| `protected abstract scala.Option<[DateTime](../../../scaladsl/model/DateTime.html "class in akka.http.scaladsl.model")>` | `[dateTime](#dateTime())()` |  |
	| `protected abstract scala.Option<java.lang.Long>` | `[delaySeconds](#delaySeconds())()` |  |
	| `java.util.Optional<[DateTime](../DateTime.html "class in akka.http.javadsl.model")>` | `[getDateTime](#getDateTime())()` | the date for the retry attempt, if available |
	| `java.util.Optional<java.lang.Long>` | `[getDelaySeconds](#getDelaySeconds())()` | number of seconds for the retry attempt, if available |
	
	
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
	
	
	
		- #### RetryAfter
		
		
		
		```
		public RetryAfter()
		```

	- ### Method Detail
	
	
	
		- #### delaySeconds
		
		
		
		```
		protected abstract scala.Option<java.lang.Long> delaySeconds()
		```
		- #### dateTime
		
		
		
		```
		protected abstract scala.Option<[DateTime](../../../scaladsl/model/DateTime.html "class in akka.http.scaladsl.model")> dateTime()
		```
		- #### getDelaySeconds
		
		
		
		```
		public java.util.Optional<java.lang.Long> getDelaySeconds()
		```
		
		number of seconds for the retry attempt, if available
		- #### getDateTime
		
		
		
		```
		public java.util.Optional<[DateTime](../DateTime.html "class in akka.http.javadsl.model")> getDateTime()
		```
		
		the date for the retry attempt, if available
		- #### create
		
		
		
		```
		public static [RetryAfter](RetryAfter.html "class in akka.http.javadsl.model.headers") create​(java.lang.Long delaySeconds)
		```
		- #### create
		
		
		
		```
		public static [RetryAfter](RetryAfter.html "class in akka.http.javadsl.model.headers") create​([DateTime](../DateTime.html "class in akka.http.javadsl.model") dateTime)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RetryAfter.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/Retry$minusAfter.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RetryAfter.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RetryAfter.html)*