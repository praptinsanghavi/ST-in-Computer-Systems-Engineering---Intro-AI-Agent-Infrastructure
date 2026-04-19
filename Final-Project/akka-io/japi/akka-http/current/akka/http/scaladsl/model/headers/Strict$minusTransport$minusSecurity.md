---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity.html
title: Strict$minusTransport$minusSecurity
---

# Strict$minusTransport$minusSecurity

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Strict$minusTransport$minusSecurity

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.StrictTransportSecurity](../../../javadsl/model/headers/StrictTransportSecurity.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.Strict$minusTransport$minusSecurity

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`, `[ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Strict$minusTransport$minusSecurity
extends [StrictTransportSecurity](../../../javadsl/model/headers/StrictTransportSecurity.html "class in akka.http.javadsl.model.headers")
implements [ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Strict$minusTransport$minusSecurity)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Strict$minusTransport$minusSecurity](#%3Cinit%3E(long,boolean))​(long maxAge,  boolean includeSubDomains)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Strict$minusTransport$minusSecurity](Strict$minusTransport$minusSecurity.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(long,scala.Option))​(long maxAge,  scala.Option<java.lang.Object> includeSubDomains)` |  |
	| `protected [Strict$minusTransport$minusSecurity$](Strict$minusTransport$minusSecurity$.html "class in akka.http.scaladsl.model.headers")` | `[companion](#companion())()` |  |
	| `static [Strict$minusTransport$minusSecurity](Strict$minusTransport$minusSecurity.html "class in akka.http.scaladsl.model.headers")` | `[fromDirectives](#fromDirectives(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[StrictTransportSecurityDirective](StrictTransportSecurityDirective.html "class in akka.http.scaladsl.model.headers")> directives)` |  |
	| `boolean` | `[includeSubDomains](#includeSubDomains())()` |  |
	| `static java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `long` | `[maxAge](#maxAge())()` |  |
	| `static java.lang.String` | `[name](#name())()` |  |
	| `static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T>` | `[parseFromValueString](#parseFromValueString(java.lang.String))​(java.lang.String value)` |  |
	| `static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderValue](#renderValue(R))​(R r)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[StrictTransportSecurity](../../../javadsl/model/headers/StrictTransportSecurity.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/StrictTransportSecurity.html#create(long)), [create](../../../javadsl/model/headers/StrictTransportSecurity.html#create(long,boolean))`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../HttpHeader.html#is(java.lang.String)), [isNot](../HttpHeader.html#isNot(java.lang.String)), [lowercaseName](../HttpHeader.html#lowercaseName()), [name](../HttpHeader.html#name()), [parse](../HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../HttpHeader.html#unsafeToString()), [value](../HttpHeader.html#value())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String)), [renderInRequests](../../../javadsl/model/HttpHeader.html#renderInRequests()), [renderInResponses](../../../javadsl/model/HttpHeader.html#renderInResponses())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledHeader.html#lowercaseName()), [name](ModeledHeader.html#name()), [render](ModeledHeader.html#render(R)), [renderInRequests](ModeledHeader.html#renderInRequests()), [value](ModeledHeader.html#value())`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.scaladsl.model.headers.[ResponseHeader](ResponseHeader.html "interface in akka.http.scaladsl.model.headers")
		
		
		`[renderInResponses](ResponseHeader.html#renderInResponses())`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### Strict$minusTransport$minusSecurity
		
		
		
		```
		public Strict$minusTransport$minusSecurity​(long maxAge,
		                                           boolean includeSubDomains)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Strict$minusTransport$minusSecurity](Strict$minusTransport$minusSecurity.html "class in akka.http.scaladsl.model.headers") apply​(long maxAge,
		                                                        scala.Option<java.lang.Object> includeSubDomains)
		```
		- #### fromDirectives
		
		
		
		```
		public static [Strict$minusTransport$minusSecurity](Strict$minusTransport$minusSecurity.html "class in akka.http.scaladsl.model.headers") fromDirectives​(scala.collection.immutable.Seq<[StrictTransportSecurityDirective](StrictTransportSecurityDirective.html "class in akka.http.scaladsl.model.headers")> directives)
		```
		- #### name
		
		
		
		```
		public static java.lang.String name()
		```
		- #### lowercaseName
		
		
		
		```
		public static java.lang.String lowercaseName()
		```
		- #### render
		
		
		
		```
		public static final <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		- #### parseFromValueString
		
		
		
		```
		public static scala.util.Either<scala.collection.immutable.List<[ErrorInfo](../ErrorInfo.html "class in akka.http.scaladsl.model")>,​T> parseFromValueString​(java.lang.String value)
		```
		- #### maxAge
		
		
		
		```
		public long maxAge()
		```
		
		
		Specified by:
		`[maxAge](../../../javadsl/model/headers/StrictTransportSecurity.html#maxAge())` in class `[StrictTransportSecurity](../../../javadsl/model/headers/StrictTransportSecurity.html "class in akka.http.javadsl.model.headers")`
		- #### includeSubDomains
		
		
		
		```
		public boolean includeSubDomains()
		```
		
		
		Specified by:
		`[includeSubDomains](../../../javadsl/model/headers/StrictTransportSecurity.html#includeSubDomains())` in class `[StrictTransportSecurity](../../../javadsl/model/headers/StrictTransportSecurity.html "class in akka.http.javadsl.model.headers")`
		- #### renderValue
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") renderValue​(R r)
		```
		
		
		Specified by:
		`[renderValue](ModeledHeader.html#renderValue(R))` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`
		- #### companion
		
		
		
		```
		protected [Strict$minusTransport$minusSecurity$](Strict$minusTransport$minusSecurity$.html "class in akka.http.scaladsl.model.headers") companion()
		```
		
		
		Specified by:
		`[companion](ModeledHeader.html#companion())` in interface `[ModeledHeader](ModeledHeader.html "interface in akka.http.scaladsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/StrictTransportSecurity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ResponseHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/StrictTransportSecurityDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity.html)*