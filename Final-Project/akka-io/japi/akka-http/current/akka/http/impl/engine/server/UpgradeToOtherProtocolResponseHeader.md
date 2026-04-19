---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/UpgradeToOtherProtocolResponseHeader.html
title: UpgradeToOtherProtocolResponseHeader
---

# UpgradeToOtherProtocolResponseHeader

## Content

Package [akka.http.impl.engine.server](package-summary.html)
## Class UpgradeToOtherProtocolResponseHeader

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")
			- - [akka.http.scaladsl.model.headers.CustomHeader](../../../scaladsl/model/headers/CustomHeader.html "class in akka.http.scaladsl.model.headers")
				- - [akka.http.impl.engine.server.InternalCustomHeader](InternalCustomHeader.html "class in akka.http.impl.engine.server")
					- - akka.http.impl.engine.server.UpgradeToOtherProtocolResponseHeader

- All Implemented Interfaces:
`[Renderable](../../util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../util/ToStringRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class UpgradeToOtherProtocolResponseHeader
extends [InternalCustomHeader](InternalCustomHeader.html "class in akka.http.impl.engine.server")
implements scala.Product, java.io.Serializable
```

Internal API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.server.UpgradeToOtherProtocolResponseHeader)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UpgradeToOtherProtocolResponseHeader](#%3Cinit%3E(akka.stream.scaladsl.Flow))​(akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​java.lang.Object> handler)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​java.lang.Object>` | `[handler](#handler())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.http.impl.engine.server.[InternalCustomHeader](InternalCustomHeader.html "class in akka.http.impl.engine.server")
		
		
		`[name](InternalCustomHeader.html#name()), [renderInRequests](InternalCustomHeader.html#renderInRequests()), [renderInResponses](InternalCustomHeader.html#renderInResponses()), [value](InternalCustomHeader.html#value())`
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[CustomHeader](../../../scaladsl/model/headers/CustomHeader.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](../../../scaladsl/model/headers/CustomHeader.html#lowercaseName()), [render](../../../scaladsl/model/headers/CustomHeader.html#render(R))`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../../../scaladsl/model/HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../../../scaladsl/model/HttpHeader.html#is(java.lang.String)), [isNot](../../../scaladsl/model/HttpHeader.html#isNot(java.lang.String)), [parse](../../../scaladsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../../../scaladsl/model/HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../../../scaladsl/model/HttpHeader.html#unsafeToString())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../util/ToStringRenderable.html#toString())`

- - ### Constructor Detail
	
	
	
		- #### UpgradeToOtherProtocolResponseHeader
		
		
		
		```
		public UpgradeToOtherProtocolResponseHeader​(akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​java.lang.Object> handler)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### handler
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​java.lang.Object> handler()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/InternalCustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/UpgradeToOtherProtocolResponseHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/UpgradeToOtherProtocolResponseHeader.html)*